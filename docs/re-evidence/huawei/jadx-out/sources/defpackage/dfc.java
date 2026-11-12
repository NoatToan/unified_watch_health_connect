package defpackage;

import com.huawei.health.basesport.wearengine.SportBaseEngineManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes7.dex */
public class dfc extends dff {
    public dfc(SportBaseEngineManager sportBaseEngineManager, String str, int i, int i2, IBaseResponseCallback iBaseResponseCallback) {
        super(sportBaseEngineManager, str, i, i2, iBaseResponseCallback);
    }

    @Override // defpackage.dff, com.huawei.health.basesport.wearengine.DataReceiver
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
        LogUtil.j(this.f31731c, "SendMsgDataReceiver onDataReceived type is: ", Integer.valueOf(this.d), " session id is: ", Integer.valueOf(this.e), " dataContents length error");
        if (bArr != null && bArr.length >= 8) {
            LogUtil.a(this.f31731c, "TWO_INT_BYTE_SIZE dataContents is: ", eeq.e(bArr));
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            int i2 = byteBufferWrap.getInt();
            this.f31730b.a(i2 == 1 ? 1 : 0, new int[]{i2, byteBufferWrap.getInt()});
        } else if (bArr != null && bArr.length >= 4) {
            LogUtil.a(this.f31731c, "INT_BYTE_SIZE dataContents is: ", eeq.e(bArr));
            ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr);
            byteBufferWrap2.order(ByteOrder.LITTLE_ENDIAN);
            int i3 = byteBufferWrap2.getInt();
            this.f31730b.a(i3 == 1 ? 1 : 0, Integer.valueOf(i3));
        }
        sportBaseEngineManager.unregisterCallback(this, this.d);
    }
}
