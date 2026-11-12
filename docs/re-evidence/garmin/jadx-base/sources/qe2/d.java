package qe2;

import e23.l;
import j23.t;
import p005kotlin.Unit;
import p5.h0;
import p5.k0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144573a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f144574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f144575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f144576d;

    public /* synthetic */ d(float f14, j23.e eVar, int i14) {
        this.f144574b = f14;
        this.f144576d = eVar;
        this.f144575c = i14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f144573a) {
            case 0:
                com.garmin.android.library.mapsdkadapter.f fVar = (com.garmin.android.library.mapsdkadapter.f) this.f144576d;
                com.garmin.android.library.mapsdkadapter.i iVar = (com.garmin.android.library.mapsdkadapter.i) obj;
                iVar.getClass();
                iVar.V(fVar, this.f144574b, this.f144575c);
                break;
            default:
                j23.e eVar = (j23.e) this.f144576d;
                h0.v((k0) obj, new p5.k(((Number) t.j(Float.valueOf(this.f144574b), eVar)).floatValue(), eVar, this.f144575c));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ d(com.garmin.android.library.mapsdkadapter.f fVar, float f14, int i14) {
        this.f144576d = fVar;
        this.f144574b = f14;
        this.f144575c = i14;
    }
}
