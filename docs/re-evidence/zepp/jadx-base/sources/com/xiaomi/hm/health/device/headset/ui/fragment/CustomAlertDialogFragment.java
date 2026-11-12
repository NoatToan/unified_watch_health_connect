package com.xiaomi.hm.health.device.headset.ui.fragment;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.DialogParams;
import com.huami.devicex.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/ui/fragment/CustomAlertDialogFragment;", "Lcom/huami/android/design/dialog/AlertDialogFragment;", "Landroid/view/View;", "initView", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class CustomAlertDialogFragment extends AlertDialogFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String h = "title";

    @NotNull
    private static final String i = "message";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u001e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/ui/fragment/CustomAlertDialogFragment$Companion;", "", "", "title", "", "cancelable", "Lcom/huami/android/design/dialog/AlertDialogFragment$ChoiceItems;", "items", "Landroid/content/DialogInterface$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/huami/android/design/dialog/DialogParams;", "createDialogParams", "dialogParams", "headTitle", "headMessage", "Lcom/xiaomi/hm/health/device/headset/ui/fragment/CustomAlertDialogFragment;", "newInstance", "HEAD_MESSAGE", "Ljava/lang/String;", "HEAD_TITLE", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DialogParams createDialogParams(@NotNull String title, boolean cancelable, @NotNull AlertDialogFragment.ChoiceItems items, @NotNull DialogInterface.OnClickListener listener) {
            DialogParams dialogParams = new DialogParams();
            dialogParams.title = title;
            dialogParams.cancelable = cancelable;
            dialogParams.choiceItems = items;
            dialogParams.listener = listener;
            dialogParams.isSingleChoice = true;
            return dialogParams;
        }

        @NotNull
        public final CustomAlertDialogFragment newInstance(@NotNull DialogParams dialogParams, @NotNull String headTitle, @NotNull String headMessage) {
            CustomAlertDialogFragment customAlertDialogFragment = new CustomAlertDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString("title", headTitle);
            bundle.putString("message", headMessage);
            customAlertDialogFragment.setArguments(bundle);
            customAlertDialogFragment.setParams(dialogParams);
            return customAlertDialogFragment;
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.android.design.dialog.AlertDialogFragment, com.huami.android.design.dialog.BaseDialogFragment
    @NotNull
    public View initView() {
        View viewInitView = super.initView();
        Bundle arguments = getArguments();
        String string = arguments == null ? null : arguments.getString("title");
        Bundle arguments2 = getArguments();
        String string2 = arguments2 == null ? null : arguments2.getString("message");
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
            String str = string + "\n" + string2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.getColor(requireContext(), R.color.s2)), str.length() - string2.length(), str.length(), 34);
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(13, true), str.length() - string2.length(), str.length(), 34);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.getColor(requireContext(), R.color.s1)), 0, string.length(), 33);
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(17, true), 0, string.length(), 33);
            TextView textView = (TextView) viewInitView.findViewById(R.id.dialog_title);
            if (textView != null) {
                textView.setTypeface(Typeface.defaultFromStyle(0));
            }
            if (textView != null) {
                textView.setText(spannableStringBuilder);
            }
            if (textView != null) {
                textView.setMaxLines(3);
            }
            if (textView != null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 17;
                Unit unit = Unit.INSTANCE;
                textView.setLayoutParams(layoutParams);
            }
            FrameLayout frameLayout = (FrameLayout) (textView != null ? textView.getParent() : null);
            if (frameLayout != null) {
                frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            }
        }
        return viewInitView;
    }
}
