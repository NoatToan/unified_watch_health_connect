package com.xiaomi.fitness.devicesettings.base.stand;

import android.os.Bundle;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.devicesettings.base.stand.StandDetectViewModel;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.StandDetectSettingItem;
import com.xiaomi.fitness.stand.export.StandDetectExtKt;
import com.xiaomi.fitness.stand.export.StandDetectManager;
import com.xiaomi.fitness.statistics.StatConstants;
import defpackage.wzi;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0013\u001a\u00020\u0010J\u0016\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0018\u001a\u00020\u0019J\u0018\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u001b\u001a\u00020\u0010J\u0006\u0010\u001c\u001a\u00020\u0010J\u0018\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0006\u0010\u001e\u001a\u00020\u0019J\b\u0010\u001f\u001a\u00020\u000bH\u0002J&\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/stand/StandDetectViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "standMgr", "Lcom/xiaomi/fitness/stand/export/StandDetectManager;", "getStandMgr", "()Lcom/xiaomi/fitness/stand/export/StandDetectManager;", "standMgr$delegate", "Lkotlin/Lazy;", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "setStandDetectEnable", "enable", "", "getStandDetectEnabled", "setStandReminderEnable", "getStandReminderEnable", "setRemindTime", StatConstants.PARAM_START, "", StatConstants.PARAM_END, "getRemindTime", "", "setStandDetectNapEnable", "isUpload", "getStandDetectNapEnable", "setStandDetectNapTime", "getStandDetectNapTime", "uploadSettings", "updateSettingTime", "isStart", "isNap", "hour", "min", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StandDetectViewModel extends AbsViewModel {

    /* JADX INFO: renamed from: standMgr$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy standMgr = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: aao
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return StandDetectViewModel.standMgr_delegate$lambda$0();
        }
    });

    private final StandDetectManager getStandMgr() {
        return (StandDetectManager) this.standMgr.getValue();
    }

    public static /* synthetic */ void setStandDetectNapEnable$default(StandDetectViewModel standDetectViewModel, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        standDetectViewModel.setStandDetectNapEnable(z, z2);
    }

    private final void setStandDetectNapTime(int start, int end) {
        getStandMgr().setStandDetectNapTime(start, end);
        uploadSettings();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StandDetectManager standMgr_delegate$lambda$0() {
        return StandDetectExtKt.getInstance(StandDetectManager.INSTANCE);
    }

    private final void uploadSettings() {
        StandDetectSettingItem standDetectSettingItem = new StandDetectSettingItem();
        standDetectSettingItem.setReminderEnable(getStandMgr().getStandReminderEnable());
        int[] remindTime = getStandMgr().getRemindTime();
        standDetectSettingItem.setReminderStartTime(remindTime[0]);
        standDetectSettingItem.setReminderEndTime(remindTime[1]);
        standDetectSettingItem.setDetectNapEnable(getStandMgr().getStandDetectNapEnable());
        int[] standDetectNapTime = getStandMgr().getStandDetectNapTime();
        standDetectSettingItem.setNapStartTime(standDetectNapTime[0]);
        standDetectSettingItem.setNapEndTime(standDetectNapTime[1]);
        DeviceSettingManager.INSTANCE.getInstance().sendUserSettingItem(DeviceSettingConfigKey.KEY_STAND_REMIND, standDetectSettingItem, false);
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    @NotNull
    public final int[] getRemindTime() {
        return getStandMgr().getRemindTime();
    }

    public final boolean getStandDetectEnabled() {
        return getStandMgr().getStandDetectEnabled();
    }

    public final boolean getStandDetectNapEnable() {
        return getStandMgr().getStandDetectNapEnable();
    }

    @NotNull
    public final int[] getStandDetectNapTime() {
        return getStandMgr().getStandDetectNapTime();
    }

    public final boolean getStandReminderEnable() {
        return getStandMgr().getStandReminderEnable();
    }

    public final void setRemindTime(int start, int end) {
        getStandMgr().setRemindTime(start, end);
        uploadSettings();
    }

    public final void setStandDetectEnable(boolean enable) {
        getStandMgr().setStandDetectEnable(enable);
    }

    public final void setStandDetectNapEnable(boolean enable, boolean isUpload) {
        getStandMgr().setStandDetectNapEnable(enable);
        if (isUpload) {
            uploadSettings();
        }
    }

    public final void setStandReminderEnable(boolean enable) {
        getStandMgr().setStandReminderEnable(enable);
        uploadSettings();
    }

    public final void updateSettingTime(boolean isStart, boolean isNap, int hour, int min) {
        int i = hour * 100;
        if (isNap) {
            i += min;
        }
        if (isNap) {
            int[] standDetectNapTime = getStandDetectNapTime();
            int i2 = standDetectNapTime[0];
            int i3 = standDetectNapTime[1];
            if (!isStart) {
                i3 = i;
                i = i2;
            }
            if (i >= i3) {
                ToastUtil.showShortToast(wzi.o8);
                return;
            } else {
                setStandDetectNapTime(i, i3);
                uploadSettings();
                return;
            }
        }
        int[] remindTime = getRemindTime();
        int i4 = remindTime[0];
        int i5 = remindTime[1];
        if (!isStart) {
            i5 = i;
            i = i4;
        }
        if (i >= i5) {
            ToastUtil.showShortToast(wzi.o8);
        } else {
            setRemindTime(i, i5);
            uploadSettings();
        }
    }
}
