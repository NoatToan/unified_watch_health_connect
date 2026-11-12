package rc;

import ch.qos.logback.classic.spi.CallerData;
import d53.u;
import d53.w;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final Class<?> a(k63.e eVar) {
        String strV = u.v(eVar.getF103257a(), CallerData.NA, "", false);
        try {
            return Class.forName(strV);
        } catch (ClassNotFoundException unused) {
            if (w.z(strV, ".", false)) {
                return Class.forName(new d53.k("(\\.+)(?!.*\\.)").f(strV, "\\$"));
            }
            String strConcat = "Cannot find class with name \"" + eVar.getF103257a() + "\". Ensure that the serialName for this argument is the default fully qualified name";
            if (eVar.getF103234b() instanceof k63.l.b) {
                strConcat = strConcat.concat(".\nIf the build is minified, try annotating the Enum class with \"androidx.annotation.Keep\" to ensure the Enum is not removed.");
            }
            vb.h.s(strConcat);
            return null;
        }
    }
}
