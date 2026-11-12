package com.xiaomi.fitness.sport.model;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.Gson;
import com.miui.tsmclient.util.StringUtils;
import com.xiaomi.fit.data.common.data.annotation.FitnessSportType;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.utils.NotificationPermission;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.PendingIntentExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.main.export.ConfigPreference;
import com.xiaomi.fitness.notify.focus.NotificationFocusManager;
import com.xiaomi.fitness.sport.bean.SportingData;
import com.xiaomi.fitness.sport.data.ActionInfo;
import com.xiaomi.fitness.sport.data.FocusNotifyData;
import com.xiaomi.fitness.sport.data.HighlightInfo;
import com.xiaomi.fitness.sport.data.HintInfo;
import com.xiaomi.fitness.sport.data.ParamV2;
import com.xiaomi.fitness.sport.data.PicInfo;
import com.xiaomi.fitness.sport.data.TimerInfo;
import com.xiaomi.fitness.sport.model.SendFocusNotification;
import com.xiaomi.fitness.sport.utils.SportPreference;
import com.xiaomi.fitness.sport_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.ui.ColorSchemeHelper;
import defpackage.aki;
import defpackage.av6;
import defpackage.c1j;
import defpackage.eoi;
import defpackage.wwg;
import defpackage.zxi;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001d\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010\u0006J#\u0010$\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\"¢\u0006\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006@"}, d2 = {"Lcom/xiaomi/fitness/sport/model/SendFocusNotification;", "", "", DailyRecordKey.sportType, "", "registerNotificationReceiver", "(I)V", "", "isPause", "", "getTickerStrBySportType", "(IZ)Ljava/lang/String;", "isSupportNotify", "()Z", "Lcom/xiaomi/fitness/sport_manager_export/data/PhoneSportData;", "phoneSportData", "Lcom/xiaomi/fitness/sport/data/FocusNotifyData;", "createFocusDataByPhoneData", "(Lcom/xiaomi/fitness/sport_manager_export/data/PhoneSportData;)Lcom/xiaomi/fitness/sport/data/FocusNotifyData;", "Landroid/content/Context;", "ctx", "hasFocusPermission", "(Landroid/content/Context;)Z", ColorSchemeHelper.SCHEME_DARK, "getSportDrawableByType", "(IZ)I", "Lcom/xiaomi/fitness/sport/bean/SportingData;", "sportingData", "sportIsPause", "sendFocusNotification", "(Lcom/xiaomi/fitness/sport/bean/SportingData;ILjava/lang/Boolean;)V", "cancelFocusNotification", "Landroidx/fragment/app/FragmentActivity;", LifecycleConstantKt.TYPE_ACTIVITY, "Lkotlin/Function0;", "callBack", "createDialogToNotifySetting", "(Landroidx/fragment/app/FragmentActivity;Lkotlin/jvm/functions/Function0;)V", "notifyId", "I", "TAG", "Ljava/lang/String;", "Ljava/text/SimpleDateFormat;", "mDurationFormat$delegate", "Lkotlin/Lazy;", "getMDurationFormat", "()Ljava/text/SimpleDateFormat;", "mDurationFormat", "Landroid/app/NotificationManager;", "nm", "Landroid/app/NotificationManager;", "Landroid/app/NotificationChannel;", "newC", "Landroid/app/NotificationChannel;", "Lwwg$e;", "notificationBuilder", "Lwwg$e;", "isFinish", "Z", "Lcom/xiaomi/fitness/sport/model/NotificationSetReceiver;", "mNotificationSetReceiver", "Lcom/xiaomi/fitness/sport/model/NotificationSetReceiver;", "<init>", "()V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SendFocusNotification {

    @NotNull
    public static final SendFocusNotification INSTANCE;

    @NotNull
    public static final String TAG = "SendFocusNotification";
    private static boolean isFinish = false;

    /* JADX INFO: renamed from: mDurationFormat$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy mDurationFormat;

    @Nullable
    private static NotificationSetReceiver mNotificationSetReceiver = null;

    @NotNull
    private static final NotificationChannel newC;

    @NotNull
    private static final NotificationManager nm;

    @NotNull
    private static final wwg.e notificationBuilder;
    public static final int notifyId = 186666;

    static {
        SendFocusNotification sendFocusNotification = new SendFocusNotification();
        INSTANCE = sendFocusNotification;
        mDurationFormat = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: usl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SendFocusNotification.mDurationFormat_delegate$lambda$0();
            }
        });
        Object systemService = AppUtil.getApp().getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        nm = notificationManager;
        NotificationChannel notificationChannel = new NotificationChannel("channel1", "运动健康实时数据", 3);
        newC = notificationChannel;
        notificationBuilder = new wwg.e(AppUtil.getApp(), "channel1");
        sendFocusNotification.getMDurationFormat().setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
        notificationManager.createNotificationChannel(notificationChannel);
    }

    private SendFocusNotification() {
    }

    private final FocusNotifyData createFocusDataByPhoneData(PhoneSportData phoneSportData) {
        String strValueOf;
        Resources resources = AppUtil.getApp().getResources();
        int i = phoneSportData.distance;
        if (i < 1000) {
            strValueOf = String.valueOf(i);
        } else {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            strValueOf = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(i / 1000.0f)}, 1));
            Intrinsics.checkNotNullExpressionValue(strValueOf, "format(...)");
        }
        String str = strValueOf;
        int i2 = phoneSportData.distance;
        String quantityString = i2 < 1000 ? resources.getQuantityString(zxi.d, i2) : resources.getQuantityString(zxi.f41780a, (int) (i2 / 1000.0f));
        Intrinsics.checkNotNull(quantityString);
        String str2 = getMDurationFormat().format(new Date(((long) phoneSportData.duration) * 1000));
        String string = resources.getString(c1j.h5);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        int i3 = phoneSportData.pace;
        String str3 = "--";
        String sportPaceStrWithSecDef = i3 == 0 ? "--" : TimeDateUtil.getSportPaceStrWithSecDef(i3);
        String string2 = AppUtil.getApp().getResources().getString(c1j.d1);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        int i4 = phoneSportData.distance;
        String quantityString2 = i4 < 1000 ? resources.getQuantityString(zxi.c, i4, str) : resources.getQuantityString(zxi.f41781b, (int) (i4 / 1000.0f), str);
        Intrinsics.checkNotNull(quantityString2);
        if (phoneSportData.sportType == 6) {
            String string3 = resources.getString(c1j.J4);
            int i5 = phoneSportData.pace;
            float f = i5 == 0 ? 0.0f : i5 / 1000;
            if (f == 0.0f) {
                string2 = string3;
            } else {
                float f2 = 3.6f / f;
                float f3 = 100;
                float fRound = Math.round(f2 * f3) / f3;
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String str4 = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(fRound)}, 1));
                Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
                string2 = string3;
                str3 = str4;
            }
        } else {
            str3 = sportPaceStrWithSecDef;
        }
        Intrinsics.checkNotNull(str2);
        return new FocusNotifyData(str, quantityString, str2, string, str3, string2, quantityString2, phoneSportData.duration);
    }

    private final SimpleDateFormat getMDurationFormat() {
        return (SimpleDateFormat) mDurationFormat.getValue();
    }

    private final int getSportDrawableByType(int sportType, boolean dark) {
        if (sportType == 1) {
            return !dark ? eoi.U : eoi.V;
        }
        if (sportType == 2) {
            return !dark ? eoi.W : eoi.X;
        }
        if (sportType == 3) {
            return !dark ? eoi.Q : eoi.R;
        }
        if (sportType != 6) {
            return eoi.Q;
        }
        return !dark ? eoi.S : eoi.T;
    }

    private final String getTickerStrBySportType(int sportType, boolean isPause) {
        if (isPause) {
            return ResourceExtKt.getString(c1j.T2);
        }
        if (sportType != 1) {
            if (sportType == 2) {
                return ResourceExtKt.getString(c1j.W2);
            }
            if (sportType != 3) {
                return sportType != 6 ? ResourceExtKt.getString(c1j.T2) : ResourceExtKt.getString(c1j.U2);
            }
        }
        return ResourceExtKt.getString(c1j.V2);
    }

    private final boolean hasFocusPermission(Context ctx) {
        try {
            Uri uri = Uri.parse("content://miui.statusbar.notification.public");
            Bundle bundle = new Bundle();
            bundle.putString("package", ctx.getPackageName());
            Bundle bundleCall = ctx.getContentResolver().call(uri, "canShowFocus", (String) null, bundle);
            Intrinsics.checkNotNull(bundleCall);
            return bundleCall.getBoolean("canShowFocus", false);
        } catch (Exception unused) {
            return false;
        }
    }

    private final boolean isSupportNotify() {
        return ConfigPreference.INSTANCE.getFOCUS_SPORT_NOTIFICATION() && !AppUtil.INSTANCE.isPlayChannel() && Settings.System.getInt(AppUtil.getApp().getContentResolver(), "notification_focus_protocol", 0) > 1 && RomUtils.isXiaomi();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleDateFormat mDurationFormat_delegate$lambda$0() {
        return new SimpleDateFormat(StringUtils.EXPECT_TIME_FORMAT);
    }

    private final void registerNotificationReceiver(int sportType) {
        mNotificationSetReceiver = new NotificationSetReceiver(sportType);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.xiaomi.fitness.sport.view.sporting.base_sporting_activity_report");
        if (Build.VERSION.SDK_INT >= 33) {
            AppUtil.getApp().registerReceiver(mNotificationSetReceiver, intentFilter, 2);
        } else {
            AppUtil.getApp().registerReceiver(mNotificationSetReceiver, intentFilter);
        }
    }

    public static /* synthetic */ void sendFocusNotification$default(SendFocusNotification sendFocusNotification, SportingData sportingData, int i, Boolean bool, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            bool = null;
        }
        sendFocusNotification.sendFocusNotification(sportingData, i, bool);
    }

    public final void cancelFocusNotification(int sportType) {
        Logger.i(TAG, "cancelFocusNotification start");
        if (!FitnessSportType.INSTANCE.supportNotifySport(sportType)) {
            Logger.i(TAG, sportType + " is not support notify");
            return;
        }
        if (isSupportNotify() && NotificationPermission.INSTANCE.postNotificationPermissionGranted(AppUtil.getApp()) && hasFocusPermission(AppUtil.getApp())) {
            Logger.i(TAG, "cancelFocusNotification start 186666");
            nm.cancel(notifyId);
            isFinish = true;
            SportPreference.INSTANCE.setFOCUS_NOTIFY_CANCEL_SPORT_TYPE(-1);
            if (mNotificationSetReceiver != null) {
                try {
                    AppUtil.getApp().unregisterReceiver(mNotificationSetReceiver);
                    mNotificationSetReceiver = null;
                } catch (Exception e) {
                    FitnessLogUtils.i(TAG, "unregisterReceiver is " + e);
                }
            }
        }
    }

    public final void createDialogToNotifySetting(@NotNull FragmentActivity activity, @NotNull final Function0<Unit> callBack) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        isFinish = false;
        SportPreference sportPreference = SportPreference.INSTANCE;
        if (!sportPreference.getSHOW_FOCUS_NOTIFY_DIALOG() || !isSupportNotify()) {
            FitnessLogUtils.i(TAG, "has isNotSupportNotify " + sportPreference.getSHOW_FOCUS_NOTIFY_DIALOG() + "  " + isSupportNotify());
            callBack.invoke();
            return;
        }
        NotificationPermission notificationPermission = NotificationPermission.INSTANCE;
        FitnessLogUtils.i(TAG, "postNotificationPermissionGranted : " + notificationPermission.postNotificationPermissionGranted(activity) + "  " + INSTANCE.hasFocusPermission(activity));
        if (notificationPermission.postNotificationPermissionGranted(activity) && hasFocusPermission(activity)) {
            callBack.invoke();
            return;
        }
        CommonDialog.c cVar = new CommonDialog.c("PermissionsUtil.FocusNotification");
        cVar.setDialogTitle(c1j.S2);
        cVar.setDialogDescription(c1j.P2);
        cVar.setPositiveText(c1j.R2);
        cVar.setNegativeText(c1j.Q2);
        CommonDialog commonDialogCreate = cVar.create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport.model.SendFocusNotification.createDialogToNotifySetting.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which == -2) {
                    callBack.invoke();
                } else {
                    if (which != -1) {
                        return;
                    }
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    NotificationPermission.INSTANCE.goNotifySettingPage();
                }
            }
        });
        commonDialogCreate.showIfNeed(activity.getSupportFragmentManager());
        sportPreference.setSHOW_FOCUS_NOTIFY_DIALOG(false);
    }

    public final void sendFocusNotification(@Nullable SportingData sportingData, int sportType, @Nullable Boolean sportIsPause) {
        boolean zBooleanValue;
        String str;
        String str2;
        int sportState = SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).getSportState();
        boolean z = sportState == 1 || sportState == 3;
        if (sportIsPause != null) {
            zBooleanValue = sportIsPause.booleanValue();
        } else {
            zBooleanValue = !z;
        }
        if (FitnessSportType.INSTANCE.supportNotifySport(sportType) && NotificationPermission.INSTANCE.postNotificationPermissionGranted(AppUtil.getApp()) && hasFocusPermission(AppUtil.getApp()) && isSupportNotify() && !isFinish) {
            SportPreference sportPreference = SportPreference.INSTANCE;
            if (sportPreference.getFOCUS_NOTIFY_CANCEL_SPORT_TYPE() == -1) {
                sportPreference.setFOCUS_NOTIFY_CANCEL_SPORT_TYPE(sportType);
            }
            if ((sportingData != null ? sportingData.getPhoneSportData() : null) == null) {
                return;
            }
            if (mNotificationSetReceiver == null) {
                registerNotificationReceiver(sportType);
            }
            String tickerStrBySportType = getTickerStrBySportType(sportType, zBooleanValue);
            wwg.e eVar = notificationBuilder;
            eVar.u(eoi.i);
            eVar.k(AppUtil.getApp().getString(c1j.f4830b));
            eVar.j(tickerStrBySportType);
            Intent intent = new Intent();
            if (sportType == 3) {
                intent.setAction("com.xiaomi.fitness.sport.activity.INDOOR_SPORT");
            } else {
                intent.setAction("com.xiaomi.fitness.sport.activity.COMMON_SPORT");
            }
            intent.setPackage(ApplicationExtKt.getApplication().getPackageName());
            intent.setFlags(536870912);
            eVar.i(PendingIntentExtKt.getActivityPendingIntent(ApplicationExtKt.getApplication(), 0, intent, 268435456));
            String uri = new Intent("com.xiaomi.fitness.sport.view.sporting.base_sporting_activity_report").toUri(1);
            sportingData.getMap();
            sportingData.getList();
            String string = ResourceExtKt.getString(!zBooleanValue ? c1j.d3 : c1j.x3);
            String str3 = "#FF612E";
            if (zBooleanValue) {
                str = "#FF612E";
            } else {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str4 = String.format("#%08X", Arrays.copyOf(new Object[]{Integer.valueOf(ExtUtilsKt.getColor(aki.n))}, 1));
                Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
                str = str4;
            }
            if (!zBooleanValue) {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                str3 = String.format("#%08X", Arrays.copyOf(new Object[]{Integer.valueOf(ExtUtilsKt.getColor(aki.o))}, 1));
                Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
            }
            String str5 = str3;
            String str6 = "#FFFFFF";
            if (zBooleanValue) {
                str2 = "#FFFFFF";
            } else {
                StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                String str7 = String.format("#%08X", Arrays.copyOf(new Object[]{Integer.valueOf(ExtUtilsKt.getColor(aki.p))}, 1));
                Intrinsics.checkNotNullExpressionValue(str7, "format(...)");
                str2 = str7;
            }
            if (!zBooleanValue) {
                StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
                str6 = String.format("#%08X", Arrays.copyOf(new Object[]{Integer.valueOf(ExtUtilsKt.getColor(aki.q))}, 1));
                Intrinsics.checkNotNullExpressionValue(str6, "format(...)");
            }
            String str8 = str6;
            PhoneSportData phoneSportData = sportingData.getPhoneSportData();
            Intrinsics.checkNotNull(phoneSportData);
            FocusNotifyData focusNotifyDataCreateFocusDataByPhoneData = createFocusDataByPhoneData(phoneSportData);
            String ticker = focusNotifyDataCreateFocusDataByPhoneData.getTicker();
            HighlightInfo highlightInfo = new HighlightInfo(2, focusNotifyDataCreateFocusDataByPhoneData.getDistanceUnit(), focusNotifyDataCreateFocusDataByPhoneData.getDistanceValue(), "miui.focus.pic_sport_v2", "miui.focus.pic_sport_v2_dark", null, null, null, null, null, null, 2016, null);
            PicInfo picInfo = new PicInfo(1);
            String otherTitle = focusNotifyDataCreateFocusDataByPhoneData.getOtherTitle();
            String otherValue = focusNotifyDataCreateFocusDataByPhoneData.getOtherValue();
            String timeTitle = focusNotifyDataCreateFocusDataByPhoneData.getTimeTitle();
            Intrinsics.checkNotNull(uri);
            long j = 1000;
            ParamV2 paramV2 = new ParamV2(1, ticker, tickerStrBySportType, highlightInfo, picInfo, new HintInfo(otherValue, timeTitle, otherTitle, 2, new ActionInfo("miui.focus.pic_function_v2", "miui.focus.pic_function_v2_dark", string, str2, str8, str, str5, 2, uri), new TimerInfo(zBooleanValue ? 2 : 1, ((System.currentTimeMillis() / j) - focusNotifyDataCreateFocusDataByPhoneData.getTime()) * j, System.currentTimeMillis()), null, null, null, null, null, null, null, null, 16320, null), null, false, true, 64, null);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("param_v2", paramV2);
            String json = new Gson().toJson(linkedHashMap);
            Bundle bundle = new Bundle();
            bundle.putString(NotificationFocusManager.NOTIFICATION_FOCUS_EXTRA, json);
            Bundle bundle2 = new Bundle();
            int i = zBooleanValue ? eoi.a0 : eoi.Y;
            int i2 = zBooleanValue ? eoi.a0 : eoi.Z;
            int sportDrawableByType = getSportDrawableByType(sportType, false);
            int sportDrawableByType2 = getSportDrawableByType(sportType, true);
            bundle2.putParcelable("miui.focus.pic_function_v2", Icon.createWithBitmap(BitmapFactory.decodeResource(AppUtil.getApp().getResources(), i)));
            bundle2.putParcelable("miui.focus.pic_function_v2_dark", Icon.createWithBitmap(BitmapFactory.decodeResource(AppUtil.getApp().getResources(), i2)));
            bundle2.putParcelable("miui.focus.pic_sport_v2", Icon.createWithBitmap(BitmapFactory.decodeResource(AppUtil.getApp().getResources(), sportDrawableByType)));
            bundle2.putParcelable("miui.focus.pic_sport_v2_dark", Icon.createWithBitmap(BitmapFactory.decodeResource(AppUtil.getApp().getResources(), sportDrawableByType2)));
            bundle.putBundle("miui.focus.pics", bundle2);
            eVar.c(bundle);
            nm.notify(notifyId, eVar.d());
        }
    }
}
