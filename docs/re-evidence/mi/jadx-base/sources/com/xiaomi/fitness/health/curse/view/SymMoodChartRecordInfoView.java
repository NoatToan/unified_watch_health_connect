package com.xiaomi.fitness.health.curse.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.item.WomenHealthSymptoms;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.view.ScrollChartRecycleView;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.data.valueformatter.CurseSymChartValueFormatter;
import com.xiaomi.fitness.health.curse.data.CurseFactor;
import com.xiaomi.fitness.health.curse.data.CurseFactorKt;
import com.xiaomi.fitness.health.stress.StressFaceValueFormatter;
import defpackage.arr;
import defpackage.eri;
import defpackage.hak;
import defpackage.iji;
import defpackage.jui;
import defpackage.n4j;
import defpackage.rtr;
import defpackage.ufe;
import defpackage.vfe;
import defpackage.vqr;
import defpackage.xcm;
import defpackage.z85;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u00105\u001a\u000204\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000106\u0012\b\b\u0002\u00108\u001a\u00020\u0004¢\u0006\u0004\b9\u0010:J3\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u0006;"}, d2 = {"Lcom/xiaomi/fitness/health/curse/view/SymMoodChartRecordInfoView;", "Landroid/widget/LinearLayout;", "", "startMills", "", "inDays", "", "Lcom/xiaomi/fit/fitness/export/data/item/WomenHealthSymptoms;", "list", "", "Lcom/xiaomi/fitness/chart/entrys/MaxMinEntry;", "buildEntries", "(JILjava/util/List;)Ljava/util/List;", "Lorg/joda/time/LocalDate;", "buildXDate", "(JI)Ljava/util/List;", "value", "getType", "(Lcom/xiaomi/fit/fitness/export/data/item/WomenHealthSymptoms;)I", "convertMoodIndex", "(I)I", "", "initStressFaceChart", "()V", "setData", "(JILjava/util/List;)V", "Lcom/xiaomi/fitness/health/curse/data/CurseFactor;", "factor", "Lcom/xiaomi/fitness/health/curse/data/CurseFactor;", "Landroid/widget/TextView;", "typeView", "Landroid/widget/TextView;", "Lcom/xiaomi/fitness/chart/view/ScrollChartRecycleView;", "chartView", "Lcom/xiaomi/fitness/chart/view/ScrollChartRecycleView;", "mChartEntries", "Ljava/util/List;", "Lufe;", "mLineChartAdapter", "Lufe;", "Lz85;", "mItemDecoration", "Lz85;", "Lvfe;", "lineChartAttrs", "Lvfe;", "Lvqr;", "mXAxis", "Lvqr;", "Lrtr;", "mYAxis", "Lrtr;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSymMoodChartRecordInfoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SymMoodChartRecordInfoView.kt\ncom/xiaomi/fitness/health/curse/view/SymMoodChartRecordInfoView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,207:1\n1863#2,2:208\n1863#2:210\n1864#2:212\n1#3:211\n*S KotlinDebug\n*F\n+ 1 SymMoodChartRecordInfoView.kt\ncom/xiaomi/fitness/health/curse/view/SymMoodChartRecordInfoView\n*L\n145#1:208,2\n169#1:210\n169#1:212\n*E\n"})
public final class SymMoodChartRecordInfoView extends LinearLayout {
    private ScrollChartRecycleView chartView;

    @NotNull
    private final CurseFactor factor;

    @Nullable
    private vfe lineChartAttrs;

    @NotNull
    private final List<MaxMinEntry> mChartEntries;

    @Nullable
    private z85 mItemDecoration;
    private ufe<MaxMinEntry> mLineChartAdapter;

    @Nullable
    private vqr mXAxis;

    @Nullable
    private rtr mYAxis;

    @NotNull
    private final TextView typeView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SymMoodChartRecordInfoView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final List<MaxMinEntry> buildEntries(long startMills, int inDays, List<WomenHealthSymptoms> list) {
        Integer mood;
        Object next;
        List<LocalDate> listBuildXDate = buildXDate(startMills, inDays);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (LocalDate localDate : listBuildXDate) {
            long jLocalDateToTimestamp = TimeDateUtil.localDateToTimestamp(localDate);
            Iterator<T> it = list.iterator();
            do {
                mood = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!TimeUtils.INSTANCE.isSameDay(((WomenHealthSymptoms) next).getTime(), ((long) 1000) * jLocalDateToTimestamp));
            WomenHealthSymptoms womenHealthSymptoms = (WomenHealthSymptoms) next;
            int type = getType(womenHealthSymptoms);
            if (womenHealthSymptoms != null) {
                mood = womenHealthSymptoms.getMood();
            }
            Logger.d("SymMoodChartRecordInfoView", "buildEntries，date:" + localDate + " mood raw: " + mood + ",moodValue " + type);
            MaxMinEntry maxMinEntry = new MaxMinEntry((float) i, (float) convertMoodIndex(type), jLocalDateToTimestamp, 2);
            maxMinEntry.localDate = localDate;
            arrayList.add(maxMinEntry);
            i++;
        }
        return arrayList;
    }

    private final List<LocalDate> buildXDate(long startMills, int inDays) {
        LocalDate localDate = new LocalDate(startMills);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < inDays; i++) {
            LocalDate localDatePlusDays = localDate.plusDays(i);
            Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
            arrayList.add(localDatePlusDays);
        }
        return CollectionsKt___CollectionsKt.reversed(arrayList);
    }

    private final int convertMoodIndex(int value) {
        return 6 - (((value + 1) * 2) - 1);
    }

    private final int getType(WomenHealthSymptoms value) {
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
        if (Intrinsics.areEqual(curseFactor, CurseFactor.Blood.INSTANCE)) {
            Integer hp = value.getHp();
            if (hp != null) {
                return hp.intValue();
            }
            return -1;
        }
        if (!Intrinsics.areEqual(curseFactor, CurseFactor.Motion.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        Integer mood = value.getMood();
        if (mood != null) {
            return mood.intValue();
        }
        return -1;
    }

    public final void initStressFaceChart() {
        ScrollChartRecycleView scrollChartRecycleView;
        ScrollChartRecycleView scrollChartRecycleView2 = this.chartView;
        ScrollChartRecycleView scrollChartRecycleView3 = null;
        if (scrollChartRecycleView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chartView");
            scrollChartRecycleView2 = null;
        }
        vfe vfeVar = (vfe) scrollChartRecycleView2.mAttrs;
        this.lineChartAttrs = vfeVar;
        Intrinsics.checkNotNull(vfeVar);
        Context context = getContext();
        vfeVar.c = (context == null || !UIUtils.INSTANCE.isTabletAndLandscape(context)) ? 8 : 18;
        this.mChartEntries.clear();
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(getContext(), this.lineChartAttrs);
        vfe vfeVar2 = this.lineChartAttrs;
        Intrinsics.checkNotNull(vfeVar2);
        rtr rtrVarF = rtr.f(vfeVar2, 6.0f, 3);
        this.mYAxis = rtrVarF;
        if (rtrVarF != null) {
            rtrVarF.setValueFormatter(new CurseSymChartValueFormatter(this.factor));
        }
        vfe vfeVar3 = this.lineChartAttrs;
        Intrinsics.checkNotNull(vfeVar3);
        vfeVar3.J = getContext().getColor(iji.m2);
        vfe vfeVar4 = this.lineChartAttrs;
        Intrinsics.checkNotNull(vfeVar4);
        vqr vqrVar = new vqr(vfeVar4, vfeVar4.c, new arr(getContext()));
        this.mItemDecoration = new z85(this.mYAxis, vqrVar, this.lineChartAttrs);
        ScrollChartRecycleView scrollChartRecycleView4 = this.chartView;
        if (scrollChartRecycleView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chartView");
            scrollChartRecycleView4 = null;
        }
        z85 z85Var = this.mItemDecoration;
        Intrinsics.checkNotNull(z85Var);
        scrollChartRecycleView4.addItemDecoration(z85Var);
        Context context2 = getContext();
        List<MaxMinEntry> list = this.mChartEntries;
        ScrollChartRecycleView scrollChartRecycleView5 = this.chartView;
        if (scrollChartRecycleView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chartView");
            scrollChartRecycleView = null;
        } else {
            scrollChartRecycleView = scrollChartRecycleView5;
        }
        this.mLineChartAdapter = new ufe<>(context2, list, scrollChartRecycleView, vqrVar, this.lineChartAttrs, new StressFaceValueFormatter(4));
        ScrollChartRecycleView scrollChartRecycleView6 = this.chartView;
        if (scrollChartRecycleView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chartView");
            scrollChartRecycleView6 = null;
        }
        ufe<MaxMinEntry> ufeVar = this.mLineChartAdapter;
        if (ufeVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLineChartAdapter");
            ufeVar = null;
        }
        scrollChartRecycleView6.setAdapter(ufeVar);
        ScrollChartRecycleView scrollChartRecycleView7 = this.chartView;
        if (scrollChartRecycleView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chartView");
            scrollChartRecycleView7 = null;
        }
        scrollChartRecycleView7.setLayoutManager(speedRatioLayoutManager);
        ScrollChartRecycleView scrollChartRecycleView8 = this.chartView;
        if (scrollChartRecycleView8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chartView");
            scrollChartRecycleView8 = null;
        }
        scrollChartRecycleView8.setNestedScrollingEnabled(false);
        Context context3 = getContext();
        ScrollChartRecycleView scrollChartRecycleView9 = this.chartView;
        if (scrollChartRecycleView9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chartView");
            scrollChartRecycleView9 = null;
        }
        hak hakVar = new hak(context3, scrollChartRecycleView9, new xcm() { // from class: com.xiaomi.fitness.health.curse.view.SymMoodChartRecordInfoView$initStressFaceChart$itemGestureListener$1
            private boolean isRightScrollInner;

            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
            }

            @Override // defpackage.xcm, defpackage.u8h
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (newState == 0) {
                    recyclerView.getScrollX();
                }
            }

            @Override // defpackage.xcm, defpackage.u8h
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                this.isRightScrollInner = dx < 0;
            }
        });
        ScrollChartRecycleView scrollChartRecycleView10 = this.chartView;
        if (scrollChartRecycleView10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chartView");
        } else {
            scrollChartRecycleView3 = scrollChartRecycleView10;
        }
        scrollChartRecycleView3.addOnItemTouchListener(hakVar);
    }

    public final void setData(long startMills, int inDays, @NotNull List<WomenHealthSymptoms> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        List<MaxMinEntry> listBuildEntries = buildEntries(startMills, inDays, list);
        if (listBuildEntries != null) {
            this.mChartEntries.clear();
            this.mChartEntries.addAll(listBuildEntries);
            int size = listBuildEntries.size();
            if (size > 7) {
                size = 7;
            }
            for (MaxMinEntry maxMinEntry : this.mChartEntries) {
                Logger.d("SymMoodChartRecordInfoView", "cyzdebug - date:" + maxMinEntry.localDate + ",maxY：" + maxMinEntry.maxY + ",minY：" + maxMinEntry.minY);
            }
            this.mXAxis = new vqr(this.lineChartAttrs, size, new arr(getContext()));
            rtr rtrVar = this.mYAxis;
            ufe<MaxMinEntry> ufeVar = null;
            this.mYAxis = rtrVar != null ? rtrVar.m(rtrVar, 6.0f, 3) : null;
            z85 z85Var = this.mItemDecoration;
            if (z85Var != null) {
                z85Var.setXAxis(this.mXAxis);
            }
            ufe<MaxMinEntry> ufeVar2 = this.mLineChartAdapter;
            if (ufeVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLineChartAdapter");
                ufeVar2 = null;
            }
            ufeVar2.setXAxis(this.mXAxis);
            z85 z85Var2 = this.mItemDecoration;
            if (z85Var2 != null) {
                z85Var2.setYAxis(this.mYAxis);
            }
            ufe<MaxMinEntry> ufeVar3 = this.mLineChartAdapter;
            if (ufeVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLineChartAdapter");
                ufeVar3 = null;
            }
            ufeVar3.setYAxis(this.mYAxis);
            ufe<MaxMinEntry> ufeVar4 = this.mLineChartAdapter;
            if (ufeVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLineChartAdapter");
            } else {
                ufeVar = ufeVar4;
            }
            if (ufeVar != null) {
                ufeVar.notifyDataSetChanged();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SymMoodChartRecordInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SymMoodChartRecordInfoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SymMoodChartRecordInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mChartEntries = new ArrayList();
        LayoutInflater.from(context).inflate(jui.l3, (ViewGroup) this, true);
        CurseFactor factor = CurseFactorKt.getFactor(context.getResources().obtainAttributes(attributeSet, n4j.V5).getInt(n4j.W5, 0));
        this.factor = factor;
        TextView textView = (TextView) findViewById(eri.po);
        this.typeView = textView;
        textView.setText(CurseFactorKt.getName(factor));
        this.chartView = (ScrollChartRecycleView) findViewById(eri.U4);
        initStressFaceChart();
    }
}
