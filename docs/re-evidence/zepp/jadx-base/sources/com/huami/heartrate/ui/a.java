package com.huami.heartrate.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.heartrate.R;
import com.huami.tools.analytics.DbUtils;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u000eB\u001d\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\u0007\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\t\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005H\u0016R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0019\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/huami/heartrate/ui/a;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huami/heartrate/ui/a$a;", "Landroid/view/ViewGroup;", "parent", "", "viewType", GoogleApiAvailabilityLight.a, "getItemCount", "holder", "position", "", "c", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "Lcom/huami/heartrate/ui/HistoryListValueData;", "b", "Ljava/util/List;", "valueDataList", "Landroid/view/LayoutInflater;", "Lkotlin/Lazy;", "()Landroid/view/LayoutInflater;", "layoutInflater", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
final class a extends RecyclerView.Adapter<C0441a> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<HistoryListValueData> valueDataList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy layoutInflater = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: com.huami.heartrate.ui.a$a, reason: collision with other inner class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u000e"}, d2 = {"com/huami/heartrate/ui/a$a", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "getValue", "()Landroid/widget/TextView;", "value", "b", "time", "Landroid/view/View;", "itemView", "<init>", "(Lcom/huami/heartrate/ui/a;Landroid/view/View;)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
    public final class C0441a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final TextView value;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final TextView time;

        public C0441a(View view) {
            super(view);
            this.value = (TextView) view.findViewById(R.id.value);
            this.time = (TextView) view.findViewById(R.id.time);
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextView getTime() {
            return this.time;
        }

        @NotNull
        public final TextView getValue() {
            return this.value;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<LayoutInflater> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LayoutInflater invoke() {
            return LayoutInflater.from(a.this.context);
        }
    }

    public a(@NotNull Context context, @NotNull List<HistoryListValueData> list) {
        this.context = context;
        this.valueDataList = list;
    }

    private final LayoutInflater b() {
        return (LayoutInflater) this.layoutInflater.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C0441a holder, int position) {
        HistoryListValueData historyListValueData = this.valueDataList.get(position);
        holder.getValue().setText(historyListValueData.getValue());
        holder.getTime().setText(historyListValueData.getTime());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public C0441a onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new C0441a(b().inflate(R.layout.heart_rate_history_item_list_item, parent, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getA() {
        return this.valueDataList.size();
    }
}
