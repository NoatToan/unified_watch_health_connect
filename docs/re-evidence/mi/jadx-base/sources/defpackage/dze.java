package defpackage;

import cn.hutool.crypto.digest.HmacAlgorithm;
import java.security.Key;

/* JADX INFO: loaded from: classes.dex */
public class dze {
    public static cze a(String str, Key key) {
        return str.equalsIgnoreCase(HmacAlgorithm.HmacSM3.getValue()) ? l2n.a(key.getEncoded()) : new ev5(str, key);
    }
}
