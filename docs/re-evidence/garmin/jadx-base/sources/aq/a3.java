package aq;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Laq/a3;", "Lh82/c;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a3 extends h82.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f11821f = 0;

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        return p13.w.c(new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new z3.e(-1577971073, true, new a71.n(this, 5)), 4, null));
    }

    public final void g(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-1948850662);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            l.f12034a.getClass();
            h82.e.a(l.f12035b, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a03.k(this, i14, 5);
        }
    }
}
