package com.huami.account.ui.common;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import com.huami.account.AccountExternalsKt;
import com.huami.account.ui.common.DebugUi;
import com.huami.account.ui.login.MovingLogFileTask;
import com.tbruyelle.rxpermissions2.RxPermissions;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J&\u0010\u000e\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¨\u0006\u0014"}, d2 = {"Lcom/huami/account/ui/common/DebugUi;", "", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "", "message", "Lkotlin/Function0;", "", "confirm", "debugEntrance", "Landroid/widget/LinearLayout;", "container", "entranceText", "onClick", "insertDebugEntrance", "Lcom/huami/account/ui/common/LoadingDialogContainer;", "dialogContainer", "shareLoginFailedLog", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class DebugUi {

    @NotNull
    public static final DebugUi INSTANCE = new DebugUi();

    private DebugUi() {
    }

    @JvmStatic
    public static final void debugEntrance(@NotNull AppCompatActivity activity, @NotNull String message, @NotNull final Function0<Unit> confirm) {
        if (AccountExternalsKt.getConfigDelegate().debug()) {
            new AlertDialog.Builder(activity).setMessage(message).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: x41
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    DebugUi.e(confirm, dialogInterface, i);
                }
            }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: y41
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    DebugUi.f(dialogInterface, i);
                }
            }).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Function0 function0, DialogInterface dialogInterface, int i) {
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(DialogInterface dialogInterface, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Function0 function0, View view) {
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(AppCompatActivity appCompatActivity, LoadingDialogContainer loadingDialogContainer, Boolean bool) {
        if (bool.booleanValue()) {
            new MovingLogFileTask(appCompatActivity, loadingDialogContainer).execute(new Void[0]);
        }
    }

    public final void insertDebugEntrance(@Nullable LinearLayout container, @NotNull String entranceText, @NotNull final Function0<Unit> onClick) {
        if (!AccountExternalsKt.getConfigDelegate().debug() || container == null) {
            return;
        }
        Context context = container.getContext();
        TextView textView = new TextView(context);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.huami.account.ui.R.dimen.account_ui_size_16dp);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        textView.setTextColor(ContextCompat.getColor(context, com.huami.account.ui.R.color.s1));
        textView.setGravity(17);
        textView.setText(entranceText);
        textView.setOnClickListener(new View.OnClickListener() { // from class: z41
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DebugUi.g(onClick, view);
            }
        });
        Unit unit = Unit.INSTANCE;
        container.addView(textView);
    }

    @SuppressLint({"CheckResult"})
    public final void shareLoginFailedLog(@NotNull final AppCompatActivity activity, @NotNull final LoadingDialogContainer dialogContainer) {
        new RxPermissions(activity).request("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE").subscribe(new Consumer() { // from class: a51
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DebugUi.h(activity, dialogContainer, (Boolean) obj);
            }
        });
    }
}
