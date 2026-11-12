package defpackage;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes4.dex */
public class wtq {
    public static Pair<View, Integer> a(View view) {
        LinkedList linkedList = new LinkedList();
        Pair<View, Integer> pair = new Pair<>(view, 1);
        linkedList.add(pair);
        while (!linkedList.isEmpty()) {
            Pair<View, Integer> pair2 = (Pair) linkedList.poll();
            if (((Integer) pair2.second).intValue() > ((Integer) pair.second).intValue()) {
                pair = pair2;
            }
            Object obj = pair2.first;
            if (obj instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) obj;
                Integer numValueOf = Integer.valueOf(((Integer) pair2.second).intValue() + 1);
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    linkedList.add(new Pair(viewGroup.getChildAt(i), numValueOf));
                }
            }
        }
        return pair;
    }
}
