package com.xiaomi.ai.android.capability;

import android.util.Log;
import com.xiaomi.ai.android.core.Engine;
import com.xiaomi.ai.android.core.e;
import com.xiaomi.ai.android.core.k;
import com.xiaomi.ai.android.track.f;
import com.xiaomi.ai.android.utils.a;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.smarthome.setting.ServerSetting;
import defpackage.mj1;
import defpackage.wpe;
import defpackage.yrs;
import defpackage.zsd;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public abstract class TrackCapability implements Capability {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected e f10870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10871b;
    private boolean c;
    protected volatile boolean d = false;

    public TrackCapability(Engine engine) {
        this.c = false;
        e eVar = (e) engine;
        this.f10870a = eVar;
        int iE = eVar.i().e("aivs.env");
        this.f10871b = iE == 2 ? "staging" : iE == 1 ? ServerSetting.SERVER_ENV_PREVIEW : "production";
        this.c = this.f10870a.i().b("LimitedDiskCache.enable");
    }

    private String a(String str) {
        return f.a().a(this.f10870a.j(), "aivs_track", this.f10871b + str, this.c);
    }

    private mj1 b(String str) {
        mj1 mj1VarCreateArrayNode;
        synchronized (k.class) {
            String strA = a(str);
            mj1VarCreateArrayNode = null;
            if (yrs.b(strA)) {
                removeKeyValue(str);
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
                    wpe.h("TrackCapability", "readLocal  key:" + str + " ,size = " + mj1VarCreateArrayNode.size());
                } catch (IOException e) {
                    wpe.e("TrackCapability", Log.getStackTraceString(e));
                }
                removeKeyValue(str);
            }
            throw th;
        }
        return mj1VarCreateArrayNode;
    }

    public abstract boolean onEventTrack(String str);

    public mj1 readLocalCache() {
        return b("track_cached_info");
    }

    public mj1 readLocalFailData() {
        mj1 mj1VarB = b("track_failed_info");
        this.d = false;
        return mj1VarB;
    }

    public void removeKeyValue(String str) {
        f.a().b(this.f10870a.j(), "aivs_track", this.f10871b + str, this.c);
    }

    public void saveFailData(String str) {
        if (a("track_failed_info", str, null)) {
            this.d = true;
        }
    }

    public boolean saveTrackData(mj1 mj1Var) {
        return a("track_cached_info", null, mj1Var);
    }

    private void a(String str, String str2) {
        f.a().a(this.f10870a.j(), "aivs_track", this.f10871b + str, str2, this.c);
    }

    private boolean a(String str, String str2, mj1 mj1Var) {
        mj1 mj1VarCreateArrayNode;
        synchronized (k.class) {
            try {
                if (yrs.b(str)) {
                    wpe.h("TrackCapability", "saveTrackData :empty key");
                    return false;
                }
                if (yrs.b(str2) && (mj1Var == null || mj1Var.size() == 0)) {
                    wpe.h("TrackCapability", "saveTrackData :empty");
                    return false;
                }
                String strA = a(str);
                if (yrs.b(strA)) {
                    mj1VarCreateArrayNode = null;
                } else {
                    try {
                        mj1VarCreateArrayNode = (mj1) APIUtils.getObjectMapper().readTree(strA);
                    } catch (IOException e) {
                        removeKeyValue(str);
                        wpe.e("TrackCapability", Log.getStackTraceString(e));
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
                long jG = this.f10870a.i().g("track.max_local_track_length");
                wpe.b("TrackCapability", "saveTrackData " + str + " maxLocalTackLength: " + jG);
                if (a.a(mj1VarCreateArrayNode) > jG) {
                    wpe.k("TrackCapability", str + ",save error: cache full !!! ");
                    return false;
                }
                a(str, mj1VarCreateArrayNode.toString());
                wpe.b("TrackCapability", str + ",save success: array:" + mj1VarCreateArrayNode);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
