package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public class bv6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, kwc<? extends CommonDialog, Context>> f4633a;

    static {
        ArrayMap arrayMap = new ArrayMap();
        f4633a = arrayMap;
        arrayMap.put("exercise_goal_picker", new ig8("exercise_goal_picker"));
        arrayMap.put("menstruation_end_day", new mzr("menstruation_end_day"));
    }

    public static <T extends CommonDialog> T a(Context context, String str, int i) {
        kwc<? extends CommonDialog, Context> kwcVar;
        if (context != null && !TextUtils.isEmpty(str) && (kwcVar = f4633a.get(str)) != null) {
            T t = (T) kwcVar.a(context, i);
            Objects.requireNonNull(t, "produce dialog fail");
            return t;
        }
        throw new IllegalStateException("not found dialog type :" + str);
    }
}
