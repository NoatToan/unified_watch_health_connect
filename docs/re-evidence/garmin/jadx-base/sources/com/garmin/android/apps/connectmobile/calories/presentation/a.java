package com.garmin.android.apps.connectmobile.calories.presentation;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.R;
import ds.e0;
import i63.h;
import java.util.List;
import m63.u1;
import o13.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.x;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import r1.q2;
import sk0.i0;
import sy.d;
import z3.e;
import z3.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calories/presentation/a;", "Lh82/c;", "<init>", "()V", "b", "c", "a", "gcm-calories_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends h82.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f31246g = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f31247f = new b((c) null, false, 0, 0, 0, 0, 0, 0, 0, false, 1023, (j) null);

    static {
        new C0501a(null);
    }

    @Override // h82.c
    public final void a(Bundle bundle, m mVar, int i14) {
        int i15;
        Parcelable parcelable;
        o0 o0VarE = mVar.E(1573653106);
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
            super.a(bundle, o0VarE, i15 & 126);
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) bundle.getParcelable("EXTRA_DATA", b.class);
            } else {
                Parcelable parcelable2 = bundle.getParcelable("EXTRA_DATA");
                if (!(parcelable2 instanceof b)) {
                    parcelable2 = null;
                }
                parcelable = (b) parcelable2;
            }
            b bVar = (b) parcelable;
            if (bVar != null) {
                this.f31247f = bVar;
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new sg0.m(this, bundle, i14, 6);
        }
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        h82.c.b bVar = new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new e(-519036154, true, new sy.c(this, 8)), 4, null);
        h82.c.b bVar2 = new h82.c.b("ACTIVE_CALORIES_ACTION", context.getString(R.string.lbl_active_calories), null, new e(-216148763, true, new sy.c(this, 9)), 4, null);
        h82.c.b bVar3 = new h82.c.b("RESTING_CALORIES_ACTION", context.getString(R.string.lbl_resting_calories), null, new e(86738628, true, new sy.c(this, 10)), 4, null);
        h82.c.b bVar4 = new h82.c.b("TOTAL_CALORIES_ACTION", context.getString(R.string.calories_total_label), null, new e(389626019, true, new sy.c(this, 11)), 4, null);
        String string = context.getString(R.string.lbl_calories_during_an_activity);
        sy.m.f161199a.getClass();
        return x.k(bVar, bVar2, bVar3, bVar4, new h82.c.b("CALORIES_DURING_ACTIVITY_ACTION", string, null, sy.m.f161200b, 4, null), new h82.c.b("CALORIES_CONSUMED_ACTION", context.getString(R.string.lbl_calories_consumed), null, new e(995400801, true, new sy.c(this, 12)), 4, null), new h82.c.b("CALORIE_GOAL_ACTION", context.getString(R.string.lbl_calorie_goal), null, new e(1298288192, true, new sy.c(this, 13)), 4, null), new h82.c.b("ADJUSTED_GOAL_ACTION", context.getString(R.string.lbl_adjusted_goal), null, new e(1601175583, true, new sy.c(this, 14)), 4, null), new h82.c.b("CALORIES_REMAINING_ACTION", context.getString(R.string.lbl_calories_remaining), null, new e(1904062974, true, new sy.c(this, 15)), 4, null));
    }

    public final void g(m mVar, int i14) {
        o0 o0VarE = mVar.E(2061222614);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        int i16 = 5;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.a(f.c(-1936734941, new sy.c(this, i16), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(this, i14, 5);
        }
    }

    public final void h(m mVar, int i14) {
        o0 o0VarE = mVar.E(520675825);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.a(f.c(-814532994, new sy.c(this, i16), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(this, i14, 0);
        }
    }

    public final void i(m mVar, int i14) {
        o0 o0VarE = mVar.E(1483887672);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        int i16 = 6;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.a(f.c(-852560059, new sy.c(this, i16), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(this, i14, 6);
        }
    }

    public final void j(m mVar, int i14) {
        o0 o0VarE = mVar.E(666904163);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.a(f.c(792352752, new sy.c(this, i16), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(this, i14, 1);
        }
    }

    public final void k(m mVar, int i14) {
        o0 o0VarE = mVar.E(-527416662);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        int i16 = 7;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.a(f.c(57147709, new sy.c(this, i16), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(this, i14, 7);
        }
    }

    public final void l(m mVar, int i14) {
        o0 o0VarE = mVar.E(-532091710);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        int i16 = 3;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.a(f.c(85275669, new sy.c(this, i16), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(this, i14, 3);
        }
    }

    public final void m(m mVar, int i14) {
        o0 o0VarE = mVar.E(-910769526);
        int i15 = 4;
        int i16 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.b(f.c(-1353536138, new sy.c(this, i15), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(this, i14, 4);
        }
    }

    public final void n(m mVar, int i14) {
        o0 o0VarE = mVar.E(-46601992);
        int i15 = 2;
        int i16 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.a(f.c(-452663029, new sy.c(this, i15), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(this, i14, 2);
        }
    }

    public final String o(m mVar) {
        int i14;
        int i15;
        x1 x1Var = n.f135158a;
        if (this.f31247f.f31258j) {
            i14 = 1405819369;
            i15 = R.string.lbl_on_this_day;
        } else {
            i14 = 1405889212;
            i15 = R.string.lbl_on_average_during_period;
        }
        return sn.a.h(mVar, i14, i15, mVar);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0002\u0016\u0017Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010Bm\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calories/presentation/a$b;", "Landroid/os/Parcelable;", "Lcom/garmin/android/apps/connectmobile/calories/presentation/a$c;", "flow", "", "isMFPLinked", "", "activeCalories", "restingCalories", "totalCalories", "consumedCalories", "calorieGoal", "remainingCalories", "adjustedGoal", "isPerDayData", "<init>", "(Lcom/garmin/android/apps/connectmobile/calories/presentation/a$c;ZIIIIIIIZ)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILcom/garmin/android/apps/connectmobile/calories/presentation/a$c;ZIIIIIIIZLm63/u1;)V", "Companion", "a", "b", "gcm-calories_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @h
    public static final /* data */ class b implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f31249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f31250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f31251c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f31252d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f31253e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f31254f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f31255g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f31256h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f31257i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f31258j;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<b> CREATOR = new c();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final l<i63.c<Object>>[] f31248k = {o13.m.a(o13.n.PUBLICATION, new i0(20)), null, null, null, null, null, null, null, null, null};

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                boolean z14;
                boolean z15;
                parcel.getClass();
                c cVarCreateFromParcel = c.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    z15 = false;
                    z14 = true;
                } else {
                    z14 = false;
                    z15 = false;
                }
                int i14 = parcel.readInt();
                int i15 = parcel.readInt();
                boolean z16 = z15;
                int i16 = parcel.readInt();
                int i17 = parcel.readInt();
                int i18 = parcel.readInt();
                boolean z17 = true;
                int i19 = parcel.readInt();
                int i24 = parcel.readInt();
                if (parcel.readInt() == 0) {
                    z17 = z16;
                }
                return new b(cVarCreateFromParcel, z14, i14, i15, i16, i17, i18, i19, i24, z17);
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i14) {
                return new b[i14];
            }
        }

        public /* synthetic */ b(int i14, c cVar, boolean z14, int i15, int i16, int i17, int i18, int i19, int i24, int i25, boolean z15, u1 u1Var) {
            this.f31249a = (i14 & 1) == 0 ? c.DEFAULT_VERSION : cVar;
            if ((i14 & 2) == 0) {
                this.f31250b = false;
            } else {
                this.f31250b = z14;
            }
            if ((i14 & 4) == 0) {
                this.f31251c = 0;
            } else {
                this.f31251c = i15;
            }
            if ((i14 & 8) == 0) {
                this.f31252d = 0;
            } else {
                this.f31252d = i16;
            }
            if ((i14 & 16) == 0) {
                this.f31253e = 0;
            } else {
                this.f31253e = i17;
            }
            if ((i14 & 32) == 0) {
                this.f31254f = 0;
            } else {
                this.f31254f = i18;
            }
            if ((i14 & 64) == 0) {
                this.f31255g = 0;
            } else {
                this.f31255g = i19;
            }
            if ((i14 & 128) == 0) {
                this.f31256h = 0;
            } else {
                this.f31256h = i24;
            }
            if ((i14 & 256) == 0) {
                this.f31257i = 0;
            } else {
                this.f31257i = i25;
            }
            if ((i14 & 512) == 0) {
                this.f31258j = true;
            } else {
                this.f31258j = z15;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f31249a == bVar.f31249a && this.f31250b == bVar.f31250b && this.f31251c == bVar.f31251c && this.f31252d == bVar.f31252d && this.f31253e == bVar.f31253e && this.f31254f == bVar.f31254f && this.f31255g == bVar.f31255g && this.f31256h == bVar.f31256h && this.f31257i == bVar.f31257i && this.f31258j == bVar.f31258j;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f31258j) + q2.d(this.f31257i, q2.d(this.f31256h, q2.d(this.f31255g, q2.d(this.f31254f, q2.d(this.f31253e, q2.d(this.f31252d, q2.d(this.f31251c, q6.f.g(this.f31249a.hashCode() * 31, 31, this.f31250b), 31), 31), 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("Data(flow=");
            sb3.append(this.f31249a);
            sb3.append(", isMFPLinked=");
            sb3.append(this.f31250b);
            sb3.append(", activeCalories=");
            e0.m(this.f31251c, this.f31252d, ", restingCalories=", ", totalCalories=", sb3);
            e0.m(this.f31253e, this.f31254f, ", consumedCalories=", ", calorieGoal=", sb3);
            e0.m(this.f31255g, this.f31256h, ", remainingCalories=", ", adjustedGoal=", sb3);
            sb3.append(this.f31257i);
            sb3.append(", isPerDayData=");
            sb3.append(this.f31258j);
            sb3.append(")");
            return sb3.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            this.f31249a.writeToParcel(parcel, i14);
            parcel.writeInt(this.f31250b ? 1 : 0);
            parcel.writeInt(this.f31251c);
            parcel.writeInt(this.f31252d);
            parcel.writeInt(this.f31253e);
            parcel.writeInt(this.f31254f);
            parcel.writeInt(this.f31255g);
            parcel.writeInt(this.f31256h);
            parcel.writeInt(this.f31257i);
            parcel.writeInt(this.f31258j ? 1 : 0);
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.calories.presentation.a$b$b, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calories/presentation/a$b$b;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/calories/presentation/a$b;", "serializer", "()Li63/c;", "gcm-calories_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(j jVar) {
                this();
            }

            public final i63.c<b> serializer() {
                return C0502a.f31259a;
            }

            private Companion() {
            }
        }

        public b() {
            this((c) null, false, 0, 0, 0, 0, 0, 0, 0, false, 1023, (j) null);
        }

        public b(c cVar, boolean z14, int i14, int i15, int i16, int i17, int i18, int i19, int i24, boolean z15) {
            cVar.getClass();
            this.f31249a = cVar;
            this.f31250b = z14;
            this.f31251c = i14;
            this.f31252d = i15;
            this.f31253e = i16;
            this.f31254f = i17;
            this.f31255g = i18;
            this.f31256h = i19;
            this.f31257i = i24;
            this.f31258j = z15;
        }

        public /* synthetic */ b(c cVar, boolean z14, int i14, int i15, int i16, int i17, int i18, int i19, int i24, boolean z15, int i25, j jVar) {
            this((i25 & 1) != 0 ? c.DEFAULT_VERSION : cVar, (i25 & 2) != 0 ? false : z14, (i25 & 4) != 0 ? 0 : i14, (i25 & 8) != 0 ? 0 : i15, (i25 & 16) != 0 ? 0 : i16, (i25 & 32) != 0 ? 0 : i17, (i25 & 64) != 0 ? 0 : i18, (i25 & 128) != 0 ? 0 : i19, (i25 & 256) != 0 ? 0 : i24, (i25 & 512) != 0 ? true : z15);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00052\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calories/presentation/a$c;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "gcm-calories_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @h
    public enum c implements Parcelable {
        DEFAULT_VERSION,
        MFP_VERSION;


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<c> CREATOR = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Object f31260a = o13.m.a(o13.n.PUBLICATION, new i0(21));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                parcel.getClass();
                return c.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i14) {
                return new c[i14];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(name());
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.calories.presentation.a$c$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calories/presentation/a$c$a;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/calories/presentation/a$c;", "serializer", "()Li63/c;", "gcm-calories_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(j jVar) {
                this();
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
            public final i63.c<c> serializer() {
                return (i63.c) c.f31260a.getValue();
            }

            private Companion() {
            }
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.calories.presentation.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calories/presentation/a$a;", "", "<init>", "()V", "", "EXTRA_DATA", "Ljava/lang/String;", "DEFAULT_ACTION", "ACTIVE_CALORIES_ACTION", "RESTING_CALORIES_ACTION", "TOTAL_CALORIES_ACTION", "CALORIES_DURING_ACTIVITY_ACTION", "CALORIES_CONSUMED_ACTION", "CALORIE_GOAL_ACTION", "ADJUSTED_GOAL_ACTION", "CALORIES_REMAINING_ACTION", "gcm-calories_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0501a {
        public /* synthetic */ C0501a(j jVar) {
            this();
        }

        private C0501a() {
        }
    }
}
