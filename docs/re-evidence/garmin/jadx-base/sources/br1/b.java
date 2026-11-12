package br1;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lbr1/b;", "", "", "manifestJSONString", "<init>", "(Ljava/lang/String;)V", "a", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f19576b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19577a;

    public b(String str) {
        str.getClass();
        this.f19577a = str;
    }

    public final br1.a a() {
        JSONObject jSONObject = new JSONObject(this.f19577a);
        String strOptString = jSONObject.optString("packageUrl");
        if (strOptString == null) {
            strOptString = "";
        }
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("assets");
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                arrayList.add(itKeys.next());
            }
        }
        return new br1.a(strOptString, arrayList);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lbr1/b$a;", "", "<init>", "()V", "", "JSON_KEY_PACKAGE_URL", "Ljava/lang/String;", "JSON_KEY_ASSETS", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
