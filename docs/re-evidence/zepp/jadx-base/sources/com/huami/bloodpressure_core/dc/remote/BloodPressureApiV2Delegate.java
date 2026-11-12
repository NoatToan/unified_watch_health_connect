package com.huami.bloodpressure_core.dc.remote;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bloodpressure_core.dc.local.BloodPressureVo;
import com.huami.bloodpressure_core.ext.SerializationKtxKt;
import com.huami.bloodpressure_core.ext.UserExKt;
import com.huami.bloodpressure_core.p002const.BloodPressureConst;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u001b\u0012\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0015¢\u0006\u0004\b!\u0010\"J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J)\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010 \u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lcom/huami/bloodpressure_core/dc/remote/BloodPressureApiV2Delegate;", "Lcom/huami/bloodpressure_core/dc/remote/IBloodPressureDelegate;", "Lcom/huami/bloodpressure_core/dc/remote/BloodPressureRemoteV2Entity;", "Lcom/huami/bloodpressure_core/dc/local/BloodPressureVo;", "Lcom/huami/bloodpressure_core/dc/remote/BloodPressureRequestV2Entity;", "Lorg/koin/core/component/KoinComponent;", "", "url", "a", "", "next", "", "getUserAllData", "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "events", "", "postDataList", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "timeStamp", "delData", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bloodpressure_core/dc/remote/IEventApi;", "Lcom/huami/bloodpressure_core/dc/remote/IEventApi;", "eventApi", "", "b", LogUtil.I, "LIMIT", "Lcom/huami/bloodpressure_core/user/WeakUserInfo;", "c", "Lkotlin/Lazy;", "()Lcom/huami/bloodpressure_core/user/WeakUserInfo;", "weakUserInfo", "<init>", "(Lcom/huami/bloodpressure_core/dc/remote/IEventApi;)V", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureApiV2Delegate implements IBloodPressureDelegate<BloodPressureRemoteV2Entity<BloodPressureVo>, BloodPressureRequestV2Entity>, KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IEventApi<BloodPressureRemoteV2Entity<BloodPressureVo>> eventApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int LIMIT = 1000;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy weakUserInfo;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodpressure_core.dc.remote.BloodPressureApiV2Delegate", f = "IBloodPressureDelegate.kt", i = {0, 0}, l = {130}, m = "getUserAllData", n = {"bufferList", "url"}, s = {"L$1", "L$2"})
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
            return BloodPressureApiV2Delegate.this.getUserAllData(null, this);
        }
    }

    public BloodPressureApiV2Delegate(@NotNull IEventApi<BloodPressureRemoteV2Entity<BloodPressureVo>> iEventApi) {
        this.eventApi = iEventApi;
        final StringQualifier stringQualifierNamed = QualifierKt.named(UserExKt.getWEAK_NAME_USERINFO());
        final Function0 function0 = null;
        this.weakUserInfo = LazyKt__LazyJVMKt.lazy(KoinPlatformTools.INSTANCE.defaultLazyMode(), (Function0) new Function0<WeakUserInfo>() { // from class: com.huami.bloodpressure_core.dc.remote.BloodPressureApiV2Delegate$special$$inlined$inject$default$1
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
        String strA = a(m.replace$default(m.replace$default("users/{userId}/event/{eventType}", "{userId}", userId == null ? "" : userId, false, 4, (Object) null), "{eventType}", "blood_pressure", false, 4, (Object) null));
        IEventApi<BloodPressureRemoteV2Entity<BloodPressureVo>> iEventApi = this.eventApi;
        String userId2 = b().getUserId();
        return iEventApi.deleteData(strA, userId2 == null ? "" : userId2, "blood_pressure", BloodPressureConst.ParamValue.MANUALLY_ADD_DATA, j, continuation);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006a  */
    /* JADX WARN: Code duplicated, block: B:20:0x00a0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:25:0x00af  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00a1 -> B:22:0x00a8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.huami.bloodpressure_core.dc.remote.IBloodPressureDelegate
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getUserAllData(@org.jetbrains.annotations.Nullable java.lang.Long r25, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<? extends com.huami.bloodpressure_core.dc.remote.BloodPressureRemoteV2Entity<com.huami.bloodpressure_core.dc.local.BloodPressureVo>>> r26) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huami.bloodpressure_core.dc.remote.BloodPressureApiV2Delegate.getUserAllData(java.lang.Long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.huami.bloodpressure_core.dc.remote.IBloodPressureDelegate
    @Nullable
    public Object postDataList(@NotNull List<? extends BloodPressureRequestV2Entity> list, @NotNull Continuation<? super Boolean> continuation) {
        String userId = b().getUserId();
        if (userId == null) {
            userId = "";
        }
        return this.eventApi.uploadData(a("v2/users/me/events"), userId, SerializationKtxKt.getNonStrictInstance(Json.INSTANCE).encodeToString(BuiltinSerializersKt.ListSerializer(BloodPressureRequestV2Entity.INSTANCE.serializer()), list), continuation);
    }
}
