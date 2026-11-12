package com.xiaomi.fitness.userinfo.medicalid.util;

import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"}, d2 = {"isChinaChannelAndInland", "", "user-info_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChannelAndRegionExtKt {
    public static final boolean isChinaChannelAndInland() {
        return !AppUtil.INSTANCE.isPlayChannel() && RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE));
    }
}
