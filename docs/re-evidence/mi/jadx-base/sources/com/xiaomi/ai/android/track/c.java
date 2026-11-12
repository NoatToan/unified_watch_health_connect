package com.xiaomi.ai.android.track;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xiaomi.ai.android.utils.NetworkUtils;
import com.xiaomi.ai.api.Network;
import com.xiaomi.ai.api.common.APIUtils;
import defpackage.c4h;
import defpackage.d2s;
import defpackage.d3s;
import defpackage.e01;
import defpackage.f01;
import defpackage.mj1;
import defpackage.wpe;
import defpackage.yrs;
import defpackage.zsd;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: loaded from: classes6.dex */
public class c extends b {
    private int i;
    private Context j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private e01 f10972k;
    private String l;
    private String m;
    private final mj1 n;
    private OkHttpClient o;
    private int p;
    private volatile boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f10973r;

    public class a implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f10974a;

        public a(String str) {
            this.f10974a = str;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            wpe.b("GeneralTrackStrategy", "postTrackData: onFailure " + this.f10974a);
            if (iOException != null) {
                wpe.e("GeneralTrackStrategy", Log.getStackTraceString(iOException));
            }
            c.this.c(this.f10974a);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            if (response == null) {
                wpe.k("GeneralTrackStrategy", "postTrackData: failed");
                return;
            }
            if (response.isSuccessful()) {
                try {
                    wpe.h("GeneralTrackStrategy", "postTrackData: success");
                    if (c.this.q) {
                        c.this.g();
                    }
                } catch (Exception e) {
                    wpe.e("GeneralTrackStrategy", Log.getStackTraceString(e));
                }
                if (NetworkUtils.getBriefNetworkType(c.this.j) == Network.NetworkType.DATA) {
                    c.this.l();
                } else {
                    wpe.b("GeneralTrackStrategy", "postTrackData: not using 4g");
                }
            } else {
                wpe.e("GeneralTrackStrategy", "postTrackData: failed, code=" + response.code() + ", msg:" + response.toString());
                if (response.code() == 401) {
                    c cVar = c.this;
                    b.d dVar = cVar.c;
                    if (dVar != null) {
                        dVar.onError(new f01(401, "authorization fail"));
                    } else {
                        cVar.c(this.f10974a);
                    }
                }
            }
            try {
                response.close();
            } catch (Exception e2) {
                wpe.e("GeneralTrackStrategy", Log.getStackTraceString(e2));
            }
        }
    }

    public c(Context context, String str, e01 e01Var, b.d dVar) {
        super(e01Var.f("general_track.period_check_interval", 10), e01Var.f("general_track.disk_period_check_interval", 300), true, dVar);
        this.q = false;
        this.f10973r = false;
        this.j = context;
        this.l = str;
        this.f10972k = e01Var;
        this.n = APIUtils.getObjectMapper().createArrayNode();
        this.i = this.f10972k.e("general_track.max_track_data_size");
        if (TextUtils.isEmpty(this.l)) {
            wpe.e("GeneralTrackStrategy", "TrackHelper:authorization is empty");
        }
        this.m = new d3s(this.f10972k).f();
        wpe.h("GeneralTrackStrategy", "mTrackUrl:" + this.m);
        this.o = new OkHttpClient.Builder().addInterceptor(new d2s()).connectTimeout((long) this.f10972k.e("connection.connect_timeout"), TimeUnit.SECONDS).build();
        this.f10973r = e01Var.b("LimitedDiskCache.enable");
        p();
    }

    private synchronized mj1 a(Context context, String str) {
        mj1 mj1VarCreateArrayNode = null;
        if (context == null) {
            wpe.e("GeneralTrackStrategy", "readLocal error : empty context");
            return null;
        }
        if (yrs.b(str)) {
            wpe.e("GeneralTrackStrategy", "readLocal error : empty key");
            return null;
        }
        String strA = a(str);
        if (yrs.b(strA)) {
            wpe.h("GeneralTrackStrategy", "readLocal  key:" + str + " :null");
        } else {
            try {
                mj1VarCreateArrayNode = APIUtils.getObjectMapper().createArrayNode();
                mj1 mj1Var = (mj1) APIUtils.getObjectMapper().readTree(strA);
                if (mj1Var != null && mj1Var.size() > 0) {
                    Iterator<zsd> it = mj1Var.iterator();
                    while (it.hasNext()) {
                        mj1VarCreateArrayNode.f0((mj1) APIUtils.getObjectMapper().readTree(it.next().l()));
                    }
                }
                wpe.b("GeneralTrackStrategy", "readLocal  key:" + str + " ,size = " + mj1VarCreateArrayNode.size());
            } catch (IOException e) {
                wpe.e("GeneralTrackStrategy", Log.getStackTraceString(e));
            }
        }
        b(str);
        return mj1VarCreateArrayNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void l() {
        String str = new SimpleDateFormat("yyyyMMdd", Locale.US).format(Long.valueOf(System.currentTimeMillis()));
        this.p++;
        c4h c4hVarCreateObjectNode = new ObjectMapper().createObjectNode();
        c4hVarCreateObjectNode.g0(str, this.p);
        a("track_times", c4hVarCreateObjectNode.toString());
        wpe.h("GeneralTrackStrategy", "addTrackTimes:" + this.p + " at " + str);
    }

    private int n() {
        int size;
        synchronized (this.n) {
            size = this.n.size();
        }
        return size;
    }

    private synchronized void p() {
        c4h c4hVar;
        String str = new SimpleDateFormat("yyyyMMdd", Locale.US).format(Long.valueOf(System.currentTimeMillis()));
        String strA = a("track_times");
        wpe.b("GeneralTrackStrategy", "trackRecord:" + strA);
        try {
            if (!TextUtils.isEmpty(strA) && (c4hVar = (c4h) APIUtils.getObjectMapper().readTree(strA)) != null) {
                zsd zsdVarT = c4hVar.T(str);
                if (zsdVarT != null && zsdVarT.G()) {
                    this.p = zsdVarT.h();
                    wpe.h("GeneralTrackStrategy", "load track times:" + this.p + " at " + str);
                    return;
                }
                b("track_times");
            }
        } catch (IOException e) {
            wpe.e("GeneralTrackStrategy", Log.getStackTraceString(e));
        }
        this.p = 0;
        wpe.h("GeneralTrackStrategy", "no track times recorded : at " + str);
    }

    public void d(String str) {
        this.l = str;
    }

    @Override // com.xiaomi.ai.android.track.b
    public boolean e() {
        boolean z;
        synchronized (this.n) {
            z = this.n.size() == 0;
        }
        return z;
    }

    @Override // com.xiaomi.ai.android.track.b
    public void h() {
        mj1 mj1VarA = a(this.j, "track_cached_info");
        if (mj1VarA == null || mj1VarA.size() <= 0) {
            return;
        }
        a(mj1VarA);
    }

    @Override // com.xiaomi.ai.android.track.b
    public boolean i() {
        this.q = false;
        mj1 mj1VarA = a(this.j, "track_failed_info");
        if (mj1VarA == null || mj1VarA.size() <= 0) {
            return false;
        }
        a(mj1VarA);
        return true;
    }

    @Override // com.xiaomi.ai.android.track.b
    public boolean j() {
        return a(this.j, "track_cached_info", null, o());
    }

    @Override // com.xiaomi.ai.android.track.b
    public boolean k() {
        Iterator<zsd> it = o().iterator();
        while (true) {
            boolean z = true;
            while (it.hasNext()) {
                boolean zB = b(it.next());
                if (!z || !zB) {
                    z = false;
                }
            }
            return z;
        }
    }

    public synchronized void m() {
        f.a().a(this.j, "aivs_track", this.f10973r);
    }

    public mj1 o() {
        mj1 mj1VarCreateArrayNode;
        mj1 mj1VarCreateArrayNode2;
        synchronized (this.n) {
            try {
                mj1VarCreateArrayNode = APIUtils.getObjectMapper().createArrayNode();
                if (this.n.size() > this.i) {
                    mj1VarCreateArrayNode2 = APIUtils.getObjectMapper().createArrayNode();
                    Iterator<zsd> it = this.n.iterator();
                    while (it.hasNext()) {
                        mj1VarCreateArrayNode2.d0(it.next());
                        if (mj1VarCreateArrayNode2.size() == this.i) {
                            mj1VarCreateArrayNode.e0(mj1VarCreateArrayNode2.toString());
                            mj1VarCreateArrayNode2.k0();
                        }
                    }
                    if (mj1VarCreateArrayNode2.size() > 0) {
                    }
                    this.n.k0();
                } else {
                    mj1VarCreateArrayNode2 = this.n;
                }
                mj1VarCreateArrayNode.e0(mj1VarCreateArrayNode2.toString());
                this.n.k0();
            } catch (Throwable th) {
                throw th;
            }
        }
        return mj1VarCreateArrayNode;
    }

    private String a(String str) {
        return f.a().a(this.j, "aivs_track", str, this.f10973r);
    }

    private void b(String str) {
        f.a().b(this.j, "aivs_track", str, this.f10973r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        a(this.j, "track_failed_info", str, null);
        this.q = true;
    }

    @Override // com.xiaomi.ai.android.track.b
    public boolean d() {
        return n() < this.i;
    }

    private void a(mj1 mj1Var) {
        synchronized (this.n) {
            this.n.f0(mj1Var);
        }
    }

    private boolean b(zsd zsdVar) {
        int iE = this.f10972k.e("general_track.max_track_times");
        if (NetworkUtils.getBriefNetworkType(this.j) == Network.NetworkType.DATA && this.p > iE) {
            wpe.k("GeneralTrackStrategy", "postTrackData: reach max track time " + iE + " in 4g");
            return false;
        }
        String strU = zsdVar.U();
        if (!NetworkUtils.isNetworkAvailable(this.j)) {
            wpe.e("GeneralTrackStrategy", "postTrackData:network is not available");
            c(strU);
            return true;
        }
        wpe.b("GeneralTrackStrategy", "postTrackData:" + strU);
        if (TextUtils.isEmpty(this.l)) {
            wpe.e("GeneralTrackStrategy", "postTrackData: mAuthorization is empty");
            c(strU);
            return false;
        }
        this.o.newCall(new Request.Builder().url(this.m).post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), strU)).addHeader("Authorization", this.l).build()).enqueue(new a(strU));
        return true;
    }

    public void a(zsd zsdVar) {
        synchronized (this.n) {
            this.n.d0(zsdVar);
        }
    }

    private void a(String str, String str2) {
        f.a().a(this.j, "aivs_track", str, str2, this.f10973r);
    }

    private synchronized boolean a(Context context, String str, String str2, mj1 mj1Var) {
        mj1 mj1VarCreateArrayNode;
        if (yrs.b(str)) {
            wpe.k("GeneralTrackStrategy", "saveTrackData :empty key");
            return false;
        }
        if (context == null) {
            wpe.k("GeneralTrackStrategy", "saveTrackData :empty mContext");
            return false;
        }
        if (yrs.b(str2) && (mj1Var == null || mj1Var.size() == 0)) {
            wpe.k("GeneralTrackStrategy", "saveTrackData :empty");
            return false;
        }
        String strA = a(str);
        if (yrs.b(strA)) {
            mj1VarCreateArrayNode = null;
        } else {
            try {
                mj1VarCreateArrayNode = (mj1) APIUtils.getObjectMapper().readTree(strA);
            } catch (IOException e) {
                b(str);
                wpe.e("GeneralTrackStrategy", Log.getStackTraceString(e));
                mj1VarCreateArrayNode = null;
            }
        }
        if (mj1VarCreateArrayNode == null) {
            mj1VarCreateArrayNode = APIUtils.getObjectMapper().createArrayNode();
        }
        if (!yrs.b(str2)) {
            mj1VarCreateArrayNode.e0(str2);
        }
        if (mj1Var != null && mj1Var.size() > 0) {
            mj1VarCreateArrayNode.f0(mj1Var);
        }
        long jG = this.f10972k.g("general_track.max_local_track_length");
        wpe.b("GeneralTrackStrategy", "saveTrackData: " + str + " maxLocalTackLength: " + jG);
        if (com.xiaomi.ai.android.utils.a.a(mj1VarCreateArrayNode) > jG) {
            wpe.k("GeneralTrackStrategy", str + ",save error: cache full !!! ");
            return false;
        }
        a(str, mj1VarCreateArrayNode.toString());
        wpe.b("GeneralTrackStrategy", str + ",save: success  array:" + mj1VarCreateArrayNode);
        return true;
    }
}
