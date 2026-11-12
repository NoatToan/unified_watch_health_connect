package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: t0, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000f\u0010\u0014\"\u0004\b\u000f\u0010\u0015¨\u0006\u0018"}, d2 = {"Lt0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "originCode", "I", PluginDeviceInfo.FDESC, PluginDeviceInfo.FMODEL, "(I)V", "Lnbt;", "authError", "Lnbt;", "()Lnbt;", "(Lnbt;)V", "<init>", "(ILnbt;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class AuthResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public int originCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @NotNull
    public nbt authError;

    public AuthResult(int i, @NotNull nbt authError) {
        Intrinsics.checkNotNullParameter(authError, "authError");
        this.originCode = i;
        this.authError = authError;
    }

    public final void a(int i) {
        this.originCode = i;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getOriginCode() {
        return this.originCode;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthResult)) {
            return false;
        }
        AuthResult authResult = (AuthResult) other;
        return this.originCode == authResult.originCode && Intrinsics.areEqual(this.authError, authResult.authError);
    }

    public int hashCode() {
        return (Integer.hashCode(this.originCode) * 31) + this.authError.hashCode();
    }

    @NotNull
    public String toString() {
        return "AuthResult(originCode=" + this.originCode + ", authError=" + this.authError + ')';
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final nbt getAuthError() {
        return this.authError;
    }

    public final void a(@NotNull nbt nbtVar) {
        Intrinsics.checkNotNullParameter(nbtVar, "<set-?>");
        this.authError = nbtVar;
    }
}
