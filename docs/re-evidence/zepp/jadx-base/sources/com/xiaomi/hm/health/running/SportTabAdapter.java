package com.xiaomi.hm.health.running;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.databases.model.AdEntity;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.manager.HMAdManager;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u001d\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0016\u0010\u0010\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/running/SportTabAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/hm/health/running/SportTabAdapter$ViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "", "Lcom/xiaomi/hm/health/databases/model/AdEntity;", "newData", "updateData", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "b", "Ljava/util/List;", "data", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "ViewHolder", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SportTabAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private List<? extends AdEntity> data;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0010\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/running/SportTabAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/ImageView;", "a", "Landroid/widget/ImageView;", "getImage", "()Landroid/widget/ImageView;", "image", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "title", "c", "getDesc", "desc", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final ImageView image;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final TextView title;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final TextView desc;

        public ViewHolder(@NotNull View view) {
            super(view);
            this.image = (ImageView) view.findViewById(R.id.sport_advertise_image);
            this.title = (TextView) view.findViewById(R.id.sport_advertise_title);
            this.desc = (TextView) view.findViewById(R.id.sport_advertise_desc);
        }

        @NotNull
        public final TextView getDesc() {
            return this.desc;
        }

        @NotNull
        public final ImageView getImage() {
            return this.image;
        }

        @NotNull
        public final TextView getTitle() {
            return this.title;
        }
    }

    public SportTabAdapter(@NotNull Context context, @NotNull List<? extends AdEntity> list) {
        this.context = context;
        this.data = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getPagerCount() {
        Integer numValueOf = Integer.valueOf(this.data.size());
        if (numValueOf.intValue() > 3) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return 3;
        }
        return numValueOf.intValue();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void updateData(@NotNull List<? extends AdEntity> newData) {
        this.data = newData;
        notifyDataSetChanged();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:39:0x0099  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        AdEntity adEntity = this.data.get(position);
        HashMap map = new HashMap();
        map.put("pos", String.valueOf(position + 1));
        map.put("id", adEntity.getId());
        String str = adEntity.category;
        String str2 = "run";
        if (str != null) {
            switch (str) {
                case "ride_asport":
                    str2 = "finish_ride";
                    break;
                case "ride_bsport":
                    str2 = "ride";
                    break;
                case "run_outasport":
                    str2 = "finish_run_outer";
                    break;
                case "run_outbsport":
                    map.put("tp", StatEvent.EventParams.SPORT_RUN_OUTER);
                    break;
                case "walk_asport":
                    str2 = "finish_walk";
                    break;
                case "walk_bsport":
                    str2 = "walk";
                    break;
                case "run_inasport":
                    str2 = "finish_run_inner";
                    break;
                case "run_inbsport":
                    map.put("tp", StatEvent.EventParams.SPORT_RUN_INNER);
                    break;
                default:
                    str2 = "";
                    break;
            }
        } else {
            str2 = "";
        }
        map.put("fr", str2);
        HMAdManager.initBannerView(holder.getImage(), adEntity.getMode(), adEntity.getImgUrl(), adEntity.getTarget(), StatEvent.ACTIVITY_C, map);
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.ACTIVITY_V).putExtras(map));
        holder.getTitle().setText(adEntity.getTitle());
        holder.getDesc().setText(adEntity.getDescription());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(this.context).inflate(R.layout.item_sport_adv_view, parent, false));
    }
}
