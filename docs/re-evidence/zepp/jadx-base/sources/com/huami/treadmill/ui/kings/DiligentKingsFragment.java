package com.huami.treadmill.ui.kings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Observer;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.treadmill.R;
import com.huami.treadmill.ext.AppCompatActivityExtKt;
import com.huami.treadmill.ui.kings.DiligentKingsFragment;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\f\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/huami/treadmill/ui/kings/DiligentKingsFragment;", "Landroidx/fragment/app/Fragment;", "", "b", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "onCreate", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "", "a", "J", "mLineId", "Lcom/huami/treadmill/ui/kings/DiligentKingsViewModel;", "Lcom/huami/treadmill/ui/kings/DiligentKingsViewModel;", "viewModel", "<init>", "()V", "Companion", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class DiligentKingsFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String c = "line_id";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private long mLineId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private DiligentKingsViewModel viewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/treadmill/ui/kings/DiligentKingsFragment$Companion;", "", "", "id", "Lcom/huami/treadmill/ui/kings/DiligentKingsFragment;", "newInstance", "", "ARG_LINE_ID", "Ljava/lang/String;", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final DiligentKingsFragment newInstance(long id) {
            DiligentKingsFragment diligentKingsFragment = new DiligentKingsFragment();
            Bundle bundle = new Bundle();
            bundle.putLong("line_id", id);
            Unit unit = Unit.INSTANCE;
            diligentKingsFragment.setArguments(bundle);
            return diligentKingsFragment;
        }
    }

    private final void b() {
        final AdapterDiligentKings adapterDiligentKings = new AdapterDiligentKings();
        View view = getView();
        View viewFindViewById = view == null ? null : view.findViewById(R.id.recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(1);
        Unit unit = Unit.INSTANCE;
        ((RecyclerView) viewFindViewById).setLayoutManager(linearLayoutManager);
        View view2 = getView();
        ((RecyclerView) (view2 != null ? view2.findViewById(R.id.recycler_view) : null)).setAdapter(adapterDiligentKings);
        DiligentKingsViewModel diligentKingsViewModel = this.viewModel;
        Objects.requireNonNull(diligentKingsViewModel);
        diligentKingsViewModel.getDiligents().observe(this, new Observer() { // from class: ma1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                DiligentKingsFragment.c(this.a, adapterDiligentKings, (PagedList) obj);
            }
        });
        DiligentKingsViewModel diligentKingsViewModel2 = this.viewModel;
        Objects.requireNonNull(diligentKingsViewModel2);
        diligentKingsViewModel2.showDiligents(this.mLineId, "10");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(DiligentKingsFragment diligentKingsFragment, AdapterDiligentKings adapterDiligentKings, PagedList pagedList) {
        if (pagedList.isEmpty()) {
            View view = diligentKingsFragment.getView();
            ((RecyclerView) (view == null ? null : view.findViewById(R.id.recycler_view))).setVisibility(8);
            View view2 = diligentKingsFragment.getView();
            (view2 != null ? view2.findViewById(R.id.tv_diligent_no_king) : null).setVisibility(0);
            return;
        }
        View view3 = diligentKingsFragment.getView();
        ((RecyclerView) (view3 == null ? null : view3.findViewById(R.id.recycler_view))).setVisibility(0);
        View view4 = diligentKingsFragment.getView();
        (view4 != null ? view4.findViewById(R.id.tv_diligent_no_king) : null).setVisibility(8);
        adapterDiligentKings.submitList(pagedList);
    }

    @JvmStatic
    @NotNull
    public static final DiligentKingsFragment newInstance(long j) {
        return INSTANCE.newInstance(j);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        this.mLineId = arguments.getLong("line_id");
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            this.viewModel = (DiligentKingsViewModel) AppCompatActivityExtKt.obtainViewModel((AppCompatActivity) activity, DiligentKingsViewModel.class);
        }
        return inflater.inflate(R.layout.fragment_diligent_kings, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        b();
    }
}
