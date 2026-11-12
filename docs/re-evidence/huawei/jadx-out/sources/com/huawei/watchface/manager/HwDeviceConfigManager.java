package com.huawei.watchface.manager;

import android.content.Context;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.mvp.model.datatype.TransferFileReqType;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.callback.IAppTransferFileResultAIDLCallback;
import com.huawei.watchface.utils.callback.IBaseResponseCallback;
import com.huawei.watchface.utils.callback.IFileTransferStateCallback;
import com.huawei.watchface.utils.callback.IPhotoFileCallback;
import com.huawei.watchface.x1;
import com.huawei.watchface.y1;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class HwDeviceConfigManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f30325b = "HwDeviceConfigManager";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile HwDeviceConfigManager f30326c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f30327a;

    public HwDeviceConfigManager(Context context) {
        this.f30327a = context;
    }

    public static HwDeviceConfigManager getInstance(Context context) {
        if (f30326c == null) {
            synchronized (HwDeviceConfigManager.class) {
                if (f30326c == null) {
                    f30326c = new HwDeviceConfigManager(context.getApplicationContext());
                }
            }
        }
        return f30326c;
    }

    public void a(String str, int i, boolean z, IPhotoFileCallback iPhotoFileCallback) {
        HwLog.i(f30325b, "startRequestFile() enter.");
        if (Environment.sIsAarInTheme) {
            y1.a(this.f30327a).a(str, i, z, iPhotoFileCallback);
        } else {
            HwWatchFaceApi.getInstance(this.f30327a).startRequestFile(str, i, z, iPhotoFileCallback);
        }
    }

    public void registerPhotoAndVideoCallback(IAppTransferFileResultAIDLCallback iAppTransferFileResultAIDLCallback, List<Integer> list, TransferFileReqType transferFileReqType) {
        HwLog.i(f30325b, "registerPhotoAndVideoCallback() enter.");
        if (Environment.sIsAarInTheme) {
            x1.a(this.f30327a).a(iAppTransferFileResultAIDLCallback);
        } else {
            HwWatchFaceApi.getInstance(this.f30327a).registerPhotoAndVideoCallback(iAppTransferFileResultAIDLCallback, list, transferFileReqType);
        }
    }

    public void a(String str, int i, IBaseResponseCallback iBaseResponseCallback) {
        HwLog.i(f30325b, "commonStopTransfer() enter.");
        if (Environment.sIsAarInTheme) {
            x1.a(this.f30327a).a(str, i, iBaseResponseCallback);
        } else {
            HwWatchFaceApi.getInstance(this.f30327a).commonStopTransfer(str, i, iBaseResponseCallback);
        }
    }

    public void a(String str, String str2, int i, IFileTransferStateCallback iFileTransferStateCallback, IAppTransferFileResultAIDLCallback iAppTransferFileResultAIDLCallback) {
        HwLog.i(f30325b, "commonTransferFile() enter.");
        if (Environment.sIsAarInTheme) {
            x1.a(this.f30327a).a(str, str2, i, iFileTransferStateCallback);
        } else {
            HwWatchFaceApi.getInstance(this.f30327a).commonTransferFile(str, str2, i, iAppTransferFileResultAIDLCallback);
        }
    }
}
