package com.amap.api.mapcore.util;

/* JADX INFO: loaded from: classes2.dex */
public final class ez implements ey {
    @Override // com.amap.api.mapcore.util.ey
    public final void a(int i, String str, String str2) {
        if (i == 0) {
            hf.a(er.f()).a(he.a(str, str2));
        } else {
            hf.a(er.f()).a(he.b(str, str2));
        }
    }

    @Override // com.amap.api.mapcore.util.ey
    public final void a() {
        try {
            hf.a(er.f()).a();
        } catch (Throwable unused) {
        }
    }
}
