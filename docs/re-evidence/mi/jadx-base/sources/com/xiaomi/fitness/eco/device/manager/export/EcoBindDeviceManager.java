package com.xiaomi.fitness.eco.device.manager.export;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoProduct;
import com.xiaomi.fitness.habit.ui.HabitShareActivity;
import com.xiaomi.fitness.mijia.sdk.data.AdvPacket;
import defpackage.wc0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000 !2\u00020\u0001:\u0001!Je\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0015\u0010\u0014J;\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u000bH&¢\u0006\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/export/EcoBindDeviceManager;", "", "Landroid/content/Context;", "context", "", "bleMac", "model", "bleName", "oob", HabitShareActivity.KEY_BIG_ICON, "deviceName", "", "isSportMachine", "Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket;", "packet", "", "from", "shouldEcoDeviceBindActivity", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/xiaomi/fitness/mijia/sdk/data/AdvPacket;I)Z", "isNotShowDisconnectTipDevices", "(Ljava/lang/String;)Z", "isEightScaleDevice", "Landroidx/fragment/app/FragmentActivity;", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoProduct;", "product", "Lcom/xiaomi/fitness/eco/device/manager/export/IBindGuideAction;", "action", "Lwc0;", "actionBar", "removeContentView", "", "showResetGuideView", "(Landroidx/fragment/app/FragmentActivity;Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoProduct;Lcom/xiaomi/fitness/eco/device/manager/export/IBindGuideAction;Lwc0;Z)V", "Companion", "eco-device-manager-export_release"}, k = 1, mv = {2, 0, 0})
public interface EcoBindDeviceManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/export/EcoBindDeviceManager$Companion;", "", "<init>", "()V", "eco-device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void showResetGuideView$default(EcoBindDeviceManager ecoBindDeviceManager, FragmentActivity fragmentActivity, EcoProduct ecoProduct, IBindGuideAction iBindGuideAction, wc0 wc0Var, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showResetGuideView");
            }
            if ((i & 16) != 0) {
                z = true;
            }
            ecoBindDeviceManager.showResetGuideView(fragmentActivity, ecoProduct, iBindGuideAction, wc0Var, z);
        }
    }

    boolean isEightScaleDevice(@Nullable String model);

    boolean isNotShowDisconnectTipDevices(@NotNull String model);

    boolean shouldEcoDeviceBindActivity(@NotNull Context context, @NotNull String bleMac, @NotNull String model, @NotNull String bleName, @Nullable String oob, @Nullable String bigIcon, @NotNull String deviceName, boolean isSportMachine, @Nullable AdvPacket packet, int from);

    void showResetGuideView(@NotNull FragmentActivity context, @NotNull EcoProduct product, @NotNull IBindGuideAction action, @Nullable wc0 actionBar, boolean removeContentView);
}
