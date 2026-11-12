package defpackage;

import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fq, reason: from toString */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u0010"}, d2 = {"Lfq;", "", "", "toString", "", "hashCode", "other", "", "equals", "name", MediaStoreUtil.MediaInfo.SIZE, "duration", "", "createTime", "<init>", "(Ljava/lang/String;IIJ)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class RecordFile {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    public final int size;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final int duration;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final long createTime;

    public RecordFile(@NotNull String name, int i, int i2, long j) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.size = i;
        this.duration = i2;
        this.createTime = j;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecordFile)) {
            return false;
        }
        RecordFile recordFile = (RecordFile) other;
        return Intrinsics.areEqual(this.name, recordFile.name) && this.size == recordFile.size && this.duration == recordFile.duration && this.createTime == recordFile.createTime;
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + Integer.hashCode(this.size)) * 31) + Integer.hashCode(this.duration)) * 31) + Long.hashCode(this.createTime);
    }

    @NotNull
    public String toString() {
        return "RecordFile(name=" + this.name + ", size=" + this.size + ", duration=" + this.duration + ", createTime=" + this.createTime + ')';
    }
}
