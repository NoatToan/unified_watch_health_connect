package com.xiaomi.fitness.devicesettings.bluttooth.applayout;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.bluttooth.applayout.AppLayoutSettingFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.applayout.AppLayoutSettingViewModel;
import defpackage.eui;
import defpackage.s2a;
import defpackage.wzi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001$B\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/applayout/AppLayoutSettingFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/applayout/AppLayoutSettingViewModel;", "Ls2a;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/applayout/AppLayoutSettingViewModel$GetAppLayoutRet;", "appLayoutRet", "", "syncData", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/applayout/AppLayoutSettingViewModel$GetAppLayoutRet;)V", "Lcom/xiaomi/fitness/devicesettings/bluttooth/applayout/AppLayoutSettingViewModel$SetAppLayoutRet;", "onSetLayout", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/applayout/AppLayoutSettingViewModel$SetAppLayoutRet;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/widget/ImageView;", "checkGrid", "Landroid/widget/ImageView;", "getCheckGrid", "()Landroid/widget/ImageView;", "setCheckGrid", "(Landroid/widget/ImageView;)V", "checkList", "getCheckList", "setCheckList", "", "display", "I", "getLayoutId", "()I", "layoutId", "<init>", "()V", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class AppLayoutSettingFragment extends BaseBindingFragment<AppLayoutSettingViewModel, s2a> {
    public static final int DISPLAY_AS_GRID = 2;
    public static final int DISPLAY_AS_LIST = 1;
    public ImageView checkGrid;
    public ImageView checkList;
    private int display;

    private final void onSetLayout(AppLayoutSettingViewModel.SetAppLayoutRet appLayoutRet) {
        if (appLayoutRet.getSuccess()) {
            Logger.i(BaseFragment.TAG, "setAppLayout succeed");
            Context context = getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, wzi.common_set_success);
                return;
            }
            return;
        }
        Logger.i(BaseFragment.TAG, "setAppLayout fail: " + appLayoutRet.getCode());
        Context context2 = getContext();
        if (context2 != null) {
            ToastExtKt.toastShort(context2, wzi.common_set_error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$0(AppLayoutSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getCheckGrid().setSelected(true);
        this$0.getCheckList().setSelected(false);
        if (this$0.display != 2) {
            AppLayoutSettingViewModel.setAppLayout$default((AppLayoutSettingViewModel) this$0.getMViewModel(), 2, 0, 2, null);
            this$0.display = 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$1(AppLayoutSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getCheckGrid().setSelected(false);
        this$0.getCheckList().setSelected(true);
        if (this$0.display != 1) {
            AppLayoutSettingViewModel.setAppLayout$default((AppLayoutSettingViewModel) this$0.getMViewModel(), 1, 0, 2, null);
            this$0.display = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(AppLayoutSettingFragment this$0, AppLayoutSettingViewModel.GetAppLayoutRet getAppLayoutRet) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(getAppLayoutRet);
        this$0.syncData(getAppLayoutRet);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(AppLayoutSettingFragment this$0, AppLayoutSettingViewModel.SetAppLayoutRet setAppLayoutRet) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(setAppLayoutRet);
        this$0.onSetLayout(setAppLayoutRet);
        return Unit.INSTANCE;
    }

    private final void syncData(AppLayoutSettingViewModel.GetAppLayoutRet appLayoutRet) {
        if (appLayoutRet.getSuccess()) {
            this.display = appLayoutRet.getStatus();
            getCheckGrid().setSelected(this.display == 2);
            getCheckList().setSelected(this.display == 1);
        } else {
            Context context = getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, wzi.j8);
            }
        }
    }

    @NotNull
    public final ImageView getCheckGrid() {
        ImageView imageView = this.checkGrid;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("checkGrid");
        return null;
    }

    @NotNull
    public final ImageView getCheckList() {
        ImageView imageView = this.checkList;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("checkList");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.o2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(wzi.V);
        setCheckGrid(getMBinding().A);
        setCheckList(getMBinding().B);
        getCheckGrid().setOnClickListener(new View.OnClickListener() { // from class: og1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AppLayoutSettingFragment.onViewCreated$lambda$0(this.f29127a, view2);
            }
        });
        getCheckList().setOnClickListener(new View.OnClickListener() { // from class: pg1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AppLayoutSettingFragment.onViewCreated$lambda$1(this.f30360a, view2);
            }
        });
        ((AppLayoutSettingViewModel) getMViewModel()).getStatus().observe(getViewLifecycleOwner(), new AppLayoutSettingFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: qg1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AppLayoutSettingFragment.onViewCreated$lambda$2(this.f31493a, (AppLayoutSettingViewModel.GetAppLayoutRet) obj);
            }
        }));
        ((AppLayoutSettingViewModel) getMViewModel()).getSetAppLayoutRet().observe(getViewLifecycleOwner(), new AppLayoutSettingFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: rg1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AppLayoutSettingFragment.onViewCreated$lambda$3(this.f32511a, (AppLayoutSettingViewModel.SetAppLayoutRet) obj);
            }
        }));
        ((AppLayoutSettingViewModel) getMViewModel()).getAppLayout();
    }

    public final void setCheckGrid(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.checkGrid = imageView;
    }

    public final void setCheckList(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.checkList = imageView;
    }
}
