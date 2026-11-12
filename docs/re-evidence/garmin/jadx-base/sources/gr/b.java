package gr;

import am.x0;
import am.z0;
import android.os.Bundle;
import androidx.lifecycle.u1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import q53.l;
import r53.b2;
import r53.e;
import r53.p2;
import r53.q2;
import r53.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgr/b;", "Landroidx/lifecycle/u1;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p2 f78524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2 f78525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q53.b f78526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f78527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f78528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f78529f;

    static {
        new a(null);
    }

    public b() {
        p2 p2VarA = q2.a(new gr.a(null, null, null, null, 0, false, false, null, null, null, 1023, null));
        this.f78524a = p2VarA;
        this.f78525b = s.d(p2VarA);
        q53.b bVarA = l.a(-1, 6, null);
        this.f78526c = bVarA;
        this.f78527d = s.F(bVarA);
    }

    public final void A4() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f78524a;
            value = p2Var.getValue();
        } while (!p2Var.b(value, gr.a.a((gr.a) value, null, null, 0, false, false, null, 831)));
    }

    public final void x4(x0 x0Var, boolean z14) {
        x0 x0Var2;
        p2 p2Var = this.f78524a;
        x0 x0Var3 = ((gr.a) p2Var.getValue()).f78516c;
        int iIndexOf = ((gr.a) p2Var.getValue()).f78514a.indexOf(x0Var);
        while (true) {
            Object value = p2Var.getValue();
            gr.a aVar = (gr.a) value;
            x0Var2 = x0Var;
            if (p2Var.b(value, gr.a.a(aVar, null, x0Var2, iIndexOf >= 0 ? Math.max(0, iIndexOf - 2) : aVar.f78518e, aVar.f78519f || z14, false, null, 971))) {
                break;
            } else {
                x0Var = x0Var2;
            }
        }
        if (iIndexOf >= 0) {
            this.f78526c.i(Integer.valueOf(Math.max(0, iIndexOf - 2)));
        }
        Bundle bundle = new Bundle();
        bundle.putString("SourceActivityType", x0Var3 != null ? x0Var3.name() : null);
        bundle.putString("DestinationActivityType", x0Var2.name());
        ht.a.f85464a.getClass();
        ht.a.a(bundle, "ActivityTypeEditing");
    }

    public final void y4(x0 x0Var) {
        boolean z14;
        boolean z15;
        x0Var.getClass();
        p2 p2Var = this.f78524a;
        x0 x0Var2 = ((gr.a) p2Var.getValue()).f78516c;
        if (x0Var == x0Var2) {
            return;
        }
        if (x0Var2 == null || !(z14 = this.f78528e) || (!(z15 = this.f78529f) ? x0Var2 != x0Var : z14 && z15 && z0.d(x0Var2, x0Var2) != z0.d(x0Var, x0Var))) {
            x4(x0Var, false);
            return;
        }
        while (true) {
            Object value = p2Var.getValue();
            x0 x0Var3 = x0Var;
            if (p2Var.b(value, gr.a.a((gr.a) value, null, null, 0, false, true, x0Var3, 831))) {
                return;
            } else {
                x0Var = x0Var3;
            }
        }
    }

    public final void z4() {
        Object value;
        p2 p2Var = this.f78524a;
        x0 x0Var = ((gr.a) p2Var.getValue()).f78521h;
        if (x0Var == null) {
            return;
        }
        x0 x0Var2 = ((gr.a) p2Var.getValue()).f78516c;
        boolean z14 = false;
        if (x0Var2 != null && this.f78528e && this.f78529f && z0.d(x0Var2, x0Var2) != z0.d(x0Var, x0Var)) {
            z14 = true;
        }
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, gr.a.a((gr.a) value, null, null, 0, false, false, null, 831)));
        x4(x0Var, z14);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lgr/b$a;", "", "<init>", "()V", "", "INDEX_OFFSET", "I", "RECENT_ACTIVITIES_LIST_SIZE", "RECENT_ACTIVITIES_COUNT", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
