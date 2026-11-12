package com.huawei.watchface;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.watchface.api.HwWatchFaceBtManager;
import com.huawei.watchface.api.HwWatchFaceManager;
import com.huawei.watchface.api.MembershipRepository;
import com.huawei.watchface.api.ResponseListener;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.mvp.model.datatype.WatchResourcesInfo;
import com.huawei.watchface.mvp.model.datatype.querysubinfodetail.QuerySubInfoDetailResp;
import com.huawei.watchface.utils.BackgroundTaskUtils;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.callback.IBaseResponseCallback;

/* JADX INFO: loaded from: classes20.dex */
public class e5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f30133c = "e5";
    public static volatile e5 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f30134a = new Runnable() { // from class: com.huawei.watchface.e5$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.i();
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public QuerySubInfoDetailResp f30135b;

    public class a implements ResponseListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f30136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f30137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f30138c;
        public final /* synthetic */ boolean d;

        public a(c cVar, boolean z, boolean z2, boolean z3) {
            this.f30136a = cVar;
            this.f30137b = z;
            this.f30138c = z2;
            this.d = z3;
        }

        @Override // com.huawei.watchface.api.ResponseListener
        public void onError() {
            HwLog.i(e5.f30133c, "update -- getQueryAll -- onError endpoint error");
            if (this.d) {
                WatchResourcesInfo currentWatchFace = HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).getCurrentWatchFace();
                HwWatchFaceManager.getInstance(Environment.getApplicationContext()).notifyCurrentWatchfaceIsVipFree(currentWatchFace == null ? "" : currentWatchFace.getWatchInfoId(), "0");
            }
        }

        @Override // com.huawei.watchface.api.ResponseListener
        public void onResponse(QuerySubInfoDetailResp querySubInfoDetailResp) {
            e5.this.j();
            e5.this.a(querySubInfoDetailResp);
            c cVar = this.f30136a;
            if (cVar != null) {
                cVar.onMembershipInfoUpdated(querySubInfoDetailResp);
            }
            if (this.f30137b) {
                k2.a().a(e5.this.g(), (IBaseResponseCallback) null);
            }
            if (this.f30138c) {
                g5.c().a(CommonUtils.A(), this.f30137b, this.d);
            }
        }
    }

    public class b implements ResponseListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f30139a;

        public b(c cVar) {
            this.f30139a = cVar;
        }

        @Override // com.huawei.watchface.api.ResponseListener
        public void onError() {
            HwLog.i(e5.f30133c, "refreshMemberStatus -- getQueryAll -- onError endpoint error");
        }

        @Override // com.huawei.watchface.api.ResponseListener
        public void onResponse(QuerySubInfoDetailResp querySubInfoDetailResp) {
            HwLog.i(e5.f30133c, "refreshMemberStatus -- onResponse");
            e5.this.a(querySubInfoDetailResp);
            c cVar = this.f30139a;
            if (cVar != null) {
                cVar.onMembershipInfoUpdated(querySubInfoDetailResp);
            }
        }
    }

    public interface c {
        void onMembershipInfoUpdated(QuerySubInfoDetailResp querySubInfoDetailResp);
    }

    public static e5 c() {
        if (d == null) {
            synchronized (e5.class) {
                if (d == null) {
                    d = new e5();
                }
            }
        }
        return d;
    }

    public void a(boolean z, boolean z2, boolean z3) {
        b(null, z, z2, z3);
    }

    public void b(final c cVar, final boolean z, final boolean z2, final boolean z3) {
        synchronized (this) {
            HwLog.i(f30133c, "update process");
            BackgroundTaskUtils.submit(new Runnable() { // from class: com.huawei.watchface.e5$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(cVar, z2, z, z3);
                }
            });
        }
    }

    public String d() {
        QuerySubInfoDetailResp querySubInfoDetailResp = this.f30135b;
        if (querySubInfoDetailResp == null) {
            return "";
        }
        if (TextUtils.equals(querySubInfoDetailResp.getMemberStatus(), "1")) {
            return (this.f30135b.getSubInfo() == null || !TextUtils.equals(this.f30135b.getSubInfo().getRenewFlag(), "1")) ? "2" : "1";
        }
        return "3";
    }

    public String e() {
        QuerySubInfoDetailResp querySubInfoDetailResp = this.f30135b;
        return querySubInfoDetailResp == null ? "" : querySubInfoDetailResp.getMemberStatus();
    }

    public QuerySubInfoDetailResp f() {
        return this.f30135b;
    }

    public boolean g() {
        HwLog.i(f30133c, "isVipMembership getFromShared " + h());
        return h();
    }

    public final boolean h() {
        SharedPreferences sharedPreferencesB = e4.b(Environment.getApplicationContext(), "MEMBERSHIP_INFO_DATA");
        if (sharedPreferencesB != null) {
            return sharedPreferencesB.getBoolean("MEMBERSHIP_INFO", false);
        }
        HwLog.i(f30133c, "sharedPreferences is null");
        return false;
    }

    public final /* synthetic */ void i() {
        try {
            HwLog.i(f30133c, "update data on runnable");
            a(false, false, false);
        } catch (Exception e) {
            HwLog.e(f30133c, "update data exception: " + HwLog.printException(e));
        }
    }

    public final void j() {
        synchronized (this) {
            k();
            HwLog.i(f30133c, "startPolling");
            BackgroundTaskUtils.a(this.f30134a, 3600000);
        }
    }

    public void k() {
        synchronized (this) {
            if (this.f30134a != null) {
                HwLog.i(f30133c, "stopPolling: removeTaskFromWorker");
                BackgroundTaskUtils.a(this.f30134a);
            }
        }
    }

    public final /* synthetic */ void a(c cVar, boolean z, boolean z2, boolean z3) {
        MembershipRepository.getQueryAll(new a(cVar, z, z2, z3));
    }

    public final /* synthetic */ void a(c cVar) {
        MembershipRepository.getQueryAll(new b(cVar));
    }

    public void b(final c cVar) {
        BackgroundTaskUtils.submit(new Runnable() { // from class: com.huawei.watchface.e5$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(cVar);
            }
        });
    }

    public void a() {
        synchronized (this) {
            HwLog.i(f30133c, "clear:");
            k();
            d = null;
        }
    }

    public void b() {
        SharedPreferences sharedPreferencesB = e4.b(Environment.getApplicationContext(), "MEMBERSHIP_INFO");
        if (sharedPreferencesB == null) {
            HwLog.i(f30133c, "sharedPreferences is null");
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesB.edit();
        editorEdit.clear();
        editorEdit.apply();
        HwLog.i(f30133c, "clearSharedPreferencesData completed");
    }

    public void a(QuerySubInfoDetailResp querySubInfoDetailResp) {
        this.f30135b = querySubInfoDetailResp;
        boolean z = (querySubInfoDetailResp == null || querySubInfoDetailResp.getMemberStatus() == null || !querySubInfoDetailResp.getMemberStatus().equals("1")) ? false : true;
        HwLog.d(f30133c, "setMembershipInfo isVipMemberShip:" + z);
        a(z);
    }

    public void a(boolean z) {
        SharedPreferences sharedPreferencesB = e4.b(Environment.getApplicationContext(), "MEMBERSHIP_INFO_DATA");
        if (sharedPreferencesB == null) {
            HwLog.i(f30133c, "preferences is null");
            return;
        }
        sharedPreferencesB.edit().putBoolean("MEMBERSHIP_INFO", z).apply();
        HwLog.i(f30133c, "saveQueueTask boolean: " + z);
    }
}
