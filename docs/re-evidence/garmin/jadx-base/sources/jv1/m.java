package jv1;

import android.content.Context;
import c22.l3;
import c22.q3;
import com.garmin.android.apps.connectmobile.R;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\nB+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Ljv1/m;", "", "", "value", "Lgg0/i;", "unitType", "Lgg0/h;", "unit", "<init>", "(Ljava/lang/Double;Lgg0/i;Lgg0/h;)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f101075d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f101076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gg0.i f101077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gg0.h f101078c;

    public /* synthetic */ m(Double d14, gg0.i iVar, gg0.h hVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : d14, (i14 & 2) != 0 ? null : iVar, (i14 & 4) != 0 ? null : hVar);
    }

    public static String b(Context context, double d14, double d15) {
        if (d14 <= 0.0d) {
            return null;
        }
        double d16 = d15 / d14;
        q3 q3Var = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
        l3.f23124b.getClass();
        return l3.a.N0(context, d16, q3Var, l3.f23130h, true, context.getString(R.string.enter_goal_speed));
    }

    public final Integer a() {
        Double d14;
        gg0.i iVar;
        if (this.f101078c != gg0.h.TIME || (d14 = this.f101076a) == null || (iVar = this.f101077b) == null) {
            return null;
        }
        og0.a aVar = og0.a.f131967a;
        double dDoubleValue = d14.doubleValue();
        aVar.getClass();
        return Integer.valueOf((int) og0.a.j(dDoubleValue, iVar));
    }

    public final fg0.d c() {
        return new fg0.d(this.f101076a, this.f101077b, this.f101078c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return p005kotlin.jvm.internal.s.g(this.f101076a, mVar.f101076a) && this.f101077b == mVar.f101077b && this.f101078c == mVar.f101078c;
    }

    public final int hashCode() {
        Double d14 = this.f101076a;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        gg0.i iVar = this.f101077b;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        gg0.h hVar = this.f101078c;
        return iHashCode2 + (hVar != null ? hVar.hashCode() : 0);
    }

    public final String toString() {
        return "FBTCustomGoalData(value=" + this.f101076a + ", unitType=" + this.f101077b + ", unit=" + this.f101078c + ")";
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljv1/m$a;", "", "<init>", "()V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static m a(fg0.d dVar) {
            return new m(dVar.getValue(), dVar.getUnit(), dVar.getUnitType());
        }

        private a() {
        }
    }

    public m(Double d14, gg0.i iVar, gg0.h hVar) {
        this.f101076a = d14;
        this.f101077b = iVar;
        this.f101078c = hVar;
    }

    public m() {
        this(null, null, null, 7, null);
    }
}
