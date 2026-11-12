package defpackage;

import cn.hutool.core.exceptions.UtilException;
import java.lang.management.ManagementFactory;

/* JADX INFO: loaded from: classes.dex */
public class h5l {
    public static int a() throws UtilException {
        String name = ManagementFactory.getRuntimeMXBean().getName();
        if (tt3.F(name)) {
            throw new UtilException("Process name is blank!");
        }
        int iIndexOf = name.indexOf(64);
        return iIndexOf > 0 ? Integer.parseInt(name.substring(0, iIndexOf)) : name.hashCode();
    }
}
