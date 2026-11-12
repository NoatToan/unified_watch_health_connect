package com.xiaomi.hm.health.bt.profile.sport;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import defpackage.t5t;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B%\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/sport/SportTypeConfig;", "Ljava/io/Serializable;", "", "toCommand", "", "getSportTypeCount", "", "Lcom/xiaomi/hm/health/bt/profile/sport/SportTypeItem;", "list", "Ljava/util/List;", "getList", "()Ljava/util/List;", "", "supportSort", "Z", "getSupportSort", "()Z", "supportItemDataSetting", "getSupportItemDataSetting", "<init>", "(Ljava/util/List;ZZ)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class SportTypeConfig implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "SportTypeConfig";
    private static final long serialVersionUID = 1;

    @NotNull
    private final List<SportTypeItem> list;
    private final boolean supportItemDataSetting;
    private final boolean supportSort;

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bt.profile.sport.SportTypeConfig$a, reason: from kotlin metadata */
    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/sport/SportTypeConfig$a;", "", "", "byteArray", "", "Lcom/xiaomi/hm/health/bt/profile/sport/SportTypeItem;", PluginDeviceInfo.FMODEL, "", "TAG", "Ljava/lang/String;", "", "serialVersionUID", "J", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<SportTypeItem> a(@NotNull byte[] byteArray) {
            Intrinsics.checkNotNullParameter(byteArray, "byteArray");
            t5t.d(SportTypeConfig.TAG, "Start parse sport type list");
            int i = 2;
            if (((byteArray[0] & 255) | ((byteArray[1] & 255) << 8)) * 3 != byteArray.length - 2) {
                t5t.d(SportTypeConfig.TAG, "ERROR: Wrong length");
                return CollectionsKt__CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(2, byteArray.length - 3, 3);
            if (2 <= progressionLastElement) {
                while (true) {
                    arrayList.add(new SportTypeItem((byteArray[i] & 255) | ((byteArray[i + 1] & 255) << 8), byteArray[i + 2]));
                    if (i == progressionLastElement) {
                        break;
                    }
                    i += 3;
                }
            }
            t5t.d(SportTypeConfig.TAG, "Parse sport type list finish");
            return arrayList;
        }
    }

    public SportTypeConfig(@NotNull List<SportTypeItem> list, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "list");
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
            bArr[i] = (byte) (sportTypeItem.getType() & 255);
            int i2 = i + 2;
            bArr[i + 1] = (byte) ((sportTypeItem.getType() >> 8) & 255);
            i += 3;
            bArr[i2] = (byte) (sportTypeItem.getStatus() & 255);
        }
        return bArr;
    }
}
