package go1;

import android.content.Context;
import androidx.lifecycle.z0;
import c22.b3;
import com.garmin.android.apps.connectmobile.g3;
import lc.u0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wg0.a f78231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f78232c;

    public /* synthetic */ e(wg0.a aVar, k kVar, int i14) {
        this.f78230a = i14;
        this.f78231b = aVar;
        this.f78232c = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.z0
    public final void onChanged(Object obj) {
        Context context;
        int i14 = this.f78230a;
        k kVar = this.f78232c;
        wg0.a aVar = this.f78231b;
        switch (i14) {
            case 0:
                wg0.m mVar = aVar.f185060t;
                g3 g3Var = (g3) obj;
                int i15 = k.C;
                g3Var.getClass();
                int i16 = k.b.f78275a[g3Var.f35300a.ordinal()];
                if (i16 != 1) {
                    if (i16 == 2) {
                        if (mVar != null) {
                            mVar.f185114g = false;
                        }
                        kVar.J6(aVar);
                    } else if (i16 != 3) {
                        u0.r();
                    } else {
                        if (mVar != null) {
                            mVar.f185114g = false;
                        }
                        if (mVar != null) {
                            mVar.d();
                        }
                        kVar.J6(aVar);
                    }
                }
                break;
            default:
                wg0.m mVar2 = aVar.f185060t;
                g3 g3Var2 = (g3) obj;
                int i17 = k.C;
                g3Var2.getClass();
                int i18 = k.b.f78275a[g3Var2.f35300a.ordinal()];
                if (i18 != 1) {
                    if (i18 == 2) {
                        if (mVar2 != null) {
                            mVar2.f185114g = false;
                        }
                        mo1.f fVar = (mo1.f) g3Var2.f35301b;
                        if (fVar != null) {
                            if (((mVar2 != null ? mVar2.f185111d : null) == null || mVar2.f185110c == null) && mVar2 != null) {
                                mVar2.f185111d = fVar.getUuid();
                                mVar2.f185110c = Long.valueOf(fVar.getConversationLikePk());
                            }
                        } else if (mVar2 != null) {
                            mVar2.d();
                        }
                        kVar.J6(aVar);
                        break;
                    } else if (i18 != 3) {
                        u0.r();
                        break;
                    } else {
                        if (mVar2 != null) {
                            mVar2.f185114g = false;
                        }
                        if (mVar2 != null) {
                            mVar2.d();
                        }
                        kVar.J6(aVar);
                        if (zy0.g.a(g3Var2.f35304e) && (context = kVar.getContext()) != null) {
                            b3.c(context);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
