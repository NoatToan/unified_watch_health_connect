package com.huawei.openalliance.ad;

/* JADX INFO: loaded from: classes12.dex */
public class lg extends lc<Integer> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.lc
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer a(String str) {
        String str2;
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            str2 = "convertStringToData NumberFormatException";
            hw.c("IntegerDataConverter", str2);
            return 0;
        } catch (Exception unused2) {
            str2 = "convertStringToData Exception";
            hw.c("IntegerDataConverter", str2);
            return 0;
        }
    }
}
