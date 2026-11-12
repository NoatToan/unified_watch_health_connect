package com.xiaomi.fitness.mine.personal.data.management;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.baseui.common.NetworkFallbackExtKt;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.mine.personal.data.management.LabCollaborationManagementActivity;
import com.xiaomi.fitness.mine.personal.data.management.data.PersonalDataManagementExtKt;
import com.xiaomi.fitness.mine.personal.data.management.data.model.LabCollaborationAuthConfig;
import com.xiaomi.onetrack.c.q;
import defpackage.m0j;
import defpackage.rui;
import defpackage.v1g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001dB\t\b\u0007¢\u0006\u0004\b\u001c\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000f\u0010\u0006R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/mine/personal/data/management/LabCollaborationManagementActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/mine/personal/data/management/DataManagementViewModel;", "Lv1g;", "", Constants.KEY_REQUEST_DATA, "()V", "Lcom/xiaomi/fitness/mine/personal/data/management/data/model/LabCollaborationAuthConfig;", "authConfig", "bindDataWithUi", "(Lcom/xiaomi/fitness/mine/personal/data/management/data/model/LabCollaborationAuthConfig;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "", "appName", "Ljava/lang/String;", "", q.f13858b, "J", "", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class LabCollaborationManagementActivity extends Hilt_LabCollaborationManagementActivity<DataManagementViewModel, v1g> {

    @NotNull
    public static final String TAG = "LabCollaborationManagementActivity";
    private long appId;

    @Nullable
    private String appName;

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindDataWithUi(LabCollaborationAuthConfig authConfig) {
        if (authConfig == null) {
            return;
        }
        Logger.i(TAG, "getLabCollaborationAuthConfigLiveData authConfig==null");
        setTitle(authConfig.getTitle());
        ((v1g) getMBinding()).I.setText(authConfig.getContent());
        int authStatus = authConfig.getAuthStatus();
        boolean exitable = authConfig.getExitable();
        boolean z = authStatus == 1;
        LinearLayout bottomButtons = ((v1g) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(bottomButtons, "bottomButtons");
        ViewExtKt.setVisible(bottomButtons, !z);
        if (!z) {
            TextView btnConfirm = ((v1g) getMBinding()).D;
            Intrinsics.checkNotNullExpressionValue(btnConfirm, "btnConfirm");
            ViewExtKt.gone(btnConfirm);
            ViewExtKt.clickWithTrigger$default(((v1g) getMBinding()).C, 0L, new Function1() { // from class: a2e
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return LabCollaborationManagementActivity.bindDataWithUi$lambda$4(this.f548a, (TextView) obj);
                }
            }, 1, null);
            ViewExtKt.clickWithTrigger$default(((v1g) getMBinding()).B, 0L, new Function1() { // from class: b2e
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return LabCollaborationManagementActivity.bindDataWithUi$lambda$7(this.f3712a, (TextView) obj);
                }
            }, 1, null);
            return;
        }
        TextView btnConfirm2 = ((v1g) getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(btnConfirm2, "btnConfirm");
        ViewExtKt.setVisible(btnConfirm2, exitable);
        if (exitable) {
            ((v1g) getMBinding()).D.setText(m0j.C);
            ViewExtKt.clickWithTrigger$default(((v1g) getMBinding()).D, 0L, new Function1() { // from class: z1e
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return LabCollaborationManagementActivity.bindDataWithUi$lambda$3(this.f40779a, (TextView) obj);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindDataWithUi$lambda$3(final LabCollaborationManagementActivity this$0, TextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        ((DataManagementViewModel) this$0.getMViewModel()).revokeLabAuthLiveData(this$0.appId, PersonalDataManagementExtKt.getCurtDeviceModelDid()).observe(this$0, new LabCollaborationManagementActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: f2e
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LabCollaborationManagementActivity.bindDataWithUi$lambda$3$lambda$2(this.f17331a, (Boolean) obj);
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindDataWithUi$lambda$3$lambda$2(LabCollaborationManagementActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ToastExtKt.toastShort(this$0, bool.booleanValue() ? m0j.b0 : m0j.a0);
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindDataWithUi$lambda$4(LabCollaborationManagementActivity this$0, TextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindDataWithUi$lambda$7(final LabCollaborationManagementActivity this$0, TextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        NetworkFallbackExtKt.checkNetworkAndProcessIfAvailable(new Function0() { // from class: e2e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LabCollaborationManagementActivity.bindDataWithUi$lambda$7$lambda$6(this.f16191a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindDataWithUi$lambda$7$lambda$6(final LabCollaborationManagementActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((DataManagementViewModel) this$0.getMViewModel()).grantLabAuthLiveData(this$0.appId, PersonalDataManagementExtKt.getCurtDeviceModelDid()).observe(this$0, new LabCollaborationManagementActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: y1e
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LabCollaborationManagementActivity.bindDataWithUi$lambda$7$lambda$6$lambda$5(this.f39681a, (Boolean) obj);
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindDataWithUi$lambda$7$lambda$6$lambda$5(LabCollaborationManagementActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ToastExtKt.toastShort(this$0, bool.booleanValue() ? m0j.o : m0j.n);
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$0(LabCollaborationManagementActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.requestData();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void requestData() {
        ((DataManagementViewModel) getMViewModel()).getLabCollaborationAuthConfigLiveData(this.appId, PersonalDataManagementExtKt.getCurtDeviceModelDid()).observe(this, new LabCollaborationManagementActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: d2e
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LabCollaborationManagementActivity.requestData$lambda$1(this.f14994a, (LabCollaborationAuthConfig) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestData$lambda$1(LabCollaborationManagementActivity this$0, LabCollaborationAuthConfig labCollaborationAuthConfig) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.bindDataWithUi(labCollaborationAuthConfig);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return rui.o;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // com.xiaomi.fitness.mine.personal.data.management.Hilt_LabCollaborationManagementActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.appName = getIntent().getStringExtra(PersonalDataManagementExtKt.PARAM_APP_NAME);
        this.appId = getIntent().getLongExtra(PersonalDataManagementExtKt.PARAM_APP_ID, 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        TextView noNetwork = ((v1g) getMBinding()).K;
        Intrinsics.checkNotNullExpressionValue(noNetwork, "noNetwork");
        ConstraintLayout content = ((v1g) getMBinding()).H;
        Intrinsics.checkNotNullExpressionValue(content, "content");
        NetworkFallbackExtKt.handleUnavailableNetworkAndShowFallbackPageIfNeed$default(noNetwork, content, null, new Function0() { // from class: c2e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LabCollaborationManagementActivity.onResume$lambda$0(this.f4860a);
            }
        }, 4, null);
    }
}
