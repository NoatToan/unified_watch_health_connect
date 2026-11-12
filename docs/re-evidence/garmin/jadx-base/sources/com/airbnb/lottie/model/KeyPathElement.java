package com.airbnb.lottie.model;

import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface KeyPathElement {
    <T> void addValueCallback(T t7, LottieValueCallback<T> lottieValueCallback);

    void resolveKeyPath(KeyPath keyPath, int i14, List<KeyPath> list, KeyPath keyPath2);
}
