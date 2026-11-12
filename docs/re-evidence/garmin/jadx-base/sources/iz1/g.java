package iz1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.i0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.manual.CourseChooserActivity;
import com.garmin.android.apps.connectmobile.badges.service.model.m;
import com.garmin.android.apps.connectmobile.bikesensors.CalibrationSettingsActivity;
import com.garmin.android.apps.connectmobile.connectiq.requests.oauth.ConnectIQOAuthActivity;
import com.garmin.android.apps.connectmobile.contacts.emergency.EmergencyContactSendRequestActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.group.details.GroupNotJoinedFragment;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.performance.model.StressScoresSummaryDTO;
import com.garmin.android.apps.connectmobile.s2;
import com.garmin.android.apps.connectmobile.settings.devices.index.InviteByEmailActivity;
import com.garmin.android.apps.connectmobile.training.fbtap.preferences.view.activity.FBTEditPreferencesActivity;
import com.garmin.android.apps.connectmobile.training.itp.dashboard.ITPDashboardActivity;
import com.garmin.device.ciq.http.requests.oauth.ConnectIQOAuthRequest;
import com.garmin.feature.garminpay.providers.gpay.ui.managecard.FitPayCardDetailsActivity;
import com.garmin.feature.garminpay.ui.passcode.ResetWalletActivity;
import com.garmin.feature.garminpay.ui.userwallet.PaymentCardDetailsActivity;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import fw.p;
import fw.r;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import lc.u0;
import m20.p0;
import m72.o;
import o53.f0;
import o53.l1;
import o53.s0;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import ov1.w;
import ov1.y;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.x0;
import p13.c1;
import p13.j0;
import pk1.t;
import r53.p2;
import vg1.c0;
import vg1.q;
import wd2.z1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f95873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f95874b;

    public /* synthetic */ g(Object obj, int i14) {
        this.f95873a = i14;
        this.f95874b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void a(Object obj) {
        ConnectIQOAuthActivity connectIQOAuthActivity = (ConnectIQOAuthActivity) this.f95874b;
        g3 g3Var = (g3) obj;
        int i14 = ConnectIQOAuthActivity.f31981g;
        int i15 = ConnectIQOAuthActivity.b.f31988a[g3Var.f35300a.ordinal()];
        if (i15 == 1) {
            connectIQOAuthActivity.hideProgressOverlay();
            return;
        }
        if (i15 != 2) {
            if (i15 == 3) {
                connectIQOAuthActivity.showProgressOverlay();
                return;
            } else {
                u0.r();
                return;
            }
        }
        connectIQOAuthActivity.hideProgressOverlay();
        u10.h hVar = (u10.h) g3Var.f35301b;
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "ConnectIQOAuthActivity", "Respond Oauth error:" + hVar);
        androidx.appcompat.app.e eVar = connectIQOAuthActivity.f31985d;
        if (eVar == null || !eVar.isShowing()) {
            androidx.appcompat.app.e.a cancelable = new androidx.appcompat.app.e.a(connectIQOAuthActivity).setCancelable(false);
            ConnectIQOAuthRequest connectIQOAuthRequest = connectIQOAuthActivity.f31984c;
            if (connectIQOAuthRequest == null) {
                s.m("ciqRequest");
                throw null;
            }
            androidx.appcompat.app.e eVarCreate = cancelable.setTitle(connectIQOAuthRequest.getAppName()).setMessage(R.string.connect_iq_error_handling_message).setNegativeButton(R.string.lbl_cancel, new t(13, connectIQOAuthActivity, hVar)).setPositiveButton(R.string.lbl_retry, new sa2.b(connectIQOAuthActivity, 7)).create();
            connectIQOAuthActivity.f31985d = eVarCreate;
            if (eVarCreate != null) {
                eVarCreate.show();
            }
        }
    }

    private final void b(Object obj) {
        com.garmin.android.apps.connectmobile.badges.redesign.a aVar = (com.garmin.android.apps.connectmobile.badges.redesign.a) this.f95874b;
        g3 g3Var = (g3) obj;
        com.garmin.android.apps.connectmobile.badges.redesign.a.C0476a c0476a = com.garmin.android.apps.connectmobile.badges.redesign.a.f30373x;
        g3Var.getClass();
        T t7 = g3Var.f35301b;
        if (aVar.isAdded()) {
            int i14 = com.garmin.android.apps.connectmobile.badges.redesign.a.b.f30383a[g3Var.f35300a.ordinal()];
            if (i14 == 1) {
                aVar.c7();
                return;
            }
            if (i14 != 2) {
                if (i14 != 3) {
                    u0.r();
                    return;
                }
                aVar.T6(false);
                aVar.Y6(true);
                aVar.u6(com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE);
                return;
            }
            aVar.T6(false);
            aVar.f30376o = true;
            uu.a aVar2 = aVar.f30375n;
            if (aVar2 != null) {
                List list = (List) t7;
                ArrayList<m> arrayList = aVar2.f172630c;
                list.getClass();
                arrayList.addAll(list);
                aVar2.notifyDataSetChanged();
            }
            List list2 = (List) t7;
            aVar.X6(list2 != null ? list2.size() : 0);
        }
    }

    private final void c(Object obj) {
        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar = (com.garmin.android.apps.connectmobile.settings.devices.common.f) this.f95874b;
        fVar.f42834k = true;
        int iIntValue = ((Integer) obj).intValue();
        c0 c0Var = fVar.f42840p;
        if (iIntValue > 0) {
            q qVar = new q(fVar, 2);
            View view2 = c0Var.f178080a;
            if (view2 != null) {
                view2.setOnClickListener(qVar);
            }
            View view3 = fVar.f42840p.f178080a;
            if (view3 != null) {
                view3.setVisibility(0);
            }
            fVar.f42841q.setVisibility(0);
            fVar.f42840p.a(Integer.toString(iIntValue));
            ProgressBar progressBar = fVar.f42840p.f178084e;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        } else {
            View view4 = c0Var.f178080a;
            if (view4 != null) {
                view4.setVisibility(8);
            }
            fVar.f42841q.setVisibility(8);
        }
        com.garmin.android.apps.connectmobile.settings.devices.common.e eVar = fVar.f42833j;
        if (eVar != null) {
            eVar.a();
        }
        com.garmin.android.apps.connectmobile.settings.devices.common.e eVar2 = new com.garmin.android.apps.connectmobile.settings.devices.common.e(fVar);
        fVar.f42833j = eVar2;
        eVar2.c(new Void[0]);
    }

    private final void d(Object obj) {
        vv.f fVar = (vv.f) this.f95874b;
        fw.m mVar = (fw.m) obj;
        int i14 = vv.f.f180406o;
        mVar.getClass();
        if (mVar.f73769b == p.SUCCESS) {
            boolean zG = s.g(mVar.f73770c, Boolean.TRUE);
            LinearLayout linearLayout = fVar.f180407i;
            if (zG) {
                if (linearLayout == null) {
                    s.m(TtmlNode.RUBY_CONTAINER);
                    throw null;
                }
                int childCount = linearLayout.getChildCount();
                if (childCount >= 0) {
                    int i15 = 0;
                    while (true) {
                        LinearLayout linearLayout2 = fVar.f180407i;
                        if (linearLayout2 == null) {
                            s.m(TtmlNode.RUBY_CONTAINER);
                            throw null;
                        }
                        View childAt = linearLayout2.getChildAt(i15);
                        if (childAt != null) {
                            childAt.setVisibility(0);
                        }
                        if (i15 == childCount) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                }
                View view2 = fVar.f180408j;
                if (view2 == null) {
                    s.m("deviceDisconnectedLayout");
                    throw null;
                }
                view2.setVisibility(8);
                fVar.f178102a.a();
                fVar.f180411m = vv.e.DEVICE_CONNECTED;
            } else {
                if (linearLayout == null) {
                    s.m(TtmlNode.RUBY_CONTAINER);
                    throw null;
                }
                int childCount2 = linearLayout.getChildCount();
                if (childCount2 >= 0) {
                    int i16 = 0;
                    while (true) {
                        LinearLayout linearLayout3 = fVar.f180407i;
                        if (linearLayout3 == null) {
                            s.m(TtmlNode.RUBY_CONTAINER);
                            throw null;
                        }
                        View childAt2 = linearLayout3.getChildAt(i16);
                        if (childAt2 != null) {
                            childAt2.setVisibility(8);
                        }
                        if (i16 == childCount2) {
                            break;
                        } else {
                            i16++;
                        }
                    }
                }
                fVar.f180411m = fVar.f180410l ? vv.e.DEVICE_NOT_CONNECTED : vv.e.DEVICE_DISCONNECTED;
                View view3 = fVar.f180408j;
                if (view3 == null) {
                    s.m("deviceDisconnectedLayout");
                    throw null;
                }
                view3.setVisibility(0);
                View view4 = fVar.f180408j;
                if (view4 == null) {
                    s.m("deviceDisconnectedLayout");
                    throw null;
                }
                TextView textView = (TextView) view4.findViewById(R.id.device_disconnected_title_tv);
                View view5 = fVar.f180408j;
                if (view5 == null) {
                    s.m("deviceDisconnectedLayout");
                    throw null;
                }
                TextView textView2 = (TextView) view5.findViewById(R.id.device_disconnected_message_tv);
                o13.p<String, String> pVarOa = fVar.oa(fVar.f180411m);
                String str = pVarOa.f128594a;
                String str2 = pVarOa.f128595b;
                if (str == null) {
                    textView.getClass();
                    textView.setVisibility(4);
                } else {
                    textView.getClass();
                    textView.setVisibility(0);
                    textView.setText(str);
                }
                if (str2 == null) {
                    textView2.getClass();
                    textView2.setVisibility(4);
                } else {
                    textView2.getClass();
                    textView2.setVisibility(0);
                    textView2.setText(str2);
                }
            }
        }
        fVar.f180410l = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void e(Object obj) {
        com.garmin.android.apps.connectmobile.performance.stats.improvement.d dVar = (com.garmin.android.apps.connectmobile.performance.stats.improvement.d) this.f95874b;
        fw.m mVar = (fw.m) obj;
        com.garmin.android.apps.connectmobile.performance.stats.improvement.d.a aVar = com.garmin.android.apps.connectmobile.performance.stats.improvement.d.f40127w;
        mVar.getClass();
        T t7 = mVar.f73770c;
        int i14 = com.garmin.android.apps.connectmobile.performance.stats.improvement.d.b.f40141a[mVar.f73769b.ordinal()];
        if (i14 == 1) {
            dVar.H6(!dVar.z6());
            return;
        }
        if (i14 == 2) {
            dVar.y6(!dVar.z6());
            dVar.I6((x61.q) t7);
        } else {
            if (i14 != 3) {
                u0.r();
                return;
            }
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "TrainingStatusSumFrag", "observer error");
            dVar.y6(!dVar.z6());
            g22.e.a(dVar, mVar.f73771d);
            dVar.I6((x61.q) t7);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:313:0x0675  */
    /* JADX WARN: Code duplicated, block: B:316:0x0682  */
    /* JADX WARN: Code duplicated, block: B:317:0x068a  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.z0
    public final void onChanged(Object obj) throws Throwable {
        Object obj2;
        Object obj3;
        Object value;
        Object obj4;
        Object value2;
        Object obj5;
        Object value3;
        Bundle bundle;
        String string;
        Throwable th3;
        Enum enumValueOf;
        int i14 = this.f95873a;
        int i15 = 5;
        int i16 = 6;
        Throwable th4 = null;
        final int i17 = 0;
        int i18 = 2;
        final int i19 = 1;
        Object obj6 = this.f95874b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.b bVar = (com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.b) obj6;
                g3 g3Var = (g3) obj;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.b.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.b.f46192e;
                if (g3Var != null) {
                    int i24 = com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.b.C0895b.f46197a[g3Var.f35300a.ordinal()];
                    if (i24 == 1) {
                        g22.e.l(bVar);
                        return;
                    }
                    if (i24 != 2) {
                        if (i24 != 3) {
                            u0.r();
                            return;
                        }
                        bVar.f46194b = false;
                        g22.e.a(bVar, null);
                        g22.e.f(bVar);
                        return;
                    }
                    g22.e.f(bVar);
                    ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).T3(true);
                    if (bVar.v6().X) {
                        if (bVar.f46194b) {
                            bVar.w6();
                            return;
                        } else {
                            bVar.v6().Y4();
                            return;
                        }
                    }
                    Intent intent = new Intent();
                    intent.putExtra("GCM_extra_sharable_event_dto", bVar.v6().I);
                    intent.putExtra("extra_show_event_added_snack_bar", bVar.v6().Z);
                    intent.putExtra("extra_event_dashboard_refresh_needed", bVar.v6().f204399p);
                    androidx.fragment.app.m activity = bVar.getActivity();
                    if (activity != null) {
                        activity.setResult(-1, intent);
                        activity.finish();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((f) obj6).invoke(obj);
                return;
            case 2:
                ((j1.c) obj6).m(obj);
                return;
            case 3:
                j10.s sVar = (j10.s) obj6;
                g3 g3Var2 = (g3) obj;
                int i25 = j10.s.V0;
                int i26 = j10.s.a.f96403a[g3Var2.f35300a.ordinal()];
                if (i26 == 1) {
                    sVar.g7((List) g3Var2.f35301b);
                    return;
                }
                if (i26 != 2) {
                    return;
                }
                sVar.J6(false);
                lj0.b bVar2 = lj0.b.f112956j;
                bVar2.getClass();
                g22.e.b(sVar, bVar2);
                sVar.f44517y = false;
                return;
            case 4:
                EmergencyContactSendRequestActivity emergencyContactSendRequestActivity = (EmergencyContactSendRequestActivity) obj6;
                g3 g3Var3 = (g3) obj;
                EmergencyContactSendRequestActivity.a aVar2 = EmergencyContactSendRequestActivity.f32570v;
                g3Var3.getClass();
                int i27 = EmergencyContactSendRequestActivity.c.f32593a[g3Var3.f35300a.ordinal()];
                if (i27 == 1) {
                    emergencyContactSendRequestActivity.showProgressOverlay();
                    return;
                }
                if (i27 == 2) {
                    emergencyContactSendRequestActivity.hideProgressOverlay();
                    o13.p pVar = (o13.p) g3Var3.f35301b;
                    if (pVar != null) {
                        emergencyContactSendRequestActivity.ka().G4((p0) pVar.f128594a);
                        return;
                    }
                    return;
                }
                if (i27 != 3) {
                    u0.r();
                    return;
                }
                emergencyContactSendRequestActivity.hideProgressOverlay();
                emergencyContactSendRequestActivity.displayFailedMessage();
                a2 a2Var = a2.SAFETY_FEATURES;
                String str = g3Var3.f35302c;
                i2.f36769a.getClass();
                i2.a.f(a2Var, "EmergencyContactSendRequestActivity", str);
                return;
            case 5:
                jd1.a aVar3 = (jd1.a) obj6;
                Logger logger = aVar3.f98393a;
                fw.m mVar = (fw.m) obj;
                int i28 = jd1.a.f98392c;
                mVar.getClass();
                int i29 = jd1.a.b.f98395a[mVar.f73769b.ordinal()];
                if (i29 == 1) {
                    logger.debug("Received loading status...");
                    aVar3.showProgressOverlay();
                    return;
                }
                if (i29 == 2) {
                    logger.debug("Received success status");
                    aVar3.hideProgressOverlay();
                    if (aVar3.getSupportFragmentManager().M() > 0) {
                        aVar3.getSupportFragmentManager().Z();
                        return;
                    }
                    return;
                }
                if (i29 != 3) {
                    u0.r();
                    return;
                }
                logger.debug("Received error status");
                aVar3.hideProgressOverlay();
                Toast.makeText(aVar3, R.string.txt_error_occurred, 0).show();
                return;
            case 6:
                kv0.j jVar = (kv0.j) obj6;
                wd2.f fVar = (wd2.f) obj;
                int i30 = kv0.j.f106663m;
                fVar.getClass();
                if (fVar.f184456b) {
                    obj2 = null;
                } else {
                    fVar.f184456b = true;
                    obj2 = fVar.f184455a;
                }
                com.garmin.android.library.livetrack.d dVar = (com.garmin.android.library.livetrack.d) obj2;
                if (dVar != null) {
                    long j8 = dVar.f50196a;
                    p2 p2Var = jVar.f106670g;
                    if (dVar instanceof com.garmin.android.library.livetrack.d.c) {
                        jVar.C4(kv0.i.e.f106659a);
                        Iterator<T> it = wd2.m.a().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                if (((z1) next).f184693a == j8) {
                                    obj5 = next;
                                }
                            } else {
                                obj5 = null;
                            }
                        }
                        z1 z1Var = (z1) obj5;
                        if (z1Var != null) {
                            do {
                                value3 = p2Var.getValue();
                            } while (!p2Var.b(value3, c1.i((Set) value3, z1Var)));
                            Unit unit = Unit.INSTANCE;
                            return;
                        }
                        return;
                    }
                    if (dVar instanceof com.garmin.android.library.livetrack.d.b) {
                        jVar.C4(kv0.i.d.f106658a);
                        Iterator it3 = ((Iterable) p2Var.getValue()).iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                Object next2 = it3.next();
                                if (((z1) next2).f184693a == j8) {
                                    obj4 = next2;
                                }
                            } else {
                                obj4 = null;
                            }
                        }
                        z1 z1Var2 = (z1) obj4;
                        if (z1Var2 != null) {
                            do {
                                value2 = p2Var.getValue();
                            } while (!p2Var.b(value2, c1.f((Set) value2, z1Var2)));
                            Unit unit2 = Unit.INSTANCE;
                            return;
                        }
                        return;
                    }
                    if (!(dVar instanceof com.garmin.android.library.livetrack.d.a)) {
                        u0.r();
                        return;
                    }
                    jVar.C4(kv0.i.d.f106658a);
                    Iterator it4 = ((Iterable) p2Var.getValue()).iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            Object next3 = it4.next();
                            if (((z1) next3).f184693a == j8) {
                                obj3 = next3;
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    z1 z1Var3 = (z1) obj3;
                    if (z1Var3 != null) {
                        do {
                            value = p2Var.getValue();
                        } while (!p2Var.b(value, c1.f((Set) value, z1Var3)));
                    }
                    String str2 = "[handleLivetrackEvent] Livetrack error: " + ((com.garmin.android.library.livetrack.d.a) dVar).f50197b;
                    i2.a aVar4 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar4.getClass();
                    i2.a.b(a2Var2, "LivetrackStatusViewModel", str2);
                    Unit unit3 = Unit.INSTANCE;
                    return;
                }
                return;
            case 7:
                lo.b bVar3 = (lo.b) obj6;
                g22.e.f(bVar3);
                bVar3.f113949a.O0((am.l) obj);
                return;
            case 8:
                CourseChooserActivity courseChooserActivity = (CourseChooserActivity) obj6;
                fw.m mVar2 = (fw.m) obj;
                int i34 = CourseChooserActivity.f29147f;
                int i35 = CourseChooserActivity.a.f29153a[mVar2.f73769b.ordinal()];
                if (i35 == 1) {
                    courseChooserActivity.hideProgressOverlay();
                    T t7 = mVar2.f73770c;
                    if (t7 != 0) {
                        courseChooserActivity.f29148a = (List) t7;
                        courseChooserActivity.ca();
                        return;
                    }
                    return;
                }
                if (i35 == 2) {
                    courseChooserActivity.hideProgressOverlay();
                    courseChooserActivity.displayFailedMessage();
                    return;
                } else {
                    if (i35 != 3) {
                        return;
                    }
                    courseChooserActivity.showProgressOverlay();
                    return;
                }
            case 9:
                InviteByEmailActivity inviteByEmailActivity = (InviteByEmailActivity) obj6;
                o13.t tVar = inviteByEmailActivity.f43035a;
                fw.m mVar3 = (fw.m) obj;
                InviteByEmailActivity.a aVar5 = InviteByEmailActivity.f43034c;
                mVar3.getClass();
                hi0.a aVar6 = (hi0.a) mVar3.f73770c;
                int i36 = InviteByEmailActivity.b.f43037a[mVar3.f73769b.ordinal()];
                if (i36 == 1) {
                    ((Logger) tVar.getValue()).debug("Received loading status...");
                    inviteByEmailActivity.showProgressOverlay();
                    return;
                }
                if (i36 == 2) {
                    inviteByEmailActivity.hideProgressOverlay();
                    c22.f.d(c22.f.f23050a, inviteByEmailActivity, inviteByEmailActivity.getString(R.string.common_email_sent_success_title), inviteByEmailActivity.getString(R.string.message_email_invitation_sent, aVar6 != null ? aVar6.getDisplayName() : null), new o13.p(inviteByEmailActivity.getString(R.string.lbl_ok), new m92.f(inviteByEmailActivity, i18)), null, null, false, 112).show();
                    return;
                }
                if (i36 != 3) {
                    u0.r();
                    return;
                }
                ((Logger) tVar.getValue()).debug("Received error status");
                inviteByEmailActivity.hideProgressOverlay();
                fw.c cVar = mVar3.f73771d;
                if ((cVar instanceof fw.l) || (cVar instanceof r)) {
                    inviteByEmailActivity.ca();
                    return;
                } else {
                    c22.f.d(c22.f.f23050a, inviteByEmailActivity, inviteByEmailActivity.getString(R.string.title_email_not_sent), inviteByEmailActivity.getString(R.string.message_email_invitation_not_sent), new o13.p(inviteByEmailActivity.getString(R.string.lbl_ok), new o(27)), null, null, false, 112).show();
                    return;
                }
            case 10:
                GroupNotJoinedFragment groupNotJoinedFragment = (GroupNotJoinedFragment) obj6;
                g3 g3Var4 = (g3) obj;
                int i37 = GroupNotJoinedFragment.Y;
                g3Var4.getClass();
                int i38 = GroupNotJoinedFragment.b.f36167a[g3Var4.f35300a.ordinal()];
                if (i38 == 1) {
                    View view2 = groupNotJoinedFragment.F;
                    if (view2 == null) {
                        s.m("rootView");
                        throw null;
                    }
                    view2.setVisibility(8);
                    groupNotJoinedFragment.G6();
                    return;
                }
                if (i38 == 2) {
                    groupNotJoinedFragment.requireActivity().setResult(-1);
                    View view3 = groupNotJoinedFragment.F;
                    if (view3 == null) {
                        s.m("rootView");
                        throw null;
                    }
                    view3.setVisibility(0);
                    groupNotJoinedFragment.w6();
                    return;
                }
                if (i38 != 3) {
                    u0.r();
                    return;
                }
                View view4 = groupNotJoinedFragment.F;
                if (view4 == null) {
                    s.m("rootView");
                    throw null;
                }
                view4.setVisibility(0);
                groupNotJoinedFragment.w6();
                g22.e.c(groupNotJoinedFragment);
                return;
            case 11:
                FBTEditPreferencesActivity fBTEditPreferencesActivity = (FBTEditPreferencesActivity) obj6;
                String str3 = (String) obj;
                FBTEditPreferencesActivity.a aVar7 = FBTEditPreferencesActivity.f45500c;
                str3.getClass();
                switch (str3.hashCode()) {
                    case -1751432003:
                        if (str3.equals("FBTEditTargetTypeFragment")) {
                            ov1.m.f134192b.getClass();
                            fBTEditPreferencesActivity.da(new ov1.m(), str3);
                            return;
                        }
                        return;
                    case -1747672020:
                        if (str3.equals("FBTEditPreferencesFragment2")) {
                            if (fBTEditPreferencesActivity.getSupportFragmentManager().M() > 1) {
                                fBTEditPreferencesActivity.getSupportFragmentManager().a0(0, "FBTEditPreferencesFragment2");
                                return;
                            } else {
                                ov1.j.f134173d.getClass();
                                fBTEditPreferencesActivity.da(new ov1.j(null, i19, false ? 1 : 0), str3);
                                return;
                            }
                        }
                        return;
                    case -1243140612:
                        if (str3.equals("FBTEditFitnessDaysAvailableFragment")) {
                            ov1.c.f134143b.getClass();
                            fBTEditPreferencesActivity.da(new ov1.c(), str3);
                            return;
                        }
                        return;
                    case -1176794338:
                        if (str3.equals("FBTSelectSwimAbilityFragment")) {
                            ov1.t.f134225b.getClass();
                            fBTEditPreferencesActivity.da(new ov1.t(), str3);
                            return;
                        }
                        return;
                    case -746357180:
                        if (str3.equals("FBTEditStrengthWorkoutTypeFragment")) {
                            ov1.l.f134184c.getClass();
                            fBTEditPreferencesActivity.da(new ov1.l(), str3);
                            return;
                        }
                        return;
                    case 525791086:
                        if (str3.equals("FBTEditTriathlonSwimDaysFragment")) {
                            w.f134236b.getClass();
                            fBTEditPreferencesActivity.da(new w(), str3);
                            return;
                        }
                        return;
                    case 645158341:
                        if (str3.equals("FBTEditLongDaysFragment")) {
                            ov1.f.f134159c.getClass();
                            fBTEditPreferencesActivity.da(new ov1.f(), str3);
                            return;
                        }
                        return;
                    case 672397805:
                        if (str3.equals("FBTEditHillTypeFragment")) {
                            ov1.d.f134149c.getClass();
                            fBTEditPreferencesActivity.da(new ov1.d(), str3);
                            return;
                        }
                        return;
                    case 950460184:
                        if (str3.equals("FBTEditTrainingLevelFragment")) {
                            ov1.r.f134213c.getClass();
                            fBTEditPreferencesActivity.da(new ov1.r(), str3);
                            return;
                        }
                        return;
                    case 1659444830:
                        if (str3.equals("FBTEditElevationProfileFragment")) {
                            ov1.b.f134135c.getClass();
                            fBTEditPreferencesActivity.da(new ov1.b(), str3);
                            return;
                        }
                        return;
                    case 1818589731:
                        if (str3.equals("FBTEditTrainingDaysFragment")) {
                            ov1.p.f134204c.getClass();
                            fBTEditPreferencesActivity.da(new ov1.p(), str3);
                            return;
                        }
                        return;
                    case 2044160865:
                        if (str3.equals("FBTEditTriDSWWorkoutTargetFrag")) {
                            y.f134244b.getClass();
                            fBTEditPreferencesActivity.da(new y(), str3);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            case 12:
                ov1.j jVar2 = (ov1.j) obj6;
                g3 g3Var5 = (g3) obj;
                ov1.j.a aVar8 = ov1.j.f134173d;
                g3Var5.getClass();
                int i39 = ov1.j.b.f134177a[g3Var5.f35300a.ordinal()];
                if (i39 == 1) {
                    androidx.fragment.app.m activity2 = jVar2.getActivity();
                    if (activity2 != null) {
                        activity2.setResult(-1);
                        activity2.finish();
                        return;
                    }
                    return;
                }
                if (i39 == 2) {
                    g22.e.f(jVar2);
                    new androidx.appcompat.app.e.a(jVar2.requireContext()).setTitle(R.string.pregnancy_something_went_wrong).setMessage(R.string.pregnancy_save_again).setCancelable(false).setPositiveButton(R.string.lbl_retry, new ng1.c1(jVar2, i15)).setNegativeButton(R.string.lbl_cancel, new mt0.y(13)).create().show();
                    return;
                } else if (i39 == 3) {
                    g22.e.l(jVar2);
                    return;
                } else {
                    u0.r();
                    return;
                }
            case 13:
                ResetWalletActivity resetWalletActivity = (ResetWalletActivity) obj6;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ResetWalletActivity.a aVar9 = ResetWalletActivity.f52134l;
                if (!zBooleanValue) {
                    br2.c.f19585a.g(null, resetWalletActivity);
                    return;
                } else {
                    resetWalletActivity.setResult(100);
                    resetWalletActivity.finish();
                    return;
                }
            case 14:
                ITPDashboardActivity iTPDashboardActivity = (ITPDashboardActivity) obj6;
                g3 g3Var6 = (g3) obj;
                ITPDashboardActivity.a aVar10 = ITPDashboardActivity.f45618m;
                g3Var6.getClass();
                int i44 = ITPDashboardActivity.b.f45627a[g3Var6.f35300a.ordinal()];
                if (i44 == 1) {
                    iTPDashboardActivity.showProgressOverlay();
                    return;
                }
                if (i44 == 2) {
                    iTPDashboardActivity.hideProgressOverlay();
                    return;
                } else if (i44 == 3) {
                    iTPDashboardActivity.ma(true, new pw1.a(iTPDashboardActivity, i15));
                    return;
                } else {
                    u0.r();
                    return;
                }
            case 15:
                Context context = (Context) obj6;
                pw.a aVar11 = (pw.a) obj;
                ww.f.f187506i.getClass();
                if (aVar11 != null) {
                    bundle = new Bundle();
                    bundle.putInt("KEY_MEASUREMENT_TYPE", 2);
                    bundle.putParcelable("KEY_MEASUREMENT", aVar11);
                } else {
                    bundle = null;
                }
                HelpActivity.a aVar12 = HelpActivity.f36653a;
                ro0.l lVar = ro0.l.BLOOD_PRESSURE;
                aVar12.getClass();
                HelpActivity.a.d(context, lVar, "DEFAULT_ACTION", bundle);
                return;
            case 16:
                com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b bVar4 = (com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b) obj6;
                Logger logger2 = com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b.f51610n;
                ((com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b.EnumC1070b) obj).getClass();
                for (l1 l1Var : bVar4.f51622l) {
                    l1Var.getClass();
                    l1Var.c(null);
                }
                bVar4.B4();
                return;
            case 17:
                sf0.g gVar = (sf0.g) obj6;
                sf0.i iVar = (sf0.i) obj;
                int i45 = sf0.g.f158842w;
                if (iVar != null) {
                    if (iVar instanceof sf0.i.d) {
                        String str4 = "handleEpochReloadState:showEpochReloadState() for date:" + fz0.d.b(gVar.U6());
                        i2.a aVar13 = i2.f36769a;
                        a2 a2Var3 = a2.GENERAL;
                        aVar13.getClass();
                        i2.a.b(a2Var3, "IEpochReload", str4);
                        gVar.c7(null, true);
                        return;
                    }
                    if (iVar instanceof sf0.i.c) {
                        i2.a aVar14 = i2.f36769a;
                        a2 a2Var4 = a2.GENERAL;
                        aVar14.getClass();
                        i2.a.b(a2Var4, "IEpochReload", "handleEpochReloadState:showLoading()");
                        s2 s2Var = gVar.f158846v;
                        if (s2Var != null) {
                            s2Var.showProgressOverlay();
                            return;
                        }
                        return;
                    }
                    if (!(iVar instanceof sf0.i.e)) {
                        if (iVar instanceof sf0.i.b) {
                            i2.a aVar15 = i2.f36769a;
                            a2 a2Var5 = a2.GENERAL;
                            aVar15.getClass();
                            i2.a.b(a2Var5, "IEpochReload", "handleEpochReloadState:epochError()");
                            s2 s2Var2 = gVar.f158846v;
                            if (s2Var2 != null) {
                                s2Var2.hideProgressOverlay();
                            }
                            String string2 = gVar.getString(R.string.epoch_try_again_msg);
                            string2.getClass();
                            gVar.k2(R.string.epoch_unable_reload_chart, string2);
                            return;
                        }
                        if (!(iVar instanceof sf0.i.f)) {
                            if (!(iVar instanceof sf0.i.a)) {
                                u0.r();
                                return;
                            }
                            i2.a aVar16 = i2.f36769a;
                            a2 a2Var6 = a2.GENERAL;
                            aVar16.getClass();
                            i2.a.b(a2Var6, "IEpochReload", "handleEpochReloadState:completedEpochReload()");
                            s2 s2Var3 = gVar.f158846v;
                            if (s2Var3 != null) {
                                s2Var3.hideProgressOverlay();
                            }
                            if (((sf0.i.a) iVar).f158851a) {
                                gVar.G6();
                                gVar.E6();
                                return;
                            }
                            return;
                        }
                        i2.a aVar17 = i2.f36769a;
                        a2 a2Var7 = a2.GENERAL;
                        aVar17.getClass();
                        i2.a.b(a2Var7, "IEpochReload", "handleEpochReloadOperation:showVerifyDevice()");
                        s2 s2Var4 = gVar.f158846v;
                        if (s2Var4 != null) {
                            s2Var4.hideProgressOverlay();
                        }
                        List<uf0.a> list = ((sf0.i.f) iVar).f158857a;
                        i2.a.b(a2Var7, "IEpochReload", "displayDeviceSelection()");
                        if (gVar.getParentFragmentManager().G("devicePopup") == null) {
                            sf0.e.b bVar5 = sf0.e.f158826d;
                            String strK4 = gVar.K4();
                            bVar5.getClass();
                            list.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelableArrayList("DEVICES_LIST", new ArrayList<>(list));
                            bundle2.putString("DATE_SELECTED", strK4);
                            sf0.e eVar = new sf0.e();
                            eVar.setArguments(bundle2);
                            eVar.setCancelable(false);
                            eVar.show(gVar.getParentFragmentManager(), "devicePopup");
                            return;
                        }
                        return;
                    }
                    sf0.i.e eVar2 = (sf0.i.e) iVar;
                    uf0.b bVar6 = eVar2.f158855a;
                    String strN = fb1.c.n("handleEpochReloadState:onSuccess() status: ", bVar6 != null ? bVar6.getStatus() : null);
                    i2.a aVar18 = i2.f36769a;
                    a2 a2Var8 = a2.GENERAL;
                    aVar18.getClass();
                    i2.a.b(a2Var8, "IEpochReload", strN);
                    s2 s2Var5 = gVar.f158846v;
                    if (s2Var5 != null) {
                        s2Var5.hideProgressOverlay();
                    }
                    String status = bVar6 != null ? bVar6.getStatus() : null;
                    if (status != null) {
                        switch (status) {
                            case "SUBMITTED":
                                string = gVar.getString(R.string.epoch_chart_processing_label);
                                break;
                            case "DATE_NOT_ARCHIVED":
                                string = gVar.getString(R.string.txt_empty_page_no_data);
                                break;
                            case "CHECK_BACK_LATER":
                                string = gVar.getString(R.string.epoch_chart_processing_label);
                                break;
                            case "NO_FILES_FOUND":
                                string = gVar.getString(R.string.txt_empty_page_no_data);
                                break;
                            case "DENIED":
                                String string3 = gVar.getString(R.string.epoch_chart_reload_limit);
                                string3.getClass();
                                gVar.k2(R.string.epoch_help_reload_limit_header, string3);
                            default:
                                string = null;
                                break;
                        }
                    } else {
                        string = null;
                    }
                    if (string != null) {
                        gVar.c7(string, false);
                        if (eVar2.f158856b) {
                            gVar.G6();
                            gVar.E6();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 18:
                com.garmin.android.apps.connectmobile.performance.stats.a aVar19 = (com.garmin.android.apps.connectmobile.performance.stats.a) obj6;
                g3 g3Var7 = (g3) obj;
                com.garmin.android.apps.connectmobile.performance.stats.a.C0743a c0743a = com.garmin.android.apps.connectmobile.performance.stats.a.f40030n;
                g3Var7.getClass();
                p pVar2 = g3Var7.f35300a;
                StressScoresSummaryDTO stressScoresSummaryDTO = (StressScoresSummaryDTO) g3Var7.f35301b;
                int i46 = com.garmin.android.apps.connectmobile.performance.stats.a.c.f40037a[pVar2.ordinal()];
                if (i46 == 1) {
                    aVar19.G6();
                    return;
                }
                if (i46 != 2) {
                    if (i46 != 3) {
                        u0.r();
                        return;
                    } else {
                        aVar19.w6();
                        g22.e.a(aVar19, null);
                        return;
                    }
                }
                aVar19.w6();
                ArrayList arrayList = stressScoresSummaryDTO != null ? stressScoresSummaryDTO.f39904a : null;
                a61.e eVar3 = a61.e.f1563a;
                DateTime dateTimePlusDays = aVar19.f40031h;
                if (dateTimePlusDays == null) {
                    s.m("mStartDate");
                    throw null;
                }
                DateTime dateTime = aVar19.f40032i;
                if (dateTime == null) {
                    s.m("mEndDate");
                    throw null;
                }
                eVar3.getClass();
                ArrayList arrayList2 = new ArrayList();
                if (arrayList == null || arrayList.isEmpty()) {
                    th3 = null;
                    arrayList2 = null;
                } else {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
                    HashMap map = new HashMap();
                    int size = arrayList.size();
                    int i47 = 0;
                    while (i47 < size) {
                        o61.i iVar2 = (o61.i) arrayList.get(i47);
                        Throwable th5 = th4;
                        if (iVar2 != null) {
                            map.put(iVar2.f129595a, Integer.valueOf(iVar2.f129596b));
                        }
                        i47++;
                        th4 = th5;
                    }
                    th3 = th4;
                    DateTime dateTimeWithTimeAtStartOfDay = dateTime.plusDays(1).withTimeAtStartOfDay();
                    while (dateTimePlusDays.isBefore(dateTimeWithTimeAtStartOfDay)) {
                        String string4 = dateTimePlusDays.toString(DateTimeFormat.forPattern("yyyy-MM-dd"));
                        o61.i iVar3 = new o61.i();
                        iVar3.f129595a = string4;
                        Object orDefault = map.getOrDefault(string4, 0);
                        orDefault.getClass();
                        iVar3.f129596b = ((Number) orDefault).intValue();
                        arrayList2.add(iVar3);
                        dateTimePlusDays = dateTimePlusDays.plusDays(1);
                        dateTimePlusDays.getClass();
                    }
                    p13.c0.u(arrayList2, new a61.c(new a61.d(simpleDateFormat, i17), i19));
                }
                rz.a<List<o61.i>, d00.a> aVar20 = aVar19.f40033j;
                if (aVar20 == null) {
                    s.m("barChartConfigurator");
                    throw th3;
                }
                aVar20.c();
                rz.a<List<o61.i>, d00.a> aVar21 = aVar19.f40033j;
                if (aVar21 != null) {
                    aVar21.a(arrayList2, aVar19.requireContext().getString(R.string.txt_empty_page_no_data));
                    return;
                } else {
                    s.m("barChartConfigurator");
                    throw th3;
                }
            case 19:
                final FitPayCardDetailsActivity fitPayCardDetailsActivity = (FitPayCardDetailsActivity) obj6;
                FitPayCardDetailsActivity.a aVar22 = FitPayCardDetailsActivity.F;
                if (!((Boolean) obj).booleanValue()) {
                    fitPayCardDetailsActivity.ea().debug("initListeners: viewModel initialization failed");
                    fitPayCardDetailsActivity.da();
                    return;
                }
                fitPayCardDetailsActivity.ea().debug("initListeners: viewModel initialization complete");
                View viewFindViewById = fitPayCardDetailsActivity.findViewById(R.id.generic_swipe_refresh_layout);
                viewFindViewById.getClass();
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewFindViewById;
                fitPayCardDetailsActivity.f51678l = swipeRefreshLayout;
                swipeRefreshLayout.setEnabled(false);
                ArrayList arrayList3 = fitPayCardDetailsActivity.f51676j;
                View viewFindViewById2 = fitPayCardDetailsActivity.findViewById(R.id.card_image_view);
                viewFindViewById2.getClass();
                fitPayCardDetailsActivity.f51681o = (ImageView) viewFindViewById2;
                View viewFindViewById3 = fitPayCardDetailsActivity.findViewById(R.id.wallet_item_status_recycler_view);
                viewFindViewById3.getClass();
                RecyclerView recyclerView = (RecyclerView) viewFindViewById3;
                fitPayCardDetailsActivity.f51679m = recyclerView;
                if (fitPayCardDetailsActivity.f51675i) {
                    String string5 = fitPayCardDetailsActivity.getString(R.string.this_device_has_been_removed);
                    string5.getClass();
                    arrayList3.add(string5);
                }
                recyclerView.setAdapter(new up2.c(fitPayCardDetailsActivity, arrayList3));
                recyclerView.setLayoutManager(new LinearLayoutManager(fitPayCardDetailsActivity));
                recyclerView.setNestedScrollingEnabled(false);
                if (!arrayList3.isEmpty()) {
                    RecyclerView recyclerView2 = fitPayCardDetailsActivity.f51679m;
                    if (recyclerView2 == null) {
                        s.m("walletItemStatusRecyclerView");
                        throw null;
                    }
                    recyclerView2.setVisibility(0);
                }
                ImageView imageView = fitPayCardDetailsActivity.f51681o;
                if (imageView == null) {
                    s.m("cardImageView");
                    throw null;
                }
                tp2.g gVar2 = fitPayCardDetailsActivity.f51680n;
                if (gVar2 == null) {
                    s.m("viewModel");
                    throw null;
                }
                String strO = yo2.b.o(gVar2.y4(), null, 3);
                tp2.g gVar3 = fitPayCardDetailsActivity.f51680n;
                if (gVar3 == null) {
                    s.m("viewModel");
                    throw null;
                }
                yr2.j.a(imageView, strO, 30, gVar3.y4().getCardType());
                ImageView imageView2 = fitPayCardDetailsActivity.f51681o;
                if (imageView2 == null) {
                    s.m("cardImageView");
                    throw null;
                }
                tp2.g gVar4 = fitPayCardDetailsActivity.f51680n;
                if (gVar4 == null) {
                    s.m("viewModel");
                    throw null;
                }
                String strI = gVar4.y4().getCardType();
                tp2.g gVar5 = fitPayCardDetailsActivity.f51680n;
                if (gVar5 == null) {
                    s.m("viewModel");
                    throw null;
                }
                imageView2.setContentDescription(fitPayCardDetailsActivity.getString(R.string.lbl_last_four_digits, strI, gVar5.y4().f0(false)));
                View viewFindViewById4 = fitPayCardDetailsActivity.findViewById(R.id.card_transaction_text_view);
                viewFindViewById4.getClass();
                fitPayCardDetailsActivity.f51682p = (TextView) viewFindViewById4;
                View viewFindViewById5 = fitPayCardDetailsActivity.findViewById(R.id.no_transactions_desc);
                viewFindViewById5.getClass();
                fitPayCardDetailsActivity.f51683q = (TextView) viewFindViewById5;
                View viewFindViewById6 = fitPayCardDetailsActivity.findViewById(R.id.card_transaction_recycler_view);
                viewFindViewById6.getClass();
                fitPayCardDetailsActivity.f51684r = (RecyclerView) viewFindViewById6;
                TextView textView = fitPayCardDetailsActivity.f51682p;
                if (textView == null) {
                    s.m("transactionTitleTextView");
                    throw null;
                }
                textView.setText(fitPayCardDetailsActivity.getString(R.string.recent_transactions));
                TextView textView2 = fitPayCardDetailsActivity.f51683q;
                if (textView2 == null) {
                    s.m("noTransactionDescTextView");
                    throw null;
                }
                textView2.setText(fitPayCardDetailsActivity.getString(R.string.card_no_transactions));
                tp2.g gVar6 = fitPayCardDetailsActivity.f51680n;
                if (gVar6 == null) {
                    s.m("viewModel");
                    throw null;
                }
                List<vp2.c> list2 = gVar6.f165966g;
                if (list2 == null || list2.isEmpty()) {
                    fitPayCardDetailsActivity.ea().warn("setupTransactionSection: card transaction is not available for card");
                    TextView textView3 = fitPayCardDetailsActivity.f51683q;
                    if (textView3 == null) {
                        s.m("noTransactionDescTextView");
                        throw null;
                    }
                    textView3.setVisibility(0);
                    RecyclerView recyclerView3 = fitPayCardDetailsActivity.f51684r;
                    if (recyclerView3 == null) {
                        s.m("transactionsRecyclerView");
                        throw null;
                    }
                    recyclerView3.setVisibility(8);
                } else {
                    TextView textView4 = fitPayCardDetailsActivity.f51683q;
                    if (textView4 == null) {
                        s.m("noTransactionDescTextView");
                        throw null;
                    }
                    textView4.setVisibility(8);
                    RecyclerView recyclerView4 = fitPayCardDetailsActivity.f51684r;
                    if (recyclerView4 == null) {
                        s.m("transactionsRecyclerView");
                        throw null;
                    }
                    recyclerView4.setVisibility(0);
                    RecyclerView recyclerView5 = fitPayCardDetailsActivity.f51684r;
                    if (recyclerView5 == null) {
                        s.m("transactionsRecyclerView");
                        throw null;
                    }
                    recyclerView5.setAdapter(new up2.b(fitPayCardDetailsActivity, list2));
                    recyclerView5.setLayoutManager(new LinearLayoutManager(fitPayCardDetailsActivity));
                    recyclerView5.setNestedScrollingEnabled(false);
                }
                View viewFindViewById7 = fitPayCardDetailsActivity.findViewById(R.id.bank_support_text_view);
                viewFindViewById7.getClass();
                fitPayCardDetailsActivity.f51685t = (TextView) viewFindViewById7;
                View viewFindViewById8 = fitPayCardDetailsActivity.findViewById(R.id.bank_support_recycler_view);
                viewFindViewById8.getClass();
                fitPayCardDetailsActivity.f51686v = (RecyclerView) viewFindViewById8;
                View viewFindViewById9 = fitPayCardDetailsActivity.findViewById(R.id.bank_support_no_items_description);
                viewFindViewById9.getClass();
                fitPayCardDetailsActivity.f51687w = (TextView) viewFindViewById9;
                tp2.g gVar7 = fitPayCardDetailsActivity.f51680n;
                if (gVar7 == null) {
                    s.m("viewModel");
                    throw null;
                }
                String strF = gVar7.y4().getIssuerName();
                if (strF == null) {
                    strF = "";
                }
                String string6 = fitPayCardDetailsActivity.getString(R.string.issuer_support, strF);
                string6.getClass();
                TextView textView5 = fitPayCardDetailsActivity.f51685t;
                if (textView5 == null) {
                    s.m("bankSupportTitleTextView");
                    throw null;
                }
                textView5.setText(string6);
                tp2.g gVar8 = fitPayCardDetailsActivity.f51680n;
                if (gVar8 == null) {
                    s.m("viewModel");
                    throw null;
                }
                List list3 = gVar8.f165967h;
                if (list3 == null) {
                    list3 = j0.f134944a;
                }
                if (s.g(gVar8.f165968i, Boolean.FALSE) || list3.isEmpty()) {
                    TextView textView6 = fitPayCardDetailsActivity.f51687w;
                    if (textView6 == null) {
                        s.m("bankSupportNoItemsDescTextView");
                        throw null;
                    }
                    textView6.setVisibility(0);
                } else {
                    TextView textView7 = fitPayCardDetailsActivity.f51687w;
                    if (textView7 == null) {
                        s.m("bankSupportNoItemsDescTextView");
                        throw null;
                    }
                    textView7.setVisibility(8);
                }
                RecyclerView recyclerView6 = fitPayCardDetailsActivity.f51686v;
                if (recyclerView6 == null) {
                    s.m("bankSupportRecyclerView");
                    throw null;
                }
                recyclerView6.setAdapter(new up2.a(fitPayCardDetailsActivity, list3));
                recyclerView6.setLayoutManager(new LinearLayoutManager(fitPayCardDetailsActivity));
                recyclerView6.setNestedScrollingEnabled(false);
                View viewFindViewById10 = fitPayCardDetailsActivity.findViewById(R.id.card_info_text_view);
                viewFindViewById10.getClass();
                fitPayCardDetailsActivity.f51688x = (TextView) viewFindViewById10;
                View viewFindViewById11 = fitPayCardDetailsActivity.findViewById(R.id.account_number_text_view);
                viewFindViewById11.getClass();
                fitPayCardDetailsActivity.f51690z = (TextView) viewFindViewById11;
                View viewFindViewById12 = fitPayCardDetailsActivity.findViewById(R.id.device_account_number_text_view);
                viewFindViewById12.getClass();
                fitPayCardDetailsActivity.f51689y = (TextView) viewFindViewById12;
                View viewFindViewById13 = fitPayCardDetailsActivity.findViewById(R.id.device_account_number_helper_text_view);
                viewFindViewById13.getClass();
                fitPayCardDetailsActivity.A = (TextView) viewFindViewById13;
                TextView textView8 = fitPayCardDetailsActivity.f51688x;
                if (textView8 == null) {
                    s.m("cardInfoTitleTextView");
                    throw null;
                }
                textView8.setText(fitPayCardDetailsActivity.getString(R.string.card_info));
                TextView textView9 = fitPayCardDetailsActivity.A;
                if (textView9 == null) {
                    s.m("deviceAccountNoHelperTextView");
                    throw null;
                }
                textView9.setText(fitPayCardDetailsActivity.getString(R.string.wallet_dan_msg));
                TextView textView10 = fitPayCardDetailsActivity.f51689y;
                if (textView10 == null) {
                    s.m("accountNumberTitleTextView");
                    throw null;
                }
                textView10.setText(fitPayCardDetailsActivity.getString(R.string.device_account_number));
                tp2.g gVar9 = fitPayCardDetailsActivity.f51680n;
                if (gVar9 == null) {
                    s.m("viewModel");
                    throw null;
                }
                String strF0 = gVar9.y4().f0(true);
                if (strF0 != null) {
                    TextView textView11 = fitPayCardDetailsActivity.f51690z;
                    if (textView11 == null) {
                        s.m("deviceAccountNumberTextView");
                        throw null;
                    }
                    textView11.setText(strF0);
                }
                View viewFindViewById14 = fitPayCardDetailsActivity.findViewById(R.id.suspend_unsuspend_card_button);
                viewFindViewById14.getClass();
                fitPayCardDetailsActivity.B = (Button) viewFindViewById14;
                View viewFindViewById15 = fitPayCardDetailsActivity.findViewById(R.id.bank_suspended_card_secondary_text_view);
                viewFindViewById15.getClass();
                fitPayCardDetailsActivity.C = (TextView) viewFindViewById15;
                View viewFindViewById16 = fitPayCardDetailsActivity.findViewById(R.id.remove_card_button);
                viewFindViewById16.getClass();
                fitPayCardDetailsActivity.D = (Button) viewFindViewById16;
                TextView textView12 = fitPayCardDetailsActivity.C;
                if (textView12 == null) {
                    s.m("bankSuspendCardSecondaryTextView");
                    throw null;
                }
                textView12.setText(fitPayCardDetailsActivity.getString(R.string.your_bank_has_suspended_this_card));
                Button button = fitPayCardDetailsActivity.D;
                if (button == null) {
                    s.m("removeCardButton");
                    throw null;
                }
                button.setText(fitPayCardDetailsActivity.getString(R.string.card_remove));
                tp2.g gVar10 = fitPayCardDetailsActivity.f51680n;
                if (gVar10 == null) {
                    s.m("viewModel");
                    throw null;
                }
                String strH = gVar10.y4().getCardState();
                if (strH != null && strH.length() != 0) {
                    try {
                        enumValueOf = Enum.valueOf(qs2.f.class, strH);
                    } catch (IllegalArgumentException unused) {
                        enumValueOf = null;
                    }
                    break;
                } else {
                    enumValueOf = null;
                }
                qs2.f fVar2 = (qs2.f) enumValueOf;
                if (fVar2 != null) {
                    fitPayCardDetailsActivity.fa(fVar2);
                } else {
                    fitPayCardDetailsActivity.ea().error("setupCardManagementSection: unknown state can not handle card state management");
                    Button button2 = fitPayCardDetailsActivity.B;
                    if (button2 == null) {
                        s.m("suspendUnSuspendCardButton");
                        throw null;
                    }
                    button2.setVisibility(8);
                }
                Button button3 = fitPayCardDetailsActivity.B;
                if (button3 == null) {
                    s.m("suspendUnSuspendCardButton");
                    throw null;
                }
                button3.setOnClickListener(new View.OnClickListener() { // from class: tp2.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view5) {
                        Enum enumValueOf2;
                        String str5;
                        int i48 = 1;
                        switch (i17) {
                            case 0:
                                FitPayCardDetailsActivity.a aVar23 = FitPayCardDetailsActivity.F;
                                Boolean bool = Boolean.TRUE;
                                FitPayCardDetailsActivity fitPayCardDetailsActivity2 = fitPayCardDetailsActivity;
                                hn2.c.ba(fitPayCardDetailsActivity2, bool, null, null, 14);
                                fitPayCardDetailsActivity2.ea().debug("handleSuspendUnsuspendCardState");
                                g gVar11 = fitPayCardDetailsActivity2.f51680n;
                                if (gVar11 == null) {
                                    s.m("viewModel");
                                    throw null;
                                }
                                String cardState = gVar11.y4().getCardState();
                                if (cardState == null || cardState.length() == 0) {
                                    enumValueOf2 = null;
                                } else {
                                    try {
                                        enumValueOf2 = Enum.valueOf(qs2.f.class, cardState);
                                    } catch (IllegalArgumentException unused2) {
                                        enumValueOf2 = null;
                                    }
                                }
                                qs2.f fVar3 = (qs2.f) enumValueOf2;
                                int i49 = fVar3 == null ? -1 : FitPayCardDetailsActivity.b.f51692b[fVar3.ordinal()];
                                if (i49 == 1) {
                                    i0 i0VarW = f0.w(fitPayCardDetailsActivity2);
                                    x53.c cVar2 = s0.f129406a;
                                    ge1.b.T(i0VarW, u53.o.f168762a, null, new d(fitPayCardDetailsActivity2, null), 2);
                                    return;
                                } else if (i49 != 3) {
                                    fitPayCardDetailsActivity2.da();
                                    Unit unit4 = Unit.INSTANCE;
                                    return;
                                } else {
                                    i0 i0VarW2 = f0.w(fitPayCardDetailsActivity2);
                                    x53.c cVar3 = s0.f129406a;
                                    ge1.b.T(i0VarW2, u53.o.f168762a, null, new e(fitPayCardDetailsActivity2, null), 2);
                                    return;
                                }
                                break;
                            default:
                                FitPayCardDetailsActivity.a aVar24 = FitPayCardDetailsActivity.F;
                                FitPayCardDetailsActivity fitPayCardDetailsActivity3 = fitPayCardDetailsActivity;
                                a aVar25 = new a(fitPayCardDetailsActivity3, i48);
                                String string7 = fitPayCardDetailsActivity3.getString(R.string.lbl_remove);
                                string7.getClass();
                                String string8 = fitPayCardDetailsActivity3.getString(R.string.lbl_cancel);
                                string8.getClass();
                                String string9 = fitPayCardDetailsActivity3.getString(R.string.wallet_remove_card);
                                string9.getClass();
                                String str6 = fitPayCardDetailsActivity3.f51674h;
                                if (str6 == null || str6.length() == 0) {
                                    x0 x0Var = x0.f105818a;
                                    String string10 = fitPayCardDetailsActivity3.getString(R.string.wallet_remove_card_confirmation_message);
                                    string10.getClass();
                                    g gVar12 = fitPayCardDetailsActivity3.f51680n;
                                    if (gVar12 == null) {
                                        s.m("viewModel");
                                        throw null;
                                    }
                                    str5 = String.format(string10, Arrays.copyOf(new Object[]{gVar12.y4().getShortDescription()}, 1));
                                } else {
                                    x0 x0Var2 = x0.f105818a;
                                    String string11 = fitPayCardDetailsActivity3.getString(R.string.wallet_remove_card_from_watch_confirmation);
                                    string11.getClass();
                                    g gVar13 = fitPayCardDetailsActivity3.f51680n;
                                    if (gVar13 == null) {
                                        s.m("viewModel");
                                        throw null;
                                    }
                                    str5 = String.format(string11, Arrays.copyOf(new Object[]{gVar13.y4().getShortDescription(), fitPayCardDetailsActivity3.f51674h}, 2));
                                }
                                androidx.appcompat.app.e eVarQ = br2.c.q(br2.c.f19585a, fitPayCardDetailsActivity3, string9, str5, new o13.p(string7, new s5.a(aVar25, 28)), new o13.p(string8, new td0.a((byte) 0, 27)), null, false, 224);
                                if (eVarQ != null) {
                                    eVarQ.show();
                                    return;
                                }
                                return;
                        }
                    }
                });
                Button button4 = fitPayCardDetailsActivity.D;
                if (button4 == null) {
                    s.m("removeCardButton");
                    throw null;
                }
                button4.setOnClickListener(new View.OnClickListener() { // from class: tp2.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view5) {
                        Enum enumValueOf2;
                        String str5;
                        int i48 = 1;
                        switch (i19) {
                            case 0:
                                FitPayCardDetailsActivity.a aVar23 = FitPayCardDetailsActivity.F;
                                Boolean bool = Boolean.TRUE;
                                FitPayCardDetailsActivity fitPayCardDetailsActivity2 = fitPayCardDetailsActivity;
                                hn2.c.ba(fitPayCardDetailsActivity2, bool, null, null, 14);
                                fitPayCardDetailsActivity2.ea().debug("handleSuspendUnsuspendCardState");
                                g gVar11 = fitPayCardDetailsActivity2.f51680n;
                                if (gVar11 == null) {
                                    s.m("viewModel");
                                    throw null;
                                }
                                String cardState = gVar11.y4().getCardState();
                                if (cardState == null || cardState.length() == 0) {
                                    enumValueOf2 = null;
                                } else {
                                    try {
                                        enumValueOf2 = Enum.valueOf(qs2.f.class, cardState);
                                    } catch (IllegalArgumentException unused2) {
                                        enumValueOf2 = null;
                                    }
                                }
                                qs2.f fVar3 = (qs2.f) enumValueOf2;
                                int i49 = fVar3 == null ? -1 : FitPayCardDetailsActivity.b.f51692b[fVar3.ordinal()];
                                if (i49 == 1) {
                                    i0 i0VarW = f0.w(fitPayCardDetailsActivity2);
                                    x53.c cVar2 = s0.f129406a;
                                    ge1.b.T(i0VarW, u53.o.f168762a, null, new d(fitPayCardDetailsActivity2, null), 2);
                                    return;
                                } else if (i49 != 3) {
                                    fitPayCardDetailsActivity2.da();
                                    Unit unit4 = Unit.INSTANCE;
                                    return;
                                } else {
                                    i0 i0VarW2 = f0.w(fitPayCardDetailsActivity2);
                                    x53.c cVar3 = s0.f129406a;
                                    ge1.b.T(i0VarW2, u53.o.f168762a, null, new e(fitPayCardDetailsActivity2, null), 2);
                                    return;
                                }
                                break;
                            default:
                                FitPayCardDetailsActivity.a aVar24 = FitPayCardDetailsActivity.F;
                                FitPayCardDetailsActivity fitPayCardDetailsActivity3 = fitPayCardDetailsActivity;
                                a aVar25 = new a(fitPayCardDetailsActivity3, i48);
                                String string7 = fitPayCardDetailsActivity3.getString(R.string.lbl_remove);
                                string7.getClass();
                                String string8 = fitPayCardDetailsActivity3.getString(R.string.lbl_cancel);
                                string8.getClass();
                                String string9 = fitPayCardDetailsActivity3.getString(R.string.wallet_remove_card);
                                string9.getClass();
                                String str6 = fitPayCardDetailsActivity3.f51674h;
                                if (str6 == null || str6.length() == 0) {
                                    x0 x0Var = x0.f105818a;
                                    String string10 = fitPayCardDetailsActivity3.getString(R.string.wallet_remove_card_confirmation_message);
                                    string10.getClass();
                                    g gVar12 = fitPayCardDetailsActivity3.f51680n;
                                    if (gVar12 == null) {
                                        s.m("viewModel");
                                        throw null;
                                    }
                                    str5 = String.format(string10, Arrays.copyOf(new Object[]{gVar12.y4().getShortDescription()}, 1));
                                } else {
                                    x0 x0Var2 = x0.f105818a;
                                    String string11 = fitPayCardDetailsActivity3.getString(R.string.wallet_remove_card_from_watch_confirmation);
                                    string11.getClass();
                                    g gVar13 = fitPayCardDetailsActivity3.f51680n;
                                    if (gVar13 == null) {
                                        s.m("viewModel");
                                        throw null;
                                    }
                                    str5 = String.format(string11, Arrays.copyOf(new Object[]{gVar13.y4().getShortDescription(), fitPayCardDetailsActivity3.f51674h}, 2));
                                }
                                androidx.appcompat.app.e eVarQ = br2.c.q(br2.c.f19585a, fitPayCardDetailsActivity3, string9, str5, new o13.p(string7, new s5.a(aVar25, 28)), new o13.p(string8, new td0.a((byte) 0, 27)), null, false, 224);
                                if (eVarQ != null) {
                                    eVarQ.show();
                                    return;
                                }
                                return;
                        }
                    }
                });
                hn2.c.ba(fitPayCardDetailsActivity, Boolean.FALSE, null, null, 14);
                return;
            case 20:
                PaymentCardDetailsActivity paymentCardDetailsActivity = (PaymentCardDetailsActivity) obj6;
                com.garmin.feature.garminpay.providers.gpay.ui.common.a.EnumC1069a enumC1069a = (com.garmin.feature.garminpay.providers.gpay.ui.common.a.EnumC1069a) obj;
                int i48 = enumC1069a != null ? tr2.m.b.f166157a[enumC1069a.ordinal()] : -1;
                if (i48 == 1) {
                    PaymentCardDetailsActivity.ca(paymentCardDetailsActivity);
                    return;
                }
                if (i48 == 2) {
                    PaymentCardDetailsActivity.f52178q.debug("fitPay setup is failed");
                    paymentCardDetailsActivity.ia();
                    return;
                }
                if (i48 != 3) {
                    PaymentCardDetailsActivity.a aVar23 = PaymentCardDetailsActivity.f52177p;
                    paymentCardDetailsActivity.ia();
                    return;
                }
                PaymentCardDetailsActivity.a aVar24 = PaymentCardDetailsActivity.f52177p;
                paymentCardDetailsActivity.getClass();
                PaymentCardDetailsActivity.f52178q.debug("showMaintenanceAlertDialog");
                androidx.appcompat.app.e eVarF = br2.c.f19585a.f(paymentCardDetailsActivity, new tr2.h(paymentCardDetailsActivity, i16), new tr2.h(paymentCardDetailsActivity, i19));
                if (eVarF != null) {
                    eVarF.show();
                    return;
                }
                return;
            case 21:
                CalibrationSettingsActivity calibrationSettingsActivity = (CalibrationSettingsActivity) obj6;
                fw.m mVar4 = (fw.m) obj;
                CalibrationSettingsActivity.a aVar25 = CalibrationSettingsActivity.f30766m;
                mVar4.getClass();
                if (mVar4.f73769b == p.SUCCESS) {
                    if (s.g(mVar4.f73770c, Boolean.TRUE)) {
                        calibrationSettingsActivity.da();
                        return;
                    } else {
                        calibrationSettingsActivity.ea();
                        return;
                    }
                }
                return;
            case 22:
                a(obj);
                return;
            case 23:
                b(obj);
                return;
            case 24:
                c(obj);
                return;
            case 25:
                com.garmin.android.apps.connectmobile.settings.devices.common.e eVar4 = (com.garmin.android.apps.connectmobile.settings.devices.common.e) obj6;
                zb0.g.a aVar26 = (zb0.g.a) obj;
                com.garmin.android.apps.connectmobile.settings.devices.common.f fVar3 = eVar4.f42830c;
                if (aVar26.f203488a) {
                    boolean z14 = aVar26.f203489b;
                    if (z14) {
                        TextView textView13 = fVar3.f42835k0.f178209b;
                        if (textView13 != null) {
                            textView13.setText(R.string.lbl_ecg);
                        }
                    } else {
                        TextView textView14 = fVar3.f42835k0.f178209b;
                        if (textView14 != null) {
                            textView14.setText(R.string.lbl_set_up_ecg_app);
                        }
                    }
                    fVar3.f42835k0.d();
                    fVar3.f42839o.setVisibility(0);
                    fVar3.f42835k0.c(new hc0.i(eVar4, z14, i19));
                    return;
                }
                return;
            case 26:
                vr2.r.E4((vr2.r) obj6, (List) obj);
                return;
            case 27:
                d(obj);
                return;
            case 28:
                e(obj);
                return;
            default:
                wd2.q qVar = (wd2.q) obj6;
                com.garmin.android.library.livetrack.d dVar2 = (com.garmin.android.library.livetrack.d) obj;
                wd2.q.a aVar27 = wd2.q.f184563f;
                dVar2.getClass();
                Logger logger3 = wd2.q.f184565h;
                if (logger3 != null) {
                    logger3.debug("onLivetrackResult: " + dVar2);
                }
                qVar.f184568c.m(new wd2.f<>(dVar2));
                qVar.g();
                return;
        }
    }
}
