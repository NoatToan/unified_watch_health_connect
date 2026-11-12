package zt0;

import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import c22.j0;
import c22.l2;
import c83.h;
import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengeDTO;
import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengePlayerDTO;
import com.garmin.android.apps.connectmobile.leaderboard.model.u;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import mt0.t;
import mt0.v;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lzt0/a;", "Landroidx/lifecycle/u1;", "<init>", "()V", "b", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yt0.a f206930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdHocChallengeDTO f206931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kt0.a f206932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public DateTime f206933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DateTime f206934e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f206935f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u f206936g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y0<Boolean> f206937h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y0<b> f206938i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y0<Boolean> f206939j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y0<AdHocChallengeDTO> f206940k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l2<Unit> f206941l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y0<b> f206942m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final v f206943n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f206944o;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzt0/a$b;", "", "", "isFromConfirm", "isDurationTypeChanged", "<init>", "(ZZ)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f206945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f206946b;

        public b(boolean z14, boolean z15) {
            this.f206945a = z14;
            this.f206946b = z15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f206945a == bVar.f206945a && this.f206946b == bVar.f206946b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f206946b) + (Boolean.hashCode(this.f206945a) * 31);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.e("NavigationData(isFromConfirm=", ", isDurationTypeChanged=", ")", this.f206945a, this.f206946b);
        }
    }

    static {
        new C3857a(null);
    }

    public a() {
        yt0.a.f199412b.getClass();
        this.f206930a = new yt0.a((lt0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.a.class, new h.a[0], null, null, null, 120));
        AdHocChallengeDTO adHocChallengeDTO = new AdHocChallengeDTO();
        this.f206931b = adHocChallengeDTO;
        this.f206932c = (kt0.a) KoinJavaComponent.get$default(kt0.a.class, null, null, 6, null);
        this.f206936g = u.UNKNOWN;
        this.f206937h = new y0<>();
        this.f206938i = new y0<>();
        this.f206939j = new y0<>();
        this.f206940k = new y0<>();
        this.f206941l = new l2<>();
        this.f206942m = new y0<>();
        this.f206943n = new v(null, false, null, 7, null);
        this.f206944o = Integer.MAX_VALUE;
        adHocChallengeDTO.f37992f = String.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk());
    }

    public final ArrayList x4() {
        List<? extends AdHocChallengePlayerDTO> list = this.f206931b.f38001o;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String str = ((AdHocChallengePlayerDTO) it.next()).f38007a;
            Long lValueOf = str != null ? Long.valueOf(Long.parseLong(str)) : null;
            if (lValueOf != null) {
                arrayList.add(lValueOf);
            }
        }
        return arrayList;
    }

    public final void y4(List<t> list) {
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(y.r(list, 10));
            for (t tVar : list) {
                AdHocChallengePlayerDTO adHocChallengePlayerDTO = new AdHocChallengePlayerDTO(String.valueOf(tVar.f120858a));
                adHocChallengePlayerDTO.f38013g = tVar.f120859b;
                adHocChallengePlayerDTO.f38014h = tVar.f120860c;
                adHocChallengePlayerDTO.f38019m = tVar.f120861d;
                adHocChallengePlayerDTO.f38020n = tVar.f120862e;
                arrayList2.add(Boolean.valueOf(arrayList.add(adHocChallengePlayerDTO)));
            }
        }
        AdHocChallengeDTO adHocChallengeDTO = this.f206931b;
        adHocChallengeDTO.getClass();
        adHocChallengeDTO.f38001o = arrayList;
    }

    public final void z4(DateTime dateTime, DateTime dateTime2) {
        dateTime.getClass();
        int i14 = this.f206936g.f38354a;
        AdHocChallengeDTO adHocChallengeDTO = this.f206931b;
        adHocChallengeDTO.f37996j = i14;
        this.f206933d = dateTime;
        this.f206934e = dateTime2;
        Date date = dateTime.toDate();
        adHocChallengeDTO.f37994h = date == null ? null : j0.g(date, "yyyy-MM-dd'T'HH:mm:ss.SSS", null);
        DateTime dateTime3 = this.f206934e;
        Date date2 = dateTime3 != null ? dateTime3.toDate() : null;
        adHocChallengeDTO.f37995i = date2 != null ? j0.g(date2, "yyyy-MM-dd'T'HH:mm:ss.SSS", null) : null;
        l2<Unit> l2Var = this.f206941l;
        l2Var.getClass();
        l2Var.m(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: zt0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzt0/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3857a {
        public /* synthetic */ C3857a(j jVar) {
            this();
        }

        private C3857a() {
        }
    }
}
