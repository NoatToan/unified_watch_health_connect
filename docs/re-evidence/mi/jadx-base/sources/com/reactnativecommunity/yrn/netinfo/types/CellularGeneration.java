package com.reactnativecommunity.yrn.netinfo.types;

import android.net.NetworkInfo;
import com.xiaomi.hm.health.baseutil.NetUtil;

/* JADX INFO: loaded from: classes6.dex */
public enum CellularGeneration {
    CG_2G(NetUtil.VALUE_NETWORK_TYPE_2G),
    CG_3G(NetUtil.VALUE_NETWORK_TYPE_3G),
    CG_4G(NetUtil.VALUE_NETWORK_TYPE_4G);

    public final String label;

    CellularGeneration(String str) {
        this.label = str;
    }

    public static CellularGeneration fromNetworkInfo(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return null;
        }
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return CG_2G;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
                return CG_3G;
            case 13:
            case 15:
                return CG_4G;
            default:
                return null;
        }
    }
}
