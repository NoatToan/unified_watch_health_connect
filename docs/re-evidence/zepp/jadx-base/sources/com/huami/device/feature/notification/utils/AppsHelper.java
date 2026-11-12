package com.huami.device.feature.notification.utils;

import android.content.Context;
import android.os.Build;
import android.provider.Telephony;
import android.service.notification.StatusBarNotification;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b,\u0010-J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004J\u0016\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004J\u0010\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0017\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004R&\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0018j\b\u0012\u0004\u0012\u00020\u0004`\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR&\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0018j\b\u0012\u0004\u0012\u00020\u0004`\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR&\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0018j\b\u0012\u0004\u0012\u00020\u0004`\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR&\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0018j\b\u0012\u0004\u0012\u00020\u0004`\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR&\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0018j\b\u0012\u0004\u0012\u00020\u0004`\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001aR&\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0018j\b\u0012\u0004\u0012\u00020\u0004`\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001aR&\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0018j\b\u0012\u0004\u0012\u00020\u0004`\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001aR&\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0018j\b\u0012\u0004\u0012\u00020\u0004`\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001aR&\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0018j\b\u0012\u0004\u0012\u00020\u0004`\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u001a¨\u0006."}, d2 = {"Lcom/huami/device/feature/notification/utils/AppsHelper;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "packageName", "", "a", "pkg", "isSecondStandardEmail", "isStandardEmail", "isAppsNotificationNormal", "isNotSmsApp", "isSmsApp", "", "checkSmsDefaultApp", "allowOngoingTrueNotification", "Landroid/service/notification/StatusBarNotification;", "sbn", "isCall", "isDirtyData", "channelId", "isInvisibleChannel", "canSupportResidentNotification", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "packagesMissedCall", "b", "packagesNotificationChannelMayNull", "c", "onGoingAllowedList", GoogleApiAvailabilityLight.a, "smsPackages", "e", "groupSummaryContainer", "f", "standardEmailNotificationContainer", "g", "secondStandardEmailNotificationContainer", "h", "invisibleChannelList", "i", "supportResidentNotifications", "<init>", "()V", "notification_release"}, k = 1, mv = {1, 5, 1})
public final class AppsHelper {

    @NotNull
    public static final AppsHelper INSTANCE = new AppsHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final ArrayList<String> packagesMissedCall;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final ArrayList<String> packagesNotificationChannelMayNull;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final ArrayList<String> onGoingAllowedList;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final ArrayList<String> smsPackages;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final ArrayList<String> groupSummaryContainer;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final ArrayList<String> standardEmailNotificationContainer;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private static final ArrayList<String> secondStandardEmailNotificationContainer;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private static final ArrayList<String> invisibleChannelList;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private static final ArrayList<String> supportResidentNotifications;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.notification.utils.AppsHelper$checkSmsDefaultApp$1", f = "AppsHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Context b;

        /* JADX INFO: renamed from: com.huami.device.feature.notification.utils.AppsHelper$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0370a extends Lambda implements Function0<String> {
            public final /* synthetic */ String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0370a(String str) {
                super(0);
                this.a = str;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return Intrinsics.stringPlus("sms pkg name: ", this.a);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ RuntimeException a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(RuntimeException runtimeException) {
                super(0);
                this.a = runtimeException;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return Intrinsics.stringPlus("isSmsApp exception: ", this.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(this.b);
                if (!AppsHelper.smsPackages.contains(defaultSmsPackage)) {
                    HMLog.info$default(null, new C0370a(defaultSmsPackage), 1, null);
                    AppsHelper.smsPackages.add(defaultSmsPackage);
                    AppsHelper.groupSummaryContainer.add(defaultSmsPackage);
                }
            } catch (RuntimeException e) {
                HMLog.info(NotificationLog.defaultTag, new b(e));
            }
            return Unit.INSTANCE;
        }
    }

    static {
        ArrayList<String> arrayListArrayListOf = CollectionsKt__CollectionsKt.arrayListOf(PkgNameConstants.CONTACTS_HUAWEI_OPPO, PkgNameConstants.CONTACTS_MIUI, PkgNameConstants.CONTACTS_ONEPLUS, PkgNameConstants.CONTACTS_SAMSUNG, PkgNameConstants.CONTACTS_VIVO);
        packagesMissedCall = arrayListArrayListOf;
        packagesNotificationChannelMayNull = CollectionsKt__CollectionsKt.arrayListOf("com.tencent.tim", PkgNameConstants.EMAIL_NATIVE);
        onGoingAllowedList = CollectionsKt__CollectionsKt.arrayListOf("com.android.deskclock", PkgNameConstants.CALENDAR_365, PkgNameConstants.DIDA, "com.tencent.mobileqq", PkgNameConstants.FEI_SHU);
        ArrayList<String> arrayListArrayListOf2 = CollectionsKt__CollectionsKt.arrayListOf(PkgNameConstants.MMS, PkgNameConstants.MMS_SERVICE, PkgNameConstants.MMS_NUBIA, PkgNameConstants.MMS_ONE_PLUS);
        smsPackages = arrayListArrayListOf2;
        ArrayList<String> arrayListArrayListOf3 = CollectionsKt__CollectionsKt.arrayListOf(PkgNameConstants.TENCENT_WE_WORK, "com.xiaomi.hm.health", "com.huami.watch.hmwatchmanager", "com.tencent.mm", PkgNameConstants.FEI_SHU, PkgNameConstants.GAODE_MAP);
        arrayListArrayListOf3.addAll(arrayListArrayListOf);
        arrayListArrayListOf3.addAll(arrayListArrayListOf2);
        groupSummaryContainer = arrayListArrayListOf3;
        standardEmailNotificationContainer = CollectionsKt__CollectionsKt.arrayListOf(PkgNameConstants.EMAIL_GMAIL, PkgNameConstants.EMAIL_OUTLOOK);
        secondStandardEmailNotificationContainer = CollectionsKt__CollectionsKt.arrayListOf(PkgNameConstants.EMAIL_YAHOO);
        invisibleChannelList = CollectionsKt__CollectionsKt.arrayListOf("background", "MIN", "service", "min", "SERVICE", "BACKGROUND");
        supportResidentNotifications = CollectionsKt__CollectionsKt.arrayListOf(PkgNameConstants.QQ_MUSIC);
    }

    private AppsHelper() {
    }

    private final boolean a(Context context, String packageName) {
        return isSmsApp(context, packageName) | (Brands.INSTANCE.isHuawei() & Intrinsics.areEqual(PkgNameConstants.CONTACTS_HUAWEI_OPPO, packageName)) | packagesNotificationChannelMayNull.contains(packageName);
    }

    public final boolean allowOngoingTrueNotification(@NotNull String pkg) {
        return onGoingAllowedList.contains(pkg);
    }

    public final boolean canSupportResidentNotification(@NotNull String pkg) {
        return supportResidentNotifications.contains(pkg);
    }

    public final void checkSmsDefaultApp(@NotNull Context context) {
        e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new a(context, null), 3, null);
    }

    public final boolean isAppsNotificationNormal(@NotNull Context context, @NotNull String packageName) {
        return !a(context, packageName);
    }

    public final boolean isCall(@NotNull StatusBarNotification sbn) {
        if (Build.VERSION.SDK_INT >= 21) {
            return Intrinsics.areEqual(sbn.getNotification().category, NotificationCompat.CATEGORY_CALL);
        }
        return false;
    }

    public final boolean isDirtyData(@NotNull String pkg) {
        return Intrinsics.areEqual(pkg, PkgNameConstants.XMSF);
    }

    public final boolean isInvisibleChannel(@Nullable String channelId) {
        if (channelId == null) {
            return true;
        }
        Iterator<T> it2 = invisibleChannelList.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            if (StringsKt__StringsKt.contains$default((CharSequence) channelId, (CharSequence) it2.next(), false, 2, (Object) null)) {
                z = true;
            }
        }
        return z;
    }

    public final boolean isNotSmsApp(@NotNull Context context, @NotNull String packageName) {
        return !isSmsApp(context, packageName);
    }

    public final boolean isSecondStandardEmail(@NotNull String pkg) {
        return secondStandardEmailNotificationContainer.contains(pkg);
    }

    public final boolean isSmsApp(@NotNull Context context, @NotNull String packageName) {
        return smsPackages.contains(packageName);
    }

    public final boolean isStandardEmail(@NotNull String pkg) {
        return standardEmailNotificationContainer.contains(pkg);
    }
}
