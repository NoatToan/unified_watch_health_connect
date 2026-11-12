package com.xiaomi.fitness.health.bloodglucose.ui;

import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.material.tabs.TabLayout;
import com.xiaomi.fitness.base.WrapperDayWeekMonthChildFragment;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.blood_sugar.BloodSugarExtKt;
import com.xiaomi.fitness.blood_sugar.BloodSugarManager;
import com.xiaomi.fitness.blood_sugar.BloodSugarRemindSettingManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.health.bloodglucose.BloodGlucoseViewModel;
import com.xiaomi.fitness.health.bloodglucose.ui.BloodGlucoseFragment;
import com.xiaomi.fitness.privacy.export.IPrivacySensitiveImpl;
import com.xiaomi.fitness.privacy.export.PrivacyHelper;
import com.xiaomi.fitness.privacy.export.PrivacyHelperPointKt;
import defpackage.a4i;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import defpackage.nwi;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0016\u001a\u00020\u0006H\u0014J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u0006H\u0014J\b\u0010\u0019\u001a\u00020\u001aH\u0014J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u0006H\u0002J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010!\u001a\u00020\u001aH\u0002J\b\u0010\"\u001a\u00020\u001aH\u0002J\b\u0010#\u001a\u00020\u001aH\u0002J\b\u0010$\u001a\u00020\u001aH\u0002J\b\u0010%\u001a\u00020\u001aH\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u0014\u0010&\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\b¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/health/bloodglucose/ui/BloodGlucoseFragment;", "Lcom/xiaomi/fitness/base/BaseDetailParentFragment;", "Lcom/xiaomi/fitness/base/WrapperDayWeekMonthChildFragment;", "<init>", "()V", "defaultSportType", "", "getDefaultSportType", "()I", "mViewModel", "Lcom/xiaomi/fitness/health/bloodglucose/BloodGlucoseViewModel;", "judgeShowContinueTab", "", "getJudgeShowContinueTab", "()Z", "setJudgeShowContinueTab", "(Z)V", "currentDeviceConnected", "getCurrentDeviceConnected", "setCurrentDeviceConnected", "getClassChild", "Ljava/lang/Class;", "position", "getClassChildName", "", "initTab", "", "onImgShareClick", "view", "Landroid/view/View;", "choiceTabValid", "tabPosition", "showPopupMenu", "goAddRecord", "goAllRecord", "goSettings", "goBloodSugarFragment", LifecycleConstantKt.ON_DESTROY, "contentResourceId", "getContentResourceId", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BloodGlucoseFragment extends Hilt_BloodGlucoseFragment<WrapperDayWeekMonthChildFragment> {
    private boolean currentDeviceConnected;
    private boolean judgeShowContinueTab;

    @Nullable
    private BloodGlucoseViewModel mViewModel;

    private final boolean choiceTabValid(int tabPosition) {
        return this.judgeShowContinueTab && tabPosition == 0;
    }

    private final void goAddRecord() {
        PrivacyHelper privacyHelperPointKt = PrivacyHelperPointKt.getInstance(PrivacyHelper.INSTANCE);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        privacyHelperPointKt.showPrivacySensitiveDialogIfNeed(fragmentActivityRequireActivity, new IPrivacySensitiveImpl() { // from class: com.xiaomi.fitness.health.bloodglucose.ui.BloodGlucoseFragment.goAddRecord.1
            @Override // com.xiaomi.fitness.privacy.export.IPrivacySensitiveImpl, com.xiaomi.fitness.privacy.export.IPrivacySensitive
            public void onPrivacyAccepted() {
                BaseFragmentExKt.gotoPage(BloodGlucoseFragment.this, BloodGlucoseAddValueFragment.class, null);
            }
        });
    }

    private final void goAllRecord() {
        BaseFragmentExKt.gotoPage(this, BloodGlucoseFilteredRecordsFragment.class, null);
    }

    private final void goBloodSugarFragment() {
        BloodSugarManager bloodSugarExtKt = BloodSugarExtKt.getInstance(BloodSugarManager.INSTANCE);
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        bloodSugarExtKt.goBloodSugarDevice(mActivity);
    }

    private final void goSettings() {
        BloodSugarRemindSettingManager bloodSugarExtKt = BloodSugarExtKt.getInstance(BloodSugarRemindSettingManager.INSTANCE);
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        bloodSugarExtKt.goBloodSugarDeviceSettingsPage(mActivity);
    }

    private final void showPopupMenu(View view) {
        a4i a4iVar = new a4i(requireContext(), view);
        a4iVar.f(nwi.f28506a);
        a4iVar.d().findItem(eri.Fb).setVisible(false);
        a4iVar.d().findItem(eri.Bb).setVisible(false);
        a4iVar.setOnMenuItemClickListener(new a4i.c() { // from class: rx2
            @Override // a4i.c
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return BloodGlucoseFragment.showPopupMenu$lambda$0(this.f33021a, menuItem);
            }
        });
        a4iVar.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showPopupMenu$lambda$0(BloodGlucoseFragment this$0, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        if (itemId == eri.Cb) {
            this$0.goAddRecord();
            return true;
        }
        if (itemId == eri.Db) {
            this$0.goAllRecord();
            return true;
        }
        if (itemId == eri.Fb) {
            this$0.goSettings();
            return true;
        }
        if (itemId != eri.Bb) {
            return true;
        }
        this$0.goBloodSugarFragment();
        return true;
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    @NotNull
    public Class<?> getClassChild(int position) {
        if (choiceTabValid(getTabPosition())) {
            if (position != 1) {
                return position != 2 ? BloodGlucoseDayFragment.class : BloodGlucoseMonthFragment.class;
            }
            return BloodGlucoseWeekFragment.class;
        }
        if (position != 1) {
            return position != 2 ? BloodGlucoseFingerDayFragment.class : BloodGlucoseFingerMonthFragment.class;
        }
        return BloodGlucoseFingerWeekFragment.class;
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    @NotNull
    public String getClassChildName(int position) {
        if (choiceTabValid(getTabPosition())) {
            if (position != 1) {
                return position != 2 ? "BloodGlucoseDayFragment" : "BloodGlucoseMonthFragment";
            }
            return "BloodGlucoseWeekFragment";
        }
        if (position != 1) {
            return position != 2 ? "BloodGlucoseFingerDayFragment" : "BloodGlucoseFingerMonthFragment";
        }
        return "BloodGlucoseFingerWeekFragment";
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    public int getContentResourceId() {
        return jui.f23149r;
    }

    public final boolean getCurrentDeviceConnected() {
        return this.currentDeviceConnected;
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    public int getDefaultSportType() {
        return 24;
    }

    public final boolean getJudgeShowContinueTab() {
        return this.judgeShowContinueTab;
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    public void initTab() {
        super.initTab();
        ArrayList arrayList = new ArrayList();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        this.mViewModel = (BloodGlucoseViewModel) new ViewModelProvider(fragmentActivityRequireActivity).get(BloodGlucoseViewModel.class);
        this.judgeShowContinueTab = false;
        this.currentDeviceConnected = false;
        if (getTabLayout() != null) {
            TabLayout tabLayout = getTabLayout();
            Intrinsics.checkNotNull(tabLayout);
            TabLayout.g gVarV = tabLayout.A().v(getString(c0j.f1));
            Intrinsics.checkNotNullExpressionValue(gVarV, "setText(...)");
            TabLayout tabLayout2 = getTabLayout();
            Intrinsics.checkNotNull(tabLayout2);
            TabLayout.g gVarV2 = tabLayout2.A().v(getString(c0j.g1));
            Intrinsics.checkNotNullExpressionValue(gVarV2, "setText(...)");
            ListExtKt.add(arrayList, gVarV);
            ListExtKt.add(arrayList, gVarV2);
            Logger.i("thisTabLayoutList  " + this.judgeShowContinueTab + "  " + this.currentDeviceConnected, new Object[0]);
            setTabLayoutList(arrayList, this.judgeShowContinueTab, this.currentDeviceConnected ^ true);
        }
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment, defpackage.eah
    public void onImgShareClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        showPopupMenu(view);
    }

    public final void setCurrentDeviceConnected(boolean z) {
        this.currentDeviceConnected = z;
    }

    public final void setJudgeShowContinueTab(boolean z) {
        this.judgeShowContinueTab = z;
    }
}
