package com.xiaomi.fitness.detail.inner;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.detail.BaseSportDetailFragment;
import com.xiaomi.fitness.detail.SportDetailGroupInfoActivity;
import com.xiaomi.fitness.detail.inner.SportDetailDivingInfoFragment;
import com.xiaomi.fitness.detail.model.SportDivingInfoModel;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;
import defpackage.b9h;
import defpackage.bsi;
import defpackage.eln;
import defpackage.hoi;
import defpackage.j1j;
import defpackage.ufa;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0001BB\u0007¢\u0006\u0004\bA\u0010\tJ\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0013\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0004¢\u0006\u0004\b\u0015\u0010\tJ\u0019\u0010\u0016\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0007J\u000f\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\tJ\u000f\u0010\u0018\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\tR$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010!\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R2\u0010-\u001a\u0012\u0012\u0004\u0012\u00020+0*j\b\u0012\u0004\u0012\u00020+`,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R(\u00104\u001a\b\u0012\u0004\u0012\u00020+038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010;\u001a\u0004\u0018\u00010:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@¨\u0006C"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailDivingInfoFragment;", "Lcom/xiaomi/fitness/detail/BaseSportDetailFragment;", "Lb9h;", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "", "initParamsFromBundle", "(Landroid/os/Bundle;)V", "initGroupInfoRecycler", "()V", "", "getCardName", "()Ljava/lang/String;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "initView", "onNewIntent", "onLoadMore", "onShowPassage", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "titleView", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "getTitleView", "()Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "setTitleView", "(Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerSkiingInfo", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerSkiingInfo", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerSkiingInfo", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lufa;", "mBinding", "Lufa;", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/detail/model/SportDivingInfoModel;", "Lkotlin/collections/ArrayList;", "mDataList", "Ljava/util/ArrayList;", "getMDataList", "()Ljava/util/ArrayList;", "setMDataList", "(Ljava/util/ArrayList;)V", "", "originalDataList", "Ljava/util/List;", "getOriginalDataList", "()Ljava/util/List;", "setOriginalDataList", "(Ljava/util/List;)V", "Leln;", "mSportGroupInfoAdapter", "Leln;", "getMSportGroupInfoAdapter", "()Leln;", "setMSportGroupInfoAdapter", "(Leln;)V", "<init>", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportDetailDivingInfoFragment extends BaseSportDetailFragment implements b9h {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "SportDetailSkiingInfoFragment";

    @Nullable
    private ufa mBinding;

    @Nullable
    private eln mSportGroupInfoAdapter;

    @Nullable
    private RecyclerView recyclerSkiingInfo;

    @Nullable
    private DataTitleSimpleView titleView;

    @NotNull
    private ArrayList<SportDivingInfoModel> mDataList = new ArrayList<>();

    @NotNull
    private List<SportDivingInfoModel> originalDataList = new ArrayList();

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u000fj\b\u0012\u0004\u0012\u00020\u000e`\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailDivingInfoFragment$Companion;", "", "<init>", "()V", "TAG", "", "switchDetailFragment", "", "sportValues", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", DailyRecordKey.sportType, "", "skiingInfoModelList", "Lkotlin/collections/ArrayList;", "Lcom/xiaomi/fitness/detail/model/SportDivingInfoModel;", "Ljava/util/ArrayList;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;ILjava/util/ArrayList;Landroidx/fragment/app/FragmentManager;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void switchDetailFragment(@Nullable SportBasicReport sportValues, int sportType, @NotNull ArrayList<SportDivingInfoModel> skiingInfoModelList, @Nullable FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(skiingInfoModelList, "skiingInfoModelList");
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_ITEM_VALUE_LIST, skiingInfoModelList);
            bundle.putSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES, sportValues);
            bundle.putInt("sport_type", sportType);
            BaseSportDetailFragment.Companion companion = BaseSportDetailFragment.INSTANCE;
            String strCreateFragmentTag = BaseSportDetailFragment.createFragmentTag("SportDetailSkiingInfoFragment", 0, sportType);
            int i = bsi.T;
            Intrinsics.checkNotNull(fragmentManager);
            BaseSportDetailFragment.switchFragment(i, SportDetailDivingInfoFragment.class, strCreateFragmentTag, bundle, fragmentManager);
        }
    }

    private final void initGroupInfoRecycler() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireActivity());
        RecyclerView recyclerView = this.recyclerSkiingInfo;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.setLayoutManager(linearLayoutManager);
        this.mSportGroupInfoAdapter = new eln(requireActivity(), this.mDataList, 0, Boolean.FALSE, this);
        RecyclerView recyclerView2 = this.recyclerSkiingInfo;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.setAdapter(this.mSportGroupInfoAdapter);
    }

    private final void initParamsFromBundle(Bundle bundle) {
        if (bundle != null) {
            setMBasicReport((SportBasicReport) bundle.getSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES));
            List<SportDivingInfoModel> list = this.originalDataList;
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_ITEM_VALUE_LIST);
            Intrinsics.checkNotNull(parcelableArrayList);
            list.addAll(parcelableArrayList);
            this.mDataList.clear();
            if (this.originalDataList.size() > 10) {
                eln elnVar = this.mSportGroupInfoAdapter;
                Intrinsics.checkNotNull(elnVar);
                elnVar.setFooterViewCount(1);
                this.mDataList.addAll(this.originalDataList.subList(0, 10));
            } else {
                this.mDataList.addAll(this.originalDataList);
                eln elnVar2 = this.mSportGroupInfoAdapter;
                Intrinsics.checkNotNull(elnVar2);
                elnVar2.setFooterViewCount(0);
            }
            eln elnVar3 = this.mSportGroupInfoAdapter;
            Intrinsics.checkNotNull(elnVar3);
            elnVar3.notifyDataChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(SportDetailDivingInfoFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onTraceBtnFullScreen("dive_detail");
        Intent intent = new Intent();
        intent.setClass(this$0.requireContext(), SportDetailGroupInfoActivity.class);
        intent.putExtra(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_RECORD_KEY, this$0.sportType);
        List<SportDivingInfoModel> list = this$0.originalDataList;
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type java.util.ArrayList<com.xiaomi.fitness.detail.model.SportDivingInfoModel>");
        intent.putExtra("sport_report", (ArrayList) list);
        intent.putExtra(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES, this$0.getMBasicReport());
        this$0.startActivity(intent);
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment
    @NotNull
    public String getCardName() {
        return "dive_detail";
    }

    @NotNull
    public final ArrayList<SportDivingInfoModel> getMDataList() {
        return this.mDataList;
    }

    @Nullable
    public final eln getMSportGroupInfoAdapter() {
        return this.mSportGroupInfoAdapter;
    }

    @NotNull
    public final List<SportDivingInfoModel> getOriginalDataList() {
        return this.originalDataList;
    }

    @Nullable
    public final RecyclerView getRecyclerSkiingInfo() {
        return this.recyclerSkiingInfo;
    }

    @Nullable
    public final DataTitleSimpleView getTitleView() {
        return this.titleView;
    }

    public final void initView() {
        initBaseChart();
        initGroupInfoRecycler();
        initParamsFromBundle(getArguments());
        DataTitleSimpleView dataTitleSimpleView = this.titleView;
        Intrinsics.checkNotNull(dataTitleSimpleView);
        dataTitleSimpleView.bindData(hoi.Q1, getString(j1j.U3));
        ImageView ivExpandView = getIvExpandView();
        Intrinsics.checkNotNull(ivExpandView);
        ivExpandView.setOnClickListener(new View.OnClickListener() { // from class: len
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportDetailDivingInfoFragment.initView$lambda$0(this.f24980a, view);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @NotNull
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        ufa ufaVarA0 = ufa.A0(inflater, container, false);
        this.mBinding = ufaVarA0;
        Intrinsics.checkNotNull(ufaVarA0);
        this.recyclerSkiingInfo = ufaVarA0.D;
        ufa ufaVar = this.mBinding;
        Intrinsics.checkNotNull(ufaVar);
        this.titleView = ufaVar.B;
        ufa ufaVar2 = this.mBinding;
        Intrinsics.checkNotNull(ufaVar2);
        this.mLineChart = ufaVar2.A;
        ufa ufaVar3 = this.mBinding;
        Intrinsics.checkNotNull(ufaVar3);
        setIvExpandView(ufaVar3.C);
        initView();
        ufa ufaVar4 = this.mBinding;
        Intrinsics.checkNotNull(ufaVar4);
        View root = ufaVar4.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // defpackage.b9h
    public void onLoadMore() {
        onTraceBtnLoad("dive_detail", true);
        if (this.originalDataList.size() > 0) {
            this.mDataList.clear();
            this.mDataList.addAll(this.originalDataList);
            eln elnVar = this.mSportGroupInfoAdapter;
            Intrinsics.checkNotNull(elnVar);
            elnVar.notifyDataSetChanged();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onNewIntent(@Nullable Bundle bundle) {
        super.onNewIntent(bundle);
        initParamsFromBundle(bundle);
    }

    @Override // defpackage.b9h
    public void onShowPassage() {
        onTraceBtnLoad("dive_detail", false);
        this.mDataList.clear();
        if (this.originalDataList.size() > 10) {
            this.mDataList.addAll(this.originalDataList.subList(0, 10));
        } else {
            this.mDataList.addAll(this.originalDataList);
        }
        eln elnVar = this.mSportGroupInfoAdapter;
        Intrinsics.checkNotNull(elnVar);
        elnVar.notifyDataSetChanged();
    }

    public final void setMDataList(@NotNull ArrayList<SportDivingInfoModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.mDataList = arrayList;
    }

    public final void setMSportGroupInfoAdapter(@Nullable eln elnVar) {
        this.mSportGroupInfoAdapter = elnVar;
    }

    public final void setOriginalDataList(@NotNull List<SportDivingInfoModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.originalDataList = list;
    }

    public final void setRecyclerSkiingInfo(@Nullable RecyclerView recyclerView) {
        this.recyclerSkiingInfo = recyclerView;
    }

    public final void setTitleView(@Nullable DataTitleSimpleView dataTitleSimpleView) {
        this.titleView = dataTitleSimpleView;
    }
}
