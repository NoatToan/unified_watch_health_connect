package com.huami.http.ednetwork;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J!\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/http/ednetwork/HttpWhiteBoxKeyEntity;", "", "", "component1", "component2", "hmEkv", "wbKey", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getHmEkv", "()Ljava/lang/String;", "b", "getWbKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "httpkit_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HttpWhiteBoxKeyEntity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final String hmEkv;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final String wbKey;

    public HttpWhiteBoxKeyEntity(@Nullable String str, @Nullable String str2) {
        this.hmEkv = str;
        this.wbKey = str2;
    }

    public static /* synthetic */ HttpWhiteBoxKeyEntity copy$default(HttpWhiteBoxKeyEntity httpWhiteBoxKeyEntity, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = httpWhiteBoxKeyEntity.hmEkv;
        }
        if ((i & 2) != 0) {
            str2 = httpWhiteBoxKeyEntity.wbKey;
        }
        return httpWhiteBoxKeyEntity.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHmEkv() {
        return this.hmEkv;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getWbKey() {
        return this.wbKey;
    }

    @NotNull
    public final HttpWhiteBoxKeyEntity copy(@Nullable String hmEkv, @Nullable String wbKey) {
        return new HttpWhiteBoxKeyEntity(hmEkv, wbKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HttpWhiteBoxKeyEntity)) {
            return false;
        }
        HttpWhiteBoxKeyEntity httpWhiteBoxKeyEntity = (HttpWhiteBoxKeyEntity) other;
        return Intrinsics.areEqual(this.hmEkv, httpWhiteBoxKeyEntity.hmEkv) && Intrinsics.areEqual(this.wbKey, httpWhiteBoxKeyEntity.wbKey);
    }

    @Nullable
    public final String getHmEkv() {
        return this.hmEkv;
    }

    @Nullable
    public final String getWbKey() {
        return this.wbKey;
    }

    public int hashCode() {
        String str = this.hmEkv;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.wbKey;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HttpWhiteBoxKeyEntity(hmEkv=" + this.hmEkv + ", wbKey=" + this.wbKey + ")";
    }
}
