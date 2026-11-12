package com.huami.moving.ui.sport.detail.segment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
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
import com.huami.moving.webapi.SportWebParams;
import com.huami.treadmill.ui.tdmillhome.TdmillHmFragment;
import com.xiaomi.mipush.sdk.Constants;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 .2\u00020\u0001:\u0002./B\u0007¢\u0006\u0004\b,\u0010-J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J&\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\u000e\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010!\u001a\b\u0018\u00010\u001eR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010(¨\u00060"}, d2 = {"Lcom/huami/moving/ui/sport/detail/segment/SportDetailSkiingSegmentFragment;", "Landroidx/fragment/app/Fragment;", "", "initData", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "initView", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "onActivityCreated", "", "a", "J", "mTrackId", "", "b", LogUtil.I, "mDeviceSource", "c", "mSportType", "", "Lcom/huami/mifit/sportlib/dbkit/bulkparse/SportSegmentData;", GoogleApiAvailabilityLight.a, "Ljava/util/List;", "mSegmentDataList", "Lcom/huami/moving/ui/sport/detail/segment/SportDetailSkiingSegmentFragment$SkiingSegmentAdapter;", "e", "Lcom/huami/moving/ui/sport/detail/segment/SportDetailSkiingSegmentFragment$SkiingSegmentAdapter;", "mAdapter", "", "f", "F", "mFastestPace", "", "g", "Z", TdmillHmFragment.ARG_IS_METRIC, "h", "isYard", "<init>", "()V", "Companion", "SkiingSegmentAdapter", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class SportDetailSkiingSegmentFragment extends Fragment {
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
    private List<SportSegmentData> mSegmentDataList;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private SkiingSegmentAdapter mAdapter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private float mFastestPace = Float.MAX_VALUE;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean isMetric = true;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean isYard;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0080\u0004\u0018\u00002\u0010\u0012\f\u0012\n0\u0002R\u00060\u0000R\u00020\u00030\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\b\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\f\u001a\u00020\u000b2\u000e\u0010\t\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016¨\u0006\u0012"}, d2 = {"Lcom/huami/moving/ui/sport/detail/segment/SportDetailSkiingSegmentFragment$SkiingSegmentAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huami/moving/ui/sport/detail/segment/SportDetailSkiingSegmentFragment$SkiingSegmentAdapter$InfoViewHolder;", "Lcom/huami/moving/ui/sport/detail/segment/SportDetailSkiingSegmentFragment;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "viewHolder", "position", "", "onBindViewHolder", "getItemCount", "getItemViewType", "<init>", "(Lcom/huami/moving/ui/sport/detail/segment/SportDetailSkiingSegmentFragment;)V", "InfoViewHolder", "moving_release"}, k = 1, mv = {1, 5, 1})
    public final class SkiingSegmentAdapter extends RecyclerView.Adapter<InfoViewHolder> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0016\u0010\u0010\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/huami/moving/ui/sport/detail/segment/SportDetailSkiingSegmentFragment$SkiingSegmentAdapter$InfoViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/mifit/sportlib/dbkit/bulkparse/SportSegmentData;", "data", "", "update", "setHeadTitle", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "indexView", "b", "timeView", "c", "speedView", GoogleApiAvailabilityLight.a, "changeView", "Landroid/view/View;", "itemView", "<init>", "(Lcom/huami/moving/ui/sport/detail/segment/SportDetailSkiingSegmentFragment$SkiingSegmentAdapter;Landroid/view/View;)V", "moving_release"}, k = 1, mv = {1, 5, 1})
        public final class InfoViewHolder extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private TextView indexView;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            private TextView timeView;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            @NotNull
            private TextView speedView;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @NotNull
            private TextView changeView;

            public InfoViewHolder(View view) {
                super(view);
                View viewFindViewById = view.findViewById(R.id.index);
                Objects.requireNonNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
                this.indexView = (TextView) viewFindViewById;
                View viewFindViewById2 = view.findViewById(R.id.time);
                Objects.requireNonNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
                this.timeView = (TextView) viewFindViewById2;
                View viewFindViewById3 = view.findViewById(R.id.speed);
                Objects.requireNonNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
                this.speedView = (TextView) viewFindViewById3;
                View viewFindViewById4 = view.findViewById(R.id.change);
                Objects.requireNonNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
                this.changeView = (TextView) viewFindViewById4;
            }

            public final void setHeadTitle() {
                Context context = this.itemView.getContext();
                if (context == null) {
                    return;
                }
                this.indexView.setText(context.getString(R.string.segment_index));
                this.speedView.setText(context.getString(R.string.segment_best_speed));
                this.timeView.setText(context.getString(R.string.segment_use_time));
                this.changeView.setText(context.getString(R.string.time_difference));
                TextView textView = this.indexView;
                int i = R.color.s2;
                textView.setTextColor(ContextCompat.getColor(context, i));
                this.speedView.setTextColor(ContextCompat.getColor(context, i));
                this.timeView.setTextColor(ContextCompat.getColor(context, i));
                this.changeView.setTextColor(ContextCompat.getColor(context, i));
            }

            public final void update(@NotNull SportSegmentData data) {
                this.indexView.setText(String.valueOf(data.getIndex()));
                TextView textView = this.timeView;
                SportSegmentViewManager.Companion companion = SportSegmentViewManager.INSTANCE;
                textView.setText(companion.getSegmentInfoValue(this.itemView.getContext(), data, companion.getKEY_COST_TIME(), SportDetailSkiingSegmentFragment.this.isMetric, SportDetailSkiingSegmentFragment.this.isYard, SportDetailSkiingSegmentFragment.this.mSportType, null));
                this.speedView.setText(companion.getSegmentInfoValue(this.itemView.getContext(), data, companion.getKEY_MAX_SPEED(), SportDetailSkiingSegmentFragment.this.isMetric, SportDetailSkiingSegmentFragment.this.isYard, SportDetailSkiingSegmentFragment.this.mSportType, null));
                this.changeView.setText(companion.getSegmentInfoValue(this.itemView.getContext(), data, companion.getKEY_TIME_DIFFERENCE(), SportDetailSkiingSegmentFragment.this.isMetric, SportDetailSkiingSegmentFragment.this.isYard, SportDetailSkiingSegmentFragment.this.mSportType, null));
                if (StringsKt__StringsKt.contains$default(this.changeView.getText(), (CharSequence) "+", false, 2, (Object) null)) {
                    this.changeView.setTextColor(ContextCompat.getColor(SportDetailSkiingSegmentFragment.this.getView().getContext(), R.color.cost_time_up));
                } else if (StringsKt__StringsKt.contains$default(this.changeView.getText(), (CharSequence) Constants.ACCEPT_TIME_SEPARATOR_SERVER, false, 2, (Object) null)) {
                    this.changeView.setTextColor(ContextCompat.getColor(SportDetailSkiingSegmentFragment.this.getView().getContext(), R.color.cost_time_down));
                } else {
                    this.changeView.setTextColor(ContextCompat.getColor(SportDetailSkiingSegmentFragment.this.getView().getContext(), R.color.s1));
                }
            }
        }

        public SkiingSegmentAdapter() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getA() {
            if (SportDetailSkiingSegmentFragment.this.mSegmentDataList != null) {
                return 1 + SportDetailSkiingSegmentFragment.this.mSegmentDataList.size();
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
                viewHolder.setHeadTitle();
            } else {
                viewHolder.update((SportSegmentData) SportDetailSkiingSegmentFragment.this.mSegmentDataList.get(position - 1));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public InfoViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            return new InfoViewHolder(LayoutInflater.from(SportDetailSkiingSegmentFragment.this.getContext()).inflate(R.layout.sport_detail_segment_skiing_item, parent, false));
        }
    }

    private final void initData() {
        ParsedSportDetailData trackData = TrackDataManager.getInstance().getTrackData(this.mTrackId, this.mDeviceSource, this.mSportType);
        if (trackData == null) {
            return;
        }
        List<SportSegmentData> skiingSegmentDataList = trackData.getSkiingSegmentDataList();
        this.mSegmentDataList = skiingSegmentDataList;
        int i2 = 0;
        int size = skiingSegmentDataList != null ? skiingSegmentDataList.size() : 0;
        if (size <= 0) {
            return;
        }
        while (true) {
            int i3 = i2 + 1;
            SportSegmentData sportSegmentData = this.mSegmentDataList.get(i2);
            if (this.mFastestPace > sportSegmentData.getMaxPace()) {
                this.mFastestPace = sportSegmentData.getMaxPace();
            }
            if (i3 >= size) {
                return;
            } else {
                i2 = i3;
            }
        }
    }

    private final void initView(View view) {
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            SkiingSegmentAdapter skiingSegmentAdapter = new SkiingSegmentAdapter();
            this.mAdapter = skiingSegmentAdapter;
            recyclerView.setAdapter(skiingSegmentAdapter);
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
        initView(getView());
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.mTrackId = arguments.getLong("trackid", -1L);
            this.mDeviceSource = arguments.getInt("source", -1);
            this.mSportType = arguments.getInt("type", -1);
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
