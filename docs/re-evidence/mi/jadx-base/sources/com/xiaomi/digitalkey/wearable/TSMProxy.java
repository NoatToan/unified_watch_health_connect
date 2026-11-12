package com.xiaomi.digitalkey.wearable;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.miui.tsmclient.dkf.IDKFRequestService;
import com.miui.tsmclient.service.DKFRequestService;
import com.xiaomi.digitalkey.wearable.keyshare.KeyShareFriend;
import com.xiaomi.digitalkey.wearable.utils.ByteUtils;
import com.xiaomi.digitalkey.wearable.utils.ConstUtils;
import com.xiaomi.digitalkey.wearable.utils.Logger;
import com.xiaomi.digitalkey.wearable.utils.TLVObject;
import com.xiaomi.digitalkey.wearable.utils.TLVParser;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes7.dex */
public class TSMProxy {
    private static final boolean ERR = true;
    private static final String LogTag = "SDK-DKF-TSMProxy:";
    private static volatile TSMProxy sInstance;
    private static IDKFRequestService sTSMService;
    CountDownLatch latch;
    Context mCtx;
    DeviceConf mDevConf = DeviceConf.getInstance();
    TsmProxyDeathRecipient mRecipient = new TsmProxyDeathRecipient();
    private ServiceConnection mServiceConnection = new ServiceConnection() { // from class: com.xiaomi.digitalkey.wearable.TSMProxy.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (TSMProxy.DEBUG) {
                StringBuilder sb = new StringBuilder();
                sb.append("onServiceConnected:");
                sb.append(componentName.getPackageName());
            }
            IDKFRequestService unused = TSMProxy.sTSMService = IDKFRequestService.Stub.asInterface(iBinder);
            try {
                iBinder.linkToDeath(TSMProxy.this.mRecipient, 0);
            } catch (RemoteException unused2) {
                boolean unused3 = TSMProxy.DEBUG;
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (TSMProxy.DEBUG) {
                StringBuilder sb = new StringBuilder();
                sb.append("onServiceDisconnected:");
                sb.append(componentName.getPackageName());
            }
        }
    };
    byte[] mTsm_response;
    String mVehicle_OEM_id;
    private static final boolean DEBUG = Logger.LOG_TSM;
    public static int TSM_REQUEST_TYPE_GET_CAs = DKFRequestService.s0;
    public static int TSM_REQUEST_TYPE_KTS_REG = DKFRequestService.t0;
    public static int TSM_REQUEST_TYPE_KTS_TERMINATE = DKFRequestService.u0;
    public static int TSM_REQUEST_MAILBOX_QUERY = DKFRequestService.E0;
    public static int TSM_REQUEST_MAILBOX_UPDATE = DKFRequestService.F0;
    public static int TSM_REQUEST_MAILBOX_DELETE = DKFRequestService.G0;
    public static int TSM_REQUEST_GET_NOTIFICATION_TOKEN = DKFRequestService.I0;
    public static int TSM_REQUEST_REPORT_TRACK_RESULT = DKFRequestService.L0;

    public final class TsmProxyDeathRecipient implements IBinder.DeathRecipient {
        public TsmProxyDeathRecipient() {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            boolean unused = TSMProxy.DEBUG;
            IDKFRequestService unused2 = TSMProxy.sTSMService = null;
        }
    }

    private TSMProxy(Context context) {
        if (sTSMService == null) {
            this.mCtx = context;
            Intent intent = new Intent(this.mCtx.getPackageName() + ".action.DKF_REQUEST_SERVICE");
            intent.setPackage(this.mCtx.getPackageName());
            boolean zBindService = context.bindService(intent, this.mServiceConnection, 1);
            if (DEBUG) {
                StringBuilder sb = new StringBuilder();
                sb.append("bind service: ");
                sb.append(zBindService);
            }
        }
    }

    public static TSMProxy getInstance() {
        return sInstance;
    }

    public byte[] KTS_registerSync(byte[] bArr) {
        if (tsm_request(TSM_REQUEST_TYPE_KTS_REG, bArr)) {
            return this.mTsm_response;
        }
        return null;
    }

    public byte[] KTS_terminate(byte[] bArr) {
        if (tsm_request(TSM_REQUEST_TYPE_KTS_TERMINATE, prepare_terminate_req(bArr))) {
            return this.mTsm_response;
        }
        return null;
    }

    public byte[] deleteMailbox(byte[] bArr) {
        if (tsm_request(TSM_REQUEST_MAILBOX_DELETE, bArr)) {
            return this.mTsm_response;
        }
        return null;
    }

    public void doRebind() {
        ServiceConnection serviceConnection = new ServiceConnection() { // from class: com.xiaomi.digitalkey.wearable.TSMProxy.3
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                if (TSMProxy.DEBUG) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("onServiceConnected:");
                    sb.append(componentName.getPackageName());
                }
                IDKFRequestService unused = TSMProxy.sTSMService = IDKFRequestService.Stub.asInterface(iBinder);
                TSMProxy.this.latch.countDown();
                try {
                    iBinder.linkToDeath(TSMProxy.this.mRecipient, 0);
                } catch (RemoteException unused2) {
                    boolean unused3 = TSMProxy.DEBUG;
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                if (TSMProxy.DEBUG) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("onServiceDisconnected:");
                    sb.append(componentName.getPackageName());
                }
            }
        };
        Intent intent = new Intent(this.mCtx.getPackageName() + ".action.DKF_REQUEST_SERVICE");
        intent.setPackage(this.mCtx.getPackageName());
        boolean zBindService = this.mCtx.bindService(intent, serviceConnection, 1);
        if (DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("rebind:");
            sb.append(zBindService);
        }
    }

    public boolean getCAs(String str) throws KeyShareFriend.DigitalKeyInsufficientSpaceException {
        this.mVehicle_OEM_id = str;
        tsm_request(TSM_REQUEST_TYPE_GET_CAs, str.getBytes());
        updateCertificate(this.mTsm_response);
        return true;
    }

    public byte[] getXPSNotificationData() {
        if (tsm_request(TSM_REQUEST_GET_NOTIFICATION_TOKEN, null)) {
            return this.mTsm_response;
        }
        return null;
    }

    public byte[] prepare_terminate_req(byte[] bArr) {
        return new TLVObject(ConstUtils.TAG_XM_PRIVATE_IN, (List<TLVObject>) Arrays.asList(new TLVObject(ConstUtils.TAG_KEY_ID, bArr), new TLVObject(ConstUtils.TAG_VEHICLE_OEM_PPRO_DATAlEN, ByteUtils.getByteArray(32)), new TLVObject(ConstUtils.TAG_VEHICLE_OEM_PPRO_DATAOFFSET, ByteUtils.getByteArray(8)))).toBytes();
    }

    public byte[] queryMailbox(byte[] bArr) {
        if (tsm_request(TSM_REQUEST_MAILBOX_QUERY, bArr)) {
            return this.mTsm_response;
        }
        return null;
    }

    public void rebindService() {
        new Thread(new Runnable() { // from class: com.xiaomi.digitalkey.wearable.TSMProxy.2
            @Override // java.lang.Runnable
            public void run() {
                boolean unused = TSMProxy.DEBUG;
                TSMProxy.this.doRebind();
            }
        }).start();
    }

    public byte[] reportKtsStatus(byte[] bArr, int i, String str) {
        if (tsm_request(TSM_REQUEST_REPORT_TRACK_RESULT, new TLVObject(ConstUtils.TAG_XM_PRIVATE_IN, (List<TLVObject>) Arrays.asList(new TLVObject(ConstUtils.TAG_KEY_ID, bArr), new TLVObject(ConstUtils.TAG_KTS_REPORT_ERRCODE, ByteUtils.getByteArray(i)), new TLVObject(ConstUtils.TAG_KTS_REPORT_ERRMSG, str.getBytes()))).toBytes())) {
            return this.mTsm_response;
        }
        return null;
    }

    public boolean tsm_request(int i, byte[] bArr) {
        if (sTSMService == null) {
            rebindService();
            try {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                this.latch = countDownLatch;
                countDownLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (sTSMService == null) {
                return false;
            }
        }
        try {
            boolean z = DEBUG;
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append("request to TSM: ");
                sb.append(ByteUtils.toHexString(bArr));
            }
            byte[] bArrDkfRequest = sTSMService.dkfRequest(i, bArr);
            this.mTsm_response = bArrDkfRequest;
            if (z) {
                Logger.logWithLimit(LogTag, "resp from TSM", bArrDkfRequest, 1024);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return true;
    }

    public boolean updateCertificate(byte[] bArr) throws KeyShareFriend.DigitalKeyInsufficientSpaceException {
        if (bArr == null) {
            return false;
        }
        byte[] bArr2 = {bArr[bArr.length - 2], bArr[bArr.length - 1]};
        if (DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("Get CA data: ");
            sb.append(ByteUtils.toHexString(bArr));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SW: ");
            sb2.append(ByteUtils.toHexString(bArr2));
        }
        if (!ByteUtils.equals(bArr2, ConstUtils.SW_OK)) {
            if (TextUtils.equals(new String(TLVParser.getPayloadFromTag(TLVParser.getPayloadFromTag(this.mTsm_response, ConstUtils.TAG_XM_PRIVATE_OUT), ConstUtils.TAG_ERROR)), String.valueOf(90020))) {
                throw new KeyShareFriend.DigitalKeyInsufficientSpaceException("Insufficient se space");
            }
            return false;
        }
        TLVParser tLVParser = new TLVParser();
        tLVParser.parse(bArr);
        byte[] value = null;
        for (TLVObject tLVObject : tLVParser.getParseResult()) {
            if (ByteUtils.equals(tLVObject.getTag(), ConstUtils.TAG_XM_PRIVATE_OUT)) {
                value = tLVObject.getValue();
            }
        }
        if (value == null) {
            return false;
        }
        TLVParser tLVParser2 = new TLVParser();
        tLVParser2.parse(value);
        for (TLVObject tLVObject2 : tLVParser2.getParseResult()) {
            if (ByteUtils.equals(tLVObject2.getTag(), ConstUtils.TAG_DEV_CA)) {
                this.mDevConf.setDeviceCertificate(this.mVehicle_OEM_id, tLVObject2.getValue());
            }
            if (ByteUtils.equals(tLVObject2.getTag(), ConstUtils.TAG_INSTANCE_CA)) {
                this.mDevConf.setInstanceCertificate(this.mVehicle_OEM_id, tLVObject2.getValue());
            }
            if (ByteUtils.equals(tLVObject2.getTag(), ConstUtils.TAG_VEHICLE_OEM_CA_J)) {
                this.mDevConf.setVehicleOemCaJData(this.mVehicle_OEM_id, tLVObject2.getValue());
            }
            if (ByteUtils.equals(tLVObject2.getTag(), ConstUtils.TAG_VEHICLE_OEM_ENCRYPT_CA_P)) {
                this.mDevConf.setVehicleOemEncryptCaPData(this.mVehicle_OEM_id, tLVObject2.getValue());
            }
            if (ByteUtils.equals(tLVObject2.getTag(), ConstUtils.TAG_VEHICLE_OEM_SIG_CA)) {
                this.mDevConf.setVehicleOemSigCertData(this.mVehicle_OEM_id, tLVObject2.getValue());
            }
        }
        return true;
    }

    public byte[] updateMailbox(byte[] bArr) {
        if (tsm_request(TSM_REQUEST_MAILBOX_UPDATE, bArr)) {
            return this.mTsm_response;
        }
        return null;
    }

    public static TSMProxy getInstance(Context context) {
        if (sInstance == null) {
            synchronized (TSMProxy.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new TSMProxy(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }
}
