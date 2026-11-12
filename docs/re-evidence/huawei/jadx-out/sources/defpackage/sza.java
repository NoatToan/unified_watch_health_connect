package defpackage;

import android.content.Context;
import com.huawei.ui.homehealth.runcard.trackfragments.models.SportNounChildData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class sza {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SportNounChildData f48821c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f48819a = false;
    private String e = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<syx> f48820b = new ArrayList(10);

    public sza(String str, int i, Context context) {
        this.f48821c = new SportNounChildData(context);
        a(str, i);
    }

    private void a(String str, int i) {
        e(str);
        switch (i) {
            case 0:
                this.f48820b = this.f48821c.b();
                break;
            case 1:
                this.f48820b = this.f48821c.i();
                break;
            case 2:
                this.f48820b = this.f48821c.h();
                break;
            case 3:
                this.f48820b = this.f48821c.o();
                break;
            case 4:
                this.f48820b = this.f48821c.g();
                break;
            case 5:
                this.f48820b = this.f48821c.d();
                break;
            case 6:
                this.f48820b = this.f48821c.f();
                break;
            case 7:
                this.f48820b = this.f48821c.c();
                break;
        }
    }

    public int d() {
        List<syx> list = this.f48820b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public syx e(int i) {
        if (njy.e(this.f48820b, i)) {
            return null;
        }
        return this.f48820b.get(i);
    }

    public void d(boolean z) {
        this.f48819a = z;
    }

    public String c() {
        return this.e;
    }

    public void e(String str) {
        this.e = str;
    }
}
