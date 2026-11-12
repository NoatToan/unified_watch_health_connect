package com.xiaomi.fitness.mine.personal.data.management;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.baseui.common.NetworkFallbackExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.mine.personal.data.management.ThirdPartyAuthActivity;
import com.xiaomi.fitness.mine.personal.data.management.data.PersonalDataManagementExtKt;
import com.xiaomi.fitness.mine.personal.data.management.data.model.GetThirdPartyResult;
import com.xiaomi.onetrack.c.q;
import defpackage.m0j;
import defpackage.rui;
import defpackage.z2g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001fB\t\b\u0007¢\u0006\u0004\b\u001e\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/mine/personal/data/management/ThirdPartyAuthActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/mine/personal/data/management/DataManagementViewModel;", "Lz2g;", "", Constants.KEY_REQUEST_DATA, "()V", "Lcom/xiaomi/fitness/mine/personal/data/management/data/model/GetThirdPartyResult;", "authConfig", "bindDataWithUi", "(Lcom/xiaomi/fitness/mine/personal/data/management/data/model/GetThirdPartyResult;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "appName", "Ljava/lang/String;", "", q.f13858b, "J", CloudContract.COL_TENANT_ID, "", "thirdPartyType", "I", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ThirdPartyAuthActivity extends Hilt_ThirdPartyAuthActivity<DataManagementViewModel, z2g> {

    @NotNull
    public static final String TAG = "ThirdPartyAuthUI";
    private long appId;

    @Nullable
    private String appName;
    private long tenantId;
    private int thirdPartyType;

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindDataWithUi(GetThirdPartyResult authConfig) {
        if (authConfig == null) {
            return;
        }
        setTitle(authConfig.getTitle());
        ((z2g) getMBinding()).I.setText(authConfig.getContent());
        int authStatus = authConfig.getAuthStatus();
        boolean exitEnable = authConfig.getExitEnable();
        boolean z = authStatus == 1;
        LinearLayout bottomButtons = ((z2g) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(bottomButtons, "bottomButtons");
        ViewExtKt.setVisible(bottomButtons, !z);
        if (!z) {
            TextView btnConfirm = ((z2g) getMBinding()).D;
            Intrinsics.checkNotNullExpressionValue(btnConfirm, "btnConfirm");
            ViewExtKt.gone(btnConfirm);
            ViewExtKt.clickWithTrigger$default(((z2g) getMBinding()).C, 0L, new Function1() { // from class: pbp
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ThirdPartyAuthActivity.bindDataWithUi$lambda$4(this.f30218a, (TextView) obj);
                }
            }, 1, null);
            ViewExtKt.clickWithTrigger$default(((z2g) getMBinding()).B, 0L, new Function1() { // from class: qbp
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ThirdPartyAuthActivity.bindDataWithUi$lambda$7(this.f31347a, (TextView) obj);
                }
            }, 1, null);
            return;
        }
        TextView btnConfirm2 = ((z2g) getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(btnConfirm2, "btnConfirm");
        ViewExtKt.setVisible(btnConfirm2, exitEnable);
        if (exitEnable) {
            ((z2g) getMBinding()).D.setText(m0j.C);
            ViewExtKt.clickWithTrigger$default(((z2g) getMBinding()).D, 0L, new Function1() { // from class: obp
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ThirdPartyAuthActivity.bindDataWithUi$lambda$3(this.f28977a, (TextView) obj);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindDataWithUi$lambda$3(final ThirdPartyAuthActivity this$0, TextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        ((DataManagementViewModel) this$0.getMViewModel()).setThirdPartyAuthResultLiveData(this$0.thirdPartyType, this$0.appId, false).observe(this$0, new ThirdPartyAuthActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: lbp
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThirdPartyAuthActivity.bindDataWithUi$lambda$3$lambda$2(this.f24876a, (Boolean) obj);
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindDataWithUi$lambda$3$lambda$2(ThirdPartyAuthActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ToastExtKt.toastShort(this$0, bool.booleanValue() ? m0j.b0 : m0j.a0);
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindDataWithUi$lambda$4(ThirdPartyAuthActivity this$0, TextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindDataWithUi$lambda$7(final ThirdPartyAuthActivity this$0, TextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        NetworkFallbackExtKt.checkNetworkAndProcessIfAvailable(new Function0() { // from class: nbp
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ThirdPartyAuthActivity.bindDataWithUi$lambda$7$lambda$6(this.f27760a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindDataWithUi$lambda$7$lambda$6(final ThirdPartyAuthActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((DataManagementViewModel) this$0.getMViewModel()).setThirdPartyAuthResultLiveData(this$0.thirdPartyType, this$0.appId, true).observe(this$0, new ThirdPartyAuthActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: jbp
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThirdPartyAuthActivity.bindDataWithUi$lambda$7$lambda$6$lambda$5(this.f22629a, (Boolean) obj);
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindDataWithUi$lambda$7$lambda$6$lambda$5(ThirdPartyAuthActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ToastExtKt.toastShort(this$0, bool.booleanValue() ? m0j.o : m0j.n);
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(ThirdPartyAuthActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.requestData();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void requestData() {
        ((DataManagementViewModel) getMViewModel()).getThirdPartyAuthLiveData(this.thirdPartyType, this.appId).observe(this, new ThirdPartyAuthActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: mbp
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThirdPartyAuthActivity.requestData$lambda$1(this.f25982a, (GetThirdPartyResult) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestData$lambda$1(ThirdPartyAuthActivity this$0, GetThirdPartyResult getThirdPartyResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.bindDataWithUi(getThirdPartyResult);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return rui.x;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.mine.personal.data.management.Hilt_ThirdPartyAuthActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.appName = getIntent().getStringExtra(PersonalDataManagementExtKt.PARAM_APP_NAME);
        this.appId = getIntent().getLongExtra(PersonalDataManagementExtKt.PARAM_APP_ID, 0L);
        this.tenantId = getIntent().getLongExtra(PersonalDataManagementExtKt.PARAM_TENANT_ID, 0L);
        this.thirdPartyType = getIntent().getIntExtra(PersonalDataManagementExtKt.PARAM_THIRD_PARTY_TYPE, 0);
        TextView noNetwork = ((z2g) getMBinding()).K;
        Intrinsics.checkNotNullExpressionValue(noNetwork, "noNetwork");
        ConstraintLayout content = ((z2g) getMBinding()).H;
        Intrinsics.checkNotNullExpressionValue(content, "content");
        NetworkFallbackExtKt.handleUnavailableNetworkAndShowFallbackPageIfNeed$default(noNetwork, content, null, new Function0() { // from class: kbp
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ThirdPartyAuthActivity.onCreate$lambda$0(this.f23696a);
            }
        }, 4, null);
    }
}
