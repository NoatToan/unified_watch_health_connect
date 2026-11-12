package defpackage;

import com.mi.health.course.api.CourseRequest;
import com.mi.health.course.api.CourseRequestV3;
import com.mi.health.course.vm.CourseInfoVM;

/* JADX INFO: loaded from: classes5.dex */
public final class xt4 {
    public static void a(CourseInfoVM courseInfoVM, CourseRequest courseRequest) {
        courseInfoVM.api = courseRequest;
    }

    public static void b(CourseInfoVM courseInfoVM, CourseRequestV3 courseRequestV3) {
        courseInfoVM.apiV3 = courseRequestV3;
    }
}
