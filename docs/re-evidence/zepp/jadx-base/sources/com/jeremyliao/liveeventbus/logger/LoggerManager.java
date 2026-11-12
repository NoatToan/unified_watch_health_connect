package com.jeremyliao.liveeventbus.logger;

import java.util.logging.Level;

/* JADX INFO: loaded from: classes18.dex */
public class LoggerManager implements Logger {
    private Logger a;
    private boolean b = true;

    public LoggerManager(Logger logger) {
        this.a = logger;
    }

    public Logger getLogger() {
        return this.a;
    }

    public boolean isEnable() {
        return this.b;
    }

    @Override // com.jeremyliao.liveeventbus.logger.Logger
    public void log(Level level, String str) {
        if (this.b) {
            this.a.log(level, str);
        }
    }

    public void setEnable(boolean z) {
        this.b = z;
    }

    public void setLogger(Logger logger) {
        this.a = logger;
    }

    @Override // com.jeremyliao.liveeventbus.logger.Logger
    public void log(Level level, String str, Throwable th) {
        if (this.b) {
            this.a.log(level, str, th);
        }
    }
}
