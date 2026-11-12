package p70;

import com.garmin.android.apps.connectmobile.util.GsonUtil;
import java.util.List;
import pb2.e;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public static final String a(e.i iVar) {
        iVar.getClass();
        Object obj = iVar.f137004f;
        List list = obj instanceof List ? (List) obj : null;
        if (list != null) {
            return GsonUtil.a(list);
        }
        return null;
    }
}
