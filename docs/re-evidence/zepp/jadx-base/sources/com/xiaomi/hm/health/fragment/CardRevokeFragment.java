package com.xiaomi.hm.health.fragment;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.ViewModelProvider;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.arch.core.Fail;
import com.huami.arch.core.LiveDataExtensionKt;
import com.huami.arch.core.Loading;
import com.huami.arch.core.StateBuilder;
import com.huami.arch.core.Success;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.fragment.CardRevokeFragment;
import com.xiaomi.hm.health.viewmodel.CardRevokeViewModel;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J&\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/fragment/CardRevokeFragment;", "Landroidx/fragment/app/Fragment;", "", "initViewModel", "g", "", "message", "f", "e", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/xiaomi/hm/health/viewmodel/CardRevokeViewModel;", "a", "Lcom/xiaomi/hm/health/viewmodel/CardRevokeViewModel;", "viewModel", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "b", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "loadingDialog", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class CardRevokeFragment extends Fragment {
    private static final int c = 3000;

    @NotNull
    private static final String d = "001150";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private CardRevokeViewModel viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private LoadingDialog loadingDialog;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/StateBuilder;", "Ljava/lang/Void;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<StateBuilder<Void>, Unit> {

        /* JADX INFO: renamed from: com.xiaomi.hm.health.fragment.CardRevokeFragment$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Success;", "Ljava/lang/Void;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0956a extends Lambda implements Function1<Success<? extends Void>, Unit> {
            public final /* synthetic */ CardRevokeFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0956a(CardRevokeFragment cardRevokeFragment) {
                super(1);
                this.a = cardRevokeFragment;
            }

            public final void a(@NotNull Success<Void> success) {
                LoadingDialog loadingDialog = this.a.loadingDialog;
                Objects.requireNonNull(loadingDialog);
                loadingDialog.dismiss();
                Toast.makeText(this.a.requireContext(), R.string.eid_revoke_success, 1).show();
                this.a.requireActivity().finish();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Success<? extends Void> success) {
                a(success);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Fail;", "Ljava/lang/Void;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<Fail<? extends Void>, Unit> {
            public final /* synthetic */ CardRevokeFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(CardRevokeFragment cardRevokeFragment) {
                super(1);
                this.a = cardRevokeFragment;
            }

            public final void a(@NotNull Fail<Void> fail) {
                String message = fail.getError().getMessage();
                if (message != null && StringsKt__StringsKt.contains$default((CharSequence) message, (CharSequence) CardRevokeFragment.d, false, 2, (Object) null)) {
                    CardRevokeFragment cardRevokeFragment = this.a;
                    cardRevokeFragment.e(cardRevokeFragment.getString(R.string.eid_not_afford_revoke));
                } else {
                    CardRevokeFragment cardRevokeFragment2 = this.a;
                    cardRevokeFragment2.e(cardRevokeFragment2.getString(R.string.eid_revoke_failure));
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Fail<? extends Void> fail) {
                a(fail);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Loading;", "Ljava/lang/Void;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function1<Loading<? extends Void>, Unit> {
            public final /* synthetic */ CardRevokeFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(CardRevokeFragment cardRevokeFragment) {
                super(1);
                this.a = cardRevokeFragment;
            }

            public final void a(@NotNull Loading<Void> loading) {
                CardRevokeFragment cardRevokeFragment = this.a;
                cardRevokeFragment.f(cardRevokeFragment.getString(R.string.eid_delete_loading));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Loading<? extends Void> loading) {
                a(loading);
                return Unit.INSTANCE;
            }
        }

        public a() {
            super(1);
        }

        public final void a(@NotNull StateBuilder<Void> stateBuilder) {
            stateBuilder.onSuccess(new C0956a(CardRevokeFragment.this));
            stateBuilder.onFail(new b(CardRevokeFragment.this));
            stateBuilder.onLoading(new c(CardRevokeFragment.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(StateBuilder<Void> stateBuilder) {
            a(stateBuilder);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(CardRevokeFragment cardRevokeFragment, View view) {
        cardRevokeFragment.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(String message) {
        LoadingDialog loadingDialog = this.loadingDialog;
        Objects.requireNonNull(loadingDialog);
        loadingDialog.setFailed(message, 3000, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(String message) {
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(getActivity(), message);
        this.loadingDialog = loadingDialogShowDialog;
        Objects.requireNonNull(loadingDialogShowDialog);
        loadingDialogShowDialog.setCancelable(false);
    }

    private final void g() {
        AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(getContext());
        builder.setMessage(R.string.eid_delete_tips);
        builder.setPositiveButton(R.string.eid_confirm_delete, new DialogInterface.OnClickListener() { // from class: rl0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                CardRevokeFragment.h(this.a, dialogInterface, i);
            }
        });
        builder.setNegativeButton(R.string.eid_cancel, new DialogInterface.OnClickListener() { // from class: sl0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                CardRevokeFragment.i(dialogInterface, i);
            }
        });
        builder.create();
        builder.show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(CardRevokeFragment cardRevokeFragment, DialogInterface dialogInterface, int i) {
        CardRevokeViewModel cardRevokeViewModel = cardRevokeFragment.viewModel;
        Objects.requireNonNull(cardRevokeViewModel);
        cardRevokeViewModel.revokeEidCard();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }

    private final void initViewModel() {
        CardRevokeViewModel cardRevokeViewModel = (CardRevokeViewModel) new ViewModelProvider(this).get(CardRevokeViewModel.class);
        this.viewModel = cardRevokeViewModel;
        Objects.requireNonNull(cardRevokeViewModel);
        LiveDataExtensionKt.observeState$default(cardRevokeViewModel.getRevokeResultLiveData(), this, null, new a(), 2, null);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_card_revoke, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((TextView) view.findViewById(R.id.revoke)).setOnClickListener(new View.OnClickListener() { // from class: tl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CardRevokeFragment.d(this.a, view2);
            }
        });
        initViewModel();
    }
}
