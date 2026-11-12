package com.huami.moving.ui.sport.detail.segment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.sportlib.dbkit.bulkparse.SportSegmentData;
import com.huami.mifit.sportlib.model.ParsedSportDetailData;
import com.huami.moving.R;
import com.huami.moving.datacenter.TrackDataManager;
import com.huami.moving.webapi.SportWebParams;
import com.huami.tools.analytics.DbUtils;
import com.huami.treadmill.ui.tdmillhome.TdmillHmFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 12\u00020\u0001:\u000212B\u0007¢\u0006\u0004\b/\u00100J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J&\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\u000e\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00130\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010(\u001a\b\u0018\u00010%R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010+¨\u00063"}, d2 = {"Lcom/huami/moving/ui/sport/detail/segment/SportDetailMultiplexSegmentFragment;", "Landroidx/fragment/app/Fragment;", "", "initData", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "initView", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "onActivityCreated", "", "a", "J", "mTrackId", "", "b", "Ljava/lang/Integer;", "mSportSource", "c", LogUtil.I, "mSportType", "", "Lcom/huami/mifit/sportlib/dbkit/bulkparse/SportSegmentData;", GoogleApiAvailabilityLight.a, "Ljava/util/List;", "mSegmentDataList", "e", "mTitleList", "Landroidx/recyclerview/widget/RecyclerView;", "f", "Landroidx/recyclerview/widget/RecyclerView;", "mRecyclerView", "Lcom/huami/moving/ui/sport/detail/segment/SportDetailMultiplexSegmentFragment$MultiplexItemAdapter;", "g", "Lcom/huami/moving/ui/sport/detail/segment/SportDetailMultiplexSegmentFragment$MultiplexItemAdapter;", "mAdapter", "", "h", "Z", "isYard", "i", TdmillHmFragment.ARG_IS_METRIC, "<init>", "()V", "Companion", "MultiplexItemAdapter", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class SportDetailMultiplexSegmentFragment extends Fragment {
    private static final int j = 0;
    private static final int k = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private long mTrackId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Integer mSportSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int mSportType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private RecyclerView mRecyclerView;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private MultiplexItemAdapter mAdapter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean isYard;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private List<SportSegmentData> mSegmentDataList = new ArrayList();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private List<Integer> mTitleList = new ArrayList();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean isMetric = true;

    private final void initData() {
        ParsedSportDetailData trackData;
        if (this.mTrackId >= 0 && (trackData = TrackDataManager.getInstance().getTrackData(this.mTrackId, this.mSportSource.intValue(), this.mSportType)) != null) {
            List<SportSegmentData> ropeSkippingSegmentDataList = trackData.getRopeSkippingSegmentDataList();
            if (ropeSkippingSegmentDataList != null) {
                Iterator<T> it2 = ropeSkippingSegmentDataList.iterator();
                while (it2.hasNext()) {
                    this.mSegmentDataList.add((SportSegmentData) it2.next());
                }
            }
            this.mTitleList.addAll(SportSegmentViewManager.INSTANCE.initSegmentTitleList(this.mSportType, 4, null));
        }
    }

    private final void initView(View view) {
        this.mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(1);
        this.mAdapter = new MultiplexItemAdapter(this.mSegmentDataList, this.mTitleList);
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            return;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(this.mAdapter);
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
            this.mSportSource = Integer.valueOf(arguments.getInt("source", -1));
            this.mSportType = arguments.getInt("type", 1);
            boolean z = arguments.getBoolean(SportWebParams.PARAMA_METRIC, false);
            this.isMetric = z;
            this.isYard = !z;
        }
        return inflater.inflate(R.layout.fragment_sport_detail_rope_skipping_segment, container, false);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aB\u0007¢\u0006\u0004\b\u0015\u0010\u0016B%\b\u0016\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0017\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017¢\u0006\u0004\b\u0015\u0010\u0018J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016R\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/huami/moving/ui/sport/detail/segment/SportDetailMultiplexSegmentFragment$MultiplexItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/ViewGroup;", "viewGroup", "", "viewType", "onCreateViewHolder", "viewHolder", "position", "", "onBindViewHolder", "getItemCount", "getItemViewType", "", "Lcom/huami/mifit/sportlib/dbkit/bulkparse/SportSegmentData;", "a", "Ljava/util/List;", "datas", "b", "mTitleList", "<init>", "(Lcom/huami/moving/ui/sport/detail/segment/SportDetailMultiplexSegmentFragment;)V", "", "(Lcom/huami/moving/ui/sport/detail/segment/SportDetailMultiplexSegmentFragment;Ljava/util/List;Ljava/util/List;)V", "HeaderViewHolder", "InfoViewHolder", "moving_release"}, k = 1, mv = {1, 5, 1})
    public final class MultiplexItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private List<SportSegmentData> datas;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private List<Integer> mTitleList;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0090\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u001e\u0010\u000b\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR+\u0010\u0012\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\r0\r0\f8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/huami/moving/ui/sport/detail/segment/SportDetailMultiplexSegmentFragment$MultiplexItemAdapter$HeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "", "mTitleList", "", "setHeadInfo", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "Landroid/widget/TextView;", "b", "Lkotlin/Lazy;", "getTextViews", "()Ljava/util/List;", "textViews", "Landroid/view/View;", "itemView", "<init>", "(Lcom/huami/moving/ui/sport/detail/segment/SportDetailMultiplexSegmentFragment$MultiplexItemAdapter;Landroid/view/View;)V", "moving_release"}, k = 1, mv = {1, 5, 1})
        public class HeaderViewHolder extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final Context context;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            private final Lazy textViews;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n"}, d2 = {"", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<List<TextView>> {
                public final /* synthetic */ View a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(View view) {
                    super(0);
                    this.a = view;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final List<TextView> invoke() {
                    return CollectionsKt__CollectionsKt.mutableListOf((TextView) this.a.findViewById(R.id.index), (TextView) this.a.findViewById(R.id.count), (TextView) this.a.findViewById(R.id.frequency), (TextView) this.a.findViewById(R.id.heart), (TextView) this.a.findViewById(R.id.cast), (TextView) this.a.findViewById(R.id.time));
                }
            }

            public HeaderViewHolder(View view) {
                super(view);
                this.context = view.getContext();
                this.textViews = LazyKt__LazyJVMKt.lazy(new a(view));
            }

            @NotNull
            public final List<TextView> getTextViews() {
                return (List) this.textViews.getValue();
            }

            public final void setHeadInfo(@NotNull List<Integer> mTitleList) {
                SportSegmentData sportSegmentData;
                if (mTitleList.size() == getTextViews().size()) {
                    SportDetailMultiplexSegmentFragment sportDetailMultiplexSegmentFragment = SportDetailMultiplexSegmentFragment.this;
                    int i = 0;
                    for (Object obj : mTitleList) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        int iIntValue = ((Number) obj).intValue();
                        TextView textView = getTextViews().get(i);
                        SportSegmentViewManager.Companion companion = SportSegmentViewManager.INSTANCE;
                        Context context = this.context;
                        boolean z = sportDetailMultiplexSegmentFragment.isYard;
                        List list = sportDetailMultiplexSegmentFragment.mSegmentDataList;
                        Integer numValueOf = null;
                        if (list != null && (sportSegmentData = (SportSegmentData) list.get(0)) != null) {
                            numValueOf = Integer.valueOf(sportSegmentData.getUnit());
                        }
                        textView.setText(companion.getSegmentInfoTitle(context, iIntValue, z, numValueOf.intValue(), null, sportDetailMultiplexSegmentFragment.mSportType));
                        i = i2;
                    }
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\n0\u0001R\u00060\u0002R\u00020\u0003B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\u000f"}, d2 = {"Lcom/huami/moving/ui/sport/detail/segment/SportDetailMultiplexSegmentFragment$MultiplexItemAdapter$InfoViewHolder;", "Lcom/huami/moving/ui/sport/detail/segment/SportDetailMultiplexSegmentFragment$MultiplexItemAdapter$HeaderViewHolder;", "Lcom/huami/moving/ui/sport/detail/segment/SportDetailMultiplexSegmentFragment$MultiplexItemAdapter;", "Lcom/huami/moving/ui/sport/detail/segment/SportDetailMultiplexSegmentFragment;", "Lcom/huami/mifit/sportlib/dbkit/bulkparse/SportSegmentData;", "data", "", "", "mTitleList", "", "updateDataInfo", "Landroid/view/View;", "itemView", "<init>", "(Lcom/huami/moving/ui/sport/detail/segment/SportDetailMultiplexSegmentFragment$MultiplexItemAdapter;Landroid/view/View;)V", "moving_release"}, k = 1, mv = {1, 5, 1})
        public final class InfoViewHolder extends HeaderViewHolder {
            public InfoViewHolder(View view) {
                super(view);
            }

            public final void updateDataInfo(@NotNull SportSegmentData data, @NotNull List<Integer> mTitleList) {
                SportDetailMultiplexSegmentFragment sportDetailMultiplexSegmentFragment = SportDetailMultiplexSegmentFragment.this;
                int i = 0;
                for (Object obj : mTitleList) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    getTextViews().get(i).setText(SportSegmentViewManager.INSTANCE.getSegmentInfoValue(this.itemView.getContext(), data, ((Number) obj).intValue(), sportDetailMultiplexSegmentFragment.isMetric, sportDetailMultiplexSegmentFragment.isYard, sportDetailMultiplexSegmentFragment.mSportType, null));
                    i = i2;
                }
            }
        }

        public MultiplexItemAdapter() {
            this.datas = new ArrayList();
            this.mTitleList = new ArrayList();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getA() {
            return this.datas.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int position) {
            return position == 0 ? 0 : 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int position) {
            if (getItemViewType(position) == 0) {
                ((HeaderViewHolder) viewHolder).setHeadInfo(this.mTitleList);
            } else if (getItemViewType(position) == 1) {
                ((InfoViewHolder) viewHolder).updateDataInfo(this.datas.get(position - 1), this.mTitleList);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int viewType) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            return viewType == 0 ? new HeaderViewHolder(layoutInflaterFrom.inflate(R.layout.sport_detail_segment_header_rope, viewGroup, false)) : new InfoViewHolder(layoutInflaterFrom.inflate(R.layout.sport_detail_segment_rope_item, viewGroup, false));
        }

        public MultiplexItemAdapter(@NotNull List<SportSegmentData> list, List<Integer> list2) {
            this();
            this.datas.addAll(list);
            this.mTitleList.addAll(list2);
        }
    }
}
