package lh2;

import am.x0;
import android.content.Context;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class i implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f112501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f112502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f112503d;

    public /* synthetic */ i(Object obj, int i14, Object obj2, Object obj3) {
        this.f112500a = i14;
        this.f112503d = obj;
        this.f112501b = obj2;
        this.f112502c = obj3;
    }

    @Override // androidx.lifecycle.z0
    public final void onChanged(Object obj) {
        int i14 = this.f112500a;
        Object obj2 = this.f112502c;
        Object obj3 = this.f112501b;
        Object obj4 = this.f112503d;
        switch (i14) {
            case 0:
                int i15 = j.f112504d;
                ((j) obj4).i((ii2.b) obj3, (Map) obj2, null);
                break;
            case 1:
                int i16 = q.f112535e;
                ((q) obj4).i((ii2.b) obj3, (Map) obj2, null);
                break;
            case 2:
                int i17 = r.f112539j;
                ((r) obj4).i((ii2.b) obj3, (Map) obj2, null);
                break;
            case 3:
                int i18 = s.f112549d;
                ((s) obj4).i((ii2.b) obj3, (Map) obj2, null);
                break;
            default:
                lo.f fVar = (lo.f) obj4;
                am.l lVar = (am.l) obj3;
                x0 x0Var = (x0) obj2;
                am.l lVar2 = (am.l) obj;
                g22.e.f(fVar);
                if (lVar != lVar2) {
                    fVar.f113949a.O0(lVar2);
                    x0 x0VarH = am.z0.h(x0Var);
                    String string = fVar.getString(lVar2.b());
                    Context contextRequireContext = fVar.requireContext();
                    if (x0VarH != x0.f4304m) {
                        x0Var = x0VarH;
                    }
                    new androidx.appcompat.app.e.a(fVar.requireContext()).setTitle(R.string.title_activity_privacy).setMessage(fVar.getString(R.string.msg_activity_privacy_changed, string, dh.b.A(contextRequireContext, x0Var.f4360c))).setPositiveButton(R.string.lbl_ok, new jm0.c(14)).create().show();
                }
                break;
        }
    }
}
