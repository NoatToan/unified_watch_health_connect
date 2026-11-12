package com.mi.health.course.export;

import com.mi.health.course.export.CourseManagerKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001b\u0010\u0000\u001a\u00020\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"courseManager", "Lcom/mi/health/course/export/CourseManager;", "getCourseManager", "()Lcom/mi/health/course/export/CourseManager;", "courseManager$delegate", "Lkotlin/Lazy;", "course-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CourseManagerKt {

    @NotNull
    private static final Lazy courseManager$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: qu4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CourseManagerKt.courseManager_delegate$lambda$0();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final CourseManager courseManager_delegate$lambda$0() {
        return ((CourseManagerPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), CourseManagerPoint.class)).getCourseManager();
    }

    @NotNull
    public static final CourseManager getCourseManager() {
        return (CourseManager) courseManager$delegate.getValue();
    }
}
