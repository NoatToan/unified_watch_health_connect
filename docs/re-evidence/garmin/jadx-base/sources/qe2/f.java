package qe2;

import e23.l;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import qw0.z;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class f implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ie2.j f144581b;

    public /* synthetic */ f(ie2.j jVar, int i14) {
        this.f144580a = i14;
        this.f144581b = jVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f144580a;
        ie2.j jVar = this.f144581b;
        switch (i14) {
            case 0:
                com.garmin.android.library.mapsdkadapter.i iVar = (com.garmin.android.library.mapsdkadapter.i) obj;
                iVar.getClass();
                iVar.n(jVar);
                return Unit.INSTANCE;
            default:
                com.garmin.android.library.mapsdkadapter.l lVar = (com.garmin.android.library.mapsdkadapter.l) obj;
                int i15 = z.M1;
                lVar.getClass();
                return Boolean.valueOf(s.g(jVar.getPosition(), h0.n0(lVar.d())) && lVar.getZIndex() > 0.0f);
        }
    }
}
