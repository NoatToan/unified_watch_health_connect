package com.xiaomi.fitness.health.bloodpressure.ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.xiaomi.fitness.base.BaseDetailParentFragment;
import com.xiaomi.fitness.base.WrapperDayWeekMonthChildFragment;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.health.bloodpressure.ui.BloodPressureFragment;
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
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0014J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u0006H\u0014J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\rH\u0002J\b\u0010\u001b\u001a\u00020\rH\u0002J\b\u0010\u001c\u001a\u00020\rH\u0002R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0014\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\b¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/health/bloodpressure/ui/BloodPressureFragment;", "Lcom/xiaomi/fitness/base/BaseDetailParentFragment;", "Lcom/xiaomi/fitness/base/WrapperDayWeekMonthChildFragment;", "<init>", "()V", "defaultSportType", "", "getDefaultSportType", "()I", "getClassChild", "Ljava/lang/Class;", "position", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "getClassChildName", "", "contentResourceId", "getContentResourceId", "onImgShareClick", "showPopupMenu", "showBloodPressureAbout", "", "goAddRecord", "goAllRecords", "goBloodPressureRemind", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BloodPressureFragment extends BaseDetailParentFragment<WrapperDayWeekMonthChildFragment> {
    public static final int BloodPressureAbout = 3;

    private final void goAddRecord() {
        PrivacyHelper privacyHelperPointKt = PrivacyHelperPointKt.getInstance(PrivacyHelper.INSTANCE);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        privacyHelperPointKt.showPrivacySensitiveDialogIfNeed(fragmentActivityRequireActivity, new IPrivacySensitiveImpl() { // from class: com.xiaomi.fitness.health.bloodpressure.ui.BloodPressureFragment.goAddRecord.1
            @Override // com.xiaomi.fitness.privacy.export.IPrivacySensitiveImpl, com.xiaomi.fitness.privacy.export.IPrivacySensitive
            public void onPrivacyAccepted() {
                BaseFragmentExKt.gotoPage(BloodPressureFragment.this, BloodPressureAddFragment.class, null);
            }
        });
    }

    private final void goAllRecords() {
        BaseFragmentExKt.gotoPage(this, BloodPressureExpandableAllRecordsFragment.class, null);
    }

    private final void goBloodPressureRemind() {
        BaseFragmentExKt.gotoPage(this, BloodPressureRemindFragment.class, null);
    }

    private final boolean showBloodPressureAbout() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            return DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "blood_pressure");
        }
        return false;
    }

    private final void showPopupMenu(View view) {
        a4i a4iVar = new a4i(requireContext(), view);
        a4iVar.f(nwi.f28507b);
        if (showBloodPressureAbout()) {
            a4iVar.d().add(0, 3, 3, c0j.ja);
        }
        a4iVar.setOnMenuItemClickListener(new a4i.c() { // from class: sz2
            @Override // a4i.c
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return BloodPressureFragment.showPopupMenu$lambda$0(this.f34115a, menuItem);
            }
        });
        a4iVar.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showPopupMenu$lambda$0(BloodPressureFragment this$0, MenuItem menuItem) {
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
        if (itemId == eri.Fb) {
            this$0.goBloodPressureRemind();
            return true;
        }
        if (itemId != 3) {
            return true;
        }
        BaseFragmentExKt.gotoPage(this$0, AboutBloodPressureFragment.class, null);
        return true;
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    @NotNull
    public Class<?> getClassChild(int position) {
        if (position != 1) {
            return position != 2 ? BloodPressureDayFragment.class : BloodPressureMonthFragment.class;
        }
        return BloodPressureWeekFragment.class;
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    @NotNull
    public String getClassChildName(int position) {
        if (position != 1) {
            return position != 2 ? "BloodPressureDayFragment" : "BloodPressureMonthFragment";
        }
        return "BloodPressureWeekFragment";
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    public int getContentResourceId() {
        return jui.f23149r;
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    public int getDefaultSportType() {
        return 16;
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment, defpackage.eah
    public void onImgShareClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        showPopupMenu(view);
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("expose_v3", "56.98.1.1.38011"), "name", "xiaomi_blood_card");
    }
}
