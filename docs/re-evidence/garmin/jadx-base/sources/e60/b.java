package e60;

import e23.l;
import j20.x;
import p005kotlin.Unit;
import p5.h0;
import p5.k0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f63150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f63151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f63152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f63153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f63154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f63155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f63156g;

    public /* synthetic */ b(String str, int i14, String str2, String str3, String str4, String str5, String str6) {
        this.f63150a = i14;
        this.f63151b = str;
        this.f63152c = str2;
        this.f63153d = str3;
        this.f63154e = str4;
        this.f63155f = str5;
        this.f63156g = str6;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        k0 k0Var = (k0) obj;
        switch (this.f63150a) {
            case 0:
                k0Var.getClass();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f63151b);
                sb3.append(", ");
                sb3.append(this.f63152c);
                sb3.append(", ");
                sn.a.t(sb3, this.f63153d, ", ", this.f63154e, ", ");
                sb3.append(this.f63155f);
                sb3.append(", ");
                sb3.append(this.f63156g);
                h0.n(k0Var, sb3.toString());
                break;
            default:
                k0Var.getClass();
                String str = this.f63151b;
                if (str == null) {
                    str = this.f63152c;
                }
                String str2 = this.f63153d;
                if (str2 == null) {
                    str2 = this.f63154e;
                }
                String str3 = this.f63155f;
                if (str3 == null) {
                    str3 = this.f63156g;
                }
                h0.n(k0Var, x.d(str, ", ", str2, ", ", str3));
                break;
        }
        return Unit.INSTANCE;
    }
}
