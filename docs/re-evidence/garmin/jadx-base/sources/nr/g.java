package nr;

import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.garmin.android.apps.connectmobile.repcounting.model.ExerciseSetsDTO;
import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ps.a2;
import ps.x1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0017\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001cB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0016\u001d\u001e\u001f !\"#$%&'()*+,-./012¨\u00063"}, d2 = {"Lnr/g;", "", "Ljr/k;", "itemType", "<init>", "(Ljr/k;)V", JWKParameterNames.RSA_EXPONENT, "f", "d", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "g", "b", "a", "m", "l", "o", "p", "c", JWKParameterNames.OCT_KEY_VALUE, JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "s", "v", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "w", JWKParameterNames.RSA_MODULUS, "u", "j", IntegerTokenConverter.CONVERTER_KEY, "h", "Lnr/g$a;", "Lnr/g$b;", "Lnr/g$c;", "Lnr/g$d;", "Lnr/g$e;", "Lnr/g$f;", "Lnr/g$g;", "Lnr/g$h;", "Lnr/g$j;", "Lnr/g$k;", "Lnr/g$l;", "Lnr/g$m;", "Lnr/g$n;", "Lnr/g$o;", "Lnr/g$p;", "Lnr/g$q;", "Lnr/g$r;", "Lnr/g$s;", "Lnr/g$t;", "Lnr/g$u;", "Lnr/g$v;", "Lnr/g$w;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class g {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lnr/g$c;", "Lnr/g;", "", "headLine", TtmlNode.TAG_BODY, "Lu4/d;", "icon", "actionPrimaryLabel", "Lkotlin/Function0;", "", "onDismiss", "onActionPrimaryClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lu4/d;Ljava/lang/String;Le23/a;Le23/a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f127046a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f127047b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u4.d f127048c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f127049d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final e23.a<Unit> f127050e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final e23.a<Unit> f127051f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, u4.d dVar, String str3, e23.a<Unit> aVar, e23.a<Unit> aVar2) {
            super(jr.k.BANNER, null);
            str.getClass();
            str2.getClass();
            dVar.getClass();
            str3.getClass();
            aVar.getClass();
            aVar2.getClass();
            this.f127046a = str;
            this.f127047b = str2;
            this.f127048c = dVar;
            this.f127049d = str3;
            this.f127050e = aVar;
            this.f127051f = aVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p005kotlin.jvm.internal.s.g(this.f127046a, cVar.f127046a) && p005kotlin.jvm.internal.s.g(this.f127047b, cVar.f127047b) && p005kotlin.jvm.internal.s.g(this.f127048c, cVar.f127048c) && p005kotlin.jvm.internal.s.g(this.f127049d, cVar.f127049d) && p005kotlin.jvm.internal.s.g(this.f127050e, cVar.f127050e) && p005kotlin.jvm.internal.s.g(this.f127051f, cVar.f127051f);
        }

        public final int hashCode() {
            return this.f127051f.hashCode() + q6.f.f(wr.g.j((this.f127048c.hashCode() + wr.g.j(this.f127046a.hashCode() * 31, 31, this.f127047b)) * 31, 31, this.f127049d), 31, this.f127050e);
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("BannerState(headLine=", this.f127046a, ", body=", this.f127047b, ", icon=");
            sbI.append(this.f127048c);
            sbI.append(", actionPrimaryLabel=");
            sbI.append(this.f127049d);
            sbI.append(", onDismiss=");
            sbI.append(this.f127050e);
            sbI.append(", onActionPrimaryClick=");
            sbI.append(this.f127051f);
            sbI.append(")");
            return sbI.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lnr/g$d;", "Lnr/g;", "", "activityTypeName", "Lkotlin/Function0;", "", "onAction", "onDismiss", "<init>", "(Ljava/lang/String;Le23/a;Le23/a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f127052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e23.a<Unit> f127053b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e23.a<Unit> f127054c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, e23.a<Unit> aVar, e23.a<Unit> aVar2) {
            super(jr.k.CONNECT_IQ_APP_PROMO, null);
            str.getClass();
            aVar.getClass();
            aVar2.getClass();
            this.f127052a = str;
            this.f127053b = aVar;
            this.f127054c = aVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return p005kotlin.jvm.internal.s.g(this.f127052a, dVar.f127052a) && p005kotlin.jvm.internal.s.g(this.f127053b, dVar.f127053b) && p005kotlin.jvm.internal.s.g(this.f127054c, dVar.f127054c);
        }

        public final int hashCode() {
            return this.f127054c.hashCode() + q6.f.f(this.f127052a.hashCode() * 31, 31, this.f127053b);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("ConnectIqAppPromoState(activityTypeName=");
            sb3.append(this.f127052a);
            sb3.append(", onAction=");
            sb3.append(this.f127053b);
            sb3.append(", onDismiss=");
            return n23.j.i(sb3, this.f127054c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lnr/g$h;", "Lnr/g;", "", "title", "", "Lnr/w;", "rows", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f127072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<nr.w> f127073b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, List<nr.w> list) {
            super(jr.k.DOGS, null);
            str.getClass();
            list.getClass();
            this.f127072a = str;
            this.f127073b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return p005kotlin.jvm.internal.s.g(this.f127072a, hVar.f127072a) && p005kotlin.jvm.internal.s.g(this.f127073b, hVar.f127073b);
        }

        public final int hashCode() {
            return this.f127073b.hashCode() + (this.f127072a.hashCode() * 31);
        }

        public final String toString() {
            return fb1.c.o("DogsState(title=", this.f127072a, ", rows=", this.f127073b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lnr/g$i;", "", "", "epicName", "dateRange", "distance", "totalActivityTime", "Lkotlin/Function0;", "", "onClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Le23/a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f127074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f127075b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f127076c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f127077d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final e23.a<Unit> f127078e;

        public i(String str, String str2, String str3, String str4, e23.a<Unit> aVar) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            aVar.getClass();
            this.f127074a = str;
            this.f127075b = str2;
            this.f127076c = str3;
            this.f127077d = str4;
            this.f127078e = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.f127074a.equals(iVar.f127074a) && this.f127075b.equals(iVar.f127075b) && this.f127076c.equals(iVar.f127076c) && this.f127077d.equals(iVar.f127077d) && this.f127078e.equals(iVar.f127078e);
        }

        public final int hashCode() {
            return this.f127078e.hashCode() + wr.g.j(wr.g.j(wr.g.j(this.f127074a.hashCode() * 31, 31, this.f127075b), 31, this.f127076c), 31, this.f127077d);
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("EpicItem(epicName=", this.f127074a, ", dateRange=", this.f127075b, ", distance=");
            sn.a.t(sbI, this.f127076c, ", totalActivityTime=", this.f127077d, ", onClick=");
            return n23.j.i(sbI, this.f127078e, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lnr/g$j;", "Lnr/g;", "Li53/c;", "Lnr/g$i;", "epics", "<init>", "(Li53/c;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class j extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i53.c<i> f127079a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i53.c<i> cVar) {
            super(jr.k.EPIC, null);
            cVar.getClass();
            this.f127079a = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && p005kotlin.jvm.internal.s.g(this.f127079a, ((j) obj).f127079a);
        }

        public final int hashCode() {
            return this.f127079a.hashCode();
        }

        public final String toString() {
            return "EpicState(epics=" + this.f127079a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lnr/g$n;", "Lnr/g;", "Lcom/garmin/android/apps/connectmobile/repcounting/model/ExerciseSetsDTO;", "exerciseSetsDto", "", "showHint", "Lxr/j;", "activityMuscleMapListener", "<init>", "(Lcom/garmin/android/apps/connectmobile/repcounting/model/ExerciseSetsDTO;ZLxr/j;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class n extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExerciseSetsDTO f127105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f127106b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final xr.j f127107c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ExerciseSetsDTO exerciseSetsDTO, boolean z14, xr.j jVar) {
            super(jr.k.MUSCLE_MAP, null);
            jVar.getClass();
            this.f127105a = exerciseSetsDTO;
            this.f127106b = z14;
            this.f127107c = jVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return p005kotlin.jvm.internal.s.g(this.f127105a, nVar.f127105a) && this.f127106b == nVar.f127106b && p005kotlin.jvm.internal.s.g(this.f127107c, nVar.f127107c);
        }

        public final int hashCode() {
            ExerciseSetsDTO exerciseSetsDTO = this.f127105a;
            return this.f127107c.hashCode() + q6.f.g((exerciseSetsDTO == null ? 0 : exerciseSetsDTO.hashCode()) * 31, 31, this.f127106b);
        }

        public final String toString() {
            return "MuscleMapState(exerciseSetsDto=" + this.f127105a + ", showHint=" + this.f127106b + ", activityMuscleMapListener=" + this.f127107c + ")";
        }
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00150\u0019¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lnr/g$t;", "Lnr/g;", "Lyo1/j;", "socialGroupRideResultsDTO", "", "Lps/x1;", "typedSplitsDTO", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/ActivityDetailChartDTO;", "chartDetails", "Lyo1/f;", "socialGroupRideCompetitionsResultsDTO", "", "activityName", "", "activityId", "groupRideUUID", "", "isOwnActivity", "Lps/a2;", "userInfo", "Lkotlin/Function0;", "", "onGroupRidePrivacyClick", "mySelfRemoved", "refreshSocialGroupRide", "Lkotlin/Function1;", "skipRefreshOnStart", "<init>", "(Lyo1/j;Ljava/util/List;Lcom/garmin/android/apps/connectmobile/activities/newmodel/ActivityDetailChartDTO;Lyo1/f;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ZLps/a2;Le23/a;Le23/a;Le23/a;Le23/l;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class t extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final yo1.j f127133a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<x1> f127134b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ActivityDetailChartDTO f127135c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final yo1.f f127136d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f127137e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Long f127138f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f127139g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f127140h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final a2 f127141i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final e23.a<Unit> f127142j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final e23.a<Unit> f127143k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final e23.a<Unit> f127144l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final e23.l<Boolean, Unit> f127145m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public t(yo1.j jVar, List<x1> list, ActivityDetailChartDTO activityDetailChartDTO, yo1.f fVar, String str, Long l14, String str2, boolean z14, a2 a2Var, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.l<? super Boolean, Unit> lVar) {
            super(jr.k.SOCIAL_GROUP_RIDE, null);
            jVar.getClass();
            aVar.getClass();
            aVar2.getClass();
            aVar3.getClass();
            lVar.getClass();
            this.f127133a = jVar;
            this.f127134b = list;
            this.f127135c = activityDetailChartDTO;
            this.f127136d = fVar;
            this.f127137e = str;
            this.f127138f = l14;
            this.f127139g = str2;
            this.f127140h = z14;
            this.f127141i = a2Var;
            this.f127142j = aVar;
            this.f127143k = aVar2;
            this.f127144l = aVar3;
            this.f127145m = lVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof t)) {
                return false;
            }
            t tVar = (t) obj;
            return p005kotlin.jvm.internal.s.g(this.f127133a, tVar.f127133a) && p005kotlin.jvm.internal.s.g(this.f127134b, tVar.f127134b) && p005kotlin.jvm.internal.s.g(this.f127135c, tVar.f127135c) && p005kotlin.jvm.internal.s.g(this.f127136d, tVar.f127136d) && p005kotlin.jvm.internal.s.g(this.f127137e, tVar.f127137e) && p005kotlin.jvm.internal.s.g(this.f127138f, tVar.f127138f) && p005kotlin.jvm.internal.s.g(this.f127139g, tVar.f127139g) && this.f127140h == tVar.f127140h && p005kotlin.jvm.internal.s.g(this.f127141i, tVar.f127141i) && p005kotlin.jvm.internal.s.g(this.f127142j, tVar.f127142j) && p005kotlin.jvm.internal.s.g(this.f127143k, tVar.f127143k) && p005kotlin.jvm.internal.s.g(this.f127144l, tVar.f127144l) && p005kotlin.jvm.internal.s.g(this.f127145m, tVar.f127145m);
        }

        public final int hashCode() {
            int iHashCode = this.f127133a.hashCode() * 31;
            List<x1> list = this.f127134b;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            ActivityDetailChartDTO activityDetailChartDTO = this.f127135c;
            int iHashCode3 = (iHashCode2 + (activityDetailChartDTO == null ? 0 : activityDetailChartDTO.hashCode())) * 31;
            yo1.f fVar = this.f127136d;
            int iHashCode4 = (iHashCode3 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            String str = this.f127137e;
            int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            Long l14 = this.f127138f;
            int iHashCode6 = (iHashCode5 + (l14 == null ? 0 : l14.hashCode())) * 31;
            String str2 = this.f127139g;
            int iG = q6.f.g((iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f127140h);
            a2 a2Var = this.f127141i;
            return this.f127145m.hashCode() + q6.f.f(q6.f.f(q6.f.f((iG + (a2Var != null ? a2Var.hashCode() : 0)) * 31, 31, this.f127142j), 31, this.f127143k), 31, this.f127144l);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("SocialGroupRideResultsState(socialGroupRideResultsDTO=");
            sb3.append(this.f127133a);
            sb3.append(", typedSplitsDTO=");
            sb3.append(this.f127134b);
            sb3.append(", chartDetails=");
            sb3.append(this.f127135c);
            sb3.append(", socialGroupRideCompetitionsResultsDTO=");
            sb3.append(this.f127136d);
            sb3.append(", activityName=");
            n23.j.q(this.f127138f, this.f127137e, ", activityId=", ", groupRideUUID=", sb3);
            v.h.C(this.f127139g, ", isOwnActivity=", ", userInfo=", sb3, this.f127140h);
            sb3.append(this.f127141i);
            sb3.append(", onGroupRidePrivacyClick=");
            sb3.append(this.f127142j);
            sb3.append(", mySelfRemoved=");
            sb3.append(this.f127143k);
            sb3.append(", refreshSocialGroupRide=");
            sb3.append(this.f127144l);
            sb3.append(", skipRefreshOnStart=");
            sb3.append(this.f127145m);
            sb3.append(")");
            return sb3.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lnr/g$v;", "Lnr/g;", "", "Lnr/s0;", "tags", "<init>", "(Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class v extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<s0> f127164a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(List<s0> list) {
            super(jr.k.TAGS, null);
            list.getClass();
            this.f127164a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && p005kotlin.jvm.internal.s.g(this.f127164a, ((v) obj).f127164a);
        }

        public final int hashCode() {
            return this.f127164a.hashCode();
        }

        public final String toString() {
            return tn.k.h("TagsState(tags=", ")", this.f127164a);
        }
    }

    public /* synthetic */ g(jr.k kVar, p005kotlin.jvm.internal.j jVar) {
        this(kVar);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\b\t\n\u000b\fB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lnr/g$u;", "Lnr/g;", "Lxr/i;", "exercisesTableListener", "Ljr/k;", "itemType", "<init>", "(Lxr/i;Ljr/k;)V", JWKParameterNames.RSA_EXPONENT, "d", "a", "c", "b", "Lnr/g$u$a;", "Lnr/g$u$b;", "Lnr/g$u$c;", "Lnr/g$u$d;", "Lnr/g$u$e;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class u extends g {

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lnr/g$u$a;", "Lnr/g$u;", "", "Lnr/b0;", "exerciseSets", "", "enableEditing", "enableAdding", "Lxr/i;", "exercisesTableListener", "<init>", "(Ljava/util/List;ZZLxr/i;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class a extends u {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List<b0> f127146a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f127147b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f127148c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final xr.i f127149d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<b0> list, boolean z14, boolean z15, xr.i iVar) {
                super(iVar, jr.k.EXERCISES_TABLE, null);
                iVar.getClass();
                this.f127146a = list;
                this.f127147b = z14;
                this.f127148c = z15;
                this.f127149d = iVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return p005kotlin.jvm.internal.s.g(this.f127146a, aVar.f127146a) && this.f127147b == aVar.f127147b && this.f127148c == aVar.f127148c && p005kotlin.jvm.internal.s.g(this.f127149d, aVar.f127149d);
            }

            public final int hashCode() {
                List<b0> list = this.f127146a;
                return this.f127149d.hashCode() + q6.f.g(q6.f.g((list == null ? 0 : list.hashCode()) * 31, 31, this.f127147b), 31, this.f127148c);
            }

            public final String toString() {
                return "Exercises(exerciseSets=" + this.f127146a + ", enableEditing=" + this.f127147b + ", enableAdding=" + this.f127148c + ", exercisesTableListener=" + this.f127149d + ")";
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lnr/g$u$b;", "Lnr/g$u;", "", "Lnr/c0;", "exerciseMoves", "", "enableEditing", "Lxr/i;", "exercisesTableListener", "<init>", "(Ljava/util/List;ZLxr/i;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class b extends u {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List<c0> f127150a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f127151b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final xr.i f127152c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(List<c0> list, boolean z14, xr.i iVar) {
                super(iVar, jr.k.MOBILITY_MOVES_TABLE, null);
                iVar.getClass();
                this.f127150a = list;
                this.f127151b = z14;
                this.f127152c = iVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return p005kotlin.jvm.internal.s.g(this.f127150a, bVar.f127150a) && this.f127151b == bVar.f127151b && p005kotlin.jvm.internal.s.g(this.f127152c, bVar.f127152c);
            }

            public final int hashCode() {
                List<c0> list = this.f127150a;
                return this.f127152c.hashCode() + q6.f.g((list == null ? 0 : list.hashCode()) * 31, 31, this.f127151b);
            }

            public final String toString() {
                return "MobilityMoves(exerciseMoves=" + this.f127150a + ", enableEditing=" + this.f127151b + ", exercisesTableListener=" + this.f127152c + ")";
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lnr/g$u$c;", "Lnr/g$u;", "", "Lnr/c0;", "exerciseMoves", "", "enableEditing", "Lxr/i;", "exercisesTableListener", "<init>", "(Ljava/util/List;ZLxr/i;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class c extends u {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List<c0> f127153a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f127154b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final xr.i f127155c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(List<c0> list, boolean z14, xr.i iVar) {
                super(iVar, jr.k.MOVES_TABLE, null);
                iVar.getClass();
                this.f127153a = list;
                this.f127154b = z14;
                this.f127155c = iVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return p005kotlin.jvm.internal.s.g(this.f127153a, cVar.f127153a) && this.f127154b == cVar.f127154b && p005kotlin.jvm.internal.s.g(this.f127155c, cVar.f127155c);
            }

            public final int hashCode() {
                List<c0> list = this.f127153a;
                return this.f127155c.hashCode() + q6.f.g((list == null ? 0 : list.hashCode()) * 31, 31, this.f127154b);
            }

            public final String toString() {
                return "Moves(exerciseMoves=" + this.f127153a + ", enableEditing=" + this.f127154b + ", exercisesTableListener=" + this.f127155c + ")";
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lnr/g$u$d;", "Lnr/g$u;", "", "Lnr/d0;", "exercisePoses", "", "enableEditing", "Lxr/i;", "exercisesTableListener", "<init>", "(Ljava/util/List;ZLxr/i;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class d extends u {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List<d0> f127156a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f127157b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final xr.i f127158c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(List<d0> list, boolean z14, xr.i iVar) {
                super(iVar, jr.k.POSES_TABLE, null);
                iVar.getClass();
                this.f127156a = list;
                this.f127157b = z14;
                this.f127158c = iVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return p005kotlin.jvm.internal.s.g(this.f127156a, dVar.f127156a) && this.f127157b == dVar.f127157b && p005kotlin.jvm.internal.s.g(this.f127158c, dVar.f127158c);
            }

            public final int hashCode() {
                List<d0> list = this.f127156a;
                return this.f127158c.hashCode() + q6.f.g((list == null ? 0 : list.hashCode()) * 31, 31, this.f127157b);
            }

            public final String toString() {
                return "Poses(exercisePoses=" + this.f127156a + ", enableEditing=" + this.f127157b + ", exercisesTableListener=" + this.f127158c + ")";
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lnr/g$u$e;", "Lnr/g$u;", "", "Lnr/e0;", "rounds", "Lcom/garmin/android/apps/connectmobile/repcounting/model/c;", "exerciseListDTO", "", "weightUnit", "", "enableEditing", "Lxr/i;", "exercisesTableListener", "<init>", "(Ljava/util/List;Lcom/garmin/android/apps/connectmobile/repcounting/model/c;Ljava/lang/String;ZLxr/i;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class e extends u {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List<e0> f127159a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final com.garmin.android.apps.connectmobile.repcounting.model.c f127160b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f127161c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final boolean f127162d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final xr.i f127163e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(List<e0> list, com.garmin.android.apps.connectmobile.repcounting.model.c cVar, String str, boolean z14, xr.i iVar) {
                super(iVar, jr.k.ROUNDS_TABLE, null);
                str.getClass();
                iVar.getClass();
                this.f127159a = list;
                this.f127160b = cVar;
                this.f127161c = str;
                this.f127162d = z14;
                this.f127163e = iVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return p005kotlin.jvm.internal.s.g(this.f127159a, eVar.f127159a) && p005kotlin.jvm.internal.s.g(this.f127160b, eVar.f127160b) && p005kotlin.jvm.internal.s.g(this.f127161c, eVar.f127161c) && this.f127162d == eVar.f127162d && p005kotlin.jvm.internal.s.g(this.f127163e, eVar.f127163e);
            }

            public final int hashCode() {
                List<e0> list = this.f127159a;
                int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
                com.garmin.android.apps.connectmobile.repcounting.model.c cVar = this.f127160b;
                return this.f127163e.hashCode() + q6.f.g(wr.g.j((iHashCode + (cVar != null ? cVar.hashCode() : 0)) * 31, 31, this.f127161c), 31, this.f127162d);
            }

            public final String toString() {
                StringBuilder sb3 = new StringBuilder("Rounds(rounds=");
                sb3.append(this.f127159a);
                sb3.append(", exerciseListDTO=");
                sb3.append(this.f127160b);
                sb3.append(", weightUnit=");
                v.h.C(this.f127161c, ", enableEditing=", ", exercisesTableListener=", sb3, this.f127162d);
                sb3.append(this.f127163e);
                sb3.append(")");
                return sb3.toString();
            }
        }

        private u(xr.i iVar, jr.k kVar) {
            super(kVar, null);
        }

        public /* synthetic */ u(xr.i iVar, jr.k kVar, p005kotlin.jvm.internal.j jVar) {
            this(iVar, kVar);
        }
    }

    private g(jr.k kVar) {
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lnr/g$f;", "Lnr/g;", "<init>", "()V", "a", "b", "Lnr/g$f$a;", "Lnr/g$f$b;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class f extends g {

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lnr/g$f$a;", "Lnr/g$f;", "Lkotlin/Function0;", "", "onAction", "<init>", "(Le23/a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class a extends f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final e23.a<Unit> f127062a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e23.a<Unit> aVar) {
                super(null);
                aVar.getClass();
                this.f127062a = aVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && p005kotlin.jvm.internal.s.g(this.f127062a, ((a) obj).f127062a);
            }

            public final int hashCode() {
                return this.f127062a.hashCode();
            }

            public final String toString() {
                return "DiveAppInstalled(onAction=" + this.f127062a + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lnr/g$f$b;", "Lnr/g$f;", "", "bodyImageResId", "Lkotlin/Function0;", "", "onAction", "<init>", "(ILe23/a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class b extends f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f127063a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final e23.a<Unit> f127064b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(int i14, e23.a<Unit> aVar) {
                super(null);
                aVar.getClass();
                this.f127063a = i14;
                this.f127064b = aVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f127063a == bVar.f127063a && p005kotlin.jvm.internal.s.g(this.f127064b, bVar.f127064b);
            }

            public final int hashCode() {
                return this.f127064b.hashCode() + (Integer.hashCode(this.f127063a) * 31);
            }

            public final String toString() {
                return "DiveAppNotInstalled(bodyImageResId=" + this.f127063a + ", onAction=" + this.f127064b + ")";
            }
        }

        private f() {
            super(jr.k.DIVE_APP_PROMO, null);
        }

        public /* synthetic */ f(p005kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lnr/g$q;", "Lnr/g;", "<init>", "()V", "a", "b", "Lnr/g$q$a;", "Lnr/g$q$b;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class q extends g {

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lnr/g$q$a;", "Lnr/g$q;", "Lkotlin/Function0;", "", "onAction", "<init>", "(Le23/a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class a extends q {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final e23.a<Unit> f127117a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e23.a<Unit> aVar) {
                super(null);
                aVar.getClass();
                this.f127117a = aVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && p005kotlin.jvm.internal.s.g(this.f127117a, ((a) obj).f127117a);
            }

            public final int hashCode() {
                return this.f127117a.hashCode();
            }

            public final String toString() {
                return "ShotViewAppInstalled(onAction=" + this.f127117a + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lnr/g$q$b;", "Lnr/g$q;", "", "bodyImageResId", "Lkotlin/Function0;", "", "onAction", "<init>", "(ILe23/a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class b extends q {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f127118a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final e23.a<Unit> f127119b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(int i14, e23.a<Unit> aVar) {
                super(null);
                aVar.getClass();
                this.f127118a = i14;
                this.f127119b = aVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f127118a == bVar.f127118a && p005kotlin.jvm.internal.s.g(this.f127119b, bVar.f127119b);
            }

            public final int hashCode() {
                return this.f127119b.hashCode() + (Integer.hashCode(this.f127118a) * 31);
            }

            public final String toString() {
                return "ShotViewAppNotInstalled(bodyImageResId=" + this.f127118a + ", onAction=" + this.f127119b + ")";
            }
        }

        private q() {
            super(jr.k.SHOTVIEW_APP_PROMO, null);
        }

        public /* synthetic */ q(p005kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lnr/g$k;", "Lnr/g;", "Ljr/j;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "title", "", "", FirebaseAnalytics.Param.ITEMS, "<init>", "(Ljr/j;Ljava/lang/String;Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class k extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final jr.j f127080a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f127081b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<Object> f127082c;

        public k(jr.j jVar, String str, List<Object> list) {
            super(jr.k.GROUP, null);
            this.f127080a = jVar;
            this.f127081b = str;
            this.f127082c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.f127080a == kVar.f127080a && p005kotlin.jvm.internal.s.g(this.f127081b, kVar.f127081b) && p005kotlin.jvm.internal.s.g(this.f127082c, kVar.f127082c);
        }

        public final int hashCode() {
            jr.j jVar = this.f127080a;
            int iHashCode = (jVar == null ? 0 : jVar.hashCode()) * 31;
            String str = this.f127081b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            List<Object> list = this.f127082c;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("GroupState(type=");
            sb3.append(this.f127080a);
            sb3.append(", title=");
            sb3.append(this.f127081b);
            sb3.append(", items=");
            return u62.z.c(sb3, this.f127082c, ")");
        }

        public /* synthetic */ k(jr.j jVar, String str, List list, int i14, p005kotlin.jvm.internal.j jVar2) {
            this((i14 & 1) != 0 ? null : jVar, str, list);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lnr/g$o;", "Lnr/g;", "Ljr/k;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "Lnr/l0;", "stats", "", "isPrimary", "<init>", "(Ljr/k;Ljava/util/List;Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class o extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final jr.k f127108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<l0> f127109b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f127110c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(jr.k kVar, List<l0> list, boolean z14) {
            super(kVar, null);
            kVar.getClass();
            this.f127108a = kVar;
            this.f127109b = list;
            this.f127110c = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return this.f127108a == oVar.f127108a && p005kotlin.jvm.internal.s.g(this.f127109b, oVar.f127109b) && this.f127110c == oVar.f127110c;
        }

        public final int hashCode() {
            int iHashCode = this.f127108a.hashCode() * 31;
            List<l0> list = this.f127109b;
            return Boolean.hashCode(this.f127110c) + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("OverviewStatsState(type=");
            sb3.append(this.f127108a);
            sb3.append(", stats=");
            sb3.append(this.f127109b);
            sb3.append(", isPrimary=");
            return hb.a.k(sb3, this.f127110c, ")");
        }

        public /* synthetic */ o(jr.k kVar, List list, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
            this(kVar, list, (i14 & 4) != 0 ? false : z14);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lnr/g$a;", "Lnr/g;", "", "title", "", "Lnr/i0;", "rows", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f127042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<i0> f127043b;

        public /* synthetic */ a(String str, List list, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : list);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p005kotlin.jvm.internal.s.g(this.f127042a, aVar.f127042a) && p005kotlin.jvm.internal.s.g(this.f127043b, aVar.f127043b);
        }

        public final int hashCode() {
            String str = this.f127042a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<i0> list = this.f127043b;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            return fb1.c.o("ActivityLegsState(title=", this.f127042a, ", rows=", this.f127043b, ")");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public a(String str, List<i0> list) {
            super(jr.k.ACTIVITY_LEGS, null);
            this.f127042a = str;
            this.f127043b = list;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lnr/g$b;", "Lnr/g;", "", "title", "", "Lnr/i0;", "rows", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f127044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<i0> f127045b;

        public /* synthetic */ b(String str, List list, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : list);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f127044a, bVar.f127044a) && p005kotlin.jvm.internal.s.g(this.f127045b, bVar.f127045b);
        }

        public final int hashCode() {
            String str = this.f127044a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<i0> list = this.f127045b;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            return fb1.c.o("BadgeState(title=", this.f127044a, ", rows=", this.f127045b, ")");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public b(String str, List<i0> list) {
            super(jr.k.BADGES, null);
            this.f127044a = str;
            this.f127045b = list;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lnr/g$l;", "Lnr/g;", "", "activityId", "Lwg0/l;", "activityMediaData", "Lxg0/n;", "mediaEventListener", "", "isLoading", "<init>", "(JLwg0/l;Lxg0/n;Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class l extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f127083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final wg0.l f127084b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final xg0.n f127085c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f127086d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(long j8, wg0.l lVar, xg0.n nVar, boolean z14) {
            super(jr.k.MEDIA, null);
            nVar.getClass();
            this.f127083a = j8;
            this.f127084b = lVar;
            this.f127085c = nVar;
            this.f127086d = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return this.f127083a == lVar.f127083a && p005kotlin.jvm.internal.s.g(this.f127084b, lVar.f127084b) && p005kotlin.jvm.internal.s.g(this.f127085c, lVar.f127085c) && this.f127086d == lVar.f127086d;
        }

        public final int hashCode() {
            int iHashCode = Long.hashCode(this.f127083a) * 31;
            wg0.l lVar = this.f127084b;
            return Boolean.hashCode(this.f127086d) + ((this.f127085c.hashCode() + ((iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            return "MediaState(activityId=" + this.f127083a + ", activityMediaData=" + this.f127084b + ", mediaEventListener=" + this.f127085c + ", isLoading=" + this.f127086d + ")";
        }

        public /* synthetic */ l(long j8, wg0.l lVar, xg0.n nVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
            this(j8, (i14 & 2) != 0 ? null : lVar, nVar, z14);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lnr/g$r;", "Lnr/g;", "Ljr/k;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "title", "Lu4/d;", "icon", "text", "<init>", "(Ljr/k;Ljava/lang/String;Lu4/d;Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class r extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final jr.k f127120a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f127121b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u4.d f127122c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f127123d;

        public /* synthetic */ r(jr.k kVar, String str, u4.d dVar, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
            this(kVar, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : dVar, (i14 & 8) != 0 ? "" : str2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return this.f127120a == rVar.f127120a && p005kotlin.jvm.internal.s.g(this.f127121b, rVar.f127121b) && p005kotlin.jvm.internal.s.g(this.f127122c, rVar.f127122c) && p005kotlin.jvm.internal.s.g(this.f127123d, rVar.f127123d);
        }

        public final int hashCode() {
            int iHashCode = this.f127120a.hashCode() * 31;
            String str = this.f127121b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            u4.d dVar = this.f127122c;
            return this.f127123d.hashCode() + ((iHashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "SingleRowSectionState(type=" + this.f127120a + ", title=" + this.f127121b + ", icon=" + this.f127122c + ", text=" + this.f127123d + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(jr.k kVar, String str, u4.d dVar, String str2) {
            super(kVar, null);
            kVar.getClass();
            str2.getClass();
            this.f127120a = kVar;
            this.f127121b = str;
            this.f127122c = dVar;
            this.f127123d = str2;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lnr/g$p;", "Lnr/g;", "", "headLine", TtmlNode.TAG_BODY, "Lu4/d;", "icon", "actionPrimaryLabel", "Lkotlin/Function0;", "", "onDismiss", "onActionPrimaryClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lu4/d;Ljava/lang/String;Le23/a;Le23/a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class p extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f127111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f127112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u4.d f127113c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f127114d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final e23.a<Unit> f127115e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final e23.a<Unit> f127116f;

        public /* synthetic */ p(String str, String str2, u4.d dVar, String str3, e23.a aVar, e23.a aVar2, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, (i14 & 2) != 0 ? null : str2, dVar, (i14 & 8) != 0 ? null : str3, aVar, (i14 & 32) != 0 ? null : aVar2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return p005kotlin.jvm.internal.s.g(this.f127111a, pVar.f127111a) && p005kotlin.jvm.internal.s.g(this.f127112b, pVar.f127112b) && p005kotlin.jvm.internal.s.g(this.f127113c, pVar.f127113c) && p005kotlin.jvm.internal.s.g(this.f127114d, pVar.f127114d) && p005kotlin.jvm.internal.s.g(this.f127115e, pVar.f127115e) && p005kotlin.jvm.internal.s.g(this.f127116f, pVar.f127116f);
        }

        public final int hashCode() {
            int iHashCode = this.f127111a.hashCode() * 31;
            String str = this.f127112b;
            int iHashCode2 = (this.f127113c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            String str2 = this.f127114d;
            int iF = q6.f.f((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f127115e);
            e23.a<Unit> aVar = this.f127116f;
            return iF + (aVar != null ? aVar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("PhysioMetricsState(headLine=", this.f127111a, ", body=", this.f127112b, ", icon=");
            sbI.append(this.f127113c);
            sbI.append(", actionPrimaryLabel=");
            sbI.append(this.f127114d);
            sbI.append(", onDismiss=");
            sbI.append(this.f127115e);
            sbI.append(", onActionPrimaryClick=");
            sbI.append(this.f127116f);
            sbI.append(")");
            return sbI.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String str, String str2, u4.d dVar, String str3, e23.a<Unit> aVar, e23.a<Unit> aVar2) {
            super(jr.k.PHYSIO_METRICS_INFO, null);
            str.getClass();
            dVar.getClass();
            aVar.getClass();
            this.f127111a = str;
            this.f127112b = str2;
            this.f127113c = dVar;
            this.f127114d = str3;
            this.f127115e = aVar;
            this.f127116f = aVar2;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lnr/g$e;", "Lnr/g;", "", "isOwnActivity", "", "notes", "supportsNotesEditing", "supportsTitleEditing", "isActivityProcessing", "title", "Lkotlin/Function2;", "", "onSave", "<init>", "(ZLjava/lang/String;ZZZLjava/lang/String;Le23/p;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f127055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f127056b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f127057c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f127058d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f127059e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f127060f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final e23.p<String, String, Unit> f127061g;

        public /* synthetic */ e(boolean z14, String str, boolean z15, boolean z16, boolean z17, String str2, e23.p pVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this(z14, str, (i14 & 4) != 0 ? false : z15, (i14 & 8) != 0 ? false : z16, (i14 & 16) != 0 ? false : z17, str2, pVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f127055a == eVar.f127055a && p005kotlin.jvm.internal.s.g(this.f127056b, eVar.f127056b) && this.f127057c == eVar.f127057c && this.f127058d == eVar.f127058d && this.f127059e == eVar.f127059e && p005kotlin.jvm.internal.s.g(this.f127060f, eVar.f127060f) && p005kotlin.jvm.internal.s.g(this.f127061g, eVar.f127061g);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f127055a) * 31;
            String str = this.f127056b;
            int iG = q6.f.g(q6.f.g(q6.f.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f127057c), 31, this.f127058d), 31, this.f127059e);
            String str2 = this.f127060f;
            return this.f127061g.hashCode() + ((iG + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("DescriptionState(isOwnActivity=");
            sb3.append(this.f127055a);
            sb3.append(", notes=");
            sb3.append(this.f127056b);
            sb3.append(", supportsNotesEditing=");
            kg.f.q(", supportsTitleEditing=", ", isActivityProcessing=", sb3, this.f127057c, this.f127058d);
            fb1.c.w(", title=", this.f127060f, ", onSave=", sb3, this.f127059e);
            sb3.append(this.f127061g);
            sb3.append(")");
            return sb3.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(boolean z14, String str, boolean z15, boolean z16, boolean z17, String str2, e23.p<? super String, ? super String, Unit> pVar) {
            super(jr.k.TITLE_AND_NOTES, null);
            pVar.getClass();
            this.f127055a = z14;
            this.f127056b = str;
            this.f127057c = z15;
            this.f127058d = z16;
            this.f127059e = z17;
            this.f127060f = str2;
            this.f127061g = pVar;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lnr/g$s;", "Lnr/g;", "", "isOwnActivity", "showShareHint", "", "activityId", "Lwg0/m;", "activitySocialData", "Lxg0/a;", "conversationEventListener", "isActivityProcessing", "Lkotlin/Function0;", "", "onAddPhoto", "onDismissShareHint", "onShare", "<init>", "(ZZJLwg0/m;Lxg0/a;ZLe23/a;Le23/a;Le23/a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class s extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f127124a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f127125b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f127126c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final wg0.m f127127d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final xg0.a f127128e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f127129f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final e23.a<Unit> f127130g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final e23.a<Unit> f127131h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final e23.a<Unit> f127132i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(boolean z14, boolean z15, long j8, wg0.m mVar, xg0.a aVar, boolean z16, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.a<Unit> aVar4) {
            super(jr.k.SOCIAL_ENGAGEMENT, null);
            mVar.getClass();
            aVar.getClass();
            aVar3.getClass();
            this.f127124a = z14;
            this.f127125b = z15;
            this.f127126c = j8;
            this.f127127d = mVar;
            this.f127128e = aVar;
            this.f127129f = z16;
            this.f127130g = aVar2;
            this.f127131h = aVar3;
            this.f127132i = aVar4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            s sVar = (s) obj;
            return this.f127124a == sVar.f127124a && this.f127125b == sVar.f127125b && this.f127126c == sVar.f127126c && p005kotlin.jvm.internal.s.g(this.f127127d, sVar.f127127d) && p005kotlin.jvm.internal.s.g(this.f127128e, sVar.f127128e) && this.f127129f == sVar.f127129f && p005kotlin.jvm.internal.s.g(this.f127130g, sVar.f127130g) && p005kotlin.jvm.internal.s.g(this.f127131h, sVar.f127131h) && p005kotlin.jvm.internal.s.g(this.f127132i, sVar.f127132i);
        }

        public final int hashCode() {
            int iG = q6.f.g((this.f127128e.hashCode() + ((this.f127127d.hashCode() + q6.f.e(q6.f.g(Boolean.hashCode(this.f127124a) * 31, 31, this.f127125b), 31, this.f127126c)) * 31)) * 31, 31, this.f127129f);
            e23.a<Unit> aVar = this.f127130g;
            int iF = q6.f.f((iG + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f127131h);
            e23.a<Unit> aVar2 = this.f127132i;
            return iF + (aVar2 != null ? aVar2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("SocialEngagementState(isOwnActivity=", ", showShareHint=", ", activityId=", this.f127124a, this.f127125b);
            sbM.append(this.f127126c);
            sbM.append(", activitySocialData=");
            sbM.append(this.f127127d);
            sbM.append(", conversationEventListener=");
            sbM.append(this.f127128e);
            sbM.append(", isActivityProcessing=");
            sbM.append(this.f127129f);
            sbM.append(", onAddPhoto=");
            sbM.append(this.f127130g);
            sbM.append(", onDismissShareHint=");
            sbM.append(this.f127131h);
            sbM.append(", onShare=");
            sbM.append(this.f127132i);
            sbM.append(")");
            return sbM.toString();
        }

        public /* synthetic */ s(boolean z14, boolean z15, long j8, wg0.m mVar, xg0.a aVar, boolean z16, e23.a aVar2, e23.a aVar3, e23.a aVar4, int i14, p005kotlin.jvm.internal.j jVar) {
            this(z14, z15, j8, mVar, aVar, z16, (i14 & 64) != 0 ? null : aVar2, aVar3, (i14 & 256) != 0 ? null : aVar4);
        }
    }

    /* JADX INFO: renamed from: nr.g$g, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lnr/g$g;", "Lnr/g;", "", "isDecoDive", "", "averageDepth", "maxDepth", "surfaceTime", "startTime", "endTime", "bottomTime", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C2446g extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f127065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f127066b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f127067c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f127068d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f127069e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f127070f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f127071g;

        public /* synthetic */ C2446g(boolean z14, String str, String str2, String str3, String str4, String str5, String str6, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : str4, (i14 & 32) != 0 ? null : str5, (i14 & 64) != 0 ? null : str6);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2446g)) {
                return false;
            }
            C2446g c2446g = (C2446g) obj;
            return this.f127065a == c2446g.f127065a && p005kotlin.jvm.internal.s.g(this.f127066b, c2446g.f127066b) && p005kotlin.jvm.internal.s.g(this.f127067c, c2446g.f127067c) && p005kotlin.jvm.internal.s.g(this.f127068d, c2446g.f127068d) && p005kotlin.jvm.internal.s.g(this.f127069e, c2446g.f127069e) && p005kotlin.jvm.internal.s.g(this.f127070f, c2446g.f127070f) && p005kotlin.jvm.internal.s.g(this.f127071g, c2446g.f127071g);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f127065a) * 31;
            String str = this.f127066b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f127067c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f127068d;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f127069e;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f127070f;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f127071g;
            return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("DivingDepthState(isDecoDive=");
            sb3.append(this.f127065a);
            sb3.append(", averageDepth=");
            sb3.append(this.f127066b);
            sb3.append(", maxDepth=");
            sn.a.t(sb3, this.f127067c, ", surfaceTime=", this.f127068d, ", startTime=");
            sn.a.t(sb3, this.f127069e, ", endTime=", this.f127070f, ", bottomTime=");
            return am.j.o(this.f127071g, ")", sb3);
        }

        public C2446g() {
            this(false, null, null, null, null, null, null, 127, null);
        }

        public C2446g(boolean z14, String str, String str2, String str3, String str4, String str5, String str6) {
            super(jr.k.DIVING_DEPTH, null);
            this.f127065a = z14;
            this.f127066b = str;
            this.f127067c = str2;
            this.f127068d = str3;
            this.f127069e = str4;
            this.f127070f = str5;
            this.f127071g = str6;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bµ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\u001c\b\u0002\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lnr/g$w;", "Lnr/g;", "", "linkedTrailId", "", "linkedTrailName", "linkedTrailLocation", "linkedTrailCoverPhotoUrl", "", "isUserOwnedActivity", "Lkotlin/Function0;", "", "onLinkedTrailClicked", "onRemoveTrailClicked", "shouldShowRatingComponent", "", "reviewRating", "reviewDate", "reviewerProfileImageUrl", "reviewIsAnonymous", "reviewIsHidden", "Lkotlin/Function1;", "Lcom/garmin/android/apps/connectmobile/ui/composable/ReviewStarsChangedCallback;", "onReviewClicked", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLe23/a;Le23/a;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Le23/l;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class w extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f127165a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f127166b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f127167c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f127168d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f127169e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final e23.a<Unit> f127170f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final e23.a<Unit> f127171g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f127172h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Integer f127173i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f127174j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final String f127175k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Boolean f127176l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Boolean f127177m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final e23.l<Integer, Unit> f127178n;

        public /* synthetic */ w(long j8, String str, String str2, String str3, boolean z14, e23.a aVar, e23.a aVar2, boolean z15, Integer num, String str4, String str5, Boolean bool, Boolean bool2, e23.l lVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this(j8, str, str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? true : z14, aVar, aVar2, (i14 & 128) != 0 ? false : z15, (i14 & 256) != 0 ? null : num, (i14 & 512) != 0 ? null : str4, (i14 & 1024) != 0 ? null : str5, (i14 & 2048) != 0 ? null : bool, (i14 & 4096) != 0 ? null : bool2, (i14 & 8192) != 0 ? null : lVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!w.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            obj.getClass();
            w wVar = (w) obj;
            return this.f127165a == wVar.f127165a && p005kotlin.jvm.internal.s.g(this.f127166b, wVar.f127166b) && p005kotlin.jvm.internal.s.g(this.f127167c, wVar.f127167c) && p005kotlin.jvm.internal.s.g(this.f127168d, wVar.f127168d) && this.f127172h == wVar.f127172h && p005kotlin.jvm.internal.s.g(this.f127173i, wVar.f127173i) && p005kotlin.jvm.internal.s.g(this.f127174j, wVar.f127174j) && p005kotlin.jvm.internal.s.g(this.f127175k, wVar.f127175k);
        }

        public final int hashCode() {
            int iJ = wr.g.j(wr.g.j(Long.hashCode(this.f127165a) * 31, 31, this.f127166b), 31, this.f127167c);
            String str = this.f127168d;
            int iG = q6.f.g((iJ + (str != null ? str.hashCode() : 0)) * 31, 31, this.f127172h);
            Integer num = this.f127173i;
            int iIntValue = (iG + (num != null ? num.intValue() : 0)) * 31;
            String str2 = this.f127174j;
            int iHashCode = (iIntValue + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f127175k;
            return iHashCode + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f127165a, "TrailsState(linkedTrailId=", ", linkedTrailName=", this.f127166b);
            sn.a.t(sbK, ", linkedTrailLocation=", this.f127167c, ", linkedTrailCoverPhotoUrl=", this.f127168d);
            sbK.append(", isUserOwnedActivity=");
            sbK.append(this.f127169e);
            sbK.append(", onLinkedTrailClicked=");
            sbK.append(this.f127170f);
            sbK.append(", onRemoveTrailClicked=");
            sbK.append(this.f127171g);
            sbK.append(", shouldShowRatingComponent=");
            sbK.append(this.f127172h);
            sbK.append(", reviewRating=");
            sbK.append(this.f127173i);
            sbK.append(", reviewDate=");
            sbK.append(this.f127174j);
            sbK.append(", reviewerProfileImageUrl=");
            sbK.append(this.f127175k);
            sbK.append(", reviewIsAnonymous=");
            sbK.append(this.f127176l);
            sbK.append(", reviewIsHidden=");
            sbK.append(this.f127177m);
            sbK.append(", onReviewClicked=");
            sbK.append(this.f127178n);
            sbK.append(")");
            return sbK.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public w(long j8, String str, String str2, String str3, boolean z14, e23.a<Unit> aVar, e23.a<Unit> aVar2, boolean z15, Integer num, String str4, String str5, Boolean bool, Boolean bool2, e23.l<? super Integer, Unit> lVar) {
            super(jr.k.TRAILS, null);
            str.getClass();
            str2.getClass();
            aVar.getClass();
            aVar2.getClass();
            this.f127165a = j8;
            this.f127166b = str;
            this.f127167c = str2;
            this.f127168d = str3;
            this.f127169e = z14;
            this.f127170f = aVar;
            this.f127171g = aVar2;
            this.f127172h = z15;
            this.f127173i = num;
            this.f127174j = str4;
            this.f127175k = str5;
            this.f127176l = bool;
            this.f127177m = bool2;
            this.f127178n = lVar;
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001Bã\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lnr/g$m;", "Lnr/g;", "", "isOwnActivity", "Lam/x0;", "activityType", "", "activityTypeLabel", "", "favoriteResId", "favoriteResColor", "Lkotlin/Function0;", "", "onToggleFavorite", "onUserPhotoClick", "Lkotlin/Function1;", "Lcom/garmin/android/apps/connectmobile/activities/PrivacyType;", "onNavigateToPrivacy", "privacyDescriptionText", "privacyType", "startDateTimeLocal", "supportsFavoriteUpdate", "supportsPhotoUpdate", "supportsPrivacyUpdate", "supportsVideoUpdate", "Lb12/b;", "userProfileImageData", "fullName", "isActivityProcessing", "<init>", "(ZLam/x0;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Le23/a;Le23/a;Le23/l;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/activities/PrivacyType;Ljava/lang/String;ZZZZLb12/b;Ljava/lang/String;Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class m extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f127087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final am.x0 f127088b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f127089c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Integer f127090d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Integer f127091e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final e23.a<Unit> f127092f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final e23.a<Unit> f127093g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final e23.l<PrivacyType, Unit> f127094h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f127095i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final PrivacyType f127096j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final String f127097k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f127098l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f127099m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f127100n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final boolean f127101o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final b12.b f127102p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final String f127103q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final boolean f127104r;

        static {
            Parcelable.Creator<b12.b> creator = b12.b.CREATOR;
        }

        public /* synthetic */ m(boolean z14, am.x0 x0Var, String str, Integer num, Integer num2, e23.a aVar, e23.a aVar2, e23.l lVar, String str2, PrivacyType privacyType, String str3, boolean z15, boolean z16, boolean z17, boolean z18, b12.b bVar, String str4, boolean z19, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? null : x0Var, (i14 & 4) != 0 ? "" : str, (i14 & 8) != 0 ? null : num, (i14 & 16) != 0 ? null : num2, (i14 & 32) != 0 ? null : aVar, (i14 & 64) != 0 ? null : aVar2, (i14 & 128) != 0 ? null : lVar, (i14 & 256) == 0 ? str2 : "", (i14 & 512) != 0 ? PrivacyType.ONLY_ME : privacyType, (i14 & 1024) != 0 ? null : str3, (i14 & 2048) != 0 ? false : z15, (i14 & 4096) != 0 ? false : z16, (i14 & 8192) != 0 ? false : z17, (i14 & 16384) != 0 ? false : z18, (i14 & 32768) != 0 ? b12.b.f14386g : bVar, (i14 & 65536) != 0 ? null : str4, (i14 & 131072) != 0 ? false : z19);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return this.f127087a == mVar.f127087a && this.f127088b == mVar.f127088b && p005kotlin.jvm.internal.s.g(this.f127089c, mVar.f127089c) && p005kotlin.jvm.internal.s.g(this.f127090d, mVar.f127090d) && p005kotlin.jvm.internal.s.g(this.f127091e, mVar.f127091e) && p005kotlin.jvm.internal.s.g(this.f127092f, mVar.f127092f) && p005kotlin.jvm.internal.s.g(this.f127093g, mVar.f127093g) && p005kotlin.jvm.internal.s.g(this.f127094h, mVar.f127094h) && p005kotlin.jvm.internal.s.g(this.f127095i, mVar.f127095i) && this.f127096j == mVar.f127096j && p005kotlin.jvm.internal.s.g(this.f127097k, mVar.f127097k) && this.f127098l == mVar.f127098l && this.f127099m == mVar.f127099m && this.f127100n == mVar.f127100n && this.f127101o == mVar.f127101o && p005kotlin.jvm.internal.s.g(this.f127102p, mVar.f127102p) && p005kotlin.jvm.internal.s.g(this.f127103q, mVar.f127103q) && this.f127104r == mVar.f127104r;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f127087a) * 31;
            am.x0 x0Var = this.f127088b;
            int iJ = wr.g.j((iHashCode + (x0Var == null ? 0 : x0Var.hashCode())) * 31, 31, this.f127089c);
            Integer num = this.f127090d;
            int iHashCode2 = (iJ + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f127091e;
            int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            e23.a<Unit> aVar = this.f127092f;
            int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            e23.a<Unit> aVar2 = this.f127093g;
            int iHashCode5 = (iHashCode4 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
            e23.l<PrivacyType, Unit> lVar = this.f127094h;
            int iHashCode6 = (this.f127096j.hashCode() + wr.g.j((iHashCode5 + (lVar == null ? 0 : lVar.hashCode())) * 31, 31, this.f127095i)) * 31;
            String str = this.f127097k;
            int iHashCode7 = (this.f127102p.hashCode() + q6.f.g(q6.f.g(q6.f.g(q6.f.g((iHashCode6 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f127098l), 31, this.f127099m), 31, this.f127100n), 31, this.f127101o)) * 31;
            String str2 = this.f127103q;
            return Boolean.hashCode(this.f127104r) + ((iHashCode7 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("MetaDataState(isOwnActivity=");
            sb3.append(this.f127087a);
            sb3.append(", activityType=");
            sb3.append(this.f127088b);
            sb3.append(", activityTypeLabel=");
            fb1.c.u(this.f127090d, this.f127089c, ", favoriteResId=", ", favoriteResColor=", sb3);
            sb3.append(this.f127091e);
            sb3.append(", onToggleFavorite=");
            sb3.append(this.f127092f);
            sb3.append(", onUserPhotoClick=");
            sb3.append(this.f127093g);
            sb3.append(", onNavigateToPrivacy=");
            sb3.append(this.f127094h);
            sb3.append(", privacyDescriptionText=");
            sb3.append(this.f127095i);
            sb3.append(", privacyType=");
            sb3.append(this.f127096j);
            sb3.append(", startDateTimeLocal=");
            v.h.C(this.f127097k, ", supportsFavoriteUpdate=", ", supportsPhotoUpdate=", sb3, this.f127098l);
            kg.f.q(", supportsPrivacyUpdate=", ", supportsVideoUpdate=", sb3, this.f127099m, this.f127100n);
            sb3.append(this.f127101o);
            sb3.append(", userProfileImageData=");
            sb3.append(this.f127102p);
            sb3.append(", fullName=");
            return am.j.n(this.f127103q, ", isActivityProcessing=", ")", sb3, this.f127104r);
        }

        public m() {
            this(false, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, false, 262143, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public m(boolean z14, am.x0 x0Var, String str, Integer num, Integer num2, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.l<? super PrivacyType, Unit> lVar, String str2, PrivacyType privacyType, String str3, boolean z15, boolean z16, boolean z17, boolean z18, b12.b bVar, String str4, boolean z19) {
            super(jr.k.METADATA, null);
            str.getClass();
            str2.getClass();
            privacyType.getClass();
            bVar.getClass();
            this.f127087a = z14;
            this.f127088b = x0Var;
            this.f127089c = str;
            this.f127090d = num;
            this.f127091e = num2;
            this.f127092f = aVar;
            this.f127093g = aVar2;
            this.f127094h = lVar;
            this.f127095i = str2;
            this.f127096j = privacyType;
            this.f127097k = str3;
            this.f127098l = z15;
            this.f127099m = z16;
            this.f127100n = z17;
            this.f127101o = z18;
            this.f127102p = bVar;
            this.f127103q = str4;
            this.f127104r = z19;
        }
    }
}
