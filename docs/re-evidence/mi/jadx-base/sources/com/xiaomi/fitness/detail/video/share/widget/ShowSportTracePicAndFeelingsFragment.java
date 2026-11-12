package com.xiaomi.fitness.detail.video.share.widget;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.u2j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u000245B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J&\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u001a\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u0014\u001a\u00020\u0007H\u0016J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u000e\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001dJ\u0006\u0010\u001f\u001a\u00020\u001dJ\u0006\u0010 \u001a\u00020\u001dJ\u0006\u0010!\u001a\u00020\u001dJ\u0006\u0010\"\u001a\u00020\u001dJ\b\u0010#\u001a\u0004\u0018\u00010\u000bJ\b\u0010$\u001a\u00020\u001dH\u0007J\u0006\u0010%\u001a\u00020&J\b\u0010'\u001a\u0004\u0018\u00010(J\b\u0010)\u001a\u0004\u0018\u00010*J\b\u0010+\u001a\u0004\u0018\u00010,J\u001a\u0010-\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010.J\u0014\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0007\u0018\u000100J\b\u00101\u001a\u0004\u0018\u000102J\u001a\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001b2\b\u00103\u001a\u0004\u0018\u000102H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/xiaomi/fitness/detail/video/share/widget/ShowSportTracePicAndFeelingsFragment;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "controller", "Lcom/xiaomi/fitness/detail/video/share/widget/DialogController;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onSaveInstanceState", "outState", "onViewCreated", "view", LifecycleConstantKt.ON_START, "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onCancel", "show", "manager", "Landroidx/fragment/app/FragmentManager;", "getWidth", "", "getHeight", "getGravity", "getOffsetX", "getOffsetY", "getAnimation", "getDialogView", "getLayoutRes", "isCanceledOnTouchOutside", "", "getOnDismissListener", "Landroid/content/DialogInterface$OnDismissListener;", "getOnCancelListener", "Landroid/content/DialogInterface$OnCancelListener;", "getClickIds", "", "getOnViewClick", "Lkotlin/Function2;", "getOnViewBind", "Lkotlin/Function1;", "getFragmentTag", "", "tag", "Builder", "Holder", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nShowSportTracePicAndFeelingsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShowSportTracePicAndFeelingsFragment.kt\ncom/xiaomi/fitness/detail/video/share/widget/ShowSportTracePicAndFeelingsFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n1#2:175\n*E\n"})
public final class ShowSportTracePicAndFeelingsFragment extends DialogFragment {

    @NotNull
    private DialogController controller = new DialogController();

    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00002\b\b\u0001\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\bJ\u0010\u0010\r\u001a\u00020\u00002\b\b\u0001\u0010\u000e\u001a\u00020\bJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014J$\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\bH\u0007J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!J \u0010\"\u001a\u00020\u00002\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$J\u0012\u0010'\u001a\u00020\u00002\n\u0010(\u001a\u00020)\"\u00020\bJ\u001a\u0010*\u001a\u00020\u00002\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020&0,J\u0006\u0010-\u001a\u00020%R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/xiaomi/fitness/detail/video/share/widget/ShowSportTracePicAndFeelingsFragment$Builder;", "", "<init>", "()V", "param", "Lcom/xiaomi/fitness/detail/video/share/widget/DialogController$Params;", "setLayoutRes", "layoutRes", "", "setWidth", "width", "setHeight", "height", "setAnimationRes", "res", "setCanceledOnTouchOutside", BroadcastsKt.SILENT_PUSHING_CANCEL, "", "setTag", "tag", "", "setGravity", "gravity", "offsetX", "offsetY", "setOnDismissListener", "onDismissListener", "Landroid/content/DialogInterface$OnDismissListener;", "setOnCancelListener", "onCancelListener", "Landroid/content/DialogInterface$OnCancelListener;", "setView", "view", "Landroid/view/View;", "setOnViewClick", "onViewClick", "Lkotlin/Function2;", "Lcom/xiaomi/fitness/detail/video/share/widget/ShowSportTracePicAndFeelingsFragment;", "", "addClickIds", "clickIds", "", "setOnViewBind", "onViewBind", "Lkotlin/Function1;", "create", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nShowSportTracePicAndFeelingsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShowSportTracePicAndFeelingsFragment.kt\ncom/xiaomi/fitness/detail/video/share/widget/ShowSportTracePicAndFeelingsFragment$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n1#2:175\n*E\n"})
    public static final class Builder {

        @NotNull
        private final DialogController.Params param = new DialogController.Params();

        public static /* synthetic */ Builder setGravity$default(Builder builder, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                i2 = 0;
            }
            if ((i4 & 4) != 0) {
                i3 = 0;
            }
            return builder.setGravity(i, i2, i3);
        }

        @NotNull
        public final Builder addClickIds(@NotNull int... clickIds) {
            Intrinsics.checkNotNullParameter(clickIds, "clickIds");
            this.param.setClickIds(clickIds);
            return this;
        }

        @NotNull
        public final ShowSportTracePicAndFeelingsFragment create() {
            ShowSportTracePicAndFeelingsFragment showSportTracePicAndFeelingsFragment = new ShowSportTracePicAndFeelingsFragment();
            this.param.apply(showSportTracePicAndFeelingsFragment.controller);
            return showSportTracePicAndFeelingsFragment;
        }

        @NotNull
        public final Builder setAnimationRes(int res) {
            this.param.setAnimationStyle(res);
            return this;
        }

        @NotNull
        public final Builder setCanceledOnTouchOutside(boolean cancel) {
            this.param.setCanceledOnTouchOutside(cancel);
            return this;
        }

        @JvmOverloads
        @NotNull
        public final Builder setGravity(int i) {
            return setGravity$default(this, i, 0, 0, 6, null);
        }

        @NotNull
        public final Builder setHeight(int height) {
            this.param.setHeight(height);
            return this;
        }

        @NotNull
        public final Builder setLayoutRes(int layoutRes) {
            this.param.setLayoutRes(layoutRes);
            return this;
        }

        @NotNull
        public final Builder setOnCancelListener(@NotNull DialogInterface.OnCancelListener onCancelListener) {
            Intrinsics.checkNotNullParameter(onCancelListener, "onCancelListener");
            this.param.setOnCancelListener(onCancelListener);
            return this;
        }

        @NotNull
        public final Builder setOnDismissListener(@NotNull DialogInterface.OnDismissListener onDismissListener) {
            Intrinsics.checkNotNullParameter(onDismissListener, "onDismissListener");
            this.param.setOnDismissListener(onDismissListener);
            return this;
        }

        @NotNull
        public final Builder setOnViewBind(@NotNull Function1<? super View, Unit> onViewBind) {
            Intrinsics.checkNotNullParameter(onViewBind, "onViewBind");
            this.param.setOnViewBind(onViewBind);
            return this;
        }

        @NotNull
        public final Builder setOnViewClick(@NotNull Function2<? super View, ? super ShowSportTracePicAndFeelingsFragment, Unit> onViewClick) {
            Intrinsics.checkNotNullParameter(onViewClick, "onViewClick");
            this.param.setOnViewClick(onViewClick);
            return this;
        }

        @NotNull
        public final Builder setTag(@NotNull String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            this.param.setTag(tag);
            return this;
        }

        @NotNull
        public final Builder setView(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.param.setView(view);
            return this;
        }

        @NotNull
        public final Builder setWidth(int width) {
            this.param.setWidth(width);
            return this;
        }

        @JvmOverloads
        @NotNull
        public final Builder setGravity(int i, int i2) {
            return setGravity$default(this, i, i2, 0, 4, null);
        }

        @JvmOverloads
        @NotNull
        public final Builder setGravity(int gravity, int offsetX, int offsetY) {
            this.param.setGravity(gravity);
            this.param.setOffsetX(offsetX);
            this.param.setOffsetY(offsetY);
            return this;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016J\"\u0010\u000f\u001a\u00020\n2\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/detail/video/share/widget/ShowSportTracePicAndFeelingsFragment$Holder;", "Landroid/view/View$OnClickListener;", "view", "Landroid/view/View;", "dialog", "Lcom/xiaomi/fitness/detail/video/share/widget/ShowSportTracePicAndFeelingsFragment;", "<init>", "(Landroid/view/View;Lcom/xiaomi/fitness/detail/video/share/widget/ShowSportTracePicAndFeelingsFragment;)V", "onClick", "Lkotlin/Function2;", "", "addClickIds", "clickIds", "", "v", "setOnViewClick", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nShowSportTracePicAndFeelingsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShowSportTracePicAndFeelingsFragment.kt\ncom/xiaomi/fitness/detail/video/share/widget/ShowSportTracePicAndFeelingsFragment$Holder\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,174:1\n13423#2,2:175\n*S KotlinDebug\n*F\n+ 1 ShowSportTracePicAndFeelingsFragment.kt\ncom/xiaomi/fitness/detail/video/share/widget/ShowSportTracePicAndFeelingsFragment$Holder\n*L\n148#1:175,2\n*E\n"})
    public static final class Holder implements View.OnClickListener {

        @NotNull
        private final ShowSportTracePicAndFeelingsFragment dialog;

        @Nullable
        private Function2<? super View, ? super ShowSportTracePicAndFeelingsFragment, Unit> onClick;

        @NotNull
        private final View view;

        public Holder(@NotNull View view, @NotNull ShowSportTracePicAndFeelingsFragment dialog) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            this.view = view;
            this.dialog = dialog;
        }

        public final void addClickIds(@NotNull int[] clickIds) {
            Intrinsics.checkNotNullParameter(clickIds, "clickIds");
            for (int i : clickIds) {
                this.view.findViewById(i).setOnClickListener(this);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@NotNull View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            Function2<? super View, ? super ShowSportTracePicAndFeelingsFragment, Unit> function2 = this.onClick;
            if (function2 != null) {
                function2.invoke(v, this.dialog);
            }
        }

        public final void setOnViewClick(@Nullable Function2<? super View, ? super ShowSportTracePicAndFeelingsFragment, Unit> onClick) {
            this.onClick = onClick;
        }
    }

    public final int getAnimation() {
        return this.controller.getAnimationStyle();
    }

    @Nullable
    public final int[] getClickIds() {
        return this.controller.getClickIds();
    }

    @Nullable
    public final View getDialogView() {
        return this.controller.getView();
    }

    @Nullable
    public final String getFragmentTag() {
        return this.controller.getTag();
    }

    public final int getGravity() {
        return this.controller.getGravity();
    }

    public final int getHeight() {
        return this.controller.getHeight();
    }

    public final int getLayoutRes() {
        return this.controller.getLayoutRes();
    }

    public final int getOffsetX() {
        return this.controller.getOffsetX();
    }

    public final int getOffsetY() {
        return this.controller.getOffsetY();
    }

    @Nullable
    public final DialogInterface.OnCancelListener getOnCancelListener() {
        return this.controller.getOnCancelListener();
    }

    @Nullable
    public final DialogInterface.OnDismissListener getOnDismissListener() {
        return this.controller.getOnDismissListener();
    }

    @Nullable
    public final Function1<View, Unit> getOnViewBind() {
        return this.controller.getOnViewBind();
    }

    @Nullable
    public final Function2<View, ShowSportTracePicAndFeelingsFragment, Unit> getOnViewClick() {
        return this.controller.getOnViewClick();
    }

    public final int getWidth() {
        return this.controller.getWidth();
    }

    public final boolean isCanceledOnTouchOutside() {
        return this.controller.getIsCanceledOnTouchOutside();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onCancel(dialog);
        DialogInterface.OnCancelListener onCancelListener = getOnCancelListener();
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialog);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        DialogController dialogController;
        super.onCreate(savedInstanceState);
        setStyle(1, u2j.f35312a);
        if (savedInstanceState == null || (dialogController = (DialogController) savedInstanceState.getParcelable("saved_instance")) == null) {
            return;
        }
        this.controller = dialogController;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View dialogView = getDialogView();
        if (dialogView == null) {
            return inflater.inflate(getLayoutRes(), container);
        }
        ViewParent parent = dialogView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return dialogView;
        }
        viewGroup.removeView(dialogView);
        return dialogView;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        DialogInterface.OnDismissListener onDismissListener = getOnDismissListener();
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialog);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putParcelable("saved_instance", this.controller);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(isCanceledOnTouchOutside());
            Window window = dialog.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
                window.setLayout(getWidth(), getHeight());
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Window window;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(getWidth(), getHeight());
            window.setGravity(getGravity());
            window.getAttributes().x = getOffsetX();
            window.getAttributes().y = getOffsetY();
            window.setAttributes(window.getAttributes());
            int animation = getAnimation();
            if (animation >= 0) {
                window.setWindowAnimations(animation);
            }
        }
        Holder holder = new Holder(view, this);
        int[] clickIds = getClickIds();
        if (clickIds != null) {
            holder.addClickIds(clickIds);
        }
        holder.setOnViewClick(getOnViewClick());
        Function1<View, Unit> onViewBind = getOnViewBind();
        if (onViewBind != null) {
            onViewBind.invoke(view);
        }
    }

    public final void show(@NotNull FragmentManager manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        show(manager, "medaldialog");
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(@NotNull FragmentManager manager, @Nullable String tag) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Logger.i("ShowSportTracePicAndFeelingsFragment", "ActivityDialogFragment.show");
        if (manager.L0()) {
            return;
        }
        try {
            manager.o().v(this).l();
            super.show(manager, tag);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
