package org.junit.runners.model;

import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;
import org.junit.runners.model.FrameworkMember;

/* JADX INFO: loaded from: classes23.dex */
public abstract class FrameworkMember<T extends FrameworkMember<T>> implements Annotatable {
    public boolean a(List<T> list) {
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            if (isShadowedBy(it2.next())) {
                return true;
            }
        }
        return false;
    }

    public abstract Class<?> getDeclaringClass();

    public abstract int getModifiers();

    public abstract String getName();

    public abstract Class<?> getType();

    public boolean isPublic() {
        return Modifier.isPublic(getModifiers());
    }

    public abstract boolean isShadowedBy(T t);

    public boolean isStatic() {
        return Modifier.isStatic(getModifiers());
    }
}
