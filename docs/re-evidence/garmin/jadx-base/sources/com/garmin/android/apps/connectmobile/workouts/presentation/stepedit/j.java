package com.garmin.android.apps.connectmobile.workouts.presentation.stepedit;

import android.content.Context;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import c22.o;
import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.j0;
import e23.p;
import e23.q;
import gl1.y;
import java.io.File;
import java.util.List;
import java.util.Set;
import o13.r;
import o53.b0;
import o62.n0;
import o62.v0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p62.a0;
import p62.c0;
import p62.d0;
import p62.e0;
import p62.f0;
import p62.g0;
import p62.h0;
import p62.i0;
import p62.m;
import p62.n;
import p62.s;
import p62.t;
import p62.u;
import p62.v;
import p62.x;
import p62.z;
import r53.e2;
import r53.g2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/j;", "Landroidx/lifecycle/u1;", "Lm52/k;", "sportType", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/j0;", "workoutStep", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/b;", "extraWorkoutData", "<init>", "(Lm52/k;Lcom/garmin/android/apps/connectmobile/workouts/data/model/j0;Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/b;)V", "a", "b", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m52.k f49701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b f49702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0<j0> f49703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0 f49704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y0<Integer> f49705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y0 f49706f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e2 f49707g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e2 f49708h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f49709i;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012(\u0010\u0007\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\u0012$\u0010\u000b\u001a \b\u0001\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b\u0012\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/j$a;", "", "", "audioDirectory", "Lkotlin/Function3;", "Lt13/d;", "", "downloadAudioNoteFunc", "Lkotlin/Function2;", "Ljava/io/File;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/a;", "uploadAudioNoteFunc", "Lk23/i;", "audioFileToUploadProperty", "<init>", "(Ljava/lang/String;Le23/q;Le23/p;Lk23/i;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f49710a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q<String, String, t13.d<? super Boolean>, Object> f49711b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p<File, t13.d<? super com.garmin.android.apps.connectmobile.workouts.data.model.a>, Object> f49712c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final k23.i<File> f49713d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, q<? super String, ? super String, ? super t13.d<? super Boolean>, ? extends Object> qVar, p<? super File, ? super t13.d<? super com.garmin.android.apps.connectmobile.workouts.data.model.a>, ? extends Object> pVar, k23.i<File> iVar) {
            str.getClass();
            qVar.getClass();
            pVar.getClass();
            iVar.getClass();
            this.f49710a = str;
            this.f49711b = qVar;
            this.f49712c = pVar;
            this.f49713d = iVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f49710a.equals(aVar.f49710a) && this.f49711b.equals(aVar.f49711b) && this.f49712c.equals(aVar.f49712c) && this.f49713d.equals(aVar.f49713d);
        }

        public final int hashCode() {
            return this.f49713d.hashCode() + ((this.f49712c.hashCode() + ((this.f49711b.hashCode() + (this.f49710a.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "AudioNoteHandler(audioDirectory=" + this.f49710a + ", downloadAudioNoteFunc=" + this.f49711b + ", uploadAudioNoteFunc=" + this.f49712c + ", audioFileToUploadProperty=" + this.f49713d + ")";
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f49714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f49715b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f49716c;

        static {
            int[] iArr = new int[m52.a.values().length];
            try {
                iArr[m52.a.f116650f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m52.a.f116649e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m52.a.f116655k.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m52.a.f116656l.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[m52.a.f116659o.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[m52.a.f116657m.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[m52.a.f116651g.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[m52.a.f116653i.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[m52.a.f116652h.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f49714a = iArr;
            int[] iArr2 = new int[x52.f.values().length];
            try {
                iArr2[x52.f.f189085n.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[x52.f.f189087p.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[x52.f.f189088q.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[x52.f.f189089r.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[x52.f.f189091v.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[x52.f.f189093x.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[x52.f.f189090t.ordinal()] = 7;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[x52.f.f189083l.ordinal()] = 8;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[x52.f.f189086o.ordinal()] = 9;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[x52.f.f189092w.ordinal()] = 10;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[x52.f.f189094y.ordinal()] = 11;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[x52.f.B.ordinal()] = 12;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[x52.f.f189095z.ordinal()] = 13;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[x52.f.f189084m.ordinal()] = 14;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[x52.f.A.ordinal()] = 15;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[x52.f.f189082k.ordinal()] = 16;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[x52.f.f189080i.ordinal()] = 17;
            } catch (NoSuchFieldError unused26) {
            }
            f49715b = iArr2;
            int[] iArr3 = new int[m52.k.values().length];
            try {
                iArr3[m52.k.f116758r.ordinal()] = 1;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr3[m52.k.f116759t.ordinal()] = 2;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr3[m52.k.f116760v.ordinal()] = 3;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr3[m52.k.f116755o.ordinal()] = 4;
            } catch (NoSuchFieldError unused30) {
            }
            f49716c = iArr3;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.WorkoutStepEditViewModel$triggerEvent$1", f = "WorkoutStepEditViewModel.kt", l = {917}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49717a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g f49719c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(g gVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f49719c = gVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return j.this.new d(this.f49719c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f49717a;
            if (i14 == 0) {
                r.b(obj);
                e2 e2Var = j.this.f49707g;
                this.f49717a = 1;
                if (e2Var.emit(this.f49719c, this) == aVar) {
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

    static {
        new b(null);
    }

    public j(m52.k kVar, j0 j0Var, com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b bVar) {
        kVar.getClass();
        j0Var.getClass();
        bVar.getClass();
        this.f49701a = kVar;
        this.f49702b = bVar;
        H4(j0Var);
        y0<j0> y0Var = new y0<>(j0Var);
        this.f49703c = y0Var;
        this.f49704d = y0Var;
        x52.e.a aVar = x52.e.f189070c;
        m52.d dVar = j0Var.f48217c;
        aVar.getClass();
        y0<Integer> y0Var2 = new y0<>(Integer.valueOf(x52.e.a.a(dVar).a(kVar)));
        this.f49705e = y0Var2;
        this.f49706f = y0Var2;
        e2 e2VarB = g2.b(0, 0, null, 7);
        this.f49707g = e2VarB;
        this.f49708h = e2VarB;
    }

    public static p62.f x4(m52.a aVar) {
        Context contextC = ((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).c();
        int i14 = aVar == null ? -1 : c.f49714a[aVar.ordinal()];
        if (i14 == 1) {
            return new p62.i(contextC);
        }
        if (i14 == 2) {
            return new p62.l(contextC);
        }
        if (i14 == 7) {
            return new p62.g(contextC);
        }
        if (i14 == 8) {
            return new p62.j(contextC);
        }
        if (i14 != 9) {
            return null;
        }
        return new p62.k(contextC);
    }

    public static p62.f y4(m52.a aVar) {
        Context contextC = ((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).c();
        int i14 = aVar == null ? -1 : c.f49714a[aVar.ordinal()];
        if (i14 == 2) {
            return new v(contextC);
        }
        if (i14 == 6) {
            return new u(contextC);
        }
        if (i14 == 7) {
            return new s(contextC);
        }
        if (i14 != 8) {
            return null;
        }
        return new t(contextC);
    }

    public final com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b.a A4() {
        com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b bVar = this.f49702b;
        bVar.getClass();
        return (com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b.a) bVar;
    }

    public final com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b.C0980b B4() {
        com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b bVar = this.f49702b;
        bVar.getClass();
        return (com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b.C0980b) bVar;
    }

    public final com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b.c C4() {
        com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b bVar = this.f49702b;
        bVar.getClass();
        return (com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b.c) bVar;
    }

    public final a0 D4(x52.f fVar) {
        fVar.getClass();
        m52.k kVar = m52.k.f116755o;
        m52.k kVar2 = this.f49701a;
        if (kVar2 == kVar) {
            Context contextC = ((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).c();
            switch (c.f49715b[fVar.ordinal()]) {
                case 1:
                    return new i0(contextC, kVar2, false);
                case 2:
                    return new p62.b0(contextC, kVar2, false);
                case 3:
                    return new e0(contextC, kVar2, false);
                case 4:
                    return new c0(contextC, kVar2, false);
                case 5:
                    return new h0(contextC, kVar2, false);
                case 6:
                    PowerZonesDTO powerZonesDTO = A4().f49621b;
                    return new d0(contextC, kVar2, powerZonesDTO != null ? powerZonesDTO.f43987b : 0, false);
                case 7:
                    return new g0(contextC, kVar2, A4().f49620a, false);
            }
        }
        return null;
    }

    public final a0 E4(x52.f fVar) {
        fVar.getClass();
        if (G4().f48217c != m52.d.REST) {
            Context contextC = ((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).c();
            switch (c.f49715b[fVar.ordinal()]) {
                case 13:
                    return new m(contextC, this.f49701a, false);
                case 14:
                    m52.j jVar = C4().f49626b == null ? C4().f49628d : C4().f49627c;
                    return new p62.j0(contextC, this.f49701a, jVar != null ? jVar.f116752c : null, false, C4().f49626b);
                case 15:
                    return new p62.d(contextC, this.f49701a, C4().f49629e, false, 8, null);
            }
        }
        return null;
    }

    public final a0 F4(x52.f fVar) {
        fVar.getClass();
        Context contextC = ((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).c();
        int[] iArr = c.f49716c;
        m52.k kVar = this.f49701a;
        int i14 = iArr[kVar.ordinal()];
        if (i14 != 1 && i14 != 2 && i14 != 3) {
            if (i14 == 4) {
                switch (c.f49715b[fVar.ordinal()]) {
                    case 1:
                        return new i0(contextC, kVar, true);
                    case 2:
                        return new p62.b0(contextC, kVar, true);
                    case 3:
                        return new e0(contextC, kVar, true);
                    case 4:
                        return new c0(contextC, kVar, true);
                    case 5:
                        return new h0(contextC, kVar, A4().f49621b, true);
                    case 6:
                        PowerZonesDTO powerZonesDTO = A4().f49621b;
                        return new d0(contextC, kVar, powerZonesDTO != null ? powerZonesDTO.f43987b : 0, true);
                    case 7:
                        return new g0(contextC, kVar, A4().f49620a, true);
                }
            }
            if (k52.g.e(kVar)) {
                if (fVar == x52.f.f189088q) {
                    return new e0(contextC, kVar, true);
                }
            } else if (!((Set) k52.g.f102953b.getValue()).contains(kVar)) {
                int i15 = c.f49715b[fVar.ordinal()];
                if (i15 == 1) {
                    return new i0(contextC, kVar, true);
                }
                if (i15 == 3) {
                    return new e0(contextC, kVar, true);
                }
                if (i15 == 4) {
                    return new c0(contextC, kVar, true);
                }
                switch (i15) {
                    case 8:
                        return new f0(contextC, kVar);
                    case 9:
                        return new p62.b0(contextC, kVar, true);
                    case 10:
                        return new h0(contextC, kVar, A4().f49621b, true);
                    case 11:
                        PowerZonesDTO powerZonesDTO2 = A4().f49621b;
                        return new d0(contextC, kVar, powerZonesDTO2 != null ? powerZonesDTO2.f43987b : 0, true);
                    case 12:
                        return new n(contextC, kVar, true);
                }
            }
        }
        return null;
    }

    public final j0 G4() {
        j0 j0VarD = this.f49703c.d();
        j0VarD.getClass();
        return j0VarD;
    }

    public final void H4(j0 j0Var) {
        m52.a aVar;
        m52.a aVar2;
        m52.a aVar3;
        m52.k kVar = m52.k.f116758r;
        m52.k kVar2 = this.f49701a;
        if (kVar2 == kVar) {
            if (j0Var.f48217c != m52.d.REST) {
                if (j0Var.X == null) {
                    j0Var.X = m52.f.FREESTYLE;
                    return;
                }
                return;
            }
            j0Var.X = null;
            m52.a aVar4 = j0Var.f48227l;
            if (aVar4 == m52.a.f116648d || aVar4 == (aVar3 = m52.a.f116655k) || aVar4 == m52.a.f116656l || aVar4 == m52.a.f116659o) {
                return;
            }
            j0Var.f48227l = aVar3;
            j0Var.f48229n = 15.0d;
            return;
        }
        if (k52.g.f(kVar2)) {
            if (j0Var.f48217c == m52.d.REST) {
                m52.a aVar5 = j0Var.f48227l;
                if (aVar5 != null && aVar5 != (aVar = m52.a.f116649e) && aVar5 != (aVar2 = m52.a.f116648d) && aVar5 != m52.a.f116653i) {
                    if (B4().f49622a) {
                        j0Var.f48227l = aVar2;
                    } else {
                        j0Var.f48229n = 60.0d;
                        j0Var.f48227l = aVar;
                    }
                }
                j0Var.I0 = null;
                j0Var.H0 = null;
                j0Var.J0 = Double.NaN;
                return;
            }
            return;
        }
        if (kVar2 == m52.k.f116754n) {
            if (j0Var.f48217c == m52.d.WALK) {
                j0Var.H0 = "RUN";
                j0Var.I0 = "WALK";
                return;
            }
            if (p005kotlin.jvm.internal.s.g(j0Var.H0, "RUN") && p005kotlin.jvm.internal.s.g(j0Var.g(), "WALK")) {
                j0Var.H0 = null;
                j0Var.I0 = null;
            }
            if (j0Var.f48232q == m52.g.WALK_INSTRUCTION) {
                j0Var.f48232q = m52.g.NONE;
                j0Var.f48233r = 0.0d;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I4(boolean z14) {
        T tD = this.f49704d.d();
        tD.getClass();
        j0 j0Var = (j0) tD;
        PowerZonesDTO powerZonesDTO = A4().f49621b;
        J4(new g.d(z14, powerZonesDTO != null ? powerZonesDTO.f43987b : 0, z14 ? j0Var.f48233r : j0Var.F, z14 ? j0Var.f48234t : j0Var.I, z14 ? j0Var.f48235v : j0Var.P, this.f49701a == m52.k.f116754n));
    }

    public final void J4(g gVar) {
        gVar.getClass();
        ge1.b.T(v1.a(this), null, null, new d(gVar, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void K4(boolean z14) {
        T tD = this.f49704d.d();
        tD.getClass();
        j0 j0Var = (j0) tD;
        J4(new g.C0983g(z14, j0Var.f48229n, A4().f49620a, z14 ? j0Var.f48236w : j0Var.f48239z, z14 ? j0Var.f48237x : j0Var.A, z14 ? j0Var.f48238y : j0Var.B));
    }

    public final void L4(v0 v0Var) {
        com.garmin.android.apps.connectmobile.repcounting.model.d dVarD;
        j0 j0VarB = j0.b(G4(), 0, null, false, false, null, 0.0d, null, 0.0d, 0.0d, null, 0, 0, 0, 0, null, 0.0d, 0.0d, null, null, null, null, 0.0d, null, null, -1, 16383);
        Double d14 = v0Var.f129794f;
        boolean z14 = true;
        if (d14 == null || d14.doubleValue() < 1.0d) {
            j0.c cVar = v0Var.f129797i;
            if (cVar != null) {
                j0VarB.f48224j = cVar;
                j0VarB.L0 = null;
                j0VarB.M0 = Double.NaN;
                j0VarB.N0 = Double.NaN;
                j0VarB.J0 = Double.NaN;
            } else {
                Double d15 = v0Var.f129789a;
                z14 = zf.b.D(d15) && d15.doubleValue() >= 0.0d;
                double dDoubleValue = -1.0d;
                if (z14 && d15 != null) {
                    dDoubleValue = d15.doubleValue();
                }
                j0VarB.J0 = dDoubleValue;
                j0VarB.L0 = null;
                j0VarB.M0 = Double.NaN;
                j0VarB.f48224j = null;
            }
        } else {
            String str = v0Var.f129792d;
            Double d16 = v0Var.f129795g;
            if (str == null || str.length() == 0) {
                str = null;
            }
            j0VarB.L0 = str;
            j0VarB.N0 = (!zf.b.D(d16) || d16.doubleValue() < 0.0d) ? Double.NaN : d16.doubleValue();
            j0VarB.M0 = (!zf.b.D(d14) || d14.doubleValue() < 1.0d) ? Double.NaN : d14.doubleValue();
            j0VarB.J0 = Double.NaN;
            j0VarB.f48224j = null;
        }
        com.garmin.android.apps.connectmobile.repcounting.model.d dVarD2 = B4().f49623b.D(j0VarB.H0, j0VarB.g());
        if (dVarD2 != null && (dVarD = B4().f49623b.D(j0VarB.H0, dVarD2.f41104c)) != null) {
            boolean z15 = dVarD2.f41105d;
            if (!z14 ? !(z15 || !dVarD.f41105d) : !(!z15 || dVarD.f41105d)) {
                j0VarB.I0 = dVarD.f41106e;
                j0VarB.H0 = dVarD.f41102a;
            }
        }
        this.f49703c.j(j0VarB);
    }

    public final void M4(x52.f fVar) {
        com.garmin.android.apps.connectmobile.workouts.data.model.v vVarK;
        fVar.getClass();
        j0 j0VarB = j0.b(G4(), 0, null, false, false, null, 0.0d, fVar.f189099d, 0.0d, 0.0d, null, 0, 0, 0, 0, null, 0.0d, 0.0d, null, null, null, null, 0.0d, null, null, -65537, 16383);
        m52.k kVar = m52.k.f116755o;
        m52.k kVar2 = this.f49701a;
        if (kVar2 == kVar) {
            if (fVar == x52.f.f189079h) {
                j0VarB.E = m52.g.NONE;
            } else if (fVar == x52.f.f189090t) {
                if (j0VarB.f48236w == -1) {
                    List<com.garmin.android.apps.connectmobile.workouts.data.model.v> list = A4().f49620a;
                    j0VarB.f48236w = (list == null || (vVarK = y.k((int) j0VarB.f48229n, list)) == null) ? 0 : vVarK.getDuration();
                }
                if (j0VarB.f48237x == -1) {
                    j0VarB.f48237x = 90;
                }
                if (j0VarB.f48238y == -1) {
                    j0VarB.f48238y = 10;
                }
            }
        }
        a0 a0VarF4 = F4(fVar);
        if (a0VarF4 != null) {
            a0VarF4.d(kVar2, j0VarB, new Object[0]);
        }
        this.f49703c.j(j0VarB);
        if (kVar2 == m52.k.f116758r && fVar == x52.f.f189084m) {
            C4().f49631g = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object N4(v13.c cVar) {
        n0 n0Var;
        if (cVar instanceof n0) {
            n0Var = (n0) cVar;
            int i14 = n0Var.f129727c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                n0Var.f129727c = i14 - Integer.MIN_VALUE;
            } else {
                n0Var = new n0(this, cVar);
            }
        } else {
            n0Var = new n0(this, cVar);
        }
        Object objInvoke = n0Var.f129725a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = n0Var.f129727c;
        if (i15 == 0) {
            r.b(objInvoke);
            a aVar2 = this.f49709i;
            if (aVar2 == null) {
                return Unit.INSTANCE;
            }
            File file = aVar2.f49713d.get();
            if (file != null) {
                J4(new g.b(true));
                p<File, t13.d<? super com.garmin.android.apps.connectmobile.workouts.data.model.a>, Object> pVar = aVar2.f49712c;
                n0Var.f129727c = 1;
                objInvoke = pVar.invoke(file, n0Var);
                if (objInvoke == aVar) {
                    return aVar;
                }
            }
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(objInvoke);
        com.garmin.android.apps.connectmobile.workouts.data.model.a aVar3 = (com.garmin.android.apps.connectmobile.workouts.data.model.a) objInvoke;
        J4(new g.b(false));
        ge1.b.T(v1.a(this), null, null, new l(this, null, aVar3, null), 3);
        J4(new g.c(aVar3 != null));
        return Unit.INSTANCE;
    }

    public final p62.f z4(m52.a aVar) {
        Context contextC = ((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).c();
        int i14 = aVar == null ? -1 : c.f49714a[aVar.ordinal()];
        if (i14 == 1) {
            return new x(contextC, C4().f49626b, C4().f49627c);
        }
        if (i14 == 2) {
            return new z(contextC);
        }
        if (i14 == 3) {
            return new p62.y(contextC);
        }
        if (i14 == 4) {
            m52.j jVar = C4().f49626b == null ? C4().f49628d : C4().f49627c;
            return new p62.o(contextC, jVar != null ? jVar.f116752c : null, C4().f49626b);
        }
        if (i14 != 5) {
            return null;
        }
        return new p62.c(contextC, C4().f49629e);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/j$b;", "", "<init>", "()V", "", "DEFAULT_DISTANCE_FOR_UNSPECIFIED_POOL_SIZE", "D", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
