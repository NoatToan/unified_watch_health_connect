package com.xiaomi.fitness.notify;

import android.provider.Telephony;
import android.text.TextUtils;
import com.facebook.react.bridge.BaseJavaModule;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.v2.DisplayAndBrightnessV2;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.mibi.sdk.common.CommonConstants;
import com.xiaomi.fitness.access.misport.MiSportImportUtilKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.notify.data.InstallApplicationInfo;
import com.xiaomi.fitness.notify.di.NotifyStartExtKt;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.db.entity.SettingItemEntity;
import com.xiaomi.fitness.settingitem.settingitem.AndroidappNotifySettings;
import com.xiaomi.fitness.settingitem.settingitem.InCall;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertApp;
import defpackage.xpd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 D2\u00020\u0001:\u0001DB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J \u0010\f\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u0016J \u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0016J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0016J&\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u0016J\u0018\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u000fH\u0016J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u000fH\u0016J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u000fH\u0016J\u0010\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0016\u0010$\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u001fJ\u0010\u0010&\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010'\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u000fH\u0016J3\u0010(\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032!\u0010)\u001a\u001d\u0012\u0013\u0012\u00110+¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\u00070*H\u0016J \u0010/\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u000fH\u0016J\n\u00102\u001a\u0004\u0018\u000103H\u0002J\u0087\u0001\u00104\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032u\u0010)\u001aq\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(0\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(1\u0012\u0013\u0012\u00110+¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(6\u0012\u0013\u0012\u00110+¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110+¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(7\u0012\u0004\u0012\u00020\u000705H\u0016J\u0018\u00108\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u000fH\u0016J\b\u0010:\u001a\u00020\u0007H\u0016J\b\u0010;\u001a\u00020\u0007H\u0016J\b\u0010<\u001a\u00020\u0007H\u0016J\b\u0010=\u001a\u00020\u000fH\u0016J\u0010\u0010>\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u000fH\u0016J\b\u0010?\u001a\u00020\u0007H\u0016J\b\u0010@\u001a\u00020\u0007H\u0016J\b\u0010A\u001a\u00020\u0007H\u0016J\u000e\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\tH\u0016R&\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001f0\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006E"}, d2 = {"Lcom/xiaomi/fitness/notify/HuaMiNotifySettingImpl;", "Lcom/xiaomi/fitness/notify/DeviceNotificationSettingManager;", "did", "", "<init>", "(Ljava/lang/String;)V", "removeAllConfig", "", "getNotifyEnableList", "", "getNotifySetting", "Lcom/xiaomi/fitness/notify/HuaMiNotifySetting;", "setNotifyEnable", "packageName", "enable", "", "setNotifyEnableList", "packageNameList", "isNotificationEnable", "notificationGroup", "enableList", "setNotifySwitchStatus", "status", "isNotifySwitchStatusEnable", "setSyncAllNotifySwitchStatusEnable", BaseJavaModule.METHOD_TYPE_SYNC, "isSyncAllNotifySwitchStatusEnable", "setNotifyStatusOnScreenLock", "isNotifyStatusOnScreenLockEnable", "inCallMap", "Ljava/util/HashMap;", "Lcom/xiaomi/fitness/settingitem/settingitem/InCall;", "getInCallMap", "()Ljava/util/HashMap;", "setInCallMap", "(Ljava/util/HashMap;)V", "setInCall", "inCall", "isTelNotifyEnable", "setScreenOnByNewNotificationSwitch", "isScreenOnByNewNotificationSwitch", "callBack", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "result", "updateNotificationSettings", "notifyEnabled", "allEnable", "querySettingSync", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/v2/DisplayAndBrightnessV2;", "getNotificationSettings", "Lkotlin/Function5;", "screenOnNewNotification", "isOnlyWear", "updateOnlyWearEnable", "checked", "getAllAppMuteStates", "loadSilenceWhileUsingPhone", "deAttachNotify", "isCallSyncResult", "setWearOSSettingCallSync", "loadWearOSCallSync", "deAttachCallNotify", "initWearOsAllSync", "getInstallApplicationList", "Lcom/xiaomi/fitness/notify/data/InstallApplicationInfo;", "Companion", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HuaMiNotifySettingImpl implements DeviceNotificationSettingManager {

    @NotNull
    private static final String TAG = "HuaMiNotifySettingImpl";

    @NotNull
    private static final String WECHAT_PACKAGE_NAME = "com.tencent.mm";

    @NotNull
    private static final String WECHAT_RED_ENVELOP = "[微信红包]";

    @NotNull
    private HashMap<String, InCall> inCallMap;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final List<String> SMS_APPS = new ArrayList<String>() { // from class: com.xiaomi.fitness.notify.HuaMiNotifySettingImpl$Companion$SMS_APPS$1
        {
            add("com.android.mms");
            add("com.android.mms.service");
            add(Telephony.Sms.getDefaultSmsPackage(AppUtil.getApp()));
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return contains((String) obj);
            }
            return false;
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return indexOf((String) obj);
            }
            return -1;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return lastIndexOf((String) obj);
            }
            return -1;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ String remove(int i) {
            return removeAt(i);
        }

        public /* bridge */ String removeAt(int i) {
            return (String) super.remove(i);
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ int size() {
            return getSize();
        }

        public /* bridge */ boolean contains(String str) {
            return super.contains((Object) str);
        }

        public /* bridge */ int indexOf(String str) {
            return super.indexOf((Object) str);
        }

        public /* bridge */ int lastIndexOf(String str) {
            return super.lastIndexOf((Object) str);
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean remove(Object obj) {
            if (obj instanceof String) {
                return remove((String) obj);
            }
            return false;
        }

        public /* bridge */ boolean remove(String str) {
            return super.remove((Object) str);
        }
    };

    @NotNull
    private static final HashMap<String, HMAlertApp> WHITE_APPS = new HashMap<String, HMAlertApp>() { // from class: com.xiaomi.fitness.notify.HuaMiNotifySettingImpl$Companion$WHITE_APPS$1
        {
            put("com.facebook.katana", HMAlertApp.FACEBOOK);
            put(MiSportImportUtilKt.MI_SPORT_PKG, HMAlertApp.MSPORT);
            put("com.xiaomi.channel", HMAlertApp.MTALKING);
            HMAlertApp hMAlertApp = HMAlertApp.QQ;
            put("com.tencent.mobileqq", hMAlertApp);
            put("com.tencent.qqlite", hMAlertApp);
            put("com.tencent.minihd.qq", hMAlertApp);
            put("com.tencent.mobileqqi", hMAlertApp);
            put("com.snapchat.android", HMAlertApp.SNAPCHAT);
            put("com.taobao.taobao", HMAlertApp.TAOBAO);
            put("com.twitter.android", HMAlertApp.TWITTER);
            put("com.tencent.mm", HMAlertApp.WECHAT);
            put("com.sina.weibo", HMAlertApp.WEIBO);
            put("com.whatsapp", HMAlertApp.WHATSAPP);
            HMAlertApp hMAlertApp2 = HMAlertApp.ZHIFUBAO;
            put("com.eg.android.alipaygphone", hMAlertApp2);
            put(CommonConstants.ALIPAY_PACKAGE_NAME, hMAlertApp2);
            put("com.immomo.momo", HMAlertApp.MOMO);
            put("jp.naver.line.android", HMAlertApp.LINE);
            put("com.taobao.qianniu", HMAlertApp.QIANNIU);
            put("com.baidu.tieba", HMAlertApp.TIEBA);
            put("com.qzone", HMAlertApp.QQZONE);
            HMAlertApp hMAlertApp3 = HMAlertApp.XIANYU;
            put("com.taobao.fleamarket", hMAlertApp3);
            put("com.taobao.idlefish", hMAlertApp3);
            put("com.xiaomi.shop", HMAlertApp.MISHOP);
            put("com.jingdong.app.mall", HMAlertApp.JD);
            put("com.alibaba.android.rimet", HMAlertApp.DINGDING);
            HMAlertApp hMAlertApp4 = HMAlertApp.CALENDAR;
            put("com.android.calendar", hMAlertApp4);
            put("com.google.android.calendar", hMAlertApp4);
            put("com.bbk.calendar", hMAlertApp4);
            put("com.viber.voip", HMAlertApp.VIBER);
            put("org.telegram.messenger", HMAlertApp.MESSENGER);
            put("com.facebook.orca", HMAlertApp.FMESSENGER);
            put("com.kakao.talk", HMAlertApp.KAKAOTALK);
            put("com.skype.raider", HMAlertApp.SKYPE);
            put("com.vkontakte.android", HMAlertApp.VKONTAKTE);
            put("com.instagram.android", HMAlertApp.INSTAGRAM);
            put("com.google.android.talk", HMAlertApp.HANGOUTS);
            put("com.nianticlabs.pokemongo", HMAlertApp.POKEMON);
            put("com.tencent.tim", HMAlertApp.TIM);
            put("com.google.android.youtube", HMAlertApp.YOUTUBE);
            put("com.huami.watch.hmwatchmanager", HMAlertApp.AMAZFIT);
            put("com.xiaomi.smarthome", HMAlertApp.MI_JIA);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof String) {
                return containsKey((String) obj);
            }
            return false;
        }

        public /* bridge */ boolean containsValue(HMAlertApp hMAlertApp) {
            return super.containsValue((Object) hMAlertApp);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Map.Entry<String, HMAlertApp>> entrySet() {
            return getEntries();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ HMAlertApp get(Object obj) {
            if (obj instanceof String) {
                return get((String) obj);
            }
            return null;
        }

        public /* bridge */ Set<Map.Entry<String, HMAlertApp>> getEntries() {
            return super.entrySet();
        }

        public /* bridge */ Set<String> getKeys() {
            return super.keySet();
        }

        public final /* bridge */ HMAlertApp getOrDefault(Object obj, HMAlertApp hMAlertApp) {
            return !(obj instanceof String) ? hMAlertApp : getOrDefault((String) obj, hMAlertApp);
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ Collection<HMAlertApp> getValues() {
            return super.values();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<String> keySet() {
            return getKeys();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ HMAlertApp remove(Object obj) {
            if (obj instanceof String) {
                return remove((String) obj);
            }
            return null;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection<HMAlertApp> values() {
            return getValues();
        }

        public /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof HMAlertApp) {
                return containsValue((HMAlertApp) obj);
            }
            return false;
        }

        public /* bridge */ HMAlertApp get(String str) {
            return (HMAlertApp) super.get((Object) str);
        }

        public /* bridge */ HMAlertApp getOrDefault(String str, HMAlertApp hMAlertApp) {
            return (HMAlertApp) super.getOrDefault((Object) str, hMAlertApp);
        }

        public /* bridge */ HMAlertApp remove(String str) {
            return (HMAlertApp) super.remove((Object) str);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (obj instanceof String) {
                return get((String) obj);
            }
            return null;
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof String) ? obj2 : getOrDefault((String) obj, (HMAlertApp) obj2);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof String) {
                return remove((String) obj);
            }
            return null;
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if ((obj instanceof String) && (obj2 instanceof HMAlertApp)) {
                return remove((String) obj, (HMAlertApp) obj2);
            }
            return false;
        }

        public /* bridge */ boolean remove(String str, HMAlertApp hMAlertApp) {
            return super.remove((Object) str, (Object) hMAlertApp);
        }
    };

    @NotNull
    private static final HuaMiNotifySettingImpl instance = new HuaMiNotifySettingImpl("");

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/notify/HuaMiNotifySettingImpl$Companion;", "", "<init>", "()V", "TAG", "", "WECHAT_PACKAGE_NAME", "WECHAT_RED_ENVELOP", "SMS_APPS", "", "WHITE_APPS", "Ljava/util/HashMap;", "Lcom/xiaomi/hm/health/bt/profile/alert/HMAlertApp;", "instance", "Lcom/xiaomi/fitness/notify/HuaMiNotifySettingImpl;", "getInstance", "()Lcom/xiaomi/fitness/notify/HuaMiNotifySettingImpl;", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HuaMiNotifySettingImpl getInstance() {
            return HuaMiNotifySettingImpl.instance;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.notify.HuaMiNotifySettingImpl$setScreenOnByNewNotificationSwitch$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.notify.HuaMiNotifySettingImpl$setScreenOnByNewNotificationSwitch$1", f = "HuaMiNotifySettingImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        final /* synthetic */ boolean $sync;
        int label;
        final /* synthetic */ HuaMiNotifySettingImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, HuaMiNotifySettingImpl huaMiNotifySettingImpl, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$sync = z;
            this.this$0 = huaMiNotifySettingImpl;
            this.$did = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$sync, this.this$0, this.$did, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
            DisplayAndBrightnessV2 displayAndBrightnessV2 = new DisplayAndBrightnessV2();
            displayAndBrightnessV2.setScreenOnByNewNotificationSwitch(Boxing.boxBoolean(this.$sync));
            WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(companion);
            Intrinsics.checkNotNull(wearableDeviceModel);
            HuamiApiCaller huaMiApiCaller = deviceManagerExtKt.getHuaMiApiCaller(DeviceModelExtKt.getMac(wearableDeviceModel));
            Intrinsics.checkNotNull(huaMiApiCaller);
            if (huaMiApiCaller.writeSettingSync(displayAndBrightnessV2)) {
                HuaMiNotifySetting notifySetting = this.this$0.getNotifySetting(this.$did);
                notifySetting.setScreenOnByNewNotificationSwitch(this.$sync);
                DeviceSettingManager.INSTANCE.getInstance().sendBigSettingItem(this.$did, DeviceSettingConfigKey.BIG_KEY_NOTIFY_SETTINGS, HuaMiNotifySetting.INSTANCE.convertToSettingSync(notifySetting));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public HuaMiNotifySettingImpl(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        this.inCallMap = new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HuaMiNotifySetting getNotifySetting(String did) {
        SettingItemEntity settingItemValue = DeviceSettingManager.INSTANCE.getInstance().readSettingItemValue(did, DeviceSettingConfigKey.BIG_KEY_NOTIFY_SETTINGS);
        if (settingItemValue == null || TextUtils.isEmpty(settingItemValue.getValue())) {
            return new HuaMiNotifySetting();
        }
        return HuaMiNotifySetting.INSTANCE.convertFromSettingSync((AndroidappNotifySettings) xpd.f(settingItemValue.getValue(), AndroidappNotifySettings.class));
    }

    private final DisplayAndBrightnessV2 querySettingSync() {
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(companion);
        Intrinsics.checkNotNull(wearableDeviceModel);
        HuamiApiCaller huaMiApiCaller = deviceManagerExtKt.getHuaMiApiCaller(DeviceModelExtKt.getMac(wearableDeviceModel));
        Intrinsics.checkNotNull(huaMiApiCaller);
        Settings settingsQuerySettingSync = huaMiApiCaller.querySettingSync(SettingsGroupType.DISPLAY);
        if (settingsQuerySettingSync instanceof DisplayAndBrightnessV2) {
            return (DisplayAndBrightnessV2) settingsQuerySettingSync;
        }
        return null;
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public void deAttachCallNotify() {
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public void deAttachNotify() {
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public void getAllAppMuteStates() {
    }

    @NotNull
    public final HashMap<String, InCall> getInCallMap() {
        return this.inCallMap;
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    @NotNull
    public List<InstallApplicationInfo> getInstallApplicationList() {
        return new ArrayList();
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public void getNotificationSettings(@NotNull String did, @NotNull Function5<? super Boolean, ? super Boolean, ? super Integer, ? super Integer, ? super Integer, Unit> callBack) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        HuaMiNotifySetting notifySetting = getNotifySetting(did);
        callBack.invoke(Boolean.valueOf(notifySetting.getSwitchStatus()), Boolean.valueOf(notifySetting.getIsAllNotificationSync()), Integer.valueOf(notifySetting.getIsScreenOnByNewNotificationSwitch() ? 1 : 2), Integer.valueOf(notifySetting.getSwitchStatusOnScreenLock() ? 1 : 2), 0);
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    @NotNull
    public List<String> getNotifyEnableList(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return isNotifySwitchStatusEnable(did) ? getNotifySetting(did).getEnableAppList() : new ArrayList();
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public void initWearOsAllSync() {
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public boolean isCallSyncResult() {
        return false;
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public boolean isNotificationEnable(@NotNull String did, @NotNull String packageName, @NotNull String notificationGroup) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(notificationGroup, "notificationGroup");
        List<String> notifyEnableList = getNotifyEnableList(did);
        if (isNotificationEnable(did, packageName, notifyEnableList)) {
            return true;
        }
        if (!Intrinsics.areEqual("com.xiaomi.xmsf", packageName) || TextUtils.isEmpty(notificationGroup)) {
            return false;
        }
        return isNotificationEnable(did, notificationGroup, notifyEnableList);
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public boolean isNotifyStatusOnScreenLockEnable(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return getNotifySetting(did).getSwitchStatusOnScreenLock();
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public boolean isNotifySwitchStatusEnable(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return getNotifySetting(did).getSwitchStatus();
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public void isScreenOnByNewNotificationSwitch(@NotNull String did, @NotNull Function1<? super Integer, Unit> callBack) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        DisplayAndBrightnessV2 displayAndBrightnessV2QuerySettingSync = querySettingSync();
        if (displayAndBrightnessV2QuerySettingSync == null) {
            callBack.invoke2(Integer.valueOf(getNotifySetting(did).getIsScreenOnByNewNotificationSwitch() ? 1 : 2));
            return;
        }
        Boolean screenOnByNewNotificationSwitch = displayAndBrightnessV2QuerySettingSync.getScreenOnByNewNotificationSwitch();
        setScreenOnByNewNotificationSwitch(did, screenOnByNewNotificationSwitch != null ? screenOnByNewNotificationSwitch.booleanValue() : false);
        callBack.invoke2(Integer.valueOf(Intrinsics.areEqual(displayAndBrightnessV2QuerySettingSync.getScreenOnByNewNotificationSwitch(), Boolean.TRUE) ? 1 : 2));
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public boolean isSyncAllNotifySwitchStatusEnable(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return getNotifySetting(did).getIsAllNotificationSync();
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public boolean isTelNotifyEnable(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        InCall inCall = this.inCallMap.get(did);
        if (inCall == null) {
            return false;
        }
        Logger.d("isTelNotifyEnabled:" + inCall.isIncallNotifyEnabled(), new Object[0]);
        return inCall.isIncallNotifyEnabled();
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public void loadSilenceWhileUsingPhone() {
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public void loadWearOSCallSync() {
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public void removeAllConfig(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        DeviceSettingManager.INSTANCE.getInstance().sendBigSettingItem(did, DeviceSettingConfigKey.BIG_KEY_NOTIFY_SETTINGS, "");
    }

    public final void setInCall(@NotNull String did, @NotNull InCall inCall) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(inCall, "inCall");
        this.inCallMap.put(did, inCall);
    }

    public final void setInCallMap(@NotNull HashMap<String, InCall> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.inCallMap = map;
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public void setNotifyEnable(@NotNull String did, @NotNull String packageName, boolean enable) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        HuaMiNotifySetting notifySetting = getNotifySetting(did);
        List<String> enableAppList = notifySetting.getEnableAppList();
        if (!enable) {
            enableAppList.remove(packageName);
        } else if (!enableAppList.contains(packageName)) {
            enableAppList.add(packageName);
        }
        AndroidappNotifySettings androidappNotifySettingsConvertToSettingSync = HuaMiNotifySetting.INSTANCE.convertToSettingSync(notifySetting);
        Logger.d(TAG, "setNotifyEnable setting is " + androidappNotifySettingsConvertToSettingSync);
        DeviceSettingManager.INSTANCE.getInstance().sendBigSettingItem(did, DeviceSettingConfigKey.BIG_KEY_NOTIFY_SETTINGS, androidappNotifySettingsConvertToSettingSync);
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public void setNotifyEnableList(@NotNull String did, @NotNull List<String> packageNameList) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(packageNameList, "packageNameList");
        HuaMiNotifySetting notifySetting = getNotifySetting(did);
        List<String> enableAppList = notifySetting.getEnableAppList();
        for (String str : packageNameList) {
            if (!enableAppList.contains(str)) {
                enableAppList.add(str);
            }
        }
        AndroidappNotifySettings androidappNotifySettingsConvertToSettingSync = HuaMiNotifySetting.INSTANCE.convertToSettingSync(notifySetting);
        Logger.d(TAG, "setNotifyEnableList setting is " + androidappNotifySettingsConvertToSettingSync);
        DeviceSettingManager.INSTANCE.getInstance().sendBigSettingItem(did, DeviceSettingConfigKey.BIG_KEY_NOTIFY_SETTINGS, androidappNotifySettingsConvertToSettingSync);
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public void setNotifyStatusOnScreenLock(@NotNull String did, boolean status) {
        Intrinsics.checkNotNullParameter(did, "did");
        HuaMiNotifySetting notifySetting = getNotifySetting(did);
        notifySetting.setSwitchStatusOnScreenLock(status);
        DeviceSettingManager.INSTANCE.getInstance().sendBigSettingItem(did, DeviceSettingConfigKey.BIG_KEY_NOTIFY_SETTINGS, HuaMiNotifySetting.INSTANCE.convertToSettingSync(notifySetting));
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public void setNotifySwitchStatus(@NotNull String did, boolean status) {
        Intrinsics.checkNotNullParameter(did, "did");
        HuaMiNotifySetting notifySetting = getNotifySetting(did);
        notifySetting.setSwitchStatus(status);
        DeviceSettingManager.INSTANCE.getInstance().sendBigSettingItem(did, DeviceSettingConfigKey.BIG_KEY_NOTIFY_SETTINGS, HuaMiNotifySetting.INSTANCE.convertToSettingSync(notifySetting));
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public void setScreenOnByNewNotificationSwitch(@NotNull String did, boolean sync) {
        Intrinsics.checkNotNullParameter(did, "did");
        ScopeExtKt.scopeNet(Dispatchers.getIO(), new AnonymousClass1(sync, this, did, null));
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public void setSyncAllNotifySwitchStatusEnable(@NotNull String did, boolean sync) {
        Intrinsics.checkNotNullParameter(did, "did");
        HuaMiNotifySetting notifySetting = getNotifySetting(did);
        notifySetting.setSwitchStatus(true);
        notifySetting.setAllNotificationSync(sync);
        DeviceSettingManager.INSTANCE.getInstance().sendBigSettingItem(did, DeviceSettingConfigKey.BIG_KEY_NOTIFY_SETTINGS, HuaMiNotifySetting.INSTANCE.convertToSettingSync(notifySetting));
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public void setWearOSSettingCallSync(boolean sync) {
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public void updateNotificationSettings(@NotNull String did, boolean notifyEnabled, boolean allEnable) {
        Intrinsics.checkNotNullParameter(did, "did");
        HuaMiNotifySetting notifySetting = getNotifySetting(did);
        notifySetting.setSwitchStatus(notifyEnabled);
        notifySetting.setAllNotificationSync(allEnable);
        DeviceSettingManager.INSTANCE.getInstance().sendBigSettingItem(did, DeviceSettingConfigKey.BIG_KEY_NOTIFY_SETTINGS, HuaMiNotifySetting.INSTANCE.convertToSettingSync(notifySetting));
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public void updateOnlyWearEnable(@NotNull String did, boolean checked) {
        Intrinsics.checkNotNullParameter(did, "did");
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public boolean isNotificationEnable(@NotNull String did, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return isNotificationEnable(did, packageName, getNotifyEnableList(did));
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public boolean isNotificationEnable(@NotNull String did, @NotNull String packageName, @NotNull List<String> enableList) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(enableList, "enableList");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null && !DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "notification")) {
            return false;
        }
        if (NotifyStartExtKt.getNotificationManagerImpl().isTelApp(packageName)) {
            packageName = "telephony_app";
        }
        Iterator<String> it = enableList.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(packageName, it.next())) {
                return true;
            }
        }
        return false;
    }
}
