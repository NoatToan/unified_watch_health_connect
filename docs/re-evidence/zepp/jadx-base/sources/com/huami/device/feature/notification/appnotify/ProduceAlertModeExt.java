package com.huami.device.feature.notification.appnotify;

import android.app.Notification;
import android.content.Context;
import android.text.TextUtils;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.device.feature.notification.R;
import com.huami.device.feature.notification.module.INotificationModule;
import com.huami.device.feature.notification.utils.AppUtil;
import com.huami.device.feature.notification.utils.AppsHelper;
import com.huami.device.feature.notification.utils.BrandCompat;
import com.huami.device.feature.notification.utils.NotificationFilter;
import com.huami.device.feature.notification.utils.NotificationLog;
import com.huami.sleep.sleephome.ui.SleepHomeActivity;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertApp;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertMode;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertModeExt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001:\u0001\u0004B'\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b%\u0010&J\u0015\u0010\u0004\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0082\u0004J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005R\u0016\u0010\t\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\n8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\fR\u0016\u0010\u001e\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010\"\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001dR\u0016\u0010$\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001d¨\u0006'"}, d2 = {"Lcom/huami/device/feature/notification/appnotify/ProduceAlertModeExt;", "", "Lcom/huami/device/feature/notification/appnotify/ProduceAlertModeExt$a;", "next", "a", "Lcom/xiaomi/hm/health/bt/profile/alert/HMAlertModeExt;", "produce", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "b", "Ljava/lang/String;", "pkg", "Landroid/app/Notification;", "c", "Landroid/app/Notification;", SleepHomeActivity.FROM_NOTIFICATION, "Lcom/huami/device/feature/notification/module/INotificationModule;", GoogleApiAvailabilityLight.a, "Lcom/huami/device/feature/notification/module/INotificationModule;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "e", "logTag", "f", "title", "g", "content", "h", "Lcom/huami/device/feature/notification/appnotify/ProduceAlertModeExt$a;", "handleSms", "i", "handleWeChat", z.j, "handleQQ", hl.k, "default", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroid/app/Notification;Lcom/huami/device/feature/notification/module/INotificationModule;)V", "notification_release"}, k = 1, mv = {1, 5, 1})
public final class ProduceAlertModeExt {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String pkg;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Notification notification;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final INotificationModule listener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final String logTag = NotificationLog.defaultTag;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private final String title;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private final String content;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final a handleSms;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final a handleWeChat;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final a handleQQ;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final a default;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002 \u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001Bn\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\n\u0012Q\u0010\u0010\u001aM\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0004\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0002R\"\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000bRa\u0010\u0010\u001aM\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0004\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000f¨\u0006\u0013"}, d2 = {"com/huami/device/feature/notification/appnotify/ProduceAlertModeExt$a", "Lkotlin/Function3;", "", "Lcom/xiaomi/hm/health/bt/profile/alert/HMAlertModeExt;", "pkg", "title", "content", "a", "", "b", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "accept", "Lkotlin/ParameterName;", "name", "Lkotlin/jvm/functions/Function3;", "handler", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V", "notification_release"}, k = 1, mv = {1, 5, 1})
    public static final class a implements Function3<String, String, String, HMAlertModeExt> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Function1<String, Boolean> accept;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final Function3<String, String, String, HMAlertModeExt> handler;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Function1<? super String, Boolean> function1, @NotNull Function3<? super String, ? super String, ? super String, ? extends HMAlertModeExt> function3) {
            this.accept = function1;
            this.handler = function3;
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HMAlertModeExt invoke(@NotNull String pkg, @Nullable String title, @Nullable String content) {
            if (this.accept.invoke(pkg).booleanValue()) {
                return this.handler.invoke(pkg, title, content);
            }
            return null;
        }

        public final boolean b(@NotNull String pkg) {
            return this.accept.invoke(pkg).booleanValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<String, Boolean> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull String str) {
            return Boolean.TRUE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "pkg", "title", "content", "Lcom/xiaomi/hm/health/bt/profile/alert/HMAlertModeExt;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function3<String, String, String, HMAlertModeExt> {
        public c() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HMAlertModeExt invoke(@NotNull String str, @Nullable String str2, @Nullable String str3) {
            if (ProduceAlertModeExt.this.listener.isFromMiPush(ProduceAlertModeExt.this.context, str)) {
                String miPushTargetPkg = BrandCompat.INSTANCE.getMiPushTargetPkg(ProduceAlertModeExt.this.notification);
                if (!TextUtils.isEmpty(miPushTargetPkg)) {
                    str = miPushTargetPkg;
                }
            }
            return AlertEntityFactory.INSTANCE.getAlertEntity(str, AppUtil.INSTANCE.getAppName(ProduceAlertModeExt.this.context, str), str2, str3);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<String, Boolean> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull String str) {
            return Boolean.valueOf(Intrinsics.areEqual("com.tencent.mobileqq", str));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous parameter 0>", "title", "content", "Lcom/xiaomi/hm/health/bt/profile/alert/HMAlertModeExt;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function3<String, String, String, HMAlertModeExt> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "Ignore phone of QQ.";
            }
        }

        public e() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HMAlertModeExt invoke(@NotNull String str, @Nullable String str2, @Nullable String str3) {
            String string = ProduceAlertModeExt.this.context.getString(R.string.voice_call_qq);
            String string2 = ProduceAlertModeExt.this.context.getString(R.string.video_call_qq);
            if (!Intrinsics.areEqual(string, str3) && !Intrinsics.areEqual(string2, str3)) {
                return new HMAlertModeExt(HMAlertApp.QQ, str2, str3);
            }
            HMLog.info(ProduceAlertModeExt.this.logTag, a.a);
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<String, Boolean> {
        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull String str) {
            return Boolean.valueOf(AppsHelper.INSTANCE.isSmsApp(ProduceAlertModeExt.this.context, str));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous parameter 0>", "title", "content", "Lcom/xiaomi/hm/health/bt/profile/alert/HMAlertModeExt;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function3<String, String, String, HMAlertModeExt> {
        public g() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HMAlertModeExt invoke(@NotNull String str, @Nullable String str2, @Nullable String str3) {
            HMAlertModeExt hMAlertModeExt = new HMAlertModeExt(HMAlertMode.ALERT_SMS, str2, str3);
            ProduceAlertModeExt produceAlertModeExt = ProduceAlertModeExt.this;
            hMAlertModeExt.setAppName(AppUtil.INSTANCE.getAppName(produceAlertModeExt.context, produceAlertModeExt.pkg));
            return hMAlertModeExt;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function1<String, Boolean> {
        public static final h a = new h();

        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull String str) {
            return Boolean.valueOf(Intrinsics.areEqual("com.tencent.mm", str));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous parameter 0>", "title", "content", "Lcom/xiaomi/hm/health/bt/profile/alert/HMAlertModeExt;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function3<String, String, String, HMAlertModeExt> {
        public i() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HMAlertModeExt invoke(@NotNull String str, @Nullable String str2, @Nullable String str3) {
            if (str3 != null && true == StringsKt__StringsKt.contains$default((CharSequence) str3, (CharSequence) ProduceAlertModeExt.this.context.getString(R.string.hongbao_wechat), false, 2, (Object) null)) {
                return new HMAlertModeExt(HMAlertApp.HONGBAO, str3, str3);
            }
            HMAlertModeExt hMAlertModeExt = new HMAlertModeExt(HMAlertApp.WECHAT, str2, str3);
            ProduceAlertModeExt produceAlertModeExt = ProduceAlertModeExt.this;
            hMAlertModeExt.setAppName(AppUtil.INSTANCE.getAppName(produceAlertModeExt.context, produceAlertModeExt.pkg));
            return hMAlertModeExt;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function1<String, Boolean> {
        public final /* synthetic */ a a;
        public final /* synthetic */ a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(a aVar, a aVar2) {
            super(1);
            this.a = aVar;
            this.b = aVar2;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull String str) {
            return Boolean.valueOf(this.a.b(str) || this.b.b(str));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "pkg", "title", "content", "Lcom/xiaomi/hm/health/bt/profile/alert/HMAlertModeExt;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function3<String, String, String, HMAlertModeExt> {
        public final /* synthetic */ a a;
        public final /* synthetic */ a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(a aVar, a aVar2) {
            super(3);
            this.a = aVar;
            this.b = aVar2;
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HMAlertModeExt invoke(@NotNull String str, @Nullable String str2, @Nullable String str3) {
            return this.a.b(str) ? this.a.invoke(str, str2, str3) : this.b.invoke(str, str2, str3);
        }
    }

    public ProduceAlertModeExt(@NotNull Context context, @NotNull String str, @NotNull Notification notification, @NotNull INotificationModule iNotificationModule) {
        this.context = context;
        this.pkg = str;
        this.notification = notification;
        this.listener = iNotificationModule;
        NotificationFilter notificationFilter = NotificationFilter.INSTANCE;
        this.title = notificationFilter.getNotificationTitle(notification);
        this.content = notificationFilter.getNotificationContent(notification);
        this.handleSms = new a(new f(), new g());
        this.handleWeChat = new a(h.a, new i());
        this.handleQQ = new a(d.a, new e());
        this.default = new a(b.a, new c());
    }

    private final a a(a aVar, a aVar2) {
        return new a(new j(aVar, aVar2), new k(aVar, aVar2));
    }

    @Nullable
    public final HMAlertModeExt produce() {
        return a(a(this.handleSms, this.handleWeChat), this.default).invoke(this.pkg, this.title, this.content);
    }
}
