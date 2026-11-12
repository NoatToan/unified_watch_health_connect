package com.huami.bluetooth.profile.channel.module.obsolete.impl;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.baseflow.permissionhandler.m;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.ChannelResponse;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.obsolete.ObsoleteApi;
import com.huami.bluetooth.profile.channel.module.obsolete.ObsoleteModule;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.bt.HMBleConfig;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.generic.HMGenericCommand;
import com.xiaomi.hm.health.bt.profile.generic.HMGenericResponse;
import com.xiaomi.hm.health.bt.profile.piece.PieceResult;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 +2\u00020\u0001:\u0001+B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b)\u0010*J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\bH\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\"\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0016\u0010#\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u0016\u0010%\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001eR\u0016\u0010(\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/obsolete/impl/ObsoleteApiImpl;", "Lcom/huami/bluetooth/profile/channel/module/obsolete/ObsoleteApi;", "", "byteArray", "", "a", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", Constant.h, "", "cmdLen", "Lcom/xiaomi/hm/health/bt/profile/base/HMNotifyResponse;", "sendECFCommand", "data", "type", "sendPieceData", "Lcom/xiaomi/hm/health/bt/profile/generic/HMGenericCommand;", "command", "Lcom/xiaomi/hm/health/bt/profile/generic/HMGenericResponse;", "sendGenericCommand", "sendIASCommand", "Lcom/huami/bluetooth/profile/channel/module/obsolete/ObsoleteModule;", "Lcom/huami/bluetooth/profile/channel/module/obsolete/ObsoleteModule;", "module", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/huami/bluetooth/profile/channel/module/obsolete/impl/FilterAction;", "b", "Ljava/util/concurrent/ConcurrentHashMap;", "callbackSet", "Lkotlinx/coroutines/sync/Mutex;", "c", "Lkotlinx/coroutines/sync/Mutex;", "ecfMutex", GoogleApiAvailabilityLight.a, "pieceDataMutex", "e", "genericMutex", "f", "iasMutex", "g", "Lcom/huami/bluetooth/profile/channel/module/obsolete/impl/FilterAction;", "generalNotifyAction", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/obsolete/ObsoleteModule;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ObsoleteApiImpl implements ObsoleteApi {

    @NotNull
    private static final String h = "ObsoleteApiImpl";
    private static final int i = 1;
    private static final int j = 0;
    private static final int k = 2;
    private static final int l = 3;
    private static final int m = 0;
    private static final long n = 5000;
    private static final long o = 6000;
    private static final long p = 10000;
    private static final long q = 10000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ObsoleteModule module;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ConcurrentHashMap<Integer, FilterAction> callbackSet;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Mutex ecfMutex;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Mutex pieceDataMutex;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Mutex genericMutex;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Mutex iasMutex;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final FilterAction generalNotifyAction;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/ChannelResponse;", AbstractJSONTokenResponse.RESPONSE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<ChannelResponse, Unit> {
        public a() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse channelResponse) {
            for (FilterAction filterAction : ObsoleteApiImpl.this.callbackSet.values()) {
                if (filterAction.getFilter().invoke(channelResponse.getData()).booleanValue()) {
                    filterAction.getAction().invoke(ArraysKt___ArraysKt.sliceArray(channelResponse.getData(), new IntRange(1, channelResponse.getData().length - 1)));
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ChannelResponse channelResponse) {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<byte[], Boolean> {
        public static final b a = new b();

        public b() {
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
    public static final class c extends Lambda implements Function1<byte[], Unit> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        public final void a(@NotNull byte[] bArr) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/xiaomi/hm/health/bt/profile/base/HMNotifyResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.obsolete.impl.ObsoleteApiImpl$sendECFCommand$1", f = "ObsoleteApiImpl.kt", i = {1, 2}, l = {m.d, 66, 71}, m = "invokeSuspend", n = {"completableDeferred", "$receiver$iv"}, s = {"L$2", "L$0"})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super HMNotifyResponse>, Object> {
        public Object a;
        public Object b;
        public Object c;
        public int d;
        public int e;
        public final /* synthetic */ byte[] g;
        public final /* synthetic */ int h;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<byte[], Boolean> {
            public static final a a = new a();

            public a() {
                super(1);
            }

            public final boolean a(@NotNull byte[] bArr) {
                return ArraysKt___ArraysKt.first(bArr) == 1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(byte[] bArr) {
                return Boolean.valueOf(a(bArr));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<byte[], Unit> {
            public final /* synthetic */ CompletableDeferred<byte[]> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(CompletableDeferred<byte[]> completableDeferred) {
                super(1);
                this.a = completableDeferred;
            }

            public final void a(@NotNull byte[] bArr) {
                this.a.complete(bArr);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
                a(bArr);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.obsolete.impl.ObsoleteApiImpl$sendECFCommand$1$1$data$1", f = "ObsoleteApiImpl.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
            public int a;
            public final /* synthetic */ CompletableDeferred<byte[]> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(CompletableDeferred<byte[]> completableDeferred, Continuation<? super c> continuation) {
                super(2, continuation);
                this.b = completableDeferred;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new c(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super byte[]> continuation) {
                return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CompletableDeferred<byte[]> completableDeferred = this.b;
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(byte[] bArr, int i, Continuation<? super d> continuation) {
            super(2, continuation);
            this.g = bArr;
            this.h = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ObsoleteApiImpl.this.new d(this.g, this.h, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super HMNotifyResponse> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:31:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:34:0x00d1 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:35:0x00d2  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v6, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference failed for: r2v9, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r7v0 */
        /* JADX WARN: Type inference failed for: r7v1, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r7v11, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r7v12 */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v5 */
        /* JADX WARN: Type inference failed for: r7v6 */
        /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, kotlinx.coroutines.sync.Mutex] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ?? r7;
            Mutex mutex;
            ObsoleteApiImpl obsoleteApiImpl;
            byte[] bArr;
            int i;
            ObsoleteApiImpl obsoleteApiImpl2;
            CompletableDeferred completableDeferred;
            ObsoleteApiImpl obsoleteApiImpl3;
            ?? r2;
            int i2;
            HMNotifyResponse hMNotifyResponse;
            ?? r3;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i3 = this.e;
            try {
                try {
                    if (i3 == 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = ObsoleteApiImpl.this.ecfMutex;
                        obsoleteApiImpl = ObsoleteApiImpl.this;
                        bArr = this.g;
                        i = this.h;
                        this.a = mutex;
                        this.b = obsoleteApiImpl;
                        this.c = bArr;
                        this.d = i;
                        this.e = 1;
                        if (mutex.lock(null, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i3 == 1) {
                        i = this.d;
                        bArr = (byte[]) this.c;
                        obsoleteApiImpl = (ObsoleteApiImpl) this.b;
                        Mutex mutex2 = (Mutex) this.a;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex2;
                    } else {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i2 = this.d;
                            obsoleteApiImpl3 = (ObsoleteApiImpl) this.b;
                            r2 = (Mutex) this.a;
                            try {
                                ResultKt.throwOnFailure(obj);
                                r2 = r2;
                                hMNotifyResponse = HMNotifyResponse.parse((byte[]) obj, i2);
                                obsoleteApiImpl3.callbackSet.remove(Boxing.boxInt(1));
                                r3 = r2;
                            } catch (Exception unused) {
                                obsoleteApiImpl3.callbackSet.remove(Boxing.boxInt(1));
                                hMNotifyResponse = null;
                                r3 = r2;
                            } catch (Throwable th) {
                                th = th;
                                obsoleteApiImpl3.callbackSet.remove(Boxing.boxInt(1));
                                throw th;
                            }
                            r3.unlock(null);
                            return hMNotifyResponse;
                        }
                        i = this.d;
                        completableDeferred = (CompletableDeferred) this.c;
                        obsoleteApiImpl2 = (ObsoleteApiImpl) this.b;
                        r7 = (Mutex) this.a;
                        try {
                            ResultKt.throwOnFailure(obj);
                            r7 = r7;
                            if (!((Boolean) obj).booleanValue()) {
                                r7.unlock(null);
                                return null;
                            }
                            try {
                                c cVar = new c(completableDeferred, null);
                                this.a = r7;
                                this.b = obsoleteApiImpl2;
                                this.c = null;
                                this.d = i;
                                this.e = 3;
                                obj = TimeoutKt.withTimeout(5000L, cVar, this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                i2 = i;
                                obsoleteApiImpl3 = obsoleteApiImpl2;
                                r2 = r7;
                                hMNotifyResponse = HMNotifyResponse.parse((byte[]) obj, i2);
                                obsoleteApiImpl3.callbackSet.remove(Boxing.boxInt(1));
                                r3 = r2;
                                r3.unlock(null);
                                return hMNotifyResponse;
                            } catch (Exception unused2) {
                                obsoleteApiImpl3 = obsoleteApiImpl2;
                                r2 = r7;
                                obsoleteApiImpl3.callbackSet.remove(Boxing.boxInt(1));
                                hMNotifyResponse = null;
                                r3 = r2;
                            } catch (Throwable th2) {
                                th = th2;
                                obsoleteApiImpl3 = obsoleteApiImpl2;
                                obsoleteApiImpl3.callbackSet.remove(Boxing.boxInt(1));
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            r7.unlock(null);
                            throw th;
                        }
                    }
                    CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                    obsoleteApiImpl.callbackSet.put(Boxing.boxInt(1), new FilterAction(a.a, new b(completableDeferredCompletableDeferred$default)));
                    byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(new byte[]{1}, bArr);
                    this.a = mutex;
                    this.b = obsoleteApiImpl;
                    this.c = completableDeferredCompletableDeferred$default;
                    this.d = i;
                    this.e = 2;
                    Object objA = obsoleteApiImpl.a(bArrPlus, this);
                    if (objA == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obsoleteApiImpl2 = obsoleteApiImpl;
                    r7 = mutex;
                    obj = objA;
                    completableDeferred = completableDeferredCompletableDeferred$default;
                    if (!((Boolean) obj).booleanValue()) {
                        r7.unlock(null);
                        return null;
                    }
                    c cVar2 = new c(completableDeferred, null);
                    this.a = r7;
                    this.b = obsoleteApiImpl2;
                    this.c = null;
                    this.d = i;
                    this.e = 3;
                    obj = TimeoutKt.withTimeout(5000L, cVar2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i2 = i;
                    obsoleteApiImpl3 = obsoleteApiImpl2;
                    r2 = r7;
                    hMNotifyResponse = HMNotifyResponse.parse((byte[]) obj, i2);
                    obsoleteApiImpl3.callbackSet.remove(Boxing.boxInt(1));
                    r3 = r2;
                    r3.unlock(null);
                    return hMNotifyResponse;
                } catch (Throwable th4) {
                    r7 = mutex;
                    th = th4;
                    r7.unlock(null);
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                r7 = 3;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/xiaomi/hm/health/bt/profile/generic/HMGenericResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.obsolete.impl.ObsoleteApiImpl$sendGenericCommand$1", f = "ObsoleteApiImpl.kt", i = {1, 1, 2}, l = {m.d, 139, 143}, m = "invokeSuspend", n = {"genericResponse", "completableDeferred", "genericResponse"}, s = {"L$1", "L$2", "L$1"})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super HMGenericResponse>, Object> {
        public Object a;
        public Object b;
        public Object c;
        public int d;
        public final /* synthetic */ HMGenericCommand f;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<byte[], Boolean> {
            public static final a a = new a();

            public a() {
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
        public static final class b extends Lambda implements Function1<byte[], Unit> {
            public final /* synthetic */ CompletableDeferred<byte[]> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(CompletableDeferred<byte[]> completableDeferred) {
                super(1);
                this.a = completableDeferred;
            }

            public final void a(@NotNull byte[] bArr) {
                this.a.complete(bArr);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
                a(bArr);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.obsolete.impl.ObsoleteApiImpl$sendGenericCommand$1$1$data$1", f = "ObsoleteApiImpl.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
            public int a;
            public final /* synthetic */ CompletableDeferred<byte[]> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(CompletableDeferred<byte[]> completableDeferred, Continuation<? super c> continuation) {
                super(2, continuation);
                this.b = completableDeferred;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new c(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super byte[]> continuation) {
                return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CompletableDeferred<byte[]> completableDeferred = this.b;
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(HMGenericCommand hMGenericCommand, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f = hMGenericCommand;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ObsoleteApiImpl.this.new e(this.f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super HMGenericResponse> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x00be  */
        /* JADX WARN: Code duplicated, block: B:32:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:35:0x00d7 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:36:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:39:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:41:0x00e1 A[Catch: all -> 0x0043, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:37:0x00d9, B:41:0x00e1, B:15:0x003b, B:28:0x00b6, B:33:0x00c4), top: B:48:0x003b }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            HMGenericCommand hMGenericCommand;
            Mutex mutex;
            ObsoleteApiImpl obsoleteApiImpl;
            Mutex mutex2;
            CompletableDeferred completableDeferredCompletableDeferred$default;
            Object objA;
            Mutex mutex3;
            HMGenericResponse hMGenericResponse;
            Object objWithTimeoutOrNull;
            HMGenericResponse hMGenericResponse2;
            byte[] bArr;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.d;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Mutex mutex4 = ObsoleteApiImpl.this.genericMutex;
                    hMGenericCommand = this.f;
                    ObsoleteApiImpl obsoleteApiImpl2 = ObsoleteApiImpl.this;
                    this.a = mutex4;
                    this.b = hMGenericCommand;
                    this.c = obsoleteApiImpl2;
                    this.d = 1;
                    if (mutex4.lock(null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutex = mutex4;
                    obsoleteApiImpl = obsoleteApiImpl2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            hMGenericResponse2 = (HMGenericResponse) this.b;
                            mutex2 = (Mutex) this.a;
                            try {
                                ResultKt.throwOnFailure(obj);
                                mutex3 = mutex2;
                                objWithTimeoutOrNull = obj;
                                bArr = (byte[]) objWithTimeoutOrNull;
                                if (bArr == null) {
                                    mutex3.unlock(null);
                                    return null;
                                }
                                hMGenericResponse2.add(bArr);
                                mutex3.unlock(null);
                                return hMGenericResponse2;
                            } catch (Throwable th) {
                                th = th;
                                mutex2.unlock(null);
                                throw th;
                            }
                        }
                        CompletableDeferred completableDeferred = (CompletableDeferred) this.c;
                        hMGenericResponse = (HMGenericResponse) this.b;
                        mutex3 = (Mutex) this.a;
                        try {
                            ResultKt.throwOnFailure(obj);
                            completableDeferredCompletableDeferred$default = completableDeferred;
                            objA = obj;
                            if (!((Boolean) objA).booleanValue()) {
                                mutex3.unlock(null);
                                return null;
                            }
                            c cVar = new c(completableDeferredCompletableDeferred$default, null);
                            this.a = mutex3;
                            this.b = hMGenericResponse;
                            this.c = null;
                            this.d = 3;
                            objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, cVar, this);
                            if (objWithTimeoutOrNull == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            hMGenericResponse2 = hMGenericResponse;
                            bArr = (byte[]) objWithTimeoutOrNull;
                            if (bArr == null) {
                                mutex3.unlock(null);
                                return null;
                            }
                            hMGenericResponse2.add(bArr);
                            mutex3.unlock(null);
                            return hMGenericResponse2;
                        } catch (Throwable th2) {
                            th = th2;
                            mutex2 = mutex3;
                            mutex2.unlock(null);
                            throw th;
                        }
                    }
                    obsoleteApiImpl = (ObsoleteApiImpl) this.c;
                    hMGenericCommand = (HMGenericCommand) this.b;
                    mutex = (Mutex) this.a;
                    ResultKt.throwOnFailure(obj);
                }
                HMGenericResponse hMGenericResponse3 = new HMGenericResponse(hMGenericCommand);
                completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                obsoleteApiImpl.callbackSet.put(Boxing.boxInt(2), new FilterAction(a.a, new b(completableDeferredCompletableDeferred$default)));
                byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(new byte[]{1}, hMGenericCommand.getBytes());
                this.a = mutex;
                this.b = hMGenericResponse3;
                this.c = completableDeferredCompletableDeferred$default;
                this.d = 2;
                objA = obsoleteApiImpl.a(bArrPlus, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutex3 = mutex;
                hMGenericResponse = hMGenericResponse3;
                if (!((Boolean) objA).booleanValue()) {
                    mutex3.unlock(null);
                    return null;
                }
                c cVar2 = new c(completableDeferredCompletableDeferred$default, null);
                this.a = mutex3;
                this.b = hMGenericResponse;
                this.c = null;
                this.d = 3;
                objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, cVar2, this);
                if (objWithTimeoutOrNull == coroutine_suspended) {
                    return coroutine_suspended;
                }
                hMGenericResponse2 = hMGenericResponse;
                bArr = (byte[]) objWithTimeoutOrNull;
                if (bArr == null) {
                    mutex3.unlock(null);
                    return null;
                }
                hMGenericResponse2.add(bArr);
                mutex3.unlock(null);
                return hMGenericResponse2;
            } catch (Throwable th3) {
                th = th3;
                mutex2 = mutex;
                mutex2.unlock(null);
                throw th;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.obsolete.impl.ObsoleteApiImpl$sendIASCommand$1", f = "ObsoleteApiImpl.kt", i = {1}, l = {m.d, 161, 165}, m = "invokeSuspend", n = {"completableDeferred"}, s = {"L$1"})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public Object a;
        public Object b;
        public Object c;
        public int d;
        public final /* synthetic */ byte[] f;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<byte[], Boolean> {
            public static final a a = new a();

            public a() {
                super(1);
            }

            public final boolean a(@NotNull byte[] bArr) {
                return ArraysKt___ArraysKt.first(bArr) == 3;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(byte[] bArr) {
                return Boolean.valueOf(a(bArr));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<byte[], Unit> {
            public final /* synthetic */ CompletableDeferred<byte[]> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(CompletableDeferred<byte[]> completableDeferred) {
                super(1);
                this.a = completableDeferred;
            }

            public final void a(@NotNull byte[] bArr) {
                this.a.complete(bArr);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
                a(bArr);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.obsolete.impl.ObsoleteApiImpl$sendIASCommand$1$1$data$1", f = "ObsoleteApiImpl.kt", i = {}, l = {166}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
            public int a;
            public final /* synthetic */ CompletableDeferred<byte[]> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(CompletableDeferred<byte[]> completableDeferred, Continuation<? super c> continuation) {
                super(2, continuation);
                this.b = completableDeferred;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new c(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super byte[]> continuation) {
                return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CompletableDeferred<byte[]> completableDeferred = this.b;
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(byte[] bArr, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f = bArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ObsoleteApiImpl.this.new f(this.f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x00ac A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #2 {all -> 0x003c, blocks: (B:37:0x00c8, B:39:0x00cc, B:42:0x00d4, B:47:0x00dc, B:50:0x00e4, B:53:0x00eb, B:15:0x0035, B:28:0x00a4, B:30:0x00ac, B:34:0x00b6), top: B:64:0x0035 }] */
        /* JADX WARN: Code duplicated, block: B:33:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:36:0x00c7 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:39:0x00cc A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #2 {all -> 0x003c, blocks: (B:37:0x00c8, B:39:0x00cc, B:42:0x00d4, B:47:0x00dc, B:50:0x00e4, B:53:0x00eb, B:15:0x0035, B:28:0x00a4, B:30:0x00ac, B:34:0x00b6), top: B:64:0x0035 }] */
        /* JADX WARN: Code duplicated, block: B:42:0x00d4 A[Catch: all -> 0x003c, TRY_ENTER, TryCatch #2 {all -> 0x003c, blocks: (B:37:0x00c8, B:39:0x00cc, B:42:0x00d4, B:47:0x00dc, B:50:0x00e4, B:53:0x00eb, B:15:0x0035, B:28:0x00a4, B:30:0x00ac, B:34:0x00b6), top: B:64:0x0035 }] */
        /* JADX WARN: Code duplicated, block: B:44:0x00d7  */
        /* JADX WARN: Code duplicated, block: B:45:0x00d9  */
        /* JADX WARN: Code duplicated, block: B:47:0x00dc A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #2 {all -> 0x003c, blocks: (B:37:0x00c8, B:39:0x00cc, B:42:0x00d4, B:47:0x00dc, B:50:0x00e4, B:53:0x00eb, B:15:0x0035, B:28:0x00a4, B:30:0x00ac, B:34:0x00b6), top: B:64:0x0035 }] */
        /* JADX WARN: Code duplicated, block: B:50:0x00e4 A[Catch: all -> 0x003c, TRY_ENTER, TryCatch #2 {all -> 0x003c, blocks: (B:37:0x00c8, B:39:0x00cc, B:42:0x00d4, B:47:0x00dc, B:50:0x00e4, B:53:0x00eb, B:15:0x0035, B:28:0x00a4, B:30:0x00ac, B:34:0x00b6), top: B:64:0x0035 }] */
        /* JADX WARN: Code duplicated, block: B:52:0x00ea  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ObsoleteApiImpl obsoleteApiImpl;
            Mutex mutex;
            byte[] bArr;
            Mutex mutex2;
            CompletableDeferred completableDeferredCompletableDeferred$default;
            Object objA;
            Mutex mutex3;
            Object objWithTimeoutOrNull;
            byte[] bArr2;
            boolean z;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.d;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Mutex mutex4 = ObsoleteApiImpl.this.iasMutex;
                    obsoleteApiImpl = ObsoleteApiImpl.this;
                    byte[] bArr3 = this.f;
                    this.a = mutex4;
                    this.b = obsoleteApiImpl;
                    this.c = bArr3;
                    this.d = 1;
                    if (mutex4.lock(null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutex = mutex4;
                    bArr = bArr3;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            CompletableDeferred completableDeferred = (CompletableDeferred) this.b;
                            mutex3 = (Mutex) this.a;
                            try {
                                ResultKt.throwOnFailure(obj);
                                completableDeferredCompletableDeferred$default = completableDeferred;
                                objA = obj;
                                if (!((Boolean) objA).booleanValue()) {
                                    Boolean boolBoxBoolean = Boxing.boxBoolean(false);
                                    mutex3.unlock(null);
                                    return boolBoxBoolean;
                                }
                                c cVar = new c(completableDeferredCompletableDeferred$default, null);
                                this.a = mutex3;
                                this.b = null;
                                this.d = 3;
                                objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, cVar, this);
                                if (objWithTimeoutOrNull == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                bArr2 = (byte[]) objWithTimeoutOrNull;
                                if (bArr2 == null) {
                                    Boolean boolBoxBoolean2 = Boxing.boxBoolean(false);
                                    mutex3.unlock(null);
                                    return boolBoxBoolean2;
                                }
                                if (bArr2.length == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    Boolean boolBoxBoolean3 = Boxing.boxBoolean(false);
                                    mutex3.unlock(null);
                                    return boolBoxBoolean3;
                                }
                                Boolean boolBoxBoolean4 = Boxing.boxBoolean(ArraysKt___ArraysKt.first(bArr2) == 0);
                                mutex3.unlock(null);
                                return boolBoxBoolean4;
                            } catch (Throwable th) {
                                th = th;
                                mutex2 = mutex3;
                            }
                        } else {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex2 = (Mutex) this.a;
                            try {
                                ResultKt.throwOnFailure(obj);
                                mutex3 = mutex2;
                                objWithTimeoutOrNull = obj;
                                bArr2 = (byte[]) objWithTimeoutOrNull;
                                if (bArr2 == null) {
                                    Boolean boolBoxBoolean5 = Boxing.boxBoolean(false);
                                    mutex3.unlock(null);
                                    return boolBoxBoolean5;
                                }
                                if (bArr2.length == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    Boolean boolBoxBoolean6 = Boxing.boxBoolean(false);
                                    mutex3.unlock(null);
                                    return boolBoxBoolean6;
                                }
                                Boolean boolBoxBoolean7 = Boxing.boxBoolean(ArraysKt___ArraysKt.first(bArr2) == 0);
                                mutex3.unlock(null);
                                return boolBoxBoolean7;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        mutex2.unlock(null);
                        throw th;
                    }
                    bArr = (byte[]) this.c;
                    obsoleteApiImpl = (ObsoleteApiImpl) this.b;
                    mutex = (Mutex) this.a;
                    ResultKt.throwOnFailure(obj);
                }
                completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                obsoleteApiImpl.callbackSet.put(Boxing.boxInt(3), new FilterAction(a.a, new b(completableDeferredCompletableDeferred$default)));
                byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(new byte[]{3}, bArr);
                this.a = mutex;
                this.b = completableDeferredCompletableDeferred$default;
                this.c = null;
                this.d = 2;
                objA = obsoleteApiImpl.a(bArrPlus, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutex3 = mutex;
                if (!((Boolean) objA).booleanValue()) {
                    Boolean boolBoxBoolean8 = Boxing.boxBoolean(false);
                    mutex3.unlock(null);
                    return boolBoxBoolean8;
                }
                c cVar2 = new c(completableDeferredCompletableDeferred$default, null);
                this.a = mutex3;
                this.b = null;
                this.d = 3;
                objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, cVar2, this);
                if (objWithTimeoutOrNull == coroutine_suspended) {
                    return coroutine_suspended;
                }
                bArr2 = (byte[]) objWithTimeoutOrNull;
                if (bArr2 == null) {
                    Boolean boolBoxBoolean9 = Boxing.boxBoolean(false);
                    mutex3.unlock(null);
                    return boolBoxBoolean9;
                }
                if (bArr2.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    Boolean boolBoxBoolean10 = Boxing.boxBoolean(false);
                    mutex3.unlock(null);
                    return boolBoxBoolean10;
                }
                Boolean boolBoxBoolean11 = Boxing.boxBoolean(ArraysKt___ArraysKt.first(bArr2) == 0);
                mutex3.unlock(null);
                return boolBoxBoolean11;
            } catch (Throwable th3) {
                th = th3;
                mutex2 = mutex;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.obsolete.impl.ObsoleteApiImpl$sendPieceData$1", f = "ObsoleteApiImpl.kt", i = {1, 1, 2, 2}, l = {m.d, 96, 101, 115}, m = "invokeSuspend", n = {"channel", Constant.h, "channel", Constant.h}, s = {"L$2", "I$0", "L$2", "I$0"})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public Object a;
        public Object b;
        public Object c;
        public int d;
        public int e;
        public final /* synthetic */ int g;
        public final /* synthetic */ byte[] h;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<byte[], Boolean> {
            public static final a a = new a();

            public a() {
                super(1);
            }

            public final boolean a(@NotNull byte[] bArr) {
                return ArraysKt___ArraysKt.first(bArr) == 0;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(byte[] bArr) {
                return Boolean.valueOf(a(bArr));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<byte[], Unit> {
            public final /* synthetic */ Channel<byte[]> a;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.obsolete.impl.ObsoleteApiImpl$sendPieceData$1$1$2$1", f = "ObsoleteApiImpl.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
            public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ Channel<byte[]> b;
                public final /* synthetic */ byte[] c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Channel<byte[]> channel, byte[] bArr, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.b = channel;
                    this.c = bArr;
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
                        Channel<byte[]> channel = this.b;
                        byte[] bArr = this.c;
                        this.a = 1;
                        if (channel.send(bArr, this) == coroutine_suspended) {
                            return coroutine_suspended;
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Channel<byte[]> channel) {
                super(1);
                this.a = channel;
            }

            public final void a(@NotNull byte[] bArr) throws InterruptedException {
                kotlinx.coroutines.d.b(null, new a(this.a, bArr, null), 1, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) throws InterruptedException {
                a(bArr);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.obsolete.impl.ObsoleteApiImpl$sendPieceData$1$1$executeResultData$1", f = "ObsoleteApiImpl.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
            public int a;
            public final /* synthetic */ Channel<byte[]> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Channel<byte[]> channel, Continuation<? super c> continuation) {
                super(2, continuation);
                this.b = channel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new c(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super byte[]> continuation) {
                return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Channel<byte[]> channel = this.b;
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
                return obj;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.obsolete.impl.ObsoleteApiImpl$sendPieceData$1$1$response$1", f = "ObsoleteApiImpl.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
        public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
            public int a;
            public final /* synthetic */ Channel<byte[]> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Channel<byte[]> channel, Continuation<? super d> continuation) {
                super(2, continuation);
                this.b = channel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new d(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super byte[]> continuation) {
                return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Channel<byte[]> channel = this.b;
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
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i, byte[] bArr, Continuation<? super g> continuation) {
            super(2, continuation);
            this.g = i;
            this.h = bArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ObsoleteApiImpl.this.new g(this.g, this.h, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00fa A[Catch: all -> 0x0216, TRY_LEAVE, TryCatch #9 {all -> 0x0216, blocks: (B:40:0x00f2, B:42:0x00fa), top: B:123:0x00f2 }] */
        /* JADX WARN: Code duplicated, block: B:45:0x0103  */
        /* JADX WARN: Code duplicated, block: B:48:0x011c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:49:0x011d  */
        /* JADX WARN: Code duplicated, block: B:52:0x0127 A[Catch: all -> 0x004e, Exception -> 0x0053, TRY_LEAVE, TryCatch #12 {Exception -> 0x0053, all -> 0x004e, blocks: (B:18:0x0046, B:50:0x0123, B:52:0x0127, B:58:0x013f, B:60:0x0147, B:64:0x015b, B:66:0x0161, B:69:0x0168, B:71:0x016e, B:75:0x0182, B:93:0x01cf), top: B:133:0x0046 }] */
        /* JADX WARN: Code duplicated, block: B:58:0x013f A[Catch: all -> 0x004e, Exception -> 0x0053, TRY_ENTER, TryCatch #12 {Exception -> 0x0053, all -> 0x004e, blocks: (B:18:0x0046, B:50:0x0123, B:52:0x0127, B:58:0x013f, B:60:0x0147, B:64:0x015b, B:66:0x0161, B:69:0x0168, B:71:0x016e, B:75:0x0182, B:93:0x01cf), top: B:133:0x0046 }] */
        /* JADX WARN: Code duplicated, block: B:60:0x0147 A[Catch: all -> 0x004e, Exception -> 0x0053, TRY_LEAVE, TryCatch #12 {Exception -> 0x0053, all -> 0x004e, blocks: (B:18:0x0046, B:50:0x0123, B:52:0x0127, B:58:0x013f, B:60:0x0147, B:64:0x015b, B:66:0x0161, B:69:0x0168, B:71:0x016e, B:75:0x0182, B:93:0x01cf), top: B:133:0x0046 }] */
        /* JADX WARN: Code duplicated, block: B:64:0x015b A[Catch: all -> 0x004e, Exception -> 0x0053, TRY_ENTER, TryCatch #12 {Exception -> 0x0053, all -> 0x004e, blocks: (B:18:0x0046, B:50:0x0123, B:52:0x0127, B:58:0x013f, B:60:0x0147, B:64:0x015b, B:66:0x0161, B:69:0x0168, B:71:0x016e, B:75:0x0182, B:93:0x01cf), top: B:133:0x0046 }] */
        /* JADX WARN: Code duplicated, block: B:66:0x0161 A[Catch: all -> 0x004e, Exception -> 0x0053, TryCatch #12 {Exception -> 0x0053, all -> 0x004e, blocks: (B:18:0x0046, B:50:0x0123, B:52:0x0127, B:58:0x013f, B:60:0x0147, B:64:0x015b, B:66:0x0161, B:69:0x0168, B:71:0x016e, B:75:0x0182, B:93:0x01cf), top: B:133:0x0046 }] */
        /* JADX WARN: Code duplicated, block: B:71:0x016e A[Catch: all -> 0x004e, Exception -> 0x0053, TRY_LEAVE, TryCatch #12 {Exception -> 0x0053, all -> 0x004e, blocks: (B:18:0x0046, B:50:0x0123, B:52:0x0127, B:58:0x013f, B:60:0x0147, B:64:0x015b, B:66:0x0161, B:69:0x0168, B:71:0x016e, B:75:0x0182, B:93:0x01cf), top: B:133:0x0046 }] */
        /* JADX WARN: Code duplicated, block: B:75:0x0182 A[Catch: all -> 0x004e, Exception -> 0x0053, TRY_ENTER, TRY_LEAVE, TryCatch #12 {Exception -> 0x0053, all -> 0x004e, blocks: (B:18:0x0046, B:50:0x0123, B:52:0x0127, B:58:0x013f, B:60:0x0147, B:64:0x015b, B:66:0x0161, B:69:0x0168, B:71:0x016e, B:75:0x0182, B:93:0x01cf), top: B:133:0x0046 }] */
        /* JADX WARN: Code duplicated, block: B:77:0x019b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:78:0x019c  */
        /* JADX WARN: Code duplicated, block: B:81:0x01a1 A[Catch: all -> 0x01c9, Exception -> 0x01cc, TRY_LEAVE, TryCatch #13 {Exception -> 0x01cc, all -> 0x01c9, blocks: (B:79:0x019d, B:81:0x01a1, B:85:0x01b5), top: B:132:0x019d }] */
        /* JADX WARN: Code duplicated, block: B:85:0x01b5 A[Catch: all -> 0x01c9, Exception -> 0x01cc, TRY_ENTER, TRY_LEAVE, TryCatch #13 {Exception -> 0x01cc, all -> 0x01c9, blocks: (B:79:0x019d, B:81:0x01a1, B:85:0x01b5), top: B:132:0x019d }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0 */
        /* JADX WARN: Type inference failed for: r10v1, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r10v15 */
        /* JADX WARN: Type inference failed for: r10v16 */
        /* JADX WARN: Type inference failed for: r10v17 */
        /* JADX WARN: Type inference failed for: r10v2 */
        /* JADX WARN: Type inference failed for: r10v5 */
        /* JADX WARN: Type inference failed for: r10v6 */
        /* JADX WARN: Type inference failed for: r10v7 */
        /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r10v9 */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v11 */
        /* JADX WARN: Type inference failed for: r3v13, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r3v14 */
        /* JADX WARN: Type inference failed for: r3v2 */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v8, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r3v9, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r9v11 */
        /* JADX WARN: Type inference failed for: r9v3 */
        /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlinx.coroutines.sync.Mutex] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ?? r10;
            ?? r11;
            Object obj2;
            ObsoleteApiImpl obsoleteApiImpl;
            Mutex mutex;
            int i;
            byte[] bArr;
            Channel Channel;
            Object objA;
            int i2;
            ObsoleteApiImpl obsoleteApiImpl2;
            ?? r3;
            Object objWithTimeoutOrNull;
            ?? r9;
            ObsoleteApiImpl obsoleteApiImpl3;
            int i3;
            byte[] bArr2;
            PieceResult pieceResult;
            Object objWithTimeoutOrNull2;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i4 = this.e;
            try {
                try {
                    try {
                        if (i4 == 0) {
                            ResultKt.throwOnFailure(obj);
                            Mutex mutex2 = ObsoleteApiImpl.this.pieceDataMutex;
                            obsoleteApiImpl = ObsoleteApiImpl.this;
                            int i5 = this.g;
                            byte[] bArr3 = this.h;
                            this.a = mutex2;
                            this.b = obsoleteApiImpl;
                            this.c = bArr3;
                            this.d = i5;
                            this.e = 1;
                            if (mutex2.lock(null, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutex = mutex2;
                            i = i5;
                            bArr = bArr3;
                        } else {
                            if (i4 != 1) {
                                if (i4 == 2) {
                                    int i6 = this.d;
                                    Channel channel = (Channel) this.c;
                                    ObsoleteApiImpl obsoleteApiImpl4 = (ObsoleteApiImpl) this.b;
                                    Mutex mutex3 = (Mutex) this.a;
                                    try {
                                        ResultKt.throwOnFailure(obj);
                                        objA = obj;
                                        Channel = channel;
                                        i2 = i6;
                                        obsoleteApiImpl2 = obsoleteApiImpl4;
                                        r10 = mutex3;
                                        try {
                                            if (!((Boolean) objA).booleanValue()) {
                                                Boolean boolBoxBoolean = Boxing.boxBoolean(false);
                                                r10.unlock(null);
                                                return boolBoxBoolean;
                                            }
                                            try {
                                                d dVar = new d(Channel, null);
                                                this.a = r10;
                                                this.b = obsoleteApiImpl2;
                                                this.c = Channel;
                                                this.d = i2;
                                                this.e = 3;
                                                objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(6000L, dVar, this);
                                                if (objWithTimeoutOrNull == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                r9 = r10;
                                                int i7 = i2;
                                                obsoleteApiImpl3 = obsoleteApiImpl2;
                                                i3 = i7;
                                                bArr2 = (byte[]) objWithTimeoutOrNull;
                                                if (bArr2 == null) {
                                                    Boolean boolBoxBoolean2 = Boxing.boxBoolean(false);
                                                    obsoleteApiImpl3.callbackSet.remove(Boxing.boxInt(0));
                                                    r9.unlock(null);
                                                    return boolBoxBoolean2;
                                                }
                                                pieceResult = PieceResult.parse(bArr2, HMBleConfig.APP_ID, i3);
                                                if (pieceResult == null) {
                                                    Boolean boolBoxBoolean3 = Boxing.boxBoolean(false);
                                                    obsoleteApiImpl3.callbackSet.remove(Boxing.boxInt(0));
                                                    r9.unlock(null);
                                                    return boolBoxBoolean3;
                                                }
                                                if (pieceResult.isPieceSuccess()) {
                                                    if (pieceResult.getTimeout() == 0) {
                                                        Boolean boolBoxBoolean4 = Boxing.boxBoolean(true);
                                                        obsoleteApiImpl3.callbackSet.remove(Boxing.boxInt(0));
                                                        r9.unlock(null);
                                                        return boolBoxBoolean4;
                                                    }
                                                    long timeout = pieceResult.getTimeout();
                                                    c cVar = new c(Channel, null);
                                                    this.a = r9;
                                                    this.b = obsoleteApiImpl3;
                                                    this.c = null;
                                                    this.e = 4;
                                                    objWithTimeoutOrNull2 = TimeoutKt.withTimeoutOrNull(timeout, cVar, this);
                                                    if (objWithTimeoutOrNull2 == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    r3 = r9;
                                                    if (((byte[]) objWithTimeoutOrNull2) == null) {
                                                        Boolean boolBoxBoolean5 = Boxing.boxBoolean(false);
                                                        obsoleteApiImpl3.callbackSet.remove(Boxing.boxInt(0));
                                                        r3.unlock(null);
                                                        return boolBoxBoolean5;
                                                    }
                                                    Boolean boolBoxBoolean6 = Boxing.boxBoolean(true);
                                                    obsoleteApiImpl3.callbackSet.remove(Boxing.boxInt(0));
                                                    r3.unlock(null);
                                                    return boolBoxBoolean6;
                                                }
                                                Boolean boolBoxBoolean7 = Boxing.boxBoolean(false);
                                                obsoleteApiImpl3.callbackSet.remove(Boxing.boxInt(0));
                                                r9.unlock(null);
                                                return boolBoxBoolean7;
                                            } catch (Exception e) {
                                                e = e;
                                                r3 = r10;
                                            } catch (Throwable th) {
                                                th = th;
                                                obsoleteApiImpl2.callbackSet.remove(Boxing.boxInt(0));
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        obj2 = null;
                                        r11 = mutex3;
                                    }
                                    obj2 = null;
                                    r11 = r10;
                                    r11.unlock(obj2);
                                    throw th;
                                }
                                if (i4 == 3) {
                                    i3 = this.d;
                                    Channel channel2 = (Channel) this.c;
                                    obsoleteApiImpl3 = (ObsoleteApiImpl) this.b;
                                    Mutex mutex4 = (Mutex) this.a;
                                    try {
                                        ResultKt.throwOnFailure(obj);
                                        Channel = channel2;
                                        objWithTimeoutOrNull = obj;
                                        r9 = mutex4;
                                        bArr2 = (byte[]) objWithTimeoutOrNull;
                                        try {
                                            if (bArr2 == null) {
                                                Boolean boolBoxBoolean8 = Boxing.boxBoolean(false);
                                                obsoleteApiImpl3.callbackSet.remove(Boxing.boxInt(0));
                                                r9.unlock(null);
                                                return boolBoxBoolean8;
                                            }
                                            pieceResult = PieceResult.parse(bArr2, HMBleConfig.APP_ID, i3);
                                            if (pieceResult == null) {
                                                Boolean boolBoxBoolean9 = Boxing.boxBoolean(false);
                                                obsoleteApiImpl3.callbackSet.remove(Boxing.boxInt(0));
                                                r9.unlock(null);
                                                return boolBoxBoolean9;
                                            }
                                            if (pieceResult.isPieceSuccess() && pieceResult.isProfileSuccess()) {
                                                if (pieceResult.getTimeout() == 0) {
                                                    Boolean boolBoxBoolean10 = Boxing.boxBoolean(true);
                                                    obsoleteApiImpl3.callbackSet.remove(Boxing.boxInt(0));
                                                    r9.unlock(null);
                                                    return boolBoxBoolean10;
                                                }
                                                long timeout2 = pieceResult.getTimeout();
                                                c cVar2 = new c(Channel, null);
                                                this.a = r9;
                                                this.b = obsoleteApiImpl3;
                                                this.c = null;
                                                this.e = 4;
                                                objWithTimeoutOrNull2 = TimeoutKt.withTimeoutOrNull(timeout2, cVar2, this);
                                                if (objWithTimeoutOrNull2 == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                r3 = r9;
                                                if (((byte[]) objWithTimeoutOrNull2) == null) {
                                                    Boolean boolBoxBoolean11 = Boxing.boxBoolean(false);
                                                    obsoleteApiImpl3.callbackSet.remove(Boxing.boxInt(0));
                                                    r3.unlock(null);
                                                    return boolBoxBoolean11;
                                                }
                                                Boolean boolBoxBoolean12 = Boxing.boxBoolean(true);
                                                obsoleteApiImpl3.callbackSet.remove(Boxing.boxInt(0));
                                                r3.unlock(null);
                                                return boolBoxBoolean12;
                                            }
                                            Boolean boolBoxBoolean13 = Boxing.boxBoolean(false);
                                            obsoleteApiImpl3.callbackSet.remove(Boxing.boxInt(0));
                                            r9.unlock(null);
                                            return boolBoxBoolean13;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            r10 = r9;
                                        }
                                    } catch (Exception e2) {
                                        e = e2;
                                        obsoleteApiImpl2 = obsoleteApiImpl3;
                                        r3 = mutex4;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        obsoleteApiImpl2 = obsoleteApiImpl3;
                                        obsoleteApiImpl2.callbackSet.remove(Boxing.boxInt(0));
                                        throw th;
                                    }
                                } else {
                                    if (i4 != 4) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    obsoleteApiImpl2 = (ObsoleteApiImpl) this.b;
                                    r3 = (Mutex) this.a;
                                    try {
                                        try {
                                            ResultKt.throwOnFailure(obj);
                                            obsoleteApiImpl3 = obsoleteApiImpl2;
                                            objWithTimeoutOrNull2 = obj;
                                            r3 = r3;
                                            try {
                                                if (((byte[]) objWithTimeoutOrNull2) == null) {
                                                    Boolean boolBoxBoolean14 = Boxing.boxBoolean(false);
                                                    obsoleteApiImpl3.callbackSet.remove(Boxing.boxInt(0));
                                                    r3.unlock(null);
                                                    return boolBoxBoolean14;
                                                }
                                                Boolean boolBoxBoolean15 = Boxing.boxBoolean(true);
                                                obsoleteApiImpl3.callbackSet.remove(Boxing.boxInt(0));
                                                r3.unlock(null);
                                                return boolBoxBoolean15;
                                            } catch (Exception e3) {
                                                e = e3;
                                                obsoleteApiImpl2 = obsoleteApiImpl3;
                                            } catch (Throwable th6) {
                                                th = th6;
                                                obsoleteApiImpl2 = obsoleteApiImpl3;
                                                obsoleteApiImpl2.callbackSet.remove(Boxing.boxInt(0));
                                                throw th;
                                            }
                                        } catch (Exception e4) {
                                            e = e4;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        obsoleteApiImpl2.callbackSet.remove(Boxing.boxInt(0));
                                        throw th;
                                    }
                                }
                                Debug.fi(ObsoleteApiImpl.h, Intrinsics.stringPlus("Waite piece result exception:", e));
                                obsoleteApiImpl2.callbackSet.remove(Boxing.boxInt(0));
                                Boolean boolBoxBoolean16 = Boxing.boxBoolean(false);
                                r3.unlock(null);
                                return boolBoxBoolean16;
                            }
                            i = this.d;
                            bArr = (byte[]) this.c;
                            obsoleteApiImpl = (ObsoleteApiImpl) this.b;
                            mutex = (Mutex) this.a;
                            ResultKt.throwOnFailure(obj);
                        }
                        obsoleteApiImpl.callbackSet.put(Boxing.boxInt(0), new FilterAction(a.a, new b(Channel)));
                        int i8 = i | 192;
                        byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(new byte[]{0, HMBleConfig.APP_ID, (byte) i8, 0}, bArr);
                        this.a = mutex;
                        this.b = obsoleteApiImpl;
                        this.c = Channel;
                        this.d = i8;
                        this.e = 2;
                        objA = obsoleteApiImpl.a(bArrPlus, this);
                        if (objA == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i2 = i8;
                        obsoleteApiImpl2 = obsoleteApiImpl;
                        r10 = mutex;
                        if (!((Boolean) objA).booleanValue()) {
                            Boolean boolBoxBoolean17 = Boxing.boxBoolean(false);
                            r10.unlock(null);
                            return boolBoxBoolean17;
                        }
                        d dVar2 = new d(Channel, null);
                        this.a = r10;
                        this.b = obsoleteApiImpl2;
                        this.c = Channel;
                        this.d = i2;
                        this.e = 3;
                        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(6000L, dVar2, this);
                        if (objWithTimeoutOrNull == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        r9 = r10;
                        int i9 = i2;
                        obsoleteApiImpl3 = obsoleteApiImpl2;
                        i3 = i9;
                        bArr2 = (byte[]) objWithTimeoutOrNull;
                        if (bArr2 == null) {
                            Boolean boolBoxBoolean18 = Boxing.boxBoolean(false);
                            obsoleteApiImpl3.callbackSet.remove(Boxing.boxInt(0));
                            r9.unlock(null);
                            return boolBoxBoolean18;
                        }
                        pieceResult = PieceResult.parse(bArr2, HMBleConfig.APP_ID, i3);
                        if (pieceResult == null) {
                            Boolean boolBoxBoolean19 = Boxing.boxBoolean(false);
                            obsoleteApiImpl3.callbackSet.remove(Boxing.boxInt(0));
                            r9.unlock(null);
                            return boolBoxBoolean19;
                        }
                        if (pieceResult.isPieceSuccess()) {
                            if (pieceResult.getTimeout() == 0) {
                                Boolean boolBoxBoolean110 = Boxing.boxBoolean(true);
                                obsoleteApiImpl3.callbackSet.remove(Boxing.boxInt(0));
                                r9.unlock(null);
                                return boolBoxBoolean110;
                            }
                            long timeout3 = pieceResult.getTimeout();
                            c cVar3 = new c(Channel, null);
                            this.a = r9;
                            this.b = obsoleteApiImpl3;
                            this.c = null;
                            this.e = 4;
                            objWithTimeoutOrNull2 = TimeoutKt.withTimeoutOrNull(timeout3, cVar3, this);
                            if (objWithTimeoutOrNull2 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            r3 = r9;
                            if (((byte[]) objWithTimeoutOrNull2) == null) {
                                Boolean boolBoxBoolean111 = Boxing.boxBoolean(false);
                                obsoleteApiImpl3.callbackSet.remove(Boxing.boxInt(0));
                                r3.unlock(null);
                                return boolBoxBoolean111;
                            }
                            Boolean boolBoxBoolean112 = Boxing.boxBoolean(true);
                            obsoleteApiImpl3.callbackSet.remove(Boxing.boxInt(0));
                            r3.unlock(null);
                            return boolBoxBoolean112;
                        }
                        Boolean boolBoxBoolean113 = Boxing.boxBoolean(false);
                        obsoleteApiImpl3.callbackSet.remove(Boxing.boxInt(0));
                        r9.unlock(null);
                        return boolBoxBoolean113;
                        obj2 = null;
                        r11 = r10;
                        r11.unlock(obj2);
                        throw th;
                    } catch (Throwable th8) {
                        th = th8;
                        r10 = mutex;
                    }
                    Channel = ChannelKt.Channel(Integer.MAX_VALUE);
                } catch (Throwable th9) {
                    th = th9;
                    obj2 = null;
                    r11 = mutex;
                }
            } catch (Throwable th10) {
                th = th10;
                r10 = 4;
            }
        }
    }

    public ObsoleteApiImpl(@NotNull ObsoleteModule obsoleteModule) {
        this.module = obsoleteModule;
        ConcurrentHashMap<Integer, FilterAction> concurrentHashMap = new ConcurrentHashMap<>();
        this.callbackSet = concurrentHashMap;
        this.ecfMutex = MutexKt.Mutex$default(false, 1, null);
        this.pieceDataMutex = MutexKt.Mutex$default(false, 1, null);
        this.genericMutex = MutexKt.Mutex$default(false, 1, null);
        this.iasMutex = MutexKt.Mutex$default(false, 1, null);
        FilterAction filterAction = new FilterAction(b.a, c.a);
        this.generalNotifyAction = filterAction;
        obsoleteModule.registerListener(new a());
        concurrentHashMap.put(2, filterAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(byte[] bArr, Continuation<? super Boolean> continuation) {
        return BaseModule.sendDataWithResult$default(this.module, bArr, 0, false, continuation, 6, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.obsolete.ObsoleteApi
    @Nullable
    public HMNotifyResponse sendECFCommand(@NotNull byte[] cmd, int cmdLen) {
        return (HMNotifyResponse) kotlinx.coroutines.d.b(null, new d(cmd, cmdLen, null), 1, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.obsolete.ObsoleteApi
    @Nullable
    public HMGenericResponse sendGenericCommand(@NotNull HMGenericCommand command) {
        return (HMGenericResponse) kotlinx.coroutines.d.b(null, new e(command, null), 1, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.obsolete.ObsoleteApi
    public boolean sendIASCommand(@NotNull byte[] command) {
        return ((Boolean) kotlinx.coroutines.d.b(null, new f(command, null), 1, null)).booleanValue();
    }

    @Override // com.huami.bluetooth.profile.channel.module.obsolete.ObsoleteApi
    public boolean sendPieceData(@NotNull byte[] data, int type) {
        return ((Boolean) kotlinx.coroutines.d.b(null, new g(type, data, null), 1, null)).booleanValue();
    }
}
