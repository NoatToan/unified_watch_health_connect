package defpackage;

import com.mi.health.course.export.CourseApi;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fitness.trail.viewmodel.RecordListVM;

/* JADX INFO: loaded from: classes10.dex */
public final class y7k {
    public static void a(RecordListVM recordListVM, CourseApi courseApi) {
        recordListVM.api = courseApi;
    }

    public static void b(RecordListVM recordListVM, FitnessDataGetter fitnessDataGetter) {
        recordListVM.dataGetter = fitnessDataGetter;
    }
}
