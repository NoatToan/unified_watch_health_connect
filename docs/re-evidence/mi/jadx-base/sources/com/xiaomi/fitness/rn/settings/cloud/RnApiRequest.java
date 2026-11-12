package com.xiaomi.fitness.rn.settings.cloud;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.extensions.HttpPoint;
import com.xiaomi.fitness.rn.settings.cloud.RnApiRequest;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010\n¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/rn/settings/cloud/RnApiRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/rn/settings/cloud/RnApiService;", "<init>", "()V", "accessPlugin", "", "did", "", "model", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRnApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RnApi.kt\ncom/xiaomi/fitness/rn/settings/cloud/RnApiRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n+ 3 HttpExtension.kt\ncom/xiaomi/fitness/net/extensions/HttpExtensionKt\n*L\n1#1,34:1\n141#2:35\n31#3:36\n28#3,2:37\n*S KotlinDebug\n*F\n+ 1 RnApi.kt\ncom/xiaomi/fitness/rn/settings/cloud/RnApiRequest\n*L\n32#1:35\n32#1:36\n32#1:37,2\n*E\n"})
public final class RnApiRequest extends BaseRequest<RnApiService> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<RnApiRequest> instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: buk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RnApiRequest.instance_delegate$lambda$0();
        }
    });

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/rn/settings/cloud/RnApiRequest$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fitness/rn/settings/cloud/RnApiRequest;", "getInstance", "()Lcom/xiaomi/fitness/rn/settings/cloud/RnApiRequest;", "instance$delegate", "Lkotlin/Lazy;", "settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RnApiRequest getInstance() {
            return (RnApiRequest) RnApiRequest.instance$delegate.getValue();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.rn.settings.cloud.RnApiRequest$accessPlugin$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.rn.settings.cloud.RnApiRequest", f = "RnApi.kt", i = {}, l = {32}, m = "accessPlugin", n = {}, s = {})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RnApiRequest.this.accessPlugin(null, null, this);
        }
    }

    private RnApiRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RnApiRequest instance_delegate$lambda$0() {
        return new RnApiRequest();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object accessPlugin(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Boolean> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objAccessPlugin = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAccessPlugin);
            String json = getMGson().toJson(MapsKt__MapsKt.mapOf(TuplesKt.to("did", str), TuplesKt.to("model", str2)));
            RnApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            anonymousClass1.label = 1;
            objAccessPlugin = mService.accessPlugin(json, anonymousClass1);
            if (objAccessPlugin == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAccessPlugin);
        }
        return Boxing.boxBoolean(((RnBooleanResult) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objAccessPlugin)).getValue());
    }
}
