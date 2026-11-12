package com.garmin.android.apps.connectmobile.workouts.presentation.edit;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Toast;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.RoundConditionEditActivity;
import java.io.File;
import java.util.List;
import l72.i3;
import lc.u0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.t0;
import p3.o0;
import p3.p2;
import p3.x1;
import r22.q0;
import v62.o1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/a;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f48898h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f48899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f48900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q0 f48901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f.c<Intent> f48902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f.c<Intent> f48903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f.c<Intent> f48904f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f.c<Intent> f48905g;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f48907b;

        static {
            int[] iArr = new int[f62.w.values().length];
            try {
                iArr[f62.w.SAVE_WORKOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f62.w.REORDER_DONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f48906a = iArr;
            int[] iArr2 = new int[m52.k.values().length];
            try {
                iArr2[m52.k.f116763y.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[m52.k.f116762x.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[m52.k.f116761w.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f48907b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class c extends p005kotlin.jvm.internal.q implements e23.q<String, String, t13.d<? super Boolean>, Object> {
        public c(Object obj) {
            super(3, obj, w52.e.class, "downloadAudioNote", "downloadAudioNote(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // e23.q
        public final Object invoke(String str, String str2, t13.d<? super Boolean> dVar) {
            return ((w52.e) this.receiver).x4(str, str2, dVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class d extends p005kotlin.jvm.internal.q implements e23.p<File, t13.d<? super com.garmin.android.apps.connectmobile.workouts.data.model.a>, Object> {
        public d(Object obj) {
            super(2, obj, w52.e.class, "uploadAudioNote", "uploadAudioNote(Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // e23.p
        public final Object invoke(File file, t13.d<? super com.garmin.android.apps.connectmobile.workouts.data.model.a> dVar) {
            w52.e eVar = (w52.e) this.receiver;
            eVar.getClass();
            x53.c cVar = s0.f129406a;
            return ge1.b.e0(x53.b.f189152a, new w52.g(file, eVar, null), dVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class f extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
        public f(Object obj) {
            super(0, obj, a.class, "init", "init()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((a) this.receiver).init();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class g extends p005kotlin.jvm.internal.q implements e23.l<com.garmin.android.apps.connectmobile.workouts.presentation.edit.o, Unit> {
        public g(Object obj) {
            super(1, obj, a.class, "handleActionState", "handleActionState(Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/WorkoutEditCreateActionState;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(com.garmin.android.apps.connectmobile.workouts.presentation.edit.o oVar) {
            com.garmin.android.apps.connectmobile.workouts.presentation.edit.o oVar2 = oVar;
            oVar2.getClass();
            a.da((a) this.receiver, oVar2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class h extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
        public h(Object obj) {
            super(0, obj, a.class, "displayFailedMessage", "displayFailedMessage()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            a aVar = (a) this.receiver;
            int i14 = a.f48898h;
            aVar.displayFailedMessage();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr52/d;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/q;", "it", "", "<anonymous>", "(Lr52/d;Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/q;)V"}, k = 3, mv = {2, 3, 0})
    public static final class i implements r52.b<com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, r52.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f48908a = new i();

        @Override // r52.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(r52.d dVar, com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar, p3.m mVar, int i14) {
            int i15;
            dVar.getClass();
            qVar.getClass();
            o0 o0VarE = mVar.E(-1094586776);
            if ((i14 & 6) == 0) {
                i15 = ((i14 & 8) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 4 : 2) | i14;
            } else {
                i15 = i14;
            }
            if ((i14 & 384) == 0) {
                i15 |= o0VarE.B(this) ? 256 : 128;
            }
            if (o0VarE.n(i15 & 1, (i15 & 131) != 130)) {
                x1 x1Var = p3.n.f135158a;
                s62.a.f157643a.getClass();
                dVar.a(o1.a(t62.b.f162798a));
            } else {
                o0VarE.e();
            }
            p2 p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new f21.a0(this, dVar, qVar, i14, 1);
            }
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class j extends p005kotlin.jvm.internal.a implements e23.a<Unit> {
        public j(Object obj) {
            super(0, obj, a.class, "onNavigateUp", "onNavigateUp()Z", 8);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((a) this.receiver).onBackPressed();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class k extends p005kotlin.jvm.internal.q implements e23.l<i3, Unit> {
        public k(Object obj) {
            super(1, obj, a.class, "onMenuItemSelected", "onMenuItemSelected(Lcom/garmin/android/apps/ui/TitleBarMenuItem;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(i3 i3Var) {
            i3 i3Var2 = i3Var;
            i3Var2.getClass();
            a aVar = (a) this.receiver;
            int i14 = a.f48898h;
            aVar.getClass();
            int i15 = b.f48906a[f62.w.valueOf(i3Var2.f111063a).ordinal()];
            if (i15 == 1) {
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVarGa = aVar.ga();
                ge1.b.T(v1.a(rVarGa), null, null, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.x((com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) v52.d.c(rVarGa.f49286m), rVarGa, null), 3);
            } else {
                if (i15 != 2) {
                    u0.r();
                    return null;
                }
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVarGa2 = aVar.ga();
                ge1.b.T(v1.a(rVarGa2), null, null, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.t(rVarGa2, null), 3);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class l extends p005kotlin.jvm.internal.q implements e23.t<e23.a<? extends r52.b<? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, ? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.p>>, List<? extends e23.a<? extends r52.b<? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, ? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.p>>>, List<? extends e23.a<? extends r52.b<? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, ? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.p>>>, e23.l<? super l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, ? extends r52.b<? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, ? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.p>>, e23.l<? super l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, ? extends r52.b<? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, ? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.p>>, e23.l<? super l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, ? extends r52.b<? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, ? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.p>>, com.garmin.android.apps.connectmobile.workouts.presentation.edit.l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f48909a = new l();

        public l() {
            super(6, com.garmin.android.apps.connectmobile.workouts.presentation.edit.l.class, "<init>", "<init>(Lkotlin/jvm/functions/Function0;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", 0);
        }

        @Override // e23.t
        public final com.garmin.android.apps.connectmobile.workouts.presentation.edit.l invoke(e23.a<? extends r52.b<? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, ? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.p>> aVar, List<? extends e23.a<? extends r52.b<? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, ? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.p>>> list, List<? extends e23.a<? extends r52.b<? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, ? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.p>>> list2, e23.l<? super l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, ? extends r52.b<? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, ? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.p>> lVar, e23.l<? super l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, ? extends r52.b<? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, ? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.p>> lVar2, e23.l<? super l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, ? extends r52.b<? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, ? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.p>> lVar3) {
            List<? extends e23.a<? extends r52.b<? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, ? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.p>>> list3 = list;
            List<? extends e23.a<? extends r52.b<? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, ? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.p>>> list4 = list2;
            e23.l<? super l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, ? extends r52.b<? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, ? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.p>> lVar4 = lVar;
            e23.l<? super l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, ? extends r52.b<? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, ? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.p>> lVar5 = lVar2;
            e23.l<? super l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, ? extends r52.b<? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, ? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.p>> lVar6 = lVar3;
            list3.getClass();
            list4.getClass();
            lVar4.getClass();
            lVar5.getClass();
            lVar6.getClass();
            return new com.garmin.android.apps.connectmobile.workouts.presentation.edit.l(aVar, list3, list4, lVar4, lVar5, lVar6);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class m extends p005kotlin.jvm.internal.q implements e23.l<l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, com.garmin.android.apps.connectmobile.workouts.presentation.edit.n> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f48910a = new m();

        public m() {
            super(1, com.garmin.android.apps.connectmobile.workouts.presentation.edit.n.class, "<init>", "<init>(Lcom/garmin/android/apps/connectmobile/workouts/data/Tree$Node;)V", 0);
        }

        @Override // e23.l
        public final com.garmin.android.apps.connectmobile.workouts.presentation.edit.n invoke(l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar) {
            l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar2 = aVar;
            aVar2.getClass();
            return new com.garmin.android.apps.connectmobile.workouts.presentation.edit.n(aVar2);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class n extends p005kotlin.jvm.internal.q implements e23.l<l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, com.garmin.android.apps.connectmobile.workouts.presentation.edit.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f48911a = new n();

        public n() {
            super(1, com.garmin.android.apps.connectmobile.workouts.presentation.edit.m.class, "<init>", "<init>(Lcom/garmin/android/apps/connectmobile/workouts/data/Tree$Node;)V", 0);
        }

        @Override // e23.l
        public final com.garmin.android.apps.connectmobile.workouts.presentation.edit.m invoke(l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar) {
            l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar2 = aVar;
            aVar2.getClass();
            return new com.garmin.android.apps.connectmobile.workouts.presentation.edit.m(aVar2);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class o extends p005kotlin.jvm.internal.q implements e23.l<l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, f62.x> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f48912a = new o();

        public o() {
            super(1, f62.x.class, "<init>", "<init>(Lcom/garmin/android/apps/connectmobile/workouts/data/Tree$Node;)V", 0);
        }

        @Override // e23.l
        public final f62.x invoke(l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar) {
            l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar2 = aVar;
            aVar2.getClass();
            return new f62.x(aVar2);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class p extends p005kotlin.jvm.internal.q implements e23.a<com.garmin.android.apps.connectmobile.workouts.presentation.edit.i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p f48913a = new p();

        public p() {
            super(0, com.garmin.android.apps.connectmobile.workouts.presentation.edit.i.class, "<init>", "<init>()V", 0);
        }

        @Override // e23.a
        public final com.garmin.android.apps.connectmobile.workouts.presentation.edit.i invoke() {
            return new com.garmin.android.apps.connectmobile.workouts.presentation.edit.i();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class q extends p005kotlin.jvm.internal.q implements e23.a<f62.v> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final q f48914a = new q();

        public q() {
            super(0, f62.v.class, "<init>", "<init>()V", 0);
        }

        @Override // e23.a
        public final f62.v invoke() {
            return new f62.v();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class r extends p005kotlin.jvm.internal.q implements e23.a<com.garmin.android.apps.connectmobile.workouts.presentation.edit.k> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final r f48915a = new r();

        public r() {
            super(0, com.garmin.android.apps.connectmobile.workouts.presentation.edit.k.class, "<init>", "<init>()V", 0);
        }

        @Override // e23.a
        public final com.garmin.android.apps.connectmobile.workouts.presentation.edit.k invoke() {
            return new com.garmin.android.apps.connectmobile.workouts.presentation.edit.k();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class s extends p005kotlin.jvm.internal.q implements e23.a<com.garmin.android.apps.connectmobile.workouts.presentation.edit.j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s f48916a = new s();

        public s() {
            super(0, com.garmin.android.apps.connectmobile.workouts.presentation.edit.j.class, "<init>", "<init>()V", 0);
        }

        @Override // e23.a
        public final com.garmin.android.apps.connectmobile.workouts.presentation.edit.j invoke() {
            return new com.garmin.android.apps.connectmobile.workouts.presentation.edit.j();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr52/f;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/q;", "it", "", "<anonymous>", "(Lr52/f;Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/q;)V"}, k = 3, mv = {2, 3, 0})
    public static final class t implements r52.b<com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, r52.f> {
        public t() {
        }

        @Override // r52.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(r52.f fVar, com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar, p3.m mVar, int i14) {
            int i15;
            String f48855i;
            fVar.getClass();
            qVar.getClass();
            o0 o0VarE = mVar.E(1179953611);
            if ((i14 & 6) == 0) {
                i15 = ((i14 & 8) == 0 ? o0VarE.B(fVar) : o0VarE.r(fVar) ? 4 : 2) | i14;
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= o0VarE.r(qVar) ? 32 : 16;
            }
            if ((i14 & 384) == 0) {
                i15 |= o0VarE.B(this) ? 256 : 128;
            }
            if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
                x1 x1Var = p3.n.f135158a;
                if (qVar.f49269y) {
                    f48855i = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 64055927, R.string.lbl_reorder_workout, o0VarE, false);
                } else {
                    o0VarE.C(64058736);
                    o0VarE.g0(false);
                    f48855i = a.this.getF48855i();
                }
                fVar.e(f48855i);
            } else {
                o0VarE.e();
            }
            p2 p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new f21.a0(this, fVar, qVar, i14, 2);
            }
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class u implements e23.a<androidx.lifecycle.x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f48918a;

        public u(b.g gVar) {
            this.f48918a = gVar;
        }

        @Override // e23.a
        public final androidx.lifecycle.x1.c invoke() {
            return this.f48918a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class v implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f48919a;

        public v(b.g gVar) {
            this.f48919a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f48919a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f48920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f48921b;

        public w(e23.a aVar, b.g gVar) {
            this.f48920a = aVar;
            this.f48921b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f48920a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f48921b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class x implements e23.a<androidx.lifecycle.x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f48922a;

        public x(b.g gVar) {
            this.f48922a = gVar;
        }

        @Override // e23.a
        public final androidx.lifecycle.x1.c invoke() {
            return this.f48922a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class y implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f48923a;

        public y(b.g gVar) {
            this.f48923a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f48923a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class z implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f48924a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f48925b;

        public z(e23.a aVar, b.g gVar) {
            this.f48924a = aVar;
            this.f48925b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f48924a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f48925b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    static {
        new C0954a(null);
    }

    public a() {
        u uVar = new u(this);
        t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
        this.f48899a = new w1(t0Var.b(com.garmin.android.apps.connectmobile.workouts.presentation.edit.r.class), new v(this), uVar, new w(null, this));
        this.f48900b = new w1(t0Var.b(w52.e.class), new y(this), new x(this), new z(null, this));
        final int i14 = 0;
        this.f48902d = registerForActivityResult(new g.h(), new f.b(this) { // from class: f62.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.a f69224b;

            {
                this.f69224b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var;
                Parcelable parcelable;
                Parcelable parcelable2;
                m52.j jVar;
                Object serializableExtra;
                com.garmin.android.apps.connectmobile.workouts.data.model.a aVar;
                Parcelable parcelable3;
                int i15 = i14;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.a aVar2 = this.f69224b;
                f.a aVar3 = (f.a) obj;
                switch (i15) {
                    case 0:
                        int i16 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.a.f48898h;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            Intent intent = aVar3.f67586b;
                            if (intent != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent.getParcelableExtra("GCM_workout_dto", com.garmin.android.apps.connectmobile.workouts.data.model.j0.class);
                                } else {
                                    Parcelable parcelableExtra = intent.getParcelableExtra("GCM_workout_dto");
                                    if (!(parcelableExtra instanceof com.garmin.android.apps.connectmobile.workouts.data.model.j0)) {
                                        parcelableExtra = null;
                                    }
                                    parcelable = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) parcelableExtra;
                                }
                                j0Var = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) parcelable;
                            } else {
                                j0Var = null;
                            }
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVarGa = aVar2.ga();
                            ge1.b.T(v1.a(rVarGa), null, null, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.a0(j0Var, rVarGa, null), 3);
                        }
                        break;
                    case 1:
                        int i17 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.a.f48898h;
                        aVar3.getClass();
                        Intent intent2 = aVar3.f67586b;
                        int i18 = aVar3.f67585a;
                        if (i18 == -1) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable2 = intent2 != null ? (Parcelable) intent2.getParcelableExtra("GCM_workout_dto", com.garmin.android.apps.connectmobile.workouts.data.model.j0.class) : null;
                            } else {
                                Parcelable parcelableExtra2 = intent2 != null ? intent2.getParcelableExtra("GCM_workout_dto") : null;
                                if (!(parcelableExtra2 instanceof com.garmin.android.apps.connectmobile.workouts.data.model.j0)) {
                                    parcelableExtra2 = null;
                                }
                                parcelable2 = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) parcelableExtra2;
                            }
                            com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var2 = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) parcelable2;
                            Boolean boolValueOf = intent2 != null ? Boolean.valueOf(intent2.getBooleanExtra("GCM_workout_audio_changed", false)) : null;
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVarGa2 = aVar2.ga();
                            ge1.b.T(v1.a(rVarGa2), null, null, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.z(j0Var2, rVarGa2, boolValueOf, null), 3);
                        } else if (i18 == 2) {
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVarGa3 = aVar2.ga();
                            ge1.b.T(v1.a(rVarGa3), null, null, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.y(rVarGa3, null), 3);
                        } else {
                            a2 a2Var = a2.WORKOUTS;
                            i2.f36769a.getClass();
                            a2Var.getClass();
                            gt2.c.b(a2Var.f28756a).info("RESULT_CANCELED");
                        }
                        break;
                    case 2:
                        int i19 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.a.f48898h;
                        aVar3.getClass();
                        Intent intent3 = aVar3.f67586b;
                        if (aVar3.f67585a == -1) {
                            Double dValueOf = (intent3 == null || !intent3.hasExtra("com.garmin.android.apps.connectmobile.workouts.step.PoolSizeEditActivity.extra.pool_size_value")) ? null : Double.valueOf(intent3.getDoubleExtra("com.garmin.android.apps.connectmobile.workouts.step.PoolSizeEditActivity.extra.pool_size_value", Double.NaN));
                            if (intent3 != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    serializableExtra = intent3.getSerializableExtra("com.garmin.android.apps.connectmobile.workouts.step.PoolSizeEditActivity.extra.pool_size_unit", m52.j.class);
                                } else {
                                    Object serializableExtra2 = intent3.getSerializableExtra("com.garmin.android.apps.connectmobile.workouts.step.PoolSizeEditActivity.extra.pool_size_unit");
                                    if (!(serializableExtra2 instanceof m52.j)) {
                                        serializableExtra2 = null;
                                    }
                                    serializableExtra = (m52.j) serializableExtra2;
                                }
                                jVar = (m52.j) serializableExtra;
                            } else {
                                jVar = null;
                            }
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVarGa4 = aVar2.ga();
                            ge1.b.T(v1.a(rVarGa4), null, null, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.b0(rVarGa4, dValueOf, jVar, null), 3);
                        }
                        break;
                    default:
                        int i24 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.a.f48898h;
                        aVar3.getClass();
                        Intent intent4 = aVar3.f67586b;
                        if (aVar3.f67585a == -1) {
                            String stringExtra = intent4 != null ? intent4.getStringExtra("com.garmin.android.apps.connectmobile.workouts.edit.WorkoutEditNotesActivity.extra.text_note") : null;
                            if (intent4 != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable3 = (Parcelable) intent4.getParcelableExtra("com.garmin.android.apps.connectmobile.workouts.edit.WorkoutEditNotesActivity.extra.audio_note", com.garmin.android.apps.connectmobile.workouts.data.model.a.class);
                                } else {
                                    Parcelable parcelableExtra3 = intent4.getParcelableExtra("com.garmin.android.apps.connectmobile.workouts.edit.WorkoutEditNotesActivity.extra.audio_note");
                                    if (!(parcelableExtra3 instanceof com.garmin.android.apps.connectmobile.workouts.data.model.a)) {
                                        parcelableExtra3 = null;
                                    }
                                    parcelable3 = (com.garmin.android.apps.connectmobile.workouts.data.model.a) parcelableExtra3;
                                }
                                aVar = (com.garmin.android.apps.connectmobile.workouts.data.model.a) parcelable3;
                            } else {
                                aVar = null;
                            }
                            String stringExtra2 = intent4 != null ? intent4.getStringExtra("com.garmin.android.apps.connectmobile.workouts.edit.WorkoutEditNotesActivity.extra.audio_file") : null;
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVarGa5 = aVar2.ga();
                            ge1.b.T(v1.a(rVarGa5), null, null, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.e0(rVarGa5, stringExtra2, aVar, stringExtra, null), 3);
                        }
                        break;
                }
            }
        });
        final int i15 = 1;
        this.f48903e = registerForActivityResult(new g.h(), new f.b(this) { // from class: f62.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.a f69224b;

            {
                this.f69224b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var;
                Parcelable parcelable;
                Parcelable parcelable2;
                m52.j jVar;
                Object serializableExtra;
                com.garmin.android.apps.connectmobile.workouts.data.model.a aVar;
                Parcelable parcelable3;
                int i16 = i15;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.a aVar2 = this.f69224b;
                f.a aVar3 = (f.a) obj;
                switch (i16) {
                    case 0:
                        int i17 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.a.f48898h;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            Intent intent = aVar3.f67586b;
                            if (intent != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent.getParcelableExtra("GCM_workout_dto", com.garmin.android.apps.connectmobile.workouts.data.model.j0.class);
                                } else {
                                    Parcelable parcelableExtra = intent.getParcelableExtra("GCM_workout_dto");
                                    if (!(parcelableExtra instanceof com.garmin.android.apps.connectmobile.workouts.data.model.j0)) {
                                        parcelableExtra = null;
                                    }
                                    parcelable = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) parcelableExtra;
                                }
                                j0Var = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) parcelable;
                            } else {
                                j0Var = null;
                            }
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVarGa = aVar2.ga();
                            ge1.b.T(v1.a(rVarGa), null, null, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.a0(j0Var, rVarGa, null), 3);
                        }
                        break;
                    case 1:
                        int i18 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.a.f48898h;
                        aVar3.getClass();
                        Intent intent2 = aVar3.f67586b;
                        int i19 = aVar3.f67585a;
                        if (i19 == -1) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable2 = intent2 != null ? (Parcelable) intent2.getParcelableExtra("GCM_workout_dto", com.garmin.android.apps.connectmobile.workouts.data.model.j0.class) : null;
                            } else {
                                Parcelable parcelableExtra2 = intent2 != null ? intent2.getParcelableExtra("GCM_workout_dto") : null;
                                if (!(parcelableExtra2 instanceof com.garmin.android.apps.connectmobile.workouts.data.model.j0)) {
                                    parcelableExtra2 = null;
                                }
                                parcelable2 = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) parcelableExtra2;
                            }
                            com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var2 = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) parcelable2;
                            Boolean boolValueOf = intent2 != null ? Boolean.valueOf(intent2.getBooleanExtra("GCM_workout_audio_changed", false)) : null;
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVarGa2 = aVar2.ga();
                            ge1.b.T(v1.a(rVarGa2), null, null, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.z(j0Var2, rVarGa2, boolValueOf, null), 3);
                        } else if (i19 == 2) {
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVarGa3 = aVar2.ga();
                            ge1.b.T(v1.a(rVarGa3), null, null, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.y(rVarGa3, null), 3);
                        } else {
                            a2 a2Var = a2.WORKOUTS;
                            i2.f36769a.getClass();
                            a2Var.getClass();
                            gt2.c.b(a2Var.f28756a).info("RESULT_CANCELED");
                        }
                        break;
                    case 2:
                        int i110 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.a.f48898h;
                        aVar3.getClass();
                        Intent intent3 = aVar3.f67586b;
                        if (aVar3.f67585a == -1) {
                            Double dValueOf = (intent3 == null || !intent3.hasExtra("com.garmin.android.apps.connectmobile.workouts.step.PoolSizeEditActivity.extra.pool_size_value")) ? null : Double.valueOf(intent3.getDoubleExtra("com.garmin.android.apps.connectmobile.workouts.step.PoolSizeEditActivity.extra.pool_size_value", Double.NaN));
                            if (intent3 != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    serializableExtra = intent3.getSerializableExtra("com.garmin.android.apps.connectmobile.workouts.step.PoolSizeEditActivity.extra.pool_size_unit", m52.j.class);
                                } else {
                                    Object serializableExtra2 = intent3.getSerializableExtra("com.garmin.android.apps.connectmobile.workouts.step.PoolSizeEditActivity.extra.pool_size_unit");
                                    if (!(serializableExtra2 instanceof m52.j)) {
                                        serializableExtra2 = null;
                                    }
                                    serializableExtra = (m52.j) serializableExtra2;
                                }
                                jVar = (m52.j) serializableExtra;
                            } else {
                                jVar = null;
                            }
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVarGa4 = aVar2.ga();
                            ge1.b.T(v1.a(rVarGa4), null, null, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.b0(rVarGa4, dValueOf, jVar, null), 3);
                        }
                        break;
                    default:
                        int i24 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.a.f48898h;
                        aVar3.getClass();
                        Intent intent4 = aVar3.f67586b;
                        if (aVar3.f67585a == -1) {
                            String stringExtra = intent4 != null ? intent4.getStringExtra("com.garmin.android.apps.connectmobile.workouts.edit.WorkoutEditNotesActivity.extra.text_note") : null;
                            if (intent4 != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable3 = (Parcelable) intent4.getParcelableExtra("com.garmin.android.apps.connectmobile.workouts.edit.WorkoutEditNotesActivity.extra.audio_note", com.garmin.android.apps.connectmobile.workouts.data.model.a.class);
                                } else {
                                    Parcelable parcelableExtra3 = intent4.getParcelableExtra("com.garmin.android.apps.connectmobile.workouts.edit.WorkoutEditNotesActivity.extra.audio_note");
                                    if (!(parcelableExtra3 instanceof com.garmin.android.apps.connectmobile.workouts.data.model.a)) {
                                        parcelableExtra3 = null;
                                    }
                                    parcelable3 = (com.garmin.android.apps.connectmobile.workouts.data.model.a) parcelableExtra3;
                                }
                                aVar = (com.garmin.android.apps.connectmobile.workouts.data.model.a) parcelable3;
                            } else {
                                aVar = null;
                            }
                            String stringExtra2 = intent4 != null ? intent4.getStringExtra("com.garmin.android.apps.connectmobile.workouts.edit.WorkoutEditNotesActivity.extra.audio_file") : null;
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVarGa5 = aVar2.ga();
                            ge1.b.T(v1.a(rVarGa5), null, null, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.e0(rVarGa5, stringExtra2, aVar, stringExtra, null), 3);
                        }
                        break;
                }
            }
        });
        final int i16 = 2;
        this.f48904f = registerForActivityResult(new g.h(), new f.b(this) { // from class: f62.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.a f69224b;

            {
                this.f69224b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var;
                Parcelable parcelable;
                Parcelable parcelable2;
                m52.j jVar;
                Object serializableExtra;
                com.garmin.android.apps.connectmobile.workouts.data.model.a aVar;
                Parcelable parcelable3;
                int i17 = i16;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.a aVar2 = this.f69224b;
                f.a aVar3 = (f.a) obj;
                switch (i17) {
                    case 0:
                        int i18 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.a.f48898h;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            Intent intent = aVar3.f67586b;
                            if (intent != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent.getParcelableExtra("GCM_workout_dto", com.garmin.android.apps.connectmobile.workouts.data.model.j0.class);
                                } else {
                                    Parcelable parcelableExtra = intent.getParcelableExtra("GCM_workout_dto");
                                    if (!(parcelableExtra instanceof com.garmin.android.apps.connectmobile.workouts.data.model.j0)) {
                                        parcelableExtra = null;
                                    }
                                    parcelable = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) parcelableExtra;
                                }
                                j0Var = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) parcelable;
                            } else {
                                j0Var = null;
                            }
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVarGa = aVar2.ga();
                            ge1.b.T(v1.a(rVarGa), null, null, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.a0(j0Var, rVarGa, null), 3);
                        }
                        break;
                    case 1:
                        int i19 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.a.f48898h;
                        aVar3.getClass();
                        Intent intent2 = aVar3.f67586b;
                        int i110 = aVar3.f67585a;
                        if (i110 == -1) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable2 = intent2 != null ? (Parcelable) intent2.getParcelableExtra("GCM_workout_dto", com.garmin.android.apps.connectmobile.workouts.data.model.j0.class) : null;
                            } else {
                                Parcelable parcelableExtra2 = intent2 != null ? intent2.getParcelableExtra("GCM_workout_dto") : null;
                                if (!(parcelableExtra2 instanceof com.garmin.android.apps.connectmobile.workouts.data.model.j0)) {
                                    parcelableExtra2 = null;
                                }
                                parcelable2 = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) parcelableExtra2;
                            }
                            com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var2 = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) parcelable2;
                            Boolean boolValueOf = intent2 != null ? Boolean.valueOf(intent2.getBooleanExtra("GCM_workout_audio_changed", false)) : null;
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVarGa2 = aVar2.ga();
                            ge1.b.T(v1.a(rVarGa2), null, null, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.z(j0Var2, rVarGa2, boolValueOf, null), 3);
                        } else if (i110 == 2) {
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVarGa3 = aVar2.ga();
                            ge1.b.T(v1.a(rVarGa3), null, null, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.y(rVarGa3, null), 3);
                        } else {
                            a2 a2Var = a2.WORKOUTS;
                            i2.f36769a.getClass();
                            a2Var.getClass();
                            gt2.c.b(a2Var.f28756a).info("RESULT_CANCELED");
                        }
                        break;
                    case 2:
                        int i111 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.a.f48898h;
                        aVar3.getClass();
                        Intent intent3 = aVar3.f67586b;
                        if (aVar3.f67585a == -1) {
                            Double dValueOf = (intent3 == null || !intent3.hasExtra("com.garmin.android.apps.connectmobile.workouts.step.PoolSizeEditActivity.extra.pool_size_value")) ? null : Double.valueOf(intent3.getDoubleExtra("com.garmin.android.apps.connectmobile.workouts.step.PoolSizeEditActivity.extra.pool_size_value", Double.NaN));
                            if (intent3 != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    serializableExtra = intent3.getSerializableExtra("com.garmin.android.apps.connectmobile.workouts.step.PoolSizeEditActivity.extra.pool_size_unit", m52.j.class);
                                } else {
                                    Object serializableExtra2 = intent3.getSerializableExtra("com.garmin.android.apps.connectmobile.workouts.step.PoolSizeEditActivity.extra.pool_size_unit");
                                    if (!(serializableExtra2 instanceof m52.j)) {
                                        serializableExtra2 = null;
                                    }
                                    serializableExtra = (m52.j) serializableExtra2;
                                }
                                jVar = (m52.j) serializableExtra;
                            } else {
                                jVar = null;
                            }
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVarGa4 = aVar2.ga();
                            ge1.b.T(v1.a(rVarGa4), null, null, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.b0(rVarGa4, dValueOf, jVar, null), 3);
                        }
                        break;
                    default:
                        int i24 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.a.f48898h;
                        aVar3.getClass();
                        Intent intent4 = aVar3.f67586b;
                        if (aVar3.f67585a == -1) {
                            String stringExtra = intent4 != null ? intent4.getStringExtra("com.garmin.android.apps.connectmobile.workouts.edit.WorkoutEditNotesActivity.extra.text_note") : null;
                            if (intent4 != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable3 = (Parcelable) intent4.getParcelableExtra("com.garmin.android.apps.connectmobile.workouts.edit.WorkoutEditNotesActivity.extra.audio_note", com.garmin.android.apps.connectmobile.workouts.data.model.a.class);
                                } else {
                                    Parcelable parcelableExtra3 = intent4.getParcelableExtra("com.garmin.android.apps.connectmobile.workouts.edit.WorkoutEditNotesActivity.extra.audio_note");
                                    if (!(parcelableExtra3 instanceof com.garmin.android.apps.connectmobile.workouts.data.model.a)) {
                                        parcelableExtra3 = null;
                                    }
                                    parcelable3 = (com.garmin.android.apps.connectmobile.workouts.data.model.a) parcelableExtra3;
                                }
                                aVar = (com.garmin.android.apps.connectmobile.workouts.data.model.a) parcelable3;
                            } else {
                                aVar = null;
                            }
                            String stringExtra2 = intent4 != null ? intent4.getStringExtra("com.garmin.android.apps.connectmobile.workouts.edit.WorkoutEditNotesActivity.extra.audio_file") : null;
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVarGa5 = aVar2.ga();
                            ge1.b.T(v1.a(rVarGa5), null, null, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.e0(rVarGa5, stringExtra2, aVar, stringExtra, null), 3);
                        }
                        break;
                }
            }
        });
        final int i17 = 3;
        this.f48905g = registerForActivityResult(new g.h(), new f.b(this) { // from class: f62.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.a f69224b;

            {
                this.f69224b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var;
                Parcelable parcelable;
                Parcelable parcelable2;
                m52.j jVar;
                Object serializableExtra;
                com.garmin.android.apps.connectmobile.workouts.data.model.a aVar;
                Parcelable parcelable3;
                int i18 = i17;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.a aVar2 = this.f69224b;
                f.a aVar3 = (f.a) obj;
                switch (i18) {
                    case 0:
                        int i19 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.a.f48898h;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            Intent intent = aVar3.f67586b;
                            if (intent != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent.getParcelableExtra("GCM_workout_dto", com.garmin.android.apps.connectmobile.workouts.data.model.j0.class);
                                } else {
                                    Parcelable parcelableExtra = intent.getParcelableExtra("GCM_workout_dto");
                                    if (!(parcelableExtra instanceof com.garmin.android.apps.connectmobile.workouts.data.model.j0)) {
                                        parcelableExtra = null;
                                    }
                                    parcelable = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) parcelableExtra;
                                }
                                j0Var = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) parcelable;
                            } else {
                                j0Var = null;
                            }
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVarGa = aVar2.ga();
                            ge1.b.T(v1.a(rVarGa), null, null, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.a0(j0Var, rVarGa, null), 3);
                        }
                        break;
                    case 1:
                        int i110 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.a.f48898h;
                        aVar3.getClass();
                        Intent intent2 = aVar3.f67586b;
                        int i111 = aVar3.f67585a;
                        if (i111 == -1) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable2 = intent2 != null ? (Parcelable) intent2.getParcelableExtra("GCM_workout_dto", com.garmin.android.apps.connectmobile.workouts.data.model.j0.class) : null;
                            } else {
                                Parcelable parcelableExtra2 = intent2 != null ? intent2.getParcelableExtra("GCM_workout_dto") : null;
                                if (!(parcelableExtra2 instanceof com.garmin.android.apps.connectmobile.workouts.data.model.j0)) {
                                    parcelableExtra2 = null;
                                }
                                parcelable2 = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) parcelableExtra2;
                            }
                            com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var2 = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) parcelable2;
                            Boolean boolValueOf = intent2 != null ? Boolean.valueOf(intent2.getBooleanExtra("GCM_workout_audio_changed", false)) : null;
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVarGa2 = aVar2.ga();
                            ge1.b.T(v1.a(rVarGa2), null, null, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.z(j0Var2, rVarGa2, boolValueOf, null), 3);
                        } else if (i111 == 2) {
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVarGa3 = aVar2.ga();
                            ge1.b.T(v1.a(rVarGa3), null, null, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.y(rVarGa3, null), 3);
                        } else {
                            a2 a2Var = a2.WORKOUTS;
                            i2.f36769a.getClass();
                            a2Var.getClass();
                            gt2.c.b(a2Var.f28756a).info("RESULT_CANCELED");
                        }
                        break;
                    case 2:
                        int i112 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.a.f48898h;
                        aVar3.getClass();
                        Intent intent3 = aVar3.f67586b;
                        if (aVar3.f67585a == -1) {
                            Double dValueOf = (intent3 == null || !intent3.hasExtra("com.garmin.android.apps.connectmobile.workouts.step.PoolSizeEditActivity.extra.pool_size_value")) ? null : Double.valueOf(intent3.getDoubleExtra("com.garmin.android.apps.connectmobile.workouts.step.PoolSizeEditActivity.extra.pool_size_value", Double.NaN));
                            if (intent3 != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    serializableExtra = intent3.getSerializableExtra("com.garmin.android.apps.connectmobile.workouts.step.PoolSizeEditActivity.extra.pool_size_unit", m52.j.class);
                                } else {
                                    Object serializableExtra2 = intent3.getSerializableExtra("com.garmin.android.apps.connectmobile.workouts.step.PoolSizeEditActivity.extra.pool_size_unit");
                                    if (!(serializableExtra2 instanceof m52.j)) {
                                        serializableExtra2 = null;
                                    }
                                    serializableExtra = (m52.j) serializableExtra2;
                                }
                                jVar = (m52.j) serializableExtra;
                            } else {
                                jVar = null;
                            }
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVarGa4 = aVar2.ga();
                            ge1.b.T(v1.a(rVarGa4), null, null, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.b0(rVarGa4, dValueOf, jVar, null), 3);
                        }
                        break;
                    default:
                        int i24 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.a.f48898h;
                        aVar3.getClass();
                        Intent intent4 = aVar3.f67586b;
                        if (aVar3.f67585a == -1) {
                            String stringExtra = intent4 != null ? intent4.getStringExtra("com.garmin.android.apps.connectmobile.workouts.edit.WorkoutEditNotesActivity.extra.text_note") : null;
                            if (intent4 != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable3 = (Parcelable) intent4.getParcelableExtra("com.garmin.android.apps.connectmobile.workouts.edit.WorkoutEditNotesActivity.extra.audio_note", com.garmin.android.apps.connectmobile.workouts.data.model.a.class);
                                } else {
                                    Parcelable parcelableExtra3 = intent4.getParcelableExtra("com.garmin.android.apps.connectmobile.workouts.edit.WorkoutEditNotesActivity.extra.audio_note");
                                    if (!(parcelableExtra3 instanceof com.garmin.android.apps.connectmobile.workouts.data.model.a)) {
                                        parcelableExtra3 = null;
                                    }
                                    parcelable3 = (com.garmin.android.apps.connectmobile.workouts.data.model.a) parcelableExtra3;
                                }
                                aVar = (com.garmin.android.apps.connectmobile.workouts.data.model.a) parcelable3;
                            } else {
                                aVar = null;
                            }
                            String stringExtra2 = intent4 != null ? intent4.getStringExtra("com.garmin.android.apps.connectmobile.workouts.edit.WorkoutEditNotesActivity.extra.audio_file") : null;
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVarGa5 = aVar2.ga();
                            ge1.b.T(v1.a(rVarGa5), null, null, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.e0(rVarGa5, stringExtra2, aVar, stringExtra, null), 3);
                        }
                        break;
                }
            }
        });
    }

    public static void ca(a aVar) {
        if (aVar.ga().f49281h.isEmpty()) {
            super.onBackPressed();
            return;
        }
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVarGa = aVar.ga();
        w9.a aVarA = v1.a(rVarGa);
        x53.c cVar = s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.s(rVarGa, null), 2);
    }

    public static final void da(final a aVar, final com.garmin.android.apps.connectmobile.workouts.presentation.edit.o oVar) {
        int i14;
        aVar.getClass();
        if (oVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.p) {
            super.onBackPressed();
            return;
        }
        if (oVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.r) {
            com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.r rVar = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.r) oVar;
            Long l14 = rVar.f49242a;
            long j8 = rVar.f49243b;
            if (l14 != null) {
                Intent intent = new Intent(aVar.getApplicationContext(), (Class<?>) WorkoutDetailsActivity.class);
                intent.putExtra("GCM_extra_activity_type", 213);
                intent.putExtra("GCM_workout_id", j8);
                intent.putExtra("GCM_workout_queue_download_to_device", l14.longValue());
                aVar.startActivity(intent);
            }
            aVar.setResult(-1);
            aVar.finish();
            return;
        }
        if (oVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.q) {
            Toast.makeText(aVar, R.string.workout_create_failed, 0).show();
            return;
        }
        if (oVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.s) {
            Toast.makeText(aVar, R.string.workout_update_failed, 0).show();
            return;
        }
        if (oVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.i) {
            new androidx.appcompat.app.e.a(aVar).setMessage(R.string.workout_message_save_empty_repeat).setPositiveButton(aVar.getString(R.string.lbl_ok), (DialogInterface.OnClickListener) null).show();
            return;
        }
        if (oVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.n) {
            int i15 = b.f48907b[((com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.n) oVar).f49238a.ordinal()];
            if (i15 == 1 || i15 == 2) {
                i14 = R.string.msg_workout_move_validation;
            } else {
                i14 = i15 != 3 ? R.string.workout_select_exercise_msg : R.string.msg_workout_pose_validation;
            }
            new androidx.appcompat.app.e.a(aVar).setMessage(i14).setPositiveButton(aVar.getString(R.string.lbl_ok), (DialogInterface.OnClickListener) null).show();
            return;
        }
        if (oVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.c) {
            aVar.f48903e.a(((com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.c) oVar).f49215a, null);
            return;
        }
        if (oVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.g) {
            com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.g gVar = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.g) oVar;
            String string = aVar.getString(gVar.f49223a);
            String string2 = aVar.getString(gVar.f49224b);
            string2.getClass();
            final int i16 = 0;
            v52.a.a(aVar, string, string2, new DialogInterface.OnClickListener(aVar) { // from class: f62.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.a f69211b;

                {
                    this.f69211b = aVar;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i17) {
                    int i18 = i16;
                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.o oVar2 = oVar;
                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.a aVar2 = this.f69211b;
                    switch (i18) {
                        case 0:
                            int i19 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.a.f48898h;
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVarGa = aVar2.ga();
                            ge1.b.T(v1.a(rVarGa), null, null, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.u(rVarGa, ((com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.g) oVar2).f49225c, null), 3);
                            break;
                        case 1:
                            int i24 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.a.f48898h;
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVarGa2 = aVar2.ga();
                            ge1.b.T(v1.a(rVarGa2), null, null, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.u(rVarGa2, ((com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.h) oVar2).f49227b, null), 3);
                            break;
                        default:
                            int i25 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.a.f48898h;
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.l lVar = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.l) oVar2;
                            aVar2.ga().t(lVar.f49236c, lVar.f49234a, lVar.f49235b);
                            break;
                    }
                }
            });
            return;
        }
        if (oVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.h) {
            x52.e.a aVar2 = x52.e.f189070c;
            com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.h hVar = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.h) oVar;
            m52.d dVar = ((com.garmin.android.apps.connectmobile.workouts.data.model.j0) hVar.f49227b.getData()).f48217c;
            aVar2.getClass();
            String string3 = aVar.getString(R.string.workout_delete_step, x52.e.a.a(dVar).b(aVar, hVar.f49226a));
            string3.getClass();
            final int i17 = 1;
            v52.a.a(aVar, null, string3, new DialogInterface.OnClickListener(aVar) { // from class: f62.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.a f69211b;

                {
                    this.f69211b = aVar;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i18) {
                    int i19 = i17;
                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.o oVar2 = oVar;
                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.a aVar3 = this.f69211b;
                    switch (i19) {
                        case 0:
                            int i110 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.a.f48898h;
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVarGa = aVar3.ga();
                            ge1.b.T(v1.a(rVarGa), null, null, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.u(rVarGa, ((com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.g) oVar2).f49225c, null), 3);
                            break;
                        case 1:
                            int i24 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.a.f48898h;
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVarGa2 = aVar3.ga();
                            ge1.b.T(v1.a(rVarGa2), null, null, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.u(rVarGa2, ((com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.h) oVar2).f49227b, null), 3);
                            break;
                        default:
                            int i25 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.a.f48898h;
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.l lVar = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.l) oVar2;
                            aVar3.ga().t(lVar.f49236c, lVar.f49234a, lVar.f49235b);
                            break;
                    }
                }
            });
            return;
        }
        if (oVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.a) {
            com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.a aVar3 = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.a) oVar;
            String str = aVar3.f49208a;
            if (!aVar3.f49209b) {
                q0 q0Var = aVar.f48901c;
                if (q0Var != null) {
                    q0Var.dismiss();
                    return;
                }
                return;
            }
            q0.b bVar = q0.f149800b;
            View viewFindViewById = aVar.findViewById(R.id.btn_container);
            viewFindViewById.getClass();
            q0 duration = q0.b.c(bVar, viewFindViewById, str, null, 12).setDuration(-2);
            aVar.f48901c = duration;
            if (duration != null) {
                duration.show();
                return;
            }
            return;
        }
        if (oVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.C0966o) {
            new androidx.appcompat.app.e.a(aVar).setMessage(((com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.C0966o) oVar).f49239a).setNegativeButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null).show();
            return;
        }
        if (oVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.k) {
            com.garmin.android.apps.connectmobile.workouts.presentation.edit.f.a aVar4 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.f.f48979n;
            com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.k kVar = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.k) oVar;
            int i18 = kVar.f49233d;
            Boolean bool = kVar.f49231b;
            String str2 = kVar.f49232c;
            aVar4.getClass();
            com.garmin.android.apps.connectmobile.workouts.presentation.edit.f fVar = new com.garmin.android.apps.connectmobile.workouts.presentation.edit.f();
            Bundle bundle = new Bundle();
            bundle.putInt("MIN_VALUE", 1);
            bundle.putInt("MAX_VALUE", 40);
            bundle.putInt("DEFAULT_VALUE", i18);
            if (bool != null) {
                bundle.putBoolean("SKIP_LAST_REST_STEP", bool.booleanValue());
            }
            if (str2 != null) {
                bundle.putString("STEP_TYPE_NAME", str2);
            }
            fVar.setArguments(bundle);
            fVar.f48980f = new com.garmin.android.apps.connectmobile.workouts.presentation.edit.b(aVar, oVar);
            fVar.show(aVar.getSupportFragmentManager(), "");
            return;
        }
        if (oVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.e) {
            f.c<Intent> cVar = aVar.f48904f;
            PoolSizeEditActivity.a aVar5 = PoolSizeEditActivity.f48844c;
            Context applicationContext = aVar.getApplicationContext();
            applicationContext.getClass();
            com.garmin.android.apps.connectmobile.workouts.presentation.edit.d dVar2 = ((com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.e) oVar).f49219a;
            Double dValueOf = Double.valueOf(dVar2.getF48947b());
            m52.j f48948c = dVar2.getF48948c();
            aVar5.getClass();
            Intent intent2 = new Intent(applicationContext, (Class<?>) PoolSizeEditActivity.class);
            intent2.putExtra("com.garmin.android.apps.connectmobile.workouts.step.PoolSizeEditActivity.extra.pool_size_value", dValueOf);
            intent2.putExtra("com.garmin.android.apps.connectmobile.workouts.step.PoolSizeEditActivity.extra.pool_size_unit", f48948c);
            cVar.a(intent2, null);
            return;
        }
        if (oVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.d) {
            f.c<Intent> cVar2 = aVar.f48905g;
            WorkoutEditNotesActivity.a aVar6 = WorkoutEditNotesActivity.f48867c;
            com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.d dVar3 = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.d) oVar;
            String str3 = dVar3.f49216a;
            boolean z14 = dVar3.f49217b;
            com.garmin.android.apps.connectmobile.workouts.data.model.a aVar7 = dVar3.f49218c;
            aVar6.getClass();
            Intent intent3 = new Intent(aVar, (Class<?>) WorkoutEditNotesActivity.class);
            intent3.putExtra("com.garmin.android.apps.connectmobile.workouts.edit.WorkoutEditNotesActivity.extra.text_note", str3);
            intent3.putExtra("com.garmin.android.apps.connectmobile.workouts.edit.WorkoutEditNotesActivity.extra.should_limit_characters", z14);
            intent3.putExtra("com.garmin.android.apps.connectmobile.workouts.edit.WorkoutEditNotesActivity.extra.audio_note", aVar7);
            cVar2.a(intent3, null);
            return;
        }
        if (oVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.l) {
            final int i19 = 2;
            new androidx.appcompat.app.e.a(aVar).setTitle(R.string.audio_note_failed_to_download_alert_title).setMessage(R.string.audio_note_failed_to_download_alert_message).setPositiveButton(R.string.common_retry, new DialogInterface.OnClickListener(aVar) { // from class: f62.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.a f69211b;

                {
                    this.f69211b = aVar;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i110) {
                    int i111 = i19;
                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.o oVar2 = oVar;
                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.a aVar8 = this.f69211b;
                    switch (i111) {
                        case 0:
                            int i112 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.a.f48898h;
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVarGa = aVar8.ga();
                            ge1.b.T(v1.a(rVarGa), null, null, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.u(rVarGa, ((com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.g) oVar2).f49225c, null), 3);
                            break;
                        case 1:
                            int i24 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.a.f48898h;
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVarGa2 = aVar8.ga();
                            ge1.b.T(v1.a(rVarGa2), null, null, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.u(rVarGa2, ((com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.h) oVar2).f49227b, null), 3);
                            break;
                        default:
                            int i25 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.a.f48898h;
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.l lVar = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.l) oVar2;
                            aVar8.ga().t(lVar.f49236c, lVar.f49234a, lVar.f49235b);
                            break;
                    }
                }
            }).setNegativeButton(R.string.common_cancel, new f20.i(1)).show();
            return;
        }
        if (oVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.f) {
            com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.f fVar2 = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.f) oVar;
            aVar.ha(fVar2.f49220a, fVar2.f49221b, fVar2.f49222c);
            return;
        }
        if (oVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.m) {
            new androidx.appcompat.app.e.a(aVar).setTitle(R.string.workout_unable_to_save_alert_title).setMessage(R.string.workout_unable_to_save_alert_message).setPositiveButton(R.string.common_retry, new f62.c(aVar, 0)).setNegativeButton(R.string.common_cancel, new f20.i(1)).show();
            return;
        }
        if (!(oVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.b)) {
            if (oVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.j) {
                new androidx.appcompat.app.e.a(aVar).setTitle(R.string.lbl_workout_cannot_move_repeat).setMessage(R.string.workout_message_invalid_repeat_level).setPositiveButton(aVar.getString(R.string.lbl_ok), (DialogInterface.OnClickListener) null).show();
                return;
            } else {
                u0.r();
                return;
            }
        }
        f.c<Intent> cVar3 = aVar.f48902d;
        RoundConditionEditActivity.a aVar8 = RoundConditionEditActivity.f49565b;
        Context applicationContext2 = aVar.getApplicationContext();
        applicationContext2.getClass();
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.b bVar2 = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.b) oVar;
        l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar9 = bVar2.f49210a;
        com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var = aVar9 != null ? (com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar9.getData() : null;
        boolean z15 = bVar2.f49211b;
        Boolean bool2 = bVar2.f49212c;
        boolean z16 = bVar2.f49213d;
        m52.d dVar4 = bVar2.f49214e;
        aVar8.getClass();
        Intent intent4 = new Intent(applicationContext2, (Class<?>) RoundConditionEditActivity.class);
        intent4.putExtra("GCM_extra_activity_metadata", j0Var);
        intent4.putExtra("GCM_workout_is_round_type_edit_enabled", z15);
        if (bool2 != null) {
            intent4.putExtra("SKIP_LAST_REST_STEP", bool2.booleanValue());
            intent4.putExtra("EXTRA_SKIP_LAST_REST_STEP_CLICKED", z16);
        }
        if (dVar4 != null) {
            intent4.putExtra("EXTRA_LAST_STEP_TYPE", dVar4);
        }
        cVar3.a(intent4, null);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00d2  */
    public final WorkoutDetailsDTO ea(String str) {
        boolean z14;
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVarGa = ga();
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) v52.d.c(rVarGa.f49286m);
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.d dVar = qVar.f49260p;
        double d14 = qVar.f49254j;
        String str2 = qVar.f49258n;
        f62.o oVar = qVar.f49262r;
        l52.i<com.garmin.android.apps.connectmobile.workouts.data.model.j0> iVar = qVar.f49250f;
        WorkoutDetailsDTO workoutDetailsDTO = new WorkoutDetailsDTO();
        m52.k kVar = qVar.f49245a;
        kVar.getClass();
        workoutDetailsDTO.f48044e = kVar;
        workoutDetailsDTO.f48041b = str == null ? "" : str;
        com.garmin.android.apps.connectmobile.workouts.data.model.h0 h0Var = new com.garmin.android.apps.connectmobile.workouts.data.model.h0(0, null, null, null, null, null, null, null, null, 511, null);
        h0Var.F(0);
        h0Var.f48193h = kVar;
        if (qVar.f49263s instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.g.a) {
            h0Var.y(str2);
            h0Var.u(Double.valueOf(d14));
            h0Var.z(oVar.f69293c);
            h0Var.D(oVar.f69291a);
            h0Var.A(oVar.f69292b);
            h0Var.C(oVar.f69294d);
        }
        workoutDetailsDTO.f48046g = str2;
        workoutDetailsDTO.f48047h = Double.valueOf(dVar.getF48947b());
        m52.j f48948c = dVar.getF48948c();
        if (f48948c == null) {
            f48948c = rVarGa.f49278e;
        }
        workoutDetailsDTO.f48048i = f48948c;
        workoutDetailsDTO.f48052l = Double.valueOf(d14);
        workoutDetailsDTO.f48053m = oVar.f69293c;
        workoutDetailsDTO.f48049j = oVar.f69291a;
        workoutDetailsDTO.f48050k = oVar.f69292b;
        h0Var.G(iVar);
        m52.j jVar = oVar.f69294d;
        if (jVar == m52.j.f116748h) {
            workoutDetailsDTO.f48054n = null;
        } else {
            workoutDetailsDTO.f48054n = jVar;
        }
        workoutDetailsDTO.Q0 = p13.x.m(h0Var);
        com.garmin.android.apps.connectmobile.workouts.data.model.a aVar = qVar.f49265u;
        if (aVar != null) {
            workoutDetailsDTO.T = aVar.getAudioNoteUuid();
            workoutDetailsDTO.X = aVar;
        } else {
            workoutDetailsDTO.T = null;
            workoutDetailsDTO.X = null;
        }
        if (!rVarGa.f49284k) {
            bv.b.f21239a.getClass();
            bv.b.a();
            z14 = k1.f37122a.F();
        }
        workoutDetailsDTO.I0 = Boolean.valueOf(z14);
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.r.d dVar2 = rVarGa.f49283j;
        workoutDetailsDTO.D = dVar2.f49313a;
        workoutDetailsDTO.E = dVar2.f49314b;
        return workoutDetailsDTO;
    }

    /* JADX INFO: renamed from: fa */
    public abstract String getF48855i();

    public final com.garmin.android.apps.connectmobile.workouts.presentation.edit.r ga() {
        return (com.garmin.android.apps.connectmobile.workouts.presentation.edit.r) this.f48899a.getValue();
    }

    public abstract void ha(Long l14, String str, com.garmin.android.apps.connectmobile.workouts.presentation.edit.g gVar);

    public abstract void init();

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) v52.d.b(ga().f49286m);
        if (qVar != null && qVar.f49269y) {
            com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVarGa = ga();
            ge1.b.T(v1.a(rVarGa), null, null, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.v(rVarGa, null), 3);
        } else if (ga().f49280g) {
            new androidx.appcompat.app.e.a(this).setMessage(R.string.message_common_confirm_leaving_screen).setNegativeButton(getString(R.string.lbl_cancel), (DialogInterface.OnClickListener) null).setPositiveButton(getString(R.string.lbl_yes), new f62.c(this, 1)).show();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVarGa = ga();
        w1 w1Var = this.f48900b;
        String str = ((w52.e) w1Var.getValue()).f182503c;
        c cVar = new c((w52.e) w1Var.getValue());
        d dVar = new d((w52.e) w1Var.getValue());
        p005kotlin.jvm.internal.z zVar = new p005kotlin.jvm.internal.z((w52.e) w1Var.getValue()) { // from class: com.garmin.android.apps.connectmobile.workouts.presentation.edit.a.e
            @Override // p005kotlin.jvm.internal.z, k23.m
            public final Object get() {
                return ((w52.e) this.receiver).f182502b;
            }

            @Override // p005kotlin.jvm.internal.z, k23.i
            public final void set(Object obj) {
                ((w52.e) this.receiver).f182502b = (File) obj;
            }
        };
        str.getClass();
        rVarGa.f49282i = new com.garmin.android.apps.connectmobile.workouts.presentation.edit.r.a(str, cVar, dVar, zVar);
        setContentView(R.layout.composable_container);
        r52.e eVar = new r52.e(ga().f49286m, ga().f49288o, ga(), l.f48909a, m.f48910a, n.f48911a, o.f48912a);
        p pVar = p.f48913a;
        pVar.getClass();
        eVar.f150500m = pVar;
        q qVar = q.f48914a;
        qVar.getClass();
        eVar.f150495h.add(qVar);
        r rVar = r.f48915a;
        rVar.getClass();
        eVar.f150497j.add(rVar);
        s sVar = s.f48916a;
        sVar.getClass();
        eVar.f150498k.add(sVar);
        eVar.f150501n = new e40.d(this, 23);
        eVar.f150502o = new f(this);
        eVar.f150503p = new g(this);
        eVar.f150504q = new h(this);
        eVar.f150505r = new o13.p<>(new ey0.a(21), new j(this));
        eVar.f150506s = new k(this);
        ((ComposeView) findViewById(R.id.composable_container)).setContent(new z3.e(-1136927854, true, new r12.a(eVar, 8)));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.presentation.edit.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_IS_FROM_MULTI_SPORTS_WORKOUT", "", "MIN_REPEAT", "I", "MAX_REPEAT", "MULTI_SPORT_STEP_LIMIT_APPROACHING_INDIVIDUAL_LEG", "YOGA_MULTI_SPORT_STEP_LIMIT_APPROACHING", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0954a {
        public /* synthetic */ C0954a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C0954a() {
        }
    }
}
