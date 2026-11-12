package com.xiaomi.fitness.devicesettings.bluttooth.audio;

import com.mi.health.course.export.data.CourseConfigModel;
import defpackage.wkf;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0006\u0010\r\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/WatchPullDataManager;", "", "<init>", "()V", "TAG", "", "watchRecordBeans", "", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/WatchRecordBean;", CourseConfigModel.DevCmd.CMD_ACTION_SET, "", "beans", "get", "reset", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWatchPullDataManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WatchPullDataManager.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/WatchPullDataManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,47:1\n1872#2,3:48\n*S KotlinDebug\n*F\n+ 1 WatchPullDataManager.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/WatchPullDataManager\n*L\n19#1:48,3\n*E\n"})
public final class WatchPullDataManager {

    @NotNull
    public static final WatchPullDataManager INSTANCE = new WatchPullDataManager();

    @NotNull
    private static final String TAG = "WatchPullDataManager";

    @Nullable
    private static List<WatchRecordBean> watchRecordBeans;

    private WatchPullDataManager() {
    }

    @NotNull
    public final List<WatchRecordBean> get() {
        List<WatchRecordBean> list = watchRecordBeans;
        Integer numValueOf = list != null ? Integer.valueOf(list.size()) : null;
        StringBuilder sb = new StringBuilder();
        sb.append("watchRecordBeans size ");
        sb.append(numValueOf);
        List<WatchRecordBean> list2 = watchRecordBeans;
        Intrinsics.checkNotNull(list2);
        return list2;
    }

    public final void reset() {
        watchRecordBeans = null;
    }

    public final void set(@Nullable List<WatchRecordBean> beans) {
        Integer numValueOf = beans != null ? Integer.valueOf(beans.size()) : null;
        StringBuilder sb = new StringBuilder();
        sb.append("set watchRecordBeans size ");
        sb.append(numValueOf);
        if (beans == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : beans) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            WatchRecordBean watchRecordBean = (WatchRecordBean) obj;
            wkf wkfVar = new wkf();
            wkfVar.f = watchRecordBean.getFile().f;
            wkfVar.c = watchRecordBean.getFile().c;
            wkfVar.g = watchRecordBean.getFile().g;
            wkfVar.d = watchRecordBean.getFile().d;
            wkfVar.e = watchRecordBean.getFile().e;
            arrayList.add(new WatchRecordBean(wkfVar, watchRecordBean.isPull()));
            i = i2;
        }
        watchRecordBeans = arrayList;
    }
}
