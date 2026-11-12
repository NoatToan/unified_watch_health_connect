package ch.qos.logback.classic.util;

import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class CopyOnInheritThreadLocal extends InheritableThreadLocal<HashMap<String, String>> {
    @Override // java.lang.InheritableThreadLocal
    public HashMap<String, String> childValue(HashMap<String, String> map) {
        if (map == null) {
            return null;
        }
        return new HashMap<>(map);
    }
}
