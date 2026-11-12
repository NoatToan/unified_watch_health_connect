package com.huami.treadmill.ui.linedetail;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.treadmill.R;
import com.huami.treadmill.data.TdRankingList;
import com.huami.treadmill.ext.AppCompatActivityExtKt;
import com.huami.treadmill.ui.linedetail.SpeedRankFragment;
import java.util.Collection;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\u000e\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/huami/treadmill/ui/linedetail/SpeedRankFragment;", "Landroidx/fragment/app/Fragment;", "", "b", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onCreate", "Lcom/huami/treadmill/ui/linedetail/LineDetailViewModel;", "a", "Lcom/huami/treadmill/ui/linedetail/LineDetailViewModel;", "viewModel", "", "J", "mLineId", "<init>", "()V", "Companion", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class SpeedRankFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String c = "line_id";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private LineDetailViewModel viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private long mLineId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/treadmill/ui/linedetail/SpeedRankFragment$Companion;", "", "", "id", "Lcom/huami/treadmill/ui/linedetail/SpeedRankFragment;", "newInstance", "", "ARG_LINE_ID", "Ljava/lang/String;", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final SpeedRankFragment newInstance(long id) {
            SpeedRankFragment speedRankFragment = new SpeedRankFragment();
            Bundle bundle = new Bundle();
            bundle.putLong("line_id", id);
            Unit unit = Unit.INSTANCE;
            speedRankFragment.setArguments(bundle);
            return speedRankFragment;
        }
    }

    private final void b() {
        View view = getView();
        View viewFindViewById = view == null ? null : view.findViewById(R.id.recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(1);
        Unit unit = Unit.INSTANCE;
        ((RecyclerView) viewFindViewById).setLayoutManager(linearLayoutManager);
        final AdapterSpeed adapterSpeed = new AdapterSpeed();
        View view2 = getView();
        ((RecyclerView) (view2 != null ? view2.findViewById(R.id.recycler_view) : null)).setAdapter(adapterSpeed);
        LineDetailViewModel lineDetailViewModel = this.viewModel;
        Objects.requireNonNull(lineDetailViewModel);
        lineDetailViewModel.getSpeedRanks().observe(getActivity(), new Observer() { // from class: p77
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SpeedRankFragment.c(adapterSpeed, this, (TdRankingList) obj);
            }
        });
        LineDetailViewModel lineDetailViewModel2 = this.viewModel;
        Objects.requireNonNull(lineDetailViewModel2);
        lineDetailViewModel2.getSpeedRanks(this.mLineId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(AdapterSpeed adapterSpeed, SpeedRankFragment speedRankFragment, TdRankingList tdRankingList) {
        if (!(!tdRankingList.getTopRanks().isEmpty())) {
            View view = speedRankFragment.getView();
            (view != null ? view.findViewById(R.id.tv_speed_no_data) : null).setVisibility(0);
            return;
        }
        adapterSpeed.setData(CollectionsKt___CollectionsKt.toMutableList((Collection) MapsKt.getValue(tdRankingList.getTopRanks(), "route_" + speedRankFragment.mLineId + "_fastedTime")));
        adapterSpeed.setLineId(speedRankFragment.mLineId);
        LineDetailViewModel lineDetailViewModel = speedRankFragment.viewModel;
        Objects.requireNonNull(lineDetailViewModel);
        lineDetailViewModel.getMeSpeedRank().setValue(adapterSpeed.getData());
        if (adapterSpeed.getData().isEmpty()) {
            View view2 = speedRankFragment.getView();
            (view2 != null ? view2.findViewById(R.id.tv_speed_no_data) : null).setVisibility(0);
        }
    }

    @JvmStatic
    @NotNull
    public static final SpeedRankFragment newInstance(long j) {
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
        return inflater.inflate(R.layout.fragment_speed_rank, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            this.viewModel = (LineDetailViewModel) AppCompatActivityExtKt.obtainViewModel((AppCompatActivity) activity, LineDetailViewModel.class);
        }
        b();
    }
}
