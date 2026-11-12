package com.xiaomi.hm.health.keeper;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/keeper/EarbudSyncedStatusHelper;", "Lcom/xiaomi/hm/health/keeper/SyncedStatusHelper;", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class EarbudSyncedStatusHelper extends SyncedStatusHelper {
    public EarbudSyncedStatusHelper() {
        super("net_earbud_data_state", "earbud_month_start_sync_with_origin_datas");
    }
}
