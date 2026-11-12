package com.xiaomi.fitness.privacy.permission;

import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.xiaomi.accountsdk.request.SimpleRequest;
import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import defpackage.s0j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0007¢\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/privacy/permission/PermissionHelper;", "", "<init>", "()V", "TAG", "", "defaultPrivacyPermissions", "", "Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission;", "getAnswerPhoneCallsPermissions", "", "()[Ljava/lang/String;", "isNotificationListenersEnabled", "", "context", "Landroid/content/Context;", "isNotificationPolicyAccessGranted", "getDefaultPermissionList", "", "Permission", "privacy_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPermissionHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionHelper.kt\ncom/xiaomi/fitness/privacy/permission/PermissionHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,218:1\n774#2:219\n865#2,2:220\n37#3:222\n36#3,3:223\n37#3:226\n36#3,3:227\n*S KotlinDebug\n*F\n+ 1 PermissionHelper.kt\ncom/xiaomi/fitness/privacy/permission/PermissionHelper\n*L\n20#1:219\n20#1:220,2\n161#1:222\n161#1:223,3\n173#1:226\n173#1:227,3\n*E\n"})
public final class PermissionHelper {

    @NotNull
    public static final PermissionHelper INSTANCE = new PermissionHelper();

    @NotNull
    public static final String TAG = "PermissionHelper";

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000e\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001fB)\b\u0004\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\b\u0010\u0011\u001a\u00020\u0004H\u0016R\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f\u0082\u0001\u000e !\"#$%&'()*+,-¨\u0006."}, d2 = {"Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission;", "", "permissions", "", "", "titleRes", "", "desRes", "<init>", "([Ljava/lang/String;II)V", "[Ljava/lang/String;", "getTitleRes", "()I", "getDesRes", "isNeedShow", "", "isPermissionsGranted", "toString", SimpleRequest.LOCATION, "Camera", "PhoneCalls", "AnswerPhoneCalls", "ReadContacts", "ReadCallLog", "ReadPhoneState", AIApiConstants.Calendar.NAME, "Storage", "SendSMS", "Notification", "NotDisturb", "RecordAudio", "BodyMovement", "Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission$AnswerPhoneCalls;", "Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission$BodyMovement;", "Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission$Calendar;", "Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission$Camera;", "Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission$Location;", "Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission$NotDisturb;", "Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission$Notification;", "Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission$PhoneCalls;", "Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission$ReadCallLog;", "Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission$ReadContacts;", "Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission$ReadPhoneState;", "Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission$RecordAudio;", "Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission$SendSMS;", "Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission$Storage;", "privacy_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Permission {
        private final int desRes;

        @NotNull
        private final String[] permissions;
        private final int titleRes;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission$AnswerPhoneCalls;", "Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission;", "<init>", "()V", "privacy_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AnswerPhoneCalls extends Permission {

            @NotNull
            public static final AnswerPhoneCalls INSTANCE = new AnswerPhoneCalls();

            private AnswerPhoneCalls() {
                super(PermissionHelper.getAnswerPhoneCallsPermissions(), s0j.f, s0j.p, null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission$BodyMovement;", "Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission;", "<init>", "()V", "privacy_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class BodyMovement extends Permission {

            @NotNull
            public static final BodyMovement INSTANCE = new BodyMovement();

            private BodyMovement() {
                super(new String[]{"android.permission.ACTIVITY_RECOGNITION"}, s0j.f33134a, s0j.f33135b, null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission$Calendar;", "Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission;", "<init>", "()V", "privacy_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Calendar extends Permission {

            @NotNull
            public static final Calendar INSTANCE = new Calendar();

            private Calendar() {
                super(new String[]{"android.permission.READ_CALENDAR"}, s0j.g, s0j.h, null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission$Camera;", "Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission;", "<init>", "()V", "privacy_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Camera extends Permission {

            @NotNull
            public static final Camera INSTANCE = new Camera();

            private Camera() {
                super(new String[]{"android.permission.CAMERA"}, s0j.f33136k, s0j.l, null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission$Location;", "Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission;", "<init>", "()V", "privacy_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Location extends Permission {

            @NotNull
            public static final Location INSTANCE = new Location();

            private Location() {
                super(new String[]{"android.permission.ACCESS_FINE_LOCATION"}, s0j.w, s0j.q, null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission$NotDisturb;", "Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission;", "<init>", "()V", "privacy_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class NotDisturb extends Permission {

            @NotNull
            public static final NotDisturb INSTANCE = new NotDisturb();

            private NotDisturb() {
                super(new String[0], s0j.n, s0j.o, null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission$Notification;", "Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission;", "<init>", "()V", "privacy_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Notification extends Permission {

            @NotNull
            public static final Notification INSTANCE = new Notification();

            private Notification() {
                super(new String[0], s0j.x, s0j.f33137r, null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission$PhoneCalls;", "Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission;", "<init>", "()V", "privacy_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class PhoneCalls extends Permission {

            @NotNull
            public static final PhoneCalls INSTANCE = new PhoneCalls();

            private PhoneCalls() {
                super(new String[]{"android.permission.CALL_PHONE"}, s0j.i, s0j.y, null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission$ReadCallLog;", "Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission;", "<init>", "()V", "privacy_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ReadCallLog extends Permission {

            @NotNull
            public static final ReadCallLog INSTANCE = new ReadCallLog();

            private ReadCallLog() {
                super(new String[]{"android.permission.READ_CALL_LOG"}, s0j.z, s0j.j, null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission$ReadContacts;", "Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission;", "<init>", "()V", "privacy_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ReadContacts extends Permission {

            @NotNull
            public static final ReadContacts INSTANCE = new ReadContacts();

            private ReadContacts() {
                super(new String[]{"android.permission.READ_CONTACTS"}, s0j.A, s0j.m, null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission$ReadPhoneState;", "Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission;", "<init>", "()V", "privacy_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ReadPhoneState extends Permission {

            @NotNull
            public static final ReadPhoneState INSTANCE = new ReadPhoneState();

            private ReadPhoneState() {
                super(new String[]{"android.permission.READ_PHONE_STATE"}, s0j.B, s0j.s, null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission$RecordAudio;", "Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission;", "<init>", "()V", "privacy_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class RecordAudio extends Permission {

            @NotNull
            public static final RecordAudio INSTANCE = new RecordAudio();

            private RecordAudio() {
                super(new String[]{"android.permission.RECORD_AUDIO"}, s0j.C, s0j.D, null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission$SendSMS;", "Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission;", "<init>", "()V", "privacy_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class SendSMS extends Permission {

            @NotNull
            public static final SendSMS INSTANCE = new SendSMS();

            private SendSMS() {
                super(new String[]{"android.permission.SEND_SMS"}, s0j.t, s0j.u, null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission$Storage;", "Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission;", "<init>", "()V", "privacy_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Storage extends Permission {

            @NotNull
            public static final Storage INSTANCE = new Storage();

            private Storage() {
                super(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, s0j.E, s0j.v, null);
            }
        }

        public /* synthetic */ Permission(String[] strArr, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(strArr, i, i2);
        }

        public final int getDesRes() {
            return this.desRes;
        }

        public final int getTitleRes() {
            return this.titleRes;
        }

        public final boolean isNeedShow() {
            boolean z = false;
            if ((this instanceof PhoneCalls) || (this instanceof ReadCallLog) ? Build.VERSION.SDK_INT < 28 : !(!(this instanceof Storage) ? !(!(this instanceof RecordAudio) || !AppUtil.INSTANCE.isPlayChannel()) : Build.VERSION.SDK_INT >= 29)) {
                z = true;
            }
            Logger.i(PermissionHelper.TAG, this + " isNeedShow:" + z);
            return z;
        }

        public final boolean isPermissionsGranted() {
            if ((this instanceof Storage) && Build.VERSION.SDK_INT >= 29) {
                return true;
            }
            if (this instanceof Notification) {
                return PermissionHelper.INSTANCE.isNotificationListenersEnabled(ApplicationExtKt.getApplication());
            }
            return this instanceof NotDisturb ? PermissionHelper.INSTANCE.isNotificationPolicyAccessGranted(ApplicationExtKt.getApplication()) : !PermissionsUtil.shouldRequestPermission(this.permissions);
        }

        @NotNull
        public String toString() {
            String string = Arrays.toString(this.permissions);
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return "Permission(permissions=" + string + ")";
        }

        private Permission(String[] strArr, int i, int i2) {
            this.permissions = strArr;
            this.titleRes = i;
            this.desRes = i2;
        }

        public /* synthetic */ Permission(String[] strArr, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(strArr, i, (i3 & 4) != 0 ? -1 : i2, null);
        }
    }

    private PermissionHelper() {
    }

    @JvmStatic
    @NotNull
    public static final String[] getAnswerPhoneCallsPermissions() {
        List listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf("android.permission.READ_PHONE_STATE");
        listMutableListOf.add("android.permission.ANSWER_PHONE_CALLS");
        return (String[]) listMutableListOf.toArray(new String[0]);
    }

    private final List<Permission> getDefaultPermissionList() {
        List<Permission> listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(Permission.Storage.INSTANCE, Permission.Camera.INSTANCE, Permission.SendSMS.INSTANCE, Permission.PhoneCalls.INSTANCE, Permission.AnswerPhoneCalls.INSTANCE, Permission.ReadContacts.INSTANCE, Permission.ReadCallLog.INSTANCE, Permission.Location.INSTANCE, Permission.ReadPhoneState.INSTANCE, Permission.Calendar.INSTANCE, Permission.Notification.INSTANCE, Permission.NotDisturb.INSTANCE, Permission.RecordAudio.INSTANCE);
        if (Build.VERSION.SDK_INT >= 29) {
            listMutableListOf.add(Permission.BodyMovement.INSTANCE);
        }
        return listMutableListOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isNotificationListenersEnabled(Context context) {
        String packageName = context.getPackageName();
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        if (!TextUtils.isEmpty(string)) {
            Intrinsics.checkNotNull(string);
            for (String str : (String[]) new Regex(":").split(string, 0).toArray(new String[0])) {
                ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                if (componentNameUnflattenFromString != null && TextUtils.equals(packageName, componentNameUnflattenFromString.getPackageName())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isNotificationPolicyAccessGranted(Context context) {
        Object systemService = context.getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        return ((NotificationManager) systemService).isNotificationPolicyAccessGranted();
    }

    @NotNull
    public final List<Permission> defaultPrivacyPermissions() {
        List<Permission> defaultPermissionList = getDefaultPermissionList();
        ArrayList arrayList = new ArrayList();
        for (Object obj : defaultPermissionList) {
            if (((Permission) obj).isNeedShow()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
