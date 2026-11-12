package com.xiaomi.fitness.health.curse.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.miui.tsmclient.net.TSMAuthContants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.fitness.export.data.aggregation.CurseRecordKt;
import com.xiaomi.fit.fitness.export.data.aggregation.Record;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.curse.CurseInfoActivity;
import com.xiaomi.fitness.health.curse.CurseManager;
import com.xiaomi.fitness.health.curse.data.CurseExtKt;
import com.xiaomi.fitness.widget.view.DividerView;
import defpackage.c0j;
import defpackage.etb;
import defpackage.jui;
import defpackage.qxi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\"\u0010#J#\u0010\b\u001a\u00060\u0007R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0014\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0007¢\u0006\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00120\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/health/curse/adapter/CurseListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lcom/xiaomi/fitness/health/curse/adapter/CurseListAdapter$RecordListHolder;", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/xiaomi/fitness/health/curse/adapter/CurseListAdapter$RecordListHolder;", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "getItemCount", "()I", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/CurseRecord;", PluginDeviceInfo.FICONOFF, "addData", "(Ljava/util/List;)V", "setData", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ljava/util/ArrayList;", "data", "Ljava/util/ArrayList;", "", "todayZero", "J", "<init>", "(Landroid/content/Context;)V", "RecordListHolder", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CurseListAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    @NotNull
    private final Context context;

    @NotNull
    private final ArrayList<Record> data;
    private final long todayZero;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\b\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\b\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/health/curse/adapter/CurseListAdapter$RecordListHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View$OnClickListener;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/CurseRecord;", "period", "", "position", "", "bind", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/CurseRecord;I)V", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "Letb;", "Letb;", "getBind", "()Letb;", "Landroid/content/res/Resources;", "kotlin.jvm.PlatformType", TSMAuthContants.PARAM_RESOURCE, "Landroid/content/res/Resources;", "<init>", "(Lcom/xiaomi/fitness/health/curse/adapter/CurseListAdapter;Letb;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nCurseListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CurseListAdapter.kt\ncom/xiaomi/fitness/health/curse/adapter/CurseListAdapter$RecordListHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,96:1\n1#2:97\n*E\n"})
    public final class RecordListHolder extends RecyclerView.d0 implements View.OnClickListener {

        @NotNull
        private final etb bind;
        private final Resources resource;
        final /* synthetic */ CurseListAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecordListHolder(@NotNull CurseListAdapter curseListAdapter, etb bind) {
            super(bind.getRoot());
            Intrinsics.checkNotNullParameter(bind, "bind");
            this.this$0 = curseListAdapter;
            this.bind = bind;
            this.resource = AppUtil.getApp().getResources();
            bind.B.setOnClickListener(this);
        }

        public final void bind(@NotNull Record period, int position) {
            String string;
            Intrinsics.checkNotNullParameter(period, "period");
            if (position == 0) {
                DividerView divider = this.bind.D;
                Intrinsics.checkNotNullExpressionValue(divider, "divider");
                ViewExtKt.gone(divider);
                TextView yearView = this.bind.G;
                Intrinsics.checkNotNullExpressionValue(yearView, "yearView");
                ViewExtKt.visible(yearView);
                this.bind.G.setText(TimeDateUtil.getDateYYYYFormat(period.getStartMills()));
            } else {
                Object obj = this.this$0.data.get(position - 1);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                if (TimeDateUtil.isSameYear(((Record) obj).getStartMills(), period.getStartMills())) {
                    DividerView divider2 = this.bind.D;
                    Intrinsics.checkNotNullExpressionValue(divider2, "divider");
                    ViewExtKt.gone(divider2);
                    TextView yearView2 = this.bind.G;
                    Intrinsics.checkNotNullExpressionValue(yearView2, "yearView");
                    ViewExtKt.gone(yearView2);
                } else {
                    DividerView divider3 = this.bind.D;
                    Intrinsics.checkNotNullExpressionValue(divider3, "divider");
                    ViewExtKt.visible(divider3);
                    TextView yearView3 = this.bind.G;
                    Intrinsics.checkNotNullExpressionValue(yearView3, "yearView");
                    ViewExtKt.visible(yearView3);
                    this.bind.G.setText(TimeDateUtil.getDateYYYYFormat(period.getStartMills()));
                }
            }
            this.bind.C.setText(this.resource.getQuantityString(qxi.common_unit_day_desc, CurseRecordKt.getInDays(period), Integer.valueOf(CurseRecordKt.getInDays(period))));
            long zeroMills = CurseExtKt.getZeroMills(period.getStartMills());
            long zeroMills2 = CurseExtKt.getZeroMills(period.getEndMills());
            TextView textView = this.bind.E;
            long j = this.this$0.todayZero;
            if (zeroMills > j || j >= zeroMills2) {
                this.bind.B.setClickable(true);
                int interval = period.getInterval() > 0 ? period.getInterval() : Math.max(CurseManager.INSTANCE.getInstance().getInterval(), CurseRecordKt.getInDays(period));
                this.bind.F.setText(this.resource.getQuantityString(qxi.M, interval, Integer.valueOf(interval)));
                ImageView arrowView = this.bind.A;
                Intrinsics.checkNotNullExpressionValue(arrowView, "arrowView");
                ViewExtKt.visible(arrowView);
                string = this.resource.getString(c0j.A7, TimeDateUtil.getDateMdFormat(period.getStartMills()), TimeDateUtil.getDateMdFormat(period.getEndMills()));
            } else {
                this.bind.F.setText(this.resource.getString(c0j.U5));
                this.bind.B.setClickable(false);
                ImageView arrowView2 = this.bind.A;
                Intrinsics.checkNotNullExpressionValue(arrowView2, "arrowView");
                ViewExtKt.gone(arrowView2);
                string = this.resource.getString(c0j.z6, TimeDateUtil.getDateMdFormat(period.getStartMills()));
            }
            textView.setText(string);
            this.bind.B.setTag(period);
        }

        @NotNull
        public final etb getBind() {
            return this.bind;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@NotNull View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            Context context = this.this$0.getContext();
            Intent intent = new Intent(this.this$0.getContext(), (Class<?>) CurseInfoActivity.class);
            Object tag = v.getTag();
            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.aggregation.CurseRecord");
            intent.putExtra("info", (Record) tag);
            context.startActivity(intent);
        }
    }

    public CurseListAdapter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.data = new ArrayList<>();
        this.todayZero = CurseExtKt.getTodayZeroMills();
    }

    public final void addData(@NotNull List<Record> d) {
        Intrinsics.checkNotNullParameter(d, "d");
        int size = this.data.size();
        this.data.addAll(d);
        notifyItemRangeInserted(size, d.size());
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.data.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Record record = this.data.get(position);
        Intrinsics.checkNotNullExpressionValue(record, "get(...)");
        ((RecordListHolder) holder).bind(record, position);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setData(@NotNull List<Record> d) {
        Intrinsics.checkNotNullParameter(d, "d");
        this.data.clear();
        this.data.addAll(d);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecordListHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        etb etbVarA0 = etb.A0(ExtUtilsKt.getInflater(this.context).inflate(jui.f3, parent, false));
        Intrinsics.checkNotNullExpressionValue(etbVarA0, "bind(...)");
        return new RecordListHolder(this, etbVarA0);
    }
}
