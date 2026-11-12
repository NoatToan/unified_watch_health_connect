package com.google.android.datatransport.runtime.dagger.internal;

import com.google.firebase.messaging.l;
import j20.x;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
public final class Preconditions {
    private Preconditions() {
    }

    public static <T> void checkBuilderRequirement(T t7, Class<T> cls) {
        if (t7 != null) {
            return;
        }
        l.i(cls.getCanonicalName(), " must be set");
    }

    public static <T> T checkNotNull(T t7, String str, Object obj) {
        if (t7 != null) {
            return t7;
        }
        if (!str.contains("%s")) {
            h.s("errorMessageTemplate has no format specifiers");
            return null;
        }
        if (str.indexOf("%s") == str.lastIndexOf("%s")) {
            x.l(str.replace("%s", obj instanceof Class ? ((Class) obj).getCanonicalName() : String.valueOf(obj)));
            return null;
        }
        h.s("errorMessageTemplate has more than one format specifier");
        return null;
    }

    public static <T> T checkNotNullFromComponent(T t7) {
        if (t7 != null) {
            return t7;
        }
        x.l("Cannot return null from a non-@Nullable component method");
        return null;
    }

    public static <T> T checkNotNullFromProvides(T t7) {
        if (t7 != null) {
            return t7;
        }
        x.l("Cannot return null from a non-@Nullable @Provides method");
        return null;
    }

    public static <T> T checkNotNull(T t7, String str) {
        if (t7 != null) {
            return t7;
        }
        x.l(str);
        return null;
    }

    public static <T> T checkNotNull(T t7) {
        t7.getClass();
        return t7;
    }
}
