package com.xiaomi.hm.health.bt.profile.earbud.model;

import android.text.TextUtils;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import defpackage.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B%\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bHÆ\u0003J-\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\bHÆ\u0001J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/earbud/model/MusicPlayInfo;", "", "", "toString", "", "component1", "", "component2", "", "component3", "size", "time", "info", "copy", "hashCode", "other", "", "equals", "a", LogUtil.I, "getSize", "()I", "b", "J", "getTime", "()J", "c", "Ljava/util/List;", "getInfo", "()Ljava/util/List;", "<init>", "(IJLjava/util/List;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MusicPlayInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int size;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long time;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final List<Long> info;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/earbud/model/MusicPlayInfo$Companion;", "", "", "datas", "Lcom/xiaomi/hm/health/bt/profile/earbud/model/MusicPlayInfo;", "from", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final MusicPlayInfo from(@NotNull byte[] datas) {
            int i = 5;
            if (datas.length < 5 || (datas.length - 5) % 8 != 0) {
                return null;
            }
            int i2 = datas[0] & 255;
            long jBytesToLong = GattUtils.bytesToLong(datas, 1, 4);
            ArrayList arrayList = new ArrayList();
            while (i < datas.length - 1) {
                arrayList.add(Long.valueOf(GattUtils.bytesToLong(datas, i, 4)));
                int i3 = i + 4;
                arrayList.add(Long.valueOf(GattUtils.bytesToLong(datas, i3, 4)));
                i = i3 + 4;
            }
            return new MusicPlayInfo(i2, jBytesToLong, arrayList);
        }
    }

    public MusicPlayInfo(int i, long j, @NotNull List<Long> list) {
        this.size = i;
        this.time = j;
        this.info = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MusicPlayInfo copy$default(MusicPlayInfo musicPlayInfo, int i, long j, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = musicPlayInfo.size;
        }
        if ((i2 & 2) != 0) {
            j = musicPlayInfo.time;
        }
        if ((i2 & 4) != 0) {
            list = musicPlayInfo.info;
        }
        return musicPlayInfo.copy(i, j, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final List<Long> component3() {
        return this.info;
    }

    @NotNull
    public final MusicPlayInfo copy(int size, long time, @NotNull List<Long> info) {
        return new MusicPlayInfo(size, time, info);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MusicPlayInfo)) {
            return false;
        }
        MusicPlayInfo musicPlayInfo = (MusicPlayInfo) other;
        return this.size == musicPlayInfo.size && this.time == musicPlayInfo.time && Intrinsics.areEqual(this.info, musicPlayInfo.info);
    }

    @NotNull
    public final List<Long> getInfo() {
        return this.info;
    }

    public final int getSize() {
        return this.size;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (((this.size * 31) + b.a(this.time)) * 31) + this.info.hashCode();
    }

    @NotNull
    public String toString() {
        return "MusicPlayInfo {size:" + this.size + "; time:" + this.time + "; info:" + ((Object) TextUtils.join(",", this.info)) + '}';
    }
}
