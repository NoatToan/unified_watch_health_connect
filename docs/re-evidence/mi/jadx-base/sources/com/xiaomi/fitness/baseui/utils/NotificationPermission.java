package com.xiaomi.fitness.baseui.utils;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.health.connect.client.records.OvulationTestRecord;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mibi.sdk.common.CommonConstants;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.utils.NotificationPermission;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AlarmManagerExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.PermissionBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.av6;
import defpackage.n1j;
import defpackage.ni4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001JB\t\b\u0002¢\u0006\u0004\bI\u0010@J\u0088\u0001\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\f\u001a\u00020\u00042#\u0010\u0012\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0018\u001a\u00020\b2\u001e\u0010\u0017\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0016\"\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJJ\u0010!\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u00042!\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00110\rH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020\u00112\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J)\u0010-\u001a\u00020\u00112\u001a\u0010,\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020+\u0018\u00010*0)¢\u0006\u0004\b-\u0010.JI\u00102\u001a\u00020\u00112:\u0010 \u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(0\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\u00110/¢\u0006\u0004\b2\u00103J\u0015\u00104\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b4\u00105JL\u0010!\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u00106\u001a\u00020+2\b\b\u0002\u0010\u001e\u001a\u00020\u00042!\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00110\r¢\u0006\u0004\b!\u00107JF\u00109\u001a\u00020\u0011*\u00020\u00022\u0006\u00108\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u00042!\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00110\r¢\u0006\u0004\b9\u0010\"J\u0011\u0010:\u001a\u00020\u0004*\u00020#¢\u0006\u0004\b:\u0010;J\\\u0010=\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u00108\u001a\u00020\b2\u0006\u0010<\u001a\u00020+2\b\b\u0002\u0010\f\u001a\u00020\u00042#\u0010\u0012\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\r¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\u0011¢\u0006\u0004\b?\u0010@RN\u0010B\u001a<\u00128\u00126\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(0\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\u00110/0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bD\u0010ER.\u0010F\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020+\u0018\u00010*0)0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010CR\u0014\u0010G\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bG\u0010ER\u0014\u0010H\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bH\u0010E¨\u0006K"}, d2 = {"Lcom/xiaomi/fitness/baseui/utils/NotificationPermission;", "", "Landroidx/fragment/app/FragmentActivity;", LifecycleConstantKt.TYPE_ACTIVITY, "", "postPermissionGranted", "exactAlarm", "", "", "notifyList", "alarmList", "forAllList", "has_close_tip", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", OvulationTestRecord.Result.POSITIVE, "", "dialogClickCallback", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "getForAllGuideDialog", "(Landroidx/fragment/app/FragmentActivity;ZZLjava/util/List;Ljava/util/List;Ljava/util/List;ZLkotlin/jvm/functions/Function1;)Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "", "list", "buildModuleString", "([Ljava/util/List;)Ljava/lang/String;", "Lav6;", "dialogCallback", "showAlarmDialog", "(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Lav6;)Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "showGuideDialog", CommonConstants.KEY_AGREE, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "requestAlarmPermissionIfNeed", "(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "Landroid/content/Context;", "context", "Landroid/content/BroadcastReceiver;", "receiver", "registerReceiver", "(Landroid/content/Context;Landroid/content/BroadcastReceiver;)V", "Lkotlin/Function0;", "Lkotlin/Pair;", "", "pair", "addFuncName", "(Lkotlin/jvm/functions/Function0;)V", "Lkotlin/Function2;", "notifyAgree", "alarmAgree", "registerListener", "(Lkotlin/jvm/functions/Function2;)V", "checkNotifyAndAlarmPermissionForAll", "(Landroidx/fragment/app/FragmentActivity;)V", "nameRes", "(Landroidx/fragment/app/FragmentActivity;IZLkotlin/jvm/functions/Function1;)V", "moduleString", "requestPostNotificationPermissionIfNeed", "postNotificationPermissionGranted", "(Landroid/content/Context;)Z", "strategy", "getNotifyAlarmGuideDialogForSingleFunction", "(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;IZLkotlin/jvm/functions/Function1;)Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "goNotifySettingPage", "()V", "Ljava/util/concurrent/CopyOnWriteArrayList;", "mListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "FOR_ALL_DIALOG_TAG", "Ljava/lang/String;", "mFuncPair", "ACTION_REJECT_FOR_ALL_PERMISSION", "ACTION_REJECT_NOTIFY_PERMISSION", "<init>", "AlarmBroadcastReceiver", "ui_release"}, k = 1, mv = {2, 0, 0})
public final class NotificationPermission {

    @NotNull
    private static final String ACTION_REJECT_FOR_ALL_PERMISSION = "action_reject_all_permission";

    @NotNull
    private static final String ACTION_REJECT_NOTIFY_PERMISSION = "action_reject_notify_permission";

    @NotNull
    private static final String FOR_ALL_DIALOG_TAG = "notify_and_alarm_request";

    @NotNull
    public static final NotificationPermission INSTANCE;

    @NotNull
    private static final CopyOnWriteArrayList<Function0<Pair<String, Integer>>> mFuncPair;

    @NotNull
    private static final CopyOnWriteArrayList<Function2<Boolean, Boolean, Unit>> mListeners;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/baseui/utils/NotificationPermission$AlarmBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nNotificationPermission.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationPermission.kt\ncom/xiaomi/fitness/baseui/utils/NotificationPermission$AlarmBroadcastReceiver\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,483:1\n1863#2,2:484\n1863#2,2:486\n1863#2,2:488\n*S KotlinDebug\n*F\n+ 1 NotificationPermission.kt\ncom/xiaomi/fitness/baseui/utils/NotificationPermission$AlarmBroadcastReceiver\n*L\n337#1:484,2\n342#1:486,2\n347#1:488,2\n*E\n"})
    public static final class AlarmBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(@Nullable Context context, @Nullable Intent intent) {
            String action = intent != null ? intent.getAction() : null;
            boolean z = false;
            boolean z2 = context != null && AlarmManagerExtKt.canScheduleExactAlarms(context);
            if (context != null && NotificationPermission.INSTANCE.postNotificationPermissionGranted(context)) {
                z = true;
            }
            Logger.i(NotificationPermissionKt.TAG, "schedule exact alarm permission state changed:" + z2 + ";" + z + ";action " + action);
            if (action != null) {
                int iHashCode = action.hashCode();
                if (iHashCode == -1918634688) {
                    if (action.equals("android.app.action.SCHEDULE_EXACT_ALARM_PERMISSION_STATE_CHANGED")) {
                        Iterator it = NotificationPermission.mListeners.iterator();
                        while (it.hasNext()) {
                            ((Function2) it.next()).invoke(null, Boolean.valueOf(z2));
                        }
                        return;
                    }
                    return;
                }
                if (iHashCode == -1811874172) {
                    if (action.equals(NotificationPermission.ACTION_REJECT_FOR_ALL_PERMISSION)) {
                        Iterator it2 = NotificationPermission.mListeners.iterator();
                        while (it2.hasNext()) {
                            ((Function2) it2.next()).invoke(Boolean.valueOf(z), Boolean.valueOf(z2));
                        }
                        return;
                    }
                    return;
                }
                if (iHashCode == -518586930 && action.equals(NotificationPermission.ACTION_REJECT_NOTIFY_PERMISSION)) {
                    Iterator it3 = NotificationPermission.mListeners.iterator();
                    while (it3.hasNext()) {
                        ((Function2) it3.next()).invoke(Boolean.valueOf(z), null);
                    }
                }
            }
        }
    }

    static {
        NotificationPermission notificationPermission = new NotificationPermission();
        INSTANCE = notificationPermission;
        mListeners = new CopyOnWriteArrayList<>();
        mFuncPair = new CopyOnWriteArrayList<>();
        notificationPermission.registerReceiver(ApplicationExtKt.getApplication(), new AlarmBroadcastReceiver());
    }

    private NotificationPermission() {
    }

    private final String buildModuleString(List<String>... list) {
        StringBuilder sb = new StringBuilder();
        String string = ResourceExtKt.getString(n1j.H);
        for (List<String> list2 : list) {
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(string);
            }
        }
        if (sb.length() > 0) {
            Intrinsics.checkNotNullExpressionValue(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
        }
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Unit checkNotifyAndAlarmPermissionForAll$lambda$1(final FragmentActivity activity, final List forAllStrList, List notifyStrList, final List alarmStrList) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(forAllStrList, "$forAllStrList");
        Intrinsics.checkNotNullParameter(notifyStrList, "$notifyStrList");
        Intrinsics.checkNotNullParameter(alarmStrList, "$alarmStrList");
        NotificationPermission notificationPermission = INSTANCE;
        requestPostNotificationPermissionIfNeed$default(notificationPermission, activity, notificationPermission.buildModuleString(forAllStrList, notifyStrList), false, new Function1() { // from class: ixg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return NotificationPermission.checkNotifyAndAlarmPermissionForAll$lambda$1$lambda$0(activity, alarmStrList, forAllStrList, ((Boolean) obj).booleanValue());
            }
        }, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkNotifyAndAlarmPermissionForAll$lambda$1$lambda$0(FragmentActivity activity, List alarmStrList, List forAllStrList, boolean z) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(alarmStrList, "$alarmStrList");
        Intrinsics.checkNotNullParameter(forAllStrList, "$forAllStrList");
        if (!z) {
            activity.sendBroadcast(new Intent(ACTION_REJECT_NOTIFY_PERMISSION));
        }
        if (!AlarmManagerExtKt.canScheduleExactAlarms(activity) && ((!alarmStrList.isEmpty()) || (!forAllStrList.isEmpty()))) {
            AlarmManagerExtKt.requestAlarmPermission(activity);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    public static final Unit checkNotifyAndAlarmPermissionForAll$lambda$2(List notifyStrList, List forAllStrList, Function0 requestNotifyPermission, FragmentActivity activity, List alarmStrList, boolean z) {
        Intrinsics.checkNotNullParameter(notifyStrList, "$notifyStrList");
        Intrinsics.checkNotNullParameter(forAllStrList, "$forAllStrList");
        Intrinsics.checkNotNullParameter(requestNotifyPermission, "$requestNotifyPermission");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(alarmStrList, "$alarmStrList");
        if (!z) {
            activity.sendBroadcast(new Intent(ACTION_REJECT_FOR_ALL_PERMISSION));
        } else if (!notifyStrList.isEmpty()) {
            requestNotifyPermission.invoke();
        } else {
            List list = forAllStrList;
            if (!list.isEmpty()) {
                requestNotifyPermission.invoke();
            } else if (!AlarmManagerExtKt.canScheduleExactAlarms(activity) && ((!alarmStrList.isEmpty()) || (!list.isEmpty()))) {
                AlarmManagerExtKt.requestAlarmPermission(activity);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CommonDialog<?> getForAllGuideDialog(FragmentActivity activity, boolean postPermissionGranted, boolean exactAlarm, List<String> notifyList, List<String> alarmList, List<String> forAllList, boolean has_close_tip, final Function1<? super Boolean, Unit> dialogClickCallback) {
        String strBuildModuleString;
        DialogParams.DialogDescriptionString dialogDescriptionString;
        char c = 3;
        if (postPermissionGranted && exactAlarm) {
            return null;
        }
        FragmentManager supportFragmentManager = activity != null ? activity.getSupportFragmentManager() : null;
        CommonDialog<?> commonDialogCreate = (CommonDialog) (supportFragmentManager != null ? supportFragmentManager.l0(FOR_ALL_DIALOG_TAG) : null);
        if (!postPermissionGranted && !exactAlarm && (!forAllList.isEmpty())) {
            strBuildModuleString = buildModuleString(forAllList, notifyList, alarmList);
            c = 1;
        } else if (!postPermissionGranted && ((!forAllList.isEmpty()) || (!notifyList.isEmpty()))) {
            strBuildModuleString = buildModuleString(forAllList, notifyList);
            c = 2;
        } else if (exactAlarm || !((!forAllList.isEmpty()) || (!alarmList.isEmpty()))) {
            c = 0;
            strBuildModuleString = null;
        } else {
            strBuildModuleString = buildModuleString(forAllList, alarmList);
        }
        if (strBuildModuleString == null || c == 0) {
            return null;
        }
        if (commonDialogCreate == null) {
            CommonDialog.c dialogTitle = new CommonDialog.c(FOR_ALL_DIALOG_TAG).setDialogTitle(n1j.A);
            if (c == 1) {
                dialogDescriptionString = new DialogParams.DialogDescriptionString(false, has_close_tip ? n1j.L : n1j.K, strBuildModuleString);
            } else if (c != 2) {
                dialogDescriptionString = new DialogParams.DialogDescriptionString(false, has_close_tip ? n1j.J : n1j.I, strBuildModuleString);
            } else {
                dialogDescriptionString = new DialogParams.DialogDescriptionString(false, has_close_tip ? n1j.P : n1j.O, strBuildModuleString);
            }
            commonDialogCreate = dialogTitle.setDialogDescriptionString(dialogDescriptionString).setPositiveText(n1j.v).setNegativeText(n1j.B).setCancelable(false).setCanceledOnBackPressed(false).setCanceledOnTouchOutside(false).create();
        }
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.baseui.utils.NotificationPermission.getForAllGuideDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                dialogClickCallback.invoke2(Boolean.valueOf(which == -1));
            }
        });
        return commonDialogCreate;
    }

    public static /* synthetic */ CommonDialog getNotifyAlarmGuideDialogForSingleFunction$default(NotificationPermission notificationPermission, FragmentActivity fragmentActivity, String str, int i, boolean z, Function1 function1, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = false;
        }
        return notificationPermission.getNotifyAlarmGuideDialogForSingleFunction(fragmentActivity, str, i, z, function1);
    }

    private final void registerReceiver(Context context, BroadcastReceiver receiver) {
        IntentFilter intentFilter = new IntentFilter();
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            intentFilter.addAction("android.app.action.SCHEDULE_EXACT_ALARM_PERMISSION_STATE_CHANGED");
        }
        intentFilter.addAction(ACTION_REJECT_FOR_ALL_PERMISSION);
        intentFilter.addAction(ACTION_REJECT_NOTIFY_PERMISSION);
        if (i >= 33) {
            context.registerReceiver(receiver, intentFilter, 2);
        } else {
            context.registerReceiver(receiver, intentFilter);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.content.BroadcastReceiver, com.xiaomi.fitness.baseui.utils.NotificationPermission$requestAlarmPermissionIfNeed$receiver$1] */
    private final void requestAlarmPermissionIfNeed(final FragmentActivity activity, String name, boolean showGuideDialog, final Function1<? super Boolean, Unit> listener) {
        boolean z = !AlarmManagerExtKt.canScheduleExactAlarms(activity);
        final CommonDialog<?> commonDialogShowAlarmDialog = !showGuideDialog ? null : showAlarmDialog(activity, name, new av6() { // from class: com.xiaomi.fitness.baseui.utils.NotificationPermission$requestAlarmPermissionIfNeed$showDialog$1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -1) {
                    AlarmManagerExtKt.requestAlarmPermission(activity);
                } else {
                    listener.invoke2(Boolean.FALSE);
                }
            }
        });
        if (!showGuideDialog && z) {
            AlarmManagerExtKt.requestAlarmPermission(activity);
        }
        if (!z) {
            listener.invoke2(Boolean.TRUE);
            return;
        }
        final ?? r5 = new BroadcastReceiver() { // from class: com.xiaomi.fitness.baseui.utils.NotificationPermission$requestAlarmPermissionIfNeed$receiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                Function1<Boolean, Unit> function1 = listener;
                boolean z2 = false;
                if (context != null && AlarmManagerExtKt.canScheduleExactAlarms(context)) {
                    z2 = true;
                }
                function1.invoke2(Boolean.valueOf(z2));
            }
        };
        registerReceiver(activity, r5);
        activity.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.xiaomi.fitness.baseui.utils.NotificationPermission.requestAlarmPermissionIfNeed.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                super.onDestroy(owner);
                CommonDialog<?> commonDialog = commonDialogShowAlarmDialog;
                if (commonDialog != null) {
                    commonDialog.dismissAllowingStateLoss();
                }
                activity.unregisterReceiver(r5);
                activity.getLifecycle().removeObserver(this);
            }
        });
    }

    public static /* synthetic */ void requestAlarmPermissionIfNeed$default(NotificationPermission notificationPermission, FragmentActivity fragmentActivity, int i, boolean z, Function1 function1, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        notificationPermission.requestAlarmPermissionIfNeed(fragmentActivity, i, z, (Function1<? super Boolean, Unit>) function1);
    }

    public static /* synthetic */ void requestPostNotificationPermissionIfNeed$default(NotificationPermission notificationPermission, FragmentActivity fragmentActivity, String str, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        notificationPermission.requestPostNotificationPermissionIfNeed(fragmentActivity, str, z, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPostNotificationPermissionIfNeed$lambda$5(final Function1 listener, PermissionBuilder permission) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(permission, "$this$permission");
        permission.granted(new Function1() { // from class: jxg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return NotificationPermission.requestPostNotificationPermissionIfNeed$lambda$5$lambda$3(listener, (String) obj);
            }
        });
        permission.denied(new Function1() { // from class: kxg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return NotificationPermission.requestPostNotificationPermissionIfNeed$lambda$5$lambda$4(listener, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPostNotificationPermissionIfNeed$lambda$5$lambda$3(Function1 listener, String it) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(NotificationPermissionKt.TAG, "requestPostNotificationPermissionIfNeed granted");
        listener.invoke2(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPostNotificationPermissionIfNeed$lambda$5$lambda$4(Function1 listener, String it) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(NotificationPermissionKt.TAG, "requestPostNotificationPermissionIfNeed granted");
        listener.invoke2(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    private final CommonDialog<?> showAlarmDialog(FragmentActivity activity, String name, av6 dialogCallback) {
        CommonDialog<?> commonDialogCreate = null;
        if (!AlarmManagerExtKt.canScheduleExactAlarms(activity)) {
            if (name.length() == 0) {
                return null;
            }
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            commonDialogCreate = (CommonDialog) supportFragmentManager.l0("alarm_permission");
            if (commonDialogCreate == null) {
                commonDialogCreate = new CommonDialog.c("alarm_permission").setDialogTitle(n1j.F).setDialogDescriptionString(new DialogParams.DialogDescriptionString(false, n1j.I, name)).setPositiveText(n1j.v).setNegativeText(n1j.B).create();
            }
            Intrinsics.checkNotNull(commonDialogCreate);
            commonDialogCreate.addDialogCallback(dialogCallback);
            commonDialogCreate.showIfNeed(supportFragmentManager);
        }
        return commonDialogCreate;
    }

    public final void addFuncName(@NotNull Function0<Pair<String, Integer>> pair) {
        Intrinsics.checkNotNullParameter(pair, "pair");
        mFuncPair.add(pair);
    }

    public final void checkNotifyAndAlarmPermissionForAll(@NotNull final FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        boolean zCanScheduleExactAlarms = AlarmManagerExtKt.canScheduleExactAlarms(activity);
        boolean zPostNotificationPermissionGranted = postNotificationPermissionGranted(activity);
        Logger.i(NotificationPermissionKt.TAG, "checkNotifyAndAlarmPermissionForAll post " + zPostNotificationPermissionGranted + ";exact " + zCanScheduleExactAlarms);
        if (zCanScheduleExactAlarms && zPostNotificationPermissionGranted) {
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            CommonDialog commonDialog = (CommonDialog) supportFragmentManager.l0(FOR_ALL_DIALOG_TAG);
            if (commonDialog != null) {
                commonDialog.dismissAllowingStateLoss();
                return;
            }
            return;
        }
        final List<String> arrayList = new ArrayList<>();
        final List<String> arrayList2 = new ArrayList<>();
        final List<String> arrayList3 = new ArrayList<>();
        Iterator<Function0<Pair<String, Integer>>> it = mFuncPair.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Pair<String, Integer> pairInvoke = it.next().invoke();
            if (pairInvoke != null) {
                int iIntValue = pairInvoke.getSecond().intValue();
                if (iIntValue == 2) {
                    arrayList.add(pairInvoke.getFirst());
                } else if (iIntValue != 3) {
                    arrayList3.add(pairInvoke.getFirst());
                } else {
                    arrayList2.add(pairInvoke.getFirst());
                }
            }
        }
        Logger.i(NotificationPermissionKt.TAG, "checkNotifyAndAlarmPermissionForAll: size:" + mFuncPair.size() + ";notifyOnly:" + arrayList + ";alarmOnly:" + arrayList2 + ";all:" + arrayList3 + ";");
        if (arrayList.isEmpty() && arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return;
        }
        final Function0 function0 = new Function0() { // from class: mxg
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NotificationPermission.checkNotifyAndAlarmPermissionForAll$lambda$1(activity, arrayList3, arrayList, arrayList2);
            }
        };
        CommonDialog<?> forAllGuideDialog = getForAllGuideDialog(activity, zPostNotificationPermissionGranted, zCanScheduleExactAlarms, arrayList, arrayList2, arrayList3, true, new Function1() { // from class: nxg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return NotificationPermission.checkNotifyAndAlarmPermissionForAll$lambda$2(arrayList, arrayList3, function0, activity, arrayList2, ((Boolean) obj).booleanValue());
            }
        });
        if (forAllGuideDialog != null) {
            forAllGuideDialog.showIfNeed(activity.getSupportFragmentManager());
        }
    }

    @Nullable
    public final CommonDialog<?> getNotifyAlarmGuideDialogForSingleFunction(@Nullable FragmentActivity activity, @NotNull String moduleString, int strategy, boolean has_close_tip, @NotNull final Function1<? super Boolean, Unit> dialogClickCallback) {
        DialogParams.DialogDescriptionString dialogDescriptionString;
        Intrinsics.checkNotNullParameter(moduleString, "moduleString");
        Intrinsics.checkNotNullParameter(dialogClickCallback, "dialogClickCallback");
        boolean zCanScheduleExactAlarms = activity != null ? AlarmManagerExtKt.canScheduleExactAlarms(activity) : false;
        boolean zPostNotificationPermissionGranted = activity != null ? postNotificationPermissionGranted(activity) : false;
        if (zCanScheduleExactAlarms && strategy == 3) {
            return null;
        }
        if (zPostNotificationPermissionGranted && strategy == 2) {
            return null;
        }
        if (zPostNotificationPermissionGranted && zCanScheduleExactAlarms) {
            return null;
        }
        FragmentManager supportFragmentManager = activity != null ? activity.getSupportFragmentManager() : null;
        CommonDialog<?> commonDialogCreate = (CommonDialog) (supportFragmentManager != null ? supportFragmentManager.l0("notify_alarm_dialog") : null);
        if (!zPostNotificationPermissionGranted && !zCanScheduleExactAlarms && strategy == 1) {
            dialogDescriptionString = new DialogParams.DialogDescriptionString(false, has_close_tip ? n1j.L : n1j.K, moduleString);
        } else if (!zPostNotificationPermissionGranted && (strategy == 1 || strategy == 2)) {
            dialogDescriptionString = new DialogParams.DialogDescriptionString(false, has_close_tip ? n1j.P : n1j.O, moduleString);
        } else if (zCanScheduleExactAlarms || !(strategy == 1 || strategy == 3)) {
            dialogDescriptionString = null;
        } else {
            dialogDescriptionString = new DialogParams.DialogDescriptionString(false, has_close_tip ? n1j.J : n1j.I, moduleString);
        }
        if (dialogDescriptionString == null) {
            return null;
        }
        if (commonDialogCreate == null) {
            commonDialogCreate = new CommonDialog.c("notify_alarm_dialog").setDialogTitle(n1j.A).setDialogDescriptionString(dialogDescriptionString).setPositiveText(n1j.v).setNegativeText(n1j.B).setCancelable(false).setCanceledOnBackPressed(false).setCanceledOnTouchOutside(false).create();
        }
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.baseui.utils.NotificationPermission.getNotifyAlarmGuideDialogForSingleFunction.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                dialogClickCallback.invoke2(Boolean.valueOf(which == -1));
            }
        });
        return commonDialogCreate;
    }

    public final void goNotifySettingPage() {
        Intent flags = new Intent().setFlags(268435456);
        Intrinsics.checkNotNullExpressionValue(flags, "setFlags(...)");
        Application application = ApplicationExtKt.getApplication();
        flags.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        Intrinsics.checkNotNull(flags.putExtra("android.provider.extra.APP_PACKAGE", application.getPackageName()));
        application.startActivity(flags);
    }

    public final boolean postNotificationPermissionGranted(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return Build.VERSION.SDK_INT < 33 || ni4.a(context, "android.permission.POST_NOTIFICATIONS") == 0;
    }

    public final void registerListener(@NotNull Function2<? super Boolean, ? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        boolean zCanScheduleExactAlarms = AlarmManagerExtKt.canScheduleExactAlarms(ApplicationExtKt.getApplication());
        boolean zPostNotificationPermissionGranted = postNotificationPermissionGranted(ApplicationExtKt.getApplication());
        Logger.i(NotificationPermissionKt.TAG, "registerListener " + zCanScheduleExactAlarms + " " + zPostNotificationPermissionGranted);
        if (zCanScheduleExactAlarms && zPostNotificationPermissionGranted) {
            Boolean bool = Boolean.TRUE;
            listener.invoke(bool, bool);
        } else if (zCanScheduleExactAlarms) {
            listener.invoke(null, Boolean.TRUE);
        } else if (zPostNotificationPermissionGranted) {
            listener.invoke(Boolean.TRUE, null);
        }
        mListeners.add(listener);
    }

    public final void requestPostNotificationPermissionIfNeed(@NotNull FragmentActivity fragmentActivity, @NotNull String moduleString, boolean z, @NotNull final Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        Intrinsics.checkNotNullParameter(moduleString, "moduleString");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (Build.VERSION.SDK_INT < 33) {
            listener.invoke2(Boolean.TRUE);
            return;
        }
        Application application = fragmentActivity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        if (postNotificationPermissionGranted(application)) {
            listener.invoke2(Boolean.TRUE);
        } else {
            PermissionExtKt.permission(fragmentActivity, "android.permission.POST_NOTIFICATIONS", fragmentActivity.getString(z ? n1j.N : n1j.M, moduleString), (Function1<? super PermissionBuilder, Unit>) new Function1() { // from class: lxg
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return NotificationPermission.requestPostNotificationPermissionIfNeed$lambda$5(listener, (PermissionBuilder) obj);
                }
            });
        }
    }

    public final void requestAlarmPermissionIfNeed(@NotNull FragmentActivity activity, int nameRes, boolean showGuideDialog, @NotNull Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String string = activity.getString(nameRes);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        requestAlarmPermissionIfNeed(activity, string, showGuideDialog, listener);
    }
}
