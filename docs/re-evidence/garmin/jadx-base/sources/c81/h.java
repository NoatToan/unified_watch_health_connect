package c81;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Float f25696b;

    public /* synthetic */ h(int i14, Float f14) {
        this.f25695a = i14;
        this.f25696b = f14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f25695a) {
            case 0:
                g81.a aVar = (g81.a) obj;
                aVar.getClass();
                return Integer.valueOf(Float.compare(aVar.f76259a, this.f25696b.floatValue()));
            case 1:
                g81.d dVar = (g81.d) obj;
                dVar.getClass();
                return Integer.valueOf(Float.compare(dVar.f76291a, this.f25696b.floatValue()));
            default:
                com.garmin.android.library.mapsdkadapter.i iVar = (com.garmin.android.library.mapsdkadapter.i) obj;
                iVar.getClass();
                iVar.e(this.f25696b);
                return Unit.INSTANCE;
        }
    }
}
