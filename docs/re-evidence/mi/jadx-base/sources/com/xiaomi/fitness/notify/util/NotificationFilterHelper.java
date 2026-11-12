package com.xiaomi.fitness.notify.util;

import android.app.ActivityManager;
import android.app.Notification;
import android.content.Context;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RemoteViews;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.main.export.ConfigPreference;
import com.xiaomi.fitness.notify.BaseNotifySyncService;
import com.xiaomi.fitness.sport.route.detail.util.MapAppLaunchExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J \u0010\n\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u000e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\rJ\u0018\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\rH\u0002J\u0010\u0010\u001d\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0016J\u000e\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0016J\u000e\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0016J\u001a\u0010 \u001a\f\u0012\u0006\b\u0001\u0012\u00020\"\u0018\u00010!2\u0006\u0010\b\u001a\u00020\u0016H\u0002J\u001c\u0010%\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\"\u0018\u00010!2\u0006\u0010&\u001a\u00020\rH\u0002J$\u0010*\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00162\b\u0010+\u001a\u0004\u0018\u00010\r2\b\u0010,\u001a\u0004\u0018\u00010\rJ\u0012\u0010-\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010.\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016J\u0018\u0010/\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00162\b\u0010,\u001a\u0004\u0018\u00010\rJ\u0010\u00100\u001a\u00020\u000b2\b\u00101\u001a\u0004\u0018\u00010\u0016J\u000e\u00102\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0016J\u0010\u00103\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016J\u000e\u00104\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010#\u001a\u0012\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\"0!0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0$¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u00065"}, d2 = {"Lcom/xiaomi/fitness/notify/util/NotificationFilterHelper;", "", "<init>", "()V", "getContentView", "Landroid/view/View;", "context", "Landroid/content/Context;", "notification", "Landroid/app/Notification;", "isProgressNotification", "", "packageName", "", "mNotificationNeedShowInWhiteListApp", "", "mNotificationNeedShowInWhiteListAppJson", "isNotificationAppInWhiteList", "mNotificationSpotlightAppInWhiteListApp", "mNotificationSpotlightAppInWhiteListAppJson", "isNotificationSpotlightAppInWhiteList", "isHideInMiuiNotification", "Landroid/service/notification/StatusBarNotification;", "isHideInWhiteListNotification", "sbn", "mNotificationNeedHideInWhiteListApp", "mNotificationNeedHideInWhiteListAppJson", "hideForegroundNotification", "channelId", "isMissedCallNotification", "hasProgressbar", "isMediaNotification", "getNotificationStyle", "Ljava/lang/Class;", "Landroid/app/Notification$Style;", "PLATFORM_STYLE_CLASSES", "", "getNotificationStyleClass", "templateClass", "wechatFilterList", "getWechatFilterList", "()Ljava/util/List;", "isWeChatIncomingCall", "title", "text", "isWechatNeedFilter", "isOtherVoiceIncomingCall", "isQQNormalMessage", "isMiEarphone", "sb", "isHuaWeiMMSChannel", "isMipmapNotification", "isSupportOpenNotificationApp", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNotificationFilterHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationFilterHelper.kt\ncom/xiaomi/fitness/notify/util/NotificationFilterHelper\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 GsonExt.kt\ncom/xiaomi/fitness/common/extensions/GsonExtKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,454:1\n254#2:455\n254#2:456\n29#3:457\n29#3:460\n29#3:463\n1863#4,2:458\n1863#4,2:461\n*S KotlinDebug\n*F\n+ 1 NotificationFilterHelper.kt\ncom/xiaomi/fitness/notify/util/NotificationFilterHelper\n*L\n90#1:455\n95#1:456\n111#1:457\n143#1:460\n221#1:463\n125#1:458,2\n157#1:461,2\n*E\n"})
public final class NotificationFilterHelper {

    @NotNull
    public static final NotificationFilterHelper INSTANCE = new NotificationFilterHelper();

    @NotNull
    private static final List<String> mNotificationNeedShowInWhiteListApp = new ArrayList();

    @NotNull
    private static String mNotificationNeedShowInWhiteListAppJson = "";

    @NotNull
    private static final List<String> mNotificationSpotlightAppInWhiteListApp = new ArrayList();

    @NotNull
    private static String mNotificationSpotlightAppInWhiteListAppJson = "";

    @NotNull
    private static final List<String> mNotificationNeedHideInWhiteListApp = new ArrayList();

    @NotNull
    private static String mNotificationNeedHideInWhiteListAppJson = "";

    @NotNull
    private static final List<Class<? extends Notification.Style>> PLATFORM_STYLE_CLASSES = CollectionsKt__CollectionsJVMKt.listOf(Notification.MediaStyle.class);

    @NotNull
    private static final List<String> wechatFilterList = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"语音通话中", "视频通话中", "語音通話中", "視訊通話中", "Voice call in use", "Video call in progress", "登录 Windows 微信", "登录桌面微信", "登入 微信桌面版", "登入 微信 for Windows", "Log in to Weixin for Windows", "Log in to Weixin for Desktop", "登入 微信 for Mac", "登录 Mac 微信", "Log in to Weixin for Mac"});

    private NotificationFilterHelper() {
    }

    private final View getContentView(Context context, Notification notification) {
        try {
            RemoteViews remoteViewsCreateContentView = notification.contentView;
            if (remoteViewsCreateContentView == null) {
                remoteViewsCreateContentView = Notification.Builder.recoverBuilder(context, notification).createContentView();
            }
            if (remoteViewsCreateContentView != null) {
                return remoteViewsCreateContentView.apply(context, null);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private final Class<? extends Notification.Style> getNotificationStyle(StatusBarNotification notification) {
        Bundle extras = notification.getNotification().extras;
        Intrinsics.checkNotNullExpressionValue(extras, "extras");
        String string = extras.getString("android.template");
        if (string == null || string.length() == 0) {
            return null;
        }
        return getNotificationStyleClass(string);
    }

    private final Class<? extends Notification.Style> getNotificationStyleClass(String templateClass) {
        for (Class<? extends Notification.Style> cls : PLATFORM_STYLE_CLASSES) {
            if (Intrinsics.areEqual(templateClass, cls.getName())) {
                return cls;
            }
        }
        return null;
    }

    private final boolean hideForegroundNotification(String packageName, String channelId) {
        String notification_app_in_foreground_white_list = ConfigPreference.INSTANCE.getNOTIFICATION_APP_IN_FOREGROUND_WHITE_LIST();
        if (notification_app_in_foreground_white_list.length() == 0) {
            mNotificationNeedHideInWhiteListApp.clear();
            mNotificationNeedHideInWhiteListAppJson = "";
        } else if (!Intrinsics.areEqual(mNotificationNeedHideInWhiteListAppJson, notification_app_in_foreground_white_list)) {
            try {
                List list = (List) new Gson().fromJson(notification_app_in_foreground_white_list, new TypeToken<List<? extends String>>() { // from class: com.xiaomi.fitness.notify.util.NotificationFilterHelper$hideForegroundNotification$$inlined$fromJson$1
                }.getType());
                mNotificationNeedHideInWhiteListAppJson = notification_app_in_foreground_white_list;
                List<String> list2 = mNotificationNeedHideInWhiteListApp;
                list2.clear();
                list2.addAll(list);
            } catch (Exception e) {
                Logger.e(BaseNotifySyncService.TAG, "format hideList error = " + e);
            }
        }
        String str = mNotificationNeedHideInWhiteListAppJson;
        List<String> list3 = mNotificationNeedHideInWhiteListApp;
        Logger.d(BaseNotifySyncService.TAG, "hideList:" + notification_app_in_foreground_white_list + "  local:" + str + " " + list3);
        if (!list3.contains(packageName)) {
            if (!list3.contains(packageName + ":" + channelId)) {
                return false;
            }
        }
        return true;
    }

    private final boolean isNotificationAppInWhiteList(String packageName) {
        String notification_app_in_white_list = ConfigPreference.INSTANCE.getNOTIFICATION_APP_IN_WHITE_LIST();
        if (notification_app_in_white_list.length() == 0) {
            mNotificationNeedShowInWhiteListApp.clear();
            mNotificationNeedShowInWhiteListAppJson = "";
        } else if (!Intrinsics.areEqual(notification_app_in_white_list, mNotificationNeedShowInWhiteListAppJson)) {
            try {
                List list = (List) new Gson().fromJson(notification_app_in_white_list, new TypeToken<List<? extends String>>() { // from class: com.xiaomi.fitness.notify.util.NotificationFilterHelper$isNotificationAppInWhiteList$$inlined$fromJson$1
                }.getType());
                mNotificationNeedShowInWhiteListAppJson = notification_app_in_white_list;
                List<String> list2 = mNotificationNeedShowInWhiteListApp;
                list2.clear();
                list2.addAll(list);
            } catch (Exception e) {
                Logger.e(BaseNotifySyncService.TAG, "format showList error = " + e);
            }
        }
        String str = mNotificationNeedShowInWhiteListAppJson;
        List<String> list3 = mNotificationNeedShowInWhiteListApp;
        Logger.d(BaseNotifySyncService.TAG, "showList:" + notification_app_in_white_list + "  local:" + str + " " + list3);
        if (!(!list3.isEmpty())) {
            return false;
        }
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(packageName, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final boolean isWechatNeedFilter(String text) {
        if (text != null && text.length() != 0) {
            int size = wechatFilterList.size();
            for (int i = 0; i < size; i++) {
                if (text != null && StringsKt__StringsKt.contains$default((CharSequence) text, (CharSequence) wechatFilterList.get(i), false, 2, (Object) null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @NotNull
    public final List<String> getWechatFilterList() {
        return wechatFilterList;
    }

    public final boolean hasProgressbar(@NotNull StatusBarNotification notification) {
        Intrinsics.checkNotNullParameter(notification, "notification");
        Bundle extras = notification.getNotification().extras;
        Intrinsics.checkNotNullExpressionValue(extras, "extras");
        return extras.getInt("android.progressMax", 0) != 0 || extras.getBoolean("android.progressIndeterminate");
    }

    public final boolean isHideInMiuiNotification(@NotNull StatusBarNotification notification, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(notification, "notification");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (Intrinsics.areEqual(packageName, ApplicationExtKt.getApplication().getPackageName()) && Intrinsics.areEqual(notification.getNotification().getGroup(), "com.mi.health")) {
            return notification.getId() == 99001 || notification.getId() == 110 || notification.getId() == 120 || notification.getId() == 502;
        }
        return false;
    }

    public final boolean isHideInWhiteListNotification(@NotNull StatusBarNotification sbn, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(sbn, "sbn");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (!RomUtils.INSTANCE.isMiui()) {
            return false;
        }
        String channelId = sbn.getNotification().getChannelId();
        if (channelId == null) {
            channelId = "";
        }
        return (sbn.getNotification().flags & 64) != 0 && hideForegroundNotification(packageName, channelId);
    }

    public final boolean isHuaWeiMMSChannel(@NotNull StatusBarNotification sbn) {
        String harmonyVersion;
        Intrinsics.checkNotNullParameter(sbn, "sbn");
        Notification notification = sbn.getNotification();
        if (!Intrinsics.areEqual(sbn.getPackageName(), "com.android.mms")) {
            return false;
        }
        RomUtils romUtils = RomUtils.INSTANCE;
        if ((romUtils.isHarmonyOs() && (harmonyVersion = romUtils.getHarmonyVersion()) != null && StringsKt__StringsJVMKt.startsWith$default(harmonyVersion, "4", false, 2, null)) || notification == null) {
            return false;
        }
        Logger.i(BaseNotifySyncService.TAG, "Huawei message key = " + sbn.getKey() + ", packageName  = " + sbn.getPackageName() + ",flag = " + notification.flags + ",channelId = " + notification.getChannelId());
        return notification.flags != 16;
    }

    public final boolean isMediaNotification(@NotNull StatusBarNotification notification) {
        Intrinsics.checkNotNullParameter(notification, "notification");
        Bundle extras = notification.getNotification().extras;
        Intrinsics.checkNotNullExpressionValue(extras, "extras");
        Class<? extends Notification.Style> notificationStyle = getNotificationStyle(notification);
        boolean zAreEqual = Intrinsics.areEqual(Notification.MediaStyle.class, notificationStyle);
        MediaSession.Token token = (MediaSession.Token) extras.getParcelable("android.mediaSession");
        Logger.i(BaseNotifySyncService.TAG, "isMediaNotification = , style = " + notificationStyle + ", isMediaStyle = " + zAreEqual + ", token = " + token);
        return zAreEqual && (token != null);
    }

    public final boolean isMiEarphone(@Nullable StatusBarNotification sb) {
        Notification notification;
        String channelId;
        return ((sb != null ? sb.getNotification() : null) == null || (notification = sb.getNotification()) == null || (channelId = notification.getChannelId()) == null || !StringsKt__StringsJVMKt.startsWith$default(channelId, "BTHeadset", false, 2, null)) ? false : true;
    }

    public final boolean isMipmapNotification(@Nullable StatusBarNotification sbn) {
        return sbn != null && Intrinsics.areEqual(sbn.getPackageName(), MapAppLaunchExtKt.GAODE_MAP_PACKAGE_NAME) && sbn.getId() == 1236;
    }

    public final boolean isMissedCallNotification(@Nullable StatusBarNotification notification) {
        String opPkg;
        if (notification == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            opPkg = notification.getOpPkg();
            Intrinsics.checkNotNull(opPkg);
        } else {
            opPkg = "";
        }
        return (Intrinsics.areEqual("com.android.phone", opPkg) || Intrinsics.areEqual("com.android.server.telecom", opPkg)) && Intrinsics.areEqual("missed_call", notification.getTag());
    }

    public final boolean isNotificationSpotlightAppInWhiteList(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        String notification_spotlight_app_in_white_list = ConfigPreference.INSTANCE.getNOTIFICATION_SPOTLIGHT_APP_IN_WHITE_LIST();
        if (notification_spotlight_app_in_white_list.length() == 0) {
            mNotificationSpotlightAppInWhiteListApp.clear();
            mNotificationSpotlightAppInWhiteListAppJson = "";
        } else if (!Intrinsics.areEqual(notification_spotlight_app_in_white_list, mNotificationSpotlightAppInWhiteListAppJson)) {
            try {
                List list = (List) new Gson().fromJson(notification_spotlight_app_in_white_list, new TypeToken<List<? extends String>>() { // from class: com.xiaomi.fitness.notify.util.NotificationFilterHelper$isNotificationSpotlightAppInWhiteList$$inlined$fromJson$1
                }.getType());
                mNotificationSpotlightAppInWhiteListAppJson = notification_spotlight_app_in_white_list;
                List<String> list2 = mNotificationSpotlightAppInWhiteListApp;
                list2.clear();
                list2.addAll(list);
            } catch (Exception e) {
                Logger.e(BaseNotifySyncService.TAG, "format showFocusList error = " + e);
            }
        }
        String str = mNotificationSpotlightAppInWhiteListAppJson;
        List<String> list3 = mNotificationSpotlightAppInWhiteListApp;
        Logger.d(BaseNotifySyncService.TAG, "showFocusList:" + notification_spotlight_app_in_white_list + "  local:" + str + " " + list3);
        if (!(!list3.isEmpty())) {
            return false;
        }
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(packageName, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final boolean isOtherVoiceIncomingCall(@Nullable StatusBarNotification sbn) {
        String key;
        String key2;
        if (sbn != null && Intrinsics.areEqual("com.whatsapp", sbn.getPackageName())) {
            return true;
        }
        if (!Intrinsics.areEqual("jp.naver.line.android", sbn != null ? sbn.getPackageName() : null)) {
            if (!Intrinsics.areEqual("jp.nvaer.line.andorid", sbn != null ? sbn.getPackageName() : null)) {
                return ((sbn == null || (key2 = sbn.getKey()) == null || !StringsKt__StringsKt.contains$default((CharSequence) key2, (CharSequence) "jp.naver.line.android", false, 2, (Object) null)) && (sbn == null || (key = sbn.getKey()) == null || !StringsKt__StringsKt.contains$default((CharSequence) key, (CharSequence) "jp.nvaer.line.andorid", false, 2, (Object) null))) ? false : true;
            }
        }
        return true;
    }

    public final boolean isProgressNotification(@Nullable Context context, @NotNull Notification notification, @NotNull String packageName) {
        View view;
        Intrinsics.checkNotNullParameter(notification, "notification");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (isNotificationAppInWhiteList(packageName)) {
            return false;
        }
        if (Intrinsics.areEqual("com.android.providers.downloads", packageName)) {
            return true;
        }
        View contentView = getContentView(context, notification);
        if (contentView == null) {
            return false;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.push(contentView);
        while ((!linkedList.isEmpty()) && (view = (View) linkedList.poll()) != null) {
            if (view.getVisibility() == 0 && (view instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    linkedList.addLast(viewGroup.getChildAt(i));
                }
            } else if (view.getVisibility() == 0 && (view instanceof ProgressBar)) {
                return true;
            }
        }
        return false;
    }

    public final boolean isQQNormalMessage(@NotNull StatusBarNotification sbn, @Nullable String text) {
        Intrinsics.checkNotNullParameter(sbn, "sbn");
        if (!Intrinsics.areEqual("com.tencent.mobileqq", sbn.getPackageName())) {
            return false;
        }
        if (sbn.getNotification() != null) {
            Logger.i(BaseNotifySyncService.TAG, " isQQIncomingCall channelId = " + sbn.getNotification().getChannelId() + " flags = " + sbn.getNotification().flags);
        }
        if (LocaleUtil.INSTANCE.isChinese() && !Intrinsics.areEqual(text, "正在视频通话") && !Intrinsics.areEqual(text, "正在语音通话") && sbn.getNotification() != null) {
            Notification notification = sbn.getNotification();
            if (Intrinsics.areEqual(notification != null ? notification.getChannelId() : null, "CHANNEL_ID_SHOW_BADGE")) {
                return true;
            }
        }
        return false;
    }

    public final boolean isSupportOpenNotificationApp(@NotNull Notification notification) {
        Intrinsics.checkNotNullParameter(notification, "notification");
        if (RomUtils.isSamSung()) {
            return false;
        }
        RomUtils romUtils = RomUtils.INSTANCE;
        if (romUtils.isHuawei() || romUtils.isHonor()) {
            return false;
        }
        Object systemService = ApplicationExtKt.getApplication().getSystemService(LifecycleConstantKt.TYPE_ACTIVITY);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ActivityManager activityManager = (ActivityManager) systemService;
        if (activityManager.isLowRamDevice()) {
            Logger.d(BaseNotifySyncService.TAG, "system version is android go " + activityManager.isLowRamDevice());
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        Logger.d(BaseNotifySyncService.TAG, "build version = " + i);
        return i <= 33 && notification.contentIntent != null;
    }

    public final boolean isWeChatIncomingCall(@Nullable StatusBarNotification sbn, @Nullable String title, @Nullable String text) {
        if (sbn == null || !Intrinsics.areEqual("com.tencent.mm", sbn.getPackageName()) || sbn.getNotification() == null) {
            return false;
        }
        Logger.i(BaseNotifySyncService.TAG, " isWechatIncomingCall channelId = " + sbn.getNotification().getChannelId() + " flags = " + sbn.getNotification().flags);
        if (!StringsKt__StringsJVMKt.equals("reminder_channel_id", sbn.getNotification().getChannelId(), true) && !StringsKt__StringsJVMKt.equals("voip_notify_channel_new_id", sbn.getNotification().getChannelId(), true)) {
            String channelId = sbn.getNotification().getChannelId();
            Intrinsics.checkNotNullExpressionValue(channelId, "getChannelId(...)");
            if (!StringsKt__StringsKt.contains$default((CharSequence) channelId, (CharSequence) "voip_norify_channel_silent", false, 2, (Object) null)) {
                String channelId2 = sbn.getNotification().getChannelId();
                Intrinsics.checkNotNullExpressionValue(channelId2, "getChannelId(...)");
                if (!StringsKt__StringsKt.contains$default((CharSequence) channelId2, (CharSequence) "voip_ringtone_channel", false, 2, (Object) null)) {
                    return false;
                }
            }
        }
        Bundle bundle = sbn.getNotification().extras;
        return ((bundle != null && bundle.getInt("android.progressMax") > 0) || isWechatNeedFilter(text) || Intrinsics.areEqual("微信正在运行", title) || Intrinsics.areEqual("“微信”正在运行", title) || Intrinsics.areEqual("\"微信\"正在运行", title)) ? false : true;
    }
}
