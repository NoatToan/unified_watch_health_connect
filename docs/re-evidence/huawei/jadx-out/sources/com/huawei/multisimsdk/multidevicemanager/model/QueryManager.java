package com.huawei.multisimsdk.multidevicemanager.model;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.multisimsdk.multidevicemanager.common.AuthParam;
import com.huawei.multisimsdk.multidevicemanager.common.InProgressData;
import com.huawei.multisimsdk.multidevicemanager.util.ResponseHandler;
import com.huawei.up.model.UserInfomation;
import defpackage.obf;
import defpackage.obq;
import defpackage.obv;
import defpackage.obx;
import defpackage.oby;
import defpackage.obz;
import defpackage.ocb;
import defpackage.ocg;
import defpackage.ock;
import defpackage.oco;
import defpackage.ocp;
import defpackage.ocq;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes12.dex */
public class QueryManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f18041b = "QueryManager";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f18042c = 3;
    private static int e = 3000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AuthParam f18043a;
    private boolean d;
    private Timer f;
    private ResponseHandler g;
    private InProgressData h;
    private TimerTask i;
    private Context j;
    private int k;

    public void e(InProgressData inProgressData) {
        this.h = inProgressData;
    }

    public QueryManager(Context context) {
        this(context, null, true);
    }

    public QueryManager(Context context, AuthParam authParam, boolean z) {
        this.f = null;
        this.i = null;
        this.k = 1;
        this.f18043a = null;
        this.d = true;
        this.g = new ResponseHandler() { // from class: com.huawei.multisimsdk.multidevicemanager.model.QueryManager.5
            @Override // com.huawei.multisimsdk.multidevicemanager.util.ResponseHandler
            public void onCallback(String str) {
                ArrayList<obq> arrayListB;
                ocb ocbVar = new ocb();
                ocbVar.d(str);
                oby obyVarD = ocbVar.d();
                obz obzVarA = ocbVar.a();
                if (obzVarA != null && obzVarA.c() != null && (arrayListB = obzVarA.c().b()) != null) {
                    int size = arrayListB.size();
                    for (int i = 0; i < size; i++) {
                        obq obqVar = arrayListB.get(i);
                        if (TextUtils.isEmpty(obqVar.a())) {
                            obqVar.a(obqVar.e());
                        }
                    }
                }
                if (QueryManager.this.d(obyVarD).booleanValue()) {
                    QueryManager.this.e(obzVarA);
                }
            }
        };
        this.j = context;
        this.f18043a = authParam;
        this.d = z;
    }

    public void b() {
        InProgressData inProgressData = this.h;
        if (inProgressData == null) {
            return;
        }
        int type = inProgressData.getType();
        if (100 == type || 101 == type) {
            c(this.h.getTime() / 6);
        } else {
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        String strD = ock.d();
        String strE = e();
        ocp.d().d(strD, strE, null, oco.b(this.j, obf.b(this.j, this.f18043a), "authorization"), this.g);
    }

    private String e() {
        String primary;
        obx obxVar = new obx();
        obxVar.b(oco.d());
        obxVar.c("GetDevServInfo");
        InProgressData inProgressData = this.h;
        if (inProgressData != null) {
            primary = inProgressData.getPrimary();
            obxVar.j(this.h.getServiceType());
            obxVar.b(primary);
            obxVar.d(this.h.getPrimaryIDtype());
            obxVar.g(this.h.getSecondarytype());
            obxVar.e(this.h.getSecondaryID());
        } else {
            primary = null;
        }
        String strB = oco.b(this.j, primary, "OldTimeStamp");
        if (!TextUtils.isEmpty(strB)) {
            obxVar.a(strB);
        }
        obv obvVar = new obv();
        obvVar.a(obxVar);
        obvVar.c(oco.e(this.j, obf.b(this.j, this.f18043a)));
        return obvVar.e();
    }

    private void d(obz obzVar) {
        if (obzVar != null) {
            int iA = obzVar.a();
            this.h.setResultcode(iA);
            String str = f18041b;
            ocq.e(str, "Get query resultcode=" + iA);
            if (1500 == iA) {
                ocq.e(str, "get add-query result");
                oco.b(this.j, this.h.getPrimary(), "OldTimeStamp", obzVar.e());
                this.h.setMultiSIMServiceInfo(obzVar.c());
                oco.c(125, this.h);
                return;
            }
            if (1502 == iA) {
                long time = this.h.getTime() / 6;
                int i = this.k;
                if (i < f18042c) {
                    this.k = i + 1;
                    ocq.e(str, "get add-query timer = " + this.k);
                    d();
                    if (time > 0) {
                        c(time * ((long) this.k));
                        return;
                    } else {
                        c(e);
                        return;
                    }
                }
                ocq.e(str, "get add-query result");
                oco.c(126, this.h);
                return;
            }
            ocq.e(str, "get query response send to fail");
            oco.c(126, this.h);
            return;
        }
        ocq.e(f18041b, "responseGetDevServInfo is null");
        this.h.setResultcode(99);
        oco.c(126, this.h);
    }

    private void a(obz obzVar) {
        if (obzVar != null) {
            int iA = obzVar.a();
            this.h.setResultcode(iA);
            String str = f18041b;
            ocq.e(str, "get query resultcode=" + iA);
            if (1502 == iA) {
                ocq.e(str, "get Remove-query result");
                oco.b(this.j, this.h.getPrimary(), "OldTimeStamp", obzVar.e());
                this.h.setMultiSIMServiceInfo(obzVar.c());
                oco.c(125, this.h);
                return;
            }
            if (1500 == iA) {
                long time = this.h.getTime() / 6;
                int i = this.k;
                if (i < f18042c) {
                    this.k = i + 1;
                    ocq.e(str, "get Remove-query timer = " + this.k);
                    d();
                    if (time > 0) {
                        c(time * ((long) this.k));
                        return;
                    } else {
                        c(e);
                        return;
                    }
                }
                ocq.e(str, "get Remove-query result ");
                oco.c(126, this.h);
                return;
            }
            ocq.e(str, "get query response send to fail ");
            oco.c(126, this.h);
            return;
        }
        ocq.e(f18041b, "responseGetDevServInfo is null");
        this.h.setResultcode(99);
        oco.c(126, this.h);
    }

    private void b(obz obzVar) {
        if (obzVar != null) {
            int iA = obzVar.a();
            this.h.setResultcode(iA);
            String str = f18041b;
            ocq.e(str, "get query resultcode=" + iA);
            String strB = obf.b(this.j, this.f18043a);
            oco.b(this.j, strB, "manager_url", obzVar.d());
            oco.b(this.j, strB, "manager_post_data", obzVar.b());
            ocg ocgVar = new ocg();
            ocgVar.d(obzVar.d());
            ocgVar.a(obzVar.b());
            this.h.setWebViewData(ocgVar);
            if (1500 == iA) {
                ocq.e(str, "start query service");
                oco.b(this.j, this.h.getPrimary(), "OldTimeStamp", obzVar.e());
                this.h.setMultiSIMServiceInfo(obzVar.c());
                oco.c(125, this.h);
                return;
            }
            if (1501 == iA) {
                ocq.e(str, "get query response data no change ");
                oco.c(125, this.h);
                return;
            } else {
                ocq.e(str, "get query response send to fail resultcode =" + iA);
                oco.c(126, this.h);
                return;
            }
        }
        ocq.e(f18041b, "responseGetDevServInfo is null");
        this.h.setResultcode(99);
        oco.c(126, this.h);
    }

    private void c(long j) {
        if (this.f == null) {
            this.f = new Timer();
        }
        if (this.i == null) {
            this.i = new TimerTask() { // from class: com.huawei.multisimsdk.multidevicemanager.model.QueryManager.3
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    QueryManager.this.a();
                }
            };
        }
        this.f.schedule(this.i, j);
    }

    private void d() {
        Timer timer = this.f;
        if (timer != null) {
            timer.cancel();
            this.f = null;
        }
        TimerTask timerTask = this.i;
        if (timerTask != null) {
            timerTask.cancel();
            this.i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Boolean d(oby obyVar) {
        int i = 106;
        if (obyVar != null) {
            int iD = obyVar.d();
            this.h.setResultcode(iD);
            String str = f18041b;
            ocq.e(str, "handlerQuickAuthenResult.getResultcode()=" + iD);
            if (1000 == iD) {
                String strB = obf.b(this.j, this.f18043a);
                String strB2 = oco.b(this.j, strB, "Tag");
                if (!TextUtils.isEmpty(strB)) {
                    oco.b(this.j, strB, "authen_Token", obyVar.c());
                }
                if (!TextUtils.isEmpty(strB2)) {
                    oco.b(this.j, strB2, "authen_Token", obyVar.c());
                }
                if (!TextUtils.isEmpty(strB) && !TextUtils.isEmpty(strB2)) {
                    oco.a(this.j, strB2, strB);
                }
                ocq.e(str, "TokenAuthen is valid");
                return true;
            }
            if (1004 == iD) {
                ocq.e(str, "TokenAuthen is invalid");
                oco.c(107, this.h);
                return false;
            }
            ocq.e(str, "TokenAuthen is fail");
            if (this.h.getType() == 102 && this.d && iD == 401) {
                i = UserInfomation.WEIGHT_DEFAULT_ENGLISH;
            }
            oco.c(i, this.h);
            return false;
        }
        ocq.e(f18041b, "responseAuthFirstInfo is null");
        oco.c(106, this.h);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(obz obzVar) {
        InProgressData inProgressData = this.h;
        if (inProgressData == null) {
            return;
        }
        int type = inProgressData.getType();
        ocq.e(f18041b, "type = " + type);
        if (100 == type) {
            d(obzVar);
        } else if (101 == type) {
            a(obzVar);
        } else {
            b(obzVar);
        }
    }
}
