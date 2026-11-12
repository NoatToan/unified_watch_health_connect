package com.huami.watch.musicupload.viewmodel;

import android.app.Application;
import android.content.SharedPreferences;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.huami.watch.musicupload.fragment.MusicConstant;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/huami/watch/musicupload/viewmodel/MusicFileBrowserViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "", "setNotShowConnectApWarning", "", "needShowConnectApWarning", "Landroid/app/Application;", "app", "<init>", "(Landroid/app/Application;)V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public final class MusicFileBrowserViewModel extends AndroidViewModel {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.musicupload.viewmodel.MusicFileBrowserViewModel$setNotShowConnectApWarning$1", f = "MusicFileBrowserViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MusicFileBrowserViewModel.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Application application = MusicFileBrowserViewModel.this.getApplication();
            MusicConstant musicConstant = MusicConstant.INSTANCE;
            Boolean boolBoxBoolean = Boxing.boxBoolean(false);
            SharedPreferences.Editor editorEdit = application.getSharedPreferences(MusicConstant.SHARED_PREFERS, 0).edit();
            if (boolBoxBoolean instanceof String) {
                editorEdit.putString(MusicConstant.KEY_WARNING_CONNECT_AP, (String) boolBoxBoolean);
            } else if (boolBoxBoolean instanceof Boolean) {
                editorEdit.putBoolean(MusicConstant.KEY_WARNING_CONNECT_AP, boolBoxBoolean.booleanValue());
            } else if (boolBoxBoolean instanceof Integer) {
                editorEdit.putInt(MusicConstant.KEY_WARNING_CONNECT_AP, ((Number) boolBoxBoolean).intValue());
            } else if (boolBoxBoolean instanceof Long) {
                editorEdit.putLong(MusicConstant.KEY_WARNING_CONNECT_AP, ((Number) boolBoxBoolean).longValue());
            } else if (boolBoxBoolean instanceof Float) {
                editorEdit.putFloat(MusicConstant.KEY_WARNING_CONNECT_AP, ((Number) boolBoxBoolean).floatValue());
            }
            editorEdit.apply();
            return Unit.INSTANCE;
        }
    }

    public MusicFileBrowserViewModel(@NotNull Application application) {
        super(application);
    }

    public final boolean needShowConnectApWarning() {
        Boolean boolValueOf;
        Application application = getApplication();
        MusicConstant musicConstant = MusicConstant.INSTANCE;
        Object obj = Boolean.TRUE;
        SharedPreferences sharedPreferences = application.getSharedPreferences(MusicConstant.SHARED_PREFERS, 0);
        if (obj instanceof String) {
            Object string = sharedPreferences.getString(MusicConstant.KEY_WARNING_CONNECT_AP, (String) obj);
            Objects.requireNonNull(string, "null cannot be cast to non-null type kotlin.Boolean");
            boolValueOf = (Boolean) string;
        } else if (obj instanceof Integer) {
            boolValueOf = (Boolean) Integer.valueOf(sharedPreferences.getInt(MusicConstant.KEY_WARNING_CONNECT_AP, ((Number) obj).intValue()));
        } else if (obj instanceof Long) {
            boolValueOf = (Boolean) Long.valueOf(sharedPreferences.getLong(MusicConstant.KEY_WARNING_CONNECT_AP, ((Number) obj).longValue()));
        } else {
            boolValueOf = obj instanceof Float ? (Boolean) Float.valueOf(sharedPreferences.getFloat(MusicConstant.KEY_WARNING_CONNECT_AP, ((Number) obj).floatValue())) : Boolean.valueOf(sharedPreferences.getBoolean(MusicConstant.KEY_WARNING_CONNECT_AP, true));
        }
        return boolValueOf.booleanValue();
    }

    public final void setNotShowConnectApWarning() {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(null), 2, null);
    }
}
