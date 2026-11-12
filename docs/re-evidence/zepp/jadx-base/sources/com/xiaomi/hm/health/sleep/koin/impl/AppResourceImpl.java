package com.xiaomi.hm.health.sleep.koin.impl;

import com.huami.snore.core.ext.IAppResource;
import com.huami.watch.hmwatchmanager.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/sleep/koin/impl/AppResourceImpl;", "Lcom/huami/snore/core/ext/IAppResource;", "", "getAppNotificationIcon", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AppResourceImpl implements IAppResource {
    @Override // com.huami.snore.core.ext.IAppResource
    public int getAppNotificationIcon() {
        return R.drawable.mipush_notification;
    }
}
