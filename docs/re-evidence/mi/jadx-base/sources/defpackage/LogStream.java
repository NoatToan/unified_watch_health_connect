package defpackage;

import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ok, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u0013"}, d2 = {"Lok;", "", "", "toString", "", "hashCode", "other", "", "equals", "index", "streamId", "subDomainId", "tag", "", "timestamp", "level", MiuiCursorConstants.CONTENT, "<init>", "(IILjava/lang/String;Ljava/lang/String;JILjava/lang/String;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class LogStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final int index;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    public final int streamId;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final String subDomainId;

    /* JADX INFO: renamed from: d, reason: from toString */
    @NotNull
    public final String tag;

    /* JADX INFO: renamed from: e, reason: from toString */
    public final long timestamp;

    /* JADX INFO: renamed from: f, reason: from toString */
    public final int level;

    /* JADX INFO: renamed from: g, reason: from toString */
    @NotNull
    public final String content;

    public LogStream(int i, int i2, @NotNull String subDomainId, @NotNull String tag, long j, int i3, @NotNull String content) {
        Intrinsics.checkNotNullParameter(subDomainId, "subDomainId");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(content, "content");
        this.index = i;
        this.streamId = i2;
        this.subDomainId = subDomainId;
        this.tag = tag;
        this.timestamp = j;
        this.level = i3;
        this.content = content;
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

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.index) * 31) + Integer.hashCode(this.streamId)) * 31) + this.subDomainId.hashCode()) * 31) + this.tag.hashCode()) * 31) + Long.hashCode(this.timestamp)) * 31) + Integer.hashCode(this.level)) * 31) + this.content.hashCode();
    }

    @NotNull
    public String toString() {
        return "LogStream(index=" + this.index + ", streamId=" + this.streamId + ", subDomainId=" + this.subDomainId + ", tag=" + this.tag + ", timestamp=" + this.timestamp + ", level=" + this.level + ", content=" + this.content + ')';
    }
}
