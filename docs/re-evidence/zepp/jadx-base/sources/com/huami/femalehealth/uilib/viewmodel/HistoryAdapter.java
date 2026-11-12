package com.huami.femalehealth.uilib.viewmodel;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.paging.PagedListAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.femalehealth.logiclib.helper.DateHelper;
import com.huami.femalehealth.logiclib.vo.HistoryItemVo;
import com.huami.femalehealth.uilib.R;
import com.huami.femalehealth.uilib.helper.ResourceHelper;
import com.huami.femalehealth.uilib.helper.SupportAppHelper;
import com.huami.femalehealth.uilib.viewmodel.HistoryAdapter;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.hmdateformat.date.HMPattern;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002#$B<\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012#\u0010 \u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001a¢\u0006\u0004\b!\u0010\"J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0014J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0006H\u0016R\u0019\u0010\u0015\u001a\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R3\u0010 \u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006%"}, d2 = {"Lcom/huami/femalehealth/uilib/viewmodel/HistoryAdapter;", "Landroidx/paging/PagedListAdapter;", "Lcom/huami/femalehealth/logiclib/vo/HistoryItemVo;", "Lcom/huami/femalehealth/uilib/viewmodel/HistoryAdapter$ViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "position", "getItemViewType", "getItemCount", "getItem", "holder", "", "onBindViewHolder", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "b", "Z", "addEnable", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "item", "c", "Lkotlin/jvm/functions/Function1;", "onItemClick", "<init>", "(Landroid/content/Context;ZLkotlin/jvm/functions/Function1;)V", "Companion", "ViewHolder", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class HistoryAdapter extends PagedListAdapter<HistoryItemVo, ViewHolder> {

    @NotNull
    private static final HistoryAdapter$Companion$DIFF$1 d = new DiffUtil.ItemCallback<HistoryItemVo>() { // from class: com.huami.femalehealth.uilib.viewmodel.HistoryAdapter$Companion$DIFF$1
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(@NotNull HistoryItemVo oldItem, @NotNull HistoryItemVo newItem) {
            return Intrinsics.areEqual(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(@NotNull HistoryItemVo oldItem, @NotNull HistoryItemVo newItem) {
            return Intrinsics.areEqual(oldItem.getId(), newItem.getId());
        }
    };
    private static final int e;
    private static final int f;
    private static final float g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean addEnable;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final Function1<HistoryItemVo, Unit> onItemClick;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000  2\u00020\u0001:\u0002 \u0011BD\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012#\u0010\u0019\u001a\u001f\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u001e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002R\u0016\u0010\u0013\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R3\u0010\u0019\u001a\u001f\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006!"}, d2 = {"Lcom/huami/femalehealth/uilib/viewmodel/HistoryAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "day", "", "c", "", "isAdd", "pos", "dataSize", "Lcom/huami/femalehealth/uilib/viewmodel/HistoryAdapter$ViewHolder$a;", GoogleApiAvailabilityLight.a, "Lcom/huami/femalehealth/logiclib/vo/HistoryItemVo;", "item", "position", "", "bind", "a", "Z", "addEnable", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "b", "Lkotlin/jvm/functions/Function1;", "onItemClick", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/content/Context;Landroid/view/ViewGroup;ZLkotlin/jvm/functions/Function1;)V", "Companion", "uilib_release"}, k = 1, mv = {1, 5, 1})
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        private static final String c = "MenstruationHistoryViewModel.ViewHolder";

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean addEnable;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private final Function1<HistoryItemVo, Unit> onItemClick;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0019\u0010\r\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u0019\u0010\u000f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000e\u0010\tR\u0019\u0010\u0013\u001a\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012¨\u0006\u0016"}, d2 = {"com/huami/femalehealth/uilib/viewmodel/HistoryAdapter$ViewHolder$a", "", "Landroid/view/View;", "itemView", "", "a", "", "Z", "c", "()Z", "isAdd", "b", GoogleApiAvailabilityLight.a, "isFirstData", "e", "isLastData", "", LogUtil.I, "()I", "itemHeight", "<init>", "(ZZZI)V", "uilib_release"}, k = 1, mv = {1, 5, 1})
        public static final class a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final boolean isAdd;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final boolean isFirstData;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final boolean isLastData;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final int itemHeight;

            public a(boolean z, boolean z2, boolean z3, int i) {
                this.isAdd = z;
                this.isFirstData = z2;
                this.isLastData = z3;
                this.itemHeight = i;
            }

            public final void a(@NotNull View itemView) {
                Drawable resDrawable;
                int i = R.id.item_root;
                ((ConstraintLayout) itemView.findViewById(i)).getLayoutParams().height = getItemHeight();
                SupportAppHelper.Companion companion = SupportAppHelper.INSTANCE;
                if (companion.isMifit() || !companion.isAmazfit() || getIsAdd()) {
                    resDrawable = ExtKt.getResDrawable(itemView, R.drawable.fh_history_item_all_conner);
                } else if (getIsFirstData() && getIsLastData()) {
                    resDrawable = ExtKt.getResDrawable(itemView, R.drawable.fh_history_item_all_conner);
                } else if (getIsFirstData()) {
                    resDrawable = ExtKt.getResDrawable(itemView, R.drawable.fh_history_item_top_conner);
                } else {
                    resDrawable = getIsLastData() ? ExtKt.getResDrawable(itemView, R.drawable.fh_history_item_bottom_conner) : ExtKt.getResDrawable(itemView, R.drawable.fh_history_item_no_conner);
                }
                if (companion.isAmazfit() && getIsAdd()) {
                    ((ConstraintLayout) itemView.findViewById(R.id.cl_add)).setBackground(resDrawable);
                } else {
                    ((ConstraintLayout) itemView.findViewById(i)).setBackground(resDrawable);
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    ((ConstraintLayout) itemView.findViewById(i)).setElevation(HistoryAdapter.g);
                }
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final int getItemHeight() {
                return this.itemHeight;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final boolean getIsAdd() {
                return this.isAdd;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final boolean getIsFirstData() {
                return this.isFirstData;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final boolean getIsLastData() {
                return this.isLastData;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ HistoryItemVo a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(HistoryItemVo historyItemVo) {
                super(0);
                this.a = historyItemVo;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return Intrinsics.stringPlus("HistoryItemVo:", this.a);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ViewHolder(@NotNull Context context, @NotNull ViewGroup viewGroup, boolean z, @Nullable Function1<? super HistoryItemVo, Unit> function1) {
            super(LayoutInflater.from(context).inflate(R.layout.fh_item_history, viewGroup, false));
            this.addEnable = z;
            this.onItemClick = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(ViewHolder viewHolder, HistoryItemVo historyItemVo, View view) {
            Function1<HistoryItemVo, Unit> function1 = viewHolder.onItemClick;
            if (function1 == null) {
                return;
            }
            function1.invoke(historyItemVo);
        }

        private final String c(int day) {
            String quantityString;
            Resources resources = ResourceHelper.INSTANCE.getResources();
            return (resources == null || (quantityString = resources.getQuantityString(R.plurals.fh_time_day_var, day, Integer.valueOf(day))) == null) ? "" : quantityString;
        }

        private final a d(boolean isAdd, int pos, int dataSize) {
            return new a(isAdd, !this.addEnable ? pos != 0 : pos != 1, pos == dataSize - 1, isAdd ? HistoryAdapter.e : HistoryAdapter.f);
        }

        public final void bind(@NotNull final HistoryItemVo item, int position, int dataSize) {
            HMLog.info("xys_MenstruationHistoryViewModel.ViewHolder", new b(item));
            DateHelper dateHelper = DateHelper.INSTANCE;
            String menstrualPeriodString = dateHelper.isCurrentYear(item.getMenstrualPeriod()) ? item.getMenstrualPeriodString(HMPattern.ABBR_MONTH_DAY) : item.getMenstrualPeriodString(HMPattern.YEAR_ABBR_MONTH_DAY);
            String menstrualEndTimeString = dateHelper.isCurrentYear(item.getMenstrualEndTime()) ? item.getMenstrualEndTimeString(HMPattern.ABBR_MONTH_DAY) : item.getMenstrualEndTimeString(HMPattern.YEAR_ABBR_MONTH_DAY);
            View view = this.itemView;
            boolean z = item.getType() == 17;
            ExtKt.setVisible$default(view.findViewById(R.id.view_line), SupportAppHelper.INSTANCE.isAmazfit() && z, false, 2, null);
            d(z, position, dataSize).a(this.itemView);
            if (z) {
                ExtKt.setVisible$default((ConstraintLayout) view.findViewById(R.id.cl_add), true, false, 2, null);
                ExtKt.setVisible$default((ConstraintLayout) view.findViewById(R.id.cl_history), false, false, 2, null);
            } else {
                ExtKt.setVisible$default((ConstraintLayout) view.findViewById(R.id.cl_add), false, false, 2, null);
                ExtKt.setVisible$default((ConstraintLayout) view.findViewById(R.id.cl_history), true, false, 2, null);
                if (item.isEnd()) {
                    TextView textView = (TextView) view.findViewById(R.id.tv_date);
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    ResourceHelper resourceHelper = ResourceHelper.INSTANCE;
                    textView.setText(String.format(resourceHelper.getString(R.string.fh_time_from), Arrays.copyOf(new Object[]{menstrualPeriodString, menstrualEndTimeString}, 2)));
                    ((TextView) view.findViewById(R.id.tv_desc)).setText(String.format(resourceHelper.getString(R.string.fh_menstruation_periodicity_desc), Arrays.copyOf(new Object[]{c(item.getCycle()), c(item.getDur())}, 2)));
                } else {
                    TextView textView2 = (TextView) view.findViewById(R.id.tv_date);
                    ResourceHelper resourceHelper2 = ResourceHelper.INSTANCE;
                    textView2.setText(resourceHelper2.getString(R.string.fh_current_menstruation));
                    TextView textView3 = (TextView) view.findViewById(R.id.tv_desc);
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    textView3.setText(String.format(resourceHelper2.getString(R.string.fh_menstruation_from), Arrays.copyOf(new Object[]{menstrualPeriodString}, 1)));
                }
            }
            view.setOnClickListener(new View.OnClickListener() { // from class: q04
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    HistoryAdapter.ViewHolder.b(this.a, item, view2);
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.femalehealth.uilib.viewmodel.HistoryAdapter$Companion$DIFF$1] */
    static {
        ResourceHelper resourceHelper = ResourceHelper.INSTANCE;
        e = (int) resourceHelper.getDimen(R.dimen.fh_history_add_item_height);
        f = (int) resourceHelper.getDimen(R.dimen.fh_history_item_height);
        g = resourceHelper.getDimen(R.dimen.fh_history_card_elevation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HistoryAdapter(@NotNull Context context, boolean z, @Nullable Function1<? super HistoryItemVo, Unit> function1) {
        super(d);
        this.context = context;
        this.addEnable = z;
        this.onItemClick = function1;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // androidx.paging.PagedListAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getPagerCount() {
        int pagerCount = super.getPagerCount();
        return this.addEnable ? pagerCount + 1 : pagerCount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return (this.addEnable && position == 0) ? 17 : 16;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.paging.PagedListAdapter
    @Nullable
    public HistoryItemVo getItem(int position) {
        if (getItemViewType(position) == 17) {
            return HistoryItemVo.INSTANCE.getADD_TYPE_VO();
        }
        if (this.addEnable) {
            position--;
        }
        return (HistoryItemVo) super.getItem(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        HistoryItemVo item = getItem(position);
        if (item == null) {
            return;
        }
        holder.bind(item, position, getPagerCount());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new ViewHolder(this.context, parent, this.addEnable, this.onItemClick);
    }
}
