package hv;

import android.view.View;
import androidx.lifecycle.h1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.bic.device.TellUsMoreActivity;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q92.x;
import r22.q0;
import z10.d1;
import z10.z0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.bic.device.TellUsMoreActivity$observeConsentViewModel$1", f = "TellUsMoreActivity.kt", l = {170}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f85779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TellUsMoreActivity f85780b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.bic.device.TellUsMoreActivity$observeConsentViewModel$1$1", f = "TellUsMoreActivity.kt", l = {171}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f85781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TellUsMoreActivity f85782b;

        /* JADX INFO: renamed from: hv.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C1703a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ TellUsMoreActivity f85783a;

            /* JADX INFO: renamed from: hv.n$a$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C1704a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f85784a;

                static {
                    int[] iArr = new int[z0.values().length];
                    try {
                        iArr[z0.CONSENT_PARENTAL_REQUEST_IN_PROGRESS.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[z0.CONSENT_PARENTAL_REQUEST_ERROR.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[z0.CONSENT_PARENTAL_REQUEST_NEEDED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[z0.CONSENT_PARENTAL_ALREADY_REQUESTED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[z0.CONSENT_PARENTAL_REQUESTED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f85784a = iArr;
                }
            }

            public C1703a(TellUsMoreActivity tellUsMoreActivity) {
                this.f85783a = tellUsMoreActivity;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                int i14 = C1704a.f85784a[((z0) obj).ordinal()];
                final TellUsMoreActivity tellUsMoreActivity = this.f85783a;
                final int i15 = 1;
                if (i14 == 1) {
                    tellUsMoreActivity.showProgressOverlay();
                } else if (i14 == 2) {
                    tellUsMoreActivity.hideProgressOverlay();
                    TellUsMoreActivity.a aVar = TellUsMoreActivity.f30729i;
                    tellUsMoreActivity.displayFailedMessage();
                } else if (i14 == 3) {
                    tellUsMoreActivity.hideProgressOverlay();
                    d1 d1Var = d1.f200951a;
                    final int i16 = 0;
                    e23.a aVar2 = new e23.a() { // from class: hv.m
                        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o13.l] */
                        @Override // e23.a
                        public final Object invoke() {
                            int i17 = i16;
                            TellUsMoreActivity tellUsMoreActivity2 = tellUsMoreActivity;
                            switch (i17) {
                                case 0:
                                    TellUsMoreActivity.a aVar3 = TellUsMoreActivity.f30729i;
                                    ((z10.j) tellUsMoreActivity2.f30731e.getValue()).y4(x.DI_CONNECT_UPLOAD);
                                    break;
                                default:
                                    TellUsMoreActivity.a aVar4 = TellUsMoreActivity.f30729i;
                                    tellUsMoreActivity2.da();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    d1Var.getClass();
                    d1.v(aVar2, tellUsMoreActivity);
                } else if (i14 == 4) {
                    tellUsMoreActivity.hideProgressOverlay();
                    d1 d1Var2 = d1.f200951a;
                    e23.a aVar3 = new e23.a() { // from class: hv.m
                        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o13.l] */
                        @Override // e23.a
                        public final Object invoke() {
                            int i17 = i15;
                            TellUsMoreActivity tellUsMoreActivity2 = tellUsMoreActivity;
                            switch (i17) {
                                case 0:
                                    TellUsMoreActivity.a aVar4 = TellUsMoreActivity.f30729i;
                                    ((z10.j) tellUsMoreActivity2.f30731e.getValue()).y4(x.DI_CONNECT_UPLOAD);
                                    break;
                                default:
                                    TellUsMoreActivity.a aVar5 = TellUsMoreActivity.f30729i;
                                    tellUsMoreActivity2.da();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    d1Var2.getClass();
                    d1.l(aVar3, tellUsMoreActivity);
                } else if (i14 == 5) {
                    tellUsMoreActivity.hideProgressOverlay();
                    q0.b bVar = q0.f149800b;
                    View viewFindViewById = tellUsMoreActivity.findViewById(R.id.content_frame);
                    viewFindViewById.getClass();
                    bVar.getClass();
                    q0.b.a(viewFindViewById, R.string.msg_request_sent, 1).show();
                    TellUsMoreActivity.a aVar4 = TellUsMoreActivity.f30729i;
                    tellUsMoreActivity.da();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TellUsMoreActivity tellUsMoreActivity, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f85782b = tellUsMoreActivity;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f85782b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to hv.n$a for r5v1 'this'  t13.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                u13.a r0 = u13.a.COROUTINE_SUSPENDED
                int r1 = r5.f85781a
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L14
                if (r1 == r3) goto L10
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r6)
                return r2
            L10:
                o13.r.b(r6)
                goto L39
            L14:
                o13.r.b(r6)
                com.garmin.android.apps.connectmobile.bic.device.TellUsMoreActivity$a r6 = com.garmin.android.apps.connectmobile.bic.device.TellUsMoreActivity.f30729i
                com.garmin.android.apps.connectmobile.bic.device.TellUsMoreActivity r6 = r5.f85782b
                java.lang.Object r1 = r6.f30731e
                java.lang.Object r1 = r1.getValue()
                z10.j r1 = (z10.j) r1
                r53.p2 r1 = r1.f201061d
                r53.b2 r1 = r53.s.d(r1)
                hv.n$a$a r4 = new hv.n$a$a
                r4.<init>(r6)
                r5.f85781a = r3
                r53.o2<T> r6 = r1.f150540a
                java.lang.Object r6 = r6.collect(r4, r5)
                if (r6 != r0) goto L39
                return r0
            L39:
                o2.c.f()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: hv.n.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(TellUsMoreActivity tellUsMoreActivity, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f85780b = tellUsMoreActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n(this.f85780b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f85779a;
        if (i14 == 0) {
            r.b(obj);
            androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
            TellUsMoreActivity tellUsMoreActivity = this.f85780b;
            a aVar2 = new a(tellUsMoreActivity, null);
            this.f85779a = 1;
            if (h1.b(tellUsMoreActivity, bVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
