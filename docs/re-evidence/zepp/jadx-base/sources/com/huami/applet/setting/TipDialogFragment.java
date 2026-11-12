package com.huami.applet.setting;

import android.R;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.alipay.sdk.m.x.d;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.applet.setting.TipDialogFragment;
import com.twitter.sdk.android.tweetcomposer.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\rJ\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0012J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b¨\u0006\""}, d2 = {"Lcom/huami/applet/setting/TipDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "", "onViewCreated", "", "title", d.o, "confirmTxt", "setConfirmTxt", "", "isShowing", g.g, "setCanceledOnTouchOutside", "Landroidx/fragment/app/FragmentActivity;", "activity", "showDialog", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "tvTitle", "b", "tvConfirm", "<init>", "()V", "Companion", "applet_release"}, k = 1, mv = {1, 5, 1})
public final class TipDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static String c = "";

    @NotNull
    private static String d = "";

    @Nullable
    private static Function1<? super View, Unit> e;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private TextView tvTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private TextView tvConfirm;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR$\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/huami/applet/setting/TipDialogFragment$Companion;", "", "", "title", "confirmTxt", "Lkotlin/Function1;", "Landroid/view/View;", "", "invoke", "Lcom/huami/applet/setting/TipDialogFragment;", "create", "confirmContent", "Ljava/lang/String;", "confirmInvoke", "Lkotlin/jvm/functions/Function1;", "titleTxt", "<init>", "()V", "applet_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TipDialogFragment create$default(Companion companion, String str, String str2, Function1 function1, int i, Object obj) {
            if ((i & 4) != 0) {
                function1 = null;
            }
            return companion.create(str, str2, function1);
        }

        @NotNull
        public final TipDialogFragment create(@NotNull String title, @NotNull String confirmTxt, @Nullable Function1<? super View, Unit> invoke) {
            TipDialogFragment.c = title;
            TipDialogFragment.d = confirmTxt;
            TipDialogFragment.e = invoke;
            return new TipDialogFragment(null);
        }
    }

    private TipDialogFragment() {
    }

    public /* synthetic */ TipDialogFragment(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(View view, TipDialogFragment tipDialogFragment, View view2) {
        Function1<? super View, Unit> function1 = e;
        if (function1 != null) {
            function1.invoke(view);
        }
        tipDialogFragment.dismiss();
    }

    public final boolean isShowing() {
        return isVisible() && isAdded();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Window window;
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.requestWindowFeature(1);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            window.setBackgroundDrawableResource(R.color.transparent);
        }
        return inflater.inflate(com.huami.applet.R.layout.applet_fragment_dialog_tip, container);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull final View view, @Nullable Bundle savedInstanceState) {
        TextView textView = (TextView) view.findViewById(com.huami.applet.R.id.tv_tip);
        this.tvTitle = textView;
        if (textView != null) {
            textView.setText(c);
        }
        TextView textView2 = (TextView) view.findViewById(com.huami.applet.R.id.tv_confirm);
        this.tvConfirm = textView2;
        if (textView2 != null) {
            textView2.setText(d);
        }
        View viewFindViewById = view.findViewById(com.huami.applet.R.id.view_bottom);
        if (viewFindViewById == null) {
            return;
        }
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: bp7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TipDialogFragment.b(view, this, view2);
            }
        });
    }

    @NotNull
    public final TipDialogFragment setCanceledOnTouchOutside(boolean cancel) {
        setCancelable(cancel);
        return this;
    }

    public final void setConfirmTxt(@NotNull String confirmTxt) {
        TextView textView = this.tvConfirm;
        if (textView == null) {
            return;
        }
        textView.setText(confirmTxt);
    }

    public final void setTitle(@NotNull String title) {
        TextView textView = this.tvTitle;
        if (textView == null) {
            return;
        }
        textView.setText(title);
    }

    @NotNull
    public final TipDialogFragment showDialog(@NotNull FragmentActivity activity) {
        show(activity.getSupportFragmentManager(), TipDialogFragment.class.getSimpleName());
        return this;
    }
}
