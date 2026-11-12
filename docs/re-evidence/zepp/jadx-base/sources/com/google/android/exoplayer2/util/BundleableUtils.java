package com.google.android.exoplayer2.util;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class BundleableUtils {
    private BundleableUtils() {
    }

    public static <T extends Bundleable> ImmutableList<T> fromBundleList(Bundleable.Creator<T> creator, List<Bundle> bundleList) {
        ImmutableList.Builder builder = ImmutableList.builder();
        for (int i = 0; i < bundleList.size(); i++) {
            builder.add(creator.fromBundle(bundleList.get(i)));
        }
        return builder.build();
    }

    @Nullable
    public static <T extends Bundleable> T fromNullableBundle(Bundleable.Creator<T> creator, @Nullable Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return (T) creator.fromBundle(bundle);
    }

    public static <T extends Bundleable> ArrayList<Bundle> toBundleArrayList(List<T> bundleableList) {
        ArrayList<Bundle> arrayList = new ArrayList<>(bundleableList.size());
        for (int i = 0; i < bundleableList.size(); i++) {
            arrayList.add(bundleableList.get(i).toBundle());
        }
        return arrayList;
    }

    public static <T extends Bundleable> ImmutableList<Bundle> toBundleList(List<T> bundleableList) {
        ImmutableList.Builder builder = ImmutableList.builder();
        for (int i = 0; i < bundleableList.size(); i++) {
            builder.add(bundleableList.get(i).toBundle());
        }
        return builder.build();
    }

    @Nullable
    public static Bundle toNullableBundle(@Nullable Bundleable bundleable) {
        if (bundleable == null) {
            return null;
        }
        return bundleable.toBundle();
    }

    public static <T extends Bundleable> T fromNullableBundle(Bundleable.Creator<T> creator, @Nullable Bundle bundle, T t) {
        return bundle == null ? t : (T) creator.fromBundle(bundle);
    }
}
