package com.garmin.android.apps.connectmobile;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0015\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/y;", "T", "", "eventContent", "<init>", "(Ljava/lang/Object;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f49760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f49761b;

    public /* synthetic */ y(Object obj, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : obj);
    }

    public final T a() {
        if (this.f49761b) {
            return null;
        }
        this.f49761b = true;
        return this.f49760a;
    }

    public y(T t7) {
        this.f49760a = t7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public y() {
        p005kotlin.jvm.internal.j jVar = null;
        this(jVar, 1, jVar);
    }
}
