package ot0;

import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.leaderboard.model.a0;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public interface h {
    /* JADX INFO: renamed from: getViewType */
    i getF133762c();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lot0/h$e;", "Lot0/h;", "Lot0/i;", "viewType", "<init>", "(Lot0/i;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f133759a;

        public /* synthetic */ e(i iVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? i.VIEW_TYPE_PROMOTION : iVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f133759a == ((e) obj).f133759a;
        }

        @Override // ot0.h
        /* JADX INFO: renamed from: getViewType, reason: from getter */
        public final i getF133762c() {
            return this.f133759a;
        }

        public final int hashCode() {
            return this.f133759a.hashCode();
        }

        public final String toString() {
            return "PromotionModel(viewType=" + this.f133759a + ")";
        }

        public e(i iVar) {
            iVar.getClass();
            this.f133759a = iVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public e() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lot0/h$c;", "Lot0/h;", "", "shouldHideJoinAutoChallenge", "Lot0/i;", "viewType", "<init>", "(ZLot0/i;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f133755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i f133756b;

        public c(boolean z14, i iVar) {
            iVar.getClass();
            this.f133755a = z14;
            this.f133756b = iVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f133755a == cVar.f133755a && this.f133756b == cVar.f133756b;
        }

        @Override // ot0.h
        /* JADX INFO: renamed from: getViewType, reason: from getter */
        public final i getF133762c() {
            return this.f133756b;
        }

        public final int hashCode() {
            return this.f133756b.hashCode() + (Boolean.hashCode(this.f133755a) * 31);
        }

        public final String toString() {
            return "FooterModel(shouldHideJoinAutoChallenge=" + this.f133755a + ", viewType=" + this.f133756b + ")";
        }

        public /* synthetic */ c(boolean z14, i iVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this(z14, (i14 & 2) != 0 ? i.VIEW_TYPE_FOOTER : iVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lot0/h$a;", "Lot0/h;", "", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/a0;", "adventures", "Lot0/i;", "viewType", "<init>", "(Ljava/util/List;Lot0/i;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<a0> f133751a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i f133752b;

        public a(List<a0> list, i iVar) {
            list.getClass();
            iVar.getClass();
            this.f133751a = list;
            this.f133752b = iVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.g(this.f133751a, aVar.f133751a) && this.f133752b == aVar.f133752b;
        }

        @Override // ot0.h
        /* JADX INFO: renamed from: getViewType, reason: from getter */
        public final i getF133762c() {
            return this.f133752b;
        }

        public final int hashCode() {
            return this.f133752b.hashCode() + (this.f133751a.hashCode() * 31);
        }

        public final String toString() {
            return "AdventuresModel(adventures=" + this.f133751a + ", viewType=" + this.f133752b + ")";
        }

        public /* synthetic */ a(List list, i iVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this(list, (i14 & 2) != 0 ? i.VIEW_TYPE_ADVENTURES_SECTION : iVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lot0/h$b;", "Lot0/h;", "", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/a0;", "badges", "Lot0/i;", "viewType", "<init>", "(Ljava/util/List;Lot0/i;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<a0> f133753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i f133754b;

        public b(List<a0> list, i iVar) {
            list.getClass();
            iVar.getClass();
            this.f133753a = list;
            this.f133754b = iVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return s.g(this.f133753a, bVar.f133753a) && this.f133754b == bVar.f133754b;
        }

        @Override // ot0.h
        /* JADX INFO: renamed from: getViewType, reason: from getter */
        public final i getF133762c() {
            return this.f133754b;
        }

        public final int hashCode() {
            return this.f133754b.hashCode() + (this.f133753a.hashCode() * 31);
        }

        public final String toString() {
            return "BadgeChallengesModel(badges=" + this.f133753a + ", viewType=" + this.f133754b + ")";
        }

        public /* synthetic */ b(List list, i iVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this(list, (i14 & 2) != 0 ? i.VIEW_TYPE_BADGE_CHALLENGES_SECTION : iVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lot0/h$d;", "Lot0/h;", "", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/a0;", "challenges", "Lot0/i;", "viewType", "<init>", "(Ljava/util/List;Lot0/i;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<a0> f133757a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i f133758b;

        public d(List<a0> list, i iVar) {
            list.getClass();
            iVar.getClass();
            this.f133757a = list;
            this.f133758b = iVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return s.g(this.f133757a, dVar.f133757a) && this.f133758b == dVar.f133758b;
        }

        @Override // ot0.h
        /* JADX INFO: renamed from: getViewType, reason: from getter */
        public final i getF133762c() {
            return this.f133758b;
        }

        public final int hashCode() {
            return this.f133758b.hashCode() + (this.f133757a.hashCode() * 31);
        }

        public final String toString() {
            return "MyChallengesModel(challenges=" + this.f133757a + ", viewType=" + this.f133758b + ")";
        }

        public /* synthetic */ d(List list, i iVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this(list, (i14 & 2) != 0 ? i.VIEW_TYPE_MY_CHALLENGE_SECTION : iVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lot0/h$f;", "Lot0/h;", "", "connectionCount", "Lb12/b;", "userProfileImageData", "Lot0/i;", "viewType", "<init>", "(ILb12/b;Lot0/i;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f133760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b12.b f133761b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final i f133762c;

        static {
            Parcelable.Creator<b12.b> creator = b12.b.CREATOR;
        }

        public f(int i14, b12.b bVar, i iVar) {
            bVar.getClass();
            iVar.getClass();
            this.f133760a = i14;
            this.f133761b = bVar;
            this.f133762c = iVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f133760a == fVar.f133760a && s.g(this.f133761b, fVar.f133761b) && this.f133762c == fVar.f133762c;
        }

        @Override // ot0.h
        /* JADX INFO: renamed from: getViewType, reason: from getter */
        public final i getF133762c() {
            return this.f133762c;
        }

        public final int hashCode() {
            return this.f133762c.hashCode() + ((this.f133761b.hashCode() + (Integer.hashCode(this.f133760a) * 31)) * 31);
        }

        public final String toString() {
            return "WeeklyLeaderboardModel(connectionCount=" + this.f133760a + ", userProfileImageData=" + this.f133761b + ", viewType=" + this.f133762c + ")";
        }

        public /* synthetic */ f(int i14, b12.b bVar, i iVar, int i15, p005kotlin.jvm.internal.j jVar) {
            this(i14, bVar, (i15 & 4) != 0 ? i.VIEW_TYPE_WEEKLY_LEADERBOARD : iVar);
        }
    }
}
