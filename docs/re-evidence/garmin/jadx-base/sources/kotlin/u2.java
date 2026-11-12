package kotlin;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import e23.p;
import h4.s;
import o53.c0;
import o53.c2;
import p1.t0;
import p3.z1;
import q53.b;
import q53.l;
import r53.k2;
import r53.o2;
import t13.g;
import u53.d;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li5/u2;", "Lh4/s;", "Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u2 implements s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f91584e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f91585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f91586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1 f91587c = new z1(1.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c2 f91588d;

    public u2(Context context) {
        this.f91585a = context;
    }

    @Override // t13.g
    public final <R> R fold(R r14, p<? super R, ? super g.a, ? extends R> pVar) {
        return (R) g.a.C3052a.a(this, r14, pVar);
    }

    @Override // t13.g
    public final <E extends g.a> E get(g.b<E> bVar) {
        return (E) g.a.C3052a.b(this, bVar);
    }

    @Override // t13.g
    public final g minusKey(g.b<?> bVar) {
        return g.a.C3052a.c(this, bVar);
    }

    @Override // t13.g
    public final g plus(g gVar) {
        return g.a.C3052a.d(gVar, this);
    }

    @Override // h4.s
    public final float z() {
        o2<Float> o2Var;
        if (this.f91588d == null) {
            Context context = this.f91585a;
            t0<Context, o2<Float>> t0Var = s4.f91480a;
            synchronized (t0Var) {
                try {
                    o2<Float> o2VarD = t0Var.d(context);
                    if (o2VarD == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        b bVarA = l.a(-1, 6, null);
                        o2VarD = r53.s.K(new r53.c2(new q4(contentResolver, uriFor, new r4(bVarA, Handler.createAsync(Looper.getMainLooper())), bVarA, context, null)), c0.b(), k2.a.a(k2.f150703a, 3), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                        t0Var.m(context, o2VarD);
                    }
                    o2Var = o2VarD;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            this.f91587c.i(o2Var.getValue().floatValue());
            d dVar = this.f91586b;
            if (dVar == null) {
                h.z("MotionDurationScale scale factor requested before recomposer loop start");
                return 0.0f;
            }
            this.f91588d = ge1.b.T(dVar, null, null, new t2(o2Var, this, null), 3);
        }
        return this.f91587c.getFloatValue();
    }
}
