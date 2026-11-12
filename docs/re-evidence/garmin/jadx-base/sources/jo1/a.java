package jo1;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.social.conversation.model.GroupFeedTypeJsonAdapter;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\bB\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ljo1/a;", "Landroid/os/Parcelable;", "Ljo1/d;", "groupFeedType", "Lcom/google/gson/JsonElement;", "data", "<init>", "(Ljo1/d;Lcom/google/gson/JsonElement;)V", "a", "Ljo1/d;", "getGroupFeedType", "()Ljo1/d;", "b", "Lcom/google/gson/JsonElement;", "getData", "()Lcom/google/gson/JsonElement;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("groupFeedType")
    @JsonAdapter(GroupFeedTypeJsonAdapter.class)
    private final d groupFeedType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("data")
    private final JsonElement data;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f99764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActivityListItemDTO f99765d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readInt() == 0 ? null : d.valueOf(parcel.readString()), (JsonElement) parcel.readValue(a.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f99766a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.NEWS_POSTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.ACTIVITY_LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f99766a = iArr;
        }
    }

    static {
        new C1919a(null);
        CREATOR = new b();
    }

    public /* synthetic */ a(d dVar, JsonElement jsonElement, int i14, j jVar) {
        this(dVar, (i14 & 2) != 0 ? null : jsonElement);
    }

    public final ActivityListItemDTO b() {
        d dVar = this.groupFeedType;
        ActivityListItemDTO activityListItemDTO = null;
        if ((dVar == null ? -1 : c.f99766a[dVar.ordinal()]) == 2) {
            ActivityListItemDTO activityListItemDTO2 = this.f99765d;
            if (activityListItemDTO2 != null) {
                return activityListItemDTO2;
            }
            try {
                GsonUtil.f47252a.getClass();
                activityListItemDTO = (ActivityListItemDTO) GsonUtil.f47253b.fromJson(this.data, ActivityListItemDTO.class);
            } catch (Exception e4) {
                String message = e4.getMessage();
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.f(a2Var, "AllFeedDTO", message);
            }
            this.f99765d = activityListItemDTO;
        }
        return activityListItemDTO;
    }

    public final e d() {
        d dVar = this.groupFeedType;
        e eVar = null;
        if ((dVar == null ? -1 : c.f99766a[dVar.ordinal()]) == 1) {
            e eVar2 = this.f99764c;
            if (eVar2 != null) {
                return eVar2;
            }
            try {
                GsonUtil.f47252a.getClass();
                eVar = (e) GsonUtil.f47253b.fromJson(this.data, e.class);
            } catch (Exception e4) {
                String message = e4.getMessage();
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.f(a2Var, "AllFeedDTO", message);
            }
            this.f99764c = eVar;
        }
        return eVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.groupFeedType == aVar.groupFeedType && s.g(this.data, aVar.data);
    }

    public final boolean f() {
        return this.groupFeedType == d.ACTIVITY_LIST;
    }

    public final boolean g() {
        return this.groupFeedType == d.NEWS_POSTS;
    }

    public final int hashCode() {
        d dVar = this.groupFeedType;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        JsonElement jsonElement = this.data;
        return iHashCode + (jsonElement != null ? jsonElement.hashCode() : 0);
    }

    public final String toString() {
        return "AllFeedDTO(groupFeedType=" + this.groupFeedType + ", data=" + this.data + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        d dVar = this.groupFeedType;
        if (dVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(dVar.name());
        }
        parcel.writeValue(this.data);
    }

    /* JADX INFO: renamed from: jo1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljo1/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1919a {
        public /* synthetic */ C1919a(j jVar) {
            this();
        }

        private C1919a() {
        }
    }

    public a(d dVar, JsonElement jsonElement) {
        this.groupFeedType = dVar;
        this.data = jsonElement;
    }
}
