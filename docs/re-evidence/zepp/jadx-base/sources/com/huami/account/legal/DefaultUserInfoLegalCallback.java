package com.huami.account.legal;

import com.huami.account.UserInfoLegalCallBack;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016R\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/huami/account/legal/DefaultUserInfoLegalCallback;", "Lcom/huami/account/UserInfoLegalCallBack;", "", "onSuccess", "onFailed", "onAudit", "onError", "Lkotlin/Function0;", "a", "Lkotlin/jvm/functions/Function0;", "getOnCompleted", "()Lkotlin/jvm/functions/Function0;", "onCompleted", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public class DefaultUserInfoLegalCallback implements UserInfoLegalCallBack {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function0<Unit> onCompleted;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultUserInfoLegalCallback() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public DefaultUserInfoLegalCallback(@NotNull Function0<Unit> function0) {
        this.onCompleted = function0;
    }

    @NotNull
    public final Function0<Unit> getOnCompleted() {
        return this.onCompleted;
    }

    @Override // com.huami.account.UserInfoLegalCallBack
    public void onAudit() {
        this.onCompleted.invoke();
    }

    @Override // com.huami.account.UserInfoLegalCallBack
    public void onError() {
        this.onCompleted.invoke();
    }

    @Override // com.huami.account.UserInfoLegalCallBack
    public void onFailed() {
        this.onCompleted.invoke();
    }

    @Override // com.huami.account.UserInfoLegalCallBack
    public void onSuccess() {
        this.onCompleted.invoke();
    }

    public /* synthetic */ DefaultUserInfoLegalCallback(Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? a.a : function0);
    }
}
