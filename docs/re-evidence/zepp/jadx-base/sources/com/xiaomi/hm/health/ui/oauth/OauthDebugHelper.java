package com.xiaomi.hm.health.ui.oauth;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.Constant;
import com.xiaomi.hm.health.ui.oauth.OauthDebugHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\n\u001a\n \t*\u0004\u0018\u00010\b0\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J.\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\fH\u0002R\u0016\u0010\u0011\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u0014*\u00020\u00148B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/ui/oauth/OauthDebugHelper;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "setDebugUrl", "", "getDebugUrl", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "e", "originText", "Lkotlin/Function1;", "action", "f", "a", "Ljava/lang/String;", "SHARED_PREF_NAME", "b", "DEBUG_URL_KEY", "", GoogleApiAvailabilityLight.a, "(I)I", Constant.PAI_KEY_DAILY_PAI, "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class OauthDebugHelper {

    @NotNull
    public static final OauthDebugHelper INSTANCE = new OauthDebugHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String SHARED_PREF_NAME = "com.huami.oauth";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String DEBUG_URL_KEY = "oauth_page_url";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "url", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<String, Unit> {
        public final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(1);
            this.a = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String str) {
            OauthDebugHelper.INSTANCE.e(this.a).edit().putString(OauthDebugHelper.DEBUG_URL_KEY, str).apply();
            Toast.makeText(this.a, "设置成功", 0).show();
        }
    }

    private OauthDebugHelper() {
    }

    private final int d(int i) {
        return (int) (i * Resources.getSystem().getDisplayMetrics().density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences e(Context context) {
        return context.getSharedPreferences(SHARED_PREF_NAME, 0);
    }

    private final void f(Context context, String originText, final Function1<? super String, Unit> action) {
        final EditText editText = new EditText(context);
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        OauthDebugHelper oauthDebugHelper = INSTANCE;
        layoutParams.leftMargin = oauthDebugHelper.d(20);
        layoutParams.rightMargin = oauthDebugHelper.d(20);
        Unit unit = Unit.INSTANCE;
        editText.setLayoutParams(layoutParams);
        frameLayout.addView(editText);
        final AlertDialog alertDialogShow = new AlertDialog.Builder(context).setMessage("设置授权页面调试地址").setView(frameLayout).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: zh5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                OauthDebugHelper.h(dialogInterface, i);
            }
        }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: ai5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                OauthDebugHelper.i(dialogInterface, i);
            }
        }).show();
        editText.postDelayed(new Runnable() { // from class: com.xiaomi.hm.health.ui.oauth.OauthDebugHelper$showInputBox$$inlined$postDelayed$1
            @Override // java.lang.Runnable
            public final void run() {
                editText.requestFocus();
            }
        }, 100L);
        editText.setText(originText);
        editText.setSelection(originText.length());
        alertDialogShow.getButton(-1).setOnClickListener(new View.OnClickListener() { // from class: bi5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OauthDebugHelper.j(action, editText, alertDialogShow, view);
            }
        });
    }

    public static /* synthetic */ void g(OauthDebugHelper oauthDebugHelper, Context context, String str, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        oauthDebugHelper.f(context, str, function1);
    }

    @JvmStatic
    @NotNull
    public static final String getDebugUrl(@NotNull Context context) {
        String string = INSTANCE.e(context).getString(DEBUG_URL_KEY, "");
        return string == null ? "" : string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(DialogInterface dialogInterface, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(DialogInterface dialogInterface, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(Function1 function1, EditText editText, AlertDialog alertDialog, View view) {
        function1.invoke(editText.getText().toString());
        alertDialog.dismiss();
    }

    @JvmStatic
    public static final void setDebugUrl(@NotNull Context context) {
        INSTANCE.f(context, getDebugUrl(context), new a(context));
    }
}
