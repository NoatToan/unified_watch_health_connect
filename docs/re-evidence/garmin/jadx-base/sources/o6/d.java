package o6;

import android.view.View;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<Object, HashMap<String, float[]>> f129467a = new HashMap<>();

    public final float a(View view2, String str) {
        HashMap<String, float[]> map;
        float[] fArr;
        HashMap<Object, HashMap<String, float[]>> map2 = this.f129467a;
        if (map2.containsKey(view2) && (map = map2.get(view2)) != null && map.containsKey(str) && (fArr = map.get(str)) != null && fArr.length > 0) {
            return fArr[0];
        }
        return Float.NaN;
    }
}
