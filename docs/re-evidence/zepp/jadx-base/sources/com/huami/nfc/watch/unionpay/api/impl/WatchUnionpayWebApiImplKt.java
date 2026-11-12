package com.huami.nfc.watch.unionpay.api.impl;

import com.google.android.exoplayer2.text.ttml.b;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001a\u0010\u0003\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¨\u0006\u0004"}, d2 = {"", "", b.b0, "join", "nfc-watch-unionpay_release"}, k = 2, mv = {1, 5, 1})
public final class WatchUnionpayWebApiImplKt {
    @NotNull
    public static final String join(@NotNull List<String> list, @NotNull String str) {
        Iterator<String> it2 = list.iterator();
        if (!it2.hasNext()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) it2.next());
        while (it2.hasNext()) {
            sb.append(str);
            sb.append((Object) it2.next());
        }
        return sb.toString();
    }

    public static /* synthetic */ String join$default(List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ",";
        }
        return join(list, str);
    }
}
