package com.huami.moving.ui.sport.detail.segment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.sportlib.dbkit.bulkparse.SportSegmentData;
import com.huami.mifit.sportlib.model.ParsedSportDetailData;
import com.huami.moving.R;
import com.huami.moving.datacenter.TrackDataManager;
import com.huami.moving.ui.utils.ViewUtils;
import com.huami.moving.ui.view.SegmentValueView;
import com.huami.moving.webapi.SportWebParams;
import com.huami.treadmill.ui.tdmillhome.TdmillHmFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0016\u0018\u0000 ,2\u00020\u0001:\u0002,-B\u0007¢\u0006\u0004\b*\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J&\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\u000e\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u001c\u0010\u001c\u001a\b\u0018\u00010\u0019R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010$R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010 ¨\u0006."}, d2 = {"Lcom/huami/moving/ui/sport/detail/segment/SportDetailIntervalSegmentFragment;", "Landroidx/fragment/app/Fragment;", "", "initData", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "initView", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "onActivityCreated", "", "a", "J", "mTrackId", "", "b", LogUtil.I, "mDeviceSource", "c", "mSportType", "Lcom/huami/moving/ui/sport/detail/segment/SportDetailIntervalSegmentFragment$IntervalItemAdapter;", GoogleApiAvailabilityLight.a, "Lcom/huami/moving/ui/sport/detail/segment/SportDetailIntervalSegmentFragment$IntervalItemAdapter;", "mAdapter", "", "Lcom/huami/mifit/sportlib/dbkit/bulkparse/SportSegmentData;", "e", "Ljava/util/List;", "mSegmentDataList", "", "f", "Z", TdmillHmFragment.ARG_IS_METRIC, "g", "isYard", "h", "mTitleList", "<init>", "()V", "Companion", "IntervalItemAdapter", "moving_release"}, k = 1, mv = {1, 5, 1})
public class SportDetailIntervalSegmentFragment extends Fragment {
    private static final int i = 0;
    private static final int j = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private long mTrackId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int mDeviceSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int mSportType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private IntervalItemAdapter mAdapter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private List<SportSegmentData> mSegmentDataList;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean isMetric = true;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean isYard;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private List<Integer> mTitleList;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u0010\u0012\f\u0012\n0\u0002R\u00060\u0000R\u00020\u00030\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\b\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\f\u001a\u00020\u000b2\u000e\u0010\t\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016¨\u0006\u0012"}, d2 = {"Lcom/huami/moving/ui/sport/detail/segment/SportDetailIntervalSegmentFragment$IntervalItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huami/moving/ui/sport/detail/segment/SportDetailIntervalSegmentFragment$IntervalItemAdapter$InfoViewHolder;", "Lcom/huami/moving/ui/sport/detail/segment/SportDetailIntervalSegmentFragment;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "viewHolder", "position", "", "onBindViewHolder", "getItemCount", "getItemViewType", "<init>", "(Lcom/huami/moving/ui/sport/detail/segment/SportDetailIntervalSegmentFragment;)V", "InfoViewHolder", "moving_release"}, k = 1, mv = {1, 5, 1})
    public final class IntervalItemAdapter extends RecyclerView.Adapter<InfoViewHolder> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u001c\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R&\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/huami/moving/ui/sport/detail/segment/SportDetailIntervalSegmentFragment$IntervalItemAdapter$InfoViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "", "mTitleList", "", "setHeadInfo", "Lcom/huami/mifit/sportlib/dbkit/bulkparse/SportSegmentData;", "data", "updateDataInfo", "Ljava/util/ArrayList;", "Lcom/huami/moving/ui/view/SegmentValueView;", "Lkotlin/collections/ArrayList;", "a", "Ljava/util/ArrayList;", "titleArray", "Landroid/view/View;", "itemView", "<init>", "(Lcom/huami/moving/ui/sport/detail/segment/SportDetailIntervalSegmentFragment$IntervalItemAdapter;Landroid/view/View;)V", "moving_release"}, k = 1, mv = {1, 5, 1})
        public final class InfoViewHolder extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private ArrayList<SegmentValueView> titleArray;

            public InfoViewHolder(View view) {
                super(view);
                this.titleArray = new ArrayList<>();
                if (!(view instanceof LinearLayout)) {
                    return;
                }
                int i = 0;
                LinearLayout linearLayout = (LinearLayout) view;
                int childCount = linearLayout.getChildCount();
                if (childCount <= 0) {
                    return;
                }
                while (true) {
                    int i2 = i + 1;
                    ArrayList<SegmentValueView> arrayList = this.titleArray;
                    View childAt = linearLayout.getChildAt(i);
                    Objects.requireNonNull(childAt, "null cannot be cast to non-null type com.huami.moving.ui.view.SegmentValueView");
                    arrayList.add((SegmentValueView) childAt);
                    if (i2 >= childCount) {
                        return;
                    } else {
                        i = i2;
                    }
                }
            }

            public final void setHeadInfo(@NotNull List<Integer> mTitleList) {
                SportSegmentData sportSegmentData;
                SportDetailIntervalSegmentFragment sportDetailIntervalSegmentFragment = SportDetailIntervalSegmentFragment.this;
                int i = 0;
                for (Object obj : mTitleList) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    int iIntValue = ((Number) obj).intValue();
                    Context context = this.itemView.getContext();
                    List list = sportDetailIntervalSegmentFragment.mSegmentDataList;
                    if (list != null && (sportSegmentData = (SportSegmentData) list.get(0)) != null) {
                        String segmentInfoTitle = SportSegmentViewManager.INSTANCE.getSegmentInfoTitle(context, iIntValue, sportDetailIntervalSegmentFragment.isYard, sportSegmentData.getUnit(), null, sportDetailIntervalSegmentFragment.mSportType);
                        if (segmentInfoTitle != null) {
                            this.titleArray.get(i).setMainText(segmentInfoTitle);
                        }
                    }
                    this.titleArray.get(i).setMainTextColor(ContextCompat.getColor(context, R.color.s2));
                    i = i2;
                }
            }

            public final void updateDataInfo(@NotNull SportSegmentData data, @NotNull List<Integer> mTitleList) {
                SportDetailIntervalSegmentFragment sportDetailIntervalSegmentFragment = SportDetailIntervalSegmentFragment.this;
                int i = 0;
                for (Object obj : mTitleList) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    int iIntValue = ((Number) obj).intValue();
                    SegmentValueView segmentValueView = this.titleArray.get(i);
                    SportSegmentViewManager.Companion companion = SportSegmentViewManager.INSTANCE;
                    segmentValueView.setMainText(companion.getSegmentInfoValue(this.itemView.getContext(), data, iIntValue, sportDetailIntervalSegmentFragment.isMetric, sportDetailIntervalSegmentFragment.isYard, sportDetailIntervalSegmentFragment.mSportType, null));
                    Context context = this.itemView.getContext();
                    int i3 = R.color.s1;
                    segmentValueView.setMainTextColor(ContextCompat.getColor(context, i3));
                    segmentValueView.setSubText(companion.getSegmentInfoSubValue(this.itemView.getContext(), data, iIntValue));
                    segmentValueView.setSubTextColor(ContextCompat.getColor(this.itemView.getContext(), i3));
                    i = i2;
                }
            }
        }

        public IntervalItemAdapter() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getA() {
            if (SportDetailIntervalSegmentFragment.this.mSegmentDataList != null) {
                return 1 + SportDetailIntervalSegmentFragment.this.mSegmentDataList.size();
            }
            return 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int position) {
            return position == 0 ? 0 : 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull InfoViewHolder viewHolder, int position) {
            if (getItemViewType(position) == 0) {
                List<Integer> list = SportDetailIntervalSegmentFragment.this.mTitleList;
                if (list == null) {
                    return;
                }
                viewHolder.setHeadInfo(list);
                return;
            }
            List list2 = SportDetailIntervalSegmentFragment.this.mSegmentDataList;
            if (list2 == null) {
                return;
            }
            viewHolder.updateDataInfo((SportSegmentData) list2.get(position - 1), SportDetailIntervalSegmentFragment.this.mTitleList);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public InfoViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Context context = parent.getContext();
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, (int) ViewUtils.dp2px(context, 44.0f)));
            linearLayout.setOrientation(0);
            List list = SportDetailIntervalSegmentFragment.this.mTitleList;
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((Number) it2.next()).intValue();
                    SegmentValueView segmentValueView = new SegmentValueView(context);
                    segmentValueView.setMainTextColor(ContextCompat.getColor(context, R.color.s1));
                    segmentValueView.setGravity(17);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
                    layoutParams.weight = 1.0f;
                    segmentValueView.setLayoutParams(layoutParams);
                    linearLayout.addView(segmentValueView);
                }
            }
            return new InfoViewHolder(linearLayout);
        }
    }

    private final void initData() {
        ParsedSportDetailData trackData = TrackDataManager.getInstance().getTrackData(this.mTrackId, this.mDeviceSource, this.mSportType);
        if (trackData != null) {
            this.mSegmentDataList = trackData.getIntervalSegmentDataList();
            this.mTitleList = SportSegmentViewManager.INSTANCE.initSegmentTitleList(this.mSportType, 2, null);
        }
    }

    private final void initView(View view) {
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            IntervalItemAdapter intervalItemAdapter = new IntervalItemAdapter();
            this.mAdapter = intervalItemAdapter;
            recyclerView.setAdapter(intervalItemAdapter);
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
        View view = getView();
        if (view == null) {
            return;
        }
        initView(view);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.mTrackId = arguments.getLong("trackid", -1L);
            this.mDeviceSource = arguments.getInt("source", -1);
            this.mSportType = arguments.getInt("type", 1);
            boolean z = arguments.getBoolean(SportWebParams.PARAMA_METRIC, false);
            this.isMetric = z;
            this.isYard = !z;
        }
        RecyclerView recyclerView = new RecyclerView(getContext());
        ViewPager.LayoutParams layoutParams = new ViewPager.LayoutParams();
        ((ViewGroup.LayoutParams) layoutParams).width = -1;
        ((ViewGroup.LayoutParams) layoutParams).height = -2;
        recyclerView.setLayoutParams(layoutParams);
        return recyclerView;
    }
}
