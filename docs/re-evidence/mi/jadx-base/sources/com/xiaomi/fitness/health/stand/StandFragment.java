package com.xiaomi.fitness.health.stand;

import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import com.xiaomi.fitness.base.BaseDetailParentFragment;
import com.xiaomi.fitness.base.WrapperDayWeekMonthChildFragment;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.devicesettings.export.SettingsPageUtilExtKt;
import com.xiaomi.fitness.health.stand.StandFragment;
import com.xiaomi.fitness.stand.export.StandDetectExtKt;
import com.xiaomi.fitness.stand.export.StandDetectManager;
import com.xiaomi.fitness.view.TitleBarAlphaView;
import defpackage.a4i;
import defpackage.c0j;
import defpackage.jui;
import defpackage.nwi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u000e\u001a\u00020\tH\u0014J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\tH\u0014J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0014J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0016H\u0016J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0016H\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u001b\u001a\u00020\u0006H\u0002R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\t8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/health/stand/StandFragment;", "Lcom/xiaomi/fitness/base/BaseDetailParentFragment;", "Lcom/xiaomi/fitness/base/WrapperDayWeekMonthChildFragment;", "<init>", "()V", "isSupportSedentary", "", "Ljava/lang/Boolean;", "defaultSportType", "", "getDefaultSportType", "()I", "getClassChild", "Ljava/lang/Class;", "position", "getClassChildName", "", "contentResourceId", "getContentResourceId", "initContentView", "", "contentView", "Landroid/view/View;", "onImgShareClick", "view", "showPopupMenu", "goSettingFragment", "isSupportStandRemind", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStandFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StandFragment.kt\ncom/xiaomi/fitness/health/stand/StandFragment\n+ 2 Menu.kt\nandroidx/core/view/MenuKt\n*L\n1#1,119:1\n46#2:120\n*S KotlinDebug\n*F\n+ 1 StandFragment.kt\ncom/xiaomi/fitness/health/stand/StandFragment\n*L\n86#1:120\n*E\n"})
public final class StandFragment extends BaseDetailParentFragment<WrapperDayWeekMonthChildFragment> {

    @Nullable
    private Boolean isSupportSedentary;

    private final void goSettingFragment() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        if (isSupportSedentary() || isSupportStandRemind() || !StandDetectExtKt.getInstance(StandDetectManager.INSTANCE).supportStandDetect()) {
            SettingsPageUtilExtKt.getSettingsPageUtil().gotoSedentaryPage(contextRequireContext);
        } else {
            SettingsPageUtilExtKt.getSettingsPageUtil().gotoStandDetectPage(contextRequireContext);
        }
    }

    private final boolean isSupportSedentary() {
        Boolean bool = this.isSupportSedentary;
        if (bool != null) {
            Intrinsics.checkNotNull(bool);
            return bool.booleanValue();
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        Boolean boolValueOf = Boolean.valueOf(wearableDeviceModel != null ? DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.SEDENTARY) : false);
        this.isSupportSedentary = boolValueOf;
        Intrinsics.checkNotNull(boolValueOf);
        return boolValueOf.booleanValue();
    }

    private final boolean isSupportStandRemind() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        return wearableDeviceModel != null && wearableDeviceModel.getIsDeviceConnected() && DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.STAND_REMINDER);
    }

    private final void showPopupMenu(View view) {
        int i;
        a4i a4iVar = new a4i(requireContext(), view);
        a4iVar.f(nwi.o);
        if (isSupportSedentary()) {
            i = c0j.ol;
        } else if (!isSupportStandRemind() && !StandDetectExtKt.getInstance(StandDetectManager.INSTANCE).supportStandDetect()) {
            return;
        } else {
            i = c0j.nl;
        }
        Menu menuD = a4iVar.d();
        Menu menuD2 = a4iVar.d();
        Intrinsics.checkNotNullExpressionValue(menuD2, "getMenu(...)");
        menuD.add(0, 1, menuD2.size(), i);
        a4iVar.setOnMenuItemClickListener(new a4i.c() { // from class: fao
            @Override // a4i.c
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return StandFragment.showPopupMenu$lambda$0(this.f17608a, menuItem);
            }
        });
        a4iVar.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showPopupMenu$lambda$0(StandFragment this$0, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        if (menuItem.getItemId() == 1) {
            this$0.goSettingFragment();
        }
        return true;
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    @NotNull
    public Class<?> getClassChild(int position) {
        if (position != 1) {
            return position != 2 ? StandDayFragment.class : StandMonthFragment.class;
        }
        return StandWeekFragment.class;
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    @NotNull
    public String getClassChildName(int position) {
        if (position != 1) {
            return position != 2 ? "StandDayFragment" : "StandMonthFragment";
        }
        return "StandWeekFragment";
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    public int getContentResourceId() {
        return jui.f23149r;
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    public int getDefaultSportType() {
        return 5;
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
        imgShare.setVisibility((isSupportSedentary() || isSupportStandRemind() || StandDetectExtKt.getInstance(StandDetectManager.INSTANCE).supportStandDetect()) ? 0 : 8);
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment, defpackage.eah
    public void onImgShareClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        showPopupMenu(view);
    }
}
