package com.huami.watch.companion.esim;

import android.content.Context;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.ChannelResponse;
import com.huami.bluetooth.profile.channel.module.EsimModule;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.esim.EsimBleOperationHelper;
import com.huami.watch.companion.mediac.Command;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.DoLooper;
import com.huami.watch.util.Rx;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.nio.charset.Charset;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 G2\u00020\u0001:\u0001GB\u000f\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\bE\u0010FJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J$\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\rH\u0002J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000eH\u0016J \u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000eH\u0016J*\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u000eH\u0016J\u0018\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000eH\u0016J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u000eH\u0016J\u0018\u0010%\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u000eH\u0016J\u0010\u0010&\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0018H\u0016J\u0018\u0010(\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u0018H\u0016J\u0018\u0010+\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\b2\u0006\u0010*\u001a\u00020)H\u0016J\u0010\u0010-\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020,H\u0016J\b\u0010.\u001a\u00020\u0004H\u0016J\u0010\u00101\u001a\u00020\u000e2\u0006\u00100\u001a\u00020/H\u0016J\u0011\u00102\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b2\u00103J\u0016\u00106\u001a\u00020\u00042\u0006\u00104\u001a\u00020)2\u0006\u00105\u001a\u00020)R\u0019\u00100\u001a\u00020/8\u0006@\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0018\u0010=\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010@\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010D\u001a\u0004\u0018\u00010A8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006H"}, d2 = {"Lcom/huami/watch/companion/esim/EsimBleOperationHelper;", "Lcom/huami/watch/companion/esim/AbsEsimOperation;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "channelResponse", "", z.j, "", HTTP.CONTENT_RANGE_BYTES, "Lcom/huami/watch/transport/DataBundle;", hl.k, "dataBundle", "g", "l", "Lkotlin/Function1;", "", "callback", "m", Command.STOP, "Lcom/huami/watch/companion/esim/SimResult;", "getResult", "requestSimInfo", "showQr", "needSync", "getProfileList", "", "activationUrl", "needResult", "needInputPinCode", "activationCode", "carrierType", "startDownloadProfile", "pinCode", "ePin", "continueDownloadProfile", "cancelDownloadProfile", AbsEsimOperation.KEY_ICCID, Constants.ENABLED, "switchProfileState", "deleteProfile", "name", "setProfileName", "", "currentTime", "sendWithRetry", "Lcom/huami/watch/companion/esim/OperationCallBack;", "setOperationCallback", "sendNotification", "Landroid/content/Context;", "ctx", "isConnected", "supportEPin", "()Ljava/lang/Boolean;", "checkIntervalMillis", "timeoutSecs", "doLoop", "b", "Landroid/content/Context;", "getCtx", "()Landroid/content/Context;", "c", "Lcom/huami/watch/companion/esim/SimResult;", "result", GoogleApiAvailabilityLight.a, "Lcom/huami/watch/companion/esim/OperationCallBack;", "operationCallBack", "Lcom/huami/bluetooth/profile/channel/module/EsimModule;", "i", "()Lcom/huami/bluetooth/profile/channel/module/EsimModule;", "esimModule", "<init>", "(Landroid/content/Context;)V", "Companion", "esim_release"}, k = 1, mv = {1, 5, 1})
public final class EsimBleOperationHelper extends AbsEsimOperation {
    public static final int ESIM_MODULE = 2;
    public static final int LEN_SIZE = 4;
    public static final int TAG_BYTE_SIZE = 2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Context ctx;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private SimResult result;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private OperationCallBack operationCallBack;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<ChannelResponse, Unit> {
        public a(Object obj) {
            super(1, obj, EsimBleOperationHelper.class, "onChannelData", "onChannelData(Lcom/huami/bluetooth/profile/channel/ChannelResponse;)V", 0);
        }

        public final void a(@NotNull ChannelResponse channelResponse) throws JSONException {
            ((EsimBleOperationHelper) this.receiver).j(channelResponse);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ChannelResponse channelResponse) throws JSONException {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ HMBaseDevice a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HMBaseDevice hMBaseDevice) {
            super(0);
            this.a = hMBaseDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("Ble Device connect status: ", Boolean.valueOf(((HMMiLiProDevice) this.a).isConnected()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "ERROR:esim cmd no response";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ ChannelResponse a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ChannelResponse channelResponse) {
            super(0);
            this.a = channelResponse;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("Receive esim response: ", GattUtils.bytesToHexString(this.a.getData()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("paresed result: ", EsimBleOperationHelper.this.result);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("carrierType:", this.a);
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
            return "ERROR:unknown action";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ ESimCmdSubTag a;
        public final /* synthetic */ Object b;
        public final /* synthetic */ byte[] c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ESimCmdSubTag eSimCmdSubTag, Object obj, byte[] bArr) {
            super(0);
            this.a = eSimCmdSubTag;
            this.b = obj;
            this.c = bArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.name() + JsonLexerKt.COLON + this.b + "; " + ((Object) GattUtils.bytesToHexString(this.c));
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
        public final String invoke() {
            return Intrinsics.stringPlus("send esim cmd: ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ String a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ boolean a;
            public final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z, String str) {
                super(0);
                this.a = z;
                this.b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "send esim cmd ret:" + this.a + " and origin cmd: " + ((Object) this.b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            HMLog.info(AbsEsimOperation.TAG, new a(z, this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ Function1<Boolean, Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(Function1<? super Boolean, Unit> function1) {
            super(1);
            this.a = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.a.invoke(Boolean.valueOf(z));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ DataBundle b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(DataBundle dataBundle, int i) {
            super(1);
            this.b = dataBundle;
            this.c = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(EsimBleOperationHelper esimBleOperationHelper, DataBundle dataBundle, int i) {
            esimBleOperationHelper.sendWithRetry(dataBundle, i + 1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (z) {
                return;
            }
            final EsimBleOperationHelper esimBleOperationHelper = EsimBleOperationHelper.this;
            final DataBundle dataBundle = this.b;
            final int i = this.c;
            Rx.delayIo(new Runnable() { // from class: com.huami.watch.companion.esim.a
                @Override // java.lang.Runnable
                public final void run() {
                    EsimBleOperationHelper.l.b(esimBleOperationHelper, dataBundle, i);
                }
            }, 15L, TimeUnit.SECONDS);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("get esim version failed as result is: ", EsimBleOperationHelper.this.result);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("get esim version failed as result is: ", EsimBleOperationHelper.this.result);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<String> {
        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("supportEpin get response: ", EsimBleOperationHelper.this.result);
        }
    }

    public EsimBleOperationHelper(@NotNull Context context) {
        this.ctx = context;
        init(context);
    }

    private final byte[] g(DataBundle dataBundle) {
        ESimCmdSubTag eSimCmdSubTagFromKey;
        byte[] bArrPlus = new byte[0];
        ESimCmdTag eSimCmdTagFromKey = ESimCmdTag.INSTANCE.fromKey(dataBundle.getString("type"));
        Byte bValueOf = eSimCmdTagFromKey == null ? null : Byte.valueOf((byte) eSimCmdTagFromKey.getType());
        if (bValueOf == null) {
            return new byte[0];
        }
        byte bByteValue = bValueOf.byteValue();
        for (String str : dataBundle.keySet()) {
            if (!Intrinsics.areEqual(str, "type") && (eSimCmdSubTagFromKey = ESimCmdSubTag.INSTANCE.fromKey(str)) != null) {
                bArrPlus = ArraysKt___ArraysJvmKt.plus(bArrPlus, EsimBleOperationHelperKt.assembleESimCmd(eSimCmdSubTagFromKey.getValue(), dataBundle.getString(str)));
            }
        }
        return ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(new byte[]{bByteValue}, GattUtils.intToBytes(bArrPlus.length)), bArrPlus);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DoLooper.Result h(EsimBleOperationHelper esimBleOperationHelper) {
        SimResult simResult;
        if (!esimBleOperationHelper.isConnected(esimBleOperationHelper.getCtx()) && (simResult = esimBleOperationHelper.result) != null) {
            simResult.finish = true;
        }
        return esimBleOperationHelper.result;
    }

    private final EsimModule i() {
        IESimDeviceManager esimDeviceManager = ESimCallback.INSTANCE.getEsimDeviceManager();
        HMBaseDevice boundMajorDevice = esimDeviceManager == null ? null : esimDeviceManager.getBoundMajorDevice();
        Objects.requireNonNull(boundMajorDevice, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.device.HMMiLiProDevice");
        EsimModule esimModule = (EsimModule) ((HMMiLiProDevice) boundMajorDevice).getChannelModule(EsimModule.class);
        if (esimModule != null) {
            esimModule.registerCallback(2, false, new a(this));
        }
        return esimModule;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(ChannelResponse channelResponse) throws JSONException {
        boolean z = false;
        if (channelResponse.getData().length == 0) {
            HMLog.info(AbsEsimOperation.TAG, c.a);
            return;
        }
        HMLog.info(AbsEsimOperation.TAG, new d(channelResponse));
        DataBundle dataBundleK = k(channelResponse.getData());
        String string = dataBundleK.getString("type");
        String string2 = dataBundleK.getString(AbsEsimOperation.KEY_RESPONSE_DATA, "");
        int i2 = dataBundleK.getInt(AbsEsimOperation.KEY_RESPONSE_CODE, 1);
        SimResult simResult = this.result;
        if (simResult != null) {
            if (simResult != null) {
                simResult.setType(string);
            }
            SimResult simResult2 = this.result;
            if (simResult2 != null) {
                simResult2.success = true;
            }
            if (simResult2 != null) {
                simResult2.setInfo(string2);
            }
            SimResult simResult3 = this.result;
            if (simResult3 != null) {
                simResult3.setState(i2);
            }
            HMLog.info(AbsEsimOperation.TAG, new e());
            SimResult simResult4 = this.result;
            if (simResult4 != null) {
                simResult4.finish = true;
            }
        }
        SimResult simResult5 = this.result;
        if (simResult5 != null) {
            if (simResult5 != null && simResult5.getState() == 0) {
                OperationCallBack operationCallBack = this.operationCallBack;
                if (operationCallBack != null) {
                    operationCallBack.onSuccess(string);
                }
            } else {
                OperationCallBack operationCallBack2 = this.operationCallBack;
                if (operationCallBack2 != null) {
                    SimResult simResult6 = this.result;
                    operationCallBack2.onFailure(string, simResult6 == null ? null : simResult6.getInfo());
                }
            }
        }
        if (Intrinsics.areEqual(AbsEsimOperation.TYPE_DOWNLOAD_STATUS, string)) {
            String string3 = dataBundleK.getString(AbsEsimOperation.KEY_CARRIER_TYPE, "");
            HMLog.info(AbsEsimOperation.TAG, new f(string3));
            SimResult simResult7 = this.result;
            if (simResult7 != null && simResult7.getState() == 0) {
                z = true;
            }
            if (z) {
                Analytics.event(this.ctx, Intrinsics.stringPlus(string3, "_successful"));
            } else {
                Analytics.event(this.ctx, Intrinsics.stringPlus(string3, "_failed"), string2);
            }
        }
    }

    private final DataBundle k(byte[] bytes) throws JSONException {
        String string;
        Object obj;
        DataBundle dataBundle = new DataBundle();
        int i2 = 2;
        ESimCmdTag eSimCmdTagFromValue = ESimCmdTag.INSTANCE.fromValue(ByteUtilsKt.toIntBE$default(bytes, 2, 0, 2, null));
        if (eSimCmdTagFromValue == null) {
            HMLog.info(AbsEsimOperation.TAG, g.a);
            return dataBundle;
        }
        dataBundle.putString("type", eSimCmdTagFromValue.getKey());
        int i3 = 4;
        int intBE = ByteUtilsKt.toIntBE(bytes, 4, 2);
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        int i4 = 6;
        while (i4 < intBE) {
            ESimCmdSubTag eSimCmdSubTagFromValue = ESimCmdSubTag.INSTANCE.fromValue(ByteUtilsKt.toIntBE(bytes, i2, i4));
            int i5 = i4 + 2;
            int intBE2 = ByteUtilsKt.toIntBE(bytes, i3, i5);
            byte[] bArrSliceArray = ArraysKt___ArraysKt.sliceArray(bytes, new IntRange(i4 + 4 + 2, ((i5 + i3) + intBE2) - 1));
            i4 += intBE2 + 6;
            if (eSimCmdSubTagFromValue != null) {
                if (eSimCmdTagFromValue == ESimCmdTag.ENUM_ESIM_PROFILE_LIST && jSONObject.has(eSimCmdSubTagFromValue.getKey())) {
                    jSONArray.put(jSONObject);
                    jSONObject = new JSONObject();
                }
                Object typedValue = EsimBleOperationHelperKt.toTypedValue(bArrSliceArray, eSimCmdSubTagFromValue.getValueType());
                if (eSimCmdTagFromValue == ESimCmdTag.ENUM_ESIM_DOWNLOAD_STATUS && eSimCmdSubTagFromValue == ESimCmdSubTag.ENUM_ESIM_SUB_BODY && !dataBundle.containsKey(AbsEsimOperation.KEY_RESPONSE_CODE)) {
                    obj = null;
                    int intBE$default = ByteUtilsKt.toIntBE$default(bArrSliceArray, bArrSliceArray.length, 0, i2, null);
                    ESimCmdSubTag eSimCmdSubTag = ESimCmdSubTag.ENUM_ESIM_SUB_RESP_CODE;
                    jSONObject.put(eSimCmdSubTag.getKey(), intBE$default);
                    dataBundle.putInt(eSimCmdSubTag.getKey(), intBE$default);
                } else {
                    obj = null;
                    jSONObject.put(eSimCmdSubTagFromValue.getKey(), typedValue);
                    String key = eSimCmdSubTagFromValue.getKey();
                    if (Intrinsics.areEqual(Object.class, String.class)) {
                        Objects.requireNonNull(typedValue, "null cannot be cast to non-null type kotlin.String");
                        dataBundle.putString(key, (String) typedValue);
                    }
                }
                HMLog.info(AbsEsimOperation.TAG, new h(eSimCmdSubTagFromValue, typedValue, bArrSliceArray));
                i2 = 2;
                i3 = 4;
            }
        }
        if (eSimCmdTagFromValue == ESimCmdTag.ENUM_ESIM_PROFILE_LIST) {
            if (jSONObject.keys().hasNext()) {
                jSONArray.put(jSONObject);
            }
            string = jSONArray.toString();
        } else {
            string = jSONObject.toString();
        }
        if (!dataBundle.containsKey(AbsEsimOperation.KEY_RESPONSE_CODE)) {
            dataBundle.putInt(AbsEsimOperation.KEY_RESPONSE_CODE, 0);
        }
        dataBundle.putString(AbsEsimOperation.KEY_RESPONSE_DATA, string);
        return dataBundle;
    }

    private final void l(byte[] bytes) {
        String strBytesToHexString = GattUtils.bytesToHexString(bytes);
        HMLog.info(AbsEsimOperation.TAG, new i(strBytesToHexString));
        m(bytes, new j(strBytesToHexString));
    }

    private final void m(byte[] bytes, Function1<? super Boolean, Unit> callback) {
        Unit unit;
        EsimModule esimModuleI = i();
        if (esimModuleI == null) {
            unit = null;
        } else {
            esimModuleI.sendEsimData(bytes, new k(callback));
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            callback.invoke(Boolean.FALSE);
        }
    }

    @Override // com.huami.watch.companion.esim.AbsEsimOperation
    public void cancelDownloadProfile(boolean needResult) {
        l(EsimBleOperationHelperKt.assembleESimCmd(ESimCmdTag.ENUM_ESIM_CC.getValue(), new byte[0]));
        if (needResult) {
            doLoop(2000, 360);
        }
    }

    @Override // com.huami.watch.companion.esim.AbsEsimOperation
    public void continueDownloadProfile(@NotNull String ePin, boolean needResult) {
        l(EsimBleOperationHelperKt.assembleESimCmd(ESimCmdTag.ENUM_ESIM_CC.getValue(), ePin.getBytes(Charsets.UTF_8)));
        if (needResult) {
            doLoop(2000, 360);
        }
    }

    @Override // com.huami.watch.companion.esim.AbsEsimOperation
    public void deleteProfile(@NotNull String iccid) {
        l(EsimBleOperationHelperKt.assembleESimCmd(ESimCmdTag.ENUM_ESIM_DELETE.getValue(), EsimBleOperationHelperKt.assembleESimCmd(ESimCmdSubTag.ENUM_ESIM_SUB_ICCID.getValue(), iccid.getBytes(Charsets.UTF_8))));
    }

    public final void doLoop(int checkIntervalMillis, int timeoutSecs) {
        this.result = new SimResult(null, null, 0, 7, null);
        DoLooper.doLoop(new DoLooper.Function() { // from class: qq1
            @Override // com.huami.watch.util.DoLooper.Function
            public final Object apply() {
                return EsimBleOperationHelper.h(this.a);
            }
        }, checkIntervalMillis, timeoutSecs);
    }

    @NotNull
    public final Context getCtx() {
        return this.ctx;
    }

    @Override // com.huami.watch.companion.esim.AbsEsimOperation
    public void getProfileList(boolean needSync) {
        l(EsimBleOperationHelperKt.assembleESimCmd(ESimCmdTag.ENUM_ESIM_PROFILE_LIST.getValue(), EsimBleOperationHelperKt.assembleESimCmd(ESimCmdSubTag.ENUM_ESIM_SUB_SYNC_NOTIFY.getValue(), needSync ? new byte[]{0} : new byte[]{1})));
        doLoop(100, 30);
    }

    @Override // com.huami.watch.companion.esim.AbsEsimOperation
    @Nullable
    public SimResult getResult() {
        return this.result;
    }

    @Override // com.huami.watch.companion.esim.AbsEsimOperation
    public boolean isConnected(@NotNull Context ctx) {
        IESimDeviceManager esimDeviceManager = ESimCallback.INSTANCE.getEsimDeviceManager();
        HMBaseDevice boundMajorDevice = esimDeviceManager == null ? null : esimDeviceManager.getBoundMajorDevice();
        if (boundMajorDevice == null || !(boundMajorDevice instanceof HMMiLiProDevice)) {
            return false;
        }
        HMLog.info(AbsEsimOperation.TAG, new b(boundMajorDevice));
        return ((HMMiLiProDevice) boundMajorDevice).isConnected();
    }

    @Override // com.huami.watch.companion.esim.AbsEsimOperation
    public void needInputPinCode(@NotNull String activationUrl, boolean needResult) {
        l(EsimBleOperationHelperKt.assembleESimCmd(ESimCmdTag.ENUM_ESIM_CAPBILITY_REQUEST.getValue(), EsimBleOperationHelperKt.assembleESimCmd(ESimCmdSubTag.ENUM_ESIM_SUB_URL.getValue(), activationUrl.getBytes(Charsets.UTF_8))));
        if (needResult) {
            doLoop(2000, 300);
        }
    }

    @Override // com.huami.watch.companion.esim.AbsEsimOperation
    public void requestSimInfo() {
        l(EsimBleOperationHelperKt.assembleESimCmd(ESimCmdTag.ENUM_ESIM_INFO.getValue(), new byte[0]));
        doLoop(200, 60);
    }

    @Override // com.huami.watch.companion.esim.AbsEsimOperation
    public void sendNotification() {
        throw new NotImplementedError("An operation is not implemented: not implemented");
    }

    @Override // com.huami.watch.companion.esim.AbsEsimOperation
    public void sendWithRetry(@NotNull DataBundle dataBundle, int currentTime) {
        if (currentTime > 11) {
            return;
        }
        m(g(dataBundle), new l(dataBundle, currentTime));
    }

    @Override // com.huami.watch.companion.esim.AbsEsimOperation
    public void setOperationCallback(@NotNull OperationCallBack callback) {
        this.operationCallBack = callback;
    }

    @Override // com.huami.watch.companion.esim.AbsEsimOperation
    public void setProfileName(@NotNull String iccid, @NotNull String name) {
        int value = ESimCmdSubTag.ENUM_ESIM_SUB_ICCID.getValue();
        Charset charset = Charsets.UTF_8;
        l(EsimBleOperationHelperKt.assembleESimCmd(ESimCmdTag.ENUM_ESIM_SET_NAME.getValue(), ArraysKt___ArraysJvmKt.plus(EsimBleOperationHelperKt.assembleESimCmd(value, iccid.getBytes(charset)), EsimBleOperationHelperKt.assembleESimCmd(ESimCmdSubTag.ENUM_ESIM_SUB_NICK_NAME.getValue(), name.getBytes(charset)))));
        doLoop(200, 60);
    }

    @Override // com.huami.watch.companion.esim.AbsEsimOperation
    public void showQr() {
        l(EsimBleOperationHelperKt.assembleESimCmd(ESimCmdTag.ENUM_ESIM_SHOW_QR.getValue(), new byte[0]));
    }

    @Override // com.huami.watch.companion.esim.AbsEsimOperation
    public void startDownloadProfile(@NotNull String activationCode, @NotNull String carrierType, boolean needResult) {
        startDownloadProfile(activationCode, carrierType, null, needResult);
    }

    @Override // com.huami.watch.companion.esim.AbsEsimOperation
    public void stop() {
        SimResult simResult = this.result;
        if (simResult == null) {
            return;
        }
        simResult.finish = true;
    }

    @Override // com.huami.watch.companion.esim.AbsEsimOperation
    @Nullable
    public Boolean supportEPin() {
        l(EsimBleOperationHelperKt.assembleESimCmd(ESimCmdTag.ENUM_ESIM_VERSION.getValue(), new byte[0]));
        doLoop(5000, 300);
        SimResult simResult = this.result;
        if ((simResult == null ? null : simResult.getInfo()) == null) {
            HMLog.info(AbsEsimOperation.TAG, new m());
            return null;
        }
        int i2 = 0;
        while (true) {
            SimResult simResult2 = this.result;
            if (Intrinsics.areEqual(simResult2 == null ? null : simResult2.getType(), AbsEsimOperation.TYPE_ESIM_VERSION) || i2 >= 3) {
                break;
            }
            doLoop(5000, 10);
            i2++;
        }
        SimResult simResult3 = this.result;
        String info = simResult3 == null ? null : simResult3.getInfo();
        if (info == null) {
            HMLog.info(AbsEsimOperation.TAG, new n());
            return null;
        }
        HMLog.info(AbsEsimOperation.TAG, new o());
        return Boolean.valueOf(ProfileUtils.getVersionCodeFromVersionName(new JSONObject(info).optString(AbsEsimOperation.KEY_SUB_MAJOR_VERSION, "1.0")) >= ProfileUtils.getVersionCodeFromVersionName("1.1"));
    }

    @Override // com.huami.watch.companion.esim.AbsEsimOperation
    public void switchProfileState(@NotNull String iccid, boolean enabled) {
        l(EsimBleOperationHelperKt.assembleESimCmd(ESimCmdTag.ENUM_ESIM_SWITCH_STATE.getValue(), ArraysKt___ArraysJvmKt.plus(EsimBleOperationHelperKt.assembleESimCmd(ESimCmdSubTag.ENUM_ESIM_SUB_ICCID.getValue(), iccid.getBytes(Charsets.UTF_8)), EsimBleOperationHelperKt.assembleESimCmd(ESimCmdSubTag.ENUM_ESIM_SUB_ENABLE_PROFILE.getValue(), enabled ? new byte[]{1} : new byte[]{0}))));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003b  */
    @Override // com.huami.watch.companion.esim.AbsEsimOperation
    public void startDownloadProfile(@NotNull String activationCode, @NotNull String carrierType, @Nullable String pinCode, boolean needResult) {
        byte[] bArrAssembleESimCmd;
        int value = ESimCmdSubTag.ENUM_ESIM_SUB_URL.getValue();
        Charset charset = Charsets.UTF_8;
        byte[] bArrAssembleESimCmd2 = EsimBleOperationHelperKt.assembleESimCmd(value, activationCode.getBytes(charset));
        byte[] bArrAssembleESimCmd3 = EsimBleOperationHelperKt.assembleESimCmd(ESimCmdSubTag.ENUM_ESIM_SUB_CARRIER.getValue(), carrierType.getBytes(charset));
        if (pinCode == null) {
            bArrAssembleESimCmd = new byte[0];
        } else {
            if (pinCode.length() > 0) {
                bArrAssembleESimCmd = EsimBleOperationHelperKt.assembleESimCmd(ESimCmdSubTag.ENUM_ESIM_SUB_CONFIRMATION_CODE.getValue(), pinCode.getBytes(charset));
            } else {
                bArrAssembleESimCmd = new byte[0];
            }
        }
        l(EsimBleOperationHelperKt.assembleESimCmd(ESimCmdTag.ENUM_ESIM_DOWNLOAD_PROFILE.getValue(), ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(bArrAssembleESimCmd2, bArrAssembleESimCmd3), bArrAssembleESimCmd)));
        if (needResult) {
            doLoop(2000, 300);
        }
    }
}
