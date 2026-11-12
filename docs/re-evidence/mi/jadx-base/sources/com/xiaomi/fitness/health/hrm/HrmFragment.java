package com.xiaomi.fitness.health.hrm;

import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.base.BaseDetailParentFragment;
import com.xiaomi.fitness.base.WrapperDayWeekMonthChildFragment;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.export.SettingsPageUtil;
import com.xiaomi.fitness.devicesettings.export.SettingsPageUtilExtKt;
import com.xiaomi.fitness.health.hrm.HrmFragment;
import com.xiaomi.fitness.privacy.export.IPrivacySensitiveImpl;
import com.xiaomi.fitness.privacy.export.PrivacyHelper;
import com.xiaomi.fitness.privacy.export.PrivacyHelperPointKt;
import com.xiaomi.fitness.util.DeviceModelExtKt;
import defpackage.a4i;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import defpackage.nwi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0014J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\u0006H\u0014J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0013H\u0002J\b\u0010\u0018\u001a\u00020\u0013H\u0002J\b\u0010\u0019\u001a\u00020\u0013H\u0002R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000e\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/health/hrm/HrmFragment;", "Lcom/xiaomi/fitness/base/BaseDetailParentFragment;", "Lcom/xiaomi/fitness/base/WrapperDayWeekMonthChildFragment;", "<init>", "()V", "defaultSportType", "", "getDefaultSportType", "()I", "getClassChild", "Ljava/lang/Class;", "position", "getClassChildName", "", "contentResourceId", "getContentResourceId", "showSettingIcon", "", "onImgShareClick", "", "view", "Landroid/view/View;", "showPopupMenu", "goSettingFragment", "goAddRecord", "goAllRecords", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHrmFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HrmFragment.kt\ncom/xiaomi/fitness/health/hrm/HrmFragment\n+ 2 Menu.kt\nandroidx/core/view/MenuKt\n*L\n1#1,114:1\n46#2:115\n*S KotlinDebug\n*F\n+ 1 HrmFragment.kt\ncom/xiaomi/fitness/health/hrm/HrmFragment\n*L\n74#1:115\n*E\n"})
public final class HrmFragment extends BaseDetailParentFragment<WrapperDayWeekMonthChildFragment> {
    private final void goAddRecord() {
        PrivacyHelper privacyHelperPointKt = PrivacyHelperPointKt.getInstance(PrivacyHelper.INSTANCE);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        privacyHelperPointKt.showPrivacySensitiveDialogIfNeed(fragmentActivityRequireActivity, new IPrivacySensitiveImpl() { // from class: com.xiaomi.fitness.health.hrm.HrmFragment.goAddRecord.1
            @Override // com.xiaomi.fitness.privacy.export.IPrivacySensitiveImpl, com.xiaomi.fitness.privacy.export.IPrivacySensitive
            public void onPrivacyAccepted() {
                BaseFragmentExKt.gotoPage(HrmFragment.this, HrmAddFragment.class, null);
            }
        });
    }

    private final void goAllRecords() {
        BaseFragmentExKt.gotoPage(this, HrmFilteredRecordsFragment.class, null);
    }

    private final void goSettingFragment() {
        SettingsPageUtil settingsPageUtil = SettingsPageUtilExtKt.getSettingsPageUtil();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        settingsPageUtil.gotoHeartRatePage(contextRequireContext);
    }

    private final void showPopupMenu(View view) {
        a4i a4iVar = new a4i(requireContext(), view);
        a4iVar.f(nwi.f);
        if (showSettingIcon()) {
            Menu menuD = a4iVar.d();
            Menu menuD2 = a4iVar.d();
            Intrinsics.checkNotNullExpressionValue(menuD2, "getMenu(...)");
            menuD.add(0, 1, menuD2.size(), c0j.S6);
        }
        a4iVar.setOnMenuItemClickListener(new a4i.c() { // from class: fec
            @Override // a4i.c
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return HrmFragment.showPopupMenu$lambda$0(this.f17703a, menuItem);
            }
        });
        a4iVar.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showPopupMenu$lambda$0(HrmFragment this$0, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        if (itemId == eri.Cb) {
            this$0.goAddRecord();
        } else if (itemId == eri.Db) {
            this$0.goAllRecords();
        } else if (itemId == 1) {
            this$0.goSettingFragment();
        }
        return true;
    }

    private final boolean showSettingIcon() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            return DeviceModelExtKt.isSupportHeartRate(wearableDeviceModel);
        }
        return false;
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    @NotNull
    public Class<?> getClassChild(int position) {
        if (position != 1) {
            return position != 2 ? HrmDayFragment.class : HrmMonthFragment.class;
        }
        return HrmWeekFragment.class;
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    @Nullable
    public String getClassChildName(int position) {
        if (position != 1) {
            return position != 2 ? "HrmDayFragment" : "HrmMonthFragment";
        }
        return "HrmWeekFragment";
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    public int getContentResourceId() {
        return jui.f23149r;
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    public int getDefaultSportType() {
        return 4;
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment, defpackage.eah
    public void onImgShareClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        showPopupMenu(view);
    }
}
