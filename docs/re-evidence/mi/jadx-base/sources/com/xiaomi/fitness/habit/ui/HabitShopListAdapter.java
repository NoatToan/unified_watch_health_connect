package com.xiaomi.fitness.habit.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.transform.RoundedCornersTransformation;
import com.example.habit.export.HabitBean;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.habit.ui.HabitShopListAdapter;
import defpackage.dri;
import defpackage.iui;
import defpackage.nni;
import defpackage.nuf;
import defpackage.pxi;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B?\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r\u0018\u00010\u0018¢\u0006\u0004\b%\u0010&J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R&\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R0\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b \u0010\"\"\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/habit/ui/HabitShopListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Ljava/util/ArrayList;", "Lcom/example/habit/export/HabitBean;", "Lkotlin/collections/ArrayList;", "dataList", "Ljava/util/ArrayList;", "Lkotlin/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/jvm/functions/Function1;", "getListener", "()Lkotlin/jvm/functions/Function1;", "setListener", "(Lkotlin/jvm/functions/Function1;)V", "", "isSelectMode", "Z", "()Z", "setSelectMode", "(Z)V", "<init>", "(Landroid/content/Context;Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;)V", "HabitListViewHolder", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HabitShopListAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    @NotNull
    private Context context;

    @NotNull
    private ArrayList<HabitBean> dataList;
    private boolean isSelectMode;

    @Nullable
    private Function1<? super HabitBean, Unit> listener;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/habit/ui/HabitShopListAdapter$HabitListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/example/habit/export/HabitBean;", "habit", "", "bindData", "(Lcom/example/habit/export/HabitBean;)V", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "Landroid/widget/TextView;", "titleView", "Landroid/widget/TextView;", "Landroid/widget/ImageView;", "bgView", "Landroid/widget/ImageView;", "descView", "peopleNumView", "<init>", "(Lcom/xiaomi/fitness/habit/ui/HabitShopListAdapter;Landroid/view/View;)V", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nHabitShopListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HabitShopListAdapter.kt\ncom/xiaomi/fitness/habit/ui/HabitShopListAdapter$HabitListViewHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,78:1\n54#2,3:79\n24#2:82\n59#2,6:83\n*S KotlinDebug\n*F\n+ 1 HabitShopListAdapter.kt\ncom/xiaomi/fitness/habit/ui/HabitShopListAdapter$HabitListViewHolder\n*L\n59#1:79,3\n59#1:82\n59#1:83,6\n*E\n"})
    public final class HabitListViewHolder extends RecyclerView.d0 {

        @NotNull
        private ImageView bgView;

        @NotNull
        private TextView descView;

        @NotNull
        private TextView peopleNumView;
        final /* synthetic */ HabitShopListAdapter this$0;

        @NotNull
        private TextView titleView;

        @NotNull
        private View view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HabitListViewHolder(@NotNull HabitShopListAdapter habitShopListAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = habitShopListAdapter;
            this.view = view;
            View viewFindViewById = view.findViewById(dri.Y);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.titleView = (TextView) viewFindViewById;
            View viewFindViewById2 = this.view.findViewById(dri.f);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.bgView = (ImageView) viewFindViewById2;
            View viewFindViewById3 = this.view.findViewById(dri.p);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.descView = (TextView) viewFindViewById3;
            View viewFindViewById4 = this.view.findViewById(dri.G);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.peopleNumView = (TextView) viewFindViewById4;
            nuf.f(this.view);
        }

        public final void bindData(@NotNull HabitBean habit) {
            Intrinsics.checkNotNullParameter(habit, "habit");
            TextView textView = this.titleView;
            String str = habit.name;
            textView.setText((str == null || str.length() == 0) ? "" : habit.name.toString());
            ImageView imageView = this.bgView;
            String str2 = habit.smallIcon;
            ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
            ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(str2).target(imageView);
            builderTarget.placeholder(nni.e);
            builderTarget.transformations(new RoundedCornersTransformation(DisplayUtil.dip2px(16.0f)));
            imageLoader.enqueue(builderTarget.build());
            if (habit.isSelected) {
                this.bgView.setBackgroundResource(nni.c);
            } else {
                this.bgView.setBackground(null);
            }
            this.descView.setText(habit.appBref);
            TextView textView2 = this.peopleNumView;
            Resources resources = this.this$0.context.getResources();
            int i = pxi.f30880b;
            int i2 = habit.totalInsist;
            textView2.setText(resources.getQuantityString(i, i2, Integer.valueOf(i2)));
        }

        @NotNull
        public final View getView() {
            return this.view;
        }

        public final void setView(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "<set-?>");
            this.view = view;
        }
    }

    public /* synthetic */ HabitShopListAdapter(Context context, ArrayList arrayList, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, arrayList, (i & 4) != 0 ? null : function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(HabitShopListAdapter this$0, HabitBean habit, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(habit, "$habit");
        Function1<? super HabitBean, Unit> function1 = this$0.listener;
        if (function1 != null) {
            function1.invoke2(habit);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.dataList.size();
    }

    @Nullable
    public final Function1<HabitBean, Unit> getListener() {
        return this.listener;
    }

    /* JADX INFO: renamed from: isSelectMode, reason: from getter */
    public final boolean getIsSelectMode() {
        return this.isSelectMode;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        HabitBean habitBean = this.dataList.get(position);
        Intrinsics.checkNotNullExpressionValue(habitBean, "get(...)");
        final HabitBean habitBean2 = habitBean;
        ((HabitListViewHolder) holder).bindData(habitBean2);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: vib
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HabitShopListAdapter.onBindViewHolder$lambda$0(this.f36920a, habitBean2, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.context).inflate(iui.j, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new HabitListViewHolder(this, viewInflate);
    }

    public final void setListener(@Nullable Function1<? super HabitBean, Unit> function1) {
        this.listener = function1;
    }

    public final void setSelectMode(boolean z) {
        this.isSelectMode = z;
    }

    public HabitShopListAdapter(@NotNull Context context, @NotNull ArrayList<HabitBean> dataList, @Nullable Function1<? super HabitBean, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.context = context;
        this.dataList = dataList;
        this.listener = function1;
    }
}
