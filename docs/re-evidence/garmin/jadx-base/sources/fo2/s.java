package fo2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lfo2/s;", "Landroid/os/Parcelable;", "", "deviceIdentifier", "Lfo2/p;", "deviceLink", "", "unitId", "deviceName", "Lzn2/h;", "deviceType", "Lzn2/y;", RemoteConfigConstants.ResponseFieldKey.STATE, "webappAddCredential", "deviceStatistics", "commitLink", "lastAckCommit", "securityDomainsLink", "selfLink", "<init>", "(Ljava/lang/String;Lfo2/p;JLjava/lang/String;Lzn2/h;Lzn2/y;Lfo2/p;Lfo2/p;Lfo2/p;Lfo2/p;Lfo2/p;Lfo2/p;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class s implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f73102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f73103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f73104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zn2.h f73105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zn2.y f73106f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f73107g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p f73108h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p f73109i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p f73110j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p f73111k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p f73112l;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<s> {
        @Override // android.os.Parcelable.Creator
        public final s createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            Parcelable.Creator<p> creator = p.CREATOR;
            return new s(string, creator.createFromParcel(parcel), parcel.readLong(), parcel.readString(), parcel.readInt() == 0 ? null : zn2.h.valueOf(parcel.readString()), zn2.y.valueOf(parcel.readString()), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final s[] newArray(int i14) {
            return new s[i14];
        }
    }

    public s(String str, p pVar, long j8, String str2, zn2.h hVar, zn2.y yVar, p pVar2, p pVar3, p pVar4, p pVar5, p pVar6, p pVar7) {
        str.getClass();
        pVar.getClass();
        str2.getClass();
        yVar.getClass();
        pVar2.getClass();
        pVar3.getClass();
        pVar4.getClass();
        pVar5.getClass();
        pVar6.getClass();
        pVar7.getClass();
        this.f73101a = str;
        this.f73102b = pVar;
        this.f73103c = j8;
        this.f73104d = str2;
        this.f73105e = hVar;
        this.f73106f = yVar;
        this.f73107g = pVar2;
        this.f73108h = pVar3;
        this.f73109i = pVar4;
        this.f73110j = pVar5;
        this.f73111k = pVar6;
        this.f73112l = pVar7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return p005kotlin.jvm.internal.s.g(this.f73101a, sVar.f73101a) && p005kotlin.jvm.internal.s.g(this.f73102b, sVar.f73102b) && this.f73103c == sVar.f73103c && p005kotlin.jvm.internal.s.g(this.f73104d, sVar.f73104d) && this.f73105e == sVar.f73105e && this.f73106f == sVar.f73106f && p005kotlin.jvm.internal.s.g(this.f73107g, sVar.f73107g) && p005kotlin.jvm.internal.s.g(this.f73108h, sVar.f73108h) && p005kotlin.jvm.internal.s.g(this.f73109i, sVar.f73109i) && p005kotlin.jvm.internal.s.g(this.f73110j, sVar.f73110j) && p005kotlin.jvm.internal.s.g(this.f73111k, sVar.f73111k) && p005kotlin.jvm.internal.s.g(this.f73112l, sVar.f73112l);
    }

    public final int hashCode() {
        int iJ = wr.g.j(q6.f.e(fb1.c.e(this.f73102b, this.f73101a.hashCode() * 31, 31), 31, this.f73103c), 31, this.f73104d);
        zn2.h hVar = this.f73105e;
        return this.f73112l.hashCode() + fb1.c.e(this.f73111k, fb1.c.e(this.f73110j, fb1.c.e(this.f73109i, fb1.c.e(this.f73108h, fb1.c.e(this.f73107g, (this.f73106f.hashCode() + ((iJ + (hVar == null ? 0 : hVar.hashCode())) * 31)) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NewFitPayDevice(deviceIdentifier=");
        sb3.append(this.f73101a);
        sb3.append(", deviceLink=");
        sb3.append(this.f73102b);
        sb3.append(", unitId=");
        p6.b.k(this.f73103c, ", deviceName=", this.f73104d, sb3);
        sb3.append(", deviceType=");
        sb3.append(this.f73105e);
        sb3.append(", state=");
        sb3.append(this.f73106f);
        sb3.append(", webappAddCredential=");
        sb3.append(this.f73107g);
        sb3.append(", deviceStatistics=");
        sb3.append(this.f73108h);
        sb3.append(", commitLink=");
        sb3.append(this.f73109i);
        sb3.append(", lastAckCommit=");
        sb3.append(this.f73110j);
        sb3.append(", securityDomainsLink=");
        sb3.append(this.f73111k);
        sb3.append(", selfLink=");
        sb3.append(this.f73112l);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f73101a);
        this.f73102b.writeToParcel(parcel, i14);
        parcel.writeLong(this.f73103c);
        parcel.writeString(this.f73104d);
        zn2.h hVar = this.f73105e;
        if (hVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(hVar.name());
        }
        parcel.writeString(this.f73106f.name());
        this.f73107g.writeToParcel(parcel, i14);
        this.f73108h.writeToParcel(parcel, i14);
        this.f73109i.writeToParcel(parcel, i14);
        this.f73110j.writeToParcel(parcel, i14);
        this.f73111k.writeToParcel(parcel, i14);
        this.f73112l.writeToParcel(parcel, i14);
    }

    public /* synthetic */ s(String str, p pVar, long j8, String str2, zn2.h hVar, zn2.y yVar, p pVar2, p pVar3, p pVar4, p pVar5, p pVar6, p pVar7, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, pVar, j8, str2, (i14 & 16) != 0 ? null : hVar, (i14 & 32) != 0 ? zn2.y.UNKNOWN : yVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7);
    }
}
