package b12;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import f12.u;
import java.io.Serializable;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0011BE\b\u0007\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u0010¨\u0006\u0012"}, d2 = {"Lb12/b;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "", "profileImageUrl", "", "profileImageDrawableResId", "Lf12/u;", "userLevel", "", "placeHolderLetter", "Landroid/graphics/Bitmap;", "imageBitmap", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Lf12/u;Ljava/lang/Character;Landroid/graphics/Bitmap;)V", "bitmap", "(Landroid/graphics/Bitmap;)V", "a", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Serializable, Parcelable {
    public static final Parcelable.Creator<b> CREATOR;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f14385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f14386g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f14388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f14389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Character f14390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bitmap f14391e;

    /* JADX INFO: renamed from: b12.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C0209b implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : u.valueOf(parcel.readString()), parcel.readInt() != 0 ? Character.valueOf((char) parcel.readInt()) : null, (Bitmap) parcel.readParcelable(b.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new C0209b();
        f14385f = 8;
        f14386g = new b(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ b(String str, Integer num, u uVar, Character ch3, Bitmap bitmap, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : uVar, (i14 & 8) != 0 ? null : ch3, (i14 & 16) != 0 ? null : bitmap);
    }

    public static b b(b bVar, String str, int i14) {
        if ((i14 & 1) != 0) {
            str = bVar.f14387a;
        }
        String str2 = str;
        Integer num = bVar.f14388b;
        u uVar = (i14 & 4) != 0 ? bVar.f14389c : null;
        Character ch3 = bVar.f14390d;
        Bitmap bitmap = bVar.f14391e;
        bVar.getClass();
        return new b(str2, num, uVar, ch3, bitmap);
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
        return s.g(this.f14387a, bVar.f14387a) && s.g(this.f14388b, bVar.f14388b) && this.f14389c == bVar.f14389c && s.g(this.f14390d, bVar.f14390d) && s.g(this.f14391e, bVar.f14391e);
    }

    public final int hashCode() {
        String str = this.f14387a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f14388b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        u uVar = this.f14389c;
        int iHashCode3 = (iHashCode2 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        Character ch3 = this.f14390d;
        int iHashCode4 = (iHashCode3 + (ch3 == null ? 0 : ch3.hashCode())) * 31;
        Bitmap bitmap = this.f14391e;
        return iHashCode4 + (bitmap != null ? bitmap.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = u0.n("UserProfileImageData(profileImageUrl=", this.f14388b, this.f14387a, ", profileImageDrawableResId=", ", userLevel=");
        sbN.append(this.f14389c);
        sbN.append(", placeHolderLetter=");
        sbN.append(this.f14390d);
        sbN.append(", imageBitmap=");
        sbN.append(this.f14391e);
        sbN.append(")");
        return sbN.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f14387a);
        Integer num = this.f14388b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        u uVar = this.f14389c;
        if (uVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(uVar.name());
        }
        Character ch3 = this.f14390d;
        if (ch3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(ch3.charValue());
        }
        parcel.writeParcelable(this.f14391e, i14);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lb12/b$a;", "", "<init>", "()V", "Lb12/b;", "DEFAULT", "Lb12/b;", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public b(String str) {
        this(str, null, null, null, null, 30, null);
    }

    public b(String str, Integer num) {
        this(str, num, null, null, null, 28, null);
    }

    public b(String str, Integer num, u uVar) {
        this(str, num, uVar, null, null, 24, null);
    }

    public b(String str, Integer num, u uVar, Character ch3) {
        this(str, num, uVar, ch3, null, 16, null);
    }

    public b(String str, Integer num, u uVar, Character ch3, Bitmap bitmap) {
        this.f14387a = str;
        this.f14388b = num;
        this.f14389c = uVar;
        this.f14390d = ch3;
        this.f14391e = bitmap;
    }

    public b() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Bitmap bitmap) {
        this(null, null, null, null, bitmap, 15, null);
        bitmap.getClass();
    }
}
