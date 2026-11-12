package qz0;

import a73.n;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.newsfeed.NewsFeedItem;
import e23.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import nj1.e;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.x;
import q6.f;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lqz0/a;", "", "", "Lcom/garmin/android/apps/connectmobile/newsfeed/NewsFeedItem;", "newsFeedItems", "", "", "favoriteUserDisplayNameList", "nextCursor", "", "myFollowingsCount", "Lnj1/e;", "userPrivacyDto", "daysLimit", "", "stale", "partialRefreshPossible", "Landroid/os/Parcelable;", "viewInstanceState", "useCache", "favoriteUserFetched", "<init>", "(Ljava/util/List;Ljava/util/Set;Ljava/lang/String;Ljava/lang/Integer;Lnj1/e;IZZLandroid/os/Parcelable;ZZ)V", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<NewsFeedItem> f148598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<String> f148599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f148600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f148601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f148602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f148603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f148604g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f148605h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Parcelable f148606i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f148607j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f148608k;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a(List list, Set set, String str, Integer num, e eVar, int i14, boolean z14, boolean z15, Parcelable parcelable, boolean z16, boolean z17, int i15, j jVar) {
        if ((i15 & 1) != 0) {
            list = Collections.synchronizedList(new ArrayList());
            list.getClass();
        }
        this(list, (i15 & 2) != 0 ? new LinkedHashSet() : set, (i15 & 4) != 0 ? null : str, (i15 & 8) != 0 ? null : num, (i15 & 16) != 0 ? null : eVar, (i15 & 32) != 0 ? 0 : i14, (i15 & 64) != 0 ? false : z14, (i15 & 128) != 0 ? false : z15, (i15 & 256) != 0 ? null : parcelable, (i15 & 512) != 0 ? false : z16, (i15 & 1024) != 0 ? false : z17);
    }

    public final void a(l lVar) {
        synchronized (this.f148598a) {
            this.f148598a.removeIf(new n(new qe2.c(lVar, 7), 28));
        }
    }

    public final void b() {
        this.f148598a.clear();
        this.f148599b.clear();
        this.f148600c = null;
        this.f148601d = null;
        this.f148602e = null;
        this.f148603f = 0;
        this.f148604g = false;
        this.f148605h = false;
        this.f148606i = null;
        this.f148607j = false;
        this.f148608k = false;
    }

    public final void c(String str, boolean z14) {
        str.getClass();
        synchronized (this.f148598a) {
            try {
                int i14 = 0;
                for (Object obj : this.f148598a) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        x.q();
                        throw null;
                    }
                    NewsFeedItem newsFeedItem = (NewsFeedItem) obj;
                    if ((newsFeedItem instanceof NewsFeedItem.ActivityPost) && s.g(((NewsFeedItem.ActivityPost) newsFeedItem).getActivityPost().f185046e, str)) {
                        this.f148598a.set(i14, new NewsFeedItem.ActivityPost(wg0.a.b(((NewsFeedItem.ActivityPost) newsFeedItem).getActivityPost(), null, null, null, null, Boolean.valueOf(z14), 402653183)));
                    }
                    i14 = i15;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        Set<String> set = this.f148599b;
        if (z14) {
            set.add(str);
        } else {
            set.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f148598a, aVar.f148598a) && s.g(this.f148599b, aVar.f148599b) && s.g(this.f148600c, aVar.f148600c) && s.g(this.f148601d, aVar.f148601d) && s.g(this.f148602e, aVar.f148602e) && this.f148603f == aVar.f148603f && this.f148604g == aVar.f148604g && this.f148605h == aVar.f148605h && s.g(this.f148606i, aVar.f148606i) && this.f148607j == aVar.f148607j && this.f148608k == aVar.f148608k;
    }

    public final int hashCode() {
        int iHashCode = (this.f148599b.hashCode() + (this.f148598a.hashCode() * 31)) * 31;
        String str = this.f148600c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f148601d;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        e eVar = this.f148602e;
        int iG = f.g(f.g(q2.d(this.f148603f, (iHashCode3 + (eVar == null ? 0 : eVar.hashCode())) * 31, 31), 31, this.f148604g), 31, this.f148605h);
        Parcelable parcelable = this.f148606i;
        return Boolean.hashCode(this.f148608k) + f.g((iG + (parcelable != null ? parcelable.hashCode() : 0)) * 31, 31, this.f148607j);
    }

    public final String toString() {
        String str = this.f148600c;
        Integer num = this.f148601d;
        e eVar = this.f148602e;
        int i14 = this.f148603f;
        boolean z14 = this.f148604g;
        boolean z15 = this.f148605h;
        Parcelable parcelable = this.f148606i;
        boolean z16 = this.f148607j;
        boolean z17 = this.f148608k;
        StringBuilder sb3 = new StringBuilder("NewsFeedDataSourceCache(newsFeedItems=");
        sb3.append(this.f148598a);
        sb3.append(", favoriteUserDisplayNameList=");
        sb3.append(this.f148599b);
        sb3.append(", nextCursor=");
        fb1.c.u(num, str, ", myFollowingsCount=", ", userPrivacyDto=", sb3);
        sb3.append(eVar);
        sb3.append(", daysLimit=");
        sb3.append(i14);
        sb3.append(", stale=");
        kg.f.q(", partialRefreshPossible=", ", viewInstanceState=", sb3, z14, z15);
        sb3.append(parcelable);
        sb3.append(", useCache=");
        sb3.append(z16);
        sb3.append(", favoriteUserFetched=");
        return hb.a.k(sb3, z17, ")");
    }

    public a(List<NewsFeedItem> list, Set<String> set, String str, Integer num, e eVar, int i14, boolean z14, boolean z15, Parcelable parcelable, boolean z16, boolean z17) {
        list.getClass();
        set.getClass();
        this.f148598a = list;
        this.f148599b = set;
        this.f148600c = str;
        this.f148601d = num;
        this.f148602e = eVar;
        this.f148603f = i14;
        this.f148604g = z14;
        this.f148605h = z15;
        this.f148606i = parcelable;
        this.f148607j = z16;
        this.f148608k = z17;
    }

    public a() {
        this(null, null, null, null, null, 0, false, false, null, false, false, 2047, null);
    }
}
