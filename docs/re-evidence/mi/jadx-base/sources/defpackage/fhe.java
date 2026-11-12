package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class fhe {
    public List<Short> a(String str) {
        return TextUtils.isEmpty(str) ? Collections.emptyList() : c6c.a(Base64.decode(str, 4));
    }
}
