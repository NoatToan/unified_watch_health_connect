package ps;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lps/a;", "Landroid/os/Parcelable;", "", "typeId", "", "typeKey", "<init>", "(ILjava/lang/String;)V", "a", "I", "d", "()I", "b", "Ljava/lang/String;", "getTypeKey", "()Ljava/lang/String;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C2645a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("typeId")
    private final int typeId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("typeKey")
    private final String typeKey;

    /* JADX INFO: renamed from: ps.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2645a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(int i14, String str, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? -1 : i14, (i15 & 2) != 0 ? null : str);
    }

    public final PrivacyType b() {
        return PrivacyType.Companion.b(PrivacyType.INSTANCE, this.typeKey);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getTypeId() {
        return this.typeId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.typeId);
        parcel.writeString(this.typeKey);
    }

    public a(int i14, String str) {
        this.typeId = i14;
        this.typeKey = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }
}
