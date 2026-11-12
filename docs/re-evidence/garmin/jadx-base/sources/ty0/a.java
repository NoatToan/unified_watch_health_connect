package ty0;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.badges.redesign.ConnectionBadgeDetailsActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseActivity;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.VoiceAssistantProtobufRequestHandler;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.BadgeChallengeDetailsActivity;
import com.garmin.android.apps.connectmobile.navigation.EditBottomNavBarActivity;
import com.garmin.android.apps.connectmobile.notifications.model.NotificationItem;
import com.garmin.android.apps.connectmobile.powerguide.create.ScheduledEventsActivity;
import com.garmin.android.apps.connectmobile.powerguide.create.SelectCourseOrEventActivity;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import d53.w;
import j31.z0;
import java.util.ArrayList;
import java.util.Comparator;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import p13.u;
import v92.r;
import y40.q;
import z12.n0;
import z12.q0;
import zo0.d0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f166851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f166852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f166853d;

    public /* synthetic */ a(String str, Context context, d0 d0Var) {
        this.f166850a = 15;
        this.f166853d = str;
        this.f166851b = context;
        this.f166852c = d0Var;
    }

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
    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        uy1.g.a aVar;
        Long groupId;
        String displayName;
        int i14 = this.f166850a;
        Object obj = this.f166853d;
        Object obj2 = this.f166852c;
        Object obj3 = this.f166851b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.navigation.a.c cVar = (com.garmin.android.apps.connectmobile.navigation.a.c) obj2;
                String str = (String) obj;
                com.garmin.android.apps.connectmobile.navigation.a aVar2 = ((com.garmin.android.apps.connectmobile.navigation.a.e) obj3).f39355f;
                int i15 = cVar.f39344b;
                if (i15 == 4) {
                    if (aVar2.f39336c.size() == 5) {
                        EditBottomNavBarActivity editBottomNavBarActivity = (EditBottomNavBarActivity) aVar2.f39334a;
                        editBottomNavBarActivity.getClass();
                        new androidx.appcompat.app.e.a(editBottomNavBarActivity).setMessage(R.string.msg_tabbar_max_items).setPositiveButton(R.string.lbl_ok, new qh1.j(26)).create().show();
                        return;
                    } else {
                        cVar.f39344b = 2;
                        aVar2.f39337d.remove(str);
                        ArrayList arrayList = aVar2.f39336c;
                        arrayList.add(arrayList.size() - 1, str);
                    }
                } else if (i15 == 2) {
                    cVar.f39344b = 4;
                    ArrayList arrayList2 = aVar2.f39336c;
                    ArrayList arrayList3 = aVar2.f39337d;
                    arrayList2.remove(str);
                    arrayList3.add(str);
                    arrayList3.sort(Comparator.comparing(new a73.k(new l22.a(aVar2.f39339f), 9)));
                }
                aVar2.f39335b = aVar2.r();
                aVar2.notifyDataSetChanged();
                return;
            case 1:
                SelectCourseOrEventActivity selectCourseOrEventActivity = (SelectCourseOrEventActivity) obj2;
                SelectCourseOrEventActivity.a aVar3 = SelectCourseOrEventActivity.f40383a;
                ((sa1.j) obj3).p(selectCourseOrEventActivity, (ArrayList) obj);
                selectCourseOrEventActivity.finish();
                return;
            case 2:
                SelectCourseOrEventActivity selectCourseOrEventActivity2 = (SelectCourseOrEventActivity) obj3;
                ArrayList<? extends Parcelable> arrayList4 = (ArrayList) obj;
                SelectCourseOrEventActivity.a aVar4 = SelectCourseOrEventActivity.f40383a;
                ScheduledEventsActivity.f40379d.getClass();
                arrayList4.getClass();
                Intent intent = new Intent(selectCourseOrEventActivity2, (Class<?>) ScheduledEventsActivity.class);
                Bundle bundle = new Bundle(2);
                bundle.putParcelableArrayList("GCM_extra_power_guide_list", (ArrayList) obj2);
                bundle.putParcelableArrayList("GCM_extra_events_for_power_guide", arrayList4);
                com.airbnb.lottie.animation.keyframe.a.q(l2.f37135b, intent, bundle);
                selectCourseOrEventActivity2.startActivityForResult(intent, 234);
                selectCourseOrEventActivity2.finish();
                return;
            case 3:
                Context context = (Context) obj2;
                com.garmin.android.apps.connectmobile.badges.service.model.m mVar = (com.garmin.android.apps.connectmobile.badges.service.model.m) obj;
                String displayName2 = ((com.garmin.android.apps.connectmobile.badges.service.model.p) obj3).getDisplayName();
                if (displayName2 != null) {
                    ConnectionBadgeDetailsActivity.a aVar5 = ConnectionBadgeDetailsActivity.f30365i;
                    int badgeId = mVar.getBadgeId();
                    aVar5.getClass();
                    context.startActivity(ConnectionBadgeDetailsActivity.a.a(context, badgeId, displayName2));
                    return;
                }
                return;
            case 4:
                uy1.b bVar = (uy1.b) obj3;
                ez1.c cVar2 = (ez1.c) obj;
                bVar.f173393e = ((uy1.b.a) obj2).getAbsoluteAdapterPosition();
                dz1.i iVar = bVar.f173392d;
                if (iVar != null) {
                    if (h0.R(u.i0(ez1.g.values()), cVar2) || h0.R(u.i0(ez1.b.values()), cVar2) || h0.R(u.i0(ez1.a.values()), cVar2)) {
                        if (cVar2 != ez1.g.TYPE_ALL || cVar2 != ez1.b.TYPE_ALL || cVar2 != ez1.a.TYPE_ALL) {
                            iVar.w6().o5(ez1.h.ALL);
                            uy1.b bVar2 = iVar.f61711c;
                            if (bVar2 != null) {
                                bVar2.f173393e = 0;
                                bVar2.notifyDataSetChanged();
                            }
                        }
                        if (cVar2 == ez1.b.CUSTOM || cVar2 == ez1.a.CUSTOM) {
                            LinearLayout linearLayout = iVar.f61715g;
                            if (linearLayout == null) {
                                s.m("llCustomView");
                                throw null;
                            }
                            linearLayout.setVisibility(0);
                        } else {
                            LinearLayout linearLayout2 = iVar.f61715g;
                            if (linearLayout2 == null) {
                                s.m("llCustomView");
                                throw null;
                            }
                            linearLayout2.setVisibility(8);
                        }
                        iVar.w6().n5(cVar2);
                        iVar.w6().d5(true);
                    } else {
                        if (cVar2 != ez1.h.ALL) {
                            if (iVar.w6().X4() != ny1.b.CUSTOM) {
                                iVar.w6().n5(ez1.b.TYPE_ALL);
                                uy1.b bVar3 = iVar.f61710b;
                                if (bVar3 != null) {
                                    bVar3.f173393e = 0;
                                    bVar3.notifyDataSetChanged();
                                }
                            }
                            iVar.v6();
                            iVar.u6();
                        }
                        iVar.w6().o5(cVar2);
                        iVar.w6().d5(false);
                        if (iVar.w6().X4() == ny1.b.CUSTOM) {
                            iVar.A6(false);
                        }
                    }
                }
                bVar.notifyDataSetChanged();
                return;
            case 5:
                uy1.c cVar3 = (uy1.c) obj3;
                ez1.d dVar = (ez1.d) obj;
                cVar3.f173399e = ((uy1.c.a) obj2).getAbsoluteAdapterPosition();
                dz1.o oVar = cVar3.f173398d;
                if (oVar != null) {
                    cz1.a aVar6 = (cz1.a) oVar.f61798a.getValue();
                    my1.d dVarD = aVar6.Z4().d();
                    aVar6.Z4().m(dVarD != null ? my1.d.b(dVarD, null, null, null, null, null, dVar, null, false, null, null, null, 0.0d, 0.0d, null, null, null, 1048543) : null);
                }
                cVar3.notifyDataSetChanged();
                return;
            case 6:
                uy1.d dVar2 = (uy1.d) obj3;
                gg0.f fVar = (gg0.f) obj;
                dVar2.f173405e = ((uy1.d.a) obj2).getAbsoluteAdapterPosition();
                dz1.n nVar = dVar2.f173404d;
                if (nVar != null) {
                    nVar.f61790d = fVar;
                }
                dVar2.notifyDataSetChanged();
                return;
            case 7:
                uy1.g gVar = (uy1.g) obj3;
                uy1.g.b bVar4 = (uy1.g.b) obj;
                if (!gVar.r((fg0.i) obj2) || (aVar = gVar.f173419d) == null) {
                    return;
                }
                aVar.q1(gVar.f173417b.get(bVar4.getAbsoluteAdapterPosition()));
                return;
            case 8:
                v92.d.a aVar7 = v92.d.f176318n;
                ((v92.d) obj3).u6().f176473h.m(new v92.a.f((String) obj, (String) obj2));
                return;
            case 9:
                v92.o.a aVar8 = v92.o.f176444m;
                ((r) ((v92.o) obj3).f176445a.getValue()).f176473h.m(new v92.a.f((String) obj, (String) obj2));
                return;
            case 10:
                q qVar = (q) obj3;
                q.a aVar9 = q.f194465b;
                qVar.dismiss();
                String string = w.i0(((EditText) obj2).getText().toString()).toString();
                boolean zIsChecked = ((RadioButton) obj).isChecked();
                x40.g gVar2 = qVar.f194466a;
                if (gVar2 != null) {
                    string.getClass();
                    CreateCustomCourseActivity createCustomCourseActivity = gVar2.f188686a;
                    a50.c.h hVar = new a50.c.h(new n50.f.i(string));
                    CreateCustomCourseActivity.a aVar10 = CreateCustomCourseActivity.f33013f;
                    createCustomCourseActivity.ha(hVar);
                    createCustomCourseActivity.ha(new a50.c.j0(zIsChecked));
                    createCustomCourseActivity.fa().G4(a50.c.a0.f1252a);
                    return;
                }
                return;
            case 11:
                q0 q0Var = (q0) obj2;
                ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) obj;
                q0.a aVar11 = q0.f201462l;
                view2.getClass();
                Context context2 = view2.getContext();
                com.garmin.android.apps.connectmobile.userprofile.e.a aVar12 = ((n0) obj3).f201453a;
                am.h hVar2 = (aVar12 == null || !aVar12.c()) ? am.h.VIEW_ONLY : am.h.VIEW_EDIT;
                Activity activity = context2 instanceof Activity ? (Activity) context2 : null;
                if (activity != null) {
                    activity.startActivityForResult(q0Var.f201472j.A(activity, activityListItemDTO, hVar2), 1003);
                    return;
                }
                return;
            case 12:
                GCMComplexTwoLineButton gCMComplexTwoLineButton = (GCMComplexTwoLineButton) obj3;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.g.a aVar13 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.g.f43936b;
                Resources resources = gCMComplexTwoLineButton.getResources();
                ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
                int color = resources.getColor(R.color.gcm_surface_2, null);
                gCMComplexTwoLineButton.setBackground(new ColorDrawable(color));
                gCMComplexTwoLineButton.setBackgroundColor(color);
                gCMComplexTwoLineButton.d(true);
                new Handler(Looper.getMainLooper()).postDelayed(new za.j(3, (com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.g) obj2, (sd2.f) obj), 250L);
                return;
            case 13:
                d31.d dVar3 = (d31.d) obj3;
                Context context3 = (Context) obj2;
                zo0.d dVar4 = (zo0.d) obj;
                int i16 = zo0.d.f206108j;
                ht.a aVar14 = ht.a.f85464a;
                Bundle bundleA = h7.c.a(new o13.p("FeatureType", dVar3.name()));
                aVar14.getClass();
                ht.a.a(bundleA, "OnboardingGetStartedClicked");
                z0 z0VarA = h31.d.a(dVar3);
                if (z0VarA != null) {
                    z0.b(z0VarA, context3, dVar4.f206109a, 0L, null, null, 28);
                    return;
                }
                return;
            case 14:
                Context context4 = (Context) obj2;
                int i17 = zo0.d.f206108j;
                ht.a aVar15 = ht.a.f85464a;
                Bundle bundleA2 = h7.c.a(new o13.p("FeatureType", ((d31.d) obj3).name()));
                aVar15.getClass();
                ht.a.a(bundleA2, "OnboardingGetStartedClicked");
                BadgeChallengeDetailsActivity.a aVar16 = BadgeChallengeDetailsActivity.f37204e;
                String str2 = ((zo0.n.l) ((zo0.n) obj)).f206185b;
                aVar16.getClass();
                context4.startActivity(BadgeChallengeDetailsActivity.a.a(context4, str2));
                return;
            case 15:
                Context context5 = (Context) obj3;
                d0 d0Var = (d0) obj2;
                int i18 = d0.f206127b;
                Uri uri = Uri.parse((String) obj);
                Intent intent2 = new Intent("android.intent.action.VIEW", uri);
                intent2.addFlags(268435456);
                try {
                    context5.startActivity(intent2);
                    break;
                } catch (ActivityNotFoundException e4) {
                    a2 a2Var = a2.GENERAL;
                    String strJ = am.j.j(uri, "openExternalUrl ");
                    i2.f36769a.getClass();
                    i2.a.g(a2Var, strJ, e4);
                    Toast.makeText(context5, R.string.txt_error_occurred, 0).show();
                }
                d0Var.f206128a.j(-1L);
                VoiceAssistantProtobufRequestHandler.INSTANCE.dismissVoiceAssistantNotification(context5);
                return;
            case 16:
                Fragment fragment = (Fragment) obj3;
                zw2.h hVar3 = (zw2.h) obj2;
                zv2.d dVar5 = (zv2.d) obj;
                cx2.h hVar4 = zv2.a.f207178c;
                ew2.d.f66899a.getClass();
                cx2.i.f56681a.getClass();
                if (cx2.i.a.a(fragment)) {
                    zv2.a.f207178c.b("setSingleLabelViewWithAccessoryClickListener: " + s0.f105811a.b(hVar3.getClass()).D());
                    hVar3.l(fragment, dVar5);
                    Unit unit = Unit.INSTANCE;
                    return;
                }
                return;
            case 17:
                NotificationItem.Request request = (NotificationItem.Request) obj3;
                uz0.b bVar5 = (uz0.b) obj2;
                sz0.k kVar = ((zz0.j) obj).f207620a;
                int i19 = zz0.j.f207619l;
                if (request.getRequestKey() != vz0.b.GROUP_JOIN_REQUEST) {
                    if (request.getRequestKey() != vz0.b.GROUP_INVITE || bVar5 == null || (groupId = bVar5.getGroupId()) == null) {
                        return;
                    }
                    kVar.B(String.valueOf(groupId.longValue()), bVar5.getGroupName());
                    return;
                }
                if (bVar5 == null || (displayName = bVar5.getDisplayName()) == null) {
                    return;
                }
                String fullName = bVar5.getFullName();
                if (fullName == null) {
                    fullName = "";
                }
                kVar.D(displayName, fullName);
                return;
            default:
                com.garmin.android.apps.connectmobile.smartscale.model.b bVar6 = (com.garmin.android.apps.connectmobile.smartscale.model.b) obj2;
                int i24 = zz0.j.f207619l;
                Context context6 = view2.getContext();
                context6.getClass();
                ((tz0.a) obj3).k(context6, bVar6);
                ((zz0.j) obj).f207620a.K5(bVar6);
                return;
        }
    }

    public /* synthetic */ a(Object obj, int i14, Object obj2, Object obj3) {
        this.f166850a = i14;
        this.f166851b = obj;
        this.f166852c = obj2;
        this.f166853d = obj3;
    }

    public /* synthetic */ a(Fragment fragment, String str, String str2, int i14) {
        this.f166850a = i14;
        this.f166851b = fragment;
        this.f166853d = str;
        this.f166852c = str2;
    }
}
