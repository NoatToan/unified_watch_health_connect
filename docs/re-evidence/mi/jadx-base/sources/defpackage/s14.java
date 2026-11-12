package defpackage;

import cn.hutool.core.clone.CloneRuntimeException;

/* JADX INFO: loaded from: classes.dex */
public class s14<T> implements Cloneable {
    public T clone() {
        try {
            return (T) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new CloneRuntimeException(e);
        }
    }
}
