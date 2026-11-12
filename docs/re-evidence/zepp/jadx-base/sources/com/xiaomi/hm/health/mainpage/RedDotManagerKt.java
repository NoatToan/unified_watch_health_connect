package com.xiaomi.hm.health.mainpage;

import com.huami.module.homepage.utils.HomeUtils;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0002"}, d2 = {"", "isMainlandUser", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class RedDotManagerKt {
    public static final boolean isMainlandUser() {
        return HomeUtils.isSimplifiedChineseUser();
    }
}
