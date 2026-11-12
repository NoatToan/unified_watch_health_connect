package com.huami.message.ui.widget;

import android.app.Dialog;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialogFragment;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.message.ui.R;
import com.huami.message.ui.widget.NotificationAlertDialogFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\"\u0010#J\u0018\u0010\u0006\u001a\u00020\u00032\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004J\u0018\u0010\t\u001a\u00020\u00032\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0007J\u0018\u0010\f\u001a\u00020\u00032\u0010\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\nJ&\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\u0006\u0010\u0019\u001a\u00020\u0018R$\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0004\u0018\u0001`\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0004\u0018\u0001`\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR$\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0004\u0018\u0001`\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lcom/huami/message/ui/widget/NotificationAlertDialogFragment;", "Landroidx/appcompat/app/AppCompatDialogFragment;", "Lkotlin/Function0;", "", "Lcom/huami/message/ui/widget/OnCloseButtonClickListener;", "mOnCloseButtonClickListener", "setOnCloseButtonClickListener", "Lcom/huami/message/ui/widget/OnNotReminderClickListener;", "mOnNotReminderClickListener", "setOnNotReminderClickListener", "Lcom/huami/message/ui/widget/OnToOpenClickListener;", "mOnToOpenClickListener", "setOnToOpenClickListener", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onStart", "", "isFullScreen", "a", "Lkotlin/jvm/functions/Function0;", "b", "c", "", GoogleApiAvailabilityLight.a, LogUtil.I, "mDialogGravity", "<init>", "()V", "Companion", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
public final class NotificationAlertDialogFragment extends AppCompatDialogFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> mOnCloseButtonClickListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> mOnNotReminderClickListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> mOnToOpenClickListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int mDialogGravity = 80;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\u0006"}, d2 = {"Lcom/huami/message/ui/widget/NotificationAlertDialogFragment$Companion;", "", "Lcom/huami/message/ui/widget/NotificationAlertDialogFragment;", "newInstance", "<init>", "()V", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final NotificationAlertDialogFragment newInstance() {
            return new NotificationAlertDialogFragment();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(NotificationAlertDialogFragment notificationAlertDialogFragment, View view) {
        Function0<Unit> function0 = notificationAlertDialogFragment.mOnCloseButtonClickListener;
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(NotificationAlertDialogFragment notificationAlertDialogFragment, View view) {
        Function0<Unit> function0 = notificationAlertDialogFragment.mOnNotReminderClickListener;
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(NotificationAlertDialogFragment notificationAlertDialogFragment, View view) {
        Function0<Unit> function0 = notificationAlertDialogFragment.mOnToOpenClickListener;
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final boolean isFullScreen() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.mc_dialog_panel, (ViewGroup) null);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            requireActivity().getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
            Window window = dialog.getWindow();
            if (window == null) {
                return;
            }
            window.setLayout(-1, -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Dialog dialog = getDialog();
        Window window = dialog == null ? null : dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = this.mDialogGravity;
            attributes.width = -1;
            if (isFullScreen()) {
                attributes.height = -1;
            } else {
                attributes.height = -2;
            }
            window.setAttributes(attributes);
        }
        ((ImageView) view.findViewById(R.id.close)).setOnClickListener(new View.OnClickListener() { // from class: ag5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                NotificationAlertDialogFragment.d(this.a, view2);
            }
        });
        ((TextView) view.findViewById(R.id.not_remider)).setOnClickListener(new View.OnClickListener() { // from class: yf5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                NotificationAlertDialogFragment.e(this.a, view2);
            }
        });
        ((TextView) view.findViewById(R.id.go_open)).setOnClickListener(new View.OnClickListener() { // from class: zf5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                NotificationAlertDialogFragment.f(this.a, view2);
            }
        });
        super.onViewCreated(view, savedInstanceState);
    }

    public final void setOnCloseButtonClickListener(@NotNull Function0<Unit> mOnCloseButtonClickListener) {
        this.mOnCloseButtonClickListener = mOnCloseButtonClickListener;
    }

    public final void setOnNotReminderClickListener(@NotNull Function0<Unit> mOnNotReminderClickListener) {
        this.mOnNotReminderClickListener = mOnNotReminderClickListener;
    }

    public final void setOnToOpenClickListener(@NotNull Function0<Unit> mOnToOpenClickListener) {
        this.mOnToOpenClickListener = mOnToOpenClickListener;
    }
}
