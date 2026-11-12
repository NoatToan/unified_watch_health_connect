package com.xiaomi.fitness.medal.medallist;

import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.account.api.AccountRequest;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.medal.medallist.MedalViewModel;
import com.xiaomi.fitness.medal.request.MedalRequest;
import com.xiaomi.fitness.medal.request.MedalV2Request;
import com.xiaomi.fitness.net.response.ApiException;
import defpackage.ecf;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B\t\b\u0007¢\u0006\u0004\b\"\u0010#J\u000f\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/medal/medallist/MedalViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/medal/medallist/MedalModel;", "Lecf;", "getMedalListWithoutNew", "()Lecf;", "Lcom/xiaomi/fitness/account/api/AccountRequest;", "mAccountRequest", "Lcom/xiaomi/fitness/account/api/AccountRequest;", "getMAccountRequest", "()Lcom/xiaomi/fitness/account/api/AccountRequest;", "setMAccountRequest", "(Lcom/xiaomi/fitness/account/api/AccountRequest;)V", "Lcom/xiaomi/fitness/medal/request/MedalRequest;", "mMedalRequest", "Lcom/xiaomi/fitness/medal/request/MedalRequest;", "getMMedalRequest", "()Lcom/xiaomi/fitness/medal/request/MedalRequest;", "setMMedalRequest", "(Lcom/xiaomi/fitness/medal/request/MedalRequest;)V", "Lcom/xiaomi/fitness/medal/request/MedalV2Request;", "medalV2Request", "Lcom/xiaomi/fitness/medal/request/MedalV2Request;", "getMedalV2Request", "()Lcom/xiaomi/fitness/medal/request/MedalV2Request;", "setMedalV2Request", "(Lcom/xiaomi/fitness/medal/request/MedalV2Request;)V", "Landroidx/lifecycle/MutableLiveData;", "getData", "Landroidx/lifecycle/MutableLiveData;", "getGetData", "()Landroidx/lifecycle/MutableLiveData;", "setGetData", "(Landroidx/lifecycle/MutableLiveData;)V", "<init>", "()V", "Companion", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class MedalViewModel extends BaseViewModel<MedalModel> {

    @NotNull
    public static final String TAG = "MedalViewModel";

    @NotNull
    private MutableLiveData<ecf> getData = new MutableLiveData<>();
    public AccountRequest mAccountRequest;
    public MedalRequest mMedalRequest;
    public MedalV2Request medalV2Request;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit getMedalListWithoutNew$lambda$0(Ref.ObjectRef data, MedalViewModel this$0, ecf it) {
        Intrinsics.checkNotNullParameter(data, "$data");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        data.element = it;
        this$0.getData.setValue(it);
        Logger.i(this$0.getTAG(), "getMedalListWithoutNew medalCategoryList=" + it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getMedalListWithoutNew$lambda$1(MedalViewModel this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.getTAG(), "getMedalListWithoutNew exception=" + it);
        return Unit.INSTANCE;
    }

    @NotNull
    public final MutableLiveData<ecf> getGetData() {
        return this.getData;
    }

    @NotNull
    public final AccountRequest getMAccountRequest() {
        AccountRequest accountRequest = this.mAccountRequest;
        if (accountRequest != null) {
            return accountRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAccountRequest");
        return null;
    }

    @NotNull
    public final MedalRequest getMMedalRequest() {
        MedalRequest medalRequest = this.mMedalRequest;
        if (medalRequest != null) {
            return medalRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mMedalRequest");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final ecf getMedalListWithoutNew() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        getMedalV2Request().getUserMedalWithoutNew(new Function1() { // from class: lif
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MedalViewModel.getMedalListWithoutNew$lambda$0(objectRef, this, (ecf) obj);
            }
        }, new Function1() { // from class: mif
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MedalViewModel.getMedalListWithoutNew$lambda$1(this.f26214a, (ApiException) obj);
            }
        });
        return (ecf) objectRef.element;
    }

    @NotNull
    public final MedalV2Request getMedalV2Request() {
        MedalV2Request medalV2Request = this.medalV2Request;
        if (medalV2Request != null) {
            return medalV2Request;
        }
        Intrinsics.throwUninitializedPropertyAccessException("medalV2Request");
        return null;
    }

    public final void setGetData(@NotNull MutableLiveData<ecf> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.getData = mutableLiveData;
    }

    public final void setMAccountRequest(@NotNull AccountRequest accountRequest) {
        Intrinsics.checkNotNullParameter(accountRequest, "<set-?>");
        this.mAccountRequest = accountRequest;
    }

    public final void setMMedalRequest(@NotNull MedalRequest medalRequest) {
        Intrinsics.checkNotNullParameter(medalRequest, "<set-?>");
        this.mMedalRequest = medalRequest;
    }

    public final void setMedalV2Request(@NotNull MedalV2Request medalV2Request) {
        Intrinsics.checkNotNullParameter(medalV2Request, "<set-?>");
        this.medalV2Request = medalV2Request;
    }
}
