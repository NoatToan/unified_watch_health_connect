package com.huami.bluetooth.profile.channel.module.hearing;

import com.amap.api.mapcore.util.hl;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.base.DeviceRequestHandler;
import com.huami.bluetooth.profile.channel.module.base.Failure;
import com.huami.bluetooth.profile.channel.module.base.ModuleRequest;
import com.huami.bluetooth.profile.channel.module.base.ModuleResult;
import com.huami.bluetooth.profile.channel.module.base.RequestPredict;
import com.huami.bluetooth.profile.channel.module.base.ResponsePredict;
import com.huami.bluetooth.profile.channel.module.base.Success;
import com.huami.bluetooth.profile.channel.module.base.Timeout;
import com.huami.bluetooth.profile.channel.module.hearing.entity.HearingDeviceListener;
import com.huami.bluetooth.profile.channel.module.hearing.entity.battery.BatteryInfo;
import com.huami.bluetooth.profile.channel.module.hearing.entity.battery.DeviceParts;
import com.huami.bluetooth.profile.channel.module.hearing.entity.battery.EarphoneStatus;
import com.huami.bluetooth.utils.BufByteDecoder;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.loc.z;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstruationHelperKt;
import com.xiaomi.hm.health.device.event.StatEvent;
import io.netty.util.internal.StringUtil;
import java.util.HashMap;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001;B\u0017\u0012\u0006\u0010,\u001a\u00020(\u0012\u0006\u00101\u001a\u00020-¢\u0006\u0004\b9\u0010:J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J,\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0010H\u0002J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0010H\u0002J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0010H\u0002J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0010H\u0002J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J&\u0010!\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0014\u0010 \u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\u001fH\u0002J<\u0010#\u001a\u00020\u000422\u0010\"\u001a.\u0012$\u0012\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u0001`\n\u0012\u0004\u0012\u00020\u00040\u001fH\u0016J\u0010\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$H\u0016J\u001c\u0010'\u001a\u00020\u00042\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u001fH\u0016R\u0019\u0010,\u001a\u00020(8\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010)\u001a\u0004\b*\u0010+R\u001c\u00101\u001a\u00020-8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010.\u001a\u0004\b/\u00100R\u001c\u00106\u001a\u0002028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0015\u00103\u001a\u0004\b4\u00105R\u0018\u00108\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u00107¨\u0006<"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/HearingBatteryApiImpl;", "Lcom/huami/bluetooth/profile/channel/module/hearing/HearingBatteryApi;", "", HTTP.CONTENT_RANGE_BYTES, "", z.j, "data", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/hearing/entity/battery/DeviceParts;", "Lcom/huami/bluetooth/profile/channel/module/hearing/entity/battery/BatteryInfo;", "Lkotlin/collections/HashMap;", hl.k, "Lcom/huami/bluetooth/profile/channel/module/hearing/entity/battery/EarphoneStatus;", "l", "Lcom/huami/bluetooth/utils/BufByteDecoder;", "bufDecoder", "", "flag", "m", "type", "", "c", "a", "g", "h", "b", "f", "e", GoogleApiAvailabilityLight.a, "Lcom/huami/bluetooth/profile/channel/module/base/ModuleRequest;", "request", "Lkotlin/Function1;", "responseData", "i", "onResult", "queryBattery", "Lcom/huami/bluetooth/profile/channel/module/hearing/entity/HearingDeviceListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnHearingListener", "queryEarphoneStatus", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "getModule", "()Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "module", "Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidProtocolVersion;", "Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidProtocolVersion;", "getVersion", "()Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidProtocolVersion;", "version", "", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "Lcom/huami/bluetooth/profile/channel/module/hearing/entity/HearingDeviceListener;", "mHearingListener", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/BaseModule;Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidProtocolVersion;)V", "HearingBatteryPredict", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HearingBatteryApiImpl implements HearingBatteryApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final BaseModule module;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final HearingAidProtocolVersion version;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String TAG = "HearingBatteryApiImpl";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private HearingDeviceListener mHearingListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/HearingBatteryApiImpl$HearingBatteryPredict;", "Lcom/huami/bluetooth/profile/channel/module/base/ResponsePredict;", "Lcom/huami/bluetooth/profile/channel/module/base/ModuleRequest;", "request", "", AbstractJSONTokenResponse.RESPONSE, "", "predict", "", "a", LogUtil.I, "getFirst", "()I", "setFirst", "(I)V", StatEvent.TP_FIRST, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class HearingBatteryPredict implements ResponsePredict {

        @NotNull
        public static final HearingBatteryPredict INSTANCE = new HearingBatteryPredict();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private static int first = -1;

        private HearingBatteryPredict() {
        }

        public final int getFirst() {
            return first;
        }

        @Override // com.huami.bluetooth.profile.channel.module.base.ResponsePredict
        public boolean predict(@NotNull ModuleRequest request, @NotNull byte[] response) {
            if (response.length <= 2) {
                return false;
            }
            byte bFirst = ArraysKt___ArraysKt.first(response);
            Debug.fi(MenstruationHelperKt.TAG, "response first byte to Int: " + ((int) bFirst) + "  predict first: " + first);
            return bFirst == first;
        }

        public final void setFirst(int i) {
            first = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<byte[], Unit> {
        public a(HearingBatteryApiImpl hearingBatteryApiImpl) {
            super(1, hearingBatteryApiImpl, HearingBatteryApiImpl.class, "onDeviceCommand", "onDeviceCommand([B)V", 0);
        }

        public final void a(@NotNull byte[] bArr) {
            ((HearingBatteryApiImpl) this.receiver).j(bArr);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.hearing.HearingBatteryApiImpl$handleQueryResponse$1", f = "HearingBatteryApiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ModuleRequest b;
        public final /* synthetic */ HearingBatteryApiImpl c;
        public final /* synthetic */ Function1<byte[], Unit> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(ModuleRequest moduleRequest, HearingBatteryApiImpl hearingBatteryApiImpl, Function1<? super byte[], Unit> function1, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = moduleRequest;
            this.c = hearingBatteryApiImpl;
            this.d = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.b, this.c, this.d, continuation);
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
            this.b.setTimeout(20000L);
            ModuleResult<byte[]> moduleResultSendRequest = this.c.getModule().sendRequest(this.b);
            Function1<byte[], Unit> function1 = this.d;
            HearingBatteryApiImpl hearingBatteryApiImpl = this.c;
            if (moduleResultSendRequest instanceof Success) {
                function1.invoke((byte[]) ((Success) moduleResultSendRequest).getData());
            } else if (moduleResultSendRequest instanceof Failure) {
                Debug.fi(hearingBatteryApiImpl.getTAG(), Intrinsics.stringPlus("fail ", ((Failure) moduleResultSendRequest).getMsg()));
                function1.invoke(null);
            } else if (moduleResultSendRequest instanceof Timeout) {
                Debug.fi(hearingBatteryApiImpl.getTAG(), "time out");
                function1.invoke(null);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<byte[], Unit> {
        public final /* synthetic */ Function1<HashMap<DeviceParts, BatteryInfo>, Unit> a;
        public final /* synthetic */ HearingBatteryApiImpl b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function1<? super HashMap<DeviceParts, BatteryInfo>, Unit> function1, HearingBatteryApiImpl hearingBatteryApiImpl) {
            super(1);
            this.a = function1;
            this.b = hearingBatteryApiImpl;
        }

        public final void a(@Nullable byte[] bArr) {
            if (bArr == null) {
                bArr = null;
            } else {
                this.a.invoke(this.b.k(bArr));
            }
            if (bArr == null) {
                this.a.invoke(null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<byte[], Unit> {
        public final /* synthetic */ Function1<EarphoneStatus, Unit> a;
        public final /* synthetic */ HearingBatteryApiImpl b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function1<? super EarphoneStatus, Unit> function1, HearingBatteryApiImpl hearingBatteryApiImpl) {
            super(1);
            this.a = function1;
            this.b = hearingBatteryApiImpl;
        }

        public final void a(@Nullable byte[] bArr) {
            if (bArr == null) {
                bArr = null;
            } else {
                this.a.invoke(this.b.l(bArr));
            }
            if (bArr == null) {
                this.a.invoke(new EarphoneStatus(false, false, 3, null));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    public HearingBatteryApiImpl(@NotNull BaseModule baseModule, @NotNull HearingAidProtocolVersion hearingAidProtocolVersion) {
        this.module = baseModule;
        this.version = hearingAidProtocolVersion;
        baseModule.registerDeviceRequestHandler(new DeviceRequestHandler(new a(this), new RequestPredict() { // from class: com.huami.bluetooth.profile.channel.module.hearing.HearingBatteryApiImpl.2
            @Override // com.huami.bluetooth.profile.channel.module.base.RequestPredict
            public boolean predict(@NotNull byte[] byteArray) {
                return true;
            }
        }));
    }

    private final boolean a(int type) {
        return ((type >>> 1) & 1) == 1;
    }

    private final boolean b(int flag) {
        return flag == 1;
    }

    private final boolean c(int type) {
        return type == 1;
    }

    private final boolean d(int flag) {
        return ((flag >>> 3) & 1) == 1;
    }

    private final boolean e(int flag) {
        return ((flag >>> 2) & 1) == 1;
    }

    private final boolean f(int flag) {
        return ((flag >>> 1) & 1) == 1;
    }

    private final boolean g(int type) {
        return ((type >>> 2) & 1) == 1;
    }

    private final boolean h(int type) {
        return ((type >>> 3) & 1) == 1;
    }

    private final void i(ModuleRequest request, Function1<? super byte[], Unit> responseData) {
        e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new b(request, this, responseData, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(byte[] bytes) {
        HearingDeviceListener hearingDeviceListener;
        Debug.fi(this.TAG, Intrinsics.stringPlus("onDeviceCommand: ", GattUtils.bytesToHexString(bytes)));
        int i = new BufByteDecoder(bytes, 0, 2, null).readByte();
        if (i == HearingBatteryCommand.NotifyBatteryCommand.INSTANCE.getCmd()) {
            HearingDeviceListener hearingDeviceListener2 = this.mHearingListener;
            if (hearingDeviceListener2 == null) {
                return;
            }
            hearingDeviceListener2.onBattery(k(bytes));
            return;
        }
        if (i != HearingBatteryCommand.NotifyEarphoneStatusCommand.INSTANCE.getCmd() || (hearingDeviceListener = this.mHearingListener) == null) {
            return;
        }
        hearingDeviceListener.onEarphone(l(bytes));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HashMap<DeviceParts, BatteryInfo> k(byte[] data) {
        Debug.fi(this.TAG, Intrinsics.stringPlus("parse data: ", GattUtils.bytesToHexString(data)));
        HashMap<DeviceParts, BatteryInfo> map = new HashMap<>();
        BufByteDecoder bufByteDecoder = new BufByteDecoder(data, 0, 2, null);
        int i = bufByteDecoder.readByte();
        int i2 = bufByteDecoder.readByte();
        int i3 = bufByteDecoder.readByte();
        Debug.fi(this.TAG, "response cmd: " + i + " hex: " + ((Object) GattUtils.bytesToHexString(ByteUtilsKt.toByteArray$default(i, 0, 1, null))));
        Debug.fi(this.TAG, "type: " + i2 + " hex: " + ((Object) GattUtils.bytesToHexString(ByteUtilsKt.toByteArray$default(i2, 0, 1, null))));
        Debug.fi(this.TAG, "flag: " + i3 + " hex: " + ((Object) GattUtils.bytesToHexString(ByteUtilsKt.toByteArray$default(i3, 0, 1, null))));
        boolean zC = c(i2);
        boolean zA = a(i2);
        boolean zG = g(i2);
        boolean zH = h(i2);
        Debug.fi(this.TAG, "headset: " + zC + ", charge: " + zA + ", left: " + zG + ", right: " + zH);
        if (zC) {
            map.put(DeviceParts.HEADSET, m(bufByteDecoder, i3));
        }
        if (zA) {
            map.put(DeviceParts.CHARGE_HOUSE, m(bufByteDecoder, i3));
        }
        if (zG) {
            map.put(DeviceParts.LEFT_EAR_PHONE, m(bufByteDecoder, i3));
        }
        if (zH) {
            map.put(DeviceParts.RIGHT_EAR_PHONE, m(bufByteDecoder, i3));
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EarphoneStatus l(byte[] data) {
        Debug.fi(this.TAG, Intrinsics.stringPlus("parse data: ", GattUtils.bytesToHexString(data)));
        BufByteDecoder bufByteDecoder = new BufByteDecoder(data, 0, 2, null);
        bufByteDecoder.readByte();
        return new EarphoneStatus(bufByteDecoder.readByte() == 1, bufByteDecoder.readByte() == 1);
    }

    private final BatteryInfo m(BufByteDecoder bufDecoder, int flag) {
        BatteryInfo batteryInfo = new BatteryInfo(0, false, null, null, 0, 31, null);
        batteryInfo.setRemainElectricity(bufDecoder.readByte());
        boolean zB = b(flag);
        boolean zF = f(flag);
        boolean zE = e(flag);
        boolean zD = d(flag);
        Debug.fi(this.TAG, "charge status: " + zB + ", full charge: " + zF + ", last charge: " + zE + ", last level: " + zD);
        if (zB) {
            batteryInfo.setCharging(bufDecoder.readBoolean());
        }
        if (zF) {
            byte[] bytes = bufDecoder.readBytes(2);
            int i = bufDecoder.readByte();
            int i2 = bufDecoder.readByte();
            int i3 = bufDecoder.readByte();
            int i4 = bufDecoder.readByte();
            int i5 = bufDecoder.readByte();
            TimeZone timezone = ProfileUtils.getTimezone((byte) bufDecoder.readByte());
            StringBuilder sb = new StringBuilder();
            sb.append((Object) timezone.getDisplayName());
            sb.append(StringUtil.SPACE);
            sb.append(bytes);
            sb.append('-');
            sb.append(i);
            sb.append('-');
            sb.append(i2);
            sb.append(StringUtil.SPACE);
            sb.append(i3);
            sb.append(JsonLexerKt.COLON);
            sb.append(i4);
            sb.append(JsonLexerKt.COLON);
            sb.append(i5);
            batteryInfo.setLastTimeFullCharge(sb.toString());
        }
        if (zE) {
            byte[] bytes2 = bufDecoder.readBytes(2);
            int i6 = bufDecoder.readByte();
            int i7 = bufDecoder.readByte();
            int i8 = bufDecoder.readByte();
            int i9 = bufDecoder.readByte();
            int i10 = bufDecoder.readByte();
            TimeZone timezone2 = ProfileUtils.getTimezone((byte) bufDecoder.readByte());
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) timezone2.getDisplayName());
            sb2.append(StringUtil.SPACE);
            sb2.append(bytes2);
            sb2.append('-');
            sb2.append(i6);
            sb2.append('-');
            sb2.append(i7);
            sb2.append(StringUtil.SPACE);
            sb2.append(i8);
            sb2.append(JsonLexerKt.COLON);
            sb2.append(i9);
            sb2.append(JsonLexerKt.COLON);
            sb2.append(i10);
            batteryInfo.setLastTimeFullCharge(sb2.toString());
        }
        if (zD) {
            batteryInfo.setLevelLastCharge(bufDecoder.readByte());
        }
        Debug.fi(this.TAG, batteryInfo.toString());
        return batteryInfo;
    }

    @NotNull
    public final BaseModule getModule() {
        return this.module;
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    @Override // com.huami.bluetooth.profile.channel.module.hearing.HearingBatteryApi
    @NotNull
    public HearingAidProtocolVersion getVersion() {
        return this.version;
    }

    @Override // com.huami.bluetooth.profile.channel.module.hearing.HearingBatteryApi
    public void queryBattery(@NotNull Function1<? super HashMap<DeviceParts, BatteryInfo>, Unit> onResult) {
        HearingBatteryCommand.QueryBatteryCommand queryBatteryCommand = HearingBatteryCommand.QueryBatteryCommand.INSTANCE;
        HearingBatteryPredict hearingBatteryPredict = HearingBatteryPredict.INSTANCE;
        hearingBatteryPredict.setFirst(HearingBatteryCommand.NotifyBatteryCommand.INSTANCE.getCmd());
        Unit unit = Unit.INSTANCE;
        i(new ModuleRequest(queryBatteryCommand, hearingBatteryPredict, 0L, null, false, 28, null), new c(onResult, this));
    }

    @Override // com.huami.bluetooth.profile.channel.module.hearing.HearingBatteryApi
    public void queryEarphoneStatus(@NotNull Function1<? super EarphoneStatus, Unit> onResult) {
        HearingBatteryCommand.QueryEarphoneStatusCommand queryEarphoneStatusCommand = HearingBatteryCommand.QueryEarphoneStatusCommand.INSTANCE;
        HearingBatteryPredict hearingBatteryPredict = HearingBatteryPredict.INSTANCE;
        hearingBatteryPredict.setFirst(HearingBatteryCommand.NotifyEarphoneStatusCommand.INSTANCE.getCmd());
        Unit unit = Unit.INSTANCE;
        i(new ModuleRequest(queryEarphoneStatusCommand, hearingBatteryPredict, 0L, null, false, 28, null), new d(onResult, this));
    }

    @Override // com.huami.bluetooth.profile.channel.module.hearing.HearingBatteryApi
    public void setOnHearingListener(@NotNull HearingDeviceListener listener) {
        this.mHearingListener = listener;
    }
}
