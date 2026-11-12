package com.google.android.exoplayer2.util;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class BundleableUtil {
    private BundleableUtil() {
    }

    public static void ensureClassLoader(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) Util.castNonNull(BundleableUtil.class.getClassLoader()));
        }
    }

    public static <T extends Bundleable> ImmutableList<T> fromBundleList(Bundleable.Creator<T> creator, List<Bundle> list) {
        ImmutableList.Builder builder = ImmutableList.builder();
        for (int i14 = 0; i14 < list.size(); i14++) {
            builder.add(creator.fromBundle((Bundle) Assertions.checkNotNull(list.get(i14))));
        }
        return builder.build();
    }

    public static <T extends Bundleable> List<T> fromBundleNullableList(Bundleable.Creator<T> creator, List<Bundle> list, List<T> list2) {
        return list == null ? list2 : fromBundleList(creator, list);
    }

    public static <T extends Bundleable> SparseArray<T> fromBundleNullableSparseArray(Bundleable.Creator<T> creator, SparseArray<Bundle> sparseArray, SparseArray<T> sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2;
        }
        ParcelableSparseArray parcelableSparseArray = (SparseArray<T>) new SparseArray(sparseArray.size());
        for (int i14 = 0; i14 < sparseArray.size(); i14++) {
            parcelableSparseArray.put(sparseArray.keyAt(i14), creator.fromBundle(sparseArray.valueAt(i14)));
        }
        return parcelableSparseArray;
    }

    public static <T extends Bundleable> T fromNullableBundle(Bundleable.Creator<T> creator, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return (T) creator.fromBundle(bundle);
    }

    public static <T extends Bundleable> ArrayList<Bundle> toBundleArrayList(Collection<T> collection) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toBundle());
        }
        return arrayList;
    }

    public static <T extends Bundleable> ImmutableList<Bundle> toBundleList(List<T> list) {
        ImmutableList.Builder builder = ImmutableList.builder();
        for (int i14 = 0; i14 < list.size(); i14++) {
            builder.add(list.get(i14).toBundle());
        }
        return builder.build();
    }

    public static <T extends Bundleable> SparseArray<Bundle> toBundleSparseArray(SparseArray<T> sparseArray) {
        SparseArray<Bundle> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i14 = 0; i14 < sparseArray.size(); i14++) {
            sparseArray2.put(sparseArray.keyAt(i14), sparseArray.valueAt(i14).toBundle());
        }
        return sparseArray2;
    }

    public static Bundle toNullableBundle(Bundleable bundleable) {
        if (bundleable == null) {
            return null;
        }
        return bundleable.toBundle();
    }

    public static <T extends Bundleable> T fromNullableBundle(Bundleable.Creator<T> creator, Bundle bundle, T t7) {
        return bundle == null ? t7 : (T) creator.fromBundle(bundle);
    }
}
