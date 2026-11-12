package defpackage;

import android.content.Context;
import android.os.Message;
import com.huawei.multisimsdk.multidevicemanager.util.ResponseHandler;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
class oci {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f44117c = "AkaAuthen";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f44118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Message f44119b;
    private ArrayList e = new ArrayList();
    private ArrayList d = new ArrayList();
    private String g = null;
    private ResponseHandler h = new ResponseHandler() { // from class: oci.4
        @Override // com.huawei.multisimsdk.multidevicemanager.util.ResponseHandler
        public void onCallback(String str) {
            oby obyVar = new oby();
            if (oco.g(str)) {
                obyVar.e(str);
            } else {
                obyVar.a(str);
            }
            if (!oci.this.b(Integer.valueOf(obyVar.b()))) {
                ocq.e(oci.f44117c, "Handle Sms First Authen Response reqsn is error.");
                return;
            }
            if (!"DevAuth".equals(obyVar.a())) {
                ocq.e(oci.f44117c, "Handle Sms First Authen Response reqname is error.");
                return;
            }
            int iD = obyVar.d();
            ocq.e(oci.f44117c, "HandleAkASFirstAuthenResponse resultcode=" + iD);
            if (1008 == iD) {
                ock.e(oci.this.f44118a);
                String strD = ock.d(obyVar.e());
                if (oci.this.f44119b == null) {
                    ocq.e(oci.f44117c, "Handle second response mMessage is null");
                }
                String strD2 = oco.d(String.valueOf(obyVar.b()));
                if (ocq.f44154c.booleanValue()) {
                    ocq.e(oci.f44117c, "HandleAKAFirstAuthenResponse--payload=" + strD);
                    ocq.e(oci.f44117c, "Handle Start to secondauthen cookie =" + strD2);
                }
                oci.this.a(strD, strD2);
                return;
            }
            oco.d(oci.this.f44119b, iD);
        }
    };
    private ResponseHandler f = new ResponseHandler() { // from class: oci.1
        @Override // com.huawei.multisimsdk.multidevicemanager.util.ResponseHandler
        public void onCallback(String str) {
            occ occVar = new occ();
            if (oco.g(str)) {
                occVar.b(str);
            } else {
                occVar.e(str);
            }
            if (!oci.this.e(Integer.valueOf(occVar.c()))) {
                ocq.e(oci.f44117c, "Handle Sms second challenge Response reqsn is error.");
                return;
            }
            if (!"DevAuthChallenge".equals(occVar.d())) {
                ocq.e(oci.f44117c, "Handle Sms second challenge Response reqname is error.");
                return;
            }
            if (1000 == occVar.b()) {
                oci.this.g = occVar.e();
                ocq.e(oci.f44117c, "Handle second response mPhoneNumber = " + oci.this.g);
                if (oci.this.g != null) {
                    ocq.e(oci.f44117c, "Handle second response mPhoneNumber is not null");
                    oco.b(oci.this.f44118a, oci.this.g, "authen_Token", occVar.a());
                }
            }
            if (oci.this.f44119b != null) {
                oci.this.f44119b.arg1 = occVar.b();
                oci.this.f44119b.obj = occVar.e();
                oco.a(oci.this.f44119b);
                ocq.e(oci.f44117c, "Handle second response success");
            }
        }
    };

    oci(Context context, Message message) {
        this.f44118a = context;
        this.f44119b = message;
    }

    public void c(String str) {
        ocp.d().c(ock.c(), a(str), this.h);
        ocq.e(f44117c, "Start aka first authen");
    }

    void a(String str, String str2) {
        if (this.f44119b == null) {
            ocq.e(f44117c, "Start Aka Second Authen mMessage is null");
            return;
        }
        ocp.d().b(ock.c(), b(str), str2, this.f);
        ocq.e(f44117c, "Start Aka Second Authen");
    }

    private void d(Integer num) {
        ArrayList arrayList = this.e;
        if (arrayList == null || num == null) {
            return;
        }
        synchronized (arrayList) {
            if (!this.e.contains(num)) {
                this.e.add(num);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(Integer num) {
        ArrayList arrayList = this.e;
        if (arrayList == null || num == null) {
            return false;
        }
        synchronized (arrayList) {
            if (!this.e.contains(num)) {
                return false;
            }
            this.e.remove(num);
            return true;
        }
    }

    private void a(Integer num) {
        ArrayList arrayList = this.d;
        if (arrayList == null || num == null) {
            return;
        }
        synchronized (arrayList) {
            if (!this.d.contains(num)) {
                this.d.add(num);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(Integer num) {
        ArrayList arrayList = this.d;
        if (arrayList == null || num == null) {
            return false;
        }
        synchronized (arrayList) {
            if (!this.d.contains(num)) {
                return false;
            }
            this.d.remove(num);
            return true;
        }
    }

    private String a(String str) {
        obr obrVar = new obr();
        int iD = oco.d();
        d(Integer.valueOf(iD));
        obrVar.e(iD);
        obrVar.a("DevAuth");
        obrVar.c("EAP-AKA");
        obrVar.d(str);
        return obrVar.c().toString();
    }

    private String b(String str) {
        obw obwVar = new obw();
        int iD = oco.d();
        a(Integer.valueOf(iD));
        obwVar.b(iD);
        obwVar.a("DevAuthChallenge");
        obwVar.e(str);
        obwVar.b("EAP-AKA");
        return obwVar.c().toString();
    }
}
