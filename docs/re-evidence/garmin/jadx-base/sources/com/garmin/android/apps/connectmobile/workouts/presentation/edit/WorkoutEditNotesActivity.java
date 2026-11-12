package com.garmin.android.apps.connectmobile.workouts.presentation.edit;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.h1;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import f62.m0;
import f62.n0;
import f62.p0;
import java.io.File;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\nX\u008a\u0084\u0002²\u0006\u000e\u0010\b\u001a\u0004\u0018\u00010\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/WorkoutEditNotesActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "", "textNote", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/a;", "audioNote", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WorkoutEditNotesActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f48867c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f48868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f48869b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditNotesActivity$onCreate$1", f = "WorkoutEditNotesActivity.kt", l = {42}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48870a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditNotesActivity$onCreate$1$1", f = "WorkoutEditNotesActivity.kt", l = {43}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f48872a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkoutEditNotesActivity f48873b;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditNotesActivity$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C0952a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ WorkoutEditNotesActivity f48874a;

                public C0952a(WorkoutEditNotesActivity workoutEditNotesActivity) {
                    this.f48874a = workoutEditNotesActivity;
                }

                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    h0.a aVar = (h0.a) obj;
                    boolean z14 = aVar instanceof h0.a.c;
                    WorkoutEditNotesActivity workoutEditNotesActivity = this.f48874a;
                    if (z14) {
                        workoutEditNotesActivity.showProgressOverlay();
                    } else if (aVar instanceof h0.a.b) {
                        workoutEditNotesActivity.hideProgressOverlay();
                    } else if (!(aVar instanceof h0.a.C0958a)) {
                        u0.r();
                        return null;
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WorkoutEditNotesActivity workoutEditNotesActivity, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f48873b = workoutEditNotesActivity;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f48873b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditNotesActivity$b$a for r5v1 'this'  t13.d
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
                    int r1 = r5.f48872a
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L14
                    if (r1 == r3) goto L10
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    vb.h.z(r6)
                    return r2
                L10:
                    o13.r.b(r6)
                    goto L31
                L14:
                    o13.r.b(r6)
                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditNotesActivity$a r6 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditNotesActivity.f48867c
                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditNotesActivity r6 = r5.f48873b
                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.h0 r1 = r6.ca()
                    r53.a2 r1 = r1.f49004f
                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditNotesActivity$b$a$a r4 = new com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditNotesActivity$b$a$a
                    r4.<init>(r6)
                    r5.f48872a = r3
                    r53.d2<T> r6 = r1.f150526a
                    java.lang.Object r6 = r6.collect(r4, r5)
                    if (r6 != r0) goto L31
                    return r0
                L31:
                    o2.c.f()
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditNotesActivity.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return WorkoutEditNotesActivity.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f48870a;
            if (i14 == 0) {
                o13.r.b(obj);
                WorkoutEditNotesActivity workoutEditNotesActivity = WorkoutEditNotesActivity.this;
                androidx.lifecycle.b0 f158016a = workoutEditNotesActivity.getF158016a();
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
                a aVar2 = new a(workoutEditNotesActivity, null);
                this.f48870a = 1;
                if (h1.a(f158016a, bVar, aVar2, this) == aVar) {
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

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class c extends p005kotlin.jvm.internal.q implements e23.l<String, Unit> {
        public c(Object obj) {
            super(1, obj, h0.class, "updateTextNote", "updateTextNote(Ljava/lang/String;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(String str) {
            h0 h0Var = (h0) this.receiver;
            h0Var.getClass();
            ge1.b.T(v1.a(h0Var), null, null, new p0(h0Var, str, null), 3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements r53.i<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f48875a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f48876a;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditNotesActivity$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditNotesActivity$onCreate$lambda$0$0$$inlined$filterIsInstance$1$2", f = "WorkoutEditNotesActivity.kt", l = {50}, m = "emit", v = 2)
            public static final class C0953a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f48877a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f48878b;

                public C0953a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f48877a = obj;
                    this.f48878b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f48876a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C0953a c0953a;
                if (dVar instanceof C0953a) {
                    c0953a = (C0953a) dVar;
                    int i14 = c0953a.f48878b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c0953a.f48878b = i14 - Integer.MIN_VALUE;
                    } else {
                        c0953a = new C0953a(dVar);
                    }
                } else {
                    c0953a = new C0953a(dVar);
                }
                Object obj2 = c0953a.f48877a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c0953a.f48878b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    if (obj instanceof h0.a.C0958a) {
                        c0953a.f48878b = 1;
                        if (this.f48876a.emit(obj, c0953a) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public d(r53.i iVar) {
            this.f48875a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super Object> jVar, t13.d dVar) {
            Object objCollect = this.f48875a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f48880a;

        public e(b.g gVar) {
            this.f48880a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f48880a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f48881a;

        public f(b.g gVar) {
            this.f48881a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f48881a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f48882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f48883b;

        public g(e23.a aVar, b.g gVar) {
            this.f48882a = aVar;
            this.f48883b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f48882a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f48883b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f48884a;

        public h(b.g gVar) {
            this.f48884a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f48884a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f48885a;

        public i(b.g gVar) {
            this.f48885a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f48885a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class j implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f48886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f48887b;

        public j(e23.a aVar, b.g gVar) {
            this.f48886a = aVar;
            this.f48887b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f48886a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f48887b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public WorkoutEditNotesActivity() {
        e eVar = new e(this);
        t0 t0Var = s0.f105811a;
        this.f48868a = new w1(t0Var.b(h0.class), new f(this), eVar, new g(null, this));
        this.f48869b = new w1(t0Var.b(w52.e.class), new i(this), new h(this), new j(null, this));
    }

    public final h0 ca() {
        return (h0) this.f48868a.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView(R.layout.activity_composable_container);
        String stringExtra = getIntent().getStringExtra("com.garmin.android.apps.connectmobile.workouts.edit.WorkoutEditNotesActivity.extra.text_note");
        boolean booleanExtra = getIntent().getBooleanExtra("com.garmin.android.apps.connectmobile.workouts.edit.WorkoutEditNotesActivity.extra.should_limit_characters", true);
        Intent intent = getIntent();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = intent != null ? (Parcelable) intent.getParcelableExtra("com.garmin.android.apps.connectmobile.workouts.edit.WorkoutEditNotesActivity.extra.audio_note", com.garmin.android.apps.connectmobile.workouts.data.model.a.class) : null;
        } else {
            Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("com.garmin.android.apps.connectmobile.workouts.edit.WorkoutEditNotesActivity.extra.audio_note") : null;
            if (!(parcelableExtra instanceof com.garmin.android.apps.connectmobile.workouts.data.model.a)) {
                parcelableExtra = null;
            }
            parcelable = (com.garmin.android.apps.connectmobile.workouts.data.model.a) parcelableExtra;
        }
        h0 h0VarCa = ca();
        ge1.b.T(v1.a(h0VarCa), null, null, new n0(h0VarCa, stringExtra, (com.garmin.android.apps.connectmobile.workouts.data.model.a) parcelable, null), 3);
        initActionBar(true, getString(R.string.workout_step_notes));
        ge1.b.T(o53.f0.w(this), null, null, new b(null), 3);
        ((ComposeView) findViewById(R.id.composable_container)).setContent(new z3.e(239290723, true, new m0(this, booleanExtra, 0)));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuItem menuItemAdd;
        if (menu == null || (menuItemAdd = menu.add(0, R.id.menu_item_save, 0, R.string.lbl_save)) == null) {
            return true;
        }
        menuItemAdd.setShowAsAction(2);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            finish();
            return true;
        }
        if (itemId != R.id.menu_item_save) {
            return super.onOptionsItemSelected(menuItem);
        }
        Intent intent = new Intent();
        intent.putExtra("com.garmin.android.apps.connectmobile.workouts.edit.WorkoutEditNotesActivity.extra.text_note", (String) ca().f49000b.f150540a.getValue());
        intent.putExtra("com.garmin.android.apps.connectmobile.workouts.edit.WorkoutEditNotesActivity.extra.audio_note", (Parcelable) ca().f49002d.f150540a.getValue());
        File file = ((w52.e) this.f48869b.getValue()).f182502b;
        intent.putExtra("com.garmin.android.apps.connectmobile.workouts.edit.WorkoutEditNotesActivity.extra.audio_file", file != null ? file.toString() : null);
        setResult(-1, intent);
        finish();
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/WorkoutEditNotesActivity$a;", "", "<init>", "()V", "", "EXTRA_WORKOUT_TEXT_NOTE", "Ljava/lang/String;", "EXTRA_SHOULD_LIMIT_CHARACTERS", "EXTRA_WORKOUT_AUDIO_NOTE", "EXTRA_WORKOUT_AUDIO_FILE", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
