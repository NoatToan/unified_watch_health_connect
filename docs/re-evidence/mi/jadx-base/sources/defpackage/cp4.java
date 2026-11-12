package defpackage;

import com.mi.health.course.api.CourseRequest;
import com.mi.health.course.vm.CourseBasePlayerVM;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;

/* JADX INFO: loaded from: classes5.dex */
public final class cp4 {
    public static void a(CourseBasePlayerVM courseBasePlayerVM, FitnessDataGetter fitnessDataGetter) {
        courseBasePlayerVM.dataGetter = fitnessDataGetter;
    }

    public static void b(CourseBasePlayerVM courseBasePlayerVM, CourseRequest courseRequest) {
        courseBasePlayerVM.request = courseRequest;
    }
}
