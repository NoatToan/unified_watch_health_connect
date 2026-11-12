package el0;

import android.database.Cursor;
import android.database.SQLException;
import android.location.Location;
import android.util.SparseIntArray;
import c83.a0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.proto.generated.GDIInternationalGolf;
import hl0.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import okhttp3.ResponseBody;
import p005kotlin.Metadata;
import p13.h0;
import p13.y;
import rd2.l;
import sd2.h;
import sd2.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lel0/e;", "Lel0/c;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lel0/b;", "golfCoursesApi", "Lrd2/l;", "downloadedCourseDAO", "<init>", "(Lel0/b;Lrd2/l;)V", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements c, f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f64535a;

    public e(b bVar, l lVar) {
        bVar.getClass();
        lVar.getClass();
        this.f64535a = bVar;
    }

    @Override // el0.c
    public final a0<ResponseBody> a(List<GDIInternationalGolf.CourseUpdateRequestInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (GDIInternationalGolf.CourseUpdateRequestInfo courseUpdateRequestInfo : list) {
            fl0.b bVar = (courseUpdateRequestInfo.hasPartNumber() && courseUpdateRequestInfo.hasGlobalId()) ? new fl0.b(Integer.valueOf(courseUpdateRequestInfo.getGlobalId()), courseUpdateRequestInfo.getPartNumber()) : null;
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        a0<ResponseBody> a0VarExecute = this.f64535a.a(arrayList).execute();
        a0VarExecute.getClass();
        return a0VarExecute;
    }

    @Override // el0.c
    public final a0<ResponseBody> b(String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        a0<ResponseBody> a0VarExecute = this.f64535a.b(str, str2, str3).execute();
        a0VarExecute.getClass();
        return a0VarExecute;
    }

    @Override // el0.c
    public final a0<ResponseBody> c(List<GDIInternationalGolf.CourseUpdateRequestInfo> list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        for (GDIInternationalGolf.CourseUpdateRequestInfo courseUpdateRequestInfo : list) {
            arrayList.add(new fl0.a(Integer.valueOf(courseUpdateRequestInfo.getGlobalId()), Integer.valueOf(courseUpdateRequestInfo.getBuildId()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 134217724, null));
        }
        a0<ResponseBody> a0VarExecute = this.f64535a.c(arrayList).execute();
        a0VarExecute.getClass();
        return a0VarExecute;
    }

    @Override // el0.c
    public final List<i> d() {
        Collection collectionValues = l.f().values();
        collectionValues.getClass();
        return h0.b1(collectionValues);
    }

    @Override // el0.c
    public final Object f(Location location, String str, int i14, int i15, String str2, w wVar) {
        return C(new d(location, str, this, 50000, 32, i14, i15, str2, null), wVar);
    }

    @Override // el0.c
    public final SparseIntArray g() throws Throwable {
        SparseIntArray sparseIntArray;
        Cursor cursor = null;
        sparseIntArray = null;
        SparseIntArray sparseIntArray2 = null;
        cursor = null;
        try {
            try {
                Cursor cursorQuery = qd2.a.b().f144484a.query("golf_downloaded_course", new String[]{"global_layout_id", "download_status_id"}, "name is not null", null, null, null, "global_layout_id");
                if (cursorQuery != null) {
                    try {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                sparseIntArray = new SparseIntArray(cursorQuery.getCount());
                                try {
                                    int columnIndex = cursorQuery.getColumnIndex("global_layout_id");
                                    int columnIndex2 = cursorQuery.getColumnIndex("download_status_id");
                                    sparseIntArray.put(cursorQuery.getInt(columnIndex), cursorQuery.getInt(columnIndex2));
                                    while (!cursorQuery.isLast()) {
                                        cursorQuery.moveToNext();
                                        sparseIntArray.put(cursorQuery.getInt(columnIndex), cursorQuery.getInt(columnIndex2));
                                    }
                                    sparseIntArray2 = sparseIntArray;
                                } catch (SQLException e4) {
                                    e = e4;
                                    cursor = cursorQuery;
                                    l.f152081a.error("retrieveAllDownloadStatuses", (Throwable) e);
                                    rd2.a.a(cursor);
                                    sparseIntArray2 = sparseIntArray;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            cursor = cursorQuery;
                            rd2.a.a(cursor);
                            throw th;
                        }
                    } catch (SQLException e14) {
                        e = e14;
                        sparseIntArray = null;
                    }
                }
                rd2.a.a(cursorQuery);
            } catch (SQLException e15) {
                e = e15;
                sparseIntArray = null;
            }
            return sparseIntArray2 == null ? new SparseIntArray(0) : sparseIntArray2;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // el0.c
    public final h h(int i14, GDIInternationalGolf.MapType mapType) {
        mapType.getClass();
        return l.i(a.a(mapType), Integer.valueOf(i14));
    }
}
