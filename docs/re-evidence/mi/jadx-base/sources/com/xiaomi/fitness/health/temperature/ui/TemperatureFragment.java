package com.xiaomi.fitness.health.temperature.ui;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.base.BaseDetailParentFragment;
import com.xiaomi.fitness.base.WrapperDayWeekMonthChildFragment;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.export.SettingsPageUtil;
import com.xiaomi.fitness.devicesettings.export.SettingsPageUtilExtKt;
import com.xiaomi.fitness.health.temperature.ui.TemperatureFragment;
import com.xiaomi.fitness.privacy.export.IPrivacySensitiveImpl;
import com.xiaomi.fitness.privacy.export.PrivacyHelper;
import com.xiaomi.fitness.privacy.export.PrivacyHelperPointKt;
import defpackage.a4i;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import defpackage.nwi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0014J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0006H\u0014J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u0011H\u0002J\b\u0010\u0016\u001a\u00020\u0011H\u0002J\b\u0010\u0017\u001a\u00020\u0011H\u0002R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000e\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/health/temperature/ui/TemperatureFragment;", "Lcom/xiaomi/fitness/base/BaseDetailParentFragment;", "Lcom/xiaomi/fitness/base/WrapperDayWeekMonthChildFragment;", "<init>", "()V", "defaultSportType", "", "getDefaultSportType", "()I", "getClassChild", "Ljava/lang/Class;", "position", "getClassChildName", "", "contentResourceId", "getContentResourceId", "onImgShareClick", "", "view", "Landroid/view/View;", "showPopupMenu", "goAddRecord", "goAllRecords", "goSetting", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TemperatureFragment extends BaseDetailParentFragment<WrapperDayWeekMonthChildFragment> {
    private final void goAddRecord() {
        PrivacyHelper privacyHelperPointKt = PrivacyHelperPointKt.getInstance(PrivacyHelper.INSTANCE);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        privacyHelperPointKt.showPrivacySensitiveDialogIfNeed(fragmentActivityRequireActivity, new IPrivacySensitiveImpl() { // from class: com.xiaomi.fitness.health.temperature.ui.TemperatureFragment.goAddRecord.1
            @Override // com.xiaomi.fitness.privacy.export.IPrivacySensitiveImpl, com.xiaomi.fitness.privacy.export.IPrivacySensitive
            public void onPrivacyAccepted() {
                BaseFragmentExKt.gotoPage(TemperatureFragment.this, TemperatureAddFragment.class, null);
            }
        });
    }

    private final void goAllRecords() {
        BaseFragmentExKt.gotoPage(this, TemperatureExpandableAllRecordsFragment.class, null);
    }

    private final void goSetting() {
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel != null && !wearableDeviceModel.getIsDeviceConnected()) {
            ToastUtil.showShortToast(c0j.f4801r);
            return;
        }
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(companion);
        Intrinsics.checkNotNull(wearableDeviceModel);
        if ((deviceManagerExtKt.getDeviceCapabilityV2(wearableDeviceModel.getDid()) & 65536) != 65536) {
            ToastUtil.showShortToast(c0j.f4801r);
            return;
        }
        SettingsPageUtil settingsPageUtil = SettingsPageUtilExtKt.getSettingsPageUtil();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        settingsPageUtil.gotoTempSettingPage(contextRequireContext);
    }

    private final void showPopupMenu(View view) {
        a4i a4iVar = new a4i(requireContext(), view);
        a4iVar.f(nwi.q);
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            a4iVar.d().findItem(eri.Ib).setVisible((DeviceManagerExtKt.getInstance(companion).getDeviceCapabilityV2(wearableDeviceModel.getDid()) & 65536) == 65536);
        }
        a4iVar.setOnMenuItemClickListener(new a4i.c() { // from class: j3p
            @Override // a4i.c
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return TemperatureFragment.showPopupMenu$lambda$1(this.f22388a, menuItem);
            }
        });
        a4iVar.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showPopupMenu$lambda$1(TemperatureFragment this$0, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        if (itemId == eri.Cb) {
            this$0.goAddRecord();
            return true;
        }
        if (itemId == eri.Db) {
            this$0.goAllRecords();
            return true;
        }
        if (itemId != eri.Ib) {
            return true;
        }
        this$0.goSetting();
        return true;
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    @NotNull
    public Class<?> getClassChild(int position) {
        if (position != 1) {
            return position != 2 ? TemperatureDayFragment.class : TemperatureMonthFragment.class;
        }
        return TemperatureWeekFragment.class;
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    @NotNull
    public String getClassChildName(int position) {
        if (position != 1) {
            return position != 2 ? "TemperatureDayFragment" : "TemperatureMonthFragment";
        }
        return "TemperatureWeekFragment";
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    public int getContentResourceId() {
        return jui.f23149r;
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    public int getDefaultSportType() {
        return 21;
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment, defpackage.eah
    public void onImgShareClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        showPopupMenu(view);
    }
}
