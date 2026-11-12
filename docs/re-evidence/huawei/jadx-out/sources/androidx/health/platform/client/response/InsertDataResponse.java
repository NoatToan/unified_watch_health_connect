package androidx.health.platform.client.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.platform.client.impl.data.ProtoParcelable;
import androidx.health.platform.client.impl.data.SharedMemory27Impl;
import androidx.health.platform.client.proto.InvalidProtocolBufferException;
import androidx.health.platform.client.proto.ResponseProto;
import defpackage.zcm;
import defpackage.zcp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/health/platform/client/response/InsertDataResponse;", "Landroidx/health/platform/client/impl/data/ProtoParcelable;", "Landroidx/health/platform/client/proto/ResponseProto$InsertDataResponse;", "dataPointUids", "", "", "<init>", "(Ljava/util/List;)V", "getDataPointUids", "()Ljava/util/List;", "proto", "getProto", "()Landroidx/health/platform/client/proto/ResponseProto$InsertDataResponse;", "Companion", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InsertDataResponse extends ProtoParcelable<ResponseProto.InsertDataResponse> {
    public static final Parcelable.Creator<InsertDataResponse> CREATOR;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<String> dataPointUids;

    public final List<String> getDataPointUids() {
        return this.dataPointUids;
    }

    public InsertDataResponse(List<String> list) {
        zcp.c(list, "");
        this.dataPointUids = list;
    }

    @Override // androidx.health.platform.client.impl.data.ProtoData
    public ResponseProto.InsertDataResponse getProto() {
        ResponseProto.InsertDataResponse insertDataResponseBuild = ResponseProto.InsertDataResponse.newBuilder().addAllDataPointUid(this.dataPointUids).build();
        zcp.b((Object) insertDataResponseBuild, "");
        return insertDataResponseBuild;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\nR\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Landroidx/health/platform/client/response/InsertDataResponse$Companion;", "", "<init>", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Landroidx/health/platform/client/response/InsertDataResponse;", "fromProto", "proto", "Landroidx/health/platform/client/proto/ResponseProto$InsertDataResponse;", "fromProto$connect_client_release", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final InsertDataResponse fromProto$connect_client_release(ResponseProto.InsertDataResponse proto) {
            zcp.c(proto, "");
            List<String> dataPointUidList = proto.getDataPointUidList();
            zcp.b((Object) dataPointUidList, "");
            return new InsertDataResponse(dataPointUidList);
        }

        public /* synthetic */ Companion(zcm zcmVar) {
            this();
        }
    }

    static {
        ProtoParcelable.Companion companion = ProtoParcelable.INSTANCE;
        CREATOR = new Parcelable.Creator<InsertDataResponse>() { // from class: androidx.health.platform.client.response.InsertDataResponse$special$$inlined$newCreator$connect_client_release$1
            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r3v9, types: [androidx.health.platform.client.impl.data.ProtoParcelable, androidx.health.platform.client.response.InsertDataResponse] */
            @Override // android.os.Parcelable.Creator
            public InsertDataResponse createFromParcel(Parcel source) throws InvalidProtocolBufferException {
                zcp.c(source, "");
                int i = source.readInt();
                if (i != 0) {
                    if (i == 1) {
                        return (ProtoParcelable) SharedMemory27Impl.INSTANCE.parseParcelUsingSharedMemory(source, new Function1<byte[], InsertDataResponse>() { // from class: androidx.health.platform.client.response.InsertDataResponse$special$$inlined$newCreator$connect_client_release$1.1
                            @Override // kotlin.jvm.functions.Function1
                            public final InsertDataResponse invoke(byte[] bArr) throws InvalidProtocolBufferException {
                                zcp.c(bArr, "");
                                ResponseProto.InsertDataResponse from = ResponseProto.InsertDataResponse.parseFrom(bArr);
                                InsertDataResponse.Companion companion2 = InsertDataResponse.INSTANCE;
                                zcp.e(from);
                                return companion2.fromProto$connect_client_release(from);
                            }
                        });
                    }
                    throw new IllegalArgumentException("Unknown storage: " + i);
                }
                byte[] bArrCreateByteArray = source.createByteArray();
                if (bArrCreateByteArray == null) {
                    return null;
                }
                ResponseProto.InsertDataResponse from = ResponseProto.InsertDataResponse.parseFrom(bArrCreateByteArray);
                InsertDataResponse.Companion companion2 = InsertDataResponse.INSTANCE;
                zcp.e(from);
                return companion2.fromProto$connect_client_release(from);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public InsertDataResponse[] newArray(int size) {
                return new InsertDataResponse[size];
            }
        };
    }
}
