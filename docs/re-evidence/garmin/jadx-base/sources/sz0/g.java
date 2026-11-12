package sz0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import java.text.NumberFormat;

/* JADX INFO: loaded from: classes9.dex */
public final class g {
    public static final void a(Context context, long j8) {
        String str = NumberFormat.getIntegerInstance().format(j8);
        c22.f fVar = c22.f.f23050a;
        String string = context.getString(R.string.pregnancy_limit_reached);
        String string2 = context.getString(R.string.accounts_you_can_view_limit, str);
        String string3 = context.getString(R.string.lbl_ok);
        string3.getClass();
        c22.f.d(fVar, context, string, string2, new o13.p(string3, new sv0.b(19)), null, null, false, 112).show();
    }

    public static final void b(Context context, m mVar) {
        mVar.getClass();
        new androidx.appcompat.app.e.a(context).setTitle(context.getString(mVar.f161452a)).setCancelable(false).setMessage(context.getString(mVar.f161453b)).setPositiveButton(R.string.lbl_ok, new qh1.j(13)).show();
    }
}
