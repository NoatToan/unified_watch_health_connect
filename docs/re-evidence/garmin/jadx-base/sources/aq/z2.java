package aq;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Laq/z2;", "Lh82/c;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z2 extends h82.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f12318f = 0;

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        return p13.w.c(new h82.c.b("DEFAULT_ACTION", androidx.room.a0.e(R.string.lbl_help, context), null, new z3.e(-153420545, true, new a71.n(this, 4)), 4, null));
    }

    public final void g(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-1167514061);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            k.f12027a.getClass();
            h82.e.a(k.f12028b, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a03.k(this, i14, 4);
        }
    }
}
