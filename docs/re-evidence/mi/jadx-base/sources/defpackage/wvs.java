package defpackage;

import android.content.Context;
import com.amap.api.services.poisearch.PoiSearchV2;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wvs<T, V> extends kts<T, V> {
    public wvs(Context context, T t) {
        super(context, t);
    }

    public static String t(PoiSearchV2.ShowFields showFields) {
        if (showFields == null || showFields.getValue() == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if ((showFields.getValue() & 1) != 0) {
            sb.append("children,");
        }
        if ((showFields.getValue() & 2) != 0) {
            sb.append("business,");
        }
        if ((showFields.getValue() & 4) != 0) {
            sb.append("indoor,");
        }
        if ((showFields.getValue() & 8) != 0) {
            sb.append("navi,");
        }
        if ((showFields.getValue() & 16) != 0) {
            sb.append("photos,");
        }
        if (sb.length() <= 0) {
            return null;
        }
        sb.replace(sb.length() - 1, sb.length(), "");
        return sb.toString();
    }

    public static boolean u(String str) {
        return str == null || str.equals("") || str.equals(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
    }
}
