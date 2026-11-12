package com.huami.device.feature.notification.data;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huami.device.feature.notification.appnotify.NotificationManager;
import com.huami.device.feature.notification.module.INotificationModule;
import com.huami.device.feature.notification.utils.NotificationLog;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b/\u00100J\u001a\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007J\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0004J\u000e\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0004J\u000e\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000eJ\u000e\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000eJ\u001a\u0010\u0017\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0004H\u0007J\u001a\u0010\u0018\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0004H\u0007J\u001a\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019j\n\u0012\u0004\u0012\u00020\u001a\u0018\u0001`\u001bJ\u0006\u0010\u001d\u001a\u00020\u000eJ\u0012\u0010\u001e\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007J\u000e\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000eR\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R.\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0016\u0010.\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u00061"}, d2 = {"Lcom/huami/device/feature/notification/data/AppsNotificationRepo;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "", "originData", "b", "Lcom/huami/device/feature/notification/data/AppsNotificationInfo;", "info", "", "c", "a", "asyncAppsInfo", "setCurrentDeviceType", "", "isNotificationOn", "isScreenSleepOn", "pkg", "addApp", "removeApp", "enable", "setNotificationOn", "setScreenSleepOn", "hasApp", "hasNotContains", "Ljava/util/ArrayList;", "Lcom/huami/device/feature/notification/data/AppChosen;", "Lkotlin/collections/ArrayList;", "getAllApps", "hasNotUsableDeviceType", "supportReply", "setSupportReply", "Ljava/lang/String;", "logTag", "Lcom/google/gson/Gson;", "Lcom/google/gson/Gson;", "mGson", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "getMAppsInfoMap", "()Ljava/util/concurrent/ConcurrentHashMap;", "setMAppsInfoMap", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "mAppsInfoMap", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "mCurrentType", "<init>", "()V", "notification_release"}, k = 1, mv = {1, 5, 1})
public final class AppsNotificationRepo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String logTag = NotificationLog.defaultTag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Gson mGson = new Gson();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private ConcurrentHashMap<HMDeviceType, AppsNotificationInfo> mAppsInfoMap = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private HMDeviceType mCurrentType = HMDeviceType.VDevice;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.notification.data.AppsNotificationRepo$asyncAppsInfo$1", f = "AppsNotificationRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: com.huami.device.feature.notification.data.AppsNotificationRepo$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0369a extends Lambda implements Function0<String> {
            public static final C0369a a = new C0369a();

            public C0369a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "apps info is null";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ Map.Entry<HMDeviceType, String> a;
            public final /* synthetic */ JsonSyntaxException b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(Map.Entry<? extends HMDeviceType, String> entry, JsonSyntaxException jsonSyntaxException) {
                super(0);
                this.a = entry;
                this.b = jsonSyntaxException;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "The stored json of type " + this.a.getKey() + " is invalid: " + this.b;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AppsNotificationRepo.this.new a(continuation);
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
            INotificationModule listener = NotificationManager.getInstance().getListener();
            HashMap<HMDeviceType, String> settingsOfActive = listener == null ? null : listener.getSettingsOfActive();
            if (settingsOfActive != null) {
                AppsNotificationRepo appsNotificationRepo = AppsNotificationRepo.this;
                for (Map.Entry<HMDeviceType, String> entry : settingsOfActive.entrySet()) {
                    try {
                        AppsNotificationInfo appsNotificationInfo = (AppsNotificationInfo) appsNotificationRepo.mGson.fromJson(appsNotificationRepo.b(entry.getKey(), entry.getValue()), AppsNotificationInfo.class);
                        if (appsNotificationInfo == null) {
                            appsNotificationInfo = null;
                        } else {
                            appsNotificationRepo.getMAppsInfoMap().put(entry.getKey(), appsNotificationInfo);
                        }
                        if (appsNotificationInfo == null) {
                            HMLog.error$default(appsNotificationRepo.logTag, null, null, C0369a.a, 6, null);
                        }
                    } catch (JsonSyntaxException e) {
                        HMLog.error$default(appsNotificationRepo.logTag, null, null, new b(entry, e), 6, null);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceType a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HMDeviceType hMDeviceType, String str, String str2) {
            super(0);
            this.a = hMDeviceType;
            this.b = str;
            this.c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "type: " + this.a + "\n origin stored json: " + ((Object) this.b) + " \n handled stored json: " + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "The latest apps info of type " + AppsNotificationRepo.this.mCurrentType + " is : " + ((Object) this.b);
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
            return "saveApps, listener is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceType a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(HMDeviceType hMDeviceType) {
            super(0);
            this.a = hMDeviceType;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("The current type to operate is ", this.a);
        }
    }

    private final void a(HMDeviceType type) {
        if (type == HMDeviceType.VDevice) {
            throw new IllegalArgumentException("The type must not be VDevice. You should invoke method setCurrentType first.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String b(HMDeviceType type, String originData) {
        String string = originData == null || originData.length() == 0 ? new AppsNotificationInfo(false, false, false, null, false, 31, null).toString() : m.replace$default(m.replace$default(originData, "+", "", false, 4, (Object) null), "\"Apps\":\"\"", "\"Apps\":[]", false, 4, (Object) null);
        HMLog.info(this.logTag, new b(type, originData, string));
        return string;
    }

    private final void c(AppsNotificationInfo info) {
        Unit unit;
        String json = this.mGson.toJson(info);
        HMLog.info(this.logTag, new c(json));
        INotificationModule listener = NotificationManager.getInstance().getListener();
        if (listener == null) {
            unit = null;
        } else {
            listener.saveSettings(this.mCurrentType, json);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            HMLog.info(this.logTag, d.a);
        }
    }

    public static /* synthetic */ boolean hasApp$default(AppsNotificationRepo appsNotificationRepo, HMDeviceType hMDeviceType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            hMDeviceType = appsNotificationRepo.mCurrentType;
        }
        return appsNotificationRepo.hasApp(hMDeviceType, str);
    }

    public static /* synthetic */ boolean hasNotContains$default(AppsNotificationRepo appsNotificationRepo, HMDeviceType hMDeviceType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            hMDeviceType = appsNotificationRepo.mCurrentType;
        }
        return appsNotificationRepo.hasNotContains(hMDeviceType, str);
    }

    public static /* synthetic */ boolean isNotificationOn$default(AppsNotificationRepo appsNotificationRepo, HMDeviceType hMDeviceType, int i, Object obj) {
        if ((i & 1) != 0) {
            hMDeviceType = appsNotificationRepo.mCurrentType;
        }
        return appsNotificationRepo.isNotificationOn(hMDeviceType);
    }

    public static /* synthetic */ boolean isScreenSleepOn$default(AppsNotificationRepo appsNotificationRepo, HMDeviceType hMDeviceType, int i, Object obj) {
        if ((i & 1) != 0) {
            hMDeviceType = appsNotificationRepo.mCurrentType;
        }
        return appsNotificationRepo.isScreenSleepOn(hMDeviceType);
    }

    public static /* synthetic */ boolean supportReply$default(AppsNotificationRepo appsNotificationRepo, HMDeviceType hMDeviceType, int i, Object obj) {
        if ((i & 1) != 0) {
            hMDeviceType = appsNotificationRepo.mCurrentType;
        }
        return appsNotificationRepo.supportReply(hMDeviceType);
    }

    public final void addApp(@NotNull String pkg) {
        AppsNotificationInfo appsNotificationInfo = this.mAppsInfoMap.get(this.mCurrentType);
        if (appsNotificationInfo == null) {
            return;
        }
        ArrayList<AppChosen> appsChosen = appsNotificationInfo.getAppsChosen();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(appsChosen, 10));
        Iterator<T> it2 = appsChosen.iterator();
        while (it2.hasNext()) {
            arrayList.add(((AppChosen) it2.next()).getPkg());
        }
        if (CollectionsKt___CollectionsKt.toList(arrayList).contains(pkg)) {
            return;
        }
        appsNotificationInfo.getAppsChosen().add(new AppChosen(pkg, false, 2, null));
        c(appsNotificationInfo);
    }

    public final void asyncAppsInfo(@NotNull HMDeviceType type) {
        this.mCurrentType = type;
        kotlinx.coroutines.e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new a(null), 3, null);
    }

    @Nullable
    public final ArrayList<AppChosen> getAllApps() {
        AppsNotificationInfo appsNotificationInfo = this.mAppsInfoMap.get(this.mCurrentType);
        if (appsNotificationInfo == null) {
            return null;
        }
        return appsNotificationInfo.getAppsChosen();
    }

    @NotNull
    public final ConcurrentHashMap<HMDeviceType, AppsNotificationInfo> getMAppsInfoMap() {
        return this.mAppsInfoMap;
    }

    @JvmOverloads
    public final boolean hasApp(@NotNull HMDeviceType type, @NotNull String pkg) {
        ArrayList<AppChosen> appsChosen;
        AppsNotificationInfo appsNotificationInfo = this.mAppsInfoMap.get(type);
        if (appsNotificationInfo == null || (appsChosen = appsNotificationInfo.getAppsChosen()) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(appsChosen, 10));
        Iterator<T> it2 = appsChosen.iterator();
        while (it2.hasNext()) {
            arrayList.add(((AppChosen) it2.next()).getPkg());
        }
        List list = CollectionsKt___CollectionsKt.toList(arrayList);
        if (list == null) {
            return false;
        }
        return list.contains(pkg);
    }

    @JvmOverloads
    public final boolean hasApp(@NotNull String str) {
        return hasApp$default(this, null, str, 1, null);
    }

    @JvmOverloads
    public final boolean hasNotContains(@NotNull HMDeviceType type, @NotNull String pkg) {
        return !hasApp(type, pkg);
    }

    @JvmOverloads
    public final boolean hasNotContains(@NotNull String str) {
        return hasNotContains$default(this, null, str, 1, null);
    }

    public final boolean hasNotUsableDeviceType() {
        return this.mCurrentType == HMDeviceType.VDevice;
    }

    @JvmOverloads
    public final boolean isNotificationOn() {
        return isNotificationOn$default(this, null, 1, null);
    }

    @JvmOverloads
    public final boolean isNotificationOn(@NotNull HMDeviceType type) {
        a(type);
        AppsNotificationInfo appsNotificationInfo = this.mAppsInfoMap.get(type);
        if (appsNotificationInfo == null) {
            return false;
        }
        return appsNotificationInfo.getNotificationOn();
    }

    @JvmOverloads
    public final boolean isScreenSleepOn() {
        return isScreenSleepOn$default(this, null, 1, null);
    }

    @JvmOverloads
    public final boolean isScreenSleepOn(@NotNull HMDeviceType type) {
        a(type);
        AppsNotificationInfo appsNotificationInfo = this.mAppsInfoMap.get(type);
        if (appsNotificationInfo == null) {
            return false;
        }
        return appsNotificationInfo.getDisplayOff();
    }

    public final void removeApp(@NotNull String pkg) {
        AppsNotificationInfo appsNotificationInfo = this.mAppsInfoMap.get(this.mCurrentType);
        if (appsNotificationInfo == null) {
            return;
        }
        ArrayList<AppChosen> appsChosen = appsNotificationInfo.getAppsChosen();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(appsChosen, 10));
        Iterator<T> it2 = appsChosen.iterator();
        while (it2.hasNext()) {
            arrayList.add(((AppChosen) it2.next()).getPkg());
        }
        if (CollectionsKt___CollectionsKt.toList(arrayList).contains(pkg)) {
            appsNotificationInfo.getAppsChosen().remove(new AppChosen(pkg, false, 2, null));
            c(appsNotificationInfo);
        }
    }

    public final void setCurrentDeviceType(@NotNull HMDeviceType type) {
        HMLog.info(this.logTag, new e(type));
        this.mCurrentType = type;
    }

    public final void setMAppsInfoMap(@NotNull ConcurrentHashMap<HMDeviceType, AppsNotificationInfo> concurrentHashMap) {
        this.mAppsInfoMap = concurrentHashMap;
    }

    public final void setNotificationOn(boolean enable) {
        AppsNotificationInfo appsNotificationInfo = this.mAppsInfoMap.get(this.mCurrentType);
        if (appsNotificationInfo == null) {
            return;
        }
        appsNotificationInfo.setNotificationOn(enable);
        c(appsNotificationInfo);
    }

    public final void setScreenSleepOn(boolean enable) {
        AppsNotificationInfo appsNotificationInfo = this.mAppsInfoMap.get(this.mCurrentType);
        if (appsNotificationInfo == null) {
            return;
        }
        appsNotificationInfo.setDisplayOff(enable);
        c(appsNotificationInfo);
    }

    public final void setSupportReply(boolean enable) {
        AppsNotificationInfo appsNotificationInfo = this.mAppsInfoMap.get(this.mCurrentType);
        if (appsNotificationInfo == null) {
            return;
        }
        appsNotificationInfo.setSupportReply(enable);
        c(appsNotificationInfo);
    }

    @JvmOverloads
    public final boolean supportReply() {
        return supportReply$default(this, null, 1, null);
    }

    @JvmOverloads
    public final boolean supportReply(@NotNull HMDeviceType type) {
        a(type);
        AppsNotificationInfo appsNotificationInfo = this.mAppsInfoMap.get(type);
        if (appsNotificationInfo == null) {
            return false;
        }
        return appsNotificationInfo.getSupportReply();
    }
}
