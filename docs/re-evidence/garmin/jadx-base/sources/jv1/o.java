package jv1;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u000b\f\r\u000e\u000fB-\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n\u0082\u0001\u0005\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Ljv1/o;", "", "", Action.KEY_ATTRIBUTE, "", "labelResId", "", "minElevation", "maxElevation", "<init>", "(Ljava/lang/String;IDD)V", "b", "d", "c", JWKParameterNames.RSA_EXPONENT, "a", "Ljv1/o$a;", "Ljv1/o$b;", "Ljv1/o$c;", "Ljv1/o$d;", "Ljv1/o$e;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f101105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f101106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f101107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f101108d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljv1/o$a;", "Ljv1/o;", "<init>", "()V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends o {
        public a() {
            super(null, R.string.lbl_course_profile_custom_elevation, Double.NaN, Double.NaN, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljv1/o$b;", "Ljv1/o;", "", "minElevation", "maxElevation", "<init>", "(DD)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends o {
        public b(double d14, double d15) {
            super("FLAT", R.string.lbl_course_profile_flat, d14, d15, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljv1/o$c;", "Ljv1/o;", "", "minElevation", "maxElevation", "<init>", "(DD)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends o {
        public c(double d14, double d15) {
            super("HILLY", R.string.lbl_course_profile_hilly, d14, d15, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljv1/o$d;", "Ljv1/o;", "", "minElevation", "maxElevation", "<init>", "(DD)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends o {
        public d(double d14, double d15) {
            super("SOMEWHAT_HILLY", R.string.lbl_course_profile_somewhat_hilly, d14, d15, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljv1/o$e;", "Ljv1/o;", "", "minElevation", "maxElevation", "<init>", "(DD)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends o {
        public e(double d14, double d15) {
            super("VERY_HILLY", R.string.lbl_course_profile_very_hilly, d14, d15, null);
        }
    }

    private o(String str, int i14, double d14, double d15) {
        this.f101105a = str;
        this.f101106b = i14;
        this.f101107c = d14;
        this.f101108d = d15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f101106b == oVar.f101106b && Double.compare(this.f101107c, oVar.f101107c) == 0 && Double.compare(this.f101108d, oVar.f101108d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f101108d) + org.apache.commons.lang3.e.b(this.f101106b * 31, 31, this.f101107c);
    }

    public /* synthetic */ o(String str, int i14, double d14, double d15, p005kotlin.jvm.internal.j jVar) {
        this(str, i14, d14, d15);
    }
}
