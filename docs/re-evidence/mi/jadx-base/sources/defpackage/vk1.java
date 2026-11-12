package defpackage;

import android.os.Bundle;
import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class vk1 {
    public static vk1 a(Bundle bundle, ihs ihsVar, xns xnsVar) {
        return b(bundle, ihsVar, xnsVar, new jbs() { // from class: nbs
            @Override // defpackage.jbs
            public final int a(int i, String str) {
                return i;
            }
        });
    }

    public static vk1 b(Bundle bundle, ihs ihsVar, xns xnsVar, jbs jbsVar) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        HashMap map = new HashMap();
        int size = stringArrayList.size();
        for (int i = 0; i < size; i++) {
            String str = stringArrayList.get(i);
            map.put(str, AssetPackState.c(bundle, str, ihsVar, xnsVar, jbsVar));
        }
        return new pcs(bundle.getLong("total_bytes_to_download"), map);
    }

    public abstract Map<String, AssetPackState> c();

    public abstract long d();
}
