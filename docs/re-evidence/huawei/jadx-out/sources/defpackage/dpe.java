package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.huawei.framework.servicemgr.Consumer;
import com.huawei.health.device.kit.wsp.task.BleTaskQueueUtil;
import com.huawei.health.device.util.EventBus;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import health.compact.a.GRSManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class dpe {
    private static final Map<String, Consumer<drb>> d = new HashMap(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dow f32184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dpc f32185c;

    public dpe(dow dowVar, dpc dpcVar) {
        this.f32184b = dowVar;
        this.f32185c = dpcVar;
        e();
    }

    private void e() {
        LogUtil.a("WspEventBusUtil", "initEventBusHandlerMap start");
        j();
        d();
        f();
        a();
        k();
        g();
        h();
        b();
        i();
        LogUtil.a("WspEventBusUtil", "initEventBusHandlerMap end");
    }

    private void j() {
        Map<String, Consumer<drb>> map = d;
        map.put("real_time_weight_info", new Consumer() { // from class: dqp
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.d.as((drb) obj);
            }
        });
        map.put("real_time_weight_info_failed", new Consumer() { // from class: dqx
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                LogUtil.j("WspEventBusUtil", "getRealtimeWightData is fail!");
            }
        });
        map.put("history_weight_info", new Consumer() { // from class: dqw
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.f32213a.ap((drb) obj);
            }
        });
        map.put("send_real_time_weight_info", new Consumer() { // from class: dqz
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.e.ar((drb) obj);
            }
        });
        map.put("send_history_weight_info", new Consumer() { // from class: dra
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.f32216c.aq((drb) obj);
            }
        });
    }

    /* synthetic */ void as(drb drbVar) {
        b(drbVar.d());
    }

    /* synthetic */ void ap(drb drbVar) {
        c(drbVar.d());
    }

    /* synthetic */ void ar(drb drbVar) {
        b(drbVar.d(), drbVar.e());
    }

    /* synthetic */ void aq(drb drbVar) {
        m();
    }

    private void d() {
        Map<String, Consumer<drb>> map = d;
        map.put("config_info_result", new Consumer() { // from class: dql
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.f32207b.f((drb) obj);
            }
        });
        map.put("send_config_info", new Consumer() { // from class: dqi
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.d.n((drb) obj);
            }
        });
        map.put("send_config_info_hag_2021", new Consumer() { // from class: dqk
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.f32206a.k((drb) obj);
            }
        });
    }

    /* synthetic */ void f(drb drbVar) {
        this.f32185c.b(drbVar.e(), -12, drbVar.d().b());
    }

    /* synthetic */ void n(drb drbVar) {
        d(drbVar.d().b(), drbVar.e());
    }

    /* synthetic */ void k(drb drbVar) {
        g(drbVar.d().b());
    }

    private void f() {
        Map<String, Consumer<drb>> map = d;
        map.put("weight_device_ota_update", new Consumer() { // from class: dqy
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.f32214a.u((drb) obj);
            }
        });
        map.put("weight_device_tlv_ota_update", new Consumer() { // from class: dph
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.f32190b.v((drb) obj);
            }
        });
        map.put("event_bus_send_ota_url", new Consumer() { // from class: dpj
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.f32192c.y((drb) obj);
            }
        });
    }

    /* synthetic */ void u(drb drbVar) {
        f(drbVar.d());
    }

    /* synthetic */ void v(drb drbVar) {
        n(drbVar.d());
    }

    /* synthetic */ void y(drb drbVar) {
        o();
    }

    private void a() {
        Map<String, Consumer<drb>> map = d;
        map.put("request_auth", new Consumer() { // from class: dpv
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.e.j((drb) obj);
            }
        });
        map.put("request_auth_token", new Consumer() { // from class: dqb
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.f32203b.g((drb) obj);
            }
        });
        map.put("request_auth_failed", new Consumer() { // from class: dpx
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.f32199c.i((drb) obj);
            }
        });
        map.put("request_auth_pass", new Consumer() { // from class: dpz
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.e.h((drb) obj);
            }
        });
    }

    /* synthetic */ void j(drb drbVar) {
        i(drbVar.d());
    }

    /* synthetic */ void g(drb drbVar) {
        j(drbVar.d());
    }

    /* synthetic */ void i(drb drbVar) {
        d(drbVar.e());
    }

    /* synthetic */ void h(drb drbVar) {
        d(drbVar.h(), drbVar.e());
    }

    private void k() {
        Map<String, Consumer<drb>> map = d;
        map.put("get_device_ssid", new Consumer() { // from class: dpd
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.f32182a.ao((drb) obj);
            }
        });
        map.put("get_device_ssid_result", new Consumer() { // from class: dpk
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.e.au((drb) obj);
            }
        });
        map.put("send_ssid", new Consumer() { // from class: dps
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.f32197a.aw((drb) obj);
            }
        });
        map.put("send_wifi_password", new Consumer() { // from class: dqd
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.f32204b.ax((drb) obj);
            }
        });
        map.put("reset_wifi", new Consumer() { // from class: dqq
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.f32210a.av((drb) obj);
            }
        });
    }

    /* synthetic */ void ao(drb drbVar) {
        b(drbVar.c());
    }

    /* synthetic */ void au(drb drbVar) {
        c(drbVar.d(), drbVar.h(), drbVar.e());
    }

    /* synthetic */ void aw(drb drbVar) {
        g(drbVar.d());
    }

    /* synthetic */ void ax(drb drbVar) {
        this.f32185c.c(doq.e().n());
    }

    /* synthetic */ void av(drb drbVar) {
        this.f32185c.i();
    }

    private void g() {
        Map<String, Consumer<drb>> map = d;
        map.put("manager_info_success", new Consumer() { // from class: dqh
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.e.s((drb) obj);
            }
        });
        map.put("manager_info_failed", new Consumer() { // from class: dqj
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.e.q((drb) obj);
            }
        });
        map.put("set_manager_info", new Consumer() { // from class: dqm
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.f32208a.r((drb) obj);
            }
        });
        map.put("set_manager_info_result", new Consumer() { // from class: dqo
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.f32209b.w((drb) obj);
            }
        });
        map.put("get_manager_info", new Consumer() { // from class: dqn
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.d.x((drb) obj);
            }
        });
    }

    /* synthetic */ void s(drb drbVar) {
        c(drbVar.d(), drbVar.a(), drbVar.e(), drbVar.h());
    }

    /* synthetic */ void q(drb drbVar) {
        b(drbVar.d(), drbVar.e(), drbVar.h());
    }

    /* synthetic */ void r(drb drbVar) {
        f(drbVar.d().b());
    }

    /* synthetic */ void w(drb drbVar) {
        this.f32185c.b(drbVar.e(), -13, drbVar.d().b());
    }

    /* synthetic */ void x(drb drbVar) {
        h(drbVar.d().b());
    }

    private void h() {
        Map<String, Consumer<drb>> map = d;
        map.put("weight_measure_set_user", new Consumer() { // from class: dqv
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                doq.e().a(((drb) obj).d().b());
            }
        });
        map.put("set_user_info_result", new Consumer() { // from class: dqs
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.e.ae((drb) obj);
            }
        });
        map.put("delete_user_data", new Consumer() { // from class: dqr
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.f32211a.an((drb) obj);
            }
        });
        map.put("get_user_data", new Consumer() { // from class: dqt
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.f32212c.ak((drb) obj);
            }
        });
        map.put("get_user_data_next", new Consumer() { // from class: dqu
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.e.al((drb) obj);
            }
        });
        map.put("get_user_data_again", new Consumer() { // from class: dpf
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.e.aj((drb) obj);
            }
        });
        map.put("get_user_data_send_again", new Consumer() { // from class: dpq
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.f32196c.am((drb) obj);
            }
        });
        map.put("event_bus_current_user_changed", new Consumer() { // from class: dqe
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                doq.e().a((Bundle) null);
            }
        });
    }

    /* synthetic */ void ae(drb drbVar) {
        e(drbVar.d(), drbVar.e());
    }

    /* synthetic */ void an(drb drbVar) {
        e(drbVar.d());
    }

    /* synthetic */ void ak(drb drbVar) {
        a(drbVar.d());
    }

    /* synthetic */ void al(drb drbVar) {
        this.f32185c.g();
    }

    /* synthetic */ void aj(drb drbVar) {
        this.f32185c.m();
    }

    /* synthetic */ void am(drb drbVar) {
        c();
    }

    private void b() {
        Map<String, Consumer<drb>> map = d;
        map.put("event_bus_upload_ble_log", new Consumer() { // from class: dqa
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.f32202b.o((drb) obj);
            }
        });
        map.put("event_bus_file_check", new Consumer() { // from class: dpy
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.f32200a.l((drb) obj);
            }
        });
        map.put("event_bus_file_parameter", new Consumer() { // from class: dqf
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.d.m((drb) obj);
            }
        });
        map.put("event_bus_file_data_request", new Consumer() { // from class: dqc
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.d.t((drb) obj);
            }
        });
        map.put("event_bus_file_result_notify", new Consumer() { // from class: dqg
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.f32205c.p((drb) obj);
            }
        });
    }

    /* synthetic */ void o(drb drbVar) {
        a(drbVar.d().b());
    }

    /* synthetic */ void l(drb drbVar) {
        d(drbVar.d().b());
    }

    /* synthetic */ void m(drb drbVar) {
        e(drbVar.d().b());
    }

    /* synthetic */ void t(drb drbVar) {
        b(drbVar.d().b());
    }

    /* synthetic */ void p(drb drbVar) {
        c(drbVar.d().b());
    }

    private void i() {
        Map<String, Consumer<drb>> map = d;
        map.put("event_bus_disable_notification", new Consumer() { // from class: dpi
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.f32191c.z((drb) obj);
            }
        });
        map.put("bind_result", new Consumer() { // from class: dpm
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.f32193c.aa((drb) obj);
            }
        });
        map.put("workkey_info", new Consumer() { // from class: dpl
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.e.ad((drb) obj);
            }
        });
        map.put("get_scale_version_code", new Consumer() { // from class: dpn
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                doq.e().e(((drb) obj).d());
            }
        });
        map.put("set_weight_unit", new Consumer() { // from class: dpp
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.f32195a.ac((drb) obj);
            }
        });
        map.put("device_reset", new Consumer() { // from class: dpr
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.e.ab((drb) obj);
            }
        });
        map.put("get_weight_unit", new Consumer() { // from class: dpo
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.f32194c.ai((drb) obj);
            }
        });
        map.put("get_scale_version", new Consumer() { // from class: dpw
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.f32198a.af((drb) obj);
            }
        });
        map.put("send_wake_up", new Consumer() { // from class: dpt
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.d.ag((drb) obj);
            }
        });
        map.put("bind_process_completed", new Consumer() { // from class: dpu
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.e.ah((drb) obj);
            }
        });
    }

    /* synthetic */ void z(drb drbVar) {
        this.f32185c.e(drbVar.d().b());
    }

    /* synthetic */ void aa(drb drbVar) {
        b(drbVar.d().b(), drbVar.e());
    }

    /* synthetic */ void ad(drb drbVar) {
        e(drbVar.d(), drbVar.e(), drbVar.h(), drbVar.g());
    }

    /* synthetic */ void ac(drb drbVar) {
        h(drbVar.d());
    }

    /* synthetic */ void ab(drb drbVar) {
        this.f32185c.r();
    }

    /* synthetic */ void ai(drb drbVar) {
        d(drbVar.i());
    }

    /* synthetic */ void af(drb drbVar) {
        d(drbVar.d());
    }

    /* synthetic */ void ag(drb drbVar) {
        d(drbVar.b());
    }

    /* synthetic */ void ah(drb drbVar) {
        this.f32185c.b(drbVar.e(), -14, drbVar.d().b());
    }

    public void a(drb drbVar) {
        if (drbVar == null) {
            LogUtil.j("WspEventBusUtil", "bean is null");
            return;
        }
        if (drbVar.d() == null) {
            LogUtil.j("WspEventBusUtil", "handleEventBusMsg event is null");
            return;
        }
        if (drbVar.d().b() == null && drbVar.d().c() == null) {
            LogUtil.j("WspEventBusUtil", "handleEventBusMsg bundle and intent are null");
            return;
        }
        Consumer<drb> consumer = d.get(drbVar.d().e());
        if (consumer != null) {
            ReleaseLogUtil.d("R_Weight_WspEventBusUtil", "event action is ", drbVar.d().e());
            consumer.accept(drbVar);
        }
    }

    private void c(Bundle bundle) {
        this.f32185c.l().e(bundle.getInt("key_file_id"), bundle.getInt("key_file_result_type"));
        LogUtil.a("WspEventBusUtil", "5.44.6 ble send command ", "event_bus_file_result_notify");
    }

    private void b(Bundle bundle) {
        this.f32185c.l().a(bundle.getInt("key_file_id"), bundle.getInt("key_file_offset"), bundle.getInt("key_file_length"));
        LogUtil.a("WspEventBusUtil", "5.44.4 ble send command ", "event_bus_file_data_request");
    }

    private void e(Bundle bundle) {
        this.f32185c.l().d(bundle.getInt("key_file_id"));
        LogUtil.a("WspEventBusUtil", "5.44.3 ble send command ", "event_bus_file_parameter");
    }

    private void d(Bundle bundle) {
        this.f32185c.l().b(bundle.getInt("key_file_id"), bundle.getInt("key_check_mode"));
        LogUtil.a("WspEventBusUtil", "5.44.2 ble send command ", "event_bus_upload_ble_log");
    }

    private void a(Bundle bundle) {
        this.f32185c.l().e(bundle.getString("com.huawei.health.scale.log"), bundle.getString("com.huawei.health.scale.log"));
        LogUtil.a("WspEventBusUtil", "5.44.8 ble send command ", "event_bus_upload_ble_log");
    }

    private void o() {
        String url = GRSManager.c(BaseApplication.getContext()).getUrl("ROOT");
        LogUtil.a("WspEventBusUtil", "[grs] begin handle sending grsUrl: ", url);
        this.f32185c.d(url);
    }

    private void g(EventBus.d dVar) {
        Bundle bundleB = dVar.b();
        if (bundleB == null) {
            return;
        }
        String string = bundleB.getString("wifiSsid");
        doq.e().b(bundleB.getString("wifiPwd"));
        this.f32185c.e(string);
    }

    private void d(dom domVar) {
        if (domVar != null) {
            this.f32185c.q();
        }
    }

    private void a(EventBus.d dVar) {
        this.f32185c.a(dVar.b());
        doq.e().b(-1);
    }

    private void e(EventBus.d dVar, efx efxVar) {
        Bundle bundleB = dVar.b();
        if (bundleB == null) {
            LogUtil.j("WspEventBusUtil", "handlerEventBusActionFive bundle is null");
            return;
        }
        int i = bundleB.getInt("ret");
        if (i != 0) {
            LogUtil.j("WspEventBusUtil", "set user failed, maybe user exists");
            this.f32185c.a(efxVar, i);
        }
    }

    private void m() {
        if (!doq.e().o()) {
            this.f32185c.e(new byte[0]);
        } else {
            LogUtil.j("WspEventBusUtil", "HwWspMeasureController is getting history data");
        }
    }

    private void b(EventBus.d dVar, efx efxVar) {
        LogUtil.a("WspEventBusUtil", "sendRealtimeWightData is start!");
        Bundle bundleB = dVar.b();
        if (bundleB == null) {
            LogUtil.j("WspEventBusUtil", "handlerEventBusActionFive bundle is null");
            return;
        }
        int i = bundleB.getInt("ret");
        if (i != 0) {
            LogUtil.j("WspEventBusUtil", "set user failed.");
            doq.e().s();
            this.f32185c.a(efxVar, i);
            this.f32185c.b(efxVar, 3);
            return;
        }
        doq.e().q();
    }

    private void h(EventBus.d dVar) {
        Bundle bundleB = dVar.b();
        if (bundleB != null) {
            int i = bundleB.getInt("weightUnit");
            doq.e().c(i);
            this.f32185c.b(BleTaskQueueUtil.TaskType.SET_WEIGHT_UNIT, dow.b(i));
        }
    }

    private void n(EventBus.d dVar) {
        Intent intentC = dVar.c();
        if (intentC != null) {
            dpa.b().e(intentC.getStringExtra("scaleUniqueId"), intentC.getStringExtra("scaleNewVersion"), intentC.getStringExtra("scaleFilePath"));
            return;
        }
        LogUtil.j("WspEventBusUtil", "case EVEBUS_SINLGE_DEVICE_TLV_OTA_UPDATE intent is null");
    }

    private void f(EventBus.d dVar) {
        Intent intentC = dVar.c();
        if (intentC != null) {
            dre.a().a(intentC.getStringExtra("scalePath"));
        } else {
            LogUtil.a("WspEventBusUtil", "case EVEBUS_SINLGE_DEVICE_OTA_UPDATE intent is null");
        }
    }

    private void b(Bundle bundle, efx efxVar) {
        byte b2 = bundle.getByte("ret");
        this.f32185c.b(efxVar, -2, bundle);
        if (b2 != 2) {
            this.f32185c.v();
        }
    }

    private void c(EventBus.d dVar, Handler handler, efx efxVar, int i) {
        if (handler != null) {
            handler.sendEmptyMessageDelayed(7, 200L);
        }
        this.f32185c.b(efxVar, -7, dVar.b());
        if (i != -2 || doq.e().f()) {
            return;
        }
        this.f32185c.d(this.f32184b);
    }

    private void b(EventBus.d dVar, efx efxVar, int i) {
        this.f32185c.b(efxVar, -8, dVar.b());
        if (i != -2 || doq.e().f()) {
            return;
        }
        this.f32185c.d(this.f32184b);
    }

    private void f(Bundle bundle) {
        String string = bundle.getString("huid");
        String string2 = bundle.getString("deviceId");
        String string3 = bundle.getString("accountInfo");
        if (string3 == null || TextUtils.isEmpty(string3)) {
            this.f32185c.b(string, string2, this.f32184b);
        } else {
            this.f32185c.b(string, string2, string3, this.f32184b);
        }
    }

    private void h(Bundle bundle) {
        this.f32185c.e(bundle.getBoolean("isGetAccountInfo"));
    }

    private void b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("WspEventBusUtil", "handlerEventActionTwo deviceSsid isEmpty");
            this.f32185c.h();
        } else {
            LogUtil.a("WspEventBusUtil", "handlerEventActionTwo deviceSsid is not Empty");
            Bundle bundle = new Bundle();
            bundle.putString("deviceSsid", str);
            EventBus.a(new EventBus.d("get_device_ssid_result", bundle));
        }
    }

    private void c(EventBus.d dVar, int i, efx efxVar) {
        if (i == -2) {
            LogUtil.j("WspEventBusUtil", "HwWspMeasureController mBaseResponseCallback is not BindIHealthDeviceCallback.");
            doq.e().d(true);
            this.f32185c.b(efxVar, -9, dVar.b());
        }
    }

    private void i(EventBus.d dVar) {
        byte[] byteArray;
        ReleaseLogUtil.d("R_Weight_WspEventBusUtil", "request auth");
        Bundle bundleB = dVar.b();
        if (bundleB == null) {
            LogUtil.j("WspEventBusUtil", "getRequestAuth, bundle is null");
            return;
        }
        if ("auth".equals(bundleB.getString("auth"))) {
            this.f32185c.t();
            return;
        }
        try {
            byteArray = bundleB.getByteArray("randA");
        } catch (ArrayIndexOutOfBoundsException unused) {
            LogUtil.e("WspEventBusUtil", "randomBytes ArrayIndexOutOfBoundsException!");
            byteArray = null;
        }
        byte[] bArrC = dnz.c(byteArray);
        if (bArrC.length == 0) {
            EventBus.a(new EventBus.d("request_auth_failed", new Bundle()));
        } else {
            this.f32185c.a(bArrC);
        }
    }

    private void j(EventBus.d dVar) {
        byte[] byteArray;
        ReleaseLogUtil.d("R_Weight_WspEventBusUtil", "request auth token");
        Bundle bundleB = dVar.b();
        if (bundleB == null) {
            LogUtil.j("WspEventBusUtil", "getRequestAuthToken, bundle is null");
            return;
        }
        try {
            byteArray = bundleB.getByteArray("token");
        } catch (ArrayIndexOutOfBoundsException unused) {
            LogUtil.e("WspEventBusUtil", "tokens ArrayIndexOutOfBoundsException!");
            byteArray = null;
        }
        Bundle bundle = new Bundle();
        if (byteArray != null && byteArray.length == 0) {
            EventBus.a(new EventBus.d("request_auth_failed", bundle));
        } else if (dnz.c(eeq.e(byteArray))) {
            EventBus.a(new EventBus.d("request_auth_pass", bundle));
        } else {
            EventBus.a(new EventBus.d("request_auth_failed", bundle));
        }
    }

    private void d(efx efxVar) {
        LogUtil.j("WspEventBusUtil", "request auth failed.");
        doq.e().s();
        this.f32185c.b(efxVar, -10);
        this.f32185c.b(efxVar, 3);
    }

    private void d(int i, efx efxVar) {
        ReleaseLogUtil.d("R_Weight_WspEventBusUtil", "requset auth pass, type:", Integer.valueOf(i));
        doq.e().e(true);
        byte[] bArrD = doi.d(efxVar.getAddress());
        if (bArrD.length != 0) {
            LogUtil.a("WspEventBusUtil", "handlerEventBusActionThree workerKeys:", eeq.e(bArrD));
            this.f32185c.g(bArrD);
        } else {
            LogUtil.j("WspEventBusUtil", "workerKey is isEmpty");
        }
    }

    private void e(EventBus.d dVar, efx efxVar, int i, String str) {
        doq.e().e(false);
        Bundle bundleB = dVar.b();
        if (bundleB == null) {
            LogUtil.j("WspEventBusUtil", "handlerEventBusActionThree event bundle is null");
            return;
        }
        if (bundleB.getInt("ret") != 0) {
            LogUtil.j("WspEventBusUtil", "get workerKey failed.");
            doq.e().s();
            this.f32185c.b(efxVar, -11);
            this.f32185c.b(efxVar, 3);
            return;
        }
        ReleaseLogUtil.d("R_Weight_WspEventBusUtil", "get workerKey pass, type:", Integer.valueOf(i));
        if (i == -2) {
            if (dxm.ai(str)) {
                this.f32185c.d(this.f32184b);
                return;
            } else {
                h(bundleB);
                return;
            }
        }
        if (i != -4 && i != -1) {
            LogUtil.j("WspEventBusUtil", "handlerEventActionThree not found type:", Integer.valueOf(i));
        } else {
            this.f32185c.v();
        }
    }

    private void b(EventBus.d dVar) {
        String str;
        ReleaseLogUtil.d("R_Weight_WspEventBusUtil", "getRealtimeWightData is success!");
        Bundle bundleB = dVar.b();
        byte[] bArr = null;
        bArr = null;
        String string = null;
        if (bundleB != null) {
            try {
                byte[] byteArray = bundleB.getByteArray("realTimeData");
                try {
                    string = bundleB.getString("unique_id");
                    this.f32183a = bundleB.getInt("age", 0);
                    str = string;
                    bArr = byteArray;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    str = string;
                    bArr = byteArray;
                    LogUtil.e("WspEventBusUtil", "realtimeWeightDatas ArrayIndexOutOfBoundsException!");
                }
            } catch (ArrayIndexOutOfBoundsException unused2) {
                str = null;
            }
        } else {
            str = null;
        }
        if (bArr != null && bArr.length > 0) {
            LogUtil.d("WspEventBusUtil", "getRealtimeWightData realtimeWeightDatas is:", eeq.e(bArr));
            d(bArr, false, str);
            EventBus.a(new EventBus.d("send_history_weight_info", new Bundle()));
            return;
        }
        ReleaseLogUtil.e("R_Weight_WspEventBusUtil", "realtimeWeightDatas is empty!");
    }

    private void c(EventBus.d dVar) {
        ReleaseLogUtil.d("R_Weight_WspEventBusUtil", "getHistoryWightData is success!");
        Bundle bundleB = dVar.b();
        if (bundleB == null) {
            LogUtil.j("WspEventBusUtil", "handlerEventBusActionFour bundle is null");
            return;
        }
        byte[] byteArray = new byte[10];
        String string = null;
        try {
            byteArray = bundleB.getByteArray("historyData");
            string = bundleB.getString("unique_id");
            this.f32183a = bundleB.getInt("age", 0);
        } catch (ArrayIndexOutOfBoundsException unused) {
            LogUtil.e("WspEventBusUtil", "historyWeightDatas ArrayIndexOutOfBoundsException!");
        }
        if (byteArray.length > 0) {
            doq.e().b(true);
            LogUtil.a("WspEventBusUtil", "getHistoryWightData historyWeightDatas is:", eeq.e(byteArray));
            d(byteArray, true, string);
            this.f32185c.e(new byte[]{0});
            return;
        }
        doq.e().b(false);
        ReleaseLogUtil.e("R_Weight_WspEventBusUtil", "history weight data is empty!");
        doq.e().ending();
    }

    private void e(EventBus.d dVar) {
        byte[] byteArray;
        Bundle bundleB = dVar.b();
        if (bundleB == null) {
            LogUtil.e("WspEventBusUtil", "handlerDeleteUserData, bundle is null");
            return;
        }
        try {
            byteArray = bundleB.getByteArray(JsbMapKeyNames.H5_USER_ID);
        } catch (Exception unused) {
            LogUtil.e("WspEventBusUtil", "getByteArray exception");
            byteArray = null;
        }
        this.f32185c.d(byteArray);
    }

    private void d(int i) {
        LogUtil.a("WspEventBusUtil", "receiver get_weight_unit action unitType = ", Integer.valueOf(i));
        if (i == -1) {
            doq.e().c(true);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("weightUnit", i);
        dvr.a().a(bundle);
    }

    private void d(EventBus.d dVar) {
        LogUtil.a("WspEventBusUtil", "EVEBUS_GET_SCALE_VERSION");
        Bundle bundleB = dVar.b();
        if (bundleB == null) {
            LogUtil.e("WspEventBusUtil", "bundle is null");
        } else {
            doq.e().c(bundleB.getBoolean("isManualGetUnit", false));
        }
    }

    private void c() {
        byte[] bArr = new byte[31];
        byte[] bArrC = new dow().c(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011));
        System.arraycopy(bArrC, 0, bArr, 0, bArrC.length);
        this.f32185c.j(bArr);
    }

    private void d(byte[] bArr, boolean z, String str) {
        if (d(bArr, z)) {
            dso dsoVar = new dso();
            dsoVar.d(false);
            float fA = doa.a(bArr, 0, 2) / 100.0f;
            dsoVar.setWeight(fA);
            float fA2 = doa.a(bArr, 2, 2) / 10.0f;
            LogUtil.a("WspEventBusUtil", "weight is:", Float.valueOf(fA), "; fatRate is:", Float.valueOf(fA2));
            dsoVar.setBodyFatRat(fA2);
            if (dor.e(str, this.f32183a)) {
                ReleaseLogUtil.d("R_Weight_WspEventBusUtil", "isSupportFats is true");
                dsoVar.setBodyFatRat(0.0f);
            }
            String strE = dow.e(bArr, 4);
            long time = new Date().getTime();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
            if (z) {
                try {
                    time = simpleDateFormat.parse(strE).getTime();
                } catch (ParseException unused) {
                    LogUtil.e("WspEventBusUtil", "Illegal time format:", strE);
                    return;
                }
            }
            dsoVar.setStartTime(time);
            dsoVar.setEndTime(time);
            b(bArr, 12, dsoVar, str);
            int iA = doa.a(bArr, 24, 2);
            dsoVar.h(iA);
            d(bArr, dsoVar, 24, str);
            LogUtil.d("WspEventBusUtil", "saveWeightData:", Float.valueOf(dsoVar.getWeight()), "; bodyFatRat:", Float.valueOf(dsoVar.getBodyFatRat()), "; time:", strE, "; heart:", Integer.valueOf(iA));
            doq.e().a(z, dsoVar, bArr, 24);
        }
    }

    private void b(byte[] bArr, int i, dso dsoVar, String str) {
        int i2 = 0;
        for (int i3 = 0; i3 < 12; i3 += 2) {
            dsoVar.e(i2, doa.a(bArr, i3 + i, 2));
            i2++;
        }
        if (dor.e(str, this.f32183a)) {
            dsoVar.e(i2, 0.0d);
        }
    }

    private void d(byte[] bArr, dso dsoVar, int i, String str) {
        boolean zB = drk.b(str, 18);
        LogUtil.a("WspEventBusUtil", "deviceMac:", str, "isSupportMultiChannel:", Boolean.valueOf(zB), "weightDataBytes:", this.f32185c.b(bArr), "length:", Integer.valueOf(bArr.length));
        if (!zB || bArr.length < 38) {
            return;
        }
        dsoVar.c(2);
        int i2 = 0;
        for (int i3 = 0; i3 < 12; i3 += 2) {
            int iA = doa.a(bArr, i + 2 + i3, 2);
            dsoVar.b(i2, iA);
            if (dor.e(str, this.f32183a)) {
                dsoVar.b(i2, 0.0d);
            }
            LogUtil.a("WspEventBusUtil", "moreResisData:", Integer.valueOf(iA));
            i2++;
        }
    }

    private boolean d(byte[] bArr, boolean z) {
        if (z) {
            if (bArr.length == 28 || bArr.length == 40 || bArr.length == 27 || bArr.length == 39) {
                return true;
            }
            ReleaseLogUtil.d("R_Weight_WspEventBusUtil", "History data illegal length!");
            return false;
        }
        if (bArr.length == 26 || bArr.length == 38) {
            return true;
        }
        ReleaseLogUtil.d("R_Weight_WspEventBusUtil", "realtime data illegal length!");
        return false;
    }

    private void g(Bundle bundle) {
        String string = bundle.getString("configjson");
        this.f32185c.a(string);
        LogUtil.d("WspEventBusUtil", "hilink_json sendWifiConfigFor2021 configjson=", string);
    }

    private void d(Bundle bundle, efx efxVar) {
        LogUtil.a("WspEventBusUtil", "AssembleDataPackage enter");
        if (bundle == null) {
            LogUtil.j("WspEventBusUtil", "AssembleDataPackage bundle is null");
            return;
        }
        String string = bundle.getString("ssid");
        String string2 = bundle.getString("pwd");
        int i = bundle.getInt("encryptMode");
        String string3 = bundle.getString("deviceSsid");
        String string4 = bundle.getString("registerMsg");
        byte[] bArrB = ecn.b();
        String strA = ecn.a();
        byte[] bArrD = ecg.d(dpc.b(string2), strA, bArrB);
        if (TextUtils.isEmpty(string4)) {
            LogUtil.j("WspEventBusUtil", "AssembleDataPackage registerMessage is null");
        } else {
            LogUtil.d("WspEventBusUtil", "AssembleDataPackage encodeRegisterInfos length:", Integer.valueOf(ecg.d(dpc.b(string4), strA, bArrB).length));
        }
        byte[] bArrA = ecj.a(i, this.f32185c.c(bArrD), strA);
        byte[] bArrB2 = dpc.b(string);
        boolean z = true;
        boolean z2 = bArrA == null || dpc.b(string3) == null;
        if (bArrB2 != null && bArrD != null) {
            z = false;
        }
        if (z2 || z || bArrA.length != 16) {
            this.f32185c.a(efxVar, -1);
            LogUtil.j("WspEventBusUtil", "encrypt data length is not correct");
        } else {
            this.f32185c.a(string, string2, i, string3, string4);
        }
    }
}
