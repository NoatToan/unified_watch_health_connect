package defpackage;

import android.content.Context;
import com.xiaomi.fitness.baseui.calendar.view.BaseCalendarView;
import com.xiaomi.fitness.baseui.calendar.view.MonthView;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
public class u7g extends m22 {
    public a8h f;
    public o93 g;

    public u7g(Context context, o93 o93Var, LocalDate localDate, a8h a8hVar) {
        super(context, o93Var, localDate);
        this.g = o93Var;
        this.f = a8hVar;
    }

    @Override // defpackage.m22
    public int b(LocalDate localDate, LocalDate localDate2, int i) {
        return TimeDateUtil.getIntervalMonths(localDate, localDate2);
    }

    @Override // defpackage.m22
    public BaseCalendarView c(Context context, int i, LocalDate localDate, int i2, int i3) {
        return new MonthView(context, localDate.plusMonths(i3 - i2), this.g, i, this.f);
    }
}
