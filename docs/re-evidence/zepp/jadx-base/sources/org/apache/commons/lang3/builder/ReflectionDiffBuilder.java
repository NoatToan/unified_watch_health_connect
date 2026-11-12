package org.apache.commons.lang3.builder;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import org.apache.commons.lang3.reflect.FieldUtils;

/* JADX INFO: loaded from: classes23.dex */
public class ReflectionDiffBuilder implements Builder<DiffResult> {
    private final Object a;
    private final Object b;
    private final DiffBuilder c;

    public <T> ReflectionDiffBuilder(T t, T t2, ToStringStyle toStringStyle) {
        this.a = t;
        this.b = t2;
        this.c = new DiffBuilder(t, t2, toStringStyle);
    }

    private boolean a(Field field) {
        if (field.getName().indexOf(36) == -1 && !Modifier.isTransient(field.getModifiers())) {
            return !Modifier.isStatic(field.getModifiers());
        }
        return false;
    }

    private void b(Class<?> cls) {
        for (Field field : FieldUtils.getAllFields(cls)) {
            if (a(field)) {
                try {
                    this.c.append(field.getName(), FieldUtils.readField(field, this.a, true), FieldUtils.readField(field, this.b, true));
                } catch (IllegalAccessException e) {
                    throw new InternalError("Unexpected IllegalAccessException: " + e.getMessage());
                }
            }
        }
    }

    @Override // org.apache.commons.lang3.builder.Builder
    public DiffResult build() {
        if (this.a.equals(this.b)) {
            return this.c.build();
        }
        b(this.a.getClass());
        return this.c.build();
    }
}
