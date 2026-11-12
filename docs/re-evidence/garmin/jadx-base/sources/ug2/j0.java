package ug2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.garmin.android.apps.connectmobile.R;
import i3.fe;
import i3.se;
import i3.yd;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;
import p3.x3;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.ui.main.MainViewKt$MainView$7$1", f = "MainView.kt", l = {}, m = "invokeSuspend", v = 2)
public final class j0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f170825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x3<Boolean> f170826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f170827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fe f170828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f170829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c.q<Intent, f.a> f170830f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f170831g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x3<Boolean> f170832h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.livesessionview.ui.main.MainViewKt$MainView$7$1$1", f = "MainView.kt", l = {332, 335, 342, 353}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f170833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fe f170834b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f170835c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c.q<Intent, f.a> f170836d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f170837e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ x3<Boolean> f170838f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fe feVar, Context context, c.q<Intent, f.a> qVar, p1<Boolean> p1Var, x3<Boolean> x3Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f170834b = feVar;
            this.f170835c = context;
            this.f170836d = qVar;
            this.f170837e = p1Var;
            this.f170838f = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f170834b, this.f170835c, this.f170836d, this.f170837e, this.f170838f, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0073, code lost:
        
            if (i3.fe.b(r14.f170834b, r1, null, r0, r14, 6) == r6) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00a5, code lost:
        
            if (r0 == r6) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00e2, code lost:
        
            if (r0 == r6) goto L33;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objB2;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f170833a;
            c.q<Intent, f.a> qVar = this.f170836d;
            Context context = this.f170835c;
            if (i14 == 0) {
                o13.r.b(obj);
                e53.c.a aVar2 = e53.c.f63094b;
                long jF = e53.e.f(200L, e53.f.MILLISECONDS);
                this.f170833a = 1;
                if (o53.m0.c(jF, this) != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else if (i14 == 2) {
                o13.r.b(obj);
            } else if (i14 == 3) {
                o13.r.b(obj);
                objB2 = obj;
                if (((se) objB2) == se.ActionPerformed) {
                    context.getClass();
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.fromParts("package", context.getPackageName(), null));
                    qVar.a(intent, null);
                }
                Unit unit = Unit.INSTANCE;
            } else {
                if (i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                objB = obj;
                if (((se) objB) == se.ActionPerformed) {
                    context.getClass();
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.fromParts("package", context.getPackageName(), null));
                    qVar.a(intent2, null);
                }
                Unit unit2 = Unit.INSTANCE;
            }
            return Unit.INSTANCE;
            if (this.f170837e.getF182175a().booleanValue()) {
                String string = context.getString(R.string.lbl_gps_ready);
                string.getClass();
                yd ydVar = yd.Short;
                this.f170833a = 2;
            } else {
                boolean zBooleanValue = this.f170838f.getF182175a().booleanValue();
                fe feVar = this.f170834b;
                if (zBooleanValue) {
                    String string2 = context.getString(R.string.msg_set_location_access_to_enable_GPS_data);
                    string2.getClass();
                    String string3 = context.getString(R.string.lbl_enable);
                    yd ydVar2 = yd.Long;
                    this.f170833a = 3;
                    objB2 = fe.b(feVar, string2, string3, ydVar2, this, 4);
                } else {
                    String string4 = context.getString(R.string.lbl_gps_disabled);
                    string4.getClass();
                    String string5 = context.getString(R.string.lbl_enable);
                    yd ydVar3 = yd.Long;
                    this.f170833a = 4;
                    objB = fe.b(feVar, string4, string5, ydVar3, this, 4);
                }
            }
            return aVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(o53.b0 b0Var, x3<Boolean> x3Var, p1<Boolean> p1Var, fe feVar, Context context, c.q<Intent, f.a> qVar, p1<Boolean> p1Var2, x3<Boolean> x3Var2, t13.d<? super j0> dVar) {
        super(2, dVar);
        this.f170825a = b0Var;
        this.f170826b = x3Var;
        this.f170827c = p1Var;
        this.f170828d = feVar;
        this.f170829e = context;
        this.f170830f = qVar;
        this.f170831g = p1Var2;
        this.f170832h = x3Var2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j0(this.f170825a, this.f170826b, this.f170827c, this.f170828d, this.f170829e, this.f170830f, this.f170831g, this.f170832h, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (this.f170826b.getF182175a().booleanValue()) {
            p1<Boolean> p1Var = this.f170827c;
            if (!p1Var.getF182175a().booleanValue()) {
                p1Var.setValue(Boolean.TRUE);
                ge1.b.T(this.f170825a, null, null, new a(this.f170828d, this.f170829e, this.f170830f, this.f170831g, this.f170832h, null), 3);
            }
        }
        return Unit.INSTANCE;
    }
}
