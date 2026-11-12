package sw0;

import android.os.Parcel;
import android.os.Parcelable;
import c22.c3;
import com.garmin.android.apps.connectmobile.f3;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import j20.x;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lsw0/g;", "Landroid/os/Parcelable;", "Lc22/c3;", "name", "", "drawable", TtmlNode.ATTR_TTS_COLOR, "contentDescription", "drawableHeight", "<init>", "(Lc22/c3;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "gcm-map_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c3 f161074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f161075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f161076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f161077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f161078e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new g((c3) parcel.readParcelable(g.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    }

    public /* synthetic */ g(c3 c3Var, Integer num, Integer num2, Integer num3, Integer num4, int i14, p005kotlin.jvm.internal.j jVar) {
        this(c3Var, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : num2, (i14 & 8) != 0 ? null : num3, (i14 & 16) != 0 ? null : num4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.f161074a, gVar.f161074a) && s.g(this.f161075b, gVar.f161075b) && s.g(this.f161076c, gVar.f161076c) && s.g(this.f161077d, gVar.f161077d) && s.g(this.f161078e, gVar.f161078e);
    }

    public final int hashCode() {
        int iHashCode = this.f161074a.hashCode() * 31;
        Integer num = this.f161075b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f161076c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f161077d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f161078e;
        return iHashCode4 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MapDetailsLegendLine(name=");
        sb3.append(this.f161074a);
        sb3.append(", drawable=");
        sb3.append(this.f161075b);
        sb3.append(", color=");
        x.m(sb3, this.f161076c, ", contentDescription=", this.f161077d, ", drawableHeight=");
        return f3.i(sb3, this.f161078e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeParcelable(this.f161074a, i14);
        Integer num = this.f161075b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.f161076c;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Integer num3 = this.f161077d;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        Integer num4 = this.f161078e;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num4);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(c3 c3Var, Integer num) {
        this(c3Var, num, null, null, null, 28, null);
        c3Var.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(c3 c3Var, Integer num, Integer num2) {
        this(c3Var, num, num2, null, null, 24, null);
        c3Var.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(c3 c3Var, Integer num, Integer num2, Integer num3) {
        this(c3Var, num, num2, num3, null, 16, null);
        c3Var.getClass();
    }

    public g(c3 c3Var, Integer num, Integer num2, Integer num3, Integer num4) {
        c3Var.getClass();
        this.f161074a = c3Var;
        this.f161075b = num;
        this.f161076c = num2;
        this.f161077d = num3;
        this.f161078e = num4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(c3 c3Var) {
        this(c3Var, null, null, null, null, 30, null);
        c3Var.getClass();
    }
}
