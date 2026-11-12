package com.xiaomi.ai.android.track;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import defpackage.c4h;
import defpackage.wpe;
import defpackage.zsd;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f10981a;
    private final int d;
    private final String f;
    private Context g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Long f10982b = -1L;
    private int c = 0;
    private boolean e = false;

    public g(Context context, int i, String str, String str2) {
        this.f10981a = str;
        this.d = i;
        this.f = str2;
        this.g = context;
    }

    public synchronized void a() {
        if (this.d > 0 && !TextUtils.isEmpty(this.f10981a) && !TextUtils.isEmpty(this.f)) {
            if (this.f10982b.longValue() < 0) {
                wpe.i("UpdateTimesController", "addTrackTimes,not init  return", this.e);
                return;
            }
            if (a(this.f10982b.longValue())) {
                this.c++;
            } else {
                this.f10982b = Long.valueOf(System.currentTimeMillis());
                this.c = 1;
            }
            c4h c4hVarCreateObjectNode = new ObjectMapper().createObjectNode();
            c4hVarCreateObjectNode.i0(SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME, this.f10982b);
            c4hVarCreateObjectNode.g0("times", this.c);
            com.xiaomi.ai.android.utils.d.a(this.g, this.f10981a, this.f, c4hVarCreateObjectNode.toString());
            wpe.f("UpdateTimesController", this.f + " addTrackTimes:" + this.c + " in " + this.f10982b + " max " + this.d, this.e);
            return;
        }
        wpe.c("UpdateTimesController", "illegal parameter", this.e);
    }

    public synchronized void b() {
        c4h c4hVar;
        if (this.d > 0 && !TextUtils.isEmpty(this.f10981a) && !TextUtils.isEmpty(this.f)) {
            String strA = com.xiaomi.ai.android.utils.d.a(this.g, this.f10981a, this.f);
            wpe.b("UpdateTimesController", "trackRecord:" + strA);
            try {
                if (!TextUtils.isEmpty(strA) && (c4hVar = (c4h) APIUtils.getObjectMapper().readTree(strA)) != null) {
                    zsd zsdVarW = c4hVar.w(SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME);
                    zsd zsdVarW2 = c4hVar.w("times");
                    if (zsdVarW != null && zsdVarW.G() && zsdVarW2 != null && zsdVarW2.G()) {
                        this.f10982b = Long.valueOf(zsdVarW.j());
                        this.c = zsdVarW2.h();
                        wpe.b("UpdateTimesController", "load track times:" + this.c + " at " + this.f10982b);
                        return;
                    }
                    com.xiaomi.ai.android.utils.d.b(this.g, this.f10981a, this.f);
                }
            } catch (IOException e) {
                wpe.c("UpdateTimesController", Log.getStackTraceString(e), this.e);
            }
            this.f10982b = 0L;
            wpe.b("UpdateTimesController", "no track times recorded ");
            return;
        }
        wpe.c("UpdateTimesController", "illegal parameter", this.e);
    }

    public boolean c() {
        if (this.f10982b.longValue() >= 0) {
            return a(this.f10982b.longValue()) && this.c > this.d;
        }
        wpe.i("UpdateTimesController", "isTimeLimit :not init limit", this.e);
        return true;
    }

    private boolean a(long j) {
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        return jCurrentTimeMillis > 0 && jCurrentTimeMillis <= 86400000;
    }
}
