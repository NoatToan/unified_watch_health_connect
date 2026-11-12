package ps;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.R;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.Arrays;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u001a\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-B\u007f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0001\u0019./0123456789:;<=>?@ABCDEF¨\u0006G"}, d2 = {"Lps/b1;", "Landroid/os/Parcelable;", "", Action.KEY_ATTRIBUTE, "", "name", "leftLegendLabel", "rightLegendLabel", "", "colors", "alphas", "dashColors", "defaultColor", "customLegendLayoutId", "", "polylineWidth", "polylineBorderWidth", "dashedPolylineBorderWidth", "<init>", "(Ljava/lang/String;III[I[I[IIIFFF)V", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "j", "x", "s", "m", "o", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "v", "l", JWKParameterNames.RSA_MODULUS, "w", "u", "d", "a", "c", JWKParameterNames.RSA_EXPONENT, "f", "g", "h", IntegerTokenConverter.CONVERTER_KEY, JWKParameterNames.OCT_KEY_VALUE, JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "p", "z", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "b", "Lps/b1$a;", "Lps/b1$c;", "Lps/b1$d;", "Lps/b1$e;", "Lps/b1$f;", "Lps/b1$g;", "Lps/b1$h;", "Lps/b1$i;", "Lps/b1$j;", "Lps/b1$k;", "Lps/b1$l;", "Lps/b1$m;", "Lps/b1$n;", "Lps/b1$o;", "Lps/b1$p;", "Lps/b1$q;", "Lps/b1$r;", "Lps/b1$s;", "Lps/b1$t;", "Lps/b1$u;", "Lps/b1$v;", "Lps/b1$w;", "Lps/b1$x;", "Lps/b1$y;", "Lps/b1$z;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b1 implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f139689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f139690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f139691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f139692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f139693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f139694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f139695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f139696h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f139697i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f139698j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f139699k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f139700l;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lps/b1$a;", "Lps/b1;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends b1 {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f139701m = new a();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final List<Double> f139702n = p13.x.k(Double.valueOf(0.0d), Double.valueOf(1.0d), Double.valueOf(2.0d));
        public static final Parcelable.Creator<a> CREATOR = new C2646a();

        /* JADX INFO: renamed from: ps.b1$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C2646a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return a.f139701m;
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i14) {
                return new a[i14];
            }
        }

        private a() {
            super("AscentDescent", R.string.lbl_ascent_descent, 0, 0, new int[]{R.color.gds_data_viz_red_primary, R.color.gds_data_viz_blue_primary, R.color.gds_data_viz_neutral_secondary}, null, null, R.color.gds_data_viz_red_primary, R.layout.ascent_descent_map_legend, 0.0f, 0.0f, 0.0f, 3692, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // ps.b1
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        @Override // ps.b1
        public final int hashCode() {
            return -88036626;
        }

        public final String toString() {
            return "AscentDescent";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lps/b1$c;", "Lps/b1;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends b1 {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final c f139703m = new c();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final List<Double> f139704n = p13.x.k(Double.valueOf(0.0d), Double.valueOf(1.0d));
        public static final Parcelable.Creator<c> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return c.f139703m;
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i14) {
                return new c[i14];
            }
        }

        private c() {
            super("CyclingAscentDescent", R.string.lbl_ascent_descent, 0, 0, new int[]{R.color.gds_data_viz_red_primary, R.color.gds_data_viz_blue_primary}, null, null, R.color.gds_data_viz_red_primary, R.layout.cycling_ascent_descent_map_legend, 0.0f, 0.0f, 0.0f, 3692, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // ps.b1
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        @Override // ps.b1
        public final int hashCode() {
            return -231278865;
        }

        public final String toString() {
            return "CyclingAscentDescent";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lps/b1$d;", "Lps/b1;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends b1 {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final d f139705m = new d();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final List<Double> f139706n = p13.x.k(Double.valueOf(0.0d), Double.valueOf(1.0d));
        public static final Parcelable.Creator<d> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return d.f139705m;
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i14) {
                return new d[i14];
            }
        }

        private d() {
            super("CyclingRunLift", R.string.lbl_enduro_run_lift, R.string.lbl_enduro_run, R.string.lbl_enduro_lift, new int[]{R.color.gds_data_viz_red_primary, R.color.gds_data_viz_neutral_secondary}, null, null, R.color.gds_data_viz_red_primary, R.layout.cycling_run_lift_map_legend, 0.0f, 0.0f, 0.0f, 3680, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // ps.b1
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        @Override // ps.b1
        public final int hashCode() {
            return -704282651;
        }

        public final String toString() {
            return "CyclingRunLift";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lps/b1$e;", "Lps/b1;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e extends b1 {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final e f139707m = new e();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final List<Double> f139708n = p13.x.k(Double.valueOf(0.0d), Double.valueOf(1.0d), Double.valueOf(2.0d), Double.valueOf(3.0d));
        public static final Parcelable.Creator<e> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public final e createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return e.f139707m;
            }

            @Override // android.os.Parcelable.Creator
            public final e[] newArray(int i14) {
                return new e[i14];
            }
        }

        private e() {
            super("EBikeAssistModes3", R.string.lbl_e_bike_assist_mode, R.string.lbl_less_assist, R.string.lbl_more_assist, new int[]{R.color.palette_gray_40, R.color.palette_blue_25, R.color.palette_green_17, R.color.palette_red_14}, null, null, R.color.palette_gray_40, 0, 0.0f, 0.0f, 0.0f, 3936, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // ps.b1
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        @Override // ps.b1
        public final int hashCode() {
            return -620290752;
        }

        public final String toString() {
            return "EBikeAssistModes3";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lps/b1$f;", "Lps/b1;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f extends b1 {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final f f139709m = new f();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final List<Double> f139710n = p13.x.k(Double.valueOf(0.0d), Double.valueOf(1.0d), Double.valueOf(2.0d), Double.valueOf(3.0d), Double.valueOf(4.0d));
        public static final Parcelable.Creator<f> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<f> {
            @Override // android.os.Parcelable.Creator
            public final f createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return f.f139709m;
            }

            @Override // android.os.Parcelable.Creator
            public final f[] newArray(int i14) {
                return new f[i14];
            }
        }

        private f() {
            super("EBikeAssistModes4", R.string.lbl_e_bike_assist_mode, R.string.lbl_less_assist, R.string.lbl_more_assist, new int[]{R.color.palette_gray_40, R.color.palette_blue_25, R.color.palette_green_17, R.color.palette_mango_27, R.color.palette_red_14}, null, null, R.color.palette_gray_40, 0, 0.0f, 0.0f, 0.0f, 3936, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // ps.b1
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        @Override // ps.b1
        public final int hashCode() {
            return -620290751;
        }

        public final String toString() {
            return "EBikeAssistModes4";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lps/b1$g;", "Lps/b1;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g extends b1 {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final g f139711m = new g();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final List<Double> f139712n = p13.x.k(Double.valueOf(0.0d), Double.valueOf(1.0d), Double.valueOf(2.0d), Double.valueOf(3.0d), Double.valueOf(4.0d), Double.valueOf(5.0d));
        public static final Parcelable.Creator<g> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            public final g createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return g.f139711m;
            }

            @Override // android.os.Parcelable.Creator
            public final g[] newArray(int i14) {
                return new g[i14];
            }
        }

        private g() {
            super("EBikeAssistModes5", R.string.lbl_e_bike_assist_mode, R.string.lbl_less_assist, R.string.lbl_more_assist, new int[]{R.color.palette_gray_40, R.color.palette_blue_25, R.color.palette_green_17, R.color.palette_mango_28, R.color.palette_mango_27, R.color.palette_red_14}, null, null, R.color.palette_gray_40, 0, 0.0f, 0.0f, 0.0f, 3936, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // ps.b1
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        @Override // ps.b1
        public final int hashCode() {
            return -620290750;
        }

        public final String toString() {
            return "EBikeAssistModes5";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lps/b1$h;", "Lps/b1;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h extends b1 {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final h f139713m = new h();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final List<Double> f139714n = p13.x.k(Double.valueOf(0.0d), Double.valueOf(1.0d), Double.valueOf(2.0d), Double.valueOf(3.0d), Double.valueOf(4.0d), Double.valueOf(5.0d), Double.valueOf(6.0d));
        public static final Parcelable.Creator<h> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<h> {
            @Override // android.os.Parcelable.Creator
            public final h createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return h.f139713m;
            }

            @Override // android.os.Parcelable.Creator
            public final h[] newArray(int i14) {
                return new h[i14];
            }
        }

        private h() {
            super("EBikeAssistModes6", R.string.lbl_e_bike_assist_mode, R.string.lbl_less_assist, R.string.lbl_more_assist, new int[]{R.color.palette_gray_40, R.color.palette_blue_25, R.color.palette_blue_23, R.color.palette_green_17, R.color.palette_mango_28, R.color.palette_mango_27, R.color.palette_red_14}, null, null, R.color.palette_gray_40, 0, 0.0f, 0.0f, 0.0f, 3936, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // ps.b1
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        @Override // ps.b1
        public final int hashCode() {
            return -620290749;
        }

        public final String toString() {
            return "EBikeAssistModes6";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lps/b1$i;", "Lps/b1;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class i extends b1 {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final i f139715m = new i();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final List<Double> f139716n = p13.x.k(Double.valueOf(0.0d), Double.valueOf(1.0d), Double.valueOf(2.0d), Double.valueOf(3.0d), Double.valueOf(4.0d), Double.valueOf(5.0d), Double.valueOf(6.0d), Double.valueOf(7.0d));
        public static final Parcelable.Creator<i> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<i> {
            @Override // android.os.Parcelable.Creator
            public final i createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return i.f139715m;
            }

            @Override // android.os.Parcelable.Creator
            public final i[] newArray(int i14) {
                return new i[i14];
            }
        }

        private i() {
            super("EBikeAssistModes7", R.string.lbl_e_bike_assist_mode, R.string.lbl_less_assist, R.string.lbl_more_assist, new int[]{R.color.palette_gray_40, R.color.palette_blue_25, R.color.palette_blue_23, R.color.palette_green_17, R.color.palette_mango_28, R.color.palette_mango_27, R.color.palette_mango_26, R.color.palette_red_14}, null, null, R.color.palette_gray_40, 0, 0.0f, 0.0f, 0.0f, 3936, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // ps.b1
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        @Override // ps.b1
        public final int hashCode() {
            return -620290748;
        }

        public final String toString() {
            return "EBikeAssistModes7";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lps/b1$j;", "Lps/b1;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class j extends b1 {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final j f139717m = new j();
        public static final Parcelable.Creator<j> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<j> {
            @Override // android.os.Parcelable.Creator
            public final j createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return j.f139717m;
            }

            @Override // android.os.Parcelable.Creator
            public final j[] newArray(int i14) {
                return new j[i14];
            }
        }

        private j() {
            super("Elevation", R.string.activity_details_elevation, R.string.lbl_lower, R.string.lbl_higher, new int[]{R.color.palette_blue_25, R.color.palette_blue_24, R.color.palette_blue_23, R.color.palette_blue_22, R.color.palette_green_17, R.color.palette_green_17, R.color.palette_mango_28, R.color.palette_mango_27, R.color.palette_mango_26, R.color.palette_red_14}, null, null, R.color.palette_green_17, 0, 0.0f, 0.0f, 0.0f, 3936, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // ps.b1
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        @Override // ps.b1
        public final int hashCode() {
            return -827102773;
        }

        public final String toString() {
            return "Elevation";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lps/b1$k;", "Lps/b1;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class k extends b1 {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final k f139718m = new k();
        public static final Parcelable.Creator<k> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<k> {
            @Override // android.os.Parcelable.Creator
            public final k createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return k.f139718m;
            }

            @Override // android.os.Parcelable.Creator
            public final k[] newArray(int i14) {
                return new k[i14];
            }
        }

        private k() {
            super("ElevationWithNoValueSplits", R.string.activity_details_elevation, R.string.lbl_lower, R.string.lbl_higher, new int[]{R.color.palette_blue_25, R.color.palette_blue_24, R.color.palette_blue_23, R.color.palette_blue_22, R.color.palette_green_17, R.color.palette_green_17, R.color.palette_mango_28, R.color.palette_mango_27, R.color.palette_mango_26, R.color.palette_red_14}, null, null, R.color.palette_green_17, 0, 0.0f, 0.0f, 0.0f, 3936, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // ps.b1
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        @Override // ps.b1
        public final int hashCode() {
            return 996543288;
        }

        public final String toString() {
            return "ElevationWithNoValueSplits";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lps/b1$l;", "Lps/b1;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class l extends b1 {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final l f139719m = new l();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final List<Double> f139720n = p13.x.k(Double.valueOf(0.0d), Double.valueOf(1.0d), Double.valueOf(20.0d));
        public static final Parcelable.Creator<l> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<l> {
            @Override // android.os.Parcelable.Creator
            public final l createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return l.f139719m;
            }

            @Override // android.os.Parcelable.Creator
            public final l[] newArray(int i14) {
                return new l[i14];
            }
        }

        private l() {
            super("Flow", R.string.lbl_flow_chart_title, R.string.lbl_smooth, R.string.lbl_rough, new int[]{R.color.palette_swagger_2, R.color.palette_hatorade_2, R.color.palette_ruby_2}, null, null, R.color.palette_swagger_2, 0, 0.0f, 0.0f, 0.0f, 3936, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // ps.b1
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        @Override // ps.b1
        public final int hashCode() {
            return -937305856;
        }

        public final String toString() {
            return "Flow";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lps/b1$m;", "Lps/b1;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class m extends b1 {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final m f139721m = new m();
        public static final Parcelable.Creator<m> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<m> {
            @Override // android.os.Parcelable.Creator
            public final m createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return m.f139721m;
            }

            @Override // android.os.Parcelable.Creator
            public final m[] newArray(int i14) {
                return new m[i14];
            }
        }

        private m() {
            super("GradeAdjustedPace", R.string.activities_grade_adjusted_pace, R.string.pacepro_lbl_pace_slower, R.string.pacepro_lbl_pace_faster, new int[]{R.color.palette_blue_25, R.color.palette_blue_24, R.color.palette_blue_23, R.color.palette_blue_22, R.color.palette_green_17, R.color.palette_green_17, R.color.palette_mango_28, R.color.palette_mango_27, R.color.palette_mango_26, R.color.palette_red_14}, null, null, R.color.palette_green_17, 0, 0.0f, 0.0f, 0.0f, 3936, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // ps.b1
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        @Override // ps.b1
        public final int hashCode() {
            return -1756200314;
        }

        public final String toString() {
            return "GradeAdjustedPace";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lps/b1$n;", "Lps/b1;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class n extends b1 {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final n f139722m = new n();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final List<Double> f139723n = p13.x.k(Double.valueOf(0.0d), Double.valueOf(20.0d), Double.valueOf(40.0d));
        public static final Parcelable.Creator<n> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<n> {
            @Override // android.os.Parcelable.Creator
            public final n createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return n.f139722m;
            }

            @Override // android.os.Parcelable.Creator
            public final n[] newArray(int i14) {
                return new n[i14];
            }
        }

        private n() {
            super("Grit", R.string.lbl_grit_chart_title, R.string.lbl_easy, R.string.lbl_hard, new int[]{R.color.palette_swagger_2, R.color.palette_delta_2, R.color.palette_berry_1}, null, null, R.color.palette_swagger_2, 0, 0.0f, 0.0f, 0.0f, 3936, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // ps.b1
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        @Override // ps.b1
        public final int hashCode() {
            return -937270488;
        }

        public final String toString() {
            return "Grit";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lps/b1$o;", "Lps/b1;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class o extends b1 {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final o f139724m = new o();
        public static final Parcelable.Creator<o> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<o> {
            @Override // android.os.Parcelable.Creator
            public final o createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return o.f139724m;
            }

            @Override // android.os.Parcelable.Creator
            public final o[] newArray(int i14) {
                return new o[i14];
            }
        }

        private o() {
            super("HeartRate", R.string.activity_details_heart_rate, R.string.lbl_lower_hr, R.string.lbl_higher_hr, new int[]{R.color.palette_gray_40, R.color.palette_blue_23, R.color.palette_green_17, R.color.palette_mango_27, R.color.palette_red_14}, null, null, R.color.palette_gray_40, 0, 0.0f, 0.0f, 0.0f, 3936, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // ps.b1
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        @Override // ps.b1
        public final int hashCode() {
            return -622306892;
        }

        public final String toString() {
            return "HeartRate";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lps/b1$p;", "Lps/b1;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class p extends b1 {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final p f139725m = new p();
        public static final Parcelable.Creator<p> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<p> {
            @Override // android.os.Parcelable.Creator
            public final p createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return p.f139725m;
            }

            @Override // android.os.Parcelable.Creator
            public final p[] newArray(int i14) {
                return new p[i14];
            }
        }

        private p() {
            super("HeartRateWithNoValueSplits", R.string.activity_details_heart_rate, R.string.lbl_lower_hr, R.string.lbl_higher_hr, new int[]{R.color.palette_gray_40, R.color.palette_blue_23, R.color.palette_green_17, R.color.palette_mango_27, R.color.palette_red_14}, null, null, R.color.palette_gray_40, 0, 0.0f, 0.0f, 0.0f, 3936, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // ps.b1
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof p);
        }

        @Override // ps.b1
        public final int hashCode() {
            return -1198273937;
        }

        public final String toString() {
            return "HeartRateWithNoValueSplits";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lps/b1$q;", "Lps/b1;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class q extends b1 {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final q f139726m = new q();
        public static final Parcelable.Creator<q> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<q> {
            @Override // android.os.Parcelable.Creator
            public final q createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return q.f139726m;
            }

            @Override // android.os.Parcelable.Creator
            public final q[] newArray(int i14) {
                return new q[i14];
            }
        }

        private q() {
            super("Heatmap", 0, R.string.lbl_less_time, R.string.lbl_more_time, new int[]{R.color.palette_blue_25, R.color.palette_green_17, R.color.palette_mango_11, R.color.orange_30_static, R.color.palette_red_14}, null, null, R.color.gray_10_static, 0, 0.0f, 0.0f, 0.0f, 3936, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // ps.b1
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof q);
        }

        @Override // ps.b1
        public final int hashCode() {
            return -134672294;
        }

        public final String toString() {
            return "Heatmap";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lps/b1$s;", "Lps/b1;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class s extends b1 {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final s f139728m = new s();
        public static final Parcelable.Creator<s> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<s> {
            @Override // android.os.Parcelable.Creator
            public final s createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return s.f139728m;
            }

            @Override // android.os.Parcelable.Creator
            public final s[] newArray(int i14) {
                return new s[i14];
            }
        }

        private s() {
            super("Pace", R.string.lbl_pace, R.string.pacepro_lbl_pace_slower, R.string.pacepro_lbl_pace_faster, new int[]{R.color.palette_blue_25, R.color.palette_blue_24, R.color.palette_blue_23, R.color.palette_blue_22, R.color.palette_green_17, R.color.palette_green_17, R.color.palette_mango_28, R.color.palette_mango_27, R.color.palette_mango_26, R.color.palette_red_14}, null, null, R.color.palette_green_17, 0, 0.0f, 0.0f, 0.0f, 3936, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // ps.b1
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof s);
        }

        @Override // ps.b1
        public final int hashCode() {
            return -937018907;
        }

        public final String toString() {
            return "Pace";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lps/b1$t;", "Lps/b1;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class t extends b1 {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final t f139729m = new t();
        public static final Parcelable.Creator<t> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<t> {
            @Override // android.os.Parcelable.Creator
            public final t createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return t.f139729m;
            }

            @Override // android.os.Parcelable.Creator
            public final t[] newArray(int i14) {
                return new t[i14];
            }
        }

        private t() {
            super("Power", R.string.activity_details_power, R.string.lbl_less_power, R.string.lbl_more_power, new int[]{R.color.palette_gray_40, R.color.palette_blue_23, R.color.palette_green_17, R.color.palette_mango_28, R.color.palette_mango_27, R.color.palette_red_14, R.color.palette_purple_9}, null, null, R.color.palette_gray_40, 0, 0.0f, 0.0f, 0.0f, 3936, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // ps.b1
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof t);
        }

        @Override // ps.b1
        public final int hashCode() {
            return 1017621363;
        }

        public final String toString() {
            return "Power";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lps/b1$u;", "Lps/b1;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class u extends b1 {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final u f139730m = new u();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final List<Double> f139731n = p13.x.k(Double.valueOf(0.0d), Double.valueOf(1.0d));
        public static final Parcelable.Creator<u> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<u> {
            @Override // android.os.Parcelable.Creator
            public final u createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return u.f139730m;
            }

            @Override // android.os.Parcelable.Creator
            public final u[] newArray(int i14) {
                return new u[i14];
            }
        }

        private u() {
            super("RunLift", R.string.lbl_ski_run_lift, R.string.lbl_ski_run, R.string.lbl_ski_lift, new int[]{R.color.gds_data_viz_red_primary, R.color.gds_data_viz_neutral_secondary}, null, null, R.color.gds_data_viz_red_primary, R.layout.run_lift_map_legend, 0.0f, 0.0f, 0.0f, 3680, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // ps.b1
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof u);
        }

        @Override // ps.b1
        public final int hashCode() {
            return 619306788;
        }

        public final String toString() {
            return "RunLift";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lps/b1$v;", "Lps/b1;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class v extends b1 {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final v f139732m = new v();
        public static final Parcelable.Creator<v> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<v> {
            @Override // android.os.Parcelable.Creator
            public final v createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return v.f139732m;
            }

            @Override // android.os.Parcelable.Creator
            public final v[] newArray(int i14) {
                return new v[i14];
            }
        }

        private v() {
            super("RunPower", R.string.lbl_power_cap, R.string.lbl_less_power, R.string.lbl_more_power, new int[]{R.color.palette_gray_40, R.color.palette_blue_23, R.color.palette_green_17, R.color.palette_mango_27, R.color.palette_red_14}, null, null, R.color.palette_gray_40, 0, 0.0f, 0.0f, 0.0f, 3936, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // ps.b1
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof v);
        }

        @Override // ps.b1
        public final int hashCode() {
            return 2022530060;
        }

        public final String toString() {
            return "RunPower";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lps/b1$w;", "Lps/b1;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class w extends b1 {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final w f139733m = new w();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final List<Double> f139734n = p13.x.k(Double.valueOf(0.0d), Double.valueOf(1.0d), Double.valueOf(2.0d));
        public static final Parcelable.Creator<w> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<w> {
            @Override // android.os.Parcelable.Creator
            public final w createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return w.f139733m;
            }

            @Override // android.os.Parcelable.Creator
            public final w[] newArray(int i14) {
                return new w[i14];
            }
        }

        private w() {
            super("RunWalk", R.string.activity_options_running_mode_run_or_walk_title, 0, 0, new int[]{R.color.blue_10_static, R.color.green_10_static, R.color.yellow_50}, null, null, R.color.blue_10_static, R.layout.run_walk_map_legend, 0.0f, 0.0f, 0.0f, 3692, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // ps.b1
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof w);
        }

        @Override // ps.b1
        public final int hashCode() {
            return 619626978;
        }

        public final String toString() {
            return "RunWalk";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lps/b1$x;", "Lps/b1;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class x extends b1 {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final x f139735m = new x();
        public static final Parcelable.Creator<x> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<x> {
            @Override // android.os.Parcelable.Creator
            public final x createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return x.f139735m;
            }

            @Override // android.os.Parcelable.Creator
            public final x[] newArray(int i14) {
                return new x[i14];
            }
        }

        private x() {
            super("Speed", R.string.lbl_speed, R.string.pacepro_lbl_pace_slower, R.string.pacepro_lbl_pace_faster, new int[]{R.color.palette_blue_25, R.color.palette_blue_24, R.color.palette_blue_23, R.color.palette_blue_22, R.color.palette_green_17, R.color.palette_green_17, R.color.palette_mango_28, R.color.palette_mango_27, R.color.palette_mango_26, R.color.palette_red_14}, null, null, R.color.palette_green_17, 0, 0.0f, 0.0f, 0.0f, 3936, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // ps.b1
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof x);
        }

        @Override // ps.b1
        public final int hashCode() {
            return 1020404405;
        }

        public final String toString() {
            return "Speed";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lps/b1$y;", "Lps/b1;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class y extends b1 {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final y f139736m = new y();
        public static final Parcelable.Creator<y> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<y> {
            @Override // android.os.Parcelable.Creator
            public final y createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return y.f139736m;
            }

            @Override // android.os.Parcelable.Creator
            public final y[] newArray(int i14) {
                return new y[i14];
            }
        }

        private y() {
            super("SpeedWithNoValueSplits", R.string.lbl_speed, R.string.pacepro_lbl_pace_slower, R.string.pacepro_lbl_pace_faster, new int[]{R.color.palette_blue_25, R.color.palette_blue_24, R.color.palette_blue_23, R.color.palette_blue_22, R.color.palette_green_17, R.color.palette_green_17, R.color.palette_mango_28, R.color.palette_mango_27, R.color.palette_mango_26, R.color.palette_red_14}, null, null, R.color.palette_green_17, 0, 0.0f, 0.0f, 0.0f, 3936, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // ps.b1
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof y);
        }

        @Override // ps.b1
        public final int hashCode() {
            return -1796799602;
        }

        public final String toString() {
            return "SpeedWithNoValueSplits";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lps/b1$z;", "Lps/b1;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class z extends b1 {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final z f139737m = new z();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final List<Double> f139738n = p13.x.k(Double.valueOf(0.0d), Double.valueOf(1.0d));
        public static final Parcelable.Creator<z> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<z> {
            @Override // android.os.Parcelable.Creator
            public final z createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return z.f139737m;
            }

            @Override // android.os.Parcelable.Creator
            public final z[] newArray(int i14) {
                return new z[i14];
            }
        }

        private z() {
            super("SurfaceType", R.string.surface_type, R.string.paved, R.string.unpaved, new int[]{R.color.gcm_system_static_black, R.color.red_20_static}, null, new int[]{R.color.red_20_static, R.color.red_20_static}, R.color.red_20_static, R.layout.surface_type_map_legend, 0.0f, 0.0f, 0.0f, 3616, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // ps.b1
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof z);
        }

        @Override // ps.b1
        public final int hashCode() {
            return -1766397579;
        }

        public final String toString() {
            return "SurfaceType";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    static {
        new b(null);
    }

    public /* synthetic */ b1(String str, int i14, int i15, int i16, int[] iArr, int[] iArr2, int[] iArr3, int i17, int i18, float f14, float f15, float f16, int i19, p005kotlin.jvm.internal.j jVar) {
        this(str, (i19 & 2) != 0 ? -1 : i14, (i19 & 4) != 0 ? -1 : i15, (i19 & 8) != 0 ? -1 : i16, (i19 & 16) != 0 ? new int[0] : iArr, (i19 & 32) != 0 ? new int[0] : iArr2, (i19 & 64) != 0 ? new int[0] : iArr3, (i19 & 128) != 0 ? -1 : i17, (i19 & 256) != 0 ? -1 : i18, (i19 & 512) != 0 ? 10.0f : f14, (i19 & 1024) != 0 ? 15.0f : f15, (i19 & 2048) != 0 ? 7.0f : f16, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return p005kotlin.jvm.internal.s.g(this.f139689a, b1Var.f139689a) && this.f139690b == b1Var.f139690b && this.f139691c == b1Var.f139691c && this.f139692d == b1Var.f139692d && Arrays.equals(this.f139693e, b1Var.f139693e) && Arrays.equals(this.f139694f, b1Var.f139694f) && Arrays.equals(this.f139695g, b1Var.f139695g) && this.f139696h == b1Var.f139696h && this.f139697i == b1Var.f139697i && this.f139698j == b1Var.f139698j && this.f139699k == b1Var.f139699k && this.f139700l == b1Var.f139700l;
    }

    public int hashCode() {
        return Float.hashCode(this.f139700l) + q6.f.d(this.f139699k, q6.f.d(this.f139698j, (((((Arrays.hashCode(this.f139695g) + ((Arrays.hashCode(this.f139694f) + ((Arrays.hashCode(this.f139693e) + (((((((this.f139689a.hashCode() * 31) + this.f139690b) * 31) + this.f139691c) * 31) + this.f139692d) * 31)) * 31)) * 31)) * 31) + this.f139696h) * 31) + this.f139697i) * 31, 31), 31);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u0014\u0010\u0011\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007R\u0014\u0010\u0013\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0007R\u0014\u0010\u0015\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0007R\u0014\u0010\u0017\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0007R\u0014\u0010\u0018\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0007R\u0014\u0010\u0019\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0007R\u0014\u0010\u001a\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0007R\u0014\u0010\u001b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0007R\u0014\u0010\u001c\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0007R\u0014\u0010\u001d\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0007R\u0014\u0010\u001e\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0007R\u0014\u0010\u001f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0007R\u0014\u0010!\u001a\u00020 8\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020 8\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010$\u001a\u00020 8\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010%\u001a\u00020 8\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\"R\u0014\u0010&\u001a\u00020 8\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\"¨\u0006'"}, d2 = {"Lps/b1$b;", "", "Lps/b1;", "<init>", "()V", "", "KEY_NONE", "Ljava/lang/String;", "KEY_ELEVATION", "KEY_SPEED", "KEY_PACE", "KEY_GRADE_ADJUSTED_PACE", "KEY_HEART_RATE", "KEY_POWER", "KEY_RUN_POWER", "KEY_FLOW", "KEY_GRIT", "KEY_RUN_WALK", "KEY_RUN_LIFT", "KEY_CYCLING_RUN_LIFT", "KEY_ASCENT_DESCENT", "KEY_CYCLING_ASCENT_DESCENT", "KEY_EBIKE_ASSIST_MODE_3", "KEY_EBIKE_ASSIST_MODE_4", "KEY_EBIKE_ASSIST_MODE_5", "KEY_EBIKE_ASSIST_MODE_6", "KEY_EBIKE_ASSIST_MODE_7", "KEY_ELEVATION_WITH_NO_VALUE_SPLITS", "KEY_SPEED_WITH_NO_VALUE_SPLITS", "KEY_HEART_RATE_WITH_NO_VALUE_SPLITS", "KEY_SURFACE_TYPE", "KEY_HEATMAP", "", "SMALL_POLYLINE_WIDTH", "F", "POLYLINE_WIDTH", "DASHED_POLYLINE_WIDTH", "LARGE_POLYLINE_WIDTH", "POLYLINE_BORDER_WIDTH", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lps/b1$r;", "Lps/b1;", "", "lineWidth", "<init>", "(F)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class r extends b1 {
        public static final Parcelable.Creator<r> CREATOR = new a();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final float f139727m;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<r> {
            @Override // android.os.Parcelable.Creator
            public final r createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new r(parcel.readFloat());
            }

            @Override // android.os.Parcelable.Creator
            public final r[] newArray(int i14) {
                return new r[i14];
            }
        }

        public r(float f14) {
            super("None", R.string.lbl_none, 0, 0, null, null, null, R.color.gcm_map_track_path, 0, f14, 0.0f, 0.0f, 2172, null);
            this.f139727m = f14;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeFloat(this.f139727m);
        }

        public r() {
            this(0.0f, 1, null);
        }

        public /* synthetic */ r(float f14, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? 10.0f : f14);
        }
    }

    private b1(String str, int i14, int i15, int i16, int[] iArr, int[] iArr2, int[] iArr3, int i17, int i18, float f14, float f15, float f16) {
        this.f139689a = str;
        this.f139690b = i14;
        this.f139691c = i15;
        this.f139692d = i16;
        this.f139693e = iArr;
        this.f139694f = iArr2;
        this.f139695g = iArr3;
        this.f139696h = i17;
        this.f139697i = i18;
        this.f139698j = f14;
        this.f139699k = f15;
        this.f139700l = f16;
    }

    public /* synthetic */ b1(String str, int i14, int i15, int i16, int[] iArr, int[] iArr2, int[] iArr3, int i17, int i18, float f14, float f15, float f16, p005kotlin.jvm.internal.j jVar) {
        this(str, i14, i15, i16, iArr, iArr2, iArr3, i17, i18, f14, f15, f16);
    }
}
