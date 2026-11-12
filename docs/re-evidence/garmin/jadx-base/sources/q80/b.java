package q80;

import aa2.k;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import g6.f;
import i3.a1;
import i3.z0;
import k2.h;
import k2.i;
import o53.b0;
import p005kotlin.Metadata;
import p1.z;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import z3.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq80/b;", "", "<init>", "()V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f143300a = new b();

    private b() {
    }

    public final void a(String str, b0 b0Var, a1 a1Var, e eVar, e eVar2, m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(1220433023);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(b0Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(a1Var) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar3 = j92.b.f97899b;
            float f14 = eVar3.f97920e;
            bVar.getClass();
            h hVarC = i.c(f14, eVar3.f97920e, 0.0f, 0.0f, 12);
            f.a aVar = f.f75994b;
            o0Var = o0VarE;
            z0.a(z3.f.c(-2095083186, new mw0.h(eVar, str, b0Var, a1Var), o0VarE), null, a1Var, 0, 0.0f, hVarC, 0L, 0L, 0.0f, 0.0f, null, false, null, p6.b.b(o0VarE), 0L, z3.f.c(195907364, new k(eVar2, 8), o0VarE), o0Var, (i15 & 896) | 3078, 1572912, 47058);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q32.b((Object) this, str, (Object) b0Var, (Object) a1Var, (o13.h) eVar, (o13.h) eVar2, i14, 1);
        }
    }

    public final void b(b0 b0Var, a1 a1Var, z zVar, l lVar, e eVar, m mVar, int i14) {
        b0Var.getClass();
        a1Var.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-1845565552);
        int i15 = i14 | (o0VarE.r(b0Var) ? 4 : 2) | (o0VarE.B(a1Var) ? 32 : 16) | (o0VarE.r(zVar) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.B(this) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String string = context.getString(R.string.pairing_select_device_title);
            string.getClass();
            e eVarC = z3.f.c(2123804602, new ng2.i(zVar, 11, context, lVar), o0VarE);
            int i16 = i15 << 3;
            a(string, b0Var, a1Var, eVarC, eVar, o0VarE, (i16 & 896) | (i16 & 112) | 3072 | 24576 | (i15 & 458752));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new oy0.b(this, b0Var, a1Var, zVar, lVar, eVar, i14, 5);
        }
    }
}
