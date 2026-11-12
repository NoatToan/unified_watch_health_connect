package dd0;

import android.view.View;
import androidx.lifecycle.h1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.setup.wizard.PersonalInfoWizardActivity;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q92.x;
import r22.q0;
import z10.d1;
import z10.z0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.setup.wizard.PersonalInfoWizardActivity$observeConsentViewModel$1", f = "PersonalInfoWizardActivity.kt", l = {147}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f59183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PersonalInfoWizardActivity f59184b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.devices.setup.wizard.PersonalInfoWizardActivity$observeConsentViewModel$1$1", f = "PersonalInfoWizardActivity.kt", l = {148}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f59185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ PersonalInfoWizardActivity f59186b;

        /* JADX INFO: renamed from: dd0.q$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C1259a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ PersonalInfoWizardActivity f59187a;

            /* JADX INFO: renamed from: dd0.q$a$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C1260a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f59188a;

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
                    f59188a = iArr;
                }
            }

            public C1259a(PersonalInfoWizardActivity personalInfoWizardActivity) {
                this.f59187a = personalInfoWizardActivity;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                int i14 = C1260a.f59188a[((z0) obj).ordinal()];
                final PersonalInfoWizardActivity personalInfoWizardActivity = this.f59187a;
                final int i15 = 1;
                if (i14 == 1) {
                    personalInfoWizardActivity.showProgressOverlay();
                } else if (i14 == 2) {
                    personalInfoWizardActivity.hideProgressOverlay();
                    PersonalInfoWizardActivity.a aVar = PersonalInfoWizardActivity.f34487g;
                    personalInfoWizardActivity.displayFailedMessage();
                    personalInfoWizardActivity.ga();
                } else if (i14 == 3) {
                    personalInfoWizardActivity.hideProgressOverlay();
                    d1 d1Var = d1.f200951a;
                    final int i16 = 0;
                    e23.a aVar2 = new e23.a() { // from class: dd0.p
                        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o13.l] */
                        @Override // e23.a
                        public final Object invoke() {
                            int i17 = i16;
                            PersonalInfoWizardActivity personalInfoWizardActivity2 = personalInfoWizardActivity;
                            switch (i17) {
                                case 0:
                                    PersonalInfoWizardActivity.a aVar3 = PersonalInfoWizardActivity.f34487g;
                                    ((z10.j) personalInfoWizardActivity2.f34489d.getValue()).y4(x.DI_CONNECT_UPLOAD);
                                    break;
                                default:
                                    PersonalInfoWizardActivity.a aVar4 = PersonalInfoWizardActivity.f34487g;
                                    personalInfoWizardActivity2.ga();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    d1Var.getClass();
                    d1.v(aVar2, personalInfoWizardActivity);
                } else if (i14 == 4) {
                    personalInfoWizardActivity.hideProgressOverlay();
                    d1 d1Var2 = d1.f200951a;
                    e23.a aVar3 = new e23.a() { // from class: dd0.p
                        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o13.l] */
                        @Override // e23.a
                        public final Object invoke() {
                            int i17 = i15;
                            PersonalInfoWizardActivity personalInfoWizardActivity2 = personalInfoWizardActivity;
                            switch (i17) {
                                case 0:
                                    PersonalInfoWizardActivity.a aVar4 = PersonalInfoWizardActivity.f34487g;
                                    ((z10.j) personalInfoWizardActivity2.f34489d.getValue()).y4(x.DI_CONNECT_UPLOAD);
                                    break;
                                default:
                                    PersonalInfoWizardActivity.a aVar5 = PersonalInfoWizardActivity.f34487g;
                                    personalInfoWizardActivity2.ga();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    d1Var2.getClass();
                    d1.l(aVar3, personalInfoWizardActivity);
                } else if (i14 == 5) {
                    personalInfoWizardActivity.hideProgressOverlay();
                    q0.b bVar = q0.f149800b;
                    View viewFindViewById = personalInfoWizardActivity.findViewById(R.id.content_frame);
                    viewFindViewById.getClass();
                    bVar.getClass();
                    q0.b.a(viewFindViewById, R.string.msg_request_sent, 1).show();
                    PersonalInfoWizardActivity.a aVar4 = PersonalInfoWizardActivity.f34487g;
                    personalInfoWizardActivity.ga();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PersonalInfoWizardActivity personalInfoWizardActivity, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f59186b = personalInfoWizardActivity;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f59186b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to dd0.q$a for r5v1 'this'  t13.d
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
                int r1 = r5.f59185a
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
                com.garmin.android.apps.connectmobile.devices.setup.wizard.PersonalInfoWizardActivity$a r6 = com.garmin.android.apps.connectmobile.devices.setup.wizard.PersonalInfoWizardActivity.f34487g
                com.garmin.android.apps.connectmobile.devices.setup.wizard.PersonalInfoWizardActivity r6 = r5.f59186b
                java.lang.Object r1 = r6.f34489d
                java.lang.Object r1 = r1.getValue()
                z10.j r1 = (z10.j) r1
                r53.p2 r1 = r1.f201061d
                r53.b2 r1 = r53.s.d(r1)
                dd0.q$a$a r4 = new dd0.q$a$a
                r4.<init>(r6)
                r5.f59185a = r3
                r53.o2<T> r6 = r1.f150540a
                java.lang.Object r6 = r6.collect(r4, r5)
                if (r6 != r0) goto L39
                return r0
            L39:
                o2.c.f()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: dd0.q.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(PersonalInfoWizardActivity personalInfoWizardActivity, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f59184b = personalInfoWizardActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f59184b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f59183a;
        if (i14 == 0) {
            r.b(obj);
            androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
            PersonalInfoWizardActivity personalInfoWizardActivity = this.f59184b;
            a aVar2 = new a(personalInfoWizardActivity, null);
            this.f59183a = 1;
            if (h1.b(personalInfoWizardActivity, bVar, aVar2, this) == aVar) {
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
