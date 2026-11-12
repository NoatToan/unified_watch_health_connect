package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;
import org.eclipse.californium.elements.config.Configuration;
import org.eclipse.californium.elements.config.DocumentedDefinition;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class zyn {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f54780c = aaex.a((Class<?>) zyn.class);

    public static <E extends Enum<?>> Class<E> a(E[] eArr) {
        if (eArr == null) {
            throw new NullPointerException("Enums must not be null!");
        }
        if (eArr.length == 0) {
            throw new IllegalArgumentException("Enums must not be empty!");
        }
        return (Class<E>) eArr[0].getClass();
    }

    public static String e(List<String> list, boolean z) {
        if (list == null) {
            throw new NullPointerException("List must not be null!");
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('[');
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(", ");
        }
        sb.setLength(sb.length() - 2);
        if (z) {
            sb.append(']');
        }
        return sb.toString();
    }

    public static <E extends Enum<?>> String c(List<E> list, boolean z) {
        if (list == null) {
            throw new NullPointerException("List must not be null!");
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('[');
        }
        Iterator<E> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next().name());
            sb.append(", ");
        }
        sb.setLength(sb.length() - 2);
        if (z) {
            sb.append(']');
        }
        return sb.toString();
    }

    public static <E extends Enum<?>> E d(String str, List<E> list) {
        if (str == null) {
            throw new NullPointerException("Text must not be null!");
        }
        if (list == null) {
            throw new NullPointerException("values must not be null!");
        }
        for (E e : list) {
            if (e.name().equals(str)) {
                return e;
            }
        }
        return null;
    }

    public static void e(Class<?> cls, Configuration configuration) {
        for (Field field : cls.getDeclaredFields()) {
            int modifiers = field.getModifiers();
            if (Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers)) {
                try {
                    Object obj = field.get(null);
                    if (obj instanceof DocumentedDefinition) {
                        DocumentedDefinition documentedDefinition = (DocumentedDefinition) obj;
                        if (!configuration.e(documentedDefinition)) {
                            f54780c.warn("Missing definition {} in {}.", documentedDefinition.getKey(), cls.getSimpleName());
                        }
                    }
                } catch (IllegalAccessException | IllegalArgumentException unused) {
                }
            }
        }
    }
}
