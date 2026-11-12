package com.xiaomi.wearable.hm;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.channel.module.settings.ChangeListener;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.wearable.hm.ChangeListenerImpl;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\f\u001a\u00020\u00042\"\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/wearable/hm/ChangeListenerImpl;", "Lcom/huami/bluetooth/profile/channel/module/settings/ChangeListener;", "Lcom/xiaomi/wearable/hm/o;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "addChangeListener", "(Lcom/xiaomi/wearable/hm/o;)V", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "settings", "onChange", "(Ljava/util/HashMap;)V", "Landroid/os/RemoteCallbackList;", "mChangeListeners", "Landroid/os/RemoteCallbackList;", "<init>", "()V", "Companion", "huami-export_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nChangeListenerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeListenerImpl.kt\ncom/xiaomi/wearable/hm/ChangeListenerImpl\n+ 2 ListExt.kt\ncom/xiaomi/fitness/common/extensions/ListExtKt\n*L\n1#1,105:1\n90#2,19:106\n*S KotlinDebug\n*F\n+ 1 ChangeListenerImpl.kt\ncom/xiaomi/wearable/hm/ChangeListenerImpl\n*L\n55#1:106,19\n*E\n"})
public final class ChangeListenerImpl implements ChangeListener {

    @NotNull
    public static final String SETTING_GROUP_TYPE_CONNECTION = "CONNECTION";

    @NotNull
    public static final String SETTING_GROUP_TYPE_DEVICE_INFORMATION = "DEVICE_INFORMATION";

    @NotNull
    public static final String SETTING_GROUP_TYPE_DISPLAY = "DISPLAY";

    @NotNull
    public static final String SETTING_GROUP_TYPE_GENERAL = "GENERAL";

    @NotNull
    public static final String SETTING_GROUP_TYPE_HEALTH = "HEALTH";

    @NotNull
    public static final String SETTING_GROUP_TYPE_LANGUAGE = "LANGUAGE";

    @NotNull
    public static final String SETTING_GROUP_TYPE_NFC = "NFC";

    @NotNull
    public static final String SETTING_GROUP_TYPE_OFFLINE_VOICE = "OFFLINE_VOICE";

    @NotNull
    public static final String SETTING_GROUP_TYPE_SCREEN_UNLOCK_AND_PASSWORD = "SCREEN_UNLOCK_AND_PASSWORD";

    @NotNull
    public static final String SETTING_GROUP_TYPE_SOUND_AND_VIBRATION = "SOUND_AND_VIBRATION";

    @NotNull
    public static final String SETTING_GROUP_TYPE_SPORT = "SPORT";

    @NotNull
    public static final String SETTING_GROUP_TYPE_WEARING = "WEARING";

    @NotNull
    private final RemoteCallbackList<o> mChangeListeners = new RemoteCallbackList<>();

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<ChangeListenerImpl> instance$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: dt3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ChangeListenerImpl.instance_delegate$lambda$1();
        }
    });

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/wearable/hm/ChangeListenerImpl$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/wearable/hm/ChangeListenerImpl;", "getInstance", "()Lcom/xiaomi/wearable/hm/ChangeListenerImpl;", "instance$delegate", "Lkotlin/Lazy;", "SETTING_GROUP_TYPE_DEVICE_INFORMATION", "", "SETTING_GROUP_TYPE_DISPLAY", "SETTING_GROUP_TYPE_NFC", "SETTING_GROUP_TYPE_SOUND_AND_VIBRATION", "SETTING_GROUP_TYPE_SCREEN_UNLOCK_AND_PASSWORD", "SETTING_GROUP_TYPE_WEARING", "SETTING_GROUP_TYPE_OFFLINE_VOICE", "SETTING_GROUP_TYPE_LANGUAGE", "SETTING_GROUP_TYPE_HEALTH", "SETTING_GROUP_TYPE_SPORT", "SETTING_GROUP_TYPE_GENERAL", "SETTING_GROUP_TYPE_CONNECTION", "huami-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ChangeListenerImpl getInstance() {
            return (ChangeListenerImpl) ChangeListenerImpl.instance$delegate.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChangeListenerImpl instance_delegate$lambda$1() {
        return new ChangeListenerImpl();
    }

    public final void addChangeListener(@NotNull o listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mChangeListeners.register(listener);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.ChangeListener
    public void onChange(@NotNull HashMap<SettingsGroupType, Settings> settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        HashMap map = new HashMap();
        for (Map.Entry<SettingsGroupType, Settings> entry : settings.entrySet()) {
            map.put(ChangeListenerImplKt.value2String(entry.getKey()), HuamiDataWrapperKt.wrap(entry.getValue()));
        }
        RemoteCallbackList<o> remoteCallbackList = this.mChangeListeners;
        try {
            try {
                try {
                    int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i = 0; i < iBeginBroadcast; i++) {
                        try {
                            IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i);
                            Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                            ((o) broadcastItem).onChangeInternal(map);
                        } catch (Exception e) {
                            Logger.e("action(" + remoteCallbackList.getBroadcastItem(i) + ") throw exception", e);
                        }
                    }
                    remoteCallbackList.finishBroadcast();
                } catch (Throwable th) {
                    try {
                        remoteCallbackList.finishBroadcast();
                    } catch (Exception e2) {
                        Logger.e("An exception occurred when finishBroadcast", e2);
                    }
                    throw th;
                }
            } catch (Exception e3) {
                Logger.e("An exception occurred during RemoteCallbackList forEach", e3);
                remoteCallbackList.finishBroadcast();
            }
        } catch (Exception e4) {
            Logger.e("An exception occurred when finishBroadcast", e4);
        }
    }
}
