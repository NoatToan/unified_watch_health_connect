package mz1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import com.garmin.android.apps.connectmobile.v2;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel$buildEventSearchUIModel$1", f = "AddTIEventViewModel.kt", l = {3206, 3223}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f121744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f121745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y0<g3<xy1.b>> f121746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AddTIEventViewModel f121747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ my1.d f121748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f121749f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xy1.a f121750g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f121751h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f121752i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f121753j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f121754k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ fg0.v f121755l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String[] f121756m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ o13.p<String, String> f121757n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f121758o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f121759p;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f121760a;

        static {
            int[] iArr = new int[ny1.g.values().length];
            try {
                iArr[ny1.g.IN_PERSON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ny1.g.VIRTUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f121760a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.lifecycle.y0<g3<xy1.b>> y0Var, AddTIEventViewModel addTIEventViewModel, my1.d dVar, boolean z14, xy1.a aVar, String str, String str2, String str3, String str4, fg0.v vVar, String[] strArr, o13.p<String, String> pVar, boolean z15, boolean z16, t13.d<? super g> dVar2) {
        super(2, dVar2);
        this.f121746c = y0Var;
        this.f121747d = addTIEventViewModel;
        this.f121748e = dVar;
        this.f121749f = z14;
        this.f121750g = aVar;
        this.f121751h = str;
        this.f121752i = str2;
        this.f121753j = str3;
        this.f121754k = str4;
        this.f121755l = vVar;
        this.f121756m = strArr;
        this.f121757n = pVar;
        this.f121758o = z15;
        this.f121759p = z16;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g gVar = new g(this.f121746c, this.f121747d, this.f121748e, this.f121749f, this.f121750g, this.f121751h, this.f121752i, this.f121753j, this.f121754k, this.f121755l, this.f121756m, this.f121757n, this.f121758o, this.f121759p, dVar);
        gVar.f121745b = obj;
        return gVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e0  */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0305, code lost:
    
        if (r1 == r4) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0381, code lost:
    
        if (r1 == r4) goto L150;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:42:0x00e0, please report this as an issue */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws ParseException {
        o13.t tVar;
        boolean z14;
        ArrayList arrayList;
        String strC;
        u13.a aVar;
        Object objJ;
        Object objJ2;
        v2 v2Var;
        o53.b0 b0Var = (o53.b0) this.f121745b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f121744a;
        androidx.lifecycle.y0<g3<xy1.b>> y0Var = this.f121746c;
        AddTIEventViewModel addTIEventViewModel = this.f121747d;
        if (i14 == 0) {
            o13.r.b(obj);
            y0Var.j(g3.a.c(g3.f35298f));
            addTIEventViewModel.getClass();
            o13.t tVar2 = addTIEventViewModel.f46412h2;
            ArrayList arrayList2 = new ArrayList();
            Context contextC = addTIEventViewModel.f46427o2.c();
            my1.d dVar = addTIEventViewModel.K2;
            boolean z15 = this.f121749f;
            my1.d dVar2 = this.f121748e;
            if (dVar == null) {
                ((androidx.lifecycle.y0) tVar2.getValue()).m(new ArrayList());
                b0Var = b0Var;
                aVar2 = aVar2;
                y0Var = y0Var;
                z14 = z15;
            } else {
                if (dVar2 != null) {
                    ez1.d dVar3 = dVar2.f121489f;
                    ny1.g gVar = dVar2.f121488e;
                    ny1.f fVar = dVar2.f121486c;
                    List<gg0.j> list = dVar2.f121490g;
                    bg0.a.b bVar = dVar2.f121498o;
                    double d14 = dVar2.f121496m;
                    tVar = tVar2;
                    ez1.c cVar = dVar2.f121494k;
                    ez1.c cVar2 = dVar2.f121493j;
                    z14 = z15;
                    if (p005kotlin.jvm.internal.s.g(addTIEventViewModel.f204393j, Boolean.TRUE) || addTIEventViewModel.f204395l) {
                        b0Var = b0Var;
                        aVar2 = aVar2;
                        arrayList = arrayList2;
                        y0Var = y0Var;
                    } else {
                        my1.d dVar4 = addTIEventViewModel.K2;
                        if (p005kotlin.jvm.internal.s.g(dVar4 != null ? dVar4.f121484a : null, dVar2.f121484a)) {
                            my1.d dVar5 = addTIEventViewModel.K2;
                            if (p005kotlin.jvm.internal.s.g(dVar5 != null ? dVar5.f121485b : null, dVar2.f121485b)) {
                                my1.d dVar6 = addTIEventViewModel.K2;
                                if ((dVar6 != null ? dVar6.f121486c : null) == fVar) {
                                    arrayList = arrayList2;
                                } else if (fVar != ny1.f.CUSTOM) {
                                    arrayList = arrayList2;
                                    arrayList.add(new xy1.d(xy1.c.DATE, fVar.c(contextC)));
                                } else {
                                    arrayList = arrayList2;
                                    og0.a aVar3 = og0.a.f131967a;
                                    String str = dVar2.f121484a;
                                    String str2 = dVar2.f121485b;
                                    aVar3.getClass();
                                    o13.p pVarY = og0.a.y(str, str2, true);
                                    aVar2 = aVar2;
                                    b0Var = b0Var;
                                    arrayList.add(new xy1.d(xy1.c.DATE, pVarY.f128594a + " - " + pVarY.f128595b));
                                }
                            } else if (fVar != ny1.f.CUSTOM) {
                                arrayList = arrayList2;
                                arrayList.add(new xy1.d(xy1.c.DATE, fVar.c(contextC)));
                            } else {
                                arrayList = arrayList2;
                                og0.a aVar4 = og0.a.f131967a;
                                String str3 = dVar2.f121484a;
                                String str4 = dVar2.f121485b;
                                aVar4.getClass();
                                o13.p pVarY2 = og0.a.y(str3, str4, true);
                                aVar2 = aVar2;
                                b0Var = b0Var;
                                arrayList.add(new xy1.d(xy1.c.DATE, pVarY2.f128594a + " - " + pVarY2.f128595b));
                            }
                        } else if (fVar != ny1.f.CUSTOM) {
                            arrayList = arrayList2;
                            arrayList.add(new xy1.d(xy1.c.DATE, fVar.c(contextC)));
                        } else {
                            arrayList = arrayList2;
                            og0.a aVar5 = og0.a.f131967a;
                            String str5 = dVar2.f121484a;
                            String str6 = dVar2.f121485b;
                            aVar5.getClass();
                            o13.p pVarY3 = og0.a.y(str5, str6, true);
                            aVar2 = aVar2;
                            b0Var = b0Var;
                            arrayList.add(new xy1.d(xy1.c.DATE, pVarY3.f128594a + " - " + pVarY3.f128595b));
                        }
                        int iW = cVar2.w();
                        ez1.g gVar2 = ez1.g.TYPE_ALL;
                        if (iW != gVar2.ordinal() || cVar.w() != ez1.h.ALL.ordinal()) {
                            if (cVar2.w() != gVar2.ordinal()) {
                                strC = cVar2.c(contextC);
                            } else {
                                strC = cVar.w() != ez1.h.ALL.ordinal() ? cVar.c(contextC) : null;
                            }
                            bg0.a.f17827a.getClass();
                            if (p005kotlin.jvm.internal.s.g(strC, bg0.a.C0255a.e() ? ez1.a.CUSTOM.c(contextC) : ez1.b.CUSTOM.c(contextC))) {
                                double d15 = dVar2.f121497n;
                                if (d15 != 0.0d && d14 != 0.0d && d14 != Double.MAX_VALUE) {
                                    strC = contextC.getString(R.string.lbl_value_range_with_unit, String.valueOf(d15), String.valueOf(d14), bVar.a(contextC));
                                } else if (d14 != 0.0d && d14 != Double.MAX_VALUE) {
                                    strC = contextC.getString(R.string.lbl_less_than_equal_to_value_unit, String.valueOf(d14), bVar.a(contextC));
                                } else if (d15 != 0.0d) {
                                    strC = contextC.getString(R.string.lbl_greater_than_equal_to_value_unit, String.valueOf(d15), bVar.a(contextC));
                                }
                            }
                            if (strC != null) {
                                arrayList.add(new xy1.d(xy1.c.DURATION, strC));
                            }
                        }
                    }
                    int i15 = AddTIEventViewModel.b.f46454e[gVar.ordinal()];
                    if (i15 == 1) {
                        my1.d dVar7 = addTIEventViewModel.K2;
                        if (!p005kotlin.jvm.internal.s.g(dVar7 != null ? dVar7.f121489f : null, dVar3) && z14) {
                            arrayList.add(new xy1.d(xy1.c.RADIUS, dVar3.c(contextC)));
                        }
                    } else {
                        if (i15 != 2) {
                            lc.u0.r();
                            return null;
                        }
                        arrayList.add(new xy1.d(xy1.c.PARTICIPATION, gVar.a(contextC)));
                    }
                    if (list != null) {
                        gg0.j jVar = gg0.j.OFFICIAL;
                        if (list.contains(jVar)) {
                            xy1.c cVar3 = xy1.c.OFFICIAL_EVENTS;
                            jVar.getClass();
                            String string = contextC.getString(jVar.f77180a);
                            string.getClass();
                            arrayList.add(new xy1.d(cVar3, string));
                        }
                    }
                    if (list != null) {
                        gg0.j jVar2 = gg0.j.VERIFIED;
                        if (list.contains(jVar2)) {
                            xy1.c cVar4 = xy1.c.VERIFIED_EVENTS;
                            jVar2.getClass();
                            String string2 = contextC.getString(jVar2.f77180a);
                            string2.getClass();
                            arrayList.add(new xy1.d(cVar4, string2));
                        }
                    }
                    if (list != null) {
                        gg0.j jVar3 = gg0.j.NONE;
                        if (list.contains(jVar3)) {
                            xy1.c cVar5 = xy1.c.GARMIN_USER_EVENTS;
                            jVar3.getClass();
                            String string3 = contextC.getString(jVar3.f77180a);
                            string3.getClass();
                            arrayList.add(new xy1.d(cVar5, string3));
                        }
                    }
                } else {
                    b0Var = b0Var;
                    aVar2 = aVar2;
                    tVar = tVar2;
                    y0Var = y0Var;
                    z14 = z15;
                    arrayList = arrayList2;
                }
                ((androidx.lifecycle.y0) tVar.getValue()).m(arrayList);
            }
            xy1.a aVar6 = this.f121750g;
            int i16 = a.f121760a[aVar6.f192694a.ordinal()];
            fg0.v vVar = this.f121755l;
            if (i16 == 1) {
                aVar = aVar2;
                o53.b0 b0Var2 = b0Var;
                ig0.b bVarH4 = addTIEventViewModel.H4();
                Double d16 = z14 ? aVar6.f192696c : null;
                Double d17 = z14 ? aVar6.f192697d : null;
                Integer numU1 = z14 ? dVar2.f121489f.u1() : null;
                String str7 = vVar != null ? vVar.f71359a : null;
                Double d18 = vVar != null ? vVar.f71360b : null;
                Double d19 = vVar != null ? vVar.f71361c : null;
                this.f121745b = b0Var2;
                this.f121744a = 1;
                bVarH4.getClass();
                objJ = com.garmin.android.apps.connectmobile.f0.J(bVarH4, new ig0.g(bVarH4, this.f121751h, this.f121752i, this.f121753j, this.f121754k, d16, d17, numU1, str7, d18, d19, this.f121756m, true, null), this);
            } else {
                if (i16 != 2) {
                    lc.u0.r();
                    return null;
                }
                ig0.b bVarH5 = addTIEventViewModel.H4();
                String str8 = vVar != null ? vVar.f71359a : null;
                Double d24 = vVar != null ? vVar.f71360b : null;
                Double d25 = vVar != null ? vVar.f71361c : null;
                this.f121745b = b0Var;
                this.f121744a = 2;
                bVarH5.getClass();
                objJ2 = com.garmin.android.apps.connectmobile.f0.J(bVarH5, new ig0.h(bVarH5, this.f121751h, this.f121752i, this.f121753j, this.f121754k, str8, d24, d25, this.f121756m, true, null), this);
                aVar = aVar2;
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            objJ = obj;
            y0Var = y0Var;
            v2Var = (v2) objJ;
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objJ2 = obj;
            y0Var = y0Var;
            v2Var = (v2) objJ2;
        }
        if (v2Var instanceof v2.b) {
            T t7 = ((v2.b) v2Var).f47386a;
            boolean zIsEmpty = ((Collection) t7).isEmpty();
            List listX4 = (List) t7;
            if (!zIsEmpty) {
                addTIEventViewModel.getClass();
                listX4 = zf0.j0.x4(listX4);
            }
            List list2 = listX4;
            o13.p<String, String> pVar = this.f121757n;
            xy1.b bVar2 = new xy1.b(pVar.f128594a, pVar.f128595b, list2, this.f121758o, this.f121759p);
            g3.f35298f.getClass();
            y0Var.j(g3.a.d(bVar2));
        } else {
            androidx.lifecycle.y0<g3<xy1.b>> y0Var2 = y0Var;
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            y0Var2.j(g3.a.a(g3.f35298f, null, null, null, null, 15));
            String string4 = ((v2.a) v2Var).f47383a.toString();
            p92.y.f136664a.getClass();
            p92.y.a.c("EventDetailsViewModel", string4);
        }
        return Unit.INSTANCE;
    }
}
