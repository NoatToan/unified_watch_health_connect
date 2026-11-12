package com.facebook.common.time;

import android.os.SystemClock;
import defpackage.q7g;
import defpackage.w07;

/* JADX INFO: loaded from: classes4.dex */
@w07
public class RealtimeSinceBootClock implements q7g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RealtimeSinceBootClock f7093a = new RealtimeSinceBootClock();

    private RealtimeSinceBootClock() {
    }

    @w07
    public static RealtimeSinceBootClock get() {
        return f7093a;
    }

    @Override // defpackage.q7g
    public long now() {
        return SystemClock.elapsedRealtime();
    }
}
