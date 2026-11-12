package com.huami.phone_call.sms;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.telephony.SmsManager;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.phone_call.sms.SmsService;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 ,2\u00020\u0001:\u0003-,\u001bB\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b*\u0010+J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002J \u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002J\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0010\u001a\u00020\u000eJ.\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011J\u0018\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016R\u001e\u0010\u0016\u001a\n \u001a*\u0004\u0018\u00010\u00150\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010#R\u001e\u0010'\u001a\n \u001a*\u0004\u0018\u00010%0%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u0016\u0010)\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010(¨\u0006."}, d2 = {"Lcom/huami/phone_call/sms/SmsService;", "Landroid/content/BroadcastReceiver;", "Landroid/telephony/SmsManager;", "f", "", "e", "id", "", "phoneNo", "text", "Landroid/app/PendingIntent;", GoogleApiAvailabilityLight.a, "c", "h", "", "register", MiPushClient.COMMAND_UNREGISTER, "Lcom/huami/phone_call/sms/SmsService$Callback;", "sentCallback", "deliveryCallback", "sendTextMessage", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/content/Intent;", "intent", "onReceive", "kotlin.jvm.PlatformType", "a", "Landroid/content/Context;", "", "Lcom/huami/phone_call/sms/SmsService$a;", "b", "Ljava/util/Map;", "resultCallBack", "", "Z", "isRegistered", "Ljava/util/concurrent/ExecutorService;", "Ljava/util/concurrent/ExecutorService;", "executor", LogUtil.I, "index", "<init>", "(Landroid/content/Context;)V", "Companion", "Callback", "phone_call_sms_release"}, k = 1, mv = {1, 5, 1})
public final class SmsService extends BroadcastReceiver {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String f = "SmsService";

    @NotNull
    private static final String g = "SMS_SENT_ACTION";

    @NotNull
    private static final String h = "SMS_DELIVERY_ACTION";

    @NotNull
    private static final String i = "EXTRA_ID";
    private static SmsService j;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean isRegistered;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int index;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Map<Integer, ResultCallBack> resultCallBack = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final ExecutorService executor = Executors.newSingleThreadExecutor();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u001b\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/huami/phone_call/sms/SmsService$Callback;", "", "", "onSuccess", "", "error", "onFailed", "(Ljava/lang/Integer;)V", "phone_call_sms_release"}, k = 1, mv = {1, 5, 1})
    public interface Callback {

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public static final class DefaultImpls {
            public static /* synthetic */ void onFailed$default(Callback callback, Integer num, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onFailed");
                }
                if ((i & 1) != 0) {
                    num = null;
                }
                callback.onFailed(num);
            }
        }

        void onFailed(@Nullable Integer error);

        void onSuccess();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\u000b\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0016\u0010\f\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/huami/phone_call/sms/SmsService$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/phone_call/sms/SmsService;", PointCategory.INIT, "get", "", SmsService.i, "Ljava/lang/String;", SmsService.h, SmsService.g, "TAG", "service", "Lcom/huami/phone_call/sms/SmsService;", "<init>", "()V", "phone_call_sms_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final SmsService get() {
            SmsService smsService = SmsService.j;
            if (smsService == null) {
                return null;
            }
            return smsService;
        }

        @JvmStatic
        @NotNull
        public final SmsService init(@NotNull Context context) {
            SmsService.j = new SmsService(context);
            SmsService smsService = SmsService.j;
            if (smsService == null) {
                smsService = null;
            }
            smsService.register();
            SmsService smsService2 = SmsService.j;
            if (smsService2 == null) {
                return null;
            }
            return smsService2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Create delivery intent: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Create sent intent: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i, String str, int i2) {
            super(0);
            this.a = i;
            this.b = str;
            this.c = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onReceive: " + this.a + ") " + this.b + ": " + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Sms broadcast receiver registered!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Empty body!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "No sms manager!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ List<String> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(List<String> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Delivering sms(" + this.a.size() + ") ...";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Send text message failed!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Sms broadcast receiver unregistered!";
        }
    }

    public SmsService(@NotNull Context context) {
        this.context = context.getApplicationContext();
    }

    private final PendingIntent c(int id, String phoneNo, String text) {
        HMLog.info(f, new b(id));
        Intent intent = new Intent(h);
        intent.putExtra(i, id);
        return PendingIntent.getBroadcast(this.context, id, intent, h());
    }

    private final PendingIntent d(int id, String phoneNo, String text) {
        HMLog.verbose(f, new c(id));
        Intent intent = new Intent(g);
        intent.putExtra(i, id);
        return PendingIntent.getBroadcast(this.context, id, intent, h());
    }

    private final int e() {
        int i2 = this.index;
        if (i2 == Integer.MAX_VALUE || i2 <= 0) {
            this.index = 1;
        } else {
            this.index = i2 + 1;
        }
        return this.index;
    }

    private final SmsManager f() {
        if (Build.VERSION.SDK_INT < 22) {
            return SmsManager.getDefault();
        }
        int defaultSmsSubscriptionId = SmsManager.getDefaultSmsSubscriptionId();
        if (defaultSmsSubscriptionId == -1) {
            return null;
        }
        return SmsManager.getSmsManagerForSubscriptionId(defaultSmsSubscriptionId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(String str, int i2, SmsService smsService, int i3) {
        ResultCallBack resultCallBack;
        if (Intrinsics.areEqual(str, g) && i2 == -1) {
            ResultCallBack resultCallBack2 = smsService.resultCallBack.get(Integer.valueOf(i3));
            if (resultCallBack2 == null) {
                return;
            }
            smsService.resultCallBack.remove(Integer.valueOf(i3));
            Callback callbackF = resultCallBack2.f();
            if (callbackF == null) {
                return;
            }
            callbackF.onSuccess();
            return;
        }
        if (Intrinsics.areEqual(str, g)) {
            ResultCallBack resultCallBack3 = smsService.resultCallBack.get(Integer.valueOf(i3));
            if (resultCallBack3 == null) {
                return;
            }
            smsService.resultCallBack.remove(Integer.valueOf(i3));
            Callback callbackF2 = resultCallBack3.f();
            if (callbackF2 == null) {
                return;
            }
            callbackF2.onFailed(Integer.valueOf(i2));
            return;
        }
        if (Intrinsics.areEqual(str, h) && i2 == -1) {
            ResultCallBack resultCallBack4 = smsService.resultCallBack.get(Integer.valueOf(i3));
            if (resultCallBack4 == null) {
                return;
            }
            smsService.resultCallBack.remove(Integer.valueOf(i3));
            Callback callbackE = resultCallBack4.e();
            if (callbackE == null) {
                return;
            }
            callbackE.onSuccess();
            return;
        }
        if (!Intrinsics.areEqual(str, h) || (resultCallBack = smsService.resultCallBack.get(Integer.valueOf(i3))) == null) {
            return;
        }
        smsService.resultCallBack.remove(Integer.valueOf(i3));
        Callback callbackE2 = resultCallBack.e();
        if (callbackE2 == null) {
            return;
        }
        callbackE2.onFailed(Integer.valueOf(i2));
    }

    @JvmStatic
    @NotNull
    public static final SmsService get() {
        return INSTANCE.get();
    }

    private final int h() {
        if (Build.VERSION.SDK_INT >= 23) {
            return 201326592;
        }
        return AMapEngineUtils.HALF_MAX_P20_WIDTH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(SmsManager smsManager, String str, SmsService smsService, String str2, Callback callback, Callback callback2) {
        int i2;
        try {
            ArrayList<String> arrayListDivideMessage = smsManager.divideMessage(str);
            List<String> arrayList = new ArrayList();
            Iterator<T> it2 = arrayListDivideMessage.iterator();
            while (true) {
                i2 = 0;
                if (!it2.hasNext()) {
                    break;
                }
                String string = StringsKt__StringsKt.trim((String) it2.next()).toString();
                if ((string.length() > 0 ? 1 : 0) == 0) {
                    string = null;
                }
                if (string != null) {
                    arrayList.add(string);
                }
            }
            if (!(!arrayList.isEmpty())) {
                String str3 = (String) CollectionsKt.firstOrNull((List) arrayListDivideMessage);
                if (str3 == null) {
                    str3 = " ";
                }
                arrayList = kotlin.collections.e.listOf(str3);
            }
            ArrayList<PendingIntent> arrayList2 = new ArrayList<>();
            ArrayList<PendingIntent> arrayList3 = new ArrayList<>();
            for (String str4 : arrayList) {
                int iE = smsService.e();
                arrayList2.add(smsService.d(iE, str2, str4));
                arrayList3.add(smsService.c(iE, str2, str4));
                i2 = iE;
            }
            smsService.resultCallBack.put(Integer.valueOf(i2), new ResultCallBack(callback, callback2));
            HMLog.info(f, new h(arrayList));
            smsManager.sendMultipartTextMessage(str2, null, new ArrayList<>(arrayList), arrayList2, arrayList3);
        } catch (Exception e2) {
            HMLog.error(f, "", e2, i.a);
            if (callback == null) {
                return;
            }
            Callback.DefaultImpls.onFailed$default(callback, null, 1, null);
        }
    }

    @JvmStatic
    @NotNull
    public static final SmsService init(@NotNull Context context) {
        return INSTANCE.init(context);
    }

    public static /* synthetic */ void sendTextMessage$default(SmsService smsService, String str, String str2, Callback callback, Callback callback2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            callback = null;
        }
        if ((i2 & 8) != 0) {
            callback2 = null;
        }
        smsService.sendTextMessage(str, str2, callback, callback2);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        final String action = intent.getAction();
        final int resultCode = getResultCode();
        final int intExtra = intent.getIntExtra(i, -1);
        HMLog.info(f, new d(intExtra, action, resultCode));
        this.executor.execute(new Runnable() { // from class: t47
            @Override // java.lang.Runnable
            public final void run() {
                SmsService.g(action, resultCode, this, intExtra);
            }
        });
    }

    public final void register() {
        if (this.isRegistered) {
            return;
        }
        Context context = this.context;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(g);
        intentFilter.addAction(h);
        Unit unit = Unit.INSTANCE;
        context.registerReceiver(this, intentFilter);
        HMLog.info(f, e.a);
    }

    public final void sendTextMessage(@NotNull final String phoneNo, @NotNull final String text, @Nullable final Callback sentCallback, @Nullable final Callback deliveryCallback) {
        if (text.length() == 0) {
            HMLog.warn$default(f, null, f.a, 2, null);
            if (sentCallback == null) {
                return;
            }
            Callback.DefaultImpls.onFailed$default(sentCallback, null, 1, null);
            return;
        }
        final SmsManager smsManagerF = f();
        if (smsManagerF != null) {
            this.executor.execute(new Runnable() { // from class: s47
                @Override // java.lang.Runnable
                public final void run() {
                    SmsService.i(smsManagerF, text, this, phoneNo, sentCallback, deliveryCallback);
                }
            });
            return;
        }
        HMLog.warn$default(f, null, g.a, 2, null);
        if (sentCallback == null) {
            return;
        }
        Callback.DefaultImpls.onFailed$default(sentCallback, null, 1, null);
    }

    public final void unregister() {
        if (this.isRegistered) {
            this.context.unregisterReceiver(this);
            HMLog.info(f, j.a);
        }
    }

    /* JADX INFO: renamed from: com.huami.phone_call.sms.SmsService$a, reason: from toString */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J!\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0016"}, d2 = {"com/huami/phone_call/sms/SmsService$a", "", "Lcom/huami/phone_call/sms/SmsService$Callback;", "a", "b", "sentCallback", "deliveryCallback", "Lcom/huami/phone_call/sms/SmsService$a;", "c", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/huami/phone_call/sms/SmsService$Callback;", "f", "()Lcom/huami/phone_call/sms/SmsService$Callback;", "e", "<init>", "(Lcom/huami/phone_call/sms/SmsService$Callback;Lcom/huami/phone_call/sms/SmsService$Callback;)V", "phone_call_sms_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class ResultCallBack {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @Nullable
        private final Callback sentCallback;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        private final Callback deliveryCallback;

        /* JADX WARN: Multi-variable type inference failed */
        public ResultCallBack() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public ResultCallBack(@Nullable Callback callback, @Nullable Callback callback2) {
            this.sentCallback = callback;
            this.deliveryCallback = callback2;
        }

        public static /* synthetic */ ResultCallBack d(ResultCallBack resultCallBack, Callback callback, Callback callback2, int i, Object obj) {
            if ((i & 1) != 0) {
                callback = resultCallBack.sentCallback;
            }
            if ((i & 2) != 0) {
                callback2 = resultCallBack.deliveryCallback;
            }
            return resultCallBack.c(callback, callback2);
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Callback getSentCallback() {
            return this.sentCallback;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Callback getDeliveryCallback() {
            return this.deliveryCallback;
        }

        @NotNull
        public final ResultCallBack c(@Nullable Callback sentCallback, @Nullable Callback deliveryCallback) {
            return new ResultCallBack(sentCallback, deliveryCallback);
        }

        @Nullable
        public final Callback e() {
            return this.deliveryCallback;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ResultCallBack)) {
                return false;
            }
            ResultCallBack resultCallBack = (ResultCallBack) other;
            return Intrinsics.areEqual(this.sentCallback, resultCallBack.sentCallback) && Intrinsics.areEqual(this.deliveryCallback, resultCallBack.deliveryCallback);
        }

        @Nullable
        public final Callback f() {
            return this.sentCallback;
        }

        public int hashCode() {
            Callback callback = this.sentCallback;
            int iHashCode = (callback == null ? 0 : callback.hashCode()) * 31;
            Callback callback2 = this.deliveryCallback;
            return iHashCode + (callback2 != null ? callback2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ResultCallBack(sentCallback=" + this.sentCallback + ", deliveryCallback=" + this.deliveryCallback + ")";
        }

        public /* synthetic */ ResultCallBack(Callback callback, Callback callback2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : callback, (i & 2) != 0 ? null : callback2);
        }
    }
}
