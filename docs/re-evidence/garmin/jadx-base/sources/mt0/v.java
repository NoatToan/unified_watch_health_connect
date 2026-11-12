package mt0;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lmt0/v;", "", "", "Lmt0/t;", "dataList", "", "useCache", "", "nextKey", "<init>", "(Ljava/util/List;ZLjava/lang/Integer;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<t> f120889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f120890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f120891c;

    public /* synthetic */ v(List list, boolean z14, Integer num, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? new ArrayList() : list, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? null : num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return p005kotlin.jvm.internal.s.g(this.f120889a, vVar.f120889a) && this.f120890b == vVar.f120890b && p005kotlin.jvm.internal.s.g(this.f120891c, vVar.f120891c);
    }

    public final int hashCode() {
        int iG = q6.f.g(this.f120889a.hashCode() * 31, 31, this.f120890b);
        Integer num = this.f120891c;
        return iG + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        boolean z14 = this.f120890b;
        Integer num = this.f120891c;
        StringBuilder sb3 = new StringBuilder("AdHocChallengeManagePlayersCache(dataList=");
        sb3.append(this.f120889a);
        sb3.append(", useCache=");
        sb3.append(z14);
        sb3.append(", nextKey=");
        return com.garmin.android.apps.connectmobile.f3.i(sb3, num, ")");
    }

    public v(List<t> list, boolean z14, Integer num) {
        list.getClass();
        this.f120889a = list;
        this.f120890b = z14;
        this.f120891c = num;
    }

    public v() {
        this(null, false, null, 7, null);
    }
}
