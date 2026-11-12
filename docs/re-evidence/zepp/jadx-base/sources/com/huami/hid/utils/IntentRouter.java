package com.huami.hid.utils;

import android.content.Context;
import android.content.Intent;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/hid/utils/IntentRouter;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "openBluetoothSetting", "<init>", "()V", "hid_release"}, k = 1, mv = {1, 5, 1})
public final class IntentRouter {

    @NotNull
    public static final IntentRouter INSTANCE = new IntentRouter();

    private IntentRouter() {
    }

    public final void openBluetoothSetting(@NotNull Context context) {
        Intent intent = new Intent("android.settings.BLUETOOTH_SETTINGS");
        intent.setFlags(268435456);
        context.startActivity(intent);
    }
}
