package defpackage;

import org.json.JSONArray;

/* JADX INFO: loaded from: classes11.dex */
public class eds extends JSONArray implements bds {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16545a = 2;

    @Override // defpackage.bds
    public int a() {
        return this.f16545a + (length() - 1);
    }

    @Override // org.json.JSONArray
    public JSONArray put(Object obj) {
        if (obj instanceof bds) {
            this.f16545a += ((bds) obj).a();
        }
        return super.put(obj);
    }
}
