package com.xiaomi.fitness.devicesettings.bluttooth.applayout;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bluttooth.applayout.AppLayoutSettingViewModel;
import com.xiaomi.fitness.devicesettings.bluttooth.applayout.WatchAppLayoutSettingFragment;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.ubox.export.GuideNavigator;
import defpackage.eui;
import defpackage.hna;
import defpackage.jni;
import defpackage.wzi;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001)B\u0007¢\u0006\u0004\b'\u0010(J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001b\u0010\"\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/applayout/WatchAppLayoutSettingFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/applayout/AppLayoutSettingViewModel;", "Lhna;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/applayout/AppLayoutSettingViewModel$GetAppLayoutRet;", "appLayoutRet", "", "syncData", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/applayout/AppLayoutSettingViewModel$GetAppLayoutRet;)V", "Lcom/xiaomi/fitness/devicesettings/bluttooth/applayout/AppLayoutSettingViewModel$SetAppLayoutRet;", "onSetLayout", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/applayout/AppLayoutSettingViewModel$SetAppLayoutRet;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/xiaomi/fitness/devicesettings/bluttooth/applayout/WatchAppLayoutAdapter;", "mWatchAppLayoutAdapter", "Lcom/xiaomi/fitness/devicesettings/bluttooth/applayout/WatchAppLayoutAdapter;", "", "display", "I", "Lcom/xiaomi/fitness/ubox/export/GuideNavigator;", "guideNavigator", "Lcom/xiaomi/fitness/ubox/export/GuideNavigator;", "getGuideNavigator", "()Lcom/xiaomi/fitness/ubox/export/GuideNavigator;", "setGuideNavigator", "(Lcom/xiaomi/fitness/ubox/export/GuideNavigator;)V", "", "isUbox$delegate", "Lkotlin/Lazy;", "isUbox", "()Z", "getLayoutId", "()I", "layoutId", "<init>", "()V", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nWatchAppLayoutSettingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WatchAppLayoutSettingFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/applayout/WatchAppLayoutSettingFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,218:1\n1#2:219\n*E\n"})
public final class WatchAppLayoutSettingFragment extends Hilt_WatchAppLayoutSettingFragment<AppLayoutSettingViewModel, hna> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String GUIDE_STATE = "isUBox";

    @NotNull
    private static final String TAG = "WatchAppLayoutSettingFragment";
    private int display;
    public GuideNavigator guideNavigator;

    /* JADX INFO: renamed from: isUbox$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy isUbox = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: s4r
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(WatchAppLayoutSettingFragment.isUbox_delegate$lambda$0(this.f33297a));
        }
    });
    private WatchAppLayoutAdapter mWatchAppLayoutAdapter;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/applayout/WatchAppLayoutSettingFragment$Companion;", "", "<init>", "()V", "GUIDE_STATE", "", "getGUIDE_STATE", "()Ljava/lang/String;", "TAG", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getGUIDE_STATE() {
            return WatchAppLayoutSettingFragment.GUIDE_STATE;
        }
    }

    private final boolean isUbox() {
        return ((Boolean) this.isUbox.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isUbox_delegate$lambda$0(WatchAppLayoutSettingFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle arguments = this$0.getArguments();
        return arguments != null && arguments.getBoolean(GUIDE_STATE, false);
    }

    private final void onSetLayout(AppLayoutSettingViewModel.SetAppLayoutRet appLayoutRet) {
        if (appLayoutRet.getSuccess()) {
            Logger.i(TAG, "setAppLayout succeed");
            Context context = getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, wzi.common_set_success);
            }
            WatchAppLayoutAdapter watchAppLayoutAdapter = this.mWatchAppLayoutAdapter;
            if (watchAppLayoutAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWatchAppLayoutAdapter");
                watchAppLayoutAdapter = null;
            }
            watchAppLayoutAdapter.selectItem(appLayoutRet.getPosition());
            return;
        }
        Logger.i(TAG, "setAppLayout fail: " + appLayoutRet.getCode());
        Context context2 = getContext();
        if (context2 != null) {
            ToastExtKt.toastShort(context2, wzi.common_set_error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$1(WatchAppLayoutSettingFragment this$0, int i, AppLayoutSettingViewModel.GetWatchAppLayoutRet item) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "item");
        if (this$0.isUbox()) {
            WatchAppLayoutAdapter watchAppLayoutAdapter = this$0.mWatchAppLayoutAdapter;
            if (watchAppLayoutAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWatchAppLayoutAdapter");
                watchAppLayoutAdapter = null;
            }
            watchAppLayoutAdapter.selectItem(i);
        } else {
            WearableDeviceModel mDeviceModel = ((AppLayoutSettingViewModel) this$0.getMViewModel()).getMDeviceModel();
            if (mDeviceModel == null || !mDeviceModel.isDeviceConnected()) {
                FragmentActivity mActivity = this$0.getMActivity();
                if (mActivity != null) {
                    ToastExtKt.toastShort(mActivity, wzi.common_set_error);
                }
            } else {
                ((AppLayoutSettingViewModel) this$0.getMViewModel()).setAppLayout(item.getStatus(), i);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(WatchAppLayoutSettingFragment this$0, AppLayoutSettingViewModel.GetAppLayoutRet getAppLayoutRet) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(getAppLayoutRet);
        this$0.syncData(getAppLayoutRet);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(WatchAppLayoutSettingFragment this$0, AppLayoutSettingViewModel.SetAppLayoutRet setAppLayoutRet) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(setAppLayoutRet);
        this$0.onSetLayout(setAppLayoutRet);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$5(WatchAppLayoutSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        WatchAppLayoutAdapter watchAppLayoutAdapter = null;
        if (wearableDeviceModel == null || !wearableDeviceModel.isDeviceConnected()) {
            ToastUtil.INSTANCE.showToast(wzi.f38517r);
            Bundle bundle = new Bundle();
            bundle.putInt("key_tab", MainTab.INSTANCE.getINDEX_DEVICE());
            FragmentActivity mActivity = this$0.getMActivity();
            if (mActivity != null) {
                MainExtKt.showMainActivity(mActivity, null, bundle);
            }
            this$0.finish();
            return;
        }
        WatchAppLayoutAdapter watchAppLayoutAdapter2 = this$0.mWatchAppLayoutAdapter;
        if (watchAppLayoutAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWatchAppLayoutAdapter");
            watchAppLayoutAdapter2 = null;
        }
        int currPos = watchAppLayoutAdapter2.getCurrPos();
        Logger.i(TAG, "AppLayout Select Item " + currPos);
        if (currPos >= 0) {
            AppLayoutSettingViewModel appLayoutSettingViewModel = (AppLayoutSettingViewModel) this$0.getMViewModel();
            WatchAppLayoutAdapter watchAppLayoutAdapter3 = this$0.mWatchAppLayoutAdapter;
            if (watchAppLayoutAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWatchAppLayoutAdapter");
            } else {
                watchAppLayoutAdapter = watchAppLayoutAdapter3;
            }
            appLayoutSettingViewModel.setAppLayout(watchAppLayoutAdapter.getCurrentItem().getStatus(), currPos);
        }
        this$0.getGuideNavigator().navigate("notifyAppSetting");
    }

    private final void syncData(AppLayoutSettingViewModel.GetAppLayoutRet appLayoutRet) {
        if (!appLayoutRet.getSuccess()) {
            Context context = getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, wzi.j8);
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.display = appLayoutRet.getStatus();
        Integer shape = appLayoutRet.getShape();
        if (shape != null && shape.intValue() == 1) {
            int i = jni.e;
            String string = getString(wzi.j3);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            arrayList.add(new AppLayoutSettingViewModel.GetWatchAppLayoutRet(2, i, string, this.display == 2));
            if (Intrinsics.areEqual(appLayoutRet.getSupportGridText(), Boolean.TRUE)) {
                int i2 = jni.f;
                String string2 = getString(wzi.k3);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                arrayList.add(new AppLayoutSettingViewModel.GetWatchAppLayoutRet(4, i2, string2, this.display == 4));
            }
            int i3 = jni.d;
            String string3 = getString(wzi.l3);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            arrayList.add(new AppLayoutSettingViewModel.GetWatchAppLayoutRet(1, i3, string3, this.display == 1));
        } else if (shape != null && shape.intValue() == 2) {
            int i4 = jni.w1;
            String string4 = getString(wzi.j3);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            arrayList.add(new AppLayoutSettingViewModel.GetWatchAppLayoutRet(2, i4, string4, this.display == 2));
            if (Intrinsics.areEqual(appLayoutRet.getSupportGridText(), Boolean.TRUE)) {
                int i5 = jni.x1;
                String string5 = getString(wzi.k3);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                arrayList.add(new AppLayoutSettingViewModel.GetWatchAppLayoutRet(4, i5, string5, this.display == 4));
            }
            int i6 = jni.v1;
            String string6 = getString(wzi.l3);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
            arrayList.add(new AppLayoutSettingViewModel.GetWatchAppLayoutRet(1, i6, string6, this.display == 1));
        } else {
            int i7 = jni.m1;
            String string7 = getString(wzi.j3);
            Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
            arrayList.add(new AppLayoutSettingViewModel.GetWatchAppLayoutRet(2, i7, string7, this.display == 2));
            if (Intrinsics.areEqual(appLayoutRet.getSupportGridText(), Boolean.TRUE)) {
                int i8 = jni.n1;
                String string8 = getString(wzi.k3);
                Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                arrayList.add(new AppLayoutSettingViewModel.GetWatchAppLayoutRet(4, i8, string8, this.display == 4));
            }
            int i9 = jni.l1;
            String string9 = getString(wzi.l3);
            Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
            arrayList.add(new AppLayoutSettingViewModel.GetWatchAppLayoutRet(1, i9, string9, this.display == 1));
        }
        WatchAppLayoutAdapter watchAppLayoutAdapter = this.mWatchAppLayoutAdapter;
        if (watchAppLayoutAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWatchAppLayoutAdapter");
            watchAppLayoutAdapter = null;
        }
        watchAppLayoutAdapter.submitList(arrayList);
    }

    @NotNull
    public final GuideNavigator getGuideNavigator() {
        GuideNavigator guideNavigator = this.guideNavigator;
        if (guideNavigator != null) {
            return guideNavigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("guideNavigator");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.D2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(wzi.V);
        this.mWatchAppLayoutAdapter = new WatchAppLayoutAdapter(new Function2() { // from class: t4r
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return WatchAppLayoutSettingFragment.onViewCreated$lambda$1(this.f34314a, ((Integer) obj).intValue(), (AppLayoutSettingViewModel.GetWatchAppLayoutRet) obj2);
            }
        });
        ((hna) getMBinding()).A.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView recyclerView = ((hna) getMBinding()).A;
        WatchAppLayoutAdapter watchAppLayoutAdapter = this.mWatchAppLayoutAdapter;
        if (watchAppLayoutAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWatchAppLayoutAdapter");
            watchAppLayoutAdapter = null;
        }
        recyclerView.setAdapter(watchAppLayoutAdapter);
        ((hna) getMBinding()).A0(Boolean.valueOf(isUbox()));
        if (isUbox()) {
            hideBack();
        }
        ((AppLayoutSettingViewModel) getMViewModel()).getStatus().observe(getViewLifecycleOwner(), new WatchAppLayoutSettingFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: u4r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WatchAppLayoutSettingFragment.onViewCreated$lambda$2(this.f35382a, (AppLayoutSettingViewModel.GetAppLayoutRet) obj);
            }
        }));
        ((AppLayoutSettingViewModel) getMViewModel()).getSetAppLayoutRet().observe(getViewLifecycleOwner(), new WatchAppLayoutSettingFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: v4r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WatchAppLayoutSettingFragment.onViewCreated$lambda$3(this.f36478a, (AppLayoutSettingViewModel.SetAppLayoutRet) obj);
            }
        }));
        ((AppLayoutSettingViewModel) getMViewModel()).getWatchAppLayout();
        ((hna) getMBinding()).B.setOnClickListener(new View.OnClickListener() { // from class: w4r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WatchAppLayoutSettingFragment.onViewCreated$lambda$5(this.f37620a, view2);
            }
        });
    }

    public final void setGuideNavigator(@NotNull GuideNavigator guideNavigator) {
        Intrinsics.checkNotNullParameter(guideNavigator, "<set-?>");
        this.guideNavigator = guideNavigator;
    }
}
