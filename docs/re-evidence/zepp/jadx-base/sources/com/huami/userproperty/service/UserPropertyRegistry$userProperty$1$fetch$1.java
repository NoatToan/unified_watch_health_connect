package com.huami.userproperty.service;

import androidx.exifinterface.media.ExifInterface;
import com.huami.userproperty.service.entity.remote.FetchResult;
import com.huami.userproperty.service.interceptor.FetchInterceptor;
import com.huami.userproperty.service.interceptor.Interceptor;
import com.huami.userproperty.service.repo.UserPropertyRepo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/userproperty/service/entity/remote/FetchResult;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.huami.userproperty.service.UserPropertyRegistry$userProperty$1$fetch$1", f = "UserPropertyRegistry.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
public final class UserPropertyRegistry$userProperty$1$fetch$1<T> extends SuspendLambda implements Function1<Continuation<? super FetchResult<T>>, Object> {
    public int a;
    public final /* synthetic */ UserPropertyRegistry b;
    public final /* synthetic */ UserPropertyRegistry.AnonymousClass1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserPropertyRegistry$userProperty$1$fetch$1(UserPropertyRegistry userPropertyRegistry, UserPropertyRegistry.AnonymousClass1 anonymousClass1, Continuation<? super UserPropertyRegistry$userProperty$1$fetch$1> continuation) {
        super(1, continuation);
        this.b = userPropertyRegistry;
        this.c = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new UserPropertyRegistry$userProperty$1$fetch$1(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Object invoke(@Nullable Continuation<? super FetchResult<T>> continuation) {
        return ((UserPropertyRegistry$userProperty$1$fetch$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UserPropertyRepo propertyRepo = this.b.getPropertyRepo();
            UserPropertyRegistry.AnonymousClass1 anonymousClass1 = this.c;
            List<Interceptor<?, ?>> registryInterceptors = this.b.getRegistryInterceptors();
            ArrayList arrayList = new ArrayList();
            for (T t : registryInterceptors) {
                if (t instanceof FetchInterceptor) {
                    arrayList.add(t);
                }
            }
            Function0<String> registryUrlProvider = this.b.getRegistryUrlProvider();
            this.a = 1;
            obj = propertyRepo.fetch(anonymousClass1, arrayList, registryUrlProvider, this);
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
