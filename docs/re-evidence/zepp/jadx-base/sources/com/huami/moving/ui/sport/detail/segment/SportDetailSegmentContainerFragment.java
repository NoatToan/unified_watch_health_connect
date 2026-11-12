package com.huami.moving.ui.sport.detail.segment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.mifit.sportlib.dbkit.bulkparse.SportSegmentData;
import com.huami.mifit.sportlib.model.ParsedSportDetailData;
import com.huami.moving.R;
import com.huami.moving.datacenter.TrackDataManager;
import com.huami.moving.ui.event.EventSegmentSave;
import com.huami.moving.ui.sport.detail.segment.dialog.SportDetailSegmentManager;
import com.huami.moving.ui.utils.SportDeviceUtils;
import com.huami.moving.ui.utils.SportTypeIdentifier;
import com.huami.moving.ui.utils.ViewUtils;
import com.huami.moving.webapi.SportWebParams;
import com.huami.treadmill.ui.tdmillhome.TdmillHmFragment;
import com.loc.z;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u0001EB\u0007¢\u0006\u0004\bC\u0010DJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J&\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\u000f\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0007R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u001c\u00100\u001a\b\u0018\u00010-R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00106\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00103R\u0016\u00108\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00103R\u0016\u0010:\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00103R\u0016\u0010<\u001a\u00020\u00188\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b;\u0010\u0019R\u0016\u0010>\u001a\u00020\u00188\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b=\u0010\u0019R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006F"}, d2 = {"Lcom/huami/moving/ui/sport/detail/segment/SportDetailSegmentContainerFragment;", "Landroidx/fragment/app/Fragment;", "", "initData", "", "b", "initView", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "onActivityCreated", "onDestroyView", "Lcom/huami/moving/ui/event/EventSegmentSave;", "saveEvent", "onEventMainThread", "", "a", "J", "mTrackId", "", LogUtil.I, "mSportSource", "c", "mSportType", GoogleApiAvailabilityLight.a, "mSegmentType", "e", "F", "recyclerViewWidth", "", "Lcom/huami/mifit/sportlib/dbkit/bulkparse/SportSegmentData;", "f", "Ljava/util/List;", "mSegmentDataList", "g", "mTitleList", "Landroidx/recyclerview/widget/RecyclerView;", "h", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lcom/huami/moving/ui/sport/detail/segment/SportDetailSegmentContainerFragment$SegmentInfoAdapter;", "i", "Lcom/huami/moving/ui/sport/detail/segment/SportDetailSegmentContainerFragment$SegmentInfoAdapter;", "mAdapter", "", z.j, "Z", TdmillHmFragment.ARG_IS_METRIC, hl.k, "isYard", "l", "isEdit", "m", "showEditBox", GoogleApiAvailabilityLight.b, "ITEM_TYPE_HEADER", "o", "ITEM_TYPE_INFO", "Lcom/huami/mifit/sportlib/model/ParsedSportDetailData;", b.r, "Lcom/huami/mifit/sportlib/model/ParsedSportDetailData;", "trackData", "<init>", "()V", "SegmentInfoAdapter", "moving_release"}, k = 1, mv = {1, 5, 1})
public class SportDetailSegmentContainerFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private long mTrackId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int mSportType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int mSegmentType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private float recyclerViewWidth;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private List<SportSegmentData> mSegmentDataList;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private List<Integer> mTitleList;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private RecyclerView recyclerView;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private SegmentInfoAdapter mAdapter;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean isYard;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private boolean isEdit;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private boolean showEditBox;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final int ITEM_TYPE_HEADER;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    private ParsedSportDetailData trackData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int mSportSource = -1;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean isMetric = true;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final int ITEM_TYPE_INFO = 1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u0010\u0012\f\u0012\n0\u0002R\u00060\u0000R\u00020\u00030\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J \u0010\u000b\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0016J \u0010\u000e\u001a\u00020\r2\u000e\u0010\f\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0012"}, d2 = {"Lcom/huami/moving/ui/sport/detail/segment/SportDetailSegmentContainerFragment$SegmentInfoAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huami/moving/ui/sport/detail/segment/SportDetailSegmentContainerFragment$SegmentInfoAdapter$InfoViewHolder;", "Lcom/huami/moving/ui/sport/detail/segment/SportDetailSegmentContainerFragment;", "", "getItemCount", "position", "getItemViewType", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "holder", "", "onBindViewHolder", "<init>", "(Lcom/huami/moving/ui/sport/detail/segment/SportDetailSegmentContainerFragment;)V", "InfoViewHolder", "moving_release"}, k = 1, mv = {1, 5, 1})
    public final class SegmentInfoAdapter extends RecyclerView.Adapter<InfoViewHolder> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J$\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\t\u001a\u00020\u0003R&\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/huami/moving/ui/sport/detail/segment/SportDetailSegmentContainerFragment$SegmentInfoAdapter$InfoViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "", "mTitleList", "", "setHeadInfo", "Lcom/huami/mifit/sportlib/dbkit/bulkparse/SportSegmentData;", "data", "position", "updateDataInfo", "Ljava/util/ArrayList;", "Landroid/widget/TextView;", "Lkotlin/collections/ArrayList;", "a", "Ljava/util/ArrayList;", "titleArray", "Landroid/view/View;", "itemView", "<init>", "(Lcom/huami/moving/ui/sport/detail/segment/SportDetailSegmentContainerFragment$SegmentInfoAdapter;Landroid/view/View;)V", "moving_release"}, k = 1, mv = {1, 5, 1})
        public final class InfoViewHolder extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private ArrayList<TextView> titleArray;

            public InfoViewHolder(View view) {
                LinearLayout linearLayout;
                int childCount;
                super(view);
                this.titleArray = new ArrayList<>();
                if (!(view instanceof LinearLayout) || (childCount = (linearLayout = (LinearLayout) view).getChildCount()) <= 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    if (linearLayout.getChildAt(i) instanceof TextView) {
                        ArrayList<TextView> arrayList = this.titleArray;
                        View childAt = linearLayout.getChildAt(i);
                        Objects.requireNonNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
                        arrayList.add((TextView) childAt);
                    } else if (linearLayout.getChildAt(i) instanceof RelativeLayout) {
                        ArrayList<TextView> arrayList2 = this.titleArray;
                        View childAt2 = linearLayout.getChildAt(i);
                        Objects.requireNonNull(childAt2, "null cannot be cast to non-null type android.widget.RelativeLayout");
                        View childAt3 = ((RelativeLayout) childAt2).getChildAt(0);
                        Objects.requireNonNull(childAt3, "null cannot be cast to non-null type android.widget.TextView");
                        arrayList2.add((TextView) childAt3);
                        ArrayList<TextView> arrayList3 = this.titleArray;
                        View childAt4 = linearLayout.getChildAt(i);
                        Objects.requireNonNull(childAt4, "null cannot be cast to non-null type android.widget.RelativeLayout");
                        View childAt5 = ((RelativeLayout) childAt4).getChildAt(1);
                        Objects.requireNonNull(childAt5, "null cannot be cast to non-null type android.widget.TextView");
                        arrayList3.add((TextView) childAt5);
                    }
                    if (i2 >= childCount) {
                        return;
                    } else {
                        i = i2;
                    }
                }
            }

            public final void setHeadInfo(@NotNull List<Integer> mTitleList) {
                SportSegmentData sportSegmentData;
                SportDetailSegmentContainerFragment sportDetailSegmentContainerFragment = SportDetailSegmentContainerFragment.this;
                int i = 0;
                for (Object obj : mTitleList) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    int iIntValue = ((Number) obj).intValue();
                    Context context = this.itemView.getContext();
                    SportSegmentViewManager.Companion companion = SportSegmentViewManager.INSTANCE;
                    boolean z = sportDetailSegmentContainerFragment.isYard;
                    List list = sportDetailSegmentContainerFragment.mSegmentDataList;
                    Integer numValueOf = null;
                    if (list != null && (sportSegmentData = (SportSegmentData) list.get(0)) != null) {
                        numValueOf = Integer.valueOf(sportSegmentData.getUnit());
                    }
                    this.titleArray.get(i).setText(companion.getSegmentInfoTitle(context, iIntValue, z, numValueOf.intValue(), Integer.valueOf(sportDetailSegmentContainerFragment.mSportSource), sportDetailSegmentContainerFragment.mSportType));
                    this.titleArray.get(i).setTextColor(ContextCompat.getColor(context, R.color.s2));
                    this.titleArray.get(i).setTextSize(12.0f);
                    if (sportDetailSegmentContainerFragment.mSportType != 52 || !SportDeviceUtils.isSupportSTUpgradeCategory(sportDetailSegmentContainerFragment.mSportSource)) {
                        this.titleArray.get(i).setGravity(17);
                    } else if (i == 0) {
                        this.titleArray.get(i).setGravity(GravityCompat.START);
                    } else {
                        this.titleArray.get(i).setGravity(GravityCompat.END);
                    }
                    i = i2;
                }
            }

            public final void updateDataInfo(@NotNull SportSegmentData data, @NotNull List<Integer> mTitleList, int position) {
                int i = 0;
                if (SportDetailSegmentContainerFragment.this.mSportType == 52 && SportDeviceUtils.isSupportSTUpgradeCategory(SportDetailSegmentContainerFragment.this.mSportSource)) {
                    this.titleArray.get(0).setText(String.valueOf(data.getIndex()));
                    this.titleArray.get(0).setTextColor(ContextCompat.getColor(this.itemView.getContext(), R.color.s1));
                    this.titleArray.get(0).setTextSize(14.0f);
                }
                SportDetailSegmentContainerFragment sportDetailSegmentContainerFragment = SportDetailSegmentContainerFragment.this;
                for (Object obj : mTitleList) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    String segmentInfoValue = SportSegmentViewManager.INSTANCE.getSegmentInfoValue(this.itemView.getContext(), data, ((Number) obj).intValue(), sportDetailSegmentContainerFragment.isMetric, sportDetailSegmentContainerFragment.isYard, sportDetailSegmentContainerFragment.mSportType, Integer.valueOf(sportDetailSegmentContainerFragment.mSportSource));
                    if (sportDetailSegmentContainerFragment.mSportType == 52 && SportDeviceUtils.isSupportSTUpgradeCategory(sportDetailSegmentContainerFragment.mSportSource)) {
                        this.titleArray.get(i2).setText(segmentInfoValue);
                        this.titleArray.get(i2).setTextColor(ContextCompat.getColor(this.itemView.getContext(), R.color.s1));
                        this.titleArray.get(i2).setTextSize(14.0f);
                        if (i == 0) {
                            this.titleArray.get(i2).setGravity(16);
                        } else {
                            this.titleArray.get(i2).setGravity(GravityCompat.END);
                        }
                    } else {
                        this.titleArray.get(i).setText(segmentInfoValue);
                        this.titleArray.get(i).setTextColor(ContextCompat.getColor(this.itemView.getContext(), R.color.s1));
                        this.titleArray.get(i).setTextSize(14.0f);
                        this.titleArray.get(i).setGravity(17);
                    }
                    i = i2;
                }
            }
        }

        public SegmentInfoAdapter() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getFragmentsCount() {
            List list = SportDetailSegmentContainerFragment.this.mSegmentDataList;
            return (list == null ? 1 : list.size()) + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int position) {
            return position == 0 ? SportDetailSegmentContainerFragment.this.ITEM_TYPE_HEADER : SportDetailSegmentContainerFragment.this.ITEM_TYPE_INFO;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull InfoViewHolder holder, int position) {
            if (getItemViewType(position) == SportDetailSegmentContainerFragment.this.ITEM_TYPE_HEADER) {
                List<Integer> list = SportDetailSegmentContainerFragment.this.mTitleList;
                if (list == null) {
                    return;
                }
                holder.setHeadInfo(list);
                return;
            }
            List list2 = SportDetailSegmentContainerFragment.this.mSegmentDataList;
            if (list2 == null) {
                return;
            }
            holder.updateDataInfo((SportSegmentData) list2.get(position - 1), SportDetailSegmentContainerFragment.this.mTitleList, position);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public InfoViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            LinearLayout linearLayout = new LinearLayout(SportDetailSegmentContainerFragment.this.getContext());
            Context context = parent.getContext();
            if (SportDetailSegmentContainerFragment.this.mSportType == 52 && SportDeviceUtils.isSupportSTUpgradeCategory(SportDetailSegmentContainerFragment.this.mSportSource)) {
                RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams((int) ViewUtils.dp2px(context, SportDetailSegmentContainerFragment.this.recyclerViewWidth), -2);
                linearLayout.setMinimumHeight((int) ViewUtils.dp2px(context, 44.0f));
                float f = 14.0f;
                layoutParams.setMarginStart((int) ViewUtils.dp2px(context, 14.0f));
                layoutParams.setMarginEnd((int) ViewUtils.dp2px(context, 14.0f));
                linearLayout.setLayoutParams(layoutParams);
                linearLayout.setOrientation(0);
                List list = SportDetailSegmentContainerFragment.this.mTitleList;
                if (list != null) {
                    SportDetailSegmentContainerFragment sportDetailSegmentContainerFragment = SportDetailSegmentContainerFragment.this;
                    list.size();
                    int i = 0;
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        ((Number) obj).intValue();
                        if (i != 0 || viewType == sportDetailSegmentContainerFragment.ITEM_TYPE_HEADER) {
                            TextView textView = new TextView(context);
                            textView.setTextColor(ContextCompat.getColor(context, R.color.s2));
                            textView.setGravity(17);
                            textView.setTextSize(12.0f);
                            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -1);
                            if (i == 0) {
                                layoutParams2.weight = 2.0f;
                            } else {
                                layoutParams2.weight = 1.0f;
                            }
                            layoutParams2.bottomMargin = 20;
                            textView.setLayoutParams(layoutParams2);
                            linearLayout.addView(textView);
                        } else {
                            TextView textView2 = new TextView(context);
                            int i3 = R.color.s1;
                            textView2.setTextColor(ContextCompat.getColor(context, i3));
                            textView2.setGravity(17);
                            textView2.setLayoutParams(new RelativeLayout.LayoutParams(-2, -1));
                            TextView textView3 = new TextView(context);
                            textView3.setTextColor(ContextCompat.getColor(context, i3));
                            textView3.setTextSize(f);
                            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -1);
                            layoutParams3.setMarginStart((int) ViewUtils.dp2px(context, 24.0f));
                            textView3.setLayoutParams(layoutParams3);
                            RelativeLayout relativeLayout = new RelativeLayout(context);
                            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -1);
                            layoutParams4.weight = 2.0f;
                            layoutParams4.bottomMargin = 20;
                            relativeLayout.setLayoutParams(layoutParams4);
                            layoutParams4.gravity = 16;
                            relativeLayout.addView(textView2);
                            relativeLayout.addView(textView3);
                            linearLayout.addView(relativeLayout);
                        }
                        i = i2;
                        f = 14.0f;
                    }
                }
            } else {
                linearLayout.setLayoutParams(new RecyclerView.LayoutParams((int) ViewUtils.dp2px(context, SportDetailSegmentContainerFragment.this.recyclerViewWidth), -2));
                linearLayout.setMinimumHeight((int) ViewUtils.dp2px(context, 44.0f));
                linearLayout.setOrientation(0);
                List list2 = SportDetailSegmentContainerFragment.this.mTitleList;
                if (list2 != null) {
                    list2.size();
                    int i4 = 0;
                    for (Object obj2 : list2) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        ((Number) obj2).intValue();
                        TextView textView4 = new TextView(context);
                        textView4.setTextColor(ContextCompat.getColor(context, R.color.s2));
                        textView4.setGravity(17);
                        textView4.setTextSize(12.0f);
                        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, -1);
                        layoutParams5.weight = 1.0f;
                        layoutParams5.bottomMargin = 28;
                        textView4.setLayoutParams(layoutParams5);
                        linearLayout.addView(textView4);
                        i4 = i5;
                    }
                }
            }
            return new InfoViewHolder(linearLayout);
        }
    }

    private final float b() {
        FragmentActivity activity = getActivity();
        Object systemService = activity == null ? null : activity.getSystemService("window");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels / displayMetrics.density;
    }

    private final void initData() {
        float fB;
        float fB2;
        int size;
        ParsedSportDetailData trackData = TrackDataManager.getInstance().getTrackData(this.mTrackId, this.mSportSource, this.mSportType);
        this.trackData = trackData;
        if (trackData != null) {
            int i = this.mSegmentType;
            if (i == 0) {
                this.mSegmentDataList = trackData.getManualSegmentDataList();
                this.mTitleList = SportSegmentViewManager.INSTANCE.initSegmentTitleList(this.mSportType, 0, Integer.valueOf(this.mSportSource));
            } else if (i == 1) {
                this.mSegmentDataList = trackData.getAutoSegmentDataList();
                this.mTitleList = SportSegmentViewManager.INSTANCE.initSegmentTitleList(this.mSportType, 1, null);
            } else if (i == 5) {
                this.mSegmentDataList = trackData.getFuseSegmentDataList();
                this.mTitleList = SportSegmentViewManager.INSTANCE.initSegmentTitleList(this.mSportType, 5, Integer.valueOf(this.mSportSource));
            } else if (i == 6) {
                this.mSegmentDataList = trackData.getTrainSegmentDataList();
                this.mTitleList = SportSegmentViewManager.INSTANCE.initSegmentTitleList(this.mSportType, 6, Integer.valueOf(this.mSportSource));
            }
            List<Integer> list = this.mTitleList;
            boolean z = (list == null ? 0 : list.size()) > 5;
            if (z) {
                if (this.mSportType == 52 && SportDeviceUtils.isSupportSTUpgradeCategory(this.mSportSource)) {
                    fB2 = b() / 5.5f;
                    size = this.mTitleList.size() + 1;
                } else {
                    fB2 = b() / 5.5f;
                    size = this.mTitleList.size();
                }
                fB = fB2 * size;
            } else {
                if (z) {
                    throw new NoWhenBranchMatchedException();
                }
                fB = b();
            }
            this.recyclerViewWidth = fB;
            if (SportTypeIdentifier.isShowSwim(this.mSportType)) {
                this.isYard = !this.isMetric;
            }
        }
    }

    private final void initView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(1);
        RecyclerView recyclerView = this.recyclerView;
        Objects.requireNonNull(recyclerView);
        recyclerView.setLayoutManager(linearLayoutManager);
        SegmentInfoAdapter segmentInfoAdapter = new SegmentInfoAdapter();
        this.mAdapter = segmentInfoAdapter;
        RecyclerView recyclerView2 = this.recyclerView;
        Objects.requireNonNull(recyclerView2);
        recyclerView2.setAdapter(segmentInfoAdapter);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
        initView();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.mTrackId = arguments.getLong("trackid");
            this.mSportSource = arguments.getInt("source", DataTypeSource.RunSource.RUN_SOURCE_WATCH.getValue());
            this.mSegmentType = arguments.getInt("segment_type");
            this.mSportType = arguments.getInt("type", 1);
            this.isMetric = arguments.getBoolean(SportWebParams.PARAMA_METRIC, false);
            this.isEdit = arguments.getBoolean(SportWebParams.PARAM_SEGMENT_EDIT, false);
            this.showEditBox = arguments.getBoolean(SportWebParams.PARAM_SEGMENT_SHOW_EDIT_BOX, false);
        }
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(getContext());
        ViewPager.LayoutParams layoutParams = new ViewPager.LayoutParams();
        ((ViewGroup.LayoutParams) layoutParams).height = -2;
        ((ViewGroup.LayoutParams) layoutParams).width = -2;
        horizontalScrollView.setLayoutParams(layoutParams);
        this.recyclerView = new RecyclerView(getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) this.recyclerViewWidth, -2);
        RecyclerView recyclerView = this.recyclerView;
        Objects.requireNonNull(recyclerView);
        recyclerView.setLayoutParams(layoutParams2);
        RecyclerView recyclerView2 = this.recyclerView;
        Objects.requireNonNull(recyclerView2);
        recyclerView2.setNestedScrollingEnabled(false);
        RecyclerView recyclerView3 = this.recyclerView;
        Objects.requireNonNull(recyclerView3);
        horizontalScrollView.addView(recyclerView3);
        EventBus.getDefault().register(this);
        return horizontalScrollView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        EventBus.getDefault().unregister(this);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void onEventMainThread(@NotNull EventSegmentSave saveEvent) {
        if (saveEvent.isSaveSuccess()) {
            this.mSegmentDataList = SportDetailSegmentManager.getInstance().getSegmentDataList();
            int i = this.mSegmentType;
            if (i == 0) {
                this.trackData.setManualSegmentDataList(this.mSegmentDataList);
            } else if (i == 5) {
                this.trackData.setFuseSegmentDataList(this.mSegmentDataList);
            } else if (i == 6) {
                this.trackData.setTrainSegmentDataList(this.mSegmentDataList);
            }
            SegmentInfoAdapter segmentInfoAdapter = this.mAdapter;
            if (segmentInfoAdapter == null) {
                return;
            }
            segmentInfoAdapter.notifyDataSetChanged();
        }
    }
}
