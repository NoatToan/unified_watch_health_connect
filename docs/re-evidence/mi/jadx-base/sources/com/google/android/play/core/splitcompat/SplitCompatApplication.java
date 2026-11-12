package com.google.android.play.core.splitcompat;

import android.app.Application;
import android.content.Context;
import defpackage.f7n;

/* JADX INFO: loaded from: classes5.dex */
public class SplitCompatApplication extends Application {
    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        f7n.a(this);
    }
}
