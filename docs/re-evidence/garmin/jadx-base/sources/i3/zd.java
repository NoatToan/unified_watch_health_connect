package i3;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zd implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f90599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wd f90600b;

    public /* synthetic */ zd(wd wdVar, int i14) {
        this.f90599a = i14;
        this.f90600b = wdVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f90599a) {
            case 0:
                this.f90600b.dismiss();
                return Boolean.TRUE;
            case 1:
                this.f90600b.b();
                return Unit.INSTANCE;
            case 2:
                this.f90600b.dismiss();
                return Unit.INSTANCE;
            default:
                this.f90600b.b();
                return Unit.INSTANCE;
        }
    }
}
