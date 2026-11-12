package com.huami.account.legal.impl;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.appcompat.app.AppCompatActivity;
import com.huami.account.legal.impl.AnonymousServiceImpl;
import com.huami.account.service.AnonymousInfoManager;
import com.huami.account.service.AnonymousService;
import com.huami.account.service.AuthNavigation;
import com.huami.account.service.model.LoginViewOptions;
import com.huami.account.service.proxy.KoinProxyKt;
import com.huami.account.ui.R;
import com.huami.account.utils.TopActivityProvider;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"Lcom/huami/account/legal/impl/AnonymousServiceImpl;", "Lcom/huami/account/service/AnonymousService;", "", "showLoginIfNeeded", "isAnonymousUser", "", "showLoginTip", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class AnonymousServiceImpl implements AnonymousService {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Activity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Activity activity) {
            super(0);
            this.a = activity;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            Activity activity = this.a;
            return "匿名登录提示失败：activity.isDestroyed -> " + (activity == null ? null : Boolean.valueOf(activity.isDestroyed()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "匿名登录提示失败：所在页面非 AppCompatActivity";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(DialogInterface dialogInterface, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Activity activity, DialogInterface dialogInterface, int i) {
        AuthNavigation.DefaultImpls.navigateToLogin$default((AuthNavigation) KoinProxyKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(AuthNavigation.class), null, null), activity, new LoginViewOptions(null, null, false, true, null, 23, null), null, 4, null);
    }

    @Override // com.huami.account.service.AnonymousService
    public boolean isAnonymousUser() {
        return AnonymousInfoManager.getAnonymousInfo() != null;
    }

    @Override // com.huami.account.service.AnonymousService
    public boolean showLoginIfNeeded() {
        if (!isAnonymousUser()) {
            return false;
        }
        showLoginTip();
        return true;
    }

    @Override // com.huami.account.service.AnonymousService
    public void showLoginTip() {
        final Activity activeActivity = TopActivityProvider.INSTANCE.getActiveActivity();
        if (activeActivity == null || activeActivity.isDestroyed()) {
            HMLog.info$default(null, new a(activeActivity), 1, null);
        } else if (activeActivity instanceof AppCompatActivity) {
            new AlertDialogFragment.Builder(activeActivity).setTitle(R.string.account_ui_anonymous_login_or_reg_title_2022).setMessage(R.string.account_ui_anonymous_login_or_reg_content_2022).themed().setNegativeButton(R.string.account_ui_anonymous_login_or_reg_cancel_2022, new DialogInterface.OnClickListener() { // from class: kg
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    AnonymousServiceImpl.c(dialogInterface, i);
                }
            }).setPositiveButton(R.string.account_ui_anonymous_login_or_reg_2022, new DialogInterface.OnClickListener() { // from class: jg
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    AnonymousServiceImpl.d(activeActivity, dialogInterface, i);
                }
            }).show(((AppCompatActivity) activeActivity).getSupportFragmentManager()).setGravity(17);
        } else {
            HMLog.info$default(null, b.a, 1, null);
        }
    }
}
