package ty1;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import i3.e5;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class n implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.c f167191b;

    public /* synthetic */ n(com.garmin.android.apps.connectmobile.traininginitiative.ui.c cVar, int i14) {
        this.f167190a = i14;
        this.f167191b = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:14:0x0034  */
    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:207:0x0389  */
    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX WARN: Code duplicated, block: B:23:0x004b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) throws Throwable {
        Throwable th3;
        int i14;
        String string;
        bg0.a.b bVarB;
        bg0.a.b bVarA;
        bg0.a.b bVarA2;
        Double value;
        Double value2;
        Double value3;
        gg0.i unit;
        gg0.i unit2;
        gg0.i unit3;
        String displayName;
        fg0.r eventTimeLocal;
        String timeZoneId;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        TextView textView;
        int i15 = this.f167190a;
        com.garmin.android.apps.connectmobile.traininginitiative.ui.c cVar = this.f167191b;
        switch (i15) {
            case 0:
                fg0.k kVar = (fg0.k) obj;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.c.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.c.T;
                if (kVar != null) {
                    gg0.f eventType = kVar.getEventType();
                    if (eventType != null) {
                        Context contextRequireContext = cVar.requireContext();
                        contextRequireContext.getClass();
                        String strA = eventType.a(contextRequireContext);
                        TextView textView2 = cVar.f45861c;
                        if (textView2 == null) {
                            p005kotlin.jvm.internal.s.m("mEventType");
                            throw null;
                        }
                        textView2.setText(strA);
                    } else {
                        LinearLayout linearLayout3 = cVar.f45879w;
                        if (linearLayout3 == null) {
                            p005kotlin.jvm.internal.s.m("mEventTypeLayout");
                            throw null;
                        }
                        linearLayout3.setVisibility(8);
                    }
                    LocalDateTime localDateTime = DateTimeFormat.forPattern("yyyy-MM-dd").parseLocalDateTime(String.valueOf(kVar.getDate()));
                    localDateTime.getClass();
                    DateTime dateTimeR = g22.k.r(localDateTime);
                    TextView textView3 = cVar.f45862d;
                    if (textView3 == null) {
                        p005kotlin.jvm.internal.s.m("mDate");
                        throw null;
                    }
                    textView3.setText(c22.j0.a(dateTimeR, 'L'));
                    cVar.w6();
                    if (zf0.j0.Q4(kVar)) {
                        LinearLayout linearLayout4 = cVar.f45869k;
                        if (linearLayout4 == null) {
                            p005kotlin.jvm.internal.s.m("mTimeLayout");
                            throw null;
                        }
                        linearLayout4.setVisibility(0);
                        lz1.f.a aVar2 = lz1.f.f115404a;
                        fg0.r eventTimeLocal2 = kVar.getEventTimeLocal();
                        String startTimeHhMm = eventTimeLocal2 != null ? eventTimeLocal2.getStartTimeHhMm() : null;
                        startTimeHhMm.getClass();
                        aVar2.getClass();
                        String strG = new SimpleDateFormat("h:mm a", Locale.getDefault()).format(new SimpleDateFormat("HH:mm", Locale.getDefault()).parse(startTimeHhMm));
                        strG.getClass();
                        if (kVar.getLocationStartPoint() != null || (eventTimeLocal = kVar.getEventTimeLocal()) == null || (timeZoneId = eventTimeLocal.getTimeZoneId()) == null) {
                            displayName = null;
                        } else {
                            String[] availableIDs = TimeZone.getAvailableIDs();
                            availableIDs.getClass();
                            displayName = p13.u.z(availableIDs, timeZoneId) ? TimeZone.getTimeZone(timeZoneId).getDisplayName(true, 0) : null;
                            if (displayName == null) {
                                displayName = d53.u.v(timeZoneId, "_", StringUtils.SPACE, false);
                            }
                        }
                        TextView textView4 = cVar.f45863e;
                        if (textView4 == null) {
                            p005kotlin.jvm.internal.s.m("mStartTime");
                            throw null;
                        }
                        if (g22.n.d(displayName)) {
                            strG = e5.g(strG, StringUtils.SPACE, displayName);
                        }
                        textView4.setText(strG);
                    } else if (kVar.getEventOrganizer() == null || p005kotlin.jvm.internal.s.g(kVar.getEventOrganizer(), Boolean.FALSE)) {
                        LinearLayout linearLayout5 = cVar.f45869k;
                        if (linearLayout5 == null) {
                            p005kotlin.jvm.internal.s.m("mTimeLayout");
                            throw null;
                        }
                        linearLayout5.setVisibility(0);
                        TextView textView5 = cVar.f45863e;
                        if (textView5 == null) {
                            p005kotlin.jvm.internal.s.m("mStartTime");
                            throw null;
                        }
                        textView5.setText(cVar.getString(R.string.see_event_website_for_details));
                    }
                    String location = kVar.getLocation();
                    if (location == null || location.length() == 0) {
                        LinearLayout linearLayout6 = cVar.f45878v;
                        if (linearLayout6 == null) {
                            p005kotlin.jvm.internal.s.m("mLocationLayout");
                            throw null;
                        }
                        linearLayout6.setVisibility(8);
                    } else {
                        TextView textView6 = cVar.f45864f;
                        if (textView6 == null) {
                            p005kotlin.jvm.internal.s.m("mLocation");
                            throw null;
                        }
                        String location2 = kVar.getLocation();
                        if (location2 == null) {
                            location2 = "";
                        }
                        textView6.setText(location2);
                        LinearLayout linearLayout7 = cVar.f45878v;
                        if (linearLayout7 == null) {
                            p005kotlin.jvm.internal.s.m("mLocationLayout");
                            throw null;
                        }
                        linearLayout7.setVisibility(0);
                    }
                    if (cVar.w6().z5()) {
                        TextView textView7 = cVar.f45872n;
                        if (textView7 == null) {
                            p005kotlin.jvm.internal.s.m("mDistanceTitle");
                            throw null;
                        }
                        textView7.setText(cVar.getString(R.string.leg_distances));
                        TextView textView8 = cVar.f45873o;
                        if (textView8 == null) {
                            p005kotlin.jvm.internal.s.m("mDistanceText");
                            throw null;
                        }
                        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listH = kVar.h();
                        if (cVar.w6().z5()) {
                            cVar.w6();
                            com.garmin.android.apps.connectmobile.workouts.data.model.k kVarP5 = mz1.e0.p5(listH, m52.c.LAP_SWIMMING);
                            if (kVarP5 == null) {
                                cVar.w6();
                                kVarP5 = mz1.e0.p5(listH, m52.c.OPEN_WATER_SWIMMING);
                            }
                            if (kVarP5 == null) {
                                cVar.w6();
                                kVarP5 = mz1.e0.p5(listH, m52.c.SWIMMING);
                            }
                            cVar.w6();
                            th3 = null;
                            com.garmin.android.apps.connectmobile.workouts.data.model.k kVarP6 = mz1.e0.p5(listH, m52.c.CYCLING);
                            cVar.w6();
                            com.garmin.android.apps.connectmobile.workouts.data.model.k kVarP7 = mz1.e0.p5(listH, m52.c.RUNNING);
                            String string2 = cVar.getString(R.string.lbl_swim);
                            Double value4 = kVarP5 != null ? kVarP5.getValue() : null;
                            if (kVarP5 == null || (unit3 = kVarP5.getUnit()) == null || (bVarB = unit3.b()) == null) {
                                bVarB = bg0.a.b.METER;
                            }
                            bg0.a.c cVar2 = new bg0.a.c(value4, bVarB);
                            Context contextRequireContext2 = cVar.requireContext();
                            contextRequireContext2.getClass();
                            String strG2 = e5.g(string2, StringUtils.SPACE, bg0.a.c.a(cVar2, contextRequireContext2));
                            String string3 = cVar.getString(R.string.lbl_bike);
                            Double value5 = kVarP6 != null ? kVarP6.getValue() : null;
                            if (kVarP6 == null || (unit2 = kVarP6.getUnit()) == null || (bVarA = unit2.b()) == null) {
                                bg0.a.f17827a.getClass();
                                bVarA = bg0.a.C0255a.a();
                            }
                            bg0.a.c cVar3 = new bg0.a.c(value5, bVarA);
                            Context contextRequireContext3 = cVar.requireContext();
                            contextRequireContext3.getClass();
                            String strG3 = e5.g(string3, StringUtils.SPACE, bg0.a.c.a(cVar3, contextRequireContext3));
                            String string4 = cVar.getString(R.string.lbl_run);
                            Double value6 = kVarP7 != null ? kVarP7.getValue() : null;
                            if (kVarP7 == null || (unit = kVarP7.getUnit()) == null || (bVarA2 = unit.b()) == null) {
                                bg0.a.f17827a.getClass();
                                bVarA2 = bg0.a.C0255a.a();
                            }
                            bg0.a.c cVar4 = new bg0.a.c(value6, bVarA2);
                            Context contextRequireContext4 = cVar.requireContext();
                            contextRequireContext4.getClass();
                            String strG4 = e5.g(string4, StringUtils.SPACE, bg0.a.c.a(cVar4, contextRequireContext4));
                            if (((kVarP7 == null || (value3 = kVarP7.getValue()) == null) ? 0.0d : value3.doubleValue()) != 0.0d) {
                                if (((kVarP6 == null || (value2 = kVarP6.getValue()) == null) ? 0.0d : value2.doubleValue()) != 0.0d) {
                                    if (((kVarP5 == null || (value = kVarP5.getValue()) == null) ? 0.0d : value.doubleValue()) == 0.0d) {
                                        string = cVar.getString(R.string.enter_leg_distances);
                                        string.getClass();
                                    } else {
                                        p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                                        string = String.format("%s · %s · %s", Arrays.copyOf(new Object[]{strG2, strG3, strG4}, 3));
                                    }
                                } else {
                                    string = cVar.getString(R.string.enter_leg_distances);
                                    string.getClass();
                                }
                            } else {
                                string = cVar.getString(R.string.enter_leg_distances);
                                string.getClass();
                            }
                        } else {
                            th3 = null;
                            string = cVar.getString(R.string.enter_leg_distances);
                            string.getClass();
                        }
                        textView8.setText(string);
                        LinearLayout linearLayout8 = cVar.f45871m;
                        if (linearLayout8 == null) {
                            p005kotlin.jvm.internal.s.m("mDistanceLayout");
                            throw th3;
                        }
                        linearLayout8.setVisibility(0);
                    } else {
                        th3 = null;
                        LinearLayout linearLayout9 = cVar.f45871m;
                        if (linearLayout9 == null) {
                            p005kotlin.jvm.internal.s.m("mDistanceLayout");
                            throw null;
                        }
                        linearLayout9.setVisibility(8);
                    }
                    cVar.z6(kVar.getCourseName(), cVar.w6().h5().d());
                    String url = kVar.getUrl();
                    if (url == null) {
                        RelativeLayout relativeLayout = cVar.f45880x;
                        if (relativeLayout == null) {
                            p005kotlin.jvm.internal.s.m("mWebsiteLayout");
                            throw th3;
                        }
                        relativeLayout.setVisibility(8);
                    } else if (g22.n.d(url)) {
                        RelativeLayout relativeLayout2 = cVar.f45880x;
                        if (relativeLayout2 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsiteLayout");
                            throw th3;
                        }
                        relativeLayout2.setVisibility(0);
                        TextView textView9 = cVar.f45867i;
                        if (textView9 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsite");
                            throw th3;
                        }
                        v22.e.v(textView9, cVar.w6().K5());
                        TextView textView10 = cVar.f45867i;
                        if (textView10 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsite");
                            throw th3;
                        }
                        textView10.setText(url);
                        RelativeLayout relativeLayout3 = cVar.f45880x;
                        if (relativeLayout3 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsiteLayout");
                            throw th3;
                        }
                        relativeLayout3.setOnClickListener(new pm0.h(29, cVar, url));
                    }
                    if (g22.n.d(kVar.getNote())) {
                        TextView textView11 = cVar.f45868j;
                        if (textView11 == null) {
                            p005kotlin.jvm.internal.s.m("mNotes");
                            throw th3;
                        }
                        textView11.setText(kVar.getNote());
                        LinearLayout linearLayout10 = cVar.f45870l;
                        if (linearLayout10 == null) {
                            p005kotlin.jvm.internal.s.m("mNotesLayout");
                            throw th3;
                        }
                        linearLayout10.setVisibility(0);
                    } else {
                        LinearLayout linearLayout11 = cVar.f45870l;
                        if (linearLayout11 == null) {
                            p005kotlin.jvm.internal.s.m("mNotesLayout");
                            throw th3;
                        }
                        linearLayout11.setVisibility(8);
                    }
                    Integer subscribersCount = kVar.getSubscribersCount();
                    if (subscribersCount != null) {
                        int iIntValue = subscribersCount.intValue();
                        TextView textView12 = cVar.I;
                        if (textView12 == null) {
                            p005kotlin.jvm.internal.s.m("mSubscriberCount");
                            throw th3;
                        }
                        textView12.setText(String.valueOf(iIntValue));
                        LinearLayout linearLayout12 = cVar.F;
                        if (linearLayout12 == null) {
                            p005kotlin.jvm.internal.s.m("mSubscribersLayout");
                            throw th3;
                        }
                        v22.e.r(linearLayout12, iIntValue > 1);
                        i14 = 8;
                    } else {
                        LinearLayout linearLayout13 = cVar.F;
                        if (linearLayout13 == null) {
                            p005kotlin.jvm.internal.s.m("mSubscribersLayout");
                            throw th3;
                        }
                        i14 = 8;
                        linearLayout13.setVisibility(8);
                    }
                    String shareableEventUuid = kVar.getShareableEventUuid();
                    if (shareableEventUuid == null || shareableEventUuid.length() == 0) {
                        TextView textView13 = cVar.f45860b;
                        if (textView13 == null) {
                            p005kotlin.jvm.internal.s.m("mOverviewTitle");
                            throw th3;
                        }
                        textView13.setVisibility(i14);
                    }
                    if (g22.n.d(kVar.getRegistrationUrl())) {
                        RelativeLayout relativeLayout4 = cVar.f45881y;
                        if (relativeLayout4 == null) {
                            p005kotlin.jvm.internal.s.m("mRegisterLayout");
                            throw th3;
                        }
                        relativeLayout4.setVisibility(0);
                    }
                    if (g22.n.d(kVar.getProvider())) {
                        TextView textView14 = cVar.f45882z;
                        if (textView14 == null) {
                            p005kotlin.jvm.internal.s.m("mTvEventSource");
                            throw th3;
                        }
                        if (textView14.getVisibility() != 0) {
                            String provider = kVar.getProvider();
                            provider.getClass();
                            cVar.u6(provider);
                        }
                    }
                    if (cVar.P) {
                        TextView textView15 = cVar.f45860b;
                        if (textView15 == null) {
                            p005kotlin.jvm.internal.s.m("mOverviewTitle");
                            throw th3;
                        }
                        textView15.setVisibility(8);
                    }
                }
                ((androidx.lifecycle.s0) cVar.w6().M0.getValue()).f(cVar.getViewLifecycleOwner(), new com.garmin.android.apps.connectmobile.traininginitiative.ui.c.b(new n(cVar, 3)));
                cVar.w6().h5().f(cVar.getViewLifecycleOwner(), new com.garmin.android.apps.connectmobile.traininginitiative.ui.c.b(new n(cVar, 4)));
                return Unit.INSTANCE;
            case 1:
                g3 g3Var = (g3) obj;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.c.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.c.T;
                fw.p pVar = g3Var.f35300a;
                T t7 = g3Var.f35301b;
                if (pVar == fw.p.SUCCESS) {
                    g22.e.f(cVar);
                    o13.p pVar2 = (o13.p) t7;
                    if (pVar2 != null && ((Boolean) pVar2.f128594a).booleanValue()) {
                        TextView textView16 = cVar.f45860b;
                        if (textView16 == null) {
                            p005kotlin.jvm.internal.s.m("mOverviewTitle");
                            throw null;
                        }
                        textView16.setVisibility(0);
                        fg0.k kVar2 = (fg0.k) pVar2.f128595b;
                        cVar.z6(kVar2 != null ? kVar2.getCourseName() : null, cVar.w6().h5().d());
                    }
                }
                return Unit.INSTANCE;
            case 2:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.c.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.c.T;
                fg0.k kVarD = cVar.w6().k5().d();
                String provider2 = kVarD != null ? kVarD.getProvider() : null;
                if (g22.n.d(provider2)) {
                    LinearLayout linearLayout14 = cVar.D;
                    if (linearLayout14 == null) {
                        p005kotlin.jvm.internal.s.m("mEventSourceLayout");
                        throw null;
                    }
                    if (linearLayout14.getVisibility() != 0) {
                        provider2.getClass();
                        cVar.u6(provider2);
                        TextView textView17 = cVar.f45867i;
                        if (textView17 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsite");
                            throw null;
                        }
                        v22.e.v(textView17, cVar.w6().K5());
                    }
                }
                return Unit.INSTANCE;
            case 3:
                com.garmin.android.apps.connectmobile.courses.model.e eVar = (com.garmin.android.apps.connectmobile.courses.model.e) obj;
                if (eVar != null) {
                    com.garmin.android.apps.connectmobile.traininginitiative.ui.c.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.c.T;
                    cVar.z6(eVar.courseName, null);
                } else {
                    LinearLayout linearLayout15 = cVar.f45875q;
                    if (linearLayout15 == null) {
                        p005kotlin.jvm.internal.s.m("mCourseLayout");
                        throw null;
                    }
                    linearLayout15.setVisibility(8);
                    LinearLayout linearLayout16 = cVar.f45876r;
                    if (linearLayout16 == null) {
                        p005kotlin.jvm.internal.s.m("mCourseListLayout");
                        throw null;
                    }
                    linearLayout16.setVisibility(8);
                }
                return Unit.INSTANCE;
            default:
                List<com.garmin.android.apps.connectmobile.courses.model.e> list = (List) obj;
                if (list != null) {
                    com.garmin.android.apps.connectmobile.traininginitiative.ui.c.a aVar6 = com.garmin.android.apps.connectmobile.traininginitiative.ui.c.T;
                    if (list.isEmpty()) {
                        linearLayout = cVar.f45875q;
                        if (linearLayout != null) {
                            p005kotlin.jvm.internal.s.m("mCourseLayout");
                            throw null;
                        }
                        linearLayout.setVisibility(8);
                        linearLayout2 = cVar.f45876r;
                        if (linearLayout2 != null) {
                            p005kotlin.jvm.internal.s.m("mCourseListLayout");
                            throw null;
                        }
                        linearLayout2.setVisibility(8);
                        textView = cVar.f45866h;
                        if (textView != null) {
                            p005kotlin.jvm.internal.s.m("mCourseInfo");
                            throw null;
                        }
                        textView.setVisibility(8);
                    } else {
                        cVar.z6(null, list);
                    }
                } else {
                    linearLayout = cVar.f45875q;
                    if (linearLayout != null) {
                        p005kotlin.jvm.internal.s.m("mCourseLayout");
                        throw null;
                    }
                    linearLayout.setVisibility(8);
                    linearLayout2 = cVar.f45876r;
                    if (linearLayout2 != null) {
                        p005kotlin.jvm.internal.s.m("mCourseListLayout");
                        throw null;
                    }
                    linearLayout2.setVisibility(8);
                    textView = cVar.f45866h;
                    if (textView != null) {
                        p005kotlin.jvm.internal.s.m("mCourseInfo");
                        throw null;
                    }
                    textView.setVisibility(8);
                }
                return Unit.INSTANCE;
        }
    }
}
