package io.netty.util;

import io.netty.util.Constant;
import io.netty.util.internal.ObjectUtil;
import io.netty.util.internal.PlatformDependent;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ConstantPool<T extends Constant<T>> {
    private final ConcurrentMap<String, T> constants = PlatformDependent.newConcurrentHashMap();
    private final AtomicInteger nextId = new AtomicInteger(1);

    private static String checkNotNullAndNotEmpty(String str) {
        ObjectUtil.checkNotNull(str, "name");
        if (str.isEmpty()) {
            throw new IllegalArgumentException("empty name");
        }
        return str;
    }

    private T createOrThrow(String str) {
        if (this.constants.get(str) == null) {
            T t = (T) newConstant(nextId(), str);
            if (this.constants.putIfAbsent(str, t) == null) {
                return t;
            }
        }
        throw new IllegalArgumentException(String.format("'%s' is already in use", str));
    }

    private T getOrCreate(String str) {
        T t = this.constants.get(str);
        if (t != null) {
            return t;
        }
        T t2 = (T) newConstant(nextId(), str);
        T tPutIfAbsent = this.constants.putIfAbsent(str, t2);
        return tPutIfAbsent == null ? t2 : tPutIfAbsent;
    }

    public boolean exists(String str) {
        checkNotNullAndNotEmpty(str);
        return this.constants.containsKey(str);
    }

    public abstract T newConstant(int i, String str);

    public T newInstance(String str) {
        checkNotNullAndNotEmpty(str);
        return (T) createOrThrow(str);
    }

    @Deprecated
    public final int nextId() {
        return this.nextId.getAndIncrement();
    }

    public T valueOf(Class<?> cls, String str) {
        return (T) valueOf(((Class) ObjectUtil.checkNotNull(cls, "firstNameComponent")).getName() + '#' + ((String) ObjectUtil.checkNotNull(str, "secondNameComponent")));
    }

    public T valueOf(String str) {
        checkNotNullAndNotEmpty(str);
        return (T) getOrCreate(str);
    }
}
