package com.huami.account.ui.common;

import android.app.Activity;
import android.content.Intent;
import com.huami.account.AccountExternalsKt;
import com.huami.account.legal.ServerLegalTask;
import com.huami.account.ui.areas.SelectAreaHelper;
import com.huami.account.ui.common.VariantDiffManager;
import com.huami.account.ui.register.RegisterActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\f"}, d2 = {"Lcom/huami/account/ui/common/VariantDiffManager;", "", "Landroid/app/Activity;", "activity", "", "requestCode", "Lcom/huami/account/ui/common/LoadingDialogContainer;", "dialog", "", "navigateToRegister", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class VariantDiffManager {

    @NotNull
    public static final VariantDiffManager INSTANCE = new VariantDiffManager();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Activity activity, int i) {
            super(0);
            this.a = activity;
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.startActivityForResult(new Intent(this.a, (Class<?>) RegisterActivity.class), this.b);
        }
    }

    private VariantDiffManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Function0 function0) {
        function0.invoke();
    }

    public final void navigateToRegister(@NotNull Activity activity, int requestCode, @NotNull LoadingDialogContainer dialog) {
        final a aVar = new a(activity, requestCode);
        if (AccountExternalsKt.getAccountDelegate().isChineseOnly()) {
            ServerLegalTask.executeServerLegalTask(activity, dialog, SelectAreaHelper.getAreaByCountryCode("CN"), new ServerLegalTask.SuccessCallback() { // from class: x88
                @Override // com.huami.account.legal.ServerLegalTask.SuccessCallback
                public final void onSuccess() {
                    VariantDiffManager.b(aVar);
                }
            });
        } else {
            aVar.invoke();
        }
    }
}
