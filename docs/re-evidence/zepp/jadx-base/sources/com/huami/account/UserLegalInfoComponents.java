package com.huami.account;

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
import androidx.fragment.app.FragmentActivity;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.account.UserLegalInfoComponents;
import com.huami.account.bean.LegalInfoType;
import com.huami.account.service.model.Area;
import com.huami.account.ui.R;
import com.huami.account.ui.areas.SelectAreaHelper;
import com.huami.account.ui.legal.UserAgreementFooterFragment;
import com.huami.account.ui.legal.UserAgreementForRegisterFragment;
import com.huami.account.ui.legal.UserAgreementFragment;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.mifit.analytics.Analytics;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.ui.activity.BaseDeviceStatusActivity;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001=B\t\b\u0002¢\u0006\u0004\b;\u0010<J0\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002JB\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J \u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J2\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\bH\u0002J\u0018\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aJ\u001e\u0010!\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020 J*\u0010$\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010#J(\u0010'\u001a\u00020&2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\u0016\u0010(\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011J\u0016\u0010)\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011J\u001e\u0010*\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u000eJ(\u0010+\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ \u0010,\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\u0016\u0010-\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011JD\u00104\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0.2\u0006\u00100\u001a\u00020\u00132\u0006\u00101\u001a\u00020\u00132\u0006\u00102\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u000103J,\u00105\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0.2\b\u0010\u001b\u001a\u0004\u0018\u000103J\u000e\u00106\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0018J\u000e\u00107\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0018R\u0016\u0010:\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u00109¨\u0006>"}, d2 = {"Lcom/huami/account/UserLegalInfoComponents;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/account/bean/LegalInfoType;", "type", "Landroid/text/SpannableStringBuilder;", "style", "", "start", "end", "", "g", "color", "", "value", "h", "Landroid/widget/TextView;", ViewHierarchyConstants.VIEW_KEY, "", "isAppend", GoogleApiAvailabilityLight.a, "info", "f", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "Lcom/huami/account/ui/legal/UserAgreementFragment$OnDialogListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "showDialog", "Landroidx/fragment/app/FragmentActivity;", "Lcom/huami/account/service/model/Area;", BaseDeviceStatusActivity.KEY_AREA, "Lcom/huami/account/UserLegalInfoComponents$AgreementDialogCallback;", "showAgreementDialogForReg", "isShowUx", "Lcom/huami/account/ui/legal/UserAgreementForRegisterFragment$OnDialogListener;", "showUserAgreementForRegisterDialog", "containerId", "Lcom/huami/account/ui/legal/UserAgreementFooterFragment;", "showUserAgreementFooterFragment", "assembleAboutExperienceText", "assembleUpdateExperienceText", "assembleAgreementAndPrivacyText", "assembleRegisterAgreementAndPrivacyText", "assembleRegisterExperienceText", "assembleExperienceText", "", SportAnalytics.ParamValue.MapButtonType.MAP, "showAgreement", "showPrivacy", "showExperience", "Lcom/huami/account/UserLegalInfoManager$OnLegalInfoEndListener;", "showAgreementAndPrivacyDialog", "showExperienceDialog", "showCollectUserInfoTip", "showRegisterPrivacyTip", "a", "Ljava/lang/String;", "TAG", "<init>", "()V", "AgreementDialogCallback", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class UserLegalInfoComponents {

    @NotNull
    public static final UserLegalInfoComponents INSTANCE = new UserLegalInfoComponents();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "UserLegalInfoComponents";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0005"}, d2 = {"Lcom/huami/account/UserLegalInfoComponents$AgreementDialogCallback;", "", "", "onAgree", "onCancel", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public interface AgreementDialogCallback {
        void onAgree();

        void onCancel();
    }

    private UserLegalInfoComponents() {
    }

    private final void d(TextView view, SpannableStringBuilder style, boolean isAppend) {
        view.setMovementMethod(LinkMovementMethod.getInstance());
        view.setHighlightColor(0);
        if (isAppend) {
            view.append(style);
        } else {
            view.setText(style);
        }
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: a78
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                return UserLegalInfoComponents.e(view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(View view) {
        return true;
    }

    private final void f(Context context, TextView view, String info, String value, int color) {
        String string = context.getString(R.string.account_ui_user_agreement);
        String string2 = context.getString(R.string.account_ui_user_privacy);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(info, Arrays.copyOf(new Object[]{string, string2}, 2));
        int[] iArr = {StringsKt__StringsKt.indexOf$default((CharSequence) str, string, 0, false, 6, (Object) null), StringsKt__StringsKt.indexOf$default((CharSequence) str, string2, 0, false, 6, (Object) null)};
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        h(context, LegalInfoType.AGREEMENT, spannableStringBuilder, color, iArr[0], iArr[0] + string.length(), value);
        h(context, LegalInfoType.PRIVACY, spannableStringBuilder, color, iArr[1], iArr[1] + string2.length(), value);
        d(view, spannableStringBuilder, false);
    }

    private final void g(Context context, LegalInfoType type, SpannableStringBuilder style, int start, int end) {
        h(context, type, style, R.color.account_ui_stp_blue, start, end, null);
    }

    private final void h(final Context context, final LegalInfoType type, SpannableStringBuilder style, final int color, int start, int end, final String value) {
        style.setSpan(new ClickableSpan() { // from class: com.huami.account.UserLegalInfoComponents$setSpan$1
            @Override // android.text.style.ClickableSpan
            public void onClick(@NotNull View widget) {
                UserLegalInfoManager.showPage(context, type.toNavigateType(), value);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(@NotNull TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(ContextCompat.getColor(context, color));
                ds.setUnderlineText(true);
            }
        }, start, end, 33);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    public final void assembleAboutExperienceText(@NotNull Context context, @NotNull TextView view) {
        String string = context.getString(R.string.account_ui_user_plan_sub_title_click);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        g(context, LegalInfoType.EXPERIENCE, spannableStringBuilder, 0, string.length());
        d(view, spannableStringBuilder, true);
    }

    public final void assembleAgreementAndPrivacyText(@NotNull Context context, @NotNull TextView view, @NotNull String info) {
        f(context, view, info, null, R.color.account_ui_stp_blue);
    }

    public final void assembleExperienceText(@NotNull Context context, @NotNull TextView view) {
        String string = context.getString(R.string.account_ui_user_agreement_ux);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        g(context, LegalInfoType.EXPERIENCE, spannableStringBuilder, 0, string.length());
        d(view, spannableStringBuilder, false);
    }

    public final void assembleRegisterAgreementAndPrivacyText(@NotNull Context context, @NotNull TextView view, @NotNull String info, @Nullable String value) {
        f(context, view, info, value, R.color.account_ui_stp_blue);
    }

    public final void assembleRegisterExperienceText(@NotNull Context context, @NotNull TextView view, @Nullable String value) {
        String string = context.getString(R.string.account_ui_user_agreement_ux);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        h(context, LegalInfoType.EXPERIENCE, spannableStringBuilder, R.color.account_ui_stp_blue, 0, string.length(), value);
        d(view, spannableStringBuilder, false);
    }

    public final void assembleUpdateExperienceText(@NotNull Context context, @NotNull TextView view) {
        String string = context.getString(R.string.account_ui_user_experience_info);
        String string2 = context.getString(R.string.account_ui_agree_ux);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(string, Arrays.copyOf(new Object[]{string2}, 1));
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, string2, 0, false, 6, (Object) null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        g(context, LegalInfoType.EXPERIENCE, spannableStringBuilder, iIndexOf$default, iIndexOf$default + string2.length());
        d(view, spannableStringBuilder, false);
    }

    public final void showAgreementAndPrivacyDialog(@NotNull final AppCompatActivity activity, @NotNull final Map<LegalInfoType, String> map, final boolean showAgreement, final boolean showPrivacy, final boolean showExperience, @Nullable final UserLegalInfoManager.OnLegalInfoEndListener listener) {
        showDialog(activity, new UserAgreementFragment.OnDialogListener() { // from class: com.huami.account.UserLegalInfoComponents.showAgreementAndPrivacyDialog.1
            @Override // com.huami.account.ui.legal.UserAgreementFragment.OnDialogListener
            public boolean isExperience() {
                return false;
            }

            @Override // com.huami.account.ui.legal.UserAgreementFragment.OnDialogListener
            public boolean isUpdate() {
                return true;
            }

            @Override // com.huami.account.ui.legal.UserAgreementFragment.OnDialogListener
            public void onCancel() {
                if (activity.isFinishing()) {
                    return;
                }
                Analytics.event(AccountExternalsKt.getAppContext(), "Login_PrivacyExit", "Exit");
                HMLogoutManager.logout(5);
            }

            @Override // com.huami.account.ui.legal.UserAgreementFragment.OnDialogListener
            public void onSave(boolean agree) {
                if (showAgreement) {
                    UserLegalInfoManager.save(LegalInfoType.AGREEMENT, map);
                }
                if (showPrivacy) {
                    UserLegalInfoManager.save(LegalInfoType.PRIVACY, map);
                }
                Analytics.event(AccountExternalsKt.getAppContext(), "Login_PrivacyExit", "Agree");
                if (showExperience) {
                    UserLegalInfoComponents.INSTANCE.showExperienceDialog(activity, map, listener);
                    return;
                }
                UserLegalInfoManager.saveVersionToServer();
                UserLegalInfoManager.OnLegalInfoEndListener onLegalInfoEndListener = listener;
                if (onLegalInfoEndListener == null) {
                    return;
                }
                onLegalInfoEndListener.onEnd();
            }
        });
        Analytics.event(AccountExternalsKt.getAppContext(), "Login_PrivacyDialogNum", "User");
    }

    public final void showAgreementDialogForReg(@NotNull FragmentActivity activity, @NotNull Area area, @NotNull final AgreementDialogCallback listener) {
        final boolean zIsShowUxAgreement = SelectAreaHelper.isShowUxAgreement(area);
        showUserAgreementForRegisterDialog(activity, zIsShowUxAgreement, area.getValue(), new UserAgreementForRegisterFragment.OnDialogListener() { // from class: com.huami.account.UserLegalInfoComponents.showAgreementDialogForReg.1
            @Override // com.huami.account.ui.legal.UserAgreementForRegisterFragment.OnDialogListener
            public void onCancel() {
                listener.onCancel();
            }

            @Override // com.huami.account.ui.legal.UserAgreementForRegisterFragment.OnDialogListener
            public void onSave(boolean isAgreeUxAgreement) {
                if (zIsShowUxAgreement) {
                    HMLoginManager.saveAgreeUserExperienceForRegister(isAgreeUxAgreement);
                }
                listener.onAgree();
            }
        });
    }

    public final void showCollectUserInfoTip(@NotNull AppCompatActivity activity) {
        new AlertDialogFragment.Builder(activity).setTitle(R.string.account_ui_new_userinfo_tip_title).setMessage(R.string.account_ui_new_userinfo_tip_content).setNeutralButton(R.string.account_ui_got_it, new DialogInterface.OnClickListener() { // from class: z68
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                UserLegalInfoComponents.i(dialogInterface, i);
            }
        }).show(activity.getSupportFragmentManager());
    }

    public final void showDialog(@NotNull AppCompatActivity activity, @Nullable UserAgreementFragment.OnDialogListener listener) {
        UserAgreementFragment userAgreementFragment = new UserAgreementFragment();
        userAgreementFragment.setListener(listener);
        userAgreementFragment.show(activity.getSupportFragmentManager(), TAG);
    }

    public final void showExperienceDialog(@NotNull final AppCompatActivity activity, @NotNull final Map<LegalInfoType, String> map, @Nullable final UserLegalInfoManager.OnLegalInfoEndListener listener) {
        showDialog(activity, new UserAgreementFragment.OnDialogListener() { // from class: com.huami.account.UserLegalInfoComponents.showExperienceDialog.1
            private final void a(boolean agree) {
                HMLoginManager.saveAgreeUserExperienceForRegister(agree);
            }

            @Override // com.huami.account.ui.legal.UserAgreementFragment.OnDialogListener
            public boolean isExperience() {
                return true;
            }

            @Override // com.huami.account.ui.legal.UserAgreementFragment.OnDialogListener
            public boolean isUpdate() {
                return true;
            }

            @Override // com.huami.account.ui.legal.UserAgreementFragment.OnDialogListener
            public void onCancel() {
                if (activity.isFinishing()) {
                    return;
                }
                a(false);
                UserLegalInfoManager.OnLegalInfoEndListener onLegalInfoEndListener = listener;
                if (onLegalInfoEndListener == null) {
                    return;
                }
                onLegalInfoEndListener.onEnd();
            }

            @Override // com.huami.account.ui.legal.UserAgreementFragment.OnDialogListener
            public void onSave(boolean agree) {
                a(true);
                UserLegalInfoManager.save(LegalInfoType.EXPERIENCE, map);
                UserLegalInfoManager.saveVersionToServer();
                UserLegalInfoManager.OnLegalInfoEndListener onLegalInfoEndListener = listener;
                if (onLegalInfoEndListener == null) {
                    return;
                }
                onLegalInfoEndListener.onEnd();
            }
        });
        Analytics.event(AccountExternalsKt.getAppContext(), "Login_PrivacyDialogNum", "SoftwareLicense");
    }

    public final void showRegisterPrivacyTip(@NotNull AppCompatActivity activity) {
        new AlertDialogFragment.Builder(activity).setTitle(R.string.account_ui_register_privacy_title).setParagraph(R.string.account_ui_register_privacy_content).setNeutralButton(R.string.account_ui_got_it, new DialogInterface.OnClickListener() { // from class: y68
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                UserLegalInfoComponents.j(dialogInterface, i);
            }
        }).show(activity.getSupportFragmentManager());
    }

    @NotNull
    public final UserAgreementFooterFragment showUserAgreementFooterFragment(@NotNull AppCompatActivity activity, int containerId, boolean isShowUx, @Nullable String value) {
        UserAgreementFooterFragment userAgreementFooterFragment = new UserAgreementFooterFragment();
        userAgreementFooterFragment.setShowUx(isShowUx);
        userAgreementFooterFragment.setValue(value);
        activity.getSupportFragmentManager().beginTransaction().replace(containerId, userAgreementFooterFragment).commit();
        return userAgreementFooterFragment;
    }

    public final void showUserAgreementForRegisterDialog(@NotNull FragmentActivity activity, boolean isShowUx, @Nullable String value, @Nullable UserAgreementForRegisterFragment.OnDialogListener listener) {
        UserAgreementForRegisterFragment userAgreementForRegisterFragment = new UserAgreementForRegisterFragment();
        userAgreementForRegisterFragment.setListener(listener);
        userAgreementForRegisterFragment.setShowUx(isShowUx);
        userAgreementForRegisterFragment.setValue(value);
        userAgreementForRegisterFragment.show(activity.getSupportFragmentManager(), TAG);
    }
}
