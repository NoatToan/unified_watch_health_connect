package com.xiaomi.fitness.widget.distribute;

import android.content.Context;
import defpackage.lki;
import defpackage.r1j;
import defpackage.uz6;
import defpackage.x44;
import defpackage.xz;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0007\u001a\u00020\u0006\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0015\u001a\u00020\u0006\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0015\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/widget/distribute/DistributeDataUtil;", "", "Lxz;", "T", "", "distributeViewModelList", "", "setPositionOfList", "(Ljava/util/List;)V", "Landroid/content/Context;", "context", "Lcom/xiaomi/fitness/widget/distribute/HrmDistribute;", "hrDistribute", "", "sport", "Luz6;", "createDistributeModelList", "(Landroid/content/Context;Lcom/xiaomi/fitness/widget/distribute/HrmDistribute;Z)Ljava/util/List;", "createDistributeModelListForHrFragment", "(Landroid/content/Context;Lcom/xiaomi/fitness/widget/distribute/HrmDistribute;)Ljava/util/List;", "dataList", "reviseDistributeDataList", "<init>", "()V", "widget_release"}, k = 1, mv = {2, 0, 0})
public final class DistributeDataUtil {

    @NotNull
    public static final DistributeDataUtil INSTANCE = new DistributeDataUtil();

    private DistributeDataUtil() {
    }

    @JvmStatic
    @NotNull
    public static final List<uz6> createDistributeModelList(@NotNull Context context, @NotNull HrmDistribute hrDistribute, boolean sport) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(hrDistribute, "hrDistribute");
        LinkedList linkedList = new LinkedList();
        if (hrDistribute.getSumDuration() == 0) {
            return linkedList;
        }
        linkedList.add(new uz6(x44.a(lki.f25175k), context.getString(sport ? r1j.f : r1j.f32078a), 3, hrDistribute.getWarmUpDuration(), hrDistribute.getWarmPer()));
        linkedList.add(new uz6(x44.a(lki.j), context.getString(sport ? r1j.g : r1j.f32079b), 3, hrDistribute.getFatBurningDuration(), hrDistribute.getFatPer()));
        linkedList.add(new uz6(x44.a(lki.g), context.getString(sport ? r1j.h : r1j.c), 3, hrDistribute.getAerobicDuration(), hrDistribute.getAerobicPer()));
        linkedList.add(new uz6(x44.a(lki.h), context.getString(sport ? r1j.i : r1j.d), 3, hrDistribute.getAnaerobicDuration(), hrDistribute.getAnaerobicPer()));
        linkedList.add(new uz6(x44.a(lki.i), context.getString(sport ? r1j.j : r1j.e), 3, hrDistribute.getExtremeDuration(), hrDistribute.getExtremePer()));
        INSTANCE.reviseDistributeDataList(linkedList);
        return linkedList;
    }

    @JvmStatic
    @NotNull
    public static final List<uz6> createDistributeModelListForHrFragment(@NotNull Context context, @NotNull HrmDistribute hrDistribute) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(hrDistribute, "hrDistribute");
        LinkedList linkedList = new LinkedList();
        if (hrDistribute.getSumDuration() == 0) {
            return linkedList;
        }
        int iA = x44.a(lki.f25175k);
        String string = context.getString(r1j.f);
        int warmPer = hrDistribute.getWarmPer();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        linkedList.add(new uz6(iA, string, 3, warmPer, true, timeUnit.toMillis(hrDistribute.getWarmUpDuration())));
        linkedList.add(new uz6(x44.a(lki.j), context.getString(r1j.g), 3, hrDistribute.getFatPer(), true, timeUnit.toMillis(hrDistribute.getFatBurningDuration())));
        linkedList.add(new uz6(x44.a(lki.g), context.getString(r1j.h), 3, hrDistribute.getAerobicPer(), true, timeUnit.toMillis(hrDistribute.getAerobicDuration())));
        linkedList.add(new uz6(x44.a(lki.h), context.getString(r1j.i), 3, hrDistribute.getAnaerobicPer(), true, timeUnit.toMillis(hrDistribute.getAnaerobicDuration())));
        linkedList.add(new uz6(x44.a(lki.i), context.getString(r1j.j), 3, hrDistribute.getExtremePer(), true, timeUnit.toMillis(hrDistribute.getExtremeDuration())));
        INSTANCE.reviseDistributeDataList(linkedList);
        return linkedList;
    }

    @JvmStatic
    public static final <T extends xz> void setPositionOfList(@NotNull List<? extends T> distributeViewModelList) {
        Intrinsics.checkNotNullParameter(distributeViewModelList, "distributeViewModelList");
        List<? extends T> list = distributeViewModelList;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            T t = distributeViewModelList.get(i);
            Intrinsics.checkNotNull(t);
            if (t.f39601a > 0) {
                t.f39602b = 1;
                break;
            }
            i++;
        }
        int size2 = list.size() - 1;
        if (size2 < 0) {
            size2 = -1;
            break;
        }
        while (true) {
            int i2 = size2 - 1;
            T t2 = distributeViewModelList.get(size2);
            Intrinsics.checkNotNull(t2);
            if (t2.f39601a > 0) {
                t2.f39602b = 2;
                break;
            } else {
                if (i2 < 0) {
                    size2 = -1;
                    break;
                }
                size2 = i2;
            }
        }
        if (i != size2 || size2 == -1) {
            return;
        }
        T t3 = distributeViewModelList.get(i);
        Intrinsics.checkNotNull(t3);
        t3.f39602b = 3;
    }

    public final <T extends xz> void reviseDistributeDataList(@NotNull List<? extends T> dataList) {
        int i;
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        int size = dataList.size();
        int i2 = size - 1;
        while (true) {
            if (i2 <= 0) {
                i2 = 0;
                break;
            }
            T t = dataList.get(i2);
            Intrinsics.checkNotNull(t);
            if (t.f39601a > 0) {
                break;
            } else {
                i2--;
            }
        }
        int i3 = 0;
        for (i = 0; i < i2; i++) {
            T t2 = dataList.get(i);
            Intrinsics.checkNotNull(t2);
            i3 += t2.f39601a;
        }
        if (i2 < size) {
            T t3 = dataList.get(i2);
            Intrinsics.checkNotNull(t3);
            t3.f39601a = 100 - i3;
        }
    }
}
