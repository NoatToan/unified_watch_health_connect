package com.huawei.openalliance.ad;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.views.PPSNativeView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes12.dex */
public class oy {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static oy f19937c;
    private int e = 0;
    private int f = 0;
    private int g = 0;
    private int h = 0;
    private int i = 0;
    private int j = 0;
    private int k = 0;
    private final int l = 100;
    private final int m;
    private final gk n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f19935a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f19936b = new byte[0];
    private static Map<String, String[]> d = new ConcurrentHashMap();

    public void b(final Context context) {
        com.huawei.openalliance.ad.utils.o.j(new Runnable() { // from class: com.huawei.openalliance.ad.oy.1
            @Override // java.lang.Runnable
            public void run() {
                String str;
                try {
                    if (!oy.this.n.ab()) {
                        oy.d.clear();
                        str = "disabled";
                    } else {
                        int iAc = oy.this.n.ac() * 1000;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (jCurrentTimeMillis - oy.this.n.cx() <= iAc && iAc != 0) {
                            hw.b("CCP", "check failed in %s", Integer.valueOf(iAc));
                            return;
                        }
                        hw.b("CCP", "check pass");
                        oy.this.n.l(jCurrentTimeMillis);
                        Context context2 = context;
                        if (context2 instanceof Activity) {
                            oy.this.a((Activity) context2);
                            return;
                        }
                        str = "not target";
                    }
                    hw.b("CCP", str);
                } catch (Throwable th) {
                    hw.d("CCP", "process error: %s", th.getClass().getSimpleName());
                }
            }
        });
    }

    public String a() {
        if (this.n.ab()) {
            hw.a("CCP", "get AutoContentBundle");
            return com.huawei.openalliance.ad.utils.bk.b(d);
        }
        hw.a("CCP", "get AutoContentBundle off");
        d.clear();
        return null;
    }

    private static oy c(Context context) {
        oy oyVar;
        synchronized (f19935a) {
            if (f19937c == null) {
                f19937c = new oy(context);
            }
            oyVar = f19937c;
        }
        return oyVar;
    }

    private String[] b(Activity activity) {
        this.e = 0;
        String[] strArr = new String[0];
        List<String> listA = a(activity.getWindow().getDecorView(), this.j);
        if (!com.huawei.openalliance.ad.utils.bm.a(listA)) {
            return (String[]) listA.toArray(new String[listA.size()]);
        }
        hw.a("CCP", "get contentAuto is null");
        return strArr;
    }

    private boolean a(Map<String, List<String>> map, String str, Map<String, String[]> map2) {
        if (!map.containsKey(str)) {
            return false;
        }
        List<String> list = map.get(str);
        if (com.huawei.openalliance.ad.utils.bm.a(list)) {
            hw.a("CCP", "get %s is null ", str);
            return false;
        }
        map2.put(str, (String[]) list.toArray(new String[list.size()]));
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x008f  */
    private void a(Map<Integer, String> map, Map<String, List<String>> map2, View view) {
        byte b2;
        int i;
        int i2;
        int id = view.getId();
        if (!map.containsKey(Integer.valueOf(id))) {
            hw.b("CCP", "invalid id");
            return;
        }
        TextView textView = (TextView) view;
        String string = textView.getText() != null ? textView.getText().toString() : "";
        int length = string.length();
        String str = map.get(Integer.valueOf(id));
        List<String> arrayList = new ArrayList<>();
        if (map2.containsKey(str)) {
            arrayList = map2.get(str);
        }
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        String str2 = str != null ? str : "";
        str2.hashCode();
        switch (str2) {
            case "category":
                b2 = 0;
                break;
            case "title":
                b2 = 1;
                break;
            case "content":
                b2 = 2;
                break;
            case "subcategory":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            i = this.h;
            i2 = length + i;
            this.h = i2;
        } else if (b2 == 1) {
            i = this.g;
            i2 = length + i;
            this.g = i2;
        } else if (b2 == 2) {
            i = this.f;
            i2 = length + i;
            this.f = i2;
        } else if (b2 != 3) {
            i = 0;
            i2 = 0;
        } else {
            i = this.i;
            i2 = length + i;
            this.i = i2;
        }
        int i3 = this.m;
        if (i < i3) {
            if (i2 >= i3) {
                int length2 = (string.length() + this.m) - i2;
                if (!TextUtils.isEmpty(string.substring(0, length2))) {
                    arrayList.add(string.substring(0, length2));
                }
            } else if (!TextUtils.isEmpty(string)) {
                arrayList.add(string);
            }
        }
        map2.put(str2, arrayList);
    }

    private void a(View view, Map<Integer, String> map, Map<String, List<String>> map2, int i) {
        String str;
        this.k++;
        if (view instanceof ViewGroup) {
            int i2 = i + 1;
            if (i2 < 100) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    if (childAt instanceof TextView) {
                        a(map, map2, childAt);
                    }
                    if (this.k >= 100) {
                        str = "clctCfgContentRur outer round " + this.k;
                    } else {
                        a(childAt, map, map2, i2);
                    }
                }
                return;
            }
            str = "clctCfgContentDepth outer round 100";
            hw.a("CCP", str);
        }
    }

    private void a(Activity activity, Map<Integer, String> map) {
        HashMap map2 = new HashMap();
        this.f = 0;
        this.h = 0;
        this.i = 0;
        this.g = 0;
        this.k = 0;
        a(activity.getWindow().getDecorView(), map, map2, this.j);
        if (com.huawei.openalliance.ad.utils.br.a(map2)) {
            hw.a("CCP", "no get cfg, getAutoContent");
            String[] strArrB = b(activity);
            if (strArrB == null || strArrB.length <= 0) {
                return;
            }
            d.put(Constants.AUTOCONTENT_CONTENT_AUTO, strArrB);
            return;
        }
        a(map2, "title", d);
        if (!a(map2, "content", d)) {
            hw.a("CCP", "no get cfg content, getAutoContent");
            String[] strArrB2 = b(activity);
            if (strArrB2 != null && strArrB2.length > 0) {
                d.put(Constants.AUTOCONTENT_CONTENT_AUTO, strArrB2);
            }
        }
        a(map2, "category", d);
        a(map2, Constants.AUTOCONTENT_SUBCATEGORY, d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Activity activity) {
        String simpleName = activity.getClass().getSimpleName();
        hw.a("CCP", "getActivityInfo-name: %s", activity.getClass().getSimpleName());
        if (!com.huawei.openalliance.ad.utils.dg.b(simpleName)) {
            d.clear();
            d.put("activityName", new String[]{simpleName});
        }
        Map<Integer, String> mapA = com.huawei.openalliance.ad.utils.x.a(activity, this.n.ae());
        if (!com.huawei.openalliance.ad.utils.br.a(mapA)) {
            a(activity, mapA);
            return;
        }
        hw.b("CCP", "auto process");
        String[] strArrB = b(activity);
        if (strArrB == null || strArrB.length <= 0) {
            return;
        }
        d.put(Constants.AUTOCONTENT_CONTENT_AUTO, strArrB);
    }

    private List<String> a(View view, int i) {
        if (view == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            if (i + 1 >= 100) {
                hw.a("CCP", "autoContentRurDepth outer round 100");
                return arrayList;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (!(childAt instanceof PPSNativeView)) {
                    if ((childAt instanceof TextView) && childAt.isShown()) {
                        synchronized (f19936b) {
                            String string = ((TextView) childAt).getText().toString();
                            int i3 = this.e;
                            if (i3 >= this.m || i3 + string.length() <= this.m) {
                                int i4 = this.e;
                                if (i4 < this.m) {
                                    this.e = i4 + string.length();
                                    if (!TextUtils.isEmpty(string)) {
                                        arrayList.add(string);
                                    }
                                }
                            } else {
                                this.e += string.length();
                                int length = (string.length() - this.e) + this.m;
                                if (length > string.length()) {
                                    length = string.length();
                                }
                                string = string.substring(0, length);
                                if (!TextUtils.isEmpty(string)) {
                                    arrayList.add(string);
                                }
                            }
                        }
                    }
                    int i5 = this.e;
                    int i6 = this.m;
                    if (i5 >= i6) {
                        hw.a("CCP", "autoContentSize maxSize %s", Integer.valueOf(i6));
                        return arrayList;
                    }
                    arrayList.addAll(a(childAt, this.j));
                }
            }
        }
        return arrayList;
    }

    public static oy a(Context context) {
        return c(context);
    }

    private oy(Context context) {
        gk gkVarB = fp.b(context);
        this.n = gkVarB;
        this.m = gkVarB.ad();
    }
}
