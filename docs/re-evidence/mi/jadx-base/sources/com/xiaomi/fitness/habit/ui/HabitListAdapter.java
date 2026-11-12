package com.xiaomi.fitness.habit.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.transform.RoundedCornersTransformation;
import com.example.habit.export.HabitBean;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.habit.ui.HabitListAdapter;
import defpackage.b0j;
import defpackage.dri;
import defpackage.hli;
import defpackage.iui;
import defpackage.nhi;
import defpackage.nni;
import defpackage.nuf;
import defpackage.t64;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001CB?\u0012\u0006\u0010%\u001a\u00020$\u0012\u0016\u0010*\u001a\u0012\u0012\u0004\u0012\u00020(0'j\b\u0012\u0004\u0012\u00020(`)\u0012\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u001a\u0018\u00010,¢\u0006\u0004\bA\u0010BJ/\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010\u001eJ\u0015\u0010\"\u001a\u00020\t2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R&\u0010*\u001a\u0012\u0012\u0004\u0012\u00020(0'j\b\u0012\u0004\u0012\u00020(`)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R0\u0010-\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u001a\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00104R\u0014\u00106\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00104R;\u00108\u001a&\u0012\f\u0012\n 7*\u0004\u0018\u00010\t0\t 7*\u0012\u0012\u000e\b\u0001\u0012\n 7*\u0004\u0018\u00010\t0\t0\u00060\u00068\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\"\u0010<\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b<\u0010>\"\u0004\b?\u0010@¨\u0006D"}, d2 = {"Lcom/xiaomi/fitness/habit/ui/HabitListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "clockMode", "weekDays", "", "Lt64;", "times", "", "getTimeStrng", "(II[Lt64;)Ljava/lang/String;", "weekdays", "index", "", "isWeekdaysTrue", "(II)Z", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "toggleSelectMode", "()V", "reset", "", "value", "formatTwo", "(J)Ljava/lang/String;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Ljava/util/ArrayList;", "Lcom/example/habit/export/HabitBean;", "Lkotlin/collections/ArrayList;", "dataList", "Ljava/util/ArrayList;", "Lkotlin/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/jvm/functions/Function1;", "getListener", "()Lkotlin/jvm/functions/Function1;", "setListener", "(Lkotlin/jvm/functions/Function1;)V", "imageWidth", "I", "imageHeight", "peopleNumTopMargin", "kotlin.jvm.PlatformType", "weekValues", "[Ljava/lang/String;", "getWeekValues", "()[Ljava/lang/String;", "isSelectMode", "Z", "()Z", "setSelectMode", "(Z)V", "<init>", "(Landroid/content/Context;Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;)V", "HabitListViewHolder", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nHabitListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HabitListAdapter.kt\ncom/xiaomi/fitness/habit/ui/HabitListAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,164:1\n1863#2,2:165\n*S KotlinDebug\n*F\n+ 1 HabitListAdapter.kt\ncom/xiaomi/fitness/habit/ui/HabitListAdapter\n*L\n140#1:165,2\n*E\n"})
public final class HabitListAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    @NotNull
    private Context context;

    @NotNull
    private ArrayList<HabitBean> dataList;
    private final int imageHeight;
    private final int imageWidth;
    private boolean isSelectMode;

    @Nullable
    private Function1<? super HabitBean, Unit> listener;
    private final int peopleNumTopMargin;

    @NotNull
    private final String[] weekValues;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\tR\u0016\u0010\u0016\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/habit/ui/HabitListAdapter$HabitListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/example/habit/export/HabitBean;", "habit", "", "bindData", "(Lcom/example/habit/export/HabitBean;)V", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "Landroid/widget/TextView;", "titleView", "Landroid/widget/TextView;", "timeView", "Landroid/widget/ImageView;", "bgView", "Landroid/widget/ImageView;", "selectView", "peopleNumView", "<init>", "(Lcom/xiaomi/fitness/habit/ui/HabitListAdapter;Landroid/view/View;)V", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nHabitListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HabitListAdapter.kt\ncom/xiaomi/fitness/habit/ui/HabitListAdapter$HabitListViewHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,164:1\n54#2,3:165\n24#2:168\n59#2,6:169\n*S KotlinDebug\n*F\n+ 1 HabitListAdapter.kt\ncom/xiaomi/fitness/habit/ui/HabitListAdapter$HabitListViewHolder\n*L\n70#1:165,3\n70#1:168\n70#1:169,6\n*E\n"})
    public final class HabitListViewHolder extends RecyclerView.d0 {

        @NotNull
        private ImageView bgView;

        @NotNull
        private TextView peopleNumView;

        @NotNull
        private View selectView;
        final /* synthetic */ HabitListAdapter this$0;

        @NotNull
        private TextView timeView;

        @NotNull
        private TextView titleView;

        @NotNull
        private View view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HabitListViewHolder(@NotNull HabitListAdapter habitListAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = habitListAdapter;
            this.view = view;
            View viewFindViewById = view.findViewById(dri.Y);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.titleView = (TextView) viewFindViewById;
            View viewFindViewById2 = this.view.findViewById(dri.f15841r);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.timeView = (TextView) viewFindViewById2;
            View viewFindViewById3 = this.view.findViewById(dri.f);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.bgView = (ImageView) viewFindViewById3;
            View viewFindViewById4 = this.view.findViewById(dri.M);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.selectView = viewFindViewById4;
            View viewFindViewById5 = this.view.findViewById(dri.G);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.peopleNumView = (TextView) viewFindViewById5;
            nuf.f(this.view);
            ViewGroup.LayoutParams layoutParams = this.peopleNumView.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            ((RelativeLayout.LayoutParams) layoutParams).topMargin = habitListAdapter.peopleNumTopMargin;
        }

        public final void bindData(@NotNull HabitBean habit) {
            Intrinsics.checkNotNullParameter(habit, "habit");
            TextView textView = this.titleView;
            String str = habit.name;
            textView.setText((str == null || str.length() == 0) ? "" : habit.name.toString());
            this.selectView.setSelected(habit.isSelected);
            ImageView imageView = this.bgView;
            String str2 = habit.smallIcon;
            ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
            ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(str2).target(imageView);
            builderTarget.placeholder(nni.e);
            builderTarget.transformations(new RoundedCornersTransformation(DisplayUtil.dip2px(16.0f)));
            imageLoader.enqueue(builderTarget.build());
            this.selectView.setVisibility(this.this$0.getIsSelectMode() ? 0 : 8);
            if (habit.getTimes() != null) {
                TextView textView2 = this.timeView;
                HabitListAdapter habitListAdapter = this.this$0;
                int i = habit.clockMode;
                int i2 = habit.weekDays;
                t64[] times = habit.getTimes();
                Intrinsics.checkNotNullExpressionValue(times, "getTimes(...)");
                textView2.setText(habitListAdapter.getTimeStrng(i, i2, times));
            }
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

    public /* synthetic */ HabitListAdapter(Context context, ArrayList arrayList, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, arrayList, (i & 4) != 0 ? null : function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getTimeStrng(int clockMode, int weekDays, t64[] times) {
        String string;
        if (clockMode == 1) {
            string = AppUtil.getApp().getString(b0j.e);
        } else if (clockMode == 2) {
            string = AppUtil.getApp().getString(b0j.h);
        } else if (clockMode == 3) {
            string = AppUtil.getApp().getString(b0j.f);
        } else if (clockMode != 5) {
            string = null;
        } else {
            StringBuilder sb = new StringBuilder();
            int length = this.weekValues.length;
            for (int i = 0; i < length; i++) {
                if (isWeekdaysTrue(weekDays, i)) {
                    sb.append(this.weekValues[i] + " ");
                }
            }
            int iLastIndexOf = sb.lastIndexOf(" ");
            if (iLastIndexOf != -1) {
                sb.deleteCharAt(iLastIndexOf);
            }
            string = sb.toString();
        }
        if (times == null) {
            return string;
        }
        if (times.length == 1) {
            t64 t64Var = times[0];
            return string + "\n" + formatTwo(t64Var.c) + ":" + formatTwo(t64Var.d);
        }
        if (times.length <= 1) {
            return string;
        }
        t64 t64Var2 = times[0];
        return string + "\n" + formatTwo(t64Var2.c) + ":" + formatTwo(t64Var2.d) + "...";
    }

    private final boolean isWeekdaysTrue(int weekdays, int index) {
        return ((weekdays >> index) & 1) == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(HabitListAdapter this$0, HabitBean habit, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(habit, "$habit");
        Function1<? super HabitBean, Unit> function1 = this$0.listener;
        if (function1 != null) {
            function1.invoke2(habit);
        }
    }

    @NotNull
    public final String formatTwo(long value) {
        if (value >= 10) {
            return String.valueOf(value);
        }
        return "0" + value;
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

    @NotNull
    public final String[] getWeekValues() {
        return this.weekValues;
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
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: gfb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HabitListAdapter.onBindViewHolder$lambda$0(this.f18917a, habitBean2, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.context).inflate(iui.i, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new HabitListViewHolder(this, viewInflate);
    }

    public final void reset() {
        this.isSelectMode = false;
        notifyDataSetChanged();
    }

    public final void setListener(@Nullable Function1<? super HabitBean, Unit> function1) {
        this.listener = function1;
    }

    public final void setSelectMode(boolean z) {
        this.isSelectMode = z;
    }

    public final void toggleSelectMode() {
        if (this.isSelectMode) {
            Iterator<T> it = this.dataList.iterator();
            while (it.hasNext()) {
                ((HabitBean) it.next()).isSelected = false;
            }
        }
        this.isSelectMode = !this.isSelectMode;
        notifyDataSetChanged();
    }

    public HabitListAdapter(@NotNull Context context, @NotNull ArrayList<HabitBean> dataList, @Nullable Function1<? super HabitBean, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.context = context;
        this.dataList = dataList;
        this.listener = function1;
        int dimensionPixelSize = (int) ((Resources.getSystem().getDisplayMetrics().widthPixels - (AppUtil.getApp().getResources().getDimensionPixelSize(hli.d) * 4)) / 2.0f);
        this.imageWidth = dimensionPixelSize;
        int i = (int) (dimensionPixelSize * 1.25f);
        this.imageHeight = i;
        this.peopleNumTopMargin = i - DisplayUtil.dip2px(24.0f);
        String[] stringArray = this.context.getResources().getStringArray(nhi.f27940b);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        this.weekValues = stringArray;
    }
}
