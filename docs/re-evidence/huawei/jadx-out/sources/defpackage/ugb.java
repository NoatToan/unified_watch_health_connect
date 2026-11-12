package defpackage;

import android.content.Context;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.nps.interactors.mode.TypeParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class ugb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f50048a = new byte[1];
    private static ugb d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f50049b;
    private int h;
    private long i;
    private String r;
    private String u;
    private long y;
    private final List<ufo> t = new ArrayList(12);
    private final Map<Integer, String> e = new HashMap(16);
    private final List<Integer> s = new ArrayList(16);
    private boolean n = false;
    private boolean m = false;
    private boolean j = false;
    private boolean p = true;
    private boolean q = false;
    private boolean k = false;
    private boolean o = false;
    private int g = 1;
    private boolean l = false;
    private boolean f = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f50050c = "unknown";

    private ugb() {
    }

    public static ugb b() {
        ugb ugbVar;
        synchronized (f50048a) {
            if (d == null) {
                d = new ugb();
            }
            ugbVar = d;
        }
        return ugbVar;
    }

    public List<ufo> r() {
        return this.t;
    }

    public void d(boolean z) {
        this.n = z;
    }

    public boolean j() {
        return this.n;
    }

    public void e(boolean z) {
        this.f = z;
    }

    public boolean a() {
        return this.f;
    }

    private void d(int i) {
        this.g = i;
    }

    private int y() {
        return this.g;
    }

    public void a(boolean z) {
        this.m = z;
    }

    public boolean g() {
        return this.m;
    }

    public void j(boolean z) {
        this.o = z;
    }

    public boolean n() {
        return this.o;
    }

    public void c(boolean z) {
        this.j = z;
    }

    public boolean h() {
        return this.j;
    }

    public void g(boolean z) {
        this.p = z;
    }

    public boolean k() {
        return this.p;
    }

    public void f(boolean z) {
        this.q = z;
    }

    public boolean l() {
        return this.q;
    }

    public void b(boolean z) {
        this.k = z;
    }

    public boolean f() {
        return this.k;
    }

    public void c(long j) {
        this.y = j;
    }

    public long p() {
        return this.y;
    }

    public void a(long j) {
        this.i = j;
    }

    public long c() {
        return this.i;
    }

    public void e(String str) {
        this.f50050c = str;
    }

    public String o() {
        return this.f50050c;
    }

    public void b(String str) {
        this.u = str;
    }

    public String q() {
        return this.u;
    }

    public String t() {
        return this.r;
    }

    public void c(String str) {
        this.r = str;
    }

    public void a(int i) {
        this.f50049b = i;
    }

    public int e() {
        return this.f50049b;
    }

    public void h(boolean z) {
        this.l = z;
    }

    public boolean i() {
        return this.l;
    }

    public int d() {
        return this.h;
    }

    public void b(int i) {
        this.h = i;
    }

    public void s() {
        if (y() == 1) {
            d(0);
            LogUtil.a("AnswerQuestionUtil", "initList() success");
            x();
        }
    }

    private void x() {
        String string = BaseApplication.getContext().getString(R.string.IDS_hw_show_card_pressure_measure_calibrate_question_item_1);
        String string2 = BaseApplication.getContext().getString(R.string.IDS_hw_show_card_pressure_measure_calibrate_question_item_2);
        String string3 = BaseApplication.getContext().getString(R.string.IDS_hw_show_card_pressure_measure_calibrate_question_item_3);
        String string4 = BaseApplication.getContext().getString(R.string.IDS_hw_show_card_pressure_measure_calibrate_question_item_4);
        String[] strArrU = u();
        int i = 0;
        while (i < 12) {
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(new ufm("A", string));
            arrayList.add(new ufm("B", string2));
            arrayList.add(new ufm(TypeParams.SEARCH_CODE, string3));
            arrayList.add(new ufm("D", string4));
            int i2 = i + 1;
            this.t.add(new ufo(i2, strArrU[i], arrayList));
            i = i2;
        }
    }

    private String[] u() {
        Context context = BaseApplication.getContext();
        return new String[]{context.getString(R.string.IDS_hw_show_card_pressure_measure_calibrate_question_text_1), context.getString(R.string.IDS_hw_show_card_pressure_measure_calibrate_question_text_2), context.getString(R.string.IDS_hw_show_card_pressure_measure_calibrate_question_text_3), context.getString(R.string.IDS_hw_show_card_pressure_measure_calibrate_question_text_4), context.getString(R.string.IDS_hw_show_card_pressure_measure_calibrate_question_text_5), context.getString(R.string.IDS_hw_show_card_pressure_measure_calibrate_question_text_6), context.getString(R.string.IDS_hw_show_card_pressure_measure_calibrate_question_text_7), context.getString(R.string.IDS_hw_show_card_pressure_measure_calibrate_question_text_8), context.getString(R.string.IDS_hw_show_card_pressure_measure_calibrate_question_text_9), context.getString(R.string.IDS_hw_show_card_pressure_measure_calibrate_question_text_10), context.getString(R.string.IDS_hw_show_card_pressure_measure_calibrate_question_text_11), context.getString(R.string.IDS_hw_show_card_pressure_measure_calibrate_question_text_12)};
    }

    private void a(List<?> list) {
        if (list != null) {
            list.clear();
        }
    }

    private void a(Map<?, ?> map) {
        if (map != null) {
            map.clear();
        }
    }

    public int e(int i) {
        if (!this.e.containsKey(Integer.valueOf(i))) {
            return -1;
        }
        String str = this.e.get(Integer.valueOf(i));
        LogUtil.a("AnswerQuestionUtil", "getAnswerMap() questionId = ", Integer.valueOf(i));
        return e(str, i == 5 || i == 7 || i == 10);
    }

    private int e(String str, boolean z) {
        byte b2;
        str.hashCode();
        switch (str) {
            case "A":
                b2 = 0;
                break;
            case "B":
                b2 = 1;
                break;
            case "C":
                b2 = 2;
                break;
            case "D":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            return z ? 3 : 0;
        }
        if (b2 == 1) {
            return z ? 2 : 1;
        }
        if (b2 == 2) {
            return z ? 1 : 2;
        }
        if (b2 == 3) {
            return z ? 0 : 3;
        }
        LogUtil.j("AnswerQuestionUtil", "matchSelected is error name, name is ", str);
        return -1;
    }

    public void d(int i, String str) {
        this.e.put(Integer.valueOf(i), str);
        LogUtil.a("AnswerQuestionUtil", "setAnswerMap() questionId = ", Integer.valueOf(i), ", checkedItem = ", str);
        if (i == 5 || i == 7 || i == 10) {
            b(this.e, i);
        }
    }

    private void b(Map<Integer, String> map, int i) {
        String str = map.get(Integer.valueOf(i));
        LogUtil.a("AnswerQuestionUtil", "changeMap() value = ", str);
        if ("A".equals(str)) {
            map.put(Integer.valueOf(i), "D");
            return;
        }
        if ("B".equals(str)) {
            map.put(Integer.valueOf(i), TypeParams.SEARCH_CODE);
            return;
        }
        if (TypeParams.SEARCH_CODE.equals(str)) {
            map.put(Integer.valueOf(i), "B");
        } else if ("D".equals(str)) {
            map.put(Integer.valueOf(i), "A");
        } else {
            LogUtil.a("AnswerQuestionUtil", "changeMap() value err");
        }
    }

    public float m() {
        Iterator<Map.Entry<Integer, String>> it = this.e.entrySet().iterator();
        while (it.hasNext()) {
            String value = it.next().getValue();
            LogUtil.a("AnswerQuestionUtil", "getLastScore() value = ", value);
            if ("A".equals(value)) {
                this.s.add(0);
            } else if ("B".equals(value)) {
                this.s.add(1);
            } else if (TypeParams.SEARCH_CODE.equals(value)) {
                this.s.add(2);
            } else if ("D".equals(value)) {
                this.s.add(3);
            } else {
                LogUtil.a("AnswerQuestionUtil", "getLastScore() value err ");
            }
        }
        return c(this.s);
    }

    private float c(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += it.next().intValue();
        }
        return (float) ((((double) iIntValue) * 2.722d) + 0.5d + 1.0d);
    }

    public void w() {
        LogUtil.a("AnswerQuestionUtil", " AnswerQuestionUtil reset()");
        a(this.s);
        a(this.e);
        a(this.t);
        d(1);
        a(false);
        d(false);
        g(true);
        f(false);
        b(false);
        e(false);
        b(0);
    }
}
