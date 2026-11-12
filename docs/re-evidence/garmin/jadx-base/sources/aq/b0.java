package aq;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import com.garmin.feature.garminpay.ui.common.PasscodeControlView;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11831c;

    public /* synthetic */ b0(int i14, KeyEvent.Callback callback, int i15) {
        this.f11829a = i15;
        this.f11830b = i14;
        this.f11831c = callback;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14;
        int i15;
        int i16 = this.f11829a;
        int i17 = 1;
        Character ch3 = null;
        int i18 = this.f11830b;
        Object obj = this.f11831c;
        switch (i16) {
            case 0:
                c0 c0Var = (c0) obj;
                int i19 = c0.f11852i;
                Context contextRequireContext = c0Var.requireContext();
                contextRequireContext.getClass();
                String quantityString = c0Var.getResources().getQuantityString(R.plurals.delete_multi_sets_title, i18);
                quantityString.getClass();
                String quantityString2 = c0Var.getResources().getQuantityString(R.plurals.delete_multi_sets_msg, i18);
                quantityString2.getClass();
                new r22.k0(contextRequireContext, new r22.k0.a(quantityString, quantityString2, true, false, null, null, c0Var.getString(R.string.lbl_delete), Integer.valueOf(a7.b.getColor(c0Var.requireContext(), R.color.gcm_text_danger_selector)), new a03.f(c0Var, 17), c0Var.getString(R.string.lbl_cancel), null, null, 3128, null)).show();
                break;
            case 1:
                qw0.y yVar = ((br2.e) obj).f19596d;
                if (yVar != null) {
                    yVar.invoke(Integer.valueOf(i18));
                }
                break;
            case 2:
                PasscodeControlView passcodeControlView = (PasscodeControlView) obj;
                PasscodeControlView.f51866r.getClass();
                switch (i18) {
                    case 0:
                        ch3 = '1';
                        break;
                    case 1:
                        ch3 = '2';
                        break;
                    case 2:
                        ch3 = '3';
                        break;
                    case 3:
                        ch3 = '4';
                        break;
                    case 4:
                        ch3 = '5';
                        break;
                    case 5:
                        ch3 = '6';
                        break;
                    case 6:
                        ch3 = '7';
                        break;
                    case 7:
                        ch3 = '8';
                        break;
                    case 8:
                        ch3 = '9';
                        break;
                    case 9:
                        ch3 = '-';
                        break;
                    case 10:
                        ch3 = '0';
                        break;
                }
                if (ch3 == null || ch3.charValue() != '-') {
                    StringBuilder sb3 = passcodeControlView.f51882p;
                    if (ch3 != null) {
                        char cCharValue = ch3.charValue();
                        if (sb3.length() < 4) {
                            passcodeControlView.i(passcodeControlView.f51882p.length(), true);
                            passcodeControlView.f51882p.append(cCharValue);
                            if (passcodeControlView.f51882p.length() == 4) {
                                passcodeControlView.f51877k.setEnabled(false);
                                passcodeControlView.f51881o.postDelayed(new a0.c(passcodeControlView, 23), 150L);
                            }
                        }
                    } else if (sb3.length() > 0) {
                        passcodeControlView.i(passcodeControlView.f51882p.length() - 1, false);
                        StringBuilder sb4 = passcodeControlView.f51882p;
                        sb4.deleteCharAt(sb4.length() - 1);
                        if (passcodeControlView.f51882p.length() == 0) {
                            passcodeControlView.i(0, false);
                        }
                    }
                    break;
                }
                break;
            case 3:
                com.garmin.android.apps.connectmobile.contacts.h hVar = (com.garmin.android.apps.connectmobile.contacts.h) obj;
                com.garmin.android.apps.connectmobile.contacts.h.a aVar = hVar.f32725b;
                if (aVar != null) {
                    aVar.B((f20.o) hVar.f32728e.get(i18), null);
                }
                break;
            case 4:
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f fVar = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f) obj;
                fVar.f49180e.invoke((com.garmin.android.apps.connectmobile.workouts.data.model.h0) fVar.f49183h.get(i18), Integer.valueOf(i18));
                break;
            case 5:
                ((com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.i) obj).f49203a.C5(i18);
                break;
            case 6:
                Activity activity = (Activity) obj;
                if (i18 > 0 && activity != null) {
                    ((wt1.a) KoinJavaComponent.get$default(wt1.a.class, null, null, 6, null)).k(activity);
                    break;
                }
                break;
            case 7:
                hy.r rVar = (hy.r) obj;
                e23.l<CalendarItemDTO, Unit> lVar = rVar.f86357d;
                if (lVar != null) {
                    lVar.invoke((CalendarItemDTO) rVar.f86359f.get(i18));
                }
                break;
            case 8:
                j10.r rVar2 = (j10.r) obj;
                rVar2.f96401e = i18;
                rVar2.notifyDataSetChanged();
                break;
            case 9:
                e23.l<? super Integer, Unit> lVar2 = ((kr2.b) obj).f106241c;
                if (lVar2 != null) {
                    lVar2.invoke(Integer.valueOf(i18));
                }
                break;
            case 10:
                ((js0.c) obj).f100617d.invoke(Integer.valueOf(i18));
                break;
            case 11:
                androidx.media3.ui.c.e eVar = (androidx.media3.ui.c.e) obj;
                androidx.media3.ui.c cVar = androidx.media3.ui.c.this;
                if (i18 != eVar.f10088c) {
                    cVar.setPlaybackSpeed(eVar.f10087b[i18]);
                }
                cVar.f10057k.dismiss();
                break;
            case 12:
                ko.c cVar2 = (ko.c) obj;
                cVar2.f105704c.invoke(cVar2.f105702a.get(i18));
                break;
            case 13:
                ((ms0.a) obj).f120452c.invoke(Integer.valueOf(i18));
                break;
            case 14:
                og1.c cVar3 = (og1.c) obj;
                og1.f fVar2 = cVar3.f131992c;
                String str = cVar3.f131990a.get(i18);
                str.getClass();
                fVar2.u4(str);
                break;
            case 15:
                ph2.d dVar = (ph2.d) obj;
                oh2.c cVar4 = dVar.f137722f;
                if (!(cVar4 != null ? p005kotlin.jvm.internal.s.g(cVar4.f132174c, Boolean.TRUE) : false) && (i14 = dVar.f137721e) != 255) {
                    dVar.a(i18, i14, false);
                    dVar.f137721e = 255;
                    break;
                }
                break;
            case 16:
                int i24 = qh2.b.f144803d;
                qh2.a.InterfaceC2731a onWatchFaceIconClicked = ((qh2.b) obj).getOnWatchFaceIconClicked();
                if (onWatchFaceIconClicked != null) {
                    onWatchFaceIconClicked.p0(i18);
                }
                break;
            case 17:
                List<Integer> list = qh2.c.f144804d;
                qh2.a.InterfaceC2731a onWatchFaceIconClicked2 = ((qh2.c) obj).getOnWatchFaceIconClicked();
                if (onWatchFaceIconClicked2 != null) {
                    onWatchFaceIconClicked2.p0(i18);
                }
                break;
            case 18:
                ((r22.b1) obj).f149593b.invoke(Integer.valueOf(i18));
                break;
            case 19:
                sf0.e.a aVar2 = (sf0.e.a) obj;
                aVar2.f158831b.invoke(aVar2.f158830a.get(i18));
                break;
            case 20:
                com.garmin.android.library.geolocationrestapi.a aVar3 = (com.garmin.android.library.geolocationrestapi.a) obj;
                aVar3.f50150b = i18;
                aVar3.notifyDataSetChanged();
                aVar3.f50151c.a(i18);
                break;
            case 21:
                wa1.b bVar = (wa1.b) obj;
                int i25 = bVar.f183794f;
                if (i25 > 0) {
                    i18 = i25;
                }
                Context context = bVar.f183791c;
                context.getClass();
                sa1.x.a(i18, context, new va1.d(bVar, i17)).show();
                break;
            default:
                yg1.e eVar2 = (yg1.e) obj;
                yg1.g gVar = eVar2.f196913e;
                if ((gVar == null || !gVar.f196921c.booleanValue()) && (i15 = eVar2.f196912d) != 255) {
                    eVar2.a(i18, i15, false);
                    eVar2.f196912d = 255;
                }
                break;
        }
    }

    public /* synthetic */ b0(Object obj, int i14, int i15) {
        this.f11829a = i15;
        this.f11831c = obj;
        this.f11830b = i14;
    }
}
