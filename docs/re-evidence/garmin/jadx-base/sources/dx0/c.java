package dx0;

import e23.l;
import i3.e5;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p5.h0;
import p5.k0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f61464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f61465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f61466d;

    public /* synthetic */ c(String str, String str2, String str3, int i14) {
        this.f61463a = i14;
        this.f61464b = str;
        this.f61465c = str2;
        this.f61466d = str3;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        k0 k0Var = (k0) obj;
        switch (this.f61463a) {
            case 0:
                k0Var.getClass();
                if (s.g(this.f61464b, this.f61465c)) {
                    h0.n(k0Var, this.f61466d);
                }
                break;
            default:
                k0Var.getClass();
                String str = this.f61464b;
                String str2 = this.f61465c;
                if (str == null) {
                    str = this.f61466d;
                }
                h0.n(k0Var, e5.g(str, StringUtils.SPACE, str2));
                break;
        }
        return Unit.INSTANCE;
    }
}
