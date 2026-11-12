package com.garmin.android.apps.connectmobile.connectiq;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.Toast;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.devices.wifi.GCMWiFiNetworksActivity;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class q implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConnectIQDownloadListActivity f31938b;

    public /* synthetic */ q(ConnectIQDownloadListActivity connectIQDownloadListActivity, int i14) {
        this.f31937a = i14;
        this.f31938b = connectIQDownloadListActivity;
    }

    /* JADX WARN: Code duplicated, block: B:97:0x0256  */
    @Override // e23.l
    public final Object invoke(Object obj) {
        Intent intent;
        int i14 = this.f31937a;
        final int i15 = 0;
        final ConnectIQDownloadListActivity connectIQDownloadListActivity = this.f31938b;
        switch (i14) {
            case 0:
                y10.o0 o0Var = (y10.o0) obj;
                ConnectIQDownloadListActivity.a aVar = ConnectIQDownloadListActivity.f31779o;
                int i16 = o0Var.f193972a;
                int i17 = o0Var.f193973b;
                String str = o0Var.f193974c;
                String string = i16 > i17 ? connectIQDownloadListActivity.getString(R.string.lbl_move_above_value, str) : connectIQDownloadListActivity.getString(R.string.lbl_move_below_value, str);
                string.getClass();
                c22.b.h(connectIQDownloadListActivity, string);
                return Unit.INSTANCE;
            case 1:
                return ConnectIQDownloadListActivity.ca(connectIQDownloadListActivity);
            case 2:
                ConnectIQDownloadListActivity.a aVar2 = ConnectIQDownloadListActivity.f31779o;
                connectIQDownloadListActivity.finish();
                return Unit.INSTANCE;
            case 3:
                sd2.f fVar = (sd2.f) obj;
                ConnectIQDownloadListActivity.a aVar3 = ConnectIQDownloadListActivity.f31779o;
                if (fVar == null) {
                    return Unit.INSTANCE;
                }
                GCMWiFiNetworksActivity.f43245f.g(this.f31938b, fVar.getUnitID(), fVar.getProductNumber(), fVar.getDisplayName(), zb0.k.g(fVar).getF143520j());
                return Unit.INSTANCE;
            case 4:
                ConnectIQDownloadListActivity.a aVar4 = ConnectIQDownloadListActivity.f31779o;
                long jEa = connectIQDownloadListActivity.ea();
                l lVarDa = connectIQDownloadListActivity.da();
                com.garmin.android.apps.connectmobile.l.g().getClass();
                if (com.garmin.android.apps.connectmobile.l.i()) {
                    com.garmin.android.apps.connectmobile.l.g().getClass();
                    if (TextUtils.isEmpty(com.garmin.android.apps.connectmobile.l.f())) {
                        intent = new Intent(connectIQDownloadListActivity, (Class<?>) ConnectIQAppStoreActivity.class);
                    } else {
                        intent = new Intent(connectIQDownloadListActivity, (Class<?>) ConnectIQDeviceRedirectActivity.class);
                    }
                } else {
                    intent = new Intent(connectIQDownloadListActivity, (Class<?>) ConnectIQAppStoreActivity.class);
                }
                intent.putExtra("GCM_deviceUnitID", jEa);
                intent.putExtra("APP_TYPE", lVarDa);
                intent.putExtra("deepLinkType", ConnectIQDeviceRedirectActivity.a.SEARCH.ordinal());
                connectIQDownloadListActivity.startActivityForResult(intent, 0);
                return Unit.INSTANCE;
            case 5:
                o10.b bVar = (o10.b) obj;
                ConnectIQDownloadListActivity.a aVar5 = ConnectIQDownloadListActivity.f31779o;
                bVar.getClass();
                if (connectIQDownloadListActivity.fa().H4()) {
                    connectIQDownloadListActivity.showProgressOverlay(connectIQDownloadListActivity.getString(R.string.txt_saving));
                }
                connectIQDownloadListActivity.fa().K4(bVar, new cn1.d(4, (Object) connectIQDownloadListActivity, (Object) bVar));
                return Unit.INSTANCE;
            case 6:
                y.a aVar6 = (y.a) obj;
                ConnectIQDownloadListActivity.a aVar7 = ConnectIQDownloadListActivity.f31779o;
                aVar6.getClass();
                y10.k kVarFa = connectIQDownloadListActivity.fa();
                ge1.b.T(v1.a(kVarFa), null, null, new y10.z(aVar6, kVarFa, null), 3);
                return Unit.INSTANCE;
            case 7:
                y.a aVar8 = (y.a) obj;
                ConnectIQDownloadListActivity.a aVar9 = ConnectIQDownloadListActivity.f31779o;
                aVar8.getClass();
                y10.k kVarFa2 = connectIQDownloadListActivity.fa();
                ge1.b.T(v1.a(kVarFa2), null, null, new y10.a0(aVar8, kVarFa2, null), 3);
                return Unit.INSTANCE;
            default:
                y10.n0 n0Var = (y10.n0) obj;
                ConnectIQDownloadListActivity.a aVar10 = ConnectIQDownloadListActivity.f31779o;
                if (p005kotlin.jvm.internal.s.g(n0Var, y10.n0.f.f193967a)) {
                    connectIQDownloadListActivity.showProgressOverlay();
                } else if (n0Var instanceof y10.n0.b) {
                    connectIQDownloadListActivity.hideProgressOverlay();
                    Button button = connectIQDownloadListActivity.f31782c;
                    if (button == null) {
                        p005kotlin.jvm.internal.s.m("getMoreBtn");
                        throw null;
                    }
                    y10.n0.b bVar2 = (y10.n0.b) n0Var;
                    button.setVisibility(bVar2.f193958b ? 0 : 8);
                    w wVar = connectIQDownloadListActivity.f31780a;
                    if (wVar == null) {
                        p005kotlin.jvm.internal.s.m("adapter");
                        throw null;
                    }
                    wVar.t(bVar2.f193957a);
                    if (bVar2.f193959c) {
                        Context applicationContext = connectIQDownloadListActivity.getApplicationContext();
                        applicationContext.getClass();
                        yr1.e.g(connectIQDownloadListActivity.ea(), PlaybackStateCompat.ACTION_PREPARE_FROM_URI, applicationContext, "ConnectIQDownloadListActivity");
                    }
                } else if (n0Var instanceof y10.n0.d) {
                    connectIQDownloadListActivity.hideProgressOverlay();
                    y10.n0.d dVar = (y10.n0.d) n0Var;
                    List<? extends y> list = dVar.f193965d;
                    if (list != null) {
                        w wVar2 = connectIQDownloadListActivity.f31780a;
                        if (wVar2 == null) {
                            p005kotlin.jvm.internal.s.m("adapter");
                            throw null;
                        }
                        wVar2.t(list);
                    }
                    if (!dVar.f193962a) {
                        Toast.makeText(connectIQDownloadListActivity, connectIQDownloadListActivity.getString(R.string.connect_iq_it_error), 0).show();
                    }
                    dVar.f193963b.invoke(dVar.f193964c);
                } else {
                    boolean zG = p005kotlin.jvm.internal.s.g(n0Var, y10.n0.h.f193969a);
                    int i18 = R.string.device_communication_error_msg;
                    if (zG) {
                        connectIQDownloadListActivity.hideProgressOverlay();
                        Toast.makeText(connectIQDownloadListActivity, connectIQDownloadListActivity.getString(R.string.device_communication_error_msg), 0).show();
                        connectIQDownloadListActivity.setResult(0);
                        connectIQDownloadListActivity.finish();
                    } else {
                        boolean zG2 = p005kotlin.jvm.internal.s.g(n0Var, y10.n0.g.f193968a);
                        int i19 = R.string.lbl_close;
                        if (zG2) {
                            androidx.appcompat.app.e.a aVar11 = new androidx.appcompat.app.e.a(connectIQDownloadListActivity);
                            if (connectIQDownloadListActivity.fa().f193911j == 0) {
                                aVar11.setMessage(R.string.connect_iq_no_slots_available_msg).setTitle(R.string.lbl_not_enough_space);
                            } else {
                                aVar11.setMessage(R.string.connect_iq_no_space_available_msg).setTitle(R.string.lbl_not_enough_space);
                            }
                            aVar11.setNeutralButton(R.string.lbl_close, new i(3));
                            aVar11.create().show();
                        } else {
                            boolean z14 = n0Var instanceof y10.n0.a;
                            final int i24 = 1;
                            int i25 = R.string.dialog_title_error;
                            if (z14) {
                                connectIQDownloadListActivity.hideProgressOverlay();
                                androidx.appcompat.app.e eVar = connectIQDownloadListActivity.f31787h;
                                if (eVar != null && eVar.isShowing()) {
                                    return Unit.INSTANCE;
                                }
                                if (((y10.n0.a) n0Var).f193956a) {
                                    i18 = R.string.msg_unable_to_complete_action_during_sw_update;
                                    i25 = R.string.unable_to_complete_action;
                                    i19 = R.string.lbl_ok;
                                }
                                androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(connectIQDownloadListActivity).setMessage(i18).setTitle(i25).setPositiveButton(i19, new ag0.d(12, n0Var, connectIQDownloadListActivity)).create();
                                connectIQDownloadListActivity.f31787h = eVarCreate;
                                if (eVarCreate != null) {
                                    eVarCreate.show();
                                }
                            } else if (p005kotlin.jvm.internal.s.g(n0Var, y10.n0.c.f193961a)) {
                                connectIQDownloadListActivity.hideProgressOverlay();
                                androidx.appcompat.app.e eVar2 = connectIQDownloadListActivity.f31787h;
                                if (eVar2 != null && eVar2.isShowing()) {
                                    return Unit.INSTANCE;
                                }
                                androidx.appcompat.app.e eVarCreate2 = new androidx.appcompat.app.e.a(connectIQDownloadListActivity).setMessage(R.string.connect_iq_it_error).setTitle(R.string.dialog_title_error).setPositiveButton(R.string.lbl_close, new DialogInterface.OnClickListener() { // from class: com.garmin.android.apps.connectmobile.connectiq.s
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i26) {
                                        int i27 = i15;
                                        ConnectIQDownloadListActivity connectIQDownloadListActivity2 = connectIQDownloadListActivity;
                                        switch (i27) {
                                            case 0:
                                                ConnectIQDownloadListActivity.a aVar12 = ConnectIQDownloadListActivity.f31779o;
                                                dialogInterface.getClass();
                                                dialogInterface.dismiss();
                                                connectIQDownloadListActivity2.setResult(0);
                                                connectIQDownloadListActivity2.finish();
                                                break;
                                            default:
                                                ConnectIQDownloadListActivity.a aVar13 = ConnectIQDownloadListActivity.f31779o;
                                                dialogInterface.getClass();
                                                dialogInterface.dismiss();
                                                connectIQDownloadListActivity2.setResult(0);
                                                connectIQDownloadListActivity2.finish();
                                                break;
                                        }
                                    }
                                }).create();
                                connectIQDownloadListActivity.f31787h = eVarCreate2;
                                if (eVarCreate2 != null) {
                                    eVarCreate2.show();
                                }
                            } else {
                                if (!p005kotlin.jvm.internal.s.g(n0Var, y10.n0.e.f193966a)) {
                                    lc.u0.r();
                                    return null;
                                }
                                connectIQDownloadListActivity.hideProgressOverlay();
                                androidx.appcompat.app.e eVar3 = connectIQDownloadListActivity.f31787h;
                                if (eVar3 != null && eVar3.isShowing()) {
                                    return Unit.INSTANCE;
                                }
                                androidx.appcompat.app.e eVarCreate3 = new androidx.appcompat.app.e.a(connectIQDownloadListActivity).setMessage(R.string.connect_iq_device_has_disconnected_msg).setTitle(R.string.dialog_title_error).setPositiveButton(R.string.lbl_close, new DialogInterface.OnClickListener() { // from class: com.garmin.android.apps.connectmobile.connectiq.s
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i26) {
                                        int i27 = i24;
                                        ConnectIQDownloadListActivity connectIQDownloadListActivity2 = connectIQDownloadListActivity;
                                        switch (i27) {
                                            case 0:
                                                ConnectIQDownloadListActivity.a aVar12 = ConnectIQDownloadListActivity.f31779o;
                                                dialogInterface.getClass();
                                                dialogInterface.dismiss();
                                                connectIQDownloadListActivity2.setResult(0);
                                                connectIQDownloadListActivity2.finish();
                                                break;
                                            default:
                                                ConnectIQDownloadListActivity.a aVar13 = ConnectIQDownloadListActivity.f31779o;
                                                dialogInterface.getClass();
                                                dialogInterface.dismiss();
                                                connectIQDownloadListActivity2.setResult(0);
                                                connectIQDownloadListActivity2.finish();
                                                break;
                                        }
                                    }
                                }).create();
                                connectIQDownloadListActivity.f31787h = eVarCreate3;
                                if (eVarCreate3 != null) {
                                    eVarCreate3.show();
                                }
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
