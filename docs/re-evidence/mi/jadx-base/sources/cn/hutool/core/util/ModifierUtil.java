package cn.hutool.core.util;

import defpackage.qj1;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class ModifierUtil {

    public enum ModifierType {
        PUBLIC(1),
        PRIVATE(2),
        PROTECTED(4),
        STATIC(8),
        FINAL(16),
        SYNCHRONIZED(32),
        VOLATILE(64),
        TRANSIENT(128),
        NATIVE(256),
        ABSTRACT(1024),
        STRICT(2048);

        private final int value;

        ModifierType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public static boolean a(Field field, ModifierType... modifierTypeArr) {
        return (field == null || qj1.D(modifierTypeArr) || (field.getModifiers() & f(modifierTypeArr)) == 0) ? false : true;
    }

    public static boolean b(Method method, ModifierType... modifierTypeArr) {
        return (method == null || qj1.D(modifierTypeArr) || (method.getModifiers() & f(modifierTypeArr)) == 0) ? false : true;
    }

    public static boolean c(Field field) {
        return a(field, ModifierType.PUBLIC);
    }

    public static boolean d(Field field) {
        return a(field, ModifierType.STATIC);
    }

    public static boolean e(Method method) {
        return b(method, ModifierType.STATIC);
    }

    public static int f(ModifierType... modifierTypeArr) {
        int value = modifierTypeArr[0].getValue();
        for (int i = 1; i < modifierTypeArr.length; i++) {
            value |= modifierTypeArr[i].getValue();
        }
        return value;
    }
}
