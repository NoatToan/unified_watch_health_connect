package com.huami.account.userinfo.ui;

import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleOwnerKt;
import androidx.view.ComponentActivity;
import com.huami.account.service.proxy.KoinProxyKt;
import com.huami.account.ui.common.LoadingDialogContainer;
import com.huami.account.ui.common.LoadingDialogContainerKt;
import com.huami.account.userinfo.R;
import com.huami.account.userinfo.UserinfoExternalsKt;
import com.huami.account.userinfo.repository.PersonInfoRepository;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ8\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¨\u0006\u000f"}, d2 = {"Lcom/huami/account/userinfo/ui/PersonInfoSettingHelper;", "", "Landroidx/activity/ComponentActivity;", "activity", "Lcom/huami/account/ui/common/LoadingDialogContainer;", "dialogContainer", "", "", "filed", "Lkotlin/Function0;", "", "onSuccess", "updatePersonInfoParam", "<init>", "()V", "userinfo_release"}, k = 1, mv = {1, 5, 1})
public final class PersonInfoSettingHelper {

    @NotNull
    public static final PersonInfoSettingHelper INSTANCE = new PersonInfoSettingHelper();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.account.userinfo.ui.PersonInfoSettingHelper$updatePersonInfoParam$1", f = "PersonInfoSettingHelper.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Map<String, String> b;
        public final /* synthetic */ ComponentActivity c;
        public final /* synthetic */ LoadingDialogContainer d;
        public final /* synthetic */ String e;
        public final /* synthetic */ Function0<Unit> f;
        public final /* synthetic */ String g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map<String, String> map, ComponentActivity componentActivity, LoadingDialogContainer loadingDialogContainer, String str, Function0<Unit> function0, String str2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = map;
            this.c = componentActivity;
            this.d = loadingDialogContainer;
            this.e = str;
            this.f = function0;
            this.g = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, this.c, this.d, this.e, this.f, this.g, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PersonInfoRepository personInfoRepository = (PersonInfoRepository) KoinProxyKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(PersonInfoRepository.class), null, null);
                Map<String, String> map = this.b;
                this.a = 1;
                obj = personInfoRepository.updatePartOfPersonInfo(map, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            if (!this.c.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                return Unit.INSTANCE;
            }
            if (zBooleanValue) {
                this.d.setSuccess(this.e, null);
                this.f.getA();
            } else {
                this.d.setFailed(this.g, null);
            }
            return Unit.INSTANCE;
        }
    }

    private PersonInfoSettingHelper() {
    }

    public final void updatePersonInfoParam(@NotNull ComponentActivity activity, @NotNull LoadingDialogContainer dialogContainer, @NotNull Map<String, String> filed, @NotNull Function0<Unit> onSuccess) {
        LoadingDialogContainerKt.showLoadingDialog(dialogContainer, R.string.user_info_loading);
        e.f(LifecycleOwnerKt.getLifecycleScope(activity), null, null, new a(filed, activity, dialogContainer, UserinfoExternalsKt.getAppContext().getString(R.string.user_info_loading_success), onSuccess, UserinfoExternalsKt.getAppContext().getString(R.string.user_info_loading_fail), null), 3, null);
    }
}
