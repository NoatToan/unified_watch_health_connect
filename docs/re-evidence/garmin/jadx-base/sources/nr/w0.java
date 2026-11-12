package nr;

import android.content.Intent;
import android.os.Parcelable;
import android.util.SparseArray;
import aq.n2;
import aq.o3;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.garmin.android.apps.connectmobile.repcounting.model.ExerciseSetsDTO;
import com.google.android.exoplayer2.util.MimeTypes;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.e5;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000â\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\bU\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:S\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0081\u0001WXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u007f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001\u008a\u0001\u008b\u0001\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001\u009c\u0001\u009d\u0001\u009e\u0001\u009f\u0001 \u0001¡\u0001¢\u0001£\u0001¤\u0001¥\u0001¦\u0001§\u0001¨\u0001©\u0001ª\u0001«\u0001¨\u0006¬\u0001"}, d2 = {"Lnr/w0;", "", "<init>", "()V", "a", "d", "f", "p1", "i0", "v0", "h0", "j1", "n1", "o1", "b2", "h", "c0", "c1", JWKParameterNames.OCT_KEY_VALUE, "e2", "m", "r0", JWKParameterNames.RSA_MODULUS, "o", "p", "k0", "o0", "n0", "u0", "e1", "y0", "z0", "x0", "f1", "h1", "p0", "k1", "l1", "b0", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "s0", "d1", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "m0", "i1", "g0", "a0", "m1", "v", "e0", "b", "y1", "w1", "s1", "x1", "u", "t0", "b1", "j", "x", "d2", "v1", "g", "d0", "q1", "z1", "a2", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "q0", "t1", "l0", "w", "l", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "a1", "z", "j0", "f0", "u1", "r1", "g1", IntegerTokenConverter.CONVERTER_KEY, "c2", "w0", JWKParameterNames.RSA_EXPONENT, "s", "c", "Lnr/w0$a;", "Lnr/w0$b;", "Lnr/w0$c;", "Lnr/w0$d;", "Lnr/w0$e;", "Lnr/w0$f;", "Lnr/w0$g;", "Lnr/w0$h;", "Lnr/w0$i;", "Lnr/w0$j;", "Lnr/w0$k;", "Lnr/w0$l;", "Lnr/w0$m;", "Lnr/x0;", "Lnr/y0;", "Lnr/w0$n;", "Lnr/w0$o;", "Lnr/w0$p;", "Lnr/w0$q;", "Lnr/w0$r;", "Lnr/w0$s;", "Lnr/w0$t;", "Lnr/w0$u;", "Lnr/w0$v;", "Lnr/w0$w;", "Lnr/w0$x;", "Lnr/w0$y;", "Lnr/w0$z;", "Lnr/w0$a0;", "Lnr/w0$b0;", "Lnr/w0$c0;", "Lnr/w0$d0;", "Lnr/w0$e0;", "Lnr/w0$f0;", "Lnr/w0$g0;", "Lnr/w0$h0;", "Lnr/w0$i0;", "Lnr/w0$j0;", "Lnr/w0$k0;", "Lnr/w0$l0;", "Lnr/w0$m0;", "Lnr/w0$n0;", "Lnr/w0$o0;", "Lnr/w0$p0;", "Lnr/w0$q0;", "Lnr/w0$r0;", "Lnr/w0$s0;", "Lnr/w0$t0;", "Lnr/w0$u0;", "Lnr/w0$v0;", "Lnr/w0$w0;", "Lnr/w0$x0;", "Lnr/w0$y0;", "Lnr/w0$z0;", "Lnr/w0$a1;", "Lnr/w0$b1;", "Lnr/w0$c1;", "Lnr/w0$d1;", "Lnr/w0$e1;", "Lnr/w0$f1;", "Lnr/w0$g1;", "Lnr/w0$h1;", "Lnr/w0$i1;", "Lnr/w0$j1;", "Lnr/w0$k1;", "Lnr/w0$l1;", "Lnr/w0$m1;", "Lnr/w0$n1;", "Lnr/w0$o1;", "Lnr/w0$p1;", "Lnr/w0$q1;", "Lnr/w0$r1;", "Lnr/w0$s1;", "Lnr/w0$t1;", "Lnr/w0$u1;", "Lnr/w0$v1;", "Lnr/w0$w1;", "Lnr/w0$x1;", "Lnr/w0$y1;", "Lnr/w0$z1;", "Lnr/w0$a2;", "Lnr/w0$b2;", "Lnr/w0$c2;", "Lnr/w0$d2;", "Lnr/w0$e2;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class w0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnr/w0$a;", "Lnr/w0;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f127397a = new a();

        private a() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -2015880471;
        }

        public final String toString() {
            return "AccountSuspended";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lnr/w0$a0;", "Lnr/w0;", "", "eventID", "", "shareableEventUUID", "<init>", "(Ljava/lang/Long;Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a0 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Long f127398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f127399b;

        public a0(Long l14, String str) {
            super(null);
            this.f127398a = l14;
            this.f127399b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a0)) {
                return false;
            }
            a0 a0Var = (a0) obj;
            return p005kotlin.jvm.internal.s.g(this.f127398a, a0Var.f127398a) && p005kotlin.jvm.internal.s.g(this.f127399b, a0Var.f127399b);
        }

        public final int hashCode() {
            Long l14 = this.f127398a;
            int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
            String str = this.f127399b;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return "NavigateToEventDetails(eventID=" + this.f127398a + ", shareableEventUUID=" + this.f127399b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnr/w0$a1;", "Lnr/w0;", "", "activityId", "<init>", "(J)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a1 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f127400a;

        public a1(long j8) {
            super(null);
            this.f127400a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a1) && this.f127400a == ((a1) obj).f127400a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f127400a);
        }

        public final String toString() {
            return androidx.room.a0.f(this.f127400a, "NavigateToShotViewApp(activityId=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnr/w0$a2;", "Lnr/w0;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a2 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a2 f127401a = new a2();

        private a2() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a2);
        }

        public final int hashCode() {
            return -1855420081;
        }

        public final String toString() {
            return "ShowUpdatePrivacyDialog";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lnr/w0$b;", "Lnr/w0;", "Lam/x0;", "activityType", "", "activityId", "<init>", "(Lam/x0;J)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final am.x0 f127402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f127403b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(am.x0 x0Var, long j8) {
            super(null);
            x0Var.getClass();
            this.f127402a = x0Var;
            this.f127403b = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f127402a == bVar.f127402a && this.f127403b == bVar.f127403b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f127403b) + (this.f127402a.hashCode() * 31);
        }

        public final String toString() {
            return "ActivityTypeConverted(activityType=" + this.f127402a + ", activityId=" + this.f127403b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lnr/w0$b1;", "Lnr/w0;", "", "deviceId", "startTime", "endTime", "rideTimeGained", "<init>", "(JJJJ)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b1 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f127409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f127410b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f127411c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f127412d;

        public b1(long j8, long j14, long j15, long j16) {
            super(null);
            this.f127409a = j8;
            this.f127410b = j14;
            this.f127411c = j15;
            this.f127412d = j16;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b1)) {
                return false;
            }
            b1 b1Var = (b1) obj;
            return this.f127409a == b1Var.f127409a && this.f127410b == b1Var.f127410b && this.f127411c == b1Var.f127411c && this.f127412d == b1Var.f127412d;
        }

        public final int hashCode() {
            return Long.hashCode(this.f127412d) + q6.f.e(q6.f.e(Long.hashCode(this.f127409a) * 31, 31, this.f127410b), 31, this.f127411c);
        }

        public final String toString() {
            StringBuilder sbK = ds.e0.k(this.f127409a, "NavigateToSolarChart(deviceId=", ", startTime=");
            sbK.append(this.f127410b);
            j20.x.j(this.f127411c, ", endTime=", ", rideTimeGained=", sbK);
            return am.j.i(this.f127412d, ")", sbK);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnr/w0$c;", "Lnr/w0;", "", "fileName", "<init>", "(Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f127415a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(null);
            str.getClass();
            this.f127415a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p005kotlin.jvm.internal.s.g(this.f127415a, ((c) obj).f127415a);
        }

        public final int hashCode() {
            return this.f127415a.hashCode();
        }

        public final String toString() {
            return am.j.m("CopyToClipboard(fileName=", this.f127415a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnr/w0$c2;", "Lnr/w0;", "Lnr/a0;", "step", "<init>", "(Lnr/a0;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c2 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final nr.a0 f127423a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c2(nr.a0 a0Var) {
            super(null);
            a0Var.getClass();
            this.f127423a = a0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c2) && this.f127423a == ((c2) obj).f127423a;
        }

        public final int hashCode() {
            return this.f127423a.hashCode();
        }

        public final String toString() {
            return "UnlinkTrail(step=" + this.f127423a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnr/w0$d0;", "Lnr/w0;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d0 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d0 f127427a = new d0();

        private d0() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d0);
        }

        public final int hashCode() {
            return 1986184950;
        }

        public final String toString() {
            return "NavigateToGear";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnr/w0$d2;", "Lnr/w0;", "", "title", "<init>", "(Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d2 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f127432a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d2(String str) {
            super(null);
            str.getClass();
            this.f127432a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d2) && p005kotlin.jvm.internal.s.g(this.f127432a, ((d2) obj).f127432a);
        }

        public final int hashCode() {
            return this.f127432a.hashCode();
        }

        public final String toString() {
            return am.j.m("UpdateActivityTitle(title=", this.f127432a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnr/w0$e;", "Lnr/w0;", "", "fileName", "<init>", "(Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f127433a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(null);
            str.getClass();
            this.f127433a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && p005kotlin.jvm.internal.s.g(this.f127433a, ((e) obj).f127433a);
        }

        public final int hashCode() {
            return this.f127433a.hashCode();
        }

        public final String toString() {
            return am.j.m("DownloadImage(fileName=", this.f127433a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnr/w0$e0;", "Lnr/w0;", "Laq/n2$b;", "helpType", "<init>", "(Laq/n2$b;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e0 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n2.b f127434a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(n2.b bVar) {
            super(null);
            bVar.getClass();
            this.f127434a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e0) && this.f127434a == ((e0) obj).f127434a;
        }

        public final int hashCode() {
            return this.f127434a.hashCode();
        }

        public final String toString() {
            return "NavigateToGritFlowHelp(helpType=" + this.f127434a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnr/w0$e1;", "Lnr/w0;", "Lps/p;", "activitySplits", "<init>", "(Lps/p;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e1 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ps.p f127435a;

        static {
            Parcelable.Creator<ps.p> creator = ps.p.CREATOR;
        }

        public e1(ps.p pVar) {
            super(null);
            this.f127435a = pVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e1) && p005kotlin.jvm.internal.s.g(this.f127435a, ((e1) obj).f127435a);
        }

        public final int hashCode() {
            ps.p pVar = this.f127435a;
            if (pVar == null) {
                return 0;
            }
            return pVar.hashCode();
        }

        public final String toString() {
            return "NavigateToTimingGates(activitySplits=" + this.f127435a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lnr/w0$e2;", "Lnr/w0;", "", "activityId", "Lb63/o;", "onOrBeforeLocalDate", "Lam/x0;", "activityType", "<init>", "(JLb63/o;Lam/x0;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e2 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f127436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b63.o f127437b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final am.x0 f127438c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e2(long j8, b63.o oVar, am.x0 x0Var) {
            super(null);
            oVar.getClass();
            x0Var.getClass();
            this.f127436a = j8;
            this.f127437b = oVar;
            this.f127438c = x0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e2)) {
                return false;
            }
            e2 e2Var = (e2) obj;
            return this.f127436a == e2Var.f127436a && p005kotlin.jvm.internal.s.g(this.f127437b, e2Var.f127437b) && this.f127438c == e2Var.f127438c;
        }

        public final int hashCode() {
            return this.f127438c.hashCode() + n23.j.a(this.f127437b.f16206a, Long.hashCode(this.f127436a) * 31, 31);
        }

        public final String toString() {
            return "V2NavigateToManageGear(activityId=" + this.f127436a + ", onOrBeforeLocalDate=" + this.f127437b + ", activityType=" + this.f127438c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lnr/w0$f;", "Lnr/w0;", "", "activityChanged", "activityDeleted", "", "activityId", "<init>", "(ZZJ)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f127439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f127440b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f127441c;

        public f(boolean z14, boolean z15, long j8) {
            super(null);
            this.f127439a = z14;
            this.f127440b = z15;
            this.f127441c = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f127439a == fVar.f127439a && this.f127440b == fVar.f127440b && this.f127441c == fVar.f127441c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f127441c) + q6.f.g(Boolean.hashCode(this.f127439a) * 31, 31, this.f127440b);
        }

        public final String toString() {
            return am.j.i(this.f127441c, ")", com.airbnb.lottie.animation.keyframe.a.m("ExitActivity(activityChanged=", ", activityDeleted=", ", activityId=", this.f127439a, this.f127440b));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnr/w0$f0;", "Lnr/w0;", "", "socialGroupRideUUID", "<init>", "(Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f0 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f127442a;

        public f0(String str) {
            super(null);
            this.f127442a = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF127442a() {
            return this.f127442a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f0) && p005kotlin.jvm.internal.s.g(this.f127442a, ((f0) obj).f127442a);
        }

        public final int hashCode() {
            String str = this.f127442a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return am.j.m("NavigateToGroupRidePrivacy(socialGroupRideUUID=", this.f127442a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lnr/w0$f1;", "Lnr/w0;", "", "Lps/w0;", "jumpMetrics", "<init>", "(Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f1 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<ps.w0> f127443a;

        public f1(List<ps.w0> list) {
            super(null);
            this.f127443a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f1) && p005kotlin.jvm.internal.s.g(this.f127443a, ((f1) obj).f127443a);
        }

        public final int hashCode() {
            List<ps.w0> list = this.f127443a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final String toString() {
            return tn.k.h("NavigateToTotalJumps(jumpMetrics=", ")", this.f127443a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnr/w0$g;", "Lnr/w0;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f127444a = new g();

        private g() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1353420681;
        }

        public final String toString() {
            return "HideNoDataState";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnr/w0$h;", "Lnr/w0;", "Lnr/h0;", "uploadError", "<init>", "(Lnr/h0;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final nr.h0 f127455a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(nr.h0 h0Var) {
            super(null);
            h0Var.getClass();
            this.f127455a = h0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f127455a == ((h) obj).f127455a;
        }

        public final int hashCode() {
            return this.f127455a.hashCode();
        }

        public final String toString() {
            return "ImageUpload(uploadError=" + this.f127455a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lnr/w0$h1;", "Lnr/w0;", "Lim/d0;", "aerobicEffect", "anaerobicEffect", "", "primaryBenefit", "<init>", "(Lim/d0;Lim/d0;Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h1 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final im.d0 f127458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final im.d0 f127459b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f127460c;

        public h1(im.d0 d0Var, im.d0 d0Var2, String str) {
            super(null);
            this.f127458a = d0Var;
            this.f127459b = d0Var2;
            this.f127460c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h1)) {
                return false;
            }
            h1 h1Var = (h1) obj;
            return p005kotlin.jvm.internal.s.g(this.f127458a, h1Var.f127458a) && p005kotlin.jvm.internal.s.g(this.f127459b, h1Var.f127459b) && p005kotlin.jvm.internal.s.g(this.f127460c, h1Var.f127460c);
        }

        public final int hashCode() {
            im.d0 d0Var = this.f127458a;
            int iHashCode = (d0Var == null ? 0 : d0Var.hashCode()) * 31;
            im.d0 d0Var2 = this.f127459b;
            int iHashCode2 = (iHashCode + (d0Var2 == null ? 0 : d0Var2.hashCode())) * 31;
            String str = this.f127460c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("NavigateToTrainingEffect(aerobicEffect=");
            sb3.append(this.f127458a);
            sb3.append(", anaerobicEffect=");
            sb3.append(this.f127459b);
            sb3.append(", primaryBenefit=");
            return am.j.o(this.f127460c, ")", sb3);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnr/w0$i;", "Lnr/w0;", "Lnr/a0;", "step", "<init>", "(Lnr/a0;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class i extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final nr.a0 f127461a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(nr.a0 a0Var) {
            super(null);
            a0Var.getClass();
            this.f127461a = a0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.f127461a == ((i) obj).f127461a;
        }

        public final int hashCode() {
            return this.f127461a.hashCode();
        }

        public final String toString() {
            return "LinkTrail(step=" + this.f127461a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lnr/w0$i1;", "Lnr/w0;", "Laq/o3$b;", "helpMode", "", "hasPrimaryBenefit", "<init>", "(Laq/o3$b;Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class i1 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o3.b f127463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f127464b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i1(o3.b bVar, boolean z14) {
            super(null);
            bVar.getClass();
            this.f127463a = bVar;
            this.f127464b = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i1)) {
                return false;
            }
            i1 i1Var = (i1) obj;
            return this.f127463a == i1Var.f127463a && this.f127464b == i1Var.f127464b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f127464b) + (this.f127463a.hashCode() * 31);
        }

        public final String toString() {
            return "NavigateToTrainingEffectHelp(helpMode=" + this.f127463a + ", hasPrimaryBenefit=" + this.f127464b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnr/w0$j;", "Lnr/w0;", "Lnr/h;", "startInfo", "<init>", "(Lnr/h;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class j extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final nr.h f127465a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(nr.h hVar) {
            super(null);
            hVar.getClass();
            this.f127465a = hVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && p005kotlin.jvm.internal.s.g(this.f127465a, ((j) obj).f127465a);
        }

        public final int hashCode() {
            return this.f127465a.hashCode();
        }

        public final String toString() {
            return "NavigateToActivityDetails(startInfo=" + this.f127465a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnr/w0$j0;", "Lnr/w0;", "Lhb2/g$a;", "app", "<init>", "(Lhb2/g$a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class j0 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hb2.g.a f127466a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(hb2.g.a aVar) {
            super(null);
            aVar.getClass();
            this.f127466a = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final hb2.g.a getF127466a() {
            return this.f127466a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j0) && this.f127466a == ((j0) obj).f127466a;
        }

        public final int hashCode() {
            return this.f127466a.hashCode();
        }

        public final String toString() {
            return "NavigateToInstallApp(app=" + this.f127466a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnr/w0$k;", "Lnr/w0;", "Lam/g;", "activityListMode", "<init>", "(Lam/g;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class k extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final am.g f127470a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(am.g gVar) {
            super(null);
            gVar.getClass();
            this.f127470a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.f127470a == ((k) obj).f127470a;
        }

        public final int hashCode() {
            return this.f127470a.hashCode();
        }

        public final String toString() {
            return "NavigateToActivityList(activityListMode=" + this.f127470a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnr/w0$k0;", "Lnr/w0;", "", "activityId", "<init>", "(J)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class k0 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f127471a;

        public k0(long j8) {
            super(null);
            this.f127471a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k0) && this.f127471a == ((k0) obj).f127471a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f127471a);
        }

        public final String toString() {
            return androidx.room.a0.f(this.f127471a, "NavigateToLikePage(activityId=", ")");
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lnr/w0$k1;", "Lnr/w0;", "Lps/q;", "activityStatsBrief", "", "Lps/j;", "images", "", "imagePosition", "", "isEditMode", "", "deviceName", "deviceImageUrl", "<init>", "(Lps/q;Ljava/util/List;IZLjava/lang/String;Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class k1 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ps.q f127472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<ps.j> f127473b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f127474c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f127475d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f127476e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f127477f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k1(ps.q qVar, List<ps.j> list, int i14, boolean z14, String str, String str2) {
            super(null);
            qVar.getClass();
            list.getClass();
            this.f127472a = qVar;
            this.f127473b = list;
            this.f127474c = i14;
            this.f127475d = z14;
            this.f127476e = str;
            this.f127477f = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k1)) {
                return false;
            }
            k1 k1Var = (k1) obj;
            return p005kotlin.jvm.internal.s.g(this.f127472a, k1Var.f127472a) && p005kotlin.jvm.internal.s.g(this.f127473b, k1Var.f127473b) && this.f127474c == k1Var.f127474c && this.f127475d == k1Var.f127475d && p005kotlin.jvm.internal.s.g(this.f127476e, k1Var.f127476e) && p005kotlin.jvm.internal.s.g(this.f127477f, k1Var.f127477f);
        }

        public final int hashCode() {
            int iG = q6.f.g(q2.d(this.f127474c, lc.u0.b(this.f127472a.hashCode() * 31, 31, this.f127473b), 31), 31, this.f127475d);
            String str = this.f127476e;
            int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f127477f;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("NavigateToViewImage(activityStatsBrief=");
            sb3.append(this.f127472a);
            sb3.append(", images=");
            sb3.append(this.f127473b);
            sb3.append(", imagePosition=");
            fb1.c.x(sb3, this.f127474c, ", isEditMode=", this.f127475d, ", deviceName=");
            return e5.h(sb3, this.f127476e, ", deviceImageUrl=", this.f127477f, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lnr/w0$l0;", "Lnr/w0;", "Lcom/garmin/android/apps/connectmobile/repcounting/model/ExerciseSetsDTO;", "exerciseSetsDto", "visibleExerciseSetsDto", "<init>", "(Lcom/garmin/android/apps/connectmobile/repcounting/model/ExerciseSetsDTO;Lcom/garmin/android/apps/connectmobile/repcounting/model/ExerciseSetsDTO;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class l0 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExerciseSetsDTO f127482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ExerciseSetsDTO f127483b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l0(ExerciseSetsDTO exerciseSetsDTO, ExerciseSetsDTO exerciseSetsDTO2) {
            super(null);
            exerciseSetsDTO.getClass();
            this.f127482a = exerciseSetsDTO;
            this.f127483b = exerciseSetsDTO2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l0)) {
                return false;
            }
            l0 l0Var = (l0) obj;
            return p005kotlin.jvm.internal.s.g(this.f127482a, l0Var.f127482a) && p005kotlin.jvm.internal.s.g(this.f127483b, l0Var.f127483b);
        }

        public final int hashCode() {
            int iHashCode = this.f127482a.hashCode() * 31;
            ExerciseSetsDTO exerciseSetsDTO = this.f127483b;
            return iHashCode + (exerciseSetsDTO == null ? 0 : exerciseSetsDTO.hashCode());
        }

        public final String toString() {
            return "NavigateToMuscleMap(exerciseSetsDto=" + this.f127482a + ", visibleExerciseSetsDto=" + this.f127483b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnr/w0$l1;", "Lnr/w0;", "Lwg0/k;", MimeTypes.BASE_TYPE_VIDEO, "<init>", "(Lwg0/k;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class l1 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wg0.k f127484a;

        static {
            Parcelable.Creator<wg0.k> creator = wg0.k.CREATOR;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l1(wg0.k kVar) {
            super(null);
            kVar.getClass();
            this.f127484a = kVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l1) && p005kotlin.jvm.internal.s.g(this.f127484a, ((l1) obj).f127484a);
        }

        public final int hashCode() {
            return this.f127484a.hashCode();
        }

        public final String toString() {
            return "NavigateToViewVideo(video=" + this.f127484a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnr/w0$m;", "Lnr/w0;", "", "badgeId", "<init>", "(I)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class m extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f127485a;

        public m(int i14) {
            super(null);
            this.f127485a = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.f127485a == ((m) obj).f127485a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f127485a);
        }

        public final String toString() {
            return v.e0.f(this.f127485a, "NavigateToBadgeDetails(badgeId=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lnr/w0$m1;", "Lnr/w0;", "Lro1/e;", "app", "Landroid/content/Intent;", "intent", "", "shareMessage", "shareUrl", "shareHashTag", "<init>", "(Lro1/e;Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class m1 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ro1.e f127488a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Intent f127489b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f127490c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f127491d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f127492e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m1(ro1.e eVar, Intent intent, String str, String str2, String str3) {
            super(null);
            eVar.getClass();
            intent.getClass();
            str.getClass();
            str2.getClass();
            str3.getClass();
            this.f127488a = eVar;
            this.f127489b = intent;
            this.f127490c = str;
            this.f127491d = str2;
            this.f127492e = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m1)) {
                return false;
            }
            m1 m1Var = (m1) obj;
            return p005kotlin.jvm.internal.s.g(this.f127488a, m1Var.f127488a) && p005kotlin.jvm.internal.s.g(this.f127489b, m1Var.f127489b) && p005kotlin.jvm.internal.s.g(this.f127490c, m1Var.f127490c) && p005kotlin.jvm.internal.s.g(this.f127491d, m1Var.f127491d) && p005kotlin.jvm.internal.s.g(this.f127492e, m1Var.f127492e);
        }

        public final int hashCode() {
            return this.f127492e.hashCode() + wr.g.j(wr.g.j((this.f127489b.hashCode() + (this.f127488a.hashCode() * 31)) * 31, 31, this.f127490c), 31, this.f127491d);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("OpenShareApp(app=");
            sb3.append(this.f127488a);
            sb3.append(", intent=");
            sb3.append(this.f127489b);
            sb3.append(", shareMessage=");
            sn.a.t(sb3, this.f127490c, ", shareUrl=", this.f127491d, ", shareHashTag=");
            return am.j.o(this.f127492e, ")", sb3);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lnr/w0$n;", "Lnr/w0;", "", "Lps/x1;", "climbs", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/ActivityDetailChartDTO;", "chartDetails", "Lyo1/f;", "sgrCompetitionsResults", "", "activityGroupRideUuid", "", "isOwnActivity", "<init>", "(Ljava/util/List;Lcom/garmin/android/apps/connectmobile/activities/newmodel/ActivityDetailChartDTO;Lyo1/f;Ljava/lang/String;Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class n extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<ps.x1> f127493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ActivityDetailChartDTO f127494b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final yo1.f f127495c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f127496d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f127497e;

        public n(List<ps.x1> list, ActivityDetailChartDTO activityDetailChartDTO, yo1.f fVar, String str, boolean z14) {
            super(null);
            this.f127493a = list;
            this.f127494b = activityDetailChartDTO;
            this.f127495c = fVar;
            this.f127496d = str;
            this.f127497e = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return p005kotlin.jvm.internal.s.g(this.f127493a, nVar.f127493a) && p005kotlin.jvm.internal.s.g(this.f127494b, nVar.f127494b) && p005kotlin.jvm.internal.s.g(this.f127495c, nVar.f127495c) && p005kotlin.jvm.internal.s.g(this.f127496d, nVar.f127496d) && this.f127497e == nVar.f127497e;
        }

        public final int hashCode() {
            List<ps.x1> list = this.f127493a;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            ActivityDetailChartDTO activityDetailChartDTO = this.f127494b;
            int iHashCode2 = (iHashCode + (activityDetailChartDTO == null ? 0 : activityDetailChartDTO.hashCode())) * 31;
            yo1.f fVar = this.f127495c;
            int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            String str = this.f127496d;
            return Boolean.hashCode(this.f127497e) + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("NavigateToClimbs(climbs=");
            sb3.append(this.f127493a);
            sb3.append(", chartDetails=");
            sb3.append(this.f127494b);
            sb3.append(", sgrCompetitionsResults=");
            sb3.append(this.f127495c);
            sb3.append(", activityGroupRideUuid=");
            sb3.append(this.f127496d);
            sb3.append(", isOwnActivity=");
            return hb.a.k(sb3, this.f127497e, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnr/w0$n0;", "Lnr/w0;", "Lq91/d;", "personalRecordType", "<init>", "(Lq91/d;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class n0 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q91.d f127498a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n0(q91.d dVar) {
            super(null);
            dVar.getClass();
            this.f127498a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n0) && this.f127498a == ((n0) obj).f127498a;
        }

        public final int hashCode() {
            return this.f127498a.hashCode();
        }

        public final String toString() {
            return "NavigateToPersonalRecordHistory(personalRecordType=" + this.f127498a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnr/w0$n1;", "Lnr/w0;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class n1 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n1 f127499a = new n1();

        private n1() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n1);
        }

        public final int hashCode() {
            return 378583576;
        }

        public final String toString() {
            return "PrivacySettingUpdated";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lnr/w0$o;", "Lnr/w0;", "Lwg0/a;", "activityPost", "", "openKeyboard", "<init>", "(Lwg0/a;Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class o extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wg0.a f127500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f127501b;

        static {
            wg0.a.b bVar = wg0.a.F;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(wg0.a aVar, boolean z14) {
            super(null);
            aVar.getClass();
            this.f127500a = aVar;
            this.f127501b = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return p005kotlin.jvm.internal.s.g(this.f127500a, oVar.f127500a) && this.f127501b == oVar.f127501b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f127501b) + (this.f127500a.hashCode() * 31);
        }

        public final String toString() {
            return "NavigateToCommentPage(activityPost=" + this.f127500a + ", openKeyboard=" + this.f127501b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lnr/w0$o0;", "Lnr/w0;", "Lam/x0;", "activityType", "", "activityIdToHighlight", "<init>", "(Lam/x0;Ljava/lang/Long;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class o0 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final am.x0 f127502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Long f127503b;

        public o0(am.x0 x0Var, Long l14) {
            super(null);
            this.f127502a = x0Var;
            this.f127503b = l14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o0)) {
                return false;
            }
            o0 o0Var = (o0) obj;
            return this.f127502a == o0Var.f127502a && p005kotlin.jvm.internal.s.g(this.f127503b, o0Var.f127503b);
        }

        public final int hashCode() {
            am.x0 x0Var = this.f127502a;
            int iHashCode = (x0Var == null ? 0 : x0Var.hashCode()) * 31;
            Long l14 = this.f127503b;
            return iHashCode + (l14 != null ? l14.hashCode() : 0);
        }

        public final String toString() {
            return "NavigateToPersonalRecords(activityType=" + this.f127502a + ", activityIdToHighlight=" + this.f127503b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnr/w0$o1;", "Lnr/w0;", "Lnr/a0;", "step", "<init>", "(Lnr/a0;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class o1 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final nr.a0 f127504a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o1(nr.a0 a0Var) {
            super(null);
            a0Var.getClass();
            this.f127504a = a0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o1) && this.f127504a == ((o1) obj).f127504a;
        }

        public final int hashCode() {
            return this.f127504a.hashCode();
        }

        public final String toString() {
            return "RatingUpdated(step=" + this.f127504a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lnr/w0$p;", "Lnr/w0;", "", "displayName", "", "badgeId", "<init>", "(Ljava/lang/String;I)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class p extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f127505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f127506b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String str, int i14) {
            super(null);
            str.getClass();
            this.f127505a = str;
            this.f127506b = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return p005kotlin.jvm.internal.s.g(this.f127505a, pVar.f127505a) && this.f127506b == pVar.f127506b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f127506b) + (this.f127505a.hashCode() * 31);
        }

        public final String toString() {
            return c22.t.e(this.f127506b, "NavigateToConnectionBadgeDetails(displayName=", this.f127505a, ", badgeId=", ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lnr/w0$p0;", "Lnr/w0;", "Lps/q;", "activityStatsBrief", "", "Lps/j;", "images", "", "isEditMode", "", "deviceName", "deviceImageUrl", "<init>", "(Lps/q;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class p0 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ps.q f127507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<ps.j> f127508b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f127509c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f127510d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f127511e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p0(ps.q qVar, List<ps.j> list, boolean z14, String str, String str2) {
            super(null);
            qVar.getClass();
            list.getClass();
            this.f127507a = qVar;
            this.f127508b = list;
            this.f127509c = z14;
            this.f127510d = str;
            this.f127511e = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p0)) {
                return false;
            }
            p0 p0Var = (p0) obj;
            return p005kotlin.jvm.internal.s.g(this.f127507a, p0Var.f127507a) && p005kotlin.jvm.internal.s.g(this.f127508b, p0Var.f127508b) && this.f127509c == p0Var.f127509c && p005kotlin.jvm.internal.s.g(this.f127510d, p0Var.f127510d) && p005kotlin.jvm.internal.s.g(this.f127511e, p0Var.f127511e);
        }

        public final int hashCode() {
            int iG = q6.f.g(lc.u0.b(this.f127507a.hashCode() * 31, 31, this.f127508b), 31, this.f127509c);
            String str = this.f127510d;
            int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f127511e;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("NavigateToPhotoManager(activityStatsBrief=");
            sb3.append(this.f127507a);
            sb3.append(", images=");
            sb3.append(this.f127508b);
            sb3.append(", isEditMode=");
            fb1.c.w(", deviceName=", this.f127510d, ", deviceImageUrl=", sb3, this.f127509c);
            return am.j.o(this.f127511e, ")", sb3);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lnr/w0$q;", "Lnr/w0;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/o;", "cyclingDynamics", "Lim/n;", "cyclingPositionMode", "<init>", "(Lcom/garmin/android/apps/connectmobile/activities/newmodel/o;Lim/n;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class q extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.activities.newmodel.o f127514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final im.n f127515b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(com.garmin.android.apps.connectmobile.activities.newmodel.o oVar, im.n nVar) {
            super(null);
            nVar.getClass();
            this.f127514a = oVar;
            this.f127515b = nVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return p005kotlin.jvm.internal.s.g(this.f127514a, qVar.f127514a) && this.f127515b == qVar.f127515b;
        }

        public final int hashCode() {
            com.garmin.android.apps.connectmobile.activities.newmodel.o oVar = this.f127514a;
            return this.f127515b.hashCode() + ((oVar == null ? 0 : oVar.hashCode()) * 31);
        }

        public final String toString() {
            return "NavigateToCyclingDynamicsHelp(cyclingDynamics=" + this.f127514a + ", cyclingPositionMode=" + this.f127515b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnr/w0$q0;", "Lnr/w0;", "Lcom/garmin/android/apps/connectmobile/activities/PrivacyType;", "privacyType", "<init>", "(Lcom/garmin/android/apps/connectmobile/activities/PrivacyType;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class q0 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PrivacyType f127516a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q0(PrivacyType privacyType) {
            super(null);
            privacyType.getClass();
            this.f127516a = privacyType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q0) && this.f127516a == ((q0) obj).f127516a;
        }

        public final int hashCode() {
            return this.f127516a.hashCode();
        }

        public final String toString() {
            return "NavigateToPrivacy(privacyType=" + this.f127516a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnr/w0$q1;", "Lnr/w0;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class q1 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final q1 f127517a = new q1();

        private q1() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof q1);
        }

        public final int hashCode() {
            return -2085262961;
        }

        public final String toString() {
            return "SendCourseToDevice";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnr/w0$r;", "Lnr/w0;", "", "activityId", "<init>", "(J)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class r extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f127518a;

        public r(long j8) {
            super(null);
            this.f127518a = j8;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getF127518a() {
            return this.f127518a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.f127518a == ((r) obj).f127518a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f127518a);
        }

        public final String toString() {
            return androidx.room.a0.f(this.f127518a, "NavigateToDiveApp(activityId=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lnr/w0$r0;", "Lnr/w0;", "Lam/x0;", "activityType", "initialSelectedActivityType", "Lorg/joda/time/DateTime;", "startDateTime", "<init>", "(Lam/x0;Lam/x0;Lorg/joda/time/DateTime;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class r0 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final am.x0 f127519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final am.x0 f127520b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DateTime f127521c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r0(am.x0 x0Var, am.x0 x0Var2, DateTime dateTime) {
            super(null);
            x0Var.getClass();
            x0Var2.getClass();
            this.f127519a = x0Var;
            this.f127520b = x0Var2;
            this.f127521c = dateTime;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r0)) {
                return false;
            }
            r0 r0Var = (r0) obj;
            return this.f127519a == r0Var.f127519a && this.f127520b == r0Var.f127520b && p005kotlin.jvm.internal.s.g(this.f127521c, r0Var.f127521c);
        }

        public final int hashCode() {
            int iHashCode = (this.f127520b.hashCode() + (this.f127519a.hashCode() * 31)) * 31;
            DateTime dateTime = this.f127521c;
            return iHashCode + (dateTime == null ? 0 : dateTime.hashCode());
        }

        public final String toString() {
            return "NavigateToReports(activityType=" + this.f127519a + ", initialSelectedActivityType=" + this.f127520b + ", startDateTime=" + this.f127521c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnr/w0$s;", "Lnr/w0;", "", "dogId", "<init>", "(J)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class s extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f127526a;

        public s(long j8) {
            super(null);
            this.f127526a = j8;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getF127526a() {
            return this.f127526a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && this.f127526a == ((s) obj).f127526a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f127526a);
        }

        public final String toString() {
            return androidx.room.a0.f(this.f127526a, "NavigateToDogProfile(dogId=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnr/w0$s1;", "Lnr/w0;", "", "activityId", "<init>", "(J)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class s1 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f127537a;

        public s1(long j8) {
            super(null);
            this.f127537a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s1) && this.f127537a == ((s1) obj).f127537a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f127537a);
        }

        public final String toString() {
            return androidx.room.a0.f(this.f127537a, "ShowExcludeFromPhysioDialog(activityId=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnr/w0$t;", "Lnr/w0;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class t extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final t f127538a = new t();

        private t() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof t);
        }

        public final int hashCode() {
            return -1389192090;
        }

        public final String toString() {
            return "NavigateToDragCdaHelp";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lnr/w0$t0;", "Lnr/w0;", "Lam/x0;", "activityType", "", "activityId", "", "Lps/x1;", "typedSplitDTOs", "<init>", "(Lam/x0;Ljava/lang/Long;Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class t0 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final am.x0 f127539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Long f127540b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<ps.x1> f127541c;

        public t0(am.x0 x0Var, Long l14, List<ps.x1> list) {
            super(null);
            this.f127539a = x0Var;
            this.f127540b = l14;
            this.f127541c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof t0)) {
                return false;
            }
            t0 t0Var = (t0) obj;
            return this.f127539a == t0Var.f127539a && p005kotlin.jvm.internal.s.g(this.f127540b, t0Var.f127540b) && p005kotlin.jvm.internal.s.g(this.f127541c, t0Var.f127541c);
        }

        public final int hashCode() {
            am.x0 x0Var = this.f127539a;
            int iHashCode = (x0Var == null ? 0 : x0Var.hashCode()) * 31;
            Long l14 = this.f127540b;
            int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
            List<ps.x1> list = this.f127541c;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("NavigateToSaveCourse(activityType=");
            sb3.append(this.f127539a);
            sb3.append(", activityId=");
            sb3.append(this.f127540b);
            sb3.append(", typedSplitDTOs=");
            return u62.z.c(sb3, this.f127541c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnr/w0$t1;", "Lnr/w0;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class t1 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final t1 f127542a = new t1();

        private t1() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof t1);
        }

        public final int hashCode() {
            return 1927330702;
        }

        public final String toString() {
            return "ShowLikeLimitReachedDialog";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lnr/w0$u;", "Lnr/w0;", "Lps/r;", "activitySummaryDto", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/ActivityDetailChartDTO;", "chartDetails", "<init>", "(Lps/r;Lcom/garmin/android/apps/connectmobile/activities/newmodel/ActivityDetailChartDTO;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class u extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ps.r f127543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ActivityDetailChartDTO f127544b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(ps.r rVar, ActivityDetailChartDTO activityDetailChartDTO) {
            super(null);
            rVar.getClass();
            activityDetailChartDTO.getClass();
            this.f127543a = rVar;
            this.f127544b = activityDetailChartDTO;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u)) {
                return false;
            }
            u uVar = (u) obj;
            return p005kotlin.jvm.internal.s.g(this.f127543a, uVar.f127543a) && p005kotlin.jvm.internal.s.g(this.f127544b, uVar.f127544b);
        }

        public final int hashCode() {
            return this.f127544b.hashCode() + (this.f127543a.hashCode() * 31);
        }

        public final String toString() {
            return "NavigateToEBikePerformance(activitySummaryDto=" + this.f127543a + ", chartDetails=" + this.f127544b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lnr/w0$u0;", "Lnr/w0;", "Lps/r;", "activitySummaryDTO", "Lps/s0;", "exerciseSetsDto", "<init>", "(Lps/r;Lps/s0;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class u0 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ps.r f127545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ps.s0 f127546b;

        static {
            Parcelable.Creator<ps.s0> creator = ps.s0.CREATOR;
            Parcelable.Creator<ps.r> creator2 = ps.r.CREATOR;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u0(ps.r rVar, ps.s0 s0Var) {
            super(null);
            rVar.getClass();
            this.f127545a = rVar;
            this.f127546b = s0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u0)) {
                return false;
            }
            u0 u0Var = (u0) obj;
            return p005kotlin.jvm.internal.s.g(this.f127545a, u0Var.f127545a) && p005kotlin.jvm.internal.s.g(this.f127546b, u0Var.f127546b);
        }

        public final int hashCode() {
            int iHashCode = this.f127545a.hashCode() * 31;
            ps.s0 s0Var = this.f127546b;
            return iHashCode + (s0Var == null ? 0 : s0Var.hashCode());
        }

        public final String toString() {
            return "NavigateToSegments(activitySummaryDTO=" + this.f127545a + ", exerciseSetsDto=" + this.f127546b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnr/w0$u1;", "Lnr/w0;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class u1 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final u1 f127547a = new u1();

        private u1() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof u1);
        }

        public final int hashCode() {
            return -1744237808;
        }

        public final String toString() {
            return "ShowMyselfRemovedFromSocialGroupRide";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnr/w0$v0;", "Lnr/w0;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class v0 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final v0 f127557a = new v0();

        private v0() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof v0);
        }

        public final int hashCode() {
            return 1709390880;
        }

        public final String toString() {
            return "NavigateToSelectRating";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnr/w0$v1;", "Lnr/w0;", "", "activityMissing", "<init>", "(Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class v1 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f127558a;

        public v1(boolean z14) {
            super(null);
            this.f127558a = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v1) && this.f127558a == ((v1) obj).f127558a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f127558a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("ShowNoDataState(activityMissing=", ")", this.f127558a);
        }
    }

    /* JADX INFO: renamed from: nr.w0$w0, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnr/w0$w0;", "Lnr/w0;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C2448w0 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2448w0 f127564a = new C2448w0();

        private C2448w0() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C2448w0);
        }

        public final int hashCode() {
            return 451301073;
        }

        public final String toString() {
            return "NavigateToSelectTrailBottomSheet";
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lnr/w0$w1;", "Lnr/w0;", "", "activityId", "Lam/x0;", "activityType", "", "isTrimmed", "isExcludedFromPhysio", "<init>", "(JLam/x0;ZZ)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class w1 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f127565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final am.x0 f127566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f127567c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f127568d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w1(long j8, am.x0 x0Var, boolean z14, boolean z15) {
            super(null);
            x0Var.getClass();
            this.f127565a = j8;
            this.f127566b = x0Var;
            this.f127567c = z14;
            this.f127568d = z15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w1)) {
                return false;
            }
            w1 w1Var = (w1) obj;
            return this.f127565a == w1Var.f127565a && this.f127566b == w1Var.f127566b && this.f127567c == w1Var.f127567c && this.f127568d == w1Var.f127568d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f127568d) + q6.f.g((this.f127566b.hashCode() + (Long.hashCode(this.f127565a) * 31)) * 31, 31, this.f127567c);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("ShowRestoreDialog(activityId=");
            sb3.append(this.f127565a);
            sb3.append(", activityType=");
            sb3.append(this.f127566b);
            com.airbnb.lottie.animation.keyframe.a.v(", isTrimmed=", ", isExcludedFromPhysio=", sb3, this.f127567c, this.f127568d);
            sb3.append(")");
            return sb3.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnr/w0$x;", "Lnr/w0;", "", "activityId", "<init>", "(J)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class x extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f127569a;

        public x(long j8) {
            super(null);
            this.f127569a = j8;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getF127569a() {
            return this.f127569a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x) && this.f127569a == ((x) obj).f127569a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f127569a);
        }

        public final String toString() {
            return androidx.room.a0.f(this.f127569a, "NavigateToElectronicShiftingData(activityId=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnr/w0$x0;", "Lnr/w0;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class x0 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final x0 f127570a = new x0();

        private x0() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof x0);
        }

        public final int hashCode() {
            return -851193416;
        }

        public final String toString() {
            return "NavigateToShareActivityDetail";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lnr/w0$x1;", "Lnr/w0;", "", "activityId", "", "isActivityTrimmed", "<init>", "(Ljava/lang/String;Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class x1 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f127571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f127572b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x1(String str, boolean z14) {
            super(null);
            str.getClass();
            this.f127571a = str;
            this.f127572b = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof x1)) {
                return false;
            }
            x1 x1Var = (x1) obj;
            return p005kotlin.jvm.internal.s.g(this.f127571a, x1Var.f127571a) && this.f127572b == x1Var.f127572b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f127572b) + (this.f127571a.hashCode() * 31);
        }

        public final String toString() {
            return n23.j.g("ShowRestoreSnackbar(activityId=", this.f127571a, ", isActivityTrimmed=", this.f127572b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnr/w0$y0;", "Lnr/w0;", "Lps/q;", "activityStatsBrief", "<init>", "(Lps/q;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class y0 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ps.q f127575a;

        static {
            Parcelable.Creator<ps.q> creator = ps.q.CREATOR;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y0(ps.q qVar) {
            super(null);
            qVar.getClass();
            this.f127575a = qVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y0) && p005kotlin.jvm.internal.s.g(this.f127575a, ((y0) obj).f127575a);
        }

        public final int hashCode() {
            return this.f127575a.hashCode();
        }

        public final String toString() {
            return "NavigateToShareImageWithStats(activityStatsBrief=" + this.f127575a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lnr/w0$y1;", "Lnr/w0;", "Lam/x0;", "activityType", "", "deviceName", "<init>", "(Lam/x0;Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class y1 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final am.x0 f127576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f127577b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y1(am.x0 x0Var, String str) {
            super(null);
            x0Var.getClass();
            this.f127576a = x0Var;
            this.f127577b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof y1)) {
                return false;
            }
            y1 y1Var = (y1) obj;
            return this.f127576a == y1Var.f127576a && p005kotlin.jvm.internal.s.g(this.f127577b, y1Var.f127577b);
        }

        public final int hashCode() {
            int iHashCode = this.f127576a.hashCode() * 31;
            String str = this.f127577b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "ShowSendingCourseToDeviceDialog(activityType=" + this.f127576a + ", deviceName=" + this.f127577b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnr/w0$z;", "Lnr/w0;", "", "uuid", "<init>", "(Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class z extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f127578a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(String str) {
            super(null);
            str.getClass();
            this.f127578a = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF127578a() {
            return this.f127578a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof z) && p005kotlin.jvm.internal.s.g(this.f127578a, ((z) obj).f127578a);
        }

        public final int hashCode() {
            return this.f127578a.hashCode();
        }

        public final String toString() {
            return am.j.m("NavigateToEpic(uuid=", this.f127578a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lnr/w0$z0;", "Lnr/w0;", "", "activityId", "activityName", "Lam/x0;", "activityType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lam/x0;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class z0 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f127579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f127580b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final am.x0 f127581c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z0(String str, String str2, am.x0 x0Var) {
            super(null);
            str.getClass();
            str2.getClass();
            x0Var.getClass();
            this.f127579a = str;
            this.f127580b = str2;
            this.f127581c = x0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof z0)) {
                return false;
            }
            z0 z0Var = (z0) obj;
            return p005kotlin.jvm.internal.s.g(this.f127579a, z0Var.f127579a) && p005kotlin.jvm.internal.s.g(this.f127580b, z0Var.f127580b) && this.f127581c == z0Var.f127581c;
        }

        public final int hashCode() {
            return this.f127581c.hashCode() + wr.g.j(this.f127579a.hashCode() * 31, 31, this.f127580b);
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("NavigateToShareWebLink(activityId=", this.f127579a, ", activityName=", this.f127580b, ", activityType=");
            sbI.append(this.f127581c);
            sbI.append(")");
            return sbI.toString();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnr/w0$z1;", "Lnr/w0;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class z1 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final z1 f127582a = new z1();

        private z1() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof z1);
        }

        public final int hashCode() {
            return 509574046;
        }

        public final String toString() {
            return "ShowShareActivityDialog";
        }
    }

    public /* synthetic */ w0(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private w0() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnr/w0$i0;", "Lnr/w0;", "", "imageCount", "<init>", "(I)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class i0 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f127462a;

        public /* synthetic */ i0(int i14, int i15, p005kotlin.jvm.internal.j jVar) {
            this((i15 & 1) != 0 ? 0 : i14);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i0) && this.f127462a == ((i0) obj).f127462a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f127462a);
        }

        public final String toString() {
            return v.e0.f(this.f127462a, "NavigateToImagePicker(imageCount=", ")");
        }

        public i0(int i14) {
            super(null);
            this.f127462a = i14;
        }

        public i0() {
            this(0, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lnr/w0$p1;", "Lnr/w0;", "", "activityId", "", "removeCurrentPage", "<init>", "(JZ)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class p1 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f127512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f127513b;

        public p1(long j8, boolean z14) {
            super(null);
            this.f127512a = j8;
            this.f127513b = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p1)) {
                return false;
            }
            p1 p1Var = (p1) obj;
            return this.f127512a == p1Var.f127512a && this.f127513b == p1Var.f127513b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f127513b) + (Long.hashCode(this.f127512a) * 31);
        }

        public final String toString() {
            return "RedirectToDiveApp(activityId=" + this.f127512a + ", removeCurrentPage=" + this.f127513b + ")";
        }

        public /* synthetic */ p1(long j8, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
            this(j8, (i14 & 2) != 0 ? false : z14);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lnr/w0$h0;", "Lnr/w0;", "Lro0/l;", "helpType", "", "action", "<init>", "(Lro0/l;Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h0 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ro0.l f127456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f127457b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(ro0.l lVar, String str) {
            super(null);
            lVar.getClass();
            this.f127456a = lVar;
            this.f127457b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h0)) {
                return false;
            }
            h0 h0Var = (h0) obj;
            return this.f127456a == h0Var.f127456a && p005kotlin.jvm.internal.s.g(this.f127457b, h0Var.f127457b);
        }

        public final int hashCode() {
            int iHashCode = this.f127456a.hashCode() * 31;
            String str = this.f127457b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "NavigateToHelp(helpType=" + this.f127456a + ", action=" + this.f127457b + ")";
        }

        public /* synthetic */ h0(ro0.l lVar, String str, int i14, p005kotlin.jvm.internal.j jVar) {
            this(lVar, (i14 & 2) != 0 ? null : str);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lnr/w0$b2;", "Lnr/w0;", "", "message", "Lnr/a0;", "step", "<init>", "(Ljava/lang/String;Lnr/a0;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b2 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f127413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final nr.a0 f127414b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b2(String str, nr.a0 a0Var) {
            super(null);
            str.getClass();
            a0Var.getClass();
            this.f127413a = str;
            this.f127414b = a0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b2)) {
                return false;
            }
            b2 b2Var = (b2) obj;
            return p005kotlin.jvm.internal.s.g(this.f127413a, b2Var.f127413a) && this.f127414b == b2Var.f127414b;
        }

        public final int hashCode() {
            return this.f127414b.hashCode() + (this.f127413a.hashCode() * 31);
        }

        public final String toString() {
            return "ToggleFavorite(message=" + this.f127413a + ", step=" + this.f127414b + ")";
        }

        public /* synthetic */ b2(String str, nr.a0 a0Var, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? "" : str, a0Var);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lnr/w0$c0;", "Lnr/w0;", "Lim/b;", "chartData", "", "chartDataList", "Landroid/util/SparseArray;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/q0;", "comparisonTargetData", "<init>", "(Lim/b;Ljava/util/List;Landroid/util/SparseArray;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c0 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final im.b f127416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<im.b> f127417b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SparseArray<com.garmin.android.apps.connectmobile.activities.newmodel.q0> f127418c;

        public /* synthetic */ c0(im.b bVar, List list, SparseArray sparseArray, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : bVar, (i14 & 2) != 0 ? null : list, sparseArray);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c0)) {
                return false;
            }
            c0 c0Var = (c0) obj;
            return p005kotlin.jvm.internal.s.g(this.f127416a, c0Var.f127416a) && p005kotlin.jvm.internal.s.g(this.f127417b, c0Var.f127417b) && p005kotlin.jvm.internal.s.g(this.f127418c, c0Var.f127418c);
        }

        public final int hashCode() {
            im.b bVar = this.f127416a;
            int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
            List<im.b> list = this.f127417b;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            SparseArray<com.garmin.android.apps.connectmobile.activities.newmodel.q0> sparseArray = this.f127418c;
            return iHashCode2 + (sparseArray != null ? sparseArray.hashCode() : 0);
        }

        public final String toString() {
            return "NavigateToFullScreenChart(chartData=" + this.f127416a + ", chartDataList=" + this.f127417b + ", comparisonTargetData=" + this.f127418c + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c0(im.b bVar, List<? extends im.b> list, SparseArray<com.garmin.android.apps.connectmobile.activities.newmodel.q0> sparseArray) {
            super(null);
            this.f127416a = bVar;
            this.f127417b = list;
            this.f127418c = sparseArray;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lnr/w0$c1;", "Lnr/w0;", "Lim/b;", "chartData", "", "chartDataList", "Landroid/util/SparseArray;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/q0;", "comparisonTargetData", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/l0;", "tanksPressureDto", "<init>", "(Lim/b;Ljava/util/List;Landroid/util/SparseArray;Lcom/garmin/android/apps/connectmobile/activities/newmodel/l0;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c1 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final im.b f127419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<im.b> f127420b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SparseArray<com.garmin.android.apps.connectmobile.activities.newmodel.q0> f127421c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.activities.newmodel.l0 f127422d;

        public /* synthetic */ c1(im.b bVar, List list, SparseArray sparseArray, com.garmin.android.apps.connectmobile.activities.newmodel.l0 l0Var, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : bVar, (i14 & 2) != 0 ? null : list, sparseArray, l0Var);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c1)) {
                return false;
            }
            c1 c1Var = (c1) obj;
            return p005kotlin.jvm.internal.s.g(this.f127419a, c1Var.f127419a) && p005kotlin.jvm.internal.s.g(this.f127420b, c1Var.f127420b) && p005kotlin.jvm.internal.s.g(this.f127421c, c1Var.f127421c) && p005kotlin.jvm.internal.s.g(this.f127422d, c1Var.f127422d);
        }

        public final int hashCode() {
            im.b bVar = this.f127419a;
            int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
            List<im.b> list = this.f127420b;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            SparseArray<com.garmin.android.apps.connectmobile.activities.newmodel.q0> sparseArray = this.f127421c;
            int iHashCode3 = (iHashCode2 + (sparseArray == null ? 0 : sparseArray.hashCode())) * 31;
            com.garmin.android.apps.connectmobile.activities.newmodel.l0 l0Var = this.f127422d;
            return iHashCode3 + (l0Var != null ? l0Var.hashCode() : 0);
        }

        public final String toString() {
            return "NavigateToTanksFullScreenChart(chartData=" + this.f127419a + ", chartDataList=" + this.f127420b + ", comparisonTargetData=" + this.f127421c + ", tanksPressureDto=" + this.f127422d + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c1(im.b bVar, List<? extends im.b> list, SparseArray<com.garmin.android.apps.connectmobile.activities.newmodel.q0> sparseArray, com.garmin.android.apps.connectmobile.activities.newmodel.l0 l0Var) {
            super(null);
            this.f127419a = bVar;
            this.f127420b = list;
            this.f127421c = sparseArray;
            this.f127422d = l0Var;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lnr/w0$d;", "Lnr/w0;", "", "activityDescription", "linkedEventName", "Lnr/a0;", "step", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lnr/a0;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f127424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f127425b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final nr.a0 f127426c;

        public /* synthetic */ d(String str, String str2, nr.a0 a0Var, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, a0Var);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return p005kotlin.jvm.internal.s.g(this.f127424a, dVar.f127424a) && p005kotlin.jvm.internal.s.g(this.f127425b, dVar.f127425b) && this.f127426c == dVar.f127426c;
        }

        public final int hashCode() {
            String str = this.f127424a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f127425b;
            return this.f127426c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("DeleteActivity(activityDescription=", this.f127424a, ", linkedEventName=", this.f127425b, ", step=");
            sbI.append(this.f127426c);
            sbI.append(")");
            return sbI.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, nr.a0 a0Var) {
            super(null);
            a0Var.getClass();
            this.f127424a = str;
            this.f127425b = str2;
            this.f127426c = a0Var;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lnr/w0$j1;", "Lnr/w0;", "", "userDisplayImageUrl", "userDisplayName", "userFullName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class j1 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f127467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f127468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f127469c;

        public /* synthetic */ j1(String str, String str2, String str3, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : str, str2, (i14 & 4) != 0 ? null : str3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j1)) {
                return false;
            }
            j1 j1Var = (j1) obj;
            return p005kotlin.jvm.internal.s.g(this.f127467a, j1Var.f127467a) && p005kotlin.jvm.internal.s.g(this.f127468b, j1Var.f127468b) && p005kotlin.jvm.internal.s.g(this.f127469c, j1Var.f127469c);
        }

        public final int hashCode() {
            String str = this.f127467a;
            int iJ = wr.g.j((str == null ? 0 : str.hashCode()) * 31, 31, this.f127468b);
            String str2 = this.f127469c;
            return iJ + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return am.j.o(this.f127469c, ")", p6.b.i("NavigateToUserProfile(userDisplayImageUrl=", this.f127467a, ", userDisplayName=", this.f127468b, ", userFullName="));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j1(String str, String str2, String str3) {
            super(null);
            str2.getClass();
            this.f127467a = str;
            this.f127468b = str2;
            this.f127469c = str3;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lnr/w0$b0;", "Lnr/w0;", "", "activityId", "", "activityName", "", "showFullResPolyline", "Los/b;", "mapMode", "Lie2/c;", "cameraState", "<init>", "(Ljava/lang/Long;Ljava/lang/String;ZLos/b;Lie2/c;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b0 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Long f127404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f127405b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f127406c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final os.b f127407d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ie2.c f127408e;

        static {
            Parcelable.Creator<ie2.c> creator = ie2.c.CREATOR;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(Long l14, String str, boolean z14, os.b bVar, ie2.c cVar) {
            super(null);
            bVar.getClass();
            this.f127404a = l14;
            this.f127405b = str;
            this.f127406c = z14;
            this.f127407d = bVar;
            this.f127408e = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b0)) {
                return false;
            }
            b0 b0Var = (b0) obj;
            return p005kotlin.jvm.internal.s.g(this.f127404a, b0Var.f127404a) && p005kotlin.jvm.internal.s.g(this.f127405b, b0Var.f127405b) && this.f127406c == b0Var.f127406c && this.f127407d == b0Var.f127407d && p005kotlin.jvm.internal.s.g(this.f127408e, b0Var.f127408e);
        }

        public final int hashCode() {
            Long l14 = this.f127404a;
            int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
            String str = this.f127405b;
            int iHashCode2 = (this.f127407d.hashCode() + q6.f.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f127406c)) * 31;
            ie2.c cVar = this.f127408e;
            return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbJ = b71.i.j("NavigateToFullMap(activityId=", ", activityName=", this.f127405b, this.f127404a, ", showFullResPolyline=");
            sbJ.append(this.f127406c);
            sbJ.append(", mapMode=");
            sbJ.append(this.f127407d);
            sbJ.append(", cameraState=");
            sbJ.append(this.f127408e);
            sbJ.append(")");
            return sbJ.toString();
        }

        public /* synthetic */ b0(Long l14, String str, boolean z14, os.b bVar, ie2.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this(l14, str, z14, bVar, (i14 & 16) != 0 ? null : cVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lnr/w0$m0;", "Lnr/w0;", "Lro0/l;", "helpFeature", "", "activityTypeKey", "<init>", "(Lro0/l;Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class m0 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ro0.l f127486a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f127487b;

        public m0(ro0.l lVar, String str, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? ro0.l.NUTRITION_HYDRATION : lVar, (i14 & 2) != 0 ? am.x0.f4346x.f4358a : str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m0)) {
                return false;
            }
            m0 m0Var = (m0) obj;
            return this.f127486a == m0Var.f127486a && p005kotlin.jvm.internal.s.g(this.f127487b, m0Var.f127487b);
        }

        public final int hashCode() {
            int iHashCode = this.f127486a.hashCode() * 31;
            String str = this.f127487b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "NavigateToNutritionHydrationHelp(helpFeature=" + this.f127486a + ", activityTypeKey=" + this.f127487b + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m0(ro0.l lVar, String str) {
            super(null);
            lVar.getClass();
            this.f127486a = lVar;
            this.f127487b = str;
        }

        public m0() {
            this(null, null, 3, null);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lnr/w0$w;", "Lnr/w0;", "Lps/r;", "summaryDTO", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/f;", "roundsDTO", "Lps/s0;", "exerciseSetsDto", "Lcom/garmin/android/apps/connectmobile/repcounting/model/c;", "exerciseListDto", "Lcom/garmin/android/apps/connectmobile/repcounting/model/d;", "exerciseListItemDTO", "<init>", "(Lps/r;Lcom/garmin/android/apps/connectmobile/activities/newmodel/f;Lps/s0;Lcom/garmin/android/apps/connectmobile/repcounting/model/c;Lcom/garmin/android/apps/connectmobile/repcounting/model/d;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class w extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ps.r f127559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.activities.newmodel.f f127560b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ps.s0 f127561c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.repcounting.model.c f127562d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.repcounting.model.d f127563e;

        static {
            com.garmin.android.apps.connectmobile.repcounting.model.d.b bVar = com.garmin.android.apps.connectmobile.repcounting.model.d.f41101j;
            com.garmin.android.apps.connectmobile.repcounting.model.c.b bVar2 = com.garmin.android.apps.connectmobile.repcounting.model.c.f41095b;
            Parcelable.Creator<ps.s0> creator = ps.s0.CREATOR;
            Parcelable.Creator<com.garmin.android.apps.connectmobile.activities.newmodel.f> creator2 = com.garmin.android.apps.connectmobile.activities.newmodel.f.CREATOR;
            Parcelable.Creator<ps.r> creator3 = ps.r.CREATOR;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(ps.r rVar, com.garmin.android.apps.connectmobile.activities.newmodel.f fVar, ps.s0 s0Var, com.garmin.android.apps.connectmobile.repcounting.model.c cVar, com.garmin.android.apps.connectmobile.repcounting.model.d dVar) {
            super(null);
            rVar.getClass();
            this.f127559a = rVar;
            this.f127560b = fVar;
            this.f127561c = s0Var;
            this.f127562d = cVar;
            this.f127563e = dVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final com.garmin.android.apps.connectmobile.repcounting.model.d getF127563e() {
            return this.f127563e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w)) {
                return false;
            }
            w wVar = (w) obj;
            return p005kotlin.jvm.internal.s.g(this.f127559a, wVar.f127559a) && p005kotlin.jvm.internal.s.g(this.f127560b, wVar.f127560b) && p005kotlin.jvm.internal.s.g(this.f127561c, wVar.f127561c) && p005kotlin.jvm.internal.s.g(this.f127562d, wVar.f127562d) && p005kotlin.jvm.internal.s.g(this.f127563e, wVar.f127563e);
        }

        public final int hashCode() {
            int iHashCode = this.f127559a.hashCode() * 31;
            com.garmin.android.apps.connectmobile.activities.newmodel.f fVar = this.f127560b;
            int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
            ps.s0 s0Var = this.f127561c;
            int iHashCode3 = (iHashCode2 + (s0Var == null ? 0 : s0Var.hashCode())) * 31;
            com.garmin.android.apps.connectmobile.repcounting.model.c cVar = this.f127562d;
            int iHashCode4 = (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            com.garmin.android.apps.connectmobile.repcounting.model.d dVar = this.f127563e;
            return iHashCode4 + (dVar != null ? dVar.hashCode() : 0);
        }

        public final String toString() {
            return "NavigateToEditExercises(summaryDTO=" + this.f127559a + ", roundsDTO=" + this.f127560b + ", exerciseSetsDto=" + this.f127561c + ", exerciseListDto=" + this.f127562d + ", exerciseListItemDTO=" + this.f127563e + ")";
        }

        public /* synthetic */ w(ps.r rVar, com.garmin.android.apps.connectmobile.activities.newmodel.f fVar, ps.s0 s0Var, com.garmin.android.apps.connectmobile.repcounting.model.c cVar, com.garmin.android.apps.connectmobile.repcounting.model.d dVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this(rVar, fVar, s0Var, cVar, (i14 & 16) != 0 ? null : dVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lnr/w0$y;", "Lnr/w0;", "Lro0/l;", "helpFeature", "", "activityTypeKey", "<init>", "(Lro0/l;Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class y extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ro0.l f127573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f127574b;

        public y(ro0.l lVar, String str, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? ro0.l.ENDURANCE_STAMINA : lVar, (i14 & 2) != 0 ? am.x0.f4346x.f4358a : str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof y)) {
                return false;
            }
            y yVar = (y) obj;
            return this.f127573a == yVar.f127573a && p005kotlin.jvm.internal.s.g(this.f127574b, yVar.f127574b);
        }

        public final int hashCode() {
            int iHashCode = this.f127573a.hashCode() * 31;
            String str = this.f127574b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "NavigateToEnduranceStaminaHelp(helpFeature=" + this.f127573a + ", activityTypeKey=" + this.f127574b + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(ro0.l lVar, String str) {
            super(null);
            lVar.getClass();
            this.f127573a = lVar;
            this.f127574b = str;
        }

        public y() {
            this(null, null, 3, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lnr/w0$l;", "Lnr/w0;", "", "title", "searchHint", "Lcom/garmin/android/apps/connectmobile/repcounting/model/c;", "exerciseListDTO", "Lam/x0;", "activityType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/repcounting/model/c;Lam/x0;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class l extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f127478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f127479b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.repcounting.model.c f127480c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final am.x0 f127481d;

        static {
            com.garmin.android.apps.connectmobile.repcounting.model.c.b bVar = com.garmin.android.apps.connectmobile.repcounting.model.c.f41095b;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, String str2, com.garmin.android.apps.connectmobile.repcounting.model.c cVar, am.x0 x0Var) {
            super(null);
            str.getClass();
            str2.getClass();
            this.f127478a = str;
            this.f127479b = str2;
            this.f127480c = cVar;
            this.f127481d = x0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return p005kotlin.jvm.internal.s.g(this.f127478a, lVar.f127478a) && p005kotlin.jvm.internal.s.g(this.f127479b, lVar.f127479b) && p005kotlin.jvm.internal.s.g(this.f127480c, lVar.f127480c) && this.f127481d == lVar.f127481d;
        }

        public final int hashCode() {
            int iJ = wr.g.j(this.f127478a.hashCode() * 31, 31, this.f127479b);
            com.garmin.android.apps.connectmobile.repcounting.model.c cVar = this.f127480c;
            int iHashCode = (iJ + (cVar == null ? 0 : cVar.hashCode())) * 31;
            am.x0 x0Var = this.f127481d;
            return iHashCode + (x0Var != null ? x0Var.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("NavigateToAddExercises(title=", this.f127478a, ", searchHint=", this.f127479b, ", exerciseListDTO=");
            sbI.append(this.f127480c);
            sbI.append(", activityType=");
            sbI.append(this.f127481d);
            sbI.append(")");
            return sbI.toString();
        }

        public /* synthetic */ l(String str, String str2, com.garmin.android.apps.connectmobile.repcounting.model.c cVar, am.x0 x0Var, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? "" : str2, cVar, x0Var);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lnr/w0$r1;", "Lnr/w0;", "", "fileName", "shareMessage", "shareUrl", "shareHashTag", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class r1 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f127522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f127523b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f127524c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f127525d;

        public /* synthetic */ r1(String str, String str2, String str3, String str4, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r1)) {
                return false;
            }
            r1 r1Var = (r1) obj;
            return p005kotlin.jvm.internal.s.g(this.f127522a, r1Var.f127522a) && p005kotlin.jvm.internal.s.g(this.f127523b, r1Var.f127523b) && p005kotlin.jvm.internal.s.g(this.f127524c, r1Var.f127524c) && p005kotlin.jvm.internal.s.g(this.f127525d, r1Var.f127525d);
        }

        public final int hashCode() {
            int iHashCode = this.f127522a.hashCode() * 31;
            String str = this.f127523b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f127524c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f127525d;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return e5.h(p6.b.i("ShareTemplate(fileName=", this.f127522a, ", shareMessage=", this.f127523b, ", shareUrl="), this.f127524c, ", shareHashTag=", this.f127525d, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r1(String str, String str2, String str3, String str4) {
            super(null);
            str.getClass();
            this.f127522a = str;
            this.f127523b = str2;
            this.f127524c = str3;
            this.f127525d = str4;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lnr/w0$d1;", "Lnr/w0;", "Lro0/l;", "helpFeature", "", "deviceId", "", "activityTypeKey", "", "isOwnActivity", "<init>", "(Lro0/l;Ljava/lang/Long;Ljava/lang/String;Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d1 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ro0.l f127428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Long f127429b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f127430c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f127431d;

        public d1(ro0.l lVar, Long l14, String str, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? ro0.l.POWER_ZONES : lVar, (i14 & 2) != 0 ? null : l14, (i14 & 4) != 0 ? am.x0.f4346x.f4358a : str, z14);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d1)) {
                return false;
            }
            d1 d1Var = (d1) obj;
            return this.f127428a == d1Var.f127428a && p005kotlin.jvm.internal.s.g(this.f127429b, d1Var.f127429b) && p005kotlin.jvm.internal.s.g(this.f127430c, d1Var.f127430c) && this.f127431d == d1Var.f127431d;
        }

        public final int hashCode() {
            int iHashCode = this.f127428a.hashCode() * 31;
            Long l14 = this.f127429b;
            int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
            String str = this.f127430c;
            return Boolean.hashCode(this.f127431d) + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("NavigateToTimeInPowerZonesHelp(helpFeature=");
            sb3.append(this.f127428a);
            sb3.append(", deviceId=");
            sb3.append(this.f127429b);
            sb3.append(", activityTypeKey=");
            return am.j.n(this.f127430c, ", isOwnActivity=", ")", sb3, this.f127431d);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d1(ro0.l lVar, Long l14, String str, boolean z14) {
            super(null);
            lVar.getClass();
            this.f127428a = lVar;
            this.f127429b = l14;
            this.f127430c = str;
            this.f127431d = z14;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lnr/w0$g0;", "Lnr/w0;", "Lro0/l;", "helpFeature", "", "deviceId", "", "activityTypeKey", "", "isOwnActivity", "<init>", "(Lro0/l;Ljava/lang/Long;Ljava/lang/String;Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g0 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ro0.l f127445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Long f127446b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f127447c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f127448d;

        public g0(ro0.l lVar, Long l14, String str, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? ro0.l.HEART_RATE_ZONES : lVar, (i14 & 2) != 0 ? null : l14, (i14 & 4) != 0 ? am.x0.f4346x.f4358a : str, z14);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g0)) {
                return false;
            }
            g0 g0Var = (g0) obj;
            return this.f127445a == g0Var.f127445a && p005kotlin.jvm.internal.s.g(this.f127446b, g0Var.f127446b) && p005kotlin.jvm.internal.s.g(this.f127447c, g0Var.f127447c) && this.f127448d == g0Var.f127448d;
        }

        public final int hashCode() {
            int iHashCode = this.f127445a.hashCode() * 31;
            Long l14 = this.f127446b;
            int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
            String str = this.f127447c;
            return Boolean.hashCode(this.f127448d) + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("NavigateToHeartRateZonesHelp(helpFeature=");
            sb3.append(this.f127445a);
            sb3.append(", deviceId=");
            sb3.append(this.f127446b);
            sb3.append(", activityTypeKey=");
            return am.j.n(this.f127447c, ", isOwnActivity=", ")", sb3, this.f127448d);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(ro0.l lVar, Long l14, String str, boolean z14) {
            super(null);
            lVar.getClass();
            this.f127445a = lVar;
            this.f127446b = l14;
            this.f127447c = str;
            this.f127448d = z14;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lnr/w0$v;", "Lnr/w0;", "Lps/r;", "activitySummary", "Lps/s0;", "exerciseSetsDto", "Lps/p;", "activitySplits", "", "hasDeviceInfo", "hasDistanceTrim", "hasDurationTrim", "hasMultisportEdit", "hasTrimChartData", "", "parentActivityTypeKey", "<init>", "(Lps/r;Lps/s0;Lps/p;ZZZZZLjava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class v extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ps.r f127548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ps.s0 f127549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ps.p f127550c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f127551d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f127552e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f127553f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f127554g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f127555h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f127556i;

        static {
            Parcelable.Creator<ps.p> creator = ps.p.CREATOR;
            Parcelable.Creator<ps.s0> creator2 = ps.s0.CREATOR;
            Parcelable.Creator<ps.r> creator3 = ps.r.CREATOR;
        }

        public /* synthetic */ v(ps.r rVar, ps.s0 s0Var, ps.p pVar, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, String str, int i14, p005kotlin.jvm.internal.j jVar) {
            this(rVar, s0Var, pVar, z14, z15, z16, z17, z18, (i14 & 256) != 0 ? null : str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof v)) {
                return false;
            }
            v vVar = (v) obj;
            return p005kotlin.jvm.internal.s.g(this.f127548a, vVar.f127548a) && p005kotlin.jvm.internal.s.g(this.f127549b, vVar.f127549b) && p005kotlin.jvm.internal.s.g(this.f127550c, vVar.f127550c) && this.f127551d == vVar.f127551d && this.f127552e == vVar.f127552e && this.f127553f == vVar.f127553f && this.f127554g == vVar.f127554g && this.f127555h == vVar.f127555h && p005kotlin.jvm.internal.s.g(this.f127556i, vVar.f127556i);
        }

        public final int hashCode() {
            int iHashCode = this.f127548a.hashCode() * 31;
            ps.s0 s0Var = this.f127549b;
            int iHashCode2 = (iHashCode + (s0Var == null ? 0 : s0Var.hashCode())) * 31;
            ps.p pVar = this.f127550c;
            int iG = q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g((iHashCode2 + (pVar == null ? 0 : pVar.hashCode())) * 31, 31, this.f127551d), 31, this.f127552e), 31, this.f127553f), 31, this.f127554g), 31, this.f127555h);
            String str = this.f127556i;
            return iG + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("NavigateToEditActivity(activitySummary=");
            sb3.append(this.f127548a);
            sb3.append(", exerciseSetsDto=");
            sb3.append(this.f127549b);
            sb3.append(", activitySplits=");
            sb3.append(this.f127550c);
            sb3.append(", hasDeviceInfo=");
            sb3.append(this.f127551d);
            sb3.append(", hasDistanceTrim=");
            kg.f.q(", hasDurationTrim=", ", hasMultisportEdit=", sb3, this.f127552e, this.f127553f);
            kg.f.q(", hasTrimChartData=", ", parentActivityTypeKey=", sb3, this.f127554g, this.f127555h);
            return am.j.o(this.f127556i, ")", sb3);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(ps.r rVar, ps.s0 s0Var, ps.p pVar, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, String str) {
            super(null);
            rVar.getClass();
            this.f127548a = rVar;
            this.f127549b = s0Var;
            this.f127550c = pVar;
            this.f127551d = z14;
            this.f127552e = z15;
            this.f127553f = z16;
            this.f127554g = z17;
            this.f127555h = z18;
            this.f127556i = str;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lnr/w0$g1;", "Lnr/w0;", "", "trailId", "activityId", "activityDateMs", "reviewId", "", "reviewRating", "", "shouldNavigateToMyReviews", "<init>", "(JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g1 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f127449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Long f127450b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Long f127451c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Long f127452d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Integer f127453e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f127454f;

        public /* synthetic */ g1(long j8, Long l14, Long l15, Long l16, Integer num, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
            this(j8, (i14 & 2) != 0 ? null : l14, (i14 & 4) != 0 ? null : l15, (i14 & 8) != 0 ? null : l16, (i14 & 16) != 0 ? null : num, (i14 & 32) != 0 ? false : z14);
        }

        public static g1 a(g1 g1Var, Long l14, Integer num, int i14) {
            long j8 = g1Var.f127449a;
            Long l15 = g1Var.f127450b;
            Long l16 = g1Var.f127451c;
            if ((i14 & 8) != 0) {
                l14 = g1Var.f127452d;
            }
            Long l17 = l14;
            if ((i14 & 16) != 0) {
                num = g1Var.f127453e;
            }
            return new g1(j8, l15, l16, l17, num, (i14 & 32) != 0 ? g1Var.f127454f : false);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Long getF127451c() {
            return this.f127451c;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Long getF127450b() {
            return this.f127450b;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Long getF127452d() {
            return this.f127452d;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Integer getF127453e() {
            return this.f127453e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g1)) {
                return false;
            }
            g1 g1Var = (g1) obj;
            return this.f127449a == g1Var.f127449a && p005kotlin.jvm.internal.s.g(this.f127450b, g1Var.f127450b) && p005kotlin.jvm.internal.s.g(this.f127451c, g1Var.f127451c) && p005kotlin.jvm.internal.s.g(this.f127452d, g1Var.f127452d) && p005kotlin.jvm.internal.s.g(this.f127453e, g1Var.f127453e) && this.f127454f == g1Var.f127454f;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getF127454f() {
            return this.f127454f;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final long getF127449a() {
            return this.f127449a;
        }

        public final int hashCode() {
            int iHashCode = Long.hashCode(this.f127449a) * 31;
            Long l14 = this.f127450b;
            int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
            Long l15 = this.f127451c;
            int iHashCode3 = (iHashCode2 + (l15 == null ? 0 : l15.hashCode())) * 31;
            Long l16 = this.f127452d;
            int iHashCode4 = (iHashCode3 + (l16 == null ? 0 : l16.hashCode())) * 31;
            Integer num = this.f127453e;
            return Boolean.hashCode(this.f127454f) + ((iHashCode4 + (num != null ? num.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "NavigateToTrailDetails(trailId=" + this.f127449a + ", activityId=" + this.f127450b + ", activityDateMs=" + this.f127451c + ", reviewId=" + this.f127452d + ", reviewRating=" + this.f127453e + ", shouldNavigateToMyReviews=" + this.f127454f + ")";
        }

        public g1(long j8, Long l14, Long l15, Long l16, Integer num, boolean z14) {
            super(null);
            this.f127449a = j8;
            this.f127450b = l14;
            this.f127451c = l15;
            this.f127452d = l16;
            this.f127453e = num;
            this.f127454f = z14;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lnr/w0$s0;", "Lnr/w0;", "", "chartType", "", "activityTypeKey", "", "hasPodData", "hasRunCadence", "hasVerticalOscillation", "hasVerticalRatio", "hasGroundContactTime", "hasGroundContactBalance", "hasStepSpeedLoss", "hasStepSpeedLossPercent", "<init>", "(ILjava/lang/String;ZZZZZZZZ)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class s0 extends w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f127527a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f127528b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f127529c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f127530d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f127531e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f127532f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f127533g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f127534h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f127535i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f127536j;

        public /* synthetic */ s0(int i14, String str, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, boolean z25, int i15, p005kotlin.jvm.internal.j jVar) {
            this((i15 & 1) != 0 ? -1 : i14, (i15 & 2) != 0 ? "" : str, (i15 & 4) != 0 ? false : z14, (i15 & 8) != 0 ? false : z15, (i15 & 16) != 0 ? false : z16, (i15 & 32) != 0 ? false : z17, (i15 & 64) != 0 ? false : z18, (i15 & 128) != 0 ? false : z19, (i15 & 256) != 0 ? false : z24, (i15 & 512) != 0 ? false : z25);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s0)) {
                return false;
            }
            s0 s0Var = (s0) obj;
            return this.f127527a == s0Var.f127527a && p005kotlin.jvm.internal.s.g(this.f127528b, s0Var.f127528b) && this.f127529c == s0Var.f127529c && this.f127530d == s0Var.f127530d && this.f127531e == s0Var.f127531e && this.f127532f == s0Var.f127532f && this.f127533g == s0Var.f127533g && this.f127534h == s0Var.f127534h && this.f127535i == s0Var.f127535i && this.f127536j == s0Var.f127536j;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f127536j) + q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(wr.g.j(Integer.hashCode(this.f127527a) * 31, 31, this.f127528b), 31, this.f127529c), 31, this.f127530d), 31, this.f127531e), 31, this.f127532f), 31, this.f127533g), 31, this.f127534h), 31, this.f127535i);
        }

        public final String toString() {
            StringBuilder sbR = wr.g.r(this.f127527a, "NavigateToRunningHelp(chartType=", ", activityTypeKey=", this.f127528b, ", hasPodData=");
            kg.f.q(", hasRunCadence=", ", hasVerticalOscillation=", sbR, this.f127529c, this.f127530d);
            kg.f.q(", hasVerticalRatio=", ", hasGroundContactTime=", sbR, this.f127531e, this.f127532f);
            kg.f.q(", hasGroundContactBalance=", ", hasStepSpeedLoss=", sbR, this.f127533g, this.f127534h);
            return com.airbnb.lottie.animation.keyframe.a.f(", hasStepSpeedLossPercent=", ")", sbR, this.f127535i, this.f127536j);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s0(int i14, String str, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, boolean z25) {
            super(null);
            str.getClass();
            this.f127527a = i14;
            this.f127528b = str;
            this.f127529c = z14;
            this.f127530d = z15;
            this.f127531e = z16;
            this.f127532f = z17;
            this.f127533g = z18;
            this.f127534h = z19;
            this.f127535i = z24;
            this.f127536j = z25;
        }

        public s0() {
            this(0, null, false, false, false, false, false, false, false, false, 1023, null);
        }
    }
}
