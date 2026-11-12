package com.xiaomi.hm.health.device.equalizer;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.arch.helper.Resource;
import com.huami.bluetooth.profile.ecf.data.EqUnit;
import com.huami.bluetooth.profile.ecf.data.Equalizer;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.classic.EqEntity;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMBoltClassicDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.MozartDevice;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 A2\u00020\u00012\u00020\u0002:\u0001\u0016B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b?\u0010@J\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002J\f\u0010\u0006\u001a\u00020\u0003*\u00020\u0004H\u0002J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011R\u0019\u0010\u001a\u001a\u00020\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010!\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001d\u0010%\u001a\u00020\"8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b\u001b\u0010$R\u0018\u0010(\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R)\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0*0)8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b,\u0010-R$\u00100\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010*0)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010/R\u001c\u00102\u001a\b\u0012\u0004\u0012\u00020+0)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/R\u0018\u00105\u001a\u0004\u0018\u0001038B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u00104R\u0013\u00109\u001a\u0002068F@\u0006¢\u0006\u0006\u001a\u0004\b7\u00108R!\u0010=\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010*0:8F@\u0006¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0019\u0010>\u001a\b\u0012\u0004\u0012\u00020+0:8F@\u0006¢\u0006\u0006\u001a\u0004\b>\u0010<¨\u0006B"}, d2 = {"Lcom/xiaomi/hm/health/device/equalizer/EqualizerViewModel;", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/bluetooth/profile/ecf/data/Equalizer;", "Lcom/xiaomi/hm/health/bt/classic/EqEntity;", "e", "f", "", "c", "()Ljava/lang/Double;", "", "loadEntity", "entity", "setEqualizer", "saveEqualizer", "", "getFrequency", "", "type", "getGain", "getDefaultEq", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "a", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "getDeviceSource", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "b", "Ljava/lang/Byte;", "getCustomEqType", "()Ljava/lang/Byte;", "setCustomEqType", "(Ljava/lang/Byte;)V", "customEqType", "Lcom/huami/devicex/manager/DeviceManagerApi;", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", GoogleApiAvailabilityLight.a, "Lcom/huami/bluetooth/profile/ecf/data/Equalizer;", "customEqualizer", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/arch/helper/Resource;", "", "getSaveEqualizerLiveData", "()Landroidx/lifecycle/MutableLiveData;", "saveEqualizerLiveData", "Landroidx/lifecycle/MutableLiveData;", "_equalizerEntityLiveData", "g", "_isDisableEqualizer", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "()Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "Lkotlin/ranges/IntRange;", "getGainRange", "()Lkotlin/ranges/IntRange;", "gainRange", "Landroidx/lifecycle/LiveData;", "getEqualizerEntityLiveData", "()Landroidx/lifecycle/LiveData;", "equalizerEntityLiveData", "isDisableEqualizer", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;)V", "h", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class EqualizerViewModel extends ViewModel implements KoinComponent {

    @Deprecated
    public static final int DEFAULT_GAIN = 0;

    @Deprecated
    public static final double DEFAULT_MASTER_GAIN = 0.0d;

    @Deprecated
    @NotNull
    public static final String TAG = "EqualizerViewModel";

    @NotNull
    private static final a h = new a(null);

    @Deprecated
    @NotNull
    private static final int[] i = {63, 100, 160, 250, 500, 1000, 2000, 4000, 8000, 16000};

    @Deprecated
    @NotNull
    private static final Map<Byte, int[]> j = r.mapOf(TuplesKt.to((byte) 1, new int[]{5, 2, 0, -3, -6, -6, -3, 0, 1, 3}), TuplesKt.to((byte) 2, new int[]{6, 6, 3, 0, 0, -4, -6, -6, 0, 0}), TuplesKt.to((byte) 3, new int[]{3, 6, 6, 3, -2, 0, 4, 5, 6, 6}), TuplesKt.to((byte) 4, new int[]{0, 0, 0, 0, 0, 0, -5, -5, -6, -6}), TuplesKt.to((byte) 5, new int[]{0, 0, 2, 4, 4, 4, 0, 1, 3, 3}), TuplesKt.to((byte) 6, new int[]{5, 4, 2, 1, -2, 0, 3, 5, 6, 6}), TuplesKt.to((byte) 7, new int[]{6, 5, 0, -5, -4, 0, 5, 6, 6, 6}), TuplesKt.to((byte) 8, new int[]{6, 4, -4, 6, -2, 1, 5, 6, 6, 6}), TuplesKt.to((byte) 9, new int[]{4, 5, 2, -5, 1, 1, -4, 3, 6, 5}), TuplesKt.to((byte) 10, new int[]{-2, -1, -1, 0, 3, 5, 3, 0, 0, 1}));

    @Deprecated
    @NotNull
    private static final IntRange k = new IntRange(-6, 6);

    @Deprecated
    @NotNull
    private static final int[] l = {31, 62, 125, 250, 500, 1000, 2000, 4000, 8000, 16000};

    @Deprecated
    @NotNull
    private static final Map<Byte, int[]> m = r.mapOf(TuplesKt.to((byte) 1, new int[]{4, 2, 0, -3, -4, -4, -3, 0, 1, 3}), TuplesKt.to((byte) 2, new int[]{5, 5, 3, 0, 0, -4, -6, -6, 0, 0}), TuplesKt.to((byte) 3, new int[]{3, 7, 8, 3, -2, 0, 4, 7, 8, 9}), TuplesKt.to((byte) 4, new int[]{0, 0, 0, 0, 0, 0, -6, -6, -6, -7}), TuplesKt.to((byte) 5, new int[]{0, 0, 2, 4, 4, 4, 0, 1, 3, 3}), TuplesKt.to((byte) 6, new int[]{5, 4, 2, 1, -2, 0, 3, 6, 6, 8}), TuplesKt.to((byte) 7, new int[]{6, 5, 0, -5, -4, 0, 5, 7, 7, 7}), TuplesKt.to((byte) 8, new int[]{6, 4, -4, 7, -2, 1, 5, 7, 8, 9}), TuplesKt.to((byte) 9, new int[]{5, 6, 2, -5, 1, 1, -4, 3, 7, 5}), TuplesKt.to((byte) 10, new int[]{-2, -1, -1, 0, 3, 5, 3, 0, 0, 1}));

    @Deprecated
    @NotNull
    private static final Map<Byte, Double> n;

    @Deprecated
    @NotNull
    private static final IntRange o;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HMDeviceSource deviceSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Byte customEqType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private Equalizer customEqualizer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy saveEqualizerLiveData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Resource<EqEntity>> _equalizerEntityLiveData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> _isDisableEqualizer;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            iArr[HMDeviceSource.OTHER_MOZART.ordinal()] = 1;
            iArr[HMDeviceSource.OTHER_HAYDN.ordinal()] = 2;
            iArr[HMDeviceSource.OTHER_BOLT.ordinal()] = 3;
            iArr[HMDeviceSource.OTHER_BOLT_SECOND.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R%\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u000e\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006R%\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\fR%\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00160\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\fR\u0019\u0010\u0019\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011R\u0016\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, d2 = {"com/xiaomi/hm/health/device/equalizer/EqualizerViewModel$a", "", "", "BOLT_EQUALIZER_FREQUENCY", "[I", "a", "()[I", "", "", "BOLT_GAINS_MAP", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "Lkotlin/ranges/IntRange;", "BOLT_GAIN_RANGE", "Lkotlin/ranges/IntRange;", "c", "()Lkotlin/ranges/IntRange;", "MOZART_EQUALIZER_FREQUENCY", GoogleApiAvailabilityLight.a, "MOZART_GAINS_MAP", "e", "", "MOZART_MASTER_GAIN", "g", "MOZART_GAIN_RANGE", "f", "", "DEFAULT_GAIN", LogUtil.I, "DEFAULT_MASTER_GAIN", LogUtil.D, "", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final int[] a() {
            return EqualizerViewModel.i;
        }

        @NotNull
        public final Map<Byte, int[]> b() {
            return EqualizerViewModel.j;
        }

        @NotNull
        public final IntRange c() {
            return EqualizerViewModel.k;
        }

        @NotNull
        public final int[] d() {
            return EqualizerViewModel.l;
        }

        @NotNull
        public final Map<Byte, int[]> e() {
            return EqualizerViewModel.m;
        }

        @NotNull
        public final IntRange f() {
            return EqualizerViewModel.o;
        }

        @NotNull
        public final Map<Byte, Double> g() {
            return EqualizerViewModel.n;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.equalizer.EqualizerViewModel$saveEqualizer$1", f = "EqualizerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ EqEntity c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EqEntity eqEntity, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = eqEntity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EqualizerViewModel.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MutableLiveData<Resource<Boolean>> saveEqualizerLiveData = EqualizerViewModel.this.getSaveEqualizerLiveData();
            Resource.Companion companion = Resource.INSTANCE;
            saveEqualizerLiveData.postValue(Resource.Companion.loading$default(companion, null, 1, null));
            HMBaseDevice hMBaseDeviceA = EqualizerViewModel.this.a();
            if (hMBaseDeviceA instanceof MozartDevice) {
                EqualizerViewModel.this.getSaveEqualizerLiveData().postValue(companion.success(Boxing.boxBoolean(((MozartDevice) hMBaseDeviceA).setEqualizer(EqualizerViewModel.this.f(this.c)))));
                return Unit.INSTANCE;
            }
            EqualizerViewModel.this.getSaveEqualizerLiveData().postValue(companion.success(Boxing.boxBoolean(true)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/arch/helper/Resource;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<MutableLiveData<Resource<? extends Boolean>>> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<Resource<Boolean>> invoke() {
            return new MutableLiveData<>();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.hm.health.device.equalizer.EqualizerViewModel$loadEntity$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.equalizer.EqualizerViewModel$loadEntity$1", f = "EqualizerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EqualizerViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            EqEntity eqEntityE;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HMBaseDevice hMBaseDeviceA = EqualizerViewModel.this.a();
            if (hMBaseDeviceA instanceof HMBoltClassicDevice) {
                final EqualizerViewModel equalizerViewModel = EqualizerViewModel.this;
                ((HMBoltClassicDevice) hMBaseDeviceA).getEq(new HMCallback<EqEntity>() { // from class: com.xiaomi.hm.health.device.equalizer.EqualizerViewModel.loadEntity.1.1
                    @Override // com.xiaomi.hm.health.bt.device.HMCallback
                    public void onStart() {
                        equalizerViewModel._equalizerEntityLiveData.postValue(Resource.Companion.loading$default(Resource.INSTANCE, null, 1, null));
                    }

                    @Override // com.xiaomi.hm.health.bt.device.HMCallback
                    public void onData(@Nullable EqEntity t) {
                        equalizerViewModel._equalizerEntityLiveData.postValue(Resource.INSTANCE.success(t));
                    }
                });
            }
            if (hMBaseDeviceA instanceof MozartDevice) {
                EqualizerViewModel.this._equalizerEntityLiveData.postValue(Resource.Companion.loading$default(Resource.INSTANCE, null, 1, null));
                Equalizer equalizer = ((MozartDevice) hMBaseDeviceA).getEqualizer(true);
                if (equalizer != null && equalizer.getEqType() == -1 && EqualizerViewModel.this.getDeviceSource() == HMDeviceSource.OTHER_MOZART) {
                    int[] frequency = EqualizerViewModel.this.getFrequency();
                    ArrayList arrayList = new ArrayList(frequency.length);
                    for (int i : frequency) {
                        arrayList.add(new EqUnit(Boxing.boxInt(i).intValue(), 0));
                    }
                    equalizer = new Equalizer(0, arrayList, Boxing.boxDouble(0.0d));
                }
                if (equalizer == null) {
                    eqEntityE = null;
                } else {
                    eqEntityE = EqualizerViewModel.this.e(equalizer);
                    EqualizerViewModel equalizerViewModel2 = EqualizerViewModel.this;
                    if (eqEntityE.getEqUnits().isEmpty() || eqEntityE.getEqUnits().size() < 10) {
                        eqEntityE = equalizerViewModel2.getDefaultEq(eqEntityE.getType());
                    }
                }
                EqualizerViewModel.this.customEqualizer = equalizer != null ? Equalizer.copy$default(equalizer, 0, null, null, 6, null) : null;
                EqualizerViewModel.this._equalizerEntityLiveData.postValue(Resource.INSTANCE.success(eqEntityE));
                EqualizerViewModel.this._isDisableEqualizer.postValue(Boxing.boxBoolean(equalizer != null && equalizer.getEqType() == -1));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.hm.health.device.equalizer.EqualizerViewModel$setEqualizer$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.equalizer.EqualizerViewModel$setEqualizer$1", f = "EqualizerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C15761 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ EqEntity c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15761(EqEntity eqEntity, Continuation<? super C15761> continuation) {
            super(2, continuation);
            this.c = eqEntity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EqualizerViewModel.this.new C15761(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C15761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HMBaseDevice hMBaseDeviceA = EqualizerViewModel.this.a();
            if (hMBaseDeviceA instanceof HMBoltClassicDevice) {
                if (this.c.getType() == -1) {
                    this.c.setType((byte) 0);
                }
                ((HMBoltClassicDevice) hMBaseDeviceA).setEq(this.c, new HMCallback<Boolean>() { // from class: com.xiaomi.hm.health.device.equalizer.EqualizerViewModel.setEqualizer.1.1

                    /* JADX INFO: renamed from: com.xiaomi.hm.health.device.equalizer.EqualizerViewModel$setEqualizer$1$1$a */
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
                        public final String invoke() {
                            return "setEq ret: " + this.a;
                        }
                    }

                    @Override // com.xiaomi.hm.health.bt.device.HMCallback
                    public /* bridge */ /* synthetic */ void onFinish(Boolean bool) {
                        onFinish(bool.booleanValue());
                    }

                    @Override // com.xiaomi.hm.health.bt.device.HMCallback
                    public void onFinish(boolean result) {
                        HMLog.info(EqualizerViewModel.TAG, new a(result));
                    }
                });
            } else if (hMBaseDeviceA instanceof MozartDevice) {
                ((MozartDevice) hMBaseDeviceA).applyEqualizer(EqualizerViewModel.this.f(this.c));
            }
            return Unit.INSTANCE;
        }
    }

    static {
        Double dValueOf = Double.valueOf(0.0d);
        Double dValueOf2 = Double.valueOf(-3.0d);
        Double dValueOf3 = Double.valueOf(-8.5d);
        n = r.mapOf(TuplesKt.to((byte) 1, dValueOf), TuplesKt.to((byte) 2, dValueOf2), TuplesKt.to((byte) 3, dValueOf3), TuplesKt.to((byte) 4, Double.valueOf(3.0d)), TuplesKt.to((byte) 5, Double.valueOf(-4.0d)), TuplesKt.to((byte) 6, Double.valueOf(-6.0d)), TuplesKt.to((byte) 7, Double.valueOf(-7.0d)), TuplesKt.to((byte) 8, dValueOf3), TuplesKt.to((byte) 9, Double.valueOf(-4.5d)), TuplesKt.to((byte) 10, dValueOf2), TuplesKt.to((byte) 0, Double.valueOf(-8.0d)), TuplesKt.to((byte) -1, dValueOf));
        o = new IntRange(-12, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EqualizerViewModel(@NotNull HMDeviceSource hMDeviceSource) {
        this.deviceSource = hMDeviceSource;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.equalizer.EqualizerViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceManagerApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
        this.saveEqualizerLiveData = LazyKt__LazyJVMKt.lazy(c.a);
        MutableLiveData<Resource<EqEntity>> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(null);
        Unit unit = Unit.INSTANCE;
        this._equalizerEntityLiveData = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        mutableLiveData2.setValue(Boolean.FALSE);
        this._isDisableEqualizer = mutableLiveData2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HMBaseDevice a() {
        return b().getDevice(this.deviceSource.getType());
    }

    private final DeviceManagerApi b() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final Double c() {
        Double d;
        Byte b2 = this.customEqType;
        if (b2 == null) {
            d = null;
        } else {
            byte bByteValue = b2.byteValue();
            Map<Byte, Double> map = n;
            d = map.get(Byte.valueOf(bByteValue));
            if (d == null) {
                d = map.get((byte) 0);
            }
        }
        if (d != null) {
            return d;
        }
        Equalizer equalizer = this.customEqualizer;
        if (equalizer == null) {
            return null;
        }
        return equalizer.getMasterGain();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EqEntity e(Equalizer equalizer) {
        List<EqUnit> eqList = equalizer.getEqList();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(eqList, 10));
        for (EqUnit eqUnit : eqList) {
            arrayList.add(new com.xiaomi.hm.health.bt.classic.EqUnit(eqUnit.getFrequency(), EqualizerViewModelKt.toBoltByte(eqUnit.getGain())));
        }
        return new EqEntity(new ArrayList(arrayList), (byte) equalizer.getEqType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Equalizer f(EqEntity eqEntity) {
        ArrayList<com.xiaomi.hm.health.bt.classic.EqUnit> eqUnits = eqEntity.getEqUnits();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(eqUnits, 10));
        for (com.xiaomi.hm.health.bt.classic.EqUnit eqUnit : eqUnits) {
            arrayList.add(new EqUnit(eqUnit.getFrequency(), EqualizerViewModelKt.toBoltInt(eqUnit.getGain())));
        }
        return new Equalizer(eqEntity.getType(), arrayList, c());
    }

    @Nullable
    public final Byte getCustomEqType() {
        return this.customEqType;
    }

    @NotNull
    public final EqEntity getDefaultEq(byte type) {
        int[] gain = getGain(type);
        int[] frequency = getFrequency();
        ArrayList arrayList = new ArrayList(gain.length);
        int length = gain.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList.add(new com.xiaomi.hm.health.bt.classic.EqUnit(frequency[i3], EqualizerViewModelKt.toBoltByte(gain[i2])));
            i2++;
            i3++;
        }
        return new EqEntity(new ArrayList(arrayList), type);
    }

    @NotNull
    public final HMDeviceSource getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    public final LiveData<Resource<EqEntity>> getEqualizerEntityLiveData() {
        return this._equalizerEntityLiveData;
    }

    @NotNull
    public final int[] getFrequency() {
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.deviceSource.ordinal()];
        return (int[]) ((i2 == 1 || i2 == 2) ? l : i).clone();
    }

    @NotNull
    public final int[] getGain(byte type) {
        HMDeviceSource hMDeviceSource = this.deviceSource;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i2 = iArr[hMDeviceSource.ordinal()];
        int[] iArr2 = (i2 == 1 || i2 == 2) ? m.get(Byte.valueOf(type)) : (i2 == 3 || i2 == 4) ? j.get(Byte.valueOf(type)) : null;
        if (iArr2 != null) {
            return iArr2;
        }
        int i3 = iArr[getDeviceSource().ordinal()];
        int[] iArr3 = (i3 == 1 || i3 == 2) ? l : i;
        ArrayList arrayList = new ArrayList(iArr3.length);
        for (int i4 : iArr3) {
            arrayList.add(0);
        }
        return CollectionsKt___CollectionsKt.toIntArray(arrayList);
    }

    @NotNull
    public final IntRange getGainRange() {
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.deviceSource.ordinal()];
        IntRange intRange = (i2 == 1 || i2 == 2) ? o : k;
        return new IntRange(intRange.getFirst(), intRange.getLast());
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final MutableLiveData<Resource<Boolean>> getSaveEqualizerLiveData() {
        return (MutableLiveData) this.saveEqualizerLiveData.getValue();
    }

    @NotNull
    public final LiveData<Boolean> isDisableEqualizer() {
        return this._isDisableEqualizer;
    }

    public final void loadEntity() {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(null), 2, null);
    }

    public final void saveEqualizer(@NotNull EqEntity entity) {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new b(entity, null), 2, null);
    }

    public final void setCustomEqType(@Nullable Byte b2) {
        this.customEqType = b2;
    }

    public final void setEqualizer(@NotNull EqEntity entity) {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C15761(entity, null), 2, null);
    }
}
