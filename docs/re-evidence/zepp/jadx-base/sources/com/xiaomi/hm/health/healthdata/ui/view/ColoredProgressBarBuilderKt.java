package com.xiaomi.hm.health.healthdata.ui.view;

import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.HMUserInfo;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0002¨\u0006\u0002"}, d2 = {"Lcom/xiaomi/hm/health/model/account/HMUserInfo;", "a", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class ColoredProgressBarBuilderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final HMUserInfo a() {
        return HMPersonInfo.getInstance().getUserInfo();
    }
}
