package com.xiaomi.fitness.health.vitality;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fitness.base.BasicDataFragment;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.export.SettingsPageUtil;
import com.xiaomi.fitness.devicesettings.export.SettingsPageUtilExtKt;
import com.xiaomi.fitness.health.vitality.VitalityFragment;
import com.xiaomi.fitness.view.TitleBarAlphaView;
import defpackage.a4i;
import defpackage.c0j;
import defpackage.jui;
import defpackage.nwi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\u0014\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0011\u001a\u00020\bH\u0014J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\bH\u0014J\u0012\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\bH\u0016J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0015H\u0016J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0015H\u0002J\b\u0010\u001b\u001a\u00020\u0006H\u0002J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u0014\u0010\u0007\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/health/vitality/VitalityFragment;", "Lcom/xiaomi/fitness/base/BasicDataFragment;", "Lcom/xiaomi/fitness/health/vitality/VitalityDayFragment;", "<init>", "()V", "setTabType", "", "contentResourceId", "", "getContentResourceId", "()I", "className", "", "getClassName", "()Ljava/lang/String;", "getClassChild", "Ljava/lang/Class;", "position", "getClassChildName", "initContentView", "contentView", "Landroid/view/View;", "showImgMore", "visibility", "onImgShareClick", "view", "showPopupMenu", "goSettingFragment", "expandBundle", SdkContants.KEY_BUNDLE, "Landroid/os/Bundle;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VitalityFragment extends BasicDataFragment<VitalityDayFragment> {
    private final void goSettingFragment() {
        SettingsPageUtil settingsPageUtil = SettingsPageUtilExtKt.getSettingsPageUtil();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        settingsPageUtil.gotoVitalityPage(contextRequireContext);
    }

    private final void showPopupMenu(View view) {
        a4i a4iVar = new a4i(requireContext(), view);
        a4iVar.f(nwi.f28509r);
        a4iVar.d().add(0, 1, 0, c0j.Ao);
        a4iVar.setOnMenuItemClickListener(new a4i.c() { // from class: r1r
            @Override // a4i.c
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return VitalityFragment.showPopupMenu$lambda$0(this.f32089a, menuItem);
            }
        });
        a4iVar.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showPopupMenu$lambda$0(VitalityFragment this$0, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        if (menuItem.getItemId() == 1) {
            this$0.goSettingFragment();
        }
        return true;
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment
    public void expandBundle(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        bundle.putBoolean("switch_day_week_month", false);
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment
    @NotNull
    public Class<?> getClassChild(int position) {
        return VitalityDayFragment.class;
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment
    @Nullable
    public String getClassChildName(int position) {
        return "VitalityDayFragment";
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment
    @NotNull
    public String getClassName() {
        String name = VitalityFragment.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment
    public int getContentResourceId() {
        return jui.q;
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment
    public void initContentView(@Nullable View contentView) {
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment, com.xiaomi.fitness.base.BaseDataFragment.a
    public /* bridge */ /* synthetic */ void onDateChanged(LocalDate localDate) {
        super.onDateChanged(localDate);
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment, com.xiaomi.fitness.base.BaseDataFragment.a
    public /* bridge */ /* synthetic */ void onDeviceListChanged(List list) {
        super.onDeviceListChanged(list);
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment, defpackage.eah
    public void onImgShareClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        showPopupMenu(view);
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment
    public void setTabType() {
        super.setTabType();
        setTabType(2);
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment
    public void showImgMore(int visibility) {
        ImageView imgShare;
        ImageView imgShare2;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || !DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "vitality")) {
            TitleBarAlphaView titleBarAlphaView = getTitleBarAlphaView();
            if (titleBarAlphaView == null || (imgShare = titleBarAlphaView.getImgShare()) == null) {
                return;
            }
            imgShare.setVisibility(8);
            return;
        }
        TitleBarAlphaView titleBarAlphaView2 = getTitleBarAlphaView();
        if (titleBarAlphaView2 == null || (imgShare2 = titleBarAlphaView2.getImgShare()) == null) {
            return;
        }
        imgShare2.setVisibility(0);
    }
}
