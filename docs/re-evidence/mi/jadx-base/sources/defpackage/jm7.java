package defpackage;

import com.mi.health.course.api.CourseRequest;
import com.mi.health.course.eco.vm.EcoCourseBasePlayerVM;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;

/* JADX INFO: loaded from: classes5.dex */
public final class jm7 {
    public static void a(EcoCourseBasePlayerVM ecoCourseBasePlayerVM, FitnessDataGetter fitnessDataGetter) {
        ecoCourseBasePlayerVM.dataGetter = fitnessDataGetter;
    }

    public static void b(EcoCourseBasePlayerVM ecoCourseBasePlayerVM, CourseRequest courseRequest) {
        ecoCourseBasePlayerVM.request = courseRequest;
    }
}
