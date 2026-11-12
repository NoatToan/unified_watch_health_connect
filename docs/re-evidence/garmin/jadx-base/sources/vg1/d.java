package vg1;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.media.AudioRecord;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.SwitchCompat;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.l2;
import androidx.viewpager2.widget.ViewPager2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.antitheft.AntiTheftMovementAlertEvent;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.antitheft.AntiTheftSettingChangeRequestEvent;
import com.garmin.android.apps.connectmobile.gncs.TailMusicLogsActivity;
import com.garmin.android.apps.connectmobile.golf.truswing.ClubSelectionDrawerFragment;
import com.garmin.android.apps.connectmobile.golf.truswing.TruSwingRawDataActivity;
import com.garmin.android.apps.connectmobile.group.service.model.GroupDetailsDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.promotions.CampaignInfoFullScreenActivity;
import com.garmin.android.apps.connectmobile.settings.devices.common.BikeAlarmResetPassCodeActivity;
import com.garmin.android.apps.connectmobile.settings.devices.common.BikeAlarmSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.common.TransferActivityProfilesActivity;
import com.garmin.android.apps.connectmobile.settings.devices.common.TransferSensorsActivity;
import com.garmin.android.library.mobileauth.ui.AuthenticateAndFetchCustomerGUIDActivity;
import com.garmin.android.library.mobileauth.ui.AuthenticationActivity;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.feature.garminpay.providers.felica.ui.FelicaUpdateUserInfoActivity;
import com.garmin.proto.generated.GDIAntiTheftAlarmExtension;
import com.garmin.proto.generated.GDIAntiTheftAlarmProto;
import com.garmin.proto.generated.GDISmartProto;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.common.primitives.UnsignedBytes;
import i3.e5;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import org.slf4j.Logger;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f178090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f178091c;

    public /* synthetic */ d(int i14, Object obj, Object obj2) {
        this.f178089a = i14;
        this.f178090b = obj;
        this.f178091c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, vq2.f] */
    @Override // java.lang.Runnable
    public final void run() {
        wl0.f fVar;
        OutputStream outputStream;
        ScheduledFuture<?> scheduledFuture;
        g1.r rVar;
        int i14 = 3;
        final int i15 = 1;
        final int i16 = 0;
        switch (this.f178089a) {
            case 0:
                Editable editable = (Editable) this.f178090b;
                BikeAlarmResetPassCodeActivity bikeAlarmResetPassCodeActivity = (BikeAlarmResetPassCodeActivity) this.f178091c;
                if (TextUtils.isEmpty(String.valueOf(editable))) {
                    return;
                }
                String[] strArr = bikeAlarmResetPassCodeActivity.f42571f;
                ArrayList<EditText> arrayList = bikeAlarmResetPassCodeActivity.f42566a;
                strArr[bikeAlarmResetPassCodeActivity.f42568c] = String.valueOf(editable);
                int i17 = bikeAlarmResetPassCodeActivity.f42568c;
                EditText editText = bikeAlarmResetPassCodeActivity.f42577l;
                if (editText == null) {
                    p005kotlin.jvm.internal.s.m("bikeAlarmPasscodeInput4");
                    throw null;
                }
                Object tag = editText.getTag();
                if (!(tag instanceof Integer) || i17 != ((Number) tag).intValue()) {
                    int i18 = bikeAlarmResetPassCodeActivity.f42568c + 1;
                    if (i18 < arrayList.size()) {
                        bikeAlarmResetPassCodeActivity.f42567b.set(bikeAlarmResetPassCodeActivity.f42568c, Boolean.TRUE);
                        arrayList.get(i18).requestFocus();
                        return;
                    }
                    return;
                }
                StringBuilder sb3 = new StringBuilder();
                Iterator<EditText> it = arrayList.iterator();
                it.getClass();
                while (it.hasNext()) {
                    EditText next = it.next();
                    next.getClass();
                    sb3.append(next.getText().toString());
                }
                String string = sb3.toString();
                if (string.length() == 4) {
                    TextView textView = bikeAlarmResetPassCodeActivity.f42572g;
                    if (textView == null) {
                        p005kotlin.jvm.internal.s.m("bikeAlarmResetPassCode");
                        throw null;
                    }
                    if (p005kotlin.jvm.internal.s.g(textView.getTag(), "PASS_CODE_RESET_TAG")) {
                        bikeAlarmResetPassCodeActivity.f42569d = Integer.valueOf(Integer.parseInt(string));
                        TextView textView2 = bikeAlarmResetPassCodeActivity.f42572g;
                        if (textView2 == null) {
                            p005kotlin.jvm.internal.s.m("bikeAlarmResetPassCode");
                            throw null;
                        }
                        textView2.setTag("PASS_CODE_CONFIRM_TAG");
                        TextView textView3 = bikeAlarmResetPassCodeActivity.f42572g;
                        if (textView3 == null) {
                            p005kotlin.jvm.internal.s.m("bikeAlarmResetPassCode");
                            throw null;
                        }
                        textView3.setText(bikeAlarmResetPassCodeActivity.getString(R.string.wallet_confirm_passcode));
                        bikeAlarmResetPassCodeActivity.ca();
                        return;
                    }
                    int i19 = Integer.parseInt(string);
                    Integer num = bikeAlarmResetPassCodeActivity.f42569d;
                    if (num != null && num.intValue() == i19) {
                        Long l14 = bikeAlarmResetPassCodeActivity.f42570e;
                        if (l14 != null) {
                            com.garmin.android.apps.connectmobile.settings.devices.common.c cVar = new com.garmin.android.apps.connectmobile.settings.devices.common.c(l14.longValue(), bikeAlarmResetPassCodeActivity);
                            GDIAntiTheftAlarmProto.ResetPINRequest.Builder builderNewBuilder = GDIAntiTheftAlarmProto.ResetPINRequest.newBuilder();
                            builderNewBuilder.setPin(i19);
                            GDIAntiTheftAlarmProto.AntiTheftAlarmService.Builder builderNewBuilder2 = GDIAntiTheftAlarmProto.AntiTheftAlarmService.newBuilder();
                            builderNewBuilder2.setResetPinRequest(builderNewBuilder);
                            GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
                            builderNewBuilder3.getClass();
                            builderNewBuilder3.setExtension(GDIAntiTheftAlarmExtension.antiTheftAlarmService, builderNewBuilder2.build());
                            cVar.b(builderNewBuilder3);
                            return;
                        }
                        return;
                    }
                    bikeAlarmResetPassCodeActivity.ca();
                    TextView textView4 = bikeAlarmResetPassCodeActivity.f42572g;
                    if (textView4 == null) {
                        p005kotlin.jvm.internal.s.m("bikeAlarmResetPassCode");
                        throw null;
                    }
                    textView4.setTag("PASS_CODE_RESET_TAG");
                    TextView textView5 = bikeAlarmResetPassCodeActivity.f42572g;
                    if (textView5 == null) {
                        p005kotlin.jvm.internal.s.m("bikeAlarmResetPassCode");
                        throw null;
                    }
                    textView5.setText(bikeAlarmResetPassCodeActivity.getString(R.string.wallet_reset_passcode));
                    u20.e.v6("", bikeAlarmResetPassCodeActivity.getString(R.string.wallet_new_passcodes_not_matched)).g(bikeAlarmResetPassCodeActivity.getSupportFragmentManager());
                    return;
                }
                return;
            case 1:
                BikeAlarmSettingActivity bikeAlarmSettingActivity = (BikeAlarmSettingActivity) this.f178090b;
                AntiTheftSettingChangeRequestEvent antiTheftSettingChangeRequestEvent = (AntiTheftSettingChangeRequestEvent) this.f178091c;
                int i24 = BikeAlarmSettingActivity.f42584f;
                com.garmin.android.apps.connectmobile.settings.devices.common.b bVarDa = bikeAlarmSettingActivity.da();
                if (bVarDa != null) {
                    boolean changeRequestEnabled = antiTheftSettingChangeRequestEvent.getChangeRequestEnabled();
                    SwitchCompat switchCompat = bVarDa.f42821b;
                    if (switchCompat == null) {
                        p005kotlin.jvm.internal.s.m("bikeAlarmOptionsArmSwitch");
                        throw null;
                    }
                    switchCompat.setChecked(changeRequestEnabled);
                    SwitchCompat switchCompat2 = bVarDa.f42821b;
                    if (switchCompat2 == null) {
                        p005kotlin.jvm.internal.s.m("bikeAlarmOptionsArmSwitch");
                        throw null;
                    }
                    if (switchCompat2.isChecked()) {
                        return;
                    }
                    bVarDa.u6("BIKE_ALARM_DISABLE_TAG", false);
                    return;
                }
                return;
            case 2:
                BikeAlarmSettingActivity bikeAlarmSettingActivity2 = (BikeAlarmSettingActivity) this.f178090b;
                AntiTheftMovementAlertEvent antiTheftMovementAlertEvent = (AntiTheftMovementAlertEvent) this.f178091c;
                int i25 = BikeAlarmSettingActivity.f42584f;
                com.garmin.android.apps.connectmobile.settings.devices.common.b bVarDa2 = bikeAlarmSettingActivity2.da();
                if (bVarDa2 != null) {
                    if (antiTheftMovementAlertEvent.getAlertNotificationKey()) {
                        bVarDa2.u6("BIKE_ALARM_SOUND_TAG", true);
                        return;
                    } else {
                        bVarDa2.u6("BIKE_ALARM_SOUND_TAG", false);
                        return;
                    }
                }
                return;
            case 3:
                r22.m0 m0Var = (r22.m0) this.f178090b;
                TransferActivityProfilesActivity transferActivityProfilesActivity = (TransferActivityProfilesActivity) this.f178091c;
                TransferActivityProfilesActivity.a aVar = TransferActivityProfilesActivity.f42791h;
                m0Var.dismissAllowingStateLoss();
                transferActivityProfilesActivity.finish();
                return;
            case 4:
                r22.m0 m0Var2 = (r22.m0) this.f178090b;
                TransferSensorsActivity transferSensorsActivity = (TransferSensorsActivity) this.f178091c;
                TransferSensorsActivity.a aVar2 = TransferSensorsActivity.f42801h;
                m0Var2.dismissAllowingStateLoss();
                transferSensorsActivity.finish();
                return;
            case 5:
                o13.p pVar = (o13.p) this.f178090b;
                DeviceProfile deviceProfile = (DeviceProfile) this.f178091c;
                try {
                    B b14 = pVar.f128595b;
                    A a14 = pVar.f128594a;
                    if (b14 != 0) {
                        lm2.f fVarE = lm2.h.e();
                        deviceProfile.getClass();
                        B b15 = pVar.f128595b;
                        b15.getClass();
                        ((em2.d) fVarE).a(deviceProfile, new o13.p<>(a14, b15));
                    } else {
                        lm2.f fVarE2 = lm2.h.e();
                        deviceProfile.getClass();
                        ((em2.d) fVarE2).d(deviceProfile, (byte[]) a14);
                    }
                    return;
                } catch (Exception e4) {
                    vm2.d.f178818e.error("updateGarminDeviceXML failed", (Throwable) e4);
                    return;
                }
            case 6:
                FelicaUpdateUserInfoActivity felicaUpdateUserInfoActivity = (FelicaUpdateUserInfoActivity) this.f178090b;
                String str = (String) this.f178091c;
                FelicaUpdateUserInfoActivity.a aVar3 = FelicaUpdateUserInfoActivity.f50988j;
                androidx.fragment.app.v supportFragmentManager = felicaUpdateUserInfoActivity.getSupportFragmentManager();
                supportFragmentManager.getClass();
                androidx.fragment.app.a aVar4 = new androidx.fragment.app.a(supportFragmentManager);
                aVar4.d("PAY#FN#FelicaUserVerificationFragment");
                xn2.v.f191738e.getClass();
                str.getClass();
                xn2.v vVar = new xn2.v();
                Bundle bundle = new Bundle();
                bundle.putString("extra.url", str);
                vVar.setArguments(bundle);
                aVar4.j(R.id.content_frame, vVar, "PAY#FN#FelicaUserVerificationFragment", 1);
                aVar4.e();
                return;
            case 7:
                ?? r14 = this.f178090b;
                String str2 = (String) this.f178091c;
                int i26 = vq2.f.A0;
                Snackbar snackbarMake = Snackbar.make(r14.W0(), str2, 0);
                snackbarMake.getClass();
                v22.c.a(snackbarMake);
                snackbarMake.show();
                return;
            case 8:
                w6.y yVar = (w6.y) this.f178090b;
                View[] viewArr = (View[]) this.f178091c;
                if (yVar.f183095p != -1) {
                    for (View view2 : viewArr) {
                        view2.setTag(yVar.f183095p, Long.valueOf(System.nanoTime()));
                    }
                }
                if (yVar.f183096q != -1) {
                    int length = viewArr.length;
                    while (i16 < length) {
                        viewArr[i16].setTag(yVar.f183096q, null);
                        i16++;
                    }
                    return;
                }
                return;
            case 9:
                ((we.d) this.f178090b).f184724b.c((ve.u) this.f178091c, 3);
                return;
            case 10:
                TailMusicLogsActivity tailMusicLogsActivity = (TailMusicLogsActivity) this.f178090b;
                String str3 = (String) this.f178091c;
                TextView textView6 = tailMusicLogsActivity.f35739a;
                if (textView6 == null) {
                    p005kotlin.jvm.internal.s.m("logTextView");
                    throw null;
                }
                textView6.append(str3);
                textView6.append("\n\n");
                if (textView6.getText().length() >= 25000) {
                    CharSequence text = textView6.getText();
                    text.getClass();
                    textView6.setText(text.subSequence(0, 5000).toString());
                    Toast.makeText(textView6.getContext(), "log output trimmed", 1).show();
                    return;
                }
                return;
            case 11:
                ClubSelectionDrawerFragment clubSelectionDrawerFragment = (ClubSelectionDrawerFragment) this.f178090b;
                hc2.c.a aVar5 = (hc2.c.a) this.f178091c;
                int[] iArr = ClubSelectionDrawerFragment.b.f35771a;
                hc2.c.a.EnumC1639a enumC1639a = aVar5.f83291a;
                Object obj = aVar5.f83292b;
                int i27 = iArr[enumC1639a.ordinal()];
                if (i27 == 2) {
                    if (clubSelectionDrawerFragment.f35761i != null) {
                        int iIntValue = ((Integer) obj).intValue();
                        RelativeLayout relativeLayout = clubSelectionDrawerFragment.f35761i;
                        double d14 = iIntValue;
                        Double dValueOf = Double.valueOf(d14);
                        wl0.v vVar2 = (wl0.v) relativeLayout.getTag();
                        vVar2.f186004b.setVisibility((Double.isNaN(d14) || d14 <= 0.0d) ? 8 : 0);
                        vVar2.f186004b.setBackgroundResource(wl0.u.a(dValueOf));
                        return;
                    }
                    return;
                }
                if (i27 == 3) {
                    clubSelectionDrawerFragment.f35765m = wl0.h.i().h(true);
                    clubSelectionDrawerFragment.f35766n.clear();
                    clubSelectionDrawerFragment.f35766n.addAll(clubSelectionDrawerFragment.f35765m);
                    clubSelectionDrawerFragment.f35766n.notifyDataSetChanged();
                    return;
                }
                if (i27 != 4) {
                    return;
                }
                long jLongValue = ((Long) obj).longValue();
                while (i16 < clubSelectionDrawerFragment.f35766n.getCount()) {
                    if (((com.garmin.android.apps.connectmobile.golf.truswing.model.a) clubSelectionDrawerFragment.f35766n.getItem(i16)).f35890b == jLongValue) {
                        clubSelectionDrawerFragment.f35764l = i16;
                        ListView listView = clubSelectionDrawerFragment.f35756d;
                        if (listView != null) {
                            listView.setItemChecked(i16 + 1, true);
                        }
                        ClubSelectionDrawerFragment.c cVar2 = clubSelectionDrawerFragment.f35753a;
                        if (cVar2 == null || (fVar = clubSelectionDrawerFragment.f35766n) == null) {
                            return;
                        }
                        cVar2.S8((com.garmin.android.apps.connectmobile.golf.truswing.model.a) fVar.getItem(i16));
                        return;
                    }
                    i16++;
                }
                ClubSelectionDrawerFragment.c cVar3 = clubSelectionDrawerFragment.f35753a;
                if (cVar3 != null) {
                    cVar3.u3();
                    return;
                }
                return;
            case 12:
                TruSwingRawDataActivity truSwingRawDataActivity = (TruSwingRawDataActivity) this.f178090b;
                hc2.b bVar = (hc2.b) this.f178091c;
                int i28 = TruSwingRawDataActivity.f35796c;
                try {
                    truSwingRawDataActivity.f35797a.setText("Reading swing data");
                    new TruSwingRawDataActivity.a(truSwingRawDataActivity, bVar).c(new Void[0]);
                    return;
                } catch (Exception e14) {
                    i2.a(a2.GOLF, "TruSwingRawDataActivity", "Exception updating UI with swing data: " + e14.getMessage());
                    return;
                }
            case 13:
                e0.c cVar4 = (e0.c) this.f178090b;
                b0.s0 s0Var = (b0.s0) this.f178091c;
                HashSet hashSet = new HashSet();
                if (cVar4 != null) {
                    hashSet.addAll(cVar4.f61821a);
                }
                s0Var.f14130g.getClass();
                return;
            case 14:
                x21.a aVar6 = (x21.a) this.f178090b;
                AudioRecord audioRecord = (AudioRecord) this.f178091c;
                int i29 = aVar6.f188482b;
                byte[] bArr = new byte[i29];
                while (aVar6.f188485e) {
                    int i30 = audioRecord.read(bArr, 0, i29);
                    if (i30 > 0) {
                        e23.l<Float, Unit> lVar = aVar6.f188481a;
                        int i34 = 0;
                        int i35 = 0;
                        double d15 = 0.0d;
                        while (true) {
                            int i36 = i34 + 1;
                            if (i36 < i30) {
                                int i37 = (bArr[i34] & UnsignedBytes.MAX_VALUE) | (bArr[i36] << 8);
                                d15 += (double) (i37 * i37);
                                i35++;
                                i34 += 2;
                            } else {
                                lVar.invoke(Float.valueOf(i35 != 0 ? j23.t.d((float) (Math.sqrt(d15 / ((double) i35)) / 6000.0d), 0.0f, 1.0f) : 0.0f));
                                synchronized (aVar6.f188486f) {
                                    outputStream = aVar6.f188487g;
                                }
                                if (outputStream != null) {
                                    try {
                                        outputStream.write(bArr, 0, i30);
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                        }
                    }
                }
                return;
            case 15:
                AuthenticateAndFetchCustomerGUIDActivity authenticateAndFetchCustomerGUIDActivity = (AuthenticateAndFetchCustomerGUIDActivity) this.f178090b;
                af2.g gVar = (af2.g) this.f178091c;
                int i38 = AuthenticateAndFetchCustomerGUIDActivity.f50337n;
                authenticateAndFetchCustomerGUIDActivity.U9(gVar, "SIGN_IN_PORTAL", xe2.i0.SIGN_IN_PORTAL);
                authenticateAndFetchCustomerGUIDActivity.T9();
                return;
            case 16:
                AuthenticateAndFetchCustomerGUIDActivity authenticateAndFetchCustomerGUIDActivity2 = (AuthenticateAndFetchCustomerGUIDActivity) this.f178090b;
                String str4 = (String) this.f178091c;
                int i39 = AuthenticateAndFetchCustomerGUIDActivity.f50337n;
                Intent intent = new Intent();
                intent.putExtra("extra.customer.guid", str4);
                Unit unit = Unit.INSTANCE;
                authenticateAndFetchCustomerGUIDActivity2.setResult(-1, intent);
                authenticateAndFetchCustomerGUIDActivity2.finish();
                return;
            case 17:
                AuthenticationActivity authenticationActivity = (AuthenticationActivity) this.f178090b;
                String str5 = (String) this.f178091c;
                AuthenticationActivity.a aVar7 = AuthenticationActivity.f50343v;
                authenticationActivity.Y9();
                authenticationActivity.f50346o = xe2.n0.a(authenticationActivity, authenticationActivity.getString(R.string.mobile_auth_title_unable_to_continue), e5.g(authenticationActivity.getString(R.string.mobile_auth_msg_sign_in_attempt_failed), "\nERR: ", str5), new xe2.f(authenticationActivity, i16), null, null, null, 112);
                return;
            case 18:
                xm0.c cVar5 = (xm0.c) this.f178090b;
                String str6 = ((GroupDetailsDTO) this.f178091c).f31558a;
                str6.getClass();
                xm0.j jVar = new xm0.j(cVar5, Long.parseLong(str6));
                cVar5.f191337g = jVar;
                ViewPager2 viewPager2 = cVar5.f191336f;
                if (viewPager2 == null) {
                    p005kotlin.jvm.internal.s.m("leaderboardListViewPager");
                    throw null;
                }
                viewPager2.setAdapter(jVar);
                TabLayoutMediator tabLayoutMediator = cVar5.f191335e;
                if (tabLayoutMediator == null) {
                    p005kotlin.jvm.internal.s.m("leaderboardTabLayoutMediator");
                    throw null;
                }
                tabLayoutMediator.detach();
                TabLayoutMediator tabLayoutMediator2 = cVar5.f191335e;
                if (tabLayoutMediator2 != null) {
                    tabLayoutMediator2.attach();
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("leaderboardTabLayoutMediator");
                    throw null;
                }
            case 19:
                ((y53.h) this.f178090b).d((y53.b) this.f178091c, Unit.INSTANCE);
                return;
            case 20:
                final yb1.b bVar2 = (yb1.b) this.f178090b;
                View view3 = (View) this.f178091c;
                int i44 = yb1.b.f195683j;
                View viewFindViewById = view3.findViewById(R.id.campaign_image_iv);
                viewFindViewById.getClass();
                bVar2.f195687d = (ImageView) viewFindViewById;
                View viewFindViewById2 = view3.findViewById(R.id.dismiss_button_iv);
                viewFindViewById2.getClass();
                bVar2.f195688e = (ImageView) viewFindViewById2;
                View viewFindViewById3 = view3.findViewById(R.id.offer_header_tv);
                viewFindViewById3.getClass();
                bVar2.f195689f = (TextView) viewFindViewById3;
                View viewFindViewById4 = view3.findViewById(R.id.offer_title_tv);
                viewFindViewById4.getClass();
                bVar2.f195690g = (TextView) viewFindViewById4;
                View viewFindViewById5 = view3.findViewById(R.id.offer_body_tv);
                viewFindViewById5.getClass();
                bVar2.f195691h = (TextView) viewFindViewById5;
                View viewFindViewById6 = view3.findViewById(R.id.view_details_button_tv);
                viewFindViewById6.getClass();
                bVar2.f195692i = (TextView) viewFindViewById6;
                TextView textView7 = bVar2.f195689f;
                if (textView7 == null) {
                    p005kotlin.jvm.internal.s.m("offerHeaderTextView");
                    throw null;
                }
                textView7.setText(bVar2.u6().getOfferPayload().getOfferHeaderText());
                TextView textView8 = bVar2.f195690g;
                if (textView8 == null) {
                    p005kotlin.jvm.internal.s.m("offerTitleTextView");
                    throw null;
                }
                textView8.setText(bVar2.u6().getOfferPayload().getOfferTitleText());
                TextView textView9 = bVar2.f195691h;
                if (textView9 == null) {
                    p005kotlin.jvm.internal.s.m("offerBodyTextView");
                    throw null;
                }
                textView9.setText(bVar2.u6().getOfferPayload().getOfferBodyText());
                TextView textView10 = bVar2.f195692i;
                if (textView10 == null) {
                    p005kotlin.jvm.internal.s.m("affirmativeActionTextView");
                    throw null;
                }
                textView10.setText(bVar2.u6().getOfferPayload().getOfferViewDetailsButtonText());
                ImageView imageView = bVar2.f195688e;
                if (imageView == null) {
                    p005kotlin.jvm.internal.s.m("dismissImageView");
                    throw null;
                }
                imageView.setOnClickListener(new View.OnClickListener() { // from class: yb1.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        switch (i16) {
                            case 0:
                                b bVar3 = bVar2;
                                bVar3.f195684a.debug("handleDismiss: ");
                                bVar3.w6(kf2.a.DISMISSED);
                                ff2.c cVarV6 = bVar3.v6();
                                cVarV6.f71143b.d(bVar3.u6().getCampaignId());
                                bVar3.dismiss();
                                break;
                            default:
                                b bVar4 = bVar2;
                                bVar4.f195684a.debug("handleAffirmativeActionPressed: Reporting and starting full-screen info page");
                                bVar4.w6(kf2.a.VIEW_DETAILS);
                                bVar4.startActivity(new Intent(bVar4.getActivity(), (Class<?>) CampaignInfoFullScreenActivity.class));
                                bVar4.dismiss();
                                break;
                        }
                    }
                });
                TextView textView11 = bVar2.f195692i;
                if (textView11 == null) {
                    p005kotlin.jvm.internal.s.m("affirmativeActionTextView");
                    throw null;
                }
                textView11.setOnClickListener(new View.OnClickListener() { // from class: yb1.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        switch (i15) {
                            case 0:
                                b bVar3 = bVar2;
                                bVar3.f195684a.debug("handleDismiss: ");
                                bVar3.w6(kf2.a.DISMISSED);
                                ff2.c cVarV6 = bVar3.v6();
                                cVarV6.f71143b.d(bVar3.u6().getCampaignId());
                                bVar3.dismiss();
                                break;
                            default:
                                b bVar4 = bVar2;
                                bVar4.f195684a.debug("handleAffirmativeActionPressed: Reporting and starting full-screen info page");
                                bVar4.w6(kf2.a.VIEW_DETAILS);
                                bVar4.startActivity(new Intent(bVar4.getActivity(), (Class<?>) CampaignInfoFullScreenActivity.class));
                                bVar4.dismiss();
                                break;
                        }
                    }
                });
                Dialog dialog = bVar2.getDialog();
                if (dialog != null) {
                    dialog.setOnCancelListener(new en0.m(bVar2, i14));
                }
                Context context = bVar2.getContext();
                Logger logger = bVar2.f195684a;
                if (context == null) {
                    logger.error("Context cannot be null.");
                    return;
                }
                logger.debug("Loading bitmap into image view: ");
                ImageView imageView2 = bVar2.f195687d;
                if (imageView2 != null) {
                    imageView2.setImageBitmap(bVar2.v6().b(bVar2.u6().getCampaignId(), kf2.c.OFFER_TYPE));
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("campaignImageView");
                    throw null;
                }
            case 21:
                e23.l lVar2 = (e23.l) this.f178090b;
                al2.c cVar6 = (al2.c) this.f178091c;
                yr1.e eVar = yr1.e.f199078a;
                if (lVar2 != null) {
                    lVar2.invoke(cVar6);
                    return;
                }
                return;
            case 22:
                z0.a0 a0Var = (z0.a0) this.f178090b;
                z0.n0.a aVar8 = (z0.n0.a) this.f178091c;
                z0.n0.a aVar9 = a0Var.Y;
                a0Var.Y = aVar8;
                if (aVar9 == aVar8) {
                    Objects.toString(aVar8);
                    return;
                }
                Objects.toString(aVar8);
                if (aVar8 != z0.n0.a.INACTIVE) {
                    if (aVar8 != z0.n0.a.ACTIVE_NON_STREAMING || (scheduledFuture = a0Var.Z) == null || !scheduledFuture.cancel(false) || (rVar = a0Var.D) == null) {
                        return;
                    }
                    z0.a0.o(rVar);
                    return;
                }
                if (a0Var.f200543z != null) {
                    z0.a0.h hVar = a0Var.f200532o;
                    if (hVar == null || hVar.k()) {
                        return;
                    }
                    a0Var.p(a0Var.f200532o, 4, null);
                    return;
                }
                z0.a0.i iVar = a0Var.f200518d0;
                if (iVar != null) {
                    if (!iVar.f200576d) {
                        iVar.f200576d = true;
                        ScheduledFuture<?> scheduledFuture2 = iVar.f200578f;
                        if (scheduledFuture2 != null) {
                            scheduledFuture2.cancel(false);
                            iVar.f200578f = null;
                        }
                    }
                    a0Var.f200518d0 = null;
                }
                a0Var.q(false);
                return;
            case 23:
                Executor executor = (Executor) this.f178090b;
                Runnable runnable = (Runnable) this.f178091c;
                Set<z0.a0.j> set = z0.a0.f200502h0;
                executor.execute(runnable);
                return;
            case 24:
                ((z0.a0.h) this.f178090b).f().accept((z0.o0) this.f178091c);
                return;
            case 25:
                z0.h0 h0Var = (z0.h0) this.f178090b;
                if (((DeferrableSurface) this.f178091c) == h0Var.f200630r) {
                    h0Var.I();
                    return;
                }
                return;
            case 26:
                z0.i0 i0Var = (z0.i0) this.f178090b;
                l2.b bVar3 = (l2.b) this.f178091c;
                bVar3.f5612b.f5825e.remove(i0Var);
                bVar3.f5615e.remove(i0Var);
                return;
            case 27:
                ((z0.m0) this.f178090b).f200683h.b((Surface) this.f178091c);
                return;
            case 28:
                androidx.media3.exoplayer.video.f.a aVar10 = (androidx.media3.exoplayer.video.f.a) this.f178090b;
                androidx.media3.common.k0 k0Var = (androidx.media3.common.k0) this.f178091c;
                androidx.media3.exoplayer.video.f fVar2 = aVar10.f9870b;
                int i45 = fa.z.f70071a;
                fVar2.k(k0Var);
                return;
            default:
                androidx.media3.exoplayer.video.f.a aVar11 = (androidx.media3.exoplayer.video.f.a) this.f178090b;
                Exception exc = (Exception) this.f178091c;
                androidx.media3.exoplayer.video.f fVar3 = aVar11.f9870b;
                int i46 = fa.z.f70071a;
                fVar3.onVideoCodecError(exc);
                return;
        }
    }
}
