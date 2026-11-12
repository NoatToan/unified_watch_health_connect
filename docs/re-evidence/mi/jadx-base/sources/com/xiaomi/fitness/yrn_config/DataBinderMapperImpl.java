package com.xiaomi.fitness.yrn_config;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import defpackage.qk5;
import defpackage.rk5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class DataBinderMapperImpl extends qk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f13469a = new SparseIntArray(0);

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f13470a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f13470a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f13471a = new HashMap<>(0);
    }

    @Override // defpackage.qk5
    public List<qk5> collectDependencies() {
        ArrayList arrayList = new ArrayList(25);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.BV.LinearGradient.DataBinderMapperImpl());
        arrayList.add(new com.dylanvann.fastimage.DataBinderMapperImpl());
        arrayList.add(new com.imagepicker.DataBinderMapperImpl());
        arrayList.add(new com.learnium.RNDeviceInfo.DataBinderMapperImpl());
        arrayList.add(new com.reactnative.blob.DataBinderMapperImpl());
        arrayList.add(new com.reactnative.ivpusic.imagepicker.DataBinderMapperImpl());
        arrayList.add(new com.reactnativecommunity.cameraroll.DataBinderMapperImpl());
        arrayList.add(new com.reactnativecommunity.cookies.DataBinderMapperImpl());
        arrayList.add(new com.reactnativecommunity.slider.DataBinderMapperImpl());
        arrayList.add(new com.reactnativecommunity.yrn.netinfo.DataBinderMapperImpl());
        arrayList.add(new com.reactnativepagerview.DataBinderMapperImpl());
        arrayList.add(new com.rnfs.DataBinderMapperImpl());
        arrayList.add(new com.swmansion.gesturehandler.react.DataBinderMapperImpl());
        arrayList.add(new com.swmansion.reanimated.DataBinderMapperImpl());
        arrayList.add(new com.th3rdwave.safeareacontext.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.cache.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.exception.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.wearable.yrn.components.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.wearable.yrn.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.wearable.yrn.sdk.DataBinderMapperImpl());
        arrayList.add(new com.zoontek.rnlocalize.DataBinderMapperImpl());
        arrayList.add(new fr.greweb.reactnativeviewshot.DataBinderMapperImpl());
        arrayList.add(new io.expo.appearance.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // defpackage.qk5
    public String convertBrIdToString(int i) {
        return a.f13470a.get(i);
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f13469a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // defpackage.qk5
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f13471a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View view, int i) {
        if (f13469a.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
