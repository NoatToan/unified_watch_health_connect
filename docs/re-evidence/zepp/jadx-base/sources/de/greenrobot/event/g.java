package de.greenrobot.event;

import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes22.dex */
class g {
    private static final String b = "onEvent";
    private static final int c = 64;
    private static final int d = 4096;
    private static final int e = 5192;
    private static final Map<String, List<f>> f = new HashMap();
    private final Map<Class<?>, Class<?>> a = new ConcurrentHashMap();

    public g(List<Class<?>> list) {
        if (list != null) {
            for (Class<?> cls : list) {
                this.a.put(cls, cls);
            }
        }
    }

    public static void a() {
        Map<String, List<f>> map = f;
        synchronized (map) {
            map.clear();
        }
    }

    public List<f> b(Class<?> cls) {
        List<f> list;
        ThreadMode threadMode;
        String name = cls.getName();
        Map<String, List<f>> map = f;
        synchronized (map) {
            list = map.get(name);
        }
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
            String name2 = superclass.getName();
            if (name2.startsWith("java.") || name2.startsWith("javax.") || name2.startsWith("android.")) {
                break;
            }
            for (Method method : superclass.getDeclaredMethods()) {
                String name3 = method.getName();
                if (name3.startsWith(b)) {
                    int modifiers = method.getModifiers();
                    if ((modifiers & 1) != 0 && (modifiers & e) == 0) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        if (parameterTypes.length == 1) {
                            String strSubstring = name3.substring(7);
                            if (strSubstring.length() == 0) {
                                threadMode = ThreadMode.PostThread;
                            } else if (strSubstring.equals("MainThread")) {
                                threadMode = ThreadMode.MainThread;
                            } else if (strSubstring.equals("BackgroundThread")) {
                                threadMode = ThreadMode.BackgroundThread;
                            } else if (strSubstring.equals("Async")) {
                                threadMode = ThreadMode.Async;
                            } else if (!this.a.containsKey(superclass)) {
                                throw new EventBusException("Illegal onEvent method, check for typos: " + method);
                            }
                            Class<?> cls2 = parameterTypes[0];
                            sb.setLength(0);
                            sb.append(name3);
                            sb.append(Typography.greater);
                            sb.append(cls2.getName());
                            if (hashSet.add(sb.toString())) {
                                arrayList.add(new f(method, threadMode, cls2));
                            }
                        } else {
                            continue;
                        }
                    } else if (!this.a.containsKey(superclass)) {
                        Log.d(EventBus.TAG, "Skipping method (not public, static or abstract): " + superclass + "." + name3);
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            Map<String, List<f>> map2 = f;
            synchronized (map2) {
                map2.put(name, arrayList);
            }
            return arrayList;
        }
        throw new EventBusException("Subscriber " + cls + " has no public methods called " + b);
    }
}
