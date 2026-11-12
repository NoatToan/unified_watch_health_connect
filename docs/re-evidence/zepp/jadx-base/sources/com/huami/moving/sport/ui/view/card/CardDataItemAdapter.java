package com.huami.moving.sport.ui.view.card;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.moving.datacenter.SportDataItem;
import com.huami.moving.sport.ui.R;
import com.huami.tools.analytics.DbUtils;
import com.huami.treadmill.ui.tdmillhome.TdmillHmFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B%\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b#\u0010$J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R4\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006&"}, d2 = {"Lcom/huami/moving/sport/ui/view/card/CardDataItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "Lcom/huami/moving/datacenter/SportDataItem;", "b", "Ljava/util/List;", "list", "", "c", "Z", TdmillHmFragment.ARG_IS_METRIC, "", "Lkotlin/Pair;", "", GoogleApiAvailabilityLight.a, "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "data", "<init>", "(Landroid/content/Context;Ljava/util/List;Z)V", "ViewHolderCardInfo", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
public final class CardDataItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<SportDataItem> list;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isMetric;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private List<Pair<String, String>> data = new ArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/huami/moving/sport/ui/view/card/CardDataItemAdapter$ViewHolderCardInfo;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lkotlin/Pair;", "", "item", "", "bindData", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "content", "b", "desc", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class ViewHolderCardInfo extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final TextView content;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final TextView desc;

        public ViewHolderCardInfo(@NotNull View view) {
            super(view);
            this.content = (TextView) view.findViewById(R.id.over_view_item_content);
            this.desc = (TextView) view.findViewById(R.id.over_view_item_desc);
        }

        public final void bindData(@NotNull Pair<String, String> item) {
            this.content.setText(item.getSecond());
            this.desc.setText(item.getFirst());
        }
    }

    public CardDataItemAdapter(@NotNull Context context, @NotNull List<SportDataItem> list, boolean z) {
        this.context = context;
        this.list = list;
        this.isMetric = z;
    }

    @NotNull
    public final List<Pair<String, String>> getData() {
        return this.data;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getA() {
        return this.data.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof ViewHolderCardInfo) {
            ((ViewHolderCardInfo) holder).bindData(this.data.get(position));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new ViewHolderCardInfo(LayoutInflater.from(this.context).inflate(R.layout.item_new_over_view, parent, false));
    }

    public final void setData(@NotNull List<Pair<String, String>> list) {
        this.data = list;
    }
}
