package com.xiaomi.hm.health.bt.profile.sport;

import com.xiaomi.hm.health.bt.debug.Debug;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B%\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0012\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0015\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/sport/SportTypeConfig;", "Ljava/io/Serializable;", "", "toCommand", "", "getSportTypeCount", "", "Lcom/xiaomi/hm/health/bt/profile/sport/SportTypeItem;", "a", "Ljava/util/List;", "getList", "()Ljava/util/List;", "list", "", "b", "Z", "getSupportSort", "()Z", "supportSort", "c", "getSupportItemDataSetting", "supportItemDataSetting", "<init>", "(Ljava/util/List;ZZ)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class SportTypeConfig implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "SportTypeConfig";
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<SportTypeItem> list;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean supportSort;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean supportItemDataSetting;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/sport/SportTypeConfig$Companion;", "", "", "byteArray", "", "Lcom/xiaomi/hm/health/bt/profile/sport/SportTypeItem;", "parseFromRawData", "", "TAG", "Ljava/lang/String;", "", "serialVersionUID", "J", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<SportTypeItem> parseFromRawData(@NotNull byte[] byteArray) {
            Debug.fi(SportTypeConfig.TAG, "Start parse sport type list");
            int i = 2;
            if (((byteArray[0] & 255) | ((byteArray[1] & 255) << 8)) * 3 != byteArray.length - 2) {
                Debug.fi(SportTypeConfig.TAG, "ERROR: Wrong length");
                return CollectionsKt__CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(2, byteArray.length - 3, 3);
            if (2 <= progressionLastElement) {
                while (true) {
                    int i2 = i + 3;
                    arrayList.add(new SportTypeItem((byteArray[i] & 255) | ((byteArray[i + 1] & 255) << 8), byteArray[i + 2]));
                    if (i == progressionLastElement) {
                        break;
                    }
                    i = i2;
                }
            }
            Debug.fi(SportTypeConfig.TAG, "Parse sport type list finish");
            return arrayList;
        }
    }

    public SportTypeConfig(@NotNull List<SportTypeItem> list, boolean z, boolean z2) {
        this.list = list;
        this.supportSort = z;
        this.supportItemDataSetting = z2;
    }

    @NotNull
    public final List<SportTypeItem> getList() {
        return this.list;
    }

    public final int getSportTypeCount() {
        return this.list.size();
    }

    public final boolean getSupportItemDataSetting() {
        return this.supportItemDataSetting;
    }

    public final boolean getSupportSort() {
        return this.supportSort;
    }

    @NotNull
    public final byte[] toCommand() {
        int i = 2;
        byte[] bArr = new byte[(this.list.size() * 3) + 2];
        bArr[0] = (byte) (this.list.size() & 255);
        bArr[1] = (byte) ((this.list.size() >> 8) & 255);
        for (SportTypeItem sportTypeItem : this.list) {
            int i2 = i + 1;
            bArr[i] = (byte) (sportTypeItem.getType() & 255);
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((sportTypeItem.getType() >> 8) & 255);
            bArr[i3] = (byte) (sportTypeItem.getStatus() & 255);
            i = i3 + 1;
        }
        return bArr;
    }
}
