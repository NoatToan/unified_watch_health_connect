package com.google.android.datatransport;

import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes13.dex */
@AutoValue
public abstract class Event<T> {
    public static <T> Event<T> ofData(int i14, T t7, ProductData productData, EventContext eventContext) {
        return new AutoValue_Event(Integer.valueOf(i14), t7, Priority.DEFAULT, productData, eventContext);
    }

    public static <T> Event<T> ofTelemetry(int i14, T t7, ProductData productData, EventContext eventContext) {
        return new AutoValue_Event(Integer.valueOf(i14), t7, Priority.VERY_LOW, productData, eventContext);
    }

    public static <T> Event<T> ofUrgent(int i14, T t7, ProductData productData, EventContext eventContext) {
        return new AutoValue_Event(Integer.valueOf(i14), t7, Priority.HIGHEST, productData, eventContext);
    }

    public abstract Integer getCode();

    public abstract EventContext getEventContext();

    public abstract T getPayload();

    public abstract Priority getPriority();

    public abstract ProductData getProductData();

    public static <T> Event<T> ofData(int i14, T t7, ProductData productData) {
        return new AutoValue_Event(Integer.valueOf(i14), t7, Priority.DEFAULT, productData, null);
    }

    public static <T> Event<T> ofTelemetry(int i14, T t7, ProductData productData) {
        return new AutoValue_Event(Integer.valueOf(i14), t7, Priority.VERY_LOW, productData, null);
    }

    public static <T> Event<T> ofUrgent(int i14, T t7, ProductData productData) {
        return new AutoValue_Event(Integer.valueOf(i14), t7, Priority.HIGHEST, productData, null);
    }

    public static <T> Event<T> ofData(int i14, T t7, EventContext eventContext) {
        return new AutoValue_Event(Integer.valueOf(i14), t7, Priority.DEFAULT, null, eventContext);
    }

    public static <T> Event<T> ofTelemetry(int i14, T t7, EventContext eventContext) {
        return new AutoValue_Event(Integer.valueOf(i14), t7, Priority.VERY_LOW, null, eventContext);
    }

    public static <T> Event<T> ofUrgent(int i14, T t7, EventContext eventContext) {
        return new AutoValue_Event(Integer.valueOf(i14), t7, Priority.HIGHEST, null, eventContext);
    }

    public static <T> Event<T> ofData(int i14, T t7) {
        return new AutoValue_Event(Integer.valueOf(i14), t7, Priority.DEFAULT, null, null);
    }

    public static <T> Event<T> ofTelemetry(int i14, T t7) {
        return new AutoValue_Event(Integer.valueOf(i14), t7, Priority.VERY_LOW, null, null);
    }

    public static <T> Event<T> ofUrgent(int i14, T t7) {
        return new AutoValue_Event(Integer.valueOf(i14), t7, Priority.HIGHEST, null, null);
    }

    public static <T> Event<T> ofData(T t7, ProductData productData, EventContext eventContext) {
        return new AutoValue_Event(null, t7, Priority.DEFAULT, productData, eventContext);
    }

    public static <T> Event<T> ofTelemetry(T t7, ProductData productData, EventContext eventContext) {
        return new AutoValue_Event(null, t7, Priority.VERY_LOW, productData, eventContext);
    }

    public static <T> Event<T> ofUrgent(T t7, ProductData productData, EventContext eventContext) {
        return new AutoValue_Event(null, t7, Priority.HIGHEST, productData, eventContext);
    }

    public static <T> Event<T> ofData(T t7, ProductData productData) {
        return new AutoValue_Event(null, t7, Priority.DEFAULT, productData, null);
    }

    public static <T> Event<T> ofTelemetry(T t7, ProductData productData) {
        return new AutoValue_Event(null, t7, Priority.VERY_LOW, productData, null);
    }

    public static <T> Event<T> ofUrgent(T t7, ProductData productData) {
        return new AutoValue_Event(null, t7, Priority.HIGHEST, productData, null);
    }

    public static <T> Event<T> ofData(T t7, EventContext eventContext) {
        return new AutoValue_Event(null, t7, Priority.DEFAULT, null, eventContext);
    }

    public static <T> Event<T> ofTelemetry(T t7, EventContext eventContext) {
        return new AutoValue_Event(null, t7, Priority.VERY_LOW, null, eventContext);
    }

    public static <T> Event<T> ofUrgent(T t7, EventContext eventContext) {
        return new AutoValue_Event(null, t7, Priority.HIGHEST, null, eventContext);
    }

    public static <T> Event<T> ofData(T t7) {
        return new AutoValue_Event(null, t7, Priority.DEFAULT, null, null);
    }

    public static <T> Event<T> ofTelemetry(T t7) {
        return new AutoValue_Event(null, t7, Priority.VERY_LOW, null, null);
    }

    public static <T> Event<T> ofUrgent(T t7) {
        return new AutoValue_Event(null, t7, Priority.HIGHEST, null, null);
    }
}
