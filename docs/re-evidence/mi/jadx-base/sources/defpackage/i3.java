package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCBlockInfo;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardInfo;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¨\u0006\f"}, d2 = {"Li3;", "Loq;", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardInfo;", "", "value", PluginDeviceInfo.FMODEL, "Lol;", "originResponse", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCBlockInfo;", PluginDeviceInfo.FDESC, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class i3 implements oq<HMNFCCardInfo, byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f20722a = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Li3$a;", "", "", "BLOCK_LEN", "I", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.u4
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public byte[] encode(@NotNull HMNFCCardInfo value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    public final HMNFCBlockInfo b(byte[] value) {
        HMNFCBlockInfo hMNFCBlockInfo = new HMNFCBlockInfo();
        w2 w2Var = new w2(value, 0, 2, null);
        hMNFCBlockInfo.setIndex(w2Var.e());
        hMNFCBlockInfo.setData(w2.a(w2Var, 0, 1, null));
        return hMNFCBlockInfo;
    }

    @Override // defpackage.u4
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public HMNFCCardInfo decode(@NotNull byte[] value) throws Exception {
        Intrinsics.checkNotNullParameter(value, "value");
        l9 l9VarDecode = new js().decode(value);
        HMNFCCardInfo hMNFCCardInfo = new HMNFCCardInfo();
        w2 w2Var = new w2(y2.a(value), 0, 2, null);
        if (l9VarDecode instanceof im.d) {
            hMNFCCardInfo.setEncrypt(w2Var.b());
            if (hMNFCCardInfo.isEncrypt()) {
                hMNFCCardInfo.setResult(9);
            }
            hMNFCCardInfo.setAtqa(y2.c(w2Var.a(2)));
            hMNFCCardInfo.setSak(y2.c(w2Var.a(1)));
            hMNFCCardInfo.setUidLen(w2Var.c());
            hMNFCCardInfo.setUid(y2.c(w2Var.a(hMNFCCardInfo.getUidLen())));
            hMNFCCardInfo.setBlockNum(w2Var.e());
        }
        ArrayList arrayList = new ArrayList();
        int blockNum = hMNFCCardInfo.getBlockNum();
        for (int i = 0; i < blockNum; i++) {
            arrayList.add(b(w2Var.a(18)));
        }
        if (w2Var.h() > 0) {
            throw new Exception("解析Card异常:数据仍有剩余");
        }
        if (true ^ arrayList.isEmpty()) {
            hMNFCCardInfo.setBlockInfos(new ArrayList<>(arrayList));
        }
        return hMNFCCardInfo;
    }

    @Override // defpackage.oq
    @NotNull
    public ol<HMNFCCardInfo> a(@NotNull ol<byte[]> originResponse) {
        Object objM886constructorimpl;
        Intrinsics.checkNotNullParameter(originResponse, "originResponse");
        if (originResponse instanceof Timeout) {
            return new Timeout(null, 1, null);
        }
        if (originResponse instanceof Failure) {
            return new Failure(((Failure) originResponse).getMsg(), 0, 2, null);
        }
        if (!(originResponse instanceof fu)) {
            return ol.a.a(ol.f29263a, "未知错误类型", 0, 2, null);
        }
        byte[] bArrB = y2.b((byte[]) ((fu) originResponse).a());
        l9 l9VarDecode = new js().decode(bArrB);
        if (!(l9VarDecode instanceof im.d) && !(l9VarDecode instanceof im.b)) {
            return new Failure(l9VarDecode.getDesc(), l9VarDecode.getF24791a());
        }
        try {
            Result.Companion companion = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(new fu(decode(bArrB)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
        if (thM889exceptionOrNullimpl != null) {
            objM886constructorimpl = new Failure("解析卡数据失败：" + thM889exceptionOrNullimpl, 0, 2, null);
        }
        return (ol) objM886constructorimpl;
    }
}
