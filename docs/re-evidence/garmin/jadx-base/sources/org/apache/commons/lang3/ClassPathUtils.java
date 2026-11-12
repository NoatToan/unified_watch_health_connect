package org.apache.commons.lang3;

import ch.qos.logback.core.CoreConstants;
import org.apache.commons.io.IOUtils;

/* JADX INFO: loaded from: classes3.dex */
public class ClassPathUtils {
    public static String toFullyQualifiedName(Package r14, String str) {
        Validate.notNull(r14, CoreConstants.CONTEXT_SCOPE_VALUE, new Object[0]);
        Validate.notNull(str, "resourceName", new Object[0]);
        return r14.getName() + "." + str;
    }

    public static String toFullyQualifiedPath(Package r14, String str) {
        Validate.notNull(r14, CoreConstants.CONTEXT_SCOPE_VALUE, new Object[0]);
        Validate.notNull(str, "resourceName", new Object[0]);
        return r14.getName().replace('.', IOUtils.DIR_SEPARATOR_UNIX) + "/" + str;
    }

    public static String toFullyQualifiedName(Class<?> cls, String str) {
        Validate.notNull(cls, CoreConstants.CONTEXT_SCOPE_VALUE, new Object[0]);
        Validate.notNull(str, "resourceName", new Object[0]);
        return toFullyQualifiedName(cls.getPackage(), str);
    }

    public static String toFullyQualifiedPath(Class<?> cls, String str) {
        Validate.notNull(cls, CoreConstants.CONTEXT_SCOPE_VALUE, new Object[0]);
        Validate.notNull(str, "resourceName", new Object[0]);
        return toFullyQualifiedPath(cls.getPackage(), str);
    }
}
