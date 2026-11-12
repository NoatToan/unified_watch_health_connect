package com.xiaomi.fitness.health.sleep.utils;

import com.xiaomi.fitness.baseui.widget.LevelBarView;
import defpackage.c0j;
import defpackage.iji;
import defpackage.pni;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/utils/SleepInsightReportUiHelper;", "", "<init>", "()V", "buildSleepLevelList", "", "Lcom/xiaomi/fitness/baseui/widget/LevelBarView$LevelItem;", "buildSleepStressList", "buildSleepStrengthList", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepInsightReportUiHelper {

    @NotNull
    public static final SleepInsightReportUiHelper INSTANCE = new SleepInsightReportUiHelper();

    private SleepInsightReportUiHelper() {
    }

    @NotNull
    public final List<LevelBarView.LevelItem> buildSleepLevelList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new LevelBarView.LevelItem(iji.Y1, c0j.fi));
        arrayList.add(new LevelBarView.LevelItem(iji.c2, c0j.nh));
        LevelBarView.LevelItem levelItem = new LevelBarView.LevelItem(iji.Z1, c0j.gi);
        levelItem.e = pni.H0;
        levelItem.f = true;
        arrayList.add(levelItem);
        return arrayList;
    }

    @NotNull
    public final List<LevelBarView.LevelItem> buildSleepStrengthList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new LevelBarView.LevelItem(iji.e2, c0j.nh));
        return arrayList;
    }

    @NotNull
    public final List<LevelBarView.LevelItem> buildSleepStressList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new LevelBarView.LevelItem(iji.f2, c0j.di));
        arrayList.add(new LevelBarView.LevelItem(iji.g2, c0j.nh));
        LevelBarView.LevelItem levelItem = new LevelBarView.LevelItem(iji.f2, c0j.gi);
        levelItem.e = pni.H0;
        levelItem.f = true;
        arrayList.add(levelItem);
        return arrayList;
    }
}
