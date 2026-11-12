package com.huami.bluetooth.profile.channel.module.hearing;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.auth.AuthModuleKt;
import com.huami.bluetooth.profile.channel.module.base.DeviceRequestHandler;
import com.huami.bluetooth.profile.channel.module.base.Failure;
import com.huami.bluetooth.profile.channel.module.base.ModuleRequest;
import com.huami.bluetooth.profile.channel.module.base.ModuleResult;
import com.huami.bluetooth.profile.channel.module.base.RequestPredict;
import com.huami.bluetooth.profile.channel.module.base.ResponsePredict;
import com.huami.bluetooth.profile.channel.module.base.Success;
import com.huami.bluetooth.profile.channel.module.base.Timeout;
import com.huami.bluetooth.profile.channel.module.hearing.entity.DSPTestParam;
import com.huami.bluetooth.profile.channel.module.hearing.entity.DSPTestResult;
import com.huami.bluetooth.profile.channel.module.hearing.entity.EQParam;
import com.huami.bluetooth.profile.channel.module.hearing.entity.HearingAidBattery;
import com.huami.bluetooth.profile.channel.module.hearing.entity.HearingAidComponents;
import com.huami.bluetooth.profile.channel.module.hearing.entity.HearingAidPositionParam;
import com.huami.bluetooth.profile.channel.module.hearing.entity.HearingCmdResponse;
import com.huami.bluetooth.profile.channel.module.hearing.entity.HearingFavorite;
import com.huami.bluetooth.profile.channel.module.hearing.entity.HearingScenes;
import com.huami.bluetooth.profile.channel.module.hearing.entity.HearingSelectedModes;
import com.huami.bluetooth.profile.channel.module.hearing.entity.HighBassParam;
import com.huami.bluetooth.profile.channel.module.hearing.entity.WDRCParam;
import com.huami.bluetooth.utils.BufByteDecoder;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstruationHelperKt;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineAnalyticsKt;
import com.xiaomi.hm.health.lab.utils.BehaviorTaggingWebApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001PB\u0017\u0012\u0006\u0010>\u001a\u00020:\u0012\u0006\u0010M\u001a\u00020C¢\u0006\u0004\bN\u0010OJ*\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H\u0002J&\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00070\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000bH\u0002J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J*\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H\u0016J*\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u001a2\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H\u0016J*\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u001c2\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H\u0016J*\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001e2\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H\u0016J*\u0010\"\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020!2\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H\u0016J*\u0010$\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020#2\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H\u0016J&\u0010&\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00062\u0014\u0010\u0018\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00070\nH\u0016J\u001e\u0010'\u001a\u00020\u00072\u0014\u0010\u0018\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u00070\nH\u0016J.\u0010)\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\u0014\u0010\u0018\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\u00070\nH\u0016J&\u0010+\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00062\u0014\u0010\u0018\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010*\u0012\u0004\u0012\u00020\u00070\nH\u0016J&\u0010,\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00062\u0014\u0010\u0018\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0004\u0012\u00020\u00070\nH\u0016J&\u0010-\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00062\u0014\u0010\u0018\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010#\u0012\u0004\u0012\u00020\u00070\nH\u0016J\u001e\u0010/\u001a\u00020\u00072\u0014\u0010\u0018\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010.\u0012\u0004\u0012\u00020\u00070\nH\u0016J\"\u00100\u001a\u00020\u00072\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H\u0016J*\u00101\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u001c2\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H\u0016J*\u00102\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H\u0016J$\u00105\u001a\u00020\u00072\u0006\u00104\u001a\u0002032\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\nH\u0016J\"\u00106\u001a\u00020\u00072\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H\u0016J\u0010\u00109\u001a\u00020\u00072\u0006\u00108\u001a\u000207H\u0016R\u0019\u0010>\u001a\u00020:8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\b<\u0010=R\u001c\u0010B\u001a\u00020\u00138\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\r\u0010?\u001a\u0004\b@\u0010AR\u001c\u0010G\u001a\u00020C8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010D\u001a\u0004\bE\u0010FR\u0016\u0010J\u001a\u00020H8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010IR\u0018\u0010L\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010K¨\u0006Q"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidApiImpl;", "Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidApi;", "Lcom/huami/bluetooth/profile/channel/module/base/ModuleRequest;", "request", "Lkotlin/Function2;", "", "", "", "action", "c", "Lkotlin/Function1;", "", "responseData", "b", HMFwOnlineAnalyticsKt.BATTERY, "a", GoogleApiAvailabilityLight.a, "byteArray", "f", "", "str", "e", "Lcom/huami/bluetooth/profile/channel/module/hearing/entity/HighBassParam;", "param", "onResult", "setHighBass", "Lcom/huami/bluetooth/profile/channel/module/hearing/entity/HearingScenes;", "setHearingMode", "Lcom/huami/bluetooth/profile/channel/module/hearing/entity/EQParam;", "setEQ", "Lcom/huami/bluetooth/profile/channel/module/hearing/entity/DSPTestParam;", "dsp", "setDSP", "Lcom/huami/bluetooth/profile/channel/module/hearing/entity/HearingAidPositionParam;", "setHearingPosition", "Lcom/huami/bluetooth/profile/channel/module/hearing/entity/WDRCParam;", "setWDRC", "scene", "getHighBass", "getHearingMode", "hearingAidPosition", "getEQ", "Lcom/huami/bluetooth/profile/channel/module/hearing/entity/DSPTestResult;", "getDSP", "getHearingPosition", "getWDRC", "Lcom/huami/bluetooth/profile/channel/module/hearing/entity/HearingAidBattery;", "getHearingAidBattery", "deviceDiscovery", "resetUnusedEQ", "resetUnusedHighBass", "Lcom/huami/bluetooth/profile/channel/module/hearing/entity/HearingAidComponents;", "component", "getSn", "reportDeviceBound", "Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnHearingListener", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "getModule", "()Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "module", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidProtocolVersion;", "Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidProtocolVersion;", "getVersion", "()Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidProtocolVersion;", "version", "", "J", "timeout", "Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidListener;", "mHearingAidListener", BehaviorTaggingWebApi.g.g, "<init>", "(Lcom/huami/bluetooth/profile/channel/module/BaseModule;Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidProtocolVersion;)V", "HearingAidPredict", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HearingAidApiImpl implements HearingAidApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final BaseModule module;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String TAG = "HearingAid";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final HearingAidProtocolVersion version;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long timeout;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private HearingAidListener mHearingAidListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidApiImpl$HearingAidPredict;", "Lcom/huami/bluetooth/profile/channel/module/base/ResponsePredict;", "Lcom/huami/bluetooth/profile/channel/module/base/ModuleRequest;", "request", "", AbstractJSONTokenResponse.RESPONSE, "", "predict", "", "a", LogUtil.I, "getFirst", "()I", "setFirst", "(I)V", StatEvent.TP_FIRST, "b", "getCmd", "setCmd", Constant.h, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class HearingAidPredict implements ResponsePredict {

        @NotNull
        public static final HearingAidPredict INSTANCE = new HearingAidPredict();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private static int first = -1;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static int cmd = -1;

        private HearingAidPredict() {
        }

        public final int getCmd() {
            return cmd;
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
            int i = first;
            if (i == 0) {
                Integer numSecond = AuthModuleKt.second(response);
                byte b = response[2];
                byte bFirst2 = ArraysKt___ArraysKt.first(request.getBytes());
                Integer numSecond2 = AuthModuleKt.second(request.getBytes());
                Debug.fi(MenstruationHelperKt.TAG, "receivedType: " + numSecond + " receivedCmd: " + ((int) b) + " sendSubType: " + ((int) bFirst2) + " sendCmd: " + numSecond2);
                return numSecond != null && numSecond.intValue() == bFirst2 && numSecond2 != null && b == numSecond2.intValue();
            }
            if (i != 1 && i != 2) {
                return false;
            }
            Integer numSecond3 = AuthModuleKt.second(response);
            byte bFirst3 = ArraysKt___ArraysKt.first(request.getBytes());
            Integer numSecond4 = AuthModuleKt.second(request.getBytes());
            Debug.fi(MenstruationHelperKt.TAG, "receivedType: " + ((int) bFirst) + " receivedCmd: " + numSecond3 + " sendSubType: " + ((int) bFirst3) + " sendCmd: " + numSecond4);
            return Intrinsics.areEqual(numSecond3, numSecond4);
        }

        public final void setCmd(int i) {
            cmd = i;
        }

        public final void setFirst(int i) {
            first = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<byte[], Unit> {
        public a(HearingAidApiImpl hearingAidApiImpl) {
            super(1, hearingAidApiImpl, HearingAidApiImpl.class, "onDeviceCommand", "onDeviceCommand([B)V", 0);
        }

        public final void a(@NotNull byte[] bArr) {
            ((HearingAidApiImpl) this.receiver).f(bArr);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<byte[], Unit> {
        public final /* synthetic */ Function1<DSPTestResult, Unit> a;
        public final /* synthetic */ HearingAidApiImpl b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super DSPTestResult, Unit> function1, HearingAidApiImpl hearingAidApiImpl) {
            super(1);
            this.a = function1;
            this.b = hearingAidApiImpl;
        }

        public final void a(@Nullable byte[] bArr) {
            if (bArr == null) {
                bArr = null;
            } else {
                HearingAidApiImpl hearingAidApiImpl = this.b;
                Function1<DSPTestResult, Unit> function1 = this.a;
                BufByteDecoder bufByteDecoder = new BufByteDecoder(bArr, 0, 2, null);
                bufByteDecoder.readByte();
                bufByteDecoder.readByte();
                DSPTestResult dSPTestResult = new DSPTestResult(bufByteDecoder.readByte(), bufByteDecoder.readByte(), bufByteDecoder.readInt(2), bufByteDecoder.readInt(2));
                Debug.fi(hearingAidApiImpl.getTAG(), dSPTestResult.toString());
                function1.invoke(dSPTestResult);
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
    public static final class c extends Lambda implements Function1<byte[], Unit> {
        public final /* synthetic */ Function1<EQParam, Unit> a;
        public final /* synthetic */ HearingAidApiImpl b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function1<? super EQParam, Unit> function1, HearingAidApiImpl hearingAidApiImpl) {
            super(1);
            this.a = function1;
            this.b = hearingAidApiImpl;
        }

        public final void a(@Nullable byte[] bArr) {
            if (bArr == null) {
                bArr = null;
            } else {
                HearingAidApiImpl hearingAidApiImpl = this.b;
                Function1<EQParam, Unit> function1 = this.a;
                int i = 0;
                BufByteDecoder bufByteDecoder = new BufByteDecoder(bArr, 0, 2, null);
                bufByteDecoder.readByte();
                bufByteDecoder.readByte();
                int i2 = bufByteDecoder.readByte();
                int i3 = bufByteDecoder.readByte();
                int i4 = bufByteDecoder.readByte();
                ArrayList arrayList = new ArrayList();
                if (i4 > 0) {
                    int i5 = 0;
                    do {
                        i5++;
                        arrayList.add(Integer.valueOf(bufByteDecoder.readInt(2)));
                    } while (i5 < i4);
                }
                ArrayList arrayList2 = new ArrayList();
                if (i4 > 0) {
                    do {
                        i++;
                        arrayList2.add(Integer.valueOf(bufByteDecoder.readByte()));
                    } while (i < i4);
                }
                EQParam eQParam = new EQParam(i2, i3, i4, arrayList, arrayList2, bufByteDecoder.readByte());
                Debug.fi(hearingAidApiImpl.getTAG(), eQParam.toString());
                function1.invoke(eQParam);
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
        public final /* synthetic */ Function1<HearingAidBattery, Unit> a;
        public final /* synthetic */ HearingAidApiImpl b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function1<? super HearingAidBattery, Unit> function1, HearingAidApiImpl hearingAidApiImpl) {
            super(1);
            this.a = function1;
            this.b = hearingAidApiImpl;
        }

        public final void a(@Nullable byte[] bArr) {
            boolean zD;
            int iA;
            int i;
            boolean zD2;
            if (bArr == null) {
                bArr = null;
            } else {
                HearingAidApiImpl hearingAidApiImpl = this.b;
                Function1<HearingAidBattery, Unit> function1 = this.a;
                BufByteDecoder bufByteDecoder = new BufByteDecoder(bArr, 0, 2, null);
                bufByteDecoder.readByte();
                bufByteDecoder.readByte();
                int i2 = bufByteDecoder.readByte();
                int iA2 = hearingAidApiImpl.a(i2);
                boolean zD3 = hearingAidApiImpl.d(i2);
                int i3 = bufByteDecoder.readByte();
                if (i3 != 255) {
                    iA = hearingAidApiImpl.a(i3);
                    zD = hearingAidApiImpl.d(i3);
                } else {
                    zD = false;
                    iA = -1;
                }
                int i4 = bufByteDecoder.readByte();
                if (i4 != 255) {
                    int iA3 = hearingAidApiImpl.a(i4);
                    zD2 = hearingAidApiImpl.d(i4);
                    i = iA3;
                } else {
                    i = -1;
                    zD2 = false;
                }
                HearingAidBattery hearingAidBattery = new HearingAidBattery(iA2, zD3, iA, zD, i, zD2);
                Debug.fi(hearingAidApiImpl.getTAG(), hearingAidBattery.toString());
                function1.invoke(hearingAidBattery);
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
    public static final class e extends Lambda implements Function1<byte[], Unit> {
        public final /* synthetic */ Function1<HearingScenes, Unit> a;
        public final /* synthetic */ HearingAidApiImpl b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Function1<? super HearingScenes, Unit> function1, HearingAidApiImpl hearingAidApiImpl) {
            super(1);
            this.a = function1;
            this.b = hearingAidApiImpl;
        }

        public final void a(@Nullable byte[] bArr) {
            if (bArr == null) {
                bArr = null;
            } else {
                HearingAidApiImpl hearingAidApiImpl = this.b;
                Function1<HearingScenes, Unit> function1 = this.a;
                int i = 0;
                BufByteDecoder bufByteDecoder = new BufByteDecoder(bArr, 0, 2, null);
                bufByteDecoder.readByte();
                bufByteDecoder.readByte();
                int i2 = bufByteDecoder.readShort();
                Debug.fi(hearingAidApiImpl.getTAG(), Intrinsics.stringPlus("flag: ", Integer.valueOf(i2)));
                HearingFavorite hearingFavorite = (i2 & 1) == 1 ? new HearingFavorite(bufByteDecoder.readByte(), bufByteDecoder.readByte()) : null;
                int i3 = bufByteDecoder.readByte();
                ArrayList arrayList = new ArrayList();
                if (i3 > 0) {
                    do {
                        i++;
                        arrayList.add(Integer.valueOf(bufByteDecoder.readByte()));
                    } while (i < i3);
                }
                HearingScenes hearingScenes = new HearingScenes(hearingFavorite, new HearingSelectedModes(i3, arrayList));
                Debug.fi(hearingAidApiImpl.getTAG(), hearingScenes.toString());
                function1.invoke(hearingScenes);
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
    public static final class f extends Lambda implements Function1<byte[], Unit> {
        public final /* synthetic */ Function1<HearingAidPositionParam, Unit> a;
        public final /* synthetic */ HearingAidApiImpl b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Function1<? super HearingAidPositionParam, Unit> function1, HearingAidApiImpl hearingAidApiImpl) {
            super(1);
            this.a = function1;
            this.b = hearingAidApiImpl;
        }

        public final void a(@Nullable byte[] bArr) {
            if (bArr == null) {
                bArr = null;
            } else {
                HearingAidApiImpl hearingAidApiImpl = this.b;
                Function1<HearingAidPositionParam, Unit> function1 = this.a;
                BufByteDecoder bufByteDecoder = new BufByteDecoder(bArr, 0, 2, null);
                bufByteDecoder.readByte();
                bufByteDecoder.readByte();
                HearingAidPositionParam hearingAidPositionParam = new HearingAidPositionParam(bufByteDecoder.readByte(), bufByteDecoder.readByte());
                Debug.fi(hearingAidApiImpl.getTAG(), hearingAidPositionParam.toString());
                function1.invoke(hearingAidPositionParam);
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
    public static final class g extends Lambda implements Function1<byte[], Unit> {
        public final /* synthetic */ Function1<HighBassParam, Unit> a;
        public final /* synthetic */ HearingAidApiImpl b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(Function1<? super HighBassParam, Unit> function1, HearingAidApiImpl hearingAidApiImpl) {
            super(1);
            this.a = function1;
            this.b = hearingAidApiImpl;
        }

        public final void a(@Nullable byte[] bArr) {
            if (bArr == null) {
                bArr = null;
            } else {
                HearingAidApiImpl hearingAidApiImpl = this.b;
                Function1<HighBassParam, Unit> function1 = this.a;
                BufByteDecoder bufByteDecoder = new BufByteDecoder(bArr, 0, 2, null);
                bufByteDecoder.readByte();
                bufByteDecoder.readByte();
                HighBassParam highBassParam = new HighBassParam(bufByteDecoder.readByte(), bufByteDecoder.readByte(), bufByteDecoder.readByte(), bufByteDecoder.readByte(), bufByteDecoder.readByte());
                Debug.fi(hearingAidApiImpl.getTAG(), highBassParam.toString());
                function1.invoke(highBassParam);
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
    public static final class h extends Lambda implements Function1<byte[], Unit> {
        public final /* synthetic */ Function1<String, Unit> a;
        public final /* synthetic */ HearingAidApiImpl b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(Function1<? super String, Unit> function1, HearingAidApiImpl hearingAidApiImpl) {
            super(1);
            this.a = function1;
            this.b = hearingAidApiImpl;
        }

        public final void a(@Nullable byte[] bArr) {
            if (bArr == null) {
                bArr = null;
            } else {
                HearingAidApiImpl hearingAidApiImpl = this.b;
                Function1<String, Unit> function1 = this.a;
                Debug.fi(hearingAidApiImpl.getTAG(), Intrinsics.stringPlus("get sn response: ", GattUtils.bytesTo16HexString(bArr)));
                BufByteDecoder bufByteDecoder = new BufByteDecoder(bArr, 0, 2, null);
                bufByteDecoder.readByte();
                bufByteDecoder.readByte();
                bufByteDecoder.readByte();
                String bytesToAscii = bufByteDecoder.readBytesToAscii();
                Debug.fi(hearingAidApiImpl.getTAG(), Intrinsics.stringPlus("sn: ", bytesToAscii));
                if (!hearingAidApiImpl.e(bytesToAscii)) {
                    bytesToAscii = "";
                }
                function1.invoke(bytesToAscii);
            }
            if (bArr == null) {
                this.a.invoke("");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function1<byte[], Unit> {
        public final /* synthetic */ Function1<WDRCParam, Unit> a;
        public final /* synthetic */ HearingAidApiImpl b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(Function1<? super WDRCParam, Unit> function1, HearingAidApiImpl hearingAidApiImpl) {
            super(1);
            this.a = function1;
            this.b = hearingAidApiImpl;
        }

        public final void a(@Nullable byte[] bArr) {
            if (bArr == null) {
                bArr = null;
            } else {
                HearingAidApiImpl hearingAidApiImpl = this.b;
                Function1<WDRCParam, Unit> function1 = this.a;
                int i = 0;
                BufByteDecoder bufByteDecoder = new BufByteDecoder(bArr, 0, 2, null);
                bufByteDecoder.readByte();
                bufByteDecoder.readByte();
                int i2 = bufByteDecoder.readByte();
                int i3 = bufByteDecoder.readByte();
                ArrayList arrayList = new ArrayList();
                if (i3 > 0) {
                    int i4 = 0;
                    do {
                        i4++;
                        arrayList.add(Integer.valueOf(bufByteDecoder.readInt(2)));
                    } while (i4 < i3);
                }
                ArrayList arrayList2 = new ArrayList();
                if (i3 > 0) {
                    do {
                        i++;
                        arrayList2.add(Integer.valueOf(bufByteDecoder.readByte()));
                    } while (i < i3);
                }
                WDRCParam wDRCParam = new WDRCParam(i2, i3, arrayList, arrayList2);
                Debug.fi(hearingAidApiImpl.getTAG(), wDRCParam.toString());
                function1.invoke(wDRCParam);
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.hearing.HearingAidApiImpl$handleGetterCommandRequestAndResponse$1", f = "HearingAidApiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ModuleRequest b;
        public final /* synthetic */ HearingAidApiImpl c;
        public final /* synthetic */ Function1<byte[], Unit> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(ModuleRequest moduleRequest, HearingAidApiImpl hearingAidApiImpl, Function1<? super byte[], Unit> function1, Continuation<? super j> continuation) {
            super(2, continuation);
            this.b = moduleRequest;
            this.c = hearingAidApiImpl;
            this.d = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new j(this.b, this.c, this.d, continuation);
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
            this.b.setTimeout(this.c.timeout);
            ModuleResult<byte[]> moduleResultSendRequest = this.c.getModule().sendRequest(this.b);
            Function1<byte[], Unit> function1 = this.d;
            HearingAidApiImpl hearingAidApiImpl = this.c;
            if (moduleResultSendRequest instanceof Success) {
                function1.invoke((byte[]) ((Success) moduleResultSendRequest).getData());
            } else if (moduleResultSendRequest instanceof Failure) {
                Debug.fi(hearingAidApiImpl.getTAG(), Intrinsics.stringPlus("fail ", ((Failure) moduleResultSendRequest).getMsg()));
                function1.invoke(null);
            } else if (moduleResultSendRequest instanceof Timeout) {
                Debug.fi(hearingAidApiImpl.getTAG(), "time out");
                function1.invoke(null);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.hearing.HearingAidApiImpl$handleSetterCommandRequestAndResponse$1", f = "HearingAidApiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ModuleRequest b;
        public final /* synthetic */ HearingAidApiImpl c;
        public final /* synthetic */ Function2<Boolean, Integer, Unit> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(ModuleRequest moduleRequest, HearingAidApiImpl hearingAidApiImpl, Function2<? super Boolean, ? super Integer, Unit> function2, Continuation<? super k> continuation) {
            super(2, continuation);
            this.b = moduleRequest;
            this.c = hearingAidApiImpl;
            this.d = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new k(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.b.setTimeout(this.c.timeout);
            ModuleResult<byte[]> moduleResultSendRequest = this.c.getModule().sendRequest(this.b);
            HearingAidApiImpl hearingAidApiImpl = this.c;
            Function2<Boolean, Integer, Unit> function2 = this.d;
            if (moduleResultSendRequest instanceof Success) {
                Success success = (Success) moduleResultSendRequest;
                if (((byte[]) success.getData()).length != 4) {
                    Debug.fi(hearingAidApiImpl.getTAG(), "返回数据长度不对，不是4个字节");
                    function2.invoke(Boxing.boxBoolean(false), Boxing.boxInt(-1));
                }
                int unSignInt = AuthModuleKt.toUnSignInt(ArraysKt___ArraysKt.first((byte[]) success.getData()));
                int unSignInt2 = AuthModuleKt.toUnSignInt(((byte[]) success.getData())[1]);
                int unSignInt3 = AuthModuleKt.toUnSignInt(((byte[]) success.getData())[2]);
                byte b = ((byte[]) success.getData())[3];
                Debug.fi(hearingAidApiImpl.getTAG(), new HearingCmdResponse(unSignInt, unSignInt2, unSignInt3, b).toString());
                function2.invoke(Boxing.boxBoolean(b == 0), Boxing.boxInt(b));
            } else if (moduleResultSendRequest instanceof Failure) {
                Debug.fi(hearingAidApiImpl.getTAG(), Intrinsics.stringPlus("fail ", ((Failure) moduleResultSendRequest).getMsg()));
                function2.invoke(Boxing.boxBoolean(false), Boxing.boxInt(-1));
            } else if (moduleResultSendRequest instanceof Timeout) {
                Debug.fi(hearingAidApiImpl.getTAG(), "time out");
                function2.invoke(Boxing.boxBoolean(false), Boxing.boxInt(-1));
            }
            return Unit.INSTANCE;
        }
    }

    public HearingAidApiImpl(@NotNull BaseModule baseModule, @NotNull HearingAidProtocolVersion hearingAidProtocolVersion) {
        this.module = baseModule;
        baseModule.registerDeviceRequestHandler(new DeviceRequestHandler(new a(this), new RequestPredict() { // from class: com.huami.bluetooth.profile.channel.module.hearing.HearingAidApiImpl.2
            @Override // com.huami.bluetooth.profile.channel.module.base.RequestPredict
            public boolean predict(@NotNull byte[] byteArray) {
                return true;
            }
        }));
        this.version = hearingAidProtocolVersion;
        this.timeout = 40000L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int a(int battery) {
        return battery & 127;
    }

    private final void b(ModuleRequest request, Function1<? super byte[], Unit> responseData) {
        kotlinx.coroutines.e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new j(request, this, responseData, null), 3, null);
    }

    private final void c(ModuleRequest request, Function2<? super Boolean, ? super Integer, Unit> action) {
        kotlinx.coroutines.e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new k(request, this, action, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d(int battery) {
        return ((battery >>> 7) & 1) == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e(String str) {
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        for (char c2 : str.toCharArray()) {
            if (!Character.isLetterOrDigit(c2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(byte[] byteArray) {
        BufByteDecoder bufByteDecoder = new BufByteDecoder(byteArray, 0, 2, null);
        bufByteDecoder.readByte();
        int i2 = bufByteDecoder.readByte();
        Debug.fi(this.TAG, Intrinsics.stringPlus("get sn: ", GattUtils.bytesTo16HexString(byteArray)));
        if (i2 == HearingAidCommand.GetSN.INSTANCE.getCmd()) {
            int i3 = bufByteDecoder.readByte();
            String bytesToAscii = bufByteDecoder.readBytesToAscii();
            HearingAidListener hearingAidListener = this.mHearingAidListener;
            if (hearingAidListener == null) {
                return;
            }
            hearingAidListener.onSn(HearingAidComponents.INSTANCE.from(i3), bytesToAscii);
        }
    }

    @Override // com.huami.bluetooth.profile.channel.module.hearing.HearingAidApi
    public void deviceDiscovery(@NotNull Function2<? super Boolean, ? super Integer, Unit> onResult) {
        HearingAidCommand.DeviceRecovery deviceRecovery = HearingAidCommand.DeviceRecovery.INSTANCE;
        HearingAidPredict hearingAidPredict = HearingAidPredict.INSTANCE;
        hearingAidPredict.setFirst(0);
        hearingAidPredict.setCmd(deviceRecovery.getCmd());
        Unit unit = Unit.INSTANCE;
        c(new ModuleRequest(deviceRecovery, hearingAidPredict, 0L, null, false, 28, null), onResult);
    }

    @Override // com.huami.bluetooth.profile.channel.module.hearing.HearingAidApi
    public void getDSP(int hearingAidPosition, @NotNull Function1<? super DSPTestResult, Unit> onResult) {
        HearingAidCommand.GetDSP getDSP = HearingAidCommand.GetDSP.INSTANCE;
        Request.Command commandWithByte = getDSP.withByte(hearingAidPosition);
        HearingAidPredict hearingAidPredict = HearingAidPredict.INSTANCE;
        hearingAidPredict.setFirst(1);
        hearingAidPredict.setCmd(getDSP.getCmd());
        Unit unit = Unit.INSTANCE;
        b(new ModuleRequest(commandWithByte, hearingAidPredict, 0L, null, false, 28, null), new b(onResult, this));
    }

    @Override // com.huami.bluetooth.profile.channel.module.hearing.HearingAidApi
    public void getEQ(int hearingAidPosition, int scene, @NotNull Function1<? super EQParam, Unit> onResult) {
        HearingAidCommand.GetEQ getEQ = HearingAidCommand.GetEQ.INSTANCE;
        Request.Command commandWithByte = getEQ.withByte(hearingAidPosition).withByte(scene);
        HearingAidPredict hearingAidPredict = HearingAidPredict.INSTANCE;
        hearingAidPredict.setFirst(1);
        hearingAidPredict.setCmd(getEQ.getCmd());
        Unit unit = Unit.INSTANCE;
        b(new ModuleRequest(commandWithByte, hearingAidPredict, 0L, null, false, 28, null), new c(onResult, this));
    }

    @Override // com.huami.bluetooth.profile.channel.module.hearing.HearingAidApi
    public void getHearingAidBattery(@NotNull Function1<? super HearingAidBattery, Unit> onResult) {
        HearingAidCommand.GetDeviceBattery getDeviceBattery = HearingAidCommand.GetDeviceBattery.INSTANCE;
        HearingAidPredict hearingAidPredict = HearingAidPredict.INSTANCE;
        hearingAidPredict.setFirst(2);
        hearingAidPredict.setCmd(getDeviceBattery.getCmd());
        Unit unit = Unit.INSTANCE;
        b(new ModuleRequest(getDeviceBattery, hearingAidPredict, 0L, null, false, 28, null), new d(onResult, this));
    }

    @Override // com.huami.bluetooth.profile.channel.module.hearing.HearingAidApi
    public void getHearingMode(@NotNull Function1<? super HearingScenes, Unit> onResult) {
        HearingAidCommand.GetHearingMode getHearingMode = HearingAidCommand.GetHearingMode.INSTANCE;
        HearingAidPredict hearingAidPredict = HearingAidPredict.INSTANCE;
        hearingAidPredict.setFirst(1);
        hearingAidPredict.setCmd(getHearingMode.getCmd());
        Unit unit = Unit.INSTANCE;
        b(new ModuleRequest(getHearingMode, hearingAidPredict, 0L, null, false, 28, null), new e(onResult, this));
    }

    @Override // com.huami.bluetooth.profile.channel.module.hearing.HearingAidApi
    public void getHearingPosition(int hearingAidPosition, @NotNull Function1<? super HearingAidPositionParam, Unit> onResult) {
        HearingAidCommand.GetHearingPosition getHearingPosition = HearingAidCommand.GetHearingPosition.INSTANCE;
        Request.Command commandWithByte = getHearingPosition.withByte(hearingAidPosition);
        HearingAidPredict hearingAidPredict = HearingAidPredict.INSTANCE;
        hearingAidPredict.setFirst(1);
        hearingAidPredict.setCmd(getHearingPosition.getCmd());
        Unit unit = Unit.INSTANCE;
        b(new ModuleRequest(commandWithByte, hearingAidPredict, 0L, null, false, 28, null), new f(onResult, this));
    }

    @Override // com.huami.bluetooth.profile.channel.module.hearing.HearingAidApi
    public void getHighBass(int scene, @NotNull Function1<? super HighBassParam, Unit> onResult) {
        HearingAidCommand.GetHighBass getHighBass = HearingAidCommand.GetHighBass.INSTANCE;
        Request.Command commandWithByte = getHighBass.withByte(scene);
        HearingAidPredict hearingAidPredict = HearingAidPredict.INSTANCE;
        hearingAidPredict.setFirst(1);
        hearingAidPredict.setCmd(getHighBass.getCmd());
        Unit unit = Unit.INSTANCE;
        b(new ModuleRequest(commandWithByte, hearingAidPredict, 0L, null, false, 28, null), new g(onResult, this));
    }

    @NotNull
    public final BaseModule getModule() {
        return this.module;
    }

    @Override // com.huami.bluetooth.profile.channel.module.hearing.HearingAidApi
    public void getSn(@NotNull HearingAidComponents component, @NotNull Function1<? super String, Unit> onResult) {
        HearingAidCommand.GetSN getSN = HearingAidCommand.GetSN.INSTANCE;
        Request.Command commandWithByte = getSN.withByte(component.getType());
        HearingAidPredict hearingAidPredict = HearingAidPredict.INSTANCE;
        hearingAidPredict.setFirst(2);
        hearingAidPredict.setCmd(getSN.getCmd());
        Unit unit = Unit.INSTANCE;
        b(new ModuleRequest(commandWithByte, hearingAidPredict, 0L, null, false, 28, null), new h(onResult, this));
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    @Override // com.huami.bluetooth.profile.channel.module.hearing.HearingAidApi
    @NotNull
    public HearingAidProtocolVersion getVersion() {
        return this.version;
    }

    @Override // com.huami.bluetooth.profile.channel.module.hearing.HearingAidApi
    public void getWDRC(int hearingAidPosition, @NotNull Function1<? super WDRCParam, Unit> onResult) {
        HearingAidCommand.GetWDRC getWDRC = HearingAidCommand.GetWDRC.INSTANCE;
        Request.Command commandWithByte = getWDRC.withByte(hearingAidPosition);
        HearingAidPredict hearingAidPredict = HearingAidPredict.INSTANCE;
        hearingAidPredict.setFirst(1);
        hearingAidPredict.setCmd(getWDRC.getCmd());
        Unit unit = Unit.INSTANCE;
        b(new ModuleRequest(commandWithByte, hearingAidPredict, 0L, null, false, 28, null), new i(onResult, this));
    }

    @Override // com.huami.bluetooth.profile.channel.module.hearing.HearingAidApi
    public void reportDeviceBound(@NotNull Function2<? super Boolean, ? super Integer, Unit> onResult) {
        HearingAidCommand.DeviceBound deviceBound = HearingAidCommand.DeviceBound.INSTANCE;
        HearingAidPredict hearingAidPredict = HearingAidPredict.INSTANCE;
        hearingAidPredict.setFirst(2);
        hearingAidPredict.setCmd(deviceBound.getCmd());
        Unit unit = Unit.INSTANCE;
        c(new ModuleRequest(deviceBound, hearingAidPredict, 0L, null, false, 28, null), onResult);
    }

    @Override // com.huami.bluetooth.profile.channel.module.hearing.HearingAidApi
    public void resetUnusedEQ(@NotNull EQParam param, @NotNull Function2<? super Boolean, ? super Integer, Unit> onResult) {
        Request.Command commandWithByte = HearingAidCommand.ResetUnusedEQ.INSTANCE.withByte(param.getPosition()).withByte(param.getMode()).withByte(param.getFrequencyListSize());
        Iterator<T> it2 = param.getFrequencyList().iterator();
        while (it2.hasNext()) {
            commandWithByte = commandWithByte.withShort(((Number) it2.next()).intValue());
        }
        Iterator<T> it3 = param.getValueList().iterator();
        while (it3.hasNext()) {
            commandWithByte = commandWithByte.withByte(((Number) it3.next()).intValue());
        }
        Request.Command commandWithByte2 = commandWithByte.withByte(param.getNoiseReductionLevel());
        HearingAidPredict hearingAidPredict = HearingAidPredict.INSTANCE;
        hearingAidPredict.setFirst(0);
        hearingAidPredict.setCmd(HearingAidCommand.ResetUnusedEQ.INSTANCE.getCmd());
        Unit unit = Unit.INSTANCE;
        c(new ModuleRequest(commandWithByte2, hearingAidPredict, 0L, null, false, 28, null), onResult);
    }

    @Override // com.huami.bluetooth.profile.channel.module.hearing.HearingAidApi
    public void resetUnusedHighBass(@NotNull HighBassParam param, @NotNull Function2<? super Boolean, ? super Integer, Unit> onResult) {
        HearingAidCommand.ResetUnusedHighBass resetUnusedHighBass = HearingAidCommand.ResetUnusedHighBass.INSTANCE;
        Request.Command commandWithByte = resetUnusedHighBass.withByte(param.getMode()).withByte(param.getLeftBass()).withByte(param.getLeftHighPitch()).withByte(param.getRightBass()).withByte(param.getRightHighPitch());
        HearingAidPredict hearingAidPredict = HearingAidPredict.INSTANCE;
        hearingAidPredict.setFirst(0);
        hearingAidPredict.setCmd(resetUnusedHighBass.getCmd());
        Unit unit = Unit.INSTANCE;
        c(new ModuleRequest(commandWithByte, hearingAidPredict, 0L, null, false, 28, null), onResult);
    }

    @Override // com.huami.bluetooth.profile.channel.module.hearing.HearingAidApi
    public void setDSP(@NotNull DSPTestParam dsp, @NotNull Function2<? super Boolean, ? super Integer, Unit> onResult) {
        HearingAidCommand.SetDSP setDSP = HearingAidCommand.SetDSP.INSTANCE;
        Request.Command commandWithByte = setDSP.withByte(dsp.getEarphonePosition());
        HearingAidPredict hearingAidPredict = HearingAidPredict.INSTANCE;
        hearingAidPredict.setFirst(0);
        hearingAidPredict.setCmd(setDSP.getCmd());
        Unit unit = Unit.INSTANCE;
        c(new ModuleRequest(commandWithByte, hearingAidPredict, 0L, null, false, 28, null), onResult);
    }

    @Override // com.huami.bluetooth.profile.channel.module.hearing.HearingAidApi
    public void setEQ(@NotNull EQParam param, @NotNull Function2<? super Boolean, ? super Integer, Unit> onResult) {
        Request.Command commandWithByte = HearingAidCommand.SetEQ.INSTANCE.withByte(param.getPosition()).withByte(param.getMode()).withByte(param.getFrequencyListSize());
        Iterator<T> it2 = param.getFrequencyList().iterator();
        while (it2.hasNext()) {
            commandWithByte = commandWithByte.withShort(((Number) it2.next()).intValue());
        }
        Iterator<T> it3 = param.getValueList().iterator();
        while (it3.hasNext()) {
            commandWithByte = commandWithByte.withByte(((Number) it3.next()).intValue());
        }
        Request.Command commandWithByte2 = commandWithByte.withByte(param.getNoiseReductionLevel());
        HearingAidPredict hearingAidPredict = HearingAidPredict.INSTANCE;
        hearingAidPredict.setFirst(0);
        hearingAidPredict.setCmd(HearingAidCommand.SetEQ.INSTANCE.getCmd());
        Unit unit = Unit.INSTANCE;
        c(new ModuleRequest(commandWithByte2, hearingAidPredict, 0L, null, false, 28, null), onResult);
    }

    @Override // com.huami.bluetooth.profile.channel.module.hearing.HearingAidApi
    public void setHearingMode(@NotNull HearingScenes param, @NotNull Function2<? super Boolean, ? super Integer, Unit> onResult) {
        Request.Command commandWithShort = HearingAidCommand.SetHearingMode.INSTANCE.withShort(param.getFavorite() == null ? 2 : 3);
        HearingFavorite favorite = param.getFavorite();
        if (favorite != null) {
            commandWithShort = commandWithShort.withByte(favorite.getLeft()).withByte(favorite.getRight());
        }
        HearingSelectedModes modes = param.getModes();
        if (modes != null) {
            commandWithShort = commandWithShort.withByte(modes.getSize());
            Iterator<T> it2 = modes.getModes().iterator();
            while (it2.hasNext()) {
                commandWithShort = commandWithShort.withByte(((Number) it2.next()).intValue());
            }
        }
        Request.Command command = commandWithShort;
        HearingAidPredict hearingAidPredict = HearingAidPredict.INSTANCE;
        hearingAidPredict.setFirst(0);
        hearingAidPredict.setCmd(HearingAidCommand.SetHearingMode.INSTANCE.getCmd());
        Unit unit = Unit.INSTANCE;
        c(new ModuleRequest(command, hearingAidPredict, 0L, null, false, 28, null), onResult);
    }

    @Override // com.huami.bluetooth.profile.channel.module.hearing.HearingAidApi
    public void setHearingPosition(@NotNull HearingAidPositionParam param, @NotNull Function2<? super Boolean, ? super Integer, Unit> onResult) {
        HearingAidCommand.SetHearingPosition setHearingPosition = HearingAidCommand.SetHearingPosition.INSTANCE;
        Request.Command commandWithByte = setHearingPosition.withByte(param.getEarAidPosition());
        HearingAidPredict hearingAidPredict = HearingAidPredict.INSTANCE;
        hearingAidPredict.setFirst(0);
        hearingAidPredict.setCmd(setHearingPosition.getCmd());
        Unit unit = Unit.INSTANCE;
        c(new ModuleRequest(commandWithByte, hearingAidPredict, 0L, null, false, 28, null), onResult);
    }

    @Override // com.huami.bluetooth.profile.channel.module.hearing.HearingAidApi
    public void setHighBass(@NotNull HighBassParam param, @NotNull Function2<? super Boolean, ? super Integer, Unit> onResult) {
        HearingAidCommand.SetHighBass setHighBass = HearingAidCommand.SetHighBass.INSTANCE;
        Request.Command commandWithByte = setHighBass.withByte(param.getMode()).withByte(param.getLeftBass()).withByte(param.getLeftHighPitch()).withByte(param.getRightBass()).withByte(param.getRightHighPitch());
        HearingAidPredict hearingAidPredict = HearingAidPredict.INSTANCE;
        hearingAidPredict.setFirst(0);
        hearingAidPredict.setCmd(setHighBass.getCmd());
        Unit unit = Unit.INSTANCE;
        c(new ModuleRequest(commandWithByte, hearingAidPredict, 0L, null, false, 28, null), onResult);
    }

    @Override // com.huami.bluetooth.profile.channel.module.hearing.HearingAidApi
    public void setOnHearingListener(@NotNull HearingAidListener listener) {
        this.mHearingAidListener = listener;
    }

    @Override // com.huami.bluetooth.profile.channel.module.hearing.HearingAidApi
    public void setWDRC(@NotNull WDRCParam param, @NotNull Function2<? super Boolean, ? super Integer, Unit> onResult) {
        Request.Command commandWithByte = HearingAidCommand.SetWDRC.INSTANCE.withByte(param.getPosition()).withByte(param.getFrequencyListSize());
        Iterator<T> it2 = param.getFrequencyList().iterator();
        while (it2.hasNext()) {
            commandWithByte = commandWithByte.withShort(((Number) it2.next()).intValue());
        }
        Iterator<T> it3 = param.getWdrcValues().iterator();
        Request.Command commandWithByte2 = commandWithByte;
        while (it3.hasNext()) {
            commandWithByte2 = commandWithByte2.withByte(((Number) it3.next()).intValue());
        }
        HearingAidPredict hearingAidPredict = HearingAidPredict.INSTANCE;
        hearingAidPredict.setFirst(0);
        hearingAidPredict.setCmd(HearingAidCommand.SetWDRC.INSTANCE.getCmd());
        Unit unit = Unit.INSTANCE;
        c(new ModuleRequest(commandWithByte2, hearingAidPredict, 0L, null, false, 28, null), onResult);
    }
}
