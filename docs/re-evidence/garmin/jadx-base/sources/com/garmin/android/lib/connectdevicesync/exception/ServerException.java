package com.garmin.android.lib.connectdevicesync.exception;

import android.text.TextUtils;
import wb2.h;

/* JADX INFO: loaded from: classes11.dex */
public class ServerException extends Exception {
    public h failure;

    public ServerException(h hVar, String str) {
        super(TextUtils.isEmpty(str) ? hVar.name() : str);
        this.failure = hVar;
    }
}
