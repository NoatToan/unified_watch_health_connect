package iv;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.joran.action.Action;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import u62.z;
import wr.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\tB)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Liv/b;", "Landroid/os/Parcelable;", "", "clazz", "settingId", "", "stringValues", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "a", "Ljava/lang/String;", "getClazz", "()Ljava/lang/String;", "b", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(Action.CLASS_ATTRIBUTE)
    private final String clazz;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("settingId")
    private final String settingId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("stringValues")
    private final List<String> stringValues;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f95061d = new a(null);
    public static final Parcelable.Creator<b> CREATOR = new C1821b();

    /* JADX INFO: renamed from: iv.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1821b implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(String str, String str2, List<String> list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.clazz = str;
        this.settingId = str2;
        this.stringValues = list;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSettingId() {
        return this.settingId;
    }

    public final List<String> d() {
        return this.stringValues;
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
        return s.g(this.clazz, bVar.clazz) && s.g(this.settingId, bVar.settingId) && s.g(this.stringValues, bVar.stringValues);
    }

    public final int hashCode() {
        return this.stringValues.hashCode() + g.j(this.clazz.hashCode() * 31, 31, this.settingId);
    }

    public final String toString() {
        String str = this.clazz;
        String str2 = this.settingId;
        return z.c(p6.b.i("SettingValues(clazz=", str, ", settingId=", str2, ", stringValues="), this.stringValues, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.clazz);
        parcel.writeString(this.settingId);
        parcel.writeStringList(this.stringValues);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Liv/b$a;", "", "<init>", "()V", "", "FAVORITE_ACTIVITY_SPORTS_SUBSPORTS_SETTING_ID", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ b(String str, String str2, List list, int i14, j jVar) {
        this((i14 & 1) != 0 ? ".SettingValue" : str, (i14 & 2) != 0 ? "DeviceSettingId.FAVORITE_ACTIVITY_SPORTS_SUBSPORTS" : str2, list);
    }
}
