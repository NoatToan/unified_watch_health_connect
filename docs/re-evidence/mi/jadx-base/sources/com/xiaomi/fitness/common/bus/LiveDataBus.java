package com.xiaomi.fitness.common.bus;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00112\u00020\u0001:\u0004\u000e\u000f\u0010\u0011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u00020\u00062\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u0002H\n\u0018\u00010\rJ\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u000b\u001a\u00020\u0006R \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/common/bus/LiveDataBus;", "", "<init>", "()V", "bus", "", "", "Lcom/xiaomi/fitness/common/bus/LiveDataBus$BusMutableLiveData;", "with", "Landroidx/lifecycle/MutableLiveData;", "T", "key", "type", "Ljava/lang/Class;", "SingletonHolder", "ObserverWrapper", "BusMutableLiveData", "Companion", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class LiveDataBus {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Map<String, BusMutableLiveData<Object>> bus;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0007H\u0016J\u0018\u0010\r\u001a\u00020\t2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0007H\u0016J\u0018\u0010\u000e\u001a\u00020\t2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0007H\u0016J\u0018\u0010\u000f\u001a\u00020\t2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0007H\u0002R\"\u0010\u0005\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/common/bus/LiveDataBus$BusMutableLiveData;", "T", "Landroidx/lifecycle/MutableLiveData;", "<init>", "()V", "observerMap", "", "Landroidx/lifecycle/Observer;", "observe", "", CardInfo.KEY_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "observer", "observeForever", "removeObserver", "hook", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BusMutableLiveData<T> extends MutableLiveData<T> {

        @NotNull
        private final Map<Observer<?>, Observer<?>> observerMap = new HashMap();

        private final void hook(Observer<? super T> observer) throws Exception {
            Field declaredField = LiveData.class.getDeclaredField("mObservers");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Method declaredMethod = obj.getClass().getDeclaredMethod("get", Object.class);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(obj, observer);
            Object value = objInvoke instanceof Map.Entry ? ((Map.Entry) objInvoke).getValue() : null;
            if (value == null) {
                throw new NullPointerException("Wrapper can not be bull!");
            }
            Class<? super Object> superclass = value.getClass().getSuperclass();
            Intrinsics.checkNotNullExpressionValue(superclass, "getSuperclass(...)");
            Field declaredField2 = superclass.getDeclaredField("mLastVersion");
            declaredField2.setAccessible(true);
            Field declaredField3 = LiveData.class.getDeclaredField("mVersion");
            declaredField3.setAccessible(true);
            declaredField2.set(value, declaredField3.get(this));
        }

        @Override // androidx.lifecycle.LiveData
        public void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super T> observer) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(observer, "observer");
            super.observe(owner, observer);
            try {
                hook(observer);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // androidx.lifecycle.LiveData
        public void observeForever(@NotNull Observer<? super T> observer) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            if (!this.observerMap.containsKey(observer)) {
                this.observerMap.put(observer, new ObserverWrapper(observer));
            }
            Object obj = this.observerMap.get(observer);
            Intrinsics.checkNotNull(obj);
            super.observeForever((Observer) obj);
        }

        @Override // androidx.lifecycle.LiveData
        public void removeObserver(@NotNull Observer<? super T> observer) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            if (this.observerMap.containsKey(observer)) {
                Object objRemove = this.observerMap.remove(observer);
                Intrinsics.checkNotNull(objRemove);
                observer = (Observer) objRemove;
            }
            Intrinsics.checkNotNull(observer, "null cannot be cast to non-null type androidx.lifecycle.Observer<in T of com.xiaomi.fitness.common.bus.LiveDataBus.BusMutableLiveData>");
            super.removeObserver(observer);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/common/bus/LiveDataBus$Companion;", "", "<init>", "()V", "get", "Lcom/xiaomi/fitness/common/bus/LiveDataBus;", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LiveDataBus get() {
            return SingletonHolder.INSTANCE.getDEFAULT_BUS();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0002B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\tR\u0018\u0010\u0003\u001a\f\u0012\u0006\b\u0000\u0012\u00028\u0000\u0018\u00010\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/common/bus/LiveDataBus$ObserverWrapper;", "T", "Landroidx/lifecycle/Observer;", "observer", "<init>", "(Landroidx/lifecycle/Observer;)V", "onChanged", "", DeviceTagInterface.CUSTOM_TAG_TYPE, "(Ljava/lang/Object;)V", "isCallOnObserve", "", "()Z", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ObserverWrapper<T> implements Observer<T> {

        @Nullable
        private final Observer<? super T> observer;

        public ObserverWrapper(@NotNull Observer<? super T> observer) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            this.observer = observer;
        }

        private final boolean isCallOnObserve() {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            if (stackTrace == null || stackTrace.length <= 0) {
                return false;
            }
            Iterator it = ArrayIteratorKt.iterator(stackTrace);
            while (it.hasNext()) {
                StackTraceElement stackTraceElement = (StackTraceElement) it.next();
                if (Intrinsics.areEqual("android.arch.lifecycle.LiveData", stackTraceElement.getClassName()) && Intrinsics.areEqual("observeForever", stackTraceElement.getMethodName())) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(@Nullable T t) {
            if (this.observer == null || isCallOnObserve() || t == null) {
                return;
            }
            this.observer.onChanged(t);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/common/bus/LiveDataBus$SingletonHolder;", "", "<init>", "()V", "DEFAULT_BUS", "Lcom/xiaomi/fitness/common/bus/LiveDataBus;", "getDEFAULT_BUS", "()Lcom/xiaomi/fitness/common/bus/LiveDataBus;", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SingletonHolder {

        @NotNull
        public static final SingletonHolder INSTANCE = new SingletonHolder();

        @NotNull
        private static final LiveDataBus DEFAULT_BUS = new LiveDataBus(null);

        private SingletonHolder() {
        }

        @NotNull
        public final LiveDataBus getDEFAULT_BUS() {
            return DEFAULT_BUS;
        }
    }

    public /* synthetic */ LiveDataBus(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final <T> MutableLiveData<T> with(@NotNull String key, @Nullable Class<T> type) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.bus.containsKey(key)) {
            this.bus.put(key, new BusMutableLiveData<>());
        }
        BusMutableLiveData<Object> busMutableLiveData = this.bus.get(key);
        Intrinsics.checkNotNull(busMutableLiveData, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<T of com.xiaomi.fitness.common.bus.LiveDataBus.with>");
        return busMutableLiveData;
    }

    private LiveDataBus() {
        this.bus = new HashMap();
    }

    @NotNull
    public final MutableLiveData<Object> with(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return with(key, Object.class);
    }
}
