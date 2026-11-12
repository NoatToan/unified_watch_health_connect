package defpackage;

import cn.hutool.core.collection.EnumerationIter;
import cn.hutool.core.io.IORuntimeException;
import java.io.IOException;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public class irk {
    public static URL a(String str) throws IORuntimeException {
        return b(str, null);
    }

    public static URL b(String str, Class<?> cls) {
        String strM = tt3.M(str);
        return cls != null ? cls.getResource(strM) : yz3.b().getResource(strM);
    }

    public static EnumerationIter<URL> c(String str) {
        try {
            return new EnumerationIter<>(yz3.b().getResources(str));
        } catch (IOException e) {
            throw new IORuntimeException(e);
        }
    }
}
