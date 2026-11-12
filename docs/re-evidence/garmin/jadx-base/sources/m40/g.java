package m40;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import c2.b0;
import c2.j;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.u0;
import com.garmin.android.library.mapsdkadapter.i;
import com.google.mlkit.common.MlKitException;
import e23.l;
import e23.p;
import h4.k;
import h4.r;
import h5.e0;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p006l2.v0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import qw0.v;
import r22.m0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\f²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002²\u0006\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lm40/g;", "Lcom/garmin/android/apps/connectmobile/u0;", "<init>", "()V", "a", "Lcom/garmin/android/library/mapsdkadapter/i$d;", "mapProvider", "", "isPointsOfInterestChecked", "", "Lcom/garmin/android/apps/connectmobile/courses/model/h;", "selectedPointsOfInterestTypes", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends u0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f116591h = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j40.c.C1850c f116592g;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f116593a;

        static {
            int[] iArr = new int[v.values().length];
            try {
                iArr[v.POPULARITY_HEATMAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v.HIGH_TRAFFIC_ROADS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v.UNPAVED_ROADS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[v.MILE_MARKERS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[v.HAZARDS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[v.HAZARDS_ON_COURSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f116593a = iArr;
        }
    }

    public g() {
        super(R.layout.compose_bottom_sheet_content, false, false, 0, 14, null);
    }

    public static void A6(String str, boolean z14) {
        String str2 = z14 ? "On" : "Off";
        Bundle bundle = new Bundle(2);
        bundle.putString("Screen", "Courses");
        bundle.putString("Action", str2);
        ht.a.f85464a.getClass();
        ht.a.a(bundle, str);
    }

    public static void C6(String str, boolean z14) {
        if (z14) {
            Bundle bundle = new Bundle(2);
            bundle.putString("Screen", "Courses");
            bundle.putString("Action", "On");
            ht.a.f85464a.getClass();
            ht.a.a(bundle, str);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.b0
    public final void u6(View view2) {
        Bundle arguments = getArguments();
        Parcelable parcelable = null;
        if (Build.VERSION.SDK_INT < 33) {
            Parcelable parcelable2 = arguments != null ? arguments.getParcelable("CourseMapSettings") : null;
            parcelable = (c) (parcelable2 instanceof c ? parcelable2 : null);
        } else if (arguments != null) {
            parcelable = (Parcelable) arguments.getParcelable("CourseMapSettings", c.class);
        }
        c cVar = (c) parcelable;
        if (cVar == null) {
            dismiss();
            return;
        }
        ComposeView composeView = (ComposeView) view2.findViewById(R.id.compose_content_view);
        if (composeView != null) {
            composeView.setContent(new z3.e(-400795761, true, new f(this, cVar, 0, (byte) 0)));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.u0
    public final String w6() {
        String string = getString(R.string.lbl_map_settings);
        string.getClass();
        return string;
    }

    @Override // com.garmin.android.apps.connectmobile.u0
    public final String y6() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z6(c cVar, m mVar, int i14) {
        boolean z14;
        h hVar = cVar.f116581b;
        o0 o0VarE = mVar.E(-1222267186);
        final int i15 = 4;
        int i16 = (o0VarE.r(cVar) ? 4 : 2) | i14 | (o0VarE.r(this) ? 32 : 16);
        final int i17 = 1;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(aVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(hVar.f116595b);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            m40.a aVar3 = cVar.f116583d;
            boolean zR = o0VarE.r(this);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new l3.p1(24, this, p1Var);
                o0VarE.K(objQ2);
            }
            l lVar = (l) objQ2;
            boolean zR2 = o0VarE.r(this);
            Object objQ3 = o0VarE.q();
            if (zR2 || objQ3 == c2565a) {
                final int i18 = 3;
                objQ3 = new l(this) { // from class: m40.d

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ g f116585b;

                    {
                        this.f116585b = this;
                    }

                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        qe2.h hVar2;
                        com.garmin.android.library.mapsdkadapter.e z15;
                        u20.g gVar;
                        int i19 = i18;
                        g gVar2 = this.f116585b;
                        switch (i19) {
                            case 0:
                                List list = (List) obj;
                                g.a aVar4 = g.f116591h;
                                list.getClass();
                                j40.c.C1850c c1850c = gVar2.f116592g;
                                if (c1850c != null) {
                                    j40.c cVar2 = j40.c.this;
                                    cVar2.Y6().F3(new l40.a.e(list));
                                    cVar2.A7();
                                    qe2.h hVar3 = cVar2.f148294e;
                                    if ((hVar3 != null ? hVar3.f144584a.getY() : 0.0f) >= 13.0f && (hVar2 = cVar2.f148294e) != null && (z15 = hVar2.f144584a.getZ()) != null && (gVar = cVar2.f97020y) != null) {
                                        gVar.p5(z15, cVar2.V6().f109901i);
                                    }
                                }
                                break;
                            case 1:
                                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                g.A6("ToggleClimbsMapSetting", zBooleanValue);
                                j40.c.C1850c c1850c2 = gVar2.f116592g;
                                if (c1850c2 != null) {
                                    j40.c cVar3 = j40.c.this;
                                    cVar3.Y6().F3(new l40.a.c(zBooleanValue));
                                    qe2.h hVar4 = cVar3.f148294e;
                                    float y14 = hVar4 != null ? hVar4.f144584a.getY() : 0.0f;
                                    if (!zBooleanValue || y14 < 10.0f) {
                                        cVar3.z7();
                                    } else {
                                        com.garmin.android.apps.connectmobile.courses.model.c cVar4 = cVar3.T;
                                        if (cVar4 != null) {
                                            cVar3.O7(cVar4);
                                        }
                                    }
                                }
                                break;
                            case 2:
                                com.garmin.android.apps.connectmobile.courses.model.c cVar5 = (com.garmin.android.apps.connectmobile.courses.model.c) obj;
                                g.a aVar5 = g.f116591h;
                                cVar5.getClass();
                                j40.c.C1850c c1850c3 = gVar2.f116592g;
                                if (c1850c3 != null) {
                                    j40.c cVar6 = j40.c.this;
                                    cVar6.T = cVar5;
                                    qe2.h hVar5 = cVar6.f148294e;
                                    if ((hVar5 != null ? hVar5.f144584a.getY() : 0.0f) >= 10.0f) {
                                        cVar6.z7();
                                        cVar6.O7(cVar5);
                                    } else {
                                        cVar6.z7();
                                    }
                                }
                                break;
                            case 3:
                                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                                j40.c.C1850c c1850c4 = gVar2.f116592g;
                                if (c1850c4 != null) {
                                    c1850c4.a(zBooleanValue2);
                                }
                                break;
                            default:
                                int iIntValue = ((Integer) obj).intValue();
                                j40.c.C1850c c1850c5 = gVar2.f116592g;
                                if (c1850c5 != null) {
                                    j40.c cVar7 = j40.c.this;
                                    cVar7.N7(iIntValue);
                                    cVar7.Y6().F3(new l40.a.C2100a(iIntValue));
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ3);
            }
            l lVar2 = (l) objQ3;
            boolean zR3 = o0VarE.r(this);
            Object objQ4 = o0VarE.q();
            if (zR3 || objQ4 == c2565a) {
                objQ4 = new l(this) { // from class: m40.d

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ g f116585b;

                    {
                        this.f116585b = this;
                    }

                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        qe2.h hVar2;
                        com.garmin.android.library.mapsdkadapter.e z15;
                        u20.g gVar;
                        int i19 = i15;
                        g gVar2 = this.f116585b;
                        switch (i19) {
                            case 0:
                                List list = (List) obj;
                                g.a aVar4 = g.f116591h;
                                list.getClass();
                                j40.c.C1850c c1850c = gVar2.f116592g;
                                if (c1850c != null) {
                                    j40.c cVar2 = j40.c.this;
                                    cVar2.Y6().F3(new l40.a.e(list));
                                    cVar2.A7();
                                    qe2.h hVar3 = cVar2.f148294e;
                                    if ((hVar3 != null ? hVar3.f144584a.getY() : 0.0f) >= 13.0f && (hVar2 = cVar2.f148294e) != null && (z15 = hVar2.f144584a.getZ()) != null && (gVar = cVar2.f97020y) != null) {
                                        gVar.p5(z15, cVar2.V6().f109901i);
                                    }
                                }
                                break;
                            case 1:
                                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                g.A6("ToggleClimbsMapSetting", zBooleanValue);
                                j40.c.C1850c c1850c2 = gVar2.f116592g;
                                if (c1850c2 != null) {
                                    j40.c cVar3 = j40.c.this;
                                    cVar3.Y6().F3(new l40.a.c(zBooleanValue));
                                    qe2.h hVar4 = cVar3.f148294e;
                                    float y14 = hVar4 != null ? hVar4.f144584a.getY() : 0.0f;
                                    if (!zBooleanValue || y14 < 10.0f) {
                                        cVar3.z7();
                                    } else {
                                        com.garmin.android.apps.connectmobile.courses.model.c cVar4 = cVar3.T;
                                        if (cVar4 != null) {
                                            cVar3.O7(cVar4);
                                        }
                                    }
                                }
                                break;
                            case 2:
                                com.garmin.android.apps.connectmobile.courses.model.c cVar5 = (com.garmin.android.apps.connectmobile.courses.model.c) obj;
                                g.a aVar5 = g.f116591h;
                                cVar5.getClass();
                                j40.c.C1850c c1850c3 = gVar2.f116592g;
                                if (c1850c3 != null) {
                                    j40.c cVar6 = j40.c.this;
                                    cVar6.T = cVar5;
                                    qe2.h hVar5 = cVar6.f148294e;
                                    if ((hVar5 != null ? hVar5.f144584a.getY() : 0.0f) >= 10.0f) {
                                        cVar6.z7();
                                        cVar6.O7(cVar5);
                                    } else {
                                        cVar6.z7();
                                    }
                                }
                                break;
                            case 3:
                                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                                j40.c.C1850c c1850c4 = gVar2.f116592g;
                                if (c1850c4 != null) {
                                    c1850c4.a(zBooleanValue2);
                                }
                                break;
                            default:
                                int iIntValue = ((Integer) obj).intValue();
                                j40.c.C1850c c1850c5 = gVar2.f116592g;
                                if (c1850c5 != null) {
                                    j40.c cVar7 = j40.c.this;
                                    cVar7.N7(iIntValue);
                                    cVar7.Y6().F3(new l40.a.C2100a(iIntValue));
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ4);
            }
            n40.k.a(hVar, lVar, lVar2, (l) objQ4, o0VarE, 0);
            if (cVar.f116580a) {
                o0VarE.C(-1466433611);
                boolean z15 = ((i.d) p1Var.getF182175a()) == i.d.GOOGLE || ((i.d) p1Var.getF182175a()) == i.d.MAPBOX;
                m40.b bVar2 = cVar.f116582c;
                boolean z16 = bVar2.f116576b;
                boolean z17 = bVar2.f116578d;
                boolean zR4 = o0VarE.r(this);
                Object objQ5 = o0VarE.q();
                if (zR4 || objQ5 == c2565a) {
                    objQ5 = new p(this) { // from class: m40.e

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ g f116587b;

                        {
                            this.f116587b = this;
                        }

                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i19 = i17;
                            String str = null;
                            g gVar = this.f116587b;
                            switch (i19) {
                                case 0:
                                    com.garmin.android.apps.connectmobile.courses.model.b bVar3 = (com.garmin.android.apps.connectmobile.courses.model.b) obj;
                                    com.garmin.android.apps.connectmobile.courses.model.b bVar4 = (com.garmin.android.apps.connectmobile.courses.model.b) obj2;
                                    g.a aVar4 = g.f116591h;
                                    bVar3.getClass();
                                    bVar4.getClass();
                                    j40.c.C1850c c1850c = gVar.f116592g;
                                    if (c1850c != null) {
                                        j40.c cVar2 = j40.c.this;
                                        cVar2.getClass();
                                        cVar2.X = bVar3;
                                        cVar2.Y = bVar4;
                                        cVar2.Y6().F3(new l40.a.b(bVar3.ordinal(), bVar4.ordinal()));
                                        com.garmin.android.apps.connectmobile.courses.model.c cVar3 = cVar2.T;
                                        qe2.h hVar2 = cVar2.f148294e;
                                        float y14 = hVar2 != null ? hVar2.f144584a.getY() : 0.0f;
                                        if (cVar3 == null || y14 < 10.0f) {
                                            cVar2.z7();
                                        } else {
                                            cVar2.z7();
                                            cVar2.O7(cVar3);
                                        }
                                    }
                                    break;
                                case 1:
                                    v vVar = (v) obj;
                                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                                    g.a aVar5 = g.f116591h;
                                    vVar.getClass();
                                    int i24 = g.b.f116593a[vVar.ordinal()];
                                    if (i24 == 1) {
                                        str = "TogglePopularityHeatmap";
                                    } else if (i24 == 2) {
                                        str = "ToggleHighTraffic";
                                    } else if (i24 == 3) {
                                        str = "ToggleUnpavedRoads";
                                    }
                                    if (str != null) {
                                        g.C6(str, zBooleanValue);
                                    }
                                    j40.c.C1850c c1850c2 = gVar.f116592g;
                                    if (c1850c2 != null) {
                                        c1850c2.c(vVar, zBooleanValue);
                                    }
                                    break;
                                default:
                                    v vVar2 = (v) obj;
                                    Boolean bool = (Boolean) obj2;
                                    boolean zBooleanValue2 = bool.booleanValue();
                                    g.a aVar6 = g.f116591h;
                                    vVar2.getClass();
                                    int i25 = g.b.f116593a[vVar2.ordinal()];
                                    if (i25 == 4) {
                                        j40.c.C1850c c1850c3 = gVar.f116592g;
                                        if (c1850c3 != null) {
                                            c1850c3.c(v.MILE_MARKERS, zBooleanValue2);
                                        }
                                    } else if (i25 == 5) {
                                        as2.d dVar = new as2.d(gVar, zBooleanValue2, 12);
                                        if (zBooleanValue2 && ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).k4()) {
                                            ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).j0();
                                            m0 m0VarC = m0.a.c(m0.f149759e, gVar.getString(R.string.lbl_hazard_notice), gVar.getString(R.string.lbl_hazard_notice_description), 0, null, R.string.lbl_ok, new js0.d(dVar, 21), MlKitException.CODE_SCANNER_TASK_IN_PROGRESS);
                                            m0VarC.setCancelable(false);
                                            m0VarC.show(gVar.getParentFragmentManager(), "GCMFeatureInfoDialog");
                                        } else {
                                            dVar.invoke(bool);
                                        }
                                    } else if (i25 == 6) {
                                        g.A6("ToggleHazardsMapSettingViewMode", zBooleanValue2);
                                        j40.c.C1850c c1850c4 = gVar.f116592g;
                                        if (c1850c4 != null) {
                                            c1850c4.c(v.HAZARDS_ON_COURSE, zBooleanValue2);
                                        }
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ5);
                }
                ge1.b.c(z15, z16, z17, bVar2, (p) objQ5, o0VarE, 0);
                Object objQ6 = o0VarE.q();
                if (objQ6 == c2565a) {
                    objQ6 = hb.a.n(aVar3.f116563d, o0VarE);
                }
                p1 p1Var2 = (p1) objQ6;
                Object objQ7 = o0VarE.q();
                if (objQ7 == c2565a) {
                    objQ7 = p0.n(aVar3.f116564e);
                    o0VarE.K(objQ7);
                }
                p1 p1Var3 = (p1) objQ7;
                boolean zBooleanValue = ((Boolean) p1Var2.getF182175a()).booleanValue();
                List list = (List) p1Var3.getF182175a();
                boolean z18 = aVar3.f116560a;
                boolean z19 = aVar3.f116561b;
                boolean z24 = aVar3.f116562c;
                boolean z25 = aVar3.f116565f;
                boolean z26 = aVar3.f116566g;
                List<fn0.c> list2 = aVar3.f116567h;
                boolean z27 = aVar3.f116568i;
                boolean z28 = aVar3.f116569j;
                boolean z29 = aVar3.f116570k;
                boolean z34 = aVar3.f116571l;
                com.garmin.android.apps.connectmobile.courses.model.c cVar2 = aVar3.f116572m;
                com.garmin.android.apps.connectmobile.courses.model.b bVar3 = aVar3.f116573n;
                com.garmin.android.apps.connectmobile.courses.model.b bVar4 = aVar3.f116574o;
                list.getClass();
                m40.a aVar4 = new m40.a(z18, z19, z24, zBooleanValue, list, z25, z26, list2, z27, z28, z29, z34, cVar2, bVar3, bVar4);
                boolean zR5 = o0VarE.r(this);
                Object objQ8 = o0VarE.q();
                if (zR5 || objQ8 == c2565a) {
                    final int i19 = 2;
                    objQ8 = new p(this) { // from class: m40.e

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ g f116587b;

                        {
                            this.f116587b = this;
                        }

                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i110 = i19;
                            String str = null;
                            g gVar = this.f116587b;
                            switch (i110) {
                                case 0:
                                    com.garmin.android.apps.connectmobile.courses.model.b bVar5 = (com.garmin.android.apps.connectmobile.courses.model.b) obj;
                                    com.garmin.android.apps.connectmobile.courses.model.b bVar6 = (com.garmin.android.apps.connectmobile.courses.model.b) obj2;
                                    g.a aVar5 = g.f116591h;
                                    bVar5.getClass();
                                    bVar6.getClass();
                                    j40.c.C1850c c1850c = gVar.f116592g;
                                    if (c1850c != null) {
                                        j40.c cVar3 = j40.c.this;
                                        cVar3.getClass();
                                        cVar3.X = bVar5;
                                        cVar3.Y = bVar6;
                                        cVar3.Y6().F3(new l40.a.b(bVar5.ordinal(), bVar6.ordinal()));
                                        com.garmin.android.apps.connectmobile.courses.model.c cVar4 = cVar3.T;
                                        qe2.h hVar2 = cVar3.f148294e;
                                        float y14 = hVar2 != null ? hVar2.f144584a.getY() : 0.0f;
                                        if (cVar4 == null || y14 < 10.0f) {
                                            cVar3.z7();
                                        } else {
                                            cVar3.z7();
                                            cVar3.O7(cVar4);
                                        }
                                    }
                                    break;
                                case 1:
                                    v vVar = (v) obj;
                                    boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                                    g.a aVar6 = g.f116591h;
                                    vVar.getClass();
                                    int i24 = g.b.f116593a[vVar.ordinal()];
                                    if (i24 == 1) {
                                        str = "TogglePopularityHeatmap";
                                    } else if (i24 == 2) {
                                        str = "ToggleHighTraffic";
                                    } else if (i24 == 3) {
                                        str = "ToggleUnpavedRoads";
                                    }
                                    if (str != null) {
                                        g.C6(str, zBooleanValue2);
                                    }
                                    j40.c.C1850c c1850c2 = gVar.f116592g;
                                    if (c1850c2 != null) {
                                        c1850c2.c(vVar, zBooleanValue2);
                                    }
                                    break;
                                default:
                                    v vVar2 = (v) obj;
                                    Boolean bool = (Boolean) obj2;
                                    boolean zBooleanValue3 = bool.booleanValue();
                                    g.a aVar7 = g.f116591h;
                                    vVar2.getClass();
                                    int i25 = g.b.f116593a[vVar2.ordinal()];
                                    if (i25 == 4) {
                                        j40.c.C1850c c1850c3 = gVar.f116592g;
                                        if (c1850c3 != null) {
                                            c1850c3.c(v.MILE_MARKERS, zBooleanValue3);
                                        }
                                    } else if (i25 == 5) {
                                        as2.d dVar = new as2.d(gVar, zBooleanValue3, 12);
                                        if (zBooleanValue3 && ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).k4()) {
                                            ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).j0();
                                            m0 m0VarC = m0.a.c(m0.f149759e, gVar.getString(R.string.lbl_hazard_notice), gVar.getString(R.string.lbl_hazard_notice_description), 0, null, R.string.lbl_ok, new js0.d(dVar, 21), MlKitException.CODE_SCANNER_TASK_IN_PROGRESS);
                                            m0VarC.setCancelable(false);
                                            m0VarC.show(gVar.getParentFragmentManager(), "GCMFeatureInfoDialog");
                                        } else {
                                            dVar.invoke(bool);
                                        }
                                    } else if (i25 == 6) {
                                        g.A6("ToggleHazardsMapSettingViewMode", zBooleanValue3);
                                        j40.c.C1850c c1850c4 = gVar.f116592g;
                                        if (c1850c4 != null) {
                                            c1850c4.c(v.HAZARDS_ON_COURSE, zBooleanValue3);
                                        }
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ8);
                }
                p pVar = (p) objQ8;
                boolean zR6 = o0VarE.r(this);
                Object objQ9 = o0VarE.q();
                if (zR6 || objQ9 == c2565a) {
                    final int i24 = 0;
                    objQ9 = new l(this) { // from class: m40.d

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ g f116585b;

                        {
                            this.f116585b = this;
                        }

                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            qe2.h hVar2;
                            com.garmin.android.library.mapsdkadapter.e z110;
                            u20.g gVar;
                            int i110 = i24;
                            g gVar2 = this.f116585b;
                            switch (i110) {
                                case 0:
                                    List list3 = (List) obj;
                                    g.a aVar5 = g.f116591h;
                                    list3.getClass();
                                    j40.c.C1850c c1850c = gVar2.f116592g;
                                    if (c1850c != null) {
                                        j40.c cVar3 = j40.c.this;
                                        cVar3.Y6().F3(new l40.a.e(list3));
                                        cVar3.A7();
                                        qe2.h hVar3 = cVar3.f148294e;
                                        if ((hVar3 != null ? hVar3.f144584a.getY() : 0.0f) >= 13.0f && (hVar2 = cVar3.f148294e) != null && (z110 = hVar2.f144584a.getZ()) != null && (gVar = cVar3.f97020y) != null) {
                                            gVar.p5(z110, cVar3.V6().f109901i);
                                        }
                                    }
                                    break;
                                case 1:
                                    boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                                    g.A6("ToggleClimbsMapSetting", zBooleanValue2);
                                    j40.c.C1850c c1850c2 = gVar2.f116592g;
                                    if (c1850c2 != null) {
                                        j40.c cVar4 = j40.c.this;
                                        cVar4.Y6().F3(new l40.a.c(zBooleanValue2));
                                        qe2.h hVar4 = cVar4.f148294e;
                                        float y14 = hVar4 != null ? hVar4.f144584a.getY() : 0.0f;
                                        if (!zBooleanValue2 || y14 < 10.0f) {
                                            cVar4.z7();
                                        } else {
                                            com.garmin.android.apps.connectmobile.courses.model.c cVar5 = cVar4.T;
                                            if (cVar5 != null) {
                                                cVar4.O7(cVar5);
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    com.garmin.android.apps.connectmobile.courses.model.c cVar6 = (com.garmin.android.apps.connectmobile.courses.model.c) obj;
                                    g.a aVar6 = g.f116591h;
                                    cVar6.getClass();
                                    j40.c.C1850c c1850c3 = gVar2.f116592g;
                                    if (c1850c3 != null) {
                                        j40.c cVar7 = j40.c.this;
                                        cVar7.T = cVar6;
                                        qe2.h hVar5 = cVar7.f148294e;
                                        if ((hVar5 != null ? hVar5.f144584a.getY() : 0.0f) >= 10.0f) {
                                            cVar7.z7();
                                            cVar7.O7(cVar6);
                                        } else {
                                            cVar7.z7();
                                        }
                                    }
                                    break;
                                case 3:
                                    boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                                    j40.c.C1850c c1850c4 = gVar2.f116592g;
                                    if (c1850c4 != null) {
                                        c1850c4.a(zBooleanValue3);
                                    }
                                    break;
                                default:
                                    int iIntValue = ((Integer) obj).intValue();
                                    j40.c.C1850c c1850c5 = gVar2.f116592g;
                                    if (c1850c5 != null) {
                                        j40.c cVar8 = j40.c.this;
                                        cVar8.N7(iIntValue);
                                        cVar8.Y6().F3(new l40.a.C2100a(iIntValue));
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ9);
                }
                l lVar3 = (l) objQ9;
                boolean zR7 = o0VarE.r(this);
                Object objQ10 = o0VarE.q();
                if (zR7 || objQ10 == c2565a) {
                    z14 = true;
                    final char c14 = 1 == true ? 1 : 0;
                    objQ10 = new l(this) { // from class: m40.d

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ g f116585b;

                        {
                            this.f116585b = this;
                        }

                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            qe2.h hVar2;
                            com.garmin.android.library.mapsdkadapter.e z110;
                            u20.g gVar;
                            int i110 = c14;
                            g gVar2 = this.f116585b;
                            switch (i110) {
                                case 0:
                                    List list3 = (List) obj;
                                    g.a aVar5 = g.f116591h;
                                    list3.getClass();
                                    j40.c.C1850c c1850c = gVar2.f116592g;
                                    if (c1850c != null) {
                                        j40.c cVar3 = j40.c.this;
                                        cVar3.Y6().F3(new l40.a.e(list3));
                                        cVar3.A7();
                                        qe2.h hVar3 = cVar3.f148294e;
                                        if ((hVar3 != null ? hVar3.f144584a.getY() : 0.0f) >= 13.0f && (hVar2 = cVar3.f148294e) != null && (z110 = hVar2.f144584a.getZ()) != null && (gVar = cVar3.f97020y) != null) {
                                            gVar.p5(z110, cVar3.V6().f109901i);
                                        }
                                    }
                                    break;
                                case 1:
                                    boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                                    g.A6("ToggleClimbsMapSetting", zBooleanValue2);
                                    j40.c.C1850c c1850c2 = gVar2.f116592g;
                                    if (c1850c2 != null) {
                                        j40.c cVar4 = j40.c.this;
                                        cVar4.Y6().F3(new l40.a.c(zBooleanValue2));
                                        qe2.h hVar4 = cVar4.f148294e;
                                        float y14 = hVar4 != null ? hVar4.f144584a.getY() : 0.0f;
                                        if (!zBooleanValue2 || y14 < 10.0f) {
                                            cVar4.z7();
                                        } else {
                                            com.garmin.android.apps.connectmobile.courses.model.c cVar5 = cVar4.T;
                                            if (cVar5 != null) {
                                                cVar4.O7(cVar5);
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    com.garmin.android.apps.connectmobile.courses.model.c cVar6 = (com.garmin.android.apps.connectmobile.courses.model.c) obj;
                                    g.a aVar6 = g.f116591h;
                                    cVar6.getClass();
                                    j40.c.C1850c c1850c3 = gVar2.f116592g;
                                    if (c1850c3 != null) {
                                        j40.c cVar7 = j40.c.this;
                                        cVar7.T = cVar6;
                                        qe2.h hVar5 = cVar7.f148294e;
                                        if ((hVar5 != null ? hVar5.f144584a.getY() : 0.0f) >= 10.0f) {
                                            cVar7.z7();
                                            cVar7.O7(cVar6);
                                        } else {
                                            cVar7.z7();
                                        }
                                    }
                                    break;
                                case 3:
                                    boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                                    j40.c.C1850c c1850c4 = gVar2.f116592g;
                                    if (c1850c4 != null) {
                                        c1850c4.a(zBooleanValue3);
                                    }
                                    break;
                                default:
                                    int iIntValue = ((Integer) obj).intValue();
                                    j40.c.C1850c c1850c5 = gVar2.f116592g;
                                    if (c1850c5 != null) {
                                        j40.c cVar8 = j40.c.this;
                                        cVar8.N7(iIntValue);
                                        cVar8.Y6().F3(new l40.a.C2100a(iIntValue));
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ10);
                } else {
                    z14 = true;
                }
                l lVar4 = (l) objQ10;
                boolean zR8 = o0VarE.r(this);
                Object objQ11 = o0VarE.q();
                if (zR8 || objQ11 == c2565a) {
                    final int i25 = 2;
                    objQ11 = new l(this) { // from class: m40.d

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ g f116585b;

                        {
                            this.f116585b = this;
                        }

                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            qe2.h hVar2;
                            com.garmin.android.library.mapsdkadapter.e z110;
                            u20.g gVar;
                            int i110 = i25;
                            g gVar2 = this.f116585b;
                            switch (i110) {
                                case 0:
                                    List list3 = (List) obj;
                                    g.a aVar5 = g.f116591h;
                                    list3.getClass();
                                    j40.c.C1850c c1850c = gVar2.f116592g;
                                    if (c1850c != null) {
                                        j40.c cVar3 = j40.c.this;
                                        cVar3.Y6().F3(new l40.a.e(list3));
                                        cVar3.A7();
                                        qe2.h hVar3 = cVar3.f148294e;
                                        if ((hVar3 != null ? hVar3.f144584a.getY() : 0.0f) >= 13.0f && (hVar2 = cVar3.f148294e) != null && (z110 = hVar2.f144584a.getZ()) != null && (gVar = cVar3.f97020y) != null) {
                                            gVar.p5(z110, cVar3.V6().f109901i);
                                        }
                                    }
                                    break;
                                case 1:
                                    boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                                    g.A6("ToggleClimbsMapSetting", zBooleanValue2);
                                    j40.c.C1850c c1850c2 = gVar2.f116592g;
                                    if (c1850c2 != null) {
                                        j40.c cVar4 = j40.c.this;
                                        cVar4.Y6().F3(new l40.a.c(zBooleanValue2));
                                        qe2.h hVar4 = cVar4.f148294e;
                                        float y14 = hVar4 != null ? hVar4.f144584a.getY() : 0.0f;
                                        if (!zBooleanValue2 || y14 < 10.0f) {
                                            cVar4.z7();
                                        } else {
                                            com.garmin.android.apps.connectmobile.courses.model.c cVar5 = cVar4.T;
                                            if (cVar5 != null) {
                                                cVar4.O7(cVar5);
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    com.garmin.android.apps.connectmobile.courses.model.c cVar6 = (com.garmin.android.apps.connectmobile.courses.model.c) obj;
                                    g.a aVar6 = g.f116591h;
                                    cVar6.getClass();
                                    j40.c.C1850c c1850c3 = gVar2.f116592g;
                                    if (c1850c3 != null) {
                                        j40.c cVar7 = j40.c.this;
                                        cVar7.T = cVar6;
                                        qe2.h hVar5 = cVar7.f148294e;
                                        if ((hVar5 != null ? hVar5.f144584a.getY() : 0.0f) >= 10.0f) {
                                            cVar7.z7();
                                            cVar7.O7(cVar6);
                                        } else {
                                            cVar7.z7();
                                        }
                                    }
                                    break;
                                case 3:
                                    boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                                    j40.c.C1850c c1850c4 = gVar2.f116592g;
                                    if (c1850c4 != null) {
                                        c1850c4.a(zBooleanValue3);
                                    }
                                    break;
                                default:
                                    int iIntValue = ((Integer) obj).intValue();
                                    j40.c.C1850c c1850c5 = gVar2.f116592g;
                                    if (c1850c5 != null) {
                                        j40.c cVar8 = j40.c.this;
                                        cVar8.N7(iIntValue);
                                        cVar8.Y6().F3(new l40.a.C2100a(iIntValue));
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ11);
                }
                l lVar5 = (l) objQ11;
                boolean zR9 = o0VarE.r(this);
                Object objQ12 = o0VarE.q();
                if (zR9 || objQ12 == c2565a) {
                    final int i26 = 0;
                    objQ12 = new p(this) { // from class: m40.e

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ g f116587b;

                        {
                            this.f116587b = this;
                        }

                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i110 = i26;
                            String str = null;
                            g gVar = this.f116587b;
                            switch (i110) {
                                case 0:
                                    com.garmin.android.apps.connectmobile.courses.model.b bVar5 = (com.garmin.android.apps.connectmobile.courses.model.b) obj;
                                    com.garmin.android.apps.connectmobile.courses.model.b bVar6 = (com.garmin.android.apps.connectmobile.courses.model.b) obj2;
                                    g.a aVar5 = g.f116591h;
                                    bVar5.getClass();
                                    bVar6.getClass();
                                    j40.c.C1850c c1850c = gVar.f116592g;
                                    if (c1850c != null) {
                                        j40.c cVar3 = j40.c.this;
                                        cVar3.getClass();
                                        cVar3.X = bVar5;
                                        cVar3.Y = bVar6;
                                        cVar3.Y6().F3(new l40.a.b(bVar5.ordinal(), bVar6.ordinal()));
                                        com.garmin.android.apps.connectmobile.courses.model.c cVar4 = cVar3.T;
                                        qe2.h hVar2 = cVar3.f148294e;
                                        float y14 = hVar2 != null ? hVar2.f144584a.getY() : 0.0f;
                                        if (cVar4 == null || y14 < 10.0f) {
                                            cVar3.z7();
                                        } else {
                                            cVar3.z7();
                                            cVar3.O7(cVar4);
                                        }
                                    }
                                    break;
                                case 1:
                                    v vVar = (v) obj;
                                    boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                                    g.a aVar6 = g.f116591h;
                                    vVar.getClass();
                                    int i27 = g.b.f116593a[vVar.ordinal()];
                                    if (i27 == 1) {
                                        str = "TogglePopularityHeatmap";
                                    } else if (i27 == 2) {
                                        str = "ToggleHighTraffic";
                                    } else if (i27 == 3) {
                                        str = "ToggleUnpavedRoads";
                                    }
                                    if (str != null) {
                                        g.C6(str, zBooleanValue2);
                                    }
                                    j40.c.C1850c c1850c2 = gVar.f116592g;
                                    if (c1850c2 != null) {
                                        c1850c2.c(vVar, zBooleanValue2);
                                    }
                                    break;
                                default:
                                    v vVar2 = (v) obj;
                                    Boolean bool = (Boolean) obj2;
                                    boolean zBooleanValue3 = bool.booleanValue();
                                    g.a aVar7 = g.f116591h;
                                    vVar2.getClass();
                                    int i28 = g.b.f116593a[vVar2.ordinal()];
                                    if (i28 == 4) {
                                        j40.c.C1850c c1850c3 = gVar.f116592g;
                                        if (c1850c3 != null) {
                                            c1850c3.c(v.MILE_MARKERS, zBooleanValue3);
                                        }
                                    } else if (i28 == 5) {
                                        as2.d dVar = new as2.d(gVar, zBooleanValue3, 12);
                                        if (zBooleanValue3 && ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).k4()) {
                                            ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).j0();
                                            m0 m0VarC = m0.a.c(m0.f149759e, gVar.getString(R.string.lbl_hazard_notice), gVar.getString(R.string.lbl_hazard_notice_description), 0, null, R.string.lbl_ok, new js0.d(dVar, 21), MlKitException.CODE_SCANNER_TASK_IN_PROGRESS);
                                            m0VarC.setCancelable(false);
                                            m0VarC.show(gVar.getParentFragmentManager(), "GCMFeatureInfoDialog");
                                        } else {
                                            dVar.invoke(bool);
                                        }
                                    } else if (i28 == 6) {
                                        g.A6("ToggleHazardsMapSettingViewMode", zBooleanValue3);
                                        j40.c.C1850c c1850c4 = gVar.f116592g;
                                        if (c1850c4 != null) {
                                            c1850c4.c(v.HAZARDS_ON_COURSE, zBooleanValue3);
                                        }
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ12);
                }
                p pVar2 = (p) objQ12;
                boolean zR10 = o0VarE.r(this);
                Object objQ13 = o0VarE.q();
                if (zR10 || objQ13 == c2565a) {
                    objQ13 = new v0(this, 22);
                    o0VarE.K(objQ13);
                }
                e23.a aVar5 = (e23.a) objQ13;
                boolean zR11 = o0VarE.r(this);
                Object objQ14 = o0VarE.q();
                if (zR11 || objQ14 == c2565a) {
                    objQ14 = new kk1.a(this, p1Var2, p1Var3, 17);
                    o0VarE.K(objQ14);
                }
                n40.g.a(aVar4, pVar, lVar3, lVar4, lVar5, pVar2, aVar5, (e23.a) objQ14, o0VarE, 0);
                o0VarE.g0(false);
            } else {
                z14 = true;
                o0VarE.C(-1462826978);
                o0VarE.g0(false);
            }
            o0VarE.g0(z14);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(this, cVar, i14);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lm40/g$a;", "", "<init>", "()V", "", "EXTRA_COURSE_MAP_SETTINGS", "Ljava/lang/String;", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
