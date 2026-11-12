package defpackage;

import com.google.protobuf.InvalidProtocolBufferException;
import com.xiaomi.mi_connect.nfc.exception.NfcTagDataCorruptException;
import com.xiaomi.mi_connect_service.proto.AttributeProto;

/* JADX INFO: loaded from: classes11.dex */
public class otg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f29667a = {0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f29668b = {0};

    public ptg a(byte[] bArr) throws NfcTagDataCorruptException {
        try {
            AttributeProto.AttrOps from = AttributeProto.AttrOps.parseFrom(bArr);
            if (from.hasAdvData()) {
                return ptg.a(from.getAdvData().getAppsData(0).toByteArray());
            }
            throw new NfcTagDataCorruptException("no adv data");
        } catch (InvalidProtocolBufferException e) {
            throw new NfcTagDataCorruptException(e.getMessage());
        } catch (RuntimeException e2) {
            throw new NfcTagDataCorruptException(e2.getMessage());
        }
    }
}
