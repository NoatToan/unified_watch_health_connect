package defpackage;

import com.google.gson.Gson;
import com.mi.health.course.api.CourseRequest;
import com.mi.health.course.api.CourseRequestV3;

/* JADX INFO: loaded from: classes5.dex */
public final class bw4 {
    public static void a(CourseRequestV3 courseRequestV3, Gson gson) {
        courseRequestV3.gson = gson;
    }

    public static void b(CourseRequestV3 courseRequestV3, CourseRequest courseRequest) {
        courseRequestV3.requestOld = courseRequest;
    }
}
