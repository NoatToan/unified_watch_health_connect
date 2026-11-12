package s20;

import c83.a0;
import i83.s;
import i83.t;
import o53.i0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\t\u0010\nJ9\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Ls20/a;", "", "", "smoothingEnabled", "", "coursePoints", "Lo53/i0;", "Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "b", "(ZLjava/lang/String;)Lo53/i0;", "map", "a", "(Ljava/lang/String;ZLjava/lang/String;)Lo53/i0;", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @i83.k({"Content-Type: application/json"})
    @i83.o("/course-service/course/elevation/from/{map}/CN")
    i0<a0<com.garmin.android.apps.connectmobile.courses.model.e>> a(@s("map") String map, @t("smoothingEnabled") boolean smoothingEnabled, @i83.a String coursePoints);

    @i83.k({"Content-Type: application/json"})
    @i83.o("/course-service/course/elevation")
    i0<a0<com.garmin.android.apps.connectmobile.courses.model.e>> b(@t("smoothingEnabled") boolean smoothingEnabled, @i83.a String coursePoints);
}
