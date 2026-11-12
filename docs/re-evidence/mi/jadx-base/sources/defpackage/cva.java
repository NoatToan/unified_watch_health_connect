package defpackage;

import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import org.joda.time.chrono.a;

/* JADX INFO: loaded from: classes3.dex */
public final class cva extends k5i {
    public final a d;

    public cva(a aVar, t67 t67Var) {
        super(DateTimeFieldType.dayOfWeek(), t67Var);
        this.d = aVar;
    }

    @Override // defpackage.o62
    public int a(String str, Locale locale) {
        return eva.h(locale).c(str);
    }

    @Override // defpackage.o62, defpackage.gq5
    public int get(long j) {
        return this.d.getDayOfWeek(j);
    }

    @Override // defpackage.o62, defpackage.gq5
    public String getAsShortText(int i, Locale locale) {
        return eva.h(locale).d(i);
    }

    @Override // defpackage.o62, defpackage.gq5
    public String getAsText(int i, Locale locale) {
        return eva.h(locale).e(i);
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getMaximumShortTextLength(Locale locale) {
        return eva.h(locale).i();
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getMaximumTextLength(Locale locale) {
        return eva.h(locale).j();
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getMaximumValue() {
        return 7;
    }

    @Override // defpackage.k5i, defpackage.o62, defpackage.gq5
    public int getMinimumValue() {
        return 1;
    }

    @Override // defpackage.o62, defpackage.gq5
    public t67 getRangeDurationField() {
        return this.d.weeks();
    }
}
