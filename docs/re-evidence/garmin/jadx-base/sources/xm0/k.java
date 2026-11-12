package xm0;

import android.os.Parcelable;
import com.garmin.android.gncs.NotificationConstants;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0017\u0018Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lxm0/k;", "", "", "rank", "", "fullName", "", "value", "displayName", "Lj10/d;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "lastSyncTime", "", "hasPrivacy", "userProfilePk", "isOwner", "isHiddenItem", "isLocked", "Lb12/b;", "userProfileImageData", "<init>", "(ILjava/lang/String;DLjava/lang/String;Lj10/d;Ljava/lang/Long;ZLjava/lang/Long;ZZZLb12/b;)V", "b", "a", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f191417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f191418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f191419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f191420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j10.d f191421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f191422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f191423g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f191424h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f191425i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f191426j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f191427k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b12.b f191428l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f191429m;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lxm0/k$b;", "Landroidx/recyclerview/widget/o$f;", "Lxm0/k;", "<init>", "()V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends androidx.recyclerview.widget.o.f<k> {
        @Override // androidx.recyclerview.widget.o.f
        public final boolean a(k kVar, k kVar2) {
            k kVar3 = kVar;
            k kVar4 = kVar2;
            kVar3.getClass();
            kVar4.getClass();
            return kVar3.equals(kVar4);
        }

        @Override // androidx.recyclerview.widget.o.f
        public final boolean b(k kVar, k kVar2) {
            k kVar3 = kVar;
            k kVar4 = kVar2;
            kVar3.getClass();
            kVar4.getClass();
            return kVar3.equals(kVar4);
        }
    }

    static {
        new a(null);
        Parcelable.Creator<b12.b> creator = b12.b.CREATOR;
        new k(0, "", 0.0d, "", j10.d.TOTAL_STEPS, null, false, null, false, true, false, null, 2048, null);
    }

    public k(int i14, String str, double d14, String str2, j10.d dVar, Long l14, boolean z14, Long l15, boolean z15, boolean z16, boolean z17, b12.b bVar) {
        str.getClass();
        str2.getClass();
        dVar.getClass();
        bVar.getClass();
        this.f191417a = i14;
        this.f191418b = str;
        this.f191419c = d14;
        this.f191420d = str2;
        this.f191421e = dVar;
        this.f191422f = l14;
        this.f191423g = z14;
        this.f191424h = l15;
        this.f191425i = z15;
        this.f191426j = z16;
        this.f191427k = z17;
        this.f191428l = bVar;
        this.f191429m = str2.equals(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f191417a == kVar.f191417a && p005kotlin.jvm.internal.s.g(this.f191418b, kVar.f191418b) && Double.compare(this.f191419c, kVar.f191419c) == 0 && p005kotlin.jvm.internal.s.g(this.f191420d, kVar.f191420d) && this.f191421e == kVar.f191421e && p005kotlin.jvm.internal.s.g(this.f191422f, kVar.f191422f) && this.f191423g == kVar.f191423g && p005kotlin.jvm.internal.s.g(this.f191424h, kVar.f191424h) && this.f191425i == kVar.f191425i && this.f191426j == kVar.f191426j && this.f191427k == kVar.f191427k && p005kotlin.jvm.internal.s.g(this.f191428l, kVar.f191428l);
    }

    public final int hashCode() {
        int iHashCode = (this.f191421e.hashCode() + wr.g.j(org.apache.commons.lang3.e.b(wr.g.j(Integer.hashCode(this.f191417a) * 31, 31, this.f191418b), 31, this.f191419c), 31, this.f191420d)) * 31;
        Long l14 = this.f191422f;
        int iG = q6.f.g((iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31, 31, this.f191423g);
        Long l15 = this.f191424h;
        return this.f191428l.hashCode() + q6.f.g(q6.f.g(q6.f.g((iG + (l15 != null ? l15.hashCode() : 0)) * 31, 31, this.f191425i), 31, this.f191426j), 31, this.f191427k);
    }

    public final String toString() {
        StringBuilder sbR = wr.g.r(this.f191417a, "GroupLeaderboardItem(rank=", ", fullName=", this.f191418b, ", value=");
        sbR.append(this.f191419c);
        sbR.append(", displayName=");
        sbR.append(this.f191420d);
        sbR.append(", type=");
        sbR.append(this.f191421e);
        sbR.append(", lastSyncTime=");
        sbR.append(this.f191422f);
        sbR.append(", hasPrivacy=");
        sbR.append(this.f191423g);
        sbR.append(", userProfilePk=");
        sbR.append(this.f191424h);
        com.airbnb.lottie.animation.keyframe.a.v(", isOwner=", ", isHiddenItem=", sbR, this.f191425i, this.f191426j);
        sbR.append(", isLocked=");
        sbR.append(this.f191427k);
        sbR.append(", userProfileImageData=");
        sbR.append(this.f191428l);
        sbR.append(")");
        return sbR.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxm0/k$a;", "", "<init>", "()V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ k(int i14, String str, double d14, String str2, j10.d dVar, Long l14, boolean z14, Long l15, boolean z15, boolean z16, boolean z17, b12.b bVar, int i15, p005kotlin.jvm.internal.j jVar) {
        this(i14, str, d14, str2, dVar, l14, z14, l15, z15, z16, z17, (i15 & 2048) != 0 ? b12.b.f14386g : bVar);
    }
}
