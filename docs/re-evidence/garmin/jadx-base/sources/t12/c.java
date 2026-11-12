package t12;

import android.content.Context;
import androidx.room.a0;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import l72.y0;
import o62.s0;
import p005kotlin.Metadata;
import p13.w;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import z3.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lt12/c;", "Lh82/c;", "<init>", "()V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends h82.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f161741f = 0;

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        return w.c(new h82.c.b("DEFAULT_ACTION", a0.e(R.string.lbl_help, context), null, new e(-1333992666, true, new s0(this, 28)), 4, null));
    }

    public final void g(m mVar, int i14) {
        o0 o0VarE = mVar.E(-1007395797);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            b.f161739a.getClass();
            h82.e.a(b.f161740b, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y0(this, i14, 25);
        }
    }
}
