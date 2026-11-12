package com.xiaomi.fitness.detail.inner;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.detail.BaseSportDetailFragment;
import com.xiaomi.fitness.detail.model.SportsReportOperationalMedalInfo;
import com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import defpackage.bsi;
import defpackage.hoi;
import defpackage.ivi;
import defpackage.j1j;
import defpackage.uea;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001dB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00060\u0018R\u00020\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailMedalFragment;", "Lcom/xiaomi/fitness/detail/BaseSportDetailFragment;", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "", "initParamsFromBundle", "(Landroid/os/Bundle;)V", "", "getCardName", "()Ljava/lang/String;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Luea;", "mViewBinding", "Luea;", "Lcom/xiaomi/fitness/detail/inner/SportDetailMedalFragment$MedalListAdapter;", "adapter", "Lcom/xiaomi/fitness/detail/inner/SportDetailMedalFragment$MedalListAdapter;", "<init>", "()V", "Companion", com.xiaomi.fitness.medal.medallist.MedalListAdapter.TAG, "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportDetailMedalFragment extends BaseSportDetailFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "SportDetailDateFromFragment";
    private MedalListAdapter adapter;
    private uea mViewBinding;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailMedalFragment$Companion;", "", "<init>", "()V", "TAG", "", "switchDetailFragment", "", "sportValues", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", DailyRecordKey.sportType, "", "triathlonNum", "sportDetailType", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void switchDetailFragment(@NotNull SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType, @Nullable FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(sportValues, "sportValues");
            Bundle bundle = new Bundle();
            bundle.putSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES, sportValues);
            bundle.putInt("sport_type", sportType);
            bundle.putInt(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_DETAIL_TYPE, sportDetailType);
            BaseSportDetailFragment.Companion companion = BaseSportDetailFragment.INSTANCE;
            String strCreateFragmentTag = BaseSportDetailFragment.createFragmentTag("SportDetailMedalFragment", triathlonNum, sportType);
            int i = bsi.c0;
            Intrinsics.checkNotNull(fragmentManager);
            BaseSportDetailFragment.switchFragment(i, SportDetailMedalFragment.class, strCreateFragmentTag, bundle, fragmentManager);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u0010\u0012\f\u0012\n0\u0002R\u00060\u0000R\u00020\u00030\u0001:\u0001\u0015B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010\u0010\u001a\u00020\u00112\u000e\u0010\u0012\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016R\u0019\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailMedalFragment$MedalListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/detail/inner/SportDetailMedalFragment$MedalListAdapter$MedalListHolder;", "Lcom/xiaomi/fitness/detail/inner/SportDetailMedalFragment;", "dataList", "", "Lcom/xiaomi/fitness/detail/model/SportsReportOperationalMedalInfo;", "<init>", "(Lcom/xiaomi/fitness/detail/inner/SportDetailMedalFragment;Ljava/util/List;)V", "getDataList", "()Ljava/util/List;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "getItemCount", "MedalListHolder", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class MedalListAdapter extends RecyclerView.Adapter<MedalListHolder> {

        @NotNull
        private final List<SportsReportOperationalMedalInfo> dataList;
        final /* synthetic */ SportDetailMedalFragment this$0;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\n \u000f*\u0004\u0018\u00010\u00120\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailMedalFragment$MedalListAdapter$MedalListHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/detail/model/SportsReportOperationalMedalInfo;", "medal", "", "bind", "(Lcom/xiaomi/fitness/detail/model/SportsReportOperationalMedalInfo;)V", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "medalIconIV", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "medalNameTV", "Landroid/widget/TextView;", "<init>", "(Lcom/xiaomi/fitness/detail/inner/SportDetailMedalFragment$MedalListAdapter;Landroid/view/View;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
        @SourceDebugExtension({"SMAP\nSportDetailMedalFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDetailMedalFragment.kt\ncom/xiaomi/fitness/detail/inner/SportDetailMedalFragment$MedalListAdapter$MedalListHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,139:1\n54#2,3:140\n24#2:143\n57#2,6:144\n63#2,2:151\n57#3:150\n*S KotlinDebug\n*F\n+ 1 SportDetailMedalFragment.kt\ncom/xiaomi/fitness/detail/inner/SportDetailMedalFragment$MedalListAdapter$MedalListHolder\n*L\n98#1:140,3\n98#1:143\n98#1:144,6\n98#1:151,2\n98#1:150\n*E\n"})
        public final class MedalListHolder extends RecyclerView.d0 {
            private final ImageView medalIconIV;
            private final TextView medalNameTV;
            final /* synthetic */ MedalListAdapter this$0;

            @NotNull
            private View view;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MedalListHolder(@NotNull MedalListAdapter medalListAdapter, View view) {
                super(view);
                Intrinsics.checkNotNullParameter(view, "view");
                this.this$0 = medalListAdapter;
                this.view = view;
                this.medalIconIV = (ImageView) view.findViewById(bsi.l4);
                this.medalNameTV = (TextView) this.view.findViewById(bsi.n4);
            }

            public final void bind(@Nullable SportsReportOperationalMedalInfo medal) {
                String icon = medal != null ? medal.getIcon() : null;
                if (icon != null && icon.length() != 0) {
                    ImageView medalIconIV = this.medalIconIV;
                    Intrinsics.checkNotNullExpressionValue(medalIconIV, "medalIconIV");
                    String icon2 = medal != null ? medal.getIcon() : null;
                    Intrinsics.checkNotNull(icon2);
                    Coil.imageLoader(medalIconIV.getContext()).enqueue(new ImageRequest.Builder(medalIconIV.getContext()).data(icon2).target(medalIconIV).build());
                }
                this.medalNameTV.setText(medal != null ? medal.getName() : null);
            }

            @NotNull
            public final View getView() {
                return this.view;
            }

            public final void setView(@NotNull View view) {
                Intrinsics.checkNotNullParameter(view, "<set-?>");
                this.view = view;
            }
        }

        public MedalListAdapter(@NotNull SportDetailMedalFragment sportDetailMedalFragment, List<SportsReportOperationalMedalInfo> dataList) {
            Intrinsics.checkNotNullParameter(dataList, "dataList");
            this.this$0 = sportDetailMedalFragment;
            this.dataList = dataList;
        }

        @NotNull
        public final List<SportsReportOperationalMedalInfo> getDataList() {
            return this.dataList;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getCount() {
            return this.dataList.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull MedalListHolder holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            holder.bind(this.dataList.get(position));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public MedalListHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            View viewInflate = LayoutInflater.from(this.this$0.getContext()).inflate(ivi.c2, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new MedalListHolder(this, viewInflate);
        }
    }

    private final void initParamsFromBundle(Bundle bundle) {
        if (bundle != null) {
            setMSportValues((SportBasicReport) bundle.getSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES));
            setMDetailSportType(bundle.getInt(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_DETAIL_TYPE, -1));
        }
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment
    @NotNull
    public String getCardName() {
        return "medal";
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @NotNull
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        this.mViewBinding = uea.A0(inflater, container, false);
        initParamsFromBundle(getArguments());
        uea ueaVar = this.mViewBinding;
        if (ueaVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewBinding");
            ueaVar = null;
        }
        View root = ueaVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        setDetailViewModel((SportRecordDetailViewModel) new ViewModelProvider(fragmentActivityRequireActivity).get(SportRecordDetailViewModel.class));
        uea ueaVar = this.mViewBinding;
        MedalListAdapter medalListAdapter = null;
        if (ueaVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewBinding");
            ueaVar = null;
        }
        ueaVar.C.bindData(hoi.h2, getString(j1j.G9));
        uea ueaVar2 = this.mViewBinding;
        if (ueaVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewBinding");
            ueaVar2 = null;
        }
        ueaVar2.A.setLayoutManager(new LinearLayoutManager(getMActivity(), 0, false));
        this.adapter = new MedalListAdapter(this, new ArrayList());
        uea ueaVar3 = this.mViewBinding;
        if (ueaVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewBinding");
            ueaVar3 = null;
        }
        RecyclerView recyclerView = ueaVar3.A;
        MedalListAdapter medalListAdapter2 = this.adapter;
        if (medalListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            medalListAdapter = medalListAdapter2;
        }
        recyclerView.setAdapter(medalListAdapter);
    }
}
