package com.xiaomi.hm.health.watermarkcamera.utils.proxy;

import com.xiaomi.hm.health.watermarkcamera.utils.proxy.adapter.RunDataConversionAdapter;

/* JADX INFO: loaded from: classes22.dex */
public class RunDataConversionProxy implements RunDataConversionAdapter {
    private RunDataConversionAdapter a;

    public static class a {
        private static final RunDataConversionProxy a = new RunDataConversionProxy();

        private a() {
        }
    }

    private RunDataConversionProxy() {
    }

    public static RunDataConversionProxy getInstance() {
        return a.a;
    }

    @Override // com.xiaomi.hm.health.watermarkcamera.utils.proxy.adapter.RunDataConversionAdapter
    public long convertTospkm(float f) {
        return this.a.convertTospkm(f);
    }

    public void setAdapter(RunDataConversionAdapter runDataConversionAdapter) {
        this.a = runDataConversionAdapter;
    }
}
