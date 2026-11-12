package com.huawei.hms.network.embedded;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;
import ohos.ace.plugin.taskmanagerplugin.EventType;

/* JADX INFO: loaded from: classes34.dex */
public class ja extends ma {
    public final Method e;
    public final Method f;
    public final Method g;
    public final Class<?> h;
    public final Class<?> i;

    @Override // com.huawei.hms.network.embedded.ma
    @Nullable
    public String b(SSLSocket sSLSocket) {
        try {
            a aVar = (a) Proxy.getInvocationHandler(this.f.invoke(null, sSLSocket));
            if (!aVar.f14956b && aVar.f14957c == null) {
                ma.f().a(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            }
            if (aVar.f14956b) {
                return null;
            }
            return aVar.f14957c;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        }
    }

    @Override // com.huawei.hms.network.embedded.ma
    public void a(SSLSocket sSLSocket, String str, List<r7> list) {
        try {
            this.e.invoke(null, sSLSocket, Proxy.newProxyInstance(ma.class.getClassLoader(), new Class[]{this.h, this.i}, new a(ma.a(list))));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to set ALPN", e);
        }
    }

    public static class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<String> f14955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f14956b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f14957c;

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = f8.f14777b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return true;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f14956b = true;
                return null;
            }
            if (name.equals("protocols") && objArr.length == 0) {
                return this.f14955a;
            }
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    List list = (List) obj2;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        String str = (String) list.get(i);
                        if (this.f14955a.contains(str)) {
                            this.f14957c = str;
                            return str;
                        }
                    }
                    String str2 = this.f14955a.get(0);
                    this.f14957c = str2;
                    return str2;
                }
            }
            if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                return method.invoke(this, objArr);
            }
            this.f14957c = (String) objArr[0];
            return null;
        }

        public a(List<String> list) {
            this.f14955a = list;
        }
    }

    @Override // com.huawei.hms.network.embedded.ma
    public void a(SSLSocket sSLSocket) {
        try {
            this.g.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to remove ALPN", e);
        }
    }

    public static ma i() {
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
            return new ja(cls.getMethod("put", SSLSocket.class, cls2), cls.getMethod("get", SSLSocket.class), cls.getMethod(EventType.REMOVE, SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    public ja(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.e = method;
        this.f = method2;
        this.g = method3;
        this.h = cls;
        this.i = cls2;
    }
}
