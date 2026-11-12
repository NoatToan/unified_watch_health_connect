package com.huami.moving.sport.ui.view.card;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.moving.sport.ui.R;
import com.huami.moving.sport.ui.common.SportDataDisplayItem;
import com.huami.moving.ui.utils.SportTypeDescription;
import com.huami.moving.ui.utils.SportTypeIdentifier;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001:B%\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b8\u00109J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0002J(\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\u0018\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0003H\u0016R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR4\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f0 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010+\u001a\u00020'2\u0006\u0010(\u001a\u00020'8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R$\u00101\u001a\u00020\r2\u0006\u0010(\u001a\u00020\r8\u0006@BX\u0086.¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R4\u00107\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r022\u000e\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r028\u0006@BX\u0086.¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u0006;"}, d2 = {"Lcom/huami/moving/sport/ui/view/card/CardInfoAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "dataType", "source", "sportMode", "", "b", "", "Lcom/huami/moving/sport/ui/common/SportDataDisplayItem;", "displayItems", "Lkotlin/Pair;", "", "a", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "onBindViewHolder", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "record", "c", "Ljava/util/List;", "displays", "", GoogleApiAvailabilityLight.a, "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "data", "", "<set-?>", "e", "Z", "isOutdoor", "()Z", "f", "Ljava/lang/String;", "getPostfix", "()Ljava/lang/String;", "postfix", "", "g", "[Ljava/lang/String;", "getMainContent", "()[Ljava/lang/String;", "mainContent", "<init>", "(Landroid/content/Context;Lcom/xiaomi/hm/health/databases/model/Trackrecord;Ljava/util/List;)V", "ViewHolderCardInfo", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
public final class CardInfoAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Trackrecord record;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final List<SportDataDisplayItem> displays;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private List<Pair<String, String>> data = new ArrayList();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean isOutdoor = true;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private String postfix;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String[] mainContent;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/huami/moving/sport/ui/view/card/CardInfoAdapter$ViewHolderCardInfo;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lkotlin/Pair;", "", "item", "", "bindData", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "content", "b", "desc", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
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

    public CardInfoAdapter(@NotNull Context context, @NotNull Trackrecord trackrecord, @NotNull List<SportDataDisplayItem> list) {
        this.context = context;
        this.record = trackrecord;
        this.displays = list;
        Integer type = trackrecord.getType();
        Integer numValueOf = null;
        if (type != null) {
            type = SportTypeIdentifier.isSubSport(type.intValue()) ? type : null;
            if (type != null) {
                numValueOf = Integer.valueOf(type.intValue() - 1000);
            }
        }
        b((numValueOf == null ? trackrecord.getType() : numValueOf).intValue(), trackrecord.getSource().intValue(), trackrecord.getSportMode());
        this.data.addAll(a(list));
    }

    private final List<Pair<String, String>> a(List<SportDataDisplayItem> displayItems) {
        ArrayList arrayList = new ArrayList();
        for (SportDataDisplayItem sportDataDisplayItem : displayItems) {
            arrayList.add(new Pair(sportDataDisplayItem.getTitle(), sportDataDisplayItem.getValue()));
        }
        return arrayList;
    }

    private final void b(int dataType, int source, int sportMode) {
        Unit unit;
        if (SportTypeIdentifier.isSubSport(dataType)) {
            dataType -= 1000;
        }
        SportTypeDescription sportTypeDescriptionFindSportTypeDescription = SportTypeDescription.INSTANCE.findSportTypeDescription(dataType, source, sportMode);
        if (sportTypeDescriptionFindSportTypeDescription == null) {
            unit = null;
        } else {
            this.isOutdoor = sportTypeDescriptionFindSportTypeDescription.getIsOutdoor();
            this.postfix = this.context.getString(sportTypeDescriptionFindSportTypeDescription.getNameId());
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            this.isOutdoor = false;
            this.postfix = "NoName";
        }
    }

    @NotNull
    public final List<Pair<String, String>> getData() {
        return this.data;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getFragmentsCount() {
        return this.data.size();
    }

    @NotNull
    public final String[] getMainContent() {
        String[] strArr = this.mainContent;
        Objects.requireNonNull(strArr);
        return strArr;
    }

    @NotNull
    public final String getPostfix() {
        String str = this.postfix;
        Objects.requireNonNull(str);
        return str;
    }

    /* JADX INFO: renamed from: isOutdoor, reason: from getter */
    public final boolean getIsOutdoor() {
        return this.isOutdoor;
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
