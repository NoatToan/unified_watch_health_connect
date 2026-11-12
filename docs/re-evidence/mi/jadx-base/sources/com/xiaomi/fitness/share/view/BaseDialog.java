package com.xiaomi.fitness.share.view;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.passport.ui.settings.SimpleDialogFragment;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.gki;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated(level = DeprecationLevel.WARNING, message = "no reason")
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u0000 G2\u00020\u0001:\u0005DEFGHB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0011\u001a\u00020\u00002\f\b\u0001\u0010\u0012\u001a\u00020\u0013\"\u00020\u0005J\u001e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0005J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0019H\u0016J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u000eJ\n\u0010\u001c\u001a\u0004\u0018\u00010\u000eH\u0016J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0010J\n\u0010\u001e\u001a\u0004\u0018\u00010\u0010H\u0016J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020 J\b\u0010\"\u001a\u0004\u0018\u00010 J\n\u0010#\u001a\u0004\u0018\u00010 H\u0016J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&J\u0010\u0010'\u001a\u00020\u00002\b\b\u0001\u0010(\u001a\u00020\u0005J\b\u0010)\u001a\u00020\u0005H\u0017J\u0010\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0005H\u0016J\b\u0010,\u001a\u00020\u0005H\u0016J\u0010\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0005H\u0016J\b\u0010/\u001a\u00020\u0005H\u0016J\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0016J\u0010\u00104\u001a\u0002012\b\u00105\u001a\u0004\u0018\u000106J\b\u00107\u001a\u000201H\u0016J&\u00108\u001a\u0004\u0018\u0001092\u0006\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\u001a\u0010@\u001a\u0002012\u0006\u0010A\u001a\u0002092\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\u0010\u0010B\u001a\u0002012\u0006\u0010A\u001a\u000209H\u0016J\b\u0010C\u001a\u000201H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Lcom/xiaomi/fitness/share/view/BaseDialog;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "mOffsetX", "", "mOffsetY", "mGravity", "mClickIds", "", "mLayoutRes", "mWidth", "mHeight", "mBindViewListener", "Lcom/xiaomi/fitness/share/view/BaseDialog$OnBindViewListener;", "mDismissListener", "Lcom/xiaomi/fitness/share/view/BaseDialog$OnDismissListener;", "setViewClick", "ids", "", "setGravity", "gravity", "x", "y", "getViewClick", "", "setOnBindViewListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "getBindViewListener", "setOnDismissListener", "getDismissListener", "mOnClickListener", "Lcom/xiaomi/fitness/share/view/BaseDialog$OnViewClickListener;", "setOnClickListener", "getClickListener", "getOnClickListener", SimpleDialogFragment.ARG_CANCELABLE, BroadcastsKt.SILENT_PUSHING_CANCEL, "", "setLayoutRes", "id", "getLayoutRes", "setWidth", "width", "getWidth", "setHeight", "height", "getHeight", "onDismiss", "", "dialog", "Landroid/content/DialogInterface;", "show", "manager", "Landroidx/fragment/app/FragmentManager;", "dismiss", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "initView", LifecycleConstantKt.ON_START, "OnBindViewListener", "OnDismissListener", "OnViewClickListener", "Companion", "DialogHolder", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class BaseDialog extends DialogFragment {
    public static final int DEFAULT_HEIGHT = -2;

    @Nullable
    private OnBindViewListener mBindViewListener;

    @Nullable
    private OnDismissListener mDismissListener;
    private int mLayoutRes;
    private int mOffsetX;
    private int mOffsetY;

    @Nullable
    private OnViewClickListener mOnClickListener;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static int DEFAULT_WIDTH = DisplayUtil.getScreenWidth();
    private int mGravity = 80;

    @NotNull
    private Set<Integer> mClickIds = new LinkedHashSet();
    private int mWidth = DEFAULT_WIDTH;
    private int mHeight = -2;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/share/view/BaseDialog$Companion;", "", "<init>", "()V", "DEFAULT_WIDTH", "", "getDEFAULT_WIDTH", "()I", "setDEFAULT_WIDTH", "(I)V", "DEFAULT_HEIGHT", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getDEFAULT_WIDTH() {
            return BaseDialog.DEFAULT_WIDTH;
        }

        public final void setDEFAULT_WIDTH(int i) {
            BaseDialog.DEFAULT_WIDTH = i;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u0002H\u000e\"\b\b\u0000\u0010\u000e*\u00020\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0014\u001a\u00020\u00002\b\b\u0001\u0010\u000f\u001a\u00020\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/share/view/BaseDialog$DialogHolder;", "Landroid/view/View$OnClickListener;", "view", "Landroid/view/View;", "mDialog", "Lcom/xiaomi/fitness/share/view/BaseDialog;", "<init>", "(Landroid/view/View;Lcom/xiaomi/fitness/share/view/BaseDialog;)V", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "mViews", "Landroid/util/SparseArray;", "T", "viewId", "", "(I)Landroid/view/View;", "onClick", "", "addOnClickListener", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DialogHolder implements View.OnClickListener {

        @NotNull
        private final BaseDialog mDialog;

        @NotNull
        private final SparseArray<View> mViews;

        @NotNull
        private View view;

        public DialogHolder(@NotNull View view, @NotNull BaseDialog mDialog) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(mDialog, "mDialog");
            this.view = view;
            this.mDialog = mDialog;
            this.mViews = new SparseArray<>();
        }

        @NotNull
        public final DialogHolder addOnClickListener(int viewId) {
            getView(viewId).setOnClickListener(this);
            return this;
        }

        @NotNull
        public final View getView() {
            return this.view;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (this.mDialog.getOnClickListener() != null) {
                OnViewClickListener onClickListener = this.mDialog.getOnClickListener();
                Intrinsics.checkNotNull(onClickListener);
                onClickListener.onClick(this, view, this.mDialog);
            }
        }

        public final void setView(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "<set-?>");
            this.view = view;
        }

        @NotNull
        public final <T extends View> T getView(int viewId) {
            T t = (T) this.mViews.get(viewId);
            if (t == null) {
                t = (T) this.view.findViewById(viewId);
                this.mViews.put(viewId, t);
            }
            Intrinsics.checkNotNull(t, "null cannot be cast to non-null type T of com.xiaomi.fitness.share.view.BaseDialog.DialogHolder.getView");
            return t;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/share/view/BaseDialog$OnBindViewListener;", "", "bindView", "", "viewHolder", "Lcom/xiaomi/fitness/share/view/BaseDialog$DialogHolder;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnBindViewListener {
        void bindView(@NotNull DialogHolder viewHolder);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/share/view/BaseDialog$OnDismissListener;", "", "onDismiss", "", "dialog", "Landroid/content/DialogInterface;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnDismissListener {
        void onDismiss(@Nullable DialogInterface dialog);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/share/view/BaseDialog$OnViewClickListener;", "", "onClick", "", "viewHolder", "Lcom/xiaomi/fitness/share/view/BaseDialog$DialogHolder;", "view", "Landroid/view/View;", "dialog", "Lcom/xiaomi/fitness/share/view/BaseDialog;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnViewClickListener {
        void onClick(@NotNull DialogHolder viewHolder, @NotNull View view, @NotNull BaseDialog dialog);
    }

    @NotNull
    public final BaseDialog cancelable(boolean cancel) {
        setCancelable(cancel);
        return this;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        if (isAdded()) {
            dismissAllowingStateLoss();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: getBindViewListener, reason: from getter */
    public OnBindViewListener getMBindViewListener() {
        return this.mBindViewListener;
    }

    @Nullable
    /* JADX INFO: renamed from: getClickListener, reason: from getter */
    public final OnViewClickListener getMOnClickListener() {
        return this.mOnClickListener;
    }

    @Nullable
    /* JADX INFO: renamed from: getDismissListener, reason: from getter */
    public OnDismissListener getMDismissListener() {
        return this.mDismissListener;
    }

    /* JADX INFO: renamed from: getHeight, reason: from getter */
    public int getMHeight() {
        return this.mHeight;
    }

    /* JADX INFO: renamed from: getLayoutRes, reason: from getter */
    public int getMLayoutRes() {
        return this.mLayoutRes;
    }

    @Nullable
    public OnViewClickListener getOnClickListener() {
        return this.mOnClickListener;
    }

    @NotNull
    public Set<Integer> getViewClick() {
        return this.mClickIds;
    }

    /* JADX INFO: renamed from: getWidth, reason: from getter */
    public int getMWidth() {
        return this.mWidth;
    }

    public void initView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        DialogHolder dialogHolder = new DialogHolder(view, this);
        Iterator<Integer> it = getViewClick().iterator();
        while (it.hasNext()) {
            dialogHolder.addOnClickListener(it.next().intValue());
        }
        OnBindViewListener mBindViewListener = getMBindViewListener();
        if (mBindViewListener != null) {
            mBindViewListener.bindView(dialogHolder);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Dialog dialog = getDialog();
        Window window = dialog != null ? dialog.getWindow() : null;
        if (window != null) {
            window.requestFeature(1);
            window.setGravity(this.mGravity);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.x = this.mOffsetX;
            attributes.y = this.mOffsetY;
            window.setAttributes(attributes);
        }
        return inflater.inflate(getMLayoutRes(), container);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        OnDismissListener mDismissListener = getMDismissListener();
        if (mDismissListener != null) {
            mDismissListener.onDismiss(dialog);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        Window window2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setLayout(this.mWidth, this.mHeight);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null) {
            return;
        }
        window.setBackgroundDrawableResource(gki.common_transparent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Window window;
        Window window2;
        Intrinsics.checkNotNullParameter(view, "view");
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setBackgroundDrawableResource(gki.common_transparent);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            window.setLayout(this.mWidth, this.mHeight);
        }
        super.onViewCreated(view, savedInstanceState);
        initView(view);
    }

    @NotNull
    public final BaseDialog setGravity(int gravity, int x, int y) {
        this.mGravity = gravity;
        this.mOffsetX = x;
        this.mOffsetY = y;
        return this;
    }

    @NotNull
    public BaseDialog setHeight(int height) {
        this.mHeight = height;
        return this;
    }

    @NotNull
    public final BaseDialog setLayoutRes(int id) {
        this.mLayoutRes = id;
        return this;
    }

    @NotNull
    public final BaseDialog setOnBindViewListener(@NotNull OnBindViewListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mBindViewListener = listener;
        return this;
    }

    @NotNull
    public final BaseDialog setOnClickListener(@NotNull OnViewClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mOnClickListener = listener;
        return this;
    }

    @NotNull
    public final BaseDialog setOnDismissListener(@NotNull OnDismissListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mDismissListener = listener;
        return this;
    }

    @NotNull
    public final BaseDialog setViewClick(@NotNull int... ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        this.mClickIds.addAll(ArraysKt___ArraysKt.toMutableSet(ids));
        return this;
    }

    @NotNull
    public BaseDialog setWidth(int width) {
        this.mWidth = width;
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

    @NotNull
    public final BaseDialog setGravity(int gravity) {
        setGravity(gravity, 0, 0);
        return this;
    }
}
