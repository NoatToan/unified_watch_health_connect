package com.huami.thirdparty.webauth;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import com.huami.account.AccountStatEvent;
import com.huami.thirdparty.webauth.client.AuthClient;
import com.huami.thirdparty.webauth.client.RunKeeper;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\u001a\u0080\u0001\u0010\u000f\u001a\u00020\r\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042S\b\u0002\u0010\u000e\u001aM\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0006¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u0013\u001a\u00020\r\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/huami/thirdparty/webauth/client/AuthClient;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/fragment/app/FragmentActivity;", "activity", "Lcom/huami/thirdparty/webauth/Param;", "param", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "accessToken", "expires", "refreshToken", "", "authResult", "auth", "(Lcom/huami/thirdparty/webauth/client/AuthClient;Landroidx/fragment/app/FragmentActivity;Lcom/huami/thirdparty/webauth/Param;Lkotlin/jvm/functions/Function3;)V", AccountStatEvent.KEY_ACCOUNT_SIGN_THIRD_NAME, "uid", "revokeAuth", "(Lcom/huami/thirdparty/webauth/client/AuthClient;Ljava/lang/String;Ljava/lang/String;)V", "webauth_release"}, k = 2, mv = {1, 4, 1})
public final class ThirdBindKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/huami/thirdparty/webauth/client/AuthClient;", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous parameter 0>", "<anonymous parameter 1>", "<anonymous parameter 2>", "", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"}, k = 3, mv = {1, 4, 1})
    public static final class a extends Lambda implements Function3<String, String, String, Unit> {
        public static final a a = new a();

        public a() {
            super(3);
        }

        public final void a(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(String str, String str2, String str3) {
            a(str, str2, str3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/huami/thirdparty/webauth/client/AuthClient;", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous parameter 0>", "resultCode", "Landroid/content/Intent;", "data", "", "a", "(IILandroid/content/Intent;)V"}, k = 3, mv = {1, 4, 1})
    public static final class b extends Lambda implements Function3<Integer, Integer, Intent, Unit> {
        public final /* synthetic */ Function3 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function3 function3) {
            super(3);
            this.a = function3;
        }

        public final void a(int i, int i2, @Nullable Intent intent) {
            if (i2 == -1) {
                this.a.invoke(intent != null ? intent.getStringExtra("access_token") : null, intent != null ? intent.getStringExtra("expires_in") : null, intent != null ? intent.getStringExtra("refresh_token") : null);
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Intent intent) {
            a(num.intValue(), num2.intValue(), intent);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/huami/thirdparty/webauth/client/AuthClient;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/app/Activity;", "it", "", "a", "(Landroid/app/Activity;)V"}, k = 3, mv = {1, 4, 1})
    public static final class c extends Lambda implements Function1<Activity, Unit> {
        public final /* synthetic */ FragmentActivity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(FragmentActivity fragmentActivity) {
            super(1);
            this.a = fragmentActivity;
        }

        public final void a(@NotNull Activity activity) {
            TextView textView = new TextView(this.a);
            textView.setText(this.a.getResources().getString(R.string.auth_please_note));
            textView.setPadding(10, 30, 10, 0);
            textView.setGravity(17);
            textView.setTextColor(-16777216);
            textView.setTextSize(1, 18.0f);
            textView.getPaint().setFakeBoldText(true);
            AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setCustomTitle(textView).setMessage(activity.getResources().getString(R.string.auth_runkeeper_notice)).setPositiveButton(activity.getResources().getString(R.string.auth_ok), (DialogInterface.OnClickListener) null).create();
            alertDialogCreate.show();
            Button button = alertDialogCreate.getButton(-1);
            ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = 17;
            layoutParams2.width = -1;
            button.setLayoutParams(layoutParams2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Activity activity) {
            a(activity);
            return Unit.INSTANCE;
        }
    }

    public static final <T extends AuthClient> void auth(@NotNull T t, @NotNull FragmentActivity fragmentActivity, @NotNull Param param, @NotNull Function3<? super String, ? super String, ? super String, Unit> function3) {
        t.setParam(param);
        ActivityResult.start$default(ActivityResult.INSTANCE.with(fragmentActivity), WebAuthActivity.INSTANCE.getIntent(fragmentActivity, t.buildThirdBindUrl(), t.getTitle(fragmentActivity)), 0, new b(function3), 2, null);
        if (t instanceof RunKeeper) {
            Actions.INSTANCE.register(RunKeeper.INSTANCE.getName(), new c(fragmentActivity));
        }
    }

    public static /* synthetic */ void auth$default(AuthClient authClient, FragmentActivity fragmentActivity, Param param, Function3 function3, int i, Object obj) {
        if ((i & 4) != 0) {
            function3 = a.a;
        }
        auth(authClient, fragmentActivity, param, function3);
    }

    public static final <T extends AuthClient> void revokeAuth(@NotNull T t, @NotNull String str, @NotNull String str2) {
        ThirdBind.revokeAuth$default(ThirdBind.INSTANCE, t.getName(), str, str2, null, 8, null);
    }
}
