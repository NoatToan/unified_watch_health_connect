package com.huami.assistant.util;

import com.huami.watch.util.Box;

/* JADX INFO: loaded from: classes5.dex */
public class AssistantBox {
    public static String getLastMergeEventInfo() {
        return Box.get().getString("last_merge_event_info", "");
    }

    public static void putLastMergeEventInfo(String info) {
        Box.get().put("last_merge_event_info", info);
    }
}
