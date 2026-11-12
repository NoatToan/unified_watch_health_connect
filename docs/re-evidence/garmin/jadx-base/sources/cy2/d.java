package cy2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.Constants;
import o13.z;
import o4.d0;
import o4.f0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcy2/d;", "Landroid/os/Parcelable;", "Lo4/d0;", "primary", "onPrimary", "background", "onBackground", "surface", "surfaceVariant", "surfaceVariant2", "onSurface", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onError", "success", "onSuccess", "<init>", "(JLo4/d0;Lo4/d0;Lo4/d0;Lo4/d0;Lo4/d0;Lo4/d0;Lo4/d0;Lo4/d0;Lo4/d0;Lo4/d0;Lo4/d0;Lkotlin/jvm/internal/j;)V", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f56817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f56818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f56819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d0 f56820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d0 f56821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d0 f56822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d0 f56823g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d0 f56824h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d0 f56825i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d0 f56826j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d0 f56827k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d0 f56828l;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            cy2.a.f56803a.getClass();
            long jB = f0.b(parcel.readInt());
            h.f56838a.getClass();
            return new d(jB, h.a(parcel), h.a(parcel), h.a(parcel), h.a(parcel), h.a(parcel), h.a(parcel), h.a(parcel), h.a(parcel), h.a(parcel), h.a(parcel), h.a(parcel), null);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public /* synthetic */ d(long j8, d0 d0Var, d0 d0Var2, d0 d0Var3, d0 d0Var4, d0 d0Var5, d0 d0Var6, d0 d0Var7, d0 d0Var8, d0 d0Var9, d0 d0Var10, d0 d0Var11, int i14, p005kotlin.jvm.internal.j jVar) {
        this(j8, (i14 & 2) != 0 ? null : d0Var, (i14 & 4) != 0 ? null : d0Var2, (i14 & 8) != 0 ? null : d0Var3, (i14 & 16) != 0 ? null : d0Var4, (i14 & 32) != 0 ? null : d0Var5, (i14 & 64) != 0 ? null : d0Var6, (i14 & 128) != 0 ? null : d0Var7, (i14 & 256) != 0 ? null : d0Var8, (i14 & 512) != 0 ? null : d0Var9, (i14 & 1024) != 0 ? null : d0Var10, (i14 & 2048) != 0 ? null : d0Var11, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return d0.d(this.f56817a, dVar.f56817a) && s.g(this.f56818b, dVar.f56818b) && s.g(this.f56819c, dVar.f56819c) && s.g(this.f56820d, dVar.f56820d) && s.g(this.f56821e, dVar.f56821e) && s.g(this.f56822f, dVar.f56822f) && s.g(this.f56823g, dVar.f56823g) && s.g(this.f56824h, dVar.f56824h) && s.g(this.f56825i, dVar.f56825i) && s.g(this.f56826j, dVar.f56826j) && s.g(this.f56827k, dVar.f56827k) && s.g(this.f56828l, dVar.f56828l);
    }

    public final int hashCode() {
        d0.a aVar = d0.f128823b;
        z.a aVar2 = z.f128618b;
        int iHashCode = Long.hashCode(this.f56817a) * 31;
        d0 d0Var = this.f56818b;
        int iHashCode2 = (iHashCode + (d0Var == null ? 0 : Long.hashCode(d0Var.f128833a))) * 31;
        d0 d0Var2 = this.f56819c;
        int iHashCode3 = (iHashCode2 + (d0Var2 == null ? 0 : Long.hashCode(d0Var2.f128833a))) * 31;
        d0 d0Var3 = this.f56820d;
        int iHashCode4 = (iHashCode3 + (d0Var3 == null ? 0 : Long.hashCode(d0Var3.f128833a))) * 31;
        d0 d0Var4 = this.f56821e;
        int iHashCode5 = (iHashCode4 + (d0Var4 == null ? 0 : Long.hashCode(d0Var4.f128833a))) * 31;
        d0 d0Var5 = this.f56822f;
        int iHashCode6 = (iHashCode5 + (d0Var5 == null ? 0 : Long.hashCode(d0Var5.f128833a))) * 31;
        d0 d0Var6 = this.f56823g;
        int iHashCode7 = (iHashCode6 + (d0Var6 == null ? 0 : Long.hashCode(d0Var6.f128833a))) * 31;
        d0 d0Var7 = this.f56824h;
        int iHashCode8 = (iHashCode7 + (d0Var7 == null ? 0 : Long.hashCode(d0Var7.f128833a))) * 31;
        d0 d0Var8 = this.f56825i;
        int iHashCode9 = (iHashCode8 + (d0Var8 == null ? 0 : Long.hashCode(d0Var8.f128833a))) * 31;
        d0 d0Var9 = this.f56826j;
        int iHashCode10 = (iHashCode9 + (d0Var9 == null ? 0 : Long.hashCode(d0Var9.f128833a))) * 31;
        d0 d0Var10 = this.f56827k;
        int iHashCode11 = (iHashCode10 + (d0Var10 == null ? 0 : Long.hashCode(d0Var10.f128833a))) * 31;
        d0 d0Var11 = this.f56828l;
        return iHashCode11 + (d0Var11 != null ? Long.hashCode(d0Var11.f128833a) : 0);
    }

    public final String toString() {
        return "GarminStoreConfigurationColors(primary=" + d0.j(this.f56817a) + ", onPrimary=" + this.f56818b + ", background=" + this.f56819c + ", onBackground=" + this.f56820d + ", surface=" + this.f56821e + ", surfaceVariant=" + this.f56822f + ", surfaceVariant2=" + this.f56823g + ", onSurface=" + this.f56824h + ", error=" + this.f56825i + ", onError=" + this.f56826j + ", success=" + this.f56827k + ", onSuccess=" + this.f56828l + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        cy2.a.f56803a.getClass();
        parcel.writeInt(f0.j(this.f56817a));
        h.f56838a.getClass();
        h.b(this.f56818b, parcel);
        h.b(this.f56819c, parcel);
        h.b(this.f56820d, parcel);
        h.b(this.f56821e, parcel);
        h.b(this.f56822f, parcel);
        h.b(this.f56823g, parcel);
        h.b(this.f56824h, parcel);
        h.b(this.f56825i, parcel);
        h.b(this.f56826j, parcel);
        h.b(this.f56827k, parcel);
        h.b(this.f56828l, parcel);
    }

    private d(long j8, d0 d0Var, d0 d0Var2, d0 d0Var3, d0 d0Var4, d0 d0Var5, d0 d0Var6, d0 d0Var7, d0 d0Var8, d0 d0Var9, d0 d0Var10, d0 d0Var11) {
        this.f56817a = j8;
        this.f56818b = d0Var;
        this.f56819c = d0Var2;
        this.f56820d = d0Var3;
        this.f56821e = d0Var4;
        this.f56822f = d0Var5;
        this.f56823g = d0Var6;
        this.f56824h = d0Var7;
        this.f56825i = d0Var8;
        this.f56826j = d0Var9;
        this.f56827k = d0Var10;
        this.f56828l = d0Var11;
    }

    public /* synthetic */ d(long j8, d0 d0Var, d0 d0Var2, d0 d0Var3, d0 d0Var4, d0 d0Var5, d0 d0Var6, d0 d0Var7, d0 d0Var8, d0 d0Var9, d0 d0Var10, d0 d0Var11, p005kotlin.jvm.internal.j jVar) {
        this(j8, d0Var, d0Var2, d0Var3, d0Var4, d0Var5, d0Var6, d0Var7, d0Var8, d0Var9, d0Var10, d0Var11);
    }
}
