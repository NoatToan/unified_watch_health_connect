package com.huami.ai.speech.alexa.entity.payload;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0005\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/payload/LocationServices;", "", "", "component1", "component2", "access", "status", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getAccess", "()Ljava/lang/String;", "b", "getStatus", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class LocationServices {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("access")
    @NotNull
    private final String access;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("status")
    @NotNull
    private final String status;

    /* JADX WARN: Multi-variable type inference failed */
    public LocationServices() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public LocationServices(@NotNull String str, @NotNull String str2) {
        this.access = str;
        this.status = str2;
    }

    public static /* synthetic */ LocationServices copy$default(LocationServices locationServices, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = locationServices.access;
        }
        if ((i & 2) != 0) {
            str2 = locationServices.status;
        }
        return locationServices.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccess() {
        return this.access;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final LocationServices copy(@NotNull String access, @NotNull String status) {
        return new LocationServices(access, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocationServices)) {
            return false;
        }
        LocationServices locationServices = (LocationServices) other;
        return Intrinsics.areEqual(this.access, locationServices.access) && Intrinsics.areEqual(this.status, locationServices.status);
    }

    @NotNull
    public final String getAccess() {
        return this.access;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.access.hashCode() * 31) + this.status.hashCode();
    }

    @NotNull
    public String toString() {
        return "LocationServices(access=" + this.access + ", status=" + this.status + ')';
    }

    public /* synthetic */ LocationServices(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "ENABLED" : str, (i & 2) != 0 ? DebugCoroutineInfoImplKt.RUNNING : str2);
    }
}
