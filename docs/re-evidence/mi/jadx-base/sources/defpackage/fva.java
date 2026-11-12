package defpackage;

import java.util.Locale;
import org.joda.time.chrono.a;

/* JADX INFO: loaded from: classes3.dex */
public final class fva extends ng2 {
    public fva(a aVar) {
        super(aVar, 2);
    }

    @Override // defpackage.o62
    public int a(String str, Locale locale) {
        return eva.h(locale).r(str);
    }

    @Override // defpackage.o62, defpackage.gq5
    public String getAsShortText(int i, Locale locale) {
        return eva.h(locale).s(i);
    }

    @Override // defpackage.o62, defpackage.gq5
    public String getAsText(int i, Locale locale) {
        return eva.h(locale).t(i);
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getMaximumShortTextLength(Locale locale) {
        return eva.h(locale).m();
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getMaximumTextLength(Locale locale) {
        return eva.h(locale).n();
    }
}
