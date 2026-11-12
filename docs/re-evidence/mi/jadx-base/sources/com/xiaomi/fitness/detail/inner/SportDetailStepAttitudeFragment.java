package com.xiaomi.fitness.detail.inner;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import com.xiaomi.fit.data.common.data.sport.util.SportReportComputeUtil;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.baseui.widget.SportDetailItemView;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.detail.BaseSportDetailFragment;
import com.xiaomi.fitness.detail.inner.SportDetailStepAttitudeFragment;
import com.xiaomi.fitness.detail.recycler.SportBasicInfoItemDecoration;
import com.xiaomi.fitness.detail.util.SportRecordConstants;
import com.xiaomi.fitness.sport.model.utils.CommonSportModelUtil;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;
import defpackage.bsi;
import defpackage.dki;
import defpackage.fga;
import defpackage.hoi;
import defpackage.ivi;
import defpackage.j1j;
import defpackage.opi;
import defpackage.pz9;
import defpackage.q3b;
import defpackage.rz5;
import defpackage.xr5;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 B2\u00020\u0001:\u0002BCB\u0007¢\u0006\u0004\bA\u0010\fJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0016\u001a\u00020\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u0018\u0010\fJ\u0019\u0010\u0019\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u0006R$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\"\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R6\u0010+\u001a\u0016\u0012\u0004\u0012\u00020)\u0018\u00010(j\n\u0012\u0004\u0012\u00020)\u0018\u0001`*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00102\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010<\u001a\u00060;R\u00020\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=R\u0011\u0010@\u001a\u0002088F¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006D"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailStepAttitudeFragment;", "Lcom/xiaomi/fitness/detail/BaseSportDetailFragment;", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "", "initParamsFromBundle", "(Landroid/os/Bundle;)V", "", "landingMode", "bingImageType", "(I)V", "showDetailModeInfo", "()V", "", "getCardName", "()Ljava/lang/String;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "initView", "onNewIntent", "Landroidx/constraintlayout/widget/ConstraintLayout;", "itemViewContainer", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getItemViewContainer", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setItemViewContainer", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "titleView", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "getTitleView", "()Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "setTitleView", "(Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;)V", "Ljava/util/ArrayList;", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordItem;", "Lkotlin/collections/ArrayList;", "valueList", "Ljava/util/ArrayList;", "getValueList", "()Ljava/util/ArrayList;", "setValueList", "(Ljava/util/ArrayList;)V", "Landroid/widget/ImageView;", "imageView", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "setImageView", "(Landroid/widget/ImageView;)V", "Lfga;", "_binding", "Lfga;", "Lcom/xiaomi/fitness/detail/inner/SportDetailStepAttitudeFragment$RunningPostureAdapter;", "mRunningPostureAdapter", "Lcom/xiaomi/fitness/detail/inner/SportDetailStepAttitudeFragment$RunningPostureAdapter;", "getBinding", "()Lfga;", "binding", "<init>", "Companion", "RunningPostureAdapter", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportDetailStepAttitudeFragment extends BaseSportDetailFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int POSITION_AUTO = 0;
    public static final int POSITION_CENTER = -1;
    public static final int POSITION_END = 2;
    public static final int POSITION_START = 1;

    @NotNull
    public static final String TAG = "SportDetailStepAttitudeFragment";

    @Nullable
    private fga _binding;

    @Nullable
    private ImageView imageView;

    @Nullable
    private ConstraintLayout itemViewContainer;
    private RunningPostureAdapter mRunningPostureAdapter;

    @Nullable
    private DataTitleSimpleView titleView;

    @Nullable
    private ArrayList<SportRecordItem> valueList;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailStepAttitudeFragment$Companion;", "", "<init>", "()V", "TAG", "", "POSITION_AUTO", "", "POSITION_START", "POSITION_END", "POSITION_CENTER", "switchDetailFragment", "", "sportValues", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", DailyRecordKey.sportType, "triathlonNum", "sportDetailType", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
            String strCreateFragmentTag = BaseSportDetailFragment.createFragmentTag(SportDetailStepAttitudeFragment.TAG, triathlonNum, sportType);
            int i = bsi.u0;
            Intrinsics.checkNotNull(fragmentManager);
            BaseSportDetailFragment.switchFragment(i, SportDetailStepAttitudeFragment.class, strCreateFragmentTag, bundle, fragmentManager);
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0082\u0004\u0018\u00002\u0010\u0012\f\u0012\n0\u0002R\u00060\u0000R\u00020\u00030\u0001:\u0001'B\u001d\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b \u0010!B'\b\u0016\u0012\u0006\u0010\"\u001a\u00020\u0014\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b \u0010$B/\b\u0016\u0012\u0006\u0010\"\u001a\u00020\u0014\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u0004\u0012\u0006\u0010%\u001a\u00020\u0004¢\u0006\u0004\b \u0010&J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\u00020\u00062\u000e\u0010\u000e\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailStepAttitudeFragment$RunningPostureAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/detail/inner/SportDetailStepAttitudeFragment$RunningPostureAdapter$ViewHolder;", "Lcom/xiaomi/fitness/detail/inner/SportDetailStepAttitudeFragment;", "", "itemPosition", "", "setItemPosition", "(I)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/xiaomi/fitness/detail/inner/SportDetailStepAttitudeFragment$RunningPostureAdapter$ViewHolder;", "contentViewHolder", "position", "onBindViewHolder", "(Lcom/xiaomi/fitness/detail/inner/SportDetailStepAttitudeFragment$RunningPostureAdapter$ViewHolder;I)V", "getItemCount", "()I", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "", "Lrz5;", "mDataList", "Ljava/util/List;", "Landroid/view/LayoutInflater;", "mLayoutInflater", "Landroid/view/LayoutInflater;", "layoutResourceId", "I", "<init>", "(Lcom/xiaomi/fitness/detail/inner/SportDetailStepAttitudeFragment;Landroid/content/Context;Ljava/util/List;)V", "context", "dataList", "(Lcom/xiaomi/fitness/detail/inner/SportDetailStepAttitudeFragment;Landroid/content/Context;Ljava/util/List;I)V", "spanCount", "(Lcom/xiaomi/fitness/detail/inner/SportDetailStepAttitudeFragment;Landroid/content/Context;Ljava/util/List;II)V", "ViewHolder", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class RunningPostureAdapter extends RecyclerView.Adapter<ViewHolder> {
        private int itemPosition;
        private int layoutResourceId;

        @NotNull
        private final Context mContext;

        @NotNull
        private final List<rz5> mDataList;

        @NotNull
        private final LayoutInflater mLayoutInflater;
        final /* synthetic */ SportDetailStepAttitudeFragment this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public RunningPostureAdapter(@NotNull SportDetailStepAttitudeFragment sportDetailStepAttitudeFragment, @NotNull Context mContext, List<? extends rz5> mDataList) {
            Intrinsics.checkNotNullParameter(mContext, "mContext");
            Intrinsics.checkNotNullParameter(mDataList, "mDataList");
            this.this$0 = sportDetailStepAttitudeFragment;
            this.mContext = mContext;
            this.mDataList = mDataList;
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(mContext);
            Intrinsics.checkNotNullExpressionValue(layoutInflaterFrom, "from(...)");
            this.mLayoutInflater = layoutInflaterFrom;
            this.layoutResourceId = -1;
            this.itemPosition = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getCount() {
            return this.mDataList.size();
        }

        public final void setItemPosition(int itemPosition) {
            this.itemPosition = itemPosition;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull ViewHolder contentViewHolder, int position) {
            Intrinsics.checkNotNullParameter(contentViewHolder, "contentViewHolder");
            rz5 rz5Var = this.mDataList.get(position);
            int i = this.itemPosition;
            if (i == 0) {
                contentViewHolder.bindData(rz5Var, position);
            } else if (i == 1) {
                contentViewHolder.bindDataStart(rz5Var);
            } else if (i == 2) {
                contentViewHolder.bindDataEnd(rz5Var);
            } else {
                contentViewHolder.bindData(rz5Var);
            }
            if (rz5Var.i.booleanValue()) {
                contentViewHolder.setModelClickListener(rz5Var);
            } else {
                contentViewHolder.setModelClickListener(null);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            int i = this.layoutResourceId;
            if (i == -1) {
                i = ivi.N1;
            }
            View viewInflate = this.mLayoutInflater.inflate(i, parent, false);
            Intrinsics.checkNotNull(viewInflate);
            return new ViewHolder(this, viewInflate);
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\u0006R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailStepAttitudeFragment$RunningPostureAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lrz5;", "model", "", "bindData", "(Lrz5;)V", "", "position", "(Lrz5;I)V", "bindDataStart", "bindDataEnd", "setModelClickListener", "Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;", "detailItemView", "Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;", "getDetailItemView", "()Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;", "setDetailItemView", "(Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;)V", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/detail/inner/SportDetailStepAttitudeFragment$RunningPostureAdapter;Landroid/view/View;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
        public final class ViewHolder extends RecyclerView.d0 {

            @NotNull
            private SportDetailItemView detailItemView;
            final /* synthetic */ RunningPostureAdapter this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ViewHolder(@NotNull RunningPostureAdapter runningPostureAdapter, View itemView) {
                super(itemView);
                Intrinsics.checkNotNullParameter(itemView, "itemView");
                this.this$0 = runningPostureAdapter;
                this.detailItemView = (SportDetailItemView) itemView.findViewById(bsi.j1);
            }

            public final void bindData(@Nullable rz5 model, int position) {
                SportDetailItemView.bindData$default(this.detailItemView, model, q3b.a(2, position), true, false, 8, null);
            }

            public final void bindDataEnd(@Nullable rz5 model) {
                SportDetailItemView.bindData$default(this.detailItemView, model, 2, true, false, 8, null);
            }

            public final void bindDataStart(@Nullable rz5 model) {
                SportDetailItemView.bindData$default(this.detailItemView, model, 1, true, false, 8, null);
            }

            @NotNull
            public final SportDetailItemView getDetailItemView() {
                return this.detailItemView;
            }

            public final void setDetailItemView(@NotNull SportDetailItemView sportDetailItemView) {
                Intrinsics.checkNotNullParameter(sportDetailItemView, "<set-?>");
                this.detailItemView = sportDetailItemView;
            }

            public final void setModelClickListener(@Nullable rz5 model) {
                SportDetailItemView.setTypeClickListener$default(this.detailItemView, model, null, 2, null);
            }

            public final void bindData(@Nullable rz5 model) {
                SportDetailItemView.bindData$default(this.detailItemView, model, false, 2, null);
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public RunningPostureAdapter(@NotNull SportDetailStepAttitudeFragment sportDetailStepAttitudeFragment, @NotNull Context context, List<? extends rz5> dataList, int i) {
            this(sportDetailStepAttitudeFragment, context, dataList);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(dataList, "dataList");
            this.layoutResourceId = i;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public RunningPostureAdapter(@NotNull SportDetailStepAttitudeFragment sportDetailStepAttitudeFragment, @NotNull Context context, List<? extends rz5> dataList, int i, int i2) {
            this(sportDetailStepAttitudeFragment, context, dataList);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(dataList, "dataList");
            this.layoutResourceId = i;
        }
    }

    private final void bingImageType(int landingMode) {
        rz5 rz5Var;
        if (landingMode == 1) {
            ImageView imageView = this.imageView;
            Intrinsics.checkNotNull(imageView);
            imageView.setImageResource(hoi.r0);
            rz5Var = new rz5(getString(j1j.a8), getString(j1j.W7));
        } else if (landingMode == 2) {
            ImageView imageView2 = this.imageView;
            Intrinsics.checkNotNull(imageView2);
            imageView2.setImageResource(hoi.t0);
            rz5Var = new rz5(getString(j1j.a8), getString(j1j.b8));
        } else {
            if (landingMode != 3) {
                return;
            }
            ImageView imageView3 = this.imageView;
            Intrinsics.checkNotNull(imageView3);
            imageView3.setImageResource(hoi.s0);
            rz5Var = new rz5(getString(j1j.a8), getString(j1j.Y7));
        }
        if (rz5Var.b()) {
            AppCompatTextView appCompatTextView = getBinding().H;
            if (appCompatTextView != null) {
                appCompatTextView.setVisibility(4);
            }
            AppCompatTextView appCompatTextView2 = getBinding().G;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setVisibility(4);
                return;
            }
            return;
        }
        AppCompatTextView appCompatTextView3 = getBinding().G;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(rz5Var.f33082b);
        }
        AppCompatTextView appCompatTextView4 = getBinding().H;
        if (appCompatTextView4 != null) {
            appCompatTextView4.setText(rz5Var.d);
        }
    }

    private final void initParamsFromBundle(Bundle bundle) {
        if (bundle != null) {
            setMSportValues((SportBasicReport) bundle.getSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES));
            setMDetailSportType(bundle.getInt(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_DETAIL_TYPE, -1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(SportDetailStepAttitudeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onTraceBtmIntroduction(CommonSportModelUtil.KEY_RUNNING_POSTURE);
        WebViewUtilKt.startWebView$default(SportRecordConstants.INSTANCE.getUnderstandSportTypeUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null), CommonSportModelUtil.KEY_RUNNING_POSTURE), this$0.getString(j1j.h2), false, false, null, false, null, false, 252, null);
    }

    private final void showDetailModeInfo() {
        SportBasicReport mSportValues;
        Integer avgAirDuration;
        SportBasicReport mSportValues2;
        Integer avgTouchDownDuration;
        SportBasicReport mSportValues3;
        Integer valgusRange;
        SportBasicReport mSportValues4;
        Integer heelLandingRatio;
        SportBasicReport mSportValues5;
        Integer foreFootLandingRatio;
        ArrayList arrayList = new ArrayList();
        SportBasicReport mSportValues6 = getMSportValues();
        RunningPostureAdapter runningPostureAdapter = null;
        if ((mSportValues6 != null ? mSportValues6.getForeFootLandingRatio() : null) != null && ((mSportValues5 = getMSportValues()) == null || (foreFootLandingRatio = mSportValues5.getForeFootLandingRatio()) == null || foreFootLandingRatio.intValue() != 0)) {
            rz5 rz5Var = new rz5();
            SportBasicReport mSportValues7 = getMSportValues();
            rz5Var.d = String.valueOf(mSportValues7 != null ? mSportValues7.getForeFootLandingRatio() : null);
            rz5Var.c = "%";
            rz5Var.f33082b = getResources().getString(j1j.c8);
            arrayList.add(rz5Var);
        }
        SportBasicReport mSportValues8 = getMSportValues();
        if ((mSportValues8 != null ? mSportValues8.getHeelLandingRatio() : null) != null && ((mSportValues4 = getMSportValues()) == null || (heelLandingRatio = mSportValues4.getHeelLandingRatio()) == null || heelLandingRatio.intValue() != 0)) {
            rz5 rz5Var2 = new rz5();
            SportBasicReport mSportValues9 = getMSportValues();
            rz5Var2.d = String.valueOf(mSportValues9 != null ? mSportValues9.getHeelLandingRatio() : null);
            rz5Var2.c = "%";
            rz5Var2.f33082b = getResources().getString(j1j.Z7);
            arrayList.add(rz5Var2);
        }
        SportBasicReport mSportValues10 = getMSportValues();
        if ((mSportValues10 != null ? mSportValues10.getForeFootLandingRatio() : null) != null) {
            SportBasicReport mSportValues11 = getMSportValues();
            if ((mSportValues11 != null ? mSportValues11.getHeelLandingRatio() : null) != null) {
                SportBasicReport mSportValues12 = getMSportValues();
                Integer foreFootLandingRatio2 = mSportValues12 != null ? mSportValues12.getForeFootLandingRatio() : null;
                Intrinsics.checkNotNull(foreFootLandingRatio2);
                int iIntValue = 100 - foreFootLandingRatio2.intValue();
                SportBasicReport mSportValues13 = getMSportValues();
                Integer heelLandingRatio2 = mSportValues13 != null ? mSportValues13.getHeelLandingRatio() : null;
                Intrinsics.checkNotNull(heelLandingRatio2);
                int iIntValue2 = iIntValue - heelLandingRatio2.intValue();
                rz5 rz5Var3 = new rz5();
                rz5Var3.c = "%";
                rz5Var3.d = String.valueOf(iIntValue2);
                rz5Var3.f33082b = getResources().getString(j1j.X7);
                arrayList.add(rz5Var3);
            }
        }
        SportBasicReport mSportValues14 = getMSportValues();
        if ((mSportValues14 != null ? mSportValues14.getValgusRange() : null) != null && ((mSportValues3 = getMSportValues()) == null || (valgusRange = mSportValues3.getValgusRange()) == null || valgusRange.intValue() != 0)) {
            rz5 rz5Var4 = new rz5();
            SportBasicReport mSportValues15 = getMSportValues();
            rz5Var4.d = (mSportValues15 != null ? mSportValues15.getValgusRange() : null) + "°";
            rz5Var4.f33082b = getResources().getString(j1j.s8);
            arrayList.add(rz5Var4);
            SportBasicReport mSportValues16 = getMSportValues();
            Integer valgusRange2 = mSportValues16 != null ? mSportValues16.getValgusRange() : null;
            Intrinsics.checkNotNull(valgusRange2);
            if (valgusRange2.intValue() < 5) {
                rz5Var4.d(hoi.f);
                rz5Var4.f(dki.e);
                rz5Var4.e(getString(j1j.y6));
            } else {
                SportBasicReport mSportValues17 = getMSportValues();
                Integer valgusRange3 = mSportValues17 != null ? mSportValues17.getValgusRange() : null;
                Intrinsics.checkNotNull(valgusRange3);
                if (valgusRange3.intValue() > 25) {
                    rz5Var4.d(hoi.f);
                    rz5Var4.f(dki.e);
                    rz5Var4.e(getString(j1j.q6));
                } else {
                    rz5Var4.d(hoi.e);
                    rz5Var4.f(dki.d);
                    rz5Var4.e(getString(j1j.v6));
                }
            }
        }
        SportReportComputeUtil sportReportComputeUtil = SportReportComputeUtil.INSTANCE;
        SportBasicReport mSportValues18 = getMSportValues();
        Intrinsics.checkNotNull(mSportValues18);
        Integer avgPace = sportReportComputeUtil.getAvgPace(mSportValues18);
        SportBasicReport mSportValues19 = getMSportValues();
        Intrinsics.checkNotNull(mSportValues19);
        Integer avgCadence = SportReportComputeUtil.getAvgCadence(mSportValues19);
        if (avgCadence != null && avgPace != null && avgCadence.intValue() != 0 && avgPace.intValue() != 0) {
            String str = avgCadence + "/" + TimeDateUtil.getSportPaceStrWithSecDef(avgPace.intValue());
            rz5 rz5Var5 = new rz5();
            rz5Var5.d = str;
            rz5Var5.f33082b = getResources().getString(j1j.p8);
            arrayList.add(rz5Var5);
            if (avgCadence.intValue() + (avgPace.intValue() / 18) < 190) {
                rz5Var5.d(hoi.f);
                rz5Var5.f(dki.e);
                rz5Var5.e(getString(j1j.y6));
            } else if (avgCadence.intValue() + (avgPace.intValue() / 18) > 210) {
                rz5Var5.d(hoi.f);
                rz5Var5.f(dki.e);
                rz5Var5.e(getString(j1j.q6));
            } else {
                rz5Var5.d(hoi.e);
                rz5Var5.f(dki.d);
                rz5Var5.e(getString(j1j.v6));
            }
        }
        SportBasicReport mSportValues20 = getMSportValues();
        if ((mSportValues20 != null ? mSportValues20.getAvgLandingImpact() : null) != null) {
            SportBasicReport mSportValues21 = getMSportValues();
            Float avgLandingImpact = mSportValues21 != null ? mSportValues21.getAvgLandingImpact() : null;
            Intrinsics.checkNotNull(avgLandingImpact);
            float fE = xr5.e(1, avgLandingImpact.floatValue());
            if (fE != 0.0f) {
                rz5 rz5Var6 = new rz5();
                rz5Var6.d = String.valueOf(fE);
                rz5Var6.c = "BW";
                rz5Var6.f33082b = getResources().getString(j1j.j8);
                arrayList.add(rz5Var6);
                if (avgCadence != null) {
                    Intrinsics.checkNotNull(avgPace);
                    if ((-(avgPace.intValue() / 180)) + 4 >= fE) {
                        rz5Var6.d(hoi.e);
                        rz5Var6.f(dki.d);
                        rz5Var6.e(getString(j1j.v6));
                    } else if ((-(avgPace.intValue() / 180)) + 4 < fE) {
                        rz5Var6.d(hoi.f);
                        rz5Var6.f(dki.e);
                        rz5Var6.e(getString(j1j.q6));
                    }
                }
            }
        }
        SportBasicReport mSportValues22 = getMSportValues();
        if ((mSportValues22 != null ? mSportValues22.getAvgTouchDownDuration() : null) != null && ((mSportValues2 = getMSportValues()) == null || (avgTouchDownDuration = mSportValues2.getAvgTouchDownDuration()) == null || avgTouchDownDuration.intValue() != 0)) {
            rz5 rz5Var7 = new rz5();
            SportBasicReport mSportValues23 = getMSportValues();
            rz5Var7.d = String.valueOf(mSportValues23 != null ? mSportValues23.getAvgTouchDownDuration() : null);
            rz5Var7.c = "ms";
            rz5Var7.f33082b = getResources().getString(j1j.u3);
            arrayList.add(rz5Var7);
            SportBasicReport mSportValues24 = getMSportValues();
            Integer avgTouchDownDuration2 = mSportValues24 != null ? mSportValues24.getAvgTouchDownDuration() : null;
            Intrinsics.checkNotNull(avgTouchDownDuration2);
            if (avgTouchDownDuration2.intValue() < 200) {
                rz5Var7.d(hoi.g);
                rz5Var7.f(dki.f);
                rz5Var7.e(getString(j1j.r6));
            } else {
                SportBasicReport mSportValues25 = getMSportValues();
                Integer avgTouchDownDuration3 = mSportValues25 != null ? mSportValues25.getAvgTouchDownDuration() : null;
                Intrinsics.checkNotNull(avgTouchDownDuration3);
                if (avgTouchDownDuration3.intValue() > 350) {
                    rz5Var7.d(hoi.f);
                    rz5Var7.f(dki.e);
                    rz5Var7.e(getString(j1j.t6));
                } else {
                    rz5Var7.d(hoi.e);
                    rz5Var7.f(dki.d);
                    rz5Var7.e(getString(j1j.v6));
                }
            }
        }
        SportBasicReport mSportValues26 = getMSportValues();
        if ((mSportValues26 != null ? mSportValues26.getAvgAirDuration() : null) != null && ((mSportValues = getMSportValues()) == null || (avgAirDuration = mSportValues.getAvgAirDuration()) == null || avgAirDuration.intValue() != 0)) {
            rz5 rz5Var8 = new rz5();
            SportBasicReport mSportValues27 = getMSportValues();
            rz5Var8.d = String.valueOf(mSportValues27 != null ? mSportValues27.getAvgAirDuration() : null);
            rz5Var8.c = "ms";
            rz5Var8.f33082b = getResources().getString(j1j.x3);
            arrayList.add(rz5Var8);
            SportBasicReport mSportValues28 = getMSportValues();
            Integer avgAirDuration2 = mSportValues28 != null ? mSportValues28.getAvgAirDuration() : null;
            Intrinsics.checkNotNull(avgAirDuration2);
            if (avgAirDuration2.intValue() < 125) {
                rz5Var8.d(hoi.e);
                rz5Var8.f(dki.d);
                rz5Var8.e(getString(j1j.z6));
            } else {
                SportBasicReport mSportValues29 = getMSportValues();
                Integer avgTouchDownDuration4 = mSportValues29 != null ? mSportValues29.getAvgTouchDownDuration() : null;
                Intrinsics.checkNotNull(avgTouchDownDuration4);
                if (avgTouchDownDuration4.intValue() > 125) {
                    rz5Var8.d(hoi.g);
                    rz5Var8.f(dki.f);
                    rz5Var8.e(getString(j1j.r6));
                }
            }
        }
        SportBasicReport mSportValues30 = getMSportValues();
        if ((mSportValues30 != null ? mSportValues30.getAvgTouchDownAirRatio() : null) != null) {
            SportBasicReport mSportValues31 = getMSportValues();
            Float avgTouchDownAirRatio = mSportValues31 != null ? mSportValues31.getAvgTouchDownAirRatio() : null;
            Intrinsics.checkNotNull(avgTouchDownAirRatio);
            float fE2 = xr5.e(1, avgTouchDownAirRatio.floatValue());
            if (fE2 != 0.0f) {
                rz5 rz5Var9 = new rz5();
                rz5Var9.d = String.valueOf(fE2);
                rz5Var9.f33082b = getResources().getString(j1j.v3);
                arrayList.add(rz5Var9);
                SportBasicReport mSportValues32 = getMSportValues();
                Float avgTouchDownAirRatio2 = mSportValues32 != null ? mSportValues32.getAvgTouchDownAirRatio() : null;
                Intrinsics.checkNotNull(avgTouchDownAirRatio2);
                if (avgTouchDownAirRatio2.floatValue() < 1.0f) {
                    rz5Var9.d(hoi.g);
                    rz5Var9.f(dki.f);
                    rz5Var9.e(getString(j1j.r6));
                } else {
                    SportBasicReport mSportValues33 = getMSportValues();
                    Integer avgTouchDownDuration5 = mSportValues33 != null ? mSportValues33.getAvgTouchDownDuration() : null;
                    Intrinsics.checkNotNull(avgTouchDownDuration5);
                    if (avgTouchDownDuration5.intValue() > 1.6f) {
                        rz5Var9.d(hoi.e);
                        rz5Var9.f(dki.d);
                        rz5Var9.e(getString(j1j.z6));
                    } else {
                        rz5Var9.d(hoi.h);
                        rz5Var9.f(dki.g);
                        rz5Var9.e(getString(j1j.p6));
                    }
                }
            }
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 22);
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.detail.inner.SportDetailStepAttitudeFragment.showDetailModeInfo.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                return (position + 1) % 2 == 0 ? 10 : 12;
            }
        });
        RecyclerView recyclerView = getBinding().E;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(gridLayoutManager);
        }
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        this.mRunningPostureAdapter = new RunningPostureAdapter(this, mActivity, arrayList, ivi.B0, 2);
        if (pz9.a(getContext())) {
            RunningPostureAdapter runningPostureAdapter2 = this.mRunningPostureAdapter;
            if (runningPostureAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRunningPostureAdapter");
                runningPostureAdapter2 = null;
            }
            runningPostureAdapter2.setItemPosition(1);
        } else {
            RunningPostureAdapter runningPostureAdapter3 = this.mRunningPostureAdapter;
            if (runningPostureAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRunningPostureAdapter");
                runningPostureAdapter3 = null;
            }
            runningPostureAdapter3.setItemPosition(0);
        }
        RecyclerView recyclerView2 = getBinding().E;
        if (recyclerView2 != null) {
            recyclerView2.addItemDecoration(new SportBasicInfoItemDecoration());
        }
        RecyclerView recyclerView3 = getBinding().E;
        if (recyclerView3 != null) {
            RunningPostureAdapter runningPostureAdapter4 = this.mRunningPostureAdapter;
            if (runningPostureAdapter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRunningPostureAdapter");
            } else {
                runningPostureAdapter = runningPostureAdapter4;
            }
            recyclerView3.setAdapter(runningPostureAdapter);
        }
    }

    @NotNull
    public final fga getBinding() {
        fga fgaVar = this._binding;
        Intrinsics.checkNotNull(fgaVar);
        return fgaVar;
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment
    @NotNull
    public String getCardName() {
        return CommonSportModelUtil.KEY_RUNNING_POSTURE;
    }

    @Nullable
    public final ImageView getImageView() {
        return this.imageView;
    }

    @Nullable
    public final ConstraintLayout getItemViewContainer() {
        return this.itemViewContainer;
    }

    @Nullable
    public final DataTitleSimpleView getTitleView() {
        return this.titleView;
    }

    @Nullable
    public final ArrayList<SportRecordItem> getValueList() {
        return this.valueList;
    }

    public final void initView() {
        Integer mainLandingMode;
        initParamsFromBundle(getArguments());
        DataTitleSimpleView dataTitleSimpleView = this.titleView;
        Intrinsics.checkNotNull(dataTitleSimpleView);
        dataTitleSimpleView.bindData(hoi.X, getString(j1j.h2));
        setAbnormalGuideListener(new View.OnClickListener() { // from class: zin
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportDetailStepAttitudeFragment.initView$lambda$0(this.f41322a, view);
            }
        });
        DataTitleSimpleView dataTitleSimpleView2 = this.titleView;
        Intrinsics.checkNotNull(dataTitleSimpleView2);
        dataTitleSimpleView2.setGuideIcon(hoi.K0, getAbnormalGuideListener());
        getBinding().H.setTypeface(DisplayUtil.getTypefaceAsResourceId(getMActivity(), opi.c));
        SportBasicReport mSportValues = getMSportValues();
        bingImageType((mSportValues == null || (mainLandingMode = mSportValues.getMainLandingMode()) == null) ? 0 : mainLandingMode.intValue());
        showDetailModeInfo();
        initBaseChart();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @NotNull
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        this._binding = fga.A0(inflater, container, false);
        ConstraintLayout constraintLayout = getBinding().C;
        Intrinsics.checkNotNull(constraintLayout, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        this.itemViewContainer = constraintLayout;
        this.titleView = getBinding().B;
        this.mLineChart = getBinding().A;
        this.imageView = getBinding().F;
        initView();
        View root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onNewIntent(@Nullable Bundle bundle) {
        super.onNewIntent(bundle);
        initParamsFromBundle(bundle);
    }

    public final void setImageView(@Nullable ImageView imageView) {
        this.imageView = imageView;
    }

    public final void setItemViewContainer(@Nullable ConstraintLayout constraintLayout) {
        this.itemViewContainer = constraintLayout;
    }

    public final void setTitleView(@Nullable DataTitleSimpleView dataTitleSimpleView) {
        this.titleView = dataTitleSimpleView;
    }

    public final void setValueList(@Nullable ArrayList<SportRecordItem> arrayList) {
        this.valueList = arrayList;
    }
}
