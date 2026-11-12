package vd0;

import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import java.util.Locale;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f1 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f177255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ oe0.s f177256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f177257c;

    public /* synthetic */ f1(oe0.s sVar, p3.p1 p1Var, int i14) {
        this.f177255a = i14;
        this.f177256b = sVar;
        this.f177257c = p1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        String str;
        Object value;
        String upperCase;
        Boolean bool;
        Object value2;
        switch (this.f177255a) {
            case 0:
                dialogInterface.getClass();
                int checkedItemPosition = ((androidx.appcompat.app.e) dialogInterface).f4658a.f4596g.getCheckedItemPosition();
                if (checkedItemPosition != 1) {
                    str = checkedItemPosition != 2 ? PrivacyUpdateRequestError.UNKNOWN : je0.g.MALE.f98524a;
                } else {
                    str = je0.g.FEMALE.f98524a;
                }
                oe0.s sVar = this.f177256b;
                sVar.getClass();
                str.getClass();
                p2 p2Var = sVar.f131412h;
                do {
                    value = p2Var.getValue();
                    Locale locale = Locale.getDefault();
                    locale.getClass();
                    upperCase = str.toUpperCase(locale);
                    upperCase.getClass();
                } while (!p2Var.b(value, pe0.j.a((pe0.j) value, null, null, null, je0.g.valueOf(upperCase), null, 0.0d, null, null, false, null, null, 2039)));
                this.f177257c.setValue(Boolean.FALSE);
                break;
            default:
                dialogInterface.getClass();
                int checkedItemPosition2 = ((androidx.appcompat.app.e) dialogInterface).f4658a.f4596g.getCheckedItemPosition();
                if (checkedItemPosition2 != 1) {
                    bool = checkedItemPosition2 != 2 ? null : Boolean.TRUE;
                } else {
                    bool = Boolean.FALSE;
                }
                Boolean bool2 = bool;
                p2 p2Var2 = this.f177256b.f131412h;
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, pe0.j.a((pe0.j) value2, null, null, null, null, bool2, 0.0d, null, null, false, null, null, 2031)));
                this.f177257c.setValue(Boolean.FALSE);
                break;
        }
    }
}
