package com.huami.module.homepage.sync.view.rom;

import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.module.homepage.R;
import com.huami.module.homepage.databinding.HomepageRomDialogBinding;
import com.huami.module.homepage.sync.view.rom.RomUpdateFragment;
import com.huami.module.ktx.NumberExtKt;
import com.huami.module.ktx.ViewExtKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b!\u0010\"J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0014\u0010\u0006\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J$\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\u0016\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012J\u001a\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001f¨\u0006#"}, d2 = {"Lcom/huami/module/homepage/sync/view/rom/RomUpdateFragment;", "Landroidx/fragment/app/DialogFragment;", "Lkotlin/Function0;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "skipButtonListener", "updateButtonListener", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "onStart", "", "message", "Landroidx/fragment/app/FragmentManager;", "manager", "show", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onResume", "Lcom/huami/module/homepage/databinding/HomepageRomDialogBinding;", "a", "Lcom/huami/module/homepage/databinding/HomepageRomDialogBinding;", "binding", "b", "Ljava/lang/String;", "c", "Lkotlin/jvm/functions/Function0;", GoogleApiAvailabilityLight.a, "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class RomUpdateFragment extends DialogFragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private HomepageRomDialogBinding binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private String message = "";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> skipButtonListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> updateButtonListener;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(RomUpdateFragment romUpdateFragment, View view) {
        Function0<Unit> function0 = romUpdateFragment.skipButtonListener;
        if (function0 != null) {
            function0.invoke();
        }
        romUpdateFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(RomUpdateFragment romUpdateFragment, View view) {
        Function0<Unit> function0 = romUpdateFragment.updateButtonListener;
        if (function0 != null) {
            function0.invoke();
        }
        romUpdateFragment.dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        HomepageRomDialogBinding homepageRomDialogBindingInflate = HomepageRomDialogBinding.inflate(inflater, container, false);
        this.binding = homepageRomDialogBindingInflate;
        if (homepageRomDialogBindingInflate == null) {
            homepageRomDialogBindingInflate = null;
        }
        LinearLayout root = homepageRomDialogBindingInflate.getRoot();
        ViewExtKt.setShape(root, 6.0f, Integer.valueOf(ViewExtKt.loadColor(root, R.color.s38)));
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        HomepageRomDialogBinding homepageRomDialogBinding = this.binding;
        if (homepageRomDialogBinding == null) {
            homepageRomDialogBinding = null;
        }
        homepageRomDialogBinding.homepageRomDialogDetail.setText(this.message);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        Window window2;
        WindowManager.LayoutParams attributes;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null && (attributes = window2.getAttributes()) != null) {
            attributes.gravity = 17;
            attributes.width = Resources.getSystem().getDisplayMetrics().widthPixels - NumberExtKt.getDp(40);
            Dialog dialog2 = getDialog();
            Window window3 = dialog2 == null ? null : dialog2.getWindow();
            if (window3 != null) {
                window3.setAttributes(attributes);
            }
        }
        Dialog dialog3 = getDialog();
        if (dialog3 != null && (window = dialog3.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Dialog dialog4 = getDialog();
        if (dialog4 == null) {
            return;
        }
        dialog4.setCanceledOnTouchOutside(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        HomepageRomDialogBinding homepageRomDialogBinding = this.binding;
        if (homepageRomDialogBinding == null) {
            homepageRomDialogBinding = null;
        }
        homepageRomDialogBinding.homepageRomDialogSkip.setOnClickListener(new View.OnClickListener() { // from class: qf6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                RomUpdateFragment.c(this.a, view2);
            }
        });
        homepageRomDialogBinding.homepageRomDialogGo.setOnClickListener(new View.OnClickListener() { // from class: pf6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                RomUpdateFragment.d(this.a, view2);
            }
        });
    }

    public final void show(@NotNull String message, @NotNull FragmentManager manager) {
        this.message = message;
        show(manager, "javaClass");
    }

    @NotNull
    public final RomUpdateFragment skipButtonListener(@NotNull Function0<Unit> listener) {
        this.skipButtonListener = listener;
        return this;
    }

    @NotNull
    public final RomUpdateFragment updateButtonListener(@NotNull Function0<Unit> listener) {
        this.updateButtonListener = listener;
        return this;
    }
}
