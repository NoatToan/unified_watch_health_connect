package com.xiaomi.fitness.watch.face;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.extension.BaseFragmentExtKt;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.medal.export.MedalManager;
import com.xiaomi.fitness.medal.export.MedalManagerExtKt;
import com.xiaomi.fitness.watch.face.FaceFragment;
import com.xiaomi.fitness.watch.face.adapter.FaceAdapter;
import com.xiaomi.fitness.watch.face.adapter.FaceMarketBasicTabItemViewHolder;
import com.xiaomi.fitness.watch.face.export.exportview.FaceIcon;
import com.xiaomi.fitness.watch.face.ext.FaceExtKt;
import com.xiaomi.fitness.watch.face.market.DeviceFaceMarketFragment;
import com.xiaomi.fitness.watch.face.market.search.FaceSearchFragment;
import defpackage.b6a;
import defpackage.iki;
import defpackage.noi;
import defpackage.p1j;
import defpackage.wc0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 .2\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b-\u0010\u0016J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\nJ\r\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001d\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010,\u001a\u0004\u0018\u00010)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/watch/face/FaceFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "", "cancelSilentUpgradeIfNeed", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "", "edit", "setStartView", "(Z)V", "setEndView", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setEditMode", "onCheckChanged", "()V", "onBackPressed", "()Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lb6a;", "binding", "Lb6a;", "getBinding", "()Lb6a;", "setBinding", "(Lb6a;)V", "", "meFragmentIndex", "I", "Lcom/xiaomi/fitness/watch/face/FaceMeFragment;", "getMeFragment", "()Lcom/xiaomi/fitness/watch/face/FaceMeFragment;", "meFragment", "<init>", "Companion", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FaceFragment extends BaseFragment {

    @NotNull
    public static final String FACE_ENTRANCE_NEW = "face_entrance_new";
    public b6a binding;
    private int meFragmentIndex;

    public FaceFragment() {
        super(0, 1, null);
    }

    private final void cancelSilentUpgradeIfNeed(WearableDeviceModel deviceModel) {
        HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(DeviceModelExtKt.getMac(deviceModel));
        Logger.i(BaseFragment.TAG, "cancelSilentUpgradeIfNeed: ");
        if (huaMiApiCaller != null) {
            huaMiApiCaller.cancelSilentUpgradeIfNeed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FaceMeFragment getMeFragment() {
        wc0 actionBar = getActionBar();
        Fragment fragmentAt = actionBar != null ? actionBar.getFragmentAt(this.meFragmentIndex) : null;
        if (fragmentAt instanceof FaceMeFragment) {
            return (FaceMeFragment) fragmentAt;
        }
        return null;
    }

    private final void setEndView(boolean edit) {
        if (edit) {
            IActionBar.DefaultImpls.setEndView$default(this, 0, noi.R, null, new View.OnClickListener() { // from class: xw8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FaceFragment.setEndView$lambda$3(this.f39527a, view);
                }
            }, 5, null);
        } else {
            IActionBar.DefaultImpls.setEndView$default(this, 0, noi.m, null, new View.OnClickListener() { // from class: yw8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FaceFragment.setEndView$lambda$4(this.f40636a, view);
                }
            }, 5, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setEndView$lambda$3(FaceFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FaceMeFragment meFragment = this$0.getMeFragment();
        if (meFragment == null || meFragment.getIsInEdit()) {
            view.setSelected(!view.isSelected());
            FaceMeFragment meFragment2 = this$0.getMeFragment();
            if (meFragment2 != null) {
                meFragment2.selectAll(view.isSelected());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setEndView$lambda$4(FaceFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("click_v3", "56.102.0.1.39633");
        Object[] objArr = new Object[4];
        objArr[0] = "name";
        objArr[1] = "watchface_search";
        objArr[2] = "device_model";
        objArr[3] = String.valueOf(wearableDeviceModel != null ? DeviceModelExtKt.getModel(wearableDeviceModel) : null);
        oneTrackExtKt.reportData(oneTrackStatBean, objArr);
        BaseFragmentExKt.gotoPage(this$0, FaceSearchFragment.class, null);
    }

    private final void setStartView(boolean edit) {
        View startView;
        View startView2;
        View startView3;
        View startView4;
        if (edit) {
            wc0 actionBar = getActionBar();
            if (actionBar != null && (startView4 = actionBar.getStartView()) != null) {
                startView4.setBackground(BaseFragmentExtKt.getDrawable(this, noi.K));
            }
            wc0 actionBar2 = getActionBar();
            if (actionBar2 != null && (startView3 = actionBar2.getStartView()) != null) {
                startView3.setOnClickListener(new View.OnClickListener() { // from class: vw8
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FaceFragment.setStartView$lambda$1(this.f37298a, view);
                    }
                });
            }
        } else {
            wc0 actionBar3 = getActionBar();
            if (actionBar3 != null && (startView2 = actionBar3.getStartView()) != null) {
                startView2.setBackground(BaseFragmentExtKt.getDrawable(this, noi.J));
            }
            wc0 actionBar4 = getActionBar();
            if (actionBar4 != null && (startView = actionBar4.getStartView()) != null) {
                startView.setOnClickListener(new View.OnClickListener() { // from class: ww8
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FaceFragment.setStartView$lambda$2(this.f38420a, view);
                    }
                });
            }
        }
        hideBack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setStartView$lambda$1(FaceFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setEditMode(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setStartView$lambda$2(FaceFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    @NotNull
    public final b6a getBinding() {
        b6a b6aVar = this.binding;
        if (b6aVar != null) {
            return b6aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        FaceMeFragment meFragment = getMeFragment();
        if (meFragment == null || !meFragment.getIsInEdit()) {
            return super.onBackPressed();
        }
        setEditMode(false);
        return true;
    }

    public final void onCheckChanged() {
        FaceAdapter mAdapter;
        SparseBooleanArray checkedState;
        View endView;
        FaceMeFragment meFragment = getMeFragment();
        if (meFragment == null || (mAdapter = meFragment.getMAdapter()) == null || (checkedState = mAdapter.getCheckedState()) == null) {
            return;
        }
        int size = checkedState.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (!checkedState.get(i, false)) {
                z = true;
            }
        }
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar == null || (endView = miuiActionBar.getEndView()) == null) {
            return;
        }
        endView.setSelected(!z);
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Bundle bundle = new Bundle(2);
            if (arguments.getBoolean(FACE_ENTRANCE_NEW)) {
                bundle.putInt(FaceTabListFragment.TAB_TYPE, 4);
                bundle.putString(FaceTabListFragment.TAB_ID, FaceMarketBasicTabItemViewHolder.POOL_NEW);
                bundle.putInt(FaceTabListFragment.TAB_SOURCE, 14);
                Context context = getContext();
                if (context != null) {
                    FaceExtKt.gotoPage(context, FaceTabListFragment.class, bundle);
                    return;
                }
                return;
            }
            int i = arguments.getInt(FaceTabListFragment.TAB_ID);
            if (i == 0) {
                return;
            }
            bundle.putInt(FaceTabListFragment.TAB_TYPE, 3);
            bundle.putString(FaceTabListFragment.TAB_ID, String.valueOf(i));
            bundle.putInt(FaceTabListFragment.TAB_SOURCE, 15);
            Context context2 = getContext();
            if (context2 != null) {
                FaceExtKt.gotoPage(context2, FaceTabListFragment.class, bundle);
            }
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @NotNull
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        setBinding(b6a.A0(inflater, container, false));
        View root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        ActionBar.c cVarNewTab;
        ActionBar.c cVarNewTab2;
        ActionBar.c cVarNewTab3;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FaceIcon.syncConfiguration();
        wc0 actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.setFragmentViewPagerMode(getMActivity(), false);
        }
        final WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            onBackPressed();
            Context context = getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, p1j.e);
            }
            finish();
            return;
        }
        MedalManager medalManagerExtKt = MedalManagerExtKt.getInstance(MedalManager.INSTANCE);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        medalManagerExtKt.requestMedalList(fragmentActivityRequireActivity, 2);
        setActionBarExpandState(1);
        setTitle("");
        setEndView(false);
        wc0 actionBar2 = getActionBar();
        if (actionBar2 != null) {
            actionBar2.setTabsMode(true);
        }
        setTitleBackground(iki.j);
        ActionBar.c cVarG = null;
        if (DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "market")) {
            this.meFragmentIndex = 1;
            wc0 actionBar3 = getActionBar();
            if (actionBar3 != null) {
                wc0 actionBar4 = getActionBar();
                actionBar3.addFragmentTab("FaceMarketFragment", (actionBar4 == null || (cVarNewTab2 = actionBar4.newTab()) == null) ? null : cVarNewTab2.g(getString(p1j.h0)), DeviceFaceMarketFragment.class, null, false);
            }
            wc0 actionBar5 = getActionBar();
            if (actionBar5 != null) {
                wc0 actionBar6 = getActionBar();
                if (actionBar6 != null && (cVarNewTab = actionBar6.newTab()) != null) {
                    cVarG = cVarNewTab.g(getString(p1j.e0));
                }
                actionBar5.addFragmentTab("FaceMeFragment", cVarG, FaceMeFragment.class, null, false);
            }
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("expose_v3", "56.82.1.1.35067"), "name", "market_watchface_tab", "device_model", DeviceModelExtKt.getModel(wearableDeviceModel));
            wc0 actionBar7 = getActionBar();
            if (actionBar7 != null) {
                actionBar7.addOnFragmentViewPagerChangeListener(new wc0.a() { // from class: com.xiaomi.fitness.watch.face.FaceFragment.onViewCreated.1
                    @Override // wc0.a
                    public void onPageScrollStateChanged(int p0) {
                    }

                    @Override // wc0.a
                    public void onPageScrolled(int p0, float p1, boolean p2, boolean p3) {
                        Logger.i(BaseFragment.TAG, "onPageScrolled: " + p0 + " " + p1 + " " + p2 + " " + p3);
                    }

                    @Override // wc0.a
                    public void onPageSelected(int p0) {
                        Fragment fragmentAt;
                        Logger.i(BaseFragment.TAG, "onPageSelected: " + p0);
                        FaceMeFragment meFragment = FaceFragment.this.getMeFragment();
                        if (meFragment != null && meFragment.getIsInEdit()) {
                            FaceFragment.this.setEditMode(false);
                        }
                        wc0 actionBar8 = FaceFragment.this.getActionBar();
                        if (actionBar8 == null || (fragmentAt = actionBar8.getFragmentAt(p0)) == null) {
                            return;
                        }
                        String str = fragmentAt instanceof DeviceFaceMarketFragment ? "market_watchface_tab" : "my_watchface_tab";
                        IOnetrack.Companion companion = IOnetrack.INSTANCE;
                        OneTrackExtKt.getInstance(companion).reportData(new OneTrackStatBean("expose_v3", "56.82.1.1.35067"), "name", str, "device_model", DeviceModelExtKt.getModel(wearableDeviceModel));
                        OneTrackExtKt.getInstance(companion).reportData(new OneTrackStatBean("click_v3", "56.82.1.1.35068"), "name", str, "device_model", DeviceModelExtKt.getModel(wearableDeviceModel));
                    }
                });
            }
        } else {
            this.meFragmentIndex = 0;
            wc0 actionBar8 = getActionBar();
            if (actionBar8 != null) {
                wc0 actionBar9 = getActionBar();
                if (actionBar9 != null && (cVarNewTab3 = actionBar9.newTab()) != null) {
                    cVarG = cVarNewTab3.g(getString(p1j.e0));
                }
                actionBar8.addFragmentTab("FaceMeFragment", cVarG, FaceMeFragment.class, null, false);
            }
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("expose_v3", "56.82.1.1.35067"), "name", "my_watchface_tab", "device_model", DeviceModelExtKt.getModel(wearableDeviceModel));
        }
        if (DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            cancelSilentUpgradeIfNeed(wearableDeviceModel);
        }
    }

    public final void setBinding(@NotNull b6a b6aVar) {
        Intrinsics.checkNotNullParameter(b6aVar, "<set-?>");
        this.binding = b6aVar;
    }

    public final void setEditMode(boolean edit) {
        Logger.d("FaceMe", "updateTitle: " + edit);
        setStartView(edit);
        setEndView(edit);
        FaceMeFragment meFragment = getMeFragment();
        if (meFragment != null) {
            meFragment.resetEdit(edit);
        }
    }
}
