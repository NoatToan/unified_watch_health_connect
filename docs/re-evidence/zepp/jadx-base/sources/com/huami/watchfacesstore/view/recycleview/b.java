package com.huami.watchfacesstore.view.recycleview;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
interface b<T> {
    void add(int index, @NonNull T elem);

    void add(@NonNull T elem);

    void addAll(int location, List<T> items);

    void addAll(@NonNull List<T> elem);

    void clear();

    boolean contains(@NonNull T elem);

    boolean containsAll(List<T> items);

    @LayoutRes
    int getLayoutResId(T item, @LayoutRes int position);

    void move(int fromPosition, int toPosition);

    void remove(int index);

    void remove(@NonNull T elem);

    void removeAll(List<T> items);

    void replaceAll(@NonNull List<T> elem);

    void set(int index, @NonNull T elem);

    void set(@NonNull T oldElem, @NonNull T newElem);
}
