package com.xiaomi.fitness.sport.route.detail;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport.route.detail.UserFeedbackActivity;
import com.xiaomi.fitness.sport.route.detail.holder.ProblemDescriptionHolder;
import com.xiaomi.fitness.sport.view.viewmodel.RunningRouteDetailViewModel;
import defpackage.c1j;
import defpackage.dvi;
import defpackage.wzn;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B\t\b\u0007¢\u0006\u0004\b\u0018\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/UserFeedbackActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/sport/view/viewmodel/RunningRouteDetailViewModel;", "Lwzn;", "", "initParams", "()V", "initProblemDescriptionHolder", "initSubmitBtnClickListener", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/xiaomi/fitness/sport/route/detail/holder/ProblemDescriptionHolder;", "problemDescriptionHolder", "Lcom/xiaomi/fitness/sport/route/detail/holder/ProblemDescriptionHolder;", "", "routeId", "I", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class UserFeedbackActivity extends Hilt_UserFeedbackActivity<RunningRouteDetailViewModel, wzn> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String KEY_ROUTE_ID = "route_id";

    @NotNull
    public static final String TAG = "UserFeedbackActivity";
    private ProblemDescriptionHolder problemDescriptionHolder;
    private int routeId;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/UserFeedbackActivity$Companion;", "", "<init>", "()V", "TAG", "", "KEY_ROUTE_ID", "goToRunningRouteFeedbackPage", "", "context", "Landroid/content/Context;", "routeId", "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void goToRunningRouteFeedbackPage(@NotNull Context context, int routeId) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) UserFeedbackActivity.class);
            intent.putExtra("route_id", routeId);
            context.startActivity(intent);
        }
    }

    private final void initParams() {
        int intExtra = getIntent().getIntExtra("route_id", 0);
        this.routeId = intExtra;
        Logger.d(TAG, "initParams routeId=" + intExtra);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initProblemDescriptionHolder() {
        EditText problemDescEt = ((wzn) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(problemDescEt, "problemDescEt");
        TextView wordCountTv = ((wzn) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(wordCountTv, "wordCountTv");
        TextView submitBtn = ((wzn) getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(submitBtn, "submitBtn");
        ProblemDescriptionHolder problemDescriptionHolder = new ProblemDescriptionHolder(this, problemDescEt, wordCountTv, submitBtn);
        this.problemDescriptionHolder = problemDescriptionHolder;
        problemDescriptionHolder.initHolder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initSubmitBtnClickListener() {
        ViewExtKt.clickWithTrigger$default(((wzn) getMBinding()).B, 0L, new Function1() { // from class: sfq
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserFeedbackActivity.initSubmitBtnClickListener$lambda$0(this.f33598a, (TextView) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initSubmitBtnClickListener$lambda$0(UserFeedbackActivity this$0, TextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        ProblemDescriptionHolder problemDescriptionHolder = this$0.problemDescriptionHolder;
        ProblemDescriptionHolder problemDescriptionHolder2 = null;
        if (problemDescriptionHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("problemDescriptionHolder");
            problemDescriptionHolder = null;
        }
        if (!problemDescriptionHolder.problemDesIsValid()) {
            return Unit.INSTANCE;
        }
        ProblemDescriptionHolder problemDescriptionHolder3 = this$0.problemDescriptionHolder;
        if (problemDescriptionHolder3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("problemDescriptionHolder");
        } else {
            problemDescriptionHolder2 = problemDescriptionHolder3;
        }
        ((RunningRouteDetailViewModel) this$0.getMViewModel()).sendFeedbackToServer(this$0, problemDescriptionHolder2.getProblemDes(), this$0.routeId);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return dvi.W0;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // com.xiaomi.fitness.sport.route.detail.Hilt_UserFeedbackActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(c1j.s5);
        initParams();
        initProblemDescriptionHolder();
        initSubmitBtnClickListener();
    }
}
