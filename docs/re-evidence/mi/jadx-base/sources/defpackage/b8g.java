package defpackage;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes10.dex */
public class b8g extends AndroidViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Date f3921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3922b;
    public int c;
    public b8h d;
    public Calendar e;

    public b8g(Application application) {
        super(application);
        this.f3922b = -1;
        this.c = -1;
        this.e = Calendar.getInstance();
    }

    public int a() {
        return this.c;
    }

    public Date b() {
        if (this.f3921a == null) {
            this.e.setTimeInMillis(System.currentTimeMillis());
            this.f3921a = this.e.getTime();
        }
        return this.f3921a;
    }

    public int c() {
        return this.f3922b;
    }

    public boolean d() {
        Calendar calendar = this.e;
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        calendar.setTimeInMillis(b().getTime());
        return i == calendar.get(1) && i2 == calendar.get(2) && i3 == calendar.get(5);
    }

    public void e(int i) {
        this.c = i;
    }

    public void f(Date date) {
        this.f3921a = date;
        b8h b8hVar = this.d;
        if (b8hVar != null) {
            b8hVar.q(date);
        }
    }

    public void g(int i) {
        this.f3922b = i;
    }

    public void setOnDateSelectedListener(b8h b8hVar) {
        this.d = b8hVar;
    }
}
