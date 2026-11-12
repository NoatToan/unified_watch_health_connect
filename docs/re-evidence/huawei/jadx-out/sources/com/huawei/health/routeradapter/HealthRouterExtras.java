package com.huawei.health.routeradapter;

import android.content.Context;
import com.huawei.haf.router.facade.service.ExtrasFormatService;
import defpackage.ddx;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class HealthRouterExtras implements ExtrasFormatService {
    public static boolean a(int i) {
        return (i & 4) == 4;
    }

    public static boolean c(int i) {
        return (i & 2) == 2;
    }

    public static boolean d(int i) {
        return (i & 3) == 3;
    }

    public static boolean e(int i) {
        return (i & 1) == 1;
    }

    @Override // com.huawei.haf.router.facade.template.ServiceProvider
    public void init(Context context) {
    }

    public static List<String> d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ddx.e);
        arrayList.add("com.huawei.health.h5.ai-weight");
        return arrayList;
    }

    @Override // com.huawei.haf.router.facade.service.ExtrasFormatService
    public String formatCustomString(int i) {
        StringBuilder sb = new StringBuilder(32);
        if (e(i)) {
            b(sb, "SPORT_TRACK_INIT");
        }
        if (c(i)) {
            b(sb, "CHECK_SYSTEM_VERSION");
        }
        if (d(i)) {
            b(sb, "SYNC_ALL_DEVICE_DATA");
        }
        if (a(i)) {
            b(sb, "CHECK_CONNECTED_WEAR_DEVICE");
        }
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    @Override // com.huawei.haf.router.facade.service.ExtrasFormatService
    public int fromExtrasString(String str) {
        byte b2;
        str.hashCode();
        switch (str) {
            case "CHECK_SYSTEM_VERSION":
                b2 = 0;
                break;
            case "CHECK_CONNECTED_WEAR_DEVICE":
                b2 = 1;
                break;
            case "SYNC_ALL_DEVICE_DATA":
                b2 = 2;
                break;
            case "SPORT_TRACK_INIT":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            return 2;
        }
        if (b2 == 1) {
            return 4;
        }
        if (b2 != 2) {
            return b2 != 3 ? 0 : 1;
        }
        return 3;
    }

    private static void b(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('|');
        }
        sb.append(str);
    }
}
