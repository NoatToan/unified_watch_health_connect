package com.xiaomi.hm.health.healthdata.core.repo;

import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bodyfat.manager.WeightChangeListener;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J#\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\t\u001a\u00020\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\bJ#\u0010\n\u001a\u00020\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\b¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/core/repo/WeightMangerDbObserver;", "Lcom/xiaomi/hm/health/bodyfat/manager/WeightChangeListener;", "", "a", "", "Lcom/xiaomi/hm/health/databases/model/WeightInfos;", "info", "onInsert", "([Lcom/xiaomi/hm/health/databases/model/WeightInfos;)V", "onDelete", "onUpdate", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class WeightMangerDbObserver implements WeightChangeListener {

    @NotNull
    public static final WeightMangerDbObserver INSTANCE = new WeightMangerDbObserver();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.healthdata.core.repo.WeightMangerDbObserver$notifyChanges$1", f = "WeightMangerDbObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.healthdata.core.repo.WeightMangerDbObserver$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0958a extends Lambda implements Function0<String> {
            public final /* synthetic */ Throwable a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0958a(Throwable th) {
                super(0);
                this.a = th;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return String.valueOf(this.a);
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                HealthCoreDataRepo.INSTANCE.getUpdateOldDataTrigger().postValue(Boxing.boxBoolean(true));
            } catch (Throwable th) {
                HMLog.error$default("GreenDaoObserver", null, th, new C0958a(th), 2, null);
            }
            return Unit.INSTANCE;
        }
    }

    private WeightMangerDbObserver() {
    }

    private final void a() {
        e.f(GlobalScope.INSTANCE, Dispatchers.getIO().plus(ExtKt.getExceptionHandler()), null, new a(null), 2, null);
    }

    @Override // com.xiaomi.hm.health.bodyfat.manager.WeightChangeListener
    public void onDelete(@NotNull WeightInfos... info) {
        a();
    }

    @Override // com.xiaomi.hm.health.bodyfat.manager.WeightChangeListener
    public void onInsert(@NotNull WeightInfos... info) {
        a();
    }

    @Override // com.xiaomi.hm.health.bodyfat.manager.WeightChangeListener
    public void onUpdate(@NotNull WeightInfos... info) {
        a();
    }
}
