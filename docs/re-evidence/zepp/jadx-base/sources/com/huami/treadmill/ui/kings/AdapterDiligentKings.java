package com.huami.treadmill.ui.kings;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.paging.PagedListAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.treadmill.R;
import com.huami.treadmill.TdmillConfig;
import com.huami.treadmill.data.TdkingBean;
import com.huami.treadmill.util.TimeUtils;
import com.xiaomi.hm.health.device.watchskinstore.ui.LargeWatchSkinActivity;
import java.util.Date;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000f\u0010B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016¨\u0006\u0011"}, d2 = {"Lcom/huami/treadmill/ui/kings/AdapterDiligentKings;", "Landroidx/paging/PagedListAdapter;", "Lcom/huami/treadmill/data/TdkingBean;", "Lcom/huami/treadmill/ui/kings/AdapterDiligentKings$ViewHolderKings;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "", "onBindViewHolder", "<init>", "()V", "Companion", "ViewHolderKings", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class AdapterDiligentKings extends PagedListAdapter<TdkingBean, ViewHolderKings> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final DiffUtil.ItemCallback<TdkingBean> a = new DiffUtil.ItemCallback<TdkingBean>() { // from class: com.huami.treadmill.ui.kings.AdapterDiligentKings$Companion$POST_COMPARATOR$1
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(@NotNull TdkingBean oldItem, @NotNull TdkingBean newItem) {
            return Intrinsics.areEqual(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(@NotNull TdkingBean oldItem, @NotNull TdkingBean newItem) {
            return oldItem.getStartDay() == newItem.getStartDay();
        }
    };

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/huami/treadmill/ui/kings/AdapterDiligentKings$Companion;", "", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/huami/treadmill/data/TdkingBean;", "POST_COMPARATOR", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "getPOST_COMPARATOR", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DiffUtil.ItemCallback<TdkingBean> getPOST_COMPARATOR() {
            return AdapterDiligentKings.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR%\u0010\u0010\u001a\n \u000b*\u0004\u0018\u00010\n0\n8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR%\u0010\u0014\u001a\n \u000b*\u0004\u0018\u00010\u00110\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0012\u0010\u0013R%\u0010\u0016\u001a\n \u000b*\u0004\u0018\u00010\u00110\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0015\u0010\u0013R%\u0010\u0018\u001a\n \u000b*\u0004\u0018\u00010\u00110\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0007\u0010\u0013R%\u0010\u001a\u001a\n \u000b*\u0004\u0018\u00010\u00110\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\r\u001a\u0004\b\f\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/huami/treadmill/ui/kings/AdapterDiligentKings$ViewHolderKings;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/treadmill/data/TdkingBean;", LargeWatchSkinActivity.KEY_BEAN, "", "bindData", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "b", "Lkotlin/Lazy;", "c", "()Landroid/widget/ImageView;", "icon", "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", "name", GoogleApiAvailabilityLight.a, "multiplex", "e", "date_ymd", "f", "dominating_time", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public static final class ViewHolderKings extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Context context;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final Lazy icon;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final Lazy name;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        private final Lazy multiplex;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        private final Lazy date_ymd;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        private final Lazy dominating_time;

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
                return (TextView) this.a.findViewById(R.id.king_date_ymd);
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
                return (TextView) this.a.findViewById(R.id.king_dominating_time);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<ImageView> {
            public final /* synthetic */ View a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(View view) {
                super(0);
                this.a = view;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ImageView invoke() {
                return (ImageView) this.a.findViewById(R.id.king_icon);
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
                return (TextView) this.a.findViewById(R.id.king_multiplex);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function0<TextView> {
            public final /* synthetic */ View a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(View view) {
                super(0);
                this.a = view;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TextView invoke() {
                return (TextView) this.a.findViewById(R.id.king_name);
            }
        }

        public ViewHolderKings(@NotNull View view) {
            super(view);
            this.context = view.getContext();
            this.icon = LazyKt__LazyJVMKt.lazy(new c(view));
            this.name = LazyKt__LazyJVMKt.lazy(new e(view));
            this.multiplex = LazyKt__LazyJVMKt.lazy(new d(view));
            this.date_ymd = LazyKt__LazyJVMKt.lazy(new a(view));
            this.dominating_time = LazyKt__LazyJVMKt.lazy(new b(view));
        }

        private final TextView a() {
            return (TextView) this.date_ymd.getValue();
        }

        private final TextView b() {
            return (TextView) this.dominating_time.getValue();
        }

        private final ImageView c() {
            return (ImageView) this.icon.getValue();
        }

        private final TextView d() {
            return (TextView) this.multiplex.getValue();
        }

        private final TextView getName() {
            return (TextView) this.name.getValue();
        }

        public final void bindData(@NotNull TdkingBean bean) {
            getName().setText(bean.getNickName());
            a().setText(TimeUtils.INSTANCE.formatDateTime_ymd(this.context, new Date(bean.getStartDay() * ((long) 1000))));
            Glide.with(c()).load(bean.getIcon()).apply(TdmillConfig.INSTANCE.getAvatarOptions().transform(new CircleCrop())).into(c());
            b().setText(this.context.getResources().getQuantityString(R.plurals.td_dominating_time_upload, (int) bean.getContinueDays(), Integer.valueOf((int) bean.getContinueDays())));
            d().setText(this.context.getResources().getQuantityString(R.plurals.td_dominating_number_upload, (int) bean.getValue(), Integer.valueOf((int) bean.getValue())));
        }
    }

    public AdapterDiligentKings() {
        super(a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolderKings holder, int position) {
        TdkingBean item = getItem(position);
        if (item == null) {
            return;
        }
        holder.bindData(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolderKings onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new ViewHolderKings(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_td_kings, parent, false));
    }
}
