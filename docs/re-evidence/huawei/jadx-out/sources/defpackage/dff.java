package defpackage;

import com.huawei.health.basesport.wearengine.DataReceiver;
import com.huawei.health.basesport.wearengine.SportBaseEngineManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes7.dex */
public class dff implements DataReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected WeakReference<SportBaseEngineManager> f31729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected IBaseResponseCallback f31730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f31731c;
    protected int d;
    protected int e;

    public dff(SportBaseEngineManager sportBaseEngineManager, String str, int i, int i2, IBaseResponseCallback iBaseResponseCallback) {
        this.f31729a = new WeakReference<>(sportBaseEngineManager);
        this.f31731c = str;
        this.d = i;
        this.e = i2;
        this.f31730b = iBaseResponseCallback;
    }

    @Override // com.huawei.health.basesport.wearengine.DataReceiver
    public boolean isMatch(int i) {
        return this.e == i;
    }

    @Override // com.huawei.health.basesport.wearengine.DataReceiver
    public void onDataReceived(dey deyVar, int i, byte[] bArr) {
        if (deyVar == null) {
            LogUtil.j(this.f31731c, "SendMsgDataReceiver onDataReceived msg head is null, pls check.");
            return;
        }
        if (deyVar.c() != this.d || deyVar.a() != this.e) {
            LogUtil.j(this.f31731c, "SendMsgDataReceiver onDataReceived msg not match, this type is : ", Integer.valueOf(this.d), " received is: ", Integer.valueOf(deyVar.c()), " this msg id is:", Integer.valueOf(this.e), " received msg id is: ", Integer.valueOf(deyVar.a()));
            return;
        }
        SportBaseEngineManager sportBaseEngineManager = this.f31729a.get();
        if (sportBaseEngineManager == null) {
            LogUtil.j(this.f31731c, "SendMsgDataReceiver onDataReceived HiWearEngineFitnessManager is null, pls check");
            return;
        }
        if (bArr != null && bArr.length >= 4) {
            LogUtil.a(this.f31731c, "SendMsgDataReceiver onDataReceived type is: ", Integer.valueOf(this.d), " session id is: ", Integer.valueOf(this.e), " dataContents is: ", eeq.e(bArr));
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            int i2 = byteBufferWrap.getInt();
            this.f31730b.a(i2 != 1 ? 0 : 1, Integer.valueOf(i2));
        } else {
            LogUtil.j(this.f31731c, "SendMsgDataReceiver onDataReceived type is: ", Integer.valueOf(this.d), " session id is: ", Integer.valueOf(this.e), " dataContents length error");
        }
        sportBaseEngineManager.unregisterCallback(this, this.d);
    }

    public int e() {
        return this.d;
    }
}
