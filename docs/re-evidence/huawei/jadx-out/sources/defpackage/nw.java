package defpackage;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class nw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43851a;
    public final String e;

    public nw(String str, String str2) {
        this.f43851a = str;
        this.e = str2;
    }

    public String b() {
        return this.f43851a;
    }

    public JSONObject c() {
        if (TextUtils.isEmpty(this.e)) {
            return null;
        }
        try {
            return new JSONObject(this.e);
        } catch (Exception e) {
            oq.c(e);
            return null;
        }
    }

    public String e() {
        return this.e;
    }

    public String toString() {
        return String.format("<Letter envelop=%s body=%s>", this.f43851a, this.e);
    }
}
