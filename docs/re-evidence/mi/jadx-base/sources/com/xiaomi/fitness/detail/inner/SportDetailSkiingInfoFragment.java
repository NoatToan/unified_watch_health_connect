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
import com.xiaomi.fitness.detail.inner.SportDetailSkiingInfoFragment;
import com.xiaomi.fitness.detail.model.SportSkiingInfoModel;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;
import defpackage.bsi;
import defpackage.d1o;
import defpackage.hoi;
import defpackage.j1j;
import defpackage.ufa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 52\u00020\u0001:\u00015B\u0007¢\u0006\u0004\b4\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0012\u001a\u00020\u00112\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u0014\u0010\bJ\u0019\u0010\u0015\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0006R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R$\u0010.\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00066"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailSkiingInfoFragment;", "Lcom/xiaomi/fitness/detail/BaseSportDetailFragment;", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "", "initParamsFromBundle", "(Landroid/os/Bundle;)V", "initGroupInfoRecycler", "()V", "", "getCardName", "()Ljava/lang/String;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "initView", "onNewIntent", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "titleView", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "getTitleView", "()Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "setTitleView", "(Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerSkiingInfo", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerSkiingInfo", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerSkiingInfo", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lufa;", "mBinding", "Lufa;", "", "Lcom/xiaomi/fitness/detail/model/SportSkiingInfoModel;", "mDataList", "Ljava/util/List;", "getMDataList", "()Ljava/util/List;", "Ld1o;", "mSportGroupInfoAdapter", "Ld1o;", "getMSportGroupInfoAdapter", "()Ld1o;", "setMSportGroupInfoAdapter", "(Ld1o;)V", "<init>", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportDetailSkiingInfoFragment extends BaseSportDetailFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "SportDetailSkiingInfoFragment";

    @Nullable
    private ufa mBinding;

    @NotNull
    private final List<SportSkiingInfoModel> mDataList = new ArrayList();

    @Nullable
    private d1o mSportGroupInfoAdapter;

    @Nullable
    private RecyclerView recyclerSkiingInfo;

    @Nullable
    private DataTitleSimpleView titleView;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailSkiingInfoFragment$Companion;", "", "<init>", "()V", "TAG", "", "switchDetailFragment", "", "sportValues", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", DailyRecordKey.sportType, "", "skiingInfoModelList", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/detail/model/SportSkiingInfoModel;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void switchDetailFragment(@Nullable SportBasicReport sportValues, int sportType, @NotNull ArrayList<SportSkiingInfoModel> skiingInfoModelList, @Nullable FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(skiingInfoModelList, "skiingInfoModelList");
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_ITEM_VALUE_LIST, skiingInfoModelList);
            bundle.putSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES, sportValues);
            bundle.putInt("sport_type", sportType);
            BaseSportDetailFragment.Companion companion = BaseSportDetailFragment.INSTANCE;
            String strCreateFragmentTag = BaseSportDetailFragment.createFragmentTag("SportDetailSkiingInfoFragment", 0, sportType);
            int i = bsi.o0;
            Intrinsics.checkNotNull(fragmentManager);
            BaseSportDetailFragment.switchFragment(i, SportDetailSkiingInfoFragment.class, strCreateFragmentTag, bundle, fragmentManager);
        }
    }

    private final void initGroupInfoRecycler() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireActivity());
        RecyclerView recyclerView = this.recyclerSkiingInfo;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.setLayoutManager(linearLayoutManager);
        Iterator<SportSkiingInfoModel> it = this.mDataList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (it.next().e != 0.0f) {
                z = true;
            }
        }
        this.mSportGroupInfoAdapter = new d1o(requireActivity(), this.mDataList, 0, Boolean.valueOf(z));
        RecyclerView recyclerView2 = this.recyclerSkiingInfo;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.setAdapter(this.mSportGroupInfoAdapter);
    }

    private final void initParamsFromBundle(Bundle bundle) {
        if (bundle != null) {
            setMBasicReport((SportBasicReport) bundle.getSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES));
            List<SportSkiingInfoModel> list = this.mDataList;
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_ITEM_VALUE_LIST);
            Intrinsics.checkNotNull(parcelableArrayList);
            list.addAll(parcelableArrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(SportDetailSkiingInfoFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onTraceBtnFullScreen("ski_detail");
        Intent intent = new Intent();
        intent.setClass(this$0.requireContext(), SportDetailGroupInfoActivity.class);
        intent.putExtra(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_RECORD_KEY, this$0.sportType);
        List<SportSkiingInfoModel> list = this$0.mDataList;
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type java.util.ArrayList<com.xiaomi.fitness.detail.model.SportSkiingInfoModel>");
        intent.putExtra("sport_report", (ArrayList) list);
        intent.putExtra(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES, this$0.getMBasicReport());
        this$0.startActivity(intent);
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment
    @NotNull
    public String getCardName() {
        return "each_slide_detail";
    }

    @NotNull
    public final List<SportSkiingInfoModel> getMDataList() {
        return this.mDataList;
    }

    @Nullable
    public final d1o getMSportGroupInfoAdapter() {
        return this.mSportGroupInfoAdapter;
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
        initParamsFromBundle(getArguments());
        DataTitleSimpleView dataTitleSimpleView = this.titleView;
        Intrinsics.checkNotNull(dataTitleSimpleView);
        dataTitleSimpleView.bindData(hoi.Q1, getString(j1j.m0));
        ImageView ivExpandView = getIvExpandView();
        Intrinsics.checkNotNull(ivExpandView);
        ivExpandView.setOnClickListener(new View.OnClickListener() { // from class: rin
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportDetailSkiingInfoFragment.initView$lambda$0(this.f32577a, view);
            }
        });
        initBaseChart();
        initGroupInfoRecycler();
        initDetailViewModel();
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

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onNewIntent(@Nullable Bundle bundle) {
        super.onNewIntent(bundle);
        initParamsFromBundle(bundle);
    }

    public final void setMSportGroupInfoAdapter(@Nullable d1o d1oVar) {
        this.mSportGroupInfoAdapter = d1oVar;
    }

    public final void setRecyclerSkiingInfo(@Nullable RecyclerView recyclerView) {
        this.recyclerSkiingInfo = recyclerView;
    }

    public final void setTitleView(@Nullable DataTitleSimpleView dataTitleSimpleView) {
        this.titleView = dataTitleSimpleView;
    }
}
