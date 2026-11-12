package defpackage;

import com.google.gson.Gson;
import com.mi.health.course.api.CourseApiImpl;
import com.mi.health.course.api.CourseRequestV3;
import com.mi.health.course.api.CourseVipActivityRequest;
import com.mi.health.course.api.CourseVipRequest;

/* JADX INFO: loaded from: classes5.dex */
public final class zn4 {
    public static void a(CourseApiImpl courseApiImpl, CourseVipActivityRequest courseVipActivityRequest) {
        courseApiImpl.courseVipActivityRequest = courseVipActivityRequest;
    }

    public static void b(CourseApiImpl courseApiImpl, Gson gson) {
        courseApiImpl.mGson = gson;
    }

    public static void c(CourseApiImpl courseApiImpl, CourseRequestV3 courseRequestV3) {
        courseApiImpl.requestV3 = courseRequestV3;
    }

    public static void d(CourseApiImpl courseApiImpl, CourseVipRequest courseVipRequest) {
        courseApiImpl.requestVip = courseVipRequest;
    }
}
