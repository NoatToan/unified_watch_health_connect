package g02;

import i3.e5;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class v implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f74591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f74592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f74593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f74594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f74595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f74596g;

    public /* synthetic */ v(String str, String str2, String str3, boolean z14, String str4, p3.p1 p1Var, int i14) {
        this.f74590a = i14;
        this.f74591b = str;
        this.f74592c = str2;
        this.f74593d = str3;
        this.f74594e = z14;
        this.f74595f = str4;
        this.f74596g = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f74590a) {
            case 0:
                p5.k0 k0Var = (p5.k0) obj;
                k0Var.getClass();
                p5.h0.n(k0Var, e5.g(this.f74591b, StringUtils.SPACE, ((Boolean) this.f74596g.getF182175a()).booleanValue() ? this.f74592c : this.f74593d));
                if (this.f74594e) {
                    p5.d0.f135959a.getClass();
                    k0Var.a(p5.d0.N, this.f74595f);
                }
                return Unit.INSTANCE;
            default:
                h4.r rVar = (h4.r) obj;
                rVar.getClass();
                return p5.v.b(rVar, new v(this.f74591b, this.f74592c, this.f74593d, this.f74594e, this.f74595f, this.f74596g, 0));
        }
    }
}
