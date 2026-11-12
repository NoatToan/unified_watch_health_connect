package com.tsmclient.smartcard.terminal;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes6.dex */
public class TerminalManager {
    public static final String TERMINAL_CATEGORY_NFCEE = "com.miui.tsmclient";
    private static volatile TerminalManager sInstance;
    private final Map<String, TerminalExtra> mTerminalInfoMap = new HashMap();

    public enum Priority {
        LOW,
        DEFAULT,
        HIGH
    }

    public static class TerminalExtra {
        Semaphore mTermSemaphore = new Semaphore(1);
        IScTerminal mTerminal;
        Priority mTerminalPriority;
    }

    private TerminalManager() {
    }

    public static TerminalManager getInstance() {
        if (sInstance == null) {
            synchronized (TerminalManager.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new TerminalManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public TerminalExtra getTerminalExtra(String str) {
        TerminalExtra terminalExtra;
        synchronized (this.mTerminalInfoMap) {
            try {
                terminalExtra = this.mTerminalInfoMap.get(str);
                if (terminalExtra == null) {
                    terminalExtra = new TerminalExtra();
                    this.mTerminalInfoMap.put(str, terminalExtra);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return terminalExtra;
    }
}
