package f71;

import e23.l;
import m92.f0;
import m92.z;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f69440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f69441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f69442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f69443e;

    public /* synthetic */ f(com.garmin.android.library.mapsdkadapter.e eVar, float f14, int i14, int i15) {
        this.f69439a = 3;
        this.f69442d = eVar;
        this.f69443e = f14;
        this.f69440b = i14;
        this.f69441c = i15;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f69439a) {
            case 0:
                z zVar = (z) this.f69442d;
                q4.f fVar = (q4.f) obj;
                fVar.getClass();
                return f0.b(fVar, new j23.l(this.f69440b, this.f69441c), zVar, Float.valueOf(this.f69443e), null);
            case 1:
                z zVar2 = (z) this.f69442d;
                q4.f fVar2 = (q4.f) obj;
                fVar2.getClass();
                return f0.b(fVar2, new j23.l(this.f69440b, this.f69441c), zVar2, Float.valueOf(this.f69443e), null);
            case 2:
                z zVar3 = (z) this.f69442d;
                q4.f fVar3 = (q4.f) obj;
                fVar3.getClass();
                return f0.b(fVar3, new j23.l(this.f69440b, this.f69441c), zVar3, Float.valueOf(this.f69443e), null);
            default:
                com.garmin.android.library.mapsdkadapter.e eVar = (com.garmin.android.library.mapsdkadapter.e) this.f69442d;
                com.garmin.android.library.mapsdkadapter.i iVar = (com.garmin.android.library.mapsdkadapter.i) obj;
                iVar.getClass();
                iVar.j(eVar, this.f69443e, this.f69440b, this.f69441c);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ f(int i14, int i15, z zVar, float f14, int i16) {
        this.f69439a = i16;
        this.f69440b = i14;
        this.f69441c = i15;
        this.f69442d = zVar;
        this.f69443e = f14;
    }
}
