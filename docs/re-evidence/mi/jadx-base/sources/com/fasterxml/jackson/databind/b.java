package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import defpackage.e5q;
import defpackage.eud;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class b implements Closeable, Flushable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DefaultSerializerProvider f7635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SerializationConfig f7636b;
    public final JsonGenerator c;
    public final eud<Object> d;
    public final e5q e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public com.fasterxml.jackson.databind.ser.impl.a i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7637k;

    public b(DefaultSerializerProvider defaultSerializerProvider, JsonGenerator jsonGenerator, boolean z, ObjectWriter.Prefetch prefetch) throws IOException {
        this.f7635a = defaultSerializerProvider;
        this.c = jsonGenerator;
        this.f = z;
        this.d = prefetch.getValueSerializer();
        this.e = prefetch.getTypeSerializer();
        SerializationConfig config = defaultSerializerProvider.getConfig();
        this.f7636b = config;
        this.g = config.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE);
        this.h = config.isEnabled(SerializationFeature.CLOSE_CLOSEABLE);
        this.i = com.fasterxml.jackson.databind.ser.impl.a.b();
    }

    public b a(boolean z) throws IOException {
        if (z) {
            this.c.L0();
            this.j = true;
        }
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f7637k) {
            return;
        }
        this.f7637k = true;
        if (this.j) {
            this.j = false;
            this.c.i0();
        }
        if (this.f) {
            this.c.close();
        }
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f7637k) {
            return;
        }
        this.c.flush();
    }
}
