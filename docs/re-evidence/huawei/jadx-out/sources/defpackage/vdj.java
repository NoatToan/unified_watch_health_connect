package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.huawei.health.marketing.views.ColumnLinearLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class vdj {
    public static void b(ViewGroup viewGroup, List<View> list, List<Integer> list2) {
        if (viewGroup == null) {
            return;
        }
        HashMap map = new HashMap();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ColumnLinearLayout) {
                map.put(Integer.valueOf(((ColumnLinearLayout) childAt).getResourceBriefPriority()), childAt);
            }
        }
        viewGroup.removeAllViews();
        if (!njy.e(list)) {
            for (View view : list) {
                if (view instanceof ColumnLinearLayout) {
                    map.put(Integer.valueOf(((ColumnLinearLayout) view).getResourceBriefPriority()), view);
                }
            }
        }
        if (!njy.e(list2)) {
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (map.containsKey(list2.get(i2))) {
                    map.remove(list2.get(i2));
                }
            }
        }
        ArrayList<Integer> arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList, new Comparator() { // from class: vdg
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return vdj.e((Integer) obj, (Integer) obj2);
            }
        });
        for (Integer num : arrayList) {
            num.intValue();
            viewGroup.addView((View) map.get(num));
        }
    }

    static /* synthetic */ int e(Integer num, Integer num2) {
        return num2.intValue() - num.intValue();
    }
}
