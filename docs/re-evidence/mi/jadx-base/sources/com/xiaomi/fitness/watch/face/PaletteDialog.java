package com.xiaomi.fitness.watch.face;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.watch.face.PaletteDialog;
import com.xiaomi.fitness.watch.face.view.PaletteView;
import defpackage.iki;
import defpackage.isi;
import defpackage.ovi;
import defpackage.w2j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001)B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u001a\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u001d\u001a\u00020\u0012H\u0016J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0002J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0002J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0006J\u0006\u0010\"\u001a\u00020\bJ\u000e\u0010#\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\rJ\u0010\u0010$\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010&J\u0010\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u0016H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/watch/face/PaletteDialog;", "Landroidx/fragment/app/DialogFragment;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "onColorChangeListener", "Lcom/xiaomi/fitness/watch/face/PaletteDialog$OnColorChangeListener;", "width", "", "gravityYOffset", "onConfirmListener", "onCancelListener", "onDismissListener", "Landroid/content/DialogInterface$OnDismissListener;", "paletteView", "Lcom/xiaomi/fitness/watch/face/view/PaletteView;", "currentColor", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", LifecycleConstantKt.ON_START, "setOnConfirm", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnCancel", "setOnColorChange", "getColor", "setOnDismissListener", "show", "manager", "Landroidx/fragment/app/FragmentManager;", "onClick", "v", "OnColorChangeListener", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PaletteDialog extends DialogFragment implements View.OnClickListener {

    @Nullable
    private View.OnClickListener onCancelListener;

    @Nullable
    private OnColorChangeListener onColorChangeListener;

    @Nullable
    private View.OnClickListener onConfirmListener;

    @Nullable
    private DialogInterface.OnDismissListener onDismissListener;
    private PaletteView paletteView;
    private final int width = DisplayUtil.getScreenWidth() - DisplayUtil.dip2px(10.0f);
    private final int gravityYOffset = DisplayUtil.dip2px(10.0f);
    private int currentColor = -1;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/watch/face/PaletteDialog$OnColorChangeListener;", "", "onColorChange", "", "color", "", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnColorChangeListener {
        void onColorChange(int color);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onStart$lambda$2(PaletteDialog this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OnColorChangeListener onColorChangeListener = this$0.onColorChangeListener;
        if (onColorChangeListener != null) {
            onColorChangeListener.onColorChange(this$0.currentColor);
        }
        DialogInterface.OnDismissListener onDismissListener = this$0.onDismissListener;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(PaletteDialog this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.currentColor = i;
        OnColorChangeListener onColorChangeListener = this$0.onColorChangeListener;
        if (onColorChangeListener != null) {
            onColorChangeListener.onColorChange(i);
        }
        return Unit.INSTANCE;
    }

    public final int getColor() {
        PaletteView paletteView = this.paletteView;
        if (paletteView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paletteView");
            paletteView = null;
        }
        return paletteView.getColor();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        int id = v.getId();
        if (id == isi.k1) {
            dismissAllowingStateLoss();
            View.OnClickListener onClickListener = this.onConfirmListener;
            if (onClickListener != null) {
                onClickListener.onClick(v);
                return;
            }
            return;
        }
        if (id == isi.w) {
            dismissAllowingStateLoss();
            View.OnClickListener onClickListener2 = this.onCancelListener;
            if (onClickListener2 != null) {
                onClickListener2.onClick(v);
            }
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(1, w2j.f37483a);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Dialog dialog = getDialog();
        Window window = dialog != null ? dialog.getWindow() : null;
        if (window != null) {
            window.setGravity(80);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.y = this.gravityYOffset;
            window.setAttributes(attributes);
        }
        return inflater.inflate(ovi.f29736b, container, false);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        Window window2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setLayout(this.width, -2);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            window.setBackgroundDrawableResource(iki.common_transparent);
        }
        Dialog dialog3 = getDialog();
        if (dialog3 != null) {
            dialog3.setCanceledOnTouchOutside(true);
        }
        Dialog dialog4 = getDialog();
        if (dialog4 != null) {
            dialog4.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: tjh
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    PaletteDialog.onStart$lambda$2(this.f34764a, dialogInterface);
                }
            });
        }
        setCancelable(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ((TextView) view.findViewById(isi.k1)).setOnClickListener(this);
        ((TextView) view.findViewById(isi.w)).setOnClickListener(this);
        PaletteView paletteView = (PaletteView) view.findViewById(isi.p1);
        this.paletteView = paletteView;
        if (paletteView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paletteView");
            paletteView = null;
        }
        paletteView.setOnColorChange(new Function1() { // from class: sjh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PaletteDialog.onViewCreated$lambda$1(this.f33705a, ((Integer) obj).intValue());
            }
        });
    }

    @NotNull
    public final PaletteDialog setOnCancel(@NotNull View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onCancelListener = listener;
        return this;
    }

    @NotNull
    public final PaletteDialog setOnColorChange(@NotNull OnColorChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onColorChangeListener = listener;
        return this;
    }

    @NotNull
    public final PaletteDialog setOnConfirm(@NotNull View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onConfirmListener = listener;
        return this;
    }

    @NotNull
    public final PaletteDialog setOnDismissListener(@NotNull DialogInterface.OnDismissListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onDismissListener = listener;
        return this;
    }

    public final void show(@Nullable FragmentManager manager) {
        if (manager != null) {
            k kVarO = manager.o();
            Intrinsics.checkNotNullExpressionValue(kVarO, "beginTransaction(...)");
            kVarO.f(this, null);
            kVarO.m();
        }
    }
}
