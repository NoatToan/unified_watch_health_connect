package com.huami.assistant.ui.schedule.fragment;

import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.assistant.R;
import com.huami.assistant.ui.schedule.fragment.EditRepeatEventOptionFragment;
import com.huami.assistant.ui.v2.model.ScheduleEditType;
import com.huami.watch.ui.dialog.AlertDialog;
import com.huami.watch.ui.dialog.LoadingDialog;
import com.loc.z;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J&\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u001c\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R$\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001f\u001a\u00020\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/huami/assistant/ui/schedule/fragment/EditRepeatEventOptionFragment;", "Landroid/app/Fragment;", "", "e", "Lcom/huami/assistant/ui/v2/model/ScheduleEditType;", "position", z.j, GoogleApiAvailabilityLight.a, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lkotlin/Function1;", "a", "Lkotlin/jvm/functions/Function1;", "mCallback", "Landroid/app/DialogFragment;", "b", "Landroid/app/DialogFragment;", "mDialogFragment", "", "c", "Lkotlin/Lazy;", "i", "()Z", "isDelete", "<init>", "()V", "Companion", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final class EditRepeatEventOptionFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String d = "edit_type";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Function1<? super ScheduleEditType, Unit> mCallback;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private DialogFragment mDialogFragment;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy isDelete = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/huami/assistant/ui/schedule/fragment/EditRepeatEventOptionFragment$Companion;", "", "Landroid/app/Activity;", "activity", "", "isDelete", "Lkotlin/Function1;", "Lcom/huami/assistant/ui/v2/model/ScheduleEditType;", "", "callback", "show", "", "ARGS_TYPE", "Ljava/lang/String;", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void show(@NotNull Activity activity, boolean isDelete, @NotNull Function1<? super ScheduleEditType, Unit> callback) {
            EditRepeatEventOptionFragment editRepeatEventOptionFragment = new EditRepeatEventOptionFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean(EditRepeatEventOptionFragment.d, isDelete);
            Unit unit = Unit.INSTANCE;
            editRepeatEventOptionFragment.setArguments(bundle);
            editRepeatEventOptionFragment.mCallback = callback;
            editRepeatEventOptionFragment.mDialogFragment = AlertDialog.setTitle(activity.getString(isDelete ? R.string.delete_repeat_event_warn_title : R.string.edit_repeat_event_warn_title)).setContent(editRepeatEventOptionFragment).setNeutralBtn(activity.getString(R.string.btn_cancel)).show(activity, "select_edit_mode");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Boolean> {
        public a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            Bundle arguments = EditRepeatEventOptionFragment.this.getArguments();
            return Boolean.valueOf(arguments != null ? arguments.getBoolean(EditRepeatEventOptionFragment.d, false) : false);
        }
    }

    private final void d() {
        LoadingDialog.dismiss(this.mDialogFragment);
    }

    private final void e() {
        View view = getView();
        ((RelativeLayout) (view == null ? null : view.findViewById(R.id.edit_current))).setOnClickListener(new View.OnClickListener() { // from class: bj1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EditRepeatEventOptionFragment.f(this.a, view2);
            }
        });
        View view2 = getView();
        ((RelativeLayout) (view2 == null ? null : view2.findViewById(R.id.edit_future))).setOnClickListener(new View.OnClickListener() { // from class: cj1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                EditRepeatEventOptionFragment.g(this.a, view3);
            }
        });
        View view3 = getView();
        ((RelativeLayout) (view3 == null ? null : view3.findViewById(R.id.edit_all))).setOnClickListener(new View.OnClickListener() { // from class: aj1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                EditRepeatEventOptionFragment.h(this.a, view4);
            }
        });
        if (i()) {
            View view4 = getView();
            ((TextView) (view4 == null ? null : view4.findViewById(R.id.edit_current_text))).setText(R.string.delete_repeat_event_current);
            View view5 = getView();
            ((TextView) (view5 == null ? null : view5.findViewById(R.id.edit_all_text))).setText(R.string.delete_repeat_event_all);
            View view6 = getView();
            ((TextView) (view6 != null ? view6.findViewById(R.id.edit_future_text) : null)).setText(R.string.delete_repeat_event_future);
            return;
        }
        View view7 = getView();
        ((TextView) (view7 == null ? null : view7.findViewById(R.id.edit_current_text))).setText(R.string.edit_repeat_event_current);
        View view8 = getView();
        ((TextView) (view8 == null ? null : view8.findViewById(R.id.edit_all_text))).setText(R.string.edit_repeat_event_all);
        View view9 = getView();
        ((TextView) (view9 != null ? view9.findViewById(R.id.edit_future_text) : null)).setText(R.string.edit_repeat_event_future);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(EditRepeatEventOptionFragment editRepeatEventOptionFragment, View view) {
        editRepeatEventOptionFragment.j(ScheduleEditType.CURRENT.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(EditRepeatEventOptionFragment editRepeatEventOptionFragment, View view) {
        editRepeatEventOptionFragment.j(ScheduleEditType.FUTURE.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(EditRepeatEventOptionFragment editRepeatEventOptionFragment, View view) {
        editRepeatEventOptionFragment.j(ScheduleEditType.ALL.INSTANCE);
    }

    private final boolean i() {
        return ((Boolean) this.isDelete.getValue()).booleanValue();
    }

    private final void j(ScheduleEditType position) {
        Function1<? super ScheduleEditType, Unit> function1 = this.mCallback;
        if (function1 != null) {
            function1.invoke(position);
        }
        d();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // android.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_edit_repeat_event_option, container, false);
    }

    @Override // android.app.Fragment
    public void onViewCreated(@Nullable View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        e();
    }
}
