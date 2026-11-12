package wv2;

import am.s1;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import c22.s3;
import com.garmin.android.apps.connectmobile.GCMWebViewActivity;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.badges.service.model.u;
import com.garmin.android.apps.connectmobile.consent.ProductImprovementConsentActivity;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.VoiceAssistantProtobufRequestHandler;
import com.garmin.android.apps.connectmobile.segments.model.SegmentDetailsDTO;
import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import d53.w;
import f12.y;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import lo.n;
import m12.r;
import o13.p;
import o53.c0;
import o53.s0;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.x;
import rt1.m;
import sg0.w0;
import xk1.o;
import xk1.v;
import xr.l;
import y40.q;
import z10.m2;
import z12.r0;
import zb0.t;
import zo0.d0;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class h implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f187484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f187485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f187486c;

    public /* synthetic */ h(int i14, Object obj, Object obj2) {
        this.f187484a = i14;
        this.f187485b = obj;
        this.f187486c = obj2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r1v50, types: [java.lang.Object, o13.l] */
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
        ny1.f fVar;
        String displayName;
        DateTime dateTimeNow;
        Long lD;
        String strM;
        String strH0;
        Long lX0;
        String strN0;
        Long lJ0;
        Long lJ1;
        String displayName2;
        int i14 = this.f187484a;
        int i15 = 3;
        byte b14 = 0;
        Object obj = this.f187486c;
        Object obj2 = this.f187485b;
        switch (i14) {
            case 0:
                a aVar = (a) obj2;
                com.garmin.realtimesettings.app.baseviews.reorderable.b bVar = (com.garmin.realtimesettings.app.baseviews.reorderable.b) obj;
                if (aVar == null) {
                    int i16 = com.garmin.realtimesettings.app.baseviews.reorderable.b.f52547j;
                } else {
                    g gVar = bVar.f52550c;
                    if (gVar != null) {
                        gVar.h(aVar.f187464d.f192281a, bVar.f52549b, aVar.f187465e);
                    }
                }
                break;
            case 1:
                xy1.d dVar = (xy1.d) obj;
                int i17 = wy1.a.C3498a.f188052c;
                vy1.e eVar = ((wy1.a) obj2).f188051b;
                if (eVar != null) {
                    AddTIEventViewModel addTIEventViewModelC6 = eVar.C6();
                    xy1.a aVarD = addTIEventViewModelC6.z5().d();
                    my1.d dVar2 = aVarD != null ? aVarD.f192698e : null;
                    if (dVar2 != null) {
                        switch (AddTIEventViewModel.b.f46455f[dVar.f192712a.ordinal()]) {
                            case 1:
                                my1.d dVar3 = addTIEventViewModelC6.K2;
                                if (dVar3 != null && (fVar = dVar3.f121486c) != null) {
                                    addTIEventViewModelC6.Q6(my1.d.b(dVar2, dVar3.f121484a, dVar3.f121485b, fVar, null, null, null, null, false, null, null, null, 0.0d, 0.0d, null, null, null, 1048568));
                                    break;
                                }
                                break;
                            case 2:
                                addTIEventViewModelC6.Q6(my1.d.b(dVar2, null, null, null, null, null, ez1.f.WORLD_WIDE, null, false, null, null, null, 0.0d, 0.0d, null, null, null, 1048543));
                                break;
                            case 3:
                                addTIEventViewModelC6.Q6(my1.d.b(dVar2, null, null, null, null, ny1.g.IN_PERSON, null, null, false, null, null, null, 0.0d, 0.0d, null, null, null, 1048559));
                                break;
                            case 4:
                                addTIEventViewModelC6.Q6(my1.d.b(dVar2, null, null, null, null, null, null, null, true, ny1.b.RUNNING_DISTANCE, ez1.g.TYPE_ALL, ez1.h.ALL, 0.0d, 0.0d, null, null, null, 1034367));
                                break;
                            case 5:
                                addTIEventViewModelC6.y6(dVar2, gg0.j.OFFICIAL);
                                break;
                            case 6:
                                addTIEventViewModelC6.y6(dVar2, gg0.j.VERIFIED);
                                break;
                            case 7:
                                addTIEventViewModelC6.y6(dVar2, gg0.j.NONE);
                                break;
                            default:
                                u0.r();
                                break;
                        }
                    }
                }
                break;
            case 2:
                wy1.b bVar2 = (wy1.b) obj2;
                wy1.b.C3499b c3499b = (wy1.b.C3499b) obj;
                wy1.b.a aVar2 = bVar2.f188057c;
                if (aVar2 != null) {
                    aVar2.B3(bVar2.f188056b.get(c3499b.getAbsoluteAdapterPosition()));
                }
                break;
            case 3:
                wy1.c cVar = (wy1.c) obj2;
                wy1.c.b bVar3 = (wy1.c.b) obj;
                wy1.c.a aVar3 = cVar.f188070d;
                if (aVar3 != null) {
                    aVar3.f(cVar.f188068b.get(bVar3.getAbsoluteAdapterPosition()));
                }
                break;
            case 4:
                ((xb0.a.C3532a) obj2).f189865b.invoke((sd2.f) obj);
                break;
            case 5:
                ((com.garmin.android.library.mobileauth.ui.g) obj2).u6().j3((bf2.b) obj);
                break;
            case 6:
                SegmentDetailsDTO segmentDetailsDTO = (SegmentDetailsDTO) obj2;
                xf1.c cVar2 = (xf1.c) obj;
                int i18 = xf1.c.f190634q;
                if (segmentDetailsDTO != null) {
                    ((m) KoinJavaComponent.get$default(m.class, null, null, 6, null)).l(cVar2, segmentDetailsDTO);
                }
                break;
            case 7:
                ((o) obj2).f191270a.invoke((PowerZonesDTO) obj);
                break;
            case 8:
                l.a aVar4 = (l.a) obj2;
                l lVar = (l) obj;
                int i19 = l.a.f191987f;
                if (aVar4.getBindingAdapterPosition() >= 0) {
                    int bindingAdapterPosition = aVar4.getBindingAdapterPosition();
                    int i24 = lVar.f191984a;
                    ArrayList arrayList = lVar.f191985b;
                    if (bindingAdapterPosition != i24) {
                        ((hr.a) arrayList.get(i24)).f85283b = false;
                        ((hr.a) arrayList.get(aVar4.getBindingAdapterPosition())).f85283b = true;
                        lVar.f191984a = aVar4.getBindingAdapterPosition();
                        lVar.f191986c.invoke(((hr.a) arrayList.get(aVar4.getBindingAdapterPosition())).f85282a);
                        lVar.notifyDataSetChanged();
                    }
                }
                break;
            case 9:
                com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.b bVar4 = (com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.b) obj2;
                com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.b.a aVar5 = com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.b.f30933m;
                bVar4.A6().debug(am.j.g(bVar4.f30934j.getHourOfDay(), bVar4.f30934j.getMinuteOfHour(), "Current hour=[", "], current minute=[", "]"));
                TimePickerDialog timePickerDialog = new TimePickerDialog(bVar4.getContext(), R.style.GCMTimePicker, new n(i15, bVar4, (TextView) obj), bVar4.f30934j.getHourOfDay(), bVar4.f30934j.getMinuteOfHour(), false);
                timePickerDialog.show();
                Context contextRequireContext = bVar4.requireContext();
                contextRequireContext.getClass();
                og.a.W(timePickerDialog, contextRequireContext);
                Context contextRequireContext2 = bVar4.requireContext();
                contextRequireContext2.getClass();
                og.a.w(timePickerDialog, contextRequireContext2);
                break;
            case 10:
                uz0.m mVar = (uz0.m) obj2;
                xz0.o oVar = (xz0.o) obj;
                int i25 = xz0.o.f192801j;
                if (mVar != null && (displayName = mVar.getDisplayName()) != null) {
                    String fullName = mVar.getFullName();
                    oVar.f192802a.D(displayName, fullName != null ? fullName : "");
                    break;
                }
                break;
            case 11:
                q.a aVar6 = q.f194465b;
                Context contextRequireContext3 = ((q) obj2).requireContext();
                contextRequireContext3.getClass();
                s20.f.a(contextRequireContext3);
                ((RadioButton) obj).setChecked(true);
                break;
            case 12:
                ya1.d dVar4 = (ya1.d) obj2;
                za1.c cVar3 = (za1.c) obj;
                if (dVar4.f195543b.getResources().getConfiguration().orientation == 1) {
                    dVar4.f195542a.invoke(cVar3);
                }
                break;
            case 13:
                s92.e eVar2 = (s92.e) obj2;
                m2 m2Var = (m2) obj;
                m2.a aVar7 = m2.f201155f;
                String url = eVar2 != null ? eVar2.getUrl() : null;
                if (url != null && !w.J(url)) {
                    GCMWebViewActivity.fa(m2Var.getActivity(), eVar2 != null ? eVar2.getText() : null, eVar2 != null ? eVar2.getUrl() : null);
                    break;
                }
                break;
            case 14:
                m2.a aVar8 = m2.f201155f;
                ((Button) obj2).setEnabled(((CheckBox) obj).isChecked());
                break;
            case 15:
                m2 m2Var2 = (m2) obj2;
                s92.g gVar2 = (s92.g) obj;
                m2.a aVar9 = m2.f201155f;
                if (!s3.b()) {
                    ((com.garmin.android.apps.connectmobile.startup.e) m2Var2.f201156b.getValue()).G4(gVar2);
                } else {
                    f12.l.f68084a.getClass();
                    com.garmin.android.apps.connectmobile.userprofile.model.g gVarW0 = f12.l.a.a().W0();
                    String str = gVarW0 != null ? gVarW0.f46858b : null;
                    new androidx.appcompat.app.e.a(m2Var2.requireContext()).setTitle(m2Var2.getString(R.string.lbl_admin_setup_required)).setMessage(m2Var2.getString(R.string.msg_privacy_policy_admin_setup_required, str != null ? str : "")).setPositiveButton(R.string.lbl_ok, new v(18)).create().show();
                }
                break;
            case 16:
                s92.e eVar3 = (s92.e) obj;
                ProductImprovementConsentActivity.a aVar10 = ProductImprovementConsentActivity.f32230h;
                GCMWebViewActivity.fa(((TextView) obj2).getContext(), eVar3 != null ? eVar3.getText() : null, eVar3 != null ? eVar3.getUrl() : null);
                break;
            case 17:
                z12.j jVar = (z12.j) obj2;
                z12.j.a aVar11 = z12.j.f201414h;
                Context context = jVar.itemView.getContext();
                r rVar = jVar.f201421g;
                Context context2 = jVar.itemView.getContext();
                context2.getClass();
                context.startActivity(rVar.q(context2, (String) obj));
                break;
            case 18:
                r0 r0Var = (r0) obj2;
                fg0.k kVar = (fg0.k) obj;
                Context context3 = r0Var.f201481a;
                r rVar2 = r0Var.f201482b;
                Boolean eventOrganizer = kVar.getEventOrganizer();
                Boolean bool = Boolean.TRUE;
                if (s.g(eventOrganizer, bool)) {
                    context3.getClass();
                    rVar2.C(context3, kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String(), null);
                    break;
                } else if (s.g(kVar.getEventOrganizer(), Boolean.FALSE) && s.g(kVar.getSubscribed(), bool)) {
                    context3.getClass();
                    rVar2.C(context3, null, kVar.getShareableEventUuid());
                    break;
                }
                break;
            case 19:
                z40.c cVar4 = (z40.c) obj;
                int i26 = z40.c.b.f202329c;
                int bindingAdapterPosition2 = ((z40.c.b) obj2).getBindingAdapterPosition();
                if (bindingAdapterPosition2 != -1) {
                    cVar4.f202327b.R(bindingAdapterPosition2);
                }
                break;
            case 20:
                zb0.o oVar2 = (zb0.o) obj2;
                String str2 = (String) obj;
                if (hb2.i.a(oVar2.getActivity()) || (km2.a.d(oVar2.f203586h, km2.a.b()) && oVar2.f203589k != zb0.u0.f203843y1)) {
                    Intent intent = new Intent();
                    intent.putExtra("GCM_deviceUnitID", oVar2.f203588j.getUnitID());
                    intent.putExtra("GCM_deviceProductNbr", oVar2.f203588j.getProductNumber());
                    intent.putExtra("GCM_deviceName", oVar2.f203588j.getProductDisplayName());
                    intent.putExtra("GCM_deviceDisplayName", oVar2.f203588j.getDisplayName());
                    intent.putExtra("GCM_extra_device_image_url", t.d(oVar2.f203588j));
                    intent.setClassName(oVar2.getActivity(), str2);
                    oVar2.startActivity(intent);
                }
                break;
            case 21:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f fVar2 = (com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f) obj2;
                wj1.a aVar12 = (wj1.a) obj;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f.a aVar13 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f.f43923h;
                pj1.s sVarW6 = fVar2.w6();
                if (sVarW6.f137983t && sVarW6.N4() && sVarW6.f137986x) {
                    fVar2.w6().J0.m("EmergencyNotesFragment");
                } else {
                    pj1.s sVarW7 = fVar2.w6();
                    if (!sVarW7.f137983t || !sVarW7.f137988z) {
                        fVar2.u6(fVar2.getString(R.string.device_settings_safety_features));
                        fVar2.w6().q5(false);
                    } else if (!aVar12.b().isEmpty()) {
                        fVar2.y6(aVar12);
                    } else {
                        c22.f fVar3 = c22.f.f23050a;
                        Context contextRequireContext4 = fVar2.requireContext();
                        contextRequireContext4.getClass();
                        c22.f.d(fVar3, contextRequireContext4, fVar2.getString(R.string.lbl_missing_phone_numbers), fVar2.getString(R.string.msg_missing_phone_numbers_assistance_edit), new p(fVar2.getString(R.string.lbl_edit), new z21.a(b14, 22)), new p(fVar2.getString(R.string.not_now_lbl), new zi1.a(i15, fVar2, aVar12)), null, false, 96).show();
                    }
                }
                break;
            case 22:
                com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b bVar5 = (com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b) obj2;
                vo.b bVar6 = (vo.b) obj;
                bVar5.J6(bVar5.f29323j, bVar6.f178992a, bVar6.f178993b);
                break;
            case 23:
                zo0.g gVar3 = (zo0.g) obj2;
                gVar3.f206140b.b(gVar3.f206139a.getContext(), ((zo0.n.c) ((zo0.n) obj)).f206173a);
                break;
            case 24:
                ((zo0.i) obj2).f206153a.s6((u) obj);
                break;
            case 25:
                y yVar = ((d0) obj2).f206128a;
                yVar.f();
                yVar.j(-1L);
                VoiceAssistantProtobufRequestHandler.INSTANCE.dismissVoiceAssistantNotification((Context) obj);
                break;
            case 26:
                v22.e.j(((zz0.a) obj2).f207581a);
                ((w0) obj).invoke();
                break;
            case 27:
                uz0.g gVar4 = (uz0.g) obj2;
                zz0.f fVar4 = (zz0.f) obj;
                sz0.k kVar2 = fVar4.f207601a;
                int i27 = zz0.f.f207600m;
                uz0.k type = gVar4.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String();
                if (type != null) {
                    uz0.j relativeNameValue = gVar4.getRelativeNameValue();
                    if (relativeNameValue == null || (dateTimeNow = relativeNameValue.getActivityCreatedTime()) == null) {
                        dateTimeNow = DateTime.now();
                    }
                    dateTimeNow.getClass();
                    boolean zB = s1.b(dateTimeNow);
                    if (type == uz0.k.CONNECTION_REQUEST_ACCEPTED) {
                        uz0.j relativeNameValue2 = gVar4.getRelativeNameValue();
                        if (relativeNameValue2 != null && (displayName2 = relativeNameValue2.getDisplayName()) != null) {
                            String fullName2 = gVar4.getFullName();
                            kVar2.D(displayName2, fullName2 != null ? fullName2 : "");
                            break;
                        }
                    } else if (x.k(uz0.k.ACTIVITY_TYPE_PRIVACY_UPDATE_SUCCESS, uz0.k.ALL_ACTIVITY_TYPE_PRIVACY_UPDATE_SUCCESS).contains(type)) {
                        kVar2.h3();
                        break;
                    } else if (x.k(uz0.k.ALL_ACTIVITY_TYPE_PRIVACY_UPDATE_FAILURE, uz0.k.ACTIVITY_TYPE_PRIVACY_UPDATE_FAILURE).contains(type)) {
                        kVar2.j6();
                        break;
                    } else if (!x.k(uz0.k.GROUP_NEWS_POST, uz0.k.COMMENTED_ON_GROUP_NEWS_POST, uz0.k.ALSO_COMMENTED_ON_GROUP_NEWS_POST, uz0.k.LIKED_ON_GROUP_POST_COMMENT, uz0.k.LIKED_ON_GROUP_POST).contains(type)) {
                        uz0.k kVar3 = uz0.k.PRIVATE_GROUP_REQUEST_ACCEPTED;
                        uz0.k kVar4 = uz0.k.GROUP_INVITE_ACCEPTED;
                        uz0.k kVar5 = uz0.k.GROUP_ANNOUNCEMENT;
                        if (x.k(kVar3, kVar4, kVar5).contains(type)) {
                            uz0.j relativeNameValue3 = gVar4.getRelativeNameValue();
                            if (relativeNameValue3 != null && (lJ0 = relativeNameValue3.getGroupId()) != null) {
                                kVar2.G0(lJ0.longValue(), Boolean.valueOf(type == kVar5), gVar4.getRelativeNameValue().getGroupName());
                                break;
                            }
                        } else if (x.k(uz0.k.AUTHORIZED_VIEWER_ACCEPTED, uz0.k.AUTHORIZED_VIEWER_DECLINED, uz0.k.AUTHORIZED_VIEWER_ENDED, uz0.k.AUTHORIZED_VIEWER_REMINDER, uz0.k.AUTHORIZED_VIEWER_REMOVED).contains(type)) {
                            kVar2.z();
                            break;
                        } else {
                            uz0.k kVar6 = uz0.k.SHAREABLE_EVENT_UPDATED;
                            if (x.k(kVar6, uz0.k.SHAREABLE_EVENT_COURSE_UPDATED).contains(type)) {
                                if (type == kVar6) {
                                    uz0.j relativeNameValue4 = gVar4.getRelativeNameValue();
                                    List listW = (relativeNameValue4 == null || (strN0 = relativeNameValue4.getModifiedNames()) == null) ? null : w.W(strN0, new String[]{","});
                                    if (listW != null && listW.size() == 1 && s.g(h0.d0(listW), vz0.c.EVENT_DATE.f180889a)) {
                                        ht.a.f85464a.getClass();
                                        ht.a.a(null, "GarminCoachATPDateChangeNotifTapped");
                                    }
                                }
                                uz0.j relativeNameValue5 = gVar4.getRelativeNameValue();
                                kVar2.X1(relativeNameValue5 != null ? relativeNameValue5.getShareableEventUuid() : null);
                                break;
                            } else if (type == uz0.k.TRAINING_NEW_PREMIUM_CONTENT) {
                                if (gVar4.getNotificationId() != null) {
                                    long jLongValue = gVar4.getNotificationId().longValue();
                                    uz0.j relativeNameValue6 = gVar4.getRelativeNameValue();
                                    Long lX1 = relativeNameValue6 != null ? relativeNameValue6.getTrainingPLanId() : null;
                                    uz0.j relativeNameValue7 = gVar4.getRelativeNameValue();
                                    kVar2.j2(jLongValue, lX1, relativeNameValue7 != null ? relativeNameValue7.getTrainingType() : null);
                                }
                                break;
                            } else if (x.k(uz0.k.FOLLOWED, uz0.k.FOLLOWING_REQUEST_ACCEPTED).contains(type)) {
                                String displayName3 = gVar4.getDisplayName();
                                if (displayName3 != null) {
                                    String fullName3 = gVar4.getFullName();
                                    kVar2.D(displayName3, fullName3 != null ? fullName3 : "");
                                    break;
                                }
                            } else if (type == uz0.k.TRAINING_PLAN_PROGRESS_REPORT_AVAILABLE) {
                                uz0.j relativeNameValue8 = gVar4.getRelativeNameValue();
                                if (relativeNameValue8 != null && (lX0 = relativeNameValue8.getTrainingPLanId()) != null) {
                                    long jLongValue2 = lX0.longValue();
                                    ht.a.f85464a.getClass();
                                    ht.a.a(null, "GarminCoachReportInboxNotifTapped");
                                    kVar2.N4(jLongValue2, s.g(gVar4.getRelativeNameValue().getTrainingPlanCategory(), "FBT_EVENT_BASED"));
                                    break;
                                }
                            } else if (type != uz0.k.MANAGED_ACCOUNTS_ADMIN_GRANTED_CONSENT && type != uz0.k.MANAGED_ACCOUNTS_ADMIN_REVOKED_CONSENT) {
                                if (type == uz0.k.MANAGED_ACCOUNTS_APPROVAL_REQUEST_RECEIVED || type == uz0.k.MANAGED_ACCOUNTS_CHILD_REVOKED_CONSENT) {
                                    if (gVar4.getFromUserId() != null) {
                                        uz0.j relativeNameValue9 = gVar4.getRelativeNameValue();
                                        String strG = relativeNameValue9 != null ? relativeNameValue9.getConsentType() : null;
                                        if (strG == null) {
                                            strG = "";
                                        }
                                        String string = w.i0(strG).toString();
                                        uz0.j relativeNameValue10 = gVar4.getRelativeNameValue();
                                        String strC = relativeNameValue10 != null ? relativeNameValue10.getChildName() : null;
                                        String string2 = w.i0(strC != null ? strC : "").toString();
                                        x53.c cVar5 = s0.f129406a;
                                        ge1.b.T(c0.a(x53.b.f189152a), null, null, new zz0.d(gVar4, string2, fVar4, string, null), 3);
                                    }
                                    break;
                                } else if (type == uz0.k.GEAR_END_OF_LIFE) {
                                    uz0.j relativeNameValue11 = gVar4.getRelativeNameValue();
                                    if (relativeNameValue11 != null && (strH0 = relativeNameValue11.getGearUUID()) != null) {
                                        kVar2.n0(strH0);
                                        break;
                                    }
                                } else if (type != uz0.k.MANAGED_ACCOUNTS_CHILD_GRADUATED) {
                                    if (type == uz0.k.EXCLUSIVE_DISCOUNTS) {
                                        uz0.j relativeNameValue12 = gVar4.getRelativeNameValue();
                                        if (relativeNameValue12 != null && (strM = relativeNameValue12.getExclusiveOfferId()) != null) {
                                            kVar2.L0(strM);
                                            break;
                                        }
                                    } else if (type == uz0.k.NEW_EXCLUSIVE_OFFERS) {
                                        kVar2.N0();
                                        break;
                                    } else if (x.k(uz0.k.LIVETRACK_CONTACT_ACCEPT, uz0.k.LIVETRACK_CONTACT_DECLINE, uz0.k.LIVETRACK_CONTACT_SMS_OPTOUT, uz0.k.MESSENGER_LIVETRACK_RECIPIENT_INVITE_ACCEPTED, uz0.k.MESSENGER_LIVETRACK_RECIPIENT_ACCOUNT_DELETED, uz0.k.MESSENGER_LIVETRACK_SENDER_ACCOUNT_DELETED, uz0.k.MESSENGER_LIVETRACK_SENDER_SMS_REMOVED).contains(type)) {
                                        kVar2.U3();
                                        break;
                                    } else if (!zB) {
                                        uz0.j relativeNameValue13 = gVar4.getRelativeNameValue();
                                        if (relativeNameValue13 != null && (lD = relativeNameValue13.getActivityId()) != null) {
                                            long jLongValue3 = lD.longValue();
                                            boolean z14 = type != uz0.k.LIKED_ON_ACTIVITY;
                                            String strF = gVar4.getRelativeNameValue().getCommentUuid();
                                            if (!x.k(uz0.k.COMMENTED_ON_GROUP_ACTIVITY, uz0.k.ALSO_COMMENTED_ON_GROUP_ACTIVITY, uz0.k.LIKED_ON_GROUP_ACTIVITY, uz0.k.LIKED_ON_GROUP_ACTIVITY_COMMENT).contains(type)) {
                                                kVar2.f0(jLongValue3, strF, z14);
                                            } else {
                                                Long lJ2 = gVar4.getRelativeNameValue().getGroupId();
                                                if (lJ2 != null) {
                                                    fVar4.f207601a.m3(lJ2.longValue(), jLongValue3, strF);
                                                }
                                            }
                                            break;
                                        }
                                    } else {
                                        uz0.j relativeNameValue14 = gVar4.getRelativeNameValue();
                                        Long lD2 = relativeNameValue14 != null ? relativeNameValue14.getActivityId() : null;
                                        String displayName4 = gVar4.getDisplayName();
                                        if (lD2 != null && displayName4 != null && displayName4.length() != 0) {
                                            if (!x.k(uz0.k.COMMENTED_ON_GROUP_ACTIVITY, uz0.k.ALSO_COMMENTED_ON_GROUP_ACTIVITY, uz0.k.LIKED_ON_GROUP_ACTIVITY, uz0.k.LIKED_ON_GROUP_ACTIVITY_COMMENT).contains(type)) {
                                                kVar2.u2(lD2.longValue(), displayName4);
                                            } else {
                                                Long lJ3 = gVar4.getRelativeNameValue().getGroupId();
                                                if (lJ3 != null) {
                                                    fVar4.f207601a.a2(lJ3.longValue(), lD2.longValue(), displayName4);
                                                }
                                            }
                                            break;
                                        }
                                    }
                                }
                            } else {
                                uz0.j relativeNameValue15 = gVar4.getRelativeNameValue();
                                String strG2 = relativeNameValue15 != null ? relativeNameValue15.getConsentType() : null;
                                String str3 = strG2 != null ? strG2 : "";
                                switch (str3.hashCode()) {
                                    case -1709024396:
                                        if (str3.equals("DI_CONNECT_ADAPTIVE_TRAINING_PLAN")) {
                                            kVar2.H3();
                                            break;
                                        }
                                        break;
                                    case -1139160752:
                                        if (str3.equals("DI_CONNECT_LIVETRACK")) {
                                            kVar2.U3();
                                            break;
                                        }
                                        break;
                                    case 1165328790:
                                        if (str3.equals("DI_CONNECT_AUTO_ACTIVITY_DETECTION")) {
                                            kVar2.s2(hl.a.c.f84256b);
                                            break;
                                        }
                                        break;
                                    case 1722149930:
                                        if (str3.equals("DI_CONNECT_INSIGHTS")) {
                                            if (type != uz0.k.MANAGED_ACCOUNTS_ADMIN_REVOKED_CONSENT) {
                                                kVar2.G4();
                                            } else {
                                                kVar2.s2(hl.a.c.f84256b);
                                            }
                                            break;
                                        }
                                        break;
                                    case 2014023184:
                                        if (str3.equals("DI_CONNECT_UPLOAD")) {
                                            kVar2.s2(hl.a.c.f84256b);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }
                    } else {
                        uz0.j relativeNameValue16 = gVar4.getRelativeNameValue();
                        if (relativeNameValue16 != null && (lJ1 = relativeNameValue16.getGroupId()) != null) {
                            long jLongValue4 = lJ1.longValue();
                            String strO0 = gVar4.getRelativeNameValue().getNewsPostId();
                            if (strO0 != null) {
                                kVar2.K1(jLongValue4, strO0, gVar4.getRelativeNameValue().getCommentUuid());
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                int i28 = zz0.j.f207619l;
                Context context4 = view2.getContext();
                context4.getClass();
                ((tz0.a) obj2).s(context4, (com.garmin.android.apps.connectmobile.smartscale.model.b) obj);
                break;
        }
    }
}
