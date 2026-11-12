package com.xiaomi.ai.android.helper;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.android.track.b;
import com.xiaomi.ai.android.track.c;
import com.xiaomi.ai.android.utils.NetworkUtils;
import com.xiaomi.ai.api.StdStatuses;
import com.xiaomi.ai.api.TrackLogV3;
import com.xiaomi.ai.api.common.APIUtils;
import defpackage.c4h;
import defpackage.e01;
import defpackage.f01;
import defpackage.wpe;
import defpackage.zsd;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class TrackHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OnErrorListener f10941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f10942b;

    public interface OnErrorListener {
        void onError(f01 f01Var);
    }

    public class a implements b.d {
        public a() {
        }

        @Override // com.xiaomi.ai.android.track.b.d
        public void a() {
        }

        @Override // com.xiaomi.ai.android.track.b.d
        public void onError(f01 f01Var) {
            if (TrackHelper.this.f10941a != null) {
                TrackHelper.this.f10941a.onError(f01Var);
            }
        }
    }

    public TrackHelper(Context context, String str, e01 e01Var) {
        this.f10942b = new c(context, str, e01Var, new a());
        if (TextUtils.isEmpty(str)) {
            wpe.e("TrackHelper", "TrackHelper:authorization is empty");
        }
        if (NetworkUtils.isNetworkAvailable(context)) {
            this.f10942b.g();
        }
    }

    private c4h a(TrackLogV3.TrackLog trackLog) {
        String stackTraceString;
        if (trackLog == null) {
            return null;
        }
        try {
            return (c4h) APIUtils.getObjectMapper().readTree(APIUtils.toJsonString(trackLog));
        } catch (JsonProcessingException e) {
            OnErrorListener onErrorListener = this.f10941a;
            if (onErrorListener != null) {
                onErrorListener.onError(new f01(StdStatuses.MISSING_PARAMETER, "required field not set"));
            }
            wpe.e("TrackHelper", Log.getStackTraceString(e));
            stackTraceString = "convert event_params to string failed";
            wpe.e("TrackHelper", stackTraceString);
            return null;
        } catch (IOException e2) {
            stackTraceString = Log.getStackTraceString(e2);
            wpe.e("TrackHelper", stackTraceString);
            return null;
        }
    }

    public void clearTrackData() {
        wpe.h("TrackHelper", "clearTrackData");
        this.f10942b.m();
    }

    public boolean postTrackData(TrackLogV3.TrackLog trackLog, boolean z) {
        return a(a(trackLog), z);
    }

    public void release() {
        wpe.h("TrackHelper", "release");
        this.f10942b.a(false);
    }

    public void setAuthorization(String str) {
        this.f10942b.d(str);
    }

    public void setOnErrorListener(OnErrorListener onErrorListener) {
        this.f10941a = onErrorListener;
    }

    private synchronized boolean a(zsd zsdVar, boolean z) {
        if (zsdVar == null && z) {
            try {
                wpe.k("TrackHelper", "can not post empty data with wait more");
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zsdVar != null) {
            this.f10942b.a(zsdVar);
        }
        wpe.b("TrackHelper", "postTrackData: waitMore=" + z);
        return this.f10942b.a(z);
    }
}
