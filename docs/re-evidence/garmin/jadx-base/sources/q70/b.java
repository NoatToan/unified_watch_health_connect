package q70;

import android.content.Context;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import h82.c;
import java.util.List;
import mg2.o;
import ov1.q;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.w;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import z3.e;
import z3.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lq70/b;", "Lh82/c;", "<init>", "()V", "a", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f143217h = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f143218f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f143219g;

    static {
        new a(null);
    }

    @Override // h82.c
    public final void a(Bundle bundle, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-309974059);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(bundle) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(this) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            this.f143218f = bundle.getBoolean("SHOW_RESET_HOME");
            this.f143219g = bundle.getBoolean("SHOW_SLEEP_COACH");
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(this, bundle, i14, 18);
        }
    }

    @Override // h82.c
    public final List<c.b> c(Context context) {
        context.getClass();
        return w.c(new c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new e(831991522, true, new q70.a(this, 0)), 4, null));
    }

    public final void g(m mVar, int i14) {
        o0 o0VarE = mVar.E(1143012630);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.a(f.c(1081491881, new q70.a(this, 1), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q(this, i14, 18);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lq70/b$a;", "", "<init>", "()V", "", "SHOW_RESET_HOME", "Ljava/lang/String;", "SHOW_SLEEP_COACH", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
