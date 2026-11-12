package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardCtl;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardIdent;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardStatus;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardType;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0016¨\u0006\n"}, d2 = {"Lo3;", "Loq;", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardStatus;", "", "value", PluginDeviceInfo.FMODEL, "Lol;", "originResponse", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class o3 implements oq<HMNFCCardStatus, byte[]> {
    @Override // defpackage.u4
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public byte[] encode(@NotNull HMNFCCardStatus value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new NotImplementedError("An operation is not implemented: 不实现");
    }

    @Override // defpackage.u4
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public HMNFCCardStatus decode(@NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        w2 w2Var = new w2(value, 0, 2, null);
        HMNFCCardStatus hMNFCCardStatus = new HMNFCCardStatus();
        hMNFCCardStatus.setCardCtl(HMNFCCardCtl.from((byte) w2Var.c()));
        if (hMNFCCardStatus.getCardCtl() == HMNFCCardCtl.READ) {
            HMNFCCardType hMNFCCardTypeFrom = HMNFCCardType.from((byte) w2Var.c());
            int iC = w2Var.c();
            hMNFCCardStatus.setCardIdent(new HMNFCCardIdent(hMNFCCardTypeFrom, iC, y2.c(w2Var.a(iC))));
        }
        return hMNFCCardStatus;
    }

    @Override // defpackage.oq
    @NotNull
    public ol<HMNFCCardStatus> a(@NotNull ol<byte[]> originResponse) {
        Intrinsics.checkNotNullParameter(originResponse, "originResponse");
        return C3622pq.a(this, originResponse);
    }
}
