package com.mapbox.common.location;

import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0016J\u0016\u0010\u000e\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016R \u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/mapbox/common/location/BaseLocationProvider;", "Lcom/mapbox/common/location/LocationProvider;", "()V", "observers", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/mapbox/common/location/LocationObserver;", "Landroid/os/Handler;", "getObservers", "()Ljava/util/concurrent/ConcurrentHashMap;", "addLocationObserver", "", "observer", "looper", "Landroid/os/Looper;", "notifyLocationUpdate", "locations", "", "Lcom/mapbox/common/location/Location;", "removeLocationObserver", "Companion", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class BaseLocationProvider implements LocationProvider {
    protected static final Companion Companion = new Companion(null);
    protected static final Handler EMPTY_HANDLER = new Handler(Looper.getMainLooper());
    private final ConcurrentHashMap<LocationObserver, Handler> observers = new ConcurrentHashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyLocationUpdate$lambda$1$lambda$0(LocationObserver locationObserver, List list) {
        locationObserver.getClass();
        list.getClass();
        locationObserver.onLocationUpdateReceived(list);
    }

    @Override // com.mapbox.common.location.LocationProvider
    public void addLocationObserver(LocationObserver observer) {
        observer.getClass();
        ConcurrentHashMap<LocationObserver, Handler> concurrentHashMap = this.observers;
        Looper looperMyLooper = Looper.myLooper();
        concurrentHashMap.put(observer, looperMyLooper != null ? new Handler(looperMyLooper) : EMPTY_HANDLER);
    }

    public final ConcurrentHashMap<LocationObserver, Handler> getObservers() {
        return this.observers;
    }

    public void notifyLocationUpdate(List<? extends Location> locations) {
        locations.getClass();
        for (Map.Entry<LocationObserver, Handler> entry : this.observers.entrySet()) {
            LocationObserver key = entry.getKey();
            Handler value = entry.getValue();
            if (s.g(value, EMPTY_HANDLER) || s.g(value.getLooper(), Looper.myLooper())) {
                key.onLocationUpdateReceived(locations);
            } else {
                value.post(new d(3, key, locations));
            }
        }
    }

    @Override // com.mapbox.common.location.LocationProvider
    public void removeLocationObserver(LocationObserver observer) {
        observer.getClass();
        this.observers.remove(observer);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0084\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0004X\u0085\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/mapbox/common/location/BaseLocationProvider$Companion;", "", "()V", "EMPTY_HANDLER", "Landroid/os/Handler;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.mapbox.common.location.LocationProvider
    public void addLocationObserver(LocationObserver observer, Looper looper) {
        observer.getClass();
        looper.getClass();
        this.observers.put(observer, new Handler(looper));
    }
}
