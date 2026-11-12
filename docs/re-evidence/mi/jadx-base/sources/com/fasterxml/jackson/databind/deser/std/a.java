package com.fasterxml.jackson.databind.deser.std;

import defpackage.esd;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet<String> f7666a = new HashSet<>();

    static {
        Class[] clsArr = {UUID.class, AtomicBoolean.class, StackTraceElement.class, ByteBuffer.class, Void.class};
        for (int i = 0; i < 5; i++) {
            f7666a.add(clsArr[i].getName());
        }
        for (Class<?> cls : FromStringDeserializer.types()) {
            f7666a.add(cls.getName());
        }
    }

    public static esd<?> a(Class<?> cls, String str) {
        if (!f7666a.contains(str)) {
            return null;
        }
        FromStringDeserializer.Std stdFindDeserializer = FromStringDeserializer.findDeserializer(cls);
        if (stdFindDeserializer != null) {
            return stdFindDeserializer;
        }
        if (cls == UUID.class) {
            return new UUIDDeserializer();
        }
        if (cls == StackTraceElement.class) {
            return new StackTraceElementDeserializer();
        }
        if (cls == AtomicBoolean.class) {
            return new AtomicBooleanDeserializer();
        }
        if (cls == ByteBuffer.class) {
            return new ByteBufferDeserializer();
        }
        if (cls == Void.class) {
            return NullifyingDeserializer.instance;
        }
        return null;
    }
}
