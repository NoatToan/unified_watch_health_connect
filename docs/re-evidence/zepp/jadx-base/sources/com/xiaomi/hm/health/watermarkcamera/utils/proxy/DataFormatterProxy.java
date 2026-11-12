package com.xiaomi.hm.health.watermarkcamera.utils.proxy;

import com.xiaomi.hm.health.watermarkcamera.utils.proxy.adapter.DataFormatterAdapter;

/* JADX INFO: loaded from: classes22.dex */
public class DataFormatterProxy implements DataFormatterAdapter {
    private DataFormatterAdapter a;

    public static class a {
        private static final DataFormatterProxy a = new DataFormatterProxy();

        private a() {
        }
    }

    private DataFormatterProxy() {
    }

    public static DataFormatterProxy getInstance() {
        return a.a;
    }

    @Override // com.xiaomi.hm.health.watermarkcamera.utils.proxy.adapter.DataFormatterAdapter
    public String formatTimeInSportForm(long j) {
        return this.a.formatTimeInSportForm(j);
    }

    @Override // com.xiaomi.hm.health.watermarkcamera.utils.proxy.adapter.DataFormatterAdapter
    public String getConsumeTime(long j) {
        return this.a.getConsumeTime(j);
    }

    @Override // com.xiaomi.hm.health.watermarkcamera.utils.proxy.adapter.DataFormatterAdapter
    public String parseRawKilometerToFormatKilometer(float f) {
        return this.a.parseRawKilometerToFormatKilometer(f);
    }

    public void setAdapter(DataFormatterAdapter dataFormatterAdapter) {
        this.a = dataFormatterAdapter;
    }
}
