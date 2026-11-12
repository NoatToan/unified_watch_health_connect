package com.huami.nfc.base;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.dev.Logcat;
import com.huami.dev.LogcatKt;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002\u001aG\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001aG\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\n\u001aG\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000*\u00020\f2\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\r\u001a\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u001a\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u001a\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\"\u001d\u0010\u001b\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/nfc/base/INfcChannel;", "Lkotlin/Function0;", "Lcom/huami/nfc/base/PayResponse;", "action", "withOpenAndClose", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "withOpenAndCloseBySuspend", "(Lcom/huami/nfc/base/INfcChannel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withOpenBySuspend", "Lcom/huami/nfc/base/MasterCardNfcChannel;", "(Lcom/huami/nfc/base/MasterCardNfcChannel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/nfc/base/SeResponseErrorException;", "error", "a", "Lcom/huami/nfc/base/NfcChannelException;", "channel", "c", "Lcom/huami/nfc/base/ApduNotResponseException;", AbstractJSONTokenResponse.RESPONSE, GoogleApiAvailabilityLight.a, "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlin/Lazy;", "b", "()Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlinx/coroutines/sync/Mutex;", "mutex", "nfc-base_release"}, k = 2, mv = {1, 5, 1})
public final class NfcChannelExtensionsKt {

    @NotNull
    private static final Lazy a = LazyKt__LazyJVMKt.lazy(b.a);

    @NotNull
    private static final Mutex b = MutexKt.Mutex$default(false, 1, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Object> {
        public final /* synthetic */ SeResponseErrorException a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SeResponseErrorException seResponseErrorException) {
            super(0);
            this.a = seResponseErrorException;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return String.valueOf(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Ljava/util/concurrent/locks/ReentrantLock;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<ReentrantLock> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ReentrantLock invoke() {
            return new ReentrantLock();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Object> {
        public final /* synthetic */ NfcChannelException a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(NfcChannelException nfcChannelException) {
            super(0);
            this.a = nfcChannelException;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Object> {
        public final /* synthetic */ ApduNotResponseException a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ApduNotResponseException apduNotResponseException) {
            super(0);
            this.a = apduNotResponseException;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return String.valueOf(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.nfc.base.NfcChannelExtensionsKt", f = "NfcChannelExtensions.kt", i = {0, 0, 0, 1, 1}, l = {111, 45}, m = "withOpenAndCloseBySuspend", n = {"$this$withOpenAndCloseBySuspend", "action", "$this$withLock_u24default$iv", "$this$withOpenAndCloseBySuspend", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    public static final class e<T> extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int e;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return NfcChannelExtensionsKt.withOpenAndCloseBySuspend((INfcChannel) null, (Function1) null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.nfc.base.NfcChannelExtensionsKt", f = "NfcChannelExtensions.kt", i = {0, 0, 0, 1, 1}, l = {111, 79}, m = "withOpenAndCloseBySuspend", n = {"$this$withOpenAndCloseBySuspend", "action", "$this$withLock_u24default$iv", "$this$withOpenAndCloseBySuspend", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    public static final class f<T> extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int e;

        public f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return NfcChannelExtensionsKt.withOpenAndCloseBySuspend((MasterCardNfcChannel) null, (Function1) null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.nfc.base.NfcChannelExtensionsKt", f = "NfcChannelExtensions.kt", i = {0, 0, 0, 1, 1}, l = {111, 62}, m = "withOpenBySuspend", n = {"$this$withOpenBySuspend", "action", "$this$withLock_u24default$iv", "$this$withOpenBySuspend", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    public static final class g<T> extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int e;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return NfcChannelExtensionsKt.withOpenBySuspend(null, null, this);
        }
    }

    private static final <T> PayResponse<T> a(SeResponseErrorException seResponseErrorException) {
        LogcatKt.info$default(Logcat.INSTANCE, null, new a(seResponseErrorException), 1, null);
        return new PayResponse<>(PayResponse.CODE_SE_RESPONSE_ERROR, String.valueOf(seResponseErrorException), null);
    }

    private static final ReentrantLock b() {
        return (ReentrantLock) a.getValue();
    }

    private static final <T> PayResponse<T> c(NfcChannelException nfcChannelException) {
        LogcatKt.info$default(Logcat.INSTANCE, null, new c(nfcChannelException), 1, null);
        return new PayResponse<>(PayResponse.CODE_NFC_CHANNEL_ERROR, nfcChannelException.toString(), null);
    }

    private static final <T> PayResponse<T> d(ApduNotResponseException apduNotResponseException) {
        LogcatKt.info$default(Logcat.INSTANCE, null, new d(apduNotResponseException), 1, null);
        return new PayResponse<>(PayResponse.CODE_SE_NOT_RESPONSE_ERROR, String.valueOf(apduNotResponseException), null);
    }

    @NotNull
    public static final <T> PayResponse<T> withOpenAndClose(@NotNull INfcChannel iNfcChannel, @NotNull Function0<? extends PayResponse<? extends T>> function0) {
        PayResponse payResponseC;
        b().lock();
        try {
            try {
                try {
                    iNfcChannel.openNfcChannel();
                    PayResponse payResponseInvoke = function0.invoke();
                    PayResponse payResponse = payResponseInvoke;
                    iNfcChannel.closeNfcChannel();
                    payResponseC = payResponseInvoke;
                } catch (SeResponseErrorException e2) {
                    payResponseC = a(e2);
                }
            } catch (ApduNotResponseException e3) {
                payResponseC = d(e3);
            } catch (NfcChannelException e4) {
                payResponseC = c(e4);
            }
            return payResponseC;
        } finally {
            b().unlock();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final <T> Object withOpenAndCloseBySuspend(@NotNull INfcChannel iNfcChannel, @NotNull Function1<? super Continuation<? super PayResponse<? extends T>>, ? extends Object> function1, @NotNull Continuation<? super PayResponse<? extends T>> continuation) throws Throwable {
        e eVar;
        Mutex mutex;
        Mutex mutex2;
        INfcChannel iNfcChannel2;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i = eVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.e = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object obj = eVar.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = eVar.e;
        try {
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    mutex = b;
                    eVar.a = iNfcChannel;
                    eVar.b = function1;
                    eVar.c = mutex;
                    eVar.e = 1;
                    if (mutex.lock(null, eVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex2 = (Mutex) eVar.b;
                        iNfcChannel2 = (INfcChannel) eVar.a;
                        try {
                            ResultKt.throwOnFailure(obj);
                            iNfcChannel2.closeNfcChannel();
                            PayResponse payResponse = (PayResponse) obj;
                            mutex2.unlock(null);
                            return payResponse;
                        } catch (Throwable th) {
                            th = th;
                            mutex2.unlock(null);
                            throw th;
                        }
                    }
                    Mutex mutex3 = (Mutex) eVar.c;
                    function1 = (Function1) eVar.b;
                    INfcChannel iNfcChannel3 = (INfcChannel) eVar.a;
                    ResultKt.throwOnFailure(obj);
                    mutex = mutex3;
                    iNfcChannel = iNfcChannel3;
                }
                iNfcChannel.openNfcChannel();
                eVar.a = iNfcChannel;
                eVar.b = mutex;
                eVar.c = null;
                eVar.e = 2;
                Object objInvoke = function1.invoke(eVar);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                iNfcChannel2 = iNfcChannel;
                mutex2 = mutex;
                obj = objInvoke;
                iNfcChannel2.closeNfcChannel();
                PayResponse payResponse2 = (PayResponse) obj;
                mutex2.unlock(null);
                return payResponse2;
            } catch (Throwable th2) {
                th = th2;
                mutex2 = mutex;
                mutex2.unlock(null);
                throw th;
            }
        } catch (ApduNotResponseException e2) {
            return d(e2);
        } catch (NfcChannelException e3) {
            return c(e3);
        } catch (SeResponseErrorException e4) {
            return a(e4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final <T> Object withOpenBySuspend(@NotNull INfcChannel iNfcChannel, @NotNull Function1<? super Continuation<? super PayResponse<? extends T>>, ? extends Object> function1, @NotNull Continuation<? super PayResponse<? extends T>> continuation) throws Throwable {
        g gVar;
        Mutex mutex;
        Mutex mutex2;
        INfcChannel iNfcChannel2;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i = gVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                gVar.e = i - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object obj = gVar.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = gVar.e;
        try {
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    mutex = b;
                    gVar.a = iNfcChannel;
                    gVar.b = function1;
                    gVar.c = mutex;
                    gVar.e = 1;
                    if (mutex.lock(null, gVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex2 = (Mutex) gVar.b;
                        iNfcChannel2 = (INfcChannel) gVar.a;
                        try {
                            ResultKt.throwOnFailure(obj);
                            iNfcChannel2.closeNfcChannel();
                            PayResponse payResponse = (PayResponse) obj;
                            mutex2.unlock(null);
                            return payResponse;
                        } catch (Throwable th) {
                            th = th;
                            mutex2.unlock(null);
                            throw th;
                        }
                    }
                    Mutex mutex3 = (Mutex) gVar.c;
                    function1 = (Function1) gVar.b;
                    INfcChannel iNfcChannel3 = (INfcChannel) gVar.a;
                    ResultKt.throwOnFailure(obj);
                    mutex = mutex3;
                    iNfcChannel = iNfcChannel3;
                }
                iNfcChannel.openNfcChannel();
                gVar.a = iNfcChannel;
                gVar.b = mutex;
                gVar.c = null;
                gVar.e = 2;
                Object objInvoke = function1.invoke(gVar);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                iNfcChannel2 = iNfcChannel;
                mutex2 = mutex;
                obj = objInvoke;
                iNfcChannel2.closeNfcChannel();
                PayResponse payResponse2 = (PayResponse) obj;
                mutex2.unlock(null);
                return payResponse2;
            } catch (Throwable th2) {
                th = th2;
                mutex2 = mutex;
                mutex2.unlock(null);
                throw th;
            }
        } catch (ApduNotResponseException e2) {
            return d(e2);
        } catch (NfcChannelException e3) {
            return c(e3);
        } catch (SeResponseErrorException e4) {
            return a(e4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final <T> Object withOpenAndCloseBySuspend(@NotNull MasterCardNfcChannel masterCardNfcChannel, @NotNull Function1<? super Continuation<? super PayResponse<? extends T>>, ? extends Object> function1, @NotNull Continuation<? super PayResponse<? extends T>> continuation) throws Throwable {
        f fVar;
        Mutex mutex;
        Mutex mutex2;
        MasterCardNfcChannel masterCardNfcChannel2;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i = fVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                fVar.e = i - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        Object obj = fVar.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = fVar.e;
        try {
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    mutex = b;
                    fVar.a = masterCardNfcChannel;
                    fVar.b = function1;
                    fVar.c = mutex;
                    fVar.e = 1;
                    if (mutex.lock(null, fVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex2 = (Mutex) fVar.b;
                        masterCardNfcChannel2 = (MasterCardNfcChannel) fVar.a;
                        try {
                            ResultKt.throwOnFailure(obj);
                            masterCardNfcChannel2.closeNfcChannel();
                            PayResponse payResponse = (PayResponse) obj;
                            mutex2.unlock(null);
                            return payResponse;
                        } catch (Throwable th) {
                            th = th;
                            mutex2.unlock(null);
                            throw th;
                        }
                    }
                    Mutex mutex3 = (Mutex) fVar.c;
                    function1 = (Function1) fVar.b;
                    MasterCardNfcChannel masterCardNfcChannel3 = (MasterCardNfcChannel) fVar.a;
                    ResultKt.throwOnFailure(obj);
                    mutex = mutex3;
                    masterCardNfcChannel = masterCardNfcChannel3;
                }
                masterCardNfcChannel.openNfcChannel();
                fVar.a = masterCardNfcChannel;
                fVar.b = mutex;
                fVar.c = null;
                fVar.e = 2;
                Object objInvoke = function1.invoke(fVar);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                masterCardNfcChannel2 = masterCardNfcChannel;
                mutex2 = mutex;
                obj = objInvoke;
                masterCardNfcChannel2.closeNfcChannel();
                PayResponse payResponse2 = (PayResponse) obj;
                mutex2.unlock(null);
                return payResponse2;
            } catch (Throwable th2) {
                th = th2;
                mutex2 = mutex;
                mutex2.unlock(null);
                throw th;
            }
        } catch (ApduNotResponseException e2) {
            return d(e2);
        } catch (NfcChannelException e3) {
            return c(e3);
        } catch (SeResponseErrorException e4) {
            return a(e4);
        }
    }
}
