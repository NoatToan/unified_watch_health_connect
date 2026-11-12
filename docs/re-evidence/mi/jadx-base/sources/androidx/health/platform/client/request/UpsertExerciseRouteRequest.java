package androidx.health.platform.client.request;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.platform.client.impl.data.ProtoParcelable;
import androidx.health.platform.client.impl.data.SharedMemory27Impl;
import androidx.health.platform.client.proto.InvalidProtocolBufferException;
import androidx.health.platform.client.proto.m1;
import androidx.health.platform.client.proto.o;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Landroidx/health/platform/client/request/UpsertExerciseRouteRequest;", "Landroidx/health/platform/client/impl/data/ProtoParcelable;", "Landroidx/health/platform/client/proto/m1;", "", "sessionUid", "Ljava/lang/String;", "getSessionUid", "()Ljava/lang/String;", "Landroidx/health/platform/client/proto/o;", "route", "Landroidx/health/platform/client/proto/o;", "getRoute", "()Landroidx/health/platform/client/proto/o;", "getProto", "()Landroidx/health/platform/client/proto/m1;", "proto", "<init>", "(Ljava/lang/String;Landroidx/health/platform/client/proto/o;)V", "Companion", "connect-client_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nUpsertExerciseRouteRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpsertExerciseRouteRequest.kt\nandroidx/health/platform/client/request/UpsertExerciseRouteRequest\n+ 2 ProtoParcelable.kt\nandroidx/health/platform/client/impl/data/ProtoParcelable$Companion\n*L\n1#1,55:1\n72#2:56\n*S KotlinDebug\n*F\n+ 1 UpsertExerciseRouteRequest.kt\nandroidx/health/platform/client/request/UpsertExerciseRouteRequest\n*L\n43#1:56\n*E\n"})
public final class UpsertExerciseRouteRequest extends ProtoParcelable<m1> {

    @NotNull
    private final o route;

    @NotNull
    private final String sessionUid;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final Parcelable.Creator<UpsertExerciseRouteRequest> CREATOR = new Parcelable.Creator<UpsertExerciseRouteRequest>() { // from class: androidx.health.platform.client.request.UpsertExerciseRouteRequest$special$$inlined$newCreator$connect_client_release$1
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Type inference failed for: r4v7, types: [androidx.health.platform.client.impl.data.ProtoParcelable, androidx.health.platform.client.request.UpsertExerciseRouteRequest] */
        @Override // android.os.Parcelable.Creator
        @SuppressLint({"NewApi"})
        @Nullable
        public UpsertExerciseRouteRequest createFromParcel(@NotNull Parcel source) throws InvalidProtocolBufferException {
            Intrinsics.checkNotNullParameter(source, "source");
            int i = source.readInt();
            if (i != 0) {
                if (i == 1) {
                    return (ProtoParcelable) SharedMemory27Impl.INSTANCE.parseParcelUsingSharedMemory(source, new Function1<byte[], UpsertExerciseRouteRequest>() { // from class: androidx.health.platform.client.request.UpsertExerciseRouteRequest$special$$inlined$newCreator$connect_client_release$1.1
                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final UpsertExerciseRouteRequest invoke2(@NotNull byte[] it) throws InvalidProtocolBufferException {
                            Intrinsics.checkNotNullParameter(it, "it");
                            m1 proto = m1.U(it);
                            UpsertExerciseRouteRequest.Companion companion = UpsertExerciseRouteRequest.INSTANCE;
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
            m1 proto = m1.U(bArrCreateByteArray);
            UpsertExerciseRouteRequest.Companion companion = UpsertExerciseRouteRequest.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(proto, "proto");
            return companion.fromProto$connect_client_release(proto);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public UpsertExerciseRouteRequest[] newArray(int size) {
            return new UpsertExerciseRouteRequest[size];
        }
    };

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Landroidx/health/platform/client/request/UpsertExerciseRouteRequest$Companion;", "", "Landroidx/health/platform/client/proto/m1;", "proto", "Landroidx/health/platform/client/request/UpsertExerciseRouteRequest;", "fromProto$connect_client_release", "(Landroidx/health/platform/client/proto/m1;)Landroidx/health/platform/client/request/UpsertExerciseRouteRequest;", "fromProto", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "<init>", "()V", "connect-client_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final UpsertExerciseRouteRequest fromProto$connect_client_release(@NotNull m1 proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String strS = proto.S();
            Intrinsics.checkNotNullExpressionValue(strS, "proto.sessionUid");
            o oVarR = proto.R();
            Intrinsics.checkNotNullExpressionValue(oVarR, "proto.exerciseRoute");
            return new UpsertExerciseRouteRequest(strS, oVarR);
        }
    }

    public UpsertExerciseRouteRequest(@NotNull String sessionUid, @NotNull o route) {
        Intrinsics.checkNotNullParameter(sessionUid, "sessionUid");
        Intrinsics.checkNotNullParameter(route, "route");
        this.sessionUid = sessionUid;
        this.route = route;
    }

    @NotNull
    public final o getRoute() {
        return this.route;
    }

    @NotNull
    public final String getSessionUid() {
        return this.sessionUid;
    }

    @Override // androidx.health.platform.client.impl.data.ProtoData
    @NotNull
    public m1 getProto() {
        m1 m1VarBuild = m1.T().z(this.sessionUid).y(this.route).build();
        Intrinsics.checkNotNullExpressionValue(m1VarBuild, "newBuilder()\n        .se…j.route)\n        .build()");
        return m1VarBuild;
    }
}
