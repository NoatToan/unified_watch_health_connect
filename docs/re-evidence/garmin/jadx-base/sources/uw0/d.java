package uw0;

import am.x0;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.TypedValue;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import qs.x;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Luw0/d;", "", "<init>", "()V", "a", "c", "d", "b", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Luw0/d$a;", "Luw0/c;", "Landroid/content/res/Resources;", "resources", "<init>", "(Landroid/content/res/Resources;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends uw0.c {

        /* JADX INFO: renamed from: uw0.d$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3236a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f172976a;

            static {
                int[] iArr = new int[x.values().length];
                try {
                    iArr[x.TRANSITION.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[x.ASCENT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[x.DESCENT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f172976a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Resources resources) {
            super(resources);
            resources.getClass();
        }

        @Override // uw0.c
        public final int b() {
            ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
            return this.f172973a.getColor(R.color.palette_red_13, null);
        }

        @Override // uw0.c
        public final int c() {
            ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
            return this.f172973a.getColor(R.color.palette_mango_24, null);
        }

        @Override // uw0.c
        public final int d(x xVar) {
            int i14 = xVar == null ? -1 : C3236a.f172976a[xVar.ordinal()];
            Resources resources = this.f172973a;
            if (i14 == 1) {
                ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
                return resources.getColor(R.color.gds_data_viz_neutral_secondary, null);
            }
            if (i14 == 2) {
                ThreadLocal<TypedValue> threadLocal2 = b7.g.f16255a;
                return resources.getColor(R.color.gcm_polyline_activity_lap_ascent, null);
            }
            if (i14 != 3) {
                return -16777216;
            }
            ThreadLocal<TypedValue> threadLocal3 = b7.g.f16255a;
            return resources.getColor(R.color.gcm_polyline_activity_lap_descent, null);
        }

        @Override // uw0.c
        public final Bitmap f() {
            return null;
        }

        @Override // uw0.c
        public final Bitmap g() {
            return null;
        }

        @Override // uw0.c
        public final Bitmap h(x xVar) {
            if ((xVar == null ? -1 : C3236a.f172976a[xVar.ordinal()]) == 1) {
                return e(2131233050);
            }
            return null;
        }

        @Override // uw0.c
        public final Bitmap i() {
            return null;
        }

        @Override // uw0.c
        public final Bitmap j(int i14) {
            return a(String.valueOf(i14));
        }

        @Override // uw0.c
        public final Bitmap k() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Luw0/d$b;", "Luw0/c;", "Landroid/content/res/Resources;", "resources", "<init>", "(Landroid/content/res/Resources;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends uw0.c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Resources resources) {
            super(resources);
            resources.getClass();
        }

        @Override // uw0.c
        public final int b() {
            return -7829368;
        }

        @Override // uw0.c
        public final int c() {
            return -7829368;
        }

        @Override // uw0.c
        public final int d(x xVar) {
            return -7829368;
        }

        @Override // uw0.c
        public final Bitmap f() {
            return null;
        }

        @Override // uw0.c
        public final Bitmap g() {
            return null;
        }

        @Override // uw0.c
        public final Bitmap h(x xVar) {
            return null;
        }

        @Override // uw0.c
        public final Bitmap i() {
            return null;
        }

        @Override // uw0.c
        public final Bitmap j(int i14) {
            return null;
        }

        @Override // uw0.c
        public final Bitmap k() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Luw0/d$c;", "Luw0/c;", "Landroid/content/res/Resources;", "resources", "<init>", "(Landroid/content/res/Resources;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends uw0.c {

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f172977a;

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
                f172977a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Resources resources) {
            super(resources);
            resources.getClass();
        }

        @Override // uw0.c
        public final int b() {
            ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
            return this.f172973a.getColor(R.color.palette_red_13, null);
        }

        @Override // uw0.c
        public final int c() {
            ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
            return this.f172973a.getColor(R.color.palette_mango_24, null);
        }

        @Override // uw0.c
        public final int d(x xVar) {
            int i14 = xVar == null ? -1 : a.f172977a[xVar.ordinal()];
            Resources resources = this.f172973a;
            if (i14 == 1) {
                ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
                return resources.getColor(R.color.gcm_polyline_activity_lap_ascent, null);
            }
            if (i14 != 2) {
                return -16777216;
            }
            ThreadLocal<TypedValue> threadLocal2 = b7.g.f16255a;
            return resources.getColor(R.color.gcm_polyline_activity_lap_descent, null);
        }

        @Override // uw0.c
        public final Bitmap f() {
            return null;
        }

        @Override // uw0.c
        public final Bitmap g() {
            return null;
        }

        @Override // uw0.c
        public final Bitmap h(x xVar) {
            return null;
        }

        @Override // uw0.c
        public final Bitmap i() {
            return null;
        }

        @Override // uw0.c
        public final Bitmap j(int i14) {
            return a(String.valueOf(i14));
        }

        @Override // uw0.c
        public final Bitmap k() {
            return null;
        }
    }

    /* JADX INFO: renamed from: uw0.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Luw0/d$d;", "Luw0/c;", "Landroid/content/res/Resources;", "resources", "<init>", "(Landroid/content/res/Resources;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3237d extends uw0.c {

        /* JADX INFO: renamed from: uw0.d$d$a */
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f172978a;

            static {
                int[] iArr = new int[x.values().length];
                try {
                    iArr[x.SURF_ACTIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f172978a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3237d(Resources resources) {
            super(resources);
            resources.getClass();
        }

        @Override // uw0.c
        public final int b() {
            ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
            return this.f172973a.getColor(R.color.gds_data_viz_red_primary, null);
        }

        @Override // uw0.c
        public final int c() {
            ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
            return this.f172973a.getColor(R.color.gds_data_viz_yellow_primary, null);
        }

        @Override // uw0.c
        public final int d(x xVar) {
            if ((xVar == null ? -1 : a.f172978a[xVar.ordinal()]) != 1) {
                return -16777216;
            }
            ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
            return this.f172973a.getColor(R.color.gds_data_viz_blue_primary, null);
        }

        @Override // uw0.c
        public final Bitmap f() {
            return e(R.drawable.surf_marker_longest_start);
        }

        @Override // uw0.c
        public final Bitmap g() {
            return e(R.drawable.surf_marker_selected_start);
        }

        @Override // uw0.c
        public final Bitmap h(x xVar) {
            return e(R.drawable.surf_marker_default_start);
        }

        @Override // uw0.c
        public final Bitmap i() {
            return e(R.drawable.surf_marker_longest_end);
        }

        @Override // uw0.c
        public final Bitmap j(int i14) {
            return e(R.drawable.surf_marker_selected_end);
        }

        @Override // uw0.c
        public final Bitmap k() {
            return e(R.drawable.surf_marker_default_end);
        }
    }

    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f172979a;

        static {
            int[] iArr = new int[x0.values().length];
            try {
                iArr[x0.V1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x0.W1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x0.X1.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x0.S0.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[x0.T0.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[x0.I1.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[x0.V2.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[x0.K1.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[x0.H2.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[x0.J2.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[x0.G2.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[x0.I2.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f172979a = iArr;
        }
    }
}
