package defpackage;

import android.widget.TextView;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public class hkk {
    public static void b(int i, TextView textView, Map<Integer, hma> map, int i2) {
        if (textView == null || map == null) {
            LogUtil.j("Suggestion_SrtShowHelper", "showSrt() params is null");
            return;
        }
        if (i > i2) {
            textView.setVisibility(8);
            return;
        }
        Iterator<Map.Entry<Integer, hma>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            hma value = it.next().getValue();
            if (i > value.a() && i < value.b()) {
                textView.setText(value.e());
                return;
            }
        }
    }
}
