package com.garmin.android.gfdi;

import android.text.TextUtils;
import da2.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import oa2.d;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ss2.w;

/* JADX INFO: loaded from: classes8.dex */
public class AuthRegistry {
    private static AuthRegistry self;
    private final ConcurrentHashMap<String, a> authDictionary = new ConcurrentHashMap<>();
    private final Object passkeyLock = new byte[0];
    private final HashMap<String, byte[]> outOfBandPasskeys = new HashMap<>();
    private final HashMap<String, w> passkeyHandlers = new HashMap<>();
    private final CopyOnWriteArraySet<Callback> appCallbacks = new CopyOnWriteArraySet<>();
    private final Logger mLogger = LoggerFactory.getLogger(getTag());

    public interface Callback {
        void onDeviceAuthenticated(String str, byte[] bArr, byte[] bArr2, byte[] bArr3);

        void onPasskeyRequired(String str, int i14);
    }

    private AuthRegistry() {
    }

    public static AuthRegistry getInstance() {
        if (self == null) {
            self = new AuthRegistry();
        }
        return self;
    }

    private String getTag() {
        return d.a(this, "AuthRegistry");
    }

    public void addCallback(Callback callback) {
        this.appCallbacks.add(callback);
    }

    public void awaitPasskey(String str, w wVar, Integer num) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.passkeyLock) {
            try {
                byte[] bArrRemove = this.outOfBandPasskeys.remove(str);
                if (bArrRemove != null) {
                    wVar.a(bArrRemove);
                    return;
                }
                this.passkeyHandlers.put(str, wVar);
                if (num != null) {
                    Iterator<Callback> it = this.appCallbacks.iterator();
                    while (it.hasNext()) {
                        try {
                            it.next().onPasskeyRequired(str, num.intValue());
                        } catch (Exception e4) {
                            this.mLogger.error("Failed to onPasskeyRequired", (Throwable) e4);
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void clear() {
        this.authDictionary.clear();
        synchronized (this.passkeyLock) {
            this.outOfBandPasskeys.clear();
            this.passkeyHandlers.clear();
        }
    }

    public a getAuthInfo(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.authDictionary.get(str);
    }

    public byte[] getEncryptedDiversifier(String str) {
        a authInfo = getAuthInfo(str);
        if (authInfo != null) {
            return authInfo.f58872c;
        }
        return null;
    }

    public byte[] getLongTermKey(String str) {
        a authInfo = getAuthInfo(str);
        if (authInfo != null) {
            return authInfo.f58871b;
        }
        return null;
    }

    public byte[] getRandomNumber(String str) {
        a authInfo = getAuthInfo(str);
        if (authInfo != null) {
            return authInfo.f58873d;
        }
        return null;
    }

    public void registerAuthInfo(String str, a aVar) {
        if (TextUtils.isEmpty(str) || aVar == null) {
            return;
        }
        this.authDictionary.put(str, aVar);
        this.mLogger.debug("Registered auth info: " + aVar.getClass().getSimpleName() + " (hashCode=" + aVar.hashCode() + ", macAddress=" + str + StringUtils.SPACE + aVar + ")");
    }

    public void removeCallback(Callback callback) {
        this.appCallbacks.remove(callback);
    }

    public void setOutOfBandPasskey(String str, byte[] bArr) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.passkeyLock) {
            try {
                if (bArr != null) {
                    w wVarRemove = this.passkeyHandlers.remove(str);
                    if (wVarRemove != null) {
                        wVarRemove.a(bArr);
                    } else {
                        this.outOfBandPasskeys.put(str, bArr);
                    }
                } else if (this.outOfBandPasskeys.remove(str) != null) {
                    this.mLogger.debug("OOB passkey for {} has been removed.", str);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public boolean setPasskey(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        synchronized (this.passkeyLock) {
            try {
                w wVarRemove = this.passkeyHandlers.remove(str);
                if (wVarRemove == null) {
                    return false;
                }
                wVarRemove.b(str2);
                return true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void unregisterAuthInfo(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.authDictionary.remove(str);
    }

    public void registerAuthInfo(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (TextUtils.isEmpty(str) || bArr == null || bArr2 == null || bArr3 == null) {
            return;
        }
        registerAuthInfo(str, new a(str, bArr, bArr2, bArr3, true));
        Iterator<Callback> it = this.appCallbacks.iterator();
        while (it.hasNext()) {
            try {
                it.next().onDeviceAuthenticated(str, bArr2, bArr3, bArr);
            } catch (Exception e4) {
                this.mLogger.error("Failed to onDeviceAuthenticated", (Throwable) e4);
            }
        }
    }
}
