package defpackage;

import android.text.TextUtils;
import com.miui.tsmclient.entity.MFTag;
import com.miui.tsmclient.entity.MifareTag;
import com.miui.tsmclient.entity.Nonce;
import com.miui.tsmclient.entity.ProbeParam;
import com.miui.tsmclient.entity.SectorKey;
import com.miui.tsmclient.sesdk.MifareClassicTag;
import com.miui.tsmclient.sesdk.Sector;
import com.tsmclient.smartcard.Coder;
import com.tsmclient.smartcard.terminal.response.ScResponse;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.nfc.bean.CardSwitcherBean;
import com.xiaomi.fitness.nfc.bean.NfcResponse;
import com.xiaomi.fitness.nfc.exception.EncryptionCardException;
import com.xiaomi.fitness.nfc.exception.NfcException;
import com.xiaomi.fitness.nfc.exception.SupperCardException;
import com.xiaomi.fitness.nfc.sdk.ChannelImpl;
import com.xiaomi.fitness.sync.init.SyncComponent;
import dagger.hilt.android.EntryPointAccessors;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public class y64 extends s10 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DeviceContact f39827b;
    public q c;

    public class a implements OnSyncCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f39828a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f39829b;

        public a(AtomicReference atomicReference, CountDownLatch countDownLatch) {
            this.f39828a = atomicReference;
            this.f39829b = countDownLatch;
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onError(String str, int i, int i2) {
            vqg.d("readMifareTag onError code:" + i2);
            this.f39829b.countDown();
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onSuccess(String str, int i, SyncResult syncResult) {
            this.f39828a.set(syncResult);
            this.f39829b.countDown();
        }
    }

    public class b implements OnSyncCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f39830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f39831b;

        public b(AtomicReference atomicReference, CountDownLatch countDownLatch) {
            this.f39830a = atomicReference;
            this.f39831b = countDownLatch;
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onError(String str, int i, int i2) {
            vqg.d("sendBatchCommand onError code:" + i2);
            this.f39831b.countDown();
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onSuccess(String str, int i, SyncResult syncResult) {
            this.f39830a.set(syncResult);
            this.f39831b.countDown();
        }
    }

    public class c implements OnSyncCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f39832a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f39833b;

        public c(AtomicReference atomicReference, CountDownLatch countDownLatch) {
            this.f39832a = atomicReference;
            this.f39833b = countDownLatch;
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onError(String str, int i, int i2) {
            vqg.d("getCapability onError code:" + i2);
            this.f39833b.countDown();
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onSuccess(String str, int i, SyncResult syncResult) {
            this.f39832a.set(syncResult);
            this.f39833b.countDown();
        }
    }

    public class d implements OnSyncCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f39834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f39835b;

        public d(AtomicReference atomicReference, CountDownLatch countDownLatch) {
            this.f39834a = atomicReference;
            this.f39835b = countDownLatch;
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onError(String str, int i, int i2) {
            vqg.d("getCardSwitcherTimeList failed: " + i2);
            this.f39834a.set(new SyncResult(i2, null));
            this.f39835b.countDown();
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onSuccess(String str, int i, SyncResult syncResult) {
            this.f39834a.set(syncResult);
            this.f39835b.countDown();
        }
    }

    public class e implements OnSyncCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f39836a;

        public e(o oVar) {
            this.f39836a = oVar;
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onError(String str, int i, int i2) {
            vqg.a("setCardSwitcherTime failed: " + i2);
            this.f39836a.onResult(i2);
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onSuccess(String str, int i, SyncResult syncResult) {
            if (syncResult == null || syncResult.getPacket().B() == null) {
                return;
            }
            int i2 = syncResult.getPacket().B().t().c;
            this.f39836a.onResult(i2);
            vqg.a("setCardSwitcherTime onSuccess: " + i2);
        }
    }

    public class f implements OnSyncCallback {
        public f() {
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onError(String str, int i, int i2) {
            vqg.d("removeCardSwitcherTime failed: " + i2);
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onSuccess(String str, int i, SyncResult syncResult) {
            vqg.d("removeCardSwitcherTime success");
        }
    }

    public class g implements OnSyncCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ssg.b f39839a;

        public g(ssg.b bVar) {
            this.f39839a = bVar;
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onError(String str, int i, int i2) {
            vqg.d("pinStatus onError:" + i2);
            this.f39839a.onResult(-1);
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onSuccess(String str, int i, SyncResult syncResult) {
            if (syncResult == null || syncResult.getPacket() == null || syncResult.getPacket().E() == null || syncResult.getPacket().E().v() == null) {
                this.f39839a.onResult(-1);
                return;
            }
            axo axoVarV = syncResult.getPacket().E().v();
            vqg.d("BLE pinStatus:" + axoVarV);
            int i2 = axoVarV.c;
            if (i2 == 1) {
                this.f39839a.onResult(2);
                return;
            }
            if (i2 == 2) {
                this.f39839a.onResult(Integer.valueOf(axoVarV.e ? 4 : 1));
            } else if (i2 != 3) {
                this.f39839a.onResult(-1);
            } else {
                this.f39839a.onResult(Integer.valueOf(axoVarV.e ? 4 : 5));
            }
        }
    }

    public class h implements OnSyncCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ssg.b f39841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f39842b;

        public h(ssg.b bVar, CountDownLatch countDownLatch) {
            this.f39841a = bVar;
            this.f39842b = countDownLatch;
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onError(String str, int i, int i2) {
            vqg.d("openTai onError code:" + i2);
            this.f39841a.onResult(Boolean.FALSE);
            this.f39842b.countDown();
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onSuccess(String str, int i, SyncResult syncResult) {
            if (syncResult != null && syncResult.getPacket() != null && syncResult.getPacket().B() != null && syncResult.getPacket().B().v() != null) {
                NfcResponse nfcResponse = new NfcResponse(syncResult);
                vqg.d("openTai status:" + nfcResponse.mStatus);
                if (nfcResponse.mStatus == 224) {
                    this.f39841a.onResult(Boolean.TRUE);
                    return;
                }
            }
            this.f39841a.onResult(Boolean.FALSE);
            this.f39842b.countDown();
        }
    }

    public class i implements OnSyncCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f39843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f39844b;

        public i(AtomicReference atomicReference, CountDownLatch countDownLatch) {
            this.f39843a = atomicReference;
            this.f39844b = countDownLatch;
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onError(String str, int i, int i2) {
            vqg.d("probeSector onError code:" + i2);
            this.f39844b.countDown();
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onSuccess(String str, int i, SyncResult syncResult) {
            this.f39843a.set(syncResult);
            this.f39844b.countDown();
        }
    }

    public class j implements OnSyncCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f39845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f39846b;

        public j(AtomicReference atomicReference, CountDownLatch countDownLatch) {
            this.f39845a = atomicReference;
            this.f39846b = countDownLatch;
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onError(String str, int i, int i2) {
            vqg.d("openTai onError code:" + i2);
            this.f39846b.countDown();
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onSuccess(String str, int i, SyncResult syncResult) {
            this.f39845a.set(syncResult);
            this.f39846b.countDown();
        }
    }

    public class k implements OnSyncCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f39847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f39848b;

        public k(int i, CountDownLatch countDownLatch) {
            this.f39847a = i;
            this.f39848b = countDownLatch;
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onError(String str, int i, int i2) {
            vqg.d("sendCommand send type:" + i + "   code:" + i2);
            y64 y64Var = y64.this;
            y64Var.c = y64Var.new q(false, i2);
            this.f39848b.countDown();
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onSuccess(String str, int i, SyncResult syncResult) {
            vqg.d("sendCommand send type:" + i + "   code:" + syncResult.getCode() + "  cmd:" + this.f39847a);
            y64 y64Var = y64.this;
            y64Var.c = y64Var.new q(true, syncResult);
            this.f39848b.countDown();
        }
    }

    public class l implements OnSyncCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicInteger f39849a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f39850b;

        public l(AtomicInteger atomicInteger, CountDownLatch countDownLatch) {
            this.f39849a = atomicInteger;
            this.f39850b = countDownLatch;
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onError(String str, int i, int i2) {
            vqg.d("getBalance from device error code:" + i2);
            this.f39850b.countDown();
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onSuccess(String str, int i, SyncResult syncResult) {
            if (syncResult != null && syncResult.isSuccess()) {
                trg trgVarP = syncResult.getPacket().B().p();
                vqg.d("getBalance from device " + trgVarP.d);
                this.f39849a.set(trgVarP.d);
            }
            this.f39850b.countDown();
        }
    }

    public class m implements OnSyncCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f39851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f39852b;

        public m(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch) {
            this.f39851a = atomicBoolean;
            this.f39852b = countDownLatch;
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onError(String str, int i, int i2) {
            this.f39851a.set(false);
            this.f39852b.countDown();
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onSuccess(String str, int i, SyncResult syncResult) {
            this.f39851a.set(new NfcResponse(syncResult).isSuccess());
            this.f39852b.countDown();
        }
    }

    public class n implements OnSyncCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String[] f39853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f39854b;

        public n(String[] strArr, CountDownLatch countDownLatch) {
            this.f39853a = strArr;
            this.f39854b = countDownLatch;
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onError(String str, int i, int i2) {
            this.f39854b.countDown();
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onSuccess(String str, int i, SyncResult syncResult) {
            s7r packet;
            if (syncResult != null && (packet = syncResult.getPacket()) != null && packet.B() != null) {
                this.f39853a[0] = packet.B().o();
            }
            if (TextUtils.isEmpty(this.f39853a[0])) {
                NfcResponse nfcResponse = new NfcResponse(syncResult);
                if (nfcResponse.isSuccess()) {
                    this.f39853a[0] = Coder.bytesToHexString(nfcResponse.mData);
                }
            }
            this.f39854b.countDown();
        }
    }

    public interface o {
        void onResult(int i);
    }

    public interface p {
        DeviceContact e();
    }

    public y64(WearableDeviceModel wearableDeviceModel) {
        super(wearableDeviceModel);
        this.f39827b = ((p) EntryPointAccessors.fromApplication(AppUtil.getApp(), p.class)).e();
    }

    @Override // defpackage.byc
    public int a(String str) throws Exception {
        s7r s7rVar = new s7r();
        s7rVar.e = 5;
        s7rVar.f = 8;
        csg csgVar = new csg();
        s7rVar.Z(csgVar);
        csgVar.B(str);
        AtomicInteger atomicInteger = new AtomicInteger(0);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f39827b.call(s7rVar, true, new l(atomicInteger, countDownLatch), 8000);
        countDownLatch.await();
        return atomicInteger.get();
    }

    @Override // defpackage.byc
    public void b(String str, int i2, int i3, int i4, o oVar) {
        s7r s7rVar = new s7r();
        s7rVar.e = 5;
        s7rVar.f = 13;
        csg csgVar = new csg();
        xrg xrgVar = new xrg();
        xrgVar.c = str;
        t64 t64Var = new t64();
        t64Var.c = i3;
        t64Var.d = i4;
        xrgVar.d = new t64[]{t64Var};
        csgVar.F(xrgVar);
        s7rVar.Z(csgVar);
        this.f39827b.call(s7rVar, true, new e(oVar), 30000);
    }

    @Override // defpackage.byc
    public synchronized NfcResponse c(int i2, byte[] bArr) throws Exception {
        int length;
        int i3;
        if (bArr == null) {
            length = 0;
        } else {
            try {
                length = bArr.length;
            } catch (Throwable th) {
                throw th;
            }
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 6);
        byteBufferAllocate.putInt(i2);
        byteBufferAllocate.putShort((short) length);
        if (bArr != null) {
            byteBufferAllocate.put(bArr);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        s7r s7rVar = new s7r();
        s7rVar.e = 5;
        s7rVar.f = 0;
        csg csgVar = new csg();
        csgVar.H(byteBufferAllocate.array());
        String strByteArrayToString = com.miui.tsmclient.common.util.Coder.byteArrayToString(bArr == null ? new byte[0] : bArr, true);
        s7rVar.Z(csgVar);
        if (i2 == 194) {
            i3 = (bArr == null || !strByteArrayToString.startsWith("8050")) ? 60000 : SyncComponent.SYNC_WIFI_TIME;
        } else {
            i3 = 8000;
        }
        vqg.d("Sender send    data = " + strByteArrayToString + ", timeout = " + i3 + "  cmd:" + i2);
        this.f39827b.call(s7rVar, true, new k(i2, countDownLatch), i3);
        countDownLatch.await();
        if (!this.c.f39855a) {
            throw new NfcException(AppUtil.getApp().getString(o0j.q2));
        }
        NfcResponse nfcResponse = new NfcResponse(this.c.f39856b);
        if (nfcResponse.isSuccess()) {
            return nfcResponse;
        }
        vqg.b("sendCommand result:" + nfcResponse.mStatus);
        if (ChannelImpl.isTransferOutOption && nfcResponse.mStatus == 226) {
            nfcResponse.mData = ScResponse.STATUS_APP_NOTE_EXISTS.toBytes();
            return nfcResponse;
        }
        throw new NfcException(AppUtil.getApp().getString(o0j.O3) + "-" + nfcResponse.mStatus);
    }

    @Override // defpackage.s10, defpackage.byc
    public void checkCRSStatus(ssg.b bVar) {
    }

    @Override // defpackage.s10, defpackage.byc
    public void closeTai(ssg.b<Boolean> bVar) {
        x(false, bVar);
    }

    @Override // defpackage.byc
    public void d(wrg wrgVar) {
        o(wrgVar);
    }

    @Override // defpackage.byc
    public void e(boolean z, wrg[] wrgVarArr) {
        s7r s7rVar = new s7r();
        s7rVar.e = 5;
        s7rVar.f = 4;
        csg csgVar = new csg();
        wrg.a aVar = new wrg.a();
        aVar.d = z;
        aVar.c = wrgVarArr;
        csgVar.E(aVar);
        s7rVar.Z(csgVar);
        this.f39827b.call(s7rVar, false, null, -1);
    }

    @Override // defpackage.byc
    public void f(String str, int i2) {
        s7r s7rVar = new s7r();
        s7rVar.e = 5;
        s7rVar.f = 3;
        csg csgVar = new csg();
        csgVar.B(str);
        s7rVar.Z(csgVar);
        this.f39827b.call(s7rVar, false, null, -1);
    }

    @Override // defpackage.byc
    public NfcResponse g(byte[] bArr) throws Exception {
        throw new NfcException("ble now support this method");
    }

    @Override // defpackage.byc
    public void h(String str, int i2, int i3, int i4) {
        s7r s7rVar = new s7r();
        s7rVar.e = 5;
        s7rVar.f = 14;
        csg csgVar = new csg();
        xrg xrgVar = new xrg();
        xrgVar.c = str;
        t64 t64Var = new t64();
        t64Var.c = i3;
        t64Var.d = i4;
        xrgVar.d = new t64[]{t64Var};
        csgVar.F(xrgVar);
        s7rVar.Z(csgVar);
        this.f39827b.call(s7rVar, true, new f(), 30000);
    }

    @Override // defpackage.byc
    public String i() throws Exception {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        s7r s7rVar = new s7r();
        s7rVar.e = 5;
        s7rVar.f = 6;
        s7rVar.Z(new csg());
        String[] strArr = {null};
        this.f39827b.call(s7rVar, true, new n(strArr, countDownLatch), 30000);
        countDownLatch.await(30L, TimeUnit.SECONDS);
        String str = strArr[0];
        return str == null ? "" : str;
    }

    @Override // defpackage.byc
    public boolean j(String str, int i2) throws Exception {
        s7r s7rVar = new s7r();
        s7rVar.e = 5;
        s7rVar.f = 5;
        csg csgVar = new csg();
        csgVar.B(str);
        s7rVar.Z(csgVar);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f39827b.call(s7rVar, true, new m(atomicBoolean, countDownLatch), 30000);
        countDownLatch.await();
        return atomicBoolean.get();
    }

    @Override // defpackage.byc
    public boolean k() {
        return true;
    }

    @Override // defpackage.byc
    public CardSwitcherBean l(String str, int i2) throws Exception {
        s7r s7rVar = new s7r();
        s7rVar.e = 5;
        s7rVar.f = 11;
        s7rVar.Z(new csg());
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        this.f39827b.call(s7rVar, true, new d(atomicReference, countDownLatch), 30000);
        countDownLatch.await(30L, TimeUnit.SECONDS);
        SyncResult syncResult = (SyncResult) atomicReference.get();
        if (syncResult != null && syncResult.isNotSupport()) {
            throw new NfcException(AppUtil.getApp().getString(o0j.common_not_support));
        }
        if (syncResult == null || !syncResult.isSuccess() || syncResult.getPacket().B() == null) {
            return null;
        }
        xrg[] xrgVarArr = syncResult.getPacket().B().s().c;
        if (xrgVarArr == null) {
            vqg.d("getCardSwitcherTimeList null");
            return null;
        }
        for (xrg xrgVar : xrgVarArr) {
            if (str.equalsIgnoreCase(xrgVar.c)) {
                LinkedList linkedList = new LinkedList();
                for (t64 t64Var : xrgVar.d) {
                    linkedList.add(Integer.valueOf((t64Var.c * 60) + t64Var.d));
                }
                return new CardSwitcherBean(xrgVar.c, i2, linkedList);
            }
        }
        return null;
    }

    @Override // defpackage.byc
    public MifareClassicTag m(List<SectorKey> list) throws Exception {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        s7r s7rVar = new s7r();
        s7rVar.e = 5;
        s7rVar.f = 20;
        csg csgVar = new csg();
        s7rVar.Z(csgVar);
        ksg.a aVar = new ksg.a();
        aVar.c = new ksg[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            SectorKey sectorKey = list.get(i2);
            ksg ksgVar = new ksg();
            ksgVar.c = sectorKey.getSectorId();
            List<String> keyList = sectorKey.getKeyList();
            ksgVar.d = new byte[keyList.size()][];
            for (int i3 = 0; i3 < keyList.size(); i3++) {
                ksgVar.d[i3] = Coder.hexStringToBytes(keyList.get(i3));
            }
            aVar.c[i2] = ksgVar;
        }
        csgVar.K(aVar);
        AtomicReference atomicReference = new AtomicReference();
        this.f39827b.call(s7rVar, true, new j(atomicReference, countDownLatch), 120000);
        countDownLatch.await(120000L, TimeUnit.SECONDS);
        SyncResult syncResult = (SyncResult) atomicReference.get();
        if (syncResult == null || syncResult.getPacket() == null || syncResult.getPacket().B() == null) {
            throw new NfcException("probeResponse is null");
        }
        zrg zrgVarX = syncResult.getPacket().B().x();
        MifareClassicTag mifareClassicTag = new MifareClassicTag();
        urg urgVar = zrgVarX.c;
        mifareClassicTag.setUid(Coder.bytesToHexString(urgVar.c));
        mifareClassicTag.setSak(Coder.bytesToHexString(Coder.shortToByte((short) urgVar.d)));
        mifareClassicTag.setAtqa(Coder.bytesToHexString(urgVar.e));
        mifareClassicTag.setSize(urgVar.f);
        mifareClassicTag.setConsumedTime(zrgVarX.e);
        vqg.d("keyList:" + list.size() + "  crackSectors:" + zrgVarX.d.length);
        if (list.size() != zrgVarX.d.length) {
            throw new NfcException("keyList.size() != crackCardData.crackSectors.length");
        }
        ArrayList arrayList = new ArrayList();
        for (asg asgVar : zrgVarX.d) {
            Sector sector = new Sector();
            sector.setCountOfVerifiedKey(asgVar.d);
            sector.setIndex(asgVar.c.c);
            sector.setEncrypted(asgVar.c.d);
            sector.setKeyA(Coder.bytesToHexString(asgVar.c.e));
            sector.setKeyB(Coder.bytesToHexString(asgVar.c.f));
            sector.setContent(Coder.bytesToHexString(asgVar.c.g));
            arrayList.add(sector);
        }
        mifareClassicTag.setSectorList(arrayList);
        return mifareClassicTag;
    }

    @Override // defpackage.byc
    public int n(int i2, int i3, String str, String str2) {
        s7r s7rVar = new s7r();
        s7rVar.e = 5;
        s7rVar.f = 1;
        csg csgVar = new csg();
        bsg bsgVar = new bsg();
        bsgVar.d = i2;
        bsgVar.c = i3;
        bsgVar.e = false;
        bsgVar.g = str;
        bsgVar.f = str2;
        csgVar.J(bsgVar);
        s7rVar.Z(csgVar);
        this.f39827b.call(s7rVar, false, null, 60000);
        return 0;
    }

    @Override // defpackage.byc
    public void o(wrg wrgVar) {
        s7r s7rVar = new s7r();
        s7rVar.e = 5;
        s7rVar.f = 2;
        csg csgVar = new csg();
        csgVar.D(wrgVar);
        s7rVar.Z(csgVar);
        this.f39827b.call(s7rVar, false, null, -1);
    }

    @Override // defpackage.s10, defpackage.byc
    public void openTai(ssg.b<Boolean> bVar) {
        x(true, bVar);
    }

    @Override // defpackage.byc
    public void p(String str, int i2) {
        s7r s7rVar = new s7r();
        s7rVar.e = 5;
        s7rVar.f = 7;
        csg csgVar = new csg();
        trg trgVar = new trg();
        trgVar.c = str;
        trgVar.d = i2;
        csgVar.C(trgVar);
        s7rVar.Z(csgVar);
        this.f39827b.call(s7rVar, false, null, 30000);
    }

    @Override // defpackage.s10, defpackage.byc
    public void pinStatus(ssg.b bVar) {
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 9;
        this.f39827b.call(s7rVar, true, new g(bVar), 60000);
    }

    @Override // defpackage.byc
    public hsg q(ProbeParam probeParam) throws Exception {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        s7r s7rVar = new s7r();
        s7rVar.e = 5;
        s7rVar.f = 18;
        csg csgVar = new csg();
        gsg gsgVar = new gsg();
        gsgVar.c = probeParam.getProbeSectorIndex();
        gsgVar.d = probeParam.getMode();
        gsgVar.g = true;
        gsgVar.f = new fsg();
        Nonce nonce = probeParam.getNonce();
        gsgVar.f.d = nonce.getDeviation();
        gsgVar.f.c = nonce.getMedian();
        if (gsgVar.d == 0) {
            gsgVar.f.e = new int[nonce.getDistancesNumber()];
        } else {
            gsgVar.f.e = nonce.getDistances();
        }
        MFTag tag = probeParam.getTag();
        isg isgVar = new isg();
        gsgVar.e = isgVar;
        isgVar.c = tag.getUid();
        gsgVar.e.d = tag.getExploitSector();
        gsgVar.e.e = new esg();
        MFTag.ProbeSector probeSector = tag.getSectors()[tag.getExploitSector()];
        gsgVar.e.e.c = probeSector.isFoundKeyA();
        gsgVar.e.e.d = probeSector.isFoundKeyB();
        gsgVar.e.e.e = probeSector.getKeyA();
        csgVar.L(gsgVar);
        s7rVar.Z(csgVar);
        AtomicReference atomicReference = new AtomicReference();
        this.f39827b.call(s7rVar, true, new i(atomicReference, countDownLatch), 30000);
        countDownLatch.await(240L, TimeUnit.SECONDS);
        SyncResult syncResult = (SyncResult) atomicReference.get();
        if (syncResult == null || syncResult.getPacket() == null || syncResult.getPacket().B() == null) {
            throw new NfcException("probeResponse is null");
        }
        hsg hsgVarY = syncResult.getPacket().B().y();
        if (hsgVarY != null) {
            return hsgVarY;
        }
        throw new NfcException("probeResponse is null");
    }

    @Override // defpackage.byc
    public MifareTag r(int i2) throws Exception {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        s7r s7rVar = new s7r();
        s7rVar.e = 5;
        s7rVar.f = 1;
        csg csgVar = new csg();
        bsg bsgVar = new bsg();
        bsgVar.d = 0;
        bsgVar.c = i2;
        bsgVar.e = true;
        csgVar.J(bsgVar);
        s7rVar.Z(csgVar);
        AtomicReference atomicReference = new AtomicReference();
        this.f39827b.call(s7rVar, true, new a(atomicReference, countDownLatch), 60000);
        countDownLatch.await(120L, TimeUnit.SECONDS);
        SyncResult syncResult = (SyncResult) atomicReference.get();
        if (syncResult == null || syncResult.getPacket() == null || syncResult.getPacket().B() == null) {
            if (syncResult == null || syncResult.getCode() != -1) {
                return null;
            }
            throw new NfcException(AppUtil.getApp().getResources().getString(o0j.R5));
        }
        csg csgVarB = syncResult.getPacket().B();
        vqg.d("readMifareTag  getCardData():" + csgVarB.r() + " getSuperCardData:" + csgVarB.z());
        if (csgVarB.r() != null) {
            MifareTag mifareTag = new MifareTag();
            vrg vrgVarR = csgVarB.r();
            mifareTag.setUid(Coder.bytesToHexString(vrgVarR.c));
            mifareTag.setSize(vrgVarR.f);
            mifareTag.setSak(Coder.bytesToHexString(Coder.shortToByte((short) vrgVarR.d)));
            mifareTag.setAtqa(Coder.bytesToHexString(vrgVarR.e));
            mifareTag.setBlockContent(vrgVarR.g);
            return mifareTag;
        }
        if (csgVarB.z() == null) {
            if (csgVarB.v() == null) {
                return null;
            }
            NfcResponse nfcResponse = new NfcResponse(syncResult);
            vqg.d("readMifareTag  status:" + nfcResponse.mStatus);
            int i3 = nfcResponse.mStatus;
            if (i3 == 227) {
                throw new NfcException(AppUtil.getApp().getString(o0j.N5));
            }
            if (i3 == 228) {
                throw new EncryptionCardException(null);
            }
            throw new NfcException(AppUtil.getApp().getString(o0j.M5));
        }
        lsg lsgVarZ = csgVarB.z();
        MifareClassicTag mifareClassicTag = new MifareClassicTag();
        urg urgVar = lsgVarZ.c;
        mifareClassicTag.setUid(Coder.bytesToHexString(urgVar.c));
        mifareClassicTag.setSak(Coder.bytesToHexString(Coder.shortToByte((short) urgVar.d)));
        mifareClassicTag.setAtqa(Coder.bytesToHexString(urgVar.e));
        mifareClassicTag.setSize(urgVar.f);
        ArrayList arrayList = new ArrayList();
        for (jsg jsgVar : lsgVarZ.d) {
            Sector sector = new Sector();
            sector.setIndex(jsgVar.c);
            sector.setEncrypted(jsgVar.d);
            sector.setKeyA(Coder.bytesToHexString(jsgVar.e));
            sector.setKeyB(Coder.bytesToHexString(jsgVar.f));
            if (jsgVar.d) {
                sector.setContent("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
            } else {
                sector.setContent(Coder.bytesToHexString(jsgVar.g));
            }
            arrayList.add(sector);
        }
        mifareClassicTag.setSectorList(arrayList);
        throw new SupperCardException(mifareClassicTag);
    }

    @Override // defpackage.s10
    public void s() {
        super.s();
    }

    @Override // defpackage.s10
    public int t() throws Exception {
        s7r s7rVar = new s7r();
        s7rVar.e = 5;
        s7rVar.f = 10;
        s7rVar.Z(new csg());
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        this.f39827b.call(s7rVar, true, new c(atomicReference, countDownLatch), 4000);
        countDownLatch.await(60000L, TimeUnit.MILLISECONDS);
        SyncResult syncResult = (SyncResult) atomicReference.get();
        if (syncResult == null || syncResult.isNotSupport()) {
            vqg.d("getCapability not support");
            return bmg.f4366a;
        }
        csg csgVarB = syncResult.getPacket().B();
        if (csgVarB == null) {
            vqg.d("getCapability nfcRet is null");
            return bmg.f4367b;
        }
        int iQ = csgVarB.q();
        vqg.d("getCapability  capability:" + iQ);
        return iQ;
    }

    @Override // defpackage.s10
    public void u() {
        super.u();
    }

    @Override // defpackage.s10
    public yrg.a v(yrg.a aVar) throws Exception {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        s7r s7rVar = new s7r();
        s7rVar.e = 5;
        s7rVar.f = 16;
        csg csgVar = new csg();
        csgVar.I(aVar);
        s7rVar.Z(csgVar);
        AtomicReference atomicReference = new AtomicReference();
        this.f39827b.call(s7rVar, true, new b(atomicReference, countDownLatch), 120000);
        countDownLatch.await();
        SyncResult syncResult = (SyncResult) atomicReference.get();
        if (syncResult != null || !this.c.f39855a) {
            throw new NfcException("sendBatchCommand " + this.c.c);
        }
        s7r packet = syncResult.getPacket();
        if (packet == null || packet.B() == null) {
            vqg.d("sendBatchCommand nfc is null");
            throw new NfcException("sendBatchCommand nfc is null");
        }
        vqg.d("sendBatchCommand nfc is not null");
        return packet.B().w();
    }

    public final void x(boolean z, ssg.b<Boolean> bVar) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        s7r s7rVar = new s7r();
        s7rVar.e = 5;
        if (z) {
            s7rVar.f = 17;
        } else {
            s7rVar.f = 19;
        }
        this.f39827b.call(s7rVar, true, new h(bVar, countDownLatch), 30000);
    }

    public class q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f39855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SyncResult f39856b;
        public int c;

        public q(boolean z, SyncResult syncResult) {
            this.f39855a = z;
            this.f39856b = syncResult;
        }

        public q(boolean z, int i) {
            this.f39855a = z;
            this.c = i;
        }
    }
}
