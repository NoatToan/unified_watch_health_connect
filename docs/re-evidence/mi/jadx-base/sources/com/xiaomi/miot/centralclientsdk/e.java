package com.xiaomi.miot.centralclientsdk;

/* JADX INFO: loaded from: classes11.dex */
public class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f13607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d.a f13608b = null;
    public int c = 1;
    public long d = -1;

    public interface a {
    }

    public e(a aVar) {
        this.f13607a = aVar;
    }

    @Override // com.xiaomi.miot.centralclientsdk.d
    public void a(d.a aVar) {
        this.f13608b = aVar;
    }

    public void b(String str, String str2) {
        d.a aVar = this.f13608b;
        if (aVar != null) {
            aVar.a("{\"id\":" + c() + ",\"method\":\"miIO.update_homeid\",\"params\":{\"uid\":\"" + str + "\",\"homeid\":\"" + str2 + "\"}}");
        }
    }

    public final int c() {
        int i = this.c + 1;
        this.c = i;
        if (i == Integer.MAX_VALUE) {
            this.c = 1;
        }
        return this.c;
    }

    public void d(String str) {
        d.a aVar = this.f13608b;
        if (aVar == null || this.d < 0) {
            return;
        }
        aVar.a("{\"id\":" + this.d + ",\"result\":" + str + "}");
        this.d = -1L;
    }
}
