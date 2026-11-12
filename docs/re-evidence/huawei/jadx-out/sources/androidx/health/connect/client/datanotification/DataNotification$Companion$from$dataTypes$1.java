package androidx.health.connect.client.datanotification;

import androidx.health.platform.client.proto.DataProto;
import defpackage.zcn;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class DataNotification$Companion$from$dataTypes$1 extends zcn implements Function1<byte[], DataProto.DataType> {
    public static final DataNotification$Companion$from$dataTypes$1 INSTANCE = new DataNotification$Companion$from$dataTypes$1();

    @Override // kotlin.jvm.functions.Function1
    public final DataProto.DataType invoke(byte[] bArr) {
        return DataProto.DataType.parseFrom(bArr);
    }

    DataNotification$Companion$from$dataTypes$1() {
        super(1, DataProto.DataType.class, "parseFrom", "parseFrom([B)Landroidx/health/platform/client/proto/DataProto$DataType;", 0);
    }
}
