package com.xiaomi.fitness.homepage;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.transform.RoundedCornersTransformation;
import com.fitness.permission.manager.export.IPermissionManager;
import com.fitness.permission.manager.export.PermissionExportExtKt;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.MultiplePermissionsBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.homepage.ShareCaloConsumActivity;
import com.xiaomi.fitness.homepage.model.ShareCaloConsumViewModel;
import com.xiaomi.fitness.homepage.util.HealthDataUtil;
import defpackage.c0j;
import defpackage.eri;
import defpackage.iji;
import defpackage.jui;
import defpackage.pni;
import defpackage.vnb;
import defpackage.x2j;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u001a\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u0013\u0010\f\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/homepage/ShareCaloConsumActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/homepage/model/ShareCaloConsumViewModel;", "Lvnb;", "", "handleBackAction", "()V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "bindView", "(Lvnb;)V", "Landroidx/fragment/app/FragmentActivity;", "fragmentActivity", "Lkotlin/Function0;", "callback", "checkExternalStoragePermissionIfNeed", "(Landroidx/fragment/app/FragmentActivity;Lkotlin/jvm/functions/Function0;)V", "", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nShareCaloConsumActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareCaloConsumActivity.kt\ncom/xiaomi/fitness/homepage/ShareCaloConsumActivity\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,187:1\n54#2,3:188\n24#2:191\n59#2,6:192\n*S KotlinDebug\n*F\n+ 1 ShareCaloConsumActivity.kt\ncom/xiaomi/fitness/homepage/ShareCaloConsumActivity\n*L\n84#1:188,3\n84#1:191\n84#1:192,6\n*E\n"})
public final class ShareCaloConsumActivity extends Hilt_ShareCaloConsumActivity<ShareCaloConsumViewModel, vnb> {

    @NotNull
    public static final String sTag = "ShareCaloConsumActivity";

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$0(ShareCaloConsumActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.handleBackAction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$1(vnb this_bindView, AccountCoreInfo accountCoreInfo) {
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        this_bindView.A.setTime(TimeDateUtil.getDateYYYYMMddLocalFormat(LocalDate.now()));
        this_bindView.A.initAccountInfo(accountCoreInfo);
        this_bindView.A.setTextToDarkColor();
        this_bindView.A.setAvatarViewWithStroke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$10(final ShareCaloConsumActivity this$0, final vnb this_bindView, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        PageState.DefaultImpls.showLoading$default(this$0, null, 0, false, 3, null);
        this$0.checkExternalStoragePermissionIfNeed(this$0, new Function0() { // from class: v3m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShareCaloConsumActivity.bindView$lambda$10$lambda$9(this.f36446a, this_bindView);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindView$lambda$10$lambda$9(final ShareCaloConsumActivity this$0, vnb this_bindView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        ShareCaloConsumViewModel shareCaloConsumViewModel = (ShareCaloConsumViewModel) this$0.getMViewModel();
        ConstraintLayout shareArea = this_bindView.K;
        Intrinsics.checkNotNullExpressionValue(shareArea, "shareArea");
        shareCaloConsumViewModel.saveSharePic(this$0, shareArea, this$0, new Function0() { // from class: k3m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShareCaloConsumActivity.bindView$lambda$10$lambda$9$lambda$8(this.f23397a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$10$lambda$9$lambda$8(ShareCaloConsumActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialogForce();
        ToastUtil.showShortToast(c0j.Vc);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindView$lambda$12(final ShareCaloConsumActivity this$0, vnb this_bindView, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        ShareCaloConsumViewModel shareCaloConsumViewModel = (ShareCaloConsumViewModel) this$0.getMViewModel();
        ConstraintLayout shareArea = this_bindView.K;
        Intrinsics.checkNotNullExpressionValue(shareArea, "shareArea");
        ShareCaloConsumViewModel.shareToWX$default(shareCaloConsumViewModel, this$0, shareArea, this$0, false, new Function0() { // from class: x3m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShareCaloConsumActivity.bindView$lambda$12$lambda$11(this.f38654a);
            }
        }, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$12$lambda$11(ShareCaloConsumActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialogForce();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindView$lambda$14(ShareCaloConsumActivity this$0, vnb this_bindView, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        ShareCaloConsumViewModel shareCaloConsumViewModel = (ShareCaloConsumViewModel) this$0.getMViewModel();
        ConstraintLayout shareArea = this_bindView.K;
        Intrinsics.checkNotNullExpressionValue(shareArea, "shareArea");
        shareCaloConsumViewModel.shareToWX(this$0, shareArea, this$0, true, new Function0() { // from class: w3m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindView$lambda$16(final ShareCaloConsumActivity this$0, vnb this_bindView, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        ShareCaloConsumViewModel shareCaloConsumViewModel = (ShareCaloConsumViewModel) this$0.getMViewModel();
        ConstraintLayout shareArea = this_bindView.K;
        Intrinsics.checkNotNullExpressionValue(shareArea, "shareArea");
        shareCaloConsumViewModel.shareMore(this$0, shareArea, new Function0() { // from class: r3m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShareCaloConsumActivity.bindView$lambda$16$lambda$15(this.f32150a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$16$lambda$15(ShareCaloConsumActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialogForce();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$3(vnb this_bindView, String stepStr, String caloStr, String things, String picPath) {
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        Intrinsics.checkNotNullParameter(stepStr, "stepStr");
        Intrinsics.checkNotNullParameter(caloStr, "caloStr");
        Intrinsics.checkNotNullParameter(things, "things");
        Intrinsics.checkNotNullParameter(picPath, "picPath");
        this_bindView.O.setText(stepStr);
        this_bindView.F.setText(caloStr);
        this_bindView.P.setText(things);
        ImageView foodBg = this_bindView.G;
        Intrinsics.checkNotNullExpressionValue(foodBg, "foodBg");
        ImageLoader imageLoader = Coil.imageLoader(foodBg.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(foodBg.getContext()).data(picPath).target(foodBg);
        builderTarget.transformations(new RoundedCornersTransformation(ExtUtilsKt.getDp(28)));
        imageLoader.enqueue(builderTarget.build());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$4(vnb this_bindView, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        this_bindView.J.setImageBitmap(bitmap);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$5(ShareCaloConsumActivity this$0, View view) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        HealthDataUtil.INSTANCE.intentSportTarget(this$0, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$6(vnb this_bindView, Integer num) {
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        LinearLayout btnContainnerView = this_bindView.E;
        Intrinsics.checkNotNullExpressionValue(btnContainnerView, "btnContainnerView");
        boolean z = false;
        ViewExtKt.setVisible(btnContainnerView, num != null && num.intValue() == 0);
        View shareContannerView = this_bindView.L;
        Intrinsics.checkNotNullExpressionValue(shareContannerView, "shareContannerView");
        if (num != null && num.intValue() == 1) {
            z = true;
        }
        ViewExtKt.setVisible(shareContannerView, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindView$lambda$7(vnb this_bindView, ShareCaloConsumActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this_bindView.L.setVisibility(0);
        this_bindView.E.setVisibility(8);
        ((ShareCaloConsumViewModel) this$0.getMViewModel()).getShareStatusLiveData().setValue(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkExternalStoragePermissionIfNeed$lambda$20(final Function0 callback, final FragmentActivity fragmentActivity, MultiplePermissionsBuilder permissions) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(fragmentActivity, "$fragmentActivity");
        Intrinsics.checkNotNullParameter(permissions, "$this$permissions");
        permissions.allGranted(new Function0() { // from class: s3m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShareCaloConsumActivity.checkExternalStoragePermissionIfNeed$lambda$20$lambda$17(callback);
            }
        });
        permissions.denied(new Function1() { // from class: t3m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareCaloConsumActivity.checkExternalStoragePermissionIfNeed$lambda$20$lambda$19(fragmentActivity, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkExternalStoragePermissionIfNeed$lambda$20$lambda$17(Function0 callback) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkExternalStoragePermissionIfNeed$lambda$20$lambda$19(final FragmentActivity fragmentActivity, final List it) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "$fragmentActivity");
        Intrinsics.checkNotNullParameter(it, "it");
        IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE), (String) it.get(0), fragmentActivity, null, null, null, new Function0() { // from class: y3m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShareCaloConsumActivity.checkExternalStoragePermissionIfNeed$lambda$20$lambda$19$lambda$18(fragmentActivity, it);
            }
        }, 28, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkExternalStoragePermissionIfNeed$lambda$20$lambda$19$lambda$18(FragmentActivity fragmentActivity, List it) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "$fragmentActivity");
        Intrinsics.checkNotNullParameter(it, "$it");
        PermissionsUtil.showSettingDialog$default(PermissionsUtil.INSTANCE, fragmentActivity, (String) it.get(0), true, null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void handleBackAction() {
        Integer value = ((ShareCaloConsumViewModel) getMViewModel()).getShareStatusLiveData().getValue();
        if (value != null && value.intValue() == 1) {
            ((ShareCaloConsumViewModel) getMViewModel()).getShareStatusLiveData().setValue(0);
        } else {
            super.lambda$onCreate$0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull final vnb vnbVar) {
        Intrinsics.checkNotNullParameter(vnbVar, "<this>");
        setTitle(c0j.Qc);
        setTitleBackground(iji.f21228a);
        hideBack();
        IActionBar.DefaultImpls.setStartView$default(this, 0, pni.w2, getString(c0j.f4795b), new View.OnClickListener() { // from class: z3m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShareCaloConsumActivity.bindView$lambda$0(this.f40844a, view);
            }
        }, 1, null);
        getWindow().setStatusBarColor(getColor(iji.f21228a));
        UIUtils uIUtils = UIUtils.INSTANCE;
        uIUtils.setNavigationBarColor(this, iji.f21229b);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        uIUtils.setLightStatusBar(window, false);
        ((ShareCaloConsumViewModel) getMViewModel()).getXiaomiCoreInfo().observe(this, new ShareCaloConsumActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: b4m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareCaloConsumActivity.bindView$lambda$1(vnbVar, (AccountCoreInfo) obj);
            }
        }));
        ((ShareCaloConsumViewModel) getMViewModel()).loadAccountInfo();
        ((ShareCaloConsumViewModel) getMViewModel()).loadStandAndStepType(this, new Function4() { // from class: c4m
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return ShareCaloConsumActivity.bindView$lambda$3(vnbVar, (String) obj, (String) obj2, (String) obj3, (String) obj4);
            }
        });
        ((ShareCaloConsumViewModel) getMViewModel()).getCommonQrCodeBitmapLiveData().observe(this, new ShareCaloConsumActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: d4m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareCaloConsumActivity.bindView$lambda$4(vnbVar, (Bitmap) obj);
            }
        }));
        vnbVar.N.setOnClickListener(new View.OnClickListener() { // from class: l3m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                ShareCaloConsumActivity.bindView$lambda$5(this.f24607a, view);
            }
        });
        ((ShareCaloConsumViewModel) getMViewModel()).getShareStatusLiveData().observe(this, new ShareCaloConsumActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: m3m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareCaloConsumActivity.bindView$lambda$6(vnbVar, (Integer) obj);
            }
        }));
        vnbVar.M.setOnClickListener(new View.OnClickListener() { // from class: n3m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShareCaloConsumActivity.bindView$lambda$7(vnbVar, this, view);
            }
        });
        ViewExtKt.clickWithTrigger$default(vnbVar.L.findViewById(eri.k4), 0L, new Function1() { // from class: o3m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareCaloConsumActivity.bindView$lambda$10(this.f28703a, vnbVar, (View) obj);
            }
        }, 1, null);
        View viewFindViewById = vnbVar.L.findViewById(eri.Cp);
        ViewExtKt.clickWithTrigger$default(viewFindViewById, 0L, new Function1() { // from class: p3m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareCaloConsumActivity.bindView$lambda$12(this.f29966a, vnbVar, (View) obj);
            }
        }, 1, null);
        View viewFindViewById2 = vnbVar.L.findViewById(eri.Bp);
        ViewExtKt.clickWithTrigger$default(viewFindViewById2, 0L, new Function1() { // from class: q3m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareCaloConsumActivity.bindView$lambda$14(this.f31050a, vnbVar, (View) obj);
            }
        }, 1, null);
        ViewExtKt.clickWithTrigger$default(vnbVar.L.findViewById(eri.Tb), 0L, new Function1() { // from class: a4m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareCaloConsumActivity.bindView$lambda$16(this.f613a, vnbVar, (View) obj);
            }
        }, 1, null);
        int color = getResources().getColor(iji.I3, null);
        ((TextView) vnbVar.L.findViewById(eri.Hn)).setTextColor(color);
        ((TextView) vnbVar.L.findViewById(eri.Tn)).setTextColor(color);
        ((TextView) vnbVar.L.findViewById(eri.Un)).setTextColor(color);
        ((TextView) vnbVar.L.findViewById(eri.Kl)).setTextColor(color);
        boolean z = !AppUtil.INSTANCE.isPlayChannel();
        Logger.i("ShareCaloConsumeActivity", "showWechatShareChannel=" + z);
        Intrinsics.checkNotNull(viewFindViewById);
        ViewExtKt.setVisible(viewFindViewById, z);
        Intrinsics.checkNotNull(viewFindViewById2);
        ViewExtKt.setVisible(viewFindViewById2, z);
    }

    public final void checkExternalStoragePermissionIfNeed(@NotNull final FragmentActivity fragmentActivity, @NotNull final Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String[] strArr = {"android.permission.WRITE_EXTERNAL_STORAGE"};
        if (Build.VERSION.SDK_INT < 29) {
            PermissionExtKt.permissions$default(fragmentActivity, (String[]) Arrays.copyOf(strArr, 1), (String[]) null, new Function1() { // from class: u3m
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return ShareCaloConsumActivity.checkExternalStoragePermissionIfNeed$lambda$20(callback, fragmentActivity, (MultiplePermissionsBuilder) obj);
                }
            }, 2, (Object) null);
        } else {
            callback.invoke();
        }
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.D2;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        handleBackAction();
    }

    @Override // com.xiaomi.fitness.homepage.Hilt_ShareCaloConsumActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(x2j.f38616a);
        super.onCreate(savedInstanceState);
    }
}
