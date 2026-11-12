package com.xiaomi.fitness.sport_eco.view.interval;

import android.os.Bundle;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.sport_eco_manager_export.data.GoalRemindData;
import com.xiaomi.fitness.sport_eco_manager_export.di.SportEcoManagerExtKt;
import com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState;
import defpackage.e1j;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import miuix.miuixbasewidget.widget.FilterSortView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0006\u0010\u001c\u001a\u00020\u0005J\"\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\n2\b\b\u0002\u0010\u001f\u001a\u00020\n2\b\b\u0002\u0010 \u001a\u00020\nR&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/interval/IntervalTrainingVM;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "tabViewMap", "", "", "Lmiuix/miuixbasewidget/widget/FilterSortView$TabView;", "getTabViewMap", "()Ljava/util/Map;", "setTabViewMap", "(Ljava/util/Map;)V", "mPosition", "getMPosition", "()I", "setMPosition", "(I)V", "mTabTitles", "Ljava/util/ArrayList;", "", "getMTabTitles", "()Ljava/util/ArrayList;", "setMTabTitles", "(Ljava/util/ArrayList;)V", "setTabList", "setSportRemind", "goalType", DailyRecordKey.sportType, "trainingMode", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IntervalTrainingVM extends AbsViewModel {
    private int mPosition;

    @NotNull
    private Map<Integer, FilterSortView.TabView> tabViewMap = new LinkedHashMap();

    @NotNull
    private ArrayList<String> mTabTitles = new ArrayList<>();

    public static /* synthetic */ void setSportRemind$default(IntervalTrainingVM intervalTrainingVM, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 14;
        }
        if ((i4 & 4) != 0) {
            i3 = 2;
        }
        intervalTrainingVM.setSportRemind(i, i2, i3);
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final int getMPosition() {
        return this.mPosition;
    }

    @NotNull
    public final ArrayList<String> getMTabTitles() {
        return this.mTabTitles;
    }

    @NotNull
    public final Map<Integer, FilterSortView.TabView> getTabViewMap() {
        return this.tabViewMap;
    }

    public final void setMPosition(int i) {
        this.mPosition = i;
    }

    public final void setMTabTitles(@NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.mTabTitles = arrayList;
    }

    public final void setSportRemind(int goalType, int sportType, int trainingMode) {
        SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE).refreshSportRemind(sportType, new GoalRemindData(goalType, 0.0f, sportType, trainingMode, 2, null));
    }

    public final void setTabList() {
        this.mTabTitles.clear();
        this.mTabTitles.add(ResourceExtKt.getString(e1j.i3));
        this.mTabTitles.add(ResourceExtKt.getString(e1j.y3));
    }

    public final void setTabViewMap(@NotNull Map<Integer, FilterSortView.TabView> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.tabViewMap = map;
    }
}
