package com.xiaomi.fitness.health.curse.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.item.WomenHealthSymptoms;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.data.valueformatter.CursePainHighLightMarkValueFormatter;
import com.xiaomi.fitness.data.valueformatter.CurseSymChartValueFormatter;
import com.xiaomi.fitness.health.curse.data.CurseFactor;
import com.xiaomi.fitness.health.curse.data.CurseFactorKt;
import defpackage.arr;
import defpackage.eri;
import defpackage.hak;
import defpackage.jui;
import defpackage.n4j;
import defpackage.q02;
import defpackage.r02;
import defpackage.rtr;
import defpackage.s02;
import defpackage.vnq;
import defpackage.vqr;
import defpackage.xcm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u00103\u001a\u000202\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000104\u0012\b\b\u0002\u00106\u001a\u00020\u0007¢\u0006\u0004\b7\u00108J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00069"}, d2 = {"Lcom/xiaomi/fitness/health/curse/view/SymChartRecordInfoView;", "Landroid/widget/LinearLayout;", "", "initBarChart", "()V", "", "startMills", "", "inDays", "", "Lcom/xiaomi/fit/fitness/export/data/item/WomenHealthSymptoms;", "list", "", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "buildEntries", "(JILjava/util/List;)Ljava/util/List;", "Lorg/joda/time/LocalDate;", "buildXDate", "(JI)Ljava/util/List;", "value", "getType", "(Lcom/xiaomi/fit/fitness/export/data/item/WomenHealthSymptoms;)I", "setData", "(JILjava/util/List;)V", "Lcom/xiaomi/fitness/health/curse/data/CurseFactor;", "factor", "Lcom/xiaomi/fitness/health/curse/data/CurseFactor;", "Landroid/widget/TextView;", "typeView", "Landroid/widget/TextView;", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "mBarChartRecyclerView", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "Lq02;", "mBarChartAdapter", "Lq02;", "mBarEntries", "Ljava/util/List;", "Ls02;", "mItemDecoration", "Ls02;", "Lrtr;", "mYAxis", "Lrtr;", "Lvqr;", "mXAxis", "Lvqr;", "Lr02;", "mBarChartAttrs", "Lr02;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSymChartRecordInfoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SymChartRecordInfoView.kt\ncom/xiaomi/fitness/health/curse/view/SymChartRecordInfoView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n1863#2:186\n1864#2:188\n1#3:187\n*S KotlinDebug\n*F\n+ 1 SymChartRecordInfoView.kt\ncom/xiaomi/fitness/health/curse/view/SymChartRecordInfoView\n*L\n147#1:186\n147#1:188\n*E\n"})
public final class SymChartRecordInfoView extends LinearLayout {

    @NotNull
    private final CurseFactor factor;

    @Nullable
    private q02<RecyclerBarEntry> mBarChartAdapter;

    @Nullable
    private r02 mBarChartAttrs;

    @Nullable
    private BarChartRecyclerView mBarChartRecyclerView;

    @NotNull
    private List<RecyclerBarEntry> mBarEntries;

    @Nullable
    private s02 mItemDecoration;

    @Nullable
    private vqr mXAxis;

    @Nullable
    private rtr mYAxis;

    @NotNull
    private final TextView typeView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SymChartRecordInfoView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final List<RecyclerBarEntry> buildEntries(long startMills, int inDays, List<WomenHealthSymptoms> list) {
        Object next;
        List<LocalDate> listBuildXDate = buildXDate(startMills, inDays);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (LocalDate localDate : listBuildXDate) {
            long jLocalDateToTimestamp = TimeDateUtil.localDateToTimestamp(localDate);
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!TimeUtils.INSTANCE.isSameDay(((WomenHealthSymptoms) next).getTime(), ((long) 1000) * jLocalDateToTimestamp));
            int type = getType((WomenHealthSymptoms) next);
            int i2 = type != -1 ? 0 : 1;
            RecyclerBarEntry recyclerBarEntry = new RecyclerBarEntry(i, type + 1, jLocalDateToTimestamp, 2);
            recyclerBarEntry.validType = i2;
            recyclerBarEntry.localDate = localDate;
            arrayList.add(recyclerBarEntry);
            i++;
        }
        return arrayList;
    }

    private final List<LocalDate> buildXDate(long startMills, int inDays) {
        Logger.d("SymChartRecordInfoView", "startMills:" + startMills + ",inDays:" + inDays);
        LocalDate localDate = new LocalDate(startMills);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < inDays; i++) {
            LocalDate localDatePlusDays = localDate.plusDays(i);
            Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
            arrayList.add(localDatePlusDays);
        }
        return CollectionsKt___CollectionsKt.reversed(arrayList);
    }

    private final int getType(WomenHealthSymptoms value) {
        Integer hp;
        if (value == null) {
            return -1;
        }
        CurseFactor curseFactor = this.factor;
        if (Intrinsics.areEqual(curseFactor, CurseFactor.Hurt.INSTANCE)) {
            Integer pain = value.getPain();
            if (pain != null) {
                return pain.intValue();
            }
            return -1;
        }
        if (!Intrinsics.areEqual(curseFactor, CurseFactor.Blood.INSTANCE) || (hp = value.getHp()) == null) {
            return -1;
        }
        return hp.intValue();
    }

    private final void initBarChart() {
        BarChartRecyclerView barChartRecyclerView = this.mBarChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView);
        this.mBarChartAttrs = (r02) barChartRecyclerView.mAttrs;
        if (Intrinsics.areEqual(this.factor, CurseFactor.Hurt.INSTANCE)) {
            r02 r02Var = this.mBarChartAttrs;
            if (r02Var != null) {
                r02Var.W0 = Color.parseColor("#5560FF");
            }
            r02 r02Var2 = this.mBarChartAttrs;
            if (r02Var2 != null) {
                r02Var2.X0 = Color.parseColor("#B699FF");
            }
        } else if (Intrinsics.areEqual(this.factor, CurseFactor.Blood.INSTANCE)) {
            r02 r02Var3 = this.mBarChartAttrs;
            if (r02Var3 != null) {
                r02Var3.W0 = Color.parseColor("#FF387A");
            }
            r02 r02Var4 = this.mBarChartAttrs;
            if (r02Var4 != null) {
                r02Var4.X0 = Color.parseColor("#FF88B0");
            }
        }
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(getContext(), this.mBarChartAttrs);
        vnq vnqVarP = vnq.p(this.mBarChartAttrs, 30.0f, 3);
        this.mYAxis = vnqVarP;
        Intrinsics.checkNotNull(vnqVarP);
        vnqVarP.setValueFormatter(new CurseSymChartValueFormatter(this.factor));
        vqr vqrVar = new vqr(this.mBarChartAttrs, 7, new arr(getContext()));
        this.mXAxis = vqrVar;
        this.mItemDecoration = new s02(this.mYAxis, vqrVar, this.mBarChartAttrs);
        CursePainHighLightMarkValueFormatter cursePainHighLightMarkValueFormatter = new CursePainHighLightMarkValueFormatter(getContext());
        BarChartRecyclerView barChartRecyclerView2 = this.mBarChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView2);
        s02 s02Var = this.mItemDecoration;
        Intrinsics.checkNotNull(s02Var);
        barChartRecyclerView2.addItemDecoration(s02Var);
        this.mBarChartAdapter = new q02<>(getContext(), this.mBarEntries, this.mBarChartRecyclerView, this.mXAxis, this.mBarChartAttrs, cursePainHighLightMarkValueFormatter);
        BarChartRecyclerView barChartRecyclerView3 = this.mBarChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView3);
        barChartRecyclerView3.setAdapter(this.mBarChartAdapter);
        BarChartRecyclerView barChartRecyclerView4 = this.mBarChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView4);
        barChartRecyclerView4.setLayoutManager(speedRatioLayoutManager);
        BarChartRecyclerView barChartRecyclerView5 = this.mBarChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView5);
        barChartRecyclerView5.setNestedScrollingEnabled(false);
        new hak(getContext(), this.mBarChartRecyclerView, new xcm() { // from class: com.xiaomi.fitness.health.curse.view.SymChartRecordInfoView$initBarChart$itemGestureListener$1
            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
            }

            @Override // defpackage.xcm, defpackage.u8h
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrollStateChanged(recyclerView, newState);
            }
        });
    }

    public final void setData(long startMills, int inDays, @NotNull List<WomenHealthSymptoms> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        List<RecyclerBarEntry> listBuildEntries = buildEntries(startMills, inDays, list);
        if (listBuildEntries != null) {
            this.mBarEntries.addAll(listBuildEntries);
            rtr rtrVar = this.mYAxis;
            this.mYAxis = rtrVar != null ? rtrVar.g(rtrVar) : null;
            int size = listBuildEntries.size();
            if (size > 7) {
                size = 7;
            }
            this.mXAxis = new vqr(this.mBarChartAttrs, size, new arr(getContext()));
            s02 s02Var = this.mItemDecoration;
            if (s02Var != null) {
                s02Var.setYAxis(this.mYAxis);
            }
            s02 s02Var2 = this.mItemDecoration;
            if (s02Var2 != null) {
                s02Var2.setXAxis(this.mXAxis);
            }
            q02<RecyclerBarEntry> q02Var = this.mBarChartAdapter;
            if (q02Var != null) {
                q02Var.setYAxis(this.mYAxis);
            }
            q02<RecyclerBarEntry> q02Var2 = this.mBarChartAdapter;
            if (q02Var2 != null) {
                q02Var2.setXAxis(this.mXAxis);
            }
            q02<RecyclerBarEntry> q02Var3 = this.mBarChartAdapter;
            if (q02Var3 != null) {
                q02Var3.notifyDataSetChanged();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SymChartRecordInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SymChartRecordInfoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SymChartRecordInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mBarEntries = new ArrayList();
        LayoutInflater.from(context).inflate(jui.k3, (ViewGroup) this, true);
        CurseFactor factor = CurseFactorKt.getFactor(context.getResources().obtainAttributes(attributeSet, n4j.V5).getInt(n4j.W5, 0));
        this.factor = factor;
        TextView textView = (TextView) findViewById(eri.po);
        this.typeView = textView;
        textView.setText(CurseFactorKt.getName(factor));
        this.mBarChartRecyclerView = (BarChartRecyclerView) findViewById(eri.g0);
        initBarChart();
    }
}
