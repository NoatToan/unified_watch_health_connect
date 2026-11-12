package defpackage;

import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.servicesui.R;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes43.dex */
public class vzi {
    private String e;
    private List<vzg> d = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<fol> f51742b = new ArrayList();

    public void c(String str) {
        this.e = str;
    }

    public List<vzg> a() {
        return this.d;
    }

    public void d(List<vzg> list) {
        this.d = list;
    }

    public List<fol> d() {
        return e();
    }

    private List<fol> e() {
        vyx vyxVarB;
        vyy vyyVar;
        this.f51742b.clear();
        for (vzg vzgVar : this.d) {
            fol folVar = new fol();
            this.f51742b.add(folVar);
            folVar.j(vzgVar.j());
            folVar.h(vzgVar.g());
            folVar.e(vzgVar.i());
            if (vzgVar.h() != null && !TextUtils.isEmpty(vzgVar.h().d())) {
                LogUtil.e("GoodThingsData", "soldNum: ", vzgVar.h().d());
                folVar.c(vzgVar.h().d());
            }
            vyy[] vyyVarArrA = vzgVar.a();
            folVar.b((vyyVarArrA == null || vyyVarArrA.length <= 0 || (vyyVar = vyyVarArrA[0]) == null || vyyVar.e() == 0.0d) ? null : vyyVarArrA[0].a());
            String strD = vzgVar.d();
            if (!TextUtils.isEmpty(strD)) {
                folVar.g(b(vzgVar.i(), strD));
            }
            String strC = vzgVar.c();
            if (!TextUtils.isEmpty(strC) && !strC.equals(strD)) {
                folVar.f(b(vzgVar.i(), strC));
            }
            folVar.a(this.e);
            folVar.i(c(vzgVar));
            vyu vyuVarE = vzgVar.e();
            if (vyuVarE != null && (vyxVarB = vyuVarE.b()) != null) {
                folVar.d(vyxVarB.b());
            }
        }
        return this.f51742b;
    }

    private String b(String str, String str2) {
        float f;
        try {
            f = Float.parseFloat(str2);
        } catch (NumberFormatException unused) {
            LogUtil.c("GoodThingsData", "getMoneyString NumberFormatException");
            f = 0.0f;
        }
        if (Math.round(f) == f) {
            return String.format(Locale.ROOT, BaseApplication.b().getString(R.string.IDS_currency_money), str, String.valueOf((int) f));
        }
        return String.format(Locale.ROOT, BaseApplication.b().getString(R.string.IDS_currency_money), str, String.valueOf(f));
    }

    private String c(vzg vzgVar) {
        List<String> listF = vzgVar.f();
        StringBuilder sb = new StringBuilder();
        if (njy.e(listF)) {
            return null;
        }
        for (String str : listF) {
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
}
