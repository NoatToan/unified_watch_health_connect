package com.huami.watch.companion.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.R;
import com.huami.watch.companion.ui.activity.SearchBindDeviceActivity;
import com.huami.watch.companion.ui.adapter.NearbyDeviceAdapter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.g;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b \u0010!J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\b\u0010\f\u001a\u00020\u0005H\u0016J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0005H\u0016R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R0\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/huami/watch/companion/ui/adapter/NearbyDeviceAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huami/watch/companion/ui/adapter/DeviceViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "Lcom/huami/watch/companion/ui/activity/SearchBindDeviceActivity$DeviceState;", "data", "", "addData", "getItemCount", "holder", "position", "onBindViewHolder", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "b", "Ljava/util/List;", "dataList", "Lkotlin/Function1;", "c", "Lkotlin/jvm/functions/Function1;", "getItemClickListener", "()Lkotlin/jvm/functions/Function1;", "setItemClickListener", "(Lkotlin/jvm/functions/Function1;)V", "itemClickListener", "<init>", "(Landroid/content/Context;)V", "companion_release"}, k = 1, mv = {1, 5, 1})
public final class NearbyDeviceAdapter extends RecyclerView.Adapter<DeviceViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private List<SearchBindDeviceActivity.DeviceState> dataList = new ArrayList();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Function1<? super SearchBindDeviceActivity.DeviceState, Unit> itemClickListener;

    public NearbyDeviceAdapter(@NotNull Context context) {
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(NearbyDeviceAdapter nearbyDeviceAdapter, SearchBindDeviceActivity.DeviceState deviceState, View view) {
        Function1<SearchBindDeviceActivity.DeviceState, Unit> itemClickListener = nearbyDeviceAdapter.getItemClickListener();
        if (itemClickListener == null) {
            return;
        }
        itemClickListener.invoke(deviceState);
    }

    public final void addData(@NotNull SearchBindDeviceActivity.DeviceState data) {
        if (this.dataList.contains(data)) {
            return;
        }
        this.dataList.add(data);
        List<SearchBindDeviceActivity.DeviceState> list = this.dataList;
        if (list.size() > 1) {
            g.sortWith(list, new Comparator() { // from class: com.huami.watch.companion.ui.adapter.NearbyDeviceAdapter$addData$$inlined$sortByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Short.valueOf(((SearchBindDeviceActivity.DeviceState) t2).getRssi()), Short.valueOf(((SearchBindDeviceActivity.DeviceState) t).getRssi()));
                }
            });
        }
        notifyDataSetChanged();
    }

    @Nullable
    public final Function1<SearchBindDeviceActivity.DeviceState, Unit> getItemClickListener() {
        return this.itemClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getPagerCount() {
        return this.dataList.size();
    }

    public final void setItemClickListener(@Nullable Function1<? super SearchBindDeviceActivity.DeviceState, Unit> function1) {
        this.itemClickListener = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull DeviceViewHolder holder, int position) {
        final SearchBindDeviceActivity.DeviceState deviceState = this.dataList.get(position);
        holder.getDeviceTitle().setText(deviceState.getDeviceName());
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: kc5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NearbyDeviceAdapter.b(this.a, deviceState, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public DeviceViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new DeviceViewHolder(LayoutInflater.from(this.context).inflate(R.layout.select_mili_bound_item, parent, false));
    }
}
