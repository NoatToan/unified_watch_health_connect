package a51;

import e2.i0;
import f2.p0;
import p3.a2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1416b;

    public /* synthetic */ c(int i14, int i15) {
        this.f1415a = i15;
        this.f1416b = i14;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f1415a) {
            case 0:
                return new a2(this.f1416b);
            case 1:
                return new a2(this.f1416b);
            case 2:
                return new i0(this.f1416b, 0);
            case 3:
                return new p0(this.f1416b, 0);
            case 4:
                return new a2(this.f1416b);
            case 5:
                return new a2(this.f1416b);
            case 6:
                return new a2(this.f1416b - 1);
            case 7:
                return new a2(this.f1416b);
            case 8:
                return new a2(this.f1416b);
            case 9:
                return new a2(this.f1416b);
            case 10:
                return p3.p0.n(Boolean.valueOf(this.f1416b == 0));
            case 11:
                return p3.p0.n(Boolean.valueOf(this.f1416b == 2));
            default:
                return Integer.valueOf(this.f1416b);
        }
    }
}
