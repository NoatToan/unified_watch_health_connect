package com.xiaomi.fitness.health.net;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/health/net/SchemaRes;", "", "status", "", "url", "", "md5", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getStatus", "()I", "getUrl", "()Ljava/lang/String;", "getMd5", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SchemaRes {

    @NotNull
    private final String md5;
    private final int status;

    @NotNull
    private final String url;

    public SchemaRes(int i, @NotNull String url, @NotNull String md5) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(md5, "md5");
        this.status = i;
        this.url = url;
        this.md5 = md5;
    }

    public static /* synthetic */ SchemaRes copy$default(SchemaRes schemaRes, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = schemaRes.status;
        }
        if ((i2 & 2) != 0) {
            str = schemaRes.url;
        }
        if ((i2 & 4) != 0) {
            str2 = schemaRes.md5;
        }
        return schemaRes.copy(i, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMd5() {
        return this.md5;
    }

    @NotNull
    public final SchemaRes copy(int status, @NotNull String url, @NotNull String md5) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(md5, "md5");
        return new SchemaRes(status, url, md5);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SchemaRes)) {
            return false;
        }
        SchemaRes schemaRes = (SchemaRes) other;
        return this.status == schemaRes.status && Intrinsics.areEqual(this.url, schemaRes.url) && Intrinsics.areEqual(this.md5, schemaRes.md5);
    }

    @NotNull
    public final String getMd5() {
        return this.md5;
    }

    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.status) * 31) + this.url.hashCode()) * 31) + this.md5.hashCode();
    }

    @NotNull
    public String toString() {
        return "SchemaRes(status=" + this.status + ", url=" + this.url + ", md5=" + this.md5 + ")";
    }
}
