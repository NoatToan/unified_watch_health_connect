package com.xiaomi.hm.health.bt.profile.earbud.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/earbud/model/MusicInfo;", "", "", "toString", "", "a", "J", "getMusicId", "()J", "setMusicId", "(J)V", "musicId", "", "b", LogUtil.I, "getMusicSize", "()I", "setMusicSize", "(I)V", "musicSize", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class MusicInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private long musicId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int musicSize;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/earbud/model/MusicInfo$Companion;", "", "", "data", "", "Lcom/xiaomi/hm/health/bt/profile/earbud/model/MusicInfo;", "parseMusic", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final List<MusicInfo> parseMusic(@Nullable byte[] data) {
            ArrayList arrayList = null;
            if (data != null) {
                int i = 1;
                if (!(data.length == 0) && (data.length - 1) % 6 == 0) {
                    if ((data[0] & 255) != (data.length - 1) / 6) {
                        return null;
                    }
                    arrayList = new ArrayList();
                    while (i < data.length) {
                        MusicInfo musicInfo = new MusicInfo();
                        musicInfo.setMusicId(GattUtils.bytesToLong(data, i, 4));
                        int i2 = i + 4;
                        int i3 = i2 + 1;
                        musicInfo.setMusicSize(((data[i3] & 255) >> 8) | (data[i2] & 255));
                        arrayList.add(musicInfo);
                        i = i3 + 1;
                    }
                }
            }
            return arrayList;
        }
    }

    public final long getMusicId() {
        return this.musicId;
    }

    public final int getMusicSize() {
        return this.musicSize;
    }

    public final void setMusicId(long j) {
        this.musicId = j;
    }

    public final void setMusicSize(int i) {
        this.musicSize = i;
    }

    @NotNull
    public String toString() {
        return "MusicInfo{id:" + this.musicId + "; size:" + this.musicSize + '}';
    }
}
