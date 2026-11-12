package com.huami.training.ui.entrance;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.paging.PagedListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.training.ext.ViewExKt;
import com.huami.training.ui.common.TrainingVoDiffCallback;
import com.huami.training.ui.common.viewholder.CourseViewHolder;
import com.huami.training.ui.entrance.EntranceAdapter;
import com.huami.training.utils.AnalyticsHelper;
import com.huami.training.utils.CountListItemVisitHelper;
import com.huami.training.vo.Resource;
import com.huami.training.vo.Status;
import com.huami.training.vo.TrainingVo;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b*\u0001$\u0018\u0000 .2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002.\u001bB#\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u001e¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0016\u001a\u00020\u0013J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0016R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u001d\u0010+\u001a\u00020'8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\u0016\u0010*¨\u0006/"}, d2 = {"Lcom/huami/training/ui/entrance/EntranceAdapter;", "Landroidx/paging/PagedListAdapter;", "Lcom/huami/training/vo/TrainingVo;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "position", "c", "b", "", GoogleApiAvailabilityLight.a, "getItemCount", "getItemViewType", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "holder", "", "onBindViewHolder", "Landroid/view/View;", "headerView", "setHeaderView", "getHeaderLayout", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "observer", "registerAdapterDataObserver", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "itemClickListener", "Lcom/huami/training/vo/Resource;", "Lcom/huami/training/vo/Resource;", "networkState", "com/huami/training/ui/entrance/EntranceAdapter$countItemVisitHelper$1", "Lcom/huami/training/ui/entrance/EntranceAdapter$countItemVisitHelper$1;", "countItemVisitHelper", "Landroid/widget/LinearLayout;", "e", "Lkotlin/Lazy;", "()Landroid/widget/LinearLayout;", "headerLayout", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class EntranceAdapter extends PagedListAdapter<TrainingVo, RecyclerView.ViewHolder> {
    public static final int TYPE_HEAD = 0;
    public static final int TYPE_NORMAL = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function1<TrainingVo, Unit> itemClickListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Resource<Unit> networkState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final EntranceAdapter$countItemVisitHelper$1 countItemVisitHelper;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy headerLayout;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/huami/training/ui/entrance/EntranceAdapter$a", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class a extends RecyclerView.ViewHolder {
        public a(@NotNull View view) {
            super(view);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/widget/LinearLayout;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<LinearLayout> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LinearLayout invoke() {
            LinearLayout linearLayout = new LinearLayout(EntranceAdapter.this.context);
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            return linearLayout;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.huami.training.ui.entrance.EntranceAdapter$countItemVisitHelper$1] */
    public EntranceAdapter(@NotNull Context context, @NotNull Function1<? super TrainingVo, Unit> function1) {
        super(new TrainingVoDiffCallback());
        this.context = context;
        this.itemClickListener = function1;
        this.countItemVisitHelper = new CountListItemVisitHelper<TrainingVo>() { // from class: com.huami.training.ui.entrance.EntranceAdapter$countItemVisitHelper$1
            @Override // com.huami.training.utils.CountListItemVisitHelper
            public void count(int position, @NotNull TrainingVo v) {
                AnalyticsHelper.INSTANCE.countLookItemVisit(String.valueOf(v.getId()), position);
            }
        };
        this.headerLayout = LazyKt__LazyJVMKt.lazy(new b());
    }

    private final int b() {
        return 1;
    }

    private final int c(int position) {
        return position - b();
    }

    private final boolean d() {
        Resource<Unit> resource = this.networkState;
        if (resource != null) {
            if ((resource == null ? null : resource.getStatus()) != Status.SUCCESS) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(CourseViewHolder courseViewHolder, EntranceAdapter entranceAdapter, View view) {
        TrainingVo item;
        int adapterPosition = courseViewHolder.getAdapterPosition();
        boolean z = false;
        if (adapterPosition >= 0 && adapterPosition < entranceAdapter.getPagerCount()) {
            z = true;
        }
        if (!z || (item = entranceAdapter.getItem(entranceAdapter.c(adapterPosition))) == null) {
            return;
        }
        entranceAdapter.itemClickListener.invoke(item);
        AnalyticsHelper.INSTANCE.countLookItemClicked(String.valueOf(item.getId()), entranceAdapter.c(courseViewHolder.getAdapterPosition()));
    }

    private final LinearLayout getHeaderLayout() {
        return (LinearLayout) this.headerLayout.getValue();
    }

    @Override // androidx.paging.PagedListAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getPagerCount() {
        return super.getPagerCount() + b() + (d() ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return position == 0 ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
        int iC;
        TrainingVo item;
        if (getItemViewType(position) != 1 || (item = getItem((iC = c(position)))) == null) {
            return;
        }
        ((CourseViewHolder) holder).bind(item);
        put(item, iC);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        if (viewType == 0) {
            return new a(getHeaderLayout());
        }
        if (viewType != 1) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("unknown view type ", Integer.valueOf(viewType)));
        }
        final CourseViewHolder courseViewHolder = new CourseViewHolder(parent, null, 2, null);
        View view = courseViewHolder.itemView;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(view.getLayoutParams());
        marginLayoutParams.setMarginStart((int) ViewExKt.dpToPx(view, 10.0f));
        marginLayoutParams.setMarginEnd((int) ViewExKt.dpToPx(view, 10.0f));
        view.setLayoutParams(marginLayoutParams);
        courseViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: dm1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EntranceAdapter.e(courseViewHolder, this, view2);
            }
        });
        return courseViewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void registerAdapterDataObserver(@NotNull RecyclerView.AdapterDataObserver observer) {
        super.registerAdapterDataObserver(new AdapterDataObserverProxy(observer, b()));
    }

    public final void setHeaderView(@NotNull View headerView) {
        LinearLayout headerLayout = getHeaderLayout();
        headerLayout.removeAllViews();
        headerLayout.addView(headerView);
    }

    @NotNull
    /* JADX INFO: renamed from: getHeaderLayout, reason: collision with other method in class */
    public final View m3393getHeaderLayout() {
        return getHeaderLayout();
    }
}
