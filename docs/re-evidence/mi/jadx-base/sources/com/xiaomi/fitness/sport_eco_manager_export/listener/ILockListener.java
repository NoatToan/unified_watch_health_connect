package com.xiaomi.fitness.sport_eco_manager_export.listener;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0005H&¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ILockListener;", "", "onLock", "", "isHasLock", "", "lockCode", "", "ecoDeviceFault", "code", "onModeSwitch", "isDynamicMode", "sport-eco-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ILockListener {
    void ecoDeviceFault(int code);

    void onLock(boolean isHasLock, int lockCode);

    void onModeSwitch(boolean isDynamicMode);
}
