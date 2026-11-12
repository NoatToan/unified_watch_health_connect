package cn.hutool.core.lang;

import cn.hutool.core.lang.EnumItem;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public interface EnumItem<E extends EnumItem<E>> extends Serializable {
    default E fromInt(Integer num) {
        if (num == null) {
            return null;
        }
        for (EnumItem enumItem : items()) {
            E e = (E) enumItem;
            if (e.intVal() == num.intValue()) {
                return e;
            }
        }
        return null;
    }

    default E fromStr(String str) {
        if (str == null) {
            return null;
        }
        for (EnumItem enumItem : items()) {
            E e = (E) enumItem;
            if (str.equalsIgnoreCase(e.name())) {
                return e;
            }
        }
        return null;
    }

    int intVal();

    default E[] items() {
        return (E[]) ((EnumItem[]) getClass().getEnumConstants());
    }

    String name();

    default String text() {
        return name();
    }
}
