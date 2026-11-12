package u12;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.v;
import androidx.lifecycle.v1;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.garmin.android.apps.connectmobile.badges.redesign.BadgeDetailsActivity;
import com.garmin.android.apps.connectmobile.badges.service.model.SimpleBadgeDTO;
import com.garmin.android.apps.connectmobile.courses.create.CourseTypeActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.setup.CourseDrawingMethodActivity;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.dashboard.fragments.EventListFragment;
import com.garmin.android.consent.ui.view.ConsentScreenView;
import com.garmin.android.consent.ui.view.DeviceUploadConsentView;
import com.garmin.proto.generated.GDIAntiTheftAlarmExtension;
import com.garmin.proto.generated.GDIAntiTheftAlarmProto;
import com.garmin.proto.generated.GDISmartProto;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import o53.s0;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.x0;
import s70.b0;
import vg1.v0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f167774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f167775c;

    public /* synthetic */ e(int i14, Object obj, Object obj2) {
        this.f167773a = i14;
        this.f167774b = obj;
        this.f167775c = obj2;
    }

    /* JADX WARN: Type inference failed for: r12v22, types: [androidx.fragment.app.Fragment, uy1.f$a] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.a.b bVar;
        b0 b0Var;
        int i14 = this.f167773a;
        Object obj = this.f167775c;
        Object obj2 = this.f167774b;
        switch (i14) {
            case 0:
                ((f) obj2).f167776a.invoke((ip.a) obj);
                return;
            case 1:
                ((o) obj2).f167809e.invoke((PrivacyType) obj);
                return;
            case 2:
                ((u31.a) obj2).f168282c.invoke((DateTime) obj);
                return;
            case 3:
                u40.k kVar = (u40.k) obj2;
                com.garmin.android.apps.connectmobile.courses.model.f fVar = (com.garmin.android.apps.connectmobile.courses.model.f) obj;
                kVar.f168579f = fVar;
                e23.l<com.garmin.android.apps.connectmobile.courses.model.f, Unit> lVar = kVar.f168578e;
                if (lVar != null) {
                    lVar.invoke(fVar);
                }
                kVar.notifyDataSetChanged();
                return;
            case 4:
                ua1.m mVar = (ua1.m) obj;
                int i15 = ua1.m.a.f169657e;
                int bindingAdapterPosition = ((ua1.m.a) obj2).getBindingAdapterPosition() - mVar.f34942a.size();
                if (bindingAdapterPosition >= 0) {
                    mVar.f169655c.invoke((ab1.m) mVar.f169656d.get(bindingAdapterPosition));
                    return;
                }
                return;
            case 5:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.a aVar = (com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.a) obj;
                int i16 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.a.c.f43702i;
                l20.a aVar2 = ((yj1.f.b) ((yj1.f) obj2)).f197539f;
                if (aVar2 == null || (bVar = aVar.f43700a) == null) {
                    return;
                }
                bVar.H5(aVar2);
                return;
            case 6:
                uj1.n nVar = (uj1.n) obj;
                sd2.f fVar2 = ((uj1.n.a) obj2).f171550c;
                if (fVar2 != null) {
                    nVar.f171547b.invoke(fVar2);
                    return;
                }
                return;
            case 7:
                ((uu.a.C3226a) obj2).f172632a.invoke(Integer.valueOf(((com.garmin.android.apps.connectmobile.badges.service.model.m) obj).getBadgeId()));
                return;
            case 8:
                com.garmin.android.apps.connectmobile.badges.redesign.e eVar = (com.garmin.android.apps.connectmobile.badges.redesign.e) obj2;
                com.garmin.android.apps.connectmobile.badges.service.model.m mVar2 = (com.garmin.android.apps.connectmobile.badges.service.model.m) obj;
                ru.d dVar = eVar.f30462o;
                androidx.fragment.app.m mVarRequireActivity = eVar.requireActivity();
                mVarRequireActivity.getClass();
                dVar.a(mVarRequireActivity, mVar2.getConnectionDisplayName(), mVar2.getConnectionFullName(), mVar2.getConnectionProfileImageUrlMedium());
                return;
            case 9:
                Context context = (Context) obj2;
                int i17 = com.garmin.android.apps.connectmobile.badges.redesign.l.b.f30525e;
                BadgeDetailsActivity.a aVar3 = BadgeDetailsActivity.f30322l;
                int i18 = ((SimpleBadgeDTO) obj).f30530a;
                aVar3.getClass();
                context.startActivity(BadgeDetailsActivity.a.a(i18, context));
                return;
            case 10:
                uy1.a aVar4 = (uy1.a) obj2;
                uy1.a.C3242a c3242a = (uy1.a.C3242a) obj;
                aVar4.f173387f = c3242a.getAbsoluteAdapterPosition();
                uy1.a.b bVar2 = aVar4.f173386e;
                if (bVar2 != null) {
                    bVar2.f(aVar4.f173384c.get(c3242a.getAbsoluteAdapterPosition()));
                }
                aVar4.notifyDataSetChanged();
                return;
            case 11:
                fg0.k kVar2 = (fg0.k) obj;
                EventListFragment eventListFragment = ((uy1.e) obj2).f173410d;
                if (eventListFragment != null) {
                    eventListFragment.v6(kVar2);
                    return;
                }
                return;
            case 12:
                uy1.f fVar3 = (uy1.f) obj2;
                my1.e eVar2 = (my1.e) obj;
                ?? r14 = fVar3.f173413b;
                if (r14 != 0) {
                    r14.N1(eVar2.f121506c, eVar2.f121507d);
                }
                fVar3.notifyDataSetChanged();
                return;
            case 13:
                hl.a aVar5 = (hl.a) obj;
                v parentFragmentManager = ((v12.v) obj2).getParentFragmentManager();
                androidx.fragment.app.a aVarB = androidx.core.view.j.b(parentFragmentManager, parentFragmentManager);
                v12.h.f174703f.getClass();
                aVar5.getClass();
                aVarB.m(R.id.content_frame_layout, v12.h.class, h7.c.a(new o13.p("activity", null), new o13.p("GCM_extra_screen_access_role", aVar5)));
                aVarB.d(null);
                aVarB.e();
                return;
            case 14:
                CourseTypeActivity courseTypeActivity = (CourseTypeActivity) obj2;
                com.garmin.android.apps.connectmobile.courses.model.i iVar = (com.garmin.android.apps.connectmobile.courses.model.i) obj;
                com.garmin.android.apps.connectmobile.courses.model.e eVar3 = courseTypeActivity.f32762i;
                if (eVar3 == null) {
                    long j8 = courseTypeActivity.f32756c;
                    if (j8 != -1) {
                        courseTypeActivity.da(j8, courseTypeActivity.f32757d, iVar);
                        return;
                    }
                    CourseDrawingMethodActivity.a aVar6 = CourseDrawingMethodActivity.f33101a;
                    int i19 = courseTypeActivity.f32758e;
                    aVar6.getClass();
                    iVar.getClass();
                    Intent intent = new Intent(courseTypeActivity, (Class<?>) CourseDrawingMethodActivity.class);
                    intent.putExtra("GCM_extra_course_type", iVar);
                    intent.putExtra("GCM_create_course_flow", i19);
                    courseTypeActivity.startActivity(intent);
                    return;
                }
                String string = eVar3.courseName;
                s20.d dVar2 = s20.d.f156005a;
                if (TextUtils.isEmpty(string)) {
                    if (iVar == null) {
                        string = courseTypeActivity.getString(R.string.txt_untitle);
                    } else {
                        String string2 = courseTypeActivity.getString(iVar.f32980b);
                        string2.getClass();
                        j0 j0Var = j0.f23099a;
                        DateTime dateTimeNow = DateTime.now();
                        j0Var.getClass();
                        String strK = j0.k(dateTimeNow, 'M');
                        x0 x0Var = x0.f105818a;
                        string = String.format("%s %s", Arrays.copyOf(new Object[]{string2, strK}, 2));
                    }
                }
                eVar3.courseName = string;
                eVar3.j0(iVar);
                List<com.garmin.android.apps.connectmobile.courses.model.g> listJ = eVar3.j();
                if (listJ != null) {
                    for (com.garmin.android.apps.connectmobile.courses.model.g gVar : listJ) {
                        String str = gVar.name;
                        if (str == null || str.length() == 0) {
                            com.garmin.android.apps.connectmobile.courses.model.f fVar4 = com.garmin.android.apps.connectmobile.courses.model.f.GENERIC;
                            if (s.g(fVar4.f32922a, gVar.getCoursePointType())) {
                                gVar.name = courseTypeActivity.getString(fVar4.f32925d);
                            }
                        }
                    }
                }
                CreateCustomCourseActivity.f33013f.getClass();
                com.garmin.android.apps.connectmobile.courses.model.e eVar4 = new com.garmin.android.apps.connectmobile.courses.model.e(eVar3);
                Intent intent2 = new Intent(courseTypeActivity, (Class<?>) CreateCustomCourseActivity.class);
                Bundle bundle = new Bundle();
                bundle.putParcelable("GCM_extra_course_detail", eVar4);
                bundle.putBoolean("EXTRA_COURSE_IMPORTED", true);
                l2.f37135b.getClass();
                l2.a.b().a(intent2, bundle);
                courseTypeActivity.startActivity(intent2);
                return;
            case 15:
                v30.b bVar3 = (v30.b) obj;
                int i24 = v30.b.a.f175392i;
                int absoluteAdapterPosition = ((v30.b.a) obj2).getAbsoluteAdapterPosition();
                if (absoluteAdapterPosition < 0 || (b0Var = bVar3.f175391b) == null) {
                    return;
                }
                b0Var.invoke(Integer.valueOf(absoluteAdapterPosition));
                return;
            case 16:
                ua1.c cVar = (ua1.c) ((va1.a) obj2).f176580a.getValue();
                double d14 = ((wa1.c) obj).f183798d;
                ab1.r rVar = new ab1.r(new ab1.q(null, Double.valueOf(((double) 1000) * d14), 1, null));
                w9.a aVarA = v1.a(cVar);
                x53.c cVar2 = s0.f129406a;
                ge1.b.T(aVarA, x53.b.f189152a, null, new ua1.i(cVar, rVar, d14, null), 2);
                return;
            case 17:
                int i25 = va1.e.f176595b;
                int i26 = ((wa1.b) obj2).f183794f;
                ua1.c cVar3 = (ua1.c) ((va1.e) obj).f176596a.getValue();
                cVar3.f169614j.j(Integer.valueOf(i26));
                ge1.b.T(v1.a(cVar3), null, null, new ua1.h(cVar3, i26, null), 3);
                return;
            case 18:
                va1.m mVar3 = (va1.m) obj;
                int i27 = va1.m.a.f176639c;
                int bindingAdapterPosition2 = ((va1.m.a) obj2).getBindingAdapterPosition() - mVar3.f34942a.size();
                if (bindingAdapterPosition2 >= 0) {
                    ab1.l lVar2 = (ab1.l) mVar3.f176638d.get(bindingAdapterPosition2);
                    e23.l<ab1.l, Unit> lVar3 = mVar3.f176637c;
                    if (lVar3 != null) {
                        lVar3.invoke(lVar2);
                        return;
                    }
                    return;
                }
                return;
            case 19:
                ((vd1.f) obj2).f177468a.a((Integer) obj);
                return;
            case 20:
                com.garmin.android.apps.connectmobile.settings.devices.common.b bVar4 = (com.garmin.android.apps.connectmobile.settings.devices.common.b) obj2;
                com.garmin.android.apps.connectmobile.settings.devices.common.c cVar4 = (com.garmin.android.apps.connectmobile.settings.devices.common.c) obj;
                SwitchCompat switchCompat = bVar4.f42821b;
                if (switchCompat == null) {
                    s.m("bikeAlarmOptionsArmSwitch");
                    throw null;
                }
                if (switchCompat.isChecked()) {
                    Button button = bVar4.f42822c;
                    if (button == null) {
                        s.m("bikeAlarmOptionsSoundAlarm");
                        throw null;
                    }
                    if (s.g(button.getTag(), "BIKE_ALARM_DISABLE_TAG")) {
                        if (cVar4 != null) {
                            GDIAntiTheftAlarmProto.TriggerRequest.Builder builderNewBuilder = GDIAntiTheftAlarmProto.TriggerRequest.newBuilder();
                            GDIAntiTheftAlarmProto.AntiTheftAlarmService.Builder builderNewBuilder2 = GDIAntiTheftAlarmProto.AntiTheftAlarmService.newBuilder();
                            builderNewBuilder2.setTriggerRequest(builderNewBuilder);
                            GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
                            builderNewBuilder3.getClass();
                            builderNewBuilder3.setExtension(GDIAntiTheftAlarmExtension.antiTheftAlarmService, builderNewBuilder2.build());
                            cVar4.b(builderNewBuilder3);
                            return;
                        }
                        return;
                    }
                    if (cVar4 != null) {
                        GDIAntiTheftAlarmProto.DisableRequest.Builder builderNewBuilder4 = GDIAntiTheftAlarmProto.DisableRequest.newBuilder();
                        GDIAntiTheftAlarmProto.AntiTheftAlarmService.Builder builderNewBuilder5 = GDIAntiTheftAlarmProto.AntiTheftAlarmService.newBuilder();
                        builderNewBuilder5.setDisableRequest(builderNewBuilder4);
                        GDISmartProto.Smart.Builder builderNewBuilder6 = GDISmartProto.Smart.newBuilder();
                        builderNewBuilder6.getClass();
                        vg1.f.b(builderNewBuilder6, builderNewBuilder5);
                        cVar4.b(builderNewBuilder6);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                com.garmin.android.apps.connectmobile.handalignment.e eVar5 = (com.garmin.android.apps.connectmobile.handalignment.e) obj;
                com.garmin.android.apps.connectmobile.settings.devices.common.f fVar5 = ((com.garmin.android.apps.connectmobile.settings.devices.common.e) obj2).f42830c;
                if (fVar5.f42836l != null) {
                    eVar5.a(fVar5.getActivity(), fVar5.f42832i, fVar5.f42836l.getProductDisplayName());
                    return;
                }
                return;
            case 22:
                v0 v0Var = (v0) obj;
                int i28 = v0.a.f178195g;
                int bindingAdapterPosition3 = ((v0.a) obj2).getBindingAdapterPosition() - v0Var.f34942a.size();
                if (bindingAdapterPosition3 < 0 || !((qv.b) v0Var.f178193d.get(bindingAdapterPosition3)).f147910f) {
                    return;
                }
                e23.a<Unit> aVar7 = v0Var.f178192c;
                if (bindingAdapterPosition3 < 0) {
                    return;
                }
                int i29 = v0Var.f178194e;
                if (bindingAdapterPosition3 == i29) {
                    v0Var.B(bindingAdapterPosition3);
                    v0Var.f178194e = -1;
                    if (aVar7 != null) {
                        aVar7.invoke();
                        return;
                    }
                    return;
                }
                v0Var.B(i29);
                v0Var.B(bindingAdapterPosition3);
                v0Var.f178194e = bindingAdapterPosition3;
                if (aVar7 != null) {
                    aVar7.invoke();
                    return;
                }
                return;
            case 23:
                ((com.garmin.android.apps.connectmobile.group.details.invite.d) obj2).f36385b.n2((vm0.e) obj);
                return;
            case 24:
                com.garmin.android.apps.connectmobile.courses.model.d dVar3 = (com.garmin.android.apps.connectmobile.courses.model.d) obj;
                w50.e eVar6 = ((w50.d) obj2).f182202q;
                if (eVar6 != null) {
                    eVar6.r0(dVar3);
                    return;
                }
                return;
            case 25:
                ConsentScreenView consentScreenView = (ConsentScreenView) obj2;
                Context context2 = (Context) obj;
                TextInputLayout textInputLayout = consentScreenView.f49814g;
                if (textInputLayout == null) {
                    s.m("confirmationInputView");
                    throw null;
                }
                EditText editText = textInputLayout.getEditText();
                int selectionStart = editText != null ? editText.getSelectionStart() : 0;
                TextInputLayout textInputLayout2 = consentScreenView.f49814g;
                if (textInputLayout2 == null) {
                    s.m("confirmationInputView");
                    throw null;
                }
                EditText editText2 = textInputLayout2.getEditText();
                int selectionEnd = editText2 != null ? editText2.getSelectionEnd() : 0;
                TextInputLayout textInputLayout3 = consentScreenView.f49814g;
                if (textInputLayout3 == null) {
                    s.m("confirmationInputView");
                    throw null;
                }
                CharSequence suffixText = textInputLayout3.getSuffixText();
                if (suffixText == null || suffixText.equals(context2.getString(R.string.consent_lib_lbl_hide))) {
                    TextInputLayout textInputLayout4 = consentScreenView.f49814g;
                    if (textInputLayout4 == null) {
                        s.m("confirmationInputView");
                        throw null;
                    }
                    textInputLayout4.setSuffixText(context2.getString(R.string.consent_lib_lbl_show));
                    TextInputLayout textInputLayout5 = consentScreenView.f49814g;
                    if (textInputLayout5 == null) {
                        s.m("confirmationInputView");
                        throw null;
                    }
                    EditText editText3 = textInputLayout5.getEditText();
                    if (editText3 != null) {
                        editText3.setTransformationMethod(new PasswordTransformationMethod());
                    }
                } else {
                    TextInputLayout textInputLayout6 = consentScreenView.f49814g;
                    if (textInputLayout6 == null) {
                        s.m("confirmationInputView");
                        throw null;
                    }
                    textInputLayout6.setSuffixText(context2.getString(R.string.consent_lib_lbl_hide));
                    TextInputLayout textInputLayout7 = consentScreenView.f49814g;
                    if (textInputLayout7 == null) {
                        s.m("confirmationInputView");
                        throw null;
                    }
                    EditText editText4 = textInputLayout7.getEditText();
                    if (editText4 != null) {
                        editText4.setTransformationMethod(null);
                    }
                }
                TextInputLayout textInputLayout8 = consentScreenView.f49814g;
                if (textInputLayout8 == null) {
                    s.m("confirmationInputView");
                    throw null;
                }
                EditText editText5 = textInputLayout8.getEditText();
                if (editText5 != null) {
                    editText5.setSelection(selectionStart, selectionEnd);
                    return;
                }
                return;
            case 26:
                DeviceUploadConsentView deviceUploadConsentView = (DeviceUploadConsentView) obj2;
                e23.l lVar4 = (e23.l) obj;
                int i30 = DeviceUploadConsentView.f49834h;
                deviceUploadConsentView.b();
                SwitchCompat switchCompat2 = deviceUploadConsentView.f49838d;
                if (switchCompat2 == null) {
                    s.m("deviceUploadSwitch");
                    throw null;
                }
                switchCompat2.setVisibility(4);
                deviceUploadConsentView.f49839e.setVisibility(0);
                SwitchCompat switchCompat3 = deviceUploadConsentView.f49838d;
                if (switchCompat3 != null) {
                    lVar4.invoke(Boolean.valueOf(switchCompat3.isChecked()));
                    return;
                } else {
                    s.m("deviceUploadSwitch");
                    throw null;
                }
            case 27:
                ((com.garmin.android.apps.connectmobile.golf.truswing.h) obj2).f35835g.c3((com.garmin.android.apps.connectmobile.golf.truswing.model.c) obj);
                return;
            case 28:
                wo.d dVar4 = (wo.d) obj2;
                wo.d.a aVar8 = (wo.d.a) obj;
                int i34 = wo.d.a.f186407d;
                int i35 = dVar4.f186406c;
                dVar4.f186406c = aVar8.getBindingAdapterPosition();
                e23.l<Integer, Unit> lVar5 = dVar4.f186405b;
                if (lVar5 != null) {
                    lVar5.invoke(Integer.valueOf(aVar8.f186409b));
                }
                dVar4.notifyItemChanged(dVar4.f186406c);
                dVar4.notifyItemChanged(i35);
                return;
            default:
                wr.l lVar6 = (wr.l) obj2;
                wr.l.b bVar5 = (wr.l.b) obj;
                int i36 = wr.l.b.f186793b;
                List<ln.b> list = lVar6.f186788a;
                ln.b bVar6 = list.get(bVar5.getBindingAdapterPosition());
                LinkedHashMap linkedHashMap = lVar6.f186792e;
                linkedHashMap.put(bVar6, Boolean.TRUE);
                if (lVar6.f186791d != bVar5.getBindingAdapterPosition()) {
                    int size = list.size();
                    int i37 = lVar6.f186791d;
                    if (i37 < 0 || i37 >= size) {
                        return;
                    }
                    linkedHashMap.put(list.get(i37), Boolean.FALSE);
                    lVar6.f186791d = bVar5.getBindingAdapterPosition();
                    lVar6.notifyDataSetChanged();
                    wr.l.a aVar9 = lVar6.f186789b;
                    if (aVar9 != null) {
                        aVar9.a(bVar6);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
