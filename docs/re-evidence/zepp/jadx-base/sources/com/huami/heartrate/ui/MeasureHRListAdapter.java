package com.huami.heartrate.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.heartrate.R;
import com.huami.heartrate.utils.HeartRateTimeUtils;
import com.huami.tools.analytics.DbUtils;
import java.util.Date;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000f\u0014B\u001d\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b \u0010!J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001b\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u000f\u0010\u001aR\u001d\u0010\u001f\u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u0014\u0010\u001e¨\u0006\""}, d2 = {"Lcom/huami/heartrate/ui/MeasureHRListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "position", "getItemViewType", "holder", "", "onBindViewHolder", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "Lcom/huami/heartrate/ui/HistoryViewTypeData;", "b", "Ljava/util/List;", "historyTypeDataList", "Landroid/view/LayoutInflater;", "c", "Lkotlin/Lazy;", "()Landroid/view/LayoutInflater;", "layoutInflater", "", GoogleApiAvailabilityLight.a, "()Ljava/lang/String;", "thisYear", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final class MeasureHRListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<HistoryViewTypeData> historyTypeDataList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy layoutInflater = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy thisYear = LazyKt__LazyJVMKt.lazy(new d());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u000b"}, d2 = {"com/huami/heartrate/ui/MeasureHRListAdapter$a", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView;", "a", "Landroidx/recyclerview/widget/RecyclerView;", "()Landroidx/recyclerview/widget/RecyclerView;", "list", "Landroid/view/View;", "itemView", "<init>", "(Lcom/huami/heartrate/ui/MeasureHRListAdapter;Landroid/view/View;)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
    public final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final RecyclerView list;

        public a(View view) {
            super(view);
            this.list = (RecyclerView) view.findViewById(R.id.recycler_view);
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final RecyclerView getList() {
            return this.list;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u0019\u0010\r\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\b\u0010\f¨\u0006\u0011"}, d2 = {"com/huami/heartrate/ui/MeasureHRListAdapter$b", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "c", "()Landroid/widget/TextView;", "year", "b", "date", "Landroid/view/View;", "Landroid/view/View;", "()Landroid/view/View;", "line", "itemView", "<init>", "(Lcom/huami/heartrate/ui/MeasureHRListAdapter;Landroid/view/View;)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
    public final class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final TextView year;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final TextView date;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final View line;

        public b(View view) {
            super(view);
            this.year = (TextView) view.findViewById(R.id.year);
            this.date = (TextView) view.findViewById(R.id.date);
            this.line = view.findViewById(R.id.line_top);
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextView getDate() {
            return this.date;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final View getLine() {
            return this.line;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextView getYear() {
            return this.year;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<LayoutInflater> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LayoutInflater invoke() {
            return LayoutInflater.from(MeasureHRListAdapter.this.context);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return HeartRateTimeUtils.INSTANCE.formatYear(MeasureHRListAdapter.this.context, new Date());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MeasureHRListAdapter(@NotNull Context context, @NotNull List<? extends HistoryViewTypeData> list) {
        this.context = context;
        this.historyTypeDataList = list;
    }

    private final LayoutInflater a() {
        return (LayoutInflater) this.layoutInflater.getValue();
    }

    private final String b() {
        return (String) this.thisYear.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getPagerCount() {
        return this.historyTypeDataList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return this.historyTypeDataList.get(position).getViewType().ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
        HistoryViewTypeData historyViewTypeData = this.historyTypeDataList.get(position);
        if (!(holder instanceof b)) {
            if (holder instanceof a) {
                RecyclerView list = ((a) holder).getList();
                list.setLayoutManager(new LinearLayoutManager(list.getContext()));
                list.setAdapter(new com.huami.heartrate.ui.a(list.getContext(), ((ListData) historyViewTypeData).getList()));
                return;
            }
            return;
        }
        b bVar = (b) holder;
        TitleData titleData = (TitleData) historyViewTypeData;
        bVar.getYear().setText(titleData.getYear());
        bVar.getDate().setText(titleData.getDate());
        bVar.getYear().setVisibility(!Intrinsics.areEqual(titleData.getYear(), b()) && titleData.getShowYear() ? 0 : 8);
        bVar.getLine().setVisibility(position != 0 ? 0 : 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return viewType == ViewType.TITLE.ordinal() ? new b(a().inflate(R.layout.heart_rate_history_item_title, parent, false)) : new a(a().inflate(R.layout.heart_rate_history_item_list, parent, false));
    }
}
