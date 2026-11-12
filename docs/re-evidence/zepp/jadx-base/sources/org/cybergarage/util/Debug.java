package org.cybergarage.util;

import java.io.PrintStream;

/* JADX INFO: loaded from: classes23.dex */
public final class Debug {
    public static Debug debug = new Debug();
    public static boolean enabled = false;
    private PrintStream out = System.out;

    public static Debug getDebug() {
        return debug;
    }

    public static boolean isOn() {
        return enabled;
    }

    public static final void message(String str) {
        if (enabled) {
            debug.getOut().println("CyberGarage message : " + str);
        }
    }

    public static final void off() {
        enabled = false;
    }

    public static final void on() {
        enabled = true;
    }

    public static final void warning(String str) {
        debug.getOut().println("CyberGarage warning : " + str);
    }

    public synchronized PrintStream getOut() {
        return this.out;
    }

    public synchronized void setOut(PrintStream printStream) {
        this.out = printStream;
    }

    public static final void warning(String str, Exception exc) {
        if (exc.getMessage() != null) {
            debug.getOut().println("CyberGarage warning : " + str + " (" + exc.getMessage() + ")");
            exc.printStackTrace(debug.getOut());
            return;
        }
        debug.getOut().println("CyberGarage warning : " + str + " START");
        exc.printStackTrace(debug.getOut());
        debug.getOut().println("CyberGarage warning : " + str + " END");
    }

    public static final void message(String str, String str2) {
        if (enabled) {
            debug.getOut().println("CyberGarage message : ");
        }
        debug.getOut().println(str);
        debug.getOut().println(str2);
    }

    public static final void warning(Exception exc) {
        warning(exc.getMessage());
        exc.printStackTrace(debug.getOut());
    }
}
