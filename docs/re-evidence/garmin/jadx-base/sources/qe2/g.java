package qe2;

import e23.l;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import qw0.z;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class g implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.library.mapsdkadapter.l f144583b;

    public /* synthetic */ g(com.garmin.android.library.mapsdkadapter.l lVar, int i14) {
        this.f144582a = i14;
        this.f144583b = lVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f144582a;
        com.garmin.android.library.mapsdkadapter.l lVar = this.f144583b;
        switch (i14) {
            case 0:
                com.garmin.android.library.mapsdkadapter.i iVar = (com.garmin.android.library.mapsdkadapter.i) obj;
                iVar.getClass();
                iVar.m(lVar);
                return Unit.INSTANCE;
            default:
                com.garmin.android.library.mapsdkadapter.l lVar2 = (com.garmin.android.library.mapsdkadapter.l) obj;
                int i15 = z.M1;
                lVar2.getClass();
                return Boolean.valueOf(s.g(lVar2.getF144590a().f50328a.f93153a, lVar.getF144590a().f50328a.f93153a) && lVar2.getZIndex() > 0.0f);
        }
    }
}
