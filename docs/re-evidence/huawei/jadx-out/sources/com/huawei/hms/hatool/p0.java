package com.huawei.hms.hatool;

import com.huawei.openalliance.ad.constant.Constants;
import java.util.Calendar;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f13479a = 1800000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f13480b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f13481c = null;

    public boolean b() {
        a aVar = this.f13481c;
        if (aVar != null) {
            return aVar.f13483b;
        }
        v.f("hmsSdk", "isFirstEvent(): session not prepared. onEvent() must be called first.");
        return false;
    }

    class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f13482a = UUID.randomUUID().toString().replace(Constants.LINK, "");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f13483b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f13484c;

        void a(long j) {
            if (p0.this.f13480b) {
                p0.this.f13480b = false;
                b(j);
            } else if (b(this.f13484c, j) || a(this.f13484c, j)) {
                b(j);
            } else {
                this.f13484c = j;
                this.f13483b = false;
            }
        }

        private boolean b(long j, long j2) {
            return j2 - j >= p0.this.f13479a;
        }

        private void b(long j) {
            v.c("hmsSdk", "getNewSession() session is flush!");
            String string = UUID.randomUUID().toString();
            this.f13482a = string;
            this.f13482a = string.replace(Constants.LINK, "");
            this.f13482a += "_" + j;
            this.f13484c = j;
            this.f13483b = true;
        }

        private boolean a(long j, long j2) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j2);
            return (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) ? false : true;
        }

        a(long j) {
            this.f13482a += "_" + j;
            this.f13484c = j;
            this.f13483b = true;
            p0.this.f13480b = false;
        }
    }

    void a(long j) {
        a aVar = this.f13481c;
        if (aVar != null) {
            aVar.a(j);
        } else {
            v.c("hmsSdk", "Session is first flush");
            this.f13481c = new a(j);
        }
    }

    public String a() {
        a aVar = this.f13481c;
        if (aVar != null) {
            return aVar.f13482a;
        }
        v.f("hmsSdk", "getSessionName(): session not prepared. onEvent() must be called first.");
        return "";
    }
}
