package com.huami.feedback.datasource;

import com.huami.feedback.entity.UserForm;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/huami/feedback/datasource/UserFormDataSource;", "", "Lcom/huami/feedback/entity/UserForm;", "getFormData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data", "", "setFormData", "(Lcom/huami/feedback/entity/UserForm;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public interface UserFormDataSource {
    @Nullable
    Object getFormData(@NotNull Continuation<? super UserForm> continuation);

    @Nullable
    Object setFormData(@Nullable UserForm userForm, @NotNull Continuation<? super Unit> continuation);
}
