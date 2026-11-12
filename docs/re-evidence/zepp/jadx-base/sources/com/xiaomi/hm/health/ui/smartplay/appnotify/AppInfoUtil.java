package com.xiaomi.hm.health.ui.smartplay.appnotify;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.provider.Telephony;
import android.text.TextUtils;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.device.feature.notification.appnotify.NotificationManager;
import com.huami.device.feature.notification.data.AppChosen;
import com.huami.device.feature.notification.utils.PkgNameConstants;
import com.huami.devicex.injection.basic.MiuiFnApi;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b.\u0010/J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0002J\u001e\u0010\u000f\u001a\u00020\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\u0007H\u0002J\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0002J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0011J0\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\u001a\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u000b0\u0019J\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\tR\u0016\u0010\u001f\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u001eR\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010!R&\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\u00110#j\b\u0012\u0004\u0012\u00020\u0011`$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010%R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010)R\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00070+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010,¨\u00060"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/appnotify/AppInfoUtil;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "deviceType", "", "Lcom/xiaomi/hm/health/ui/smartplay/appnotify/AppInfo;", "f", "", "appInfo", "", "a", "info", "", GoogleApiAvailabilityLight.a, "g", "", "packageName", "e", "c", "Landroid/content/pm/ResolveInfo;", "b", "pkg", "supportPersonalise", "Lkotlin/Function1;", "result", "loadAppInfoList", "list", "getSortedAppInfoList", "Ljava/lang/String;", "TAG", "", "[Ljava/lang/String;", "UN_SUPPORT_APP_LIST", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "SUPPORT_PERSONALISE_LIST", "Lkotlin/Lazy;", "Lcom/huami/devicex/injection/basic/MiuiFnApi;", "Lkotlin/Lazy;", "miuiFnApiLazy", "Ljava/util/Comparator;", "Ljava/util/Comparator;", "TOP_COMPARATOR", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class AppInfoUtil {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "AppInfoUtil";

    @NotNull
    public static final AppInfoUtil INSTANCE = new AppInfoUtil();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String[] UN_SUPPORT_APP_LIST = {PkgNameConstants.CONTACTS_HUAWEI_OPPO, PkgNameConstants.MMS};

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final ArrayList<String> SUPPORT_PERSONALISE_LIST = CollectionsKt__CollectionsKt.arrayListOf("com.tencent.mobileqq", "com.tencent.mm", PkgNameConstants.FEI_SHU, PkgNameConstants.TENCENT_WE_WORK, PkgNameConstants.MESSAGES_GOOGLE, PkgNameConstants.WHATSAPP, PkgNameConstants.TELEGRAM, PkgNameConstants.SKYPE, PkgNameConstants.SNAPCHAT);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final Lazy<MiuiFnApi> miuiFnApiLazy = KoinJavaComponent.inject$default(MiuiFnApi.class, null, null, 6, null);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final Comparator<AppInfo> TOP_COMPARATOR = new Comparator<AppInfo>() { // from class: com.xiaomi.hm.health.ui.smartplay.appnotify.AppInfoUtil$TOP_COMPARATOR$1
        private final int a(String name1, String name2) {
            return CharacterParser.getInstance().getSellingIgnoreCase(name1).compareTo(CharacterParser.getInstance().getSellingIgnoreCase(name2));
        }

        @Override // java.util.Comparator
        public int compare(@NotNull AppInfo object1, @NotNull AppInfo object2) {
            boolean z = object1.isChecked;
            if (z && object2.isChecked) {
                return a(object1.name, object2.name);
            }
            if (z || object2.isChecked) {
                return z ? -1 : 1;
            }
            return 0;
        }
    };

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.appnotify.AppInfoUtil$loadAppInfoList$1", f = "AppInfoUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Function1<List<? extends AppInfo>, Unit> b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ HMDeviceType d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super List<? extends AppInfo>, Unit> function1, Context context, HMDeviceType hMDeviceType, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = function1;
            this.c = context;
            this.d = hMDeviceType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, this.c, this.d, continuation);
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
            this.b.invoke(AppInfoUtil.INSTANCE.f(this.c, this.d));
            return Unit.INSTANCE;
        }
    }

    private AppInfoUtil() {
    }

    private final void a(Context context, List<AppInfo> appInfo) {
        for (AppInfo appInfo2 : c(context)) {
            boolean zD = d(appInfo, appInfo2);
            HMLog.d(TAG, "contains " + appInfo2.packageName + ": " + zD, new Object[0]);
            if (!zD) {
                appInfo.add(appInfo2);
            }
        }
    }

    private final List<ResolveInfo> b(Context context) {
        Intent intent = new Intent();
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setAction("android.intent.action.MAIN");
        return context.getPackageManager().queryIntentActivities(intent, 0);
    }

    private final List<AppInfo> c(Context context) {
        ArrayList arrayList = new ArrayList();
        ArrayList<AppChosen> allApps = NotificationManager.getInstance().getAppsRepo().getAllApps();
        if (allApps == null) {
            return arrayList;
        }
        for (AppChosen appChosen : allApps) {
            String pkg = appChosen.getPkg();
            boolean on = appChosen.getOn();
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(pkg, 0);
                if (!Intrinsics.areEqual(miuiFnApiLazy.getValue().getXiaomiServiceFrameworkPackageName(), pkg)) {
                    AppInfo appInfo = new AppInfo();
                    appInfo.packageName = applicationInfo.packageName;
                    appInfo.name = applicationInfo.loadLabel(context.getPackageManager()).toString();
                    appInfo.icon = applicationInfo.loadIcon(context.getPackageManager());
                    appInfo.isChecked = on;
                    arrayList.add(appInfo);
                }
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
        }
        Collections.sort(arrayList, new AppComparator());
        return arrayList;
    }

    private final boolean d(List<? extends AppInfo> appInfo, AppInfo info) {
        for (AppInfo appInfo2 : appInfo) {
            if (!TextUtils.isEmpty(info.packageName) && TextUtils.equals(appInfo2.packageName, info.packageName)) {
                return true;
            }
        }
        return false;
    }

    private final boolean e(Context context, String packageName) {
        if (TextUtils.equals(Telephony.Sms.getDefaultSmsPackage(context), packageName)) {
            return true;
        }
        String[] strArr = UN_SUPPORT_APP_LIST;
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            i++;
            if (TextUtils.equals(str, packageName)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<AppInfo> f(Context context, HMDeviceType deviceType) {
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : b(context)) {
            AppInfo appInfo = new AppInfo();
            appInfo.packageName = resolveInfo.activityInfo.packageName;
            appInfo.name = resolveInfo.loadLabel(context.getPackageManager()).toString();
            appInfo.icon = resolveInfo.loadIcon(context.getPackageManager());
            if (NotificationManager.getInstance().getAppsRepo().hasApp(deviceType, appInfo.packageName)) {
                appInfo.isChecked = true;
            }
            if (!e(context, appInfo.packageName)) {
                arrayList.add(appInfo);
            }
        }
        a(context, arrayList);
        Collections.sort(arrayList, TOP_COMPARATOR);
        return g(arrayList);
    }

    private final List<AppInfo> g(List<AppInfo> appInfo) {
        ArrayList arrayList = new ArrayList();
        for (AppInfo appInfo2 : appInfo) {
            if (appInfo2.isChecked) {
                arrayList.add(appInfo2);
            }
        }
        appInfo.removeAll(arrayList);
        appInfo.addAll(0, arrayList);
        return appInfo;
    }

    @NotNull
    public final List<AppInfo> getSortedAppInfoList(@NotNull List<AppInfo> list) {
        Collections.sort(list, new AppComparator());
        return g(list);
    }

    public final void loadAppInfoList(@NotNull Context context, @NotNull HMDeviceType deviceType, @NotNull Function1<? super List<? extends AppInfo>, Unit> result) {
        e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new a(result, context, deviceType, null), 3, null);
    }

    public final boolean supportPersonalise(@NotNull String pkg) {
        return ConfigHelperKt.hasMiliFeature(Feature.GT4_SOURCE) && SUPPORT_PERSONALISE_LIST.contains(pkg);
    }
}
