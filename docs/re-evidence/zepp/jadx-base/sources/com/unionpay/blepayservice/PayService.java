package com.unionpay.blepayservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.Nullable;
import com.huami.nfc.applet.Hex;
import com.huami.tools.log.HMLog;
import com.unionpay.entity.SimpleChannel;
import com.unionpay.repo.WatchUnionpayRepo;
import com.xiaomi.hm.health.bt.model.HMDisplaySetting;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes18.dex */
public class PayService extends Service {
    private static final String e = "UnionPay-PayService";
    public boolean a = true;
    private Lazy<WatchUnionpayRepo> b = KoinJavaComponent.inject(WatchUnionpayRepo.class);
    private IBLEService.Stub c = new a();
    private IBLETransCMDService.Stub d = new b();

    public class a extends IBLEService.Stub {
        public a() {
        }

        @Override // com.unionpay.blepayservice.IBLEService
        public String bleSEStatus() {
            return "0101";
        }

        @Override // com.unionpay.blepayservice.IBLEService
        public int closeLogicChannel(int i) {
            HMLog.i(PayService.e, "CloseLogicalChannel, ID: " + i, new Object[0]);
            return 0;
        }

        @Override // com.unionpay.blepayservice.IBLEService
        public String getBTCInfo() {
            String strBytesToHexString = Hex.bytesToHexString(new byte[]{24, 17, 1, 5, 22, -1, 0, 2, 65, org.threeten.bp.a.l, org.threeten.bp.a.m, org.threeten.bp.a.n, 0, 1, 2, 16, 0, 0, 72, 85, 65, 77, 73, HMDisplaySetting.TYPE_OSPREY_W, org.threeten.bp.a.l, 76, 83, 1, 2, 56, 48, 84});
            HMLog.i(PayService.e, "Get BtcInfo: " + strBytesToHexString, new Object[0]);
            return strBytesToHexString;
        }

        @Override // com.unionpay.blepayservice.IBLEService
        public String getCPLCInfo() {
            return ((WatchUnionpayRepo) PayService.this.b.getValue()).getCplc();
        }

        @Override // com.unionpay.blepayservice.IBLEService
        public int init() {
            return 0;
        }

        @Override // com.unionpay.blepayservice.IBLEService
        public Channel openLogicChannel(byte[] bArr) {
            HMLog.i(PayService.e, "OpenLogicalChannel", new Object[0]);
            SimpleChannel simpleChannelOpenLogicChannel = ((WatchUnionpayRepo) PayService.this.b.getValue()).openLogicChannel(bArr);
            PayService.this.a = false;
            return simpleChannelOpenLogicChannel != null ? new Channel(simpleChannelOpenLogicChannel.getChannelID(), simpleChannelOpenLogicChannel.getSelectResp(), PayService.this.d) : new Channel(-1, null, null);
        }
    }

    public class b extends IBLETransCMDService.Stub {
        public b() {
        }

        @Override // com.unionpay.blepayservice.IBLETransCMDService
        public int close() {
            HMLog.i(PayService.e, "CMD, CloseChannel!!", new Object[0]);
            ((WatchUnionpayRepo) PayService.this.b.getValue()).closeLogicChannel(-1);
            PayService.this.a = true;
            return 0;
        }

        @Override // com.unionpay.blepayservice.IBLETransCMDService
        public boolean isClosed() {
            HMLog.i(PayService.e, "CMD, Channel IsClosed:" + PayService.this.a, new Object[0]);
            return PayService.this.a;
        }

        @Override // com.unionpay.blepayservice.IBLETransCMDService
        public byte[] transmit(byte[] bArr) {
            HMLog.i(PayService.e, "CMD, Transmit", new Object[0]);
            return ((WatchUnionpayRepo) PayService.this.b.getValue()).transmit(bArr);
        }
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return this.c;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        HMLog.i(e, "PayService onCreate!!", new Object[0]);
    }
}
