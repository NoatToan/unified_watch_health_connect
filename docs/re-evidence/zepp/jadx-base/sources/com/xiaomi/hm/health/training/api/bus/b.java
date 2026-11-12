package com.xiaomi.hm.health.training.api.bus;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
class b {
    private final Map<String, a<Object>> a;

    public static class a<T> extends MutableLiveData<T> {
        private Map<Observer<? super T>, Observer<? super T>> a;

        private a() {
            this.a = new HashMap();
        }

        private void a(@NonNull Observer<? super T> observer) throws Exception {
            Field declaredField = LiveData.class.getDeclaredField("mObservers");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Method declaredMethod = obj.getClass().getDeclaredMethod("get", Object.class);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(obj, observer);
            Object value = objInvoke instanceof Map.Entry ? ((Map.Entry) objInvoke).getValue() : null;
            Objects.requireNonNull(value, "Wrapper can not be bull!");
            Field declaredField2 = value.getClass().getSuperclass().getDeclaredField("mLastVersion");
            declaredField2.setAccessible(true);
            Field declaredField3 = LiveData.class.getDeclaredField("mVersion");
            declaredField3.setAccessible(true);
            declaredField2.set(value, declaredField3.get(this));
        }

        @Override // androidx.p008lifecycle.LiveData
        public void observe(@NonNull LifecycleOwner lifecycleOwner, @NonNull Observer<? super T> observer) {
            super.observe(lifecycleOwner, observer);
            try {
                a(observer);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // androidx.p008lifecycle.LiveData
        public void observeForever(@NonNull Observer<? super T> observer) {
            if (!this.a.containsKey(observer)) {
                this.a.put(observer, new c(observer));
            }
            super.observeForever(this.a.get(observer));
        }

        @Override // androidx.p008lifecycle.LiveData
        public void removeObserver(@NonNull Observer<? super T> observer) {
            if (this.a.containsKey(observer)) {
                observer = this.a.remove(observer);
            }
            super.removeObserver(observer);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.hm.health.training.api.bus.b$b, reason: collision with other inner class name */
    public static class C1019b<T> {
    }

    public static class c<T> implements Observer<T> {
        private Observer<T> a;

        public c(Observer<T> observer) {
            this.a = observer;
        }

        private boolean a() {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            if (stackTrace.length > 0) {
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if ("android.arch.lifecycle.LiveData".equals(stackTraceElement.getClassName()) && "observeForever".equals(stackTraceElement.getMethodName())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // androidx.p008lifecycle.Observer
        public void onChanged(@Nullable T t) {
            if (this.a == null || a()) {
                return;
            }
            this.a.onChanged(t);
        }
    }

    public static class d {
        private static final b a = new b();

        private d() {
        }
    }

    private b() {
        this.a = new HashMap();
    }

    public static b a() {
        return d.a;
    }

    public MutableLiveData<Object> b(String str) {
        return c(str, new C1019b());
    }

    public <T> MutableLiveData<T> c(String str, C1019b<T> c1019b) {
        if (!this.a.containsKey(str)) {
            this.a.put(str, new a<>());
        }
        return this.a.get(str);
    }
}
