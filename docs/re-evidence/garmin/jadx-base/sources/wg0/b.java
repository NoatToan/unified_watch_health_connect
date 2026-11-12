package wg0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lwg0/b;", "Landroid/os/Parcelable;", "", "authorDisplayName", "authorFullName", "socialCommentElapsedTime", "socialCommentElapsedTimeContentDescription", "", "commentBody", "", "isUpdated", "Lb12/b;", "userProfileImageData", "", "numberOfLikes", "likedByUser", "uuid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;ZLb12/b;IZLjava/lang/String;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f185066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f185067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f185068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f185069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CharSequence f185070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f185071f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b12.b f185072g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f185073h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f185074i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f185075j;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (b12.b) parcel.readParcelable(b.class.getClassLoader()), parcel.readInt(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public /* synthetic */ b(String str, String str2, String str3, String str4, CharSequence charSequence, boolean z14, b12.b bVar, int i14, boolean z15, String str5, int i15, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, str3, str4, charSequence, z14, (i15 & 64) != 0 ? b12.b.f14386g : bVar, (i15 & 128) != 0 ? 0 : i14, (i15 & 256) != 0 ? false : z15, str5);
    }

    public static b b(b bVar, b12.b bVar2, int i14, boolean z14, int i15) {
        String str = bVar.f185066a;
        String str2 = bVar.f185067b;
        String str3 = bVar.f185068c;
        String str4 = bVar.f185069d;
        CharSequence charSequence = bVar.f185070e;
        boolean z15 = bVar.f185071f;
        if ((i15 & 64) != 0) {
            bVar2 = bVar.f185072g;
        }
        b12.b bVar3 = bVar2;
        if ((i15 & 128) != 0) {
            i14 = bVar.f185073h;
        }
        int i16 = i14;
        if ((i15 & 256) != 0) {
            z14 = bVar.f185074i;
        }
        String str5 = bVar.f185075j;
        bVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        charSequence.getClass();
        bVar3.getClass();
        str5.getClass();
        return new b(str, str2, str3, str4, charSequence, z15, bVar3, i16, z14, str5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f185066a, bVar.f185066a) && s.g(this.f185067b, bVar.f185067b) && s.g(this.f185068c, bVar.f185068c) && s.g(this.f185069d, bVar.f185069d) && s.g(this.f185070e, bVar.f185070e) && this.f185071f == bVar.f185071f && s.g(this.f185072g, bVar.f185072g) && this.f185073h == bVar.f185073h && this.f185074i == bVar.f185074i && s.g(this.f185075j, bVar.f185075j);
    }

    public final int hashCode() {
        return this.f185075j.hashCode() + q6.f.g(q2.d(this.f185073h, (this.f185072g.hashCode() + q6.f.g((this.f185070e.hashCode() + wr.g.j(wr.g.j(wr.g.j(this.f185066a.hashCode() * 31, 31, this.f185067b), 31, this.f185068c), 31, this.f185069d)) * 31, 31, this.f185071f)) * 31, 31), 31, this.f185074i);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("ActivityFeedComment(authorDisplayName=", this.f185066a, ", authorFullName=", this.f185067b, ", socialCommentElapsedTime=");
        sn.a.t(sbI, this.f185068c, ", socialCommentElapsedTimeContentDescription=", this.f185069d, ", commentBody=");
        sbI.append((Object) this.f185070e);
        sbI.append(", isUpdated=");
        sbI.append(this.f185071f);
        sbI.append(", userProfileImageData=");
        sbI.append(this.f185072g);
        sbI.append(", numberOfLikes=");
        sbI.append(this.f185073h);
        sbI.append(", likedByUser=");
        sbI.append(this.f185074i);
        sbI.append(", uuid=");
        sbI.append(this.f185075j);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f185066a);
        parcel.writeString(this.f185067b);
        parcel.writeString(this.f185068c);
        parcel.writeString(this.f185069d);
        TextUtils.writeToParcel(this.f185070e, parcel, i14);
        parcel.writeInt(this.f185071f ? 1 : 0);
        parcel.writeParcelable(this.f185072g, i14);
        parcel.writeInt(this.f185073h);
        parcel.writeInt(this.f185074i ? 1 : 0);
        parcel.writeString(this.f185075j);
    }

    public b(String str, String str2, String str3, String str4, CharSequence charSequence, boolean z14, b12.b bVar, int i14, boolean z15, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        charSequence.getClass();
        bVar.getClass();
        str5.getClass();
        this.f185066a = str;
        this.f185067b = str2;
        this.f185068c = str3;
        this.f185069d = str4;
        this.f185070e = charSequence;
        this.f185071f = z14;
        this.f185072g = bVar;
        this.f185073h = i14;
        this.f185074i = z15;
        this.f185075j = str5;
    }
}
