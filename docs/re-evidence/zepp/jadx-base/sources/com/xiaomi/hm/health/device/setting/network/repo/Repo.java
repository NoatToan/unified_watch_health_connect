package com.xiaomi.hm.health.device.setting.network.repo;

import com.huami.devicex.single.DevicePreLaunchRepository;
import com.huami.koinstartup.KoinComponentAdapter;
import com.huami.tools.log.HMLog;
import com.huami.userproperty.UserPropertyManager;
import com.huami.userproperty.entity.BatchFetchResult;
import com.huami.userproperty.service.entity.remote.ResultFuture;
import com.xiaomi.hm.health.device.setting.network.bean.Display;
import com.xiaomi.hm.health.device.setting.network.bean.DndMode;
import com.xiaomi.hm.health.device.setting.network.bean.IWatchSettings;
import com.xiaomi.hm.health.device.setting.network.bean.OfflineVoice;
import com.xiaomi.hm.health.device.setting.network.bean.QuickStart;
import com.xiaomi.hm.health.device.setting.network.bean.SleepMode;
import com.xiaomi.hm.health.device.setting.network.bean.Sound;
import com.xiaomi.hm.health.device.setting.network.bean.Sport;
import com.xiaomi.hm.health.device.setting.network.bean.WatchSettings;
import com.xiaomi.hm.health.device.setting.network.bean.Wearing;
import com.xiaomi.hm.health.device.setting.network.parse.IParser;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u0017\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0016R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/repo/Repo;", "Lcom/xiaomi/hm/health/device/setting/network/repo/IRepo;", "Lcom/huami/koinstartup/KoinComponentAdapter;", "Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "getWatchSettings", "watchSettings", "", "saveToLocalAndCloud", "Lcom/xiaomi/hm/health/device/setting/network/parse/IParser;", "a", "Lcom/xiaomi/hm/health/device/setting/network/parse/IParser;", "getParser", "()Lcom/xiaomi/hm/health/device/setting/network/parse/IParser;", "parser", "Lcom/xiaomi/hm/health/device/setting/network/repo/IPropertyUtil;", "b", "Lcom/xiaomi/hm/health/device/setting/network/repo/IPropertyUtil;", "getPropertyUtil", "()Lcom/xiaomi/hm/health/device/setting/network/repo/IPropertyUtil;", "propertyUtil", "<init>", "(Lcom/xiaomi/hm/health/device/setting/network/parse/IParser;Lcom/xiaomi/hm/health/device/setting/network/repo/IPropertyUtil;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class Repo implements IRepo, KoinComponentAdapter {

    @NotNull
    private static final String c = "LocalRepo";

    @NotNull
    private static final String d = "huami.user.gt3.settings";

    @NotNull
    private static final String e = "huami.user.device.settings";

    @NotNull
    private static final String f = "huami.user.device.settings.sleepmode";

    @NotNull
    private static final String g = "huami.user.gt3.settings.display";

    @NotNull
    private static final String h = "huami.user.gt3.settings.sound";

    @NotNull
    private static final String i = "huami.user.gt3.settings.wear";

    @NotNull
    private static final String j = "huami.user.gt3.settings.sort";

    @NotNull
    private static final String k = "huami.user.gt3.settings.sport";

    @NotNull
    private static final String l = "huami.user.gt3.settings.dndmode";

    @NotNull
    private static final String m = "huami.user.gt3.settings.quickstart";

    @NotNull
    private static final String n = "huami.user.gt3.settings.offlinevoice";

    @NotNull
    private static final String o = "KEY_REFRESHED";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IParser parser;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final IPropertyUtil propertyUtil;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "refreshed: " + this.a;
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
            return "sth null, get from cloud";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.network.repo.Repo$getWatchSettings$1$3", f = "Repo.kt", i = {1}, l = {36, 37}, m = "invokeSuspend", n = {"result"}, s = {"L$0"})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ BatchFetchResult a;
            public final /* synthetic */ BatchFetchResult b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(BatchFetchResult batchFetchResult, BatchFetchResult batchFetchResult2) {
                super(0);
                this.a = batchFetchResult;
                this.b = batchFetchResult2;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "result: " + this.a + ", deviceResult: " + this.b;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            BatchFetchResult batchFetchResult;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    batchFetchResult = (BatchFetchResult) this.a;
                    ResultKt.throwOnFailure(obj);
                }
                HMLog.info(Repo.c, new a(batchFetchResult, (BatchFetchResult) obj));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            ResultFuture resultFutureRangeFetch$default = UserPropertyManager.rangeFetch$default(UserPropertyManager.INSTANCE, Repo.d, null, 2, null);
            this.b = 1;
            obj = resultFutureRangeFetch$default.get(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            BatchFetchResult batchFetchResult2 = (BatchFetchResult) obj;
            ResultFuture resultFutureRangeFetch$default2 = UserPropertyManager.rangeFetch$default(UserPropertyManager.INSTANCE, Repo.e, null, 2, null);
            this.a = batchFetchResult2;
            this.b = 2;
            Object obj2 = resultFutureRangeFetch$default2.get(this);
            if (obj2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            batchFetchResult = batchFetchResult2;
            obj = obj2;
            HMLog.info(Repo.c, new a(batchFetchResult, (BatchFetchResult) obj));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "getWatchSettings exception: " + this.a;
        }
    }

    public Repo(@NotNull IParser iParser, @NotNull IPropertyUtil iPropertyUtil) {
        this.parser = iParser;
        this.propertyUtil = iPropertyUtil;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponentAdapter.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final IParser getParser() {
        return this.parser;
    }

    @NotNull
    public final IPropertyUtil getPropertyUtil() {
        return this.propertyUtil;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00bf A[Catch: all -> 0x01e6, TryCatch #0 {all -> 0x01e6, blocks: (B:3:0x0005, B:6:0x0027, B:8:0x0032, B:14:0x003e, B:16:0x0048, B:22:0x0054, B:24:0x005e, B:30:0x006a, B:32:0x0074, B:38:0x0080, B:40:0x008a, B:46:0x0096, B:48:0x00a0, B:54:0x00ac, B:56:0x00b6, B:60:0x00bf, B:61:0x00cf, B:63:0x0147, B:65:0x014b, B:67:0x015c, B:69:0x0160, B:71:0x0171, B:73:0x0175, B:75:0x0186, B:77:0x018a, B:79:0x019b, B:81:0x019f, B:83:0x01b0, B:85:0x01b4, B:87:0x01c5, B:89:0x01c9, B:91:0x01da, B:93:0x01de), top: B:106:0x0005 }] */
    @Override // com.xiaomi.hm.health.device.setting.network.repo.IRepo
    @Nullable
    public WatchSettings getWatchSettings() {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            DevicePreLaunchRepository devicePreLaunchRepository = DevicePreLaunchRepository.INSTANCE;
            boolean boolean$default = DevicePreLaunchRepository.getBoolean$default(devicePreLaunchRepository, o, false, 2, null);
            HMLog.info(c, new a(boolean$default));
            if (!boolean$default) {
                String property = getPropertyUtil().getProperty(g);
                if (property == null || m.isBlank(property)) {
                    HMLog.info(c, b.a);
                    kotlinx.coroutines.d.b(null, new c(null), 1, null);
                    devicePreLaunchRepository.putBoolean(o, true);
                } else {
                    String property2 = getPropertyUtil().getProperty(h);
                    if (property2 == null || m.isBlank(property2)) {
                        HMLog.info(c, b.a);
                        kotlinx.coroutines.d.b(null, new c(null), 1, null);
                        devicePreLaunchRepository.putBoolean(o, true);
                    } else {
                        String property3 = getPropertyUtil().getProperty(i);
                        if (property3 == null || m.isBlank(property3)) {
                            HMLog.info(c, b.a);
                            kotlinx.coroutines.d.b(null, new c(null), 1, null);
                            devicePreLaunchRepository.putBoolean(o, true);
                        } else {
                            String property4 = getPropertyUtil().getProperty(k);
                            if (property4 == null || m.isBlank(property4)) {
                                HMLog.info(c, b.a);
                                kotlinx.coroutines.d.b(null, new c(null), 1, null);
                                devicePreLaunchRepository.putBoolean(o, true);
                            } else {
                                String property5 = getPropertyUtil().getProperty(l);
                                if (property5 == null || m.isBlank(property5)) {
                                    HMLog.info(c, b.a);
                                    kotlinx.coroutines.d.b(null, new c(null), 1, null);
                                    devicePreLaunchRepository.putBoolean(o, true);
                                } else {
                                    String property6 = getPropertyUtil().getProperty(m);
                                    if (property6 == null || m.isBlank(property6)) {
                                        HMLog.info(c, b.a);
                                        kotlinx.coroutines.d.b(null, new c(null), 1, null);
                                        devicePreLaunchRepository.putBoolean(o, true);
                                    } else {
                                        String property7 = getPropertyUtil().getProperty(n);
                                        if (property7 == null || m.isBlank(property7)) {
                                            HMLog.info(c, b.a);
                                            kotlinx.coroutines.d.b(null, new c(null), 1, null);
                                            devicePreLaunchRepository.putBoolean(o, true);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            String property8 = getPropertyUtil().getProperty(f);
            String property9 = getPropertyUtil().getProperty(g);
            String property10 = getPropertyUtil().getProperty(h);
            String property11 = getPropertyUtil().getProperty(i);
            String property12 = getPropertyUtil().getProperty(k);
            String property13 = getPropertyUtil().getProperty(l);
            String property14 = getPropertyUtil().getProperty(m);
            String property15 = getPropertyUtil().getProperty(n);
            WatchSettings watchSettings = new WatchSettings(null, null, null, null, null, null, null, null, null, null, 1023, null);
            IWatchSettings iWatchSettings = getParser().parse(property8, SleepMode.class);
            watchSettings.setSleepMode(iWatchSettings instanceof SleepMode ? (SleepMode) iWatchSettings : null);
            IWatchSettings iWatchSettings2 = getParser().parse(property9, Display.class);
            watchSettings.setDisplay(iWatchSettings2 instanceof Display ? (Display) iWatchSettings2 : null);
            IWatchSettings iWatchSettings3 = getParser().parse(property10, Sound.class);
            watchSettings.setSound(iWatchSettings3 instanceof Sound ? (Sound) iWatchSettings3 : null);
            IWatchSettings iWatchSettings4 = getParser().parse(property11, Wearing.class);
            watchSettings.setWearing(iWatchSettings4 instanceof Wearing ? (Wearing) iWatchSettings4 : null);
            IWatchSettings iWatchSettings5 = getParser().parse(property12, Sport.class);
            watchSettings.setSport(iWatchSettings5 instanceof Sport ? (Sport) iWatchSettings5 : null);
            IWatchSettings iWatchSettings6 = getParser().parse(property13, DndMode.class);
            watchSettings.setDndMode(iWatchSettings6 instanceof DndMode ? (DndMode) iWatchSettings6 : null);
            IWatchSettings iWatchSettings7 = getParser().parse(property14, QuickStart.class);
            watchSettings.setQuickStart(iWatchSettings7 instanceof QuickStart ? (QuickStart) iWatchSettings7 : null);
            IWatchSettings iWatchSettings8 = getParser().parse(property15, OfflineVoice.class);
            watchSettings.setOfflineVoice(iWatchSettings8 instanceof OfflineVoice ? (OfflineVoice) iWatchSettings8 : null);
            objM3845constructorimpl = Result.m3845constructorimpl(watchSettings);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.error$default(c, null, null, new d(thM3848exceptionOrNullimpl), 6, null);
        }
        return (WatchSettings) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
    }

    @Override // com.xiaomi.hm.health.device.setting.network.repo.IRepo
    public boolean saveToLocalAndCloud(@NotNull WatchSettings watchSettings) {
        String property = this.propertyUtil.getProperty(f);
        String property2 = this.propertyUtil.getProperty(g);
        String property3 = this.propertyUtil.getProperty(h);
        String property4 = this.propertyUtil.getProperty(i);
        String property5 = this.propertyUtil.getProperty(k);
        String property6 = this.propertyUtil.getProperty(l);
        String property7 = this.propertyUtil.getProperty(m);
        String property8 = this.propertyUtil.getProperty(n);
        String strDeParse = this.parser.deParse(watchSettings.getSleepMode());
        String strDeParse2 = this.parser.deParse(watchSettings.getDisplay());
        String strDeParse3 = this.parser.deParse(watchSettings.getSound());
        String strDeParse4 = this.parser.deParse(watchSettings.getWearing());
        String strDeParse5 = this.parser.deParse(watchSettings.getSport());
        String strDeParse6 = this.parser.deParse(watchSettings.getDndMode());
        String strDeParse7 = this.parser.deParse(watchSettings.getQuickStart());
        String strDeParse8 = this.parser.deParse(watchSettings.getOfflineVoice());
        if (!(strDeParse == null || m.isBlank(strDeParse)) && !Intrinsics.areEqual(property, strDeParse)) {
            this.propertyUtil.setProperty(f, strDeParse);
        }
        if (!(strDeParse2 == null || m.isBlank(strDeParse2)) && !Intrinsics.areEqual(property2, strDeParse2)) {
            this.propertyUtil.setProperty(g, strDeParse2);
        }
        if (!(strDeParse3 == null || m.isBlank(strDeParse3)) && !Intrinsics.areEqual(property3, strDeParse3)) {
            this.propertyUtil.setProperty(h, strDeParse3);
        }
        if (!(strDeParse4 == null || m.isBlank(strDeParse4)) && !Intrinsics.areEqual(property4, strDeParse4)) {
            this.propertyUtil.setProperty(i, strDeParse4);
        }
        if (!(strDeParse5 == null || m.isBlank(strDeParse5)) && !Intrinsics.areEqual(property5, strDeParse5)) {
            this.propertyUtil.setProperty(k, strDeParse5);
        }
        if (!(strDeParse6 == null || m.isBlank(strDeParse6)) && !Intrinsics.areEqual(property6, strDeParse6)) {
            this.propertyUtil.setProperty(l, strDeParse6);
        }
        if (!(strDeParse7 == null || m.isBlank(strDeParse7)) && !Intrinsics.areEqual(property7, strDeParse7)) {
            this.propertyUtil.setProperty(m, strDeParse7);
        }
        if (!(strDeParse8 == null || m.isBlank(strDeParse8)) && !Intrinsics.areEqual(property8, strDeParse8)) {
            this.propertyUtil.setProperty(n, strDeParse8);
        }
        UserPropertyManager.INSTANCE.schedulePushAll();
        return true;
    }
}
