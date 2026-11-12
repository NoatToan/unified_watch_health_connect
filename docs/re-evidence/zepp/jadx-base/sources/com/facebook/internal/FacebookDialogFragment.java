package com.facebook.internal;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u001b\u0010\fJ\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016J\u000f\u0010\r\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0016R$\u0010\u001a\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/facebook/internal/FacebookDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Landroid/os/Bundle;", "values", "Lcom/facebook/FacebookException;", "error", "", "a", "b", "savedInstanceState", "onCreate", "initDialog$facebook_common_release", "()V", "initDialog", "Landroid/app/Dialog;", "onCreateDialog", "onResume", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "onDestroyView", "Landroid/app/Dialog;", "getInnerDialog", "()Landroid/app/Dialog;", "setInnerDialog", "(Landroid/app/Dialog;)V", "innerDialog", "<init>", "Companion", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class FacebookDialogFragment extends DialogFragment {

    @NotNull
    public static final String TAG = "FacebookDialogFragment";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Dialog innerDialog;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/os/Bundle;", "values", "Lcom/facebook/FacebookException;", "error", "", "onComplete", "(Landroid/os/Bundle;Lcom/facebook/FacebookException;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a implements WebDialog.OnCompleteListener {
        public a() {
        }

        @Override // com.facebook.internal.WebDialog.OnCompleteListener
        public final void onComplete(@Nullable Bundle bundle, @Nullable FacebookException facebookException) {
            FacebookDialogFragment.this.a(bundle, facebookException);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/os/Bundle;", "values", "Lcom/facebook/FacebookException;", "<anonymous parameter 1>", "", "onComplete", "(Landroid/os/Bundle;Lcom/facebook/FacebookException;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b implements WebDialog.OnCompleteListener {
        public b() {
        }

        @Override // com.facebook.internal.WebDialog.OnCompleteListener
        public final void onComplete(@Nullable Bundle bundle, @Nullable FacebookException facebookException) {
            FacebookDialogFragment.this.b(bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Bundle values, FacebookException error) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(error == null ? -1 : 0, NativeProtocol.createProtocolResultIntent(activity.getIntent(), values, error));
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Bundle values) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intent intent = new Intent();
            if (values == null) {
                values = new Bundle();
            }
            intent.putExtras(values);
            activity.setResult(-1, intent);
            activity.finish();
        }
    }

    @Nullable
    public final Dialog getInnerDialog() {
        return this.innerDialog;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @VisibleForTesting
    public final void initDialog$facebook_common_release() {
        FragmentActivity activity;
        WebDialog webDialogNewInstance;
        if (this.innerDialog == null && (activity = getActivity()) != null) {
            Bundle methodArgumentsFromIntent = NativeProtocol.getMethodArgumentsFromIntent(activity.getIntent());
            if (methodArgumentsFromIntent != null ? methodArgumentsFromIntent.getBoolean(NativeProtocol.WEB_DIALOG_IS_FALLBACK, false) : false) {
                String string = methodArgumentsFromIntent != null ? methodArgumentsFromIntent.getString("url") : null;
                if (Utility.isNullOrEmpty(string)) {
                    Utility.logd(TAG, "Cannot start a fallback WebDialog with an empty/missing 'url'");
                    activity.finish();
                    return;
                }
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format("fb%s://bridge/", Arrays.copyOf(new Object[]{FacebookSdk.getApplicationId()}, 1));
                FacebookWebFallbackDialog.Companion companion = FacebookWebFallbackDialog.INSTANCE;
                Objects.requireNonNull(string, "null cannot be cast to non-null type kotlin.String");
                webDialogNewInstance = companion.newInstance(activity, string, str);
                webDialogNewInstance.setOnCompleteListener(new b());
            } else {
                String string2 = methodArgumentsFromIntent != null ? methodArgumentsFromIntent.getString("action") : null;
                Bundle bundle = methodArgumentsFromIntent != null ? methodArgumentsFromIntent.getBundle("params") : null;
                if (Utility.isNullOrEmpty(string2)) {
                    Utility.logd(TAG, "Cannot start a WebDialog with an empty/missing 'actionName'");
                    activity.finish();
                    return;
                } else {
                    Objects.requireNonNull(string2, "null cannot be cast to non-null type kotlin.String");
                    webDialogNewInstance = new WebDialog.Builder(activity, string2, bundle).setOnCompleteListener(new a()).build();
                }
            }
            this.innerDialog = webDialogNewInstance;
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if ((this.innerDialog instanceof WebDialog) && isResumed()) {
            Dialog dialog = this.innerDialog;
            Objects.requireNonNull(dialog, "null cannot be cast to non-null type com.facebook.internal.WebDialog");
            ((WebDialog) dialog).resize();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDialog$facebook_common_release();
    }

    @Override // androidx.fragment.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        Dialog dialog = this.innerDialog;
        if (dialog != null) {
            Objects.requireNonNull(dialog, "null cannot be cast to non-null type android.app.Dialog");
            return dialog;
        }
        a(null, null);
        setShowsDialog(false);
        return super.onCreateDialog(savedInstanceState);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Dialog dialog = getDialog();
        if (dialog != null && getRetainInstance()) {
            dialog.setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Dialog dialog = this.innerDialog;
        if (dialog instanceof WebDialog) {
            Objects.requireNonNull(dialog, "null cannot be cast to non-null type com.facebook.internal.WebDialog");
            ((WebDialog) dialog).resize();
        }
    }

    public final void setInnerDialog(@Nullable Dialog dialog) {
        this.innerDialog = dialog;
    }
}
