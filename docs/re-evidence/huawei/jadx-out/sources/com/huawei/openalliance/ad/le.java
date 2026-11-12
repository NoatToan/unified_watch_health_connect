package com.huawei.openalliance.ad;

/* JADX INFO: loaded from: classes12.dex */
public class le extends lc<Float> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.lc
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Float a(String str) {
        String str2;
        try {
            return Float.valueOf(Float.parseFloat(str));
        } catch (NumberFormatException unused) {
            str2 = "convertStringToData NumberFormatException";
            hw.c("FloatDataConverter", str2);
            return Float.valueOf(0.0f);
        } catch (Exception unused2) {
            str2 = "convertStringToData Exception";
            hw.c("FloatDataConverter", str2);
            return Float.valueOf(0.0f);
        }
    }
}
