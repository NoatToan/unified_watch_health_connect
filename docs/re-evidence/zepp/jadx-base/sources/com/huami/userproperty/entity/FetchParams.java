package com.huami.userproperty.entity;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.collections.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J)\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/huami/userproperty/entity/FetchParams;", "Lcom/huami/userproperty/entity/AbsFetchParams;", "", "component1", "component2", "component3", "key", "mode", "api", "copy", "toString", "", "hashCode", "", "other", "", "equals", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "e", "getMode", "f", "getApi", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "userproperty_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class FetchParams extends AbsFetchParams {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String key;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final String mode;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private final String api;

    public /* synthetic */ FetchParams(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }

    public static /* synthetic */ FetchParams copy$default(FetchParams fetchParams, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fetchParams.key;
        }
        if ((i & 2) != 0) {
            str2 = fetchParams.getMode();
        }
        if ((i & 4) != 0) {
            str3 = fetchParams.getApi();
        }
        return fetchParams.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final String component2() {
        return getMode();
    }

    @Nullable
    public final String component3() {
        return getApi();
    }

    @NotNull
    public final FetchParams copy(@NotNull String key, @NotNull String mode, @Nullable String api) {
        return new FetchParams(key, mode, api);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FetchParams)) {
            return false;
        }
        FetchParams fetchParams = (FetchParams) other;
        return Intrinsics.areEqual(this.key, fetchParams.key) && Intrinsics.areEqual(getMode(), fetchParams.getMode()) && Intrinsics.areEqual(getApi(), fetchParams.getApi());
    }

    @Override // com.huami.userproperty.entity.AbsFetchParams
    @Nullable
    public String getApi() {
        return this.api;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @Override // com.huami.userproperty.entity.AbsFetchParams
    @NotNull
    public String getMode() {
        return this.mode;
    }

    public int hashCode() {
        return (((this.key.hashCode() * 31) + getMode().hashCode()) * 31) + (getApi() == null ? 0 : getApi().hashCode());
    }

    @NotNull
    public String toString() {
        return "FetchParams(key=" + this.key + ", mode=" + getMode() + ", api=" + ((Object) getApi()) + ')';
    }

    public FetchParams(@NotNull String str, @NotNull String str2, @Nullable String str3) {
        super(e.listOf(str), str2, str3, null);
        this.key = str;
        this.mode = str2;
        this.api = str3;
    }
}
