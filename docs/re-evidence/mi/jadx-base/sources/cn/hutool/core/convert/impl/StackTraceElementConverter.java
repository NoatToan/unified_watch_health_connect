package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;
import defpackage.g4h;
import defpackage.v4f;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class StackTraceElementConverter extends AbstractConverter<StackTraceElement> {
    private static final long serialVersionUID = 1;

    @Override // cn.hutool.core.convert.AbstractConverter
    public StackTraceElement convertInternal(Object obj) {
        if (!(obj instanceof Map)) {
            return null;
        }
        Map map = (Map) obj;
        return new StackTraceElement(v4f.m(map, "className"), v4f.m(map, "methodName"), v4f.m(map, "fileName"), ((Integer) g4h.e(v4f.l(map, "lineNumber"), 0)).intValue());
    }
}
