package com.xiaomi.fitness.health.ecg;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.c;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.paging.CombinedLoadStates;
import androidx.paging.PagingData;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncer;
import com.xiaomi.fit.fitness.export.data.item.EcgMedicalItemReport;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.devicesettings.export.SettingsPageUtil;
import com.xiaomi.fitness.devicesettings.export.SettingsPageUtilExtKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.ecg.EcgFragment;
import com.xiaomi.fitness.health.ecg.data.EcgConstantsKt;
import com.xiaomi.fitness.health.ecg.net.GetVipInfoResult;
import com.xiaomi.fitness.health.ecg.recycler.EcgSnippetListAdapter;
import com.xiaomi.fitness.health.ecg.util.EcgTrackHelper;
import com.xiaomi.fitness.health.ecg.web.EcgWebViewActivityKt;
import com.xiaomi.fitness.view.TitleBarAlphaView;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.a4i;
import defpackage.c0j;
import defpackage.eah;
import defpackage.iji;
import defpackage.jui;
import defpackage.o7h;
import defpackage.qxi;
import defpackage.rbd;
import defpackage.sub;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 -2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001-B\u0007¢\u0006\u0004\b,\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u0006R$\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010#\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/xiaomi/fitness/health/ecg/EcgFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/ecg/EcgViewModel;", "Lsub;", "", "addSystemBarHeightPadding", "()V", "requestVipInfo", "Lcom/xiaomi/fitness/health/ecg/net/GetVipInfoResult;", "it", "refreshBanner", "(Lcom/xiaomi/fitness/health/ecg/net/GetVipInfoResult;)V", "setUpTitleBar", "Landroid/view/View;", "view", "showPopupFilterMenu", "(Landroid/view/View;)V", "showPopupHamburgerMenu", "", "dataId", "changeDataSource", "(I)V", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "Lcom/xiaomi/fitness/view/TitleBarAlphaView;", "titleBarAlphaView", "Lcom/xiaomi/fitness/view/TitleBarAlphaView;", "getTitleBarAlphaView", "()Lcom/xiaomi/fitness/view/TitleBarAlphaView;", "setTitleBarAlphaView", "(Lcom/xiaomi/fitness/view/TitleBarAlphaView;)V", "Lcom/xiaomi/fitness/health/ecg/recycler/EcgSnippetListAdapter;", "adapter", "Lcom/xiaomi/fitness/health/ecg/recycler/EcgSnippetListAdapter;", "getAdapter", "()Lcom/xiaomi/fitness/health/ecg/recycler/EcgSnippetListAdapter;", "setAdapter", "(Lcom/xiaomi/fitness/health/ecg/recycler/EcgSnippetListAdapter;)V", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nEcgFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcgFragment.kt\ncom/xiaomi/fitness/health/ecg/EcgFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,368:1\n157#2,8:369\n*S KotlinDebug\n*F\n+ 1 EcgFragment.kt\ncom/xiaomi/fitness/health/ecg/EcgFragment\n*L\n139#1:369,8\n*E\n"})
public final class EcgFragment extends Hilt_EcgFragment<EcgViewModel, sub> {

    @NotNull
    public static final String TAG = "EcgFragment";
    public EcgSnippetListAdapter adapter;

    @Nullable
    private TitleBarAlphaView titleBarAlphaView;

    /* JADX WARN: Multi-variable type inference failed */
    private final void addSystemBarHeightPadding() {
        c.H0(((sub) getMBinding()).getRoot(), new o7h() { // from class: ua7
            @Override // defpackage.o7h
            public final WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
                return EcgFragment.addSystemBarHeightPadding$lambda$3$lambda$2(this.f35562a, view, windowInsetsCompat);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final WindowInsetsCompat addSystemBarHeightPadding$lambda$3$lambda$2(EcgFragment this$0, View v, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        rbd rbdVarF = insets.f(WindowInsetsCompat.m.h() | WindowInsetsCompat.m.b());
        Intrinsics.checkNotNullExpressionValue(rbdVarF, "getInsets(...)");
        Logger.d(TAG, "addStatusBarHeightPadding statusBars top=" + rbdVarF.f32379b + " bottom=" + rbdVarF.d);
        int i = rbdVarF.f32379b;
        View root = ((sub) this$0.getMBinding()).getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        root.setPadding(root.getPaddingLeft(), i, root.getPaddingRight(), root.getPaddingBottom());
        return WindowInsetsCompat.f2098b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void changeDataSource(int dataId) {
        final Ref.IntRef intRef = new Ref.IntRef();
        if (dataId == 600) {
            ((EcgViewModel) getMViewModel()).queryAllRecords(10, 10).observe(getViewLifecycleOwner(), new EcgFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: wa7
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return EcgFragment.changeDataSource$lambda$8(intRef, this, (PagingData) obj);
                }
            }));
        } else if (dataId == 700) {
            ((EcgViewModel) getMViewModel()).queryInterpretedRecords(10, 10).observe(getViewLifecycleOwner(), new EcgFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: xa7
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return EcgFragment.changeDataSource$lambda$9(intRef, this, (PagingData) obj);
                }
            }));
        } else {
            if (dataId != 800) {
                return;
            }
            ((EcgViewModel) getMViewModel()).queryNotInterpretedRecords(10, 10).observe(getViewLifecycleOwner(), new EcgFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ya7
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return EcgFragment.changeDataSource$lambda$10(intRef, this, (PagingData) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit changeDataSource$lambda$10(Ref.IntRef count, EcgFragment this$0, PagingData pagingData) {
        Intrinsics.checkNotNullParameter(count, "$count");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = count.element + 1;
        count.element = i;
        Logger.d(TAG, "getUninterpretedEcgRecordsLiveData count=" + i);
        EcgSnippetListAdapter adapter = this$0.getAdapter();
        Lifecycle lifecycle = this$0.getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        Intrinsics.checkNotNull(pagingData);
        adapter.submitData(lifecycle, pagingData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit changeDataSource$lambda$8(Ref.IntRef count, EcgFragment this$0, PagingData pagingData) {
        Intrinsics.checkNotNullParameter(count, "$count");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = count.element + 1;
        count.element = i;
        Logger.d(TAG, "getAllEcgRecordsLiveData count=" + i);
        EcgSnippetListAdapter adapter = this$0.getAdapter();
        Lifecycle lifecycle = this$0.getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        Intrinsics.checkNotNull(pagingData);
        adapter.submitData(lifecycle, pagingData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit changeDataSource$lambda$9(Ref.IntRef count, EcgFragment this$0, PagingData pagingData) {
        Intrinsics.checkNotNullParameter(count, "$count");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = count.element + 1;
        count.element = i;
        Logger.d(TAG, "getInterpretedEcgRecordsLiveData count=" + i);
        EcgSnippetListAdapter adapter = this$0.getAdapter();
        Lifecycle lifecycle = this$0.getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        Intrinsics.checkNotNull(pagingData);
        adapter.submitData(lifecycle, pagingData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(EcgFragment this$0, AppCompatTextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.showPopupFilterMenu(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$1(EcgFragment this$0, CombinedLoadStates it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z = this$0.getAdapter().getItemCount() == 0;
        RecyclerView ecgList = ((sub) this$0.getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(ecgList, "ecgList");
        ViewExtKt.setVisible(ecgList, !z);
        AppCompatTextView tvNoData = ((sub) this$0.getMBinding()).G;
        Intrinsics.checkNotNullExpressionValue(tvNoData, "tvNoData");
        ViewExtKt.setVisible(tvNoData, z);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshBanner(GetVipInfoResult it) {
        if (it == null) {
            View root = ((sub) getMBinding()).B.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            ViewExtKt.setVisible(root, false);
            return;
        }
        View root2 = ((sub) getMBinding()).B.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        ViewExtKt.setVisible(root2, true);
        TextView tvEcgTips = ((sub) getMBinding()).B.F;
        Intrinsics.checkNotNullExpressionValue(tvEcgTips, "tvEcgTips");
        ViewExtKt.setVisible(tvEcgTips, false);
        int vipType = it.getVipType();
        if (vipType == 0) {
            ((sub) getMBinding()).B.C.setText(getString(c0j.P7));
            ((sub) getMBinding()).B.B.setText(getString(c0j.K7));
        } else if (vipType == 1) {
            int balanceNum = it.getBalanceNum();
            if (balanceNum == 0) {
                ((sub) getMBinding()).B.C.setText(getString(c0j.M7));
                ((sub) getMBinding()).B.B.setText(getString(c0j.R7));
            } else {
                ((sub) getMBinding()).B.C.setText(getResources().getQuantityString(qxi.U, balanceNum, Integer.valueOf(balanceNum)));
                ((sub) getMBinding()).B.B.setText(getString(c0j.U7));
                TextView tvEcgTips2 = ((sub) getMBinding()).B.F;
                Intrinsics.checkNotNullExpressionValue(tvEcgTips2, "tvEcgTips");
                ViewExtKt.setVisible(tvEcgTips2, true);
            }
        } else if (vipType == 2) {
            ((sub) getMBinding()).B.C.setText(getString(c0j.T7));
            ((sub) getMBinding()).B.B.setText(getString(c0j.S7));
            TextView tvEcgTips3 = ((sub) getMBinding()).B.F;
            Intrinsics.checkNotNullExpressionValue(tvEcgTips3, "tvEcgTips");
            ViewExtKt.setVisible(tvEcgTips3, true);
        }
        ((sub) getMBinding()).B.getRoot().setOnClickListener(new View.OnClickListener() { // from class: db7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcgFragment.refreshBanner$lambda$5(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshBanner$lambda$5(View view) {
        EcgWebViewActivityKt.startEcgWebActivity$default(EcgConstantsKt.getHlwUrl("service_purchase"), null, null, null, 14, null);
        EcgTrackHelper.INSTANCE.trackEntranceBannerClick();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void requestVipInfo() {
        ((EcgViewModel) getMViewModel()).queryVipInfo().observe(getViewLifecycleOwner(), new EcgFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: za7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcgFragment.requestVipInfo$lambda$4(this.f41067a, (GetVipInfoResult) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestVipInfo$lambda$4(EcgFragment this$0, GetVipInfoResult getVipInfoResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.refreshBanner(getVipInfoResult);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setUpTitleBar() {
        TextView txtDesc;
        TextView txtTitle;
        TitleBarAlphaView titleBarAlphaView = ((sub) getMBinding()).E;
        this.titleBarAlphaView = titleBarAlphaView;
        if (titleBarAlphaView != null && (txtTitle = titleBarAlphaView.getTxtTitle()) != null) {
            txtTitle.setText(c0j.na);
        }
        TitleBarAlphaView titleBarAlphaView2 = this.titleBarAlphaView;
        if (titleBarAlphaView2 != null && (txtDesc = titleBarAlphaView2.getTxtDesc()) != null) {
            ViewExtKt.gone(txtDesc);
        }
        TitleBarAlphaView titleBarAlphaView3 = this.titleBarAlphaView;
        if (titleBarAlphaView3 != null) {
            titleBarAlphaView3.setOnTitleBarClickListener(new eah() { // from class: com.xiaomi.fitness.health.ecg.EcgFragment.setUpTitleBar.1
                @Override // defpackage.eah
                public void onImgBackClick(View view) {
                    EcgFragment.this.finish();
                }

                @Override // defpackage.eah
                public void onImgShareClick(View view) {
                    EcgFragment.this.showPopupHamburgerMenu(view);
                }

                @Override // defpackage.eah
                public void onShowCalendar() {
                }
            });
        }
    }

    private final void showPopupFilterMenu(View view) {
        a4i a4iVar = new a4i(requireContext(), view);
        a4iVar.d().add(0, 600, 0, c0j.ka);
        a4iVar.d().add(0, 700, 1, c0j.Ja);
        a4iVar.d().add(0, 800, 2, c0j.Ma);
        a4iVar.setOnMenuItemClickListener(new a4i.c() { // from class: va7
            @Override // a4i.c
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return EcgFragment.showPopupFilterMenu$lambda$6(this.f36656a, menuItem);
            }
        });
        a4iVar.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean showPopupFilterMenu$lambda$6(EcgFragment this$0, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        if (itemId == 600) {
            ((EcgViewModel) this$0.getMViewModel()).setDataSourceChoice(600);
            ((sub) this$0.getMBinding()).D.setText(this$0.getString(c0j.ka));
        } else if (itemId == 700) {
            ((EcgViewModel) this$0.getMViewModel()).setDataSourceChoice(700);
            ((sub) this$0.getMBinding()).D.setText(this$0.getString(c0j.Ja));
        } else if (itemId != 800) {
            ((EcgViewModel) this$0.getMViewModel()).setDataSourceChoice(600);
            ((sub) this$0.getMBinding()).D.setText(this$0.getString(c0j.ka));
        } else {
            ((EcgViewModel) this$0.getMViewModel()).setDataSourceChoice(800);
            ((sub) this$0.getMBinding()).D.setText(this$0.getString(c0j.Ma));
        }
        this$0.changeDataSource(((EcgViewModel) this$0.getMViewModel()).getDataSourceChoice());
        this$0.getAdapter().notifyDataSetChanged();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void showPopupHamburgerMenu(View view) {
        if (view == null) {
            return;
        }
        a4i a4iVar = new a4i(requireContext(), view);
        a4iVar.d().add(0, 100, 0, c0j.h5);
        for (T t : DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModels()) {
            if (DeviceModelExtKt.isSupportFeature(t, Feature.ECG_MEASURE_REMIND)) {
                ((EcgViewModel) getMViewModel()).setMSupportDevice(t);
                a4iVar.d().add(0, 300, 1, c0j.U1);
                break;
            }
        }
        a4iVar.d().add(0, 400, 2, c0j.va);
        a4iVar.d().add(0, 500, 3, c0j.ja);
        a4iVar.setOnMenuItemClickListener(new a4i.c() { // from class: ab7
            @Override // a4i.c
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return EcgFragment.showPopupHamburgerMenu$lambda$7(this.f849a, menuItem);
            }
        });
        a4iVar.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean showPopupHamburgerMenu$lambda$7(EcgFragment this$0, MenuItem menuItem) {
        String name;
        WearableDeviceInfo deviceInfo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        if (itemId == 100) {
            BaseFragmentExKt.gotoPage(this$0, N60EcgRecordsFragment.class, null);
        } else if (itemId == 300) {
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (wearableDeviceModel != null && DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.ECG_MEASURE_REMIND) && wearableDeviceModel.getIsDeviceConnected()) {
                SettingsPageUtil settingsPageUtil = SettingsPageUtilExtKt.getSettingsPageUtil();
                FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                settingsPageUtil.gotoECGMeasureRemindPage(fragmentActivityRequireActivity);
            } else {
                WearableDeviceModel mSupportDevice = ((EcgViewModel) this$0.getMViewModel()).getMSupportDevice();
                if ((mSupportDevice != null ? mSupportDevice.getDeviceInfo() : null) != null) {
                    int i = c0j.L7;
                    Object[] objArr = new Object[1];
                    WearableDeviceModel mSupportDevice2 = ((EcgViewModel) this$0.getMViewModel()).getMSupportDevice();
                    if (mSupportDevice2 == null || (deviceInfo = mSupportDevice2.getDeviceInfo()) == null || (name = deviceInfo.getName()) == null) {
                        name = "";
                    }
                    objArr[0] = name;
                    String string = this$0.getString(i, objArr);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    ToastUtil.showShortToast(string);
                } else {
                    String string2 = this$0.getString(c0j.f4801r);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    ToastUtil.showShortToast(string2);
                }
            }
        } else if (itemId == 400) {
            WebViewUtilKt.startWebView$default("https://watch.iot.mi.com/html/understand_ecg/index.html", this$0.getString(c0j.va), false, false, null, false, null, false, 252, null);
        } else if (itemId == 500) {
            BaseFragmentExKt.gotoPage(this$0, AboutEcgFragment.class, null);
        }
        return true;
    }

    @NotNull
    public final EcgSnippetListAdapter getAdapter() {
        EcgSnippetListAdapter ecgSnippetListAdapter = this.adapter;
        if (ecgSnippetListAdapter != null) {
            return ecgSnippetListAdapter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.A3;
    }

    @Nullable
    public final TitleBarAlphaView getTitleBarAlphaView() {
        return this.titleBarAlphaView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        requestVipInfo();
        changeDataSource(((EcgViewModel) getMViewModel()).getDataSourceChoice());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        setUpTitleBar();
        UIUtils uIUtils = UIUtils.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        uIUtils.setNavigationBarColor(fragmentActivityRequireActivity, iji.T2);
        ViewExtKt.clickWithTrigger$default(((sub) getMBinding()).D, 0L, new Function1() { // from class: bb7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcgFragment.onViewCreated$lambda$0(this.f4009a, (AppCompatTextView) obj);
            }
        }, 1, null);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        setAdapter(new EcgSnippetListAdapter(false, null, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), new h.f<EcgMedicalItemReport>() { // from class: com.xiaomi.fitness.health.ecg.EcgFragment.onViewCreated.2
            @Override // androidx.recyclerview.widget.h.f
            public boolean areContentsTheSame(EcgMedicalItemReport oldItem, EcgMedicalItemReport newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getTimestamp() == newItem.getTimestamp() && oldItem.getInterpretStatus() == newItem.getInterpretStatus() && Intrinsics.areEqual(oldItem.getOccurFrequency(), newItem.getOccurFrequency()) && oldItem.getMeasureTime() == newItem.getMeasureTime() && oldItem.getMeasureDuration() == newItem.getMeasureDuration() && oldItem.getSampleFrequency() == newItem.getSampleFrequency() && Intrinsics.areEqual(oldItem.getAvgHr(), newItem.getAvgHr()) && Objects.equals(oldItem.getSid(), newItem.getSid()) && Objects.equals(oldItem.getSymptomList(), newItem.getSymptomList()) && Objects.equals(oldItem.getSceneList(), newItem.getSceneList());
            }

            @Override // androidx.recyclerview.widget.h.f
            public boolean areItemsTheSame(EcgMedicalItemReport oldItem, EcgMedicalItemReport newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getTimestamp() == newItem.getTimestamp() && oldItem.getInterpretStatus() == newItem.getInterpretStatus() && Intrinsics.areEqual(oldItem.getOccurFrequency(), newItem.getOccurFrequency()) && oldItem.getMeasureTime() == newItem.getMeasureTime() && oldItem.getMeasureDuration() == newItem.getMeasureDuration() && oldItem.getSampleFrequency() == newItem.getSampleFrequency() && Intrinsics.areEqual(oldItem.getAvgHr(), newItem.getAvgHr()) && Objects.equals(oldItem.getSid(), newItem.getSid()) && Objects.equals(oldItem.getSymptomList(), newItem.getSymptomList()) && Objects.equals(oldItem.getSceneList(), newItem.getSceneList());
            }
        }));
        getAdapter().setOnItemClickListener(new EcgSnippetListAdapter.OnItemClickListener() { // from class: com.xiaomi.fitness.health.ecg.EcgFragment.onViewCreated.3
            @Override // com.xiaomi.fitness.health.ecg.recycler.EcgSnippetListAdapter.OnItemClickListener
            public void onClick(EcgMedicalItemReport ecgSnippet) {
                Intrinsics.checkNotNullParameter(ecgSnippet, "ecgSnippet");
                Intent intent = new Intent(EcgFragment.this.requireActivity(), (Class<?>) EcgItemDetailActivity.class);
                intent.putExtra(EcgConstantsKt.PARAM_REPORT, ecgSnippet);
                EcgFragment.this.startActivity(intent);
            }
        });
        getAdapter().addLoadStateListener(new Function1() { // from class: cb7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcgFragment.onViewCreated$lambda$1(this.f5154a, (CombinedLoadStates) obj);
            }
        });
        ((sub) getMBinding()).C.setAdapter(getAdapter());
        changeDataSource(600);
        FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE).syncMedicalDataWithServer("ecg_list_page");
        addSystemBarHeightPadding();
    }

    public final void setAdapter(@NotNull EcgSnippetListAdapter ecgSnippetListAdapter) {
        Intrinsics.checkNotNullParameter(ecgSnippetListAdapter, "<set-?>");
        this.adapter = ecgSnippetListAdapter;
    }

    public final void setTitleBarAlphaView(@Nullable TitleBarAlphaView titleBarAlphaView) {
        this.titleBarAlphaView = titleBarAlphaView;
    }
}
