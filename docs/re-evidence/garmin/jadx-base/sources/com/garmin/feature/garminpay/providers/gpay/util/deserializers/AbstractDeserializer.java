package com.garmin.feature.garminpay.providers.gpay.util.deserializers;

import a90.c;
import com.google.gson.JsonDeserializer;
import o13.m;
import o13.t;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/util/deserializers/AbstractDeserializer;", "T", "Lcom/google/gson/JsonDeserializer;", "", "className", "<init>", "(Ljava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class AbstractDeserializer<T> implements JsonDeserializer<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f51734a;

    public AbstractDeserializer(String str) {
        str.getClass();
        this.f51734a = m.b(new c(str, 2));
    }

    public final Logger a() {
        return (Logger) this.f51734a.getValue();
    }
}
