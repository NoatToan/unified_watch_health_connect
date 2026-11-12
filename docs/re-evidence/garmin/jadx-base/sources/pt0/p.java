package pt0;

import android.content.Intent;
import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.s0;
import java.util.Arrays;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import yt0.r0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0007\bB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lpt0/p;", "Landroidx/lifecycle/u1;", "", "Lyt0/r0;", "badgeChallengeRepo", "<init>", "(Lyt0/r0;)V", "a", "b", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p extends u1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f140753l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f140754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f140755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0<g3<com.garmin.android.apps.connectmobile.leaderboard.model.p>> f140756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0 f140757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y0<com.garmin.android.apps.connectmobile.y<g3<b>>> f140758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y0 f140759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y0<g3<com.garmin.android.apps.connectmobile.leaderboard.model.p>> f140760g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y0 f140761h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y0<g3<String>> f140762i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y0 f140763j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Intent f140764k;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lpt0/p$b;", "", "", "badgeChallengeUuid", "", "badgeId", "", "isPremium", "Lorg/joda/time/DateTime;", "challengeEndDate", "<init>", "(Ljava/lang/String;JZLorg/joda/time/DateTime;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f140765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f140766b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f140767c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DateTime f140768d;

        public b(String str, long j8, boolean z14, DateTime dateTime) {
            str.getClass();
            this.f140765a = str;
            this.f140766b = j8;
            this.f140767c = z14;
            this.f140768d = dateTime;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f140765a.equals(bVar.f140765a) && this.f140766b == bVar.f140766b && this.f140767c == bVar.f140767c && p005kotlin.jvm.internal.s.g(this.f140768d, bVar.f140768d);
        }

        public final int hashCode() {
            int iG = q6.f.g(q6.f.e(this.f140765a.hashCode() * 31, 31, this.f140766b), 31, this.f140767c);
            DateTime dateTime = this.f140768d;
            return iG + (dateTime == null ? 0 : dateTime.hashCode());
        }

        public final String toString() {
            StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(this.f140766b, "OptInResult(badgeChallengeUuid=", this.f140765a, ", badgeId=");
            sbJ.append(", isPremium=");
            sbJ.append(this.f140767c);
            sbJ.append(", challengeEndDate=");
            sbJ.append(this.f140768d);
            sbJ.append(")");
            return sbJ.toString();
        }
    }

    static {
        new a(null);
    }

    public p(r0 r0Var) {
        r0Var.getClass();
        this.f140754a = new y();
        this.f140755b = r0Var;
        y0<g3<com.garmin.android.apps.connectmobile.leaderboard.model.p>> y0Var = new y0<>();
        this.f140756c = y0Var;
        this.f140757d = y0Var;
        y0<com.garmin.android.apps.connectmobile.y<g3<b>>> y0Var2 = new y0<>();
        this.f140758e = y0Var2;
        this.f140759f = y0Var2;
        y0<g3<com.garmin.android.apps.connectmobile.leaderboard.model.p>> y0Var3 = new y0<>();
        this.f140760g = y0Var3;
        this.f140761h = y0Var3;
        y0<g3<String>> y0Var4 = new y0<>();
        this.f140762i = y0Var4;
        this.f140763j = y0Var4;
        this.f140764k = new Intent();
    }

    public static final void x4(p pVar, long j8) {
        pVar.getClass();
        ((s0) KoinJavaComponent.get$default(s0.class, null, null, 6, null)).b(String.format(zy0.a.GET_FOLLOWINGS_BADGE_DETAILS.f207440a, Arrays.copyOf(new Object[]{Long.valueOf(j8), 6}, 2)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpt0/p$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
