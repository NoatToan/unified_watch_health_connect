package ty1;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import c22.l3;
import c22.q3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.EventDetailsActivity;
import com.google.android.material.tabs.TabLayout;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import ty1.h;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.a f167121b;

    public /* synthetic */ h(com.garmin.android.apps.connectmobile.traininginitiative.ui.a aVar, int i14) {
        this.f167120a = i14;
        this.f167121b = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x018a  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:111:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:113:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:115:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:117:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:119:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:120:0x01db  */
    /* JADX WARN: Code duplicated, block: B:122:0x01de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:124:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:126:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:128:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:131:0x01f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:132:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:134:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:135:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:137:0x0202  */
    /* JADX WARN: Code duplicated, block: B:139:0x0206  */
    /* JADX WARN: Code duplicated, block: B:141:0x020d  */
    /* JADX WARN: Code duplicated, block: B:142:0x0211  */
    /* JADX WARN: Code duplicated, block: B:144:0x0215  */
    /* JADX WARN: Code duplicated, block: B:147:0x021b  */
    /* JADX WARN: Code duplicated, block: B:148:0x0220  */
    /* JADX WARN: Code duplicated, block: B:150:0x0224  */
    /* JADX WARN: Code duplicated, block: B:152:0x0228  */
    /* JADX WARN: Code duplicated, block: B:154:0x022f  */
    /* JADX WARN: Code duplicated, block: B:155:0x0233  */
    /* JADX WARN: Code duplicated, block: B:157:0x0237  */
    /* JADX WARN: Code duplicated, block: B:159:0x023b  */
    /* JADX WARN: Code duplicated, block: B:161:0x023f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:162:0x0241  */
    /* JADX WARN: Code duplicated, block: B:163:0x0245  */
    /* JADX WARN: Code duplicated, block: B:165:0x0249  */
    /* JADX WARN: Code duplicated, block: B:167:0x024f  */
    /* JADX WARN: Code duplicated, block: B:169:0x0255  */
    /* JADX WARN: Code duplicated, block: B:171:0x025b  */
    /* JADX WARN: Code duplicated, block: B:173:0x0261  */
    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    /* JADX WARN: Code duplicated, block: B:473:0x0838  */
    /* JADX WARN: Code duplicated, block: B:475:0x085b  */
    /* JADX WARN: Code duplicated, block: B:477:0x0868  */
    /* JADX WARN: Code duplicated, block: B:479:0x086c  */
    /* JADX WARN: Code duplicated, block: B:481:0x0876  */
    /* JADX WARN: Code duplicated, block: B:485:0x0882  */
    /* JADX WARN: Code duplicated, block: B:487:0x0886  */
    /* JADX WARN: Code duplicated, block: B:488:0x088a  */
    /* JADX WARN: Code duplicated, block: B:490:0x088e  */
    /* JADX WARN: Code duplicated, block: B:557:0x09b6  */
    /* JADX WARN: Code duplicated, block: B:562:0x09c4  */
    /* JADX WARN: Code duplicated, block: B:564:0x09c7  */
    /* JADX WARN: Code duplicated, block: B:565:0x09c9  */
    /* JADX WARN: Code duplicated, block: B:567:0x09cd  */
    /* JADX WARN: Code duplicated, block: B:569:0x09d6  */
    /* JADX WARN: Code duplicated, block: B:571:0x09dd  */
    /* JADX WARN: Code duplicated, block: B:572:0x09e4  */
    /* JADX WARN: Code duplicated, block: B:574:0x09ea  */
    /* JADX WARN: Code duplicated, block: B:576:0x09f0  */
    /* JADX WARN: Code duplicated, block: B:580:0x09fa  */
    /* JADX WARN: Code duplicated, block: B:582:0x0a01  */
    /* JADX WARN: Code duplicated, block: B:584:0x0a0c  */
    /* JADX WARN: Code duplicated, block: B:585:0x0a10  */
    /* JADX WARN: Code duplicated, block: B:587:0x0a16  */
    /* JADX WARN: Code duplicated, block: B:589:0x0a1c  */
    /* JADX WARN: Code duplicated, block: B:637:0x0aba  */
    /* JADX WARN: Code duplicated, block: B:655:0x0ae1  */
    /* JADX WARN: Code duplicated, block: B:658:0x0ae6  */
    /* JADX WARN: Code duplicated, block: B:730:0x0bba  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v143 */
    /* JADX WARN: Type inference failed for: r0v146 */
    /* JADX WARN: Type inference failed for: r0v148 */
    /* JADX WARN: Type inference failed for: r0v149 */
    /* JADX WARN: Type inference failed for: r0v150, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v154 */
    /* JADX WARN: Type inference failed for: r0v237 */
    private final Object a(Object obj) {
        int i14;
        int i15;
        gg0.e trainingPlanType;
        fg0.x xVar;
        xw1.d dVar;
        fg0.j eventCustomization;
        fg0.j eventCustomization2;
        Long trainingPlanId;
        fg0.j eventCustomization3;
        com.garmin.android.apps.connectmobile.workouts.data.model.k kVar;
        com.garmin.android.apps.connectmobile.workouts.data.model.k kVar2;
        LinearLayout linearLayout;
        View view2;
        TextView textView;
        View view3;
        TextView textView2;
        Integer courseId;
        boolean z14;
        LinearLayout linearLayout2;
        Integer courseId2;
        Integer courseId3;
        View view4;
        TextView textView3;
        View view5;
        TextView textView4;
        Integer courseId4;
        Object next;
        Object next2;
        fg0.j eventCustomization4;
        fg0.d customGoal;
        boolean z15;
        boolean z16;
        FrameLayout frameLayout;
        TabLayout tabLayout;
        ViewPager viewPager;
        LocalDate date;
        boolean z17;
        FrameLayout frameLayout2;
        TabLayout tabLayout2;
        ViewPager viewPager2;
        ?? V0;
        ?? r14;
        int i16;
        int i17;
        fg0.a0 a0Var;
        String str;
        String str2;
        TextView textView5;
        TextView textView6;
        TextView textView7;
        fg0.j eventCustomization5;
        fg0.d customGoal2;
        int i18;
        Double value;
        Double value2;
        boolean z18;
        fg0.k kVar3 = (fg0.k) obj;
        com.garmin.android.apps.connectmobile.traininginitiative.ui.a.C0883a c0883a = com.garmin.android.apps.connectmobile.traininginitiative.ui.a.T0;
        com.garmin.android.apps.connectmobile.traininginitiative.ui.a aVar = this.f167121b;
        g22.e.f(aVar);
        String str3 = "mShareImageView";
        if (kVar3 != null) {
            androidx.fragment.app.m activity = aVar.getActivity();
            if (activity != null) {
                activity.invalidateOptionsMenu();
                Unit unit = Unit.INSTANCE;
            }
            Context context = aVar.getContext();
            if (context != null) {
                if (aVar.z6().G5(kVar3)) {
                    z18 = true;
                } else {
                    aVar.z6();
                    if (mz1.e0.H5(kVar3) || aVar.z6().I5(kVar3) || mz1.e0.J5(kVar3)) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                }
                ViewPager viewPager3 = aVar.f45741d;
                if (viewPager3 == null) {
                    p005kotlin.jvm.internal.s.m("mViewPager");
                    throw null;
                }
                androidx.fragment.app.v childFragmentManager = aVar.getChildFragmentManager();
                childFragmentManager.getClass();
                viewPager3.setAdapter(new com.garmin.android.apps.connectmobile.traininginitiative.ui.a.b(childFragmentManager, context, kVar3, aVar.N0, z18));
                ViewPager viewPager4 = aVar.f45741d;
                if (viewPager4 == null) {
                    p005kotlin.jvm.internal.s.m("mViewPager");
                    throw null;
                }
                fe.a adapter = viewPager4.getAdapter();
                int f44034e = adapter != null ? adapter.getF44052d() : 0;
                if (aVar.Q0) {
                    int i19 = f44034e > 0 ? f44034e - 1 : 0;
                    ViewPager viewPager5 = aVar.f45741d;
                    if (viewPager5 == null) {
                        p005kotlin.jvm.internal.s.m("mViewPager");
                        throw null;
                    }
                    viewPager5.C(i19, true);
                }
                ViewPager viewPager6 = aVar.f45741d;
                if (viewPager6 == null) {
                    p005kotlin.jvm.internal.s.m("mViewPager");
                    throw null;
                }
                viewPager6.setOffscreenPageLimit(f44034e);
                TabLayout tabLayout3 = aVar.f45740c;
                if (tabLayout3 == null) {
                    p005kotlin.jvm.internal.s.m("mTabLayout");
                    throw null;
                }
                ViewPager viewPager7 = aVar.f45741d;
                if (viewPager7 == null) {
                    p005kotlin.jvm.internal.s.m("mViewPager");
                    throw null;
                }
                tabLayout3.setupWithViewPager(viewPager7);
            }
            aVar.K0 = kVar3;
            Unit unit2 = Unit.INSTANCE;
            if (kVar3.getCourseId() != null) {
                com.garmin.android.apps.connectmobile.traininginitiative.ui.b.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.b.f45836k;
                Long courseId5 = kVar3.getCourseId();
                aVar2.getClass();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.b bVarA = com.garmin.android.apps.connectmobile.traininginitiative.ui.b.a.a(courseId5, null);
                androidx.fragment.app.v childFragmentManager2 = aVar.getChildFragmentManager();
                childFragmentManager2.getClass();
                androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(childFragmentManager2);
                aVar3.l(R.id.map_container, bVarA, null);
                aVar3.e();
                LinearLayout linearLayout3 = aVar.f45753o;
                if (linearLayout3 == null) {
                    p005kotlin.jvm.internal.s.m("mMapLegend");
                    throw null;
                }
                linearLayout3.setVisibility(8);
            } else {
                List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listH = kVar3.h();
                if (listH == null || listH.isEmpty()) {
                    aVar.z6().f5().j(null);
                    FrameLayout frameLayout3 = aVar.f45752n;
                    if (frameLayout3 == null) {
                        p005kotlin.jvm.internal.s.m("mMapContainer");
                        throw null;
                    }
                    frameLayout3.setVisibility(8);
                    LinearLayout linearLayout4 = aVar.f45753o;
                    if (linearLayout4 == null) {
                        p005kotlin.jvm.internal.s.m("mMapLegend");
                        throw null;
                    }
                    linearLayout4.setVisibility(8);
                } else {
                    List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listH2 = kVar3.h();
                    if (listH2 != null) {
                        Iterator it = listH2.iterator();
                        do {
                            if (!it.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it.next();
                        } while (((com.garmin.android.apps.connectmobile.workouts.data.model.k) next2).getEventLegActivityType() != m52.c.CYCLING);
                        kVar = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next2;
                    } else {
                        kVar = null;
                    }
                    List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listH3 = kVar3.h();
                    if (listH3 != null) {
                        Iterator it3 = listH3.iterator();
                        do {
                            if (!it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                        } while (((com.garmin.android.apps.connectmobile.workouts.data.model.k) next).getEventLegActivityType() != m52.c.RUNNING);
                        kVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next;
                    } else {
                        kVar2 = null;
                    }
                    if ((kVar != null ? kVar.getCourseId() : null) != null) {
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.b.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.b.f45836k;
                        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listH4 = kVar3.h();
                        aVar4.getClass();
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.b bVarA2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.b.a.a(null, listH4);
                        androidx.fragment.app.v childFragmentManager3 = aVar.getChildFragmentManager();
                        childFragmentManager3.getClass();
                        androidx.fragment.app.a aVar5 = new androidx.fragment.app.a(childFragmentManager3);
                        aVar5.l(R.id.map_container, bVarA2, null);
                        aVar5.e();
                        linearLayout = aVar.f45753o;
                        if (linearLayout != null) {
                            p005kotlin.jvm.internal.s.m("mMapLegend");
                            throw null;
                        }
                        linearLayout.setVisibility(8);
                        view2 = aVar.f45754p;
                        if (view2 != null) {
                            p005kotlin.jvm.internal.s.m("mBikeLegendLine");
                            throw null;
                        }
                        view2.setVisibility(8);
                        textView = aVar.f45755q;
                        if (textView != null) {
                            p005kotlin.jvm.internal.s.m("mBikeLegendText");
                            throw null;
                        }
                        textView.setVisibility(8);
                        view3 = aVar.f45756r;
                        if (view3 != null) {
                            p005kotlin.jvm.internal.s.m("mRunLegendLine");
                            throw null;
                        }
                        view3.setVisibility(8);
                        textView2 = aVar.f45757t;
                        if (textView2 != null) {
                            p005kotlin.jvm.internal.s.m("mRunLegendText");
                            throw null;
                        }
                        textView2.setVisibility(8);
                        if (kVar != null) {
                            courseId = kVar.getCourseId();
                        } else {
                            courseId = null;
                        }
                        if (courseId != null) {
                            z14 = true;
                        } else {
                            if (kVar2 != null) {
                                courseId4 = kVar2.getCourseId();
                            } else {
                                courseId4 = null;
                            }
                            if (courseId4 == null) {
                                z14 = false;
                            } else {
                                z14 = true;
                            }
                        }
                        linearLayout2 = aVar.f45753o;
                        if (z14) {
                            if (linearLayout2 != null) {
                                p005kotlin.jvm.internal.s.m("mMapLegend");
                                throw null;
                            }
                            linearLayout2.setVisibility(0);
                            if (kVar != null) {
                                courseId2 = kVar.getCourseId();
                            } else {
                                courseId2 = null;
                            }
                            if (courseId2 != null) {
                                view5 = aVar.f45754p;
                                if (view5 != null) {
                                    p005kotlin.jvm.internal.s.m("mBikeLegendLine");
                                    throw null;
                                }
                                view5.setVisibility(0);
                                textView4 = aVar.f45755q;
                                if (textView4 != null) {
                                    p005kotlin.jvm.internal.s.m("mBikeLegendText");
                                    throw null;
                                }
                                textView4.setVisibility(0);
                            }
                            if (kVar2 != null) {
                                courseId3 = kVar2.getCourseId();
                            } else {
                                courseId3 = null;
                            }
                            if (courseId3 != null) {
                                view4 = aVar.f45756r;
                                if (view4 != null) {
                                    p005kotlin.jvm.internal.s.m("mRunLegendLine");
                                    throw null;
                                }
                                view4.setVisibility(0);
                                textView3 = aVar.f45757t;
                                if (textView3 != null) {
                                    p005kotlin.jvm.internal.s.m("mRunLegendText");
                                    throw null;
                                }
                                textView3.setVisibility(0);
                            }
                        } else {
                            if (linearLayout2 != null) {
                                p005kotlin.jvm.internal.s.m("mMapLegend");
                                throw null;
                            }
                            linearLayout2.setVisibility(8);
                        }
                    } else {
                        if ((kVar2 != null ? kVar2.getCourseId() : null) == null) {
                            aVar.z6().f5().j(null);
                            FrameLayout frameLayout4 = aVar.f45752n;
                            if (frameLayout4 == null) {
                                p005kotlin.jvm.internal.s.m("mMapContainer");
                                throw null;
                            }
                            frameLayout4.setVisibility(8);
                            LinearLayout linearLayout5 = aVar.f45753o;
                            if (linearLayout5 == null) {
                                p005kotlin.jvm.internal.s.m("mMapLegend");
                                throw null;
                            }
                            linearLayout5.setVisibility(8);
                        } else {
                            com.garmin.android.apps.connectmobile.traininginitiative.ui.b.a aVar6 = com.garmin.android.apps.connectmobile.traininginitiative.ui.b.f45836k;
                            List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listH5 = kVar3.h();
                            aVar6.getClass();
                            com.garmin.android.apps.connectmobile.traininginitiative.ui.b bVarA3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.b.a.a(null, listH5);
                            androidx.fragment.app.v childFragmentManager4 = aVar.getChildFragmentManager();
                            childFragmentManager4.getClass();
                            androidx.fragment.app.a aVar7 = new androidx.fragment.app.a(childFragmentManager4);
                            aVar7.l(R.id.map_container, bVarA3, null);
                            aVar7.e();
                            linearLayout = aVar.f45753o;
                            if (linearLayout != null) {
                                p005kotlin.jvm.internal.s.m("mMapLegend");
                                throw null;
                            }
                            linearLayout.setVisibility(8);
                            view2 = aVar.f45754p;
                            if (view2 != null) {
                                p005kotlin.jvm.internal.s.m("mBikeLegendLine");
                                throw null;
                            }
                            view2.setVisibility(8);
                            textView = aVar.f45755q;
                            if (textView != null) {
                                p005kotlin.jvm.internal.s.m("mBikeLegendText");
                                throw null;
                            }
                            textView.setVisibility(8);
                            view3 = aVar.f45756r;
                            if (view3 != null) {
                                p005kotlin.jvm.internal.s.m("mRunLegendLine");
                                throw null;
                            }
                            view3.setVisibility(8);
                            textView2 = aVar.f45757t;
                            if (textView2 != null) {
                                p005kotlin.jvm.internal.s.m("mRunLegendText");
                                throw null;
                            }
                            textView2.setVisibility(8);
                            if (kVar != null) {
                                courseId = kVar.getCourseId();
                            } else {
                                courseId = null;
                            }
                            if (courseId != null) {
                                z14 = true;
                            } else {
                                if (kVar2 != null) {
                                    courseId4 = kVar2.getCourseId();
                                } else {
                                    courseId4 = null;
                                }
                                if (courseId4 == null) {
                                    z14 = false;
                                } else {
                                    z14 = true;
                                }
                            }
                            linearLayout2 = aVar.f45753o;
                            if (z14) {
                                if (linearLayout2 != null) {
                                    p005kotlin.jvm.internal.s.m("mMapLegend");
                                    throw null;
                                }
                                linearLayout2.setVisibility(0);
                                if (kVar != null) {
                                    courseId2 = kVar.getCourseId();
                                } else {
                                    courseId2 = null;
                                }
                                if (courseId2 != null) {
                                    view5 = aVar.f45754p;
                                    if (view5 != null) {
                                        p005kotlin.jvm.internal.s.m("mBikeLegendLine");
                                        throw null;
                                    }
                                    view5.setVisibility(0);
                                    textView4 = aVar.f45755q;
                                    if (textView4 != null) {
                                        p005kotlin.jvm.internal.s.m("mBikeLegendText");
                                        throw null;
                                    }
                                    textView4.setVisibility(0);
                                }
                                if (kVar2 != null) {
                                    courseId3 = kVar2.getCourseId();
                                } else {
                                    courseId3 = null;
                                }
                                if (courseId3 != null) {
                                    view4 = aVar.f45756r;
                                    if (view4 != null) {
                                        p005kotlin.jvm.internal.s.m("mRunLegendLine");
                                        throw null;
                                    }
                                    view4.setVisibility(0);
                                    textView3 = aVar.f45757t;
                                    if (textView3 != null) {
                                        p005kotlin.jvm.internal.s.m("mRunLegendText");
                                        throw null;
                                    }
                                    textView3.setVisibility(0);
                                }
                            } else {
                                if (linearLayout2 != null) {
                                    p005kotlin.jvm.internal.s.m("mMapLegend");
                                    throw null;
                                }
                                linearLayout2.setVisibility(8);
                            }
                        }
                    }
                }
            }
            TextView textView8 = aVar.f45742e;
            if (textView8 == null) {
                p005kotlin.jvm.internal.s.m("mTitle");
                throw null;
            }
            String strR = kVar3.r(true);
            if (strR == null) {
                strR = "";
            }
            textView8.setText(strR);
            fg0.j eventCustomization6 = kVar3.getEventCustomization();
            String strN = eventCustomization6 != null ? p005kotlin.jvm.internal.s.g(eventCustomization6.getIsPrimaryEvent(), Boolean.TRUE) : false ? fb1.c.n("• ", aVar.getResources().getString(R.string.primary_event)) : "";
            aVar.z6();
            if (zf0.j0.Q4(kVar3)) {
                mz1.e0 e0VarZ6 = aVar.z6();
                long j8 = 1000;
                long millis = new DateTime().toLocalDate().toDateTimeAtCurrentTime().getMillis() / j8;
                fg0.y locationStartPoint = kVar3.getLocationStartPoint();
                Double lat = locationStartPoint != null ? locationStartPoint.getLat() : null;
                fg0.y locationStartPoint2 = kVar3.getLocationStartPoint();
                Double lon = locationStartPoint2 != null ? locationStartPoint2.getLon() : null;
                LocalDate date2 = kVar3.getDate();
                fg0.r eventTimeLocal = kVar3.getEventTimeLocal();
                LocalTime localTimeF = eventTimeLocal != null ? eventTimeLocal.f() : null;
                if (lat != null && lon != null && date2 != null && localTimeF != null) {
                    og0.a aVar8 = og0.a.f131967a;
                    fg0.r eventTimeLocal2 = kVar3.getEventTimeLocal();
                    String timeZoneId = eventTimeLocal2 != null ? eventTimeLocal2.getTimeZoneId() : null;
                    aVar8.getClass();
                    long millis2 = og0.a.p(date2, localTimeF, timeZoneId).getMillis() / j8;
                    if (millis - millis2 <= 0) {
                        ge1.b.T(androidx.lifecycle.v1.a(e0VarZ6), null, null, new mz1.s0(e0VarZ6, lat.doubleValue(), lon.doubleValue(), millis2, 1, null), 3);
                    } else {
                        fg0.j eventCustomization7 = kVar3.getEventCustomization();
                        if ((eventCustomization7 != null ? eventCustomization7.getAssociatedWithActivityId() : null) != null) {
                            fg0.j eventCustomization8 = kVar3.getEventCustomization();
                            Long associatedWithActivityId = eventCustomization8 != null ? eventCustomization8.getAssociatedWithActivityId() : null;
                            associatedWithActivityId.getClass();
                            ge1.b.T(androidx.lifecycle.v1.a(e0VarZ6), null, null, new mz1.v0(e0VarZ6, associatedWithActivityId.longValue(), lat.doubleValue(), lon.doubleValue(), millis2, null), 3);
                        } else {
                            mz1.e0.m5(e0VarZ6, lb2.b.a(lat.doubleValue()), lb2.b.a(lon.doubleValue()), millis2);
                        }
                    }
                }
            }
            LinearLayout linearLayout6 = aVar.f45760x;
            if (linearLayout6 == null) {
                p005kotlin.jvm.internal.s.m("mGoalPaceOrSpeedView");
                throw null;
            }
            linearLayout6.setVisibility(8);
            LinearLayout linearLayout7 = aVar.f45761y;
            if (linearLayout7 == null) {
                p005kotlin.jvm.internal.s.m("mGoalCustomizationView");
                throw null;
            }
            linearLayout7.setVisibility(8);
            boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
            String string = aVar.getString(zY ? R.string.lbl_km : R.string.lbl_mile);
            string.getClass();
            og0.a aVar9 = og0.a.f131967a;
            Context contextRequireContext = aVar.requireContext();
            contextRequireContext.getClass();
            aVar9.getClass();
            String strQ = og0.a.q(contextRequireContext);
            fg0.d completionTarget = kVar3.getCompletionTarget();
            double dO = 0.0d;
            if ((completionTarget != null ? completionTarget.getUnitType() : null) == gg0.h.TIME) {
                l3.a aVar10 = l3.f23124b;
                fg0.d completionTarget2 = kVar3.getCompletionTarget();
                Long lValueOf = (completionTarget2 == null || (value2 = completionTarget2.getValue()) == null) ? null : Long.valueOf((long) value2.doubleValue());
                aVar10.getClass();
                String strG1 = l3.a.g1(lValueOf);
                TextView textView9 = aVar.f45743f;
                if (textView9 == null) {
                    p005kotlin.jvm.internal.s.m("mEventDistancePrimaryEvent");
                    throw null;
                }
                textView9.setText(strG1 + StringUtils.SPACE + strN);
                if (!aVar.N0 && kVar3.getEventCustomization() != null && (eventCustomization5 = kVar3.getEventCustomization()) != null && (customGoal2 = eventCustomization5.getCustomGoal()) != null) {
                    LinearLayout linearLayout8 = aVar.f45760x;
                    if (linearLayout8 == null) {
                        p005kotlin.jvm.internal.s.m("mGoalPaceOrSpeedView");
                        throw null;
                    }
                    linearLayout8.setVisibility(0);
                    aVar.z6();
                    double dB5 = mz1.e0.b5(customGoal2);
                    fg0.d completionTarget3 = kVar3.getCompletionTarget();
                    double dDoubleValue = (completionTarget3 == null || (value = completionTarget3.getValue()) == null) ? 0.0d : value.doubleValue();
                    gg0.f eventType = kVar3.getEventType();
                    if (eventType != null && eventType.e()) {
                        double d14 = dB5 / dDoubleValue;
                        q3 q3Var = zY ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
                        String strL0 = l3.a.L0(d14, q3Var, l3.f23130h);
                        String string2 = aVar.getString(R.string.lbl_course_goal_speed);
                        string2.getClass();
                        TextView textView10 = aVar.f45747j;
                        if (textView10 == null) {
                            p005kotlin.jvm.internal.s.m("mGoalPaceOrSpeed");
                            throw null;
                        }
                        textView10.setText(strL0 + StringUtils.SPACE + aVar.getString(q3Var.f23223e));
                        TextView textView11 = aVar.f45748k;
                        if (textView11 == null) {
                            p005kotlin.jvm.internal.s.m("mGoalPaceOrSpeedType");
                            throw null;
                        }
                        textView11.setText(string2);
                    } else {
                        String strB = og0.a.b(dDoubleValue, dB5);
                        ((androidx.lifecycle.y0) aVar.z6().P0.getValue()).j(strB);
                        TextView textView12 = aVar.f45747j;
                        if (textView12 == null) {
                            p005kotlin.jvm.internal.s.m("mGoalPaceOrSpeed");
                            throw null;
                        }
                        textView12.setText(d53.u.v(strB, ".", ":", false) + " /" + string);
                        TextView textView13 = aVar.f45748k;
                        if (textView13 == null) {
                            p005kotlin.jvm.internal.s.m("mGoalPaceOrSpeedType");
                            throw null;
                        }
                        textView13.setText(aVar.getString(R.string.lbl_course_goal_pace));
                    }
                    LinearLayout linearLayout9 = aVar.f45761y;
                    if (linearLayout9 == null) {
                        p005kotlin.jvm.internal.s.m("mGoalCustomizationView");
                        throw null;
                    }
                    linearLayout9.setVisibility(0);
                    DecimalFormat decimalFormat = l3.f23129g;
                    aVar.z6();
                    bg0.a.f17827a.getClass();
                    if (bg0.a.C0255a.e()) {
                        Double value3 = customGoal2.getValue();
                        if (value3 != null) {
                            gg0.i unit3 = customGoal2.getUnit();
                            i18 = unit3 != null ? mz1.e0.b.f121706a[unit3.ordinal()] : -1;
                            if (i18 == 2) {
                                dO = value3.doubleValue();
                            } else if (i18 == 3) {
                                lz1.f.a aVar11 = lz1.f.f115404a;
                                double dDoubleValue2 = value3.doubleValue() * 1.609344d;
                                aVar11.getClass();
                                dO = lz1.f.a.o(dDoubleValue2, 2);
                            }
                        }
                    } else {
                        Double value4 = customGoal2.getValue();
                        if (value4 != null) {
                            gg0.i unit4 = customGoal2.getUnit();
                            i18 = unit4 != null ? mz1.e0.b.f121706a[unit4.ordinal()] : -1;
                            if (i18 == 2) {
                                lz1.f.a aVar12 = lz1.f.f115404a;
                                double dCeil = Math.ceil(value4.doubleValue() / 1.609344d);
                                aVar12.getClass();
                                dO = lz1.f.a.o(dCeil, 2);
                            } else if (i18 == 3) {
                                dO = value4.doubleValue();
                            }
                        }
                    }
                    String str4 = decimalFormat.format(dO);
                    TextView textView14 = aVar.f45750l;
                    if (textView14 == null) {
                        p005kotlin.jvm.internal.s.m("mGoalCustomization");
                        throw null;
                    }
                    textView14.setText(str4 + StringUtils.SPACE + strQ);
                    TextView textView15 = aVar.f45751m;
                    if (textView15 == null) {
                        p005kotlin.jvm.internal.s.m("mGoalCustomizationType");
                        throw null;
                    }
                    textView15.setText(aVar.getString(R.string.goal_distance));
                    Unit unit5 = Unit.INSTANCE;
                }
            } else {
                str3 = "mShareImageView";
                fg0.d completionTarget4 = kVar3.getCompletionTarget();
                if (completionTarget4 != null) {
                    aVar.z6();
                    double dB6 = mz1.e0.b5(completionTarget4);
                    String strF = completionTarget4.f();
                    TextView textView16 = aVar.f45743f;
                    if (textView16 == null) {
                        p005kotlin.jvm.internal.s.m("mEventDistancePrimaryEvent");
                        throw null;
                    }
                    textView16.setText(j20.x.d(strF, StringUtils.SPACE, strQ, StringUtils.SPACE, strN));
                    if (!aVar.N0 && kVar3.getEventCustomization() != null && (eventCustomization4 = kVar3.getEventCustomization()) != null && (customGoal = eventCustomization4.getCustomGoal()) != null) {
                        Double value5 = customGoal.getValue();
                        double dDoubleValue3 = value5 != null ? value5.doubleValue() : 0.0d;
                        gg0.f eventType2 = kVar3.getEventType();
                        if (eventType2 != null && eventType2.e()) {
                            LinearLayout linearLayout10 = aVar.f45760x;
                            if (linearLayout10 == null) {
                                p005kotlin.jvm.internal.s.m("mGoalPaceOrSpeedView");
                                throw null;
                            }
                            linearLayout10.setVisibility(0);
                            double d15 = dB6 / dDoubleValue3;
                            q3 q3Var2 = zY ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
                            l3.f23124b.getClass();
                            String strL1 = l3.a.L0(d15, q3Var2, l3.f23130h);
                            String string3 = aVar.getString(R.string.lbl_course_goal_speed);
                            string3.getClass();
                            TextView textView17 = aVar.f45747j;
                            if (textView17 == null) {
                                p005kotlin.jvm.internal.s.m("mGoalPaceOrSpeed");
                                throw null;
                            }
                            textView17.setText(strL1 + StringUtils.SPACE + aVar.getString(q3Var2.f23223e));
                            TextView textView18 = aVar.f45748k;
                            if (textView18 == null) {
                                p005kotlin.jvm.internal.s.m("mGoalPaceOrSpeedType");
                                throw null;
                            }
                            textView18.setText(string3);
                        } else {
                            fg0.k kVar4 = aVar.K0;
                            if ((kVar4 != null ? kVar4.getEventType() : null) != gg0.f.f77136l) {
                                LinearLayout linearLayout11 = aVar.f45760x;
                                if (linearLayout11 == null) {
                                    p005kotlin.jvm.internal.s.m("mGoalPaceOrSpeedView");
                                    throw null;
                                }
                                linearLayout11.setVisibility(0);
                                String strB2 = og0.a.b(dDoubleValue3, dB6);
                                TextView textView19 = aVar.f45747j;
                                if (textView19 == null) {
                                    p005kotlin.jvm.internal.s.m("mGoalPaceOrSpeed");
                                    throw null;
                                }
                                textView19.setText(d53.u.v(strB2, ".", ":", false) + " /" + string);
                                TextView textView20 = aVar.f45748k;
                                if (textView20 == null) {
                                    p005kotlin.jvm.internal.s.m("mGoalPaceOrSpeedType");
                                    throw null;
                                }
                                textView20.setText(aVar.getString(R.string.lbl_course_goal_pace));
                            }
                        }
                        LinearLayout linearLayout12 = aVar.f45761y;
                        if (linearLayout12 == null) {
                            p005kotlin.jvm.internal.s.m("mGoalCustomizationView");
                            throw null;
                        }
                        linearLayout12.setVisibility(0);
                        TextView textView21 = aVar.f45750l;
                        if (textView21 == null) {
                            p005kotlin.jvm.internal.s.m("mGoalCustomization");
                            throw null;
                        }
                        l3.a aVar13 = l3.f23124b;
                        Double value6 = customGoal.getValue();
                        Long lValueOf2 = value6 != null ? Long.valueOf((long) value6.doubleValue()) : null;
                        aVar13.getClass();
                        textView21.setText(l3.a.g1(lValueOf2));
                        TextView textView22 = aVar.f45751m;
                        if (textView22 == null) {
                            p005kotlin.jvm.internal.s.m("mGoalCustomizationType");
                            throw null;
                        }
                        textView22.setText(aVar.getString(R.string.lbl_goal_time));
                        Unit unit6 = Unit.INSTANCE;
                    }
                    Unit unit7 = Unit.INSTANCE;
                } else {
                    TextView textView23 = aVar.f45743f;
                    if (textView23 == null) {
                        p005kotlin.jvm.internal.s.m("mEventDistancePrimaryEvent");
                        throw null;
                    }
                    textView23.setText(strN);
                    Unit unit8 = Unit.INSTANCE;
                }
            }
            LocalDate date3 = kVar3.getDate();
            if (date3 != null) {
                fg0.r eventTimeLocal3 = kVar3.getEventTimeLocal();
                if ((eventTimeLocal3 != null ? eventTimeLocal3.getStartTimeHhMm() : null) == null) {
                    lz1.f.a aVar14 = lz1.f.f115404a;
                    LocalDate localDateNow = LocalDate.now();
                    localDateNow.getClass();
                    Context contextRequireContext2 = aVar.requireContext();
                    contextRequireContext2.getClass();
                    aVar14.getClass();
                    o13.p pVarL = lz1.f.a.l(contextRequireContext2, localDateNow, date3);
                    str = (String) pVarL.f128594a;
                    str2 = (String) pVarL.f128595b;
                    textView5 = aVar.f45744g;
                    if (textView5 != null) {
                        p005kotlin.jvm.internal.s.m("mCountDown");
                        throw null;
                    }
                    textView5.setText(str);
                    if (!date3.isAfter(LocalDate.now())) {
                        textView7 = aVar.f45758v;
                        if (textView7 != null) {
                            p005kotlin.jvm.internal.s.m("mTextViewCountdown");
                            throw null;
                        }
                        textView7.setText(aVar.getString(R.string.lbl_pacepro_event_date));
                    }
                    if (str2.length() > 0) {
                        textView6 = aVar.f45744g;
                        if (textView6 != null) {
                            p005kotlin.jvm.internal.s.m("mCountDown");
                            throw null;
                        }
                        textView6.setContentDescription(str2);
                    }
                } else {
                    fg0.r eventTimeLocal4 = kVar3.getEventTimeLocal();
                    if ((eventTimeLocal4 != null ? eventTimeLocal4.getTimeZoneId() : null) != null) {
                        fg0.r eventTimeLocal5 = kVar3.getEventTimeLocal();
                        DateTime dateTimeD = eventTimeLocal5 != null ? eventTimeLocal5.d() : null;
                        lz1.f.a aVar15 = lz1.f.f115404a;
                        fg0.r eventTimeLocal6 = kVar3.getEventTimeLocal();
                        eventTimeLocal6.getClass();
                        aVar15.getClass();
                        DateTime dateTimeA = lz1.f.a.a(date3, eventTimeLocal6);
                        if (dateTimeD != null && dateTimeD.isAfter(dateTimeA)) {
                            TextView textView24 = aVar.f45758v;
                            if (textView24 == null) {
                                p005kotlin.jvm.internal.s.m("mTextViewCountdown");
                                throw null;
                            }
                            textView24.setText(aVar.getString(R.string.lbl_pacepro_event_date));
                        }
                        if (dateTimeD == null || dateTimeA == null) {
                            TextView textView25 = aVar.f45758v;
                            if (textView25 == null) {
                                p005kotlin.jvm.internal.s.m("mTextViewCountdown");
                                throw null;
                            }
                            textView25.setText(aVar.getString(R.string.lbl_pacepro_event_date));
                            TextView textView26 = aVar.f45744g;
                            if (textView26 == null) {
                                p005kotlin.jvm.internal.s.m("mCountDown");
                                throw null;
                            }
                            textView26.setText(dateTimeA != null ? dateTimeA.toString("MMM dd, yyyy") : null);
                        } else {
                            Context contextRequireContext3 = aVar.requireContext();
                            contextRequireContext3.getClass();
                            o13.p pVarK = lz1.f.a.k(contextRequireContext3, dateTimeD, dateTimeA);
                            String str5 = (String) pVarK.f128594a;
                            String str6 = (String) pVarK.f128595b;
                            TextView textView27 = aVar.f45744g;
                            if (textView27 == null) {
                                p005kotlin.jvm.internal.s.m("mCountDown");
                                throw null;
                            }
                            textView27.setText(str5);
                            if (str6.length() > 0) {
                                TextView textView28 = aVar.f45744g;
                                if (textView28 == null) {
                                    p005kotlin.jvm.internal.s.m("mCountDown");
                                    throw null;
                                }
                                textView28.setContentDescription(str6);
                            }
                        }
                    } else {
                        lz1.f.a aVar16 = lz1.f.f115404a;
                        LocalDate localDateNow2 = LocalDate.now();
                        localDateNow2.getClass();
                        Context contextRequireContext4 = aVar.requireContext();
                        contextRequireContext4.getClass();
                        aVar16.getClass();
                        o13.p pVarL2 = lz1.f.a.l(contextRequireContext4, localDateNow2, date3);
                        str = (String) pVarL2.f128594a;
                        str2 = (String) pVarL2.f128595b;
                        textView5 = aVar.f45744g;
                        if (textView5 != null) {
                            p005kotlin.jvm.internal.s.m("mCountDown");
                            throw null;
                        }
                        textView5.setText(str);
                        if (!date3.isAfter(LocalDate.now())) {
                            textView7 = aVar.f45758v;
                            if (textView7 != null) {
                                p005kotlin.jvm.internal.s.m("mTextViewCountdown");
                                throw null;
                            }
                            textView7.setText(aVar.getString(R.string.lbl_pacepro_event_date));
                        }
                        if (str2.length() > 0) {
                            textView6 = aVar.f45744g;
                            if (textView6 != null) {
                                p005kotlin.jvm.internal.s.m("mCountDown");
                                throw null;
                            }
                            textView6.setContentDescription(str2);
                        }
                    }
                }
            }
            List<fg0.a0> listS = kVar3.s();
            String url = (listS == null || (a0Var = (fg0.a0) p13.h0.d0(listS)) == null) ? null : a0Var.getUrl();
            zp0.c cVar = new zp0.c(aVar);
            cVar.f206565e = url;
            cVar.f206570j = R.drawable.gcm3_calendar_list_icon_events;
            cVar.a("circle_mask");
            ImageView imageView = aVar.f45762z;
            if (imageView == null) {
                p005kotlin.jvm.internal.s.m("mProfileImageView");
                throw null;
            }
            cVar.h(imageView);
            Unit unit9 = Unit.INSTANCE;
            fg0.c eventPrivacy = kVar3.getEventPrivacy();
            if (eventPrivacy != null ? p005kotlin.jvm.internal.s.g(eventPrivacy.getIsShareable(), Boolean.TRUE) : false) {
                String shareableEventUuid = kVar3.getShareableEventUuid();
                aVar.T = shareableEventUuid;
                if (g22.n.d(shareableEventUuid)) {
                    ImageView imageView2 = aVar.A;
                    if (imageView2 == null) {
                        p005kotlin.jvm.internal.s.m(str3);
                        throw null;
                    }
                    imageView2.setVisibility(0);
                }
            } else {
                aVar.T = String.valueOf(kVar3.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String());
            }
            if (aVar.N0 && (kVar3.getSubscribed() == null || p005kotlin.jvm.internal.s.g(kVar3.getSubscribed(), Boolean.FALSE))) {
                aVar.P0 = true;
                aVar.requireActivity().invalidateOptionsMenu();
                if (aVar.z6().w5()) {
                    FrameLayout frameLayout5 = aVar.B;
                    if (frameLayout5 == null) {
                        p005kotlin.jvm.internal.s.m("mSaveButtonView");
                        throw null;
                    }
                    frameLayout5.setVisibility(0);
                    ImageView imageView3 = aVar.A;
                    if (imageView3 == null) {
                        p005kotlin.jvm.internal.s.m(str3);
                        throw null;
                    }
                    i17 = 8;
                    imageView3.setVisibility(8);
                } else {
                    i17 = 8;
                }
                TabLayout tabLayout4 = aVar.f45740c;
                if (tabLayout4 == null) {
                    p005kotlin.jvm.internal.s.m("mTabLayout");
                    throw null;
                }
                tabLayout4.setVisibility(i17);
                ViewPager viewPager8 = aVar.f45741d;
                if (viewPager8 == null) {
                    p005kotlin.jvm.internal.s.m("mViewPager");
                    throw null;
                }
                viewPager8.e();
                i14 = 0;
            } else {
                Boolean bool = aVar.z6().f204393j;
                Boolean bool2 = Boolean.TRUE;
                if (p005kotlin.jvm.internal.s.g(bool, bool2)) {
                    aVar.P0 = true;
                    aVar.requireActivity().invalidateOptionsMenu();
                }
                if (p005kotlin.jvm.internal.s.g(kVar3.getEventOrganizer(), bool2) || p005kotlin.jvm.internal.s.g(kVar3.getSubscribed(), bool2)) {
                    i14 = 0;
                    FrameLayout frameLayout6 = aVar.B;
                    if (frameLayout6 == null) {
                        p005kotlin.jvm.internal.s.m("mSaveButtonView");
                        throw null;
                    }
                    mz1.e0 e0VarZ7 = aVar.z6();
                    v22.e.v(frameLayout6, p005kotlin.jvm.internal.s.g(e0VarZ7.f204393j, bool2) || (e0VarZ7.f204395l && aVar.N0));
                    aVar.M0 = true;
                } else {
                    LocalDate localDate = new DateTime().toLocalDate();
                    LocalDate date4 = kVar3.getDate();
                    if (date4 != null) {
                        z15 = true;
                        z16 = date4.isEqual(localDate);
                        if (z16) {
                            i14 = 0;
                            frameLayout = aVar.B;
                            if (frameLayout != null) {
                                p005kotlin.jvm.internal.s.m("mSaveButtonView");
                                throw null;
                            }
                            frameLayout.setVisibility(0);
                            tabLayout = aVar.f45740c;
                            if (tabLayout != null) {
                                p005kotlin.jvm.internal.s.m("mTabLayout");
                                throw null;
                            }
                            tabLayout.setVisibility(8);
                            aVar.M0 = false;
                            viewPager = aVar.f45741d;
                            if (viewPager != null) {
                                p005kotlin.jvm.internal.s.m("mViewPager");
                                throw null;
                            }
                            viewPager.e();
                        } else {
                            date = kVar3.getDate();
                            if (date == null && date.isAfter(localDate) == z15) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (z17) {
                                i14 = 0;
                                frameLayout = aVar.B;
                                if (frameLayout != null) {
                                    p005kotlin.jvm.internal.s.m("mSaveButtonView");
                                    throw null;
                                }
                                frameLayout.setVisibility(0);
                                tabLayout = aVar.f45740c;
                                if (tabLayout != null) {
                                    p005kotlin.jvm.internal.s.m("mTabLayout");
                                    throw null;
                                }
                                tabLayout.setVisibility(8);
                                aVar.M0 = false;
                                viewPager = aVar.f45741d;
                                if (viewPager != null) {
                                    p005kotlin.jvm.internal.s.m("mViewPager");
                                    throw null;
                                }
                                viewPager.e();
                            } else {
                                frameLayout2 = aVar.B;
                                if (frameLayout2 != null) {
                                    p005kotlin.jvm.internal.s.m("mSaveButtonView");
                                    throw null;
                                }
                                frameLayout2.setVisibility(8);
                                tabLayout2 = aVar.f45740c;
                                if (tabLayout2 != null) {
                                    p005kotlin.jvm.internal.s.m("mTabLayout");
                                    throw null;
                                }
                                tabLayout2.setVisibility(8);
                                viewPager2 = aVar.f45741d;
                                if (viewPager2 != null) {
                                    p005kotlin.jvm.internal.s.m("mViewPager");
                                    throw null;
                                }
                                viewPager2.e();
                                i14 = 0;
                                aVar.M0 = false;
                            }
                        }
                    } else {
                        z15 = true;
                    }
                    if (z16) {
                        i14 = 0;
                        frameLayout = aVar.B;
                        if (frameLayout != null) {
                            p005kotlin.jvm.internal.s.m("mSaveButtonView");
                            throw null;
                        }
                        frameLayout.setVisibility(0);
                        tabLayout = aVar.f45740c;
                        if (tabLayout != null) {
                            p005kotlin.jvm.internal.s.m("mTabLayout");
                            throw null;
                        }
                        tabLayout.setVisibility(8);
                        aVar.M0 = false;
                        viewPager = aVar.f45741d;
                        if (viewPager != null) {
                            p005kotlin.jvm.internal.s.m("mViewPager");
                            throw null;
                        }
                        viewPager.e();
                    } else {
                        date = kVar3.getDate();
                        if (date == null) {
                            z17 = false;
                        } else {
                            z17 = false;
                        }
                        if (z17) {
                            i14 = 0;
                            frameLayout = aVar.B;
                            if (frameLayout != null) {
                                p005kotlin.jvm.internal.s.m("mSaveButtonView");
                                throw null;
                            }
                            frameLayout.setVisibility(0);
                            tabLayout = aVar.f45740c;
                            if (tabLayout != null) {
                                p005kotlin.jvm.internal.s.m("mTabLayout");
                                throw null;
                            }
                            tabLayout.setVisibility(8);
                            aVar.M0 = false;
                            viewPager = aVar.f45741d;
                            if (viewPager != null) {
                                p005kotlin.jvm.internal.s.m("mViewPager");
                                throw null;
                            }
                            viewPager.e();
                        } else {
                            frameLayout2 = aVar.B;
                            if (frameLayout2 != null) {
                                p005kotlin.jvm.internal.s.m("mSaveButtonView");
                                throw null;
                            }
                            frameLayout2.setVisibility(8);
                            tabLayout2 = aVar.f45740c;
                            if (tabLayout2 != null) {
                                p005kotlin.jvm.internal.s.m("mTabLayout");
                                throw null;
                            }
                            tabLayout2.setVisibility(8);
                            viewPager2 = aVar.f45741d;
                            if (viewPager2 != null) {
                                p005kotlin.jvm.internal.s.m("mViewPager");
                                throw null;
                            }
                            viewPager2.e();
                            i14 = 0;
                            aVar.M0 = false;
                        }
                    }
                }
            }
            TextView textView29 = aVar.D;
            if (textView29 == null) {
                p005kotlin.jvm.internal.s.m("mViewActivity");
                throw null;
            }
            fg0.j eventCustomization9 = kVar3.getEventCustomization();
            textView29.setVisibility((eventCustomization9 != null ? eventCustomization9.getAssociatedWithActivityId() : null) == null ? 8 : i14);
            if (p005kotlin.jvm.internal.s.g(aVar.z6().f204393j, Boolean.TRUE)) {
                TabLayout tabLayout5 = aVar.f45740c;
                if (tabLayout5 == null) {
                    p005kotlin.jvm.internal.s.m("mTabLayout");
                    throw null;
                }
                tabLayout5.setVisibility(8);
            } else if (aVar.N0) {
                TabLayout tabLayout6 = aVar.f45740c;
                if (tabLayout6 == null) {
                    p005kotlin.jvm.internal.s.m("mTabLayout");
                    throw null;
                }
                tabLayout6.setVisibility(8);
            } else {
                if (aVar.z6().z5()) {
                    aVar.z6();
                    V0 = bo1.a.a().c().V0();
                } else {
                    gg0.f eventType3 = kVar3.getEventType();
                    if (eventType3 == null) {
                        V0 = i14;
                    } else {
                        if (((eventType3.e() || eventType3.f() || eventType3 == gg0.f.f77137m) ? 1 : i14) == 1) {
                            V0 = 1;
                        } else {
                            V0 = i14;
                        }
                    }
                }
                TabLayout tabLayout7 = aVar.f45740c;
                if (tabLayout7 == null) {
                    p005kotlin.jvm.internal.s.m("mTabLayout");
                    throw null;
                }
                if (V0 == 0) {
                    r14 = i14;
                } else {
                    gg0.f eventType4 = kVar3.getEventType();
                    if (eventType4 == null) {
                        i16 = i14;
                    } else {
                        if (((eventType4.e() || eventType4.f() || eventType4 == gg0.f.f77137m) ? 1 : i14) == 1) {
                            i16 = 1;
                        } else {
                            i16 = i14;
                        }
                    }
                    if (i16 != 0) {
                        r14 = 1;
                    } else {
                        r14 = i14;
                    }
                }
                v22.e.v(tabLayout7, r14);
            }
            if (g22.n.d(kVar3.getProvider())) {
                LinearLayout linearLayout13 = aVar.F;
                if (linearLayout13 == null) {
                    p005kotlin.jvm.internal.s.m("mProviderLayout");
                    throw null;
                }
                if ((linearLayout13.getVisibility() == 0 ? 1 : i14) == 0) {
                    String provider = kVar3.getProvider();
                    provider.getClass();
                    aVar.w6(provider, kVar3);
                }
            }
        } else {
            str3 = "mShareImageView";
            i14 = 0;
        }
        if (aVar.N0) {
            String str7 = aVar.T;
            if (((str7 == null || str7.length() == 0) ? 1 : i14) != 0) {
                ImageView imageView4 = aVar.A;
                if (imageView4 == null) {
                    p005kotlin.jvm.internal.s.m(str3);
                    throw null;
                }
                imageView4.setVisibility(8);
            }
        }
        fg0.k kVar5 = aVar.K0;
        if (kVar5 == null || (eventCustomization3 = kVar5.getEventCustomization()) == null) {
            i15 = i14;
        } else {
            if (((eventCustomization3.t() || eventCustomization3.z() || eventCustomization3.u()) ? 1 : i14) == 1) {
                i15 = 1;
            } else {
                i15 = i14;
            }
        }
        if (i15 != 0) {
            mz1.e0 e0VarZ8 = aVar.z6();
            fg0.k kVar6 = aVar.K0;
            long jLongValue = (kVar6 == null || (eventCustomization2 = kVar6.getEventCustomization()) == null || (trainingPlanId = eventCustomization2.getTrainingPlanId()) == null) ? -1L : trainingPlanId.longValue();
            fg0.k kVar7 = aVar.K0;
            if (kVar7 == null || (eventCustomization = kVar7.getEventCustomization()) == null || (trainingPlanType = eventCustomization.getTrainingPlanType()) == null) {
                trainingPlanType = gg0.e.STATIC;
            }
            trainingPlanType.getClass();
            int i24 = mz1.e0.b.f121707b[trainingPlanType.ordinal()];
            if (i24 == 1) {
                ge1.b.T(androidx.lifecycle.v1.a(e0VarZ8), null, null, new mz1.r0(e0VarZ8, jLongValue, null), 3);
            } else if (i24 == 2) {
                ge1.b.T(androidx.lifecycle.v1.a(e0VarZ8), null, null, new mz1.u0(e0VarZ8, jLongValue, null), 3);
            } else if (i24 == 3 && ((xVar = e0VarZ8.f204394k) == null || (dVar = xVar.f71372h) == null || dVar.getAthletePlanId() != jLongValue)) {
                ge1.b.T(androidx.lifecycle.v1.a(e0VarZ8), null, null, new mz1.n0(e0VarZ8, jLongValue, null), 3);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:153:0x032e  */
    /* JADX WARN: Code duplicated, block: B:172:0x0377  */
    /* JADX WARN: Code duplicated, block: B:174:0x037b  */
    /* JADX WARN: Code duplicated, block: B:188:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:191:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:361:0x067b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.l
    public final Object invoke(Object obj) {
        Unit unit;
        xw1.d dVar;
        h42.c cVar;
        Integer numValueOf;
        Integer numValueOf2;
        double dE;
        gg0.f eventType;
        String shareableEventUuid;
        fg0.k kVar;
        fg0.k kVar2;
        fg0.j eventCustomization;
        fg0.j eventCustomization2;
        Long trainingPlanId;
        fg0.j eventCustomization3;
        fg0.j eventCustomization4;
        Long trainingPlanId2;
        xw1.k kVar3;
        String str;
        LocalDate date;
        androidx.fragment.app.m activity;
        xw1.k kVar4;
        int i14 = this.f167120a;
        String str2 = "";
        int i15 = 10;
        boolean z14 = true;
        boolean z15 = false;
        raceTitle = null;
        String raceTitle = null;
        com.garmin.android.apps.connectmobile.traininginitiative.ui.a aVar = this.f167121b;
        switch (i14) {
            case 0:
                o13.p pVar = (o13.p) obj;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a.C0883a c0883a = com.garmin.android.apps.connectmobile.traininginitiative.ui.a.T0;
                fg0.x xVar = aVar.z6().f204394k;
                if (xVar != null ? p005kotlin.jvm.internal.s.g(xVar.f71374j, Boolean.TRUE) : false) {
                    Context context = aVar.getContext();
                    if (context == null) {
                        g22.e.a(aVar, null);
                    } else {
                        fg0.x xVar2 = aVar.z6().f204394k;
                        Long lValueOf = (xVar2 == null || (dVar = xVar2.f71372h) == null) ? null : Long.valueOf(dVar.getAthletePlanId());
                        if (lValueOf != null) {
                            long jLongValue = lValueOf.longValue();
                            xw1.n nVar = new xw1.n(null, aVar.K0, null, true, 5, null);
                            xw1.n nVarB = aVar.N0 ? xw1.n.b(nVar, zf0.y0.EVENT_SEARCH, null, aVar.z6().I, 10) : xw1.n.b(nVar, zf0.y0.USER_CALENDAR_EVENT, null, null, 14);
                            androidx.fragment.app.m activity2 = aVar.getActivity();
                            if (activity2 != null) {
                                activity2.setResult(-1, new Intent().putExtra("extra_event_dashboard_refresh_needed", true));
                            }
                            androidx.fragment.app.m activity3 = aVar.getActivity();
                            if (activity3 != null) {
                                activity3.finish();
                            }
                            ((jy1.b) KoinJavaComponent.get$default(jy1.b.class, null, null, 6, null)).r(context, jLongValue, nVarB);
                            unit = Unit.INSTANCE;
                        } else {
                            unit = null;
                        }
                        if (unit == null) {
                            g22.e.a(aVar, null);
                        }
                    }
                } else {
                    int iIntValue = ((Number) pVar.f128594a).intValue();
                    Intent intent = (Intent) pVar.f128595b;
                    androidx.fragment.app.m activity4 = aVar.getActivity();
                    if (activity4 != null) {
                        activity4.setResult(iIntValue, intent);
                        activity4.finish();
                    }
                }
                return Unit.INSTANCE;
            case 1:
                h42.b bVar = (h42.b) obj;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a.C0883a c0883a2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.a.T0;
                if (bVar != null) {
                    h42.d historical = bVar.getHistorical();
                    if (historical != null) {
                        h42.f average = historical.getAverage();
                        aVar.y6(new h42.a(average != null ? average.getValue() : null, null, null, 6, null), true);
                    } else {
                        List<h42.c> listB = bVar.b();
                        if (listB != null && (cVar = listB.get(0)) != null) {
                            Integer icon = cVar.getIcon();
                            if (icon != null) {
                                int iIntValue2 = icon.intValue();
                                qs.b0.f147008d.getClass();
                                qs.b0 b0VarA = qs.b0.a.a(iIntValue2);
                                numValueOf = b0VarA != null ? Integer.valueOf(b0VarA.f147029b) : null;
                            } else {
                                numValueOf = null;
                            }
                            h42.f temp = cVar.getTemp();
                            aVar.y6(new h42.a(temp != null ? temp.getValue() : null, numValueOf, null, 4, null), false);
                        }
                    }
                }
                return Unit.INSTANCE;
            case 2:
                h42.e eVar = (h42.e) obj;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a.C0883a c0883a3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.a.T0;
                if (eVar != null) {
                    Integer icon2 = eVar.getIcon();
                    if (icon2 != null) {
                        int iIntValue3 = icon2.intValue();
                        qs.b0.f147008d.getClass();
                        qs.b0 b0VarA2 = qs.b0.a.a(iIntValue3);
                        numValueOf2 = b0VarA2 != null ? Integer.valueOf(b0VarA2.f147029b) : null;
                    } else {
                        numValueOf2 = null;
                    }
                    h42.f temperature = eVar.getTemperature();
                    aVar.y6(new h42.a(temperature != null ? temperature.getValue() : null, numValueOf2, null, 4, null), true);
                }
                return Unit.INSTANCE;
            case 3:
                ps.b2 b2Var = (ps.b2) obj;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a.C0883a c0883a4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.a.T0;
                if (b2Var != null) {
                    qs.b0.a aVar2 = qs.b0.f147008d;
                    ps.d2 weatherType = b2Var.getWeatherType();
                    String description = weatherType != null ? weatherType.getDescription() : null;
                    aVar2.getClass();
                    qs.b0 b0VarB = qs.b0.a.b(description);
                    Integer numValueOf3 = b0VarB != null ? Integer.valueOf(b0VarB.f147029b) : null;
                    Double temp2 = b2Var.getTemp();
                    if (temp2 != null) {
                        double dDoubleValue = temp2.doubleValue();
                        l3.f23124b.getClass();
                        dE = l3.a.e(dDoubleValue);
                    } else {
                        dE = 0.0d;
                    }
                    aVar.y6(new h42.a(Double.valueOf(dE), numValueOf3, null, 4, null), false);
                }
                return Unit.INSTANCE;
            case 4:
                return a(obj);
            case 5:
                Boolean bool = (Boolean) obj;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a.C0883a c0883a5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.a.T0;
                if (bool != null) {
                    boolean zBooleanValue = bool.booleanValue();
                    FrameLayout frameLayout = aVar.f45752n;
                    if (frameLayout == null) {
                        p005kotlin.jvm.internal.s.m("mMapContainer");
                        throw null;
                    }
                    v22.e.v(frameLayout, zBooleanValue);
                }
                return Unit.INSTANCE;
            case 6:
                g3 g3Var = (g3) obj;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a.C0883a c0883a6 = com.garmin.android.apps.connectmobile.traininginitiative.ui.a.T0;
                fw.p pVar2 = g3Var.f35300a;
                T t7 = g3Var.f35301b;
                int i16 = com.garmin.android.apps.connectmobile.traininginitiative.ui.a.c.f45768a[pVar2.ordinal()];
                if (i16 == 1) {
                    g22.e.f(aVar);
                    o13.p pVar3 = (o13.p) t7;
                    if (pVar3 != null && ((Boolean) pVar3.f128594a).booleanValue() && !aVar.z6().S0) {
                        FrameLayout frameLayout2 = aVar.B;
                        if (frameLayout2 == null) {
                            p005kotlin.jvm.internal.s.m("mSaveButtonView");
                            throw null;
                        }
                        frameLayout2.setVisibility(8);
                        TabLayout tabLayout = aVar.f45740c;
                        if (tabLayout == null) {
                            p005kotlin.jvm.internal.s.m("mTabLayout");
                            throw null;
                        }
                        tabLayout.setVisibility(0);
                        aVar.O0 = true;
                        fg0.k kVar5 = (fg0.k) pVar3.f128595b;
                        if (kVar5 != null) {
                            aVar.K0 = kVar5;
                        }
                        if (g22.n.d(aVar.T)) {
                            ImageView imageView = aVar.A;
                            if (imageView == null) {
                                p005kotlin.jvm.internal.s.m("mShareImageView");
                                throw null;
                            }
                            imageView.setVisibility(0);
                        }
                        ViewPager viewPager = aVar.f45741d;
                        if (viewPager == null) {
                            p005kotlin.jvm.internal.s.m("mViewPager");
                            throw null;
                        }
                        if (viewPager.L0) {
                            try {
                                viewPager.k();
                            } catch (NullPointerException unused) {
                                com.garmin.android.apps.connectmobile.i2.a aVar3 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                aVar3.getClass();
                                com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "EventDetailsFragment", "addCalendarLiveData: NPE occurred for mViewPager.endFakeDrag()");
                            }
                        }
                        if (aVar.N0) {
                            fg0.k kVar6 = aVar.K0;
                            if (kVar6 != null) {
                                kVar6.j1();
                            }
                            aVar.N0 = false;
                            aVar.P0 = false;
                            aVar.requireActivity().invalidateOptionsMenu();
                        }
                        fg0.k kVar7 = aVar.K0;
                        if (kVar7 != null && (shareableEventUuid = kVar7.getShareableEventUuid()) != null) {
                            EventDetailsActivity.f45692o.getClass();
                            EventDetailsActivity eventDetailsActivity = EventDetailsActivity.f45693p;
                            if (eventDetailsActivity == null) {
                                p005kotlin.jvm.internal.s.m("instance");
                                throw null;
                            }
                            CalendarItemDTO calendarItemDTO = eventDetailsActivity.f45695d;
                            if (calendarItemDTO != null) {
                                calendarItemDTO.H1 = shareableEventUuid;
                            }
                            if (calendarItemDTO != null) {
                                calendarItemDTO.I1 = true;
                            }
                        }
                        aVar.z6().E5(aVar.K0);
                        fg0.k kVar8 = aVar.K0;
                        if (kVar8 != null && (eventType = kVar8.getEventType()) != null && eventType.d()) {
                            ge1.b.T(o53.f0.w(aVar), null, null, new l(aVar, kVar8, null), 3);
                        }
                        aVar.z6().S0 = true;
                    }
                    break;
                } else if (i16 == 2) {
                    g22.e.l(aVar);
                } else {
                    if (i16 != 3) {
                        lc.u0.r();
                        return null;
                    }
                    g22.e.f(aVar);
                    g22.e.a(aVar, new fw.r());
                }
                return Unit.INSTANCE;
            case 7:
                aVar.L0 = (com.garmin.android.apps.connectmobile.courses.model.e) obj;
                return Unit.INSTANCE;
            case 8:
                g3 g3Var2 = (g3) obj;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a aVar4 = this.f167121b;
                fg0.k kVar9 = aVar4.K0;
                if (kVar9 != null && (date = kVar9.getDate()) != null) {
                    aVar4.z6();
                    if (zf0.j0.T4(date)) {
                        ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).T3(true);
                    }
                }
                if (g3Var2 != null) {
                    T t14 = g3Var2.f35301b;
                    aVar4.z6().f121693n1 = null;
                    int i17 = com.garmin.android.apps.connectmobile.traininginitiative.ui.a.c.f45768a[g3Var2.f35300a.ordinal()];
                    if (i17 == 1) {
                        g22.e.f(aVar4);
                        mz1.e0 e0VarZ6 = aVar4.z6();
                        fg0.k kVar10 = aVar4.K0;
                        fg0.x xVar3 = e0VarZ6.f204394k;
                        if (xVar3 == null || (kVar3 = xVar3.f71373i) == null) {
                            kVar = aVar4.K0;
                            if (kVar == null && (eventCustomization3 = kVar.getEventCustomization()) != null && eventCustomization3.z()) {
                                fg0.k kVar11 = aVar4.K0;
                                if (kVar11 != null && (eventCustomization4 = kVar11.getEventCustomization()) != null && (trainingPlanId2 = eventCustomization4.getTrainingPlanId()) != null) {
                                    long jLongValue2 = trainingPlanId2.longValue();
                                    Context context2 = aVar4.getContext();
                                    if (context2 != null) {
                                        androidx.fragment.app.v childFragmentManager = aVar4.getChildFragmentManager();
                                        childFragmentManager.getClass();
                                        lz1.e.e(context2, childFragmentManager, aVar4.z6().f204400q, t14 == gg0.d.DELETED, new c31.e(aVar4, jLongValue2, g3Var2, 7));
                                    }
                                }
                            } else {
                                kVar2 = aVar4.K0;
                                if (kVar2 == null && (eventCustomization = kVar2.getEventCustomization()) != null && eventCustomization.u()) {
                                    fg0.k kVar12 = aVar4.K0;
                                    if (kVar12 != null && (eventCustomization2 = kVar12.getEventCustomization()) != null && (trainingPlanId = eventCustomization2.getTrainingPlanId()) != null) {
                                        long jLongValue3 = trainingPlanId.longValue();
                                        mz1.e0 e0VarZ7 = aVar4.z6();
                                        gg0.d dVar2 = (gg0.d) t14;
                                        if (dVar2 == null) {
                                            dVar2 = gg0.d.DELETED;
                                        }
                                        e0VarZ7.R4(jLongValue3, false, dVar2);
                                    }
                                } else {
                                    aVar4.A6(t14 == gg0.d.DELETED, false);
                                }
                            }
                        } else if (kVar3.j(kVar10 != null ? kVar10.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() : null, kVar10 != null ? kVar10.getShareableEventUuid() : null)) {
                            mz1.e0 e0VarZ8 = aVar4.z6();
                            fg0.x xVar4 = e0VarZ8.f204394k;
                            e0VarZ8.f204394k = xVar4 != null ? fg0.x.b(xVar4, null, null, null, null, null, null, null, null, 767) : null;
                            Context context3 = aVar4.getContext();
                            if (context3 != null) {
                                fg0.x xVar5 = aVar4.z6().f204394k;
                                if (xVar5 != null && (str = xVar5.f71366b) != null) {
                                    str2 = str;
                                }
                                lz1.e.d(context3, str2, t14 == gg0.d.DELETED, new sy.i(24, aVar4, g3Var2));
                            }
                        } else {
                            kVar = aVar4.K0;
                            if (kVar == null) {
                                kVar2 = aVar4.K0;
                                if (kVar2 == null) {
                                    aVar4.A6(t14 == gg0.d.DELETED, false);
                                } else {
                                    aVar4.A6(t14 == gg0.d.DELETED, false);
                                }
                            } else {
                                kVar2 = aVar4.K0;
                                if (kVar2 == null) {
                                    aVar4.A6(t14 == gg0.d.DELETED, false);
                                } else {
                                    aVar4.A6(t14 == gg0.d.DELETED, false);
                                }
                            }
                        }
                    } else if (i17 == 2) {
                        g22.e.l(aVar4);
                    } else {
                        if (i17 != 3) {
                            lc.u0.r();
                            return null;
                        }
                        g22.e.f(aVar4);
                        g22.e.a(aVar4, null);
                    }
                }
                return Unit.INSTANCE;
            case 9:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a.C0883a c0883a7 = com.garmin.android.apps.connectmobile.traininginitiative.ui.a.T0;
                aVar.z6().C5(aVar.N0, bool2);
                return Unit.INSTANCE;
            case 10:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a.C0883a c0883a8 = com.garmin.android.apps.connectmobile.traininginitiative.ui.a.T0;
                if (zBooleanValue2) {
                    fg0.u uVar = aVar.z6().f204397n;
                    if (uVar == null || !uVar.f71350b) {
                        aVar.z6().F5(aVar.N0);
                    } else {
                        aVar.z6().f204406y.m(new w61.f<>(new o13.p(Integer.valueOf(R.string.set_as_primary), "")));
                    }
                }
                return Unit.INSTANCE;
            case 11:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a.C0883a c0883a9 = com.garmin.android.apps.connectmobile.traininginitiative.ui.a.T0;
                if (zBooleanValue3) {
                    aVar.z6().F5(aVar.N0);
                }
                return Unit.INSTANCE;
            case 12:
                g3 g3Var3 = (g3) obj;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a.C0883a c0883a10 = com.garmin.android.apps.connectmobile.traininginitiative.ui.a.T0;
                int i18 = com.garmin.android.apps.connectmobile.traininginitiative.ui.a.c.f45768a[g3Var3.f35300a.ordinal()];
                if (i18 == 1) {
                    g22.e.f(aVar);
                    aVar.A6(g3Var3.f35301b == gg0.d.DELETED, true);
                } else if (i18 == 2) {
                    g22.e.l(aVar);
                } else {
                    if (i18 != 3) {
                        lc.u0.r();
                        return null;
                    }
                    g22.e.f(aVar);
                }
                return Unit.INSTANCE;
            case 13:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a.C0883a c0883a11 = com.garmin.android.apps.connectmobile.traininginitiative.ui.a.T0;
                String str3 = (String) ((w61.f) obj).a();
                if (str3 != null) {
                    View viewRequireView = aVar.requireView();
                    viewRequireView.getClass();
                    String string = aVar.getString(R.string.event_added_to_calendar, str3);
                    string.getClass();
                    eg0.c.c(viewRequireView, string);
                }
                return Unit.INSTANCE;
            case 14:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a.C0883a c0883a12 = com.garmin.android.apps.connectmobile.traininginitiative.ui.a.T0;
                fg0.k kVarD = aVar.z6().k5().d();
                String provider = kVarD != null ? kVarD.getProvider() : null;
                if (g22.n.d(provider)) {
                    LinearLayout linearLayout = aVar.F;
                    if (linearLayout == null) {
                        p005kotlin.jvm.internal.s.m("mProviderLayout");
                        throw null;
                    }
                    if (linearLayout.getVisibility() != 0) {
                        provider.getClass();
                        aVar.w6(provider, aVar.z6().k5().d());
                    }
                }
                return Unit.INSTANCE;
            case 15:
                Boolean boolValueOf = (Boolean) obj;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a.C0883a c0883a13 = com.garmin.android.apps.connectmobile.traininginitiative.ui.a.T0;
                if (aVar.z6().z5()) {
                    aVar.z6();
                    boolValueOf = Boolean.valueOf(bo1.a.a().c().V0());
                }
                if (boolValueOf != null) {
                    TabLayout tabLayout2 = aVar.f45740c;
                    if (tabLayout2 == null) {
                        p005kotlin.jvm.internal.s.m("mTabLayout");
                        throw null;
                    }
                    v22.e.v(tabLayout2, boolValueOf.booleanValue() && !aVar.N0);
                }
                return Unit.INSTANCE;
            default:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a.C0883a c0883a14 = com.garmin.android.apps.connectmobile.traininginitiative.ui.a.T0;
                o13.p pVar4 = (o13.p) ((w61.f) obj).a();
                if ((pVar4 != null ? pVar4.f128594a : null) instanceof Integer) {
                    A a14 = pVar4.f128594a;
                    B b14 = pVar4.f128595b;
                    a14.getClass();
                    int iIntValue4 = ((Integer) a14).intValue();
                    if (iIntValue4 == R.string.event_goal_will_update) {
                        androidx.fragment.app.m activity5 = aVar.getActivity();
                        if (activity5 != null) {
                            A a15 = pVar4.f128594a;
                            a15.getClass();
                            String string2 = aVar.getString(((Integer) a15).intValue());
                            b14.getClass();
                            String str4 = (String) b14;
                            sg0.w0 w0Var = new sg0.w0(aVar, 26);
                            androidx.appcompat.app.e.a aVar5 = new androidx.appcompat.app.e.a(activity5);
                            if (g22.n.d(string2)) {
                                aVar5.setTitle(string2);
                            }
                            if (g22.n.d(str4)) {
                                aVar5.setMessage(str4);
                            }
                            aVar5.setCancelable(false);
                            aVar5.setPositiveButton(activity5.getString(R.string.lbl_ok), new kx0.f(w0Var, 6));
                            aVar5.create().show();
                        }
                    } else if (iIntValue4 == R.string.keep_my_event) {
                        androidx.fragment.app.m activity6 = aVar.getActivity();
                        if (activity6 != null) {
                            androidx.fragment.app.v childFragmentManager2 = aVar.getChildFragmentManager();
                            childFragmentManager2.getClass();
                            fg0.x xVar6 = aVar.z6().f204394k;
                            if (xVar6 != null && (kVar4 = xVar6.f71373i) != null) {
                                raceTitle = kVar4.getRaceTitle();
                            }
                            b14.getClass();
                            lz1.e.b(activity6, childFragmentManager2, raceTitle, ((Boolean) b14).booleanValue(), new h(aVar, 9));
                        }
                    } else if (iIntValue4 == R.string.user_created_event) {
                        androidx.fragment.app.m activity7 = aVar.getActivity();
                        if (activity7 != null) {
                            final h hVar = new h(aVar, i15);
                            androidx.appcompat.app.e.a aVar6 = new androidx.appcompat.app.e.a(activity7);
                            aVar6.setTitle(activity7.getString(R.string.user_created_event));
                            aVar6.setMessage(activity7.getString(R.string.user_created_event_warning_message));
                            aVar6.setCancelable(false);
                            final int i19 = z15 ? 1 : 0;
                            aVar6.setPositiveButton(R.string.lbl_common_continue, new DialogInterface.OnClickListener(hVar) { // from class: lz1.c

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ h f115401b;

                                {
                                    this.f115401b = hVar;
                                }

                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i24) {
                                    switch (i19) {
                                        case 0:
                                            this.f115401b.invoke(Boolean.TRUE);
                                            dialogInterface.dismiss();
                                            break;
                                        default:
                                            this.f115401b.invoke(Boolean.FALSE);
                                            dialogInterface.dismiss();
                                            break;
                                    }
                                }
                            });
                            final int i24 = z14 ? 1 : 0;
                            aVar6.setNegativeButton(R.string.lbl_cancel, new DialogInterface.OnClickListener(hVar) { // from class: lz1.c

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ h f115401b;

                                {
                                    this.f115401b = hVar;
                                }

                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i25) {
                                    switch (i24) {
                                        case 0:
                                            this.f115401b.invoke(Boolean.TRUE);
                                            dialogInterface.dismiss();
                                            break;
                                        default:
                                            this.f115401b.invoke(Boolean.FALSE);
                                            dialogInterface.dismiss();
                                            break;
                                    }
                                }
                            });
                            aVar6.create().show();
                        }
                    } else if (iIntValue4 == R.string.set_as_primary && (activity = aVar.getActivity()) != null) {
                        lz1.e.c(activity, new h(aVar, 11));
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
