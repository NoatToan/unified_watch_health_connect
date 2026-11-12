package com.huawei.watchface;

import android.content.BroadcastReceiver;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.huawei.hihealth.listener.ResultCallback;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.phoneservice.feedbackcommon.network.FeedbackWebConstants;
import com.huawei.secure.android.common.intent.SafeBroadcastReceiver;
import com.huawei.secure.android.common.util.SafeString;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.mvp.model.datatype.CommandJsonInfo;
import com.huawei.watchface.mvp.model.datatype.CommonFileInfo;
import com.huawei.watchface.mvp.model.datatype.DeviceInfo;
import com.huawei.watchface.mvp.model.datatype.FileTransferParameter;
import com.huawei.watchface.mvp.model.datatype.Tlv;
import com.huawei.watchface.mvp.model.datatype.TlvException;
import com.huawei.watchface.mvp.model.datatype.TlvUtils;
import com.huawei.watchface.mvp.model.latona.provider.WatchFaceProvider;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.IntegerUtils;
import com.huawei.watchface.utils.callback.IAppTransferFileResultAIDLCallback;
import com.huawei.watchface.utils.callback.IBaseResponseCallback;
import com.huawei.watchface.utils.callback.IFileTransferStateCallback;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes20.dex */
public class x1 {
    public static final String o = "x1";
    public static final String p = "watchfacePhoto" + File.separator + WatchFaceProvider.BACKGROUND_LABEL;
    public static final Object q = new Object();
    public static volatile x1 r;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HandlerThread f30654c;
    public d d;
    public Context i;
    public ParcelFileDescriptor j;
    public ResultCallback m;
    public BroadcastReceiver n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30652a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FileInputStream f30653b = null;
    public ConcurrentHashMap e = new ConcurrentHashMap(20);
    public CopyOnWriteArrayList f = new CopyOnWriteArrayList();
    public Queue g = new LinkedList();
    public TlvUtils h = new TlvUtils();
    public ConcurrentHashMap k = new ConcurrentHashMap(20);
    public IAppTransferFileResultAIDLCallback l = null;

    public class a implements IAppTransferFileResultAIDLCallback {
        public a() {
        }

        @Override // com.huawei.watchface.utils.callback.IAppTransferFileResultAIDLCallback
        public void onFileRespond(int i, String str) {
            HwLog.i(x1.o, "deviceStartTransfer() onFileRespond");
            IAppTransferFileResultAIDLCallback iAppTransferFileResultAIDLCallback = x1.this.l;
            if (iAppTransferFileResultAIDLCallback != null) {
                iAppTransferFileResultAIDLCallback.onFileRespond(i, "");
            }
        }

        @Override // com.huawei.watchface.utils.callback.IAppTransferFileResultAIDLCallback
        public void onFileTransferState(int i, String str) {
            IAppTransferFileResultAIDLCallback iAppTransferFileResultAIDLCallback = x1.this.l;
            if (iAppTransferFileResultAIDLCallback != null) {
                iAppTransferFileResultAIDLCallback.onFileTransferState(i, "");
            }
        }

        @Override // com.huawei.watchface.utils.callback.IAppTransferFileResultAIDLCallback
        public void onUpgradeFailed(int i, String str) {
            HwLog.i(x1.o, "deviceStartTransfer() onUpgradeFailed");
            IAppTransferFileResultAIDLCallback iAppTransferFileResultAIDLCallback = x1.this.l;
            if (iAppTransferFileResultAIDLCallback != null) {
                iAppTransferFileResultAIDLCallback.onUpgradeFailed(i, str);
            }
        }
    }

    public class b implements IFileTransferStateCallback {
        public b() {
        }

        @Override // com.huawei.watchface.utils.callback.IFileTransferStateCallback
        public void onFileRespond(int i) {
            HwLog.i(x1.o, "deviceStartTransfer() onFileRespond");
            IAppTransferFileResultAIDLCallback iAppTransferFileResultAIDLCallback = x1.this.l;
            if (iAppTransferFileResultAIDLCallback != null) {
                iAppTransferFileResultAIDLCallback.onFileRespond(i, "");
            }
        }

        @Override // com.huawei.watchface.utils.callback.IFileTransferStateCallback
        public void onFileTransferState(int i) {
            IAppTransferFileResultAIDLCallback iAppTransferFileResultAIDLCallback = x1.this.l;
            if (iAppTransferFileResultAIDLCallback != null) {
                iAppTransferFileResultAIDLCallback.onFileTransferState(i, "");
            }
        }

        @Override // com.huawei.watchface.utils.callback.IFileTransferStateCallback
        public void onUpgradeFailed(int i, String str) {
            HwLog.i(x1.o, "deviceStartTransfer() onUpgradeFailed");
            IAppTransferFileResultAIDLCallback iAppTransferFileResultAIDLCallback = x1.this.l;
            if (iAppTransferFileResultAIDLCallback != null) {
                iAppTransferFileResultAIDLCallback.onUpgradeFailed(i, str);
            }
        }
    }

    public static class c extends SafeBroadcastReceiver {
        @Override // com.huawei.secure.android.common.intent.SafeBroadcastReceiver
        public void onReceiveMsg(Context context, Intent intent) {
            DeviceInfo deviceInfo;
            if (context == null) {
                return;
            }
            if (intent == null || intent.getExtras() == null || TextUtils.isEmpty(intent.getAction())) {
                HwLog.w(x1.o, "CommonFileBroadCastReceiver() intent is null.");
                return;
            }
            if (!"com.huawei.watchface.action.CONNECTION_STATE_CHANGED".equals(intent.getAction()) || (deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo")) == null) {
                return;
            }
            HwLog.i(x1.o, "CommonFileBroadCastReceiver() status = " + deviceInfo.getDeviceConnectState());
            x1.a(deviceInfo);
        }
    }

    public class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 100) {
                String str = x1.o;
                HwLog.i(str, "handleMessage() wait timeout!");
                int i2 = message.arg1;
                HwLog.i(str, "handleMessage() fileId:" + i2);
                x1.this.d(i2, 20030);
                x1 x1Var = x1.this;
                x1Var.a((CommonFileInfo) x1Var.e.get(Integer.valueOf(i2)));
                return;
            }
            if (i == 200) {
                String str2 = x1.o;
                HwLog.i(str2, "handleMessage() receive result!");
                int i3 = message.arg1;
                int i4 = message.arg2;
                HwLog.i(str2, "handleMessage() fileId :" + i3 + "; result :" + i4);
                x1.this.c(i3);
                if (x1.this.e.get(Integer.valueOf(i3)) == null || ((CommonFileInfo) x1.this.e.get(Integer.valueOf(i3))).getFileCallBack() == null) {
                    return;
                }
                if (i4 == 1) {
                    ((CommonFileInfo) x1.this.e.get(Integer.valueOf(i3))).getFileCallBack().onFileTransferState(100);
                }
                ((CommonFileInfo) x1.this.e.get(Integer.valueOf(i3))).getFileCallBack().onFileRespond(i4);
                HwLog.i(str2, "handleMessage() receive result! onFileRespond");
                x1.this.d();
                x1 x1Var2 = x1.this;
                x1Var2.a((CommonFileInfo) x1Var2.e.get(Integer.valueOf(i3)));
                return;
            }
            if (i != 300) {
                if (i == 400) {
                    x1.this.g();
                    return;
                }
                HwLog.i(x1.o, "handleMessage() default msg.what:" + message.what);
                return;
            }
            String str3 = x1.o;
            HwLog.i(str3, "handleMessage() device report error!");
            int i5 = message.arg1;
            int i6 = message.arg2;
            HwLog.i(str3, "handleMessage() fileId :" + i5 + "; result :" + i6);
            x1.this.d(i5, i6);
            x1 x1Var3 = x1.this;
            x1Var3.a((CommonFileInfo) x1Var3.e.get(Integer.valueOf(i5)));
        }
    }

    public x1(Context context) {
        this.i = context;
        HandlerThread handlerThread = new HandlerThread(o);
        this.f30654c = handlerThread;
        handlerThread.start();
        this.d = new d(this.f30654c.getLooper());
        this.n = new c();
        CommonUtils.a(this.n, new IntentFilter("com.huawei.watchface.action.CONNECTION_STATE_CHANGED"));
    }

    public static void c() {
        synchronized (x1.class) {
            HwLog.i(o, "destroyInstance() enter.");
            r = null;
        }
    }

    public void a(ResultCallback resultCallback) {
        this.m = resultCallback;
    }

    public void b() {
        BroadcastReceiver broadcastReceiver = this.n;
        if (broadcastReceiver != null) {
            CommonUtils.a(broadcastReceiver);
        }
        c();
    }

    public final void d(byte[] bArr) {
        try {
            List<Tlv> tlvList = this.h.builderTlvList(SafeString.substring(i1.a(bArr), CommonUtils.l())).getTlvList();
            if (tlvList == null || tlvList.size() <= 0) {
                HwLog.e(o, "handleDeviceRequest() tlvs error");
                return;
            }
            String strB = "";
            int iC = 3;
            for (Tlv tlv : tlvList) {
                int iC2 = IntegerUtils.c(tlv.getTag());
                String value = tlv.getValue();
                if (iC2 == 1) {
                    strB = i1.b(value);
                    HwLog.i(o, "handleDeviceRequest() file_name :" + strB);
                } else if (iC2 != 2) {
                    HwLog.i(o, "handleDeviceRequest() default type:" + iC2);
                } else {
                    iC = IntegerUtils.c(value);
                    HwLog.i(o, "handleDeviceRequest() file_type:" + iC);
                }
            }
            if (iC != 3 && iC != 1) {
                HwLog.e(o, "handleDeviceRequest() fileType invalid");
            } else if (!a(iC, strB)) {
                a(strB, iC, 140006);
            } else {
                a(strB, iC, 100000);
                a(strB, iC);
            }
        } catch (TlvException unused) {
            HwLog.e(o, "handleDeviceRequest() error");
        }
    }

    public final void e() {
        for (Map.Entry entry : this.e.entrySet()) {
            HwLog.i(o, "reportFailedForDisconnect() fileId:" + entry.getKey());
            if (((CommonFileInfo) entry.getValue()).getFileCallBack() != null) {
                ((CommonFileInfo) entry.getValue()).getFileCallBack().onUpgradeFailed(141001, "");
            }
            a((CommonFileInfo) entry.getValue());
        }
    }

    public final void f() {
        if (this.d != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 400;
            this.d.sendMessage(messageObtain);
            return;
        }
        HandlerThread handlerThread = new HandlerThread(o);
        this.f30654c = handlerThread;
        handlerThread.start();
        this.d = new d(this.f30654c.getLooper());
        Message messageObtain2 = Message.obtain();
        messageObtain2.what = 400;
        this.d.sendMessage(messageObtain2);
    }

    public final void g(byte[] bArr) {
        a();
        String strA = i1.a(bArr);
        String str = o;
        HwLog.i(str, "handleDeviceStatusReport() info: " + strA);
        try {
            List<Tlv> tlvList = this.h.builderTlvList(SafeString.substring(strA, CommonUtils.l())).getTlvList();
            if (tlvList == null || tlvList.size() <= 0) {
                HwLog.e(str, "handleDeviceStatusReport() tlvs error");
                return;
            }
            int iC = 0;
            int iC2 = 0;
            for (Tlv tlv : tlvList) {
                int iC3 = IntegerUtils.c(tlv.getTag());
                String value = tlv.getValue();
                if (iC3 == 1) {
                    iC = IntegerUtils.c(value);
                    HwLog.i(o, "handleDeviceStatusReport() file_id :" + IntegerUtils.c(value));
                } else if (iC3 != 127) {
                    HwLog.i(o, "handleDeviceStatusReport() default type" + iC3);
                } else {
                    iC2 = IntegerUtils.c(value);
                    HwLog.i(o, "handleDeviceStatusReport() status :" + IntegerUtils.c(value));
                }
            }
            c(iC, iC2);
        } catch (TlvException unused) {
            HwLog.e(o, "handleDeviceStatusReport() error");
        }
    }

    public void h(byte[] bArr) {
        if (bArr == null || bArr.length <= 1) {
            return;
        }
        String str = o;
        HwLog.i(str, "handleGeneralFileCallbackResult() message = " + i1.a(bArr));
        switch (bArr[1]) {
            case 1:
                d(bArr);
                break;
            case 2:
                a(bArr);
                break;
            case 3:
                i(bArr);
                break;
            case 4:
                c(bArr);
                break;
            case 5:
                e(bArr);
                break;
            case 6:
            default:
                HwLog.i(str, "handleGeneralFileCallbackResult()  default switch " + ((int) bArr[1]));
                break;
            case 7:
                f(bArr);
                break;
            case 8:
                g(bArr);
                break;
            case 9:
                b(bArr);
                break;
        }
    }

    public final void i(byte[] bArr) {
        String strA = i1.a(bArr);
        String str = o;
        HwLog.i(str, "handleRequestHash() info: " + strA);
        try {
            List<Tlv> tlvList = this.h.builderTlvList(SafeString.substring(strA, CommonUtils.l())).getTlvList();
            if (tlvList == null || tlvList.size() <= 0) {
                HwLog.e(str, "handleRequestHash() tlvs error");
            } else {
                a(tlvList);
            }
        } catch (TlvException unused) {
            HwLog.e(o, "handleRequestHash() error");
        }
    }

    public static x1 a(Context context) {
        if (r == null) {
            synchronized (x1.class) {
                if (r == null) {
                    r = new x1(context.getApplicationContext());
                }
            }
        }
        return r;
    }

    public final void b(String str, int i, String str2) {
        a(str2, str, i, new b());
    }

    public final void c(byte[] bArr) {
        String strA = i1.a(bArr);
        String str = o;
        HwLog.i(str, "handleConsult() info: " + strA);
        String strSubstring = SafeString.substring(strA, CommonUtils.l());
        FileTransferParameter fileTransferParameter = new FileTransferParameter();
        try {
            List<Tlv> tlvList = this.h.builderTlvList(strSubstring).getTlvList();
            if (tlvList != null && tlvList.size() > 0) {
                for (Tlv tlv : tlvList) {
                    a(fileTransferParameter, IntegerUtils.c(tlv.getTag()), tlv.getValue());
                }
                HwLog.i(o, "handleConsult() fileId :" + fileTransferParameter.getFileId());
                this.k.put(Integer.valueOf(fileTransferParameter.getFileId()), fileTransferParameter);
                a(fileTransferParameter.getFileId(), fileTransferParameter.isTransferNotEncrypt());
                return;
            }
            HwLog.e(str, "handleConsult() tlvs error");
        } catch (TlvException unused) {
            HwLog.e(o, "handleConsult() error");
        }
    }

    public final void b(int i) {
        String str = CommonUtils.d() + (i1.b(1) + i1.b(1) + i1.b(i)) + (i1.b(127) + i1.b(4) + i1.a(20001L));
        CommandJsonInfo commandJsonInfo = new CommandJsonInfo();
        commandJsonInfo.setServiceId(40);
        commandJsonInfo.setCommandId(3);
        commandJsonInfo.setCommandType(800);
        commandJsonInfo.setDeviceCommand(str);
        HwLog.i(o, "sendFileHashResult() commandJsonInfo: " + commandJsonInfo.toString());
        q1.a(this.i, commandJsonInfo, this.m);
    }

    public final void e(byte[] bArr) {
        String strA = i1.a(bArr);
        HwLog.i(o, "handleDeviceRequestData() info: " + strA);
        String strSubstring = SafeString.substring(strA, CommonUtils.l());
        List arrayList = new ArrayList(20);
        try {
            List<Tlv> tlvList = this.h.builderTlvList(strSubstring).getTlvList();
            if (tlvList == null || tlvList.size() <= 0) {
                return;
            }
            int iC = 0;
            int iC2 = 0;
            int iC3 = 0;
            for (Tlv tlv : tlvList) {
                int iC4 = IntegerUtils.c(tlv.getTag());
                String value = tlv.getValue();
                if (iC4 == 1) {
                    iC = IntegerUtils.c(value);
                    HwLog.i(o, "handleDeviceRequestData() file_id :" + IntegerUtils.c(value));
                } else if (iC4 == 2) {
                    iC2 = IntegerUtils.c(value);
                    HwLog.i(o, "handleDeviceRequestData() offset :" + IntegerUtils.c(value));
                } else if (iC4 == 3) {
                    iC3 = IntegerUtils.c(value);
                    HwLog.i(o, "handleDeviceRequestData() length :" + IntegerUtils.c(value));
                } else if (iC4 != 4) {
                    HwLog.i(o, "handleDeviceRequestData() default :" + iC4);
                } else {
                    arrayList = e0.a(value);
                    HwLog.i(o, "handleDeviceRequestData() bitmap :" + arrayList.size());
                }
            }
            a(iC, iC2, iC3, arrayList);
        } catch (TlvException unused) {
            HwLog.e(o, "handleDeviceRequestData() error");
        }
    }

    public void a(String str, String str2, int i, IFileTransferStateCallback iFileTransferStateCallback) {
        String canonicalPath;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            canonicalPath = new File(str).getCanonicalPath();
        } catch (IOException e) {
            HwLog.e(o, "startTransfer() IOException :" + HwLog.printException((Exception) e));
            canonicalPath = null;
        }
        if (TextUtils.isEmpty(canonicalPath)) {
            return;
        }
        File file = new File(canonicalPath);
        if (!file.exists()) {
            HwLog.e(o, "startTransfer() file is not exist");
            iFileTransferStateCallback.onUpgradeFailed(20000, "");
            return;
        }
        int iA = a(file, -1L);
        if (iA == 0) {
            HwLog.e(o, "startTransfer() file size is 0");
            iFileTransferStateCallback.onUpgradeFailed(20000, "");
            return;
        }
        CommonFileInfo commonFileInfo = new CommonFileInfo();
        commonFileInfo.setFileName(str2);
        commonFileInfo.setFilePath(str);
        commonFileInfo.setFileType(i);
        commonFileInfo.setFileSize(iA);
        commonFileInfo.setFileCallBack(iFileTransferStateCallback);
        if (!b(commonFileInfo)) {
            this.f.add(commonFileInfo);
        }
        a();
        a(str2, iA, i);
    }

    public final void f(byte[] bArr) {
        a();
        String strA = i1.a(bArr);
        HwLog.i(o, "handleDeviceResultReport() info: " + strA);
        try {
            List<Tlv> tlvList = this.h.builderTlvList(SafeString.substring(strA, CommonUtils.l())).getTlvList();
            if (tlvList == null || tlvList.size() <= 0) {
                return;
            }
            int iC = 0;
            int iC2 = -1;
            for (Tlv tlv : tlvList) {
                int iC3 = IntegerUtils.c(tlv.getTag());
                String value = tlv.getValue();
                if (iC3 == 1) {
                    iC = IntegerUtils.c(value);
                    HwLog.i(o, "handleDeviceResultReport() file_id :" + IntegerUtils.c(value));
                } else if (iC3 != 2) {
                    HwLog.i(o, "handleDeviceResultReport() default type:" + iC3);
                } else {
                    iC2 = IntegerUtils.c(value);
                    HwLog.i(o, "handleDeviceResultReport() validity_result :" + IntegerUtils.c(value));
                }
            }
            e(iC, iC2);
        } catch (TlvException unused) {
            HwLog.e(o, "handleDeviceResultReport() error");
        }
    }

    public final void b(byte[] bArr) {
        String strA = i1.a(bArr);
        String str = o;
        HwLog.i(str, "handleCancelReply() info: " + strA);
        try {
            List<Tlv> tlvList = this.h.builderTlvList(SafeString.substring(strA, CommonUtils.l())).getTlvList();
            if (tlvList != null && tlvList.size() > 0) {
                int iC = 0;
                int iC2 = 0;
                for (Tlv tlv : tlvList) {
                    int iC3 = IntegerUtils.c(tlv.getTag());
                    String value = tlv.getValue();
                    if (iC3 == 1) {
                        iC = IntegerUtils.c(value);
                        HwLog.i(o, "handleCancelReply() CANCEL_FILE_ID :" + IntegerUtils.c(value));
                    } else if (iC3 != 127) {
                        HwLog.i(o, "handleCancelReply() default type:" + iC3);
                    } else {
                        iC2 = IntegerUtils.c(value);
                        HwLog.i(o, "handleCancelReply() validity_result :" + IntegerUtils.c(value));
                    }
                }
                b(iC, iC2);
                return;
            }
            HwLog.e(str, "handleCancelReply() tlvs error");
        } catch (TlvException unused) {
            HwLog.e(o, "handleCancelReply() error");
        }
    }

    public final void c(int i) {
        String str = CommonUtils.d() + (i1.b(127) + i1.b(4) + i1.a(SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US)) + (i1.b(1) + i1.b(1) + i1.b(i));
        CommandJsonInfo commandJsonInfo = new CommandJsonInfo();
        commandJsonInfo.setServiceId(40);
        commandJsonInfo.setCommandId(7);
        commandJsonInfo.setCommandType(800);
        commandJsonInfo.setDeviceCommand(str);
        HwLog.i(o, "sendFileHashResult() commandJsonInfo: " + commandJsonInfo.toString());
        q1.a(this.i, commandJsonInfo, this.m);
    }

    public final void c(int i, int i2) {
        if (this.d == null) {
            HandlerThread handlerThread = new HandlerThread(o);
            this.f30654c = handlerThread;
            handlerThread.start();
            this.d = new d(this.f30654c.getLooper());
            Message messageObtain = Message.obtain();
            messageObtain.what = 300;
            messageObtain.arg1 = i;
            messageObtain.arg2 = i2;
            this.d.sendMessage(messageObtain);
            return;
        }
        Message messageObtain2 = Message.obtain();
        messageObtain2.what = 300;
        messageObtain2.arg1 = i;
        messageObtain2.arg2 = i2;
        this.d.sendMessage(messageObtain2);
    }

    public final void h(int i, int i2) {
        if (this.d != null) {
            if (i2 != 0) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 100;
                messageObtain.arg1 = i;
                this.d.sendMessageDelayed(messageObtain, ((long) i2) * 1000);
                return;
            }
            return;
        }
        HandlerThread handlerThread = new HandlerThread(o);
        this.f30654c = handlerThread;
        handlerThread.start();
        this.d = new d(this.f30654c.getLooper());
        if (i2 != 0) {
            Message messageObtain2 = Message.obtain();
            messageObtain2.what = 100;
            messageObtain2.arg1 = i;
            this.d.sendMessageDelayed(messageObtain2, ((long) i2) * 1000);
        }
    }

    public final void g(int i, int i2) {
        String str = o;
        HwLog.i(str, "sendFileHashToDevice() fileId：" + i + "check_mode : " + i2);
        if (this.e.containsKey(Integer.valueOf(i)) && !TextUtils.isEmpty(((CommonFileInfo) this.e.get(Integer.valueOf(i))).getFilePath())) {
            if (new File(((CommonFileInfo) this.e.get(Integer.valueOf(i))).getFilePath()).exists()) {
                return;
            }
            HwLog.w(str, "sendFileHashToDevice() file is not exist");
            b(i);
            return;
        }
        HwLog.i(str, "sendFileHashToDevice() mFileInfoList have not or filePath isEmpty");
        b(i);
    }

    public void a(String str, int i, IBaseResponseCallback iBaseResponseCallback) {
        for (Map.Entry entry : this.e.entrySet()) {
            if (TextUtils.equals(((CommonFileInfo) entry.getValue()).getFileName(), str) && ((CommonFileInfo) entry.getValue()).getFileType() == i) {
                HwLog.i(o, "stopTransferFile() fileId :" + entry.getKey());
                ((CommonFileInfo) entry.getValue()).setCallback(iBaseResponseCallback);
                a(((Integer) entry.getKey()).intValue());
            }
        }
    }

    public final void f(int i, int i2) {
        CommonFileInfo commonFileInfo = (CommonFileInfo) this.e.get(Integer.valueOf(i));
        if (commonFileInfo == null) {
            HwLog.e(o, "reportProgressForUi() commonFileInfo is null.");
            return;
        }
        IFileTransferStateCallback fileCallBack = commonFileInfo.getFileCallBack();
        if (fileCallBack == null) {
            HwLog.e(o, "reportProgressForUi() callback is null.");
            return;
        }
        int fileSize = commonFileInfo.getFileSize();
        if (fileSize != 0) {
            long j = (((long) i2) * 100) / ((long) fileSize);
            if (j >= -2147483648L && j <= 2147483647L) {
                int i3 = (int) j;
                HwLog.i(o, "reportProgressForUi() fileSize :" + fileSize + " ; offset :" + i2 + " ; progress :" + i3);
                fileCallBack.onFileTransferState(i3);
                return;
            }
            HwLog.i(o, "reportProgressForUi() is not Integer.");
        }
    }

    public final void g() {
        ArrayList arrayList = new ArrayList(32);
        synchronized (q) {
            CommandJsonInfo commandJsonInfo = (CommandJsonInfo) this.g.poll();
            while (commandJsonInfo != null) {
                arrayList.add(commandJsonInfo);
                commandJsonInfo = (CommandJsonInfo) this.g.poll();
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            q1.a(this.i, (CommandJsonInfo) it.next(), this.m);
        }
    }

    public void a(IAppTransferFileResultAIDLCallback iAppTransferFileResultAIDLCallback) {
        this.l = iAppTransferFileResultAIDLCallback;
    }

    public final void d() {
        d dVar = this.d;
        if (dVar == null || !dVar.hasMessages(100)) {
            return;
        }
        this.d.removeMessages(100);
    }

    public final void a() {
        this.f30652a = -1;
        n2.a(this.f30653b);
        n2.a(this.j);
        this.f30653b = null;
    }

    public final void d(int i, int i2) {
        CommonFileInfo commonFileInfo = (CommonFileInfo) this.e.get(Integer.valueOf(i));
        if (commonFileInfo == null) {
            HwLog.e(o, "reportFailedForUi() commonFileInfo is null.");
            return;
        }
        IFileTransferStateCallback fileCallBack = commonFileInfo.getFileCallBack();
        if (fileCallBack == null) {
            HwLog.e(o, "reportFailedForUi() callback is null.");
            return;
        }
        if (i2 == 141000) {
            fileCallBack.onUpgradeFailed(20030, "");
        } else {
            fileCallBack.onUpgradeFailed(i2, "");
        }
        HwLog.i(o, "reportFailedForUi() fileId :" + i + "errorCode : " + i2);
    }

    public final void b(int i, int i2) {
        CommonFileInfo commonFileInfo = (CommonFileInfo) this.e.get(Integer.valueOf(i));
        if (commonFileInfo == null) {
            HwLog.e(o, "reportCancelResult() commonFileInfo is null.");
            return;
        }
        IBaseResponseCallback callback = commonFileInfo.getCallback();
        if (callback == null) {
            HwLog.e(o, "handleCancelReply() callback is null.");
            return;
        }
        if (i2 == 100000) {
            callback.onResponse(20003, "");
            HwLog.i(o, "handleCancelReply() success");
            d();
            a((CommonFileInfo) this.e.get(Integer.valueOf(i)));
            return;
        }
        callback.onResponse(20004, "");
        HwLog.w(o, "handleCancelReply() failed");
    }

    public final void a(String str, int i) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(this.i.getFilesDir().getCanonicalPath());
            String str2 = File.separator;
            sb.append(str2);
            sb.append(p);
            sb.append(str2);
            sb.append(str);
            String string = sb.toString();
            String str3 = SafeString.substring(string, 0, string.lastIndexOf(".")) + WatchFaceConstant.BIN_SUFFIX;
            if (Environment.sIsAarInTheme) {
                b(str, i, str3);
            } else {
                a(str, i, str3);
            }
        } catch (IOException unused) {
            HwLog.e(o, "deviceStartTransfer() IOException");
        }
    }

    public final void e(int i, int i2) {
        if (this.d == null) {
            HandlerThread handlerThread = new HandlerThread(o);
            this.f30654c = handlerThread;
            handlerThread.start();
            this.d = new d(this.f30654c.getLooper());
            Message messageObtain = Message.obtain();
            messageObtain.what = 200;
            messageObtain.arg1 = i;
            messageObtain.arg2 = i2;
            this.d.sendMessage(messageObtain);
            return;
        }
        Message messageObtain2 = Message.obtain();
        messageObtain2.what = 200;
        messageObtain2.arg1 = i;
        messageObtain2.arg2 = i2;
        this.d.sendMessage(messageObtain2);
    }

    public final void a(String str, int i, String str2) {
        HwWatchFaceApi.getInstance(this.i).commonTransferFile(str2, str, i, new a());
    }

    public final boolean a(int i, String str) {
        if (str == null) {
            HwLog.e(o, "deviceStartTransfer() fileType: " + i + "fileName = null");
            return false;
        }
        return a(str);
    }

    public final boolean a(String str) {
        try {
            File file = new File(this.i.getFilesDir().getCanonicalPath() + File.separator + p);
            String str2 = o;
            StringBuilder sb = new StringBuilder("checkFileExistForWatchFace() file exist: ");
            sb.append(file.exists());
            HwLog.i(str2, sb.toString());
            if (!file.isDirectory()) {
                HwLog.w(str2, "checkFileExistForWatchFace() not directory");
                return false;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                for (File file2 : fileArrListFiles) {
                    String name = file2.getName();
                    if (name.contains(str) && name.endsWith(".png")) {
                        HwLog.i(o, "checkFileExistForWatchFace() exists");
                        return true;
                    }
                }
                HwLog.i(o, "checkFileExistForWatchFace() not exists");
            }
            return false;
        } catch (IOException unused) {
            HwLog.e(o, "checkFileExistForWatchFace() IOException");
            return false;
        }
    }

    public final void b(int i, int i2, int i3, List list) {
        String str = o;
        HwLog.i(str, "sendDataToDevice() fileId: " + i + ", offset: " + i2 + ", length: " + i3 + ", bitmap.size :" + list.size());
        if (!this.e.containsKey(Integer.valueOf(i))) {
            HwLog.w(str, "sendDataToDevice() found no fileId");
        } else {
            a(i, i2, i3, a((CommonFileInfo) this.e.get(Integer.valueOf(i)), i, i2, i3));
        }
    }

    public final boolean b(String str) {
        return str == null || str.indexOf(FeedbackWebConstants.INVALID_FILE_NAME_PRE) < 0;
    }

    public final boolean b(CommonFileInfo commonFileInfo) {
        boolean z = false;
        for (CommonFileInfo commonFileInfo2 : this.f) {
            if (TextUtils.equals(commonFileInfo.getFileName(), commonFileInfo2.getFileName()) && commonFileInfo.getFileType() == commonFileInfo2.getFileType()) {
                z = true;
            }
        }
        return z;
    }

    public final void a(String str, int i, int i2) {
        String strC = i1.c(str);
        String str2 = CommonUtils.d() + (i1.b(1) + i1.b(strC.length() / 2) + strC) + (i1.b(2) + i1.b(1) + i1.b(i)) + (i1.b(127) + i1.b(4) + i1.a(i2));
        CommandJsonInfo commandJsonInfo = new CommandJsonInfo();
        commandJsonInfo.setServiceId(40);
        commandJsonInfo.setCommandId(1);
        commandJsonInfo.setCommandType(800);
        commandJsonInfo.setDeviceCommand(str2);
        HwLog.i(o, "reportDeviceRequest() commandJsonInfo: " + commandJsonInfo.toString());
        q1.a(this.i, commandJsonInfo, this.m);
    }

    public final void a(byte[] bArr) {
        int i;
        int iC;
        int i2;
        int i3;
        int i4;
        String str;
        String strA = i1.a(bArr);
        String str2 = o;
        HwLog.i(str2, "handleAppSend() info: " + strA);
        String strSubstring = SafeString.substring(strA, CommonUtils.l());
        String strB = "";
        CommonFileInfo commonFileInfo = new CommonFileInfo();
        int iC2 = 0;
        try {
            List<Tlv> tlvList = this.h.builderTlvList(strSubstring).getTlvList();
            if (tlvList != null && tlvList.size() > 0) {
                iC = 0;
                int iC3 = 0;
                for (Tlv tlv : tlvList) {
                    try {
                        int iC4 = IntegerUtils.c(tlv.getTag());
                        String value = tlv.getValue();
                        if (iC4 == 1) {
                            strB = i1.b(value);
                            HwLog.i(o, "handleAppSend() file_name :" + strB);
                        } else if (iC4 == 127) {
                            iC3 = IntegerUtils.c(value);
                            HwLog.i(o, "handleAppSend() error code :" + iC3);
                        } else if (iC4 == 3) {
                            iC = IntegerUtils.c(value);
                            HwLog.i(o, "handleAppSend() file_type :" + iC);
                        } else if (iC4 != 4) {
                            HwLog.i(o, "handleAppSend() default type :" + iC4);
                        } else {
                            iC2 = IntegerUtils.c(value);
                            HwLog.i(o, "handleAppSend() file_id :" + iC2);
                        }
                    } catch (TlvException unused) {
                        i = iC2;
                        iC2 = iC3;
                        HwLog.e(o, "handleAppSend() error");
                        iC3 = iC2;
                        iC2 = i;
                    }
                }
                i4 = iC;
                i3 = iC2;
                i2 = iC3;
                str = strB;
            } else {
                HwLog.e(str2, "handleAppSend() tlvs error");
                str = "";
                i4 = 0;
                i3 = 0;
                i2 = 0;
            }
        } catch (TlvException unused2) {
            i = 0;
            iC = 0;
        }
        a(str, i4, i3, i2, commonFileInfo);
    }

    public final void a(String str, int i, int i2, int i3, CommonFileInfo commonFileInfo) {
        for (CommonFileInfo commonFileInfo2 : this.f) {
            String str2 = o;
            HwLog.i(str2, "handleRequest() has cache file name:" + commonFileInfo2.getFileName());
            HwLog.i(str2, "handleRequest() has cache file type:" + commonFileInfo2.getFileType());
            if (TextUtils.equals(commonFileInfo2.getFileName(), str) && commonFileInfo2.getFileType() == i) {
                commonFileInfo.setFilePath(commonFileInfo2.getFilePath());
                commonFileInfo.setFileSize(commonFileInfo2.getFileSize());
                commonFileInfo.setFileCallBack(commonFileInfo2.getFileCallBack());
                commonFileInfo.setFileName(str);
                commonFileInfo.setFileType(i);
                commonFileInfo.setUriId(commonFileInfo2.getUriId());
                HwLog.i(str2, "handleRequest() name:" + commonFileInfo.getFileName());
                break;
            }
        }
        if (i3 != 100000) {
            if (commonFileInfo.getFileCallBack() != null) {
                commonFileInfo.getFileCallBack().onUpgradeFailed(i3, "");
                HwLog.i(o, "handleRequest() errorCode :" + i3);
                a(commonFileInfo);
                return;
            }
            HwLog.e(o, "handleRequest() file callBack is null");
            return;
        }
        HwLog.i(o, "handleRequest() device support transfer file");
        commonFileInfo.setFileId(i2);
        this.e.put(Integer.valueOf(commonFileInfo.getFileId()), commonFileInfo);
        d();
    }

    public final void a(String str, long j, int i) {
        String str2;
        String strC = i1.c(str);
        String str3 = i1.b(1) + i1.a(strC.length() / 2) + strC;
        String str4 = i1.b(2) + i1.b(4) + i1.a(j);
        String str5 = i1.b(3) + i1.b(1) + i1.b(i);
        if (i == 1) {
            String[] strArrSplit = str.split("_");
            if (strArrSplit.length != 2) {
                HwLog.e(o, "sendFileInfo() deviceCommand error");
                return;
            }
            String strC2 = i1.c(strArrSplit[0]);
            String str6 = i1.b(5) + i1.b(strC2.length() / 2) + strC2;
            String strC3 = i1.c(strArrSplit[1]);
            str2 = str3 + str4 + str5 + str6 + (i1.b(6) + i1.b(strC3.length() / 2) + strC3);
            HwLog.i(o, "sendFileInfo() get WatchInfo success");
        } else {
            str2 = str3 + str4 + str5;
        }
        String str7 = CommonUtils.d() + str2;
        CommandJsonInfo commandJsonInfo = new CommandJsonInfo();
        commandJsonInfo.setServiceId(40);
        commandJsonInfo.setCommandId(2);
        commandJsonInfo.setCommandType(800);
        commandJsonInfo.setDeviceCommand(str7);
        HwLog.i(o, "sendFileInfo() commandJsonInfo: " + commandJsonInfo.toString());
        q1.a(this.i, commandJsonInfo, this.m);
    }

    public final void a(List list) {
        Iterator it = list.iterator();
        int iC = 0;
        int iC2 = 0;
        while (it.hasNext()) {
            Tlv tlv = (Tlv) it.next();
            int iC3 = IntegerUtils.c(tlv.getTag());
            String value = tlv.getValue();
            if (iC3 == 1) {
                iC = IntegerUtils.c(value);
                HwLog.i(o, "handleRequestHash() file_id :" + IntegerUtils.c(value));
            } else if (iC3 != 2) {
                HwLog.i(o, "handleRequestHash() default type:" + iC3);
            } else {
                iC2 = IntegerUtils.c(value);
                HwLog.i(o, "handleRequestHash() check_mode:" + IntegerUtils.c(value));
            }
        }
        g(iC, iC2);
    }

    public final void a(FileTransferParameter fileTransferParameter, int i, String str) {
        switch (i) {
            case 1:
                fileTransferParameter.setFileId(IntegerUtils.c(str));
                HwLog.i(o, "handleParamTlv() file_id :" + IntegerUtils.c(str));
                break;
            case 2:
                fileTransferParameter.setFileProtocolVersion(i1.b(str));
                HwLog.i(o, "handleParamTlv() protocol version:" + i1.b(str));
                break;
            case 3:
                fileTransferParameter.setAppWaitTime(IntegerUtils.c(str));
                HwLog.i(o, "handleParamTlv() app_wait_time:" + IntegerUtils.c(str));
                break;
            case 4:
                fileTransferParameter.setBitmapEnable(IntegerUtils.c(str) == 1);
                HwLog.i(o, "handleParamTlv() bitmap_enable:" + IntegerUtils.c(str));
                break;
            case 5:
                fileTransferParameter.setTransferUnitSize(IntegerUtils.c(str));
                HwLog.i(o, "handleParamTlv() unit_size:" + IntegerUtils.c(str));
                break;
            case 6:
                fileTransferParameter.setMaxApplyDataSize(IntegerUtils.c(str));
                HwLog.i(o, "handleParamTlv() max_apply_data_size:" + IntegerUtils.c(str));
                break;
            case 7:
                fileTransferParameter.setInterval(IntegerUtils.c(str));
                HwLog.i(o, "handleParamTlv() interval:" + IntegerUtils.c(str));
                break;
            case 8:
                fileTransferParameter.setReceivedFileSize(IntegerUtils.c(str));
                HwLog.i(o, "handleParamTlv() received_file_size :" + IntegerUtils.c(str));
                break;
            case 9:
                fileTransferParameter.setTransferNotEncrypt(IntegerUtils.c(str) == 1);
                HwLog.i(o, "handleParamTlv() not need encrypt:" + fileTransferParameter.isTransferNotEncrypt());
                break;
            default:
                HwLog.i(o, "handleParamTlv() default type: " + i + ", value: " + IntegerUtils.c(str));
                break;
        }
    }

    public final void a(int i, boolean z) {
        String str;
        String str2 = o;
        HwLog.i(str2, "sendConsultAck() fileId :" + i + ", isEncrypt:" + z);
        String str3 = i1.b(1) + i1.b(1) + i1.b(i);
        String str4 = i1.b(127) + i1.b(4) + i1.a(SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US);
        if (z) {
            str = str4 + str3 + (i1.b(9) + i1.b(1) + i1.b(1));
        } else {
            str = str4 + str3;
        }
        String str5 = CommonUtils.d() + str;
        CommandJsonInfo commandJsonInfo = new CommandJsonInfo();
        commandJsonInfo.setServiceId(40);
        commandJsonInfo.setCommandId(4);
        commandJsonInfo.setCommandType(800);
        commandJsonInfo.setDeviceCommand(str5);
        HwLog.i(str2, "sendConsultAck() commandJsonInfo: " + commandJsonInfo.toString());
        q1.a(this.i, commandJsonInfo, this.m);
    }

    public final void a(int i, int i2, int i3, List list) {
        if (this.e.containsKey(Integer.valueOf(i))) {
            d();
            b(i, i2, i3, list);
        } else {
            HwLog.i(o, "checkFileId() fileId is not in mTransferingFileList");
        }
    }

    public final void a(int i, int i2, int i3, byte[] bArr, boolean z) {
        String strB = i1.b(i);
        String strB2 = i1.b(i2);
        String strA = i1.a(i3);
        String strA2 = i1.a(bArr);
        StringBuilder sb = new StringBuilder(32);
        sb.append(strB);
        sb.append(strB2);
        sb.append(strA);
        sb.append(strA2);
        String str = CommonUtils.d() + sb.toString();
        CommandJsonInfo commandJsonInfo = new CommandJsonInfo();
        commandJsonInfo.setServiceId(40);
        commandJsonInfo.setCommandId(6);
        commandJsonInfo.setCommandType(800);
        commandJsonInfo.setDeviceCommand(str);
        HwLog.i(o, "sendFileHashResult() commandJsonInfo: " + commandJsonInfo.toString());
        synchronized (q) {
            this.g.add(commandJsonInfo);
        }
        f();
    }

    public final void a(int i) {
        a();
        String str = CommonUtils.d() + (i1.b(1) + i1.b(1) + i1.b(i));
        CommandJsonInfo commandJsonInfo = new CommandJsonInfo();
        commandJsonInfo.setServiceId(40);
        commandJsonInfo.setCommandId(9);
        commandJsonInfo.setCommandType(800);
        commandJsonInfo.setDeviceCommand(str);
        HwLog.i(o, "sendFileHashResult() commandJsonInfo: " + commandJsonInfo.toString());
        q1.a(this.i, commandJsonInfo, this.m);
    }

    public final void a(int i, int i2, int i3, byte[] bArr) {
        int i4 = i3;
        f(i, i2);
        FileTransferParameter fileTransferParameter = (FileTransferParameter) this.k.get(Integer.valueOf(i));
        int transferUnitSize = fileTransferParameter.getTransferUnitSize();
        String str = o;
        HwLog.i(str, "groupDataToDevice() frameLength: " + transferUnitSize);
        boolean zIsTransferNotEncrypt = fileTransferParameter.isTransferNotEncrypt() ^ true;
        HwLog.i(str, "groupDataToDevice() isNeedEncrypt: " + zIsTransferNotEncrypt);
        int iA = a(i4, transferUnitSize);
        int i5 = i2;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < iA) {
            int iA2 = a(i4, transferUnitSize, i8);
            byte[] bArrA = a(i9, iA2, bArr);
            int i10 = i6 > 255 ? 0 : i6;
            int i11 = i10;
            a(i, i10, i5, bArrA, zIsTransferNotEncrypt);
            StringBuilder sb = new StringBuilder(32);
            sb.append("transferData psnID ");
            sb.append(i11);
            sb.append("length = ");
            sb.append(iA2);
            sb.append("ota_offset = ");
            sb.append(i5);
            sb.append("sended_length = ");
            sb.append(i8);
            HwLog.i(o, sb.toString());
            i8 += iA2;
            i5 += iA2;
            i9 += iA2;
            i7++;
            i6 = i11 + 1;
            i4 = i3;
        }
        int appWaitTime = ((FileTransferParameter) this.k.get(Integer.valueOf(i))).getAppWaitTime();
        HwLog.i(o, "groupDataToDevice() mWaitTimeout: " + appWaitTime);
        h(i, appWaitTime);
    }

    public final int a(int i, int i2) {
        int i3;
        if (i % i2 == 0) {
            i3 = i / i2;
        } else {
            i3 = (i / i2) + 1;
        }
        HwLog.i(o, "getFileNumber() file_array = " + i3);
        return i3;
    }

    public final byte[] a(int i, int i2, byte[] bArr) {
        byte[] bArr2 = new byte[i2];
        try {
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        } catch (ArrayIndexOutOfBoundsException e) {
            HwLog.e(o, "getSendBytes() ArrayIndexOutOfBoundsException = " + HwLog.printException((Exception) e));
            return bArr2;
        }
    }

    public final int a(int i, int i2, int i3) {
        if ((i - i3) / i2 != 0) {
            HwLog.i(o, "getSendLength() send max, size：" + i2);
            return i2;
        }
        int i4 = i % i2;
        HwLog.i(o, "getSendLength() send not max, size = " + i4);
        return i4;
    }

    public final byte[] a(CommonFileInfo commonFileInfo, int i, int i2, int i3) {
        boolean z;
        if (commonFileInfo == null) {
            HwLog.w(o, "getFileByPath() info is null.");
            return new byte[0];
        }
        if (i3 > 10485760) {
            HwLog.w(o, "getFileByPath() length is illegal.");
            return new byte[0];
        }
        String filePath = commonFileInfo.getFilePath();
        long uriId = commonFileInfo.getUriId();
        if (!b(filePath)) {
            return new byte[0];
        }
        if (this.f30652a != i || this.f30653b == null) {
            HwLog.w(o, "getFileByPath() fileId is not same or stream is null.");
            a();
            this.f30652a = i;
            this.f30653b = a(filePath, uriId);
            z = true;
        } else {
            z = false;
        }
        if (this.f30653b == null) {
            HwLog.w(o, "getFileByPath() error.");
            n2.a(this.j);
            return new byte[0];
        }
        byte[] bArr = new byte[i3];
        long jSkip = 0;
        if (z) {
            try {
                HwLog.i(o, "getFileByPath() set read position.");
                jSkip = this.f30653b.skip(i2);
            } catch (IOException unused) {
                HwLog.e(o, "getFileByPath() IOException.");
            }
        }
        int i4 = this.f30653b.read(bArr);
        HwLog.i(o, "getFileByPath() readFileSize: " + i4);
        if (jSkip != -1) {
            return bArr;
        }
        HwLog.w(o, "getFileByPath() set read position occur error.");
        return new byte[0];
    }

    public final int a(File file, long j) {
        int iAvailable = 0;
        if (file == null || !file.exists()) {
            return 0;
        }
        FileInputStream fileInputStreamA = a(file.getPath(), j);
        if (fileInputStreamA == null) {
            HwLog.e(o, "getFileSize() error.");
            n2.a(this.j);
            return 0;
        }
        try {
            try {
                iAvailable = fileInputStreamA.available();
            } catch (IOException e) {
                HwLog.e(o, "getFileSize() IOException " + HwLog.printException((Exception) e));
            }
            return iAvailable;
        } finally {
            n2.a(fileInputStreamA);
            n2.a(this.j);
        }
    }

    public final void a(CommonFileInfo commonFileInfo) {
        if (commonFileInfo == null) {
            HwLog.w(o, "handleFailed() error, fileInfo is null");
            return;
        }
        for (int i = 0; i < this.f.size(); i++) {
            CommonFileInfo commonFileInfo2 = (CommonFileInfo) this.f.get(i);
            String str = o;
            HwLog.i(str, "handleFailed() has cache file name:" + commonFileInfo2.getFileName());
            HwLog.i(str, "handleFailed() has cache file type:" + commonFileInfo2.getFileType());
            if (TextUtils.equals(commonFileInfo2.getFileName(), commonFileInfo.getFileName()) && commonFileInfo2.getFileType() == commonFileInfo.getFileType()) {
                HwLog.i(str, "handleFailed() delete commonFileInfo.name:" + commonFileInfo2.getFileName());
                this.f.remove(commonFileInfo2);
                break;
            }
        }
        if (this.e.get(Integer.valueOf(commonFileInfo.getFileId())) != null) {
            HwLog.i(o, "handleFailed() has fileInfo file id:" + commonFileInfo.getFileId());
            this.e.remove(Integer.valueOf(commonFileInfo.getFileId()));
        }
        if (this.k.get(Integer.valueOf(commonFileInfo.getFileId())) != null) {
            HwLog.i(o, "handleFailed() has fileInfo file id:" + commonFileInfo.getFileId());
            this.k.remove(Integer.valueOf(commonFileInfo.getFileId()));
        }
    }

    public final FileInputStream a(String str, long j) {
        try {
            if (j == -1) {
                return new FileInputStream(CommonUtils.filterFilePath(str));
            }
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.i.getContentResolver().openFileDescriptor(ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, j), "r");
            this.j = parcelFileDescriptorOpenFileDescriptor;
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                return new FileInputStream(this.j.getFileDescriptor());
            }
            return null;
        } catch (FileNotFoundException e) {
            HwLog.e(o, "getFileInputStreamByUriId() FileNotFoundException: " + HwLog.printException((Exception) e));
            return null;
        }
    }

    public static void a(DeviceInfo deviceInfo) {
        int deviceConnectState = deviceInfo.getDeviceConnectState();
        if (deviceConnectState == 2) {
            HwLog.i(o, "CommonFileBroadCastReceiver() DEVICE_CONNECTED");
            return;
        }
        if (deviceConnectState != 3) {
            return;
        }
        HwLog.i(o, "CommonFileBroadCastReceiver() DEVICE_DISCONNECTED");
        if (r == null) {
            return;
        }
        r.e();
        r.d();
    }
}
