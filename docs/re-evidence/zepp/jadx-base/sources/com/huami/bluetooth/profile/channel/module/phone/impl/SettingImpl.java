package com.huami.bluetooth.profile.channel.module.phone.impl;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.ChannelResponse;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.binary.BinaryEncoder;
import com.huami.bluetooth.profile.channel.module.binary.struct.UInt8;
import com.huami.bluetooth.profile.channel.module.phone.PairStatus;
import com.huami.bluetooth.profile.channel.module.phone.PairStatusKt;
import com.huami.bluetooth.profile.channel.module.phone.SettingApi;
import com.huami.bluetooth.profile.channel.module.phone.UnPair;
import com.huami.bluetooth.profile.channel.module.phone.dto.ItemDto;
import com.huami.bluetooth.profile.channel.module.schedule.action.DataTransferCallback;
import com.huami.bluetooth.utils.BufByteDecoder;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.debug.Debug;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 92\u00020\u0001:\u00019B\u000f\u0012\u0006\u0010&\u001a\u00020$¢\u0006\u0004\b7\u00108J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0013\u0010\u0011\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0019H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0012J!\u0010!\u001a\u00020\u00042\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0096@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u001d\u0010#\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096@ø\u0001\u0000¢\u0006\u0004\b#\u0010\u0017R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u0016\u0010(\u001a\u00020\u00138\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010.\u001a\u00020\u00108\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b,\u0010-R\u001c\u00103\u001a\b\u0012\u0004\u0012\u0002000/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R$\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006:"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/phone/impl/SettingImpl;", "Lcom/huami/bluetooth/profile/channel/module/phone/SettingApi;", "", "byteArray", "", "b", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data", "", "a", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", AbstractJSONTokenResponse.RESPONSE, "onReceive", "Lcom/huami/bluetooth/profile/channel/module/schedule/action/DataTransferCallback;", "callback", "setTransferCallback", "", "queryVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "phoneBtName", "Lcom/huami/bluetooth/profile/channel/module/phone/PairStatus;", "queryPairStatus", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onlyRegister", "Lkotlin/Function1;", "statusChange", "registerPairStatus", "(ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/huami/bluetooth/profile/channel/module/phone/dto/ItemDto;", "querySettings", "items", "updateSetting", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "preparePair", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "module", "Ljava/lang/String;", "tag", "c", "Lcom/huami/bluetooth/profile/channel/module/schedule/action/DataTransferCallback;", "dataTransferCallback", GoogleApiAvailabilityLight.a, LogUtil.I, "modelId", "", "Lcom/huami/bluetooth/profile/channel/module/phone/impl/FilterAction;", "e", "Ljava/util/List;", "callbackSet", "f", "Lkotlin/jvm/functions/Function1;", "statusChangeCallback", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/BaseModule;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class SettingImpl implements SettingApi {
    private static final long g = 10000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final BaseModule module;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private DataTransferCallback dataTransferCallback;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private Function1<? super PairStatus, Unit> statusChangeCallback;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String tag = "SettingApi";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int modelId = 11;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final List<FilterAction> callbackSet = new ArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ PairStatus a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PairStatus pairStatus) {
            super(0);
            this.a = pairStatus;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("notifyPairedStatusChanged changed: ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.phone.impl.SettingImpl", f = "SettingImpl.kt", i = {0, 1}, l = {130, 132}, m = "queryPairStatus", n = {"filterAction", "filterAction"}, s = {"L$2", "L$1"})
    public static final class b extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
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
            return SettingImpl.this.queryPairStatus(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("queryPairStatus phone name: ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/phone/PairStatus;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.phone.impl.SettingImpl$queryPairStatus$3", f = "SettingImpl.kt", i = {}, l = {133}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PairStatus>, Object> {
        public int a;
        public final /* synthetic */ CompletableDeferred<PairStatus> b;
        public final /* synthetic */ SettingImpl c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ PairStatus a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PairStatus pairStatus) {
                super(0);
                this.a = pairStatus;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return Intrinsics.stringPlus("queryPairStatus result: ", this.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(CompletableDeferred<PairStatus> completableDeferred, SettingImpl settingImpl, Continuation<? super d> continuation) {
            super(2, continuation);
            this.b = completableDeferred;
            this.c = settingImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super PairStatus> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CompletableDeferred<PairStatus> completableDeferred = this.b;
                this.a = 1;
                obj = completableDeferred.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            PairStatus pairStatus = (PairStatus) obj;
            HMLog.info(this.c.tag, new a(pairStatus));
            return pairStatus;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<byte[], Boolean> {
        public static final e a = new e();

        public e() {
            super(1);
        }

        public final boolean a(@NotNull byte[] bArr) {
            return ArraysKt___ArraysKt.first(bArr) == 4;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(byte[] bArr) {
            return Boolean.valueOf(a(bArr));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<byte[], Unit> {
        public final /* synthetic */ CompletableDeferred<PairStatus> b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ PairStatus a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PairStatus pairStatus) {
                super(0);
                this.a = pairStatus;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return Intrinsics.stringPlus("receive pair status: ", this.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(CompletableDeferred<PairStatus> completableDeferred) {
            super(1);
            this.b = completableDeferred;
        }

        public final void a(@NotNull byte[] bArr) {
            BufByteDecoder bufByteDecoder = new BufByteDecoder(bArr, 0, 2, null);
            bufByteDecoder.readByte();
            PairStatus pairStatus = PairStatusKt.parsePairStatus(bufByteDecoder.readByte());
            HMLog.info(SettingImpl.this.tag, new a(pairStatus));
            this.b.complete(pairStatus);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.phone.impl.SettingImpl", f = "SettingImpl.kt", i = {0, 0, 1}, l = {DataTypeSource.SPORT_TYPE_DOWNHILL, 183}, m = "querySettings", n = {"completableDeferred", "filterAction", "filterAction"}, s = {"L$1", "L$2", "L$1"})
    public static final class g extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return SettingImpl.this.querySettings(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/huami/bluetooth/profile/channel/module/phone/dto/ItemDto;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.phone.impl.SettingImpl$querySettings$2", f = "SettingImpl.kt", i = {}, l = {DataTypeSource.SPORT_TYPE_BOULDERING}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends ItemDto>>, Object> {
        public int a;
        public final /* synthetic */ CompletableDeferred<List<ItemDto>> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(CompletableDeferred<List<ItemDto>> completableDeferred, Continuation<? super h> continuation) {
            super(2, continuation);
            this.b = completableDeferred;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new h(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<? extends ItemDto>> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CompletableDeferred<List<ItemDto>> completableDeferred = this.b;
                this.a = 1;
                obj = completableDeferred.await(this);
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function1<byte[], Boolean> {
        public static final i a = new i();

        public i() {
            super(1);
        }

        public final boolean a(@NotNull byte[] bArr) {
            return 7 == ArraysKt___ArraysKt.first(bArr);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(byte[] bArr) {
            return Boolean.valueOf(a(bArr));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "byteArray", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function1<byte[], Unit> {
        public final /* synthetic */ CompletableDeferred<List<ItemDto>> a;
        public final /* synthetic */ ArrayList<ItemDto> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(CompletableDeferred<List<ItemDto>> completableDeferred, ArrayList<ItemDto> arrayList) {
            super(1);
            this.a = completableDeferred;
            this.b = arrayList;
        }

        public final void a(@NotNull byte[] bArr) {
            BufByteDecoder bufByteDecoder = new BufByteDecoder(bArr, 0, 2, null);
            bufByteDecoder.readByte();
            int i = bufByteDecoder.readByte();
            ArrayList<ItemDto> arrayList = this.b;
            for (int i2 = 0; i2 < i; i2++) {
                ItemDto itemDto = new ItemDto();
                itemDto.key = (byte) bufByteDecoder.readByte();
                itemDto.value = bufByteDecoder.readBoolean();
                arrayList.add(itemDto);
            }
            bufByteDecoder.clear();
            this.a.complete(this.b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.phone.impl.SettingImpl", f = "SettingImpl.kt", i = {0, 0, 0, 1, 1}, l = {100, 102}, m = "queryVersion", n = {"this", "completableDeferred", "filterAction", "this", "filterAction"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    public static final class k extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return SettingImpl.this.queryVersion(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.phone.impl.SettingImpl$queryVersion$2", f = "SettingImpl.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
        public int a;
        public final /* synthetic */ CompletableDeferred<Integer> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(CompletableDeferred<Integer> completableDeferred, Continuation<? super l> continuation) {
            super(2, continuation);
            this.b = completableDeferred;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new l(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Integer> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CompletableDeferred<Integer> completableDeferred = this.b;
                this.a = 1;
                obj = completableDeferred.await(this);
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function1<byte[], Boolean> {
        public static final m a = new m();

        public m() {
            super(1);
        }

        public final boolean a(@NotNull byte[] bArr) {
            return ArraysKt___ArraysKt.first(bArr) == 2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(byte[] bArr) {
            return Boolean.valueOf(a(bArr));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function1<byte[], Unit> {
        public final /* synthetic */ CompletableDeferred<Integer> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(CompletableDeferred<Integer> completableDeferred) {
            super(1);
            this.b = completableDeferred;
        }

        public final void a(@NotNull byte[] bArr) {
            DataTransferCallback dataTransferCallback = SettingImpl.this.dataTransferCallback;
            if (dataTransferCallback != null) {
                dataTransferCallback.onReceive(bArr);
            }
            BufByteDecoder bufByteDecoder = new BufByteDecoder(bArr, 0, 2, null);
            bufByteDecoder.readByte();
            this.b.complete(Integer.valueOf(bufByteDecoder.readByte()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.phone.impl.SettingImpl", f = "SettingImpl.kt", i = {0, 0}, l = {147}, m = "registerPairStatus", n = {"this", "statusChange"}, s = {"L$0", "L$1"})
    public static final class o extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public o(Continuation<? super o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return SettingImpl.this.registerPairStatus(false, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.phone.impl.SettingImpl", f = "SettingImpl.kt", i = {0, 0, 1, 1}, l = {com.baseflow.permissionhandler.m.d, 212}, m = "updateSetting", n = {"completableDeferred", "filterAction", "completableDeferred", "filterAction"}, s = {"L$1", "L$2", "L$1", "L$2"})
    public static final class p extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public p(Continuation<? super p> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return SettingImpl.this.updateSetting(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.phone.impl.SettingImpl$updateSetting$3", f = "SettingImpl.kt", i = {}, l = {213}, m = "invokeSuspend", n = {}, s = {})
    public static final class q extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ CompletableDeferred<Boolean> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(CompletableDeferred<Boolean> completableDeferred, Continuation<? super q> continuation) {
            super(2, continuation);
            this.b = completableDeferred;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new q(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CompletableDeferred<Boolean> completableDeferred = this.b;
                this.a = 1;
                obj = completableDeferred.await(this);
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function1<byte[], Boolean> {
        public static final r a = new r();

        public r() {
            super(1);
        }

        public final boolean a(@NotNull byte[] bArr) {
            return 9 == ArraysKt___ArraysKt.first(bArr);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(byte[] bArr) {
            return Boolean.valueOf(a(bArr));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function1<byte[], Unit> {
        public final /* synthetic */ CompletableDeferred<Boolean> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(CompletableDeferred<Boolean> completableDeferred) {
            super(1);
            this.a = completableDeferred;
        }

        public final void a(@NotNull byte[] bArr) {
            BufByteDecoder bufByteDecoder = new BufByteDecoder(bArr, 0, 2, null);
            bufByteDecoder.readByte();
            this.a.complete(Boolean.valueOf(bufByteDecoder.readBoolean()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    public SettingImpl(@NotNull BaseModule baseModule) {
        this.module = baseModule;
    }

    private final void a(byte[] data) {
        if (this.statusChangeCallback == null) {
            return;
        }
        BufByteDecoder bufByteDecoder = new BufByteDecoder(data, 0, 2, null);
        bufByteDecoder.readByte();
        PairStatus pairStatus = PairStatusKt.parsePairStatus(bufByteDecoder.readByte());
        HMLog.info(this.tag, new a(pairStatus));
        Function1<? super PairStatus, Unit> function1 = this.statusChangeCallback;
        if (function1 == null) {
            return;
        }
        function1.invoke(pairStatus);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object b(byte[] bArr, Continuation<? super Boolean> continuation) {
        DataTransferCallback dataTransferCallback = this.dataTransferCallback;
        if (dataTransferCallback != null) {
            dataTransferCallback.onSend(bArr);
        }
        return BaseModule.sendDataWithResult$default(this.module, bArr, 0, false, continuation, 6, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.phone.SettingApi
    public void onReceive(@NotNull ChannelResponse response) {
        byte[] data = response.getData();
        DataTransferCallback dataTransferCallback = this.dataTransferCallback;
        if (dataTransferCallback != null) {
            dataTransferCallback.onReceive(data);
        }
        Iterator<FilterAction> it2 = this.callbackSet.iterator();
        while (it2.hasNext()) {
            FilterAction next = it2.next();
            if (next.getTimeOut()) {
                it2.remove();
            } else if (next.getFilter().invoke(data).booleanValue()) {
                next.getAction().invoke(data);
                it2.remove();
            }
        }
        if (ArraysKt___ArraysKt.first(data) == 4) {
            a(data);
        }
    }

    @Override // com.huami.bluetooth.profile.channel.module.phone.SettingApi
    @Nullable
    public Object preparePair(@Nullable String str, @NotNull Continuation<? super Boolean> continuation) {
        if (str == null) {
            str = "";
        }
        return b(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(new byte[]{5}, str.getBytes(Charsets.UTF_8)), (byte) 0), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.module.phone.SettingApi
    @Nullable
    public Object queryPairStatus(@Nullable String str, @NotNull Continuation<? super PairStatus> continuation) {
        b bVar;
        CompletableDeferred completableDeferredCompletableDeferred$default;
        SettingImpl settingImpl;
        FilterAction filterAction;
        SettingImpl settingImpl2;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.f = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objWithTimeout = bVar.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = bVar.f;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objWithTimeout);
                HMLog.info(this.tag, new c(str));
                if (str == null) {
                    return new UnPair();
                }
                completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(new byte[]{3}, str.getBytes(Charsets.UTF_8)), (byte) 0);
                FilterAction filterAction2 = new FilterAction(e.a, new f(completableDeferredCompletableDeferred$default), false, 4, null);
                this.callbackSet.add(filterAction2);
                bVar.a = this;
                bVar.b = completableDeferredCompletableDeferred$default;
                bVar.c = filterAction2;
                bVar.f = 1;
                if (b(bArrPlus, bVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                settingImpl = this;
                filterAction = filterAction2;
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    filterAction = (FilterAction) bVar.b;
                    settingImpl2 = (SettingImpl) bVar.a;
                    try {
                        ResultKt.throwOnFailure(objWithTimeout);
                        return (PairStatus) objWithTimeout;
                    } catch (Exception unused) {
                        Debug.fi(settingImpl2.tag, "queryPairStatus time out");
                        filterAction.setTimeOut(true);
                        return new UnPair();
                    }
                }
                filterAction = (FilterAction) bVar.c;
                completableDeferredCompletableDeferred$default = (CompletableDeferred) bVar.b;
                settingImpl = (SettingImpl) bVar.a;
                ResultKt.throwOnFailure(objWithTimeout);
            }
            d dVar = new d(completableDeferredCompletableDeferred$default, settingImpl, null);
            bVar.a = settingImpl;
            bVar.b = filterAction;
            bVar.c = null;
            bVar.f = 2;
            objWithTimeout = TimeoutKt.withTimeout(10000L, dVar, bVar);
            if (objWithTimeout == coroutine_suspended) {
                return coroutine_suspended;
            }
            settingImpl2 = settingImpl;
            return (PairStatus) objWithTimeout;
        } catch (Exception unused2) {
            settingImpl2 = settingImpl;
            Debug.fi(settingImpl2.tag, "queryPairStatus time out");
            filterAction.setTimeOut(true);
            return new UnPair();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.module.phone.SettingApi
    @Nullable
    public Object querySettings(@NotNull Continuation<? super List<? extends ItemDto>> continuation) {
        g gVar;
        CompletableDeferred completableDeferredCompletableDeferred$default;
        SettingImpl settingImpl;
        FilterAction filterAction;
        FilterAction filterAction2;
        SettingImpl settingImpl2;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i2 = gVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.f = i2 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object objWithTimeout = gVar.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = gVar.f;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objWithTimeout);
                ArrayList arrayList = new ArrayList();
                completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                byte[] bytes = new UInt8(6).toBytes();
                FilterAction filterAction3 = new FilterAction(i.a, new j(completableDeferredCompletableDeferred$default, arrayList), false, 4, null);
                this.callbackSet.add(filterAction3);
                gVar.a = this;
                gVar.b = completableDeferredCompletableDeferred$default;
                gVar.c = filterAction3;
                gVar.f = 1;
                if (b(bytes, gVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                settingImpl = this;
                filterAction = filterAction3;
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    filterAction2 = (FilterAction) gVar.b;
                    settingImpl2 = (SettingImpl) gVar.a;
                    try {
                        ResultKt.throwOnFailure(objWithTimeout);
                        return (List) objWithTimeout;
                    } catch (Exception unused) {
                        Debug.fi(settingImpl2.tag, "querySettings time out");
                        filterAction2.setTimeOut(true);
                        return CollectionsKt__CollectionsKt.emptyList();
                    }
                }
                filterAction = (FilterAction) gVar.c;
                completableDeferredCompletableDeferred$default = (CompletableDeferred) gVar.b;
                settingImpl = (SettingImpl) gVar.a;
                ResultKt.throwOnFailure(objWithTimeout);
            }
            h hVar = new h(completableDeferredCompletableDeferred$default, null);
            gVar.a = settingImpl;
            gVar.b = filterAction;
            gVar.c = null;
            gVar.f = 2;
            objWithTimeout = TimeoutKt.withTimeout(10000L, hVar, gVar);
            if (objWithTimeout == coroutine_suspended) {
                return coroutine_suspended;
            }
            filterAction2 = filterAction;
            settingImpl2 = settingImpl;
            return (List) objWithTimeout;
        } catch (Exception unused2) {
            filterAction2 = filterAction;
            settingImpl2 = settingImpl;
            Debug.fi(settingImpl2.tag, "querySettings time out");
            filterAction2.setTimeOut(true);
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.module.phone.SettingApi
    @Nullable
    public Object queryVersion(@NotNull Continuation<? super Integer> continuation) {
        k kVar;
        CompletableDeferred completableDeferredCompletableDeferred$default;
        FilterAction filterAction;
        SettingImpl settingImpl;
        FilterAction filterAction2;
        SettingImpl settingImpl2;
        int iIntValue;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i2 = kVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.f = i2 - Integer.MIN_VALUE;
            } else {
                kVar = new k(continuation);
            }
        } else {
            kVar = new k(continuation);
        }
        Object obj = kVar.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = kVar.f;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                filterAction = new FilterAction(m.a, new n(completableDeferredCompletableDeferred$default), false, 4, null);
                this.callbackSet.add(filterAction);
                byte[] bytes = new UInt8(1).toBytes();
                kVar.a = this;
                kVar.b = completableDeferredCompletableDeferred$default;
                kVar.c = filterAction;
                kVar.f = 1;
                if (b(bytes, kVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                settingImpl = this;
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    filterAction2 = (FilterAction) kVar.b;
                    settingImpl2 = (SettingImpl) kVar.a;
                    try {
                        ResultKt.throwOnFailure(obj);
                        iIntValue = ((Number) obj).intValue();
                    } catch (Exception unused) {
                        Debug.fi(settingImpl2.tag, "queryVersion time out");
                        filterAction2.setTimeOut(true);
                        iIntValue = -1;
                    }
                    return Boxing.boxInt(iIntValue);
                }
                FilterAction filterAction3 = (FilterAction) kVar.c;
                completableDeferredCompletableDeferred$default = (CompletableDeferred) kVar.b;
                settingImpl = (SettingImpl) kVar.a;
                ResultKt.throwOnFailure(obj);
                filterAction = filterAction3;
            }
            l lVar = new l(completableDeferredCompletableDeferred$default, null);
            kVar.a = settingImpl;
            kVar.b = filterAction;
            kVar.c = null;
            kVar.f = 2;
            Object objWithTimeout = TimeoutKt.withTimeout(10000L, lVar, kVar);
            if (objWithTimeout == coroutine_suspended) {
                return coroutine_suspended;
            }
            filterAction2 = filterAction;
            obj = objWithTimeout;
            settingImpl2 = settingImpl;
            iIntValue = ((Number) obj).intValue();
            return Boxing.boxInt(iIntValue);
        } catch (Exception unused2) {
            filterAction2 = filterAction;
            settingImpl2 = settingImpl;
            Debug.fi(settingImpl2.tag, "queryVersion time out");
            filterAction2.setTimeOut(true);
            iIntValue = -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.module.phone.SettingApi
    @Nullable
    public Object registerPairStatus(boolean z, @NotNull Function1<? super PairStatus, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        o oVar;
        Function1<? super PairStatus, Unit> function2;
        SettingImpl settingImpl;
        if (continuation instanceof o) {
            oVar = (o) continuation;
            int i2 = oVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oVar.e = i2 - Integer.MIN_VALUE;
            } else {
                oVar = new o(continuation);
            }
        } else {
            oVar = new o(continuation);
        }
        Object obj = oVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = oVar.e;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!z) {
                byte[] bytes = new UInt8(3).toBytes();
                oVar.a = this;
                oVar.b = function1;
                oVar.e = 1;
                if (b(bytes, oVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            function2 = function1;
            settingImpl = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function2 = (Function1) oVar.b;
            settingImpl = (SettingImpl) oVar.a;
            ResultKt.throwOnFailure(obj);
        }
        settingImpl.statusChangeCallback = function2;
        return Unit.INSTANCE;
    }

    @Override // com.huami.bluetooth.profile.channel.module.phone.SettingApi
    public void setTransferCallback(@NotNull DataTransferCallback callback) {
        this.dataTransferCallback = callback;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.huami.bluetooth.profile.channel.module.phone.SettingApi
    @Nullable
    public Object updateSetting(@NotNull List<? extends ItemDto> list, @NotNull Continuation<? super Boolean> continuation) {
        p pVar;
        CompletableDeferred completableDeferredCompletableDeferred$default;
        FilterAction filterAction;
        SettingImpl settingImpl;
        SettingImpl settingImpl2;
        FilterAction filterAction2;
        if (continuation instanceof p) {
            pVar = (p) continuation;
            int i2 = pVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pVar.f = i2 - Integer.MIN_VALUE;
            } else {
                pVar = new p(continuation);
            }
        } else {
            pVar = new p(continuation);
        }
        Object objWithTimeout = pVar.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = pVar.f;
        boolean zBooleanValue = false;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objWithTimeout);
                byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(new byte[]{8}, new UInt8(list.size()).toBytes());
                BinaryEncoder binaryEncoder = new BinaryEncoder();
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    bArrPlus = ArraysKt___ArraysJvmKt.plus(bArrPlus, binaryEncoder.encode(list.get(Boxing.boxInt(i4).intValue())));
                }
                completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                filterAction = new FilterAction(r.a, new s(completableDeferredCompletableDeferred$default), false, 4, null);
                this.callbackSet.add(filterAction);
                pVar.a = this;
                pVar.b = completableDeferredCompletableDeferred$default;
                pVar.c = filterAction;
                pVar.f = 1;
                if (b(bArrPlus, pVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                settingImpl = this;
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    filterAction2 = (FilterAction) pVar.c;
                    completableDeferredCompletableDeferred$default = (CompletableDeferred) pVar.b;
                    settingImpl2 = (SettingImpl) pVar.a;
                    try {
                        ResultKt.throwOnFailure(objWithTimeout);
                        zBooleanValue = ((Boolean) objWithTimeout).booleanValue();
                    } catch (Exception e2) {
                        e = e2;
                        completableDeferredCompletableDeferred$default.completeExceptionally(e);
                        Debug.fi(settingImpl2.tag, "querySettings time out");
                        filterAction2.setTimeOut(true);
                    }
                    return Boxing.boxBoolean(zBooleanValue);
                }
                FilterAction filterAction3 = (FilterAction) pVar.c;
                CompletableDeferred completableDeferred = (CompletableDeferred) pVar.b;
                settingImpl = (SettingImpl) pVar.a;
                ResultKt.throwOnFailure(objWithTimeout);
                filterAction = filterAction3;
                completableDeferredCompletableDeferred$default = completableDeferred;
            }
            q qVar = new q(completableDeferredCompletableDeferred$default, null);
            pVar.a = settingImpl;
            pVar.b = completableDeferredCompletableDeferred$default;
            pVar.c = filterAction;
            pVar.f = 2;
            objWithTimeout = TimeoutKt.withTimeout(10000L, qVar, pVar);
            if (objWithTimeout == coroutine_suspended) {
                return coroutine_suspended;
            }
            settingImpl2 = settingImpl;
            filterAction2 = filterAction;
            zBooleanValue = ((Boolean) objWithTimeout).booleanValue();
            return Boxing.boxBoolean(zBooleanValue);
        } catch (Exception e3) {
            e = e3;
            settingImpl2 = settingImpl;
            filterAction2 = filterAction;
            completableDeferredCompletableDeferred$default.completeExceptionally(e);
            Debug.fi(settingImpl2.tag, "querySettings time out");
            filterAction2.setTimeOut(true);
        }
    }
}
