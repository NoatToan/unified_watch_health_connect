package com.huami.worldclock.controller;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.WorldClockModule;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.worldclock.bean.WorldClockBean;
import com.huami.worldclock.event.WorldClockChangeEvent;
import com.huami.worldclock.koin.DeviceScopesAndQualifierKt;
import com.huami.worldclock.manager.TransformHelper;
import com.huami.worldclock.manager.WorldClockConfig;
import com.huami.worldclock.manager.WorldClockDataFactory;
import com.huami.worldclock.utils.DeviceLanguageUtils;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.bt.profile.worldclock.WorldTime;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.context.GlobalContext;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 $2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\"\u0010#J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0006JF\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022)\u0010\u000e\u001a%\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\n0\t¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u001f8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lcom/huami/worldclock/controller/WorldClockController;", "Lcom/huami/worldclock/controller/IWorldClockController;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "setLocaleWorldClock", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setDefaultWorldClock", "Lkotlin/Function1;", "", "Lcom/huami/worldclock/bean/WorldClockBean;", "Lkotlin/ParameterName;", "name", "result", "callback", "queryWorldTime", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/worldclock/manager/WorldClockDataFactory;", "a", "Lkotlin/Lazy;", "c", "()Lcom/huami/worldclock/manager/WorldClockDataFactory;", "worldClockDataFactory", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "b", "()Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "hmBaseDevice", "Lcom/huami/bluetooth/profile/channel/module/WorldClockModule;", GoogleApiAvailabilityLight.a, "()Lcom/huami/bluetooth/profile/channel/module/WorldClockModule;", "worldClockModule", "", "()Z", "containWorldClockFeature", "<init>", "()V", "Companion", "worldclock_release"}, k = 1, mv = {1, 5, 1})
public final class WorldClockController implements IWorldClockController {

    @NotNull
    private static final String b = "WorldClockController";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy worldClockDataFactory = LazyKt__LazyJVMKt.lazy(m.a);

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.worldclock.controller.WorldClockController", f = "WorldClockController.kt", i = {0, 0, 0, 1, 1, 1}, l = {166, 168}, m = "queryWorldTime", n = {"this", DbUtils.Const.Table.CONTEXT, "callback", "this", DbUtils.Const.Table.CONTEXT, "callback"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return WorldClockController.this.queryWorldTime(null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.worldclock.controller.WorldClockController", f = "WorldClockController.kt", i = {0, 0, 0, 1, 1}, l = {109, 148}, m = "setDefaultWorldClock", n = {"this", DbUtils.Const.Table.CONTEXT, "firstUsing", "this", "defaultWorldCity"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1"})
    public static final class b extends ContinuationImpl {
        public Object a;
        public Object b;
        public boolean c;
        public /* synthetic */ Object d;
        public int f;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return WorldClockController.this.setDefaultWorldClock(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("setDefaultWorldClock  worldClock feature :", Boolean.valueOf(WorldClockController.this.a()));
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
            return Intrinsics.stringPlus("setDefaultWorldClock  firstUsing :", Boolean.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ List<WorldClockBean> b;
        public final /* synthetic */ List<WorldClockBean> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i, List<WorldClockBean> list, List<WorldClockBean> list2) {
            super(0);
            this.a = i;
            this.b = list;
            this.c = list2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            StringBuilder sb = new StringBuilder();
            sb.append("setDefaultWorldClock --->>> queryVersion:");
            sb.append(this.a);
            sb.append(", defaultWorldCity is ");
            sb.append(this.b == null ? "" : "not ");
            sb.append("null deviceBuiltInWorldCity is ");
            sb.append(this.c != null ? "not " : "");
            sb.append("null");
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ Locale a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Locale locale) {
            super(0);
            this.a = locale;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            StringBuilder sb = new StringBuilder();
            Locale locale = this.a;
            sb.append((Object) (locale == null ? null : locale.getCountry()));
            sb.append("--");
            Locale locale2 = this.a;
            sb.append((Object) (locale2 != null ? locale2.getLanguage() : null));
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("setDefaultWorldClock result:", Boolean.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.worldclock.controller.WorldClockController", f = "WorldClockController.kt", i = {0, 0}, l = {67, 96}, m = "setLocaleWorldClock", n = {"this", DbUtils.Const.Table.CONTEXT}, s = {"L$0", "L$1"})
    public static final class h extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return WorldClockController.this.setLocaleWorldClock(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("setLocaleWorldClock worldClock feature :", Boolean.valueOf(WorldClockController.this.a()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ List<WorldClockBean> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(int i, List<WorldClockBean> list) {
            super(0);
            this.a = i;
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            StringBuilder sb = new StringBuilder();
            sb.append("setLocaleWorldClock ---->>> queryVersion:");
            sb.append(this.a);
            sb.append(", deviceBuiltInWorldCity is ");
            sb.append(this.b == null ? "" : "not ");
            sb.append("null");
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ Locale a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Locale locale) {
            super(0);
            this.a = locale;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            StringBuilder sb = new StringBuilder();
            Locale locale = this.a;
            sb.append((Object) (locale == null ? null : locale.getCountry()));
            sb.append("--");
            Locale locale2 = this.a;
            sb.append((Object) (locale2 != null ? locale2.getLanguage() : null));
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("setLocalWorldClock result:", Boolean.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/worldclock/manager/WorldClockDataFactory;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<WorldClockDataFactory> {
        public static final m a = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WorldClockDataFactory getA() {
            return new WorldClockDataFactory();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a() {
        DeviceInfo deviceInfo;
        Feature deviceFeature;
        HMBaseDevice hMBaseDeviceB = b();
        if (hMBaseDeviceB == null || (deviceInfo = hMBaseDeviceB.getDeviceInfo()) == null || (deviceFeature = deviceInfo.getDeviceFeature()) == null) {
            return false;
        }
        return deviceFeature.hasSw(1);
    }

    private final HMBaseDevice b() {
        return DeviceScopesAndQualifierKt.getDeviceHolder(GlobalContext.INSTANCE.get()).getHmBaseDevice(HMDeviceType.MILI);
    }

    private final WorldClockDataFactory c() {
        return (WorldClockDataFactory) this.worldClockDataFactory.getValue();
    }

    private final WorldClockModule d() {
        HMBaseDevice hMBaseDeviceB;
        HMBaseDevice hMBaseDeviceB2 = b();
        if (!(hMBaseDeviceB2 == null ? true : hMBaseDeviceB2 instanceof HMMiLiProDevice) || (hMBaseDeviceB = b()) == null) {
            return null;
        }
        return (WorldClockModule) hMBaseDeviceB.getChannelModule(WorldClockModule.class);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x0090  */
    /* JADX WARN: Code duplicated, block: B:38:0x009a  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00df  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:62:0x0103  */
    /* JADX WARN: Code duplicated, block: B:65:0x0112  */
    /* JADX WARN: Code duplicated, block: B:66:0x0114  */
    /* JADX WARN: Code duplicated, block: B:68:0x011a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0123  */
    /* JADX WARN: Code duplicated, block: B:74:0x0129  */
    /* JADX WARN: Code duplicated, block: B:79:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00d9 A[SYNTHETIC] */
    @Override // com.huami.worldclock.controller.IWorldClockController
    @Nullable
    public Object queryWorldTime(@NotNull Context context, @Nullable Function1<? super List<WorldClockBean>, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        a aVar;
        WorldClockController worldClockController;
        WorldClockModule worldClockModuleD;
        WorldClockController worldClockController2;
        Context context2;
        Function1<? super List<WorldClockBean>, Unit> function2;
        List list;
        ArrayList arrayList;
        List mutableList;
        ArrayList arrayList2;
        Iterator it2;
        List<WorldClockBean> mutableList2;
        HMBaseDevice hMBaseDeviceB;
        HMDeviceType deviceType;
        HMDeviceSource deviceSource;
        WorldClockBean worldClockBeanWorldTimeToWorldClockBean;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.f = i2 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objQueryVersion$default = aVar.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = aVar.f;
        int iIntValue = 0;
        if (i3 != 0) {
            if (i3 == 1) {
                function1 = (Function1) aVar.c;
                context = (Context) aVar.b;
                worldClockController = (WorldClockController) aVar.a;
                ResultKt.throwOnFailure(objQueryVersion$default);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function2 = (Function1) aVar.c;
                context2 = (Context) aVar.b;
                worldClockController2 = (WorldClockController) aVar.a;
                ResultKt.throwOnFailure(objQueryVersion$default);
            }
            list = (List) objQueryVersion$default;
            if (list != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((WorldTime) obj).isDisplay()) {
                        arrayList.add(obj);
                    }
                }
                mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
                if (mutableList != null) {
                    if (mutableList.size() > 1) {
                        kotlin.collections.g.sortWith(mutableList, new Comparator() { // from class: com.huami.worldclock.controller.WorldClockController$queryWorldTime$lambda-9$$inlined$sortBy$1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.Comparator
                            public final int compare(T t, T t2) {
                                return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((WorldTime) t).getIndex()), Integer.valueOf(((WorldTime) t2).getIndex()));
                            }
                        });
                    }
                    arrayList2 = new ArrayList();
                    it2 = mutableList.iterator();
                    while (it2.hasNext()) {
                        worldClockBeanWorldTimeToWorldClockBean = TransformHelper.INSTANCE.worldTimeToWorldClockBean((WorldTime) it2.next(), context2);
                        if (worldClockBeanWorldTimeToWorldClockBean != null) {
                            worldClockBeanWorldTimeToWorldClockBean.setShow(true);
                        }
                        if (worldClockBeanWorldTimeToWorldClockBean != null) {
                            arrayList2.add(worldClockBeanWorldTimeToWorldClockBean);
                        }
                    }
                    mutableList2 = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
                    WorldClockConfig.INSTANCE.updateWorldClockList(mutableList2);
                    if (function2 != null) {
                        function2.invoke(mutableList2);
                    }
                    EventBus eventBus = EventBus.getDefault();
                    hMBaseDeviceB = worldClockController2.b();
                    if (hMBaseDeviceB == null) {
                        deviceType = null;
                    } else {
                        deviceType = hMBaseDeviceB.getDeviceType();
                    }
                    if (deviceType == null) {
                        deviceType = HMDeviceType.VDevice;
                    }
                    HMBaseDevice hMBaseDeviceB2 = worldClockController2.b();
                    deviceSource = hMBaseDeviceB2 != null ? hMBaseDeviceB2.getMDeviceSource() : null;
                    if (deviceSource == null) {
                        deviceSource = HMDeviceSource.VDEVICE;
                    }
                    eventBus.post(new WorldClockChangeEvent(deviceType, deviceSource));
                }
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objQueryVersion$default);
        WorldClockModule worldClockModuleD2 = d();
        if (worldClockModuleD2 == null) {
            worldClockController = this;
        } else {
            aVar.a = this;
            aVar.b = context;
            aVar.c = function1;
            aVar.f = 1;
            objQueryVersion$default = WorldClockModule.queryVersion$default(worldClockModuleD2, false, aVar, 1, null);
            if (objQueryVersion$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            worldClockController = this;
        }
        if (iIntValue > 1 && (worldClockModuleD = worldClockController.d()) != null) {
            aVar.a = worldClockController;
            aVar.b = context;
            aVar.c = function1;
            aVar.f = 2;
            objQueryVersion$default = worldClockModuleD.queryWorldClock(aVar);
            if (objQueryVersion$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            worldClockController2 = worldClockController;
            Function1<? super List<WorldClockBean>, Unit> function3 = function1;
            context2 = context;
            function2 = function3;
            list = (List) objQueryVersion$default;
            if (list != null) {
                arrayList = new ArrayList();
                while (r11.hasNext()) {
                    if (((WorldTime) obj).isDisplay()) {
                        arrayList.add(obj);
                    }
                }
                mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
                if (mutableList != null) {
                    if (mutableList.size() > 1) {
                        kotlin.collections.g.sortWith(mutableList, new Comparator() { // from class: com.huami.worldclock.controller.WorldClockController$queryWorldTime$lambda-9$$inlined$sortBy$1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.Comparator
                            public final int compare(T t, T t2) {
                                return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((WorldTime) t).getIndex()), Integer.valueOf(((WorldTime) t2).getIndex()));
                            }
                        });
                    }
                    arrayList2 = new ArrayList();
                    it2 = mutableList.iterator();
                    while (it2.hasNext()) {
                        worldClockBeanWorldTimeToWorldClockBean = TransformHelper.INSTANCE.worldTimeToWorldClockBean((WorldTime) it2.next(), context2);
                        if (worldClockBeanWorldTimeToWorldClockBean != null) {
                            worldClockBeanWorldTimeToWorldClockBean.setShow(true);
                        }
                        if (worldClockBeanWorldTimeToWorldClockBean != null) {
                            arrayList2.add(worldClockBeanWorldTimeToWorldClockBean);
                        }
                    }
                    mutableList2 = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
                    WorldClockConfig.INSTANCE.updateWorldClockList(mutableList2);
                    if (function2 != null) {
                        function2.invoke(mutableList2);
                    }
                    EventBus eventBus2 = EventBus.getDefault();
                    hMBaseDeviceB = worldClockController2.b();
                    if (hMBaseDeviceB == null) {
                        deviceType = null;
                    } else {
                        deviceType = hMBaseDeviceB.getDeviceType();
                    }
                    if (deviceType == null) {
                        deviceType = HMDeviceType.VDevice;
                    }
                    HMBaseDevice hMBaseDeviceB3 = worldClockController2.b();
                    if (hMBaseDeviceB3 != null) {
                    }
                    if (deviceSource == null) {
                        deviceSource = HMDeviceSource.VDEVICE;
                    }
                    eventBus2.post(new WorldClockChangeEvent(deviceType, deviceSource));
                }
            }
        }
        return Unit.INSTANCE;
        Integer num = (Integer) objQueryVersion$default;
        if (num != null) {
            iIntValue = num.intValue();
        }
        if (iIntValue > 1) {
            aVar.a = worldClockController;
            aVar.b = context;
            aVar.c = function1;
            aVar.f = 2;
            objQueryVersion$default = worldClockModuleD.queryWorldClock(aVar);
            if (objQueryVersion$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            worldClockController2 = worldClockController;
            Function1<? super List<WorldClockBean>, Unit> function4 = function1;
            context2 = context;
            function2 = function4;
            list = (List) objQueryVersion$default;
            if (list != null) {
                arrayList = new ArrayList();
                while (r11.hasNext()) {
                    if (((WorldTime) obj).isDisplay()) {
                        arrayList.add(obj);
                    }
                }
                mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
                if (mutableList != null) {
                    if (mutableList.size() > 1) {
                        kotlin.collections.g.sortWith(mutableList, new Comparator() { // from class: com.huami.worldclock.controller.WorldClockController$queryWorldTime$lambda-9$$inlined$sortBy$1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.Comparator
                            public final int compare(T t, T t2) {
                                return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((WorldTime) t).getIndex()), Integer.valueOf(((WorldTime) t2).getIndex()));
                            }
                        });
                    }
                    arrayList2 = new ArrayList();
                    it2 = mutableList.iterator();
                    while (it2.hasNext()) {
                        worldClockBeanWorldTimeToWorldClockBean = TransformHelper.INSTANCE.worldTimeToWorldClockBean((WorldTime) it2.next(), context2);
                        if (worldClockBeanWorldTimeToWorldClockBean != null) {
                            worldClockBeanWorldTimeToWorldClockBean.setShow(true);
                        }
                        if (worldClockBeanWorldTimeToWorldClockBean != null) {
                            arrayList2.add(worldClockBeanWorldTimeToWorldClockBean);
                        }
                    }
                    mutableList2 = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
                    WorldClockConfig.INSTANCE.updateWorldClockList(mutableList2);
                    if (function2 != null) {
                        function2.invoke(mutableList2);
                    }
                    EventBus eventBus3 = EventBus.getDefault();
                    hMBaseDeviceB = worldClockController2.b();
                    if (hMBaseDeviceB == null) {
                        deviceType = null;
                    } else {
                        deviceType = hMBaseDeviceB.getDeviceType();
                    }
                    if (deviceType == null) {
                        deviceType = HMDeviceType.VDevice;
                    }
                    HMBaseDevice hMBaseDeviceB4 = worldClockController2.b();
                    if (hMBaseDeviceB4 != null) {
                    }
                    if (deviceSource == null) {
                        deviceSource = HMDeviceSource.VDEVICE;
                    }
                    eventBus3.post(new WorldClockChangeEvent(deviceType, deviceSource));
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009d  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:57:0x0106  */
    /* JADX WARN: Code duplicated, block: B:60:0x010f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0117  */
    /* JADX WARN: Code duplicated, block: B:68:0x0124  */
    /* JADX WARN: Code duplicated, block: B:70:0x0130 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x0131  */
    /* JADX WARN: Code duplicated, block: B:75:0x0138  */
    /* JADX WARN: Code duplicated, block: B:78:0x0140  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0151  */
    /* JADX WARN: Code duplicated, block: B:81:0x0153  */
    /* JADX WARN: Code duplicated, block: B:83:0x0159  */
    /* JADX WARN: Code duplicated, block: B:86:0x0161  */
    /* JADX WARN: Code duplicated, block: B:87:0x0163  */
    /* JADX WARN: Code duplicated, block: B:89:0x0169  */
    /* JADX WARN: Code duplicated, block: B:95:0x011a A[SYNTHETIC] */
    @Override // com.huami.worldclock.controller.IWorldClockController
    @Nullable
    public Object setDefaultWorldClock(@NotNull Context context, @NotNull Continuation<? super Unit> continuation) {
        b bVar;
        boolean zIsFirstUsing;
        Context context2;
        WorldClockController worldClockController;
        int iIntValue;
        List<WorldClockBean> deviceBuiltInWorldCity;
        List<WorldClockBean> arrayList;
        List<WorldClockBean> listCombinationData;
        Locale deviceLanguageToLocale;
        ArrayList arrayList2;
        int i2;
        WorldClockModule worldClockModuleD;
        List<WorldClockBean> list;
        WorldClockController worldClockController2;
        WorldClockBean worldClockBean;
        HMBaseDevice hMBaseDeviceB;
        HMDeviceType deviceType;
        HMBaseDevice hMBaseDeviceB2;
        HMDeviceSource deviceSource;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i3 = bVar.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bVar.f = i3 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objQueryVersion$default = bVar.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i4 = bVar.f;
        WorldTime worldTimeWorldClockBeanToWorldTime = null;
        boolean zBooleanValue = false;
        if (i4 != 0) {
            if (i4 == 1) {
                zIsFirstUsing = bVar.c;
                context2 = (Context) bVar.b;
                worldClockController = (WorldClockController) bVar.a;
                ResultKt.throwOnFailure(objQueryVersion$default);
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) bVar.b;
                worldClockController2 = (WorldClockController) bVar.a;
                ResultKt.throwOnFailure(objQueryVersion$default);
            }
            Boolean bool = (Boolean) objQueryVersion$default;
            zBooleanValue = bool != null ? bool.booleanValue() : false;
            worldClockController = worldClockController2;
            arrayList = list;
            if (zBooleanValue) {
                WorldClockConfig.INSTANCE.updateWorldClockList(arrayList);
                EventBus eventBus = EventBus.getDefault();
                hMBaseDeviceB = worldClockController.b();
                if (hMBaseDeviceB == null) {
                    deviceType = null;
                } else {
                    deviceType = hMBaseDeviceB.getDeviceType();
                }
                if (deviceType == null) {
                    deviceType = HMDeviceType.VDevice;
                }
                hMBaseDeviceB2 = worldClockController.b();
                if (hMBaseDeviceB2 == null) {
                    deviceSource = null;
                } else {
                    deviceSource = hMBaseDeviceB2.getMDeviceSource();
                }
                if (deviceSource == null) {
                    deviceSource = HMDeviceSource.VDEVICE;
                }
                eventBus.post(new WorldClockChangeEvent(deviceType, deviceSource));
            }
            HMLog.info(b, new g(zBooleanValue));
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objQueryVersion$default);
        if (!a()) {
            HMLog.info(b, new c());
            return Unit.INSTANCE;
        }
        zIsFirstUsing = WorldClockConfig.INSTANCE.isFirstUsing();
        HMLog.info(b, new d(zIsFirstUsing));
        WorldClockModule worldClockModuleD2 = d();
        if (worldClockModuleD2 == null) {
            context2 = context;
            worldClockController = this;
        } else {
            bVar.a = this;
            context2 = context;
            bVar.b = context2;
            bVar.c = zIsFirstUsing;
            bVar.f = 1;
            objQueryVersion$default = WorldClockModule.queryVersion$default(worldClockModuleD2, false, bVar, 1, null);
            if (objQueryVersion$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            worldClockController = this;
        }
        if (iIntValue > 1) {
            deviceBuiltInWorldCity = worldClockController.c().getDeviceBuiltInWorldCity(context2);
        } else {
            deviceBuiltInWorldCity = null;
        }
        if (zIsFirstUsing) {
            arrayList = WorldClockConfig.INSTANCE.getDefaultWorldCity(context2);
        } else if (iIntValue > 1) {
            arrayList = new ArrayList<>();
        } else {
            arrayList = null;
        }
        HMLog.info(b, new e(iIntValue, arrayList, deviceBuiltInWorldCity));
        if (arrayList == null) {
            return Unit.INSTANCE;
        }
        if (deviceBuiltInWorldCity != null || (listCombinationData = worldClockController.c().combinationData(arrayList, deviceBuiltInWorldCity)) == null) {
            listCombinationData = arrayList;
        }
        deviceLanguageToLocale = DeviceLanguageUtils.INSTANCE.parseDeviceLanguageToLocale(worldClockController.b());
        HMLog.info(b, new f(deviceLanguageToLocale));
        arrayList2 = new ArrayList();
        i2 = 0;
        for (Object obj : listCombinationData) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            worldClockBean = (WorldClockBean) obj;
            if (deviceLanguageToLocale != null) {
                TransformHelper transformHelper = TransformHelper.INSTANCE;
                if (!worldClockBean.isShow()) {
                    i2 = 255;
                }
                worldTimeWorldClockBeanToWorldTime = transformHelper.worldClockBeanToWorldTime(context2, deviceLanguageToLocale, worldClockBean, i2);
            }
            if (worldTimeWorldClockBeanToWorldTime != null) {
                arrayList2.add(worldTimeWorldClockBeanToWorldTime);
            }
            i2 = i5;
            worldTimeWorldClockBeanToWorldTime = null;
        }
        worldClockModuleD = worldClockController.d();
        if (worldClockModuleD != null) {
            bVar.a = worldClockController;
            bVar.b = arrayList;
            bVar.f = 2;
            objQueryVersion$default = worldClockModuleD.setWorldClock(arrayList2, bVar);
            if (objQueryVersion$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = arrayList;
            worldClockController2 = worldClockController;
            Boolean bool2 = (Boolean) objQueryVersion$default;
            if (bool2 != null) {
            }
            worldClockController = worldClockController2;
            arrayList = list;
        }
        if (zBooleanValue) {
            WorldClockConfig.INSTANCE.updateWorldClockList(arrayList);
            EventBus eventBus2 = EventBus.getDefault();
            hMBaseDeviceB = worldClockController.b();
            if (hMBaseDeviceB == null) {
                deviceType = null;
            } else {
                deviceType = hMBaseDeviceB.getDeviceType();
            }
            if (deviceType == null) {
                deviceType = HMDeviceType.VDevice;
            }
            hMBaseDeviceB2 = worldClockController.b();
            if (hMBaseDeviceB2 == null) {
                deviceSource = null;
            } else {
                deviceSource = hMBaseDeviceB2.getMDeviceSource();
            }
            if (deviceSource == null) {
                deviceSource = HMDeviceSource.VDEVICE;
            }
            eventBus2.post(new WorldClockChangeEvent(deviceType, deviceSource));
        }
        HMLog.info(b, new g(zBooleanValue));
        return Unit.INSTANCE;
        Integer num = (Integer) objQueryVersion$default;
        iIntValue = num == null ? 0 : num.intValue();
        if (iIntValue > 1) {
            deviceBuiltInWorldCity = worldClockController.c().getDeviceBuiltInWorldCity(context2);
        } else {
            deviceBuiltInWorldCity = null;
        }
        if (zIsFirstUsing) {
            arrayList = WorldClockConfig.INSTANCE.getDefaultWorldCity(context2);
        } else if (iIntValue > 1) {
            arrayList = new ArrayList<>();
        } else {
            arrayList = null;
        }
        HMLog.info(b, new e(iIntValue, arrayList, deviceBuiltInWorldCity));
        if (arrayList == null) {
            return Unit.INSTANCE;
        }
        if (deviceBuiltInWorldCity != null) {
            listCombinationData = arrayList;
        } else {
            listCombinationData = arrayList;
        }
        deviceLanguageToLocale = DeviceLanguageUtils.INSTANCE.parseDeviceLanguageToLocale(worldClockController.b());
        HMLog.info(b, new f(deviceLanguageToLocale));
        arrayList2 = new ArrayList();
        i2 = 0;
        while (r1.hasNext()) {
            int i6 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            worldClockBean = (WorldClockBean) obj;
            if (deviceLanguageToLocale != null) {
                TransformHelper transformHelper2 = TransformHelper.INSTANCE;
                if (!worldClockBean.isShow()) {
                    i2 = 255;
                }
                worldTimeWorldClockBeanToWorldTime = transformHelper2.worldClockBeanToWorldTime(context2, deviceLanguageToLocale, worldClockBean, i2);
            }
            if (worldTimeWorldClockBeanToWorldTime != null) {
                arrayList2.add(worldTimeWorldClockBeanToWorldTime);
            }
            i2 = i6;
            worldTimeWorldClockBeanToWorldTime = null;
        }
        worldClockModuleD = worldClockController.d();
        if (worldClockModuleD != null) {
            bVar.a = worldClockController;
            bVar.b = arrayList;
            bVar.f = 2;
            objQueryVersion$default = worldClockModuleD.setWorldClock(arrayList2, bVar);
            if (objQueryVersion$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = arrayList;
            worldClockController2 = worldClockController;
            Boolean bool3 = (Boolean) objQueryVersion$default;
            if (bool3 != null) {
            }
            worldClockController = worldClockController2;
            arrayList = list;
        }
        if (zBooleanValue) {
            WorldClockConfig.INSTANCE.updateWorldClockList(arrayList);
            EventBus eventBus3 = EventBus.getDefault();
            hMBaseDeviceB = worldClockController.b();
            if (hMBaseDeviceB == null) {
                deviceType = null;
            } else {
                deviceType = hMBaseDeviceB.getDeviceType();
            }
            if (deviceType == null) {
                deviceType = HMDeviceType.VDevice;
            }
            hMBaseDeviceB2 = worldClockController.b();
            if (hMBaseDeviceB2 == null) {
                deviceSource = null;
            } else {
                deviceSource = hMBaseDeviceB2.getMDeviceSource();
            }
            if (deviceSource == null) {
                deviceSource = HMDeviceSource.VDEVICE;
            }
            eventBus3.post(new WorldClockChangeEvent(deviceType, deviceSource));
        }
        HMLog.info(b, new g(zBooleanValue));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0083  */
    /* JADX WARN: Code duplicated, block: B:34:0x008c  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00db  */
    /* JADX WARN: Code duplicated, block: B:51:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:64:0x0106 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:68:0x010c  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.huami.worldclock.controller.IWorldClockController
    @Nullable
    public Object setLocaleWorldClock(@NotNull Context context, @NotNull Continuation<? super Unit> continuation) {
        h hVar;
        Context context2;
        WorldClockController worldClockController;
        int iIntValue;
        List<WorldClockBean> deviceBuiltInWorldCity;
        List<WorldClockBean> localWorldClock;
        Locale deviceLanguageToLocale;
        ArrayList arrayList;
        int i2;
        WorldClockModule worldClockModuleD;
        WorldClockBean worldClockBean;
        WorldTime worldTimeWorldClockBeanToWorldTime;
        List<WorldClockBean> listCombinationData;
        Boolean bool;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i3 = hVar.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hVar.e = i3 - Integer.MIN_VALUE;
            } else {
                hVar = new h(continuation);
            }
        } else {
            hVar = new h(continuation);
        }
        Object objQueryVersion$default = hVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i4 = hVar.e;
        boolean zBooleanValue = false;
        if (i4 != 0) {
            if (i4 == 1) {
                context2 = (Context) hVar.b;
                worldClockController = (WorldClockController) hVar.a;
                ResultKt.throwOnFailure(objQueryVersion$default);
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objQueryVersion$default);
            }
            bool = (Boolean) objQueryVersion$default;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
            HMLog.info(b, new l(zBooleanValue));
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objQueryVersion$default);
        if (!a()) {
            HMLog.info(b, new i());
            return Unit.INSTANCE;
        }
        WorldClockModule worldClockModuleD2 = d();
        if (worldClockModuleD2 == null) {
            context2 = context;
            worldClockController = this;
        } else {
            hVar.a = this;
            context2 = context;
            hVar.b = context2;
            hVar.e = 1;
            objQueryVersion$default = WorldClockModule.queryVersion$default(worldClockModuleD2, false, hVar, 1, null);
            if (objQueryVersion$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            worldClockController = this;
        }
        if (iIntValue > 1) {
            deviceBuiltInWorldCity = worldClockController.c().getDeviceBuiltInWorldCity(context2);
        } else {
            deviceBuiltInWorldCity = null;
        }
        localWorldClock = WorldClockConfig.INSTANCE.getLocalWorldClock();
        HMLog.info(b, new j(iIntValue, deviceBuiltInWorldCity));
        if (deviceBuiltInWorldCity != null && (listCombinationData = worldClockController.c().combinationData(localWorldClock, deviceBuiltInWorldCity)) != null) {
            localWorldClock = listCombinationData;
        }
        deviceLanguageToLocale = DeviceLanguageUtils.INSTANCE.parseDeviceLanguageToLocale(worldClockController.b());
        HMLog.info(b, new k(deviceLanguageToLocale));
        arrayList = new ArrayList();
        i2 = 0;
        for (Object obj : localWorldClock) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            worldClockBean = (WorldClockBean) obj;
            if (deviceLanguageToLocale == null) {
                worldTimeWorldClockBeanToWorldTime = null;
            } else {
                TransformHelper transformHelper = TransformHelper.INSTANCE;
                if (!worldClockBean.isShow()) {
                    i2 = 255;
                }
                worldTimeWorldClockBeanToWorldTime = transformHelper.worldClockBeanToWorldTime(context2, deviceLanguageToLocale, worldClockBean, i2);
            }
            if (worldTimeWorldClockBeanToWorldTime != null) {
                arrayList.add(worldTimeWorldClockBeanToWorldTime);
            }
            i2 = i5;
        }
        worldClockModuleD = worldClockController.d();
        if (worldClockModuleD != null) {
            hVar.a = null;
            hVar.b = null;
            hVar.e = 2;
            objQueryVersion$default = worldClockModuleD.setWorldClock(arrayList, hVar);
            if (objQueryVersion$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            bool = (Boolean) objQueryVersion$default;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
        }
        HMLog.info(b, new l(zBooleanValue));
        return Unit.INSTANCE;
        Integer num = (Integer) objQueryVersion$default;
        iIntValue = num == null ? 0 : num.intValue();
        if (iIntValue > 1) {
            deviceBuiltInWorldCity = worldClockController.c().getDeviceBuiltInWorldCity(context2);
        } else {
            deviceBuiltInWorldCity = null;
        }
        localWorldClock = WorldClockConfig.INSTANCE.getLocalWorldClock();
        HMLog.info(b, new j(iIntValue, deviceBuiltInWorldCity));
        if (deviceBuiltInWorldCity != null) {
            localWorldClock = listCombinationData;
        }
        deviceLanguageToLocale = DeviceLanguageUtils.INSTANCE.parseDeviceLanguageToLocale(worldClockController.b());
        HMLog.info(b, new k(deviceLanguageToLocale));
        arrayList = new ArrayList();
        i2 = 0;
        while (r11.hasNext()) {
            int i6 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            worldClockBean = (WorldClockBean) obj;
            if (deviceLanguageToLocale == null) {
                worldTimeWorldClockBeanToWorldTime = null;
            } else {
                TransformHelper transformHelper2 = TransformHelper.INSTANCE;
                if (!worldClockBean.isShow()) {
                    i2 = 255;
                }
                worldTimeWorldClockBeanToWorldTime = transformHelper2.worldClockBeanToWorldTime(context2, deviceLanguageToLocale, worldClockBean, i2);
            }
            if (worldTimeWorldClockBeanToWorldTime != null) {
                arrayList.add(worldTimeWorldClockBeanToWorldTime);
            }
            i2 = i6;
        }
        worldClockModuleD = worldClockController.d();
        if (worldClockModuleD != null) {
            hVar.a = null;
            hVar.b = null;
            hVar.e = 2;
            objQueryVersion$default = worldClockModuleD.setWorldClock(arrayList, hVar);
            if (objQueryVersion$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            bool = (Boolean) objQueryVersion$default;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
        }
        HMLog.info(b, new l(zBooleanValue));
        return Unit.INSTANCE;
    }
}
