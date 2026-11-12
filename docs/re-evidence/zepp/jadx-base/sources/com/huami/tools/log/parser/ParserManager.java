package com.huami.tools.log.parser;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes15.dex */
public final class ParserManager {
    public static final Map<Class, IParser> a = new ConcurrentHashMap();

    private ParserManager() {
    }

    public static void addObjectParser(IParser<?> iParser) {
        a.put(iParser.getClassType(), iParser);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> String parseMessageFromObject(T t) {
        if (t == 0) {
            return null;
        }
        if (t instanceof String) {
            return (String) t;
        }
        Class<?> cls = t.getClass();
        Map<Class, IParser> map = a;
        IParser iParser = map.get(cls);
        if (iParser == null) {
            Iterator<Class> it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                IParser iParser2 = a.get(it2.next());
                if (iParser2.getClassType().isAssignableFrom(cls)) {
                    iParser = iParser2;
                    break;
                }
            }
        }
        return iParser != null ? iParser.parseString(t) : t.toString();
    }

    public static void removeAllObjectParser() {
        a.clear();
    }

    public static void removeObjectParser(IParser<?> iParser) {
        a.remove(iParser.getClassType());
    }

    public static void removeObjectParser(Class<?> cls) {
        a.remove(cls);
    }
}
