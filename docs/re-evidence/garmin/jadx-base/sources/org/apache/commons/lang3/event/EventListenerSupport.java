package org.apache.commons.lang3.event;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.apache.commons.lang3.Validate;

/* JADX INFO: loaded from: classes3.dex */
public class EventListenerSupport<L> implements Serializable {
    private static final long serialVersionUID = 3593265990380473632L;
    private List<L> listeners;
    private transient L[] prototypeArray;
    private transient L proxy;

    public class ProxyInvocationHandler implements InvocationHandler {
        public ProxyInvocationHandler() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
            Iterator it = EventListenerSupport.this.listeners.iterator();
            while (it.hasNext()) {
                method.invoke(it.next(), objArr);
            }
            return null;
        }
    }

    public EventListenerSupport(Class<L> cls, ClassLoader classLoader) {
        this();
        Validate.notNull(cls, "listenerInterface", new Object[0]);
        Validate.notNull(classLoader, "classLoader", new Object[0]);
        Validate.isTrue(cls.isInterface(), "Class %s is not an interface", cls.getName());
        initializeTransientFields(cls, classLoader);
    }

    public static <T> EventListenerSupport<T> create(Class<T> cls) {
        return new EventListenerSupport<>(cls);
    }

    private void createProxy(Class<L> cls, ClassLoader classLoader) {
        this.proxy = cls.cast(Proxy.newProxyInstance(classLoader, new Class[]{cls}, createInvocationHandler()));
    }

    private void initializeTransientFields(Class<L> cls, ClassLoader classLoader) {
        this.prototypeArray = (L[]) ((Object[]) Array.newInstance((Class<?>) cls, 0));
        createProxy(cls, classLoader);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        Object[] objArr = (Object[]) objectInputStream.readObject();
        this.listeners = new CopyOnWriteArrayList(objArr);
        initializeTransientFields(objArr.getClass().getComponentType(), Thread.currentThread().getContextClassLoader());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new ByteArrayOutputStream());
        for (L l14 : this.listeners) {
            try {
                objectOutputStream2.writeObject(l14);
                arrayList.add(l14);
            } catch (IOException unused) {
                objectOutputStream2 = new ObjectOutputStream(new ByteArrayOutputStream());
            }
        }
        objectOutputStream.writeObject(arrayList.toArray(this.prototypeArray));
    }

    public void addListener(L l14, boolean z14) {
        Validate.notNull(l14, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, new Object[0]);
        if (z14 || !this.listeners.contains(l14)) {
            this.listeners.add(l14);
        }
    }

    public InvocationHandler createInvocationHandler() {
        return new ProxyInvocationHandler();
    }

    public L fire() {
        return this.proxy;
    }

    public int getListenerCount() {
        return this.listeners.size();
    }

    public L[] getListeners() {
        return (L[]) this.listeners.toArray(this.prototypeArray);
    }

    public void removeListener(L l14) {
        Validate.notNull(l14, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, new Object[0]);
        this.listeners.remove(l14);
    }

    public void addListener(L l14) {
        addListener(l14, true);
    }

    public EventListenerSupport(Class<L> cls) {
        this(cls, Thread.currentThread().getContextClassLoader());
    }

    private EventListenerSupport() {
        this.listeners = new CopyOnWriteArrayList();
    }
}
