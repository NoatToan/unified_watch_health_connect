package k30;

import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\tB!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lk30/l;", "", "", "Lcom/garmin/android/apps/connectmobile/courses/model/d;", "courseList", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "a", "Ljava/util/List;", "b", "Ljava/lang/String;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("courseSummaryDTOs")
    public final List<com.garmin.android.apps.connectmobile.courses.model.d> courseList;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName(Constants.IPC_BUNDLE_KEY_SEND_ERROR)
    private final String error;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f102567c;

    static {
        new a(null);
    }

    public l(List<com.garmin.android.apps.connectmobile.courses.model.d> list, String str) {
        list.getClass();
        this.courseList = list;
        this.error = str;
        this.f102567c = "BoundingBoxSizeException".equalsIgnoreCase(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return p005kotlin.jvm.internal.s.g(this.courseList, lVar.courseList) && p005kotlin.jvm.internal.s.g(this.error, lVar.error);
    }

    public final int hashCode() {
        int iHashCode = this.courseList.hashCode() * 31;
        String str = this.error;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CourseSearchResultDTO(courseList=" + this.courseList + ", error=" + this.error + ")";
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lk30/l$a;", "", "<init>", "()V", "", "BOUNDING_BOX_EXCEPTION", "Ljava/lang/String;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ l(List list, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this(list, (i14 & 2) != 0 ? null : str);
    }
}
