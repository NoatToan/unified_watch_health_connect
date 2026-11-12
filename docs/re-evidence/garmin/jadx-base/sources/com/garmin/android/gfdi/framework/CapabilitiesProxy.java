package com.garmin.android.gfdi.framework;

import com.garmin.device.datatypes.DeviceProfile;
import java.util.HashMap;
import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes8.dex */
public abstract class CapabilitiesProxy {
    protected final int mConnectionType;
    protected final String mMacAddress;
    private final HashMap<Class<?>, Object> mCapabilities = new HashMap<>();
    protected final byte[] lock = new byte[0];
    protected final Logger mLogger = LoggerFactory.getLogger(getTag());

    public CapabilitiesProxy(String str, int i14) {
        this.mMacAddress = str;
        this.mConnectionType = i14;
    }

    public <T> T childGetCapability(Class<T> cls) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T getCapability(Class<T> cls) {
        synchronized (this.lock) {
            try {
                T t7 = (T) this.mCapabilities.get(cls);
                if (t7 == null) {
                    t7 = (T) childGetCapability(cls);
                }
                if (t7 == null && cls.isInstance(this)) {
                    return this;
                }
                if (t7 == null) {
                    Iterator<Object> it = this.mCapabilities.values().iterator();
                    while (it.hasNext()) {
                        T t14 = (T) it.next();
                        if (cls.isInstance(t14)) {
                            return t14;
                        }
                    }
                }
                return t7;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final int getConnectionType() {
        return this.mConnectionType;
    }

    public final String getMacAddress() {
        return this.mMacAddress;
    }

    public abstract DeviceProfile getProfile();

    public abstract String getTag();

    public final <T> void setGenericCapability(Class<T> cls, T t7) {
        synchronized (this.lock) {
            this.mCapabilities.put(cls, t7);
        }
    }
}
