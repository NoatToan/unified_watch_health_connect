package vt;

import android.content.Context;
import android.net.Uri;
import com.google.gson.Gson;
import e23.p;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import o13.r;
import o53.b0;
import o53.c2;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import u53.o;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.annual_report.developer_option.FirstFragment$updateAnnualReportDTOFromFile$1", f = "FirstFragment.kt", l = {112}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f179996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f179997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vt.b f179998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Uri f179999d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.annual_report.developer_option.FirstFragment$updateAnnualReportDTOFromFile$1$1", f = "FirstFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ vt.b f180000a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(vt.b bVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f180000a = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f180000a, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            vt.b bVar = this.f180000a;
            ut.b bVar2 = bVar.f179993a;
            bVar2.getClass();
            bVar2.f172553c.setText(bVar.f179994b);
            ut.b bVar3 = bVar.f179993a;
            bVar3.getClass();
            bVar3.f172553c.setEnabled(true);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.annual_report.developer_option.FirstFragment$updateAnnualReportDTOFromFile$1$job$1", f = "FirstFragment.kt", l = {109, 110}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f180001a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ xt.a f180002b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ tt.i f180003c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ vt.b f180004d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xt.a aVar, tt.i iVar, vt.b bVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f180002b = aVar;
            this.f180003c = iVar;
            this.f180004d = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f180002b, this.f180003c, this.f180004d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
        
            if (r7.j(r1, r3, r6) == r0) goto L18;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f180001a;
            tt.i iVar = this.f180003c;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
            r.b(obj);
            iVar.getClass();
            this.f180001a = 1;
            xt.a aVar = this.f180002b;
            aVar.getClass();
            x53.c cVar = s0.f129406a;
            Object objE0 = ge1.b.e0(x53.b.f189152a, new xt.b(aVar, iVar, null), this);
            if (objE0 != obj2) {
                objE0 = Unit.INSTANCE;
            }
            if (objE0 != obj2) {
            }
            return obj2;
            bu.f fVar = bu.f.f21180a;
            Context contextRequireContext = this.f180004d.requireContext();
            contextRequireContext.getClass();
            iVar.getClass();
            this.f180001a = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(vt.b bVar, Uri uri, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f179998c = bVar;
        this.f179999d = uri;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c cVar = new c(this.f179998c, this.f179999d, dVar);
        cVar.f179997b = obj;
        return cVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws FileNotFoundException {
        b0 b0Var = (b0) this.f179997b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f179996a;
        vt.b bVar = this.f179998c;
        if (i14 == 0) {
            r.b(obj);
            Context contextRequireContext = bVar.requireContext();
            contextRequireContext.getClass();
            pt.i iVar = pt.i.f140571a;
            Uri uri = this.f179999d;
            uri.getClass();
            StringBuilder sb3 = new StringBuilder();
            InputStream inputStreamOpenInputStream = contextRequireContext.getContentResolver().openInputStream(uri);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenInputStream));
                try {
                    for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                        sb3.append(line);
                    }
                    Unit unit = Unit.INSTANCE;
                    bufferedReader.close();
                    jg.b.l(inputStreamOpenInputStream, null);
                    c2 c2VarT = ge1.b.T(b0Var, null, null, new b((xt.a) KoinJavaComponent.get$default(xt.a.class, null, null, 6, null), (tt.i) new Gson().fromJson(sb3.toString(), tt.i.class), bVar, null), 3);
                    this.f179997b = b0Var;
                    this.f179996a = 1;
                    if (c2VarT.P(this) == aVar) {
                        return aVar;
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        jg.b.l(bufferedReader, th3);
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    jg.b.l(inputStreamOpenInputStream, th5);
                    throw th6;
                }
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        x53.c cVar = s0.f129406a;
        ge1.b.T(b0Var, o.f168762a, null, new a(bVar, null), 2);
        return Unit.INSTANCE;
    }
}
