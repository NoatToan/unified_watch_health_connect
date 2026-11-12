package com.xiaomi.fitness.electronic.scale;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.fitness.common.extensions.NetworkExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.electronic.scale.ShareConfirmActivity;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequest;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequestExtKt;
import com.xiaomi.fitness.electronic.scale.export.bean.ScaleData;
import com.xiaomi.fitness.electronic.scale.export.bean.ShareAccount;
import com.xiaomi.fitness.electronic.scale.export.bean.SharedUser;
import com.xiaomi.fitness.net.response.ApiException;
import defpackage.av1;
import defpackage.b6l;
import defpackage.bg4;
import defpackage.eji;
import defpackage.gui;
import defpackage.lk0;
import defpackage.wc0;
import defpackage.zzi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0019\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u0019\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/ShareConfirmActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/electronic/scale/ShareConfirmViewModel;", "Llk0;", "", "initView", "()V", "", "did", "createShare", "(Ljava/lang/String;)V", "initData", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "TAG", "Ljava/lang/String;", "userId", "", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nShareConfirmActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareConfirmActivity.kt\ncom/xiaomi/fitness/electronic/scale/ShareConfirmActivity\n+ 2 GsonExt.kt\ncom/xiaomi/fitness/common/extensions/GsonExtKt\n*L\n1#1,115:1\n29#2:116\n*S KotlinDebug\n*F\n+ 1 ShareConfirmActivity.kt\ncom/xiaomi/fitness/electronic/scale/ShareConfirmActivity\n*L\n66#1:116\n*E\n"})
public final class ShareConfirmActivity extends Hilt_ShareConfirmActivity<ShareConfirmViewModel, lk0> {

    @NotNull
    public static final String USER_ID = "USER_ID";

    @NotNull
    private final String TAG = "ShareConfirmActivity";

    @Nullable
    private String userId = "";

    /* JADX WARN: Multi-variable type inference failed */
    private final void createShare(String did) {
        ((ShareConfirmViewModel) getMViewModel()).createShare(this, this.userId, did, new Function0() { // from class: x4m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShareConfirmActivity.createShare$lambda$3(this.f38694a);
            }
        }, new Function0() { // from class: y4m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShareConfirmActivity.createShare$lambda$4(this.f39790a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createShare$lambda$3(ShareConfirmActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        this$0.setResult(-1, new Intent());
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createShare$lambda$4(ShareConfirmActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initData() {
        ((lk0) getMBinding()).B.setText(this.userId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.setTitle(getString(zzi.a5));
        }
        wc0 miuiActionBar2 = getMiuiActionBar();
        if (miuiActionBar2 != null) {
            miuiActionBar2.setBackgroundDrawable(ResourceExtKt.getResourceDrawable(this, eji.s));
        }
        setActionBarDisplayable(true);
        setActionBarExpandState(0);
        setActionBarResizeable(false);
        final String strValueOf = String.valueOf(getIntent().getCharSequenceExtra("DEVICE_DID"));
        this.userId = String.valueOf(getIntent().getCharSequenceExtra(USER_ID));
        b6l.b(((lk0) getMBinding()).A, new bg4() { // from class: u4m
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                ShareConfirmActivity.initView$lambda$2(this.f35377a, strValueOf, obj);
            }
        });
        initData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(final ShareConfirmActivity this$0, final String did, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(did, "$did");
        if (!NetworkExtKt.isNetworkAvailable()) {
            ToastUtil.showShortToast(this$0.getResources().getString(zzi.g4));
        } else {
            this$0.showLoading();
            ElectronicScaleRequest.DefaultImpls.getShareList$default(ElectronicScaleRequestExtKt.getInstance(ElectronicScaleRequest.INSTANCE), 1, null, new Function1() { // from class: v4m
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return ShareConfirmActivity.initView$lambda$2$lambda$0(this.f36474a, did, (ScaleData) obj2);
                }
            }, new Function1() { // from class: w4m
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return ShareConfirmActivity.initView$lambda$2$lambda$1(this.f37619a, (ApiException) obj2);
                }
            }, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initView$lambda$2$lambda$0(ShareConfirmActivity this$0, String did, ScaleData it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(did, "$did");
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z = false;
        for (ShareAccount shareAccount : ((SharedUser) new Gson().fromJson(it.getResp(), new TypeToken<SharedUser>() { // from class: com.xiaomi.fitness.electronic.scale.ShareConfirmActivity$initView$lambda$2$lambda$0$$inlined$fromJson$1
        }.getType())).getData()) {
            if (Intrinsics.areEqual(((lk0) this$0.getMBinding()).B.getText().toString(), shareAccount.getShareUserId()) && Intrinsics.areEqual(did, shareAccount.getDid())) {
                z = true;
            }
        }
        if (z) {
            this$0.dismissDialogForce();
            Context baseContext = this$0.getBaseContext();
            Intrinsics.checkNotNullExpressionValue(baseContext, "getBaseContext(...)");
            String string = this$0.getBaseContext().getString(zzi.f);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ToastExtKt.toastShort(baseContext, string);
        } else {
            this$0.createShare(did);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$2$lambda$1(ShareConfirmActivity this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.hideLoading();
        Context baseContext = this$0.getBaseContext();
        Intrinsics.checkNotNullExpressionValue(baseContext, "getBaseContext(...)");
        String string = this$0.getBaseContext().getString(zzi.i);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        ToastExtKt.toastShort(baseContext, string);
        Logger.e(this$0.TAG, "BindScaleRequest().getShareList, share to other, failed", it);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    /* JADX INFO: renamed from: getLayoutId */
    public int getMContentLayoutId() {
        return gui.f19344r;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return av1.f3479a;
    }

    @Override // com.xiaomi.fitness.electronic.scale.Hilt_ShareConfirmActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActionBarDisplayable(false);
        initView();
    }
}
