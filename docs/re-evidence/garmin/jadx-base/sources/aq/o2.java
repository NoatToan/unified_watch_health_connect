package aq;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Laq/o2;", "Lh82/c;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o2 extends h82.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f12136f = 0;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Laq/o2$a;", "", "", "labelId", "", FirebaseAnalytics.Param.SCORE, "<init>", "(ILjava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f12137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f12138b;

        public a(int i14, String str) {
            str.getClass();
            this.f12137a = i14;
            this.f12138b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f12137a == aVar.f12137a && this.f12138b.equals(aVar.f12138b);
        }

        public final int hashCode() {
            return this.f12138b.hashCode() + (Integer.hashCode(this.f12137a) * 31);
        }

        public final String toString() {
            return o2.c.e(this.f12137a, "TableData(labelId=", ", score=", this.f12138b, ")");
        }
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        return p13.w.c(new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new z3.e(-1218274337, true, new a71.n(this, 2)), 4, null));
    }

    public final void g(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(234688122);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(-724653817, new defpackage.a(this), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a03.k(this, i14, 2);
        }
    }
}
