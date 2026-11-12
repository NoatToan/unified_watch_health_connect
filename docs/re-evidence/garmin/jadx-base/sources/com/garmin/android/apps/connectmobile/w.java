package com.garmin.android.apps.connectmobile;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class w implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f47883b;

    public /* synthetic */ w(x xVar, int i14) {
        this.f47882a = i14;
        this.f47883b = xVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f47882a;
        x xVar = this.f47883b;
        switch (i14) {
            case 0:
                e23.a<Unit> aVar = xVar.f49751a;
                if (aVar != null) {
                    aVar.invoke();
                }
                if (xVar.f49753c) {
                    xVar.dismiss();
                }
                break;
            case 1:
                x.a aVar2 = x.f49750f;
                if (xVar.f49754d) {
                    xVar.dismiss();
                }
                break;
            default:
                x.a aVar3 = x.f49750f;
                xVar.dismiss();
                break;
        }
        return Unit.INSTANCE;
    }
}
