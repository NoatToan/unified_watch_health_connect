package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import health.compact.a.CommonUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class qsl {
    public static void b(String str, View view, int i) {
        try {
            if (CommonUtil.af(BaseApplication.getContext())) {
                OpAnalyticsUtil.getInstance().setProbabilityProblemEvent(str, "view=" + String.valueOf(view));
                return;
            }
            String str2 = "findId:" + i + " ,analyzedView viewTree:" + b(view);
            LogUtil.a("ViewTreeUtils", str, str2);
            OpAnalyticsUtil.getInstance().setProbabilityProblemEvent(str, str2);
        } catch (Throwable th) {
            LogUtil.a("ViewTreeUtils", str, th.getClass().getSimpleName());
        }
    }

    public static String b(View view) {
        if (view == null) {
            return null;
        }
        return qqt.b(new e(e(view), d(view)));
    }

    public static ArrayList<d> e(View view) {
        if (view == null) {
            return null;
        }
        ArrayList<d> arrayList = new ArrayList<>();
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                arrayList.add(new d(((View) parent).getId(), parent.getClass().getSimpleName()));
            }
        }
        return arrayList;
    }

    public static d d(View view) {
        if (view == null) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            c cVar = new c(view.getId(), view.getClass().getSimpleName());
            if (viewGroup.getChildCount() > 0) {
                ArrayList arrayList = new ArrayList();
                cVar.d(arrayList);
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    arrayList.add(d(viewGroup.getChildAt(i)));
                }
            }
            return cVar;
        }
        return new d(view.getId(), view.getClass().getSimpleName());
    }

    public static class e implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private d f46746c;
        private List<d> e;

        public e(List<d> list, d dVar) {
            this.e = list;
            this.f46746c = dVar;
        }
    }

    public static class d implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f46745b;
        private int d;

        public d(int i, String str) {
            this.d = i;
            this.f46745b = str;
        }
    }

    public static class c extends d implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<d> f46744b;

        public c(int i, String str) {
            super(i, str);
        }

        public void d(List<d> list) {
            this.f46744b = list;
        }
    }
}
