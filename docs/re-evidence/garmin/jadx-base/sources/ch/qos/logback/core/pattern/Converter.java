package ch.qos.logback.core.pattern;

import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Converter<E> {
    Converter<E> next;

    public abstract String convert(E e4);

    public final Converter<E> getNext() {
        return this.next;
    }

    public final void setNext(Converter<E> converter) {
        if (this.next == null) {
            this.next = converter;
        } else {
            h.z("Next converter has been already set");
        }
    }

    public void write(StringBuilder sb3, E e4) {
        sb3.append(convert(e4));
    }
}
