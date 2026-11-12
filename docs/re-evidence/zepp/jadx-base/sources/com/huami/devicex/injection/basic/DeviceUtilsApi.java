package com.huami.devicex.injection.basic;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.IntRange;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.appevents.integrity.IntegrityManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.huami.account.UserLegalInfoManager;
import com.huami.account.ui.bind.PhoneBindActivity;
import com.huami.lib.view.ItemView;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.model.HMLanguage;
import com.xiaomi.hm.health.bt.model.HMLiftWristConfig;
import com.xiaomi.hm.health.bt.model.HMReminderInfo;
import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;
import com.xiaomi.hm.health.bt.model.HMWeightUnit;
import com.xiaomi.hm.health.bt.model.UserInfoExt;
import com.xiaomi.hm.health.bt.model.appsort.SortableAppItems;
import com.xiaomi.hm.health.bt.profile.amc.HMMusicControl;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.pai.HMPaiData;
import com.xiaomi.hm.health.bt.profile.gdsp.raw.HmAfData;
import com.xiaomi.hm.health.bt.profile.mili.model.MiLiHwConfig;
import com.xiaomi.hm.health.bt.profile.page.PageItem;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.callback.DeviceManualFaqCallback;
import com.xiaomi.hm.health.device.model.HMBrandType;
import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import com.xiaomi.hm.health.model.account.HMUserInfo;
import com.xiaomi.hm.health.model.account.secondaryscreen.SecondaryModel;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¶\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH&J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\rH&J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H&J\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H&J\u001c\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001bH&J\b\u0010!\u001a\u00020 H&J\u0012\u0010$\u001a\u00020\r2\b\b\u0001\u0010#\u001a\u00020\"H&J\n\u0010%\u001a\u0004\u0018\u00010\rH&J\u0010\u0010(\u001a\u00020\"2\u0006\u0010'\u001a\u00020&H&J\u0010\u0010*\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\rH&J\u0010\u0010-\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020+H&J\u0018\u00100\u001a\u00020\r2\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\"H&J\u0010\u00102\u001a\u00020\"2\u0006\u00101\u001a\u00020\rH&J\u0010\u00105\u001a\u00020\r2\u0006\u00104\u001a\u000203H&J\u001a\u00108\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u00107\u001a\u000206H&J\u0012\u00108\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\u0011H&J\u0010\u0010;\u001a\u00020\u001e2\u0006\u0010:\u001a\u000209H&J\u0018\u0010>\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020\"2\u0006\u0010=\u001a\u00020\u0011H&J\u0018\u0010A\u001a\u00020\r2\u0006\u0010?\u001a\u00020\r2\u0006\u0010@\u001a\u00020\rH&J\u0010\u0010B\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\u0011H&J\b\u0010C\u001a\u00020\u001eH&J\b\u0010D\u001a\u00020\u001eH&J\b\u0010E\u001a\u00020\u001eH&J\b\u0010F\u001a\u00020\u001eH&J\u0010\u0010I\u001a\n\u0012\u0004\u0012\u00020H\u0018\u00010GH&J\b\u0010J\u001a\u00020\u001eH&J \u0010N\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020+2\u0006\u0010K\u001a\u00020\r2\u0006\u0010M\u001a\u00020LH&J\u0018\u0010R\u001a\u00020\u001e2\u0006\u0010O\u001a\u00020\r2\u0006\u0010Q\u001a\u00020PH&J\u0018\u0010T\u001a\u00020\u001e2\u0006\u0010S\u001a\u00020\r2\u0006\u0010Q\u001a\u00020PH&J\b\u0010U\u001a\u00020\rH&J\"\u0010X\u001a\u00020\u000f2\b\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010V\u001a\u00020\"2\u0006\u0010W\u001a\u00020\"H&J\b\u0010Y\u001a\u00020\u001eH&J\b\u0010Z\u001a\u00020\u001eH&J\u0018\u0010\\\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020+2\u0006\u0010[\u001a\u00020\u001eH&J\u0010\u0010_\u001a\u00020^2\u0006\u0010]\u001a\u00020\rH&J\u0010\u0010`\u001a\u00020\r2\u0006\u0010]\u001a\u00020^H&J\u001a\u0010c\u001a\u00020\u001b2\u0010\u0010b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010a\u0018\u00010\u0004H&J\u0018\u0010g\u001a\u00020\u001b2\u000e\u0010f\u001a\n\u0012\u0004\u0012\u00020e\u0018\u00010dH&J\u0010\u0010j\u001a\u00020h2\u0006\u0010i\u001a\u00020hH&J\b\u0010k\u001a\u00020\"H&J\u0012\u0010l\u001a\u00020\u001e2\b\u0010.\u001a\u0004\u0018\u00010\rH&J\u0010\u0010n\u001a\u00020\r2\u0006\u0010m\u001a\u00020\u001eH&J\u0012\u0010p\u001a\u00020\u001e2\b\u0010o\u001a\u0004\u0018\u00010\rH&J\u0010\u0010q\u001a\u00020\r2\u0006\u0010m\u001a\u00020\u001eH&J\u0010\u0010r\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H&J\b\u0010s\u001a\u00020\rH&J\b\u0010t\u001a\u00020\rH&J\b\u0010u\u001a\u00020\rH&J\b\u0010v\u001a\u00020\rH&J&\u0010z\u001a\u00020\u000f2\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010x\u001a\u0004\u0018\u00010w2\b\u0010y\u001a\u0004\u0018\u00010\rH'J&\u0010z\u001a\u00020\u000f2\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010:\u001a\u0004\u0018\u0001092\b\u0010y\u001a\u0004\u0018\u00010\rH&J\b\u0010{\u001a\u00020\u001eH&J\u001a\u0010~\u001a\u00020}2\u0006\u0010m\u001a\u00020\u001e2\b\u0010|\u001a\u0004\u0018\u00010\rH&J\u0010\u0010\u007f\u001a\u00020\r2\u0006\u0010]\u001a\u00020}H&J(\u0010\u0082\u0001\u001a\u00020\u000f2\u0014\u0010\u0081\u0001\u001a\u000b\u0012\u0006\b\u0001\u0012\u00020\r0\u0080\u0001\"\u00020\rH&¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\t\u0010\u0084\u0001\u001a\u00020\u000fH&J\t\u0010\u0085\u0001\u001a\u00020\u001eH&J\u0011\u0010\u0086\u0001\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020+H&J\u001b\u0010\u0089\u0001\u001a\u00020\u000f2\b\u0010\u0088\u0001\u001a\u00030\u0087\u00012\u0006\u0010\u0012\u001a\u00020\u0011H&J\u001b\u0010\u008c\u0001\u001a\u00020\"2\u0006\u0010,\u001a\u00020+2\b\u0010\u008b\u0001\u001a\u00030\u008a\u0001H&J\u0011\u0010\u008d\u0001\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\u0011H&J\t\u0010\u008e\u0001\u001a\u00020\u001eH&J\u0011\u0010\u008f\u0001\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H&J7\u0010\u0094\u0001\u001a\u00020\u000f2\b\u0010:\u001a\u0004\u0018\u0001092\u0007\u0010\u0090\u0001\u001a\u00020\"2\u0007\u0010\u0091\u0001\u001a\u00020\"2\u0007\u0010\u0092\u0001\u001a\u00020\"2\u0007\u0010\u0093\u0001\u001a\u00020\"H&J\u0011\u0010\u0095\u0001\u001a\u00020\u000f2\u0006\u0010:\u001a\u000209H&J\u0011\u0010\u0096\u0001\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020+H&J\u0013\u0010\u0097\u0001\u001a\u0004\u0018\u00010\r2\u0006\u0010m\u001a\u00020\u001eH&J\t\u0010\u0098\u0001\u001a\u00020\u000fH&J\u0011\u0010\u0099\u0001\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u0011H&J\u0011\u0010\u009a\u0001\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020+H&J\t\u0010\u009b\u0001\u001a\u00020\u001eH&J\u0013\u0010\u009e\u0001\u001a\u00020\u000f2\b\u0010\u009d\u0001\u001a\u00030\u009c\u0001H&J\u0011\u0010\u009f\u0001\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020+H&J\u0012\u0010¡\u0001\u001a\u00020\u001e2\u0007\u0010,\u001a\u00030 \u0001H&J\u001a\u0010¢\u0001\u001a\u00020\u001e2\u0007\u0010,\u001a\u00030 \u00012\u0006\u0010'\u001a\u00020\"H&J\u0015\u0010¥\u0001\u001a\u0005\u0018\u00010¤\u00012\u0007\u0010£\u0001\u001a\u00020\"H&J\u001b\u0010¨\u0001\u001a\u00020\u000f2\b\u0010§\u0001\u001a\u00030¦\u00012\u0006\u0010\u0012\u001a\u00020\u0011H&J\u0012\u0010¢\u0001\u001a\u00020\u001e2\u0007\u0010,\u001a\u00030 \u0001H&J\u0010\u00108\u001a\u00020\r2\u0006\u00104\u001a\u000203H&J\u001e\u0010r\u001a\u00020\r2\t\u0010©\u0001\u001a\u0004\u0018\u00010\u00112\t\u0010ª\u0001\u001a\u0004\u0018\u00010\rH&J\t\u0010«\u0001\u001a\u00020\rH&J\u0011\u0010¬\u0001\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020+H&J\u0011\u0010\u00ad\u0001\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020+H&J\u0014\u0010¯\u0001\u001a\u0004\u0018\u00010\u00112\u0007\u0010®\u0001\u001a\u00020\rH&J\u0012\u0010±\u0001\u001a\u00020\u001b2\u0007\u0010°\u0001\u001a\u00020\"H&J\u0013\u0010´\u0001\u001a\u00030³\u00012\u0007\u0010²\u0001\u001a\u00020\"H&J\t\u0010µ\u0001\u001a\u00020\"H&J\u001f\u0010¸\u0001\u001a\u00020\u000f2\t\u0010\f\u001a\u0005\u0018\u00010¶\u00012\t\u0010·\u0001\u001a\u0004\u0018\u00010&H&J\u0012\u0010º\u0001\u001a\u00020\"2\u0007\u0010¹\u0001\u001a\u00020\"H&J\t\u0010»\u0001\u001a\u00020\u001eH&J\u001c\u0010½\u0001\u001a\u0005\u0018\u00010¼\u00012\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010,\u001a\u00020+H&J\u0011\u0010¾\u0001\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020\u0011H&J\u001e\u0010¿\u0001\u001a\u0004\u0018\u00010\"2\b\u0010\u008b\u0001\u001a\u00030\u008a\u0001H&¢\u0006\u0006\b¿\u0001\u0010À\u0001J\u0011\u0010Á\u0001\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020+H&J\n\u0010Â\u0001\u001a\u00030\u0087\u0001H&J\n\u0010Ã\u0001\u001a\u00030³\u0001H&J\u0013\u0010Å\u0001\u001a\u00020\u001e2\b\u0010Ä\u0001\u001a\u00030³\u0001H&J\u001b\u0010Æ\u0001\u001a\u00020\u000f2\b\u0010Ä\u0001\u001a\u00030³\u00012\u0006\u0010m\u001a\u00020\u001eH&J\u0013\u0010Ç\u0001\u001a\u00020\r2\b\u0010'\u001a\u0004\u0018\u00010&H&J\u0019\u0010Ê\u0001\u001a\u00020\u000f2\u000e\u0010É\u0001\u001a\t\u0012\u0005\u0012\u00030È\u00010\u0004H&R\u0019\u0010Í\u0001\u001a\u00020\r8V@\u0016X\u0096\u0004¢\u0006\b\u001a\u0006\bË\u0001\u0010Ì\u0001¨\u0006Î\u0001"}, d2 = {"Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "", "Lcom/xiaomi/hm/health/bt/model/appsort/SortableAppItems;", "setting", "", "Lcom/xiaomi/hm/health/bt/profile/page/PageItem;", "transFromHMDisplaySetting", "Lcom/xiaomi/hm/health/model/account/HMUserInfo;", "userInfo", "Lcom/xiaomi/hm/health/bt/model/UserInfoExt;", "toUserInfoExt", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "", "msd", "", "showPermissionDenieDialog", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "deviceId", "getEarbudLogName", "getDeviceLogName", "Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "deviceInfo", "Lcom/xiaomi/hm/health/device/callback/DeviceManualFaqCallback;", "callback", "isDeviceManualFaqShow", "Ljava/util/Calendar;", "calendar1", "calendar2", "", "compareDateCalendar", "Lcom/google/gson/Gson;", "getGson", "", "minute", "formatMinute", "getEarbudDeviceDescription", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "getHelpType", PointCategory.PERMISSION, "checkPermission", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "closeSoftInput", "str", "maxLength", "substring", "text", "calculateLength", "Lcom/xiaomi/hm/health/databases/model/Device;", "device", "getHuamiDeviceDescription", "Lcom/xiaomi/hm/health/device/model/HMBrandType;", HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_BRAND_TYPE, "getDeviceDescription", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "isFastDoubleClick", PhoneBindActivity.EXTRA_BIND_TYPE, "deviceSource", "testPhoneEnv", "key", "mode", "getAppSetting", "getImageForDevice", "shouldHideDiscovery", "isLocationServerOpen", "isUseClassicWatch", "isNotificationOn", "", "Lcom/xiaomi/hm/health/model/account/secondaryscreen/SecondaryModel;", "getDisplayDataNewList", "isSupportWuhanLanguage", "name", "Ljava/io/File;", "outF", "generateFileFromAssets", "path", "Landroid/graphics/Bitmap;", "bmp", "saveBitmapToFile", "imagePath", "saveBitmapToPngFile", "getStoragePath", "resId", "duration", "toast", "supprotContactDefault", "isSupportContactNameForSystemLanguage", "result", "showSetDeviceSettingResult", "config", "Lcom/xiaomi/hm/health/bt/model/HMSedentaryConfig;", "fromSedentaryConfig", "toSedentaryString", "Lcom/xiaomi/hm/health/bt/profile/gdsp/raw/HmAfData;", "dataList", "getAfResultSyncTime", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/pai/HMPaiData;", "dataArrayList", "getPaiSyncTime", "", "timestamp", "getDateTimestamp", "getSystemLang", "fromMsgPreviewStr", "enable", "toMsgPreviewStr", "jstr", "fromPropertyBoolStr", "toPropertyBoolStr", "getMiLiDeviceDescription", "getShoesDeviceDescription", "getBoundWatchDeviceDescription", "getWeightDeviceDescription", "getOtherDeviceDescription", "Lcom/huami/lib/view/ItemView;", "itemView", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "enableGetMacAddress", "fromAvoidSpiteBindingStr", "timeStr", "Lcom/xiaomi/hm/health/bt/model/HMLiftWristConfig;", "fromLiftWristConfig", "toLiftWristConfig", "", "tokenParams", "updateSpeechEngineThirdToken", "([Ljava/lang/String;)V", "updateSpeechEngineAuthorize", "xiaoAiReginAccess", "isDeviceSupportAlexa", "Lcom/xiaomi/hm/health/bt/model/HMLanguage;", UserLegalInfoManager.KEY_LANGUAGE, "saveDeviceLanguageProperty", "Ljava/util/Locale;", "locale", "getLanguageStringResId", "getCurrentDeviceLanguage", "supportSixPwd", "getDthBeatsChaohuTempoPlayUrl", "top", "bottom", "left", "right", "setViewTouchDelegate", "removeViewTouchDelegate", "isSupportSensorHub", "toAvoidSpiteBindingStr", "saveBaseStep", "shouldShowPlay", "isHK", "shouldInitMusic", "Lcom/xiaomi/hm/health/bt/profile/amc/HMMusicControl$DeviceCommand;", "command", "handleDeviceCommand", "initMedia", "Landroid/app/Activity;", "checkConnectedMiLiDevice", "checkConnectedWatchDevice", "unit", "Lcom/xiaomi/hm/health/bt/model/HMWeightUnit;", "convertToBtUnit", "Landroid/widget/ImageView;", "imageView", "updateDeviceImg", "miliSource", HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_HARDWARE_VERSION, "getShoesDistanceDescription", "enableBluetooth", "startAppSettings", "localName", "nameToDeviceSource", "currentItem", "getSelectedMonthCalendar", "position", "Landroidx/fragment/app/Fragment;", "createHrRestingChartFragment", "getRestingHRMonthCount", "Landroidx/fragment/app/FragmentActivity;", "deviceType", "getStatisticInfo", FirebaseAnalytics.Param.LEVEL, "getNormandyBatteryDescriptionResId", "isPressureHrInDependent", "Lcom/xiaomi/hm/health/bt/profile/mili/model/MiLiHwConfig;", "getInitMiliDeviceConfig", "updateAboutLanguageConfig", "getHMLanguage", "(Ljava/util/Locale;)Ljava/lang/Integer;", "navigation2Sky", "fromSystemLanguage", "showNfcEntranceFragment", "fragment", "hasItems", "updateEnabledForConnectStatus", "getVoiceRes", "Lcom/xiaomi/hm/health/bt/model/HMReminderInfo;", "items", "updateEventFromDevice", "getParamSource", "()Ljava/lang/String;", "paramSource", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface DeviceUtilsApi {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @NotNull
        public static String getParamSource(@NotNull DeviceUtilsApi deviceUtilsApi) {
            return "source";
        }
    }

    int calculateLength(@NotNull String text);

    boolean checkConnectedMiLiDevice(@NotNull Activity context);

    boolean checkConnectedWatchDevice(@NotNull Activity context);

    boolean checkConnectedWatchDevice(@NotNull Activity context, int type);

    boolean checkPermission(@NotNull String permission);

    void closeSoftInput(@NotNull Context context);

    boolean compareDateCalendar(@Nullable Calendar calendar1, @Nullable Calendar calendar2);

    @Nullable
    HMWeightUnit convertToBtUnit(int unit);

    @NotNull
    Fragment createHrRestingChartFragment(int position);

    boolean enableBluetooth(@NotNull Context context);

    void enableGetMacAddress(@Nullable Context context, @Nullable View view, @Nullable String address);

    @Deprecated(message = "请使用enableGetMacAddress(Context, View?, String?)")
    void enableGetMacAddress(@Nullable Context context, @Nullable ItemView itemView, @Nullable String address);

    @NotNull
    String formatMinute(@IntRange(from = 0) int minute);

    boolean fromAvoidSpiteBindingStr();

    @NotNull
    HMLiftWristConfig fromLiftWristConfig(boolean enable, @Nullable String timeStr);

    boolean fromMsgPreviewStr(@Nullable String str);

    boolean fromPropertyBoolStr(@Nullable String jstr);

    @NotNull
    HMSedentaryConfig fromSedentaryConfig(@NotNull String config);

    @NotNull
    HMLanguage fromSystemLanguage();

    boolean generateFileFromAssets(@NotNull Context context, @NotNull String name, @NotNull File outF);

    @NotNull
    Calendar getAfResultSyncTime(@Nullable List<? extends HmAfData> dataList);

    @NotNull
    String getAppSetting(@NotNull String key, @NotNull String mode);

    @NotNull
    String getBoundWatchDeviceDescription();

    int getCurrentDeviceLanguage(@NotNull HMDeviceSource source);

    long getDateTimestamp(long timestamp);

    @Nullable
    String getDeviceDescription(@NotNull HMDeviceSource source);

    @Nullable
    String getDeviceDescription(@NotNull HMDeviceSource source, @NotNull HMBrandType brandType);

    @NotNull
    String getDeviceDescription(@NotNull Device device);

    @NotNull
    String getDeviceLogName(@NotNull HMDeviceSource source);

    @Nullable
    List<SecondaryModel> getDisplayDataNewList();

    @NotNull
    String getDthBeatsChaohuTempoPlayUrl(@NotNull HMDeviceSource source);

    @Nullable
    String getEarbudDeviceDescription();

    @NotNull
    String getEarbudLogName(@NotNull HMDeviceSource source, @NotNull String deviceId);

    @NotNull
    Gson getGson();

    @Nullable
    Integer getHMLanguage(@NotNull Locale locale);

    int getHelpType(@NotNull HMDeviceType type);

    @NotNull
    String getHuamiDeviceDescription(@NotNull Device device);

    int getImageForDevice(@NotNull HMDeviceSource source);

    @Nullable
    MiLiHwConfig getInitMiliDeviceConfig(@NotNull DeviceInfo deviceInfo, @NotNull Context context);

    int getLanguageStringResId(@NotNull Context context, @NotNull Locale locale);

    @NotNull
    String getMiLiDeviceDescription(@NotNull HMDeviceSource source);

    @NotNull
    String getMiLiDeviceDescription(@Nullable HMDeviceSource miliSource, @Nullable String hardwareVersion);

    int getNormandyBatteryDescriptionResId(int level);

    @NotNull
    String getOtherDeviceDescription();

    @NotNull
    Calendar getPaiSyncTime(@Nullable ArrayList<HMPaiData> dataArrayList);

    @NotNull
    String getParamSource();

    int getRestingHRMonthCount();

    @NotNull
    Calendar getSelectedMonthCalendar(int currentItem);

    @NotNull
    String getShoesDeviceDescription();

    @NotNull
    String getShoesDistanceDescription();

    void getStatisticInfo(@Nullable FragmentActivity activity, @Nullable HMDeviceType deviceType);

    @NotNull
    String getStoragePath();

    int getSystemLang();

    @NotNull
    String getVoiceRes(@Nullable HMDeviceType type);

    @NotNull
    String getWeightDeviceDescription();

    void handleDeviceCommand(@NotNull HMMusicControl.DeviceCommand command);

    boolean hasItems(@NotNull Fragment fragment);

    void initMedia(@NotNull Context context);

    void isDeviceManualFaqShow(@NotNull DeviceInfo deviceInfo, @NotNull DeviceManualFaqCallback callback);

    boolean isDeviceSupportAlexa(@NotNull Context context);

    boolean isFastDoubleClick(@NotNull View view);

    boolean isHK(@NotNull Context context);

    boolean isLocationServerOpen();

    boolean isNotificationOn();

    boolean isPressureHrInDependent();

    boolean isSupportContactNameForSystemLanguage();

    boolean isSupportSensorHub(@NotNull Context context);

    boolean isSupportWuhanLanguage();

    boolean isUseClassicWatch();

    @Nullable
    HMDeviceSource nameToDeviceSource(@NotNull String localName);

    void navigation2Sky(@NotNull Context context);

    void removeViewTouchDelegate(@NotNull View view);

    void saveBaseStep();

    boolean saveBitmapToFile(@NotNull String path, @NotNull Bitmap bmp);

    boolean saveBitmapToPngFile(@NotNull String imagePath, @NotNull Bitmap bmp);

    void saveDeviceLanguageProperty(@NotNull HMLanguage language, @NotNull HMDeviceSource source);

    void setViewTouchDelegate(@Nullable View view, int top, int bottom, int left, int right);

    boolean shouldHideDiscovery();

    boolean shouldInitMusic();

    boolean shouldShowPlay(@NotNull HMDeviceSource source);

    @NotNull
    Fragment showNfcEntranceFragment();

    void showPermissionDenieDialog(@NotNull AppCompatActivity activity, @NotNull String msd);

    void showSetDeviceSettingResult(@NotNull Context context, boolean result);

    void startAppSettings(@NotNull Context context);

    @NotNull
    String substring(@NotNull String str, int maxLength);

    boolean supportSixPwd();

    boolean supprotContactDefault();

    void testPhoneEnv(int bindType, @NotNull HMDeviceSource deviceSource);

    @Nullable
    String toAvoidSpiteBindingStr(boolean enable);

    @NotNull
    String toLiftWristConfig(@NotNull HMLiftWristConfig config);

    @NotNull
    String toMsgPreviewStr(boolean enable);

    @NotNull
    String toPropertyBoolStr(boolean enable);

    @NotNull
    String toSedentaryString(@NotNull HMSedentaryConfig config);

    @NotNull
    UserInfoExt toUserInfoExt(@NotNull HMUserInfo userInfo);

    void toast(@Nullable Context context, int resId, int duration);

    @Nullable
    List<PageItem> transFromHMDisplaySetting(@NotNull SortableAppItems setting);

    void updateAboutLanguageConfig(@NotNull HMDeviceSource deviceSource);

    void updateDeviceImg(@NotNull ImageView imageView, @NotNull HMDeviceSource source);

    void updateEnabledForConnectStatus(@NotNull Fragment fragment, boolean enable);

    void updateEventFromDevice(@NotNull List<? extends HMReminderInfo> items);

    void updateSpeechEngineAuthorize();

    void updateSpeechEngineThirdToken(@NotNull String... tokenParams);

    boolean xiaoAiReginAccess();
}
