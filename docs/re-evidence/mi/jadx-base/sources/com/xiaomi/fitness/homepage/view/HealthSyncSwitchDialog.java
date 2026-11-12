package com.xiaomi.fitness.homepage.view;

import android.view.View;
import android.widget.TextView;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.dialog.a;
import com.xiaomi.fitness.homepage.view.HealthSyncSwitchDialog;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/homepage/view/HealthSyncSwitchDialog;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "<init>", "()V", "mTxtDesc", "Landroid/widget/TextView;", "initCustomView", "", "rootView", "Landroid/view/View;", "Builder", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HealthSyncSwitchDialog extends CommonDialog<DialogParams> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private TextView mTxtDesc;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0004\u001a\u00020\u0000H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/homepage/view/HealthSyncSwitchDialog$Builder;", "Lcom/xiaomi/fitness/baseui/dialog/a;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "Lcom/xiaomi/fitness/homepage/view/HealthSyncSwitchDialog;", "getThis", "()Lcom/xiaomi/fitness/homepage/view/HealthSyncSwitchDialog$Builder;", "internalCreate", "()Lcom/xiaomi/fitness/homepage/view/HealthSyncSwitchDialog;", "", "name", "<init>", "(Ljava/lang/String;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class Builder extends a<Builder, DialogParams, HealthSyncSwitchDialog> {
        public Builder(@Nullable String str) {
            super(new DialogParams(str));
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        @NotNull
        public Builder getThis() {
            return this;
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        @NotNull
        public HealthSyncSwitchDialog internalCreate() {
            return new HealthSyncSwitchDialog();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/homepage/view/HealthSyncSwitchDialog$Companion;", "", "<init>", "()V", "defaultBuilder", "Lcom/xiaomi/fitness/homepage/view/HealthSyncSwitchDialog$Builder;", "name", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Builder defaultBuilder(@Nullable String name) {
            Builder positiveText = new Builder(name).setCustomLayoutId(jui.p3).setNegativeText(c0j.c).setPositiveText(c0j.Va);
            Intrinsics.checkNotNullExpressionValue(positiveText, "setPositiveText(...)");
            return positiveText;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initCustomView$lambda$2(final HealthSyncSwitchDialog this$0, final AccountCoreInfo accountCoreInfo) {
        TextView textView;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (accountCoreInfo != null && (textView = this$0.mTxtDesc) != null) {
            textView.post(new Runnable() { // from class: c2c
                @Override // java.lang.Runnable
                public final void run() {
                    HealthSyncSwitchDialog.initCustomView$lambda$2$lambda$1$lambda$0(this.f4857a, accountCoreInfo);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initCustomView$lambda$2$lambda$1$lambda$0(HealthSyncSwitchDialog this$0, AccountCoreInfo it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        TextView textView = this$0.mTxtDesc;
        if (textView != null) {
            textView.setText(this$0.getString(c0j.Pl, it.getUserId()));
        }
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void initCustomView(@Nullable View rootView) {
        super.initCustomView(rootView);
        this.mTxtDesc = rootView != null ? (TextView) rootView.findViewById(eri.Rh) : null;
        UserInfoManager.getAccountCoreInfo$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, new Function1() { // from class: d2c
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HealthSyncSwitchDialog.initCustomView$lambda$2(this.f14991a, (AccountCoreInfo) obj);
            }
        }, 1, null);
    }
}
