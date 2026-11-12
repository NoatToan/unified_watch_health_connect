package wi2;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.h1;
import androidx.lifecycle.n0;
import androidx.lifecycle.v1;
import c.w;
import c2.u;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.library.mobileauth.ui.mfa.MFAPortalFlowActivity;
import com.garmin.auth.cmc.data.network.RefreshUserProfileWorker;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import f5.z0;
import h5.e0;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import l72.c1;
import li0.y;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p008y1.m2;
import p3.b4;
import p3.c2;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import re2.g0;
import re2.l0;
import u1.a2;
import u1.d2;
import ue.i0;
import ue.v;
import ue.x;
import ve.t0;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.auth.cmc.presentation.CMCPortalContentView_androidKt$CMCPortalScreen$1$1", f = "CMCPortalContentView.android.kt", l = {146}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f185590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.b0 f185591b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f185592c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f185593d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ d2 f185594e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ e23.l<ti2.b, Unit> f185595f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ p1<ti2.b.a> f185596g;

        /* JADX INFO: renamed from: wi2.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
        @v13.e(c = "com.garmin.auth.cmc.presentation.CMCPortalContentView_androidKt$CMCPortalScreen$1$1$1", f = "CMCPortalContentView.android.kt", l = {147}, m = "invokeSuspend")
        public static final class C3442a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f185597a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f185598b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Context f185599c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ d2 f185600d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ e23.l<ti2.b, Unit> f185601e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ p1<ti2.b.a> f185602f;

            /* JADX INFO: renamed from: wi2.b$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class C3443a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ e f185603a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Context f185604b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ d2 f185605c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ e23.l<ti2.b, Unit> f185606d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ p1<ti2.b.a> f185607e;

                /* JADX INFO: renamed from: wi2.b$a$a$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @v13.e(c = "com.garmin.auth.cmc.presentation.CMCPortalContentView_androidKt$CMCPortalScreen$1$1$1$1", f = "CMCPortalContentView.android.kt", l = {158}, m = "emit")
                public static final class C3444a extends v13.c {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public ti2.b f185608a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public /* synthetic */ Object f185609b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ C3443a<T> f185610c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public int f185611d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C3444a(C3443a<? super T> c3443a, t13.d<? super C3444a> dVar) {
                        super(dVar);
                        this.f185610c = c3443a;
                    }

                    @Override // v13.a
                    public final Object invokeSuspend(Object obj) {
                        this.f185609b = obj;
                        this.f185611d |= Integer.MIN_VALUE;
                        return this.f185610c.emit(null, this);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public C3443a(e eVar, Context context, d2 d2Var, e23.l<? super ti2.b, Unit> lVar, p1<ti2.b.a> p1Var) {
                    this.f185603a = eVar;
                    this.f185604b = context;
                    this.f185605c = d2Var;
                    this.f185606d = lVar;
                    this.f185607e = p1Var;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // r53.j
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(ti2.b bVar, t13.d<? super Unit> dVar) {
                    C3444a c3444a;
                    if (dVar instanceof C3444a) {
                        c3444a = (C3444a) dVar;
                        int i14 = c3444a.f185611d;
                        if ((i14 & Integer.MIN_VALUE) != 0) {
                            c3444a.f185611d = i14 - Integer.MIN_VALUE;
                        } else {
                            c3444a = new C3444a(this, dVar);
                        }
                    } else {
                        c3444a = new C3444a(this, dVar);
                    }
                    Object obj = c3444a.f185609b;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i15 = c3444a.f185611d;
                    e eVar = this.f185603a;
                    if (i15 == 0) {
                        o13.r.b(obj);
                        if (bVar instanceof ti2.b.a) {
                            this.f185607e.setValue((ti2.b.a) bVar);
                        } else if (s.g(bVar, ti2.b.g.f164602a)) {
                            eVar.getClass();
                            ge1.b.T(v1.a(eVar), null, null, new l(eVar, null), 3);
                        } else if (bVar instanceof ti2.b.f) {
                            String str = ((ti2.b.f) bVar).f164601a;
                            eVar.getClass();
                            str.getClass();
                            ge1.b.T(v1.a(eVar), null, null, new f(eVar, str, null), 3);
                        } else if (bVar instanceof ti2.b.d) {
                            eVar.getClass();
                            ge1.b.T(v1.a(eVar), null, null, new h(eVar, null), 3);
                        } else {
                            boolean z14 = bVar instanceof ti2.b.c;
                            Context context = this.f185604b;
                            if (z14) {
                                String str2 = ((ti2.b.c) bVar).f164598a;
                                try {
                                    try {
                                        String string = new URL(str2).toString();
                                        string.getClass();
                                        a7.b.startActivity(context, new Intent("android.intent.action.VIEW", Uri.parse(string)), null);
                                    } catch (ActivityNotFoundException unused) {
                                        zy2.c.f207527a.a("PortalScreen").a(null, "CMCEvent.ExternalLink: no Android activity found to handle 'Intent(Intent.ACTION_VIEW, " + str2 + ")'");
                                    } catch (MalformedURLException e4) {
                                        zy2.c.f207527a.a("PortalScreen").error("CMCEvent.ExternalLink: invalid URL [" + str2 + "]", e4);
                                    }
                                } finally {
                                    eVar.z4();
                                }
                            } else if (s.g(bVar, ti2.b.j.f164605a)) {
                                RefreshUserProfileWorker.f50706g.getClass();
                                context.getClass();
                                t0 t0VarO = com.airbnb.lottie.animation.keyframe.a.o(i0.f170088a, context);
                                ue.l lVar = ue.l.REPLACE;
                                x.a aVar2 = new x.a((Class<? extends androidx.work.d>) RefreshUserProfileWorker.class);
                                ue.f.a aVar3 = new ue.f.a();
                                aVar3.b(v.CONNECTED);
                                aVar2.f170098c.f26950j = aVar3.a();
                                t0VarO.a("RefreshUserProfileWorker", lVar, aVar2.a()).a();
                            } else if (s.g(bVar, ti2.b.e.f164600a)) {
                                c3444a.f185608a = bVar;
                                c3444a.f185611d = 1;
                                d2 d2Var = this.f185605c;
                                if (m2.b(d2Var, 0 - d2Var.f167433a.getIntValue(), c3444a) == aVar) {
                                    return aVar;
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bVar = c3444a.f185608a;
                    o13.r.b(obj);
                    eVar.z4();
                    this.f185606d.invoke(bVar);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C3442a(e eVar, Context context, d2 d2Var, e23.l<? super ti2.b, Unit> lVar, p1<ti2.b.a> p1Var, t13.d<? super C3442a> dVar) {
                super(2, dVar);
                this.f185598b = eVar;
                this.f185599c = context;
                this.f185600d = d2Var;
                this.f185601e = lVar;
                this.f185602f = p1Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C3442a(this.f185598b, this.f185599c, this.f185600d, this.f185601e, this.f185602f, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C3442a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f185597a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    r53.e eVarF = r53.s.F(this.f185598b.f185646g);
                    C3443a c3443a = new C3443a(this.f185598b, this.f185599c, this.f185600d, this.f185601e, this.f185602f);
                    this.f185597a = 1;
                    if (eVarF.collect(c3443a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(androidx.lifecycle.b0 b0Var, e eVar, Context context, d2 d2Var, e23.l<? super ti2.b, Unit> lVar, p1<ti2.b.a> p1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f185591b = b0Var;
            this.f185592c = eVar;
            this.f185593d = context;
            this.f185594e = d2Var;
            this.f185595f = lVar;
            this.f185596g = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f185591b, this.f185592c, this.f185593d, this.f185594e, this.f185595f, this.f185596g, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f185590a;
            if (i14 == 0) {
                o13.r.b(obj);
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
                C3442a c3442a = new C3442a(this.f185592c, this.f185593d, this.f185594e, this.f185595f, this.f185596g, null);
                this.f185590a = 1;
                if (h1.a(this.f185591b, bVar, c3442a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: wi2.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.auth.cmc.presentation.CMCPortalContentView_androidKt$CMCPortalScreen$2$1", f = "CMCPortalContentView.android.kt", l = {169}, m = "invokeSuspend")
    public static final class C3445b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f185612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.b0 f185613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f185614c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.l<ti2.c, Unit> f185615d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Context f185616e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ c.q<Intent, f.a> f185617f;

        /* JADX INFO: renamed from: wi2.b$b$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
        @v13.e(c = "com.garmin.auth.cmc.presentation.CMCPortalContentView_androidKt$CMCPortalScreen$2$1$1", f = "CMCPortalContentView.android.kt", l = {170}, m = "invokeSuspend")
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f185618a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f185619b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e f185620c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ e23.l<ti2.c, Unit> f185621d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Context f185622e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ c.q<Intent, f.a> f185623f;

            /* JADX INFO: renamed from: wi2.b$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class C3446a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ b0 f185624a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ e23.l<ti2.c, Unit> f185625b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Context f185626c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ e f185627d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ c.q<Intent, f.a> f185628e;

                /* JADX INFO: renamed from: wi2.b$b$a$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @v13.e(c = "com.garmin.auth.cmc.presentation.CMCPortalContentView_androidKt$CMCPortalScreen$2$1$1$1", f = "CMCPortalContentView.android.kt", l = {TsExtractor.TS_STREAM_TYPE_AC4, SyslogConstants.LOG_LOCAL6}, m = "emit")
                public static final class C3447a extends v13.c {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public Context f185629a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public c.q f185630b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public String f185631c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public URI f185632d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public /* synthetic */ Object f185633e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ C3446a<T> f185634f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    public int f185635g;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C3447a(C3446a<? super T> c3446a, t13.d<? super C3447a> dVar) {
                        super(dVar);
                        this.f185634f = c3446a;
                    }

                    @Override // v13.a
                    public final Object invokeSuspend(Object obj) {
                        this.f185633e = obj;
                        this.f185635g |= Integer.MIN_VALUE;
                        return this.f185634f.emit(null, this);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public C3446a(b0 b0Var, e23.l<? super ti2.c, Unit> lVar, Context context, e eVar, c.q<Intent, f.a> qVar) {
                    this.f185624a = b0Var;
                    this.f185625b = lVar;
                    this.f185626c = context;
                    this.f185627d = eVar;
                    this.f185628e = qVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0019  */
                @Override // r53.j
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(ti2.c cVar, t13.d<? super Unit> dVar) throws Throwable {
                    C3447a c3447a;
                    String str;
                    Context context;
                    URI uri;
                    c.q<Intent, f.a> qVar;
                    if (dVar instanceof C3447a) {
                        c3447a = (C3447a) dVar;
                        int i14 = c3447a.f185635g;
                        if ((i14 & Integer.MIN_VALUE) != 0) {
                            c3447a.f185635g = i14 - Integer.MIN_VALUE;
                        } else {
                            c3447a = new C3447a(this, dVar);
                        }
                    } else {
                        c3447a = new C3447a(this, dVar);
                    }
                    Object objE0 = c3447a.f185633e;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i15 = c3447a.f185635g;
                    e23.l<ti2.c, Unit> lVar = this.f185625b;
                    if (i15 == 0) {
                        o13.r.b(objE0);
                        if (cVar instanceof ti2.c.f) {
                            c3447a.f185635g = 1;
                            x53.c cVar2 = s0.f129406a;
                            objE0 = ge1.b.e0(x53.b.f189152a, new c(null), c3447a);
                            if (objE0 != aVar) {
                            }
                            return aVar;
                        }
                        lVar.invoke(cVar);
                        return Unit.INSTANCE;
                    }
                    if (i15 == 1) {
                        o13.r.b(objE0);
                    } else {
                        if (i15 != 2) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        URI uri2 = c3447a.f185632d;
                        String str2 = c3447a.f185631c;
                        qVar = c3447a.f185630b;
                        Context context2 = c3447a.f185629a;
                        o13.r.b(objE0);
                        uri = uri2;
                        context = context2;
                        str = str2;
                    }
                    ve2.e eVar = (ve2.e) objE0;
                    MFAPortalFlowActivity.B.getClass();
                    context.getClass();
                    eVar.getClass();
                    uri.getClass();
                    str.getClass();
                    qVar.a(MFAPortalFlowActivity.a.a(context, eVar, false, uri, "CUSTOMER_MGMT_CTR_MOBILE", sc2.a.f158478d, str), null);
                    return Unit.INSTANCE;
                    String str3 = (String) objE0;
                    if (str3 != null) {
                        Context context3 = this.f185626c;
                        URI uri3 = new URI(og2.k.p(this.f185627d.f185640a, l0.d(context3)));
                        re2.b bVar = re2.b.f152215a;
                        c3447a.f185629a = context3;
                        c.q<Intent, f.a> qVar2 = this.f185628e;
                        c3447a.f185630b = qVar2;
                        c3447a.f185631c = str3;
                        c3447a.f185632d = uri3;
                        c3447a.f185635g = 2;
                        bVar.getClass();
                        Object objQ = re2.b.q(c3447a);
                        if (objQ != aVar) {
                            str = str3;
                            context = context3;
                            objE0 = objQ;
                            uri = uri3;
                            qVar = qVar2;
                            ve2.e eVar2 = (ve2.e) objE0;
                            MFAPortalFlowActivity.B.getClass();
                            context.getClass();
                            eVar2.getClass();
                            uri.getClass();
                            str.getClass();
                            qVar.a(MFAPortalFlowActivity.a.a(context, eVar2, false, uri, "CUSTOMER_MGMT_CTR_MOBILE", sc2.a.f158478d, str), null);
                        }
                        return aVar;
                    }
                    lVar.invoke(ti2.c.h.f164613a);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(e eVar, e23.l<? super ti2.c, Unit> lVar, Context context, c.q<Intent, f.a> qVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f185620c = eVar;
                this.f185621d = lVar;
                this.f185622e = context;
                this.f185623f = qVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f185620c, this.f185621d, this.f185622e, this.f185623f, dVar);
                aVar.f185619b = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f185618a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    b0 b0Var = (b0) this.f185619b;
                    r53.e eVarF = r53.s.F(this.f185620c.f185647h);
                    C3446a c3446a = new C3446a(b0Var, this.f185621d, this.f185622e, this.f185620c, this.f185623f);
                    this.f185618a = 1;
                    if (eVarF.collect(c3446a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3445b(androidx.lifecycle.b0 b0Var, e eVar, e23.l<? super ti2.c, Unit> lVar, Context context, c.q<Intent, f.a> qVar, t13.d<? super C3445b> dVar) {
            super(2, dVar);
            this.f185613b = b0Var;
            this.f185614c = eVar;
            this.f185615d = lVar;
            this.f185616e = context;
            this.f185617f = qVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C3445b(this.f185613b, this.f185614c, this.f185615d, this.f185616e, this.f185617f, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C3445b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f185612a;
            if (i14 == 0) {
                o13.r.b(obj);
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
                a aVar2 = new a(this.f185614c, this.f185615d, this.f185616e, this.f185617f, null);
                this.f185612a = 1;
                if (h1.a(this.f185613b, bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0066  */
    public static final void a(ti2.b.a aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        o0 o0Var;
        int i15;
        o0 o0VarE = mVar.E(-593842799);
        int i16 = (o0VarE.B(aVar) ? 4 : 2) | i14 | (o0VarE.r(aVar2) ? 32 : 16);
        if ((i16 & 19) == 18 && o0VarE.b()) {
            o0VarE.e();
            o0Var = o0VarE;
            i15 = 4;
        } else {
            x1 x1Var = p3.n.f135158a;
            c1 c1Var = c1.f110940a;
            String str = aVar.f164592b;
            String str2 = aVar.f164593c;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            o0VarE.C(5004770);
            boolean z14 = (i16 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new w51.j(aVar2, 19);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new w51.j(aVar2, 19);
                    o0VarE.K(objQ);
                }
            }
            o0VarE.g0(false);
            o0Var = o0VarE;
            i15 = 4;
            c1Var.a(false, null, str, null, null, str3, false, false, (e23.a) objQ, null, null, o0Var, 6, 0, 1754);
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new wb1.i(aVar, aVar2, i14, i15);
        }
    }

    public static final void b(qi2.c cVar, h4.r rVar, e23.l lVar, e23.l lVar2, p3.m mVar, int i14) {
        lVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(-1699009802);
        int i15 = (o0VarE.B(cVar) ? 4 : 2) | i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(rVar) ? 32 : 16;
        }
        int i16 = i15 | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(lVar2) ? 2048 : 1024);
        if ((i16 & 1171) == 1170 && o0VarE.b()) {
            o0VarE.e();
        } else {
            x1 x1Var = p3.n.f135158a;
            w3.x.b(cVar, z3.f.c(1598047410, new wi2.a(cVar, rVar, lVar, lVar2), o0VarE), o0VarE, (i16 & 14) | 48);
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ug0.c((Object) cVar, (Object) rVar, (Object) lVar, (Object) lVar2, i14, 14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r10v0, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v14, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [p3.o0] */
    public static final void c(boolean z14, e eVar, h4.r rVar, e23.l<? super ti2.b, Unit> lVar, e23.l<? super ti2.c, Unit> lVar2, p3.m mVar, int i14) {
        Object aVar;
        Context context;
        int i15;
        ?? r14;
        d2 d2Var;
        ?? r15;
        e23.l<? super ti2.c, Unit> lVar3;
        Object obj;
        ?? r16;
        ti2.b.a aVar2;
        ?? r17;
        e eVar2 = eVar;
        ?? E = mVar.E(1718425685);
        int i16 = i14 | (E.h(z14) ? 4 : 2) | (E.r(eVar2) ? 32 : 16) | (E.B(rVar) ? 256 : 128) | (E.r(lVar) ? 2048 : 1024) | (E.r(lVar2) ? 16384 : 8192);
        if ((i16 & 9363) == 9362 && E.b()) {
            E.e();
            r17 = E;
        } else {
            x1 x1Var = p3.n.f135158a;
            Context context2 = (Context) E.A(AndroidCompositionLocals_androidKt.f6042b);
            androidx.lifecycle.b0 f158016a = ((n0) E.A(s9.j.f158018a)).getF158016a();
            E.C(1849434622);
            Object objQ = E.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            Object obj2 = objQ;
            if (objQ == c2565a) {
                c2 c2VarN = p0.n(null);
                E.K(c2VarN);
                obj2 = c2VarN;
            }
            p1 p1Var = (p1) obj2;
            E.g0(false);
            p1 p1VarC = s9.c.c(r53.s.d(eVar2.f185648i), E);
            d2 d2VarA = a2.a(E);
            g.h hVar = new g.h();
            E.C(-1746271574);
            int i17 = i16 & 57344;
            int i18 = i16 & 7168;
            boolean zR = E.r(eVar2) | (i17 == 16384) | (i18 == 2048);
            Object objQ2 = E.q();
            Object obj3 = objQ2;
            if (zR || objQ2 == c2565a) {
                tn2.s0 s0Var = new tn2.s0(eVar2, 29, lVar2, lVar);
                E.K(s0Var);
                obj3 = s0Var;
            }
            E.g0(false);
            c.q qVarC = w.c(hVar, (e23.l) obj3, E, 0);
            Unit unit = Unit.INSTANCE;
            E.C(-1224400529);
            boolean zR2 = E.r(f158016a) | E.r(eVar2) | E.r(context2) | E.B(d2VarA) | (i18 == 2048);
            Object objQ3 = E.q();
            if (zR2 || objQ3 == c2565a) {
                context = context2;
                i15 = i17;
                r14 = 0;
                aVar = new a(f158016a, eVar2, context, d2VarA, lVar, p1Var, null);
                d2Var = d2VarA;
                E.K(aVar);
            } else {
                i15 = i17;
                context = context2;
                d2Var = d2VarA;
                aVar = objQ3;
                r14 = 0;
            }
            E.g0(r14);
            p3.l0.e((e23.p) aVar, unit, E);
            E.C(-1224400529);
            int i19 = i15;
            ?? r18 = (((E.r(f158016a) ? 1 : 0) | (E.r(eVar2) ? 1 : 0)) | (E.r(context) ? 1 : 0) ? 1 : 0) | (E.r(qVarC) ? 1 : 0) | (i19 == 16384 ? 1 : r14);
            Object objQ4 = E.q();
            if (r18 != 0 || objQ4 == c2565a) {
                Context context3 = context;
                C3445b c3445b = new C3445b(f158016a, eVar2, lVar2, context3, qVarC, null);
                context = context3;
                E.K(c3445b);
                objQ4 = c3445b;
            }
            E.g0(r14);
            p3.l0.e((e23.p) objQ4, unit, E);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, r14);
            int iP = E.P();
            i2 i2VarA0 = E.a0();
            h4.r rVarC = h4.k.c(rVar, E);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (E.f135177b == null) {
                p0.l();
                throw null;
            }
            E.z();
            if (E.T) {
                E.M(aVar3);
            } else {
                E.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, E);
            b4.c(h5.g.a.f81809f, i2VarA0, E);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (E.T || !s.g(E.q(), Integer.valueOf(iP))) {
                v.h.A(iP, E, iP, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, E);
            u uVar = u.f22885a;
            String str = ((d) p1VarC.getF182175a()).f185638a;
            E.C(2000202181);
            if (str == null) {
                eVar2 = eVar2;
                r16 = E;
                lVar3 = lVar2;
            } else {
                E.C(2000203132);
                if (g0.a(context)) {
                    E.C(5004770);
                    boolean zR3 = E.r(eVar2);
                    Object objQ5 = E.q();
                    int i24 = 14;
                    if (zR3 || objQ5 == c2565a) {
                        obj = objQ5;
                        vu1.b bVar2 = new vu1.b(eVar2, i24);
                        E.K(bVar2);
                        obj = bVar2;
                    }
                    E.g0(r14);
                    lVar3 = lVar2;
                    d(z14, str, d2Var, (e23.l) obj, E, i16 & 14);
                    r15 = E;
                } else {
                    r15 = E;
                    lVar3 = lVar2;
                    lVar3.invoke(ti2.c.d.f164609a);
                }
                r15.g0(r14);
                r16 = r15;
            }
            r16.g0(r14);
            r16.g0(true);
            ti2.b.a aVar4 = (ti2.b.a) p1Var.getF182175a();
            r17 = r16;
            if (aVar4 != null) {
                r16.C(-1224400529);
                int i25 = (i19 != 16384 ? r14 : 1) | (r16.B(aVar4) ? 1 : 0) | (r16.r(eVar2) ? 1 : 0);
                Object objQ6 = r16.q();
                if (i25 != 0 || objQ6 == c2565a) {
                    aVar2 = aVar4;
                    ug2.k kVar = new ug2.k(aVar2, lVar3, eVar, p1Var, 12);
                    r16.K(kVar);
                    objQ6 = kVar;
                } else {
                    aVar2 = aVar4;
                }
                r16.g0(r14);
                a(aVar2, (e23.a) objQ6, r16, r14);
                r17 = r16;
            }
        }
        p2 p2VarI0 = r17.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ug2.p(i14, 7, lVar2, eVar, rVar, lVar, z14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b4  */
    @SuppressLint({"SetJavaScriptEnabled"})
    public static final void d(boolean z14, String str, d2 d2Var, e23.l lVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1236359040);
        int i15 = (o0VarE.h(z14) ? 4 : 2) | i14 | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(d2Var) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if ((i15 & 1171) == 1170 && o0VarE.b()) {
            o0VarE.e();
        } else {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            h4.r rVarB = a2.b(h4.r.S, d2Var, true);
            o0VarE.C(-1633490746);
            boolean z15 = ((i15 & 14) == 4) | ((i15 & 7168) == 2048);
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (z15) {
                objQ = new as2.d(z14, lVar, 18);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new as2.d(z14, lVar, 18);
                    o0VarE.K(objQ);
                }
            }
            e23.l lVar2 = (e23.l) objQ;
            o0VarE.g0(false);
            o0VarE.C(5004770);
            boolean z16 = (i15 & 112) == 32;
            Object objQ2 = o0VarE.q();
            if (z16) {
                objQ2 = new u91.c(str, 17);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new u91.c(str, 17);
                    o0VarE.K(objQ2);
                }
            }
            o0VarE.g0(false);
            p002j6.c.b(lVar2, rVarB, (e23.l) objQ2, o0VarE, 0, 0);
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y(z14, str, d2Var, lVar, i14);
        }
    }
}
