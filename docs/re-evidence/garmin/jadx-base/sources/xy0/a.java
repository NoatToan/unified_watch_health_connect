package xy0;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.R;
import f12.l;
import java.util.Iterator;
import p005kotlin.Unit;
import r53.p2;
import wd2.m;
import wd2.m1;
import wd2.z1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f192655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f192656b;

    public /* synthetic */ a(c cVar, int i14) {
        this.f192655a = i14;
        this.f192656b = cVar;
    }

    @Override // e23.a
    public final Object invoke() {
        Object value;
        Object value2;
        switch (this.f192655a) {
            case 0:
                c cVar = this.f192656b;
                if (cVar.f192665h) {
                    cVar.f192665h = false;
                    p2 p2Var = cVar.f192666i;
                    do {
                        value = p2Var.getValue();
                    } while (!p2Var.b(value, c.C3603c.a((c.C3603c) value, true, null, null, false, false, 62)));
                    ge1.b.T(v1.a(cVar), null, null, new e(cVar, null), 3);
                }
                break;
            case 1:
                c cVar2 = this.f192656b;
                p2 p2Var2 = cVar2.f192666i;
                if (m.a().isEmpty()) {
                    Context context = cVar2.f192663f.f173079a;
                    SharedPreferences sharedPreferences = context.getSharedPreferences(a7.b.getString(context, R.string.one_time_shared_pref_name), 0);
                    sharedPreferences.getClass();
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.remove(a7.b.getString(context, R.string.one_time_shared_pref_key));
                    editorEdit.apply();
                    l.f68084a.getClass();
                    l.a.a().K0();
                    c22.m.a(l.a.a().E2());
                    cVar2.y4(false);
                    ge1.b.T(v1.a(cVar2), null, null, new d(cVar2, null), 3);
                } else if (((c.C3603c) p2Var2.getValue()).f192681d) {
                    cVar2.y4(false);
                    do {
                        value2 = p2Var2.getValue();
                    } while (!p2Var2.b(value2, c.C3603c.a((c.C3603c) value2, false, null, null, false, false, 31)));
                } else {
                    cVar2.z4();
                }
                break;
            case 2:
                this.f192656b.y4(false);
                break;
            case 3:
                this.f192656b.z4();
                break;
            case 4:
                c cVar3 = this.f192656b;
                m1 m1Var = ((c.C3603c) cVar3.f192666i.getValue()).f192680c;
                if (m1Var != null) {
                    Iterator<z1> it = m.a().iterator();
                    m1Var.f(it.hasNext() ? it.next().f184693a : -1L, new ge2.e(null, null, Boolean.FALSE, null, null, null, null, 64, null));
                }
                cVar3.z4();
                break;
            default:
                c cVar4 = this.f192656b;
                ge1.b.T(v1.a(cVar4), null, null, new d(cVar4, null), 3);
                break;
        }
        return Unit.INSTANCE;
    }
}
