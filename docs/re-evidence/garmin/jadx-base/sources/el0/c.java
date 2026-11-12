package el0;

import android.location.Location;
import android.util.SparseIntArray;
import c83.a0;
import com.garmin.proto.generated.GDIInternationalGolf;
import hl0.w;
import java.util.List;
import okhttp3.ResponseBody;
import sd2.h;
import sd2.i;

/* JADX INFO: loaded from: classes8.dex */
public interface c {
    a0<ResponseBody> a(List<GDIInternationalGolf.CourseUpdateRequestInfo> list);

    a0<ResponseBody> b(String str, String str2, String str3);

    a0<ResponseBody> c(List<GDIInternationalGolf.CourseUpdateRequestInfo> list);

    List<i> d();

    Object f(Location location, String str, int i14, int i15, String str2, w wVar);

    SparseIntArray g();

    h h(int i14, GDIInternationalGolf.MapType mapType);
}
