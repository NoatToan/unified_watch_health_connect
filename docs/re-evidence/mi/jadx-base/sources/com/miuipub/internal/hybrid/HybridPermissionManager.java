package com.miuipub.internal.hybrid;

import android.net.Uri;
import android.text.TextUtils;
import com.xiaomi.onetrack.util.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes6.dex */
public class HybridPermissionManager {
    private Config mConfig;
    private Map<String, Boolean> mValidMap = new HashMap();

    public HybridPermissionManager(Config config) {
        this.mConfig = config;
    }

    private boolean initPermission(String str) {
        String host;
        boolean zEquals;
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        String host2 = "file".equals(scheme) ? Marker.ANY_MARKER : uri.getHost();
        Iterator<Map.Entry<String, Permission>> it = this.mConfig.getPermissions().entrySet().iterator();
        boolean zEquals2 = false;
        boolean z = false;
        while (it.hasNext()) {
            Permission value = it.next().getValue();
            String uri2 = value.getUri();
            if (Marker.ANY_MARKER.equals(uri2)) {
                host = Marker.ANY_MARKER;
                zEquals = true;
            } else {
                Uri uri3 = Uri.parse(uri2);
                host = uri3.getHost();
                zEquals = TextUtils.equals(uri3.getScheme(), scheme);
            }
            if (value.isApplySubDomain()) {
                String[] strArrSplit = host.split(z.f14007a);
                String[] strArrSplit2 = host2.split(z.f14007a);
                if (strArrSplit2.length >= strArrSplit.length) {
                    int i = 1;
                    while (true) {
                        if (i > strArrSplit.length) {
                            zEquals2 = true;
                            break;
                        }
                        if (!strArrSplit2[strArrSplit2.length - i].equals(strArrSplit[strArrSplit.length - i])) {
                            zEquals2 = false;
                            break;
                        }
                        i++;
                    }
                }
            } else {
                zEquals2 = host2.equals(host);
            }
            if (zEquals2 && zEquals) {
                z = zEquals;
                break;
            }
            z = zEquals;
        }
        return zEquals2 && z;
    }

    public boolean isValid(String str) {
        if (!this.mValidMap.containsKey(str)) {
            this.mValidMap.put(str, Boolean.valueOf(initPermission(str)));
        }
        return this.mValidMap.get(str).booleanValue();
    }
}
