package com.huami.contacts.viewmodel;

import android.app.Application;
import android.os.Looper;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModelKt;
import com.huami.contacts.bean.ContactDecorator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bR\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR%\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/huami/contacts/viewmodel/ContactSearchViewModel;", "Landroidx/lifecycle/AndroidViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/MutableLiveData;", "value", "", "a", "(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Object;)V", "", "str", "search", "", "select", "allowSelect", "Lcom/huami/contacts/viewmodel/ShareContactsDataPool;", "Lcom/huami/contacts/viewmodel/ShareContactsDataPool;", "dataSharePool", "", "Lcom/huami/contacts/bean/ContactDecorator;", "b", "Landroidx/lifecycle/MutableLiveData;", "getSearchResultLiveData", "()Landroidx/lifecycle/MutableLiveData;", "searchResultLiveData", "Landroid/app/Application;", "app", "<init>", "(Landroid/app/Application;)V", "contacts_release"}, k = 1, mv = {1, 4, 1})
public final class ContactSearchViewModel extends AndroidViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ShareContactsDataPool dataSharePool;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<ContactDecorator>> searchResultLiveData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.contacts.viewmodel.ContactSearchViewModel$search$1", f = "ContactSearchViewModel.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ContactSearchViewModel.this.new a(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ShareContactsDataPool shareContactsDataPool = ContactSearchViewModel.this.dataSharePool;
                String str = this.c;
                this.a = 1;
                obj = shareContactsDataPool.search(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ContactSearchViewModel contactSearchViewModel = ContactSearchViewModel.this;
            contactSearchViewModel.a(contactSearchViewModel.getSearchResultLiveData(), (List) obj);
            return Unit.INSTANCE;
        }
    }

    public ContactSearchViewModel(@NotNull Application application) {
        super(application);
        this.dataSharePool = ShareContactsDataPool.INSTANCE.getInstance();
        this.searchResultLiveData = new MutableLiveData<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> void a(MutableLiveData<T> mutableLiveData, T t) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mutableLiveData.setValue(t);
        } else {
            mutableLiveData.postValue(t);
        }
    }

    public final boolean allowSelect(boolean select) {
        return this.dataSharePool.allowSelect(select);
    }

    @NotNull
    public final MutableLiveData<List<ContactDecorator>> getSearchResultLiveData() {
        return this.searchResultLiveData;
    }

    public final void search(@NotNull String str) {
        if (str.length() == 0) {
            return;
        }
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(str, null), 2, null);
    }
}
