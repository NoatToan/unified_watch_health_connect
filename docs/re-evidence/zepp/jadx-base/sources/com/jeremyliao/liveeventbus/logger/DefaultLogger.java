package com.jeremyliao.liveeventbus.logger;

import android.util.Log;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes18.dex */
public class DefaultLogger implements Logger {
    private static final String a = "[LiveEventBus]";

    @Override // com.jeremyliao.liveeventbus.logger.Logger
    public void log(Level level, String str) {
        if (level == Level.SEVERE) {
            Log.e(a, str);
            return;
        }
        if (level == Level.WARNING) {
            Log.w(a, str);
            return;
        }
        if (level == Level.INFO) {
            Log.i(a, str);
        } else if (level == Level.CONFIG) {
            Log.d(a, str);
        } else if (level != Level.OFF) {
            Log.v(a, str);
        }
    }

    @Override // com.jeremyliao.liveeventbus.logger.Logger
    public void log(Level level, String str, Throwable th) {
        if (level == Level.SEVERE) {
            Log.e(a, str, th);
            return;
        }
        if (level == Level.WARNING) {
            Log.w(a, str, th);
            return;
        }
        if (level == Level.INFO) {
            Log.i(a, str, th);
        } else if (level == Level.CONFIG) {
            Log.d(a, str, th);
        } else if (level != Level.OFF) {
            Log.v(a, str, th);
        }
    }
}
