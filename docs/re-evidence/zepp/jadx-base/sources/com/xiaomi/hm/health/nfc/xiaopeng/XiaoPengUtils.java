package com.xiaomi.hm.health.nfc.xiaopeng;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.xiaopeng.repo.ActionToXiaoPengActivity;
import com.huami.xiaopeng.ui.amazfit.activity.CarHostActivity;
import com.xiaomi.hm.health.activity.StartUpActivity;
import com.xiaomi.hm.health.device.NfcDeviceConfigKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/nfc/xiaopeng/XiaoPengUtils;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "isSupportXiaoPeng", "Landroid/content/Intent;", "intent", "isXiaoPengIntent", "", "handleXiaoPengIntent", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class XiaoPengUtils {

    @NotNull
    public static final XiaoPengUtils INSTANCE = new XiaoPengUtils();

    private XiaoPengUtils() {
    }

    public final void handleXiaoPengIntent(@NotNull Context context, @NotNull Intent intent) {
        try {
            Uri data = intent.getData();
            String queryParameter = null;
            String queryParameter2 = data == null ? null : data.getQueryParameter("token");
            Uri data2 = intent.getData();
            String queryParameter3 = data2 == null ? null : data2.getQueryParameter("keyToken");
            Uri data3 = intent.getData();
            if (data3 != null) {
                queryParameter = data3.getQueryParameter("action");
            }
            CarHostActivity.INSTANCE.toCar(context, Intrinsics.areEqual("bigCard", queryParameter) ? ActionToXiaoPengActivity.BigCard : ActionToXiaoPengActivity.KeyCard, 0, queryParameter2, queryParameter3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final boolean isSupportXiaoPeng(@NotNull Context context) {
        if (DeviceManager.getManager(context).getCurrentDevice() != null) {
            return false;
        }
        return NfcDeviceConfigKt.hasFeatureXpCarDevice();
    }

    public final boolean isXiaoPengIntent(@Nullable Intent intent) {
        String scheme;
        String host;
        String path;
        if (intent != null) {
            try {
                if (intent.getData() != null) {
                    Uri data = intent.getData();
                    Boolean boolValueOf = null;
                    String scheme2 = data == null ? null : data.getScheme();
                    if (scheme2 == null || scheme2.length() == 0) {
                        return false;
                    }
                    Uri data2 = intent.getData();
                    String host2 = data2 == null ? null : data2.getHost();
                    if (host2 == null || host2.length() == 0) {
                        return false;
                    }
                    Uri data3 = intent.getData();
                    String path2 = data3 == null ? null : data3.getPath();
                    if (path2 == null || path2.length() == 0) {
                        return false;
                    }
                    Uri data4 = intent.getData();
                    if (!((data4 == null || (scheme = data4.getScheme()) == null) ? null : Boolean.valueOf(scheme.equals("amazfit"))).booleanValue()) {
                        return false;
                    }
                    Uri data5 = intent.getData();
                    if (!((data5 == null || (host = data5.getHost()) == null) ? null : Boolean.valueOf(host.equals(StartUpActivity.NFC_CARD_HOST))).booleanValue()) {
                        return false;
                    }
                    Uri data6 = intent.getData();
                    if (data6 != null && (path = data6.getPath()) != null) {
                        boolValueOf = Boolean.valueOf(m.endsWith$default(path, "create_car_card", false, 2, null));
                    }
                    return boolValueOf.booleanValue();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
