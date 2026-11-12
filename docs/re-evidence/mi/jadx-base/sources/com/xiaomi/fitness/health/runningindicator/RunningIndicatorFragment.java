package com.xiaomi.fitness.health.runningindicator;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fitness.base.BaseDetailParentFragment;
import com.xiaomi.fitness.base.WrapperDayWeekMonthChildFragment;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.view.TitleBarAlphaView;
import defpackage.c0j;
import defpackage.jui;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0014J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0006H\u0014J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u000fH\u0014J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0014\u001a\u00020\u000fH\u0014J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0012H\u0014J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0014R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0015\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/health/runningindicator/RunningIndicatorFragment;", "Lcom/xiaomi/fitness/base/BaseDetailParentFragment;", "Lcom/xiaomi/fitness/base/WrapperDayWeekMonthChildFragment;", "<init>", "()V", "defaultSportType", "", "getDefaultSportType", "()I", "getClassChild", "Ljava/lang/Class;", "position", "getClassChildName", "", "initPositionMap", "", "expandPositionIfNeed", "createBundleForSwitchTab", "Landroid/os/Bundle;", "fragment", "setTabList", "contentResourceId", "getContentResourceId", "expandBundle", SdkContants.KEY_BUNDLE, "initContentView", "contentView", "Landroid/view/View;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RunningIndicatorFragment extends BaseDetailParentFragment<WrapperDayWeekMonthChildFragment> {
    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    public void expandBundle(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        bundle.putBoolean("switch_day_week_month", false);
        if (getMPosition() == 0) {
            bundle.putInt("position", 1);
        } else {
            bundle.putInt("position", 2);
        }
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    public void expandPositionIfNeed() {
        setMPosition(getMPosition() == 2 ? 1 : 0);
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    @NotNull
    public Class<?> getClassChild(int position) {
        return position == 1 ? RunningIndicatorMonthFragment.class : RunningIndicatorWeekFragment.class;
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    @NotNull
    public String getClassChildName(int position) {
        return position == 1 ? "RunningIndicatorMonthFragment" : "RunningIndicatorWeekFragment";
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    public int getContentResourceId() {
        return jui.f23149r;
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    public int getDefaultSportType() {
        return 22;
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    public void initContentView(@NotNull View contentView) {
        ImageView imgShare;
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        super.initContentView(contentView);
        TitleBarAlphaView titleBarAlphaView = getTitleBarAlphaView();
        if (titleBarAlphaView == null || (imgShare = titleBarAlphaView.getImgShare()) == null) {
            return;
        }
        imgShare.setVisibility(8);
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    public void initPositionMap() {
        getPositionMap().clear();
        getPositionMap().put(0, 1);
        getPositionMap().put(1, 2);
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    public void setTabList() {
        ListExtKt.add(getMTabTitles(), getString(c0j.e7));
        ListExtKt.add(getMTabTitles(), getString(c0j.c7));
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    @NotNull
    public Bundle createBundleForSwitchTab(@Nullable WrapperDayWeekMonthChildFragment fragment) {
        LocalDate localDateNow;
        if (getIsFromCalendar()) {
            setFromCalendar(false);
            localDateNow = getCalendarDate();
            setMSelectDate(localDateNow);
        } else {
            localDateNow = getLocalDateMap().get(0);
            if (localDateNow == null) {
                localDateNow = getMSelectDate();
                Intrinsics.checkNotNull(localDateNow);
            }
            LocalDate localDatePlusDays = getLocalDateMap().get(1);
            if (localDatePlusDays == null) {
                localDatePlusDays = LocalDate.now();
            }
            if (getMPosition() == 0) {
                if (getMPrePosition() == 1) {
                    Intrinsics.checkNotNull(localDatePlusDays);
                    if (!TimeDateUtil.isSameMonth(localDateNow, localDatePlusDays)) {
                        localDateNow = TimeDateUtil.getFirstDayOfNextMonth(localDatePlusDays.plusMonths(1)).minusDays(1);
                    }
                }
            } else if (getMPosition() == 1) {
                if (getMPrePosition() == 0) {
                    localDatePlusDays = TimeDateUtil.getWeekMonday(localDateNow).plusDays(6);
                }
                localDateNow = localDatePlusDays;
            } else {
                localDateNow = null;
            }
            if (localDateNow == null) {
                localDateNow = LocalDate.now();
            }
            Intrinsics.checkNotNull(localDateNow);
            if (localDateNow.isAfter(LocalDate.now())) {
                localDateNow = LocalDate.now();
            }
        }
        if (fragment != null) {
            fragment.setMCurrentDate(localDateNow);
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("local_date", localDateNow);
        bundle.putString("did", getMSid());
        bundle.putInt("sport_type", getSportDataType());
        bindTitleBarAlphaView(localDateNow);
        return bundle;
    }
}
