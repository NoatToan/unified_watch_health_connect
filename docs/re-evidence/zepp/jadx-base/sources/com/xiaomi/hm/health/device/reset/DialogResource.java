package com.xiaomi.hm.health.device.reset;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes18.dex */
public class DialogResource<T> {
    public static final int a = 16;
    public static final int b = 17;
    public static final int c = 18;
    public static final int d = 19;

    @NonNull
    public final T data;
    public final int status;

    private DialogResource(int i, @NonNull T t) {
        this.status = i;
        this.data = t;
    }

    public static <T> DialogResource<T> failure(@NonNull T t) {
        return new DialogResource<>(17, t);
    }

    public static <T> DialogResource<T> loading(@NonNull T t) {
        return new DialogResource<>(18, t);
    }

    public static <T> DialogResource<T> success(@NonNull T t) {
        return new DialogResource<>(16, t);
    }

    public static <T> DialogResource<T> warning(@NonNull T t) {
        return new DialogResource<>(19, t);
    }
}
