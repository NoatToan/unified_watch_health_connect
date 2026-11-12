package androidx.health.platform.client.request;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.platform.client.impl.data.ProtoParcelable;
import androidx.health.platform.client.impl.data.SharedMemory27Impl;
import androidx.health.platform.client.proto.InvalidProtocolBufferException;
import androidx.health.platform.client.proto.l1;
import androidx.health.platform.client.proto.o;
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
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Landroidx/health/platform/client/request/UpsertDataRequest;", "Landroidx/health/platform/client/impl/data/ProtoParcelable;", "Landroidx/health/platform/client/proto/l1;", "", "Landroidx/health/platform/client/proto/o;", "dataPoints", "Ljava/util/List;", "getDataPoints", "()Ljava/util/List;", "getProto", "()Landroidx/health/platform/client/proto/l1;", "proto", "<init>", "(Ljava/util/List;)V", "Companion", "connect-client_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nUpsertDataRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpsertDataRequest.kt\nandroidx/health/platform/client/request/UpsertDataRequest\n+ 2 ProtoParcelable.kt\nandroidx/health/platform/client/impl/data/ProtoParcelable$Companion\n*L\n1#1,54:1\n72#2:55\n*S KotlinDebug\n*F\n+ 1 UpsertDataRequest.kt\nandroidx/health/platform/client/request/UpsertDataRequest\n*L\n42#1:55\n*E\n"})
public final class UpsertDataRequest extends ProtoParcelable<l1> {

    @NotNull
    private final List<o> dataPoints;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final Parcelable.Creator<UpsertDataRequest> CREATOR = new Parcelable.Creator<UpsertDataRequest>() { // from class: androidx.health.platform.client.request.UpsertDataRequest$special$$inlined$newCreator$connect_client_release$1
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Type inference failed for: r4v7, types: [androidx.health.platform.client.impl.data.ProtoParcelable, androidx.health.platform.client.request.UpsertDataRequest] */
        @Override // android.os.Parcelable.Creator
        @SuppressLint({"NewApi"})
        @Nullable
        public UpsertDataRequest createFromParcel(@NotNull Parcel source) throws InvalidProtocolBufferException {
            Intrinsics.checkNotNullParameter(source, "source");
            int i = source.readInt();
            if (i != 0) {
                if (i == 1) {
                    return (ProtoParcelable) SharedMemory27Impl.INSTANCE.parseParcelUsingSharedMemory(source, new Function1<byte[], UpsertDataRequest>() { // from class: androidx.health.platform.client.request.UpsertDataRequest$special$$inlined$newCreator$connect_client_release$1.1
                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final UpsertDataRequest invoke2(@NotNull byte[] it) throws InvalidProtocolBufferException {
                            Intrinsics.checkNotNullParameter(it, "it");
                            l1 proto = l1.U(it);
                            UpsertDataRequest.Companion companion = UpsertDataRequest.INSTANCE;
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
            l1 proto = l1.U(bArrCreateByteArray);
            UpsertDataRequest.Companion companion = UpsertDataRequest.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(proto, "proto");
            return companion.fromProto$connect_client_release(proto);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public UpsertDataRequest[] newArray(int size) {
            return new UpsertDataRequest[size];
        }
    };

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Landroidx/health/platform/client/request/UpsertDataRequest$Companion;", "", "Landroidx/health/platform/client/proto/l1;", "proto", "Landroidx/health/platform/client/request/UpsertDataRequest;", "fromProto$connect_client_release", "(Landroidx/health/platform/client/proto/l1;)Landroidx/health/platform/client/request/UpsertDataRequest;", "fromProto", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "<init>", "()V", "connect-client_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final UpsertDataRequest fromProto$connect_client_release(@NotNull l1 proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            List<o> listS = proto.S();
            Intrinsics.checkNotNullExpressionValue(listS, "proto.dataPointList");
            return new UpsertDataRequest(listS);
        }
    }

    public UpsertDataRequest(@NotNull List<o> dataPoints) {
        Intrinsics.checkNotNullParameter(dataPoints, "dataPoints");
        this.dataPoints = dataPoints;
    }

    @NotNull
    public final List<o> getDataPoints() {
        return this.dataPoints;
    }

    @Override // androidx.health.platform.client.impl.data.ProtoData
    @NotNull
    public l1 getProto() {
        l1 l1VarBuild = l1.T().y(this.dataPoints).build();
        Intrinsics.checkNotNullExpressionValue(l1VarBuild, "newBuilder()\n           …\n                .build()");
        return l1VarBuild;
    }
}
