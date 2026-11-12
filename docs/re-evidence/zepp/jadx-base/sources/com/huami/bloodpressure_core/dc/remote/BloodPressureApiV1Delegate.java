package com.huami.bloodpressure_core.dc.remote;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bloodpressure_core.ext.SerializationKtxKt;
import com.huami.bloodpressure_core.ext.UserExKt;
import com.huami.bloodpressure_core.user.WeakUserInfo;
import com.huami.network.hmnetwork.server.HMServerDef;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.text.m;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0015\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014¢\u0006\u0004\b \u0010!J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001f\u001a\u00020\u001b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lcom/huami/bloodpressure_core/dc/remote/BloodPressureApiV1Delegate;", "Lcom/huami/bloodpressure_core/dc/remote/IBloodPressureDelegate;", "Lcom/huami/bloodpressure_core/dc/remote/BloodPressureRemoteEntity;", "Lcom/huami/bloodpressure_core/dc/remote/BloodPressureRequestEntity;", "Lorg/koin/core/component/KoinComponent;", "", "url", "a", "", "next", "", "getUserAllData", "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "events", "", "postDataList", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "timeStamp", "delData", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bloodpressure_core/dc/remote/IEventApi;", "Lcom/huami/bloodpressure_core/dc/remote/IEventApi;", "eventApi", "", "b", LogUtil.I, "LIMIT", "Lcom/huami/bloodpressure_core/user/WeakUserInfo;", "c", "Lkotlin/Lazy;", "()Lcom/huami/bloodpressure_core/user/WeakUserInfo;", "weakUserInfo", "<init>", "(Lcom/huami/bloodpressure_core/dc/remote/IEventApi;)V", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureApiV1Delegate implements IBloodPressureDelegate<BloodPressureRemoteEntity, BloodPressureRequestEntity>, KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IEventApi<BloodPressureRemoteEntity> eventApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int LIMIT = 1000;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy weakUserInfo;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodpressure_core.dc.remote.BloodPressureApiV1Delegate", f = "IBloodPressureDelegate.kt", i = {0, 0}, l = {58}, m = "getUserAllData", n = {"bufferList", "url"}, s = {"L$1", "L$2"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
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
            return BloodPressureApiV1Delegate.this.getUserAllData(null, this);
        }
    }

    public BloodPressureApiV1Delegate(@NotNull IEventApi<BloodPressureRemoteEntity> iEventApi) {
        this.eventApi = iEventApi;
        final StringQualifier stringQualifierNamed = QualifierKt.named(UserExKt.getWEAK_NAME_USERINFO());
        final Function0 function0 = null;
        this.weakUserInfo = LazyKt__LazyJVMKt.lazy(KoinPlatformTools.INSTANCE.defaultLazyMode(), (Function0) new Function0<WeakUserInfo>() { // from class: com.huami.bloodpressure_core.dc.remote.BloodPressureApiV1Delegate$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.bloodpressure_core.user.WeakUserInfo, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final WeakUserInfo getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(WeakUserInfo.class), stringQualifierNamed, function0);
            }
        });
    }

    private final String a(String url) {
        return HMServerDef.getHost() + url;
    }

    private final WeakUserInfo b() {
        return (WeakUserInfo) this.weakUserInfo.getValue();
    }

    @Override // com.huami.bloodpressure_core.dc.remote.IBloodPressureDelegate
    @Nullable
    public Object delData(long j, @NotNull Continuation<? super Boolean> continuation) {
        String userId = b().getUserId();
        String strA = a(m.replace$default(m.replace$default("users/{userId}/event/{eventType}", "{userId}", userId == null ? "" : userId, false, 4, (Object) null), "{eventType}", "health_data", false, 4, (Object) null));
        IEventApi<BloodPressureRemoteEntity> iEventApi = this.eventApi;
        String userId2 = b().getUserId();
        return iEventApi.deleteData(strA, userId2 == null ? "" : userId2, "health_data", "blood_pressure", j, continuation);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0082  */
    /* JADX WARN: Code duplicated, block: B:22:0x0084  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ed A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00b9 -> B:27:0x00c0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.huami.bloodpressure_core.dc.remote.IBloodPressureDelegate
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getUserAllData(@org.jetbrains.annotations.Nullable java.lang.Long r26, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<? extends com.huami.bloodpressure_core.dc.remote.BloodPressureRemoteEntity>> r27) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huami.bloodpressure_core.dc.remote.BloodPressureApiV1Delegate.getUserAllData(java.lang.Long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.huami.bloodpressure_core.dc.remote.IBloodPressureDelegate
    @Nullable
    public Object postDataList(@NotNull List<? extends BloodPressureRequestEntity> list, @NotNull Continuation<? super Boolean> continuation) {
        String userId = b().getUserId();
        if (userId == null) {
            userId = "";
        }
        return this.eventApi.uploadData(a(m.replace$default("users/{userId}/events", "{userId}", userId, false, 4, (Object) null)), userId, SerializationKtxKt.getNonStrictInstance(Json.INSTANCE).encodeToString(BuiltinSerializersKt.ListSerializer(BloodPressureRequestEntity.INSTANCE.serializer()), list), continuation);
    }
}
