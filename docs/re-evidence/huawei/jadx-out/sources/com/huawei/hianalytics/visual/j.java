package com.huawei.hianalytics.visual;

/* JADX INFO: loaded from: classes33.dex */
public final class j implements p0 {
    @Override // com.huawei.hianalytics.visual.p0
    public final /* bridge */ /* synthetic */ Object a() {
        return Boolean.FALSE;
    }

    @Override // com.huawei.hianalytics.visual.p0
    public final String a(Object obj) {
        Boolean bool = (Boolean) obj;
        return bool == null ? Boolean.FALSE.toString() : String.valueOf(bool);
    }

    @Override // com.huawei.hianalytics.visual.p0
    public final Object a(String str) {
        return Boolean.valueOf(str);
    }
}
