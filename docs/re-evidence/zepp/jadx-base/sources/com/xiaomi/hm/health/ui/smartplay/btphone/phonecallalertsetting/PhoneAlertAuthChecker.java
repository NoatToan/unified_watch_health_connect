package com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import androidx.annotation.RequiresApi;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleep.sleephome.ui.SleepHomeActivity;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.utils.Utils;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0004R\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u001d\u0010\u0012\u001a\u00020\u00048B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0014\u001a\u00020\u00048B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u000e\u0010\u0011R\u001d\u0010\u0016\u001a\u00020\u00048B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001d\u0010\u0017\u001a\u00020\u00048B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/PhoneAlertAuthChecker;", "", "", "a", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/ShowAuthInfo;", "authInfo", "f", "getPhoneCallPermissionAuthInfo", "getContactPermissionAuthInfo", "getPhoneCallLogPermissionAuthInfo", "getDisturbPermissionAuthInfo", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "b", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/ShowAuthInfo;", "phoneCallAuthInfo", "c", "contactAuthInfo", "e", "phoneCallLogAuthInfo", "disturbAuthInfo", "<init>", "(Landroid/content/Context;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class PhoneAlertAuthChecker {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy phoneCallAuthInfo = LazyKt__LazyJVMKt.lazy(c.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy contactAuthInfo = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy phoneCallLogAuthInfo = LazyKt__LazyJVMKt.lazy(d.a);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy disturbAuthInfo = LazyKt__LazyJVMKt.lazy(b.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/ShowAuthInfo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ShowAuthInfo> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ShowAuthInfo invoke() {
            return new ShowAuthInfo(Integer.valueOf(R.string.tips_contact_permission), Integer.valueOf(R.string.tips_contact_permission_sub_watch), false, "android.permission.READ_CONTACTS", Integer.valueOf(R.string.permission_contact));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/ShowAuthInfo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<ShowAuthInfo> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ShowAuthInfo invoke() {
            return new ShowAuthInfo(Integer.valueOf(R.string.permission_disturb_title_sub), Integer.valueOf(R.string.permission_disturb_call_watch), false, Build.VERSION.SDK_INT >= 24 ? new String[]{"android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS"} : null, null, Integer.valueOf(R.string.permission_disturb_title_sub), 16, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/ShowAuthInfo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<ShowAuthInfo> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ShowAuthInfo invoke() {
            return new ShowAuthInfo(Integer.valueOf(R.string.tips_call_permission), Integer.valueOf(R.string.enable_phone_call_permission_sub_title), false, Build.VERSION.SDK_INT >= 26 ? new String[]{"android.permission.READ_PHONE_STATE", "android.permission.CALL_PHONE", "android.permission.ANSWER_PHONE_CALLS"} : new String[]{"android.permission.READ_PHONE_STATE", "android.permission.CALL_PHONE"}, null, Integer.valueOf(R.string.tips_call_permission), 16, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/ShowAuthInfo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<ShowAuthInfo> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ShowAuthInfo invoke() {
            return new ShowAuthInfo(Integer.valueOf(R.string.title_call_log_per_s), Integer.valueOf(R.string.tips_call_log_per), false, Build.VERSION.SDK_INT >= 28 ? new String[]{"android.permission.READ_CALL_LOG"} : null, null, Integer.valueOf(R.string.title_call_log_per_s), 16, null);
        }
    }

    public PhoneAlertAuthChecker(@NotNull Context context) {
        this.context = context;
    }

    @RequiresApi(24)
    private final boolean a() {
        Object systemService = this.context.getSystemService(SleepHomeActivity.FROM_NOTIFICATION);
        if (systemService == null || !(systemService instanceof NotificationManager)) {
            return false;
        }
        return ((NotificationManager) systemService).isNotificationPolicyAccessGranted();
    }

    private final ShowAuthInfo b() {
        return (ShowAuthInfo) this.contactAuthInfo.getValue();
    }

    private final ShowAuthInfo c() {
        return (ShowAuthInfo) this.disturbAuthInfo.getValue();
    }

    private final ShowAuthInfo d() {
        return (ShowAuthInfo) this.phoneCallAuthInfo.getValue();
    }

    private final ShowAuthInfo e() {
        return (ShowAuthInfo) this.phoneCallLogAuthInfo.getValue();
    }

    private final boolean f(ShowAuthInfo authInfo) {
        String[] permission = authInfo.getPermission();
        String str = null;
        if (permission != null) {
            int length = permission.length;
            int i = 0;
            while (i < length) {
                String str2 = permission[i];
                i++;
                if (!Utils.checkPermission(this.context, str2)) {
                    str = str2;
                    break;
                }
            }
        }
        return str == null;
    }

    @NotNull
    public final ShowAuthInfo getContactPermissionAuthInfo() {
        b().setShow(!f(b()));
        return b();
    }

    @NotNull
    public final ShowAuthInfo getDisturbPermissionAuthInfo() {
        if (c().getPermission() == null) {
            c().setShow(false);
        } else {
            c().setShow(!(Build.VERSION.SDK_INT < 24 ? true : a()));
        }
        return c();
    }

    @NotNull
    public final ShowAuthInfo getPhoneCallLogPermissionAuthInfo() {
        e().setShow(!f(e()));
        return e();
    }

    @NotNull
    public final ShowAuthInfo getPhoneCallPermissionAuthInfo() {
        d().setShow(!f(d()));
        return d();
    }
}
