package androidx.p004activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.p004activity.ComponentDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import defpackage.q7h;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\b\u0007\u0012\u0006\u0010(\u001a\u00020'\u0012\b\b\u0003\u0010)\u001a\u00020\u0014¢\u0006\u0004\b*\u0010+J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0015¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0015¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0015¢\u0006\u0004\b\u000f\u0010\u0006J\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0013\u0010\u0006J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0016\u0010\u001aJ!\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u0016\u0010\u001dJ!\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006,"}, d2 = {"Landroidx/activity/ComponentDialog;", "Landroid/app/Dialog;", "Landroidx/lifecycle/LifecycleOwner;", "Lq7h;", "", "initViewTreeOwners", "()V", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_START, LifecycleConstantKt.ON_STOP, "Landroidx/activity/OnBackPressedDispatcher;", "getOnBackPressedDispatcher", "()Landroidx/activity/OnBackPressedDispatcher;", "onBackPressed", "", "layoutResID", "setContentView", "(I)V", "Landroid/view/View;", "view", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "addContentView", "Landroidx/lifecycle/LifecycleRegistry;", "_lifecycleRegistry", "Landroidx/lifecycle/LifecycleRegistry;", "onBackPressedDispatcher", "Landroidx/activity/OnBackPressedDispatcher;", "getLifecycleRegistry", "()Landroidx/lifecycle/LifecycleRegistry;", "lifecycleRegistry", "Landroid/content/Context;", "context", "themeResId", "<init>", "(Landroid/content/Context;I)V", "activity_release"}, k = 1, mv = {1, 6, 0})
public class ComponentDialog extends Dialog implements LifecycleOwner, q7h {

    @Nullable
    private LifecycleRegistry _lifecycleRegistry;

    @NotNull
    private final OnBackPressedDispatcher onBackPressedDispatcher;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ComponentDialog(@NotNull Context context) {
        this(context, 0, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final LifecycleRegistry getLifecycleRegistry() {
        LifecycleRegistry lifecycleRegistry = this._lifecycleRegistry;
        if (lifecycleRegistry != null) {
            return lifecycleRegistry;
        }
        LifecycleRegistry lifecycleRegistry2 = new LifecycleRegistry(this);
        this._lifecycleRegistry = lifecycleRegistry2;
        return lifecycleRegistry2;
    }

    private final void initViewTreeOwners() {
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        ViewTreeLifecycleOwner.set(window.getDecorView(), this);
        Window window2 = getWindow();
        Intrinsics.checkNotNull(window2);
        View decorView = window2.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window!!.decorView");
        View.set(decorView, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onBackPressedDispatcher$lambda-1, reason: not valid java name */
    public static final void m0onBackPressedDispatcher$lambda1(ComponentDialog this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(@NotNull View view, @Nullable ViewGroup.LayoutParams params) {
        Intrinsics.checkNotNullParameter(view, "view");
        initViewTreeOwners();
        super.addContentView(view, params);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @NotNull
    public final Lifecycle getLifecycle() {
        return getLifecycleRegistry();
    }

    @Override // defpackage.q7h
    @NotNull
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.onBackPressedDispatcher;
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.onBackPressedDispatcher.d();
    }

    @Override // android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int layoutResID) {
        initViewTreeOwners();
        super.setContentView(layoutResID);
    }

    public /* synthetic */ ComponentDialog(Context context, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ComponentDialog(@NotNull Context context, int i) {
        super(context, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.onBackPressedDispatcher = new OnBackPressedDispatcher(new Runnable() { // from class: la4
            @Override // java.lang.Runnable
            public final void run() {
                ComponentDialog.m0onBackPressedDispatcher$lambda1(this.f24821a);
            }
        });
    }

    @Override // android.app.Dialog
    public void setContentView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        initViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(@NotNull View view, @Nullable ViewGroup.LayoutParams params) {
        Intrinsics.checkNotNullParameter(view, "view");
        initViewTreeOwners();
        super.setContentView(view, params);
    }
}
