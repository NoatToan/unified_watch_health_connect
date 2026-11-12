package androidx.health.platform.client.response;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.platform.client.impl.data.ProtoParcelable;
import androidx.health.platform.client.impl.data.SharedMemory27Impl;
import androidx.health.platform.client.proto.InvalidProtocolBufferException;
import androidx.health.platform.client.proto.q1;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/health/platform/client/response/GetChangesTokenResponse;", "Landroidx/health/platform/client/impl/data/ProtoParcelable;", "Landroidx/health/platform/client/proto/q1;", "proto", "Landroidx/health/platform/client/proto/q1;", "getProto", "()Landroidx/health/platform/client/proto/q1;", "<init>", "(Landroidx/health/platform/client/proto/q1;)V", "Companion", "connect-client_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nGetChangesTokenResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetChangesTokenResponse.kt\nandroidx/health/platform/client/response/GetChangesTokenResponse\n+ 2 ProtoParcelable.kt\nandroidx/health/platform/client/impl/data/ProtoParcelable$Companion\n*L\n1#1,35:1\n72#2:36\n*S KotlinDebug\n*F\n+ 1 GetChangesTokenResponse.kt\nandroidx/health/platform/client/response/GetChangesTokenResponse\n*L\n29#1:36\n*E\n"})
public final class GetChangesTokenResponse extends ProtoParcelable<q1> {

    @NotNull
    private final q1 proto;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<GetChangesTokenResponse> CREATOR = new Parcelable.Creator<GetChangesTokenResponse>() { // from class: androidx.health.platform.client.response.GetChangesTokenResponse$special$$inlined$newCreator$connect_client_release$1
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Type inference failed for: r4v6, types: [androidx.health.platform.client.impl.data.ProtoParcelable, androidx.health.platform.client.response.GetChangesTokenResponse] */
        @Override // android.os.Parcelable.Creator
        @SuppressLint({"NewApi"})
        @Nullable
        public GetChangesTokenResponse createFromParcel(@NotNull Parcel source) throws InvalidProtocolBufferException {
            Intrinsics.checkNotNullParameter(source, "source");
            int i = source.readInt();
            if (i != 0) {
                if (i == 1) {
                    return (ProtoParcelable) SharedMemory27Impl.INSTANCE.parseParcelUsingSharedMemory(source, new Function1<byte[], GetChangesTokenResponse>() { // from class: androidx.health.platform.client.response.GetChangesTokenResponse$special$$inlined$newCreator$connect_client_release$1.1
                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final GetChangesTokenResponse invoke(@NotNull byte[] it) throws InvalidProtocolBufferException {
                            Intrinsics.checkNotNullParameter(it, "it");
                            q1 proto = q1.Q(it);
                            Intrinsics.checkNotNullExpressionValue(proto, "proto");
                            return new GetChangesTokenResponse(proto);
                        }
                    });
                }
                throw new IllegalArgumentException("Unknown storage: " + i);
            }
            byte[] bArrCreateByteArray = source.createByteArray();
            if (bArrCreateByteArray == null) {
                return null;
            }
            q1 proto = q1.Q(bArrCreateByteArray);
            Intrinsics.checkNotNullExpressionValue(proto, "proto");
            return new GetChangesTokenResponse(proto);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public GetChangesTokenResponse[] newArray(int size) {
            return new GetChangesTokenResponse[size];
        }
    };

    public GetChangesTokenResponse(@NotNull q1 proto) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        this.proto = proto;
    }

    @Override // androidx.health.platform.client.impl.data.ProtoData
    @NotNull
    public q1 getProto() {
        return this.proto;
    }
}
