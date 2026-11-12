package com.xiaomi.fitness.health.net;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/health/net/SchemaRequestData;", "", "channel", "", "app_version", "md5", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannel", "()Ljava/lang/String;", "getApp_version", "getMd5", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SchemaRequestData {

    @NotNull
    private final String app_version;

    @NotNull
    private final String channel;

    @NotNull
    private final String md5;

    public SchemaRequestData(@NotNull String channel, @NotNull String app_version, @NotNull String md5) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(app_version, "app_version");
        Intrinsics.checkNotNullParameter(md5, "md5");
        this.channel = channel;
        this.app_version = app_version;
        this.md5 = md5;
    }

    public static /* synthetic */ SchemaRequestData copy$default(SchemaRequestData schemaRequestData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = schemaRequestData.channel;
        }
        if ((i & 2) != 0) {
            str2 = schemaRequestData.app_version;
        }
        if ((i & 4) != 0) {
            str3 = schemaRequestData.md5;
        }
        return schemaRequestData.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getApp_version() {
        return this.app_version;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMd5() {
        return this.md5;
    }

    @NotNull
    public final SchemaRequestData copy(@NotNull String channel, @NotNull String app_version, @NotNull String md5) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(app_version, "app_version");
        Intrinsics.checkNotNullParameter(md5, "md5");
        return new SchemaRequestData(channel, app_version, md5);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SchemaRequestData)) {
            return false;
        }
        SchemaRequestData schemaRequestData = (SchemaRequestData) other;
        return Intrinsics.areEqual(this.channel, schemaRequestData.channel) && Intrinsics.areEqual(this.app_version, schemaRequestData.app_version) && Intrinsics.areEqual(this.md5, schemaRequestData.md5);
    }

    @NotNull
    public final String getApp_version() {
        return this.app_version;
    }

    @NotNull
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    public final String getMd5() {
        return this.md5;
    }

    public int hashCode() {
        return (((this.channel.hashCode() * 31) + this.app_version.hashCode()) * 31) + this.md5.hashCode();
    }

    @NotNull
    public String toString() {
        return "SchemaRequestData(channel=" + this.channel + ", app_version=" + this.app_version + ", md5=" + this.md5 + ")";
    }
}
