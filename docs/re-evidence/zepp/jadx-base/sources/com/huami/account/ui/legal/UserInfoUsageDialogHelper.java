package com.huami.account.ui.legal;

import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.AccountExternalsKt;
import com.huami.account.WebHelper;
import com.huami.account.legal.UserInfoPolicyPropertyRegistry;
import com.huami.account.ui.R;
import com.huami.account.ui.legal.UserInfoUsageDialogHelper;
import com.huami.account.utils.UtilsKt;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.tools.analytics.DbUtils;
import com.huami.userproperty.UserPropertyManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J>\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0002J\u0006\u0010\u0013\u001a\u00020\u0002R\u0019\u0010\u0019\u001a\u00020\u00148\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R(\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/huami/account/ui/legal/UserInfoUsageDialogHelper;", "", "", "e", "f", "", "id", GoogleApiAvailabilityLight.a, "Landroid/text/SpannableStringBuilder;", "g", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "style", "color", "start", "end", "Lkotlin/Function0;", "onClick", "i", "show", "Landroidx/appcompat/app/AppCompatActivity;", "a", "Landroidx/appcompat/app/AppCompatActivity;", "getActivity", "()Landroidx/appcompat/app/AppCompatActivity;", "activity", "b", "Lkotlin/jvm/functions/Function0;", "getOnConfirm", "()Lkotlin/jvm/functions/Function0;", "setOnConfirm", "(Lkotlin/jvm/functions/Function0;)V", "onConfirm", "", "c", "()Ljava/lang/String;", "agreementUrl", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class UserInfoUsageDialogHelper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AppCompatActivity activity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private Function0<Unit> onConfirm = b.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\u000e"}, d2 = {"com/huami/account/ui/legal/UserInfoUsageDialogHelper$a", "", "", "b", LogUtil.I, "CONTENT_TEXT_SIZE", "c", "CONTENT_PADDING_HORIZONTAL", GoogleApiAvailabilityLight.a, "CONTENT_PADDING_TOP", "e", "CONTENT_PADDING_BOTTOM", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {

        @NotNull
        public static final a a = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final int CONTENT_TEXT_SIZE = 14;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public static final int CONTENT_PADDING_HORIZONTAL = 20;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public static final int CONTENT_PADDING_TOP = 20;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public static final int CONTENT_PADDING_BOTTOM = 30;

        private a() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public static final b a = new b();

        public b() {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            WebHelper.launch(UserInfoUsageDialogHelper.this.c());
        }
    }

    public UserInfoUsageDialogHelper(@NotNull AppCompatActivity appCompatActivity) {
        this.activity = appCompatActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c() {
        return HMServerDef.getHost() + AccountExternalsKt.getConfigDelegate().userPrivacyPagePath();
    }

    private final int d(int id) {
        return ContextCompat.getColor(this.activity, id);
    }

    private final void e() {
        UserInfoPolicyPropertyRegistry.INSTANCE.isAllowUserInfoUsage().set(Boolean.TRUE);
        UserPropertyManager.INSTANCE.schedulePushAll();
    }

    private final void f() {
        UserInfoPolicyPropertyRegistry.INSTANCE.isAllowUserInfoUsage().set(Boolean.FALSE);
        UserPropertyManager.INSTANCE.schedulePushAll();
    }

    private final SpannableStringBuilder g() {
        String str;
        int length;
        String strTrimIndent = f.trimIndent("\n                    " + h(this, R.string.account_ui_exercise_health_data_use_notification_p1) + "\n                    \n                    " + h(this, R.string.account_ui_exercise_health_data_use_notification_p2) + "\n                ");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strTrimIndent);
        int i = 0;
        String[] strArr = {h(this, R.string.account_ui_exercise_health_data_use_notification_agreement), h(this, R.string.account_ui_person_info_collection_notification)};
        int i2 = 0;
        while (true) {
            if (i2 >= 2) {
                str = null;
                break;
            }
            str = strArr[i2];
            if (StringsKt__StringsKt.contains$default((CharSequence) strTrimIndent, (CharSequence) str, false, 2, (Object) null)) {
                break;
            }
            i2++;
        }
        if (str != null) {
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) strTrimIndent, str, 0, false, 6, (Object) null);
            i = iIndexOf$default;
            length = str.length() + iIndexOf$default;
        } else {
            length = strTrimIndent.length();
        }
        i(this.activity, spannableStringBuilder, R.color.account_ui_stp_blue, i, length, new c());
        return spannableStringBuilder;
    }

    private static final String h(UserInfoUsageDialogHelper userInfoUsageDialogHelper, int i) {
        return userInfoUsageDialogHelper.activity.getString(i);
    }

    private final void i(final Context context, SpannableStringBuilder style, final int color, int start, int end, final Function0<Unit> onClick) {
        style.setSpan(new ClickableSpan() { // from class: com.huami.account.ui.legal.UserInfoUsageDialogHelper$setSpan$1
            @Override // android.text.style.ClickableSpan
            public void onClick(@NotNull View widget) {
                onClick.invoke();
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(@NotNull TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(ContextCompat.getColor(context, color));
                ds.setUnderlineText(true);
            }
        }, start, end, 33);
    }

    private static final int j(int i, UserInfoUsageDialogHelper userInfoUsageDialogHelper) {
        return (int) UtilsKt.dp2px(userInfoUsageDialogHelper.activity, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(UserInfoUsageDialogHelper userInfoUsageDialogHelper, DialogInterface dialogInterface, int i) {
        userInfoUsageDialogHelper.e();
        userInfoUsageDialogHelper.getOnConfirm().invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(UserInfoUsageDialogHelper userInfoUsageDialogHelper, DialogInterface dialogInterface, int i) {
        userInfoUsageDialogHelper.f();
    }

    @NotNull
    public final AppCompatActivity getActivity() {
        return this.activity;
    }

    @NotNull
    public final Function0<Unit> getOnConfirm() {
        return this.onConfirm;
    }

    public final void setOnConfirm(@NotNull Function0<Unit> function0) {
        this.onConfirm = function0;
    }

    public final void show() {
        SpannableStringBuilder spannableStringBuilderG = g();
        TextView textView = new TextView(this.activity);
        textView.setPadding(j(20, this), j(20, this), j(20, this), j(30, this));
        textView.setTextColor(d(R.color.s1));
        textView.setTextSize(14.0f);
        textView.setText(spannableStringBuilderG);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(0);
        new AlertDialogFragment.Builder(this.activity).setTitle(R.string.account_ui_exercise_health_data_use_notification_title).setContentView(textView).setPositiveButton(R.string.account_ui_agree, new DialogInterface.OnClickListener() { // from class: w68
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                UserInfoUsageDialogHelper.k(this.a, dialogInterface, i);
            }
        }).setNegativeButton(R.string.account_ui_label_refuse, new DialogInterface.OnClickListener() { // from class: x68
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                UserInfoUsageDialogHelper.l(this.a, dialogInterface, i);
            }
        }).show(this.activity.getSupportFragmentManager()).setGravity(17);
    }
}
