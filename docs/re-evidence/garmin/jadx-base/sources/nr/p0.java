package nr;

import android.os.Parcelable;
import c22.c3;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.gncs.NotificationConstants;
import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000eB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lnr/p0;", "", "", "name", "date", "", "iconResId", "", "Lnr/l0;", "stats", "Lnr/p0$a;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lnr/p0$a;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f127282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f127283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f127284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<l0> f127285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f127286e;

    public p0(String str, String str2, Integer num, List<l0> list, a aVar) {
        str.getClass();
        str2.getClass();
        list.getClass();
        aVar.getClass();
        this.f127282a = str;
        this.f127283b = str2;
        this.f127284c = num;
        this.f127285d = list;
        this.f127286e = aVar;
    }

    public static p0 a(p0 p0Var, a aVar) {
        String str = p0Var.f127282a;
        String str2 = p0Var.f127283b;
        Integer num = p0Var.f127284c;
        List<l0> list = p0Var.f127285d;
        p0Var.getClass();
        aVar.getClass();
        return new p0(str, str2, num, list, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return this.f127282a.equals(p0Var.f127282a) && this.f127283b.equals(p0Var.f127283b) && p005kotlin.jvm.internal.s.g(this.f127284c, p0Var.f127284c) && this.f127285d.equals(p0Var.f127285d) && this.f127286e.equals(p0Var.f127286e);
    }

    public final int hashCode() {
        int iJ = wr.g.j(this.f127282a.hashCode() * 31, 31, this.f127283b);
        Integer num = this.f127284c;
        return this.f127286e.hashCode() + lc.u0.b((iJ + (num == null ? 0 : num.hashCode())) * 31, 31, this.f127285d);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("ShareTemplateData(name=", this.f127282a, ", date=", this.f127283b, ", iconResId=");
        sbI.append(this.f127284c);
        sbI.append(", stats=");
        sbI.append(this.f127285d);
        sbI.append(", type=");
        sbI.append(this.f127286e);
        sbI.append(")");
        return sbI.toString();
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0007\b\t\n\u000b\f\r\u000e\u000fB\u001f\b\u0004\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\t\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lnr/p0$a;", "", "", "nameResId", "carouselImageResId", "<init>", "(ILjava/lang/Integer;)V", "a", "h", "d", JWKParameterNames.RSA_EXPONENT, "g", "f", IntegerTokenConverter.CONVERTER_KEY, "b", "c", "Lnr/p0$a$a;", "Lnr/p0$a$b;", "Lnr/p0$a$c;", "Lnr/p0$a$d;", "Lnr/p0$a$e;", "Lnr/p0$a$f;", "Lnr/p0$a$g;", "Lnr/p0$a$h;", "Lnr/p0$a$i;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: nr.p0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnr/p0$a$a;", "Lnr/p0$a;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C2447a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2447a f127287a = new C2447a();

            private C2447a() {
                super(R.string.lbl_classic, Integer.valueOf(R.drawable.img_template_classic), null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C2447a);
            }

            public final int hashCode() {
                return -1149237947;
            }

            public final String toString() {
                return "Classic";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnr/p0$a$b;", "Lnr/p0$a;", "", "photoKey", "<init>", "(Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f127288a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(String str) {
                super(R.string.social_group_upload_a_photo, null, 0 == true ? 1 : 0);
                str.getClass();
                this.f127288a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && p005kotlin.jvm.internal.s.g(this.f127288a, ((b) obj).f127288a);
            }

            public final int hashCode() {
                return this.f127288a.hashCode();
            }

            public final String toString() {
                return am.j.m("CreateCustomFromPhoto(photoKey=", this.f127288a, ")");
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnr/p0$a$e;", "Lnr/p0$a;", "Lps/s0;", "exerciseSets", "<init>", "(Lps/s0;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class e extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ps.s0 f127298a;

            static {
                Parcelable.Creator<ps.s0> creator = ps.s0.CREATOR;
            }

            public e(ps.s0 s0Var) {
                super(R.string.lbl_muscle_map, Integer.valueOf(R.drawable.img_template_muscle_map), null);
                this.f127298a = s0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && p005kotlin.jvm.internal.s.g(this.f127298a, ((e) obj).f127298a);
            }

            public final int hashCode() {
                ps.s0 s0Var = this.f127298a;
                if (s0Var == null) {
                    return 0;
                }
                return s0Var.hashCode();
            }

            public final String toString() {
                return "MuscleMap(exerciseSets=" + this.f127298a + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnr/p0$a$g;", "Lnr/p0$a;", "Ljr/t;", "styleType", "<init>", "(Ljr/t;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class g extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final jr.t f127300a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public g(jr.t tVar) {
                super(R.string.lbl_stylish, null, 0 == true ? 1 : 0);
                tVar.getClass();
                this.f127300a = tVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && this.f127300a == ((g) obj).f127300a;
            }

            public final int hashCode() {
                return this.f127300a.hashCode();
            }

            public final String toString() {
                return "Stylish(styleType=" + this.f127300a + ")";
            }
        }

        public /* synthetic */ a(int i14, Integer num, p005kotlin.jvm.internal.j jVar) {
            this(i14, num);
        }

        private a(int i14, Integer num) {
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnr/p0$a$h;", "Lnr/p0$a;", "", "isLight", "<init>", "(Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class h extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f127301a;

            /* JADX WARN: Multi-variable type inference failed */
            public h(boolean z14) {
                super(R.string.lbl_transparent_background, null, 0 == true ? 1 : 0);
                this.f127301a = z14;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && this.f127301a == ((h) obj).f127301a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f127301a);
            }

            public final String toString() {
                return com.airbnb.lottie.animation.keyframe.a.g("TransparentBackground(isLight=", ")", this.f127301a);
            }

            public h() {
                this(false, 1, null);
            }

            public /* synthetic */ h(boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
                this((i14 & 1) != 0 ? true : z14);
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lnr/p0$a$i;", "Lnr/p0$a;", "", "Lcom/google/android/gms/maps/model/LatLng;", "polylines", "", "isLight", "<init>", "(Ljava/util/List;Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class i extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List<List<LatLng>> f127302a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f127303b;

            public /* synthetic */ i(List list, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
                this((i14 & 1) != 0 ? null : list, (i14 & 2) != 0 ? true : z14);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof i)) {
                    return false;
                }
                i iVar = (i) obj;
                return p005kotlin.jvm.internal.s.g(this.f127302a, iVar.f127302a) && this.f127303b == iVar.f127303b;
            }

            public final int hashCode() {
                List<List<LatLng>> list = this.f127302a;
                return Boolean.hashCode(this.f127303b) + ((list == null ? 0 : list.hashCode()) * 31);
            }

            public final String toString() {
                return "TransparentBackgroundWithPolyLine(polylines=" + this.f127302a + ", isLight=" + this.f127303b + ")";
            }

            /* JADX WARN: Multi-variable type inference failed */
            public i(List<? extends List<LatLng>> list, boolean z14) {
                super(R.string.lbl_route, null, 0 == true ? 1 : 0);
                this.f127302a = list;
                this.f127303b = z14;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public i() {
                this(null, false, 3, 0 == true ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lnr/p0$a$f;", "Lnr/p0$a;", "", "Lcom/google/android/gms/maps/model/LatLng;", "polylines", "<init>", "(Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class f extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List<List<LatLng>> f127299a;

            /* JADX WARN: Multi-variable type inference failed */
            public f(List<? extends List<LatLng>> list) {
                super(R.string.lbl_route, Integer.valueOf(R.drawable.img_template_route), null);
                this.f127299a = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && p005kotlin.jvm.internal.s.g(this.f127299a, ((f) obj).f127299a);
            }

            public final int hashCode() {
                List<List<LatLng>> list = this.f127299a;
                if (list == null) {
                    return 0;
                }
                return list.hashCode();
            }

            public final String toString() {
                return tn.k.h("Route(polylines=", ")", this.f127299a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public f() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public /* synthetic */ f(List list, int i14, p005kotlin.jvm.internal.j jVar) {
                this((i14 & 1) != 0 ? null : list);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lnr/p0$a$d;", "Lnr/p0$a;", "", "Lcom/garmin/android/library/mapsdkadapter/q;", "polylines", "Lcom/garmin/android/library/mapsdkadapter/p;", "markers", "", "hasHeatmap", "Lps/i;", "heatmapPoints", "<init>", "(Ljava/util/List;Ljava/util/List;ZLjava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class d extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List<com.garmin.android.library.mapsdkadapter.q> f127294a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final List<com.garmin.android.library.mapsdkadapter.p> f127295b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f127296c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final List<ps.i> f127297d;

            public d(List<com.garmin.android.library.mapsdkadapter.q> list, List<com.garmin.android.library.mapsdkadapter.p> list2, boolean z14, List<ps.i> list3) {
                super(R.string.lbl_map, Integer.valueOf(R.drawable.img_template_map), null);
                this.f127294a = list;
                this.f127295b = list2;
                this.f127296c = z14;
                this.f127297d = list3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return p005kotlin.jvm.internal.s.g(this.f127294a, dVar.f127294a) && p005kotlin.jvm.internal.s.g(this.f127295b, dVar.f127295b) && this.f127296c == dVar.f127296c && p005kotlin.jvm.internal.s.g(this.f127297d, dVar.f127297d);
            }

            public final int hashCode() {
                List<com.garmin.android.library.mapsdkadapter.q> list = this.f127294a;
                int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
                List<com.garmin.android.library.mapsdkadapter.p> list2 = this.f127295b;
                int iG = q6.f.g((iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.f127296c);
                List<ps.i> list3 = this.f127297d;
                return iG + (list3 != null ? list3.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sbK = f3.k("Map(polylines=", ", markers=", ", hasHeatmap=", this.f127294a, this.f127295b);
                sbK.append(this.f127296c);
                sbK.append(", heatmapPoints=");
                sbK.append(this.f127297d);
                sbK.append(")");
                return sbK.toString();
            }

            public /* synthetic */ d(List list, List list2, boolean z14, List list3, int i14, p005kotlin.jvm.internal.j jVar) {
                this(list, list2, (i14 & 4) != 0 ? false : z14, (i14 & 8) != 0 ? null : list3);
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lnr/p0$a$c;", "Lnr/p0$a;", "", FirebaseAnalytics.Param.LOCATION, "Lc22/c3;", "activityTypeResId", "", "Lcom/google/android/gms/maps/model/LatLng;", "polylines", "deviceName", "Ljr/h;", "customType", "<init>", "(Ljava/lang/String;Lc22/c3;Ljava/util/List;Ljava/lang/String;Ljr/h;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f127289a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final c3 f127290b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final List<List<LatLng>> f127291c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f127292d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final jr.h f127293e;

            public /* synthetic */ c(String str, c3 c3Var, List list, String str2, jr.h hVar, int i14, p005kotlin.jvm.internal.j jVar) {
                this((i14 & 1) != 0 ? null : str, c3Var, (i14 & 4) != 0 ? null : list, (i14 & 8) != 0 ? null : str2, hVar);
            }

            public static c a(c cVar, jr.h hVar) {
                String str = cVar.f127289a;
                c3 c3Var = cVar.f127290b;
                List<List<LatLng>> list = cVar.f127291c;
                String str2 = cVar.f127292d;
                c3Var.getClass();
                return new c(str, c3Var, list, str2, hVar);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return p005kotlin.jvm.internal.s.g(this.f127289a, cVar.f127289a) && p005kotlin.jvm.internal.s.g(this.f127290b, cVar.f127290b) && p005kotlin.jvm.internal.s.g(this.f127291c, cVar.f127291c) && p005kotlin.jvm.internal.s.g(this.f127292d, cVar.f127292d) && p005kotlin.jvm.internal.s.g(this.f127293e, cVar.f127293e);
            }

            public final int hashCode() {
                String str = this.f127289a;
                int iHashCode = (this.f127290b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
                List<List<LatLng>> list = this.f127291c;
                int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
                String str2 = this.f127292d;
                return this.f127293e.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
            }

            public final String toString() {
                StringBuilder sb3 = new StringBuilder("Custom(location=");
                sb3.append(this.f127289a);
                sb3.append(", activityTypeResId=");
                sb3.append(this.f127290b);
                sb3.append(", polylines=");
                o2.c.n(", deviceName=", this.f127292d, ", customType=", sb3, this.f127291c);
                sb3.append(this.f127293e);
                sb3.append(")");
                return sb3.toString();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(String str, c3 c3Var, List<? extends List<LatLng>> list, String str2, jr.h hVar) {
                super(R.string.lbl_custom, null, 0 == true ? 1 : 0);
                c3Var.getClass();
                hVar.getClass();
                this.f127289a = str;
                this.f127290b = c3Var;
                this.f127291c = list;
                this.f127292d = str2;
                this.f127293e = hVar;
            }
        }
    }
}
