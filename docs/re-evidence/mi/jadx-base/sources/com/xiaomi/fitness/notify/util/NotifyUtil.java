package com.xiaomi.fitness.notify.util;

import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import androidx.fragment.app.FragmentManager;
import com.google.gson.Gson;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import com.xiaomi.fitness.notify.BleNotifyModel;
import com.xiaomi.fitness.notify.NotifyFragment;
import com.xiaomi.fitness.notify.callnotify.BaseCallNotifyFragment;
import com.xiaomi.fitness.notify.callnotify.BleCallNotifyFragment;
import com.xiaomi.fitness.notify.callnotify.HuaMiCallNotifyFragment;
import com.xiaomi.fitness.notify.di.NotifyStartExtKt;
import com.xiaomi.fitness.notify.notification.NotificationManagerInter;
import com.xiaomi.fitness.notify.util.NotifyUtil;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.InCall;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import defpackage.av6;
import defpackage.bg4;
import defpackage.dih;
import defpackage.ni4;
import defpackage.o4h;
import defpackage.q0j;
import defpackage.vc0;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bJ\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000bJ\u001f\u0010\u000e\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0010\"\u00020\u0005¢\u0006\u0002\u0010\u0011J\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005J\u0011\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010¢\u0006\u0002\u0010\u0015J\u0011\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010¢\u0006\u0002\u0010\u0015J\u0011\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010¢\u0006\u0002\u0010\u0015J\u0011\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010¢\u0006\u0002\u0010\u0015J\u000e\u0010\u0019\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\"\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u0086@¢\u0006\u0002\u0010\u001cJ\b\u0010\u001f\u001a\u00020\u0005H\u0002J\u000e\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0005J&\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020$2\b\b\u0001\u0010%\u001a\u00020&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070(J4\u0010)\u001a\u00020\u00072\u0006\u0010#\u001a\u00020$2\b\b\u0001\u0010%\u001a\u00020&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070(2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070(JR\u0010+\u001a\u00020\u00072\u0006\u0010#\u001a\u00020$2\b\b\u0001\u0010,\u001a\u00020&2\b\b\u0001\u0010%\u001a\u00020&2\b\b\u0001\u0010-\u001a\u00020&2\b\b\u0001\u0010.\u001a\u00020&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070(2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070(J\u0006\u0010/\u001a\u00020\u000bJ\u0006\u00100\u001a\u00020\u000bJ\u0006\u00101\u001a\u000202J\u000e\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u000bR\u000e\u0010\u001d\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/xiaomi/fitness/notify/util/NotifyUtil;", "", "<init>", "()V", "getNotifyClass", "", "goCallNotify", "", "context", "Landroid/content/Context;", "isInCallOpen", "", "goNotify", "isNotificationOpen", "shouldRequestPermission", "permission", "", "([Ljava/lang/String;)Z", "getSuffixTag", "did", "getWearOsCallpermissionList", "()[Ljava/lang/String;", "getWearOSPhoneNotifyPermissionDescList", "getNeedRequestPhoneNotifyPermissionList", "getNeedRequestPhoneNotifyPermissionDescList", "endCall", "getContactsDisplayName", RealNameWebViewActivity.NUMBER, "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "HOST_OPERATION", "TAG", "getOperationHost", "getNotificationHelpUrl", "model", "showGoSettingDialog", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "contentId", "", "positiveCallback", "Lkotlin/Function0;", "showAlertPermissionDialog", "negativeCallback", "showDialog", "titleId", "positiveId", "negativeId", "getNotificationEnable", "getInCallEnable", "getInCall", "Lcom/xiaomi/fitness/settingitem/settingitem/InCall;", "updateInCallConfig", "enable", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNotifyUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotifyUtil.kt\ncom/xiaomi/fitness/notify/util/NotifyUtil\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,448:1\n37#2:449\n36#2,3:450\n37#2:453\n36#2,3:454\n37#2:457\n36#2,3:458\n37#2:461\n36#2,3:462\n*S KotlinDebug\n*F\n+ 1 NotifyUtil.kt\ncom/xiaomi/fitness/notify/util/NotifyUtil\n*L\n117#1:449\n117#1:450,3\n142#1:453\n142#1:454,3\n171#1:457\n171#1:458,3\n198#1:461\n198#1:462,3\n*E\n"})
public final class NotifyUtil {

    @NotNull
    private static final String HOST_OPERATION = "https://%swatch.iot.mi.com";

    @NotNull
    public static final NotifyUtil INSTANCE = new NotifyUtil();

    @NotNull
    private static final String TAG = "NOTIFICATION_SET";

    /* JADX INFO: renamed from: com.xiaomi.fitness.notify.util.NotifyUtil$getContactsDisplayName$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.notify.util.NotifyUtil$getContactsDisplayName$2", f = "NotifyUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $number;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, String str, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$number = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$context, this.$number, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:42:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th;
            Cursor cursorQuery;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String string = null;
            if (ni4.a(this.$context, "android.permission.READ_CONTACTS") == 0) {
                try {
                    try {
                        cursorQuery = this.$context.getContentResolver().query(Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, this.$number), new String[]{"display_name"}, null, null, null);
                        if (cursorQuery != null) {
                            try {
                                try {
                                    if (cursorQuery.moveToNext()) {
                                        string = cursorQuery.getString(0);
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    e.printStackTrace();
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    return string;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (cursorQuery != null) {
                                    try {
                                        cursorQuery.close();
                                    } catch (Exception e2) {
                                        e2.printStackTrace();
                                    }
                                }
                                throw th;
                            }
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                } catch (Exception e4) {
                    e = e4;
                    cursorQuery = null;
                } catch (Throwable th3) {
                    th = th3;
                    cursorQuery = null;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            }
            return string;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private NotifyUtil() {
    }

    private final String getOperationHost() {
        String lowerCase = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Logger.i(TAG, "getOperationHost: region = " + lowerCase);
        if (Intrinsics.areEqual(lowerCase, "cn")) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(HOST_OPERATION, Arrays.copyOf(new Object[]{""}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String str2 = String.format(HOST_OPERATION, Arrays.copyOf(new Object[]{lowerCase + "."}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }

    public static /* synthetic */ void goCallNotify$default(NotifyUtil notifyUtil, Context context, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        notifyUtil.goCallNotify(context, z);
    }

    public static /* synthetic */ void goNotify$default(NotifyUtil notifyUtil, Context context, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        notifyUtil.goNotify(context, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateInCallConfig$lambda$3(InCall inCall, WearableDeviceModel mDeviceModel, String str) {
        Intrinsics.checkNotNullParameter(inCall, "$inCall");
        Intrinsics.checkNotNullParameter(mDeviceModel, "$mDeviceModel");
        DeviceSettingManager.INSTANCE.getInstance().sendSettingItem(mDeviceModel.getDid(), DeviceSettingConfigKey.KEY_INCALL, inCall);
        NotifyStartExtKt.getNotificationManagerImpl().setInCallResult(inCall);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateInCallConfig$lambda$4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateInCallConfig$lambda$5(Throwable th) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateInCallConfig$lambda$6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateInCallConfig$lambda$7() {
    }

    public final void endCall(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (ni4.a(context, "android.permission.ANSWER_PHONE_CALLS") == 0) {
                try {
                    Object systemService = context.getApplicationContext().getSystemService("telecom");
                    Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telecom.TelecomManager");
                    TelecomManager telecomManager = (TelecomManager) systemService;
                    Method declaredMethod = telecomManager.getClass().getDeclaredMethod("endCall", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(telecomManager, new Object[0]);
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
            return;
        }
        if (i >= 28) {
            if (ni4.a(context, "android.permission.ANSWER_PHONE_CALLS") == 0) {
                try {
                    Object systemService2 = context.getApplicationContext().getSystemService("telecom");
                    Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.telecom.TelecomManager");
                    ((TelecomManager) systemService2).endCall();
                    return;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
            }
            return;
        }
        if (ni4.a(context, "android.permission.CALL_PHONE") == 0) {
            try {
                Object systemService3 = context.getApplicationContext().getSystemService("phone");
                Intrinsics.checkNotNull(systemService3, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                TelephonyManager telephonyManager = (TelephonyManager) systemService3;
                Method declaredMethod2 = Class.forName(telephonyManager.getClass().getName()).getDeclaredMethod("getITelephony", new Class[0]);
                declaredMethod2.setAccessible(true);
                Object objInvoke = declaredMethod2.invoke(telephonyManager, new Object[0]);
                Method declaredMethod3 = Class.forName(objInvoke.getClass().getName()).getDeclaredMethod("endCall", new Class[0]);
                declaredMethod3.setAccessible(true);
                declaredMethod3.invoke(objInvoke, new Object[0]);
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
    }

    @Nullable
    public final Object getContactsDisplayName(@NotNull Context context, @Nullable String str, @NotNull Continuation<? super String> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(context, str, null), continuation);
    }

    @NotNull
    public final InCall getInCall() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return new InCall();
        }
        if (!DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            InCall inCallResult = BleNotifyModel.INSTANCE.getInCallResult(wearableDeviceModel.getDid());
            return inCallResult == null ? new InCall() : inCallResult;
        }
        Object objValueToObject = DeviceSettingManager.INSTANCE.getInstance().readSettingItem(wearableDeviceModel.getDid(), DeviceSettingConfigKey.KEY_INCALL).valueToObject(InCall.class);
        InCall inCall = objValueToObject instanceof InCall ? (InCall) objValueToObject : null;
        if (inCall != null) {
            return inCall;
        }
        InCall inCall2 = new InCall();
        inCall2.setIncallNotifyEnabled(false);
        inCall2.setIncallContactNotifyEnabled(false);
        inCall2.setIncallNameDisplayEnabled(false);
        inCall2.setIncomingCallReply(false);
        inCall2.setInComingCallNotifyTime(SportSummary.VERSION_103);
        return inCall2;
    }

    public final boolean getInCallEnable() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return false;
        }
        InCall inCall = getInCall();
        if (DeviceModelExtKt.isWearOS(wearableDeviceModel)) {
            if (!NotifyStartExtKt.getNotificationManagerImpl().isCallSyncResult()) {
                return false;
            }
            Application application = ApplicationExtKt.getApplication();
            String[] wearOsCallpermissionList = getWearOsCallpermissionList();
            if (!PermissionExtKt.isPermissionGranted(application, (String[]) Arrays.copyOf(wearOsCallpermissionList, wearOsCallpermissionList.length))) {
                return false;
            }
        } else if (NotifyStartExtKt.getNotificationManagerImpl().isDualCallWithOutBle()) {
            if (Build.VERSION.SDK_INT >= 31) {
                if (!NotifyPreference.INSTANCE.isInCallOptimizationOpen() || !inCall.isIncallNameDisplayEnabled() || !PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.READ_CONTACTS") || !PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.READ_PHONE_STATE")) {
                    return false;
                }
            } else if (!inCall.isIncallNameDisplayEnabled() || !PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.READ_CONTACTS")) {
                return false;
            }
        } else {
            if (!inCall.isIncallNotifyEnabled() || !inCall.isIncallNameDisplayEnabled() || !NotifyStartExtKt.getNotificationManagerImpl().isNotificationPolicyAccessGranted()) {
                return false;
            }
            Application application2 = ApplicationExtKt.getApplication();
            String[] filterPhoneNotifyPermissionList = NotifyStartExtKt.getNotificationManagerImpl().getFilterPhoneNotifyPermissionList(inCall.isIncallNotifyEnabled(), AppUtil.INSTANCE.isPlayChannel());
            if (!PermissionExtKt.isPermissionGranted(application2, (String[]) Arrays.copyOf(filterPhoneNotifyPermissionList, filterPhoneNotifyPermissionList.length))) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public final String[] getNeedRequestPhoneNotifyPermissionDescList() {
        ArrayList arrayList = new ArrayList();
        if (!PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.READ_CONTACTS")) {
            arrayList.add(ResourceExtKt.getString(q0j.e0));
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 28 && !PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.READ_CALL_LOG")) {
            arrayList.add(ResourceExtKt.getString(q0j.h0));
        }
        if (i >= 28) {
            if (!PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.ANSWER_PHONE_CALLS")) {
                arrayList.add(ResourceExtKt.getString(q0j.g0));
            }
            if (!PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.READ_PHONE_STATE")) {
                arrayList.add(" ");
            }
        } else {
            if (!PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.CALL_PHONE")) {
                arrayList.add(ResourceExtKt.getString(q0j.g0));
            }
            if (!PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.ANSWER_PHONE_CALLS")) {
                arrayList.add(" ");
            }
            if (!PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.READ_PHONE_STATE")) {
                arrayList.add(" ");
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @NotNull
    public final String[] getNeedRequestPhoneNotifyPermissionList() {
        ArrayList arrayList = new ArrayList();
        if (!PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.READ_CONTACTS")) {
            arrayList.add("android.permission.READ_CONTACTS");
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 28 && !PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.READ_CALL_LOG")) {
            arrayList.add("android.permission.READ_CALL_LOG");
        }
        if (i >= 28) {
            if (!PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.ANSWER_PHONE_CALLS")) {
                arrayList.add("android.permission.ANSWER_PHONE_CALLS");
            }
            if (!PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.READ_PHONE_STATE")) {
                arrayList.add("android.permission.READ_PHONE_STATE");
            }
        } else {
            if (!PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.CALL_PHONE")) {
                arrayList.add("android.permission.CALL_PHONE");
            }
            if (!PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.ANSWER_PHONE_CALLS")) {
                arrayList.add("android.permission.ANSWER_PHONE_CALLS");
            }
            if (!PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.READ_PHONE_STATE")) {
                arrayList.add("android.permission.READ_PHONE_STATE");
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final boolean getNotificationEnable() {
        return NotifyStartExtKt.getNotificationManagerImpl().isNotifySwitchStatusEnable() && NotifyStartExtKt.getNotificationManagerImpl().isNotificationListenersEnabled();
    }

    @NotNull
    public final String getNotificationHelpUrl(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s/html/no_message_was_received_android/index.html?locale=%s&model=%s", Arrays.copyOf(new Object[]{getOperationHost(), LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null), model}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public final String getNotifyClass() {
        return AppUtil.INSTANCE.isPlayChannel() ? "com.xiaomi.wearable.home.devices.ble.sync.NotifySyncService" : "com.xiaomi.fitness.notify.NotifySyncService";
    }

    @NotNull
    public final String getSuffixTag(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return "-" + did;
    }

    @NotNull
    public final String[] getWearOSPhoneNotifyPermissionDescList() {
        ArrayList arrayList = new ArrayList();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            arrayList.add(ResourceExtKt.getString(q0j.h0));
        }
        if (i >= 28) {
            arrayList.add(ResourceExtKt.getString(q0j.g0));
            arrayList.add(" ");
        } else {
            arrayList.add(ResourceExtKt.getString(q0j.g0));
            arrayList.add(" ");
            arrayList.add(" ");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @NotNull
    public final String[] getWearOsCallpermissionList() {
        ArrayList arrayList = new ArrayList();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            arrayList.add("android.permission.READ_CALL_LOG");
        }
        if (i >= 28) {
            arrayList.add("android.permission.ANSWER_PHONE_CALLS");
        } else {
            arrayList.add("android.permission.CALL_PHONE");
            arrayList.add("android.permission.ANSWER_PHONE_CALLS");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final void goCallNotify(@NotNull Context context, boolean isInCallOpen) {
        Intrinsics.checkNotNullParameter(context, "context");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        Bundle bundle = new Bundle();
        bundle.putBoolean(BaseCallNotifyFragment.OPEN_IN_CALL_IN_REMIND, isInCallOpen);
        dih.a().e(context, (wearableDeviceModel == null || !DeviceModelExtKt.isHuaMi(wearableDeviceModel)) ? new FragmentParams.b().e(BleCallNotifyFragment.class).c(bundle).b() : new FragmentParams.b().e(HuaMiCallNotifyFragment.class).c(bundle).b());
    }

    public final void goNotify(@NotNull Context context, boolean isNotificationOpen) {
        Intrinsics.checkNotNullParameter(context, "context");
        Bundle bundle = new Bundle();
        bundle.putBoolean(NotifyFragment.OPEN_NOTIFICATION, isNotificationOpen);
        dih.a().e(context, new FragmentParams.b().e(NotifyFragment.class).c(bundle).b());
    }

    public final boolean shouldRequestPermission(@NotNull String... permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        return !PermissionExtKt.isPermissionGranted(AppUtil.getApp(), (String[]) Arrays.copyOf(permission, permission.length));
    }

    public final void showAlertPermissionDialog(@NotNull FragmentManager fragmentManager, int contentId, @NotNull Function0<Unit> positiveCallback, @NotNull Function0<Unit> negativeCallback) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(positiveCallback, "positiveCallback");
        Intrinsics.checkNotNullParameter(negativeCallback, "negativeCallback");
        showDialog(fragmentManager, q0j.a0, contentId, q0j.common_allow, q0j.common_reject, positiveCallback, negativeCallback);
    }

    public final void showDialog(@NotNull FragmentManager fragmentManager, int titleId, int contentId, int positiveId, int negativeId, @NotNull final Function0<Unit> positiveCallback, @NotNull final Function0<Unit> negativeCallback) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(positiveCallback, "positiveCallback");
        Intrinsics.checkNotNullParameter(negativeCallback, "negativeCallback");
        new CommonDialog.c("commonDialog").setDialogTitle(titleId).setDialogDescriptionString(new DialogParams.DialogDescriptionString(contentId, new Object[0])).setNegativeText(negativeId).setPositiveText(positiveId).setCanceledOnBackPressed(false).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.notify.util.NotifyUtil.showDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    negativeCallback.invoke();
                } else {
                    if (which != -1) {
                        return;
                    }
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    positiveCallback.invoke();
                }
            }
        }).show(fragmentManager, "");
    }

    public final void showGoSettingDialog(@NotNull FragmentManager fragmentManager, int contentId, @NotNull Function0<Unit> positiveCallback) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(positiveCallback, "positiveCallback");
        showDialog(fragmentManager, q0j.f0, contentId, q0j.k0, q0j.f30960b, positiveCallback, new Function0() { // from class: o1h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        });
    }

    public final void updateInCallConfig(boolean enable) {
        final WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return;
        }
        final InCall inCall = getInCall();
        inCall.setIncallNotifyEnabled(enable);
        inCall.setIncallNameDisplayEnabled(enable);
        if (!DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            String json = new Gson().toJson(inCall);
            NotificationManagerInter notificationManagerImpl = NotifyStartExtKt.getNotificationManagerImpl();
            Intrinsics.checkNotNull(json);
            notificationManagerImpl.setInCallNotifyConfig(json);
            return;
        }
        o4h o4hVarG = o4h.E("").g(500L, TimeUnit.MILLISECONDS);
        final Function1 function1 = new Function1() { // from class: p1h
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return NotifyUtil.updateInCallConfig$lambda$3(inCall, wearableDeviceModel, (String) obj);
            }
        };
        bg4 bg4Var = new bg4() { // from class: q1h
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                NotifyUtil.updateInCallConfig$lambda$4(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: r1h
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return NotifyUtil.updateInCallConfig$lambda$5((Throwable) obj);
            }
        };
        o4hVarG.P(bg4Var, new bg4() { // from class: s1h
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                NotifyUtil.updateInCallConfig$lambda$6(function2, obj);
            }
        }, new vc0() { // from class: t1h
            @Override // defpackage.vc0
            public final void run() {
                NotifyUtil.updateInCallConfig$lambda$7();
            }
        });
    }
}
