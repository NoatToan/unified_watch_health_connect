package androidx.health.platform.client.request;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.platform.client.impl.data.ProtoParcelable;
import androidx.health.platform.client.impl.data.SharedMemory27Impl;
import androidx.health.platform.client.proto.InvalidProtocolBufferException;
import androidx.health.platform.client.proto.j1;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u0005\u001a\u0004\b\u000e\u0010\u0007R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R!\u0010\u0019\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, d2 = {"Landroidx/health/platform/client/request/RequestContext;", "Landroidx/health/platform/client/impl/data/ProtoParcelable;", "Landroidx/health/platform/client/proto/j1;", "", "callingPackage", "Ljava/lang/String;", "getCallingPackage", "()Ljava/lang/String;", "", "sdkVersion", "I", "getSdkVersion", "()I", "permissionToken", "getPermissionToken", "", "isInForeground", "Z", "()Z", "proto$delegate", "Lkotlin/Lazy;", "getProto", "()Landroidx/health/platform/client/proto/j1;", "getProto$annotations", "()V", "proto", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", "Companion", "connect-client_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRequestContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestContext.kt\nandroidx/health/platform/client/request/RequestContext\n+ 2 ProtoParcelable.kt\nandroidx/health/platform/client/impl/data/ProtoParcelable$Companion\n*L\n1#1,54:1\n72#2:55\n*S KotlinDebug\n*F\n+ 1 RequestContext.kt\nandroidx/health/platform/client/request/RequestContext\n*L\n47#1:55\n*E\n"})
public final class RequestContext extends ProtoParcelable<j1> {

    @NotNull
    private final String callingPackage;
    private final boolean isInForeground;

    @Nullable
    private final String permissionToken;

    /* JADX INFO: renamed from: proto$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy proto;
    private final int sdkVersion;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<RequestContext> CREATOR = new Parcelable.Creator<RequestContext>() { // from class: androidx.health.platform.client.request.RequestContext$special$$inlined$newCreator$connect_client_release$1
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Type inference failed for: r5v7, types: [androidx.health.platform.client.impl.data.ProtoParcelable, androidx.health.platform.client.request.RequestContext] */
        @Override // android.os.Parcelable.Creator
        @SuppressLint({"NewApi"})
        @Nullable
        public RequestContext createFromParcel(@NotNull Parcel source) throws InvalidProtocolBufferException {
            Intrinsics.checkNotNullParameter(source, "source");
            int i = source.readInt();
            if (i != 0) {
                if (i == 1) {
                    return (ProtoParcelable) SharedMemory27Impl.INSTANCE.parseParcelUsingSharedMemory(source, new Function1<byte[], RequestContext>() { // from class: androidx.health.platform.client.request.RequestContext$special$$inlined$newCreator$connect_client_release$1.1
                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final RequestContext invoke2(@NotNull byte[] it) throws InvalidProtocolBufferException {
                            Intrinsics.checkNotNullParameter(it, "it");
                            j1 j1VarY = j1.Y(it);
                            String callingPackage = j1VarY.T();
                            Intrinsics.checkNotNullExpressionValue(callingPackage, "callingPackage");
                            return new RequestContext(callingPackage, j1VarY.W(), j1VarY.V(), j1VarY.U());
                        }
                    });
                }
                throw new IllegalArgumentException("Unknown storage: " + i);
            }
            byte[] bArrCreateByteArray = source.createByteArray();
            if (bArrCreateByteArray == null) {
                return null;
            }
            j1 j1VarY = j1.Y(bArrCreateByteArray);
            String callingPackage = j1VarY.T();
            Intrinsics.checkNotNullExpressionValue(callingPackage, "callingPackage");
            return new RequestContext(callingPackage, j1VarY.W(), j1VarY.V(), j1VarY.U());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public RequestContext[] newArray(int size) {
            return new RequestContext[size];
        }
    };

    public RequestContext(@NotNull String callingPackage, int i, @Nullable String str, boolean z) {
        Intrinsics.checkNotNullParameter(callingPackage, "callingPackage");
        this.callingPackage = callingPackage;
        this.sdkVersion = i;
        this.permissionToken = str;
        this.isInForeground = z;
        this.proto = LazyKt__LazyJVMKt.lazy(new Function0<j1>() { // from class: androidx.health.platform.client.request.RequestContext$proto$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final j1 invoke() {
                RequestContext requestContext = this.this$0;
                j1.a aVarB = j1.X().y(requestContext.getCallingPackage()).B(requestContext.getSdkVersion());
                String permissionToken = requestContext.getPermissionToken();
                if (permissionToken != null) {
                    aVarB.A(permissionToken);
                }
                return aVarB.z(requestContext.getIsInForeground()).build();
            }
        });
    }

    public static /* synthetic */ void getProto$annotations() {
    }

    @NotNull
    public final String getCallingPackage() {
        return this.callingPackage;
    }

    @Nullable
    public final String getPermissionToken() {
        return this.permissionToken;
    }

    public final int getSdkVersion() {
        return this.sdkVersion;
    }

    /* JADX INFO: renamed from: isInForeground, reason: from getter */
    public final boolean getIsInForeground() {
        return this.isInForeground;
    }

    @Override // androidx.health.platform.client.impl.data.ProtoData
    @NotNull
    public j1 getProto() {
        Object value = this.proto.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-proto>(...)");
        return (j1) value;
    }
}
