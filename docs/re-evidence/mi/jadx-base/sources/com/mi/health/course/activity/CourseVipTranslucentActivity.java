package com.mi.health.course.activity;

import android.os.Bundle;
import com.mi.health.course.activity.CourseVipTranslucentActivity;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u0018H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0015\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/mi/health/course/activity/CourseVipTranslucentActivity;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "courseId", "", "getCourseId", "()J", "courseId$delegate", "Lkotlin/Lazy;", "courseName", "", "getCourseName", "()Ljava/lang/String;", "courseName$delegate", "courseSource", "", "getCourseSource", "()I", "courseSource$delegate", "vipSource", "getVipSource", "vipSource$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "finish", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CourseVipTranslucentActivity extends Hilt_CourseVipTranslucentActivity {

    /* JADX INFO: renamed from: courseId$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy courseId = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: a05
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Long.valueOf(CourseVipTranslucentActivity.courseId_delegate$lambda$0(this.f464a));
        }
    });

    /* JADX INFO: renamed from: courseName$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy courseName = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: b05
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CourseVipTranslucentActivity.courseName_delegate$lambda$1(this.f3635a);
        }
    });

    /* JADX INFO: renamed from: courseSource$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy courseSource = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: c05
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(CourseVipTranslucentActivity.courseSource_delegate$lambda$2(this.f4772a));
        }
    });

    /* JADX INFO: renamed from: vipSource$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vipSource = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: d05
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(CourseVipTranslucentActivity.vipSource_delegate$lambda$3(this.f14915a));
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final long courseId_delegate$lambda$0(CourseVipTranslucentActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getIntent().getLongExtra("id", 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String courseName_delegate$lambda$1(CourseVipTranslucentActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String stringExtra = this$0.getIntent().getStringExtra("name");
        return stringExtra == null ? "" : stringExtra;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int courseSource_delegate$lambda$2(CourseVipTranslucentActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getIntent().getIntExtra("source", 0);
    }

    private final long getCourseId() {
        return ((Number) this.courseId.getValue()).longValue();
    }

    private final String getCourseName() {
        return (String) this.courseName.getValue();
    }

    private final int getCourseSource() {
        return ((Number) this.courseSource.getValue()).intValue();
    }

    private final int getVipSource() {
        return ((Number) this.vipSource.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$5$lambda$4(CourseVipTranslucentActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int vipSource_delegate$lambda$3(CourseVipTranslucentActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getIntent().getIntExtra("vipSource", 0);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.mi.health.course.activity.Hilt_CourseVipTranslucentActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CourseOpenVipFragment.Companion companion = CourseOpenVipFragment.INSTANCE;
        CourseOpenVipFragment courseOpenVipFragmentInstance = companion.instance(getCourseId(), getCourseName(), getCourseSource(), getVipSource());
        courseOpenVipFragmentInstance.setOnDismissAction(new Function0() { // from class: e05
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CourseVipTranslucentActivity.onCreate$lambda$5$lambda$4(this.f16114a);
            }
        });
        courseOpenVipFragmentInstance.show(getSupportFragmentManager(), companion.getTAG());
    }
}
