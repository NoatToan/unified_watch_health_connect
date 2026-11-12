package hk1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lhk1/h;", "Landroid/os/Parcelable;", "", "consumerKey", "", "permissions", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/util/List;", "d", "()Ljava/util/List;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("consumerKey")
    private final String consumerKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("permissions")
    private final List<String> permissions;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new h(parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i14) {
            return new h[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public h(String str, List<String> list) {
        str.getClass();
        this.consumerKey = str;
        this.permissions = list;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getConsumerKey() {
        return this.consumerKey;
    }

    public final List<String> d() {
        return this.permissions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean f(String str) {
        str.getClass();
        List<String> list = this.permissions;
        Object obj = null;
        if (list != null) {
            for (Object obj2 : list) {
                if (p005kotlin.jvm.internal.s.g((String) obj2, str)) {
                    obj = obj2;
                    break;
                }
            }
            obj = (String) obj;
        }
        return obj != null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.consumerKey);
        parcel.writeStringList(this.permissions);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lhk1/h$a;", "", "<init>", "()V", "", "COURSE_IMPORT_PERMISSION", "Ljava/lang/String;", "WORKOUT_IMPORT_PERMISSION", "ACTIVITY_EXPORT_PERMISSION", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
