package com.xiaomi.fitness.electronic.scale.export;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import java.lang.ref.SoftReference;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 32\u00020\u0001:\u00013J*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nH&J*\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\u0011\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J@\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H&J\u0012\u0010\u0017\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001aH&J\u0014\u0010\u001b\u001a\u00020\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dH&J$\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010 H&J \u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0007H&J\u001a\u0010%\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010'H&J \u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\n2\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+H&J*\u0010-\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nH&J \u0010.\u001a\u00020\u00032\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u0007H&¨\u00064"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/export/ElectronicScaleManager;", "", "launchToElectronicScaleMainActivity", "", "context", "Landroid/content/Context;", "did", "", "mac", "fromBind", "", "launchToElectronicScaleUserInfoActivity", "launchToElectronicScaleUserManageActivity", "launchToElectronicScaleOTA", "launchToElectronicWeightActivity", SdkContants.KEY_BUNDLE, "Landroid/os/Bundle;", "syncElectronicScale", "launchToElectronicPairGuideActivity", "name", "shareId", "userId", "model", "initElectronicScale", "launchToDataReportActivity", "weightItem", "Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;", "syncRecord", "onSyncWeightRecordCallback", "Lcom/xiaomi/fitness/electronic/scale/export/SyncWeightRecordCallback;", "startConfigWifiActivity", "bytes", "", "getScalePrivacyUrl", "isProduct", "region", "locale", "goVirtualAccount", "localData", "Lorg/joda/time/LocalDate;", "pullRecord", "needMore", "pullWeightRecordCallback", "Ljava/lang/ref/SoftReference;", "Lcom/xiaomi/fitness/electronic/scale/export/PullWeightRecordCallback;", "launchToElectronicScaleWeightGuideActivity", "loadImageFromNet", "imageView", "Landroid/widget/ImageView;", "light", "night", "Companion", "electronic-scale-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ElectronicScaleManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/export/ElectronicScaleManager$Companion;", "", "<init>", "()V", "electronic-scale-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void launchToElectronicScaleMainActivity$default(ElectronicScaleManager electronicScaleManager, Context context, String str, String str2, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchToElectronicScaleMainActivity");
            }
            if ((i & 8) != 0) {
                z = false;
            }
            electronicScaleManager.launchToElectronicScaleMainActivity(context, str, str2, z);
        }

        public static /* synthetic */ void launchToElectronicScaleUserInfoActivity$default(ElectronicScaleManager electronicScaleManager, Context context, String str, String str2, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchToElectronicScaleUserInfoActivity");
            }
            if ((i & 8) != 0) {
                z = false;
            }
            electronicScaleManager.launchToElectronicScaleUserInfoActivity(context, str, str2, z);
        }

        public static /* synthetic */ void launchToElectronicScaleWeightGuideActivity$default(ElectronicScaleManager electronicScaleManager, Context context, String str, String str2, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchToElectronicScaleWeightGuideActivity");
            }
            if ((i & 8) != 0) {
                z = false;
            }
            electronicScaleManager.launchToElectronicScaleWeightGuideActivity(context, str, str2, z);
        }

        public static /* synthetic */ void syncRecord$default(ElectronicScaleManager electronicScaleManager, SyncWeightRecordCallback syncWeightRecordCallback, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: syncRecord");
            }
            if ((i & 1) != 0) {
                syncWeightRecordCallback = null;
            }
            electronicScaleManager.syncRecord(syncWeightRecordCallback);
        }
    }

    @NotNull
    String getScalePrivacyUrl(boolean isProduct, @NotNull String region, @NotNull String locale);

    void goVirtualAccount(@NotNull Context context, @Nullable LocalDate localData);

    void initElectronicScale(@Nullable String did);

    void launchToDataReportActivity(@NotNull Context context, @NotNull WeightItem weightItem);

    void launchToElectronicPairGuideActivity(@NotNull Context context, @NotNull String mac, @NotNull String name, @NotNull String shareId, @NotNull String userId, @NotNull String did, @NotNull String model);

    void launchToElectronicScaleMainActivity(@NotNull Context context, @NotNull String did, @NotNull String mac, boolean fromBind);

    void launchToElectronicScaleOTA(@NotNull Context context);

    void launchToElectronicScaleUserInfoActivity(@NotNull Context context, @NotNull String did, @NotNull String mac, boolean fromBind);

    void launchToElectronicScaleUserManageActivity(@NotNull Context context);

    void launchToElectronicScaleWeightGuideActivity(@NotNull Context context, @NotNull String did, @NotNull String mac, boolean fromBind);

    void launchToElectronicWeightActivity(@NotNull Context context, @NotNull Bundle bundle, @NotNull String did);

    void loadImageFromNet(@NotNull ImageView imageView, @NotNull String light, @NotNull String night);

    void pullRecord(boolean needMore, @Nullable SoftReference<PullWeightRecordCallback> pullWeightRecordCallback);

    void startConfigWifiActivity(@NotNull Context context, @Nullable String mac, @Nullable byte[] bytes);

    void syncElectronicScale(@Nullable String did);

    void syncRecord(@Nullable SyncWeightRecordCallback onSyncWeightRecordCallback);
}
