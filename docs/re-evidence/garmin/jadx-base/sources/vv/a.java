package vv;

import android.content.Context;
import android.view.View;
import bs2.c10;
import bs2.z3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lvv/a;", "Lfb2/a;", "Luv/i;", "Ltv/k;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends fb2.a<uv.i<tv.k>> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f180397i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        context.getClass();
        this.f180397i = View.generateViewId();
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        ((uv.i) obj).getClass();
        return true;
    }

    @Override // fb2.a
    public final boolean q(uv.i<tv.k> iVar) {
        Short shK;
        uv.i<tv.k> iVar2 = iVar;
        iVar2.getClass();
        tv.k kVar = (tv.k) iVar2.f172898a;
        if (kVar == null) {
            return false;
        }
        c10 c10Var = kVar.f166522a;
        z3 z3Var = null;
        if (c10Var != null && (shK = c10Var.k(11)) != null) {
            z3[] z3VarArrValues = z3.values();
            int length = z3VarArrValues.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    z3Var = z3.INVALID;
                    break;
                }
                z3 z3Var2 = z3VarArrValues[i14];
                if (shK.shortValue() == z3Var2.f20708a) {
                    z3Var = z3Var2;
                    break;
                }
                i14++;
            }
        }
        return Boolean.valueOf(z3Var == z3.TRUE).equals(Boolean.TRUE);
    }

    @Override // fb2.a
    /* JADX INFO: renamed from: s, reason: from getter */
    public final int getF180397i() {
        return this.f180397i;
    }

    @Override // fb2.a
    public final String t() {
        String strB = b(R.string.device_settings_vector_zero_offset_title);
        strB.getClass();
        return strB;
    }

    @Override // fb2.a
    public final void y(Object obj, boolean z14) {
        Short shK;
        uv.i iVar = (uv.i) obj;
        iVar.getClass();
        tv.k kVar = (tv.k) iVar.f172898a;
        if (kVar != null) {
            c10 c10Var = kVar.f166522a;
            z3 z3Var = z14 ? z3.TRUE : z3.FALSE;
            z3 z3Var2 = null;
            if (c10Var != null && (shK = c10Var.k(11)) != null) {
                z3[] z3VarArrValues = z3.values();
                int length = z3VarArrValues.length;
                int i14 = 0;
                while (true) {
                    if (i14 >= length) {
                        z3Var2 = z3.INVALID;
                        break;
                    }
                    z3 z3Var3 = z3VarArrValues[i14];
                    if (shK.shortValue() == z3Var3.f20708a) {
                        z3Var2 = z3Var3;
                        break;
                    }
                    i14++;
                }
            }
            if (z3Var2 != z3Var) {
                if (c10Var != null) {
                    c10Var.n(11, Short.valueOf(z3Var.f20708a));
                }
                kVar.f166524c = true;
            }
        }
    }
}
