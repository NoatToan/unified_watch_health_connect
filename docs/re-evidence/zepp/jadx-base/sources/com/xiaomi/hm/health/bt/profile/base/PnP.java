package com.xiaomi.hm.health.bt.profile.base;

import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes11.dex */
public class PnP {
    public static final int ID_HUAMI = 343;
    public static final int ID_MAZDA = 1;
    public static final int SOURCE_RESERVED = 0;
    public static final int SOURCE_SIG = 1;
    public static final int SOURCE_TOB = 255;
    public static final int SOURCE_USB = 2;
    public int vendorId = -1;
    public int vendorSource = -1;
    public int productId = -1;
    public int productVersion = -1;

    public String toString() {
        return "<vendorId:" + Integer.toHexString(this.vendorId) + ",productId:" + Integer.toHexString(this.productId) + ",productVersion:" + Integer.toHexString(this.productVersion) + ",vendorSource:" + Integer.toHexString(this.vendorSource) + SearchCriteria.GT;
    }
}
