package com.huawei.openalliance.ad;

/* JADX INFO: loaded from: classes12.dex */
public class li extends lc<Long> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.lc
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Long a(String str) {
        String str2;
        try {
            return Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            str2 = "convertStringToData NumberFormatException";
            hw.a("LongDataConverter", str2);
            return 0L;
        } catch (Exception unused2) {
            str2 = "convertStringToData Exception";
            hw.a("LongDataConverter", str2);
            return 0L;
        }
    }
}
