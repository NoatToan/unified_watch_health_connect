package uw0;

import am.z0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import c22.l3;
import c22.m3;
import c22.q3;
import com.garmin.android.apps.connectmobile.R;
import f12.l;
import gg1.o0;
import i3.e5;
import java.text.DecimalFormat;
import java.util.Arrays;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;
import p005kotlin.math.MathKt;
import ps.x1;
import qs.x;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Luw0/f;", "", "<init>", "()V", "a", "d", "c", "b", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Luw0/f$a;", "Luw0/e;", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends uw0.e {

        /* JADX INFO: renamed from: uw0.f$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3238a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f172982a;

            static {
                int[] iArr = new int[x.values().length];
                try {
                    iArr[x.ASCENT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[x.DESCENT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f172982a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l22.b bVar) {
            super(bVar);
            bVar.getClass();
        }

        @Override // uw0.e
        public final int a() {
            return 0;
        }

        @Override // uw0.e
        public final int c() {
            return R.string.lbl_time;
        }

        @Override // uw0.e
        public final String d(x1 x1Var) {
            l3.a aVar = l3.f23124b;
            Double duration = x1Var.getDuration();
            long jD = MathKt.d((duration != null ? duration.doubleValue() : 0.0d) * ((double) 1000));
            aVar.getClass();
            return l3.a.b1(jD);
        }

        @Override // uw0.e
        public final String e(String str) {
            str.getClass();
            x0 x0Var = x0.f105818a;
            return String.format("%s %s", Arrays.copyOf(new Object[]{this.f172980a.getString(R.string.lbl_split), str}, 2));
        }

        @Override // uw0.e
        public final int f() {
            return R.string.lbl_distance;
        }

        @Override // uw0.e
        public final String g(x1 x1Var) {
            m3 m3Var = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y() ? m3.KILOMETER : m3.MILE;
            Double distance = x1Var.getDistance();
            return b(distance != null ? distance.doubleValue() : 0.0d, m3Var);
        }

        @Override // uw0.e
        public final String h(Context context, x1 x1Var) {
            Double elevationLoss;
            x xVarA2 = x1Var.a2();
            int i14 = xVarA2 == null ? -1 : uw0.e.a.f172981a[xVarA2.ordinal()];
            double dDoubleValue = 0.0d;
            if (i14 == 1) {
                Double elevationGain = x1Var.getElevationGain();
                if (elevationGain != null) {
                    dDoubleValue = elevationGain.doubleValue();
                }
            } else if (i14 == 2 && (elevationLoss = x1Var.getElevationLoss()) != null) {
                dDoubleValue = elevationLoss.doubleValue();
            }
            double d14 = dDoubleValue;
            l lVar = (l) KoinJavaComponent.get$default(l.class, null, null, 6, null);
            l3.a aVar = l3.f23124b;
            o0 o0VarG = lVar.g();
            aVar.getClass();
            return l3.a.a0(context, d14, o0VarG, true, false);
        }

        @Override // uw0.e
        public final int i(x1 x1Var, am.x0 x0Var) {
            x xVarA2 = x1Var.a2();
            int i14 = xVarA2 == null ? -1 : C3238a.f172982a[xVarA2.ordinal()];
            if (i14 != 1) {
                return i14 != 2 ? R.string.no_value : R.string.activities_descent_label;
            }
            return R.string.activities_ascent_label;
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0063  */
        @Override // uw0.e
        public final Drawable[] j(Context context, x xVar) {
            Integer numValueOf;
            Integer numValueOf2;
            Drawable drawable;
            int i14 = xVar == null ? -1 : C3238a.f172982a[xVar.ordinal()];
            if (i14 != 1) {
                numValueOf = i14 != 2 ? null : Integer.valueOf(R.drawable.ic_arrow_up_filled);
            } else {
                numValueOf = Integer.valueOf(R.drawable.ic_arrow_down_filled);
            }
            int i15 = xVar != null ? C3238a.f172982a[xVar.ordinal()] : -1;
            if (i15 != 1) {
                numValueOf2 = i15 != 2 ? null : Integer.valueOf(R.color.gcm_polyline_activity_lap_descent);
            } else {
                numValueOf2 = Integer.valueOf(R.color.gcm_polyline_activity_lap_ascent);
            }
            if (numValueOf == null || numValueOf2 == null) {
                drawable = null;
            } else {
                int iIntValue = numValueOf2.intValue();
                drawable = a7.b.getDrawable(context, numValueOf.intValue());
                if (drawable != null) {
                    drawable.mutate().setTint(a7.b.getColor(context, iIntValue));
                } else {
                    drawable = null;
                }
            }
            return new Drawable[]{null, null, drawable, null};
        }

        @Override // uw0.e
        public final int k() {
            return 0;
        }

        @Override // uw0.e
        public final int l() {
            return 0;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Luw0/f$b;", "Luw0/e;", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends uw0.e {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l22.b bVar) {
            super(bVar);
            bVar.getClass();
        }

        @Override // uw0.e
        public final int a() {
            return 8;
        }

        @Override // uw0.e
        public final int c() {
            return R.string.no_value;
        }

        @Override // uw0.e
        public final String d(x1 x1Var) {
            return this.f172980a.getString(R.string.no_value);
        }

        @Override // uw0.e
        public final String e(String str) {
            str.getClass();
            return this.f172980a.getString(R.string.no_value);
        }

        @Override // uw0.e
        public final int f() {
            return R.string.no_value;
        }

        @Override // uw0.e
        public final String g(x1 x1Var) {
            return this.f172980a.getString(R.string.no_value);
        }

        @Override // uw0.e
        public final String h(Context context, x1 x1Var) {
            return this.f172980a.getString(R.string.no_value);
        }

        @Override // uw0.e
        public final int i(x1 x1Var, am.x0 x0Var) {
            return R.string.no_value;
        }

        @Override // uw0.e
        public final Drawable[] j(Context context, x xVar) {
            return new Drawable[4];
        }

        @Override // uw0.e
        public final int k() {
            return 8;
        }

        @Override // uw0.e
        public final int l() {
            return 8;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Luw0/f$c;", "Luw0/f$d;", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(l22.b bVar) {
            super(bVar);
            bVar.getClass();
        }

        @Override // uw0.f.d, uw0.e
        public final String e(String str) {
            str.getClass();
            return this.f172980a.getString(R.string.activities_wave_label);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0012\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Luw0/f$d;", "Luw0/e;", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static class d extends uw0.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f172983b;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f172984a;

            static {
                int[] iArr = new int[x.values().length];
                try {
                    iArr[x.SURF_ACTIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f172984a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(l22.b bVar) {
            super(bVar);
            bVar.getClass();
            this.f172983b = bVar.getString(R.string.no_value);
        }

        @Override // uw0.e
        public final int a() {
            return 0;
        }

        @Override // uw0.e
        public final int c() {
            return R.string.lbl_distance;
        }

        @Override // uw0.e
        public final String d(x1 x1Var) {
            Double distance = x1Var.getDistance();
            double dDoubleValue = distance != null ? distance.doubleValue() : 0.0d;
            l lVar = (l) KoinJavaComponent.get$default(l.class, null, null, 6, null);
            if (dDoubleValue > 0.0d) {
                return b(dDoubleValue, lVar.y() ? m3.METER : m3.FOOT);
            }
            return this.f172983b;
        }

        @Override // uw0.e
        public String e(String str) {
            str.getClass();
            return this.f172980a.getString(R.string.lbl_wakesports_run);
        }

        @Override // uw0.e
        public final int f() {
            return R.string.activity_details_max_speed;
        }

        @Override // uw0.e
        public final String g(x1 x1Var) {
            Double maxSpeed = x1Var.getMaxSpeed();
            double dDoubleValue = maxSpeed != null ? maxSpeed.doubleValue() : 0.0d;
            q3 q3Var = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y() ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
            if (dDoubleValue <= 0.0d) {
                return this.f172983b;
            }
            l3.a aVar = l3.f23124b;
            DecimalFormat decimalFormat = l3.f23126d;
            aVar.getClass();
            return e5.g(l3.a.L0(dDoubleValue, q3Var, decimalFormat), StringUtils.SPACE, this.f172980a.getString(q3Var.f23223e));
        }

        @Override // uw0.e
        public final String h(Context context, x1 x1Var) {
            Double duration = x1Var.getDuration();
            l3.a aVar = l3.f23124b;
            long jD = MathKt.d((duration != null ? duration.doubleValue() : 0.0d) * ((double) 1000));
            aVar.getClass();
            return l3.a.b1(jD);
        }

        @Override // uw0.e
        public final int i(x1 x1Var, am.x0 x0Var) {
            String str = x0Var.f4358a;
            x xVarA2 = x1Var.a2();
            if ((xVarA2 == null ? -1 : a.f172984a[xVarA2.ordinal()]) == 1) {
                return (z0.a0(str) || z0.b0(str)) ? R.string.lbl_wakesports_active_time : R.string.activity_details_surf_time;
            }
            return R.string.no_value;
        }

        @Override // uw0.e
        public final Drawable[] j(Context context, x xVar) {
            return new Drawable[4];
        }

        @Override // uw0.e
        public final int k() {
            return 0;
        }

        @Override // uw0.e
        public final int l() {
            return 0;
        }
    }

    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f172985a;

        static {
            int[] iArr = new int[am.x0.values().length];
            try {
                iArr[am.x0.V1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[am.x0.W1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[am.x0.X1.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[am.x0.K1.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[am.x0.H2.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[am.x0.I2.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[am.x0.J2.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[am.x0.G2.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[am.x0.I1.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[am.x0.V2.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f172985a = iArr;
        }
    }
}
