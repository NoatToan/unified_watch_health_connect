package com.xiaomi.hm.health.utils;

import android.app.NotificationManager;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Build;
import android.os.Handler;
import android.provider.ContactsContract;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import androidx.core.content.PermissionChecker;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.assistant.model.bean.Update;
import com.huami.bluetooth.profile.channel.module.phonemute.PhoneMuteListener;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.sleep.sleephome.ui.SleepHomeActivity;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001&B\t\b\u0002¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004J\u0010\u0010\t\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u000f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013J\u0016\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0013R\u0016\u0010\u0019\u001a\u00020\u00138\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\"\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/xiaomi/hm/health/utils/TelephonyUtil;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "a", "", "b", "c", "mute", "", "extra", "Lcom/huami/bluetooth/profile/channel/module/phonemute/PhoneMuteListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "registerPhoneMuteListener", "unregisterPhoneMuteListener", "isCurrentMute", "()Ljava/lang/Boolean;", "isDisturbUnGranted", "", "phone", "getContactName", "tag", "preReadContacts", "Ljava/lang/String;", "TAG", "", "J", "mLastTimeChanged", "", LogUtil.I, "mGapOnChange", "Ljava/util/concurrent/ConcurrentHashMap;", GoogleApiAvailabilityLight.a, "Ljava/util/concurrent/ConcurrentHashMap;", "mContactsMap", "<init>", "()V", "ContactsObserver", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class TelephonyUtil {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "TelephonyUtil";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static long mLastTimeChanged = 0;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final int mGapOnChange = 3000;

    @NotNull
    public static final TelephonyUtil INSTANCE = new TelephonyUtil();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static ConcurrentHashMap<String, String> mContactsMap = new ConcurrentHashMap<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/utils/TelephonyUtil$ContactsObserver;", "Landroid/database/ContentObserver;", "", "selfChange", "", "onChange", "Landroid/os/Handler;", "handler", "<init>", "(Landroid/os/Handler;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class ContactsObserver extends ContentObserver {
        public ContactsObserver(@Nullable Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean selfChange) {
            super.onChange(selfChange);
            if (System.currentTimeMillis() - TelephonyUtil.mLastTimeChanged > 3000) {
                TelephonyUtil telephonyUtil = TelephonyUtil.INSTANCE;
                TelephonyUtil.mLastTimeChanged = System.currentTimeMillis();
                telephonyUtil.b(DeviceXFunctionsKt.getContext());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "map size " + TelephonyUtil.mContactsMap.size();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "no matched";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "has permission :" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "mute: " + this.a;
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
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "LfType.MUTE_PHONE";
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
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "device support mute phone";
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
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "not support mute phone, ignore it.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ byte[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(byte[] bArr) {
            super(0);
            this.a = bArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "error extra: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "invoked by " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.utils.TelephonyUtil$queryContactName$1", f = "TelephonyUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Context b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Context context, Continuation<? super j> continuation) {
            super(2, continuation);
            this.b = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new j(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TelephonyUtil.INSTANCE.c(this.b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public static final k a = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "queried contacts size: " + TelephonyUtil.mContactsMap.size();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "query contacts error " + this.a.getLocalizedMessage();
        }
    }

    private TelephonyUtil() {
    }

    private final boolean a(Context context) {
        boolean z = PermissionChecker.checkSelfPermission(context, "android.permission.READ_CONTACTS") == 0;
        HMLog.info(TAG, new c(z));
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Context context) {
        kotlinx.coroutines.e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new j(context, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(Context context) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"display_name", Update.COLUMN_DATA1}, null, null, null);
            if (cursorQuery != null) {
                mContactsMap.clear();
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    if (string2 != null && string != null) {
                        mContactsMap.put(string2, string);
                    }
                }
            }
            HMLog.info(TAG, k.a);
        } catch (Exception e2) {
            HMLog.info(TAG, new l(e2));
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    @NotNull
    public final String getContactName(@NotNull String phone) {
        HMLog.info(TAG, a.a);
        if (mContactsMap.size() == 0 && a(DeviceXFunctionsKt.getContext())) {
            c(DeviceXFunctionsKt.getContext());
        }
        String value = "";
        for (Map.Entry<String, String> entry : mContactsMap.entrySet()) {
            if (PhoneNumberUtils.compare(entry.getKey(), phone)) {
                value = entry.getValue();
            }
        }
        if (TextUtils.isEmpty(value)) {
            HMLog.info(TAG, b.a);
        }
        return value;
    }

    @Nullable
    public final Boolean isCurrentMute() {
        try {
            return Boolean.valueOf(AudioUtils.getInstance().isCurrentMute());
        } catch (Exception e2) {
            HMLog.i(TAG, e2.toString(), new Object[0]);
            return null;
        }
    }

    public final boolean isDisturbUnGranted() {
        Object systemService = DeviceXFunctionsKt.getContext().getSystemService(SleepHomeActivity.FROM_NOTIFICATION);
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        return Build.VERSION.SDK_INT >= 24 && !((NotificationManager) systemService).isNotificationPolicyAccessGranted();
    }

    public final void mute(boolean mute) {
        HMLog.info(TAG, new d(mute));
        try {
            if (isDisturbUnGranted()) {
                AudioUtils.getInstance().setPermissionMiss();
            } else if (mute) {
                AudioUtils.getInstance().muteMode(true, true);
            } else {
                AudioUtils.getInstance().normalMode(true);
            }
        } catch (Exception e2) {
            HMLog.i(TAG, e2.toString(), new Object[0]);
        }
    }

    public final void preReadContacts(@NotNull Context context, @NotNull String tag) {
        HMLog.info(TAG, new i(tag));
        if (a(context)) {
            context.getContentResolver().registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, new ContactsObserver(null));
            b(context);
        }
    }

    public final void registerPhoneMuteListener(@Nullable PhoneMuteListener listener) {
        AudioDeviceUtils.INSTANCE.getInstance().registerPhoneMuteListener(listener);
    }

    public final void unregisterPhoneMuteListener(@Nullable PhoneMuteListener listener) {
        if (listener == null) {
            HMLog.i(TAG, "unregisterPhoneMuteListener:listener is null", new Object[0]);
        } else {
            AudioDeviceUtils.INSTANCE.getInstance().unregisterPhoneMuteListener(listener);
        }
    }

    public final void mute(@Nullable byte[] extra) {
        HMLog.info(TAG, e.a);
        if (extra == null) {
            return;
        }
        if (!(extra.length == 1)) {
            extra = null;
        }
        if (extra == null) {
            return;
        }
        byte b2 = extra[0];
        if (b2 != 0) {
            if (b2 != 1) {
                HMLog.error$default(TAG, null, null, new h(extra), 6, null);
                return;
            } else {
                INSTANCE.mute(true);
                return;
            }
        }
        if (ConfigHelperKt.hasFeature(Feature.MUTE_PHONE_SOURCE_S)) {
            HMLog.info(TAG, f.a);
            INSTANCE.mute(false);
        } else {
            HMLog.info(TAG, g.a);
        }
    }
}
