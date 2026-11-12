package com.huami.device.feature.notification.utils;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.device.feature.notification.statistics.NotificationEvent;
import com.huami.device.feature.notification.statistics.NotificationStatisticsKt;
import com.huami.device.feature.notification.statistics.RefusedReason;
import com.huami.privacy.PrivacyProvider;
import com.huami.privacy.plugin.IsAppForeground;
import com.huami.privacy.plugin.PrivacyPlugin;
import com.huami.sleep.sleephome.ui.SleepHomeActivity;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.loc.z;
import java.util.HashMap;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b;\u0010<J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0003J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001c\u0010\u001d\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u0017H\u0002J\u0010\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010!\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010 \u001a\u00020\u0017J\u0010\u0010\"\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010#\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010&\u001a\u0004\u0018\u00010\u00172\u0006\u0010%\u001a\u00020$J\u0012\u0010'\u001a\u0004\u0018\u00010\u00172\u0006\u0010%\u001a\u00020$H\u0007J\u000e\u0010(\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010*\u001a\u00020\u00178\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010)R2\u0010.\u001a\u001e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170+j\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017`,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010)R\u0018\u00100\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010)R\u0016\u00103\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00102R\u0016\u00104\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010)R\u0016\u00107\u001a\u0002058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u00106R\u0016\u00108\u001a\u00020\u00178\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010)R\u0016\u00109\u001a\u00020\u00178\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010)R\u0016\u0010:\u001a\u00020\u00178\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010)¨\u0006="}, d2 = {"Lcom/huami/device/feature/notification/utils/NotificationFilter;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/service/notification/StatusBarNotification;", "sbn", "", "m", com.google.android.exoplayer2.text.ttml.b.r, hl.k, "h", "i", "g", "e", "f", "l", "c", z.j, "Landroid/os/Bundle;", "extras", "", "a", "bundle", "", "key", "b", "o", "title", "content", GoogleApiAvailabilityLight.b, GoogleApiAvailabilityLight.a, "isGroupSummary", "log", "allowNotification", "isDuplicateNotification", "isAvailableNotification", "Landroid/app/Notification;", SleepHomeActivity.FROM_NOTIFICATION, "getNotificationTitle", "getNotificationContent", "handleResidentNotificationRemoved", "Ljava/lang/String;", "logTag", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "residentNotifications", "mTitle", "mContent", "", "J", "mLastTime", "mLastMsg", "", LogUtil.I, "timeGap", "EXTRA_CONTAINS_CUSTOM_VIEW", "EXTRA_TEMPLATE_BIG_TEXT_STYLE", "EXTRA_TEMPLATE_INBOX_STYLE", "<init>", "()V", "notification_release"}, k = 1, mv = {1, 5, 1})
public final class NotificationFilter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String logTag = "NotificationLog_Filter";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private static String mTitle = null;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private static String mContent = null;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static long mLastTime = 0;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final int timeGap = 2000;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private static final String EXTRA_CONTAINS_CUSTOM_VIEW = "android.contains.customView";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private static final String EXTRA_TEMPLATE_BIG_TEXT_STYLE = "android.app.Notification$BigTextStyle";

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private static final String EXTRA_TEMPLATE_INBOX_STYLE = "android.app.Notification$InboxStyle";

    @NotNull
    public static final NotificationFilter INSTANCE = new NotificationFilter();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final HashMap<String, String> residentNotifications = new HashMap<>();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static String mLastMsg = "";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "The sbn is null.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ StatusBarNotification b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, StatusBarNotification statusBarNotification) {
            super(0);
            this.a = str;
            this.b = statusBarNotification;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a + JsonLexerKt.COLON + this.b + "\nisOngoing:" + this.b.isOngoing();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ StatusBarNotification a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(StatusBarNotification statusBarNotification) {
            super(0);
            this.a = statusBarNotification;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "The package " + ((Object) this.a.getPackageName()) + " notification that it's isOngoing is true or not support.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "notification contains custom view.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ RuntimeException a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(RuntimeException runtimeException) {
            super(0);
            this.a = runtimeException;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("exception: ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ Bundle a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Bundle bundle) {
            super(0);
            this.a = bundle;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ Notification a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Notification notification, String str) {
            super(0);
            this.a = notification;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "notification category: " + ((Object) this.a.category) + " style: " + ((Object) this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Duplicate notification.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "hasGroupMsg: " + this.a + " hasGroupFlag: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ StatusBarNotification a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(StatusBarNotification statusBarNotification) {
            super(0);
            this.a = statusBarNotification;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "The notification of " + ((Object) this.a.getPackageName()) + " is group summary";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "last:" + ((Object) this.a) + "\nlatest:" + NotificationFilter.mLastMsg;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public static final l a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Both title and content is empty.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public static final m a = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "The notification channel is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public static final n a = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "The category of sms notification is group but not msg";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("unavailableNotificationOfSms exception: ", this.a);
        }
    }

    private NotificationFilter() {
    }

    private final void a(Bundle extras) {
        try {
            if (extras.getBoolean(EXTRA_CONTAINS_CUSTOM_VIEW)) {
                HMLog.info(logTag, d.a);
            }
        } catch (RuntimeException e2) {
            HMLog.info(logTag, new e(e2));
        }
    }

    private final String b(Bundle bundle, String key) {
        CharSequence charSequence = bundle.getCharSequence(key);
        if (charSequence == null || charSequence.length() == 0) {
            return null;
        }
        return charSequence.toString();
    }

    @RequiresApi(21)
    private final boolean c(StatusBarNotification sbn) {
        return (!isDuplicateNotification(sbn)) & (sbn.getNotification().getGroup() != null);
    }

    @RequiresApi(21)
    private final boolean d(StatusBarNotification sbn) {
        boolean z = true;
        boolean zIsInvisibleChannel = sbn.getNotification().priority < 1;
        if (Build.VERSION.SDK_INT >= 26) {
            zIsInvisibleChannel |= AppsHelper.INSTANCE.isInvisibleChannel(sbn.getNotification().getChannelId());
        }
        if (AppsHelper.INSTANCE.canSupportResidentNotification(sbn.getPackageName())) {
            z = (sbn.getNotification().visibility <= 0) & (sbn.getNotification().priority == 0);
        }
        return zIsInvisibleChannel & z;
    }

    private final boolean e(StatusBarNotification sbn) {
        return sbn.isOngoing();
    }

    @RequiresApi(21)
    private final boolean f(Context context, StatusBarNotification sbn) {
        AppsHelper appsHelper = AppsHelper.INSTANCE;
        if (appsHelper.isSmsApp(context, sbn.getPackageName()) || (d(sbn) && (!appsHelper.isCall(sbn)))) {
            return false;
        }
        String strO = o(sbn);
        HashMap<String, String> map = residentNotifications;
        String str = map.get(strO);
        String str2 = mTitle;
        if (str2 == null) {
            str2 = "";
        }
        mLastMsg = str2;
        HMLog.debug(logTag, new k(str));
        map.put(strO, mLastMsg);
        return !Intrinsics.areEqual(str, mLastMsg);
    }

    @RequiresApi(21)
    private final boolean g(StatusBarNotification sbn) {
        return AppsHelper.INSTANCE.isSecondStandardEmail(sbn.getPackageName()) && Intrinsics.areEqual(sbn.getNotification().category, "email");
    }

    private final boolean h(StatusBarNotification sbn) {
        return Intrinsics.areEqual(sbn.getPackageName(), PkgNameConstants.SLACK);
    }

    @RequiresApi(21)
    private final boolean i(StatusBarNotification sbn) {
        return AppsHelper.INSTANCE.isStandardEmail(sbn.getPackageName()) && Intrinsics.areEqual(sbn.getNotification().category, "email");
    }

    @RequiresApi(21)
    private final boolean j(StatusBarNotification sbn, Context context) {
        return p(context, sbn) | isDuplicateNotification(sbn) | isGroupSummary(sbn) | m(context, sbn);
    }

    @RequiresApi(21)
    private final boolean k(StatusBarNotification sbn) {
        mTitle = getNotificationTitle(sbn.getNotification());
        mContent = getNotificationContent(sbn.getNotification());
        String str = mTitle;
        boolean z = str == null || str.length() == 0;
        String str2 = mContent;
        if (!z || !(str2 == null || str2.length() == 0)) {
            return false;
        }
        HMLog.info(logTag, l.a);
        return true;
    }

    @RequiresApi(21)
    private final boolean l(StatusBarNotification sbn) {
        return Intrinsics.areEqual(sbn.getPackageName(), PkgNameConstants.WHATSAPP) & Intrinsics.areEqual(sbn.getNotification().category, NotificationCompat.CATEGORY_CALL);
    }

    private final boolean m(Context context, StatusBarNotification sbn) {
        boolean zIsAppsNotificationNormal = Build.VERSION.SDK_INT >= 26 ? AppsHelper.INSTANCE.isAppsNotificationNormal(context, sbn.getPackageName()) & TextUtils.isEmpty(sbn.getNotification().getChannelId()) : false;
        if (zIsAppsNotificationNormal) {
            HMLog.info(logTag, m.a);
        }
        return zIsAppsNotificationNormal;
    }

    private final String n(String title, String content) {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) title);
        sb.append('#');
        sb.append((Object) content);
        return sb.toString();
    }

    private final String o(StatusBarNotification sbn) {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) sbn.getPackageName());
        sb.append('_');
        sb.append(sbn.getId());
        return sb.toString();
    }

    private final boolean p(Context context, StatusBarNotification sbn) {
        try {
            if (!AppsHelper.INSTANCE.isNotSmsApp(context, sbn.getPackageName()) && Build.VERSION.SDK_INT >= 24) {
                boolean z = (sbn.getNotification().getGroup() != null) | (sbn.getNotification().getSortKey() != null);
                boolean z2 = !Intrinsics.areEqual(sbn.getNotification().category, "msg");
                PrivacyProvider privacyProvider = PrivacyProvider.INSTANCE;
                if ("处理息屏无法接收短信提醒的问题".length() == 0) {
                    throw new Exception("请填写此隐私信息的使用目的");
                }
                for (Object obj : privacyProvider.getPlugins()) {
                    if (Intrinsics.areEqual(((PrivacyPlugin) obj).getClass(), IsAppForeground.class)) {
                        if (obj == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.huami.privacy.plugin.IsAppForeground");
                        }
                        if (z & z2 & ((IsAppForeground) obj).getValue().booleanValue()) {
                            HMLog.info(logTag, n.a);
                            return true;
                        }
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            return false;
        } catch (Exception e2) {
            HMLog.info(logTag, new o(e2));
            return false;
        }
    }

    public final boolean allowNotification(@Nullable StatusBarNotification sbn, @NotNull String log) {
        if (sbn == null) {
            HMLog.error$default(logTag, null, null, a.a, 6, null);
            return false;
        }
        boolean z = !sbn.isOngoing();
        AppsHelper appsHelper = AppsHelper.INSTANCE;
        boolean zAllowOngoingTrueNotification = z | appsHelper.allowOngoingTrueNotification(sbn.getPackageName()) | appsHelper.isCall(sbn);
        if (zAllowOngoingTrueNotification) {
            HMLog.info(logTag, new b(log, sbn));
        } else {
            HMLog.info(logTag, new c(sbn));
        }
        return zAllowOngoingTrueNotification;
    }

    @RequiresApi(21)
    @Nullable
    public final String getNotificationContent(@NotNull Notification notification) {
        String strB;
        String strB2;
        Bundle extras = NotificationCompat.getExtras(notification);
        Object obj = null;
        if (extras == null) {
            return null;
        }
        HMLog.debug(logTag, new f(extras));
        a(extras);
        String string = extras.getString(NotificationCompat.EXTRA_TEMPLATE);
        HMLog.info(logTag, new g(notification, string));
        if (!Intrinsics.areEqual(string, EXTRA_TEMPLATE_INBOX_STYLE)) {
            if (!Intrinsics.areEqual(string, EXTRA_TEMPLATE_BIG_TEXT_STYLE)) {
                String strB3 = b(extras, NotificationCompat.EXTRA_TEXT);
                if (strB3 != null) {
                    return strB3;
                }
                String strB4 = b(extras, NotificationCompat.EXTRA_BIG_TEXT);
                if (strB4 != null) {
                    return strB4;
                }
                String strB5 = b(extras, NotificationCompat.EXTRA_SUB_TEXT);
                return strB5 == null ? b(extras, NotificationCompat.EXTRA_SUMMARY_TEXT) : strB5;
            }
            StringBuilder sb = new StringBuilder();
            String strB6 = b(extras, NotificationCompat.EXTRA_BIG_TEXT);
            if (strB6 != null) {
                sb.append(strB6);
                obj = strB6;
            }
            if (obj == null && (strB = b(extras, NotificationCompat.EXTRA_TEXT)) != null) {
                sb.append(strB);
            }
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        CharSequence[] charSequenceArray = extras.getCharSequenceArray(NotificationCompat.EXTRA_TEXT_LINES);
        if (charSequenceArray != null) {
            int i2 = 0;
            CharSequence[] charSequenceArr = (charSequenceArray.length == 0) ^ true ? charSequenceArray : null;
            if (charSequenceArr != null) {
                int length = charSequenceArr.length;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = i3 + 1;
                    sb2.append(charSequenceArr[i2]);
                    if (i3 < charSequenceArray.length - 1) {
                        sb2.append("\n");
                    }
                    i2++;
                    i3 = i4;
                }
                obj = Unit.INSTANCE;
            }
        }
        if (obj == null && (strB2 = b(extras, NotificationCompat.EXTRA_TEXT)) != null) {
            sb2.append(strB2);
        }
        return sb2.toString();
    }

    @Nullable
    public final String getNotificationTitle(@NotNull Notification notification) {
        Bundle extras = NotificationCompat.getExtras(notification);
        if (extras == null) {
            return null;
        }
        a(extras);
        return b(extras, NotificationCompat.EXTRA_TITLE);
    }

    public final void handleResidentNotificationRemoved(@NotNull StatusBarNotification sbn) {
        HashMap<String, String> map = residentNotifications;
        if (map.containsKey(o(sbn))) {
            map.remove(o(sbn));
        }
    }

    @RequiresApi(21)
    public final boolean isAvailableNotification(@NotNull Context context, @NotNull StatusBarNotification sbn) {
        if (k(sbn)) {
            return false;
        }
        if (e(sbn)) {
            return f(context, sbn);
        }
        if (i(sbn)) {
            return isGroupSummary(sbn);
        }
        if (g(sbn)) {
            return isGroupSummary(sbn) | c(sbn);
        }
        if (l(sbn)) {
            if (isDuplicateNotification(sbn)) {
                return false;
            }
        } else if (h(sbn)) {
            if (isDuplicateNotification(sbn)) {
                return false;
            }
        } else if (j(sbn, context)) {
            return false;
        }
        return true;
    }

    @RequiresApi(21)
    public final boolean isDuplicateNotification(@NotNull StatusBarNotification sbn) {
        boolean z = Math.abs(System.currentTimeMillis() - mLastTime) < 2000;
        String str = mTitle;
        boolean z2 = str == null || str.length() == 0;
        String str2 = mContent;
        boolean z3 = z2 & (str2 != null && StringsKt__StringsKt.contains$default((CharSequence) mLastMsg, (CharSequence) str2, false, 2, (Object) null));
        String strN = n(mTitle, mContent);
        boolean zAreEqual = z3 | Intrinsics.areEqual(mLastMsg, strN);
        mLastMsg = strN;
        mLastTime = System.currentTimeMillis();
        boolean zContainsKey = (residentNotifications.containsKey(o(sbn)) | z) & zAreEqual;
        if (zContainsKey) {
            HMLog.info(logTag, h.a);
        }
        return zContainsKey;
    }

    @RequiresApi(21)
    public final boolean isGroupSummary(@NotNull StatusBarNotification sbn) {
        boolean z = (sbn.getNotification().getGroup() != null) | (sbn.getNotification().getSortKey() != null);
        boolean z2 = (sbn.getNotification().flags & 512) != 0;
        HMLog.info(logTag, new i(z2));
        boolean z3 = z & z2;
        if (z3) {
            HMLog.info(logTag, new j(sbn));
            NotificationStatisticsKt.recordEvent(NotificationEvent.SYNC_REFUSED, sbn.getPackageName(), RefusedReason.GROUP_SUMMARY);
        }
        return z3;
    }
}
