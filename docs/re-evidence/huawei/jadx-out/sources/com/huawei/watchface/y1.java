package com.huawei.watchface;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.hihealth.listener.ResultCallback;
import com.huawei.secure.android.common.intent.SafeBroadcastReceiver;
import com.huawei.secure.android.common.util.SafeString;
import com.huawei.skinner.internal.OnRegisterSkinAttrsListener;
import com.huawei.watchface.mvp.model.datatype.CommandJsonInfo;
import com.huawei.watchface.mvp.model.datatype.CommonFileInfo;
import com.huawei.watchface.mvp.model.datatype.CommonFileRetryInfo;
import com.huawei.watchface.mvp.model.datatype.DeviceInfo;
import com.huawei.watchface.mvp.model.datatype.FileTransferParameter;
import com.huawei.watchface.mvp.model.datatype.Tlv;
import com.huawei.watchface.mvp.model.datatype.TlvException;
import com.huawei.watchface.mvp.model.datatype.TlvUtils;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.FileHelper;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.IntegerUtils;
import com.huawei.watchface.utils.callback.IBaseCommonCallback;
import com.huawei.watchface.utils.callback.IPhotoFileCallback;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class y1 {
    public static final String k = "y1";
    public static volatile y1 l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HandlerThread f30667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f30668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ResultCallback f30669c;
    public Context h;
    public BroadcastReceiver j;
    public ConcurrentHashMap d = new ConcurrentHashMap(20);
    public CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public ConcurrentHashMap f = new ConcurrentHashMap(20);
    public TlvUtils g = new TlvUtils();
    public ConcurrentHashMap i = new ConcurrentHashMap(20);

    public static class a extends SafeBroadcastReceiver {
        @Override // com.huawei.secure.android.common.intent.SafeBroadcastReceiver
        public void onReceiveMsg(Context context, Intent intent) {
            if (context == null) {
                return;
            }
            if (intent == null || intent.getExtras() == null || TextUtils.isEmpty(intent.getAction())) {
                HwLog.w(y1.k, "CommonFileRequestBroadCastReceiver() intent is null.");
                return;
            }
            if ("com.huawei.watchface.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                DeviceInfo deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo");
                if (deviceInfo == null) {
                    HwLog.w(y1.k, "CommonFileRequestBroadCastReceiver() deviceInfo null");
                    return;
                }
                HwLog.i(y1.k, "CommonFileRequestBroadCastReceiver() status:" + deviceInfo.getDeviceConnectState());
                y1.a(deviceInfo);
            }
        }
    }

    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.arg1;
            if (i == 100) {
                String str = y1.k;
                HwLog.i(str, "handleMessage() wait timeout!");
                int i2 = message.what;
                HwLog.i(str, "handleMessage() wait timeout! file id:" + i2);
                y1 y1Var = y1.this;
                y1Var.e((CommonFileInfo) y1Var.d.get(Integer.valueOf(i2)));
                y1.this.b(i2, OnRegisterSkinAttrsListener.REGISTER_BY_SCAN);
                y1 y1Var2 = y1.this;
                y1Var2.b((CommonFileInfo) y1Var2.d.get(Integer.valueOf(i2)));
                y1.this.b(i2);
                return;
            }
            if (i != 200) {
                if (i != 500) {
                    HwLog.i(y1.k, "handleMessage() default");
                    return;
                } else {
                    HwLog.i(y1.k, "handleMessage() kit NO_MANAGER_CALLBACK");
                    y1.this.c(message.what);
                    return;
                }
            }
            String str2 = y1.k;
            HwLog.i(str2, "handleMessage() retry");
            int i3 = message.what;
            int i4 = message.arg2;
            HwLog.i(str2, "handleMessage() retry! file id:" + i3 + ", offset:" + i4);
            y1.this.a(i3, i4, true);
        }
    }

    public y1(Context context) {
        this.h = context;
        HandlerThread handlerThread = new HandlerThread(k);
        this.f30667a = handlerThread;
        handlerThread.start();
        this.f30668b = new b(this.f30667a.getLooper());
        this.j = new a();
        CommonUtils.a(this.j, new IntentFilter("com.huawei.watchface.action.CONNECTION_STATE_CHANGED"));
    }

    public static void b() {
        synchronized (y1.class) {
            HwLog.i(k, "destroyInstance() enter.");
            l = null;
        }
    }

    public void a(ResultCallback resultCallback) {
        this.f30669c = resultCallback;
    }

    public final void c() {
        this.e.clear();
    }

    public void d(byte[] bArr) {
        if (bArr == null || bArr.length <= 1) {
            return;
        }
        String str = k;
        HwLog.i(str, "handleGeneralFileCallbackResult() message: " + i1.a(bArr));
        byte b2 = bArr[1];
        if (b2 == 1) {
            e(bArr);
            return;
        }
        if (b2 == 2) {
            f(bArr);
            return;
        }
        if (b2 == 3) {
            a(bArr);
            return;
        }
        if (b2 == 5) {
            b(bArr);
        } else if (b2 != 6) {
            HwLog.i(str, "handleGeneralFileCallbackResult() default");
        } else {
            c(bArr);
        }
    }

    public final void e() {
        String str = k;
        HwLog.i(str, "removeKit() size:" + this.e.size());
        if (this.e.size() <= 0 || ((CommonFileInfo) this.e.get(0)).getKitCallback() == null) {
            return;
        }
        HwLog.i(str, "removeKit() kit callback");
        this.e.remove(0);
        g();
    }

    public final void f() {
        for (Map.Entry entry : this.d.entrySet()) {
            HwLog.i(k, "reportFailedForDisconnect() fileId: " + entry.getKey());
            a(entry);
            if (((CommonFileInfo) entry.getValue()).getFileRequestCallBack() != null) {
                ((CommonFileInfo) entry.getValue()).getFileRequestCallBack().onFailure(30004, "");
            }
            b((CommonFileInfo) entry.getValue());
        }
    }

    public final void g() {
        if (this.e.size() <= 0) {
            HwLog.i(k, "requestNextTask() task is empty.");
            return;
        }
        HwLog.i(k, "requestNextTask() request next task");
        CommonFileInfo commonFileInfo = (CommonFileInfo) this.e.get(0);
        a(commonFileInfo.getFileName(), commonFileInfo.getFileType(), commonFileInfo.getStartTime(), commonFileInfo.getEndTime());
    }

    public void a() {
        BroadcastReceiver broadcastReceiver = this.j;
        if (broadcastReceiver != null) {
            CommonUtils.a(broadcastReceiver);
        }
        b();
    }

    public final boolean c(CommonFileInfo commonFileInfo) {
        boolean z = false;
        for (CommonFileInfo commonFileInfo2 : this.e) {
            if (TextUtils.equals(commonFileInfo.getFileName(), commonFileInfo2.getFileName()) && commonFileInfo.getFileType() == commonFileInfo2.getFileType()) {
                z = true;
            }
        }
        return z;
    }

    public final void b(int i, int i2, boolean z) {
        CommonFileRetryInfo commonFileRetryInfo = (CommonFileRetryInfo) this.f.get(Integer.valueOf(i));
        if (commonFileRetryInfo == null) {
            HwLog.w(k, "setRetryInfo() info is null.");
            return;
        }
        commonFileRetryInfo.setLastOffset(i2);
        if (z) {
            commonFileRetryInfo.setToKitNumber(-1);
        }
        this.f.put(Integer.valueOf(i), commonFileRetryInfo);
    }

    public final void c(int i, int i2) {
        CommonFileInfo commonFileInfo = (CommonFileInfo) this.d.get(Integer.valueOf(i));
        if (commonFileInfo == null) {
            HwLog.w(k, "reportProgressForUi commonFileInfo is null");
        } else if (commonFileInfo.getFileRequestCallBack() != null) {
            commonFileInfo.getFileRequestCallBack().onProgress(i2, "");
        }
    }

    public static y1 a(Context context) {
        if (l == null) {
            synchronized (y1.class) {
                if (l == null) {
                    l = new y1(context.getApplicationContext());
                }
            }
        }
        return l;
    }

    public final void e(int i) {
        if (this.f30668b == null) {
            HandlerThread handlerThread = new HandlerThread(k);
            this.f30667a = handlerThread;
            handlerThread.start();
            this.f30668b = new b(this.f30667a.getLooper());
        }
        Message messageObtain = Message.obtain();
        messageObtain.arg1 = 500;
        messageObtain.what = i;
        this.f30668b.sendMessageDelayed(messageObtain, 35000L);
    }

    public final void f(byte[] bArr) {
        String strA = i1.a(bArr);
        String str = k;
        HwLog.i(str, "handleRequestHash() info: " + strA);
        try {
            List<Tlv> tlvList = this.g.builderTlvList(SafeString.substring(strA, CommonUtils.l())).getTlvList();
            if (tlvList != null && tlvList.size() > 0) {
                int iB = 0;
                String str2 = "";
                for (Tlv tlv : tlvList) {
                    int iB2 = IntegerUtils.b(tlv.getTag(), 16);
                    String value = tlv.getValue();
                    if (iB2 == 1) {
                        iB = IntegerUtils.b(value, 16);
                        HwLog.i(k, "handleRequestHash() file id:" + iB);
                    } else if (iB2 != 3) {
                        HwLog.i(k, "handleRequestHash() default");
                    } else {
                        str2 = value;
                    }
                }
                a(iB, str2);
                return;
            }
            HwLog.w(str, "handleRequestHash() tlv list error");
        } catch (TlvException unused) {
            HwLog.e(k, "handleRequestHash() error");
        }
    }

    public final void g(int i) {
        HwLog.i(k, "startRequest() fileId:" + i);
        CommonFileInfo commonFileInfo = (CommonFileInfo) this.d.get(Integer.valueOf(i));
        commonFileInfo.setByteAll(ByteBuffer.allocate(commonFileInfo.getFileSize()));
        a(i, 0, false);
    }

    public final void c(byte[] bArr) {
        String strA = i1.a(bArr);
        String str = k;
        HwLog.i(str, "handleDeviceStatusReport() info: " + i1.a(bArr));
        try {
            List<Tlv> tlvList = this.g.builderTlvList(SafeString.substring(strA, CommonUtils.l())).getTlvList();
            if (tlvList != null && tlvList.size() > 0) {
                int iB = 0;
                int iB2 = 0;
                for (Tlv tlv : tlvList) {
                    int iB3 = IntegerUtils.b(tlv.getTag(), 16);
                    String value = tlv.getValue();
                    if (iB3 == 1) {
                        iB = IntegerUtils.b(value, 16);
                        HwLog.i(k, "handleDeviceStatusReport() file_id:" + iB);
                    } else if (iB3 != 127) {
                        HwLog.i(k, "handleDeviceStatusReport() default");
                    } else {
                        iB2 = IntegerUtils.b(value, 16);
                        HwLog.i(k, "handleDeviceStatusReport() status:" + iB2);
                    }
                }
                a(iB, iB2);
                return;
            }
            HwLog.w(str, "handleDeviceStatusReport() tlv list error");
        } catch (TlvException unused) {
            HwLog.e(k, "handleDeviceStatusReport() error");
        }
    }

    public void a(String str, int i, boolean z, IPhotoFileCallback iPhotoFileCallback) {
        CommonFileInfo commonFileInfo = new CommonFileInfo();
        commonFileInfo.setFileName(str);
        commonFileInfo.setFileType(i);
        commonFileInfo.setNeedVerify(z);
        commonFileInfo.setFileRequestCallBack(iPhotoFileCallback);
        if (!c(commonFileInfo)) {
            this.e.add(commonFileInfo);
        }
        a(str, i);
    }

    public final void b(byte[] bArr) throws Throwable {
        String strA = i1.a(bArr);
        String str = k;
        HwLog.i(str, "handleDeviceDataReceived() info: " + strA);
        String strSubstring = SafeString.substring(strA, CommonUtils.l());
        int iB = IntegerUtils.b(SafeString.substring(strSubstring, 0, 2), 16);
        int iB2 = IntegerUtils.b(SafeString.substring(strSubstring, 2, 10), 16);
        int iB3 = IntegerUtils.b(SafeString.substring(strSubstring, 10, 12), 16);
        HwLog.i(str, "handleDeviceDataReceived() fileID:" + iB + ", offset:" + iB2 + ", psn:" + iB3);
        CommonFileInfo commonFileInfo = (CommonFileInfo) this.d.get(Integer.valueOf(iB));
        if (commonFileInfo != null) {
            if (commonFileInfo.getFileOffset() == iB2 && commonFileInfo.getFilePsn() == iB3) {
                a(strSubstring, iB, iB3, commonFileInfo);
                int fileSize = (iB2 * 100) / commonFileInfo.getFileSize();
                HwLog.i(str, "handleDeviceDataReceived() progress:" + fileSize);
                c(iB, fileSize);
                return;
            }
            HwLog.i(str, "handleDeviceDataReceived() fileOffset or psn error");
            return;
        }
        HwLog.w(str, "handleDeviceDataReceived() fileID error");
    }

    public final void e(byte[] bArr) {
        d();
        String strA = i1.a(bArr);
        HwLog.i(k, "handleRequestCommand() info: " + strA);
        a(SafeString.substring(strA, CommonUtils.l()));
    }

    public final void e(int i, int i2) {
        String str = CommonUtils.d() + (i1.b(1) + i1.b(1) + i1.b(i)) + (i1.b(2) + i1.b(1) + i1.b(i2));
        CommandJsonInfo commandJsonInfo = new CommandJsonInfo();
        commandJsonInfo.setServiceId(44);
        commandJsonInfo.setCommandId(6);
        commandJsonInfo.setCommandType(800);
        commandJsonInfo.setDeviceCommand(str);
        HwLog.i(k, "sendRequestCommand() commandJsonInfo: " + commandJsonInfo.toString());
        q1.a(this.h, commandJsonInfo, this.f30669c);
    }

    public final void a(String str, int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder(32);
        if (!TextUtils.isEmpty(str)) {
            String strC = i1.c(str);
            sb.append(i1.b(1) + i1.b(strC.length() / 2) + strC);
        } else {
            HwLog.i(k, "sendFileInfo() file name is empty.");
        }
        sb.append(i1.b(2) + i1.b(1) + i1.b(i));
        if (i2 != -1 && i3 != -1) {
            sb.append(i1.b(5));
            sb.append(i1.b(4));
            sb.append(i1.a(i2));
            sb.append(i1.b(6));
            sb.append(i1.b(4));
            sb.append(i1.a(i3));
        } else {
            HwLog.i(k, "sendFileInfo() startTime or endTime is -1, startTime:" + i2 + ", end time:" + i3);
        }
        String str2 = CommonUtils.d() + sb.toString();
        CommandJsonInfo commandJsonInfo = new CommandJsonInfo();
        commandJsonInfo.setServiceId(44);
        commandJsonInfo.setCommandId(1);
        commandJsonInfo.setCommandType(800);
        commandJsonInfo.setDeviceCommand(str2);
        HwLog.i(k, "sendFileInfo() commandJsonInfo: " + commandJsonInfo.toString());
        q1.a(this.h, commandJsonInfo, this.f30669c);
        d(i);
        e(i);
    }

    public final void d(int i) {
        this.f.put(Integer.valueOf(i), new CommonFileRetryInfo());
    }

    public final void d() {
        HwLog.i(k, "removeFileInfoTimeout() enter.");
        if (this.e.size() > 0) {
            b(((CommonFileInfo) this.e.get(0)).getFileType());
        }
    }

    public final void d(int i, int i2) {
        String str = CommonUtils.d() + (i1.b(1) + i1.b(1) + i1.b(i)) + (i1.b(2) + i1.b(1) + i1.b(i2));
        CommandJsonInfo commandJsonInfo = new CommandJsonInfo();
        commandJsonInfo.setServiceId(44);
        commandJsonInfo.setCommandId(2);
        commandJsonInfo.setCommandType(800);
        commandJsonInfo.setDeviceCommand(str);
        HwLog.i(k, "sendFileCheck() commandJsonInfo: " + commandJsonInfo.toString());
        q1.a(this.h, commandJsonInfo, this.f30669c);
    }

    public final void e(CommonFileInfo commonFileInfo) {
        HwLog.i(k, "toKitFileTimeout() enter");
        b(commonFileInfo, OnRegisterSkinAttrsListener.REGISTER_BY_SCAN);
    }

    public final void d(CommonFileInfo commonFileInfo) {
        HwLog.i(k, "toKitCheckFailure() enter.");
        a(commonFileInfo, 30001);
    }

    public final void f(int i) {
        String str = CommonUtils.d() + (i1.b(1) + i1.b(1) + i1.b(i)) + (i1.b(2) + i1.b(0)) + (i1.b(3) + i1.b(0)) + (i1.b(4) + i1.b(0)) + (i1.b(5) + i1.b(0));
        CommandJsonInfo commandJsonInfo = new CommandJsonInfo();
        commandJsonInfo.setServiceId(44);
        commandJsonInfo.setCommandId(3);
        commandJsonInfo.setCommandType(800);
        commandJsonInfo.setDeviceCommand(str);
        HwLog.i(k, "sendFileHashResult() commandJsonInfo: " + commandJsonInfo.toString());
        q1.a(this.h, commandJsonInfo, this.f30669c);
    }

    public final void b(int i) {
        b bVar = this.f30668b;
        if (bVar == null || !bVar.hasMessages(i)) {
            return;
        }
        this.f30668b.removeMessages(i);
    }

    public final void b(int i, int i2, int i3) {
        if (this.f30668b != null) {
            if (i3 != 0) {
                Message messageObtain = Message.obtain();
                messageObtain.what = i;
                messageObtain.arg1 = 200;
                messageObtain.arg2 = i2;
                this.f30668b.sendMessageDelayed(messageObtain, ((long) i3) * 1000);
                return;
            }
            return;
        }
        HandlerThread handlerThread = new HandlerThread(k);
        this.f30667a = handlerThread;
        handlerThread.start();
        this.f30668b = new b(this.f30667a.getLooper());
        if (i3 != 0) {
            Message messageObtain2 = Message.obtain();
            messageObtain2.what = i;
            messageObtain2.arg1 = 200;
            messageObtain2.arg2 = i2;
            this.f30668b.sendMessageDelayed(messageObtain2, ((long) i3) * 1000);
        }
    }

    public final void c(int i) {
        CommonFileInfo commonFileInfo;
        Iterator it = this.e.iterator();
        do {
            if (!it.hasNext()) {
                commonFileInfo = null;
                break;
            }
            commonFileInfo = (CommonFileInfo) it.next();
        } while (commonFileInfo.getFileType() != i);
        if (commonFileInfo != null) {
            a(commonFileInfo, 100009);
            if (this.e.size() > 0) {
                this.e.remove(0);
                g();
                return;
            }
            return;
        }
        HwLog.w(k, "reportFileInfoTimeout() is null");
    }

    public final void a(String str, int i) {
        String strC = i1.c(str);
        String str2 = CommonUtils.d() + (i1.b(1) + i1.b(strC.length() / 2) + strC) + (i1.b(2) + i1.b(1) + i1.b(i));
        CommandJsonInfo commandJsonInfo = new CommandJsonInfo();
        commandJsonInfo.setServiceId(44);
        commandJsonInfo.setCommandId(1);
        commandJsonInfo.setCommandType(800);
        commandJsonInfo.setDeviceCommand(str2);
        HwLog.i(k, "sendFileInfo() commandJsonInfo: " + commandJsonInfo.toString());
        q1.a(this.h, commandJsonInfo, this.f30669c);
        d(i);
    }

    public final void f(int i, int i2) {
        if (this.f30668b != null) {
            if (i2 != 0) {
                Message messageObtain = Message.obtain();
                messageObtain.what = i;
                messageObtain.arg1 = 100;
                this.f30668b.sendMessageDelayed(messageObtain, ((long) i2) * 1000);
                return;
            }
            return;
        }
        HandlerThread handlerThread = new HandlerThread(k);
        this.f30667a = handlerThread;
        handlerThread.start();
        this.f30668b = new b(this.f30667a.getLooper());
        if (i2 != 0) {
            Message messageObtain2 = Message.obtain();
            messageObtain2.what = i;
            messageObtain2.arg1 = 100;
            this.f30668b.sendMessageDelayed(messageObtain2, ((long) i2) * 1000);
        }
    }

    public final void a(String str) {
        int i;
        int iB;
        int iB2;
        int i2;
        int i3;
        int i4;
        int i5;
        String str2;
        String strB = null;
        int iB3 = 0;
        try {
            List<Tlv> tlvList = this.g.builderTlvList(str).getTlvList();
            if (tlvList != null && tlvList.size() > 0) {
                iB = 0;
                iB2 = 0;
                int iB4 = 0;
                for (Tlv tlv : tlvList) {
                    try {
                        int iB5 = IntegerUtils.b(tlv.getTag(), 16);
                        String value = tlv.getValue();
                        if (iB5 == 127) {
                            iB4 = IntegerUtils.b(value, 16);
                            HwLog.i(k, "handleRequestTlv() error code:" + iB4);
                        } else if (iB5 == 1) {
                            strB = i1.b(value);
                            HwLog.i(k, "handleRequestTlv() file_name:" + strB);
                        } else if (iB5 == 2) {
                            iB3 = IntegerUtils.b(value, 16);
                            HwLog.i(k, "handleRequestTlv() file_type:" + iB3);
                        } else if (iB5 == 3) {
                            iB = IntegerUtils.b(value, 16);
                            HwLog.i(k, "handleRequestTlv() file_id:" + iB);
                        } else if (iB5 != 4) {
                            HwLog.i(k, "handleRequestTlv() default");
                        } else {
                            iB2 = IntegerUtils.b(value, 16);
                            HwLog.i(k, "handleRequestTlv() file_size:" + iB2);
                        }
                    } catch (TlvException unused) {
                        i = iB3;
                        iB3 = iB4;
                        HwLog.e(k, "handleRequestTlv() error");
                        iB4 = iB3;
                    }
                }
                i = iB3;
                i5 = i;
                str2 = strB;
                i3 = iB2;
                i4 = iB;
                i2 = iB4;
            } else {
                HwLog.w(k, "handleRequestTlv() tlv list error");
                str2 = null;
                i5 = 0;
                i4 = 0;
                i3 = 0;
                i2 = 0;
            }
        } catch (TlvException unused2) {
            i = 0;
            iB = 0;
            iB2 = 0;
        }
        a(str2, i5, i4, i3, i2);
    }

    public final void b(CommonFileInfo commonFileInfo) {
        if (commonFileInfo == null) {
            HwLog.w(k, "handleRequestEnd() error, file info is null");
            return;
        }
        for (int i = 0; i < this.e.size(); i++) {
            CommonFileInfo commonFileInfo2 = (CommonFileInfo) this.e.get(i);
            String str = k;
            HwLog.i(str, "handleRequestEnd() has cache file name:" + commonFileInfo2.getFileName() + ", type:" + commonFileInfo2.getFileType());
            if ((TextUtils.equals(commonFileInfo2.getFileName(), commonFileInfo.getFileName()) || TextUtils.isEmpty(commonFileInfo2.getFileName())) && commonFileInfo2.getFileType() == commonFileInfo.getFileType()) {
                HwLog.i(str, "handleRequestEnd() delete commonFileInfo.name:" + commonFileInfo2.getFileName());
                this.e.remove(commonFileInfo2);
                g();
                break;
            }
        }
        if (this.d.get(Integer.valueOf(commonFileInfo.getFileId())) != null) {
            HwLog.i(k, "handleRequestEnd() has mTransferringFileList file id:" + commonFileInfo.getFileId());
            this.d.remove(Integer.valueOf(commonFileInfo.getFileId()));
        }
        if (this.i.get(Integer.valueOf(commonFileInfo.getFileId())) != null) {
            HwLog.i(k, "handleRequestEnd() has mFileTypeTransferInfos file id:" + commonFileInfo.getFileId());
            this.i.remove(Integer.valueOf(commonFileInfo.getFileId()));
        }
    }

    public final void b(int i, int i2) {
        CommonFileInfo commonFileInfo = (CommonFileInfo) this.d.get(Integer.valueOf(i));
        if (commonFileInfo == null) {
            HwLog.w(k, "reportFailedForUi() commonFileInfo is null");
            return;
        }
        if (commonFileInfo.getFileRequestCallBack() != null) {
            commonFileInfo.getFileRequestCallBack().onFailure(i2, "");
            HwLog.i(k, "reportFailedForUi() fileId:" + i + "errorCode:" + i2);
        }
    }

    public final void b(CommonFileInfo commonFileInfo, int i) {
        HwLog.i(k, "toKitFileMessageErrorCode() enter.");
        a(commonFileInfo, i);
        if (this.e.size() <= 0 || i == 30003) {
            return;
        }
        this.e.remove(0);
        g();
    }

    public final void a(String str, int i, int i2, int i3, int i4) {
        CommonFileInfo commonFileInfo = new CommonFileInfo();
        for (CommonFileInfo commonFileInfo2 : this.e) {
            String str2 = k;
            HwLog.i(str2, "handleRequestFunc() has cache file name:" + commonFileInfo2.getFileName() + ", cache type:" + commonFileInfo2.getFileType() + ", file id:" + i2 + ", file type:" + i + ", file name:" + str + ", need verify:" + commonFileInfo2.isNeedVerify());
            if (a(commonFileInfo2.getFileName(), str) && (commonFileInfo2.getFileType() == i || i == 0)) {
                commonFileInfo.setFileSize(i3);
                commonFileInfo.setFileRequestCallBack(commonFileInfo2.getFileRequestCallBack());
                commonFileInfo.setKitCallback(commonFileInfo2.getKitCallback());
                commonFileInfo.setFileName(str);
                commonFileInfo.setFileType(i);
                commonFileInfo.setNeedVerify(commonFileInfo2.isNeedVerify());
                HwLog.i(str2, "handleRequestFunc() commonFileInfo.name:" + commonFileInfo.getFileName());
                break;
            }
            if (str == null && commonFileInfo2.getFileName() == null && i4 != 100000) {
                commonFileInfo.setKitCallback(commonFileInfo2.getKitCallback());
            }
        }
        if (i4 != 100000) {
            b(commonFileInfo, i4);
            if (commonFileInfo.getFileCallBack() != null) {
                commonFileInfo.getFileRequestCallBack().onFailure(i4, "");
                HwLog.i(k, "handleRequestFunc() errorCode:" + i4);
                b(commonFileInfo);
                return;
            }
            HwLog.i(k, "handleRequestFunc() file callback is null");
            return;
        }
        a(i2, commonFileInfo);
    }

    public final void a(int i, CommonFileInfo commonFileInfo) {
        String str = k;
        HwLog.i(str, "beginTransferFile() device support transfer file");
        if (commonFileInfo.getFileType() == 0) {
            HwLog.w(str, "beginTransferFile() no task deal with this tlv.");
            return;
        }
        commonFileInfo.setFileId(i);
        this.d.put(Integer.valueOf(commonFileInfo.getFileId()), commonFileInfo);
        HwLog.i(str, "beginTransferFile() reset info:file id:" + commonFileInfo.getFileId() + ", fileType:" + commonFileInfo.getFileType() + ", filename:" + commonFileInfo.getFileName() + ", NeedVerify:" + commonFileInfo.isNeedVerify());
        if (commonFileInfo.isNeedVerify()) {
            d(commonFileInfo.getFileId(), 1);
        } else {
            f(commonFileInfo.getFileId());
        }
    }

    public final boolean a(String str, String str2) {
        return TextUtils.equals(str, str2) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str);
    }

    public final void a(int i, String str) {
        if (this.d.get(Integer.valueOf(i)) != null) {
            ((CommonFileInfo) this.d.get(Integer.valueOf(i))).setHashValue(str);
            f(i);
        } else {
            HwLog.i(k, "saveFileHash() error");
        }
    }

    public final void a(byte[] bArr) {
        int maxApplyDataSize;
        String strA = i1.a(bArr);
        String str = k;
        HwLog.i(str, "handleConsult() info: " + strA);
        String strSubstring = SafeString.substring(strA, CommonUtils.l());
        FileTransferParameter fileTransferParameter = new FileTransferParameter();
        try {
            List<Tlv> tlvList = this.g.builderTlvList(strSubstring).getTlvList();
            if (tlvList != null && tlvList.size() > 0) {
                for (Tlv tlv : tlvList) {
                    a(fileTransferParameter, IntegerUtils.b(tlv.getTag(), 16), tlv.getValue());
                }
                String str2 = k;
                HwLog.i(str2, "handleConsult() fileId:" + fileTransferParameter.getFileId());
                if (fileTransferParameter.getMaxApplyDataSize() % fileTransferParameter.getTransferUnitSize() == 0) {
                    maxApplyDataSize = (fileTransferParameter.getMaxApplyDataSize() / fileTransferParameter.getTransferUnitSize()) - 1;
                } else {
                    maxApplyDataSize = fileTransferParameter.getMaxApplyDataSize() / fileTransferParameter.getTransferUnitSize();
                }
                fileTransferParameter.setPackageNumberMax(maxApplyDataSize);
                HwLog.i(str2, "handleConsult() psnMax:" + maxApplyDataSize);
                this.i.put(Integer.valueOf(fileTransferParameter.getFileId()), fileTransferParameter);
                if (this.d.get(Integer.valueOf(fileTransferParameter.getFileId())) != null) {
                    g(fileTransferParameter.getFileId());
                    a(fileTransferParameter, (CommonFileInfo) this.d.get(Integer.valueOf(fileTransferParameter.getFileId())));
                    return;
                }
                return;
            }
            HwLog.w(str, "handleConsult() tlv list error");
        } catch (TlvException unused) {
            HwLog.e(k, "handleConsult() error");
        }
    }

    public final void a(FileTransferParameter fileTransferParameter, int i, String str) {
        if (i == 1) {
            fileTransferParameter.setFileId(IntegerUtils.b(str, 16));
            HwLog.i(k, "handleParamTlv() file id:" + fileTransferParameter.getFileId());
            return;
        }
        if (i == 2) {
            fileTransferParameter.setAppWaitTime(IntegerUtils.b(str, 16));
            HwLog.i(k, "handleParamTlv() device wait timeout:" + fileTransferParameter.getAppWaitTime());
            return;
        }
        if (i == 3) {
            fileTransferParameter.setTransferUnitSize(IntegerUtils.b(str, 16));
            HwLog.i(k, "handleParamTlv() unit size:" + fileTransferParameter.getTransferUnitSize());
            return;
        }
        if (i == 4) {
            fileTransferParameter.setMaxApplyDataSize(IntegerUtils.b(str, 16));
            HwLog.i(k, "handleParamTlv() max apply:" + fileTransferParameter.getMaxApplyDataSize());
            return;
        }
        if (i != 5) {
            HwLog.i(k, "handleParamTlv() default");
            return;
        }
        fileTransferParameter.setTransferNotEncrypt(IntegerUtils.c(str) == 1);
        HwLog.i(k, "handleParamTlv() not need encrypt:" + fileTransferParameter.isTransferNotEncrypt());
    }

    public final void a(int i, int i2, boolean z) {
        String str = k;
        HwLog.i(str, "doRequest() fileId:" + i + "offset:" + i2);
        CommonFileInfo commonFileInfo = (CommonFileInfo) this.d.get(Integer.valueOf(i));
        if (commonFileInfo == null) {
            HwLog.w(str, "doRequest() fileId not in list!");
            return;
        }
        FileTransferParameter fileTransferParameter = (FileTransferParameter) this.i.get(Integer.valueOf(i));
        if (fileTransferParameter == null) {
            HwLog.w(str, "doRequest() fileTransferParameter is null");
            return;
        }
        commonFileInfo.setFileOffset(i2);
        commonFileInfo.setFilePsn(0);
        b(i, i2, !z);
        if (fileTransferParameter.getMaxApplyDataSize() <= commonFileInfo.getFileSize() - commonFileInfo.getFileOffset()) {
            HwLog.i(str, "doRequest() request max:" + fileTransferParameter.getMaxApplyDataSize());
            commonFileInfo.setFileLength(fileTransferParameter.getMaxApplyDataSize());
            commonFileInfo.setFilePsnMax(fileTransferParameter.getPackageNumberMax());
            commonFileInfo.setByteUnit(ByteBuffer.allocate(fileTransferParameter.getMaxApplyDataSize()));
            a(i, commonFileInfo.getFileOffset(), fileTransferParameter.getMaxApplyDataSize());
        } else {
            int fileSize = commonFileInfo.getFileSize() - commonFileInfo.getFileOffset();
            HwLog.i(str, "doRequest() request not max:" + fileSize);
            if (fileSize % fileTransferParameter.getTransferUnitSize() == 0) {
                commonFileInfo.setFilePsnMax((fileSize / fileTransferParameter.getTransferUnitSize()) - 1);
            } else {
                commonFileInfo.setFilePsnMax(fileSize / fileTransferParameter.getTransferUnitSize());
            }
            commonFileInfo.setFileLength(fileSize);
            commonFileInfo.setByteUnit(ByteBuffer.allocate(fileSize));
            a(i, commonFileInfo.getFileOffset(), commonFileInfo.getFileLength());
        }
        if (!z) {
            HwLog.i(str, "doRequest() first!");
            f(i, fileTransferParameter.getAppWaitTime());
        }
        b(i, i2, fileTransferParameter.getAppWaitTime() / 3);
    }

    public final void a(int i, int i2, int i3) {
        String str = CommonUtils.d() + (i1.b(1) + i1.b(1) + i1.b(i)) + (i1.b(2) + i1.b(4) + i1.a(i2)) + (i1.b(3) + i1.b(4) + i1.a(i3));
        CommandJsonInfo commandJsonInfo = new CommandJsonInfo();
        commandJsonInfo.setServiceId(44);
        commandJsonInfo.setCommandId(4);
        commandJsonInfo.setCommandType(800);
        commandJsonInfo.setDeviceCommand(str);
        HwLog.i(k, "sendRequestCommand() commandJsonInfo: " + commandJsonInfo.toString());
        q1.a(this.h, commandJsonInfo, this.f30669c);
    }

    public final void a(String str, int i, int i2, CommonFileInfo commonFileInfo) throws Throwable {
        b(i);
        byte[] bArrA = i1.a(SafeString.substring(str, 12));
        if (commonFileInfo.getByteUnit() != null) {
            commonFileInfo.getByteUnit().put(bArrA);
        }
        a(commonFileInfo, bArrA, i, i2);
        if (i2 < commonFileInfo.getFilePsnMax()) {
            HwLog.i(k, "handleDeviceDataReceived keep wait");
            if (this.i.get(Integer.valueOf(i)) != null) {
                f(i, ((FileTransferParameter) this.i.get(Integer.valueOf(i))).getAppWaitTime());
                CommonFileRetryInfo commonFileRetryInfo = (CommonFileRetryInfo) this.f.get(Integer.valueOf(i));
                if (commonFileRetryInfo != null) {
                    b(i, commonFileRetryInfo.getLastOffset(), ((FileTransferParameter) this.i.get(Integer.valueOf(i))).getAppWaitTime() / 3);
                }
            }
            commonFileInfo.setFilePsn(i2 + 1);
            commonFileInfo.setFileOffset(commonFileInfo.getFileOffset() + bArrA.length);
            return;
        }
        String str2 = k;
        HwLog.i(str2, "handleDeviceDataReceived one unit all received");
        commonFileInfo.getByteUnit().clear();
        commonFileInfo.getByteAll().put(commonFileInfo.getByteUnit());
        if (commonFileInfo.getByteAll().hasRemaining()) {
            HwLog.i(str2, "start request next");
            a(i, commonFileInfo.getFileOffset() + bArrA.length, false);
        } else {
            a(i);
        }
    }

    public final void a(int i) throws Throwable {
        CommonFileInfo commonFileInfo = (CommonFileInfo) this.d.get(Integer.valueOf(i));
        if (commonFileInfo == null) {
            HwLog.w(k, "handleRequestOver commonFileInfo is null");
            return;
        }
        try {
            if (commonFileInfo.isNeedVerify()) {
                String strA = i1.a(CommonUtils.b(commonFileInfo.getByteAll().array()));
                HwLog.i(k, "app hashValue:" + strA + ", device hashValue:" + commonFileInfo.getHashValue());
                Locale locale = Locale.ENGLISH;
                if (TextUtils.equals(strA.toUpperCase(locale), commonFileInfo.getHashValue().toUpperCase(locale))) {
                    e(i, 1);
                    a(commonFileInfo);
                } else {
                    d(commonFileInfo);
                    e(i, 2);
                    commonFileInfo.getFileRequestCallBack().onFailure(30001, "");
                }
            } else {
                e(i, 1);
                a(commonFileInfo);
            }
            a(commonFileInfo, 30005);
            e();
        } catch (IOException unused) {
            HwLog.e(k, "handleRequestOver IOException");
        }
    }

    public final void a(CommonFileInfo commonFileInfo) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        StringBuilder sb = new StringBuilder();
        sb.append(this.h.getFilesDir().getCanonicalPath());
        String str = File.separator;
        sb.append(str);
        sb.append("commonFileRequest");
        sb.append(str);
        sb.append(commonFileInfo.getFileName());
        String strFilterFilePath = CommonUtils.filterFilePath(sb.toString());
        if (strFilterFilePath == null) {
            HwLog.w(k, "createFileWithByte path is null");
            return;
        }
        File file = new File(strFilterFilePath);
        FileOutputStream fileOutputStream = null;
        try {
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                if (!parentFile.exists()) {
                    boolean zMkdirs = parentFile.mkdirs();
                    HwLog.i(k, "createFileWithByte file mkdir:" + zMkdirs);
                }
                if (!file.exists()) {
                    boolean zCreateNewFile = file.createNewFile();
                    HwLog.i(k, "createFileWithByte file create is:" + zCreateNewFile);
                }
                FileOutputStream fileOutputStreamOpenOutputStream = FileHelper.openOutputStream(file, false);
                try {
                    bufferedOutputStream = new BufferedOutputStream(fileOutputStreamOpenOutputStream);
                    try {
                        bufferedOutputStream.write(commonFileInfo.getByteAll().array());
                        bufferedOutputStream.flush();
                        HwLog.i(k, "createFileWithByte end");
                        if (commonFileInfo.getFileRequestCallBack() != null) {
                            commonFileInfo.getFileRequestCallBack().onSuccess(30000, strFilterFilePath, "");
                        }
                        fileOutputStream = fileOutputStreamOpenOutputStream;
                    } catch (IOException e) {
                        e = e;
                        fileOutputStream = fileOutputStreamOpenOutputStream;
                        try {
                            HwLog.e(k, "createFileWithByte exception:" + HwLog.printException((Exception) e));
                            c0.a(fileOutputStream);
                            c0.a(bufferedOutputStream);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            c0.a(fileOutputStream);
                            c0.a(bufferedOutputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStreamOpenOutputStream;
                        c0.a(fileOutputStream);
                        c0.a(bufferedOutputStream);
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                    bufferedOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    bufferedOutputStream = null;
                }
            } else {
                bufferedOutputStream = null;
            }
            c0.a(fileOutputStream);
            c0.a(bufferedOutputStream);
        } catch (IOException e3) {
            e = e3;
            bufferedOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            bufferedOutputStream = null;
        }
    }

    public final void a(int i, int i2) {
        CommonFileInfo commonFileInfo = (CommonFileInfo) this.d.get(Integer.valueOf(i));
        if (commonFileInfo == null) {
            HwLog.w(k, "reportCancelResult() commonFileInfo is null");
            return;
        }
        if (commonFileInfo.getCallback() != null) {
            if (i2 == 100000) {
                commonFileInfo.getCallback().onResponse(30005, "");
                HwLog.i(k, "reportCancelResult() success");
                b(i);
                b(commonFileInfo);
                a(commonFileInfo, 30005);
                return;
            }
            commonFileInfo.getCallback().onResponse(30006, "");
            a(commonFileInfo, 30006);
            HwLog.i(k, "reportCancelResult() failed");
        }
    }

    public final void a(Map.Entry entry) {
        String str = k;
        HwLog.i(str, "toKitReportNoConnectDevice() enter.");
        if (((CommonFileInfo) entry.getValue()).getKitCallback() == null || !a(((CommonFileInfo) entry.getValue()).getKitCallback())) {
            return;
        }
        HwLog.i(str, "toKitReportNoConnectDevice() to kit error code.");
        ((CommonFileInfo) entry.getValue()).getKitCallback().onResponse(300004, "");
    }

    public final boolean a(IBaseCommonCallback iBaseCommonCallback) {
        if (this.e.size() == 0) {
            return false;
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            if (((CommonFileInfo) it.next()).getKitCallback() == iBaseCommonCallback) {
                return true;
            }
        }
        return false;
    }

    public final void a(CommonFileInfo commonFileInfo, int i) {
        if (commonFileInfo != null && commonFileInfo.getKitCallback() != null) {
            HwLog.i(k, "toKitFailureCode() enter. errorCode:" + i);
            try {
                commonFileInfo.getKitCallback().onResponse(i, "");
                return;
            } catch (Exception e) {
                HwLog.e(k, "toKitFailureCode() third part has exception, catch this" + HwLog.printException(e));
                return;
            }
        }
        HwLog.w(k, "toKitFailureCode() getKitCallback() is null. code:" + i);
    }

    public final void a(FileTransferParameter fileTransferParameter, CommonFileInfo commonFileInfo) {
        String strA;
        if (commonFileInfo.getKitCallback() == null) {
            HwLog.w(k, "toKitFileConsultInfo() callback is null");
            return;
        }
        HwLog.i(k, "toKitFileConsultInfo() enter.");
        try {
            strA = a(0, fileTransferParameter.getMaxApplyDataSize(), commonFileInfo.getFileSize(), commonFileInfo.getHashValue().getBytes("UTF-8"));
            try {
                commonFileInfo.getKitCallback().onResponse(10001, strA);
            } catch (UnsupportedEncodingException unused) {
                HwLog.e(k, "toKitFileConsultInfo() UnsupportedEncodingException : no support utf-8");
                commonFileInfo.getKitCallback().onResponse(10001, strA);
            }
        } catch (UnsupportedEncodingException unused2) {
            strA = "";
        }
    }

    public final void a(CommonFileInfo commonFileInfo, byte[] bArr, int i, int i2) {
        if (commonFileInfo.getKitCallback() == null) {
            HwLog.w(k, "toKitFrameData() callback is null.");
            return;
        }
        CommonFileRetryInfo commonFileRetryInfo = (CommonFileRetryInfo) this.f.get(Integer.valueOf(i));
        if (commonFileRetryInfo == null) {
            HwLog.w(k, "toKitFrameData() retryInfo is null.");
            return;
        }
        if (i2 != commonFileRetryInfo.getToKitNumber() + 1) {
            HwLog.w(k, "toKitFrameData() this frame has return to kit, return.");
            return;
        }
        commonFileRetryInfo.setToKitNumber(i2);
        this.f.put(Integer.valueOf(i), commonFileRetryInfo);
        String str = k;
        HwLog.i(str, "toKitFrameData() enter");
        commonFileInfo.setTotalIndex(commonFileInfo.getTotalIndex() + 1);
        String strA = a(0, commonFileInfo.getTotalIndex(), bArr);
        HwLog.i(str, "toKitFrameData():" + strA);
        commonFileInfo.getKitCallback().onResponse(10002, strA);
    }

    public final String a(int i, int i2, byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", i);
            jSONObject.put("index", i2);
            jSONObject.put("value", i1.a(bArr));
        } catch (JSONException unused) {
            HwLog.e(k, "toFileTransferInfoJson() exception");
        }
        HwLog.i(k, "toFileTransferInfoJson() json:" + jSONObject.toString());
        return jSONObject.toString();
    }

    public final String a(int i, int i2, int i3, byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", i);
            jSONObject.put("maxTransferUnit", i2);
            jSONObject.put("fileSize", i3);
            jSONObject.put("crc", i1.a(bArr));
        } catch (JSONException unused) {
            HwLog.e(k, "toFileConsultInfoJson() exception");
        }
        HwLog.i(k, "toFileConsultInfoJson() json is:" + jSONObject.toString());
        return jSONObject.toString();
    }

    public static void a(DeviceInfo deviceInfo) {
        int deviceConnectState = deviceInfo.getDeviceConnectState();
        if (deviceConnectState == 2) {
            HwLog.i(k, "CommonFileRequestBroadCastReceiver() DEVICE_CONNECTED");
            return;
        }
        if (deviceConnectState != 3) {
            HwLog.i(k, "CommonFileRequestBroadCastReceiver() default");
            return;
        }
        HwLog.i(k, "CommonFileRequestBroadCastReceiver() DEVICE_DISCONNECTED");
        if (l == null) {
            return;
        }
        l.f();
        l.c();
        if (l.f30668b == null) {
            return;
        }
        l.f30668b.removeMessages(200);
    }
}
