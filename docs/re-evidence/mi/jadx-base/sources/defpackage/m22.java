package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.xiaomi.fitness.baseui.calendar.view.BaseCalendarView;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
public abstract class m22 extends eih {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f25666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25667b;
    public int c;
    public o93 d;
    public LocalDate e;

    public m22(Context context, o93 o93Var, LocalDate localDate) {
        this.f25666a = context;
        this.d = o93Var;
        this.e = localDate;
        LocalDate localDate2 = new LocalDate(o93Var.L);
        this.f25667b = b(localDate2, this.e, o93Var.x) + 1;
        this.c = b(localDate2, this.e, o93Var.x);
    }

    public int a() {
        return this.c;
    }

    public abstract int b(LocalDate localDate, LocalDate localDate2, int i);

    public abstract BaseCalendarView c(Context context, int i, LocalDate localDate, int i2, int i3);

    @Override // defpackage.eih
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // defpackage.eih
    public int getCount() {
        return this.f25667b;
    }

    @Override // defpackage.eih
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        BaseCalendarView baseCalendarViewC = c(this.f25666a, this.d.x, this.e, this.c, i);
        baseCalendarViewC.setTag(Integer.valueOf(i));
        viewGroup.addView(baseCalendarViewC);
        return baseCalendarViewC;
    }

    @Override // defpackage.eih
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }
}
