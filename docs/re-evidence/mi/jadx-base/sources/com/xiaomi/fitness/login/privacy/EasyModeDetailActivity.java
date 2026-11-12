package com.xiaomi.fitness.login.privacy;

import android.os.Bundle;
import android.view.View;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.login.privacy.EasyModeDetailActivity;
import defpackage.dv1;
import defpackage.g0j;
import defpackage.mui;
import defpackage.rqe;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/login/privacy/EasyModeDetailActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/login/privacy/PrivacyViewModel;", "Lrqe;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "()V", "Companion", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class EasyModeDetailActivity extends BaseBindingActivity<PrivacyViewModel, rqe> {
    public static final int RESULT_CODE_ENTER_EASY_MODE = 100;
    public static final int RESULT_CODE_EXIT_APP = 101;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(EasyModeDetailActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setResult(101);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(EasyModeDetailActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setResult(100);
        this$0.finish();
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return mui.f;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return dv1.f15951a;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(g0j.C);
        getMBinding().A.setOnClickListener(new View.OnClickListener() { // from class: da7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EasyModeDetailActivity.onCreate$lambda$0(this.f15299a, view);
            }
        });
        getMBinding().B.setOnClickListener(new View.OnClickListener() { // from class: ea7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EasyModeDetailActivity.onCreate$lambda$1(this.f16442a, view);
            }
        });
    }
}
