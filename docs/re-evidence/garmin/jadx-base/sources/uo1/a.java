package uo1;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.lifecycle.i0;
import androidx.lifecycle.y0;
import br2.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.charts3.components.OverlayCombinedChart;
import com.garmin.android.apps.connectmobile.badges.redesign.BadgesActivity;
import com.garmin.android.apps.connectmobile.badges.redesign.CompareBadgesActivity;
import com.garmin.android.apps.connectmobile.badges.redesign.ConnectionBadgeDetailsActivity;
import com.garmin.android.apps.connectmobile.badges.redesign.filter.BadgesFilterActivity;
import com.garmin.android.apps.connectmobile.badges.redesign.h;
import com.garmin.android.apps.connectmobile.badges.redesign.i;
import com.garmin.android.apps.connectmobile.badges.redesign.j;
import com.garmin.android.apps.connectmobile.badges.redesign.k;
import com.garmin.android.apps.connectmobile.badges.service.model.e;
import com.garmin.android.apps.connectmobile.badges.service.model.m;
import com.garmin.android.apps.connectmobile.badges.service.model.v;
import com.garmin.android.apps.connectmobile.connectiq.requests.oauth.browser.ExternalBrowserAuthResponseActivity;
import com.garmin.android.apps.connectmobile.courses.create.CourseTypeActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseActivity;
import com.garmin.android.apps.connectmobile.g1;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.livetrackui.presentation.LiveTrackActivity;
import com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.SafetyFeaturesActivity;
import com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.emergencycalling.EmergencyCallingActivity;
import com.garmin.android.apps.connectmobile.userprofile.model.q;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.library.backgroundtaskmanagement.BizOperationException;
import com.garmin.device.filetransfer.core.background.BackgroundTransferWorker;
import com.garmin.feature.garminpay.providers.felica.ui.FelicaAddCardActivity;
import com.garmin.feature.garminpay.providers.felica.ui.FelicaUpdateUserInfoActivity;
import e23.l;
import f5.c0;
import fw.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import lc.u0;
import o53.f0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;
import p13.h0;
import p13.x;
import p13.y;
import ps2.w;
import pt1.t;
import qs2.f;
import ty1.o;
import uu.g0;
import v12.n;
import v2.i1;
import v2.p1;
import v2.u1;
import vc0.u;
import w2.a0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f172117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f172118b;

    public /* synthetic */ a(Object obj, int i14) {
        this.f172117a = i14;
        this.f172118b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0148  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v21, types: [T, java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v23, types: [T, java.lang.Iterable, java.util.ArrayList] */
    @Override // e23.l
    public final Object invoke(Object obj) {
        v vVarB;
        List<m> listD;
        v vVarD;
        List<m> listD2;
        Notification notificationE;
        hs2.b bVarH;
        fs2.a aVar;
        g gVarA;
        f fVar;
        List<e> listA;
        int i14 = this.f172117a;
        boolean z14 = false;
        int i15 = 3;
        Object obj2 = null;
        Object obj3 = this.f172118b;
        switch (i14) {
            case 0:
                d dVar = (d) obj3;
                View view2 = (View) obj;
                int i16 = d.f172122b;
                view2.getClass();
                Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(dVar.getContext(), R.animator.news_feed_post_loading);
                animatorLoadAnimator.getClass();
                animatorLoadAnimator.addListener(new c(dVar, animatorLoadAnimator));
                animatorLoadAnimator.setTarget(view2);
                return animatorLoadAnimator;
            case 1:
                BadgesActivity badgesActivity = (BadgesActivity) obj3;
                g3 g3Var = (g3) obj;
                BadgesActivity.b bVar = BadgesActivity.f30332j;
                g3Var.getClass();
                p pVar = g3Var.f35300a;
                q qVar = (q) g3Var.f35301b;
                Exception exc = g3Var.f35303d;
                int i17 = BadgesActivity.c.f30344a[pVar.ordinal()];
                if (i17 == 1) {
                    badgesActivity.showProgressOverlay();
                } else if (i17 == 2) {
                    badgesActivity.f30340h = qVar;
                    badgesActivity.da();
                    badgesActivity.hideProgressOverlay();
                } else {
                    if (i17 != 3) {
                        u0.r();
                        return null;
                    }
                    if (exc instanceof BizOperationException) {
                        g1.b(badgesActivity, ((BizOperationException) exc).getStatus());
                    }
                    badgesActivity.hideProgressOverlay();
                }
                return Unit.INSTANCE;
            case 2:
                CompareBadgesActivity compareBadgesActivity = (CompareBadgesActivity) obj3;
                g3 g3Var2 = (g3) obj;
                CompareBadgesActivity.a aVar2 = CompareBadgesActivity.f30346q;
                g3Var2.getClass();
                p pVar2 = g3Var2.f35300a;
                com.garmin.android.apps.connectmobile.badges.service.model.l lVar = (com.garmin.android.apps.connectmobile.badges.service.model.l) g3Var2.f35301b;
                int i18 = CompareBadgesActivity.b.f30363a[pVar2.ordinal()];
                if (i18 == 1) {
                    compareBadgesActivity.showProgressOverlay();
                } else if (i18 == 2) {
                    compareBadgesActivity.hideProgressOverlay();
                    compareBadgesActivity.f30348b = lVar;
                    if (lVar != null) {
                        compareBadgesActivity.ca();
                        com.garmin.android.apps.connectmobile.badges.redesign.d dVar2 = compareBadgesActivity.f30360n;
                        dVar2.getClass();
                        dVar2.f30434b = compareBadgesActivity.f30348b;
                        ArrayList<com.garmin.android.apps.connectmobile.badges.redesign.d.a> arrayList = dVar2.f30433a;
                        arrayList.clear();
                        HashMap map = new HashMap();
                        com.garmin.android.apps.connectmobile.badges.service.model.l lVar2 = dVar2.f30434b;
                        if (lVar2 != null && (vVarD = lVar2.getUserProfile()) != null && (listD2 = vVarD.d()) != null) {
                            for (m mVar : listD2) {
                                if (!map.containsKey(mVar != null ? mVar.y() : null) && mVar != null) {
                                    com.garmin.android.apps.connectmobile.badges.redesign.d.a aVar3 = new com.garmin.android.apps.connectmobile.badges.redesign.d.a(dVar2, mVar);
                                    aVar3.f30436b = mVar.getBadgeEarnedNumber();
                                    map.put(String.valueOf(mVar.y()), aVar3);
                                    arrayList.add(aVar3);
                                }
                            }
                        }
                        com.garmin.android.apps.connectmobile.badges.service.model.l lVar3 = dVar2.f30434b;
                        if (lVar3 != null && (vVarB = lVar3.getConnectionProfile()) != null && (listD = vVarB.d()) != null) {
                            for (m mVar2 : listD) {
                                if (map.containsKey(mVar2 != null ? mVar2.y() : null)) {
                                    com.garmin.android.apps.connectmobile.badges.redesign.d.a aVar4 = (com.garmin.android.apps.connectmobile.badges.redesign.d.a) map.get(mVar2 != null ? mVar2.y() : null);
                                    if (aVar4 != null) {
                                        aVar4.f30437c = mVar2 != null ? mVar2.getBadgeEarnedNumber() : 0;
                                    }
                                } else if (mVar2 != null) {
                                    com.garmin.android.apps.connectmobile.badges.redesign.d.a aVar5 = new com.garmin.android.apps.connectmobile.badges.redesign.d.a(dVar2, mVar2);
                                    aVar5.f30437c = mVar2.getBadgeEarnedNumber();
                                    map.put(String.valueOf(mVar2.y()), aVar5);
                                    arrayList.add(aVar5);
                                }
                            }
                        }
                        dVar2.notifyDataSetChanged();
                    }
                } else {
                    if (i18 != 3) {
                        u0.r();
                        return null;
                    }
                    compareBadgesActivity.hideProgressOverlay();
                    compareBadgesActivity.displayFailedMessage();
                }
                return Unit.INSTANCE;
            case 3:
                ConnectionBadgeDetailsActivity connectionBadgeDetailsActivity = (ConnectionBadgeDetailsActivity) obj3;
                g3 g3Var3 = (g3) obj;
                ConnectionBadgeDetailsActivity.a aVar6 = ConnectionBadgeDetailsActivity.f30365i;
                g3Var3.getClass();
                p pVar3 = g3Var3.f35300a;
                m mVar3 = (m) g3Var3.f35301b;
                int i19 = ConnectionBadgeDetailsActivity.b.f30370a[pVar3.ordinal()];
                if (i19 == 1) {
                    connectionBadgeDetailsActivity.f37120c.postDelayed(connectionBadgeDetailsActivity.f37118a, 100L);
                } else if (i19 == 2) {
                    connectionBadgeDetailsActivity.ca();
                    com.garmin.android.apps.connectmobile.badges.redesign.e eVar = connectionBadgeDetailsActivity.f30368g;
                    eVar.getClass();
                    eVar.u6(mVar3);
                } else {
                    if (i19 != 3) {
                        u0.r();
                        return null;
                    }
                    connectionBadgeDetailsActivity.ca();
                    connectionBadgeDetailsActivity.displayFailedMessage();
                }
                return Unit.INSTANCE;
            case 4:
                h hVar = (h) obj3;
                g3 g3Var4 = (g3) obj;
                h.a aVar7 = h.f30486r;
                int i24 = h.b.f30492a[g3Var4.f35300a.ordinal()];
                if (i24 == 1) {
                    r0 r0Var = new r0();
                    T t7 = g3Var4.f35301b;
                    t7.getClass();
                    ?? r14 = (ArrayList) t7;
                    r0Var.f105810a = r14;
                    ArrayList arrayList2 = new ArrayList(y.r(r14, 10));
                    Iterator it = r14.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(com.garmin.android.apps.connectmobile.badges.service.model.p.b((com.garmin.android.apps.connectmobile.badges.service.model.p) it.next(), null, Integer.valueOf(hVar.f30487m), 127));
                    }
                    ?? arrayList3 = new ArrayList(arrayList2);
                    r0Var.f105810a = arrayList3;
                    ArrayList arrayList4 = new ArrayList(y.r(arrayList3, 10));
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(String.valueOf(((com.garmin.android.apps.connectmobile.badges.service.model.p) it3.next()).getUserProfileId()));
                    }
                    List listB1 = h0.b1(h0.f1(arrayList4));
                    i0 i0VarW = f0.w(hVar);
                    x53.c cVar = s0.f129406a;
                    ge1.b.T(i0VarW, x53.b.f189152a, null, new g0(hVar, listB1, r0Var, null), 2);
                } else if (i24 == 2) {
                    hVar.T6(false);
                    hVar.Y6(true);
                    hVar.v6(g3Var4.f35304e);
                } else {
                    if (i24 != 3) {
                        u0.r();
                        return null;
                    }
                    hVar.c7();
                }
                hVar.w6();
                return Unit.INSTANCE;
            case 5:
                j jVar = (j) obj3;
                g3 g3Var5 = (g3) obj;
                j.a aVar8 = j.f30502r;
                if (!jVar.isAdded()) {
                    return Unit.INSTANCE;
                }
                int i25 = j.b.f30508a[g3Var5.f35300a.ordinal()];
                if (i25 == 1) {
                    jVar.c7();
                } else if (i25 == 2) {
                    jVar.f30506p = true;
                    T t14 = g3Var5.f35301b;
                    t14.getClass();
                    ArrayList arrayList5 = (ArrayList) t14;
                    i iVar = jVar.f30505o;
                    if (iVar != null) {
                        k.b bVar2 = iVar.f30501c.f30519b;
                        bVar2.getClass();
                        ArrayList<m> arrayList6 = bVar2.f30522a;
                        arrayList6.addAll(arrayList5);
                        int size = arrayList6.size() - arrayList5.size();
                        k kVar = k.this;
                        if (size == 0) {
                            kVar.g();
                        } else {
                            kVar.f().u(kVar, size, arrayList5.size());
                        }
                    }
                    jVar.X6(arrayList5.size());
                    jVar.T6(false);
                    jVar.w6();
                } else {
                    if (i25 != 3) {
                        u0.r();
                        return null;
                    }
                    jVar.f30506p = false;
                    jVar.T6(false);
                    jVar.Y6(true);
                    jVar.w6();
                }
                return Unit.INSTANCE;
            case 6:
                com.garmin.android.apps.connectmobile.navigation.more.b bVar3 = (com.garmin.android.apps.connectmobile.navigation.more.b) obj;
                int i26 = uy0.g1.f173177b;
                bVar3.getClass();
                return bVar3.a(((uy0.g1) obj3).f173178a);
            case 7:
                ExternalBrowserAuthResponseActivity externalBrowserAuthResponseActivity = (ExternalBrowserAuthResponseActivity) obj3;
                int i27 = ExternalBrowserAuthResponseActivity.f31992c;
                int i28 = ExternalBrowserAuthResponseActivity.a.f31995a[((g3) obj).f35300a.ordinal()];
                if (i28 == 1) {
                    externalBrowserAuthResponseActivity.hideProgressOverlay();
                    externalBrowserAuthResponseActivity.finish();
                } else if (i28 == 2) {
                    externalBrowserAuthResponseActivity.hideProgressOverlay();
                    Toast.makeText(externalBrowserAuthResponseActivity, R.string.txt_error_occurred, 1).show();
                    externalBrowserAuthResponseActivity.finish();
                } else {
                    if (i28 != 3) {
                        u0.r();
                        return null;
                    }
                    externalBrowserAuthResponseActivity.showProgressOverlay();
                }
                return Unit.INSTANCE;
            case 8:
                n nVar = (n) obj3;
                ip.a aVar9 = (ip.a) obj;
                aVar9.getClass();
                androidx.fragment.app.v parentFragmentManager = nVar.getParentFragmentManager();
                parentFragmentManager.getClass();
                androidx.fragment.app.a aVar10 = new androidx.fragment.app.a(parentFragmentManager);
                v12.h.a aVar11 = v12.h.f174703f;
                hl.a aVar12 = (hl.a) nVar.f174759c.getValue();
                aVar11.getClass();
                aVar12.getClass();
                aVar10.m(R.id.content_frame_layout, v12.h.class, h7.c.a(new o13.p("activity", aVar9), new o13.p("GCM_extra_screen_access_role", aVar12)));
                aVar10.d(null);
                aVar10.e();
                return Unit.INSTANCE;
            case 9:
                ((i1) obj3).b((x5.k) obj);
                return Unit.INSTANCE;
            case 10:
                p1 p1Var = (p1) obj3;
                c0 c0Var = (c0) obj;
                n4.d dVar3 = (n4.d) p1Var.f175116g.A.getF182175a();
                if (dVar3 == null) {
                    n4.d.f123545e.getClass();
                    dVar3 = n4.d.f123546f;
                }
                c0 c0VarE = p1Var.f175114e.e();
                if (c0VarE != null) {
                    return r2.l.b(dVar3, c0VarE, c0Var);
                }
                b2.e.d("Required value was null.");
                o2.c.f();
                return null;
            case 11:
                ClipDescription clipDescription = ((k4.c) obj).f102805a.getClipDescription();
                Iterable<v1.a> iterable = (Iterable) ((u1) obj3).invoke();
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    for (v1.a aVar13 : iterable) {
                        v1.a.f174655b.getClass();
                        if (s.g(aVar13, v1.a.f174657d) || clipDescription.hasMimeType(aVar13.f174658a)) {
                            z14 = true;
                        }
                    }
                }
                return Boolean.valueOf(z14);
            case 12:
                CourseTypeActivity courseTypeActivity = (CourseTypeActivity) obj3;
                v2 v2Var = (v2) obj;
                CourseTypeActivity.a aVar14 = CourseTypeActivity.f32753j;
                courseTypeActivity.hideProgressOverlay();
                if (v2Var instanceof v2.b) {
                    CreateCustomCourseActivity.a aVar15 = CreateCustomCourseActivity.f33013f;
                    com.garmin.android.apps.connectmobile.courses.model.e eVar2 = (com.garmin.android.apps.connectmobile.courses.model.e) ((v2.b) v2Var).f47386a;
                    aVar15.getClass();
                    com.garmin.android.apps.connectmobile.courses.model.e eVar3 = eVar2 != null ? new com.garmin.android.apps.connectmobile.courses.model.e(eVar2) : null;
                    Intent intent = new Intent(courseTypeActivity, (Class<?>) CreateCustomCourseActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("GCM_extra_course_detail", eVar3);
                    com.airbnb.lottie.animation.keyframe.a.q(l2.f37135b, intent, bundle);
                    courseTypeActivity.startActivityForResult(intent, 2);
                } else {
                    u20.e.u6(-1, R.string.title_error_occurred).g(courseTypeActivity.getSupportFragmentManager());
                }
                return Unit.INSTANCE;
            case 13:
                ab1.l lVar4 = (ab1.l) obj;
                int i29 = va1.n.f176642b;
                lVar4.getClass();
                ua1.c cVar2 = (ua1.c) ((va1.n) obj3).f176643a.getValue();
                cVar2.f169616l = lVar4;
                y0<ab1.g> y0Var = cVar2.f169618n;
                ab1.g gVar = new ab1.g();
                gVar.f2569b = cVar2.f169606b;
                gVar.f2570c = Long.valueOf(cVar2.f169605a);
                gVar.f2571d = Long.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk());
                gVar.g(Float.valueOf(0.5f));
                Integer numD = cVar2.f169614j.d();
                if (numD == null) {
                    numD = Integer.valueOf(cVar2.f169613i);
                }
                gVar.j(numD);
                f12.l.f68084a.getClass();
                gVar.h(Float.valueOf((float) f12.l.a.a().v3()));
                va1.c cVarD = cVar2.f169612h.d();
                gVar.f(Float.valueOf(cVarD != null ? (float) cVarD.f176587b : 0.0f));
                gVar.d(cVar2.f169616l);
                y0Var.m(gVar);
                return Unit.INSTANCE;
            case 14:
                u uVar = (u) obj3;
                if (((Boolean) obj).booleanValue()) {
                    sd2.f fVar2 = uVar.f177015d;
                    String displayName = fVar2.getDisplayName();
                    if (displayName == null) {
                        displayName = fVar2.getProductDisplayName();
                        displayName.getClass();
                    }
                    ArrayList arrayListM = x.m(displayName);
                    String strD0 = fVar2.d0();
                    if (strD0 != null) {
                        arrayListM.add(strD0);
                    }
                    String strQ = fVar2.Q();
                    if (strQ != null) {
                        arrayListM.add(strQ);
                    }
                    ej1.a aVar16 = uVar.f177022k;
                    Set<String> setG1 = h0.g1(arrayListM);
                    aVar16.getClass();
                    setG1.getClass();
                    aVar16.f64404a.X1("key_removed_device_info", setG1);
                }
                kh2.j jVar2 = u.f177014m;
                if (jVar2 != null) {
                    jVar2.b();
                    return Unit.INSTANCE;
                }
                s.m("deviceRemovalOperationDelegate");
                throw null;
            case 15:
                EmergencyCallingActivity emergencyCallingActivity = (EmergencyCallingActivity) obj3;
                EmergencyCallingActivity.a aVar17 = EmergencyCallingActivity.f43789d;
                if (((Boolean) obj).booleanValue()) {
                    SafetyFeaturesActivity.a aVar18 = SafetyFeaturesActivity.f43691f;
                    hl.a aVar19 = (hl.a) emergencyCallingActivity.f43790a.getValue();
                    aVar18.getClass();
                    Intent intentB = SafetyFeaturesActivity.a.b(emergencyCallingActivity, true, aVar19);
                    intentB.addFlags(67108864);
                    emergencyCallingActivity.startActivity(intentB);
                    emergencyCallingActivity.finish();
                }
                return Unit.INSTANCE;
            case 16:
                BackgroundTransferWorker backgroundTransferWorker = (BackgroundTransferWorker) obj3;
                al2.a aVar20 = (al2.a) obj;
                BackgroundTransferWorker.a aVar21 = BackgroundTransferWorker.f50764q;
                aVar20.getClass();
                if (backgroundTransferWorker.f50773n && (notificationE = backgroundTransferWorker.e(aVar20.f3759a, MathKt.c(aVar20.a()))) != null) {
                    Object systemService = backgroundTransferWorker.f11469a.getSystemService("notification");
                    NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
                    if (notificationManager != null) {
                        notificationManager.notify(7000, notificationE);
                    }
                }
                return Unit.INSTANCE;
            case 17:
                return Boolean.valueOf(s.g(((wm0.c) obj).getGroupMemberRequestId(), ((wm0.c) obj3).getGroupMemberRequestId()));
            case 18:
                return Boolean.valueOf(s.g(((com.garmin.android.apps.connectmobile.connections.groups.services.model.b) obj).getUserProfileId(), ((com.garmin.android.apps.connectmobile.connections.groups.services.model.b) obj3).getUserProfileId()));
            case 19:
                return Boolean.valueOf(s.g(((wm0.a) obj).getGroupInviteId(), ((wm0.a) obj3).getGroupInviteId()));
            case 20:
                OverlayCombinedChart overlayCombinedChart = (OverlayCombinedChart) obj3;
                ((Context) obj).getClass();
                return overlayCombinedChart;
            case 21:
                ((OverlayCombinedChart) obj).getClass();
                ((zm.c) obj3).N();
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj).getClass();
                return new vn2.d((FelicaAddCardActivity) obj3, i15);
            case 23:
                return vn2.i.Z0((vn2.i) obj3, (rn2.i) obj);
            case 24:
                androidx.appcompat.app.e.a aVar22 = (androidx.appcompat.app.e.a) obj;
                FelicaUpdateUserInfoActivity.a aVar23 = FelicaUpdateUserInfoActivity.f50988j;
                aVar22.getClass();
                aVar22.setTitle(R.string.wallet_verify_your_account);
                aVar22.setMessage(R.string.wallet_message_verify_your_account);
                aVar22.setPositiveButton(R.string.lbl_ok, new sa2.b((FelicaUpdateUserInfoActivity) obj3, 22));
                aVar22.setNegativeButton(R.string.lbl_cancel, new o(29));
                return Unit.INSTANCE;
            case 25:
                sd2.f fVar3 = (sd2.f) obj;
                com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                fVar3.getClass();
                yb0.a aVar24 = ((com.garmin.android.apps.connectmobile.stress.presentation.view.a) obj3).f45026f;
                if (aVar24 != null) {
                    aVar24.f195678a.j(new w61.f<>(fVar3));
                }
                return Unit.INSTANCE;
            case 26:
                vr2.c cVar3 = (vr2.c) obj3;
                sd2.f fVar4 = (sd2.f) obj;
                Logger logger = vr2.c.f179562o;
                fVar4.getClass();
                w wVar = w.f140538a;
                long unitID = fVar4.getUnitID();
                wVar.getClass();
                ps2.n nVarI = w.i(unitID);
                if (nVarI == null || (bVarH = nVarI.h()) == null) {
                    bVarH = hs2.b.DISCONNECTED;
                }
                br2.f.a aVar25 = br2.f.f19598j;
                long unitID2 = fVar4.getUnitID();
                boolean zIsPaired = fVar4.isPaired();
                aVar25.getClass();
                br2.d dVarA = br2.f.a.a(unitID2, zIsPaired, bVarH);
                long unitID3 = fVar4.getUnitID();
                String strI = a0.i(fVar4);
                String strT = w52.u0.t(fVar4);
                String str = strT == null ? "" : strT;
                String softwareVersion = fVar4.getSoftwareVersion();
                String str2 = softwareVersion == null ? "" : softwareVersion;
                String softwareVersion2 = fVar4.getSoftwareVersion();
                br2.f fVar5 = new br2.f(unitID3, strI, str, dVarA, str2, softwareVersion2 == null ? "" : softwareVersion2, false, false, 192, null);
                List<? extends fs2.a> list = cVar3.f179565c;
                if (list == null) {
                    s.m("deviceWalletItems");
                    throw null;
                }
                for (Object obj4 : list) {
                    if (((fs2.a) obj4).f73431f == fVar4.getUnitID()) {
                        obj2 = obj4;
                        aVar = (fs2.a) obj2;
                        if (aVar != null || (fVar = aVar.f73433h) == null || (gVarA = yr2.n.a(fVar)) == null) {
                            gVarA = g.PAY_NOT_ENABLED;
                        }
                        fVar5.f19607i = gVarA;
                        return fVar5;
                    }
                }
                aVar = (fs2.a) obj2;
                if (aVar != null) {
                    gVarA = g.PAY_NOT_ENABLED;
                } else {
                    gVarA = g.PAY_NOT_ENABLED;
                }
                fVar5.f19607i = gVarA;
                return fVar5;
            case 27:
                t tVar = (t) obj;
                tVar.getClass();
                return Boolean.valueOf(tVar.f140967a == ((t) obj3).f140967a);
            case 28:
                BadgesFilterActivity badgesFilterActivity = (BadgesFilterActivity) obj3;
                vu.b bVar4 = badgesFilterActivity.f30468b;
                g3 g3Var6 = (g3) obj;
                BadgesFilterActivity.a aVar26 = BadgesFilterActivity.f30466d;
                g3Var6.getClass();
                p pVar4 = g3Var6.f35300a;
                com.garmin.android.apps.connectmobile.badges.service.model.f fVar6 = (com.garmin.android.apps.connectmobile.badges.service.model.f) g3Var6.f35301b;
                int i30 = BadgesFilterActivity.b.f30470a[pVar4.ordinal()];
                if (i30 == 1) {
                    badgesFilterActivity.showProgressOverlay();
                } else if (i30 == 2) {
                    badgesFilterActivity.hideProgressOverlay();
                    if (fVar6 != null && (listA = fVar6.a()) != null) {
                        for (e eVar4 : listA) {
                            ArrayList arrayList7 = bVar4.f180214c;
                            com.garmin.android.apps.connectmobile.badges.service.model.d dVarA2 = com.garmin.android.apps.connectmobile.badges.service.model.d.a(eVar4.getBadgeDifficultyId());
                            dVarA2.getClass();
                            arrayList7.add(dVarA2);
                        }
                    }
                } else {
                    if (i30 != 3) {
                        u0.r();
                        return null;
                    }
                    badgesFilterActivity.displayFailedMessage();
                }
                String strK = androidx.room.a0.k("mFilterData.displayBadgeDifficulties = ", bVar4.f180214c);
                i2.a aVar27 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar27.getClass();
                i2.a.b(a2Var, "BadgesFilterActivity", strK);
                return Unit.INSTANCE;
            default:
                e23.a<Unit> aVar28 = (e23.a) obj;
                LiveTrackActivity.a aVar29 = LiveTrackActivity.f38637g;
                aVar28.getClass();
                wu0.d dVarDa = ((LiveTrackActivity) obj3).da();
                dVarDa.getClass();
                dVarDa.f187251i = aVar28;
                dVarDa.f187243a.x4(q92.x.DI_CONNECT_LIVETRACK_STRAVA_BEACON);
                return Unit.INSTANCE;
        }
    }
}
