package com.huami.account.userinfo.ui;

import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.huami.account.WebHelper;
import com.huami.account.api.HMAccountWebAPI;
import com.huami.account.api.UserSettingsApi;
import com.huami.account.api.entity.ProfileDefaultFields;
import com.huami.account.userinfo.utils.Utils;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.WebResponse;
import com.huami.web.service.WebItem;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0006\u001a\u00020\u00052\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002J0\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072 \u0010\n\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00050\tJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0007¨\u0006\u0010"}, d2 = {"Lcom/huami/account/userinfo/ui/NewUserGuideViewModel;", "Landroidx/lifecycle/ViewModel;", "", "", HMAccountWebAPI.PARAM_DEFAULT_FIELDS, "", "a", "", "isAdult", "Lkotlin/Function1;", "callback", "getDefaultFields", "isSkip", "startMinorAuthorize", "<init>", "()V", "userinfo_release"}, k = 1, mv = {1, 5, 1})
public final class NewUserGuideViewModel extends ViewModel {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.account.userinfo.ui.NewUserGuideViewModel$getDefaultFields$1", f = "NewUserGuideViewModel.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ Function1<Map<String, String>, Unit> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(boolean z, Function1<? super Map<String, String>, Unit> function1, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = z;
            this.c = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, this.c, continuation);
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
                UserSettingsApi userSettingsApi = UserSettingsApi.INSTANCE;
                boolean z = this.b;
                this.a = 1;
                obj = userSettingsApi.getDefaultProfileFields(z, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ProfileDefaultFields profileDefaultFields = (ProfileDefaultFields) obj;
            if (profileDefaultFields == null) {
                this.c.invoke(null);
                return Unit.INSTANCE;
            }
            this.c.invoke(r.mapOf(TuplesKt.to("birthday", Utils.INSTANCE.calculateBirthdayByAge(profileDefaultFields.getAge())), TuplesKt.to("gender", String.valueOf(profileDefaultFields.getGender())), TuplesKt.to("height", String.valueOf(profileDefaultFields.getHeight())), TuplesKt.to("weight", String.valueOf(profileDefaultFields.getWeight()))));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n"}, d2 = {"", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Map<String, ? extends String>, Unit> {
        public b() {
            super(1);
        }

        public final void a(@Nullable Map<String, String> map) {
            NewUserGuideViewModel.this.a(map);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends String> map) {
            a(map);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Map<String, String> defaultFields) {
        HMAccountWebAPI.updateProfile(HMPersonInfo.getInstance(), defaultFields, false, new IHMSimpleHttpResponseHandler() { // from class: com.huami.account.userinfo.ui.NewUserGuideViewModel$updateProfileAndAuthorize$1
            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onFailure(@Nullable HMHttpResponseData item) {
            }

            @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
            public void onSuccess(@Nullable WebResponse response, @Nullable HMHttpResponseData item) {
                boolean z = false;
                if (item != null && item.isSuccess()) {
                    if (response != null && response.success()) {
                        z = true;
                    }
                    if (z) {
                        WebItem webItem = new WebItem(HMServerDef.getUrl(HMAccountWebAPI.URL_MINOR_AUTHORIZATION));
                        webItem.hasFinishEvent = true;
                        WebHelper.launch(webItem);
                    }
                }
            }
        });
    }

    public final void getDefaultFields(boolean isAdult, @NotNull Function1<? super Map<String, String>, Unit> callback) {
        e.f(ViewModelKt.getViewModelScope(this), null, null, new a(isAdult, callback, null), 3, null);
    }

    public final void startMinorAuthorize(boolean isSkip) {
        if (isSkip) {
            getDefaultFields(false, new b());
        } else {
            a(new HashMap());
        }
    }
}
