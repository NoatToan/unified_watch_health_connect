package f20;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B¡\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lf20/o;", "Landroid/os/Parcelable;", "", TtmlNode.ATTR_ID, "", "contactId", "profilePictureURL", "name", "details", "", "isSelectable", "isSelected", "", "itemType", "isLiveTrackDefault", "isLiveEventSharingDefault", "isSosDefault", "isRequestAccepted", "isValid", "localId", "showEmergencyContactDeclineString", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZIZZZZZLjava/lang/String;Z)V", "a", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f68405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f68406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f68407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f68408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f68409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f68410f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f68411g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f68412h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f68413i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f68414j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f68415k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f68416l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f68417m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f68418n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f68419o;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<o> {
        @Override // android.os.Parcelable.Creator
        public final o createFromParcel(Parcel parcel) {
            boolean z14;
            boolean z15;
            parcel.getClass();
            long j8 = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            boolean z16 = false;
            boolean z17 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z16 = true;
                z14 = true;
            } else {
                z14 = true;
            }
            int i14 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z16 = z14;
            }
            if (parcel.readInt() == 0) {
                z14 = z16;
            }
            if (parcel.readInt() != 0) {
                z16 = z14;
            }
            if (parcel.readInt() == 0) {
                z14 = z16;
            }
            if (parcel.readInt() != 0) {
                z16 = z14;
                z15 = z16;
            } else {
                z15 = z14;
            }
            return new o(j8, string, string2, string3, string4, z17, z16, i14, z16, z14, z16, z14, z16, parcel.readString(), parcel.readInt() != 0 ? z15 : false);
        }

        @Override // android.os.Parcelable.Creator
        public final o[] newArray(int i14) {
            return new o[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public /* synthetic */ o(long j8, String str, String str2, String str3, String str4, boolean z14, boolean z15, int i14, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, String str5, boolean z25, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? -1L : j8, (i15 & 2) != 0 ? "" : str, (i15 & 4) != 0 ? null : str2, (i15 & 8) != 0 ? "" : str3, (i15 & 16) == 0 ? str4 : "", (i15 & 32) != 0 ? false : z14, (i15 & 64) != 0 ? false : z15, (i15 & 128) != 0 ? 1 : i14, (i15 & 256) != 0 ? false : z16, (i15 & 512) != 0 ? false : z17, (i15 & 1024) != 0 ? false : z18, (i15 & 2048) != 0 ? false : z19, (i15 & 4096) == 0 ? z24 : true, (i15 & 8192) != 0 ? null : str5, (i15 & 16384) != 0 ? false : z25);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f68405a == oVar.f68405a && p005kotlin.jvm.internal.s.g(this.f68406b, oVar.f68406b) && p005kotlin.jvm.internal.s.g(this.f68407c, oVar.f68407c) && p005kotlin.jvm.internal.s.g(this.f68408d, oVar.f68408d) && p005kotlin.jvm.internal.s.g(this.f68409e, oVar.f68409e) && this.f68410f == oVar.f68410f && this.f68411g == oVar.f68411g && this.f68412h == oVar.f68412h && this.f68413i == oVar.f68413i && this.f68414j == oVar.f68414j && this.f68415k == oVar.f68415k && this.f68416l == oVar.f68416l && this.f68417m == oVar.f68417m && p005kotlin.jvm.internal.s.g(this.f68418n, oVar.f68418n) && this.f68419o == oVar.f68419o;
    }

    public final int hashCode() {
        int iJ = wr.g.j(Long.hashCode(this.f68405a) * 31, 31, this.f68406b);
        String str = this.f68407c;
        int iG = q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q2.d(this.f68412h, q6.f.g(q6.f.g(wr.g.j(wr.g.j((iJ + (str == null ? 0 : str.hashCode())) * 31, 31, this.f68408d), 31, this.f68409e), 31, this.f68410f), 31, this.f68411g), 31), 31, this.f68413i), 31, this.f68414j), 31, this.f68415k), 31, this.f68416l), 31, this.f68417m);
        String str2 = this.f68418n;
        return Boolean.hashCode(this.f68419o) + ((iG + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.f68409e;
        boolean z14 = this.f68411g;
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f68405a, "ContactListItem(id=", ", contactId=", this.f68406b);
        sn.a.t(sbK, ", profilePictureURL=", this.f68407c, ", name=", this.f68408d);
        com.airbnb.lottie.animation.keyframe.a.t(", details=", str, ", isSelectable=", sbK, this.f68410f);
        sbK.append(", isSelected=");
        sbK.append(z14);
        sbK.append(", itemType=");
        sbK.append(this.f68412h);
        com.airbnb.lottie.animation.keyframe.a.v(", isLiveTrackDefault=", ", isLiveEventSharingDefault=", sbK, this.f68413i, this.f68414j);
        com.airbnb.lottie.animation.keyframe.a.v(", isSosDefault=", ", isRequestAccepted=", sbK, this.f68415k, this.f68416l);
        sbK.append(", isValid=");
        sbK.append(this.f68417m);
        sbK.append(", localId=");
        sbK.append(this.f68418n);
        return com.airbnb.lottie.animation.keyframe.a.i(sbK, ", showEmergencyContactDeclineString=", this.f68419o, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.f68405a);
        parcel.writeString(this.f68406b);
        parcel.writeString(this.f68407c);
        parcel.writeString(this.f68408d);
        parcel.writeString(this.f68409e);
        parcel.writeInt(this.f68410f ? 1 : 0);
        parcel.writeInt(this.f68411g ? 1 : 0);
        parcel.writeInt(this.f68412h);
        parcel.writeInt(this.f68413i ? 1 : 0);
        parcel.writeInt(this.f68414j ? 1 : 0);
        parcel.writeInt(this.f68415k ? 1 : 0);
        parcel.writeInt(this.f68416l ? 1 : 0);
        parcel.writeInt(this.f68417m ? 1 : 0);
        parcel.writeString(this.f68418n);
        parcel.writeInt(this.f68419o ? 1 : 0);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lf20/o$a;", "", "<init>", "()V", "", "HEADER_ITEM_TYPE", "I", "CONTACT_ITEM_TYPE", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public o(long j8, String str, String str2, String str3, String str4, boolean z14, boolean z15, int i14, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, String str5, boolean z25) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str3, str4);
        this.f68405a = j8;
        this.f68406b = str;
        this.f68407c = str2;
        this.f68408d = str3;
        this.f68409e = str4;
        this.f68410f = z14;
        this.f68411g = z15;
        this.f68412h = i14;
        this.f68413i = z16;
        this.f68414j = z17;
        this.f68415k = z18;
        this.f68416l = z19;
        this.f68417m = z24;
        this.f68418n = str5;
        this.f68419o = z25;
    }

    public o() {
        this(0L, null, null, null, null, false, false, 0, false, false, false, false, false, null, false, 32767, null);
    }
}
