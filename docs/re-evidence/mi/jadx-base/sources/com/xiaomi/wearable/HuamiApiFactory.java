package com.xiaomi.wearable;

import android.os.RemoteException;
import android.util.ArrayMap;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.smarthome.homeroom.model.Home;
import com.xiaomi.wearable.core.DeviceInfo;
import com.xiaomi.wearable.device.HuamiApiCall;
import com.xiaomi.wearable.hm.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b$\u0010%J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u000eJ\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR(\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0 0\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00150\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"¨\u0006'"}, d2 = {"Lcom/xiaomi/wearable/HuamiApiFactory;", "", "", "mac", "Lcom/xiaomi/wearable/HuamiApiImpl;", "huamiApi", "", "notifyHuamiApiCall", "(Ljava/lang/String;Lcom/xiaomi/wearable/HuamiApiImpl;)V", "Lcom/xiaomi/wearable/HuamiApiChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addHuamiApiChangeListener", "(Ljava/lang/String;Lcom/xiaomi/wearable/HuamiApiChangeListener;)V", "removeHuamiApi", "(Ljava/lang/String;)V", "did", "Lcom/xiaomi/wearable/hm/m;", "getHuamiApi", "(Ljava/lang/String;Ljava/lang/String;)Lcom/xiaomi/wearable/hm/m;", "Lcom/xiaomi/wearable/core/DeviceInfo;", "deviceInfo", "Lcom/xiaomi/wearable/device/HuamiApiCall;", "newHuamiApiCall", "(Lcom/xiaomi/wearable/core/DeviceInfo;)Lcom/xiaomi/wearable/device/HuamiApiCall;", Home.JSON_KEY_ADDRESS, "removeHuamiApiCall", "getHuamiApiCall", "(Ljava/lang/String;)Lcom/xiaomi/wearable/device/HuamiApiCall;", "Ljava/util/HashMap;", "huamiApiMap", "Ljava/util/HashMap;", "Landroid/util/ArrayMap;", "", "mHuamiApiChangeListener", "Landroid/util/ArrayMap;", "callsMap", "<init>", "()V", "Companion", "huami_release"}, k = 1, mv = {2, 0, 0})
public final class HuamiApiFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final HuamiApiFactory INSTANCE = new HuamiApiFactory();

    @NotNull
    private static final String TAG = "HuamiApiManager";

    @NotNull
    private final HashMap<String, m> huamiApiMap = new HashMap<>();

    @NotNull
    private ArrayMap<String, List<HuamiApiChangeListener>> mHuamiApiChangeListener = new ArrayMap<>();

    @NotNull
    private final ArrayMap<String, HuamiApiCall> callsMap = new ArrayMap<>();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u0007H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/wearable/HuamiApiFactory$Companion;", "", "<init>", "()V", "TAG", "", "INSTANCE", "Lcom/xiaomi/wearable/HuamiApiFactory;", "getINSTANCE", "()Lcom/xiaomi/wearable/HuamiApiFactory;", "get", "huami_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final HuamiApiFactory get() {
            return getINSTANCE();
        }

        @NotNull
        public final HuamiApiFactory getINSTANCE() {
            return HuamiApiFactory.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.wearable.HuamiApiFactory$addHuamiApiChangeListener$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.wearable.HuamiApiFactory$addHuamiApiChangeListener$1", f = "HuamiApiFactory.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ HuamiApiChangeListener $listener;
        final /* synthetic */ String $mac;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, HuamiApiChangeListener huamiApiChangeListener, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$mac = str;
            this.$listener = huamiApiChangeListener;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HuamiApiFactory.this.new AnonymousClass1(this.$mac, this.$listener, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List arrayList = (List) HuamiApiFactory.this.mHuamiApiChangeListener.get(this.$mac);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            ListExtKt.add(arrayList, this.$listener);
            HuamiApiFactory.this.mHuamiApiChangeListener.put(this.$mac, arrayList);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.wearable.HuamiApiFactory$notifyHuamiApiCall$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.wearable.HuamiApiFactory$notifyHuamiApiCall$1", f = "HuamiApiFactory.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nHuamiApiFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HuamiApiFactory.kt\ncom/xiaomi/wearable/HuamiApiFactory$notifyHuamiApiCall$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,88:1\n1863#2,2:89\n*S KotlinDebug\n*F\n+ 1 HuamiApiFactory.kt\ncom/xiaomi/wearable/HuamiApiFactory$notifyHuamiApiCall$1\n*L\n22#1:89,2\n*E\n"})
    public static final class C34351 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ HuamiApiImpl $huamiApi;
        final /* synthetic */ String $mac;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34351(String str, HuamiApiImpl huamiApiImpl, Continuation<? super C34351> continuation) {
            super(2, continuation);
            this.$mac = str;
            this.$huamiApi = huamiApiImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HuamiApiFactory.this.new C34351(this.$mac, this.$huamiApi, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List list = (List) HuamiApiFactory.this.mHuamiApiChangeListener.get(this.$mac);
            if (list != null) {
                HuamiApiImpl huamiApiImpl = this.$huamiApi;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((HuamiApiChangeListener) it.next()).onHuamiApiChange(huamiApiImpl);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C34351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @JvmStatic
    @NotNull
    public static final HuamiApiFactory get() {
        return INSTANCE.get();
    }

    private final void notifyHuamiApiCall(String mac, HuamiApiImpl huamiApi) {
        AnyExtKt.main$default(null, new C34351(mac, huamiApi, null), 1, null);
    }

    public final void addHuamiApiChangeListener(@NotNull String mac, @NotNull HuamiApiChangeListener listener) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(listener, "listener");
        AnyExtKt.main$default(null, new AnonymousClass1(mac, listener, null), 1, null);
    }

    @NotNull
    public final m getHuamiApi(@NotNull String mac, @Nullable String did) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Logger.i(TAG, "getHuamiApi() called with: mac = " + mac + ", did = " + did + ", " + this.huamiApiMap.get(mac));
        m mVar = this.huamiApiMap.get(mac);
        if (mVar != null) {
            return mVar;
        }
        HuamiApiImpl huamiApiImpl = new HuamiApiImpl(ApplicationExtKt.getApplication(), mac, did);
        this.huamiApiMap.put(mac, huamiApiImpl);
        notifyHuamiApiCall(mac, huamiApiImpl);
        return huamiApiImpl;
    }

    @Nullable
    public final HuamiApiCall getHuamiApiCall(@NotNull String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        return this.callsMap.get(address);
    }

    @NotNull
    public final HuamiApiCall newHuamiApiCall(@NotNull DeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        HuamiApiCall huamiApiCall = new HuamiApiCall(deviceInfo);
        this.callsMap.put(deviceInfo.getAddress(), huamiApiCall);
        return huamiApiCall;
    }

    public final void removeHuamiApi(@NotNull String mac) throws RemoteException {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Logger.i(TAG, "removeHuamiApi() called with: mac = " + mac);
        m mVarRemove = this.huamiApiMap.remove(mac);
        if (mVarRemove != null) {
            mVarRemove.setCallback(null);
            mVarRemove.shutdown();
            mVarRemove.destory();
        }
    }

    public final void removeHuamiApiCall(@NotNull String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        Logger.i(TAG, "removeHuamiApiCall() called with: address = " + address + ", contains = " + this.callsMap.containsKey(address));
        this.callsMap.remove(address);
    }
}
