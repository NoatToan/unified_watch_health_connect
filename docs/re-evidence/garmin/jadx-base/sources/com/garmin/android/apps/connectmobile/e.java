package com.garmin.android.apps.connectmobile;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f34744b;

    public /* synthetic */ e(f fVar, int i14) {
        this.f34743a = i14;
        this.f34744b = fVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f34743a) {
            case 0:
                this.f34744b.E6();
                break;
            default:
                this.f34744b.C6();
                break;
        }
        return Unit.INSTANCE;
    }
}
