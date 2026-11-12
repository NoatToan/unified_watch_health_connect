package x50;

import com.garmin.android.apps.connectmobile.R;
import d53.w;
import g22.n;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0003\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lx50/f;", "", "", "Lcom/garmin/android/apps/connectmobile/courses/model/d;", "allCourses", "", "courseNameFilterText", "Lx50/d;", "placeholder", "", "isSearching", "searchHasFocus", "", "searchHintRes", "areTrailsAvailable", "promotionDismissed", "courseListChanged", "<init>", "(Ljava/util/List;Ljava/lang/String;Lx50/d;ZZIZZZ)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<com.garmin.android.apps.connectmobile.courses.model.d> f189006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f189007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f189008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f189009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f189010e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f189011f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f189012g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f189013h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f189014i;

    public f(List list, String str, d dVar, boolean z14, boolean z15, int i14, boolean z16, boolean z17, boolean z18, int i15, j jVar) {
        this((i15 & 1) != 0 ? j0.f134944a : list, (i15 & 2) != 0 ? null : str, (i15 & 4) != 0 ? d.EMPTY : dVar, (i15 & 8) != 0 ? false : z14, (i15 & 16) != 0 ? false : z15, (i15 & 32) != 0 ? R.string.lbl_search : i14, (i15 & 64) != 0 ? false : z16, (i15 & 128) != 0 ? false : z17, (i15 & 256) != 0 ? false : z18);
    }

    public static f a(f fVar, List list, String str, d dVar, boolean z14, boolean z15, int i14, boolean z16, int i15) {
        if ((i15 & 1) != 0) {
            list = fVar.f189006a;
        }
        List list2 = list;
        if ((i15 & 2) != 0) {
            str = fVar.f189007b;
        }
        String str2 = str;
        if ((i15 & 4) != 0) {
            dVar = fVar.f189008c;
        }
        d dVar2 = dVar;
        boolean z17 = (i15 & 8) != 0 ? fVar.f189009d : z14;
        boolean z18 = (i15 & 16) != 0 ? fVar.f189010e : z15;
        int i16 = (i15 & 32) != 0 ? fVar.f189011f : i14;
        boolean z19 = (i15 & 64) != 0 ? fVar.f189012g : z16;
        boolean z24 = (i15 & 128) != 0 ? fVar.f189013h : true;
        boolean z25 = (i15 & 256) != 0 ? fVar.f189014i : true;
        fVar.getClass();
        list2.getClass();
        return new f(list2, str2, dVar2, z17, z18, i16, z19, z24, z25);
    }

    public final i53.c<com.garmin.android.apps.connectmobile.courses.model.d> b() {
        String str = this.f189007b;
        boolean zD = n.d(str);
        List<com.garmin.android.apps.connectmobile.courses.model.d> list = this.f189006a;
        if (!zD) {
            return i53.a.e(list);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String str2 = ((com.garmin.android.apps.connectmobile.courses.model.d) obj).courseName;
            if (str2 == null) {
                str2 = "";
            }
            if (w.z(str2, str, true)) {
                arrayList.add(obj);
            }
        }
        return i53.a.e(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.f189006a, fVar.f189006a) && s.g(this.f189007b, fVar.f189007b) && this.f189008c == fVar.f189008c && this.f189009d == fVar.f189009d && this.f189010e == fVar.f189010e && this.f189011f == fVar.f189011f && this.f189012g == fVar.f189012g && this.f189013h == fVar.f189013h && this.f189014i == fVar.f189014i;
    }

    public final int hashCode() {
        int iHashCode = this.f189006a.hashCode() * 31;
        String str = this.f189007b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        d dVar = this.f189008c;
        return Boolean.hashCode(this.f189014i) + q6.f.g(q6.f.g(q2.d(this.f189011f, q6.f.g(q6.f.g((iHashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31, 31, this.f189009d), 31, this.f189010e), 31), 31, this.f189012g), 31, this.f189013h);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CourseSearchState(allCourses=");
        sb3.append(this.f189006a);
        sb3.append(", courseNameFilterText=");
        sb3.append(this.f189007b);
        sb3.append(", placeholder=");
        sb3.append(this.f189008c);
        sb3.append(", isSearching=");
        sb3.append(this.f189009d);
        sb3.append(", searchHasFocus=");
        sb3.append(this.f189010e);
        sb3.append(", searchHintRes=");
        sb3.append(this.f189011f);
        sb3.append(", areTrailsAvailable=");
        kg.f.q(", promotionDismissed=", ", courseListChanged=", sb3, this.f189012g, this.f189013h);
        return hb.a.k(sb3, this.f189014i, ")");
    }

    public f(List<com.garmin.android.apps.connectmobile.courses.model.d> list, String str, d dVar, boolean z14, boolean z15, int i14, boolean z16, boolean z17, boolean z18) {
        list.getClass();
        this.f189006a = list;
        this.f189007b = str;
        this.f189008c = dVar;
        this.f189009d = z14;
        this.f189010e = z15;
        this.f189011f = i14;
        this.f189012g = z16;
        this.f189013h = z17;
        this.f189014i = z18;
    }

    public f() {
        this(null, null, null, false, false, 0, false, false, false, 511, null);
    }
}
