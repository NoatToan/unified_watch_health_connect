package com.xiaomi.ai.domain.mobileapp.local;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class LocalAppSwitch {
    private static Set<String> localAppBlackWords = new HashSet(Arrays.asList("吃鸡", "荒野", "我的世界"));

    public boolean isUseLocalApp(String str) {
        return localAppBlackWords.contains(str);
    }
}
