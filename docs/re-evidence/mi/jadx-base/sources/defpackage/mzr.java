package defpackage;

import android.content.Context;
import com.xiaomi.fitness.baseui.widget.YearMonthDayDialog;

/* JADX INFO: loaded from: classes10.dex */
public class mzr implements kwc<YearMonthDayDialog, Context> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27392a;

    public mzr(String str) {
        this.f27392a = str;
    }

    @Override // defpackage.kwc
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public YearMonthDayDialog a(Context context, int i) {
        return new YearMonthDayDialog.a(this.f27392a).setCustomLayoutId(nvi.c).setPositiveText(o1j.T).setNegativeText(o1j.f28645b).setCancelable(true).create();
    }
}
