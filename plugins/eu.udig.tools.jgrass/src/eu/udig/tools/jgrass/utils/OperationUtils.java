/*
 * JGrass - Free Open Source Java GIS http://www.jgrass.org 
 * (C) HydroloGIS - www.hydrologis.com 
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package eu.udig.tools.jgrass.utils;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;

/**
 * Common methods for less code in operations.
 * 
 * @author Andrea Antonello (www.hydrologis.com)
 *
 */
public class OperationUtils {
    public static enum MSGTYPE {
        INFO, ERROR, WARNING;
    };

    protected void showMessage( final Display display, final String title, final String msg, final MSGTYPE type ) {
        display.asyncExec(new Runnable(){
            public void run() {
                switch( type ) {
                case INFO:
                    MessageDialog.openInformation(display.getActiveShell(), title, msg);
                    break;
                case ERROR:
                    MessageDialog.openError(display.getActiveShell(), title, msg);
                    break;
                case WARNING:
                    MessageDialog.openWarning(display.getActiveShell(), title, msg);
                    break;
                default:
                    break;
                }
            }
        });
    }

}