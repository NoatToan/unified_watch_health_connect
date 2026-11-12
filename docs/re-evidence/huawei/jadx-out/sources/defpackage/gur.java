package defpackage;

import com.huawei.basefitnessadvice.callback.DeviceCallback;
import com.huawei.featureuserprofile.route.navigationparser.NavigationFileParser;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.health.basesport.wearengine.DeviceStateListener;
import com.huawei.health.basesport.wearengine.SportHiWearBusinessType;
import com.huawei.health.deviceconnect.callback.SendCallback;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public class gur implements DeviceStateListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f36058b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile gur f36059c;

    private gur() {
        dfb.a().registerDeviceStateListener(this);
    }

    public static gur d() {
        if (f36059c == null) {
            synchronized (f36058b) {
                LogUtil.a("Suggestion_RouteDeliverManager", "getInstance()");
                if (f36059c == null) {
                    f36059c = new gur();
                }
            }
        }
        return f36059c;
    }

    @Override // com.huawei.health.basesport.wearengine.DeviceStateListener
    public void onConnecting() {
        LogUtil.e("Suggestion_RouteDeliverManager", " onConnecting");
    }

    @Override // com.huawei.health.basesport.wearengine.DeviceStateListener
    public void onDisconnected() {
        LogUtil.e("Suggestion_RouteDeliverManager", " onDisconnected");
    }

    @Override // com.huawei.health.basesport.wearengine.DeviceStateListener
    public void onConnected() {
        LogUtil.e("Suggestion_RouteDeliverManager", " onConnected");
    }

    public void b(String str, final DeviceCallback deviceCallback) {
        LogUtil.a("Suggestion_RouteDeliverManager", "sendFileNameToDevice", str);
        try {
            int iE = dey.e();
            xiu xiuVarC = b(str, SportHiWearBusinessType.TRAJECTORY_HANDLE_SHAKE.getTypeValue(), iE).c();
            IBaseResponseCallback iBaseResponseCallback = new IBaseResponseCallback() { // from class: gus
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    gur.d(deviceCallback, i, obj);
                }
            };
            dfb.a().sendCommandToDevice("RouteCallBack", xiuVarC, new dff(dfb.a(), "Suggestion_RouteDeliverManager", SportHiWearBusinessType.TRAJECTORY_HANDLE_SHAKE.getTypeValue(), iE, iBaseResponseCallback), iBaseResponseCallback);
        } catch (yin unused) {
            LogUtil.e("Suggestion_RouteDeliverManager", "sendMessage WearEngineException");
        }
    }

    static /* synthetic */ void d(DeviceCallback deviceCallback, int i, Object obj) {
        ReleaseLogUtil.e("Suggestion_RouteDeliverManager", "RouteCallBack", " on response:", obj, " errorCode is:", Integer.valueOf(i));
        if (deviceCallback != null) {
            if (obj instanceof Integer) {
                deviceCallback.onSendResult(((Integer) obj).intValue());
            } else {
                deviceCallback.onSendResult(i);
            }
        }
    }

    public void a(String str, int i, IBaseResponseCallback iBaseResponseCallback) {
        int iE = dey.e();
        c("RouteCallBack", b(str, i, iE).c(), new dfc(dfb.a(), "Suggestion_RouteDeliverManager", i, iE, iBaseResponseCallback), iBaseResponseCallback, new DeviceCallback() { // from class: gur.5
            @Override // com.huawei.basefitnessadvice.callback.DeviceCallback
            public void onSendResult(int i2) {
                ReleaseLogUtil.d("Suggestion_RouteDeliverManager", "sendShakeHandToDevice onSendResult: ", Integer.valueOf(i2));
            }

            @Override // com.huawei.basefitnessadvice.callback.DeviceCallback
            public void onSendProgress(long j) {
                LogUtil.a("Suggestion_RouteDeliverManager", "sendShakeHandToDevice onSendProgress: ", Long.valueOf(j));
            }
        });
    }

    public void e(final byte[] bArr, final int i, final DeviceCallback deviceCallback) {
        LogUtil.a("Suggestion_RouteDeliverManager", "sendRouteDataToDevice");
        lsy.a(new Runnable() { // from class: gut
            @Override // java.lang.Runnable
            public final void run() {
                this.e.d(bArr, i, deviceCallback);
            }
        });
    }

    /* synthetic */ void d(byte[] bArr, int i, final DeviceCallback deviceCallback) {
        int iE = dey.e();
        xiu.c cVarB = b(NavigationFileParser.BIN_FILE_NAME, bArr, iE, i);
        if (cVarB == null) {
            ReleaseLogUtil.d("Suggestion_RouteDeliverManager", "builder=null");
            return;
        }
        IBaseResponseCallback iBaseResponseCallback = new IBaseResponseCallback() { // from class: guw
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i2, Object obj) {
                gur.e(deviceCallback, i2, obj);
            }
        };
        c("RouteCallBack", cVarB.c(), new dff(dfb.a(), "Suggestion_RouteDeliverManager", i, iE, iBaseResponseCallback), iBaseResponseCallback, deviceCallback);
    }

    static /* synthetic */ void e(DeviceCallback deviceCallback, int i, Object obj) {
        ReleaseLogUtil.d("Suggestion_RouteDeliverManager", "RouteCallBack", " on response with objData:", obj, " errorCode is :", Integer.valueOf(i));
        if (deviceCallback != null) {
            if (obj instanceof Integer) {
                deviceCallback.onSendResult(((Integer) obj).intValue());
            } else {
                deviceCallback.onSendResult(i);
            }
        }
    }

    public void c(final String str, final xiu xiuVar, final dff dffVar, final IBaseResponseCallback iBaseResponseCallback, final DeviceCallback deviceCallback) {
        if (dffVar != null) {
            dfb.a().registerCallback(dffVar, dffVar.e());
            LogUtil.a("Suggestion_RouteDeliverManager", "registerSendMsgDataReceiver");
        }
        dfb.a().sendCommandToDevice(xiuVar, new SendCallback() { // from class: gur.2
            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendResult(int i) {
                if (i == 500000 || i == 207) {
                    if (i == 207) {
                        ReleaseLogUtil.e("Suggestion_RouteDeliverManager", str, " send success, resultCode is ", Integer.valueOf(i));
                        c(i);
                        gur.this.c(xiuVar);
                        return;
                    }
                    LogUtil.a("Suggestion_RouteDeliverManager", str, " send called success, resultCode is ", Integer.valueOf(i));
                    return;
                }
                ReleaseLogUtil.a("Suggestion_RouteDeliverManager", str, " send failed, resultCode is  ", Integer.valueOf(i));
                gur.this.c(xiuVar);
                if (dffVar != null) {
                    dfb dfbVarA = dfb.a();
                    dff dffVar2 = dffVar;
                    dfbVarA.unregisterCallback(dffVar2, dffVar2.e());
                }
                iBaseResponseCallback.a(1, Integer.valueOf(i));
            }

            private void c(int i) {
                if (dffVar == null) {
                    iBaseResponseCallback.a(0, Integer.valueOf(i));
                }
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendProgress(long j) {
                DeviceCallback deviceCallback2 = deviceCallback;
                if (deviceCallback2 != null) {
                    deviceCallback2.onSendProgress(j);
                }
                LogUtil.a("Suggestion_RouteDeliverManager", str, " send progress is ", Long.valueOf(j));
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onFileTransferReport(String str2) {
                LogUtil.a("Suggestion_RouteDeliverManager", "sendCommandToDevice onFileTransferReport transferWay: ", str2);
            }
        });
    }

    private byte[] c(String str) {
        String strA = eeq.a(str);
        String str2 = eeq.d(5) + eeq.d(strA.length() / 2) + strA;
        LogUtil.a("Suggestion_RouteDeliverManager", str2);
        return eeq.c(str2);
    }

    private xiu.c b(String str, int i, int i2) {
        byte[] bArrC = c(str);
        dey.c cVar = new dey.c();
        cVar.d(i).e(i2).b(1).c(bArrC.length);
        dey deyVarA = cVar.a();
        LogUtil.a("Suggestion_RouteDeliverManager", deyVarA.toString());
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(deyVarA.h());
        byteBufferAllocate.put(deyVarA.b());
        byteBufferAllocate.put(bArrC);
        byteBufferAllocate.flip();
        xiu.c cVar2 = new xiu.c();
        cVar2.a(byteBufferAllocate.array());
        return cVar2;
    }

    private xiu.c b(String str, byte[] bArr, int i, int i2) {
        dey.c cVar = new dey.c();
        cVar.d(i2).e(i).b(1).c(bArr.length);
        if (a(str, cVar.a().b(), bArr)) {
            xiu.c cVar2 = new xiu.c();
            cVar2.a(new File(d(str)));
            return cVar2;
        }
        LogUtil.e("Suggestion_RouteDeliverManager", "getWorkoutMsgBuilder write data to file error");
        return null;
    }

    private String d(String str) {
        return BaseApplication.getContext().getFilesDir() + File.separator + str;
    }

    private boolean a(String str, byte[] bArr, byte[] bArr2) {
        FileOutputStream fileOutputStreamOpenFileOutput = null;
        try {
            fileOutputStreamOpenFileOutput = BaseApplication.getContext().openFileOutput(str, 0);
            fileOutputStreamOpenFileOutput.write(bArr);
            fileOutputStreamOpenFileOutput.write(bArr2);
            return true;
        } catch (IOException unused) {
            LogUtil.e("Suggestion_RouteDeliverManager", "IOException  failed");
            return false;
        } catch (FileNotFoundException unused2) {
            LogUtil.e("Suggestion_RouteDeliverManager", "FileNotFoundException  failed");
            return false;
        } finally {
            if (fileOutputStreamOpenFileOutput != null) {
                try {
                    fileOutputStreamOpenFileOutput.close();
                } catch (IOException unused3) {
                    LogUtil.e("Suggestion_RouteDeliverManager", "writefile finally  failed IOException");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(xiu xiuVar) {
        if (xiuVar != null && xiuVar.c() == 2) {
            FileUtils.j(xiuVar.e());
        } else {
            LogUtil.a("Suggestion_RouteDeliverManager", " releaseMsgResource failed  with null message.");
        }
    }
}
