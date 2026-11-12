package com.ximalaya.ting.android.opensdk.util;

import android.content.Context;
import com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest;
import com.ximalaya.ting.android.opensdk.player.service.XmPlayerService;

/* JADX INFO: loaded from: classes22.dex */
public class Utils {
    public static Context getContext() {
        return XmPlayerService.getPlayerSrvice() != null ? XmPlayerService.getPlayerSrvice() : CommonRequest.getInstanse().getContext();
    }
}
