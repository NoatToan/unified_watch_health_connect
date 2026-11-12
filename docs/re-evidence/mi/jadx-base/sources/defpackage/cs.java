package defpackage;

import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.bluetooth.profile.channel.module.settings.entity.general.General;
import com.huami.bluetooth.profile.channel.module.settings.entity.health.Health;
import com.huami.bluetooth.profile.channel.module.settings.entity.language.SettingsLanguage;
import com.huami.bluetooth.profile.channel.module.settings.entity.screenlock.ScreenLockAndPassword;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Flag;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.StringData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.TimeStamp;
import com.huami.bluetooth.profile.ecf.data.HidStatus;
import com.huami.bluetooth.profile.ecf.data.StandAlertConfig;
import com.miui.circulate.device.api.Constant;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.model.HMAutoBacklightInfo;
import com.xiaomi.hm.health.bt.model.HMHrReminder;
import com.xiaomi.hm.health.bt.model.HMLanguage;
import com.xiaomi.hm.health.bt.model.HMTarget;
import com.xiaomi.hm.health.bt.profile.base.SystemImageStatus;
import com.xiaomi.onetrack.c.q;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0006B\u0017\u0012\u0006\u0010X\u001a\u00020W\u0012\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\b[\u0010\\J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J=\u0010\u0006\u001a\u00020\u00052,\u0010\f\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tj\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u000b0\bH\u0002¢\u0006\u0004\b\u0006\u0010\rJ!\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0012\u0010\u0017J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0006\u0010\u0019J\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u00020\u001aH\u0002¢\u0006\u0004\b\u0012\u0010\u001bJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u001fJ\u0019\u0010\u0006\u001a\u0004\u0018\u00010\"2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\u0006\u0010#J\u0017\u0010%\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0005H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b\u0006\u0010)J\u0017\u0010*\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0005H\u0016¢\u0006\u0004\b*\u0010&J\u0017\u0010,\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u0005H\u0016¢\u0006\u0004\b,\u0010&J\u0017\u0010.\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u0005H\u0016¢\u0006\u0004\b.\u0010&J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010&J\u0017\u00100\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0005H\u0016¢\u0006\u0004\b0\u0010&J\u0017\u00101\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0005H\u0016¢\u0006\u0004\b1\u0010&J\u0011\u00100\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b0\u00102J\u0017\u00103\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0005H\u0016¢\u0006\u0004\b3\u0010&J\u0011\u00104\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b4\u00102J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010&J\u0011\u0010,\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b,\u00102J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u00106J\u0011\u00101\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b1\u00107J\u0017\u00108\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u000fH\u0016¢\u0006\u0004\b8\u00106J\u0011\u00109\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b9\u00107J\u0017\u0010:\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0005H\u0016¢\u0006\u0004\b:\u0010&J\u0011\u0010;\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b;\u00102J\u0017\u0010<\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0005H\u0016¢\u0006\u0004\b<\u0010&J\u0011\u0010=\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b=\u00102J\u0017\u0010>\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0005H\u0016¢\u0006\u0004\b>\u0010&J\u0011\u0010?\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b?\u00102J\u0017\u0010?\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0005H\u0016¢\u0006\u0004\b?\u0010&J\u0011\u0010@\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b@\u00102J\u0017\u0010A\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0005H\u0016¢\u0006\u0004\bA\u0010&J\u0011\u0010B\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\bB\u00102J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\b\u0006\u0010EJ\u0011\u0010*\u001a\u0004\u0018\u00010CH\u0016¢\u0006\u0004\b*\u0010FJ\u0017\u0010G\u001a\u00020\u00052\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bG\u0010EJ\u0011\u0010H\u001a\u0004\u0018\u00010CH\u0016¢\u0006\u0004\bH\u0010FJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010I\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u0006\u0010JJ!\u0010\u0006\u001a\u00020\u00052\u0006\u0010K\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0006\u0010LJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00052\u0006\u0010M\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0006\u0010NJ\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u00107J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0006\u00106J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u00102J\u0017\u0010O\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0005H\u0016¢\u0006\u0004\bO\u0010&J\u0017\u0010P\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0005H\u0016¢\u0006\u0004\bP\u0010&J\u0017\u0010Q\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0005H\u0016¢\u0006\u0004\bQ\u0010&J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020RH\u0016¢\u0006\u0004\b\u0006\u0010SJ\u0017\u0010T\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u0005H\u0016¢\u0006\u0004\bT\u0010&J\u0011\u0010>\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b>\u00102J\u0011\u0010U\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\bU\u00102J\u0011\u0010T\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\bT\u00102J\u0017\u0010U\u001a\u00020\u00052\u0006\u0010V\u001a\u00020\u0005H\u0016¢\u0006\u0004\bU\u0010&¨\u0006]"}, d2 = {"Lcs;", "Lzr;", "", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "settings", "", PluginDeviceInfo.FMODEL, "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;)Z", "Lkotlin/Function0;", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lkotlin/collections/HashMap;", "action", "(Lkotlin/jvm/functions/Function0;)Z", "Lcom/xiaomi/hm/health/bt/model/HMTarget;", "", "settingsVersion", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/health/Health;", PluginDeviceInfo.FDESC, "(Lcom/xiaomi/hm/health/bt/model/HMTarget;Ljava/lang/Integer;)Lcom/huami/bluetooth/profile/channel/module/settings/entity/health/Health;", "", "info", "Lkotlin/Pair;", "(Ljava/lang/String;)Lkotlin/Pair;", "Llxs;", "(Ljava/lang/String;)Llxs;", "Lcom/huami/bluetooth/profile/ecf/data/StandAlertConfig;", "(Lcom/huami/bluetooth/profile/ecf/data/StandAlertConfig;)Lcom/huami/bluetooth/profile/channel/module/settings/entity/health/Health;", "Lfd;", "mode", "show", "(Lfd;Z)Z", "Lqd;", "source", "Lcom/xiaomi/hm/health/bt/profile/base/a;", "(Lqd;)Lcom/xiaomi/hm/health/bt/profile/base/a;", "enable", "m", "(Z)Z", "Lcom/huami/bluetooth/profile/ecf/data/HidStatus;", "hidStatus", "(Lcom/huami/bluetooth/profile/ecf/data/HidStatus;)Z", PluginDeviceInfo.FLOCALIZATIONS, "disable", "i", "is12Hour", Constant.KeyValue.KEY_COLUMN, "isMetric", PluginDeviceInfo.FBLUETOOTHPAIR, PluginDeviceInfo.FICONON, "()Ljava/lang/Boolean;", "enableOsa", "getOsaEnable", "value", "(I)Z", "()Ljava/lang/Integer;", "setHrMaxValue", "getHrMaxValue", "enablePressure", "getPressureEnable", "enablePressureAlert", "getPressureAlertEnable", PluginDeviceInfo.FICONOFFLINE, "j", "getAtrialFibEnable", "enableAtrialAlertSleepNotDisturb", "getAtrialAlertSleepNotDisturbEnable", "Lcom/xiaomi/hm/health/bt/model/HMHrReminder;", "hrReminder", "(Lcom/xiaomi/hm/health/bt/model/HMHrReminder;)Z", "()Lcom/xiaomi/hm/health/bt/model/HMHrReminder;", "setLowHrReminder", "getLowHrReminder", q.f13857a, "(Lcom/huami/bluetooth/profile/ecf/data/StandAlertConfig;)Z", "target", "(Lcom/xiaomi/hm/health/bt/model/HMTarget;Ljava/lang/Integer;)Z", "interval", "(ZI)Z", "n", DeviceTagInterface.CUSTOM_TAG_DEVICE_TAG_ORDER, com.xiaomi.onetrack.b.e.f13808a, "Lcom/xiaomi/hm/health/bt/model/HMAutoBacklightInfo;", "(Lcom/xiaomi/hm/health/bt/model/HMAutoBacklightInfo;)Z", PluginDeviceInfo.FICONOFF, "h", "open", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "settingsModule", "Las;", "settingsCallback", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;Las;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class cs implements zr {

    @NotNull
    public static final a c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SettingsModule f14660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final as f14661b;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcs$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14662a;

        static {
            int[] iArr = new int[fd.values().length];
            try {
                iArr[fd.ALERT_INCALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fd.ALERT_SMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f14662a = iArr;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000j\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", PluginDeviceInfo.FMODEL, "()Ljava/util/HashMap;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements Function0<HashMap<SettingsGroupType, Settings>> {
        public final /* synthetic */ boolean t;
        public final /* synthetic */ int u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z, int i) {
            super(0);
            this.t = z;
            this.u = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashMap<SettingsGroupType, Settings> invoke() {
            EnumData enumData = new EnumData(this.t ? this.u : 0);
            Health healthA = Health.Companion.a(Health.INSTANCE, null, null, 3, null);
            if (healthA == null) {
                return null;
            }
            healthA.setHrAllayDetectionFrequency(enumData);
            return healthA.toMap();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000j\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", PluginDeviceInfo.FMODEL, "()Ljava/util/HashMap;"}, k = 3, mv = {1, 7, 1})
    public static final class d extends Lambda implements Function0<HashMap<SettingsGroupType, Settings>> {
        public final /* synthetic */ HMHrReminder t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(HMHrReminder hMHrReminder) {
            super(0);
            this.t = hMHrReminder;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashMap<SettingsGroupType, Settings> invoke() {
            EnumData enumData = new EnumData(this.t.isEnable() ? this.t.getHr() : 0);
            Health healthA = Health.Companion.a(Health.INSTANCE, null, null, 3, null);
            if (healthA == null) {
                return null;
            }
            healthA.setHrTooHighRemindValue(enumData);
            return healthA.toMap();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000j\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", PluginDeviceInfo.FMODEL, "()Ljava/util/HashMap;"}, k = 3, mv = {1, 7, 1})
    public static final class e extends Lambda implements Function0<HashMap<SettingsGroupType, Settings>> {
        public final /* synthetic */ HMHrReminder t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(HMHrReminder hMHrReminder) {
            super(0);
            this.t = hMHrReminder;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashMap<SettingsGroupType, Settings> invoke() {
            EnumData enumData = new EnumData(this.t.isEnable() ? this.t.getHr() : 0);
            Health healthA = Health.Companion.a(Health.INSTANCE, null, null, 3, null);
            if (healthA == null) {
                return null;
            }
            healthA.setHrTooLowRemindValue(enumData);
            return healthA.toMap();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000j\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", PluginDeviceInfo.FMODEL, "()Ljava/util/HashMap;"}, k = 3, mv = {1, 7, 1})
    public static final class f extends Lambda implements Function0<HashMap<SettingsGroupType, Settings>> {
        public final /* synthetic */ boolean t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z) {
            super(0);
            this.t = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashMap<SettingsGroupType, Settings> invoke() {
            EnumData enumData = new EnumData(!this.t ? 1 : 0);
            General general = new General();
            general.setMileageUnit(enumData);
            return general.toMap();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000j\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", PluginDeviceInfo.FMODEL, "()Ljava/util/HashMap;"}, k = 3, mv = {1, 7, 1})
    public static final class g extends Lambda implements Function0<HashMap<SettingsGroupType, Settings>> {
        public final /* synthetic */ boolean t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z) {
            super(0);
            this.t = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashMap<SettingsGroupType, Settings> invoke() {
            EnumData enumData = new EnumData(!this.t ? 1 : 0);
            General general = new General();
            general.setTimeFormat(enumData);
            return general.toMap();
        }
    }

    public cs(@NotNull SettingsModule settingsModule, @NotNull as settingsCallback) {
        Intrinsics.checkNotNullParameter(settingsModule, "settingsModule");
        Intrinsics.checkNotNullParameter(settingsCallback, "settingsCallback");
        this.f14660a = settingsModule;
        this.f14661b = settingsCallback;
    }

    @Override // defpackage.zr
    public boolean a(@NotNull fd mode, boolean show) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        int i = b.f14662a[mode.ordinal()];
        if (i == 1) {
            return n(show);
        }
        if (i != 2) {
            return false;
        }
        return o(show);
    }

    @Override // defpackage.zr
    public boolean b(boolean isMetric) {
        return a(new f(isMetric));
    }

    @Override // defpackage.zr
    public boolean c(boolean enable) {
        Settings settings = null;
        Health healthA = Health.Companion.a(Health.INSTANCE, null, null, 3, null);
        if (healthA != null) {
            healthA.setHrActivityMonitorSwitch(Boolean.valueOf(enable));
            settings = healthA;
        }
        return a(settings);
    }

    @Override // defpackage.zr
    public boolean d(boolean disable) {
        General general = new General();
        general.setDisableHid(Boolean.valueOf(disable));
        return a(general);
    }

    @Override // defpackage.zr
    public boolean e(boolean enable) {
        Settings settings = null;
        Health healthA = Health.Companion.a(Health.INSTANCE, null, null, 3, null);
        if (healthA != null) {
            healthA.setScientificSleepSwitch(Boolean.valueOf(enable));
            settings = healthA;
        }
        return a(settings);
    }

    @Override // defpackage.zr
    public boolean enableAtrialAlertSleepNotDisturb(boolean enable) {
        Settings settings = null;
        Health healthA = Health.Companion.a(Health.INSTANCE, null, null, 3, null);
        if (healthA != null) {
            healthA.setHeartHealthyRemindDndInSleepSwitch(Boolean.valueOf(enable));
            settings = healthA;
        }
        return a(settings);
    }

    @Override // defpackage.zr
    public boolean enableOsa(boolean enable) {
        Settings settings = null;
        Health healthA = Health.Companion.a(Health.INSTANCE, null, null, 3, null);
        if (healthA != null) {
            healthA.setOsaSwitch(Boolean.valueOf(enable));
            settings = healthA;
        }
        return a(settings);
    }

    @Override // defpackage.zr
    public boolean enablePressure(boolean enable) {
        Settings settings = null;
        Health healthA = Health.Companion.a(Health.INSTANCE, null, null, 3, null);
        if (healthA != null) {
            healthA.setAllDayPressureSwitch(Boolean.valueOf(enable));
            settings = healthA;
        }
        return a(settings);
    }

    @Override // defpackage.zr
    public boolean enablePressureAlert(boolean enable) {
        Settings settings = null;
        Health healthA = Health.Companion.a(Health.INSTANCE, null, null, 3, null);
        if (healthA != null) {
            healthA.setRelievePressureRemindSwitch(Boolean.valueOf(enable));
            settings = healthA;
        }
        return a(settings);
    }

    @Override // defpackage.zr
    public boolean f(boolean enable) {
        Settings settings = null;
        Health healthA = Health.Companion.a(Health.INSTANCE, null, null, 3, null);
        if (healthA != null) {
            healthA.setHrAdvertisementInActiveSwitch(Boolean.valueOf(enable));
            settings = healthA;
        }
        return a(settings);
    }

    @Override // defpackage.zr
    public boolean g(boolean enable) {
        i5 i5Var = new i5();
        i5Var.a(Boolean.valueOf(enable));
        return a(i5Var);
    }

    @Override // defpackage.zr
    @Nullable
    public Boolean getAtrialAlertSleepNotDisturbEnable() {
        if ((this.f14661b.c() ? this : null) == null) {
            return null;
        }
        Settings settingsQueryFieldsSync = this.f14660a.queryFieldsSync(false, SettingsGroupType.HEALTH, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(Health.INSTANCE.h())));
        Health health = settingsQueryFieldsSync instanceof Health ? (Health) settingsQueryFieldsSync : null;
        if (health != null) {
            return health.getHeartHealthyRemindDndInSleepSwitch();
        }
        return null;
    }

    @Override // defpackage.zr
    @Nullable
    public Boolean getAtrialFibEnable() {
        if ((this.f14661b.c() ? this : null) == null) {
            return null;
        }
        Settings settingsQueryFieldsSync = this.f14660a.queryFieldsSync(false, SettingsGroupType.HEALTH, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(Health.INSTANCE.g())));
        Health health = settingsQueryFieldsSync instanceof Health ? (Health) settingsQueryFieldsSync : null;
        if (health != null) {
            return health.getHeartHealthyMonitorSwitch();
        }
        return null;
    }

    @Override // defpackage.zr
    @Nullable
    public Integer getHrMaxValue() {
        IntData hrMaxValue;
        if ((this.f14661b.c() ? this : null) == null) {
            return null;
        }
        Settings settingsQueryFieldsSync = this.f14660a.queryFieldsSync(false, SettingsGroupType.HEALTH, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(Health.INSTANCE.l())));
        Health health = settingsQueryFieldsSync instanceof Health ? (Health) settingsQueryFieldsSync : null;
        if (health == null || (hrMaxValue = health.getHrMaxValue()) == null) {
            return null;
        }
        return Integer.valueOf(hrMaxValue.getT());
    }

    @Override // defpackage.zr
    @Nullable
    public HMHrReminder getLowHrReminder() {
        EnumData hrTooLowRemindValue;
        HMHrReminder hMHrReminder = null;
        if ((this.f14661b.c() ? this : null) != null) {
            Settings settingsQueryFieldsSync = this.f14660a.queryFieldsSync(false, SettingsGroupType.HEALTH, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(Health.INSTANCE.n())));
            Health health = settingsQueryFieldsSync instanceof Health ? (Health) settingsQueryFieldsSync : null;
            if (health != null && (hrTooLowRemindValue = health.getHrTooLowRemindValue()) != null) {
                int value = hrTooLowRemindValue.getValue();
                hMHrReminder = new HMHrReminder(value > 0);
                hMHrReminder.setHr(value);
            }
        }
        return hMHrReminder;
    }

    @Override // defpackage.zr
    @Nullable
    public Boolean getOsaEnable() {
        if ((this.f14661b.c() ? this : null) == null) {
            return null;
        }
        Settings settingsQueryFieldsSync = this.f14660a.queryFieldsSync(false, SettingsGroupType.HEALTH, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(Health.INSTANCE.r())));
        Health health = settingsQueryFieldsSync instanceof Health ? (Health) settingsQueryFieldsSync : null;
        if (health != null) {
            return health.getOsaSwitch();
        }
        return null;
    }

    @Override // defpackage.zr
    @Nullable
    public Boolean getPressureAlertEnable() {
        if ((this.f14661b.c() ? this : null) == null) {
            return null;
        }
        Settings settingsQueryFieldsSync = this.f14660a.queryFieldsSync(false, SettingsGroupType.HEALTH, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(Health.INSTANCE.s())));
        Health health = settingsQueryFieldsSync instanceof Health ? (Health) settingsQueryFieldsSync : null;
        if (health != null) {
            return health.getRelievePressureRemindSwitch();
        }
        return null;
    }

    @Override // defpackage.zr
    @Nullable
    public Boolean getPressureEnable() {
        if ((this.f14661b.c() ? this : null) == null) {
            return null;
        }
        Settings settingsQueryFieldsSync = this.f14660a.queryFieldsSync(false, SettingsGroupType.HEALTH, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(Health.INSTANCE.d())));
        Health health = settingsQueryFieldsSync instanceof Health ? (Health) settingsQueryFieldsSync : null;
        if (health != null) {
            return health.getAllDayPressureSwitch();
        }
        return null;
    }

    @Override // defpackage.zr
    @Nullable
    public Boolean h() {
        if ((this.f14661b.c() ? this : null) == null) {
            return null;
        }
        Settings settingsQueryFieldsSync = this.f14660a.queryFieldsSync(false, SettingsGroupType.HEALTH, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(Health.INSTANCE.x())));
        Health health = settingsQueryFieldsSync instanceof Health ? (Health) settingsQueryFieldsSync : null;
        if (health != null) {
            return health.getBloodPressureMonitorSwitch();
        }
        return null;
    }

    @Override // defpackage.zr
    public boolean i(boolean disable) {
        i5 i5Var = new i5();
        i5Var.d(Boolean.valueOf(disable));
        return a(i5Var);
    }

    @Override // defpackage.zr
    @Nullable
    public Boolean j() {
        if ((this.f14661b.c() ? this : null) == null) {
            return null;
        }
        Settings settingsQueryFieldsSync = this.f14660a.queryFieldsSync(false, SettingsGroupType.HEALTH, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(Health.INSTANCE.t())));
        Health health = settingsQueryFieldsSync instanceof Health ? (Health) settingsQueryFieldsSync : null;
        if (health != null) {
            return health.getScientificSleepSwitch();
        }
        return null;
    }

    @Override // defpackage.zr
    public boolean k(boolean is12Hour) {
        return a(new g(is12Hour));
    }

    @Override // defpackage.zr
    public boolean l(boolean enable) {
        Settings settings = null;
        Health healthA = Health.Companion.a(Health.INSTANCE, null, null, 3, null);
        if (healthA != null) {
            healthA.setBloodPressureMonitorSwitch(Boolean.valueOf(enable));
            settings = healthA;
        }
        return a(settings);
    }

    @Override // defpackage.zr
    public boolean m(boolean enable) {
        i5 i5Var = new i5();
        i5Var.c(Boolean.valueOf(enable));
        return a(i5Var);
    }

    public boolean n(boolean enable) {
        General general = new General();
        general.setInComingCallDisplayContactsSwitch(Boolean.valueOf(enable));
        return a(general);
    }

    public boolean o(boolean enable) {
        General general = new General();
        general.setSmsDisplayContactsSwitch(Boolean.valueOf(enable));
        return a(general);
    }

    @Override // defpackage.zr
    public boolean setHrMaxValue(int value) {
        Settings settings = null;
        Health healthA = Health.Companion.a(Health.INSTANCE, null, null, 3, null);
        if (healthA != null) {
            healthA.setHrMaxValue(new IntData(value));
            settings = healthA;
        }
        return a(settings);
    }

    @Override // defpackage.zr
    public boolean setLowHrReminder(@NotNull HMHrReminder hrReminder) {
        Intrinsics.checkNotNullParameter(hrReminder, "hrReminder");
        return a(new e(hrReminder));
    }

    @Override // defpackage.zr
    public boolean b(int value) {
        Settings settings = null;
        Health healthA = Health.Companion.a(Health.INSTANCE, null, null, 3, null);
        if (healthA != null) {
            healthA.setSpo2LowLevelRemindValue(new EnumData(value));
            settings = healthA;
        }
        return a(settings);
    }

    @Override // defpackage.zr
    @Nullable
    public Integer c() {
        EnumData spo2LowLevelRemindValue;
        if ((this.f14661b.c() ? this : null) == null) {
            return null;
        }
        Settings settingsQueryFieldsSync = this.f14660a.queryFieldsSync(false, SettingsGroupType.HEALTH, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(Health.INSTANCE.B())));
        Health health = settingsQueryFieldsSync instanceof Health ? (Health) settingsQueryFieldsSync : null;
        if (health == null || (spo2LowLevelRemindValue = health.getSpo2LowLevelRemindValue()) == null) {
            return null;
        }
        return Integer.valueOf(spo2LowLevelRemindValue.getValue());
    }

    @Override // defpackage.zr
    @Nullable
    public Boolean d() {
        if (!this.f14661b.c()) {
            return null;
        }
        if ((this.f14661b.c() ? this : null) == null) {
            return null;
        }
        Settings settingsQueryFieldsSync = this.f14660a.queryFieldsSync(false, SettingsGroupType.HEALTH, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(Health.INSTANCE.e())));
        Health health = settingsQueryFieldsSync instanceof Health ? (Health) settingsQueryFieldsSync : null;
        if (health != null) {
            return health.getBodyEnergySwitch();
        }
        return null;
    }

    @Override // defpackage.zr
    @Nullable
    public Boolean e() {
        if (!this.f14661b.c()) {
            return null;
        }
        Settings settingsQueryFieldsSync = this.f14660a.queryFieldsSync(false, SettingsGroupType.DEVICE_INFORMATION, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(c7.w.i())));
        c7 c7Var = settingsQueryFieldsSync instanceof c7 ? (c7) settingsQueryFieldsSync : null;
        if (c7Var != null) {
            return c7Var.w();
        }
        return null;
    }

    @Override // defpackage.zr
    @Nullable
    public Boolean f() {
        if ((this.f14661b.c() ? this : null) == null) {
            return null;
        }
        Settings settingsQueryFieldsSync = this.f14660a.queryFieldsSync(false, SettingsGroupType.HEALTH, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(Health.INSTANCE.i())));
        Health health = settingsQueryFieldsSync instanceof Health ? (Health) settingsQueryFieldsSync : null;
        if (health != null) {
            return health.getHrActivityMonitorSwitch();
        }
        return null;
    }

    @Override // defpackage.zr
    @Nullable
    public HMHrReminder g() {
        EnumData hrTooHighRemindValue;
        HMHrReminder hMHrReminder = null;
        if ((this.f14661b.c() ? this : null) != null) {
            Settings settingsQueryFieldsSync = this.f14660a.queryFieldsSync(false, SettingsGroupType.HEALTH, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(Health.INSTANCE.m())));
            Health health = settingsQueryFieldsSync instanceof Health ? (Health) settingsQueryFieldsSync : null;
            if (health != null && (hrTooHighRemindValue = health.getHrTooHighRemindValue()) != null) {
                int value = hrTooHighRemindValue.getValue();
                hMHrReminder = new HMHrReminder(value > 0);
                hMHrReminder.setHr(value);
            }
        }
        return hMHrReminder;
    }

    @Override // defpackage.zr
    @Nullable
    public Boolean i() {
        if ((this.f14661b.c() ? this : null) == null) {
            return null;
        }
        Settings settingsQueryFieldsSync = this.f14660a.queryFieldsSync(false, SettingsGroupType.HEALTH, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(Health.INSTANCE.A())));
        Health health = settingsQueryFieldsSync instanceof Health ? (Health) settingsQueryFieldsSync : null;
        if (health != null) {
            return health.getSmartSpo2MonitorSwitch();
        }
        return null;
    }

    @Override // defpackage.zr
    @Nullable
    public Integer b() {
        EnumData hrAllayDetectionFrequency;
        if ((this.f14661b.c() ? this : null) == null) {
            return null;
        }
        Settings settingsQueryFieldsSync = this.f14660a.queryFieldsSync(false, SettingsGroupType.HEALTH, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(Health.INSTANCE.k())));
        Health health = settingsQueryFieldsSync instanceof Health ? (Health) settingsQueryFieldsSync : null;
        if (health == null || (hrAllayDetectionFrequency = health.getHrAllayDetectionFrequency()) == null) {
            return null;
        }
        return Integer.valueOf(hrAllayDetectionFrequency.getValue());
    }

    @Override // defpackage.zr
    @Nullable
    public com.xiaomi.hm.health.bt.profile.base.a a(@NotNull qd source) {
        Pair<Integer, Integer> pairB;
        Pair<Integer, Integer> pairB2;
        Pair<Integer, Integer> pairB3;
        Intrinsics.checkNotNullParameter(source, "source");
        SettingsModule settingsModule = this.f14660a;
        SettingsGroupType settingsGroupType = SettingsGroupType.DEVICE_INFORMATION;
        SettingsGroupType settingsGroupType2 = SettingsGroupType.LANGUAGE;
        HashMap<SettingsGroupType, Settings> mapQuerySettingsSync = settingsModule.querySettingsSync(false, new SettingsGroupType[]{settingsGroupType, settingsGroupType2});
        if (mapQuerySettingsSync == null) {
            return null;
        }
        Settings settings = mapQuerySettingsSync.get(settingsGroupType);
        c7 c7Var = settings instanceof c7 ? (c7) settings : null;
        if (c7Var == null) {
            return null;
        }
        com.xiaomi.hm.health.bt.profile.base.a aVar = new com.xiaomi.hm.health.bt.profile.base.a();
        StringData stringDataX = c7Var.x();
        if (stringDataX != null) {
            aVar.b(stringDataX.getStringData());
        }
        IntData intDataZ = c7Var.z();
        if (intDataZ != null) {
            aVar.g(intDataZ.getT());
        }
        Flag flagV = c7Var.v();
        if (flagV != null) {
            aVar.d(flagV.getFlag());
        }
        StringData stringDataP = c7Var.p();
        if (stringDataP != null) {
            aVar.a(a(stringDataP.getStringData()));
        }
        EnumData enumDataY = c7Var.y();
        if (enumDataY != null) {
            aVar.a(SystemImageStatus.INSTANCE.a(enumDataY.getValue()));
        }
        StringData stringDataU = c7Var.u();
        if (stringDataU != null && (pairB3 = b(stringDataU.getStringData())) != null) {
            aVar.f(pairB3.getFirst().intValue());
            aVar.e(pairB3.getSecond().intValue());
        }
        StringData stringDataS = c7Var.s();
        if (stringDataS != null && (pairB2 = b(stringDataS.getStringData())) != null) {
            aVar.c(pairB2.getFirst().intValue());
            aVar.b(pairB2.getSecond().intValue());
        }
        StringData stringDataR = c7Var.r();
        if (stringDataR != null && (pairB = b(stringDataR.getStringData())) != null) {
            aVar.a(new q9(pairB.getFirst().intValue(), pairB.getSecond().intValue()));
        }
        StringData stringDataT = c7Var.t();
        if (stringDataT != null) {
            aVar.a(stringDataT.getStringData());
        }
        Flag flagN = c7Var.n();
        if (flagN != null) {
            aVar.a(Integer.valueOf(flagN.getFlag()));
        }
        TimeStamp timeStampO = c7Var.o();
        if (timeStampO != null) {
            aVar.b(Long.valueOf(timeStampO.getTimeStamp()));
        }
        TimeStamp timeStampM = c7Var.m();
        if (timeStampM != null) {
            aVar.a(Long.valueOf(timeStampM.getTimeStamp()));
        }
        aVar.b(c7Var.A());
        aVar.a(c7Var.q());
        EnumData enumDataA = SettingsLanguage.INSTANCE.a(mapQuerySettingsSync.get(settingsGroupType2));
        if (enumDataA != null) {
            aVar.a(new HMLanguage(enumDataA.getValue()));
        }
        return aVar;
    }

    @Override // defpackage.zr
    public boolean h(boolean open) {
        Settings settings = null;
        Health healthA = Health.Companion.a(Health.INSTANCE, null, null, 3, null);
        if (healthA != null) {
            healthA.setBodyEnergySwitch(Boolean.valueOf(open));
            settings = healthA;
        }
        return a(settings);
    }

    @Override // defpackage.zr
    public boolean j(boolean enable) {
        Settings settings = null;
        Health healthA = Health.Companion.a(Health.INSTANCE, null, null, 3, null);
        if (healthA != null) {
            healthA.setHeartHealthyMonitorSwitch(Boolean.valueOf(enable));
            settings = healthA;
        }
        return a(settings);
    }

    public final Health b(HMTarget hMTarget, Integer num) {
        if (hMTarget.getStepTarget() != null && num == null) {
            t5t.d("SettingsImpl", "stepTarget: " + hMTarget.getStepTarget() + ", settingsVersion null!");
            return null;
        }
        Health healthA = Health.INSTANCE.a(hMTarget.getStepTarget(), num);
        if (healthA == null) {
            return null;
        }
        Boolean stepRemind = hMTarget.getStepRemind();
        Boolean bool = Boolean.TRUE;
        healthA.setTargetAchieveRemindSwitch(Boolean.valueOf(Intrinsics.areEqual(stepRemind, bool) || Intrinsics.areEqual(hMTarget.getCalorieRemind(), bool) || Intrinsics.areEqual(hMTarget.getWeightRemind(), bool) || Intrinsics.areEqual(hMTarget.getSleepRemind(), bool) || Intrinsics.areEqual(hMTarget.getStandRemind(), bool) || Intrinsics.areEqual(hMTarget.getActivityRemind(), bool)));
        Long calorieTarget = hMTarget.getCalorieTarget();
        if (calorieTarget != null) {
            healthA.setCalorieTarget(new IntData((int) calorieTarget.longValue()));
        }
        Long weightTarget = hMTarget.getWeightTarget();
        if (weightTarget != null) {
            healthA.setWeightTarget(new IntData((int) weightTarget.longValue()));
        }
        Long sleepTarget = hMTarget.getSleepTarget();
        if (sleepTarget != null) {
            healthA.setSleepTarget(new IntData((int) sleepTarget.longValue()));
        }
        Long standTarget = hMTarget.getStandTarget();
        if (standTarget != null) {
            healthA.setStandTarget(new IntData((int) standTarget.longValue()));
        }
        Long activityTarget = hMTarget.getActivityTarget();
        if (activityTarget != null) {
            healthA.setActivityTarget(new IntData((int) activityTarget.longValue()));
        }
        return healthA;
    }

    public final Pair<Integer, Integer> b(String info) {
        Object objM886constructorimpl;
        if (info == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) info, new String[]{","}, false, 0, 6, (Object) null);
            objM886constructorimpl = Result.m886constructorimpl(new Pair(Integer.valueOf(Integer.parseInt((String) listSplit$default.get(0))), Integer.valueOf(Integer.parseInt((String) listSplit$default.get(1)))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
        if (thM889exceptionOrNullimpl != null) {
            t5t.d("SettingsImpl", "parseVersionFlag: " + thM889exceptionOrNullimpl);
        }
        return (Pair) (Result.m892isFailureimpl(objM886constructorimpl) ? null : objM886constructorimpl);
    }

    public final Health b(StandAlertConfig standAlertConfig) {
        Health healthA = Health.Companion.a(Health.INSTANCE, null, null, 3, null);
        if (healthA == null) {
            return null;
        }
        healthA.setStandUpRemindSwitch(Boolean.valueOf(standAlertConfig.getEnable()));
        healthA.setStandUpRemindStartTime(standAlertConfig.getStartTime());
        healthA.setStandUpRemindStopTime(standAlertConfig.getEndTime());
        healthA.setMiddyRestDndSwitch(Boolean.valueOf(standAlertConfig.getEnableDnd()));
        healthA.setMiddyRestStartTime(standAlertConfig.getDndStartTime());
        healthA.setMiddyRestStopTime(standAlertConfig.getDndEndTime());
        return healthA;
    }

    @Override // defpackage.zr
    public boolean a(@NotNull HidStatus hidStatus) {
        Intrinsics.checkNotNullParameter(hidStatus, "hidStatus");
        i5 i5Var = new i5();
        i5Var.c(Boolean.valueOf(c3.a((byte) hidStatus.getStatus())));
        return a(i5Var);
    }

    @Override // defpackage.zr
    public boolean a(boolean enable) {
        Settings settings = null;
        Health healthA = Health.Companion.a(Health.INSTANCE, null, null, 3, null);
        if (healthA != null) {
            healthA.setSmartSpo2MonitorSwitch(Boolean.valueOf(enable));
            settings = healthA;
        }
        return a(settings);
    }

    @Override // defpackage.zr
    public boolean a(@NotNull HMHrReminder hrReminder) {
        Intrinsics.checkNotNullParameter(hrReminder, "hrReminder");
        return a(new d(hrReminder));
    }

    @Override // defpackage.zr
    public boolean a(@NotNull StandAlertConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return a(b(config));
    }

    @Override // defpackage.zr
    public boolean a(@NotNull HMTarget target, @Nullable Integer settingsVersion) {
        Intrinsics.checkNotNullParameter(target, "target");
        return a(b(target, settingsVersion));
    }

    @Override // defpackage.zr
    public boolean a(boolean enable, int interval) {
        return a(new c(enable, interval));
    }

    @Override // defpackage.zr
    public boolean a(int mode) {
        Settings settings = null;
        Health healthA = Health.Companion.a(Health.INSTANCE, null, null, 3, null);
        if (healthA != null) {
            healthA.setActivityMode(new EnumData(mode));
            settings = healthA;
        }
        return a(settings);
    }

    @Override // defpackage.zr
    @NotNull
    public Boolean a() {
        Boolean bool;
        boolean zBooleanValue = false;
        if (this.f14661b.c()) {
            Settings settingsQueryFieldsSync = this.f14660a.queryFieldsSync(false, SettingsGroupType.SCREEN_UNLOCK_AND_PASSWORD, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(ScreenLockAndPassword.INSTANCE.b())));
            ScreenLockAndPassword screenLockAndPassword = settingsQueryFieldsSync instanceof ScreenLockAndPassword ? (ScreenLockAndPassword) settingsQueryFieldsSync : null;
            if (screenLockAndPassword != null && (bool = screenLockAndPassword.getSwitch()) != null) {
                zBooleanValue = bool.booleanValue();
            }
        }
        return Boolean.valueOf(zBooleanValue);
    }

    @Override // defpackage.zr
    public boolean a(@NotNull HMAutoBacklightInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        General general = new General();
        int mode = info.getMode();
        int i = 2;
        if (mode != 1) {
            i = mode != 2 ? 0 : 1;
        }
        general.setNightMode(new EnumData(i));
        if (info.getMode() == 1) {
            general.setNightModeStartTime(new Time(info.getStartHour(), info.getStartMinute()));
            general.setNightModeStopTime(new Time(info.getStopHour(), info.getStopMinute()));
        }
        return a(general);
    }

    public final boolean a(Settings settings) {
        if (this.f14661b.c()) {
            return this.f14660a.writeSettingSync(settings != null ? settings.toMap() : null);
        }
        return false;
    }

    public final boolean a(Function0<? extends HashMap<SettingsGroupType, Settings>> action) {
        if (this.f14661b.c()) {
            return this.f14660a.writeSettingSync(action.invoke());
        }
        return false;
    }

    public final lxs a(String info) {
        Pair<Integer, Integer> pairB;
        if (info == null || (pairB = b(info)) == null) {
            return null;
        }
        lxs lxsVar = new lxs();
        lxsVar.d(pairB.getFirst().intValue());
        lxsVar.b(pairB.getSecond().intValue());
        return lxsVar;
    }
}
