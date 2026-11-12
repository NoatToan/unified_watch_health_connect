package com.xiaomi.hm.health.bt.profile.sport;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.bt.debug.Debug;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntProgression;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001d\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/sport/SportItemDataConfig;", "", "", "toCommand", "", "a", LogUtil.I, "getSportType", "()I", "sportType", "", "Lcom/xiaomi/hm/health/bt/profile/sport/SportItemData;", "b", "Ljava/util/List;", "getSportItemData", "()Ljava/util/List;", "sportItemData", "<init>", "(ILjava/util/List;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class SportItemDataConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "SportItemDataConfig";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int sportType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<SportItemData> sportItemData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/sport/SportItemDataConfig$Companion;", "", "", "byteArray", "Lcom/xiaomi/hm/health/bt/profile/sport/SportItemDataConfig;", "parseFromRawData", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SportItemDataConfig parseFromRawData(@NotNull byte[] byteArray) {
            if (byteArray.length < 4) {
                Debug.fi(SportItemDataConfig.TAG, "ERROR: wrong raw data");
                return new SportItemDataConfig(-1, CollectionsKt__CollectionsKt.emptyList());
            }
            int i = (byteArray[0] & 255) | ((byteArray[1] & 255) << 8);
            if (((byteArray[2] & 255) | ((byteArray[3] & 255) << 8)) * 2 != byteArray.length - 4) {
                Debug.fi(SportItemDataConfig.TAG, "ERROR: no enough data");
                return new SportItemDataConfig(-1, CollectionsKt__CollectionsKt.emptyList());
            }
            ArrayList arrayList = new ArrayList();
            IntProgression intProgressionStep = e.step(e.until(4, byteArray.length), 2);
            int first = intProgressionStep.getFirst();
            int last = intProgressionStep.getLast();
            int step = intProgressionStep.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    int i2 = first + step;
                    int i3 = first + 1;
                    arrayList.add(new SportItemData((byteArray[first] & 255) | ((byteArray[i3] & 15) << 8), (byteArray[i3] & 240) >> 4));
                    if (first == last) {
                        break;
                    }
                    first = i2;
                }
            }
            return new SportItemDataConfig(i, arrayList);
        }
    }

    public SportItemDataConfig(int i, @NotNull List<SportItemData> list) {
        this.sportType = i;
        this.sportItemData = list;
    }

    @NotNull
    public final List<SportItemData> getSportItemData() {
        return this.sportItemData;
    }

    public final int getSportType() {
        return this.sportType;
    }

    @NotNull
    public final byte[] toCommand() {
        byte[] bArr = new byte[(this.sportItemData.size() * 2) + 4];
        int i = this.sportType;
        bArr[0] = (byte) (i & 255);
        bArr[1] = (byte) ((i >> 8) & 255);
        bArr[2] = (byte) (this.sportItemData.size() & 255);
        bArr[3] = (byte) ((this.sportItemData.size() >> 8) & 255);
        int i2 = 4;
        for (SportItemData sportItemData : this.sportItemData) {
            int i3 = i2 + 1;
            bArr[i2] = (byte) (sportItemData.getDataType() & 255);
            i2 = i3 + 1;
            bArr[i3] = (byte) ((sportItemData.getStatus() << 4) | ((sportItemData.getDataType() >> 8) & 15));
        }
        return bArr;
    }
}
