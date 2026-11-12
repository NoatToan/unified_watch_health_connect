package com.huami.bluetooth.profile.channel.module;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.ChannelResponse;
import com.huami.bluetooth.utils.BufByteDecoder;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.loc.z;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.utils.ByteArrayKt;
import com.xiaomi.hm.health.reminder.AdRemindParserKt;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 L2\u00020\u00012\u00020\u0002:\u0005LMNOPB\u000f\u0012\u0006\u0010I\u001a\u00020H¢\u0006\u0004\bJ\u0010KJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\u000e\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016J)\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f0\tJ\u001f\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f0\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u001e\u001a\u00020\fJ!\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u001e\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\tJ\u0019\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b#\u0010\u001dJ$\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u0016J1\u0010(\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u0016H\u0086@ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0\u000fJ'\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010.\u001a\u00020\fJ!\u00100\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010.\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b0\u0010!R\u0016\u00103\u001a\u0002018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00102R\u001d\u00108\u001a\u0002048B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u00107R(\u0010=\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070:098\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010@\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010C\u001a\u00020\f8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0016\u0010G\u001a\u00020D8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Q"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/DialModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lkotlinx/coroutines/CoroutineScope;", "", "data", "", GoogleApiAvailabilityLight.a, "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", AbstractJSONTokenResponse.RESPONSE, "Lcom/huami/bluetooth/profile/channel/module/DialModule$DialData;", "", "h", "", "g", "f", "", "e", PointCategory.INIT, "Lcom/huami/bluetooth/profile/channel/module/DialModule$IDialChangeListener;", "callback", "setDialChangeCallBack", "dialId", "", "imageSize", "checkDeviceSpaceSync", "checkDeviceSpace", "(IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDialIdListSync", "getDialIdList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "diaId", "setDialIdSync", "setDialId", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDialIdSync", "getDialId", "srcId", "dest", "size", "replaceDialIdSync", "replaceDialId", "(IIJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dialIds", "deleteDialSync", "deleteDial", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "colorId", "setDialDefaultColorSync", "setDialDefaultColor", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlinx/coroutines/sync/Mutex;", "mutex", "Lkotlinx/coroutines/Job;", "Lkotlin/Lazy;", "c", "()Lkotlinx/coroutines/Job;", "job", "", "Lkotlinx/coroutines/channels/Channel;", "i", "Ljava/util/Map;", "channels", z.j, "Lcom/huami/bluetooth/profile/channel/module/DialModule$IDialChangeListener;", "mCallback", "getModule", "()I", "module", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "channelController", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "Companion", "DiaResultCode", "DialData", "IDialChangeListener", "OpType", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class DialModule extends BaseModule implements CoroutineScope {
    public static final int DELETE_DIAL = 13;
    public static final int DIAL_DEFAULT_COLOR = 15;
    public static final int DIAL_MODULE = 35;
    public static final int GET_DIAL = 9;
    public static final int NOTIFY_DIAL_CHANGE = 255;
    public static final int QUERY_DIAL_LIST = 5;
    public static final int QUERY_SPACE_STATUS = 3;
    public static final int REPLACE_DIAL = 11;
    public static final int RESPONSE_DELETE_DIAL = 14;
    public static final int RESPONSE_DIAL_DEFAULT_COLOR = 16;
    public static final int RESPONSE_GET_DIAL = 10;
    public static final int RESPONSE_QUERY_DIAL_LIST = 6;
    public static final int RESPONSE_QUERY_SPACE_STATUS = 4;
    public static final int RESPONSE_REPLACE_DIAL = 12;
    public static final int RESPONSE_SET_DIAL = 8;
    public static final int SET_DIAL = 7;

    @NotNull
    public static final String TAG = "DialModule";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Mutex mutex;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Map<Integer, Channel<ChannelResponse>> channels;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private IDialChangeListener mCallback;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/DialModule$DiaResultCode;", "", "", "value", LogUtil.I, "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "FAILED", "UNKNOWN", com.alipay.sdk.m.f0.c.p, "NO_SPACE", "NOT_FOUND", "NOT_SUPPORT_OP", "INVALID_PARAMETER", "NO_DIAL_IDS", "TIME_OUT", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public enum DiaResultCode {
        FAILED(0),
        UNKNOWN(7),
        SUCCESS(1),
        NO_SPACE(2),
        NOT_FOUND(3),
        NOT_SUPPORT_OP(4),
        INVALID_PARAMETER(5),
        NO_DIAL_IDS(6),
        TIME_OUT(-1);


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final int value;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/DialModule$DiaResultCode$Companion;", "", "", "value", "Lcom/huami/bluetooth/profile/channel/module/DialModule$DiaResultCode;", "fromValue", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Code duplicated, block: B:13:0x001d  */
            /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
            @NotNull
            public final DiaResultCode fromValue(int value) {
                for (DiaResultCode diaResultCode : DiaResultCode.values()) {
                    if (diaResultCode.getValue() == value) {
                        if (diaResultCode == null) {
                            return DiaResultCode.UNKNOWN;
                        }
                        return diaResultCode;
                    }
                }
                diaResultCode = null;
                if (diaResultCode == null) {
                    return DiaResultCode.UNKNOWN;
                }
                return diaResultCode;
            }
        }

        DiaResultCode(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0004\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0005\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00028\u0000HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\b\u001a\u00028\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0006¨\u0006\u001b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/DialModule$DialData;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lcom/huami/bluetooth/profile/channel/module/DialModule$DiaResultCode;", "component1", "component2", "()Ljava/lang/Object;", "resultCode", "data", "copy", "(Lcom/huami/bluetooth/profile/channel/module/DialModule$DiaResultCode;Ljava/lang/Object;)Lcom/huami/bluetooth/profile/channel/module/DialModule$DialData;", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/huami/bluetooth/profile/channel/module/DialModule$DiaResultCode;", "getResultCode", "()Lcom/huami/bluetooth/profile/channel/module/DialModule$DiaResultCode;", "b", "Ljava/lang/Object;", "getData", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/DialModule$DiaResultCode;Ljava/lang/Object;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class DialData<T> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final DiaResultCode resultCode;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final T data;

        public DialData(@NotNull DiaResultCode diaResultCode, T t) {
            this.resultCode = diaResultCode;
            this.data = t;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DialData copy$default(DialData dialData, DiaResultCode diaResultCode, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                diaResultCode = dialData.resultCode;
            }
            if ((i & 2) != 0) {
                obj = dialData.data;
            }
            return dialData.copy(diaResultCode, obj);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final DiaResultCode getResultCode() {
            return this.resultCode;
        }

        public final T component2() {
            return this.data;
        }

        @NotNull
        public final DialData<T> copy(@NotNull DiaResultCode resultCode, T data) {
            return new DialData<>(resultCode, data);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DialData)) {
                return false;
            }
            DialData dialData = (DialData) other;
            return this.resultCode == dialData.resultCode && Intrinsics.areEqual(this.data, dialData.data);
        }

        public final T getData() {
            return this.data;
        }

        @NotNull
        public final DiaResultCode getResultCode() {
            return this.resultCode;
        }

        public int hashCode() {
            int iHashCode = this.resultCode.hashCode() * 31;
            T t = this.data;
            return iHashCode + (t == null ? 0 : t.hashCode());
        }

        @NotNull
        public String toString() {
            return "DialData(resultCode=" + this.resultCode + ", data=" + this.data + ')';
        }

        public /* synthetic */ DialData(DiaResultCode diaResultCode, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? DiaResultCode.UNKNOWN : diaResultCode, obj);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/DialModule$IDialChangeListener;", "", "Lcom/huami/bluetooth/profile/channel/module/DialModule$OpType;", AdRemindParserKt.KEY_OP, "", "dialId", "", "onDialChange", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public interface IDialChangeListener {

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public static final class DefaultImpls {
            public static /* synthetic */ void onDialChange$default(IDialChangeListener iDialChangeListener, OpType opType, int i, int i2, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onDialChange");
                }
                if ((i2 & 1) != 0) {
                    opType = OpType.OP_UNKNOWN;
                }
                iDialChangeListener.onDialChange(opType, i);
            }
        }

        void onDialChange(@NotNull OpType op, int dialId);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/DialModule$OpType;", "", "", "value", LogUtil.I, "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "OP_UNKNOWN", "OP_CHANGE", "OP_EDIT", "OP_DELETE", "OP_REPLACE", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public enum OpType {
        OP_UNKNOWN(0),
        OP_CHANGE(1),
        OP_EDIT(2),
        OP_DELETE(3),
        OP_REPLACE(4);


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final int value;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/DialModule$OpType$Companion;", "", "", "value", "Lcom/huami/bluetooth/profile/channel/module/DialModule$OpType;", "fromValue", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Code duplicated, block: B:13:0x001d  */
            /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
            @NotNull
            public final OpType fromValue(int value) {
                for (OpType opType : OpType.values()) {
                    if (opType.getValue() == value) {
                        if (opType == null) {
                            return OpType.OP_UNKNOWN;
                        }
                        return opType;
                    }
                }
                opType = null;
                if (opType == null) {
                    return OpType.OP_UNKNOWN;
                }
                return opType;
            }
        }

        OpType(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule", f = "DialModule.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {337, 78, 84}, m = "checkDeviceSpace", n = {"this", "$receiver$iv", "dialId", "imageSize", "this", "$receiver$iv", "dialId", "imageSize"}, s = {"L$0", "L$1", "I$0", "J$0", "L$0", "L$1", "I$0", "J$0"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public Object b;
        public int c;
        public long d;
        public /* synthetic */ Object e;
        public int g;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return DialModule.this.checkDeviceSpace(0, 0L, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule$checkDeviceSpace$2$response$1", f = "DialModule.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DialModule.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) DialModule.this.channels.get(Boxing.boxInt(4));
                if (channel == null) {
                    return null;
                }
                this.a = 1;
                obj = channel.receive(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return (ChannelResponse) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/DialModule$DialData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule$checkDeviceSpaceSync$1", f = "DialModule.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DialData<Boolean>>, Object> {
        public int a;
        public final /* synthetic */ int c;
        public final /* synthetic */ long d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i, long j, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = i;
            this.d = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DialModule.this.new c(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super DialData<Boolean>> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DialModule dialModule = DialModule.this;
                int i2 = this.c;
                long j = this.d;
                this.a = 1;
                obj = dialModule.checkDeviceSpace(i2, j, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule", f = "DialModule.kt", i = {0, 0, 0}, l = {337, DataTypeSource.SPORT_TYPE_MODERN_DANCE, DataTypeSource.SPORT_TYPE_NO_GPS_SOCCER}, m = "deleteDial", n = {"this", "dialIds", "$receiver$iv"}, s = {"L$0", "L$1", "L$2"})
    public static final class d extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return DialModule.this.deleteDial(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule$deleteDial$2$response$1", f = "DialModule.kt", i = {}, l = {192}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DialModule.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) DialModule.this.channels.get(Boxing.boxInt(14));
                if (channel == null) {
                    return null;
                }
                this.a = 1;
                obj = channel.receive(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return (ChannelResponse) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/DialModule$DialData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule$deleteDialSync$1", f = "DialModule.kt", i = {}, l = {171}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DialData<Boolean>>, Object> {
        public int a;
        public final /* synthetic */ List<Integer> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List<Integer> list, Continuation<? super f> continuation) {
            super(2, continuation);
            this.c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DialModule.this.new f(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super DialData<Boolean>> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DialModule dialModule = DialModule.this;
                List<Integer> list = this.c;
                this.a = 1;
                obj = dialModule.deleteDial(list, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule", f = "DialModule.kt", i = {0, 0, 1, 1}, l = {337, 133, 140}, m = "getDialId", n = {"this", "$receiver$iv", "this", "$receiver$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class g extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return DialModule.this.getDialId(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule$getDialId$2$response$1", f = "DialModule.kt", i = {}, l = {141}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DialModule.this.new h(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) DialModule.this.channels.get(Boxing.boxInt(10));
                if (channel == null) {
                    return null;
                }
                this.a = 1;
                obj = channel.receive(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return (ChannelResponse) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule", f = "DialModule.kt", i = {0, 0, 1, 1}, l = {337, 96, 102}, m = "getDialIdList", n = {"this", "$receiver$iv", "this", "$receiver$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class i extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return DialModule.this.getDialIdList(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule$getDialIdList$2$response$1", f = "DialModule.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DialModule.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) DialModule.this.channels.get(Boxing.boxInt(6));
                if (channel == null) {
                    return null;
                }
                this.a = 1;
                obj = channel.receive(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return (ChannelResponse) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/DialModule$DialData;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule$getDialIdListSync$1", f = "DialModule.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DialData<List<? extends Integer>>>, Object> {
        public int a;

        public k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DialModule.this.new k(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super DialData<List<? extends Integer>>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super DialData<List<Integer>>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super DialData<List<Integer>>> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DialModule dialModule = DialModule.this;
                this.a = 1;
                obj = dialModule.getDialIdList(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/DialModule$DialData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule$getDialIdSync$1", f = "DialModule.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DialData<Integer>>, Object> {
        public int a;

        public l(Continuation<? super l> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DialModule.this.new l(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super DialData<Integer>> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DialModule dialModule = DialModule.this;
                this.a = 1;
                obj = dialModule.getDialId(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function1<ChannelResponse, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule$init$1$1", f = "DialModule.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ ChannelResponse b;
            public final /* synthetic */ DialModule c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ChannelResponse channelResponse, DialModule dialModule, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = channelResponse;
                this.c = dialModule;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.b.getData().length == 0) {
                        return Unit.INSTANCE;
                    }
                    Debug.fi(DialModule.TAG, Intrinsics.stringPlus("Receive Dial Request:", GattUtils.bytesToHexString(this.b.getData())));
                    if (this.b.getData().length < 2) {
                        Debug.fi(DialModule.TAG, "size too short");
                        return Unit.INSTANCE;
                    }
                    byte bFirst = ArraysKt___ArraysKt.first(this.b.getData());
                    if (bFirst == 255) {
                        this.c.d(ByteArrayKt.subArrayWithoutFirstElement(this.b.getData()));
                    } else {
                        Channel channel = (Channel) this.c.channels.get(Boxing.boxInt(bFirst));
                        if (channel != null) {
                            ChannelResponse channelResponse = this.b;
                            this.a = 1;
                            if (channel.send(channelResponse, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public m() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse channelResponse) {
            DialModule dialModule = DialModule.this;
            kotlinx.coroutines.e.f(dialModule, null, null, new a(channelResponse, dialModule, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ChannelResponse channelResponse) {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlinx/coroutines/Job;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<Job> {
        public static final n a = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Job invoke() {
            return JobKt__JobKt.e(null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule", f = "DialModule.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {337, 157, 163}, m = "replaceDialId", n = {"this", "$receiver$iv", "srcId", "dest", "size", "this", "$receiver$iv", "srcId", "dest", "size"}, s = {"L$0", "L$1", "I$0", "I$1", "J$0", "L$0", "L$1", "I$0", "I$1", "J$0"})
    public static final class o extends ContinuationImpl {
        public Object a;
        public Object b;
        public int c;
        public int d;
        public long e;
        public /* synthetic */ Object f;
        public int h;

        public o(Continuation<? super o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f = obj;
            this.h |= Integer.MIN_VALUE;
            return DialModule.this.replaceDialId(0, 0, 0L, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule$replaceDialId$2$response$1", f = "DialModule.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
    public static final class p extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public p(Continuation<? super p> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DialModule.this.new p(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) DialModule.this.channels.get(Boxing.boxInt(12));
                if (channel == null) {
                    return null;
                }
                this.a = 1;
                obj = channel.receive(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return (ChannelResponse) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/DialModule$DialData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule$replaceDialIdSync$1", f = "DialModule.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
    public static final class q extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DialData<Integer>>, Object> {
        public int a;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ long e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(int i, int i2, long j, Continuation<? super q> continuation) {
            super(2, continuation);
            this.c = i;
            this.d = i2;
            this.e = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DialModule.this.new q(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super DialData<Integer>> continuation) {
            return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DialModule dialModule = DialModule.this;
                int i2 = this.c;
                int i3 = this.d;
                long j = this.e;
                this.a = 1;
                obj = dialModule.replaceDialId(i2, i3, j, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule", f = "DialModule.kt", i = {0, 0, 0, 1, 1}, l = {337, 212, 217}, m = "setDialDefaultColor", n = {"this", "$receiver$iv", "colorId", "this", "$receiver$iv"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1"})
    public static final class r extends ContinuationImpl {
        public Object a;
        public Object b;
        public int c;
        public /* synthetic */ Object d;
        public int f;

        public r(Continuation<? super r> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return DialModule.this.setDialDefaultColor(0, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule$setDialDefaultColor$2$response$1", f = "DialModule.kt", i = {}, l = {218}, m = "invokeSuspend", n = {}, s = {})
    public static final class s extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public s(Continuation<? super s> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DialModule.this.new s(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((s) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) DialModule.this.channels.get(Boxing.boxInt(16));
                if (channel == null) {
                    return null;
                }
                this.a = 1;
                obj = channel.receive(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return (ChannelResponse) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/DialModule$DialData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule$setDialDefaultColorSync$1", f = "DialModule.kt", i = {}, l = {202}, m = "invokeSuspend", n = {}, s = {})
    public static final class t extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DialData<Boolean>>, Object> {
        public int a;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(int i, Continuation<? super t> continuation) {
            super(2, continuation);
            this.c = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DialModule.this.new t(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super DialData<Boolean>> continuation) {
            return ((t) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DialModule dialModule = DialModule.this;
                int i2 = this.c;
                this.a = 1;
                obj = dialModule.setDialDefaultColor(i2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule", f = "DialModule.kt", i = {0, 0, 0, 1, 1, 1}, l = {337, 116, 122}, m = "setDialId", n = {"this", "$receiver$iv", "diaId", "this", "$receiver$iv", "diaId"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0"})
    public static final class u extends ContinuationImpl {
        public Object a;
        public Object b;
        public int c;
        public /* synthetic */ Object d;
        public int f;

        public u(Continuation<? super u> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return DialModule.this.setDialId(0, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule$setDialId$2$response$1", f = "DialModule.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
    public static final class v extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public v(Continuation<? super v> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DialModule.this.new v(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((v) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) DialModule.this.channels.get(Boxing.boxInt(8));
                if (channel == null) {
                    return null;
                }
                this.a = 1;
                obj = channel.receive(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return (ChannelResponse) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/DialModule$DialData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule$setDialIdSync$1", f = "DialModule.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
    public static final class w extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DialData<Boolean>>, Object> {
        public int a;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(int i, Continuation<? super w> continuation) {
            super(2, continuation);
            this.c = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DialModule.this.new w(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super DialData<Boolean>> continuation) {
            return ((w) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DialModule dialModule = DialModule.this;
                int i2 = this.c;
                this.a = 1;
                obj = dialModule.setDialId(i2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    public DialModule(@NotNull ChannelApi channelApi) {
        super(channelApi);
        this.mutex = MutexKt.Mutex$default(false, 1, null);
        this.job = LazyKt__LazyJVMKt.lazy(n.a);
        this.channels = new LinkedHashMap();
    }

    private final Job c() {
        return (Job) this.job.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(byte[] data) {
        BufByteDecoder bufByteDecoder = new BufByteDecoder(data, 0, 2, null);
        int i2 = bufByteDecoder.readInt(1);
        int int$default = BufByteDecoder.readInt$default(bufByteDecoder, 0, 1, null);
        IDialChangeListener iDialChangeListener = this.mCallback;
        if (iDialChangeListener == null) {
            return;
        }
        iDialChangeListener.onDialChange(OpType.INSTANCE.fromValue(i2), int$default);
    }

    private final DialData<List<Integer>> e(ChannelResponse response) {
        Debug.i(TAG, Intrinsics.stringPlus("queryDialList:response:", response));
        BufByteDecoder bufByteDecoder = new BufByteDecoder(ByteArrayKt.subArrayWithoutFirstElement(response.getData()), 0, 2, null);
        DiaResultCode diaResultCodeFromValue = DiaResultCode.INSTANCE.fromValue(bufByteDecoder.readInt(1));
        ArrayList arrayList = new ArrayList();
        int i2 = diaResultCodeFromValue == DiaResultCode.SUCCESS ? bufByteDecoder.readInt(1) : 0;
        if (i2 > 0 && i2 > 0) {
            int i3 = 0;
            do {
                i3++;
                arrayList.add(Integer.valueOf(BufByteDecoder.readInt$default(bufByteDecoder, 0, 1, null)));
            } while (i3 < i2);
        }
        return new DialData<>(diaResultCodeFromValue, arrayList);
    }

    private final DialData<Integer> f(ChannelResponse response) {
        Debug.i(TAG, Intrinsics.stringPlus("getDialId:response:", response));
        return new DialData<>(DiaResultCode.SUCCESS, Integer.valueOf(BufByteDecoder.readInt$default(new BufByteDecoder(ByteArrayKt.subArrayWithoutFirstElement(response.getData()), 0, 2, null), 0, 1, null)));
    }

    private final DialData<Integer> g(ChannelResponse response) {
        Debug.i(TAG, Intrinsics.stringPlus("parseOpDialIntResult:response:", response));
        DiaResultCode diaResultCodeFromValue = DiaResultCode.INSTANCE.fromValue(new BufByteDecoder(ByteArrayKt.subArrayWithoutFirstElement(response.getData()), 0, 2, null).readInt(1));
        return new DialData<>(diaResultCodeFromValue, Integer.valueOf(diaResultCodeFromValue.getValue()));
    }

    private final DialData<Boolean> h(ChannelResponse response) {
        Debug.i(TAG, Intrinsics.stringPlus("parseOpDialResult:response:", response));
        DiaResultCode diaResultCodeFromValue = DiaResultCode.INSTANCE.fromValue(new BufByteDecoder(ByteArrayKt.subArrayWithoutFirstElement(response.getData()), 0, 2, null).readInt(1));
        return new DialData<>(diaResultCodeFromValue, Boolean.valueOf(diaResultCodeFromValue == DiaResultCode.SUCCESS));
    }

    /* JADX WARN: Code duplicated, block: B:38:0x010d  */
    /* JADX WARN: Code duplicated, block: B:39:0x010f  */
    /* JADX WARN: Code duplicated, block: B:42:0x011c A[Catch: all -> 0x005b, TryCatch #2 {all -> 0x005b, blocks: (B:21:0x0056, B:36:0x00e9, B:40:0x0110, B:42:0x011c, B:43:0x0128), top: B:65:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0128 A[Catch: all -> 0x005b, TRY_LEAVE, TryCatch #2 {all -> 0x005b, blocks: (B:21:0x0056, B:36:0x00e9, B:40:0x0110, B:42:0x011c, B:43:0x0128), top: B:65:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x013b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x013c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0142 A[Catch: all -> 0x003f, TryCatch #3 {all -> 0x003f, blocks: (B:14:0x003a, B:47:0x013e, B:49:0x0142, B:50:0x014e), top: B:66:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:50:0x014e A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #3 {all -> 0x003f, blocks: (B:14:0x003a, B:47:0x013e, B:49:0x0142, B:50:0x014e), top: B:66:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object checkDeviceSpace(int i2, long j2, @NotNull Continuation<? super DialData<Boolean>> continuation) throws Throwable {
        a aVar;
        Mutex mutex;
        int i3;
        long j3;
        DialModule dialModule;
        Mutex mutex2;
        Mutex mutex3;
        byte[] byteArray;
        DialModule dialModule2;
        long j4;
        int i4;
        Mutex mutex4;
        DialModule dialModule3;
        long j5;
        boolean zBooleanValue;
        boolean z;
        DialModule dialModule4;
        DialData<Boolean> dialData;
        ChannelResponse channelResponse;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i5 = aVar.g;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                aVar.g = i5 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objWithTimeoutOrNull = aVar.e;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i6 = aVar.g;
        try {
            try {
                if (i6 == 0) {
                    ResultKt.throwOnFailure(objWithTimeoutOrNull);
                    Mutex mutex5 = this.mutex;
                    aVar.a = this;
                    aVar.b = mutex5;
                    aVar.c = i2;
                    aVar.d = j2;
                    aVar.g = 1;
                    if (mutex5.lock(null, aVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutex = mutex5;
                    i3 = i2;
                    j3 = j2;
                    dialModule = this;
                } else {
                    if (i6 != 1) {
                        if (i6 == 2) {
                            j5 = aVar.d;
                            i4 = aVar.c;
                            mutex4 = (Mutex) aVar.b;
                            dialModule3 = (DialModule) aVar.a;
                            try {
                                ResultKt.throwOnFailure(objWithTimeoutOrNull);
                                zBooleanValue = ((Boolean) objWithTimeoutOrNull).booleanValue();
                                StringBuilder sb = new StringBuilder();
                                sb.append("checkDeviceSpace:");
                                sb.append(i4);
                                sb.append(JsonLexerKt.COLON);
                                sb.append(j5);
                                sb.append(":result:");
                                if (zBooleanValue) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                sb.append(z);
                                Debug.fi(TAG, sb.toString());
                                if (zBooleanValue) {
                                    b bVar = dialModule3.new b(null);
                                    aVar.a = dialModule3;
                                    aVar.b = mutex4;
                                    aVar.g = 3;
                                    objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, bVar, aVar);
                                    if (objWithTimeoutOrNull == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    mutex3 = mutex4;
                                    dialModule4 = dialModule3;
                                    channelResponse = (ChannelResponse) objWithTimeoutOrNull;
                                    if (channelResponse == null) {
                                        dialData = new DialData<>(DiaResultCode.TIME_OUT, Boxing.boxBoolean(false));
                                    } else {
                                        dialModule4.channels.remove(Boxing.boxInt(4));
                                        dialData = dialModule4.h(channelResponse);
                                    }
                                    mutex4 = mutex3;
                                } else {
                                    dialData = new DialData<>(DiaResultCode.FAILED, Boxing.boxBoolean(false));
                                }
                                mutex4.unlock(null);
                                return dialData;
                            } catch (Throwable th) {
                                th = th;
                                mutex3 = mutex4;
                            }
                        } else {
                            if (i6 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex3 = (Mutex) aVar.b;
                            dialModule4 = (DialModule) aVar.a;
                            try {
                                ResultKt.throwOnFailure(objWithTimeoutOrNull);
                                channelResponse = (ChannelResponse) objWithTimeoutOrNull;
                                if (channelResponse == null) {
                                    dialData = new DialData<>(DiaResultCode.TIME_OUT, Boxing.boxBoolean(false));
                                } else {
                                    dialModule4.channels.remove(Boxing.boxInt(4));
                                    dialData = dialModule4.h(channelResponse);
                                }
                                mutex4 = mutex3;
                                mutex4.unlock(null);
                                return dialData;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        mutex3.unlock(null);
                        throw th;
                    }
                    long j6 = aVar.d;
                    int i7 = aVar.c;
                    mutex = (Mutex) aVar.b;
                    DialModule dialModule5 = (DialModule) aVar.a;
                    ResultKt.throwOnFailure(objWithTimeoutOrNull);
                    i3 = i7;
                    dialModule = dialModule5;
                    j3 = j6;
                }
                Object objSendDataWithResult$default = BaseModule.sendDataWithResult$default(dialModule, byteArray, 0, false, aVar, 6, null);
                if (objSendDataWithResult$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i4 = i3;
                objWithTimeoutOrNull = objSendDataWithResult$default;
                mutex4 = mutex2;
                dialModule3 = dialModule2;
                j5 = j4;
                zBooleanValue = ((Boolean) objWithTimeoutOrNull).booleanValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("checkDeviceSpace:");
                sb2.append(i4);
                sb2.append(JsonLexerKt.COLON);
                sb2.append(j5);
                sb2.append(":result:");
                if (zBooleanValue) {
                    z = true;
                } else {
                    z = false;
                }
                sb2.append(z);
                Debug.fi(TAG, sb2.toString());
                if (zBooleanValue) {
                    dialData = new DialData<>(DiaResultCode.FAILED, Boxing.boxBoolean(false));
                } else {
                    b bVar2 = dialModule3.new b(null);
                    aVar.a = dialModule3;
                    aVar.b = mutex4;
                    aVar.g = 3;
                    objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, bVar2, aVar);
                    if (objWithTimeoutOrNull == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutex3 = mutex4;
                    dialModule4 = dialModule3;
                    channelResponse = (ChannelResponse) objWithTimeoutOrNull;
                    if (channelResponse == null) {
                        dialData = new DialData<>(DiaResultCode.TIME_OUT, Boxing.boxBoolean(false));
                    } else {
                        dialModule4.channels.remove(Boxing.boxInt(4));
                        dialData = dialModule4.h(channelResponse);
                    }
                    mutex4 = mutex3;
                }
                mutex4.unlock(null);
                return dialData;
            } catch (Throwable th3) {
                th = th3;
                mutex3 = mutex2;
                mutex3.unlock(null);
                throw th;
            }
            dialModule.channels.put(Boxing.boxInt(4), ChannelKt.Channel$default(0, 1, null));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(3);
            byteArrayOutputStream.write(GattUtils.intToBytes(i3));
            byteArrayOutputStream.write(GattUtils.numberToBytes(j3, 4));
            byteArray = byteArrayOutputStream.toByteArray();
            aVar.a = dialModule;
            aVar.b = mutex;
            aVar.c = i3;
            aVar.d = j3;
            aVar.g = 2;
            dialModule2 = dialModule;
            mutex2 = mutex;
            j4 = j3;
        } catch (Throwable th4) {
            th = th4;
            mutex2 = mutex;
        }
    }

    @NotNull
    public final DialData<Boolean> checkDeviceSpaceSync(int dialId, long imageSize) {
        return (DialData) kotlinx.coroutines.d.b(null, new c(dialId, imageSize, null), 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x011d  */
    /* JADX WARN: Code duplicated, block: B:48:0x011e  */
    /* JADX WARN: Code duplicated, block: B:51:0x012b A[Catch: all -> 0x0059, TryCatch #3 {all -> 0x0059, blocks: (B:14:0x003b, B:56:0x014e, B:58:0x0152, B:59:0x015e, B:19:0x0054, B:45:0x0101, B:49:0x011f, B:51:0x012b, B:52:0x0137), top: B:75:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0137 A[Catch: all -> 0x0059, TryCatch #3 {all -> 0x0059, blocks: (B:14:0x003b, B:56:0x014e, B:58:0x0152, B:59:0x015e, B:19:0x0054, B:45:0x0101, B:49:0x011f, B:51:0x012b, B:52:0x0137), top: B:75:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:54:0x014c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x014d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0152 A[Catch: all -> 0x0059, TryCatch #3 {all -> 0x0059, blocks: (B:14:0x003b, B:56:0x014e, B:58:0x0152, B:59:0x015e, B:19:0x0054, B:45:0x0101, B:49:0x011f, B:51:0x012b, B:52:0x0137), top: B:75:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:59:0x015e A[Catch: all -> 0x0059, TRY_LEAVE, TryCatch #3 {all -> 0x0059, blocks: (B:14:0x003b, B:56:0x014e, B:58:0x0152, B:59:0x015e, B:19:0x0054, B:45:0x0101, B:49:0x011f, B:51:0x012b, B:52:0x0137), top: B:75:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Nullable
    public final Object deleteDial(@NotNull List<Integer> list, @NotNull Continuation<? super DialData<Boolean>> continuation) throws Throwable {
        d dVar;
        Mutex mutex;
        DialModule dialModule;
        List<Integer> list2;
        Mutex mutex2;
        int size;
        List<Integer> list3;
        Mutex mutex3;
        DialModule dialModule2;
        DialData<Boolean> dialData;
        boolean zBooleanValue;
        DialModule dialModule3;
        ChannelResponse channelResponse;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i2 = dVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.f = i2 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objWithTimeoutOrNull = dVar.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        ?? r3 = dVar.f;
        boolean z = true;
        try {
            try {
                try {
                    if (r3 != 0) {
                        if (r3 == 1) {
                            Mutex mutex4 = (Mutex) dVar.c;
                            List<Integer> list4 = (List) dVar.b;
                            DialModule dialModule4 = (DialModule) dVar.a;
                            ResultKt.throwOnFailure(objWithTimeoutOrNull);
                            mutex = mutex4;
                            list2 = list4;
                            dialModule = dialModule4;
                        } else {
                            if (r3 == 2) {
                                mutex3 = (Mutex) dVar.c;
                                list3 = (List) dVar.b;
                                dialModule2 = (DialModule) dVar.a;
                                ResultKt.throwOnFailure(objWithTimeoutOrNull);
                                zBooleanValue = ((Boolean) objWithTimeoutOrNull).booleanValue();
                                StringBuilder sb = new StringBuilder();
                                sb.append("deleteDial:");
                                sb.append(list3);
                                sb.append(":result:");
                                if (zBooleanValue) {
                                    z = false;
                                }
                                sb.append(z);
                                Debug.fi(TAG, sb.toString());
                                if (zBooleanValue) {
                                    e eVar = dialModule2.new e(null);
                                    dVar.a = dialModule2;
                                    dVar.b = mutex3;
                                    dVar.c = null;
                                    dVar.f = 3;
                                    objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, eVar, dVar);
                                    if (objWithTimeoutOrNull == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    dialModule3 = dialModule2;
                                } else {
                                    dialData = new DialData<>(DiaResultCode.FAILED, Boxing.boxBoolean(false));
                                }
                                mutex = mutex3;
                                mutex.unlock(null);
                                return dialData;
                            }
                            if (r3 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex3 = (Mutex) dVar.b;
                            dialModule3 = (DialModule) dVar.a;
                            ResultKt.throwOnFailure(objWithTimeoutOrNull);
                        }
                        channelResponse = (ChannelResponse) objWithTimeoutOrNull;
                        if (channelResponse == null) {
                            dialData = new DialData<>(DiaResultCode.TIME_OUT, Boxing.boxBoolean(false));
                        } else {
                            dialModule3.channels.remove(Boxing.boxInt(14));
                            dialData = dialModule3.h(channelResponse);
                        }
                        mutex = mutex3;
                        mutex.unlock(null);
                        return dialData;
                    }
                    ResultKt.throwOnFailure(objWithTimeoutOrNull);
                    Mutex mutex5 = this.mutex;
                    dVar.a = this;
                    dVar.b = list;
                    dVar.c = mutex5;
                    dVar.f = 1;
                    if (mutex5.lock(null, dVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutex = mutex5;
                    dialModule = this;
                    list2 = list;
                    if (size == 0) {
                        dialData = new DialData<>(DiaResultCode.FAILED, Boxing.boxBoolean(false));
                    } else {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byteArrayOutputStream.write(13);
                        byteArrayOutputStream.write(size);
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            byteArrayOutputStream.write(GattUtils.intToBytes(((Number) it2.next()).intValue()));
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        dVar.a = dialModule;
                        dVar.b = list2;
                        dVar.c = mutex;
                        dVar.f = 2;
                        DialModule dialModule5 = dialModule;
                        mutex2 = mutex;
                        try {
                            Object objSendDataWithResult$default = BaseModule.sendDataWithResult$default(dialModule, byteArray, 0, false, dVar, 6, null);
                            if (objSendDataWithResult$default == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            list3 = list2;
                            objWithTimeoutOrNull = objSendDataWithResult$default;
                            mutex3 = mutex2;
                            dialModule2 = dialModule5;
                            zBooleanValue = ((Boolean) objWithTimeoutOrNull).booleanValue();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("deleteDial:");
                            sb2.append(list3);
                            sb2.append(":result:");
                            if (zBooleanValue) {
                                z = false;
                            }
                            sb2.append(z);
                            Debug.fi(TAG, sb2.toString());
                            if (zBooleanValue) {
                                dialData = new DialData<>(DiaResultCode.FAILED, Boxing.boxBoolean(false));
                            } else {
                                e eVar2 = dialModule2.new e(null);
                                dVar.a = dialModule2;
                                dVar.b = mutex3;
                                dVar.c = null;
                                dVar.f = 3;
                                objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, eVar2, dVar);
                                if (objWithTimeoutOrNull == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                dialModule3 = dialModule2;
                                channelResponse = (ChannelResponse) objWithTimeoutOrNull;
                                if (channelResponse == null) {
                                    dialData = new DialData<>(DiaResultCode.TIME_OUT, Boxing.boxBoolean(false));
                                } else {
                                    dialModule3.channels.remove(Boxing.boxInt(14));
                                    dialData = dialModule3.h(channelResponse);
                                }
                            }
                            mutex = mutex3;
                        } catch (Throwable th) {
                            th = th;
                            r3 = mutex2;
                            r3.unlock(null);
                            throw th;
                        }
                    }
                    mutex.unlock(null);
                    return dialData;
                } catch (Throwable th2) {
                    th = th2;
                    r3 = mutex;
                    r3.unlock(null);
                    throw th;
                }
                dialModule.channels.put(Boxing.boxInt(14), ChannelKt.Channel$default(0, 1, null));
                size = list2.size();
            } catch (Throwable th3) {
                th = th3;
                mutex2 = mutex;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @NotNull
    public final DialData<Boolean> deleteDialSync(@NotNull List<Integer> dialIds) {
        return (DialData) kotlinx.coroutines.d.b(null, new f(dialIds, null), 1, null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return c().plus(Dispatchers.getIO());
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00be  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cc A[Catch: all -> 0x0056, TryCatch #1 {all -> 0x0056, blocks: (B:14:0x003b, B:44:0x00ed, B:46:0x00f1, B:47:0x00fd, B:19:0x0050, B:34:0x00b2, B:37:0x00bf, B:39:0x00cc, B:40:0x00d8), top: B:59:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d8 A[Catch: all -> 0x0056, TryCatch #1 {all -> 0x0056, blocks: (B:14:0x003b, B:44:0x00ed, B:46:0x00f1, B:47:0x00fd, B:19:0x0050, B:34:0x00b2, B:37:0x00bf, B:39:0x00cc, B:40:0x00d8), top: B:59:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00eb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f1 A[Catch: all -> 0x0056, TryCatch #1 {all -> 0x0056, blocks: (B:14:0x003b, B:44:0x00ed, B:46:0x00f1, B:47:0x00fd, B:19:0x0050, B:34:0x00b2, B:37:0x00bf, B:39:0x00cc, B:40:0x00d8), top: B:59:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00fd A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #1 {all -> 0x0056, blocks: (B:14:0x003b, B:44:0x00ed, B:46:0x00f1, B:47:0x00fd, B:19:0x0050, B:34:0x00b2, B:37:0x00bf, B:39:0x00cc, B:40:0x00d8), top: B:59:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Nullable
    public final Object getDialId(@NotNull Continuation<? super DialData<Integer>> continuation) throws Throwable {
        g gVar;
        Mutex mutex;
        DialModule dialModule;
        Mutex mutex2;
        byte[] bArr;
        DialModule dialModule2;
        Mutex mutex3;
        boolean zBooleanValue;
        DialModule dialModule3;
        DialData<Integer> dialData;
        ChannelResponse channelResponse;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i2 = gVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.e = i2 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object objWithTimeoutOrNull = gVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        ?? r4 = gVar.e;
        try {
            try {
                try {
                    if (r4 != 0) {
                        if (r4 == 1) {
                            Mutex mutex4 = (Mutex) gVar.b;
                            DialModule dialModule4 = (DialModule) gVar.a;
                            ResultKt.throwOnFailure(objWithTimeoutOrNull);
                            mutex = mutex4;
                            dialModule = dialModule4;
                        } else {
                            if (r4 == 2) {
                                mutex3 = (Mutex) gVar.b;
                                dialModule2 = (DialModule) gVar.a;
                                ResultKt.throwOnFailure(objWithTimeoutOrNull);
                                zBooleanValue = ((Boolean) objWithTimeoutOrNull).booleanValue();
                                Debug.fi(TAG, Intrinsics.stringPlus("getDialId:result:", Boxing.boxBoolean(zBooleanValue)));
                                if (zBooleanValue) {
                                    h hVar = dialModule2.new h(null);
                                    gVar.a = dialModule2;
                                    gVar.b = mutex3;
                                    gVar.e = 3;
                                    objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, hVar, gVar);
                                    if (objWithTimeoutOrNull == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    dialModule3 = dialModule2;
                                } else {
                                    dialData = new DialData<>(DiaResultCode.FAILED, Boxing.boxInt(Integer.MIN_VALUE));
                                }
                                mutex3.unlock(null);
                                return dialData;
                            }
                            if (r4 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex3 = (Mutex) gVar.b;
                            dialModule3 = (DialModule) gVar.a;
                            ResultKt.throwOnFailure(objWithTimeoutOrNull);
                        }
                        channelResponse = (ChannelResponse) objWithTimeoutOrNull;
                        if (channelResponse == null) {
                            dialData = new DialData<>(DiaResultCode.TIME_OUT, Boxing.boxInt(Integer.MIN_VALUE));
                        } else {
                            dialModule3.channels.remove(Boxing.boxInt(10));
                            dialData = dialModule3.f(channelResponse);
                        }
                        mutex3.unlock(null);
                        return dialData;
                    }
                    ResultKt.throwOnFailure(objWithTimeoutOrNull);
                    Mutex mutex5 = this.mutex;
                    gVar.a = this;
                    gVar.b = mutex5;
                    gVar.e = 1;
                    if (mutex5.lock(null, gVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutex = mutex5;
                    dialModule = this;
                    Object objSendDataWithResult$default = BaseModule.sendDataWithResult$default(dialModule, bArr, 0, false, gVar, 6, null);
                    if (objSendDataWithResult$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    dialModule2 = dialModule;
                    objWithTimeoutOrNull = objSendDataWithResult$default;
                    mutex3 = mutex2;
                    zBooleanValue = ((Boolean) objWithTimeoutOrNull).booleanValue();
                    Debug.fi(TAG, Intrinsics.stringPlus("getDialId:result:", Boxing.boxBoolean(zBooleanValue)));
                    if (zBooleanValue) {
                        dialData = new DialData<>(DiaResultCode.FAILED, Boxing.boxInt(Integer.MIN_VALUE));
                    } else {
                        h hVar2 = dialModule2.new h(null);
                        gVar.a = dialModule2;
                        gVar.b = mutex3;
                        gVar.e = 3;
                        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, hVar2, gVar);
                        if (objWithTimeoutOrNull == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        dialModule3 = dialModule2;
                        channelResponse = (ChannelResponse) objWithTimeoutOrNull;
                        if (channelResponse == null) {
                            dialData = new DialData<>(DiaResultCode.TIME_OUT, Boxing.boxInt(Integer.MIN_VALUE));
                        } else {
                            dialModule3.channels.remove(Boxing.boxInt(10));
                            dialData = dialModule3.f(channelResponse);
                        }
                    }
                    mutex3.unlock(null);
                    return dialData;
                } catch (Throwable th) {
                    th = th;
                    r4 = mutex2;
                    r4.unlock(null);
                    throw th;
                }
                dialModule.channels.put(Boxing.boxInt(10), ChannelKt.Channel$default(0, 1, null));
                bArr = new byte[]{9};
                gVar.a = dialModule;
                gVar.b = mutex;
                gVar.e = 2;
                mutex2 = mutex;
            } catch (Throwable th2) {
                th = th2;
                mutex2 = mutex;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c3 A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:14:0x003a, B:44:0x00e4, B:46:0x00e8, B:47:0x00f4, B:19:0x004f, B:34:0x00a9, B:37:0x00b6, B:39:0x00c3, B:40:0x00cf), top: B:57:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00cf A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:14:0x003a, B:44:0x00e4, B:46:0x00e8, B:47:0x00f4, B:19:0x004f, B:34:0x00a9, B:37:0x00b6, B:39:0x00c3, B:40:0x00cf), top: B:57:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e8 A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:14:0x003a, B:44:0x00e4, B:46:0x00e8, B:47:0x00f4, B:19:0x004f, B:34:0x00a9, B:37:0x00b6, B:39:0x00c3, B:40:0x00cf), top: B:57:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00f4 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:14:0x003a, B:44:0x00e4, B:46:0x00e8, B:47:0x00f4, B:19:0x004f, B:34:0x00a9, B:37:0x00b6, B:39:0x00c3, B:40:0x00cf), top: B:57:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r3v3 */
    @Nullable
    public final Object getDialIdList(@NotNull Continuation<? super DialData<List<Integer>>> continuation) throws Throwable {
        i iVar;
        Mutex mutex;
        DialModule dialModule;
        Mutex mutex2;
        byte[] bArr;
        DialModule dialModule2;
        Mutex mutex3;
        boolean zBooleanValue;
        DialModule dialModule3;
        DialData<List<Integer>> dialData;
        ChannelResponse channelResponse;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i2 = iVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.e = i2 - Integer.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        } else {
            iVar = new i(continuation);
        }
        Object objWithTimeoutOrNull = iVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        ?? r3 = iVar.e;
        try {
            try {
                try {
                    if (r3 != 0) {
                        if (r3 == 1) {
                            Mutex mutex4 = (Mutex) iVar.b;
                            DialModule dialModule4 = (DialModule) iVar.a;
                            ResultKt.throwOnFailure(objWithTimeoutOrNull);
                            mutex = mutex4;
                            dialModule = dialModule4;
                        } else {
                            if (r3 == 2) {
                                mutex3 = (Mutex) iVar.b;
                                dialModule2 = (DialModule) iVar.a;
                                ResultKt.throwOnFailure(objWithTimeoutOrNull);
                                zBooleanValue = ((Boolean) objWithTimeoutOrNull).booleanValue();
                                Debug.fi(TAG, Intrinsics.stringPlus("getDialIdList", Boxing.boxBoolean(zBooleanValue)));
                                if (zBooleanValue) {
                                    j jVar = dialModule2.new j(null);
                                    iVar.a = dialModule2;
                                    iVar.b = mutex3;
                                    iVar.e = 3;
                                    objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, jVar, iVar);
                                    if (objWithTimeoutOrNull == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    dialModule3 = dialModule2;
                                } else {
                                    dialData = new DialData<>(DiaResultCode.FAILED, CollectionsKt__CollectionsKt.emptyList());
                                }
                                mutex3.unlock(null);
                                return dialData;
                            }
                            if (r3 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex3 = (Mutex) iVar.b;
                            dialModule3 = (DialModule) iVar.a;
                            ResultKt.throwOnFailure(objWithTimeoutOrNull);
                        }
                        channelResponse = (ChannelResponse) objWithTimeoutOrNull;
                        if (channelResponse == null) {
                            dialData = new DialData<>(DiaResultCode.TIME_OUT, CollectionsKt__CollectionsKt.emptyList());
                        } else {
                            dialModule3.channels.remove(Boxing.boxInt(6));
                            dialData = dialModule3.e(channelResponse);
                        }
                        mutex3.unlock(null);
                        return dialData;
                    }
                    ResultKt.throwOnFailure(objWithTimeoutOrNull);
                    Mutex mutex5 = this.mutex;
                    iVar.a = this;
                    iVar.b = mutex5;
                    iVar.e = 1;
                    if (mutex5.lock(null, iVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutex = mutex5;
                    dialModule = this;
                    Object objSendDataWithResult$default = BaseModule.sendDataWithResult$default(dialModule, bArr, 0, false, iVar, 6, null);
                    if (objSendDataWithResult$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    dialModule2 = dialModule;
                    objWithTimeoutOrNull = objSendDataWithResult$default;
                    mutex3 = mutex2;
                    zBooleanValue = ((Boolean) objWithTimeoutOrNull).booleanValue();
                    Debug.fi(TAG, Intrinsics.stringPlus("getDialIdList", Boxing.boxBoolean(zBooleanValue)));
                    if (zBooleanValue) {
                        dialData = new DialData<>(DiaResultCode.FAILED, CollectionsKt__CollectionsKt.emptyList());
                    } else {
                        j jVar2 = dialModule2.new j(null);
                        iVar.a = dialModule2;
                        iVar.b = mutex3;
                        iVar.e = 3;
                        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, jVar2, iVar);
                        if (objWithTimeoutOrNull == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        dialModule3 = dialModule2;
                        channelResponse = (ChannelResponse) objWithTimeoutOrNull;
                        if (channelResponse == null) {
                            dialData = new DialData<>(DiaResultCode.TIME_OUT, CollectionsKt__CollectionsKt.emptyList());
                        } else {
                            dialModule3.channels.remove(Boxing.boxInt(6));
                            dialData = dialModule3.e(channelResponse);
                        }
                    }
                    mutex3.unlock(null);
                    return dialData;
                } catch (Throwable th) {
                    th = th;
                    r3 = mutex2;
                    r3.unlock(null);
                    throw th;
                }
                dialModule.channels.put(Boxing.boxInt(6), ChannelKt.Channel$default(0, 1, null));
                bArr = new byte[]{5};
                iVar.a = dialModule;
                iVar.b = mutex;
                iVar.e = 2;
                mutex2 = mutex;
            } catch (Throwable th2) {
                th = th2;
                mutex2 = mutex;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @NotNull
    public final DialData<List<Integer>> getDialIdListSync() {
        return (DialData) kotlinx.coroutines.d.b(null, new k(null), 1, null);
    }

    @NotNull
    public final DialData<Integer> getDialIdSync() {
        return (DialData) kotlinx.coroutines.d.b(null, new l(null), 1, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public int getModule() {
        return 35;
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public void init() {
        BaseModule.registerCallback$default(this, getModule(), false, new m(), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x012f  */
    /* JADX WARN: Code duplicated, block: B:41:0x013c A[Catch: all -> 0x018d, TryCatch #2 {all -> 0x018d, blocks: (B:36:0x0105, B:39:0x0130, B:41:0x013c, B:42:0x014c, B:32:0x00f8), top: B:63:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x014c A[Catch: all -> 0x018d, TRY_LEAVE, TryCatch #2 {all -> 0x018d, blocks: (B:36:0x0105, B:39:0x0130, B:41:0x013c, B:42:0x014c, B:32:0x00f8), top: B:63:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0160 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x0161  */
    /* JADX WARN: Code duplicated, block: B:48:0x0167 A[Catch: all -> 0x0040, TryCatch #1 {all -> 0x0040, blocks: (B:14:0x003b, B:46:0x0163, B:48:0x0167, B:49:0x0179), top: B:62:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0179 A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #1 {all -> 0x0040, blocks: (B:14:0x003b, B:46:0x0163, B:48:0x0167, B:49:0x0179), top: B:62:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object replaceDialId(int i2, int i3, long j2, @NotNull Continuation<? super DialData<Integer>> continuation) throws Throwable {
        o oVar;
        int i4;
        long j3;
        Mutex mutex;
        DialModule dialModule;
        int i5;
        Mutex mutex2;
        Mutex mutex3;
        byte[] byteArray;
        DialModule dialModule2;
        long j4;
        int i6;
        int i7;
        int i8;
        long j5;
        boolean zBooleanValue;
        DialModule dialModule3;
        DialData<Integer> dialData;
        ChannelResponse channelResponse;
        if (continuation instanceof o) {
            oVar = (o) continuation;
            int i9 = oVar.h;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                oVar.h = i9 - Integer.MIN_VALUE;
            } else {
                oVar = new o(continuation);
            }
        } else {
            oVar = new o(continuation);
        }
        Object objWithTimeoutOrNull = oVar.f;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i10 = oVar.h;
        try {
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(objWithTimeoutOrNull);
                    Mutex mutex4 = this.mutex;
                    oVar.a = this;
                    oVar.b = mutex4;
                    oVar.c = i2;
                    oVar.d = i3;
                    oVar.e = j2;
                    oVar.h = 1;
                    if (mutex4.lock(null, oVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i4 = i3;
                    j3 = j2;
                    mutex = mutex4;
                    dialModule = this;
                    i5 = i2;
                } else {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            j5 = oVar.e;
                            i8 = oVar.d;
                            i7 = oVar.c;
                            Mutex mutex5 = (Mutex) oVar.b;
                            DialModule dialModule4 = (DialModule) oVar.a;
                            try {
                                ResultKt.throwOnFailure(objWithTimeoutOrNull);
                                mutex2 = mutex5;
                                dialModule2 = dialModule4;
                                zBooleanValue = ((Boolean) objWithTimeoutOrNull).booleanValue();
                                StringBuilder sb = new StringBuilder();
                                sb.append("replaceDialId:");
                                sb.append(i7);
                                sb.append(JsonLexerKt.COLON);
                                sb.append(i8);
                                sb.append(JsonLexerKt.COLON);
                                sb.append(j5);
                                sb.append(":result:");
                                sb.append(zBooleanValue);
                                Debug.fi(TAG, sb.toString());
                                if (zBooleanValue) {
                                    p pVar = dialModule2.new p(null);
                                    oVar.a = dialModule2;
                                    oVar.b = mutex2;
                                    oVar.h = 3;
                                    objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, pVar, oVar);
                                    if (objWithTimeoutOrNull == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    dialModule3 = dialModule2;
                                    mutex3 = mutex2;
                                    channelResponse = (ChannelResponse) objWithTimeoutOrNull;
                                    if (channelResponse == null) {
                                        dialData = new DialData<>(DiaResultCode.TIME_OUT, Boxing.boxInt(DiaResultCode.FAILED.getValue()));
                                    } else {
                                        dialModule3.channels.remove(Boxing.boxInt(12));
                                        dialData = dialModule3.g(channelResponse);
                                    }
                                    mutex2 = mutex3;
                                } else {
                                    DiaResultCode diaResultCode = DiaResultCode.FAILED;
                                    dialData = new DialData<>(diaResultCode, Boxing.boxInt(diaResultCode.getValue()));
                                }
                                mutex2.unlock(null);
                                return dialData;
                            } catch (Throwable th) {
                                th = th;
                                mutex3 = mutex5;
                            }
                        } else {
                            if (i10 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex3 = (Mutex) oVar.b;
                            dialModule3 = (DialModule) oVar.a;
                            try {
                                ResultKt.throwOnFailure(objWithTimeoutOrNull);
                                channelResponse = (ChannelResponse) objWithTimeoutOrNull;
                                if (channelResponse == null) {
                                    dialData = new DialData<>(DiaResultCode.TIME_OUT, Boxing.boxInt(DiaResultCode.FAILED.getValue()));
                                } else {
                                    dialModule3.channels.remove(Boxing.boxInt(12));
                                    dialData = dialModule3.g(channelResponse);
                                }
                                mutex2 = mutex3;
                                mutex2.unlock(null);
                                return dialData;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        mutex3.unlock(null);
                        throw th;
                    }
                    long j6 = oVar.e;
                    int i11 = oVar.d;
                    int i12 = oVar.c;
                    Mutex mutex6 = (Mutex) oVar.b;
                    DialModule dialModule5 = (DialModule) oVar.a;
                    ResultKt.throwOnFailure(objWithTimeoutOrNull);
                    i5 = i12;
                    i4 = i11;
                    mutex = mutex6;
                    j3 = j6;
                    dialModule = dialModule5;
                }
                Object objSendDataWithResult$default = BaseModule.sendDataWithResult$default(dialModule, byteArray, 0, false, oVar, 6, null);
                if (objSendDataWithResult$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i7 = i5;
                objWithTimeoutOrNull = objSendDataWithResult$default;
                i8 = i6;
                j5 = j4;
                zBooleanValue = ((Boolean) objWithTimeoutOrNull).booleanValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("replaceDialId:");
                sb2.append(i7);
                sb2.append(JsonLexerKt.COLON);
                sb2.append(i8);
                sb2.append(JsonLexerKt.COLON);
                sb2.append(j5);
                sb2.append(":result:");
                sb2.append(zBooleanValue);
                Debug.fi(TAG, sb2.toString());
                if (zBooleanValue) {
                    DiaResultCode diaResultCode2 = DiaResultCode.FAILED;
                    dialData = new DialData<>(diaResultCode2, Boxing.boxInt(diaResultCode2.getValue()));
                } else {
                    p pVar2 = dialModule2.new p(null);
                    oVar.a = dialModule2;
                    oVar.b = mutex2;
                    oVar.h = 3;
                    objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, pVar2, oVar);
                    if (objWithTimeoutOrNull == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    dialModule3 = dialModule2;
                    mutex3 = mutex2;
                    channelResponse = (ChannelResponse) objWithTimeoutOrNull;
                    if (channelResponse == null) {
                        dialData = new DialData<>(DiaResultCode.TIME_OUT, Boxing.boxInt(DiaResultCode.FAILED.getValue()));
                    } else {
                        dialModule3.channels.remove(Boxing.boxInt(12));
                        dialData = dialModule3.g(channelResponse);
                    }
                    mutex2 = mutex3;
                }
                mutex2.unlock(null);
                return dialData;
            } catch (Throwable th3) {
                th = th3;
                mutex3 = mutex2;
                mutex3.unlock(null);
                throw th;
            }
            dialModule.channels.put(Boxing.boxInt(12), ChannelKt.Channel$default(0, 1, null));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(11);
            byteArrayOutputStream.write(GattUtils.intToBytes(i5));
            byteArrayOutputStream.write(GattUtils.intToBytes(i4));
            byteArrayOutputStream.write(GattUtils.numberToBytes(j3, 4));
            byteArray = byteArrayOutputStream.toByteArray();
            oVar.a = dialModule;
            oVar.b = mutex;
            oVar.c = i5;
            oVar.d = i4;
            oVar.e = j3;
            oVar.h = 2;
            dialModule2 = dialModule;
            mutex2 = mutex;
            j4 = j3;
            i6 = i4;
        } catch (Throwable th4) {
            th = th4;
            mutex2 = mutex;
        }
    }

    @NotNull
    public final DialData<Integer> replaceDialIdSync(int srcId, int dest, long size) {
        return (DialData) kotlinx.coroutines.d.b(null, new q(srcId, dest, size, null), 1, null);
    }

    public final void setDialChangeCallBack(@NotNull IDialChangeListener callback) {
        this.mCallback = callback;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c3 A[Catch: all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:14:0x003b, B:39:0x00e4, B:41:0x00e8, B:42:0x00f4, B:19:0x0050, B:32:0x00bb, B:34:0x00c3, B:35:0x00cf), top: B:51:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf A[Catch: all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:14:0x003b, B:39:0x00e4, B:41:0x00e8, B:42:0x00f4, B:19:0x0050, B:32:0x00bb, B:34:0x00c3, B:35:0x00cf), top: B:51:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e8 A[Catch: all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:14:0x003b, B:39:0x00e4, B:41:0x00e8, B:42:0x00f4, B:19:0x0050, B:32:0x00bb, B:34:0x00c3, B:35:0x00cf), top: B:51:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00f4 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #1 {all -> 0x0055, blocks: (B:14:0x003b, B:39:0x00e4, B:41:0x00e8, B:42:0x00f4, B:19:0x0050, B:32:0x00bb, B:34:0x00c3, B:35:0x00cf), top: B:51:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r3v4 */
    @Nullable
    public final Object setDialDefaultColor(int i2, @NotNull Continuation<? super DialData<Boolean>> continuation) throws Throwable {
        r rVar;
        int i3;
        Mutex mutex;
        DialModule dialModule;
        DialModule dialModule2;
        Mutex mutex2;
        DialModule dialModule3;
        DialData<Boolean> dialData;
        ChannelResponse channelResponse;
        if (continuation instanceof r) {
            rVar = (r) continuation;
            int i4 = rVar.f;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                rVar.f = i4 - Integer.MIN_VALUE;
            } else {
                rVar = new r(continuation);
            }
        } else {
            rVar = new r(continuation);
        }
        Object objWithTimeoutOrNull = rVar.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        ?? r3 = rVar.f;
        try {
            try {
                if (r3 != 0) {
                    if (r3 == 1) {
                        i3 = rVar.c;
                        Mutex mutex3 = (Mutex) rVar.b;
                        DialModule dialModule4 = (DialModule) rVar.a;
                        ResultKt.throwOnFailure(objWithTimeoutOrNull);
                        mutex = mutex3;
                        dialModule = dialModule4;
                    } else {
                        if (r3 == 2) {
                            mutex2 = (Mutex) rVar.b;
                            dialModule2 = (DialModule) rVar.a;
                            ResultKt.throwOnFailure(objWithTimeoutOrNull);
                            if (((Boolean) objWithTimeoutOrNull).booleanValue()) {
                                s sVar = dialModule2.new s(null);
                                rVar.a = dialModule2;
                                rVar.b = mutex2;
                                rVar.f = 3;
                                objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, sVar, rVar);
                                if (objWithTimeoutOrNull == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                dialModule3 = dialModule2;
                            } else {
                                dialData = new DialData<>(DiaResultCode.FAILED, Boxing.boxBoolean(false));
                            }
                            mutex2.unlock(null);
                            return dialData;
                        }
                        if (r3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex2 = (Mutex) rVar.b;
                        dialModule3 = (DialModule) rVar.a;
                        ResultKt.throwOnFailure(objWithTimeoutOrNull);
                    }
                    channelResponse = (ChannelResponse) objWithTimeoutOrNull;
                    if (channelResponse == null) {
                        dialData = new DialData<>(DiaResultCode.TIME_OUT, Boxing.boxBoolean(false));
                    } else {
                        dialModule3.channels.remove(Boxing.boxInt(16));
                        dialData = dialModule3.h(channelResponse);
                    }
                    mutex2.unlock(null);
                    return dialData;
                }
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
                Mutex mutex4 = this.mutex;
                rVar.a = this;
                rVar.b = mutex4;
                i3 = i2;
                rVar.c = i3;
                rVar.f = 1;
                if (mutex4.lock(null, rVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutex = mutex4;
                dialModule = this;
                dialModule.channels.put(Boxing.boxInt(16), ChannelKt.Channel$default(0, 1, null));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byteArrayOutputStream.write(15);
                byteArrayOutputStream.write(GattUtils.intToBytes(i3));
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                rVar.a = dialModule;
                rVar.b = mutex;
                rVar.f = 2;
                Object objSendDataWithResult$default = BaseModule.sendDataWithResult$default(dialModule, byteArray, 0, false, rVar, 6, null);
                if (objSendDataWithResult$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dialModule2 = dialModule;
                objWithTimeoutOrNull = objSendDataWithResult$default;
                mutex2 = mutex;
                if (((Boolean) objWithTimeoutOrNull).booleanValue()) {
                    dialData = new DialData<>(DiaResultCode.FAILED, Boxing.boxBoolean(false));
                } else {
                    s sVar2 = dialModule2.new s(null);
                    rVar.a = dialModule2;
                    rVar.b = mutex2;
                    rVar.f = 3;
                    objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, sVar2, rVar);
                    if (objWithTimeoutOrNull == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    dialModule3 = dialModule2;
                    channelResponse = (ChannelResponse) objWithTimeoutOrNull;
                    if (channelResponse == null) {
                        dialData = new DialData<>(DiaResultCode.TIME_OUT, Boxing.boxBoolean(false));
                    } else {
                        dialModule3.channels.remove(Boxing.boxInt(16));
                        dialData = dialModule3.h(channelResponse);
                    }
                }
                mutex2.unlock(null);
                return dialData;
            } catch (Throwable th) {
                th = th;
                r3 = mutex;
                r3.unlock(null);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @NotNull
    public final DialData<Boolean> setDialDefaultColorSync(int colorId) {
        return (DialData) kotlinx.coroutines.d.b(null, new t(colorId, null), 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fe A[Catch: all -> 0x005a, TryCatch #3 {all -> 0x005a, blocks: (B:21:0x0055, B:36:0x00d4, B:40:0x00f2, B:42:0x00fe, B:43:0x010a), top: B:66:0x0055 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x010a A[Catch: all -> 0x005a, TRY_LEAVE, TryCatch #3 {all -> 0x005a, blocks: (B:21:0x0055, B:36:0x00d4, B:40:0x00f2, B:42:0x00fe, B:43:0x010a), top: B:66:0x0055 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x011d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x011e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0124 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x003b, B:47:0x0120, B:49:0x0124, B:50:0x0130), top: B:61:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0130 A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x003b, B:47:0x0120, B:49:0x0124, B:50:0x0130), top: B:61:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object setDialId(int i2, @NotNull Continuation<? super DialData<Boolean>> continuation) throws Throwable {
        u uVar;
        Mutex mutex;
        DialModule dialModule;
        int i3;
        Mutex mutex2;
        Mutex mutex3;
        byte[] byteArray;
        DialModule dialModule2;
        Mutex mutex4;
        DialModule dialModule3;
        int i4;
        boolean zBooleanValue;
        DialModule dialModule4;
        DialData<Boolean> dialData;
        ChannelResponse channelResponse;
        if (continuation instanceof u) {
            uVar = (u) continuation;
            int i5 = uVar.f;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                uVar.f = i5 - Integer.MIN_VALUE;
            } else {
                uVar = new u(continuation);
            }
        } else {
            uVar = new u(continuation);
        }
        Object objWithTimeoutOrNull = uVar.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i6 = uVar.f;
        boolean z = true;
        try {
            try {
                if (i6 == 0) {
                    ResultKt.throwOnFailure(objWithTimeoutOrNull);
                    Mutex mutex5 = this.mutex;
                    uVar.a = this;
                    uVar.b = mutex5;
                    uVar.c = i2;
                    uVar.f = 1;
                    if (mutex5.lock(null, uVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutex = mutex5;
                    dialModule = this;
                    i3 = i2;
                } else {
                    if (i6 != 1) {
                        if (i6 == 2) {
                            i4 = uVar.c;
                            mutex4 = (Mutex) uVar.b;
                            dialModule3 = (DialModule) uVar.a;
                            try {
                                ResultKt.throwOnFailure(objWithTimeoutOrNull);
                                zBooleanValue = ((Boolean) objWithTimeoutOrNull).booleanValue();
                                StringBuilder sb = new StringBuilder();
                                sb.append("setDialId:");
                                sb.append(i4);
                                sb.append(":result:");
                                if (zBooleanValue) {
                                    z = false;
                                }
                                sb.append(z);
                                Debug.fi(TAG, sb.toString());
                                if (zBooleanValue) {
                                    v vVar = dialModule3.new v(null);
                                    uVar.a = dialModule3;
                                    uVar.b = mutex4;
                                    uVar.f = 3;
                                    objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, vVar, uVar);
                                    if (objWithTimeoutOrNull == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    mutex3 = mutex4;
                                    dialModule4 = dialModule3;
                                    channelResponse = (ChannelResponse) objWithTimeoutOrNull;
                                    if (channelResponse == null) {
                                        dialData = new DialData<>(DiaResultCode.TIME_OUT, Boxing.boxBoolean(false));
                                    } else {
                                        dialModule4.channels.remove(Boxing.boxInt(8));
                                        dialData = dialModule4.h(channelResponse);
                                    }
                                    mutex4 = mutex3;
                                } else {
                                    dialData = new DialData<>(DiaResultCode.FAILED, Boxing.boxBoolean(false));
                                }
                                mutex4.unlock(null);
                                return dialData;
                            } catch (Throwable th) {
                                th = th;
                                mutex3 = mutex4;
                            }
                        } else {
                            if (i6 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex3 = (Mutex) uVar.b;
                            dialModule4 = (DialModule) uVar.a;
                            try {
                                ResultKt.throwOnFailure(objWithTimeoutOrNull);
                                channelResponse = (ChannelResponse) objWithTimeoutOrNull;
                                if (channelResponse == null) {
                                    dialData = new DialData<>(DiaResultCode.TIME_OUT, Boxing.boxBoolean(false));
                                } else {
                                    dialModule4.channels.remove(Boxing.boxInt(8));
                                    dialData = dialModule4.h(channelResponse);
                                }
                                mutex4 = mutex3;
                                mutex4.unlock(null);
                                return dialData;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        mutex3.unlock(null);
                        throw th;
                    }
                    int i7 = uVar.c;
                    Mutex mutex6 = (Mutex) uVar.b;
                    DialModule dialModule5 = (DialModule) uVar.a;
                    ResultKt.throwOnFailure(objWithTimeoutOrNull);
                    i3 = i7;
                    mutex = mutex6;
                    dialModule = dialModule5;
                }
                Object objSendDataWithResult$default = BaseModule.sendDataWithResult$default(dialModule, byteArray, 0, false, uVar, 6, null);
                if (objSendDataWithResult$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutex4 = mutex2;
                dialModule3 = dialModule2;
                i4 = i3;
                objWithTimeoutOrNull = objSendDataWithResult$default;
                zBooleanValue = ((Boolean) objWithTimeoutOrNull).booleanValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("setDialId:");
                sb2.append(i4);
                sb2.append(":result:");
                if (zBooleanValue) {
                    z = false;
                }
                sb2.append(z);
                Debug.fi(TAG, sb2.toString());
                if (zBooleanValue) {
                    dialData = new DialData<>(DiaResultCode.FAILED, Boxing.boxBoolean(false));
                } else {
                    v vVar2 = dialModule3.new v(null);
                    uVar.a = dialModule3;
                    uVar.b = mutex4;
                    uVar.f = 3;
                    objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, vVar2, uVar);
                    if (objWithTimeoutOrNull == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutex3 = mutex4;
                    dialModule4 = dialModule3;
                    channelResponse = (ChannelResponse) objWithTimeoutOrNull;
                    if (channelResponse == null) {
                        dialData = new DialData<>(DiaResultCode.TIME_OUT, Boxing.boxBoolean(false));
                    } else {
                        dialModule4.channels.remove(Boxing.boxInt(8));
                        dialData = dialModule4.h(channelResponse);
                    }
                    mutex4 = mutex3;
                }
                mutex4.unlock(null);
                return dialData;
            } catch (Throwable th3) {
                th = th3;
                mutex3 = mutex2;
                mutex3.unlock(null);
                throw th;
            }
            dialModule.channels.put(Boxing.boxInt(8), ChannelKt.Channel$default(0, 1, null));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(7);
            byteArrayOutputStream.write(GattUtils.intToBytes(i3));
            byteArray = byteArrayOutputStream.toByteArray();
            uVar.a = dialModule;
            uVar.b = mutex;
            uVar.c = i3;
            uVar.f = 2;
            dialModule2 = dialModule;
            mutex2 = mutex;
        } catch (Throwable th4) {
            th = th4;
            mutex2 = mutex;
        }
    }

    @NotNull
    public final DialData<Boolean> setDialIdSync(int diaId) {
        return (DialData) kotlinx.coroutines.d.b(null, new w(diaId, null), 1, null);
    }
}
