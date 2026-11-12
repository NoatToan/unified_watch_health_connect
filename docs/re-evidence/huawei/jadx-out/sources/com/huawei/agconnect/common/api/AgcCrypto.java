package com.huawei.agconnect.common.api;

import android.text.TextUtils;
import com.huawei.agconnect.common.crypto.AgcCryptoV1;
import com.huawei.agconnect.common.crypto.AgcCryptoV2;
import com.huawei.agconnect.common.crypto.AgcCryptoV3;
import com.huawei.agconnect.datastore.annotation.ICrypto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class AgcCrypto implements ICrypto, com.huawei.agconnect.common.datastore.ICrypto {
    private static final AgcCrypto INSTANCE = new AgcCrypto();
    private final List<ICrypto> cryptoList;

    @Override // com.huawei.agconnect.datastore.annotation.ICrypto, com.huawei.agconnect.common.datastore.ICrypto
    public String encrypt(String str) {
        return this.cryptoList.get(0).encrypt(str);
    }

    @Override // com.huawei.agconnect.datastore.annotation.ICrypto, com.huawei.agconnect.common.datastore.ICrypto
    public String decrypt(String str) {
        Iterator<ICrypto> it = this.cryptoList.iterator();
        while (it.hasNext()) {
            String strDecrypt = it.next().decrypt(str);
            if (!TextUtils.isEmpty(strDecrypt)) {
                return strDecrypt;
            }
        }
        return str;
    }

    public static ICrypto get() {
        return INSTANCE;
    }

    public AgcCrypto() {
        ArrayList arrayList = new ArrayList();
        this.cryptoList = arrayList;
        arrayList.add(new AgcCryptoV3());
        arrayList.add(new AgcCryptoV2());
        arrayList.add(new AgcCryptoV1());
    }
}
