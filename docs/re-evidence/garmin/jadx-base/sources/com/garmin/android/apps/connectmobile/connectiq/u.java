package com.garmin.android.apps.connectmobile.connectiq;

import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class u implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w.a f32024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y.a f32025c;

    public /* synthetic */ u(y.a aVar, w.a aVar2) {
        this.f32023a = 0;
        this.f32025c = aVar;
        this.f32024b = aVar2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14 = this.f32023a;
        y.a aVar = this.f32025c;
        w.a aVar2 = this.f32024b;
        switch (i14) {
            case 0:
                w.a.C0521a c0521a = w.a.f32049m;
                if (aVar.f32094c) {
                    aVar2.f32051b.invoke(aVar.f32092a);
                }
                break;
            case 1:
                aVar2.f32053d.invoke(aVar);
                break;
            case 2:
                aVar2.f32053d.invoke(aVar);
                break;
            case 3:
                aVar2.f32052c.invoke(aVar);
                break;
            default:
                aVar2.f32052c.invoke(aVar);
                break;
        }
    }

    public /* synthetic */ u(w.a aVar, y.a aVar2, int i14) {
        this.f32023a = i14;
        this.f32024b = aVar;
        this.f32025c = aVar2;
    }
}
