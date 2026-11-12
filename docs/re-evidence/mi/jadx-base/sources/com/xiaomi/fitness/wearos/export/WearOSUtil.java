package com.xiaomi.fitness.wearos.export;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import com.xiaomi.wearable.core.DeviceInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 -2\u00020\u0001:\u0001-J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH&J.\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u000eH&J&\u0010\u000f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u000eH&J.\u0010\u0010\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u000eH&J.\u0010\u0013\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u000eH&J\b\u0010\u0014\u001a\u00020\nH&J-\u0010\u0015\u001a\u00020\u00032#\u0010\u0016\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00030\u000eH&J+\u0010\u001b\u001a\u00020\u00032!\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00030\u000eH&J\u000e\u0010\u001e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001fH&J<\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00172\b\u0010%\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010'\u001a\u00020\nH&J\b\u0010(\u001a\u00020\nH&J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H&J\u0010\u0010'\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006."}, d2 = {"Lcom/xiaomi/fitness/wearos/export/WearOSUtil;", "", "associate", "", "nodeId", "", "unbind", "peerId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isUnderOobe", "", "setCalendarSync", "isChecked", "result", "Lkotlin/Function1;", "getCalendarSync", "getDndSync", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "setDndSync", "isWearosRequirementNotPass", "readBatteryInfo", "callBack", "", "Lkotlin/ParameterName;", "name", DialWidgetType.BATTERY_LEVEL, "syncWearOSBugreport", "handler", "message", "gotoWearOsTilePage", "Ljava/lang/Class;", "launchBindWearOSPage", "context", "Landroid/content/Context;", "mac", "product", "bundles", "Landroid/os/Bundle;", "isPhoneSwitching", "isWearOSZenMode", "getWearOSApi", "Lcom/xiaomi/fitness/wearos/export/WearOSApi;", "deviceInfo", "Lcom/xiaomi/wearable/core/DeviceInfo;", "Companion", "wearos-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface WearOSUtil {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/wearos/export/WearOSUtil$Companion;", "", "<init>", "()V", "wearos-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void launchBindWearOSPage$default(WearOSUtil wearOSUtil, Context context, String str, String str2, int i, Bundle bundle, boolean z, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchBindWearOSPage");
            }
            if ((i2 & 32) != 0) {
                z = false;
            }
            wearOSUtil.launchBindWearOSPage(context, str, str2, i, bundle, z);
        }
    }

    void associate(@Nullable String nodeId);

    void getCalendarSync(@Nullable String nodeId, @NotNull Function1<? super Boolean, Unit> result);

    void getDndSync(@Nullable String nodeId, @NotNull LifecycleOwner lifecycleOwner, @NotNull Function1<? super Boolean, Unit> result);

    @NotNull
    WearOSApi getWearOSApi(@NotNull DeviceInfo deviceInfo);

    @Nullable
    Class<?> gotoWearOsTilePage();

    boolean isPhoneSwitching(@NotNull String nodeId);

    boolean isUnderOobe();

    boolean isWearOSZenMode();

    boolean isWearosRequirementNotPass();

    void launchBindWearOSPage(@NotNull Context context, @NotNull String mac, @NotNull String name, int product, @Nullable Bundle bundles, boolean isPhoneSwitching);

    void readBatteryInfo(@NotNull Function1<? super Integer, Unit> callBack);

    void setCalendarSync(@Nullable String nodeId, boolean isChecked, @NotNull Function1<? super Boolean, Unit> result);

    void setDndSync(@Nullable String nodeId, boolean isChecked, @NotNull Function1<? super Boolean, Unit> result);

    void syncWearOSBugreport(@NotNull Function1<? super Integer, Unit> handler);

    @Nullable
    Object unbind(@NotNull String str, @NotNull Continuation<? super Unit> continuation);
}
