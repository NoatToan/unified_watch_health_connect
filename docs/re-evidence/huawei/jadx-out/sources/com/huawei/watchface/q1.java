package com.huawei.watchface;

import android.content.Context;
import com.huawei.hihealth.listener.ResultCallback;
import com.huawei.hihealthkit.auth.HiHealthAuth;
import com.huawei.hihealthkit.auth.IAuthorizationListener;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.mvp.model.datatype.CommandJsonInfo;
import defpackage.krt;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes20.dex */
public abstract class q1 {
    public static void a(Context context, CommandJsonInfo commandJsonInfo, ResultCallback resultCallback) {
        if (Environment.sIsAarInTheme) {
            krt.e(context.getApplicationContext(), commandJsonInfo.toString(), resultCallback);
        } else {
            HwWatchFaceApi.getInstance(context).sendBluetoothCommand(commandJsonInfo.getServiceId(), commandJsonInfo.getCommandId(), ByteBuffer.wrap(i1.a(commandJsonInfo.getDeviceCommand())));
        }
    }

    public static void a(Context context, ResultCallback resultCallback) {
        krt.a(context.getApplicationContext(), resultCallback);
    }

    public static void a(Context context, IAuthorizationListener iAuthorizationListener) {
        HiHealthAuth.requestAuthorization(context.getApplicationContext(), new int[]{101204}, new int[]{101201}, iAuthorizationListener);
    }
}
