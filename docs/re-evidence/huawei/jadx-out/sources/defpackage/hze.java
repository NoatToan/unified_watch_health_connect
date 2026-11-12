package defpackage;

import android.view.View;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.HealthWorkout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class hze {
    public static boolean d(int i) {
        return HealthWorkout.isDisplayBitOne(i, 1);
    }

    public static boolean e(int i) {
        return HealthWorkout.isDisplayBitOne(i, 2);
    }

    public static boolean a(int i) {
        return HealthWorkout.isDisplayBitOne(i, 4);
    }

    public static boolean i(int i) {
        return HealthWorkout.isDisplayBitOne(i, 8);
    }

    public static boolean c(int i) {
        return HealthWorkout.isDisplayBitOne(i, 16);
    }

    public static boolean b(int i) {
        return (e(i) || d(i) || a(i)) ? false : true;
    }

    public static void c(List<c> list, int i) {
        c cVar;
        if (njy.e(list)) {
            LogUtil.j("Suggestion_DisPlaySwitch", "showView viewList empty");
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Boolean.valueOf(c(i)));
        arrayList.add(Boolean.valueOf(i(i)));
        arrayList.add(Boolean.valueOf(a(i)));
        arrayList.add(Boolean.valueOf(e(i)));
        arrayList.add(Boolean.valueOf(d(i)));
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (!njy.e(list, i2) && (cVar = list.get(i2)) != null) {
                d(((Boolean) arrayList.get(i2)).booleanValue(), cVar);
            }
        }
    }

    private static void d(boolean z, c cVar) {
        View viewE = cVar.e();
        if (viewE == null) {
            LogUtil.j("Suggestion_DisPlaySwitch", "controlViewDisplay view == null");
        } else if (z) {
            viewE.setVisibility(0);
        } else {
            viewE.setVisibility(cVar.a());
        }
    }

    public static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private View f37369b;
        private int d;

        public c(View view, int i) {
            this.f37369b = view;
            this.d = i;
        }

        public c(View view) {
            this.f37369b = view;
            this.d = 8;
        }

        public View e() {
            return this.f37369b;
        }

        public int a() {
            return this.d;
        }
    }
}
