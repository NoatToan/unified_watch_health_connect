package sg0;

import androidx.lifecycle.j1;
import androidx.lifecycle.u1;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import o53.c2;
import p005kotlin.Metadata;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lsg0/f0;", "Landroidx/lifecycle/u1;", "Landroidx/lifecycle/j1;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lre0/o;", "repo", "Lte0/e;", "generateAuthorizedUri", "", "accountAdministrationUrl", "Lc22/a0;", "dispatchProvider", "<init>", "(Landroidx/lifecycle/j1;Lre0/o;Lte0/e;Ljava/lang/String;Lc22/a0;)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f0 extends u1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f159081i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1 f159082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final re0.o f159083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te0.e f159084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f159085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c22.a0 f159086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f159087f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f159088g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c2 f159089h;

    static {
        new a(null);
    }

    public f0(j1 j1Var, re0.o oVar, te0.e eVar, String str, c22.a0 a0Var) {
        j1Var.getClass();
        oVar.getClass();
        eVar.getClass();
        str.getClass();
        a0Var.getClass();
        this.f159082a = j1Var;
        this.f159083b = oVar;
        this.f159084c = eVar;
        this.f159085d = str;
        this.f159086e = a0Var;
        u uVar = (u) j1Var.a("MANAGE_CHILD_UI_STATE");
        if (uVar == null) {
            uVar = new u(null, null, null, null, null, false, null, false, false, false, false, null, null, 8191, null);
        }
        this.f159087f = q2.a(uVar);
        this.f159088g = q2.a(null);
    }

    public final void x4(long j8) {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f159087f;
            value = p2Var.getValue();
            f12.l.f68084a.getClass();
        } while (!p2Var.b(value, u.b((u) value, null, null, null, null, false, null, false, f12.l.a.a().a3(j8), false, null, null, 7679)));
    }

    public final void y4(long j8) {
        p2 p2Var;
        Object value;
        f12.l.f68084a.getClass();
        f12.l.a.a().u0(j8, false);
        do {
            p2Var = this.f159087f;
            value = p2Var.getValue();
        } while (!p2Var.b(value, u.b((u) value, null, null, null, null, false, null, false, false, false, null, null, 7679)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsg0/f0$a;", "", "<init>", "()V", "", "MANAGE_CHILD_UI_STATE", "Ljava/lang/String;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ f0(j1 j1Var, re0.o oVar, te0.e eVar, String str, c22.a0 a0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this(j1Var, oVar, eVar, str, (i14 & 16) != 0 ? new c22.a0(null, null, null, 7, null) : a0Var);
    }
}
