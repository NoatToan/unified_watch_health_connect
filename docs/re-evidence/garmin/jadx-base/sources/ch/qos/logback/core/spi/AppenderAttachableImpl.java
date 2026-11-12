package ch.qos.logback.core.spi;

import ch.qos.logback.core.Appender;
import ch.qos.logback.core.util.COWArrayList;
import java.util.Iterator;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public class AppenderAttachableImpl<E> implements AppenderAttachable<E> {
    static final long START = System.currentTimeMillis();
    private final COWArrayList<Appender<E>> appenderList = new COWArrayList<>(new Appender[0]);

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public void addAppender(Appender<E> appender) {
        if (appender != null) {
            this.appenderList.addIfAbsent(appender);
        } else {
            h.s("Null argument disallowed");
        }
    }

    public int appendLoopOnAppenders(E e4) {
        int i14 = 0;
        for (Appender<E> appender : this.appenderList.asTypedArray()) {
            appender.doAppend(e4);
            i14++;
        }
        return i14;
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public void detachAndStopAllAppenders() {
        Iterator<Appender<E>> it = this.appenderList.iterator();
        while (it.hasNext()) {
            it.next().stop();
        }
        this.appenderList.clear();
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public boolean detachAppender(String str) {
        if (str == null) {
            return false;
        }
        for (Appender<E> appender : this.appenderList) {
            if (str.equals(appender.getName())) {
                return this.appenderList.remove(appender);
            }
        }
        return false;
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public Appender<E> getAppender(String str) {
        if (str == null) {
            return null;
        }
        for (Appender<E> appender : this.appenderList) {
            if (str.equals(appender.getName())) {
                return appender;
            }
        }
        return null;
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public boolean isAttached(Appender<E> appender) {
        if (appender == null) {
            return false;
        }
        Iterator<Appender<E>> it = this.appenderList.iterator();
        while (it.hasNext()) {
            if (it.next() == appender) {
                return true;
            }
        }
        return false;
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public Iterator<Appender<E>> iteratorForAppenders() {
        return this.appenderList.iterator();
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public boolean detachAppender(Appender<E> appender) {
        if (appender == null) {
            return false;
        }
        return this.appenderList.remove(appender);
    }
}
