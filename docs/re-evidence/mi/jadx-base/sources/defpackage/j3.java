package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardIdent;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0005H\u0016J\u0016\u0010\u0007\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lj3;", "Loq;", "", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardIdent;", "", "Lol;", "originResponse", PluginDeviceInfo.FMODEL, "value", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class j3 implements oq<List<? extends HMNFCCardIdent>, byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f22364a = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lj3$a;", "", "", "ITEM_HEAD_LEN", "I", "PACKET_LEN_SIZE", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.oq
    @NotNull
    public ol<List<? extends HMNFCCardIdent>> a(@NotNull ol<byte[]> originResponse) {
        Intrinsics.checkNotNullParameter(originResponse, "originResponse");
        throw new NotImplementedError("An operation is not implemented: 不实现");
    }

    @Override // defpackage.u4
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public byte[] encode(@NotNull List<? extends HMNFCCardIdent> value) throws IOException {
        Intrinsics.checkNotNullParameter(value, "value");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(value.size());
        for (HMNFCCardIdent hMNFCCardIdent : value) {
            byteArrayOutputStream.write(tet.r(hMNFCCardIdent.getAidLen() + 2, 2));
            byteArrayOutputStream.write(hMNFCCardIdent.getType().getValue());
            if (hMNFCCardIdent.getAidLen() > 0) {
                byteArrayOutputStream.write(hMNFCCardIdent.getAidLen());
                byteArrayOutputStream.write(tet.y(hMNFCCardIdent.getAid()));
            } else {
                byteArrayOutputStream.write(0);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "bos.toByteArray()");
        return byteArray;
    }

    @Override // defpackage.u4
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public List<HMNFCCardIdent> decode(@NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new NotImplementedError("An operation is not implemented: 不实现");
    }
}
