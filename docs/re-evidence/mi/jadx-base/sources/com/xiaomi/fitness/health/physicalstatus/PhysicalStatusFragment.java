package com.xiaomi.fitness.health.physicalstatus;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fitness.base.BasicDataFragment;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.view.TitleBarAlphaView;
import defpackage.jui;
import defpackage.l2c;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\u0014\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0011\u001a\u00020\bH\u0014J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\bH\u0014J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\bH\u0016J\u0012\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u0014\u0010\u0007\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/health/physicalstatus/PhysicalStatusFragment;", "Lcom/xiaomi/fitness/base/BasicDataFragment;", "Lcom/xiaomi/fitness/health/physicalstatus/PhysicalStatusDayFragment;", "<init>", "()V", "setTabType", "", "contentResourceId", "", "getContentResourceId", "()I", "className", "", "getClassName", "()Ljava/lang/String;", "getClassChild", "Ljava/lang/Class;", "position", "getClassChildName", "showImgMore", "visibility", "changeShowCalendar", "localDate", "Lorg/joda/time/LocalDate;", "initContentView", "contentView", "Landroid/view/View;", "expandBundle", SdkContants.KEY_BUNDLE, "Landroid/os/Bundle;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PhysicalStatusFragment extends BasicDataFragment<PhysicalStatusDayFragment> {
    @Override // com.xiaomi.fitness.base.BasicDataFragment
    public void changeShowCalendar(@Nullable LocalDate localDate) {
        String strC = l2c.c(getMActivity(), getHealthDataType());
        if (localDate != null) {
            LocalDate localDateMinusDays = localDate.minusDays(41);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Intrinsics.checkNotNull(localDateMinusDays);
            String str = String.format("%s-%s", Arrays.copyOf(new Object[]{TimeDateUtil.getDateMMddFormat(localDateMinusDays), TimeDateUtil.getDateMMddFormat(localDate)}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            TitleBarAlphaView titleBarAlphaView = getTitleBarAlphaView();
            if (titleBarAlphaView != null) {
                titleBarAlphaView.bindData(strC, str);
            }
        }
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment
    public void expandBundle(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        bundle.putBoolean("switch_day_week_month", false);
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment
    @NotNull
    public Class<?> getClassChild(int position) {
        return PhysicalStatusDayFragment.class;
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment
    @Nullable
    public String getClassChildName(int position) {
        return "PhysicalStatusDayFragment";
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment
    @NotNull
    public String getClassName() {
        String name = PhysicalStatusFragment.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment
    public int getContentResourceId() {
        return jui.q;
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment
    public void initContentView(@Nullable View contentView) {
        ImageView imgShare;
        TitleBarAlphaView titleBarAlphaView = getTitleBarAlphaView();
        if (titleBarAlphaView != null && (imgShare = titleBarAlphaView.getImgShare()) != null) {
            imgShare.setVisibility(8);
        }
        TitleBarAlphaView titleBarAlphaView2 = getTitleBarAlphaView();
        if (titleBarAlphaView2 != null) {
            titleBarAlphaView2.setTitleClickable(false);
        }
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment, com.xiaomi.fitness.base.BaseDataFragment.a
    public /* bridge */ /* synthetic */ void onDateChanged(LocalDate localDate) {
        super.onDateChanged(localDate);
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment, com.xiaomi.fitness.base.BaseDataFragment.a
    public /* bridge */ /* synthetic */ void onDeviceListChanged(List list) {
        super.onDeviceListChanged(list);
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment
    public void setTabType() {
        super.setTabType();
        setTabType(2);
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment
    public void showImgMore(int visibility) {
        ImageView imgShare;
        TitleBarAlphaView titleBarAlphaView = getTitleBarAlphaView();
        if (titleBarAlphaView == null || (imgShare = titleBarAlphaView.getImgShare()) == null) {
            return;
        }
        imgShare.setVisibility(8);
    }
}
