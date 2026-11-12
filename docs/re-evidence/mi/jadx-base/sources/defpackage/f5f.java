package defpackage;

import android.view.View;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public class f5f {

    public interface a {
        float getGroupWeight(View view);

        int getMark(View view);

        int getOrder(View view);

        float getWeight(View view);
    }

    public static uuq b(View[] viewArr, final a aVar) {
        Arrays.sort(viewArr, new Comparator() { // from class: e5f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return f5f.c(aVar, (View) obj, (View) obj2);
            }
        });
        uuq uuqVar = new uuq();
        uuqVar.g(1);
        uuqVar.i(1.0f);
        uuqVar.m(1);
        d(viewArr, 0, uuqVar, aVar);
        return uuqVar;
    }

    public static /* synthetic */ int c(a aVar, View view, View view2) {
        return aVar.getOrder(view) - aVar.getOrder(view2);
    }

    public static int d(View[] viewArr, int i, uuq uuqVar, a aVar) {
        int iB = uuqVar.b();
        while (i < viewArr.length) {
            int mark = aVar.getMark(viewArr[i]);
            int i2 = mark % 2 == 0 ? 0 : 1;
            float weight = aVar.getWeight(viewArr[i]);
            float groupWeight = aVar.getGroupWeight(viewArr[i]);
            View view = viewArr[i];
            if (mark != iB) {
                if (mark <= iB) {
                    if (mark > 0) {
                        break;
                    }
                } else {
                    uuq uuqVar2 = new uuq();
                    uuqVar2.g(mark);
                    uuqVar2.m(i2);
                    uuqVar2.i(groupWeight);
                    uuqVar.k().add(uuqVar2);
                    i = d(viewArr, i, uuqVar2, aVar);
                }
            } else {
                hvq hvqVar = new hvq();
                hvqVar.g(mark);
                hvqVar.h(view);
                hvqVar.i(weight);
                uuqVar.k().add(hvqVar);
            }
            i++;
        }
        return i;
    }
}
