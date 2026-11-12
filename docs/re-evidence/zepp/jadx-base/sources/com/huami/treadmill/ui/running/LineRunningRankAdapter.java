package com.huami.treadmill.ui.running;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.treadmill.R;
import com.huami.treadmill.TdmillConfig;
import com.huami.treadmill.data.TdLineRuningRankItem;
import com.huami.treadmill.ui.tdmillhome.TdmillHmFragment;
import com.xiaomi.hm.health.relation.cloud.WebAPI;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002!\"B\u0007¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0016R6\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001b\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/huami/treadmill/ui/running/LineRunningRankAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "getItemViewType", "", "Lcom/huami/treadmill/data/TdLineRuningRankItem;", "value", "a", "Ljava/util/List;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "data", "", "b", "Z", TdmillHmFragment.ARG_IS_METRIC, "()Z", "setMetric", "(Z)V", "<init>", "()V", "RankMeViewHolder", "RankOtherViewHolder", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class LineRunningRankAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private List<TdLineRuningRankItem> data = new ArrayList();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean isMetric = true;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u001e\u0010\u000e\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR%\u0010\u0013\u001a\n \u000b*\u0004\u0018\u00010\u000f0\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\u0012R%\u0010\u0017\u001a\n \u000b*\u0004\u0018\u00010\u00140\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0010\u0010\u0016R%\u0010\u0019\u001a\n \u000b*\u0004\u0018\u00010\u00140\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, d2 = {"Lcom/huami/treadmill/ui/running/LineRunningRankAdapter$RankMeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "position", "Lcom/huami/treadmill/data/TdLineRuningRankItem;", "item", "", TdmillHmFragment.ARG_IS_METRIC, "", "bindData", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/widget/ImageView;", "b", "Lkotlin/Lazy;", "()Landroid/widget/ImageView;", WebAPI.PARAM_SHARE_INVITE_AVATAR, "Landroid/widget/TextView;", "c", "()Landroid/widget/TextView;", "distance", GoogleApiAvailabilityLight.a, "distance_unit", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public static final class RankMeViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Context context;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final Lazy avatar;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final Lazy distance;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        private final Lazy distance_unit;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<ImageView> {
            public final /* synthetic */ View a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(View view) {
                super(0);
                this.a = view;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ImageView invoke() {
                return (ImageView) this.a.findViewById(R.id.td_line_runing_rank_avatar);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<TextView> {
            public final /* synthetic */ View a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(View view) {
                super(0);
                this.a = view;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TextView invoke() {
                return (TextView) this.a.findViewById(R.id.td_line_runing_rank_distance);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<TextView> {
            public final /* synthetic */ View a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(View view) {
                super(0);
                this.a = view;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TextView invoke() {
                return (TextView) this.a.findViewById(R.id.td_line_runing_rank_distance_unit);
            }
        }

        public RankMeViewHolder(@NotNull View view) {
            super(view);
            this.context = view.getContext();
            this.avatar = LazyKt__LazyJVMKt.lazy(new a(view));
            this.distance = LazyKt__LazyJVMKt.lazy(new b(view));
            this.distance_unit = LazyKt__LazyJVMKt.lazy(new c(view));
        }

        private final ImageView a() {
            return (ImageView) this.avatar.getValue();
        }

        private final TextView b() {
            return (TextView) this.distance.getValue();
        }

        private final TextView c() {
            return (TextView) this.distance_unit.getValue();
        }

        public final void bindData(int position, @NotNull TdLineRuningRankItem item, boolean isMetric) {
            Glide.with(a()).load(item.getRankAvatar()).apply(TdmillConfig.INSTANCE.getAvatarOptions().transform(new CircleCrop())).into(a());
            b().setText(new BigDecimal(item.getRankDistance()).setScale(2, 1).toString());
            if (isMetric) {
                c().setText(this.context.getString(R.string.td_distance_unit));
            } else {
                c().setText(this.context.getString(R.string.td_distance_mi_unit));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u001e\u0010\u000e\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR%\u0010\u0014\u001a\n \u000b*\u0004\u0018\u00010\u000f0\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R%\u0010\u0016\u001a\n \u000b*\u0004\u0018\u00010\u000f0\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R%\u0010\u0017\u001a\n \u000b*\u0004\u0018\u00010\u000f0\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\f\u0010\u0013R%\u0010\u0019\u001a\n \u000b*\u0004\u0018\u00010\u000f0\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/huami/treadmill/ui/running/LineRunningRankAdapter$RankOtherViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "position", "Lcom/huami/treadmill/data/TdLineRuningRankItem;", "item", "", TdmillHmFragment.ARG_IS_METRIC, "", "bindData", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/widget/TextView;", "b", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Landroid/widget/TextView;", "number", "c", "nickname", "distance", "e", "distance_unit", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public static final class RankOtherViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Context context;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final Lazy number;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final Lazy nickname;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        private final Lazy distance;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        private final Lazy distance_unit;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<TextView> {
            public final /* synthetic */ View a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(View view) {
                super(0);
                this.a = view;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TextView invoke() {
                return (TextView) this.a.findViewById(R.id.td_line_runing_rank_distance);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<TextView> {
            public final /* synthetic */ View a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(View view) {
                super(0);
                this.a = view;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TextView invoke() {
                return (TextView) this.a.findViewById(R.id.td_line_runing_rank_distance_unit);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<TextView> {
            public final /* synthetic */ View a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(View view) {
                super(0);
                this.a = view;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TextView invoke() {
                return (TextView) this.a.findViewById(R.id.td_line_runing_rank_name);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function0<TextView> {
            public final /* synthetic */ View a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(View view) {
                super(0);
                this.a = view;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TextView invoke() {
                return (TextView) this.a.findViewById(R.id.td_line_runing_rank_number);
            }
        }

        public RankOtherViewHolder(@NotNull View view) {
            super(view);
            this.context = view.getContext();
            this.number = LazyKt__LazyJVMKt.lazy(new d(view));
            this.nickname = LazyKt__LazyJVMKt.lazy(new c(view));
            this.distance = LazyKt__LazyJVMKt.lazy(new a(view));
            this.distance_unit = LazyKt__LazyJVMKt.lazy(new b(view));
        }

        private final TextView a() {
            return (TextView) this.distance.getValue();
        }

        private final TextView b() {
            return (TextView) this.distance_unit.getValue();
        }

        private final TextView c() {
            return (TextView) this.nickname.getValue();
        }

        private final TextView d() {
            return (TextView) this.number.getValue();
        }

        public final void bindData(int position, @NotNull TdLineRuningRankItem item, boolean isMetric) {
            d().setText(String.valueOf(position + 1));
            c().setText(item.getRankName());
            a().setText(new BigDecimal(item.getRankDistance()).setScale(2, 1).toString());
            if (isMetric) {
                b().setText(this.context.getString(R.string.td_distance_unit));
            } else {
                b().setText(this.context.getString(R.string.td_distance_mi_unit));
            }
        }
    }

    @NotNull
    public final List<TdLineRuningRankItem> getData() {
        return this.data;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getA() {
        List<TdLineRuningRankItem> list = this.data;
        return (list == null ? null : Integer.valueOf(list.size())).intValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        TdLineRuningRankItem tdLineRuningRankItem;
        List<TdLineRuningRankItem> list = this.data;
        Boolean boolValueOf = null;
        if (list != null && (tdLineRuningRankItem = list.get(position)) != null) {
            boolValueOf = Boolean.valueOf(tdLineRuningRankItem.getRankIsMe());
        }
        if (Intrinsics.areEqual(boolValueOf, Boolean.TRUE)) {
            return R.layout.item_line_running_rank_me;
        }
        if (Intrinsics.areEqual(boolValueOf, Boolean.FALSE)) {
            return R.layout.item_line_running_rank_other;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: isMetric, reason: from getter */
    public final boolean getIsMetric() {
        return this.isMetric;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
        if (getItemViewType(position) == R.layout.item_line_running_rank_me) {
            RankMeViewHolder rankMeViewHolder = (RankMeViewHolder) holder;
            List<TdLineRuningRankItem> list = this.data;
            rankMeViewHolder.bindData(position, list != null ? list.get(position) : null, this.isMetric);
        } else {
            RankOtherViewHolder rankOtherViewHolder = (RankOtherViewHolder) holder;
            List<TdLineRuningRankItem> list2 = this.data;
            rankOtherViewHolder.bindData(position, list2 != null ? list2.get(position) : null, this.isMetric);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        int i = R.layout.item_line_running_rank_me;
        return viewType == i ? new RankMeViewHolder(LayoutInflater.from(parent.getContext()).inflate(i, parent, false)) : new RankOtherViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_line_running_rank_other, parent, false));
    }

    public final void setData(@NotNull List<TdLineRuningRankItem> list) {
        this.data.clear();
        this.data.addAll(list);
        notifyDataSetChanged();
    }

    public final void setMetric(boolean z) {
        this.isMetric = z;
    }
}
