package com.xiaomi.fitness.devicesettings.bluttooth.todo.remind;

import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.remind.data.TodoRemindItem;
import com.xiaomi.fitness.devicesettings.common.eventremind.EventMinderUtil;
import com.xiaomi.smarthome.framework.api.UserConfig;
import defpackage.n64;
import defpackage.p14;
import defpackage.t64;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\n\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000e\u001a\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011*\b\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lp14;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/todo/remind/data/TodoRemindItem;", "transform", "(Lp14;)Lcom/xiaomi/fitness/devicesettings/bluttooth/todo/remind/data/TodoRemindItem;", "", "weekDays", "", "", "getRepeatDays", "(I)Ljava/util/List;", "transformToDevice", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/todo/remind/data/TodoRemindItem;)Lp14;", "repeatType", "transformTodoItemRepeatTypeToDeviceType", "(I)I", "type", "transformDeviceRepeatTypeToTodoItem", "", "groupAndSort", "(Ljava/util/List;)Ljava/util/List;", "device-settings_chinaProductRelease"}, k = 2, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nTodoRemindViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TodoRemindViewModel.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/todo/remind/TodoRemindViewModelKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,327:1\n1485#2:328\n1510#2,3:329\n1513#2,3:339\n1062#2:342\n1062#2:343\n381#3,7:332\n*S KotlinDebug\n*F\n+ 1 TodoRemindViewModel.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/todo/remind/TodoRemindViewModelKt\n*L\n315#1:328\n315#1:329,3\n315#1:339,3\n317#1:342\n318#1:343\n315#1:332,7\n*E\n"})
public final class TodoRemindViewModelKt {
    private static final List<String> getRepeatDays(int i) {
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        while (i != 0) {
            if ((i & 1) == 1) {
                arrayList.add(String.valueOf(i2));
            }
            i2++;
            i >>= 1;
        }
        return arrayList;
    }

    @NotNull
    public static final List<TodoRemindItem> groupAndSort(@NotNull List<TodoRemindItem> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        ListExtKt.addAll(arrayList, list);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayList) {
            Integer numValueOf = Integer.valueOf(((TodoRemindItem) obj).getStatus());
            Object arrayList2 = linkedHashMap.get(numValueOf);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList2);
            }
            ((List) arrayList2).add(obj);
        }
        List list2 = (List) linkedHashMap.get(1);
        List listSortedWith = list2 != null ? CollectionsKt___CollectionsKt.sortedWith(list2, new Comparator() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.todo.remind.TodoRemindViewModelKt$groupAndSort$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((TodoRemindItem) t2).getUpdateTimeSecond()), Long.valueOf(((TodoRemindItem) t).getUpdateTimeSecond()));
            }
        }) : null;
        List list3 = (List) linkedHashMap.get(2);
        List listSortedWith2 = list3 != null ? CollectionsKt___CollectionsKt.sortedWith(list3, new Comparator() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.todo.remind.TodoRemindViewModelKt$groupAndSort$$inlined$sortedByDescending$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((TodoRemindItem) t2).getUpdateTimeSecond()), Long.valueOf(((TodoRemindItem) t).getUpdateTimeSecond()));
            }
        }) : null;
        ArrayList arrayList3 = new ArrayList();
        if (listSortedWith != null) {
            arrayList3.addAll(listSortedWith);
        }
        if (listSortedWith2 != null) {
            arrayList3.addAll(listSortedWith2);
        }
        return arrayList3;
    }

    @NotNull
    public static final TodoRemindItem transform(@NotNull p14 p14Var) {
        Object objValueOf;
        String strJoinToString$default;
        Intrinsics.checkNotNullParameter(p14Var, "<this>");
        String strValueOf = String.valueOf(p14Var.d.c.c);
        int i = p14Var.d.c.d;
        if (i < 10) {
            objValueOf = "0" + i;
        } else {
            objValueOf = Integer.valueOf(i);
        }
        p14.a aVar = p14Var.d;
        int i2 = aVar.c.e;
        t64 t64Var = aVar.d;
        Date dateUtcToLocal = EventMinderUtil.INSTANCE.utcToLocal(strValueOf + "-" + objValueOf + "-" + i2 + " " + t64Var.c + ":" + t64Var.d);
        long time = dateUtcToLocal.getTime() / ((long) 1000);
        int iTransformDeviceRepeatTypeToTodoItem = transformDeviceRepeatTypeToTodoItem(p14Var.d.e);
        List<String> repeatDays = getRepeatDays(p14Var.d.f);
        if (iTransformDeviceRepeatTypeToTodoItem == 2) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(dateUtcToLocal.getTime());
            strJoinToString$default = (calendar.get(7) == 1 ? UserConfig.KEY_HOME_SCENE_FRAGMENT_TOP : Integer.valueOf(calendar.get(7) - 1)).toString();
        } else {
            strJoinToString$default = repeatDays.size() == 1 ? repeatDays.get(0) : CollectionsKt___CollectionsKt.joinToString$default(repeatDays, ",", null, null, 0, null, null, 62, null);
        }
        String str = strJoinToString$default;
        int i3 = p14Var.c;
        p14.a aVar2 = p14Var.d;
        int i4 = aVar2.i;
        int i5 = aVar2.j;
        return new TodoRemindItem(i3, i4, i5 == 0 ? 1 : i5, aVar2.e != 15, iTransformDeviceRepeatTypeToTodoItem, aVar2.g, time, str, aVar2.f29901k);
    }

    public static final int transformDeviceRepeatTypeToTodoItem(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 5;
            if (i != 5) {
                if (i == 6) {
                    return 2;
                }
                if (i != 7) {
                    return i != 8 ? 0 : 4;
                }
                return 3;
            }
        }
        return i2;
    }

    @NotNull
    public static final p14 transformToDevice(@NotNull TodoRemindItem todoRemindItem) {
        Intrinsics.checkNotNullParameter(todoRemindItem, "<this>");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(EventMinderUtil.INSTANCE.localToUTC(todoRemindItem.getRemindTimeSecond() * ((long) 1000)));
        n64 n64Var = new n64();
        n64Var.c = calendar.get(1);
        n64Var.d = calendar.get(2) + 1;
        n64Var.e = calendar.get(5);
        t64 t64Var = new t64();
        t64Var.c = calendar.get(11);
        t64Var.d = calendar.get(12);
        ArrayList arrayList = new ArrayList();
        String customDayStr = todoRemindItem.getCustomDayStr();
        int i = 0;
        if (customDayStr == null || !StringsKt__StringsKt.contains$default((CharSequence) customDayStr, (CharSequence) ",", false, 2, (Object) null)) {
            arrayList.add((calendar.get(7) == 1 ? UserConfig.KEY_HOME_SCENE_FRAGMENT_TOP : Integer.valueOf(calendar.get(7) - 1)).toString());
        } else {
            String customDayStr2 = todoRemindItem.getCustomDayStr();
            Intrinsics.checkNotNull(customDayStr2);
            arrayList.addAll(CollectionsKt___CollectionsKt.toMutableList((Collection) StringsKt__StringsKt.split$default((CharSequence) customDayStr2, new String[]{","}, false, 0, 6, (Object) null)));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i |= 1 << (Integer.parseInt((String) it.next()) - 1);
        }
        int iTransformTodoItemRepeatTypeToDeviceType = !todoRemindItem.getRemindEnable() ? 15 : transformTodoItemRepeatTypeToDeviceType(todoRemindItem.getRepeatMode());
        p14.a aVar = new p14.a();
        aVar.i = todoRemindItem.getSource();
        String content = todoRemindItem.getContent();
        if (content == null) {
            content = "";
        }
        aVar.g = content;
        aVar.c = n64Var;
        aVar.d = t64Var;
        aVar.e = iTransformTodoItemRepeatTypeToDeviceType;
        aVar.f = i;
        aVar.f29901k = todoRemindItem.getUpdateTimeSecond();
        aVar.j = todoRemindItem.getStatus();
        p14 p14Var = new p14();
        p14Var.c = todoRemindItem.getId();
        p14Var.d = aVar;
        return p14Var;
    }

    public static final int transformTodoItemRepeatTypeToDeviceType(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 6;
        }
        if (i == 3) {
            return 7;
        }
        if (i != 4) {
            return i != 5 ? 15 : 5;
        }
        return 8;
    }
}
