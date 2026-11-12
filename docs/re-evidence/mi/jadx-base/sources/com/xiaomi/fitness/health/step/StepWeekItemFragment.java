package com.xiaomi.fitness.health.step;

import com.xiaomi.fitness.base.BasicDataViewModel;
import com.xiaomi.fitness.statistics.OneTrackReportAspect;
import com.xiaomi.fitness.statistics.export.annotation.OneTrackReport;
import defpackage.cja;
import defpackage.jui;
import defpackage.nrd;
import defpackage.s69;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0015¢\u0006\u0004\b\u0007\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/health/step/StepWeekItemFragment;", "Lcom/xiaomi/fitness/health/step/StepBaseDayWeekMonthFragment;", "Lcom/xiaomi/fitness/base/BasicDataViewModel;", "Lcja;", "", "initViewBinding", "()V", "onInvisible", "", "getFragmentPosition", "()I", "fragmentPosition", "getLayoutId", "layoutId", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class StepWeekItemFragment extends Hilt_StepWeekItemFragment<BasicDataViewModel, cja> {
    private static /* synthetic */ Annotation ajc$anno$0;
    private static /* synthetic */ nrd.a ajc$tjp_0;

    static {
        ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
        s69 s69Var = new s69("StepWeekItemFragment.kt", StepWeekItemFragment.class);
        ajc$tjp_0 = s69Var.h("method-execution", s69Var.g("4", "onInvisible", "com.xiaomi.fitness.health.step.StepWeekItemFragment", "", "", "", "void"), 0);
    }

    @Override // com.xiaomi.fitness.health.step.StepBaseDayWeekMonthFragment
    public int getFragmentPosition() {
        return 1;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.z1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.health.step.StepBaseDayWeekMonthFragment
    public void initViewBinding() {
        setContainerView(((cja) getMBinding()).D);
        setRecyclerView(((cja) getMBinding()).C);
        setDataTitleView(((cja) getMBinding()).A);
        setRecyclerDetail(((cja) getMBinding()).B.B);
        setRecyclerActiveModelInfo(((cja) getMBinding()).B.A);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    @OneTrackReport(args = {"name", "step_detail_page", "page_fragment", "week", "title", "步数"}, tip = "56.4.5.1.21797")
    public void onInvisible() throws Throwable {
        OneTrackReportAspect oneTrackReportAspectAspectOf;
        Annotation annotation;
        nrd nrdVarB = s69.b(ajc$tjp_0, this, this);
        try {
            super.onInvisible();
            oneTrackReportAspectAspectOf = OneTrackReportAspect.aspectOf();
            Annotation annotation2 = ajc$anno$0;
            if (annotation2 == null) {
                Method declaredMethod = StepWeekItemFragment.class.getDeclaredMethod("onInvisible", new Class[0]);
            }
        } finally {
            oneTrackReportAspectAspectOf = OneTrackReportAspect.aspectOf();
            annotation = ajc$anno$0;
            if (annotation == null) {
                annotation = StepWeekItemFragment.class.getDeclaredMethod("onInvisible", new Class[0]).getAnnotation(OneTrackReport.class);
                ajc$anno$0 = annotation;
            }
            oneTrackReportAspectAspectOf.oneTrackReportPageView(nrdVarB, (OneTrackReport) annotation);
        }
    }
}
