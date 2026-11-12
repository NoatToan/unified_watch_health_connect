package com.ingenic.iwds.utils;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes18.dex */
public class IwdsUtils {
    private IwdsUtils() {
    }

    public static <T> void addInArray(SparseArray<SparseArray<T>> sparseArray, int i, int i2, T t) {
        if (sparseArray == null) {
            return;
        }
        SparseArray<T> sparseArray2 = sparseArray.get(i);
        if (sparseArray2 == null) {
            sparseArray2 = new SparseArray<>();
            synchronized (sparseArray) {
                sparseArray.put(i, sparseArray2);
            }
        }
        synchronized (sparseArray) {
            sparseArray2.put(i2, t);
        }
    }

    public static <T> void deleteInArray(SparseArray<SparseArray<T>> sparseArray, int i, int i2) {
        SparseArray<T> sparseArray2;
        if (sparseArray == null || (sparseArray2 = sparseArray.get(i)) == null) {
            return;
        }
        synchronized (sparseArray) {
            sparseArray2.delete(i2);
            if (sparseArray2.size() == 0) {
                sparseArray.delete(i);
            }
        }
    }
}
