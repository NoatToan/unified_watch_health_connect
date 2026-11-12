package com.huami.pai.view;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.pai.ext.DateExKt;
import com.huami.pai.ext.PaiTimeExKt;
import com.huami.pai.ext.ViewExKt;
import com.huami.pai.lib.R;
import com.huami.pai.ui.history.PAIBaseHistoryRepo;
import com.huami.pai.vo.PAIDataVo;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 A2\u00020\u0001:\u0006BA\u0019C\u001b\u001eB'\b\u0007\u0012\u0006\u0010;\u001a\u00020:\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<\u0012\b\b\u0002\u0010>\u001a\u00020\u0004¢\u0006\u0004\b?\u0010@J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004J\u0010\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eJ\u001c\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\u000e\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0006R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0016\u0010\"\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010$R\u0016\u0010\u0017\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u001cR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010!R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010$R\u001e\u00101\u001a\n .*\u0004\u0018\u00010-0-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001c\u00105\u001a\b\u0018\u000102R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001c\u00109\u001a\b\u0018\u000106R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u0006D"}, d2 = {"Lcom/huami/pai/view/PAIHorizontalRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "", PointCategory.INIT, "", "position", "", "speed", "smoothScrollToPosition", "valueSize", "setValueSize", "Lcom/huami/pai/view/PAIHorizontalRecyclerView$Callback;", "callback", "setCallback", "", "reverseLayout", "setReverseLayout", "", "startTime", "Lcom/huami/pai/ui/history/PAIBaseHistoryRepo;", "Lcom/huami/pai/vo/PAIDataVo;", CommonLanguageSettingFragment.KEY_REPO, PointCategory.LOAD, "maxValue", "setMaxValue", "a", "Lcom/huami/pai/ui/history/PAIBaseHistoryRepo;", "b", "F", "MIN_PAI_VIEW_WEIGHT", "c", "MAX_PAI_VIEW_WEIGHT", GoogleApiAvailabilityLight.a, "Z", "supportDefaultMaxValue", "e", LogUtil.I, "select", "f", "g", "h", "i", "Lcom/huami/pai/view/PAIHorizontalRecyclerView$Callback;", z.j, "summerieSize", "Ljava/util/Date;", "kotlin.jvm.PlatformType", hl.k, "Ljava/util/Date;", "currentDate", "Lcom/huami/pai/view/PAIHorizontalRecyclerView$HMHorizontalLinearLayoutManager;", "l", "Lcom/huami/pai/view/PAIHorizontalRecyclerView$HMHorizontalLinearLayoutManager;", "layoutManager", "Lcom/huami/pai/view/PAIHorizontalRecyclerView$a;", "m", "Lcom/huami/pai/view/PAIHorizontalRecyclerView$a;", "adapter", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "Callback", "HMHorizontalLinearLayoutManager", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class PAIHorizontalRecyclerView extends RecyclerView {

    @NotNull
    private static final String n = "HMHorizontalRecyclerView";
    private static final float o = 200.0f;
    private static final float p = 50.0f;
    private static final int q = 7;
    private static final int r = 110;
    private static final int s = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private PAIBaseHistoryRepo<PAIDataVo> repo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float MIN_PAI_VIEW_WEIGHT;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float MAX_PAI_VIEW_WEIGHT;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean supportDefaultMaxValue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int select;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int valueSize;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private float maxValue;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean reverseLayout;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private Callback callback;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int summerieSize;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private Date currentDate;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private HMHorizontalLinearLayoutManager layoutManager;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private a adapter;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lcom/huami/pai/view/PAIHorizontalRecyclerView$Callback;", "", "Ljava/util/Date;", "startDate", "", "position", "", "onSelect", "lib_release"}, k = 1, mv = {1, 5, 1})
    public interface Callback {
        void onSelect(@NotNull Date startDate, int position);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B#\b\u0000\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\"\u0010\u0010\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/huami/pai/view/PAIHorizontalRecyclerView$HMHorizontalLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView$State;", "state", "", "position", "", "smoothScrollToPosition", "", "a", "F", "()F", "b", "(F)V", "speed", "Landroidx/recyclerview/widget/LinearSmoothScroller;", "Landroidx/recyclerview/widget/LinearSmoothScroller;", "linearSmoothScroller", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "orientation", "", "reverseLayout", "<init>", "(Lcom/huami/pai/view/PAIHorizontalRecyclerView;Landroid/content/Context;IZ)V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public final class HMHorizontalLinearLayoutManager extends LinearLayoutManager {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private float speed;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private LinearSmoothScroller linearSmoothScroller;

        public HMHorizontalLinearLayoutManager(Context context, int i, boolean z) {
            super(context, i, z);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final float getSpeed() {
            return this.speed;
        }

        public final void b(float f) {
            this.speed = f;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void smoothScrollToPosition(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state, int position) {
            if (this.linearSmoothScroller == null) {
                final Context context = recyclerView.getContext();
                this.linearSmoothScroller = new LinearSmoothScroller(context) { // from class: com.huami.pai.view.PAIHorizontalRecyclerView$HMHorizontalLinearLayoutManager$smoothScrollToPosition$1
                    @Override // androidx.recyclerview.widget.LinearSmoothScroller
                    public float calculateSpeedPerPixel(@NotNull DisplayMetrics displayMetrics) {
                        return this.a.getSpeed() / displayMetrics.densityDpi;
                    }

                    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
                    @Nullable
                    public PointF computeScrollVectorForPosition(int targetPosition) {
                        return super.computeScrollVectorForPosition(targetPosition);
                    }
                };
            }
            this.linearSmoothScroller.setTargetPosition(position);
            startSmoothScroll(this.linearSmoothScroller);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0018\u00010\u0002R\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\b\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\t\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016¨\u0006\u0010"}, d2 = {"com/huami/pai/view/PAIHorizontalRecyclerView$a", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huami/pai/view/PAIHorizontalRecyclerView$c;", "Lcom/huami/pai/view/PAIHorizontalRecyclerView;", "Landroid/view/ViewGroup;", "viewGroup", "", "i", "c", "viewHolder", "position", "", "b", "getItemCount", "<init>", "(Lcom/huami/pai/view/PAIHorizontalRecyclerView;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public final class a extends RecyclerView.Adapter<c> {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(c cVar, PAIHorizontalRecyclerView pAIHorizontalRecyclerView, a aVar, View view) {
            Callback callback;
            if (cVar.getLayoutPosition() >= pAIHorizontalRecyclerView.summerieSize) {
                return;
            }
            pAIHorizontalRecyclerView.select = cVar.getLayoutPosition();
            aVar.notifyDataSetChanged();
            pAIHorizontalRecyclerView.smoothScrollToPosition(pAIHorizontalRecyclerView.layoutManager.findLastVisibleItemPosition() + (cVar.getLayoutPosition() - pAIHorizontalRecyclerView.layoutManager.findFirstVisibleItemPosition()), 50.0f);
            if (pAIHorizontalRecyclerView.callback != null && (callback = pAIHorizontalRecyclerView.callback) != null) {
                callback.onSelect(pAIHorizontalRecyclerView.currentDate, pAIHorizontalRecyclerView.select);
            }
            System.out.println((Object) ("select_:" + pAIHorizontalRecyclerView.select));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull c viewHolder, int position) {
            if (position >= PAIHorizontalRecyclerView.this.summerieSize) {
                viewHolder.a(position, PAIHorizontalRecyclerView.this.maxValue, null);
            } else {
                viewHolder.a(position, PAIHorizontalRecyclerView.this.maxValue, null);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public c onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
            View viewInflate = LayoutInflater.from(PAIHorizontalRecyclerView.this.getContext()).inflate(R.layout.pai_item_history, viewGroup, false);
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            layoutParams.width = (int) ((PAIHorizontalRecyclerView.this.getResources().getDisplayMetrics().widthPixels - ViewExKt.dip2px(PAIHorizontalRecyclerView.this, 48.0f)) / PAIHorizontalRecyclerView.this.valueSize);
            viewInflate.setLayoutParams(layoutParams);
            final c cVar = PAIHorizontalRecyclerView.this.new c(viewInflate);
            final PAIHorizontalRecyclerView pAIHorizontalRecyclerView = PAIHorizontalRecyclerView.this;
            viewInflate.setOnClickListener(new View.OnClickListener() { // from class: com.huami.pai.view.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PAIHorizontalRecyclerView.a.d(cVar, pAIHorizontalRecyclerView, this, view);
                }
            });
            return cVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return PAIHorizontalRecyclerView.this.summerieSize + 7;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"com/huami/pai/view/PAIHorizontalRecyclerView$b", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "newState", "", "onScrollStateChanged", "<init>", "(Lcom/huami/pai/view/PAIHorizontalRecyclerView;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public final class b extends RecyclerView.OnScrollListener {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int newState) {
            Callback callback;
            a aVar;
            super.onScrollStateChanged(recyclerView, newState);
            if (newState == 0) {
                int iFindFirstVisibleItemPosition = PAIHorizontalRecyclerView.this.layoutManager.findFirstVisibleItemPosition();
                PAIHorizontalRecyclerView pAIHorizontalRecyclerView = PAIHorizontalRecyclerView.this;
                if (iFindFirstVisibleItemPosition >= pAIHorizontalRecyclerView.summerieSize) {
                    iFindFirstVisibleItemPosition = PAIHorizontalRecyclerView.this.summerieSize - 1;
                }
                pAIHorizontalRecyclerView.select = iFindFirstVisibleItemPosition;
                if (PAIHorizontalRecyclerView.this.adapter != null && (aVar = PAIHorizontalRecyclerView.this.adapter) != null) {
                    aVar.notifyDataSetChanged();
                }
                if (PAIHorizontalRecyclerView.this.callback != null && (callback = PAIHorizontalRecyclerView.this.callback) != null) {
                    callback.onSelect(PAIHorizontalRecyclerView.this.currentDate, PAIHorizontalRecyclerView.this.select);
                }
                System.out.println((Object) ("select:" + PAIHorizontalRecyclerView.this.select));
                PAIHorizontalRecyclerView pAIHorizontalRecyclerView2 = PAIHorizontalRecyclerView.this;
                pAIHorizontalRecyclerView2.smoothScrollToPosition(pAIHorizontalRecyclerView2.select, 200.0f);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J \u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b¨\u0006\u0011"}, d2 = {"com/huami/pai/view/PAIHorizontalRecyclerView$c", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "value", "", "b", "", "position", "maxValue", "", "data", "a", "itemView", "<init>", "(Lcom/huami/pai/view/PAIHorizontalRecyclerView;Landroid/view/View;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public final class c extends RecyclerView.ViewHolder {
        public c(View view) {
            super(view);
        }

        private final void b(View view, float value) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (value < 1.0f) {
                layoutParams2.weight = 0.0f;
            } else {
                layoutParams2.weight = Math.min(Math.max(value / 110, PAIHorizontalRecyclerView.this.MIN_PAI_VIEW_WEIGHT), PAIHorizontalRecyclerView.this.MAX_PAI_VIEW_WEIGHT);
            }
            view.setLayoutParams(layoutParams2);
        }

        public final void a(int position, float maxValue, @Nullable Object data) {
            TextView textView = (TextView) this.itemView.findViewById(R.id.item_pai_date);
            View viewFindViewById = this.itemView.findViewById(R.id.item_pai_values);
            ImageView imageView = (ImageView) this.itemView.findViewById(R.id.iv_item_day_select);
            imageView.setVisibility(4);
            Context context = PAIHorizontalRecyclerView.this.getContext();
            int i = R.color.s2;
            textView.setTextColor(ContextCompat.getColor(context, i));
            if (position >= (PAIHorizontalRecyclerView.this.summerieSize + 7) - 1) {
                this.itemView.setVisibility(4);
                return;
            }
            this.itemView.setVisibility(0);
            if (position == 0) {
                textView.setText(R.string.pai_pai_today);
            } else {
                textView.setText(PaiTimeExKt.formatTimeMD(PAIHorizontalRecyclerView.this.getContext(), DateExKt.nextDay(PAIHorizontalRecyclerView.this.currentDate, -position)));
            }
            if (PAIHorizontalRecyclerView.this.select == position) {
                imageView.setVisibility(0);
                textView.setTextColor(ContextCompat.getColor(PAIHorizontalRecyclerView.this.getContext(), R.color.black90));
            } else {
                imageView.setVisibility(4);
                textView.setTextColor(ContextCompat.getColor(PAIHorizontalRecyclerView.this.getContext(), i));
            }
            View viewFindViewById2 = this.itemView.findViewById(R.id.item_pai_value);
            Date dateNextDay = DateExKt.nextDay(PAIHorizontalRecyclerView.this.currentDate, -position);
            PAIBaseHistoryRepo pAIBaseHistoryRepo = PAIHorizontalRecyclerView.this.repo;
            Objects.requireNonNull(pAIBaseHistoryRepo);
            if (pAIBaseHistoryRepo.hasReal(dateNextDay)) {
                PAIBaseHistoryRepo pAIBaseHistoryRepo2 = PAIHorizontalRecyclerView.this.repo;
                Objects.requireNonNull(pAIBaseHistoryRepo2);
                PAIDataVo data2 = pAIBaseHistoryRepo2.getData(dateNextDay);
                float tp = data2 == null ? 0.0f : data2.getTp();
                b(viewFindViewById2, tp);
                viewFindViewById.setVisibility(0);
                if (tp < 50.0f) {
                    viewFindViewById2.setBackground(ContextCompat.getDrawable(PAIHorizontalRecyclerView.this.getContext(), R.drawable.bg_pai_low));
                    return;
                } else if (tp < 100.0f) {
                    viewFindViewById2.setBackground(ContextCompat.getDrawable(PAIHorizontalRecyclerView.this.getContext(), R.drawable.bg_pai_middle));
                    return;
                } else {
                    viewFindViewById2.setBackground(ContextCompat.getDrawable(PAIHorizontalRecyclerView.this.getContext(), R.drawable.bg_pai_high));
                    return;
                }
            }
            PAIBaseHistoryRepo pAIBaseHistoryRepo3 = PAIHorizontalRecyclerView.this.repo;
            Objects.requireNonNull(pAIBaseHistoryRepo3);
            Float predictData = pAIBaseHistoryRepo3.getPredictData(dateNextDay);
            if (predictData == null) {
                viewFindViewById.setVisibility(4);
                return;
            }
            b(viewFindViewById2, predictData.floatValue());
            viewFindViewById.setVisibility(0);
            if (predictData.floatValue() < 50.0f) {
                viewFindViewById2.setBackground(ContextCompat.getDrawable(PAIHorizontalRecyclerView.this.getContext(), R.drawable.bg_pai_low));
            } else if (predictData.floatValue() < 100.0f) {
                viewFindViewById2.setBackground(ContextCompat.getDrawable(PAIHorizontalRecyclerView.this.getContext(), R.drawable.bg_pai_middle));
            } else {
                viewFindViewById2.setBackground(ContextCompat.getDrawable(PAIHorizontalRecyclerView.this.getContext(), R.drawable.bg_pai_high));
            }
        }
    }

    @JvmOverloads
    public PAIHorizontalRecyclerView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public PAIHorizontalRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PAIHorizontalRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void init() {
        this.layoutManager = new HMHorizontalLinearLayoutManager(getContext(), 0, this.reverseLayout);
        b bVar = new b();
        this.adapter = new a();
        setLayoutManager(this.layoutManager);
        setAdapter(this.adapter);
        addOnScrollListener(bVar);
    }

    public final void load(long startTime, @NotNull PAIBaseHistoryRepo<PAIDataVo> repo) {
        this.summerieSize = PaiTimeExKt.differDays$default(startTime, 0L, 2, null) + 1;
        this.repo = repo;
        this.select = 0;
        Callback callback = this.callback;
        if (callback != null) {
            callback.onSelect(this.currentDate, this.select);
        }
        init();
    }

    public final void setCallback(@Nullable Callback callback) {
        this.callback = callback;
    }

    public final void setMaxValue(float maxValue) {
        this.supportDefaultMaxValue = true;
        this.maxValue = maxValue;
    }

    public final void setReverseLayout(boolean reverseLayout) {
        this.reverseLayout = reverseLayout;
    }

    public final void setValueSize(int valueSize) {
        this.valueSize = valueSize;
    }

    public final void smoothScrollToPosition(int position, float speed) {
        this.layoutManager.b(speed);
        boolean z = false;
        if (position >= 0 && position <= this.summerieSize) {
            z = true;
        }
        if (z) {
            super.smoothScrollToPosition(position);
        }
    }

    @JvmOverloads
    public PAIHorizontalRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.MIN_PAI_VIEW_WEIGHT = 0.01f;
        this.MAX_PAI_VIEW_WEIGHT = 1.0f;
        this.select = -1;
        this.valueSize = 7;
        this.currentDate = Calendar.getInstance().getTime();
    }
}
