package oh;

import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements a.InterfaceC2506a<Object, Boolean> {
    @Override // oh.a.InterfaceC2506a
    public final Boolean a(Object obj) {
        return Boolean.valueOf((obj instanceof NetworkInfo) || obj == null);
    }
}
