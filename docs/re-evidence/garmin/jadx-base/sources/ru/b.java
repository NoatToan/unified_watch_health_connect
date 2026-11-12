package ru;

import com.garmin.android.apps.connectmobile.badges.service.model.u;
import e23.l;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f154568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f154569c;

    public /* synthetic */ b(c cVar, u uVar, int i14) {
        this.f154567a = i14;
        this.f154568b = cVar;
        this.f154569c = uVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f154567a;
        u uVar = this.f154569c;
        c cVar = this.f154568b;
        ud.a aVar = (ud.a) obj;
        switch (i14) {
            case 0:
                c.d dVar = c.f154570e;
                aVar.getClass();
                cVar.f154572b.d(aVar, uVar);
                break;
            default:
                c.d dVar2 = c.f154570e;
                aVar.getClass();
                cVar.f154574d.c(aVar, uVar);
                break;
        }
        return Unit.INSTANCE;
    }
}
