package com.huami.sky.lib.properties;

import com.huami.userproperty.service.entity.remote.PushResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0006\u001a\u00020\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/huami/sky/lib/properties/SkyIntroManager;", "", "", "setIntroProcessCompleted", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isFirstEnter", "<init>", "()V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final class SkyIntroManager {

    @NotNull
    public static final SkyIntroManager INSTANCE = new SkyIntroManager();

    private SkyIntroManager() {
    }

    public final boolean isFirstEnter() {
        Boolean bool = SkyQuestionProperties.INSTANCE.isQuestionCompleted().get();
        if (bool == null) {
            return true;
        }
        return true ^ bool.booleanValue();
    }

    @Nullable
    public final Object setIntroProcessCompleted(@NotNull Continuation<? super Unit> continuation) {
        SkyQuestionProperties skyQuestionProperties = SkyQuestionProperties.INSTANCE;
        skyQuestionProperties.isQuestionCompleted().set(Boxing.boxBoolean(true));
        Object obj = skyQuestionProperties.isQuestionCompleted().push().get((Continuation<? super PushResult>) continuation);
        return obj == a.getCOROUTINE_SUSPENDED() ? obj : Unit.INSTANCE;
    }
}
