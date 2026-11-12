package com.huami.sleep.daysleep.quotient.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.sleep.R;
import com.huami.sleep.daysleep.quotient.SleepQuotientParam;
import com.huami.sleep.ext.ViewExKt;
import com.huami.tools.analytics.DbUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0014\u0010\u0010\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR\u0019\u0010\u0016\u001a\u00020\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/huami/sleep/daysleep/quotient/adapter/SleepQuotientAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huami/sleep/daysleep/quotient/adapter/SleepQuotientHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "", "Lcom/huami/sleep/daysleep/quotient/SleepQuotientParam;", "list", "setNewData", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "b", "Ljava/util/List;", "dataList", "<init>", "(Landroid/content/Context;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepQuotientAdapter extends RecyclerView.Adapter<SleepQuotientHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<SleepQuotientParam> dataList = new ArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<View, Unit> {
        public final /* synthetic */ SleepQuotientParam a;
        public final /* synthetic */ SleepQuotientAdapter b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SleepQuotientParam sleepQuotientParam, SleepQuotientAdapter sleepQuotientAdapter) {
            super(1);
            this.a = sleepQuotientParam;
            this.b = sleepQuotientAdapter;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            Function1<Context, Unit> navigateToDetect = this.a.getNavigateToDetect();
            if (navigateToDetect == null) {
                return;
            }
            navigateToDetect.invoke(this.b.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<View, Unit> {
        public final /* synthetic */ SleepQuotientParam a;
        public final /* synthetic */ SleepQuotientAdapter b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SleepQuotientParam sleepQuotientParam, SleepQuotientAdapter sleepQuotientAdapter) {
            super(1);
            this.a = sleepQuotientParam;
            this.b = sleepQuotientAdapter;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            Function2<Context, SleepQuotientParam, Unit> navigateToIntro = this.a.getNavigateToIntro();
            if (navigateToIntro == null) {
                return;
            }
            navigateToIntro.invoke(this.b.getContext(), this.a);
        }
    }

    public SleepQuotientAdapter(@NotNull Context context) {
        this.context = context;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getFragmentsCount() {
        return this.dataList.size();
    }

    public final void setNewData(@NotNull List<SleepQuotientParam> list) {
        this.dataList.clear();
        this.dataList.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull SleepQuotientHolder holder, int position) {
        SleepQuotientParam sleepQuotientParam = this.dataList.get(position);
        holder.getName().setText(sleepQuotientParam.getName());
        holder.getName().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, sleepQuotientParam.getNameDrawable(), (Drawable) null);
        if (sleepQuotientParam.getNeedDetection()) {
            holder.getRefInfo().setText("--");
        } else {
            holder.getRefInfo().setText(sleepQuotientParam.getValueWithUnit());
        }
        holder.getValue().setText(sleepQuotientParam.getTrendInfo());
        holder.getValue().setCompoundDrawablesWithIntrinsicBounds(0, 0, sleepQuotientParam.getTrendDrawableRes(), 0);
        ViewExKt.setVisible(holder.getValue(), !sleepQuotientParam.getNeedDetection());
        ViewExKt.setVisible(holder.getOpen(), sleepQuotientParam.getNeedDetection());
        if (sleepQuotientParam.getNeedDetection()) {
            ViewExKt.smartClick(holder.getOpen(), 800L, new a(sleepQuotientParam, this));
        }
        ViewExKt.smartClick(holder.itemView, 800L, new b(sleepQuotientParam, this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public SleepQuotientHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new SleepQuotientHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sleep_quotient, parent, false));
    }
}
