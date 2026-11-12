package pu;

import android.content.Intent;
import androidx.lifecycle.h1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.auth.PostUserAuthenticationActivity;
import com.garmin.android.apps.connectmobile.bic.CollectDobActivity;
import com.garmin.android.apps.connectmobile.device.setup.DeviceSetupActivity;
import com.garmin.android.apps.connectmobile.familyaccounts.presentation.managefamily.ManageFamilyActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import java.util.Arrays;
import java.util.List;
import lc.u0;
import ng1.c1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.auth.PostUserAuthenticationActivity$startPostUserAuthenticationFlow$1", f = "PostUserAuthenticationActivity.kt", l = {70}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f141129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PostUserAuthenticationActivity f141130b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.auth.PostUserAuthenticationActivity$startPostUserAuthenticationFlow$1$1", f = "PostUserAuthenticationActivity.kt", l = {71}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f141131a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ PostUserAuthenticationActivity f141132b;

        /* JADX INFO: renamed from: pu.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C2650a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ PostUserAuthenticationActivity f141133a;

            public C2650a(PostUserAuthenticationActivity postUserAuthenticationActivity) {
                this.f141133a = postUserAuthenticationActivity;
            }

            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, o13.l] */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                j0.b bVar = (j0.b) obj;
                boolean zG = p005kotlin.jvm.internal.s.g(bVar, j0.b.d.f141106a);
                PostUserAuthenticationActivity postUserAuthenticationActivity = this.f141133a;
                if (zG) {
                    postUserAuthenticationActivity.showProgressOverlay();
                } else if (bVar instanceof j0.b.e) {
                    h0 h0Var = ((j0.b.e) bVar).f141107a;
                    PostUserAuthenticationActivity.a aVar = PostUserAuthenticationActivity.f30291i;
                    postUserAuthenticationActivity.getClass();
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar2.getClass();
                    i2.a.f(a2Var, "PostUserAuthenticationActivity", "authFailure() -> signInError = [" + h0Var + "]");
                    if (!postUserAuthenticationActivity.isFinishing()) {
                        postUserAuthenticationActivity.hideProgressOverlay();
                        androidx.appcompat.app.e.a aVar3 = new androidx.appcompat.app.e.a(postUserAuthenticationActivity);
                        aVar3.setPositiveButton(R.string.lbl_ok, new mt0.y(20));
                        int i14 = PostUserAuthenticationActivity.b.f30298b[h0Var.ordinal()];
                        if (i14 == 1) {
                            aVar3.setMessage(postUserAuthenticationActivity.getString(R.string.msg_no_display_name));
                            aVar3.setPositiveButton(R.string.lbl_open, new c1(postUserAuthenticationActivity, 15));
                            aVar3.setNegativeButton(R.string.lbl_cancel, new mt0.y(21));
                        } else if (i14 == 2) {
                            aVar3.setMessage(postUserAuthenticationActivity.getString(R.string.txt_problem_siging_in) + postUserAuthenticationActivity.getString(R.string.gcs_sign_in_error_suffix));
                            aVar3.setPositiveButton(R.string.lbl_ok, new mt0.y(22));
                        } else if (i14 != 3) {
                            aVar3.setMessage(R.string.txt_problem_siging_in);
                            aVar3.setPositiveButton(R.string.lbl_ok, new mt0.y(19));
                        } else {
                            aVar3.setMessage(postUserAuthenticationActivity.getString(R.string.txt_problem_siging_in) + postUserAuthenticationActivity.getString(R.string.gcs_sign_in_error_suffix));
                            aVar3.setPositiveButton(R.string.lbl_ok, new mt0.y(18));
                        }
                        androidx.appcompat.app.e eVar = postUserAuthenticationActivity.f30295g;
                        if (eVar == null || !eVar.isShowing()) {
                            androidx.appcompat.app.e eVarCreate = aVar3.create();
                            postUserAuthenticationActivity.f30295g = eVarCreate;
                            if (eVarCreate != null) {
                                eVarCreate.setCanceledOnTouchOutside(false);
                            }
                            androidx.appcompat.app.e eVar2 = postUserAuthenticationActivity.f30295g;
                            if (eVar2 != null) {
                                eVar2.show();
                            }
                        }
                    }
                } else if (p005kotlin.jvm.internal.s.g(bVar, j0.b.C2649b.f141102a)) {
                    CollectDobActivity.f30702e.getClass();
                    postUserAuthenticationActivity.getClass();
                    Intent intent = new Intent(postUserAuthenticationActivity, (Class<?>) CollectDobActivity.class);
                    intent.setFlags(268468224);
                    postUserAuthenticationActivity.startActivity(intent);
                } else if (bVar instanceof j0.b.g) {
                    if (k1.f37122a.O()) {
                        ManageFamilyActivity.a aVar4 = ManageFamilyActivity.f35178j;
                        String str = ((j0.b.g) bVar).f141112a;
                        aVar4.getClass();
                        postUserAuthenticationActivity.getClass();
                        Intent intent2 = new Intent(postUserAuthenticationActivity, (Class<?>) ManageFamilyActivity.class);
                        intent2.putExtra("extraRequestId", str);
                        postUserAuthenticationActivity.startActivity(intent2);
                    } else {
                        PostUserAuthenticationActivity.a aVar5 = PostUserAuthenticationActivity.f30291i;
                        postUserAuthenticationActivity.getClass();
                        com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
                        com.garmin.android.apps.connectmobile.navigation.b.a.c(postUserAuthenticationActivity, null, 268468224);
                    }
                } else if (p005kotlin.jvm.internal.s.g(bVar, j0.b.a.f141101a)) {
                    PostUserAuthenticationActivity.a aVar6 = PostUserAuthenticationActivity.f30291i;
                    postUserAuthenticationActivity.getClass();
                    com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
                    com.garmin.android.apps.connectmobile.navigation.b.a.c(postUserAuthenticationActivity, null, 268468224);
                } else if (bVar instanceof j0.b.h) {
                    j0.b.h hVar = (j0.b.h) bVar;
                    UserSettingsDTO userSettingsDTO = hVar.f141113a;
                    com.garmin.android.apps.connectmobile.userprofile.model.m mVar = hVar.f141114b;
                    List<String> list = hVar.f141115c;
                    ((com.garmin.android.apps.connectmobile.startup.e) postUserAuthenticationActivity.f30293e.getValue()).I4().f(postUserAuthenticationActivity, new PostUserAuthenticationActivity.c(new p90.h(postUserAuthenticationActivity, 7, userSettingsDTO, mVar)));
                    androidx.fragment.app.v supportFragmentManager = postUserAuthenticationActivity.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    androidx.fragment.app.a aVar7 = new androidx.fragment.app.a(supportFragmentManager);
                    com.garmin.android.apps.connectmobile.startup.d.a aVar8 = com.garmin.android.apps.connectmobile.startup.d.f44815e;
                    String[] strArr = (String[]) list.toArray(new String[0]);
                    String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
                    aVar8.getClass();
                    aVar7.l(R.id.content_frame, com.garmin.android.apps.connectmobile.startup.d.a.a(strArr2), "StartupChecksFragment");
                    aVar7.e();
                } else if (bVar instanceof j0.b.f) {
                    j0.b.f fVar = (j0.b.f) bVar;
                    DeviceSetupActivity.f33758b.c(postUserAuthenticationActivity, fVar.f141108a, fVar.f141109b, 268468224);
                } else {
                    if (!(bVar instanceof j0.b.c)) {
                        u0.r();
                        return null;
                    }
                    DeviceSetupActivity.f33758b.b(postUserAuthenticationActivity, ((j0.b.c) bVar).f141103a, 268468224);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PostUserAuthenticationActivity postUserAuthenticationActivity, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f141132b = postUserAuthenticationActivity;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f141132b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to pu.m$a for r5v1 'this'  t13.d
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
                int r1 = r5.f141131a
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L14
                if (r1 == r3) goto L10
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r6)
                return r2
            L10:
                o13.r.b(r6)
                goto L35
            L14:
                o13.r.b(r6)
                com.garmin.android.apps.connectmobile.auth.PostUserAuthenticationActivity$a r6 = com.garmin.android.apps.connectmobile.auth.PostUserAuthenticationActivity.f30291i
                com.garmin.android.apps.connectmobile.auth.PostUserAuthenticationActivity r6 = r5.f141132b
                java.lang.Object r1 = r6.f30292d
                java.lang.Object r1 = r1.getValue()
                pu.j0 r1 = (pu.j0) r1
                r53.b2 r1 = r1.f141100g
                pu.m$a$a r4 = new pu.m$a$a
                r4.<init>(r6)
                r5.f141131a = r3
                r53.o2<T> r6 = r1.f150540a
                java.lang.Object r6 = r6.collect(r4, r5)
                if (r6 != r0) goto L35
                return r0
            L35:
                o2.c.f()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: pu.m.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(PostUserAuthenticationActivity postUserAuthenticationActivity, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f141130b = postUserAuthenticationActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f141130b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f141129a;
        if (i14 == 0) {
            o13.r.b(obj);
            androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
            PostUserAuthenticationActivity postUserAuthenticationActivity = this.f141130b;
            a aVar2 = new a(postUserAuthenticationActivity, null);
            this.f141129a = 1;
            if (h1.b(postUserAuthenticationActivity, bVar, aVar2, this) == aVar) {
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
