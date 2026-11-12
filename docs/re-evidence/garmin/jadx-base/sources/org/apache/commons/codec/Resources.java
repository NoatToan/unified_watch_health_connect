package org.apache.commons.codec;

import fb1.c;
import java.io.InputStream;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class Resources {
    @Deprecated
    public Resources() {
    }

    public static InputStream getInputStream(String str) {
        InputStream resourceAsStream = Resources.class.getClassLoader().getResourceAsStream(str);
        if (resourceAsStream != null) {
            return resourceAsStream;
        }
        h.s(c.n("Unable to resolve required resource: ", str));
        return null;
    }
}
