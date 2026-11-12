package com.huami.assistant.ui.v2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.p010navigation.fragment.FragmentKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.huami.assistant.R;
import com.huami.assistant.ui.v2.SmartOptionDialogFragment;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u001d\u0010\u0012\u001a\u00020\n8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0015\u001a\u00020\n8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/huami/assistant/ui/v2/SmartOptionDialogFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "c", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "onViewCreated", "a", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Landroid/os/Bundle;", "ocrBundle", "b", "e", "trainBundle", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final class SmartOptionDialogFragment extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy ocrBundle = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy trainBundle = LazyKt__LazyJVMKt.lazy(b.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/os/Bundle;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Bundle> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Bundle invoke() {
            Bundle bundle = new Bundle();
            bundle.putInt("action", 0);
            return bundle;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/os/Bundle;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Bundle> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Bundle invoke() {
            Bundle bundle = new Bundle();
            bundle.putInt("action", 1);
            return bundle;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(View view) {
        if (getActivity() != null) {
            int id = view.getId();
            if (id == R.id.btnOcrPicture) {
                FragmentKt.findNavController(this).navigate(R.id.action_to_ocrTipActivity, d());
            } else if (id == R.id.btnOcrTrainTicket) {
                FragmentKt.findNavController(this).navigate(R.id.action_to_ocrTipActivity, e());
            }
        }
        dismiss();
    }

    private final Bundle d() {
        return (Bundle) this.ocrBundle.getValue();
    }

    private final Bundle e() {
        return (Bundle) this.trainBundle.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(SmartOptionDialogFragment smartOptionDialogFragment, View view) {
        smartOptionDialogFragment.dismiss();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_smart_option_dialog, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        View view2 = getView();
        ((AppCompatTextView) (view2 == null ? null : view2.findViewById(R.id.btnOcrPicture))).setOnClickListener(new View.OnClickListener() { // from class: g47
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                this.a.c(view3);
            }
        });
        View view3 = getView();
        ((AppCompatTextView) (view3 == null ? null : view3.findViewById(R.id.btnOcrTrainTicket))).setOnClickListener(new View.OnClickListener() { // from class: g47
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                this.a.c(view4);
            }
        });
        View view4 = getView();
        ((AppCompatTextView) (view4 != null ? view4.findViewById(R.id.btn_cancel) : null)).setOnClickListener(new View.OnClickListener() { // from class: f47
            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                SmartOptionDialogFragment.f(this.a, view5);
            }
        });
    }
}
