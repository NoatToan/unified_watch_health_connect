package com.huawei.hianalytics.framework;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements s {
    @Override // com.huawei.hianalytics.framework.s
    public final Object a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            return Boolean.valueOf(Boolean.parseBoolean((String) obj));
        }
        return null;
    }
}
