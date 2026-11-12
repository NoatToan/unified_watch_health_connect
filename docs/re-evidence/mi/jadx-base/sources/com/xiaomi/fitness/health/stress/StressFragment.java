package com.xiaomi.fitness.health.stress;

import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.xiaomi.fitness.base.BaseDetailParentFragment;
import com.xiaomi.fitness.base.WrapperDayWeekMonthChildFragment;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.export.SettingsPageUtil;
import com.xiaomi.fitness.devicesettings.export.SettingsPageUtilExtKt;
import com.xiaomi.fitness.health.stress.StressFragment;
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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\r\u001a\u00020\u0006H\u0014J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\r\u001a\u00020\u0006H\u0014J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0002R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/health/stress/StressFragment;", "Lcom/xiaomi/fitness/base/BaseDetailParentFragment;", "Lcom/xiaomi/fitness/base/WrapperDayWeekMonthChildFragment;", "<init>", "()V", "defaultSportType", "", "getDefaultSportType", "()I", "contentResourceId", "getContentResourceId", "getClassChild", "Ljava/lang/Class;", "position", "getClassChildName", "", "onImgShareClick", "", "view", "Landroid/view/View;", "showPopupMenu", "showSettingIcon", "", "goSettingFragment", "goAllRecords", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStressFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StressFragment.kt\ncom/xiaomi/fitness/health/stress/StressFragment\n+ 2 Menu.kt\nandroidx/core/view/MenuKt\n*L\n1#1,98:1\n46#2:99\n*S KotlinDebug\n*F\n+ 1 StressFragment.kt\ncom/xiaomi/fitness/health/stress/StressFragment\n*L\n68#1:99\n*E\n"})
public class StressFragment extends BaseDetailParentFragment<WrapperDayWeekMonthChildFragment> {
    private final void goAllRecords() {
        BaseFragmentExKt.gotoPage(this, StressExpandableAllRecordsFragment.class, null);
    }

    private final void goSettingFragment() {
        SettingsPageUtil settingsPageUtil = SettingsPageUtilExtKt.getSettingsPageUtil();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        settingsPageUtil.gotoPressurePage(contextRequireContext);
    }

    private final void showPopupMenu(View view) {
        a4i a4iVar = new a4i(requireContext(), view);
        a4iVar.f(nwi.p);
        if (showSettingIcon()) {
            Menu menuD = a4iVar.d();
            Menu menuD2 = a4iVar.d();
            Intrinsics.checkNotNullExpressionValue(menuD2, "getMenu(...)");
            menuD.add(0, 1, menuD2.size(), c0j.xb);
        }
        a4iVar.setOnMenuItemClickListener(new a4i.c() { // from class: dko
            @Override // a4i.c
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return StressFragment.showPopupMenu$lambda$0(this.f15634a, menuItem);
            }
        });
        a4iVar.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showPopupMenu$lambda$0(StressFragment this$0, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        if (itemId == eri.Db) {
            this$0.goAllRecords();
        } else if (itemId == 1) {
            this$0.goSettingFragment();
        }
        return true;
    }

    private final boolean showSettingIcon() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            return DeviceModelExtKt.isHuaMi(wearableDeviceModel) || com.xiaomi.fitness.util.DeviceModelExtKt.isSupportPressureMonitor(wearableDeviceModel);
        }
        return false;
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    @NotNull
    public Class<?> getClassChild(int position) {
        if (position != 1) {
            return position != 2 ? StressDayFragment.class : StressMonthFragment.class;
        }
        return StressWeekFragment.class;
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    @Nullable
    public String getClassChildName(int position) {
        if (position != 1) {
            return position != 2 ? "StressDayFragment" : "StressMonthFragment";
        }
        return "StressWeekFragment";
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    public int getContentResourceId() {
        return jui.f23149r;
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    public int getDefaultSportType() {
        return 7;
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment, defpackage.eah
    public void onImgShareClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onImgShareClick(view);
        showPopupMenu(view);
    }
}
