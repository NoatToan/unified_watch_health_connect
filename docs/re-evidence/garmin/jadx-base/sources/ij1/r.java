package ij1;

import android.content.Context;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import p005kotlin.Metadata;
import p13.w;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lij1/r;", "Lh82/c;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r extends h82.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f93892k = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f93893f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ej1.b f93894g = ej1.b.WEARABLE_DEVICE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f93895h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f93896i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f93897j;

    @Override // h82.c
    public final void a(Bundle bundle, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-1872220230);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(bundle) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(this) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            super.a(bundle, o0VarE, i15 & 126);
            this.f93893f = bundle.getBoolean("GCM_extra_primary_device", false);
            int i16 = bundle.getInt("GCM_extra_primary_device_ui_state", -1);
            if (i16 > -1) {
                this.f93894g = ej1.b.values()[i16];
            }
            this.f93895h = bundle.getBoolean("GCM_extra_primary_device_has_pw_ptd", false);
            this.f93896i = bundle.getBoolean("GCM_extra_primary_device_has_partial_comptible", false);
            this.f93897j = bundle.getBoolean("GCM_extra_primary_device_has_incomptible", false);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f2.o(this, bundle, i14, 29);
        }
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        return w.c(new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new z3.e(435686925, true, new o(this, 0)), 4, null));
    }

    public final void g(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1478561757);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(-1599746902, new o(this, i16), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(this, i14, 0);
        }
    }

    public final void h(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1605307962);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = p3.n.f135158a;
            a.f93817a.getClass();
            h82.e.a(a.f93818b, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(this, i14, 1);
        }
    }
}
