package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
import vb.h;
import yc.l2;

/* JADX INFO: loaded from: classes14.dex */
public abstract class zzlz {
    public static zzlr zzb(Class cls) {
        String strH;
        ClassLoader classLoader = zzlz.class.getClassLoader();
        if (cls.equals(zzlr.class)) {
            strH = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!cls.getPackage().equals(zzlz.class.getPackage())) {
                h.s(cls.getName());
                return null;
            }
            strH = com.nimbusds.jose.shaded.gson.internal.a.h(cls.getPackage().getName(), ".BlazeGenerated", cls.getSimpleName(), "Loader");
        }
        try {
            try {
                try {
                    try {
                        return (zzlr) cls.cast(((zzlz) Class.forName(strH, true, classLoader).getConstructor(null).newInstance(null)).zza());
                    } catch (InvocationTargetException e4) {
                        throw new IllegalStateException(e4);
                    }
                } catch (NoSuchMethodException e14) {
                    throw new IllegalStateException(e14);
                }
            } catch (IllegalAccessException e15) {
                throw new IllegalStateException(e15);
            } catch (InstantiationException e16) {
                throw new IllegalStateException(e16);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(zzlz.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((zzlr) cls.cast(((zzlz) it.next()).zza()));
                } catch (ServiceConfigurationError e17) {
                    Logger.getLogger(zzlm.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), (Throwable) e17);
                }
            }
            if (arrayList.size() == 1) {
                return (zzlr) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (zzlr) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e18) {
                l2.p(e18);
                return null;
            } catch (NoSuchMethodException e19) {
                l2.p(e19);
                return null;
            } catch (InvocationTargetException e24) {
                l2.p(e24);
                return null;
            }
        }
    }

    public abstract zzlr zza();
}
