package d31;

import com.garmin.android.apps.connectmobile.f3;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ld31/e;", "", "", "badgeKey", "", "badgePk", "badgeUUID", "", "challengeCategory", "sharedImagePk", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f57379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f57380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f57381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f57382e;

    public /* synthetic */ e(String str, Long l14, String str2, Integer num, Integer num2, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : l14, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : num, (i14 & 16) != 0 ? null : num2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.f57378a, eVar.f57378a) && s.g(this.f57379b, eVar.f57379b) && s.g(this.f57380c, eVar.f57380c) && s.g(this.f57381d, eVar.f57381d) && s.g(this.f57382e, eVar.f57382e);
    }

    public final int hashCode() {
        String str = this.f57378a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l14 = this.f57379b;
        int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str2 = this.f57380c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f57381d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f57382e;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PartnerRewardMetaData(badgeKey=");
        sb3.append(this.f57378a);
        sb3.append(", badgePk=");
        sb3.append(this.f57379b);
        sb3.append(", badgeUUID=");
        fb1.c.u(this.f57381d, this.f57380c, ", challengeCategory=", ", sharedImagePk=", sb3);
        return f3.i(sb3, this.f57382e, ")");
    }

    public e(String str, Long l14, String str2, Integer num, Integer num2) {
        this.f57378a = str;
        this.f57379b = l14;
        this.f57380c = str2;
        this.f57381d = num;
        this.f57382e = num2;
    }

    public e() {
        this(null, null, null, null, null, 31, null);
    }
}
