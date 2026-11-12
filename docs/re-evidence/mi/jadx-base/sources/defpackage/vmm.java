package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.xiaomi.fitness.common.utils.TimeUtils;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public class vmm {
    public static String a(Context context, long j) {
        List<String> listB = b(context, j);
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = listB.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
        }
        return sb.toString();
    }

    public static List<String> b(Context context, long j) {
        Objects.requireNonNull(context);
        Resources resources = context.getResources();
        int[] hourMinuteAndSecond = TimeUtils.INSTANCE.getHourMinuteAndSecond(j);
        int i = hourMinuteAndSecond[0];
        int i2 = hourMinuteAndSecond[1];
        int i3 = hourMinuteAndSecond[2];
        LinkedList linkedList = new LinkedList();
        if (i == 0) {
            if (i2 == 0) {
                linkedList.add(String.valueOf(i3));
                linkedList.add(resources.getQuantityString(qxi.T1, i3));
                linkedList.add("");
                linkedList.add("");
            } else if (i3 == 0) {
                linkedList.add(String.valueOf(i2));
                linkedList.add(resources.getQuantityString(qxi.Q1, i2));
                linkedList.add("");
                linkedList.add("");
            } else {
                linkedList.add(String.valueOf(i2));
                linkedList.add(resources.getQuantityString(qxi.Q1, i2));
                linkedList.add(String.valueOf(i3));
                linkedList.add(resources.getQuantityString(qxi.T1, i3));
            }
        } else if (i2 == 0) {
            if (i3 == 0) {
                linkedList.add(String.valueOf(i));
                linkedList.add(resources.getQuantityString(qxi.O1, i));
                linkedList.add("");
                linkedList.add("");
            } else {
                linkedList.add(String.valueOf(i));
                linkedList.add(resources.getQuantityString(qxi.O1, i));
                linkedList.add(String.valueOf(i3));
                linkedList.add(resources.getQuantityString(qxi.T1, i3));
            }
        } else if (i3 == 0) {
            linkedList.add(String.valueOf(i));
            linkedList.add(resources.getQuantityString(qxi.O1, i));
            linkedList.add(String.valueOf(i2));
            linkedList.add(resources.getQuantityString(qxi.Q1, i2));
        } else {
            linkedList.add(String.valueOf(i));
            linkedList.add(resources.getQuantityString(qxi.O1, i));
            linkedList.add(String.valueOf(i2));
            linkedList.add(resources.getQuantityString(qxi.Q1, i2));
            linkedList.add(String.valueOf(i3));
            linkedList.add(resources.getQuantityString(qxi.T1, i3));
        }
        return linkedList;
    }
}
