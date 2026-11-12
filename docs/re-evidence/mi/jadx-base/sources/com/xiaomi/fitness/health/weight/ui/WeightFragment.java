package com.xiaomi.fitness.health.weight.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fitness.base.BaseDetailChildFragment;
import com.xiaomi.fitness.base.BaseDetailParentFragment;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.electronic.scale.export.EcoDialogHelper;
import com.xiaomi.fitness.electronic.scale.export.EcoShareDialogExtKt;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManager;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManagerExtKt;
import com.xiaomi.fitness.health.weight.ui.WeightFragment;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
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
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\fH\u0014J\b\u0010\u0012\u001a\u00020\fH\u0014J\u0014\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0015\u001a\u00020\u0006H\u0014J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u0006H\u0014J\u0010\u0010\u001a\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u001b\u001a\u00020\fH\u0002J\b\u0010\u001c\u001a\u00020\fH\u0002J\u0010\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0010H\u0014J\u0012\u0010\u001f\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u0002H\u0014R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\b¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/health/weight/ui/WeightFragment;", "Lcom/xiaomi/fitness/base/BaseDetailParentFragment;", "Lcom/xiaomi/fitness/base/BaseDetailChildFragment;", "<init>", "()V", "defaultSportType", "", "getDefaultSportType", "()I", "isFrom8Electrode", "", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setTabList", "setTabType", "getClassChild", "Ljava/lang/Class;", "position", "getClassChildName", "", "contentResourceId", "getContentResourceId", "onImgShareClick", "goAllRecords", "goAddRecord", "expandBundle", SdkContants.KEY_BUNDLE, "createBundleForSwitchTab", "fragment", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WeightFragment extends BaseDetailParentFragment<BaseDetailChildFragment> {
    private boolean isFrom8Electrode;

    private final void goAddRecord() {
        PrivacyHelper privacyHelperPointKt = PrivacyHelperPointKt.getInstance(PrivacyHelper.INSTANCE);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        privacyHelperPointKt.showPrivacySensitiveDialogIfNeed(fragmentActivityRequireActivity, new IPrivacySensitiveImpl() { // from class: com.xiaomi.fitness.health.weight.ui.WeightFragment.goAddRecord.1
            @Override // com.xiaomi.fitness.privacy.export.IPrivacySensitiveImpl, com.xiaomi.fitness.privacy.export.IPrivacySensitive
            public void onPrivacyAccepted() {
                BaseFragmentExKt.gotoPage(WeightFragment.this, WeightAddFragment.class, null);
            }
        });
    }

    private final void goAllRecords() {
        BaseFragmentExKt.gotoPage(this, WeightExpandableAllRecordsFragment.class, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onImgShareClick$lambda$0(WeightFragment this$0, MenuItem menuItem) {
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
        if (itemId != eri.Jb) {
            return true;
        }
        ElectronicScaleManager electronicScaleManagerExtKt = ElectronicScaleManagerExtKt.getInstance(ElectronicScaleManager.INSTANCE);
        Context contextRequireContext = this$0.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        electronicScaleManagerExtKt.goVirtualAccount(contextRequireContext, LocalDate.now());
        return true;
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    @NotNull
    public Bundle createBundleForSwitchTab(@Nullable BaseDetailChildFragment fragment) {
        LocalDate mSelectDate;
        if (getIsFromCalendar()) {
            setFromCalendar(false);
            mSelectDate = getCalendarDate();
            setMSelectDate(mSelectDate);
        } else {
            mSelectDate = getLocalDateMap().get(Integer.valueOf(getMPosition()));
            if (mSelectDate == null) {
                mSelectDate = getMPosition() == 0 ? getMSelectDate() : LocalDate.now();
            }
        }
        if (fragment != null) {
            fragment.setMCurrentDate(mSelectDate);
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("local_date", mSelectDate);
        bundle.putString("did", getMSid());
        bundle.putInt("sport_type", getSportDataType());
        if (getMPosition() == 0) {
            bindTitleBarAlphaView(mSelectDate);
        }
        return bundle;
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    public void expandBundle(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        bundle.putBoolean("switch_day_week_month", false);
        bundle.putBoolean("only_day", true);
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    @NotNull
    public Class<?> getClassChild(int position) {
        return position == 1 ? WeightStatisticFragment.class : WeightDayFragment.class;
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    @NotNull
    public String getClassChildName(int position) {
        return position == 1 ? "WeightStatisticFragment" : "WeightDayFragment";
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    public int getContentResourceId() {
        return jui.f23149r;
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    public int getDefaultSportType() {
        return 10000;
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment, defpackage.eah
    public void onImgShareClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        a4i a4iVar = new a4i(requireContext(), view);
        if (!AppUtil.INSTANCE.isPlayChannel() && Intrinsics.areEqual("cn", RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion()) && this.isFrom8Electrode) {
            a4iVar.f(nwi.s);
        } else {
            a4iVar.f(nwi.t);
        }
        a4iVar.setOnMenuItemClickListener(new a4i.c() { // from class: qfr
            @Override // a4i.c
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return WeightFragment.onImgShareClick$lambda$0(this.f31489a, menuItem);
            }
        });
        a4iVar.g();
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        this.isFrom8Electrode = arguments != null ? arguments.getBoolean(WeightFragmentKt.KEY_IS_FROM_8_ELECTRODE) : false;
        Bundle arguments2 = getArguments();
        if (Intrinsics.areEqual(arguments2 != null ? Boolean.valueOf(arguments2.getBoolean("showNoBodyFatErrorDialog", false)) : null, Boolean.TRUE)) {
            EcoDialogHelper ecoShareDialogExtKt = EcoShareDialogExtKt.getInstance(EcoDialogHelper.INSTANCE);
            Context context = getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.view.BaseActivity");
            ecoShareDialogExtKt.showWeightErrorDialog((BaseActivity) context, 1);
        }
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    public void setTabList() {
        ListExtKt.add(getMTabTitles(), getString(c0j.ip));
        ListExtKt.add(getMTabTitles(), getString(c0j.d7));
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    public void setTabType() {
        setTabType(1);
    }
}
