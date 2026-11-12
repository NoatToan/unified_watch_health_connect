package com.google.android.gms.common.data;

import com.xiaomi.fitness.notify.HuaMiNotifySettingImpl$Companion$SMS_APPS$1;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class FreezableUtils {
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(ArrayList<E> arrayList) {
        HuaMiNotifySettingImpl$Companion$SMS_APPS$1 huaMiNotifySettingImpl$Companion$SMS_APPS$1 = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            huaMiNotifySettingImpl$Companion$SMS_APPS$1.add(arrayList.get(i).freeze());
        }
        return huaMiNotifySettingImpl$Companion$SMS_APPS$1;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(Iterable<E> iterable) {
        HuaMiNotifySettingImpl$Companion$SMS_APPS$1 huaMiNotifySettingImpl$Companion$SMS_APPS$1 = (ArrayList<T>) new ArrayList();
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            huaMiNotifySettingImpl$Companion$SMS_APPS$1.add(it.next().freeze());
        }
        return huaMiNotifySettingImpl$Companion$SMS_APPS$1;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freeze(E[] eArr) {
        HuaMiNotifySettingImpl$Companion$SMS_APPS$1 huaMiNotifySettingImpl$Companion$SMS_APPS$1 = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e : eArr) {
            huaMiNotifySettingImpl$Companion$SMS_APPS$1.add(e.freeze());
        }
        return huaMiNotifySettingImpl$Companion$SMS_APPS$1;
    }
}
