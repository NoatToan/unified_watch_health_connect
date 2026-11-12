package com.huawei.openalliance.ad;

/* JADX INFO: loaded from: classes12.dex */
public class ld extends lc<Double> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.lc
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Double a(String str) {
        String str2;
        try {
            return Double.valueOf(Double.parseDouble(str));
        } catch (NumberFormatException unused) {
            str2 = "convertStringToData NumberFormatException";
            hw.c("DoubleDataConverter", str2);
            return Double.valueOf(0.0d);
        } catch (Exception unused2) {
            str2 = "convertStringToData Exception";
            hw.c("DoubleDataConverter", str2);
            return Double.valueOf(0.0d);
        }
    }
}
