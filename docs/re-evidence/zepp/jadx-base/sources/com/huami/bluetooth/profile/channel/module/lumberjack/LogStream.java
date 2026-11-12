package com.huami.bluetooth.profile.channel.module.lumberjack;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b-\u0010.J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003JO\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\u000e\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u000f\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0019\u0010\u0010\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0011\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010\u001a\u001a\u0004\b*\u0010\u001cR\u0019\u0010\u0012\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010 \u001a\u0004\b,\u0010\"¨\u0006/"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/lumberjack/LogStream;", "", "", "component1", "component2", "", "component3", "component4", "", "component5", "component6", "component7", "index", "streamId", "subDomainId", "tag", "timestamp", FirebaseAnalytics.Param.LEVEL, "content", "copy", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getIndex", "()I", "b", "getStreamId", "c", "Ljava/lang/String;", "getSubDomainId", "()Ljava/lang/String;", GoogleApiAvailabilityLight.a, "getTag", "e", "J", "getTimestamp", "()J", "f", "getLevel", "g", "getContent", "<init>", "(IILjava/lang/String;Ljava/lang/String;JILjava/lang/String;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class LogStream {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int index;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int streamId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String subDomainId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String tag;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final long timestamp;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final int level;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    private final String content;

    public LogStream(int i, int i2, @NotNull String str, @NotNull String str2, long j, int i3, @NotNull String str3) {
        this.index = i;
        this.streamId = i2;
        this.subDomainId = str;
        this.tag = str2;
        this.timestamp = j;
        this.level = i3;
        this.content = str3;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStreamId() {
        return this.streamId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubDomainId() {
        return this.subDomainId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final LogStream copy(int index, int streamId, @NotNull String subDomainId, @NotNull String tag, long timestamp, int level, @NotNull String content) {
        return new LogStream(index, streamId, subDomainId, tag, timestamp, level, content);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogStream)) {
            return false;
        }
        LogStream logStream = (LogStream) other;
        return this.index == logStream.index && this.streamId == logStream.streamId && Intrinsics.areEqual(this.subDomainId, logStream.subDomainId) && Intrinsics.areEqual(this.tag, logStream.tag) && this.timestamp == logStream.timestamp && this.level == logStream.level && Intrinsics.areEqual(this.content, logStream.content);
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getLevel() {
        return this.level;
    }

    public final int getStreamId() {
        return this.streamId;
    }

    @NotNull
    public final String getSubDomainId() {
        return this.subDomainId;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((((((((((this.index * 31) + this.streamId) * 31) + this.subDomainId.hashCode()) * 31) + this.tag.hashCode()) * 31) + b.a(this.timestamp)) * 31) + this.level) * 31) + this.content.hashCode();
    }

    @NotNull
    public String toString() {
        return "LogStream(index=" + this.index + ", streamId=" + this.streamId + ", subDomainId=" + this.subDomainId + ", tag=" + this.tag + ", timestamp=" + this.timestamp + ", level=" + this.level + ", content=" + this.content + ')';
    }
}
