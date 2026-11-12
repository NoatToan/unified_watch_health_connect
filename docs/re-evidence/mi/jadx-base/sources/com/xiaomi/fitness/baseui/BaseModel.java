package com.xiaomi.fitness.baseui;

import com.xiaomi.fitness.common.repository.Repository;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JY\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\r0\u000f2\u0006\u0010\u0010\u001a\u00020\u00112-\u0010\u0012\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u0002H\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0013¢\u0006\u0002\b\u0017H\u0096@¢\u0006\u0002\u0010\u0018R$\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/baseui/BaseModel;", "Lcom/xiaomi/fitness/baseui/Model;", "<init>", "()V", "repository", "Lcom/xiaomi/fitness/common/repository/Repository;", "getRepository$annotations", "getRepository", "()Lcom/xiaomi/fitness/common/repository/Repository;", "setRepository", "(Lcom/xiaomi/fitness/common/repository/Repository;)V", "request", "", "T", DeviceTagInterface.CUSTOM_TAG_TYPE, "Ljava/lang/Class;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "block", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Class;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class BaseModel implements Model {
    public Repository repository;

    /* JADX INFO: renamed from: com.xiaomi.fitness.baseui.BaseModel$request$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.baseui.BaseModel$request$2", f = "BaseModel.kt", i = {}, l = {25}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function3<CoroutineScope, T, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ Class<T> $t;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BaseModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function3<? super CoroutineScope, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, BaseModel baseModel, Class<T> cls, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$block = function3;
            this.this$0 = baseModel;
            this.$t = cls;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, this.$t, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.xiaomi.fitness.baseui.BaseModel$request$2 for r5v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.ResultKt.throwOnFailure(r6)
                goto L35
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                kotlin.ResultKt.throwOnFailure(r6)
                java.lang.Object r6 = r5.L$0
                kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
                kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r5.$block
                com.xiaomi.fitness.baseui.BaseModel r3 = r5.this$0
                com.xiaomi.fitness.common.repository.Repository r3 = r3.getRepository()
                java.lang.Class<T> r4 = r5.$t
                java.lang.Object r3 = r3.getService(r4)
                r5.label = r2
                java.lang.Object r6 = r1.invoke(r6, r3, r5)
                if (r6 != r0) goto L35
                return r0
            L35:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.baseui.BaseModel.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static /* synthetic */ void getRepository$annotations() {
    }

    public static /* synthetic */ <T> Object request$suspendImpl(BaseModel baseModel, Class<T> cls, CoroutineDispatcher coroutineDispatcher, Function3<? super CoroutineScope, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(coroutineDispatcher, new AnonymousClass2(function3, baseModel, cls, null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    @NotNull
    public final Repository getRepository() {
        Repository repository = this.repository;
        if (repository != null) {
            return repository;
        }
        Intrinsics.throwUninitializedPropertyAccessException("repository");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.Model
    @Nullable
    public <T> Object request(@NotNull Class<T> cls, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Function3<? super CoroutineScope, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, @NotNull Continuation<? super Unit> continuation) {
        return request$suspendImpl(this, cls, coroutineDispatcher, function3, continuation);
    }

    public final void setRepository(@NotNull Repository repository) {
        Intrinsics.checkNotNullParameter(repository, "<set-?>");
        this.repository = repository;
    }
}
