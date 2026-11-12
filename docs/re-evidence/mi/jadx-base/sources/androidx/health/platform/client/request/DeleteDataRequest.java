package androidx.health.platform.client.request;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.platform.client.impl.data.ProtoParcelable;
import androidx.health.platform.client.impl.data.SharedMemory27Impl;
import androidx.health.platform.client.proto.InvalidProtocolBufferException;
import androidx.health.platform.client.proto.a1;
import androidx.health.platform.client.proto.c1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\r\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Landroidx/health/platform/client/request/DeleteDataRequest;", "Landroidx/health/platform/client/impl/data/ProtoParcelable;", "Landroidx/health/platform/client/proto/c1;", "", "Landroidx/health/platform/client/proto/a1;", "uids", "Ljava/util/List;", "getUids", "()Ljava/util/List;", "clientIds", "getClientIds", "getProto", "()Landroidx/health/platform/client/proto/c1;", "proto", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "Companion", "connect-client_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDeleteDataRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeleteDataRequest.kt\nandroidx/health/platform/client/request/DeleteDataRequest\n+ 2 ProtoParcelable.kt\nandroidx/health/platform/client/impl/data/ProtoParcelable$Companion\n*L\n1#1,56:1\n72#2:57\n*S KotlinDebug\n*F\n+ 1 DeleteDataRequest.kt\nandroidx/health/platform/client/request/DeleteDataRequest\n*L\n44#1:57\n*E\n"})
public final class DeleteDataRequest extends ProtoParcelable<c1> {

    @NotNull
    private final List<a1> clientIds;

    @NotNull
    private final List<a1> uids;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final Parcelable.Creator<DeleteDataRequest> CREATOR = new Parcelable.Creator<DeleteDataRequest>() { // from class: androidx.health.platform.client.request.DeleteDataRequest$special$$inlined$newCreator$connect_client_release$1
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Type inference failed for: r4v7, types: [androidx.health.platform.client.impl.data.ProtoParcelable, androidx.health.platform.client.request.DeleteDataRequest] */
        @Override // android.os.Parcelable.Creator
        @SuppressLint({"NewApi"})
        @Nullable
        public DeleteDataRequest createFromParcel(@NotNull Parcel source) throws InvalidProtocolBufferException {
            Intrinsics.checkNotNullParameter(source, "source");
            int i = source.readInt();
            if (i != 0) {
                if (i == 1) {
                    return (ProtoParcelable) SharedMemory27Impl.INSTANCE.parseParcelUsingSharedMemory(source, new Function1<byte[], DeleteDataRequest>() { // from class: androidx.health.platform.client.request.DeleteDataRequest$special$$inlined$newCreator$connect_client_release$1.1
                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final DeleteDataRequest invoke2(@NotNull byte[] it) throws InvalidProtocolBufferException {
                            Intrinsics.checkNotNullParameter(it, "it");
                            c1 proto = c1.Y(it);
                            DeleteDataRequest.Companion companion = DeleteDataRequest.INSTANCE;
                            Intrinsics.checkNotNullExpressionValue(proto, "proto");
                            return companion.fromProto$connect_client_release(proto);
                        }
                    });
                }
                throw new IllegalArgumentException("Unknown storage: " + i);
            }
            byte[] bArrCreateByteArray = source.createByteArray();
            if (bArrCreateByteArray == null) {
                return null;
            }
            c1 proto = c1.Y(bArrCreateByteArray);
            DeleteDataRequest.Companion companion = DeleteDataRequest.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(proto, "proto");
            return companion.fromProto$connect_client_release(proto);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public DeleteDataRequest[] newArray(int size) {
            return new DeleteDataRequest[size];
        }
    };

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Landroidx/health/platform/client/request/DeleteDataRequest$Companion;", "", "Landroidx/health/platform/client/proto/c1;", "proto", "Landroidx/health/platform/client/request/DeleteDataRequest;", "fromProto$connect_client_release", "(Landroidx/health/platform/client/proto/c1;)Landroidx/health/platform/client/request/DeleteDataRequest;", "fromProto", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "<init>", "()V", "connect-client_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DeleteDataRequest fromProto$connect_client_release(@NotNull c1 proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            List<a1> listW = proto.W();
            Intrinsics.checkNotNullExpressionValue(listW, "proto.uidsList");
            List<a1> listV = proto.V();
            Intrinsics.checkNotNullExpressionValue(listV, "proto.clientIdsList");
            return new DeleteDataRequest(listW, listV);
        }
    }

    public DeleteDataRequest(@NotNull List<a1> uids, @NotNull List<a1> clientIds) {
        Intrinsics.checkNotNullParameter(uids, "uids");
        Intrinsics.checkNotNullParameter(clientIds, "clientIds");
        this.uids = uids;
        this.clientIds = clientIds;
    }

    @NotNull
    public final List<a1> getClientIds() {
        return this.clientIds;
    }

    @NotNull
    public final List<a1> getUids() {
        return this.uids;
    }

    @Override // androidx.health.platform.client.impl.data.ProtoData
    @NotNull
    public c1 getProto() {
        c1 c1VarBuild = c1.X().z(this.uids).y(this.clientIds).build();
        Intrinsics.checkNotNullExpressionValue(c1VarBuild, "newBuilder()\n           …\n                .build()");
        return c1VarBuild;
    }
}
