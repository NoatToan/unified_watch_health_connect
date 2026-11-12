package qw0;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lqw0/u;", "Landroid/os/Parcelable;", "Lqw0/v;", "switchType", "", "isOn", "enabled", "", "alternateTextResId", "<init>", "(Lqw0/v;ZZLjava/lang/Integer;)V", "gcm-map_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u implements Parcelable {
    public static final Parcelable.Creator<u> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f148348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f148349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f148350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f148351d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<u> {
        @Override // android.os.Parcelable.Creator
        public final u createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new u(v.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final u[] newArray(int i14) {
            return new u[i14];
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(v vVar, boolean z14, boolean z15) {
        this(vVar, z14, z15, null, 8, null);
        vVar.getClass();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        this.f148348a.writeToParcel(parcel, i14);
        parcel.writeInt(this.f148349b ? 1 : 0);
        parcel.writeInt(this.f148350c ? 1 : 0);
        Integer num = this.f148351d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
    }

    public u(v vVar, boolean z14, boolean z15, Integer num) {
        vVar.getClass();
        this.f148348a = vVar;
        this.f148349b = z14;
        this.f148350c = z15;
        this.f148351d = num;
    }

    public /* synthetic */ u(v vVar, boolean z14, boolean z15, Integer num, int i14, p005kotlin.jvm.internal.j jVar) {
        this(vVar, z14, z15, (i14 & 8) != 0 ? null : num);
    }
}
