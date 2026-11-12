package com.huami.treadmill.ui.linedetail;

import android.content.Context;
import android.os.Build;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.treadmill.R;
import com.huami.treadmill.TdmillConfig;
import com.huami.treadmill.data.TdRankingItem;
import com.huami.treadmill.util.TimeUtils;
import com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity;
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.hm.health.device.watchskinstore.ui.LargeWatchSkinActivity;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR%\u0010\u0012\u001a\n \r*\u0004\u0018\u00010\f0\f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R%\u0010\u0015\u001a\n \r*\u0004\u0018\u00010\u00130\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\t\u0010\u0014R%\u0010\u0018\u001a\n \r*\u0004\u0018\u00010\u00130\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0014R%\u0010\u0019\u001a\n \r*\u0004\u0018\u00010\f0\f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u000e\u0010\u0011R%\u0010\u001b\u001a\n \r*\u0004\u0018\u00010\f0\f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011¨\u0006 "}, d2 = {"Lcom/huami/treadmill/ui/linedetail/DiligentSpeedViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/treadmill/data/TdRankingItem;", LargeWatchSkinActivity.KEY_BEAN, "", "index", "", "bindData", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/widget/typeface/TypefaceTextView;", "kotlin.jvm.PlatformType", "b", "Lkotlin/Lazy;", "c", "()Lcom/huami/widget/typeface/TypefaceTextView;", WatchFaceDetailActivity.FROM_RANK, "Landroid/widget/ImageView;", "()Landroid/widget/ImageView;", "icon", GoogleApiAvailabilityLight.a, "e", "top_rank_bg", "name", "f", "timeOrCount", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class DiligentSpeedViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy rank;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy icon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy top_rank_bg;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy name;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy timeOrCount;

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
            return (ImageView) this.a.findViewById(R.id.icon);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/widget/typeface/TypefaceTextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<TypefaceTextView> {
        public final /* synthetic */ View a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(0);
            this.a = view;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TypefaceTextView invoke() {
            return (TypefaceTextView) this.a.findViewById(R.id.name);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/widget/typeface/TypefaceTextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<TypefaceTextView> {
        public final /* synthetic */ View a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view) {
            super(0);
            this.a = view;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TypefaceTextView invoke() {
            return (TypefaceTextView) this.a.findViewById(R.id.td_rank);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/widget/typeface/TypefaceTextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<TypefaceTextView> {
        public final /* synthetic */ View a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(View view) {
            super(0);
            this.a = view;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TypefaceTextView invoke() {
            return (TypefaceTextView) this.a.findViewById(R.id.time_or_count);
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
            return (ImageView) this.a.findViewById(R.id.top_rank_bg);
        }
    }

    public DiligentSpeedViewHolder(@NotNull View view) {
        super(view);
        this.context = view.getContext();
        this.rank = LazyKt__LazyJVMKt.lazy(new c(view));
        this.icon = LazyKt__LazyJVMKt.lazy(new a(view));
        this.top_rank_bg = LazyKt__LazyJVMKt.lazy(new e(view));
        this.name = LazyKt__LazyJVMKt.lazy(new b(view));
        this.timeOrCount = LazyKt__LazyJVMKt.lazy(new d(view));
    }

    private final ImageView a() {
        return (ImageView) this.icon.getValue();
    }

    private final TypefaceTextView b() {
        return (TypefaceTextView) this.name.getValue();
    }

    private final TypefaceTextView c() {
        return (TypefaceTextView) this.rank.getValue();
    }

    private final TypefaceTextView d() {
        return (TypefaceTextView) this.timeOrCount.getValue();
    }

    private final ImageView e() {
        return (ImageView) this.top_rank_bg.getValue();
    }

    public final void bindData(@NotNull TdRankingItem bean, int index) {
        int color;
        int i;
        c().setText(String.valueOf(bean.getRank()));
        TypefaceTextView typefaceTextViewC = c();
        int rank = bean.getRank();
        boolean z = 2 <= rank && rank <= 3;
        if (z) {
            color = ContextCompat.getColor(this.context, R.color.s5);
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            color = ContextCompat.getColor(this.context, R.color.s2);
        }
        typefaceTextViewC.setTextColor(color);
        ImageView imageViewE = e();
        int rank2 = bean.getRank();
        boolean z2 = 2 <= rank2 && rank2 <= 3;
        if (z2) {
            i = 0;
        } else {
            if (z2) {
                throw new NoWhenBranchMatchedException();
            }
            i = 4;
        }
        imageViewE.setVisibility(i);
        b().setText(bean.getNickName());
        if (index != 0) {
            if (index == 1) {
                d().setText(TimeUtils.INSTANCE.getTimeString(Integer.valueOf(bean.getValue() / 1000)));
                d().setTextColor(ContextCompat.getColor(this.context, R.color.cl_ff5353));
            }
        } else if (Build.VERSION.SDK_INT >= 24) {
            d().setText(Html.fromHtml(this.context.getResources().getQuantityString(R.plurals.td_count_format, bean.getValue(), Integer.valueOf(bean.getValue())), 0));
        } else {
            d().setText(Html.fromHtml(this.context.getResources().getQuantityString(R.plurals.td_count_format, bean.getValue(), Integer.valueOf(bean.getValue()))));
        }
        Glide.with(a()).load(bean.getIcon()).apply(TdmillConfig.INSTANCE.getAvatarOptions().transform(new CircleCrop())).into(a());
    }
}
