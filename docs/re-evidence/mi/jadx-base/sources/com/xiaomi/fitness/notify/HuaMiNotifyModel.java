package com.xiaomi.fitness.notify;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Telephony;
import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.access.misport.MiSportImportUtilKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.notify.HuaMiNotifyModel;
import com.xiaomi.fitness.notify.callnotify.CallNotifyViewModel;
import com.xiaomi.fitness.notify.di.NotifyStartExtKt;
import com.xiaomi.fitness.notify.extension.DeviceModelExtKt;
import com.xiaomi.fitness.notify.util.NotifyUtil;
import com.xiaomi.fitness.settingitem.settingitem.InCall;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertApp;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.eu6;
import defpackage.rxg;
import defpackage.sxg;
import java.util.ArrayList;
import java.util.Arrays;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 @2\u00020\u0001:\u0001@B\t\b\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J9\u0010\u001a\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ?\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010\"\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010 \u001a\u0004\u0018\u00010\u00162\b\u0010!\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\"\u0010#J9\u0010'\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u0016H\u0002¢\u0006\u0004\b'\u0010\u001bJ'\u0010*\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0010\u0010)\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010(¢\u0006\u0004\b*\u0010+J+\u0010.\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010,\u001a\u0004\u0018\u00010\u00162\b\u0010-\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b.\u0010#J\u0017\u0010/\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b/\u0010\u0010J%\u00103\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u000e\u00102\u001a\n\u0012\u0004\u0012\u000201\u0018\u000100¢\u0006\u0004\b3\u0010+J\u0015\u00105\u001a\u00020\u000e2\u0006\u00104\u001a\u00020\u0014¢\u0006\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\bR\u0014\u0010=\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\b¨\u0006A"}, d2 = {"Lcom/xiaomi/fitness/notify/HuaMiNotifyModel;", "", "Lrxg;", "notifyData", "", "isWechatRedEnvelop", "(Lrxg;)Z", "needRequestCallLogPerm", "()Z", "needRequestContactsPerm", "isCall", "isSms", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "", "alertHongBao", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "Lcom/xiaomi/fitness/device/manager/export/HuamiApiCaller;", "getHuamiApiCaller", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)Lcom/xiaomi/fitness/device/manager/export/HuamiApiCaller;", "", "id", "", "title", "message", "packageName", "alertGenericApp", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/xiaomi/hm/health/bt/profile/alert/HMAlertApp;", "app", "alertApp", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;ILcom/xiaomi/hm/health/bt/profile/alert/HMAlertApp;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "display", TSMAuthContants.PARAM_PHONE_NUMBER, "alertInCall", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Ljava/lang/String;Ljava/lang/String;)V", "name", "text", "packagename", "alertSms", "", "notifyDataList", "postNotifications", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Ljava/util/List;)V", "phoneName", MediaStoreUtil.MediaInfo.DISPLAY_NAME, "alertCall", "alertInCallStop", "", "Lsxg;", "mNotifyDataRemoveList", "removeNotifications", "state", "updatePhoneStatus", "(I)V", "Landroid/os/Handler;", "mAlertIncallHandler", "Landroid/os/Handler;", "phoneStatus", "I", "isCallPermGranted", "isNeedContactPermGranted", "<init>", "()V", "Companion", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HuaMiNotifyModel {

    @NotNull
    private static final String TAG = "HuaMiNotifyModel";

    @NotNull
    private static final String WECHAT_PACKAGE_NAME = "com.tencent.mm";

    @NotNull
    private static final String WECHAT_RED_ENVELOP = "[微信红包]";

    @NotNull
    private final Handler mAlertIncallHandler = new Handler(Looper.getMainLooper());
    private int phoneStatus;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ArrayList<String> SMS_APPS = new ArrayList<String>() { // from class: com.xiaomi.fitness.notify.HuaMiNotifyModel$Companion$SMS_APPS$1
        {
            add("com.android.mms");
            add("com.android.mms.service");
            add(Telephony.Sms.getDefaultSmsPackage(AppUtil.getApp()));
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null || (obj instanceof String)) {
                return contains((String) obj);
            }
            return false;
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj == null || (obj instanceof String)) {
                return indexOf((String) obj);
            }
            return -1;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj == null || (obj instanceof String)) {
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
            if (obj == null || (obj instanceof String)) {
                return remove((String) obj);
            }
            return false;
        }

        public /* bridge */ boolean remove(String str) {
            return super.remove((Object) str);
        }
    };

    @NotNull
    private static final HashMap<String, HMAlertApp> WHITE_APPS = new HashMap<String, HMAlertApp>() { // from class: com.xiaomi.fitness.notify.HuaMiNotifyModel$Companion$WHITE_APPS$1
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
    private static final HuaMiNotifyModel instance = new HuaMiNotifyModel();

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/notify/HuaMiNotifyModel$Companion;", "", "<init>", "()V", "TAG", "", "WECHAT_PACKAGE_NAME", "WECHAT_RED_ENVELOP", "SMS_APPS", "Ljava/util/ArrayList;", "WHITE_APPS", "Ljava/util/HashMap;", "Lcom/xiaomi/hm/health/bt/profile/alert/HMAlertApp;", "instance", "Lcom/xiaomi/fitness/notify/HuaMiNotifyModel;", "getInstance", "()Lcom/xiaomi/fitness/notify/HuaMiNotifyModel;", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HuaMiNotifyModel getInstance() {
            return HuaMiNotifyModel.instance;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.notify.HuaMiNotifyModel$alertCall$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/notify/HuaMiNotifyModel$alertCall$1", "Leu6;", "Lcom/xiaomi/fitness/settingitem/settingitem/InCall;", "result", "", "onResult", "(Lcom/xiaomi/fitness/settingitem/settingitem/InCall;)V", "", "errorCode", "onError", "(I)V", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class AnonymousClass1 implements eu6<InCall> {
        final /* synthetic */ WearableDeviceModel $deviceModel;
        final /* synthetic */ String $displayName;
        final /* synthetic */ String $phoneName;

        public AnonymousClass1(String str, WearableDeviceModel wearableDeviceModel, String str2) {
            this.$displayName = str;
            this.$deviceModel = wearableDeviceModel;
            this.$phoneName = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onResult$lambda$0(HuaMiNotifyModel this$0, WearableDeviceModel wearableDeviceModel, String str, String str2) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (this$0.phoneStatus == 1) {
                this$0.alertInCall(wearableDeviceModel, str, str2);
            }
        }

        @Override // defpackage.eu6
        public void onError(int errorCode) {
        }

        @Override // defpackage.eu6
        public void onResult(InCall result) {
            String str;
            Intrinsics.checkNotNullParameter(result, "result");
            if (result.isIncallNotifyEnabled()) {
                if (RomUtils.isXiaomi() && result.isIncallContactNotifyEnabled() && !HuaMiNotifyModel.this.isNeedContactPermGranted() && TextUtils.isEmpty(this.$displayName)) {
                    return;
                }
                boolean z = result.isIncomingCallReply() && DeviceModelExtKt.isSupportSmsReply(this.$deviceModel);
                final String str2 = (!result.isIncallNameDisplayEnabled() || (str = this.$displayName) == null || str.length() == 0) ? this.$phoneName : this.$displayName;
                final String str3 = z ? this.$phoneName : null;
                Logger.d(HuaMiNotifyModel.TAG, "alertCall isSmsReplyOpen: " + z + ", isIncallNameDisplayEnabled " + result.isIncallNameDisplayEnabled() + ", display = " + str2 + ", phoneNum = " + str3);
                CallNotifyViewModel.Companion companion = CallNotifyViewModel.INSTANCE;
                if (!companion.isDelayNoticeSwitchOn(result)) {
                    if (HuaMiNotifyModel.this.phoneStatus == 1) {
                        Logger.d(HuaMiNotifyModel.TAG, "alertCall " + str2 + " " + this.$phoneName);
                        HuaMiNotifyModel.this.alertInCall(this.$deviceModel, str2, str3);
                        return;
                    }
                    return;
                }
                int delayTime = companion.getDelayTime(result);
                Logger.d(HuaMiNotifyModel.TAG, "alertCall " + str2 + " " + this.$phoneName + " delay:" + delayTime);
                Handler handler = HuaMiNotifyModel.this.mAlertIncallHandler;
                final HuaMiNotifyModel huaMiNotifyModel = HuaMiNotifyModel.this;
                final WearableDeviceModel wearableDeviceModel = this.$deviceModel;
                handler.postDelayed(new Runnable() { // from class: kic
                    @Override // java.lang.Runnable
                    public final void run() {
                        HuaMiNotifyModel.AnonymousClass1.onResult$lambda$0(huaMiNotifyModel, wearableDeviceModel, str2, str3);
                    }
                }, (long) (delayTime * 1000));
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.notify.HuaMiNotifyModel$alertInCall$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.notify.HuaMiNotifyModel$alertInCall$1", f = "HuaMiNotifyModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27191 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $display;
        final /* synthetic */ HuamiApiCaller $huamiApiCaller;
        final /* synthetic */ String $phoneNumber;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27191(HuamiApiCaller huamiApiCaller, String str, String str2, Continuation<? super C27191> continuation) {
            super(2, continuation);
            this.$huamiApiCaller = huamiApiCaller;
            this.$phoneNumber = str;
            this.$display = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C27191(this.$huamiApiCaller, this.$phoneNumber, this.$display, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HuamiApiCaller huamiApiCaller = this.$huamiApiCaller;
            boolean z = true;
            if (huamiApiCaller != null) {
                Boxing.boxBoolean(huamiApiCaller.showContactInDevice(true));
            }
            String str = this.$phoneNumber;
            boolean z2 = str == null || str.length() == 0;
            String str2 = this.$display;
            if (str2 != null && str2.length() != 0) {
                z = false;
            }
            Logger.i(HuaMiNotifyModel.TAG, "alert Incall phoneNumber.isNullOrEmpty = " + z2 + "  display.isNullOrEmpty = " + z);
            HuamiApiCaller huamiApiCaller2 = this.$huamiApiCaller;
            if (huamiApiCaller2 != null) {
                Boxing.boxBoolean(huamiApiCaller2.alertInCall(this.$display, this.$phoneNumber));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C27191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private HuaMiNotifyModel() {
    }

    private final void alertApp(WearableDeviceModel deviceModel, int id, HMAlertApp app, String title, String message, String packageName) {
        HuamiApiCaller huamiApiCaller = getHuamiApiCaller(deviceModel);
        if (huamiApiCaller == null) {
            return;
        }
        huamiApiCaller.alertApp(app, id, title, message, packageName);
    }

    private final void alertGenericApp(WearableDeviceModel deviceModel, int id, String title, String message, String packageName) {
        HuamiApiCaller huamiApiCaller = getHuamiApiCaller(deviceModel);
        if (huamiApiCaller == null) {
            return;
        }
        huamiApiCaller.alertGenericApp(id, title, message, packageName);
    }

    private final void alertHongBao(WearableDeviceModel deviceModel) {
        HuamiApiCaller huamiApiCaller = getHuamiApiCaller(deviceModel);
        if (huamiApiCaller != null) {
            huamiApiCaller.alertHongbao(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void alertInCall(WearableDeviceModel deviceModel, String display, String phoneNumber) {
        HuamiApiCaller huamiApiCaller = getHuamiApiCaller(deviceModel);
        if (!TextUtils.isEmpty(phoneNumber) && deviceModel != null) {
            DeviceModelExtKt.setCallReplyDelegate(deviceModel);
        }
        AnyExtKt.io$default(null, new C27191(huamiApiCaller, phoneNumber, display, null), 1, null);
    }

    private final void alertSms(WearableDeviceModel deviceModel, int id, String name, String text, String packagename) {
        HuamiApiCaller huamiApiCaller = getHuamiApiCaller(deviceModel);
        if (huamiApiCaller != null) {
            huamiApiCaller.alertSms(id, name, text, packagename);
        }
    }

    private final HuamiApiCaller getHuamiApiCaller(WearableDeviceModel deviceModel) {
        String mac;
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        if (deviceModel == null || (mac = com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(deviceModel)) == null) {
            mac = "";
        }
        return deviceManagerExtKt.getHuaMiApiCaller(mac);
    }

    private final boolean isCall(rxg notifyData) {
        return Intrinsics.areEqual("phone", notifyData.c);
    }

    private final boolean isCallPermGranted() {
        if (NotifyStartExtKt.getNotificationManagerImpl().isNotificationPolicyAccessGranted()) {
            NotifyUtil notifyUtil = NotifyUtil.INSTANCE;
            String[] filterPhoneNotifyPermissionList = NotifyStartExtKt.getNotificationManagerImpl().getFilterPhoneNotifyPermissionList(true, AppUtil.INSTANCE.isPlayChannel());
            if (!notifyUtil.shouldRequestPermission((String[]) Arrays.copyOf(filterPhoneNotifyPermissionList, filterPhoneNotifyPermissionList.length))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isNeedContactPermGranted() {
        return needRequestCallLogPerm() || needRequestContactsPerm();
    }

    private final boolean isSms(rxg notifyData) {
        return SMS_APPS.contains(notifyData.c);
    }

    private final boolean isWechatRedEnvelop(rxg notifyData) {
        if (StringsKt__StringsJVMKt.equals(notifyData.c, "com.tencent.mm", true)) {
            String text = notifyData.g;
            Intrinsics.checkNotNullExpressionValue(text, "text");
            if (StringsKt__StringsKt.contains$default((CharSequence) text, (CharSequence) WECHAT_RED_ENVELOP, false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    private final boolean needRequestCallLogPerm() {
        if (Build.VERSION.SDK_INT >= 28) {
            return NotifyUtil.INSTANCE.shouldRequestPermission("android.permission.READ_CALL_LOG");
        }
        return false;
    }

    private final boolean needRequestContactsPerm() {
        return NotifyUtil.INSTANCE.shouldRequestPermission("android.permission.READ_CONTACTS");
    }

    public final void alertCall(@Nullable WearableDeviceModel deviceModel, @Nullable String phoneName, @Nullable String displayName) {
        if (deviceModel != null && deviceModel.getIsDeviceConnected() && isCallPermGranted()) {
            DeviceModelExtKt.getHuaMiInCall(deviceModel, new AnonymousClass1(displayName, deviceModel, phoneName));
        }
    }

    public final void alertInCallStop(@Nullable WearableDeviceModel deviceModel) {
        String mac;
        this.mAlertIncallHandler.removeCallbacksAndMessages(null);
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        if (deviceModel == null || (mac = com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(deviceModel)) == null) {
            mac = "";
        }
        HuamiApiCaller huaMiApiCaller = deviceManagerExtKt.getHuaMiApiCaller(mac);
        if (huaMiApiCaller == null) {
            return;
        }
        huaMiApiCaller.alertInCallStop();
    }

    public final void postNotifications(@NotNull WearableDeviceModel deviceModel, @Nullable List<rxg> notifyDataList) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        if (!deviceModel.getIsDeviceConnected()) {
            Logger.i(TAG, "postNotifications isDeviceConnected false");
            return;
        }
        if (notifyDataList == null || notifyDataList.isEmpty()) {
            return;
        }
        for (rxg rxgVar : notifyDataList) {
            if (rxgVar != null && !isCall(rxgVar)) {
                if (isSms(rxgVar)) {
                    int iCurrentTimeMillis = (int) System.currentTimeMillis();
                    String title = rxgVar.e;
                    Intrinsics.checkNotNullExpressionValue(title, "title");
                    String text = rxgVar.g;
                    Intrinsics.checkNotNullExpressionValue(text, "text");
                    String appId = rxgVar.c;
                    Intrinsics.checkNotNullExpressionValue(appId, "appId");
                    alertSms(deviceModel, iCurrentTimeMillis, title, text, appId);
                } else {
                    if (isWechatRedEnvelop(rxgVar)) {
                        alertHongBao(deviceModel);
                        return;
                    }
                    HMAlertApp hMAlertApp = WHITE_APPS.get(rxgVar.c);
                    Logger.i(TAG, "alertApp packagename" + rxgVar.c);
                    if (hMAlertApp == null) {
                        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                        String title2 = rxgVar.e;
                        Intrinsics.checkNotNullExpressionValue(title2, "title");
                        String text2 = rxgVar.g;
                        Intrinsics.checkNotNullExpressionValue(text2, "text");
                        String appId2 = rxgVar.c;
                        Intrinsics.checkNotNullExpressionValue(appId2, "appId");
                        alertGenericApp(deviceModel, iCurrentTimeMillis2, title2, text2, appId2);
                    } else {
                        int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
                        String title3 = rxgVar.e;
                        Intrinsics.checkNotNullExpressionValue(title3, "title");
                        String text3 = rxgVar.g;
                        Intrinsics.checkNotNullExpressionValue(text3, "text");
                        String appId3 = rxgVar.c;
                        Intrinsics.checkNotNullExpressionValue(appId3, "appId");
                        alertApp(deviceModel, iCurrentTimeMillis3, hMAlertApp, title3, text3, appId3);
                    }
                }
            }
        }
    }

    public final void removeNotifications(@NotNull WearableDeviceModel deviceModel, @Nullable List<sxg> mNotifyDataRemoveList) {
        HuamiApiCaller huamiApiCaller;
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        if (mNotifyDataRemoveList == null || (huamiApiCaller = getHuamiApiCaller(deviceModel)) == null) {
            return;
        }
        Iterator<sxg> it = mNotifyDataRemoveList.iterator();
        while (it.hasNext()) {
            huamiApiCaller.deleteAlertToDevice(it.next().c);
        }
    }

    public final void updatePhoneStatus(int state) {
        this.phoneStatus = state;
    }
}
