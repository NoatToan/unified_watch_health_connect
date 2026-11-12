package fl0;

import com.google.gson.annotations.SerializedName;
import i3.e5;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;
import u62.z;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\n\u0010\u0012¨\u0006\u0013"}, d2 = {"Lfl0/c;", "", "", "totalRowCount", "currentPage", "", "Lfl0/a;", "courses", "<init>", "(IILjava/util/List;)V", "a", "I", "getTotalRowCount", "()I", "b", "getCurrentPage", "c", "Ljava/util/List;", "()Ljava/util/List;", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("TotalRowCount")
    private final int totalRowCount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("CurrentPage")
    private final int currentPage;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Courses")
    private final List<a> courses;

    public c(int i14, int i15, List<a> list) {
        list.getClass();
        this.totalRowCount = i14;
        this.currentPage = i15;
        this.courses = list;
    }

    public final List<a> a() {
        return this.courses;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.totalRowCount == cVar.totalRowCount && this.currentPage == cVar.currentPage && s.g(this.courses, cVar.courses);
    }

    public final int hashCode() {
        return this.courses.hashCode() + q2.d(this.currentPage, Integer.hashCode(this.totalRowCount) * 31, 31);
    }

    public final String toString() {
        int i14 = this.totalRowCount;
        int i15 = this.currentPage;
        return z.c(e5.j(i14, i15, "GolfCoursesDTO(totalRowCount=", ", currentPage=", ", courses="), this.courses, ")");
    }
}
