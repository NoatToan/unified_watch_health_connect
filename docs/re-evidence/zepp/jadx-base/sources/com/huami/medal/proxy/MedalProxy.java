package com.huami.medal.proxy;

import com.huami.medal.proxy.adapter.MedalInfoAdapter;

/* JADX INFO: loaded from: classes10.dex */
public class MedalProxy {
    private static MedalInfoAdapter a;

    public static String getUserId() {
        MedalInfoAdapter medalInfoAdapter = a;
        return medalInfoAdapter != null ? medalInfoAdapter.getUserId() : "";
    }

    public static String getWebApiHost() {
        MedalInfoAdapter medalInfoAdapter = a;
        return medalInfoAdapter != null ? medalInfoAdapter.getWebApiHost() : "";
    }

    public static void setAdapter(MedalInfoAdapter medalInfoAdapter) {
        a = medalInfoAdapter;
    }
}
