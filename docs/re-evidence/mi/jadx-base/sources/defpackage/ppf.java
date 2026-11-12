package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.facebook.react.bridge.MemoryPressureListener;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class ppf implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<MemoryPressureListener> f30615a = Collections.synchronizedSet(new LinkedHashSet());

    public ppf(Context context) {
        context.getApplicationContext().registerComponentCallbacks(this);
    }

    public void a(MemoryPressureListener memoryPressureListener) {
        this.f30615a.add(memoryPressureListener);
    }

    public void b(Context context) {
        context.getApplicationContext().unregisterComponentCallbacks(this);
    }

    public final void c(int i) {
        Set<MemoryPressureListener> set = this.f30615a;
        for (MemoryPressureListener memoryPressureListener : (MemoryPressureListener[]) set.toArray(new MemoryPressureListener[set.size()])) {
            memoryPressureListener.handleMemoryPressure(i);
        }
    }

    public void d(MemoryPressureListener memoryPressureListener) {
        this.f30615a.remove(memoryPressureListener);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        c(i);
    }
}
