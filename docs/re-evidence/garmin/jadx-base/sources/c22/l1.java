package c22;

import android.text.Html;
import android.text.Spanned;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc22/l1;", "", "<init>", "()V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l1 {
    static {
        new l1();
    }

    private l1() {
    }

    public static final Spanned a(String str) {
        str.getClass();
        Spanned spannedFromHtml = Html.fromHtml(str, 0);
        spannedFromHtml.getClass();
        return spannedFromHtml;
    }
}
