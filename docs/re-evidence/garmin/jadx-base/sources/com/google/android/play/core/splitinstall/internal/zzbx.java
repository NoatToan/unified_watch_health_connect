package com.google.android.play.core.splitinstall.internal;

import androidx.core.view.j;
import com.google.maps.android.BuildConfig;
import i3.e5;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;
import v.e0;

/* JADX INFO: loaded from: classes14.dex */
public final class zzbx extends RuntimeException {
    private zzbx(Exception exc) {
        super("TunnelExceptions should always be unwrapped to deal with the checked exception underneath, this message should never be seen if TunnelException is used properly.", exc);
    }

    public static Object zzc(Callable callable) {
        callable.getClass();
        try {
            return callable.call();
        } catch (RuntimeException e4) {
            throw e4;
        } catch (Exception e14) {
            throw new zzbx(e14);
        }
    }

    @Override // java.lang.Throwable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized Exception getCause() {
        Throwable cause;
        cause = super.getCause();
        cause.getClass();
        return (Exception) cause;
    }

    public final Exception zzb(Class cls) {
        int iIndexOf;
        String strG;
        Class[] clsArr = {cls};
        int i14 = 0;
        for (int i15 = 0; i15 <= 0; i15++) {
            Class cls2 = clsArr[i15];
            if (RuntimeException.class.isAssignableFrom(cls2)) {
                Object[] objArr = new Object[2];
                objArr[0] = "getCause";
                objArr[1] = cls2;
                for (int i16 = 0; i16 < 2; i16++) {
                    Object obj = objArr[i16];
                    if (obj == null) {
                        strG = BuildConfig.TRAVIS;
                    } else {
                        try {
                            strG = obj.toString();
                        } catch (Exception e4) {
                            String strG2 = e5.g(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strG2), (Throwable) e4);
                            strG = e0.g("<", strG2, " threw ", e4.getClass().getName(), ">");
                        }
                    }
                    objArr[i16] = strG;
                }
                StringBuilder sb3 = new StringBuilder(118);
                int i17 = 0;
                while (i14 < 2 && (iIndexOf = "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s".indexOf("%s", i17)) != -1) {
                    sb3.append((CharSequence) "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s", i17, iIndexOf);
                    sb3.append(objArr[i14]);
                    i17 = iIndexOf + 2;
                    i14++;
                }
                sb3.append((CharSequence) "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s", i17, 86);
                if (i14 < 2) {
                    sb3.append(" [");
                    sb3.append(objArr[i14]);
                    for (int i18 = i14 + 1; i18 < 2; i18++) {
                        sb3.append(", ");
                        sb3.append(objArr[i18]);
                    }
                    sb3.append(']');
                }
                throw new IllegalArgumentException(sb3.toString());
            }
        }
        if (cls.isInstance(getCause())) {
            return (Exception) cls.cast(getCause());
        }
        Exception cause = getCause();
        ClassCastException classCastException = new ClassCastException(j.i(cls, "getCause(", ") doesn't match underlying exception"));
        classCastException.initCause(cause);
        throw classCastException;
    }
}
