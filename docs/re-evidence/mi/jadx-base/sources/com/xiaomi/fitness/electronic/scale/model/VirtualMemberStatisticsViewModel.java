package com.xiaomi.fitness.electronic.scale.model;

import android.os.Bundle;
import com.xiaomi.fit.fitness.export.data.aggregation.record.BodyComposition;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.electronic.scale.data.WeightResult;
import com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount;
import com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper;
import com.xiaomi.fitness.electronic.scale.model.VirtualMemberStatisticsViewModel;
import com.xiaomi.fitness.electronic.scale.util.WeightInfoUtil;
import defpackage.bu7;
import defpackage.f4b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016JZ\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2B\u0010\r\u001a>\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000f\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0013\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00150\u00140\u000f\u0012\u0004\u0012\u00020\u00050\u000eJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J4\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000f2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u000b\u001a\u00020\f¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/model/VirtualMemberStatisticsViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "queryVirtualDayData", "virtualAccount", "Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "isAdult", "", "callBack", "Lkotlin/Function2;", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/BodyComposition;", "", "Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;", "", "Ljava/util/TreeMap;", "Lcom/xiaomi/fitness/electronic/scale/data/WeightResult;", "formatWeightYMaxValue", "", "yAxisMaximum", "", "getBodyChangeItem", "weightResults", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVirtualMemberStatisticsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VirtualMemberStatisticsViewModel.kt\ncom/xiaomi/fitness/electronic/scale/model/VirtualMemberStatisticsViewModel\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,129:1\n216#2,2:130\n1863#3,2:132\n*S KotlinDebug\n*F\n+ 1 VirtualMemberStatisticsViewModel.kt\ncom/xiaomi/fitness/electronic/scale/model/VirtualMemberStatisticsViewModel\n*L\n117#1:130,2\n49#1:132,2\n*E\n"})
public final class VirtualMemberStatisticsViewModel extends AbsViewModel {

    @NotNull
    public static final String KEY_FAT = "fat";

    @NotNull
    public static final String KEY_WEIGHT = "weight";
    public static final int MAX_SIZE = 7;

    @NotNull
    private static final String TAG = "VirtualMemberStatistics";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit queryVirtualDayData$lambda$7(Map valueMap, Map changeMap, boolean z, Function2 callBack, List list) {
        WeightResult weightResult;
        Intrinsics.checkNotNullParameter(valueMap, "$valueMap");
        Intrinsics.checkNotNullParameter(changeMap, "$changeMap");
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        Intrinsics.checkNotNullParameter(list, "list");
        Logger.i(TAG, "queryWeightLatestDetail list " + list.size() + " ," + f4b.c(list));
        if (list.isEmpty()) {
            changeMap.put(BodyComposition.WEIGHT, new ArrayList());
            if (z) {
                changeMap.put(BodyComposition.BODY_FAT_RATE, new ArrayList());
                changeMap.put(BodyComposition.MUSCLE_RATE, new ArrayList());
            }
            Logger.i(TAG, "queryWeightLatestDetail map is empty");
            callBack.invoke(changeMap, valueMap);
        } else {
            final Function2 function2 = new Function2() { // from class: k0r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Integer.valueOf(VirtualMemberStatisticsViewModel.queryVirtualDayData$lambda$7$lambda$0((String) obj, (String) obj2));
                }
            };
            TreeMap treeMap = new TreeMap(new Comparator() { // from class: l0r
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return VirtualMemberStatisticsViewModel.queryVirtualDayData$lambda$7$lambda$1(function2, obj, obj2);
                }
            });
            Iterator it = list.iterator();
            while (it.hasNext()) {
                VirtualAccount virtualAccount = (VirtualAccount) it.next();
                if (treeMap.get(virtualAccount.getCreateDate()) == null && (weightResult = (WeightResult) bu7.a(virtualAccount.getBodyComposition(), WeightResult.class)) != null) {
                    treeMap.put(virtualAccount.getCreateDate(), weightResult);
                }
            }
            Logger.i(TAG, "queryWeightLatestDetail weightResults " + f4b.c(treeMap));
            ArrayList arrayList = new ArrayList();
            final Function2 function3 = new Function2() { // from class: m0r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Integer.valueOf(VirtualMemberStatisticsViewModel.queryVirtualDayData$lambda$7$lambda$3((String) obj, (String) obj2));
                }
            };
            TreeMap treeMap2 = new TreeMap(new Comparator() { // from class: n0r
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return VirtualMemberStatisticsViewModel.queryVirtualDayData$lambda$7$lambda$4(function3, obj, obj2);
                }
            });
            for (Object obj : treeMap.entrySet()) {
                Intrinsics.checkNotNullExpressionValue(obj, "next(...)");
                Map.Entry entry = (Map.Entry) obj;
                if (arrayList.size() >= 7) {
                    break;
                }
                treeMap2.put(entry.getKey(), entry.getValue());
                WeightInfoUtil weightInfoUtil = WeightInfoUtil.INSTANCE;
                Object value = entry.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
                arrayList.add(weightInfoUtil.weightResultToWeightItem((WeightResult) value));
            }
            valueMap.put("weight", treeMap2);
            changeMap.put(BodyComposition.WEIGHT, arrayList);
            if (z) {
                ArrayList arrayList2 = new ArrayList();
                final Function2 function4 = new Function2() { // from class: o0r
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return Integer.valueOf(VirtualMemberStatisticsViewModel.queryVirtualDayData$lambda$7$lambda$5((String) obj2, (String) obj3));
                    }
                };
                TreeMap treeMap3 = new TreeMap(new Comparator() { // from class: p0r
                    @Override // java.util.Comparator
                    public final int compare(Object obj2, Object obj3) {
                        return VirtualMemberStatisticsViewModel.queryVirtualDayData$lambda$7$lambda$6(function4, obj2, obj3);
                    }
                });
                for (Object obj2 : treeMap.entrySet()) {
                    Intrinsics.checkNotNullExpressionValue(obj2, "next(...)");
                    Map.Entry entry2 = (Map.Entry) obj2;
                    if (((WeightResult) entry2.getValue()).getBfp() > 0.0f) {
                        if (arrayList2.size() >= 7) {
                            break;
                        }
                        treeMap3.put(entry2.getKey(), entry2.getValue());
                        WeightInfoUtil weightInfoUtil2 = WeightInfoUtil.INSTANCE;
                        Object value2 = entry2.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "<get-value>(...)");
                        arrayList2.add(weightInfoUtil2.weightResultToWeightItem((WeightResult) value2));
                    }
                }
                changeMap.put(BodyComposition.BODY_FAT_RATE, arrayList2);
                changeMap.put(BodyComposition.MUSCLE_RATE, arrayList2);
                valueMap.put(KEY_FAT, treeMap3);
            }
            Logger.i(TAG, "queryWeightLatestDetail map " + f4b.c(changeMap));
            callBack.invoke(changeMap, valueMap);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int queryVirtualDayData$lambda$7$lambda$0(String key1, String key2) {
        Intrinsics.checkNotNullParameter(key1, "key1");
        Intrinsics.checkNotNullParameter(key2, "key2");
        return key2.compareTo(key1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int queryVirtualDayData$lambda$7$lambda$1(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int queryVirtualDayData$lambda$7$lambda$3(String key1, String key2) {
        Intrinsics.checkNotNullParameter(key1, "key1");
        Intrinsics.checkNotNullParameter(key2, "key2");
        return key2.compareTo(key1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int queryVirtualDayData$lambda$7$lambda$4(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int queryVirtualDayData$lambda$7$lambda$5(String key1, String key2) {
        Intrinsics.checkNotNullParameter(key1, "key1");
        Intrinsics.checkNotNullParameter(key2, "key2");
        return key2.compareTo(key1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int queryVirtualDayData$lambda$7$lambda$6(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final int formatWeightYMaxValue(float yAxisMaximum) {
        if (yAxisMaximum < 60) {
            return 60;
        }
        return ((((int) yAxisMaximum) / 10) * 10) + 10;
    }

    @NotNull
    public final Map<BodyComposition, List<WeightItem>> getBodyChangeItem(@NotNull TreeMap<String, WeightResult> weightResults, boolean isAdult) {
        Intrinsics.checkNotNullParameter(weightResults, "weightResults");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, WeightResult>> it = weightResults.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(WeightInfoUtil.INSTANCE.weightResultToWeightItem(it.next().getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(BodyComposition.WEIGHT, arrayList);
        if (isAdult) {
            linkedHashMap.put(BodyComposition.BODY_FAT_RATE, arrayList);
            linkedHashMap.put(BodyComposition.MUSCLE_RATE, arrayList);
        }
        Logger.i(TAG, "queryWeightLatestDetail map " + f4b.c(linkedHashMap));
        return linkedHashMap;
    }

    public final void queryVirtualDayData(@NotNull VirtualAccount virtualAccount, final boolean isAdult, @NotNull final Function2<? super Map<BodyComposition, ? extends List<WeightItem>>, ? super Map<String, ? extends TreeMap<String, WeightResult>>, Unit> callBack) {
        Intrinsics.checkNotNullParameter(virtualAccount, "virtualAccount");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        Logger.i(TAG, "db queryByVirtualid accountId is " + virtualAccount.getAccountId());
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        VirtualAccountHelper.INSTANCE.queryAllData(virtualAccount, new Function1() { // from class: j0r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return VirtualMemberStatisticsViewModel.queryVirtualDayData$lambda$7(linkedHashMap2, linkedHashMap, isAdult, callBack, (List) obj);
            }
        });
    }
}
