package com.xiaomi.fitness.sport.view;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sport.utils.AidongMotionSensingCourseUtilExtKt;
import com.xiaomi.fitness.sport.view.SensingGameCourseSdkCheckActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/sport/view/SensingGameCourseSdkCheckActivity;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SensingGameCourseSdkCheckActivity extends FragmentActivity {

    @NotNull
    public static final String TAG = "SensingGameCourseCheck";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(SensingGameCourseSdkCheckActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "check process interruption");
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(SensingGameCourseSdkCheckActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "jump success ");
        this$0.finish();
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AidongMotionSensingCourseUtilExtKt.doAllNecessaryCheckAndGoToAidongSdkIfNeed(new Function0() { // from class: utl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SensingGameCourseSdkCheckActivity.onCreate$lambda$0(this.f36122a);
            }
        }, this, new Function0() { // from class: vtl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SensingGameCourseSdkCheckActivity.onCreate$lambda$1(this.f37216a);
            }
        });
    }
}
