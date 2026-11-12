package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.view.View;
import com.huawei.indoorequip.R;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import health.compact.a.HuaweiHealth;
import health.compact.a.LanguageUtil;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public class nzf {
    public static CustomTextAlertDialog c(Context context, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, DialogInterface.OnKeyListener onKeyListener) {
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(context);
        builder.e(HuaweiHealth.a().getString(R.string.ie_user_notice_title)).a(HuaweiHealth.a().getString(R.string.ie_user_notice_content)).b(HuaweiHealth.a().getString(R.string.ie_agree), onClickListener).a(HuaweiHealth.a().getString(R.string.ie_disagree), onClickListener2);
        builder.a(qrs.d(context, 12.0f), qrs.d(context, 10.0f));
        if (LanguageUtil.u(context)) {
            builder.a(qrs.d(context, 12.0f), qrs.d(context, 8.0f));
        }
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCanceledOnTouchOutside(false);
        customTextAlertDialogB.setOnKeyListener(onKeyListener);
        return customTextAlertDialogB;
    }

    public static NoTitleCustomAlertDialog e(Context context, boolean z, View.OnClickListener onClickListener) {
        if (!(context instanceof Activity)) {
            return null;
        }
        String string = HuaweiHealth.a().getResources().getString(R.string.IDS_tips_connect_failed);
        SpannableString spannableString = new SpannableString(string + System.lineSeparator() + System.lineSeparator() + String.format(Locale.ENGLISH, HuaweiHealth.a().getResources().getString(z ? R.string.IDS_connect_retry_tips_pad : R.string.IDS_tips_connect_failed_pls_retry), 1, 2, 3));
        spannableString.setSpan(new TypefaceSpan(Constants.FONT), 0, string.length(), 17);
        spannableString.setSpan(new AbsoluteSizeSpan(20, true), 0, string.length(), 17);
        spannableString.setSpan(new ForegroundColorSpan(HuaweiHealth.a().getResources().getColor(R.color.textColorPrimary)), 0, string.length(), 17);
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(context).b(spannableString).a(HuaweiHealth.a().getString(R.string.ie_button_i_know), onClickListener).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        return noTitleCustomAlertDialogC;
    }
}
