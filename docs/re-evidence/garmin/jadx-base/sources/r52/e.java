package r52;

import com.garmin.android.apps.connectmobile.workouts.data.model.j0;
import e23.l;
import e23.t;
import java.util.ArrayList;
import java.util.List;
import l72.i3;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import r52.a;
import r52.g;
import r52.h;
import v62.o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u0003*\b\b\u0002\u0010\u0006*\u00020\u00052\u00020\u0007B\u0087\u0003\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\b\u0012\u0006\u0010\f\u001a\u00028\u0002\u0012Û\u0001\u0010\u0014\u001aÖ\u0001\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u000f\u0018\u00010\u000e\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u000f0\u000e0\u0010\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u000f0\u000e0\u0010\u0012\"\u0012 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u000f0\u0011\u0012\"\u0012 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u000f0\u0011\u0012\"\u0012 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u000f0\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u000f0\r\u0012$\u0010\u0015\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u000f0\u0011\u0012$\u0010\u0016\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u000f0\u0011\u0012$\u0010\u0017\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u000f0\u0011¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lr52/e;", "Lr52/h;", "UIStateType", "Lr52/a;", "ActionStateType", "Lr52/g;", "ActionsType", "", "Lr53/i;", "Lv52/c;", "uiStateFlow", "actionStateFlow", "actions", "Lkotlin/Function6;", "Lkotlin/Function0;", "Lr52/b;", "", "Lkotlin/Function1;", "Ll52/i$a;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/j0;", "mainContentComposable", "stepComposable", "repeatStartComposable", "repeatEndComposable", "<init>", "(Lr53/i;Lr53/i;Lr52/g;Le23/t;Le23/l;Le23/l;Le23/l;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e<UIStateType extends h, ActionStateType extends r52.a, ActionsType extends g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r53.i<v52.c<UIStateType>> f150488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r53.i<v52.c<ActionStateType>> f150489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ActionsType f150490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t<e23.a<? extends r52.b<? super UIStateType, ? super ActionsType>>, List<? extends e23.a<? extends r52.b<? super UIStateType, ? super ActionsType>>>, List<? extends e23.a<? extends r52.b<? super UIStateType, ? super ActionsType>>>, l<? super l52.i.a<j0>, ? extends r52.b<? super UIStateType, ? super ActionsType>>, l<? super l52.i.a<j0>, ? extends r52.b<? super UIStateType, ? super ActionsType>>, l<? super l52.i.a<j0>, ? extends r52.b<? super UIStateType, ? super ActionsType>>, r52.b<UIStateType, ActionsType>> f150491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l<l52.i.a<j0>, r52.b<UIStateType, ActionsType>> f150492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l<l52.i.a<j0>, r52.b<UIStateType, ActionsType>> f150493f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l<l52.i.a<j0>, r52.b<UIStateType, ActionsType>> f150494g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f150495h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e23.a<? extends r52.b<? super UIStateType, ? super ActionsType>> f150496i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f150497j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f150498k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f150499l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e23.a<? extends r52.b<? super UIStateType, ? super ActionsType>> f150500m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public e23.a<? extends r52.b<? super UIStateType, ? super f>> f150501n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public e23.a<Unit> f150502o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public l<? super ActionStateType, Unit> f150503p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public e23.a<Unit> f150504q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public p<? extends e23.a<? extends r52.b<? super UIStateType, ? super d>>, ? extends e23.a<Unit>> f150505r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public l<? super i3, Unit> f150506s;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002*\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0001H\n"}, d2 = {"Lr52/g;", "ActionsType", "Lr52/h;", "UIStateType", "it", "", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class a implements r52.b<UIStateType, ActionsType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f150507a = new a();

        @Override // r52.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(ActionsType actionstype, UIStateType uistatetype, m mVar, int i14) {
            int i15;
            actionstype.getClass();
            uistatetype.getClass();
            o0 o0VarE = mVar.E(-1462855919);
            if ((i14 & 384) == 0) {
                i15 = (o0VarE.B(this) ? 256 : 128) | i14;
            } else {
                i15 = i14;
            }
            if (o0VarE.n(i15 & 1, (i15 & 129) != 128)) {
                x1 x1Var = n.f135158a;
            } else {
                o0VarE.e();
            }
            p2 p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new mx.h(this, actionstype, uistatetype, i14, 18);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\n"}, d2 = {"Lr52/h;", "UIStateType", "Lr52/d;", "it", "", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class b implements r52.b<UIStateType, d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f150508a = new b();

        @Override // r52.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(d dVar, UIStateType uistatetype, m mVar, int i14) {
            int i15;
            dVar.getClass();
            uistatetype.getClass();
            o0 o0VarE = mVar.E(1714753486);
            if ((i14 & 6) == 0) {
                i15 = ((i14 & 8) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 4 : 2) | i14;
            } else {
                i15 = i14;
            }
            if ((i14 & 384) == 0) {
                i15 |= o0VarE.B(this) ? 256 : 128;
            }
            if (o0VarE.n(i15 & 1, (i15 & 131) != 130)) {
                x1 x1Var = n.f135158a;
                s62.a.f157643a.getClass();
                dVar.a(o.a(t62.b.f162798a));
            } else {
                o0VarE.e();
            }
            p2 p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new mx.h(this, dVar, uistatetype, i14, 19);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\n"}, d2 = {"Lr52/h;", "UIStateType", "Lr52/f;", "it", "", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c implements r52.b<UIStateType, f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f150509a = new c();

        @Override // r52.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(f fVar, UIStateType uistatetype, m mVar, int i14) {
            int i15;
            fVar.getClass();
            uistatetype.getClass();
            o0 o0VarE = mVar.E(1592438503);
            if ((i14 & 6) == 0) {
                i15 = ((i14 & 8) == 0 ? o0VarE.B(fVar) : o0VarE.r(fVar) ? 4 : 2) | i14;
            } else {
                i15 = i14;
            }
            if ((i14 & 384) == 0) {
                i15 |= o0VarE.B(this) ? 256 : 128;
            }
            if (o0VarE.n(i15 & 1, (i15 & 131) != 130)) {
                x1 x1Var = n.f135158a;
                fVar.e("");
            } else {
                o0VarE.e();
            }
            p2 p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new mx.h(this, fVar, uistatetype, i14, 20);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(r53.i<? extends v52.c<? extends UIStateType>> iVar, r53.i<? extends v52.c<? extends ActionStateType>> iVar2, ActionsType actionstype, t<? super e23.a<? extends r52.b<? super UIStateType, ? super ActionsType>>, ? super List<? extends e23.a<? extends r52.b<? super UIStateType, ? super ActionsType>>>, ? super List<? extends e23.a<? extends r52.b<? super UIStateType, ? super ActionsType>>>, ? super l<? super l52.i.a<j0>, ? extends r52.b<? super UIStateType, ? super ActionsType>>, ? super l<? super l52.i.a<j0>, ? extends r52.b<? super UIStateType, ? super ActionsType>>, ? super l<? super l52.i.a<j0>, ? extends r52.b<? super UIStateType, ? super ActionsType>>, ? extends r52.b<? super UIStateType, ? super ActionsType>> tVar, l<? super l52.i.a<j0>, ? extends r52.b<? super UIStateType, ? super ActionsType>> lVar, l<? super l52.i.a<j0>, ? extends r52.b<? super UIStateType, ? super ActionsType>> lVar2, l<? super l52.i.a<j0>, ? extends r52.b<? super UIStateType, ? super ActionsType>> lVar3) {
        iVar.getClass();
        iVar2.getClass();
        actionstype.getClass();
        tVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        this.f150488a = iVar;
        this.f150489b = iVar2;
        this.f150490c = actionstype;
        this.f150491d = tVar;
        this.f150492e = lVar;
        this.f150493f = lVar2;
        this.f150494g = lVar3;
        this.f150495h = new ArrayList();
        this.f150497j = new ArrayList();
        this.f150498k = new ArrayList();
        this.f150499l = new ArrayList();
        this.f150500m = new qy0.a(22);
        this.f150501n = new qy0.a(23);
        this.f150502o = new qy0.a(24);
        this.f150503p = new qv1.l(21);
        this.f150504q = new qy0.a(25);
        this.f150505r = new p<>(new qy0.a(26), new qy0.a(27));
        this.f150506s = new qv1.l(22);
    }
}
