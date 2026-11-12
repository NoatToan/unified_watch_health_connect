package com.garmin.android.apps.connectmobile.settings.usersettings;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import c22.o0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.d;
import com.garmin.android.apps.connectmobile.k1;
import e23.p;
import g22.n;
import java.io.UnsupportedEncodingException;
import o13.m;
import o53.b0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p3.p1;
import pk1.f;
import pk1.l;
import r53.j;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/usersettings/UpdateBirthdateActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "Lorg/joda/time/LocalDate;", "userDateOfBirth", "", "showBirthdate", "loading", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class UpdateBirthdateActivity extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f44011d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f44012a = (o0) KoinJavaComponent.get$default(o0.class, null, null, 6, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f44013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f44014c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.settings.usersettings.UpdateBirthdateActivity$onCreate$1$1$1", f = "UpdateBirthdateActivity.kt", l = {81}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f44015a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f44017c;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.usersettings.UpdateBirthdateActivity$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0824a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ UpdateBirthdateActivity f44018a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p1<Boolean> f44019b;

            public C0824a(UpdateBirthdateActivity updateBirthdateActivity, p1<Boolean> p1Var) {
                this.f44018a = updateBirthdateActivity;
                this.f44019b = p1Var;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) throws UnsupportedEncodingException {
                l lVar = (l) obj;
                int i14 = UpdateBirthdateActivity.f44011d;
                this.f44019b.setValue(Boolean.FALSE);
                String str = lVar.f138299a;
                String str2 = lVar.f138300b;
                boolean zD = n.d(str);
                UpdateBirthdateActivity updateBirthdateActivity = this.f44018a;
                if (zD) {
                    g22.a.e(updateBirthdateActivity, str, str2);
                } else {
                    g22.a.c(updateBirthdateActivity, Uri.parse(str2));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p1<Boolean> p1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f44017c = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return UpdateBirthdateActivity.this.new a(this.f44017c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to com.garmin.android.apps.connectmobile.settings.usersettings.UpdateBirthdateActivity$a for r6v1 'this'  t13.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                u13.a r0 = u13.a.COROUTINE_SUSPENDED
                int r1 = r6.f44015a
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L14
                if (r1 == r3) goto L10
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r7)
                return r2
            L10:
                o13.r.b(r7)
                goto L37
            L14:
                o13.r.b(r7)
                int r7 = com.garmin.android.apps.connectmobile.settings.usersettings.UpdateBirthdateActivity.f44011d
                com.garmin.android.apps.connectmobile.settings.usersettings.UpdateBirthdateActivity r7 = com.garmin.android.apps.connectmobile.settings.usersettings.UpdateBirthdateActivity.this
                java.lang.Object r1 = r7.f44014c
                java.lang.Object r1 = r1.getValue()
                pk1.f r1 = (pk1.f) r1
                r53.a2 r1 = r1.f138288c
                com.garmin.android.apps.connectmobile.settings.usersettings.UpdateBirthdateActivity$a$a r4 = new com.garmin.android.apps.connectmobile.settings.usersettings.UpdateBirthdateActivity$a$a
                p3.p1<java.lang.Boolean> r5 = r6.f44017c
                r4.<init>(r7, r5)
                r6.f44015a = r3
                r53.d2<T> r7 = r1.f150526a
                java.lang.Object r7 = r7.collect(r4, r6)
                if (r7 != r0) goto L37
                return r0
            L37:
                o2.c.f()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.settings.usersettings.UpdateBirthdateActivity.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/settings/usersettings/UpdateBirthdateActivity$b", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f44021b;

        public b(p1<Boolean> p1Var) {
            this.f44021b = p1Var;
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            com.garmin.android.library.backgroundtaskmanagement.b.c cVar2 = com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
            UpdateBirthdateActivity updateBirthdateActivity = UpdateBirthdateActivity.this;
            if (cVar != cVar2) {
                if (cVar != com.garmin.android.library.backgroundtaskmanagement.b.c.NO_NETWORK) {
                    Toast.makeText(updateBirthdateActivity, R.string.txt_error_occurred, 0).show();
                }
            } else {
                updateBirthdateActivity.hideProgressOverlay();
                int i14 = UpdateBirthdateActivity.f44011d;
                this.f44021b.setValue(Boolean.TRUE);
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
            eVar.getClass();
            obj.getClass();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f44022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f44023b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f44024c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f44025d;

        public c(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f44022a = gVar;
            this.f44023b = qualifier;
            this.f44024c = aVar;
            this.f44025d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, pk1.f] */
        @Override // e23.a
        public final f invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f44022a;
            y1 viewModelStore = gVar.getViewModelStore();
            e23.a aVar = this.f44024c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(f.class), viewModelStore, null, defaultViewModelCreationExtras, this.f44023b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f44025d, 4, null);
        }
    }

    public UpdateBirthdateActivity() {
        bv.b.f21239a.getClass();
        bv.b.a();
        this.f44013b = k1.f37122a.r();
        this.f44014c = m.a(o13.n.NONE, new c(this, null, null, null));
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initComposeScreen(new z3.e(1746112847, true, new oo0.f(17, this, this.f44012a.b().t1())));
    }
}
