package androidx.health.platform.client.impl.data;

import androidx.annotation.RestrictTo;
import androidx.health.platform.client.proto.o0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/health/platform/client/impl/data/ProtoData;", "Landroidx/health/platform/client/proto/o0;", "T", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getProto", "()Landroidx/health/platform/client/proto/o0;", "proto", "<init>", "()V", "connect-client_release"}, k = 1, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public abstract class ProtoData<T extends o0> {
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.areEqual(getClass(), other.getClass())) {
            return false;
        }
        return Intrinsics.areEqual(getProto(), ((ProtoData) other).getProto());
    }

    @NotNull
    public abstract T getProto();

    public int hashCode() {
        return getProto().hashCode();
    }
}
