package com.huami.feedback.screencapture;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.StringRes;
import androidx.fragment.app.FragmentManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.model.ShareStoryContent;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.DialogParams;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/huami/feedback/screencapture/ScreenCaptureDialog;", "Lcom/huami/android/design/dialog/AlertDialogFragment;", "", "onStart", "<init>", "()V", ShareStoryContent.Builder.k, "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public final class ScreenCaptureDialog extends AlertDialogFragment {
    @Override // com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        if (getDialog() != null) {
            requireActivity().getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
            Dialog dialog = getDialog();
            WindowManager.LayoutParams attributes = (dialog == null || (window = dialog.getWindow()) == null) ? null : window.getAttributes();
            if (attributes != null) {
                attributes.width = -2;
            }
            Dialog dialog2 = getDialog();
            Window window2 = dialog2 != null ? dialog2.getWindow() : null;
            if (window2 == null) {
                return;
            }
            window2.setAttributes(attributes);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ\u0006\u0010\u0002\u001a\u00020\u0000J\u001a\u0010\u0007\u001a\u00020\u00002\b\b\u0001\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0001\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0006\u0010\r\u001a\u00020\fJ\u001a\u0010\u0012\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0012\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eR\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/huami/feedback/screencapture/ScreenCaptureDialog$Builder;", "", "success", "", "text", "Landroid/content/DialogInterface$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setNegativeButton", "setPositiveButton", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "setContentView", "Lcom/huami/android/design/dialog/AlertDialogFragment;", "create", "Landroidx/fragment/app/FragmentManager;", "manager", "", "tag", "show", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "b", "Ljava/lang/String;", "Lcom/huami/android/design/dialog/DialogParams;", "c", "Lcom/huami/android/design/dialog/DialogParams;", "mParams", "<init>", "(Landroid/content/Context;)V", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Context context;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final String tag = "AlertDialogFragment";

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final DialogParams mParams = new DialogParams();

        public Builder(@NotNull Context context) {
            this.context = context;
        }

        @NotNull
        public final AlertDialogFragment create() {
            ScreenCaptureDialog screenCaptureDialog = new ScreenCaptureDialog();
            screenCaptureDialog.setParams(this.mParams);
            return screenCaptureDialog;
        }

        @NotNull
        public final Builder setContentView(@Nullable View view) {
            if (view != null) {
                this.mParams.contentView = view;
            }
            return this;
        }

        @NotNull
        public final Builder setNegativeButton(@StringRes int text, @Nullable DialogInterface.OnClickListener listener) {
            this.mParams.negativeButtonText = this.context.getString(text);
            this.mParams.negativeListener = listener;
            return this;
        }

        @NotNull
        public final Builder setPositiveButton(@StringRes int text, @Nullable DialogInterface.OnClickListener listener) {
            this.mParams.positiveButtonText = this.context.getString(text);
            this.mParams.positiveListener = listener;
            return this;
        }

        @NotNull
        public final AlertDialogFragment show(@Nullable FragmentManager manager, @Nullable String tag) {
            AlertDialogFragment alertDialogFragmentCreate = create();
            alertDialogFragmentCreate.show(manager, tag);
            return alertDialogFragmentCreate;
        }

        @NotNull
        public final Builder success() {
            this.mParams.successful = Boolean.TRUE;
            return this;
        }

        @NotNull
        public final AlertDialogFragment show(@Nullable FragmentManager manager) {
            String str = this.mParams.title;
            if (TextUtils.isEmpty(str)) {
                str = this.tag;
            }
            return show(manager, str);
        }
    }
}
