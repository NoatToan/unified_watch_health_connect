package com.huami.treadmill.ui.linedetail;

import android.content.Context;
import android.os.Build;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.treadmill.R;
import com.huami.treadmill.TdmillConfig;
import com.huami.treadmill.data.TdRankingItem;
import com.huami.treadmill.ui.kings.KingsTdActivity;
import com.huami.treadmill.ui.linedetail.TopRankViewHolder;
import com.huami.treadmill.util.TimeUtils;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001d\u0010\u0013\u001a\u00020\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0018\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R%\u0010\u001b\u001a\n \u0019*\u0004\u0018\u00010\u00140\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u001a\u0010\u0017R%\u0010\u001d\u001a\n \u0019*\u0004\u0018\u00010\u000e0\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001c\u0010\u0012R%\u0010\u001e\u001a\n \u0019*\u0004\u0018\u00010\u00140\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0015\u0010\u0017R\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001f¨\u0006%"}, d2 = {"Lcom/huami/treadmill/ui/linedetail/TopRankViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "id", "Lcom/huami/treadmill/data/TdRankingItem;", "tdDiligentRank", "", "bindDiligentTopRank", "tdSpeedRank", "bindSpeedTopRank", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/widget/ImageView;", "b", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Landroid/widget/ImageView;", "top_icon", "Landroid/widget/TextView;", "c", "f", "()Landroid/widget/TextView;", "top_name", "kotlin.jvm.PlatformType", "e", "top_left_info", "g", "top_one_bg", "got_to_kings", "J", "lineId", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class TopRankViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy top_icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy top_name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy top_left_info;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy top_one_bg;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy got_to_kings;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private long lineId;

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
            return (TextView) this.a.findViewById(R.id.got_to_kings);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<ImageView> {
        public final /* synthetic */ View a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(0);
            this.a = view;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ImageView invoke() {
            return (ImageView) this.a.findViewById(R.id.top_icon);
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
            return (TextView) this.a.findViewById(R.id.top_left_info);
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
            return (TextView) this.a.findViewById(R.id.top_name);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<ImageView> {
        public final /* synthetic */ View a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(View view) {
            super(0);
            this.a = view;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ImageView invoke() {
            return (ImageView) this.a.findViewById(R.id.top_one_bg);
        }
    }

    public TopRankViewHolder(@NotNull View view) {
        super(view);
        this.context = view.getContext();
        this.top_icon = LazyKt__LazyJVMKt.lazy(new b(view));
        this.top_name = LazyKt__LazyJVMKt.lazy(new d(view));
        this.top_left_info = LazyKt__LazyJVMKt.lazy(new c(view));
        this.top_one_bg = LazyKt__LazyJVMKt.lazy(new e(view));
        this.got_to_kings = LazyKt__LazyJVMKt.lazy(new a(view));
        c().setOnClickListener(new View.OnClickListener() { // from class: or7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TopRankViewHolder.b(this.a, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(TopRankViewHolder topRankViewHolder, View view) {
        KingsTdActivity.INSTANCE.startMe(topRankViewHolder.context, topRankViewHolder.lineId);
    }

    private final TextView c() {
        return (TextView) this.got_to_kings.getValue();
    }

    private final ImageView d() {
        return (ImageView) this.top_icon.getValue();
    }

    private final TextView e() {
        return (TextView) this.top_left_info.getValue();
    }

    private final TextView f() {
        return (TextView) this.top_name.getValue();
    }

    private final ImageView g() {
        return (ImageView) this.top_one_bg.getValue();
    }

    public final void bindDiligentTopRank(long id, @NotNull TdRankingItem tdDiligentRank) {
        this.lineId = id;
        Glide.with(d()).load(tdDiligentRank.getIcon()).apply(TdmillConfig.INSTANCE.getAvatarOptions().transform(new CircleCrop())).into(d());
        f().setText(tdDiligentRank.getNickName());
        if (Build.VERSION.SDK_INT >= 24) {
            e().setText(Html.fromHtml(this.context.getResources().getQuantityString(R.plurals.td_run_count_format, tdDiligentRank.getValue(), Integer.valueOf(tdDiligentRank.getValue())), 0));
        } else {
            e().setText(Html.fromHtml(this.context.getResources().getQuantityString(R.plurals.td_run_count_format, tdDiligentRank.getValue(), Integer.valueOf(tdDiligentRank.getValue()))));
        }
    }

    public final void bindSpeedTopRank(long id, @NotNull TdRankingItem tdSpeedRank) {
        this.lineId = id;
        Glide.with(d()).load(tdSpeedRank.getIcon()).apply(TdmillConfig.INSTANCE.getAvatarOptions().transform(new CircleCrop())).into(d());
        f().setText(tdSpeedRank.getNickName());
        e().setText(TimeUtils.INSTANCE.getTimeString(Integer.valueOf(tdSpeedRank.getValue() / 1000)));
        e().setTextColor(ContextCompat.getColor(this.context, R.color.cl_ff5353));
        g().setImageResource(R.drawable.top_speed_one);
    }
}
