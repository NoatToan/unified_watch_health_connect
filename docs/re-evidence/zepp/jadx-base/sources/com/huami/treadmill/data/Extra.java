package com.huami.treadmill.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\b\u0007\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/huami/treadmill/data/Extra;", "", "", "component1", "location", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getLocation", "()Ljava/lang/String;", "setLocation", "(Ljava/lang/String;)V", "<init>", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Extra {

    @SerializedName("routingRunLocation")
    @Nullable
    private String location;

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public Extra() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @JvmOverloads
    public Extra(@Nullable String str) {
        this.location = str;
    }

    public static /* synthetic */ Extra copy$default(Extra extra, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = extra.location;
        }
        return extra.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    @NotNull
    public final Extra copy(@Nullable String location) {
        return new Extra(location);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Extra) && Intrinsics.areEqual(this.location, ((Extra) other).location);
    }

    @Nullable
    public final String getLocation() {
        return this.location;
    }

    public int hashCode() {
        String str = this.location;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setLocation(@Nullable String str) {
        this.location = str;
    }

    @NotNull
    public String toString() {
        return "Extra(location=" + ((Object) this.location) + ')';
    }

    public /* synthetic */ Extra(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
