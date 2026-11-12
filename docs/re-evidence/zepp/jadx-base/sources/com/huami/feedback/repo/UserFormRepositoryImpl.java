package com.huami.feedback.repo;

import com.huami.feedback.datasource.UserFormDataSource;
import com.huami.feedback.entity.UserForm;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/huami/feedback/repo/UserFormRepositoryImpl;", "Lcom/huami/feedback/repo/UserFormRepository;", "Lcom/huami/feedback/entity/UserForm;", "getFormData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data", "", "setFormData", "(Lcom/huami/feedback/entity/UserForm;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/feedback/datasource/UserFormDataSource;", "a", "Lcom/huami/feedback/datasource/UserFormDataSource;", "userFormDataSource", "<init>", "(Lcom/huami/feedback/datasource/UserFormDataSource;)V", "Companion", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public final class UserFormRepositoryImpl implements UserFormRepository {
    private static final int b = 7;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final UserFormDataSource userFormDataSource;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.repo.UserFormRepositoryImpl", f = "UserFormRepositoryImpl.kt", i = {0}, l = {19, 26}, m = "getFormData", n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return UserFormRepositoryImpl.this.getFormData(this);
        }
    }

    public UserFormRepositoryImpl(@NotNull UserFormDataSource userFormDataSource) {
        this.userFormDataSource = userFormDataSource;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.feedback.repo.UserFormRepository
    @Nullable
    public Object getFormData(@NotNull Continuation<? super UserForm> continuation) {
        a aVar;
        UserFormRepositoryImpl userFormRepositoryImpl;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.d = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object formData = aVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                userFormRepositoryImpl = (UserFormRepositoryImpl) aVar.a;
                ResultKt.throwOnFailure(formData);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(formData);
            }
            return null;
        }
        ResultKt.throwOnFailure(formData);
        UserFormDataSource userFormDataSource = this.userFormDataSource;
        aVar.a = this;
        aVar.d = 1;
        formData = userFormDataSource.getFormData(aVar);
        if (formData == coroutine_suspended) {
            return coroutine_suspended;
        }
        userFormRepositoryImpl = this;
        UserForm userForm = (UserForm) formData;
        if (userForm == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(userForm.getTimeStamp());
        calendar.add(5, 7);
        if (calendar.compareTo(Calendar.getInstance()) >= 0) {
            return userForm;
        }
        UserFormDataSource userFormDataSource2 = userFormRepositoryImpl.userFormDataSource;
        aVar.a = null;
        aVar.d = 2;
        if (userFormDataSource2.setFormData(null, aVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return null;
    }

    @Override // com.huami.feedback.repo.UserFormRepository
    @Nullable
    public Object setFormData(@Nullable UserForm userForm, @NotNull Continuation<? super Unit> continuation) {
        Object formData = this.userFormDataSource.setFormData(userForm == null ? null : userForm.copy((127 & 1) != 0 ? userForm.deviceType : null, (127 & 2) != 0 ? userForm.issueTitle : null, (127 & 4) != 0 ? userForm.issueID : 0, (127 & 8) != 0 ? userForm.issueItem : null, (127 & 16) != 0 ? userForm.description : null, (127 & 32) != 0 ? userForm.contact : null, (127 & 64) != 0 ? userForm.images : null, (127 & 128) != 0 ? userForm.timeStamp : Calendar.getInstance().getTimeInMillis()), continuation);
        return formData == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? formData : Unit.INSTANCE;
    }
}
