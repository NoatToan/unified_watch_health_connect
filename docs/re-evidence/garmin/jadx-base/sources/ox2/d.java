package ox2;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import lc.u0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lox2/d;", "", "", "healthUploadId", "", "Lox2/d$c;", "successes", "failures", "Lox2/e;", "uploadStatusCheck", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lox2/e;)V", "a", "b", "c", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f134343e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f134344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<c> f134345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<c> f134346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f134347d;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lox2/d$b;", "", "", "code", "", FirebaseAnalytics.Param.CONTENT, "<init>", "(ILjava/lang/String;)V", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f134348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f134349b;

        public b(int i14, String str) {
            str.getClass();
            this.f134348a = i14;
            this.f134349b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f134348a == bVar.f134348a && this.f134349b.equals(bVar.f134349b);
        }

        public final int hashCode() {
            return this.f134349b.hashCode() + (Integer.hashCode(this.f134348a) * 31);
        }

        public final String toString() {
            return o2.c.e(this.f134348a, "Message(code=", ", content='", this.f134349b, "')");
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lox2/d$c;", "", "", "externalId", "", "Lox2/d$b;", "messages", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f134350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<b> f134351b;

        public c(String str, List<b> list) {
            str.getClass();
            list.getClass();
            this.f134350a = str;
            this.f134351b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f134350a.equals(cVar.f134350a) && this.f134351b.equals(cVar.f134351b);
        }

        public final int hashCode() {
            return this.f134351b.hashCode() + (this.f134350a.hashCode() * 31);
        }

        public final String toString() {
            return fb1.c.o("Status(externalId=", this.f134350a, ", messages=", this.f134351b, ")");
        }
    }

    public d(String str, List<c> list, List<c> list2, e eVar) {
        str.getClass();
        list.getClass();
        list2.getClass();
        this.f134344a = str;
        this.f134345b = list;
        this.f134346c = list2;
        this.f134347d = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f134344a, dVar.f134344a) && s.g(this.f134345b, dVar.f134345b) && s.g(this.f134346c, dVar.f134346c) && s.g(this.f134347d, dVar.f134347d);
    }

    public final int hashCode() {
        int iB = u0.b(u0.b(this.f134344a.hashCode() * 31, 31, this.f134345b), 31, this.f134346c);
        e eVar = this.f134347d;
        return iB + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbG = l2.g("UploadStatus(healthUploadId=", this.f134344a, ", successes=", this.f134345b, ", failures=");
        sbG.append(this.f134346c);
        sbG.append(", uploadStatusCheck=");
        sbG.append(this.f134347d);
        sbG.append(")");
        return sbG.toString();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lox2/d$a;", "", "<init>", "()V", "", "LOG_TAG", "Ljava/lang/String;", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static d a(ox2.b bVar) {
            bVar.getClass();
            try {
                Map<String, List<String>> map = bVar.f134339b;
                e eVar = (map.containsKey(FirebaseAnalytics.Param.LOCATION) && map.containsKey("location-in-milliseconds")) ? new e((String) ((List) p13.u0.c(FirebaseAnalytics.Param.LOCATION, map)).get(0), Long.parseLong((String) ((List) p13.u0.c("location-in-milliseconds", map)).get(0))) : null;
                JSONObject jSONObject = new JSONObject(bVar.f134338a).getJSONObject("detailedImportResult");
                String string = jSONObject.getString("healthUploadId");
                string.getClass();
                a aVar = d.f134343e;
                JSONArray jSONArray = jSONObject.getJSONArray("successes");
                jSONArray.getClass();
                aVar.getClass();
                ArrayList arrayListB = b(jSONArray);
                JSONArray jSONArray2 = jSONObject.getJSONArray("failures");
                jSONArray2.getClass();
                return new d(string, arrayListB, b(jSONArray2), eVar);
            } catch (Throwable th3) {
                ge1.b.L("UploadStatus").error("fromGHSJson", th3);
                throw th3;
            }
        }

        public static ArrayList b(JSONArray jSONArray) throws JSONException {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i14 = 0; i14 < length; i14++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i14);
                String string = jSONObject.getString("externalId");
                string.getClass();
                a aVar = d.f134343e;
                JSONArray jSONArray2 = jSONObject.getJSONArray("messages");
                jSONArray2.getClass();
                aVar.getClass();
                ArrayList arrayList2 = new ArrayList();
                int length2 = jSONArray2.length();
                for (int i15 = 0; i15 < length2; i15++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i15);
                    int i16 = jSONObject2.getInt("code");
                    String string2 = jSONObject2.getString(FirebaseAnalytics.Param.CONTENT);
                    string2.getClass();
                    arrayList2.add(new b(i16, string2));
                }
                arrayList2.trimToSize();
                arrayList.add(new c(string, arrayList2));
            }
            arrayList.trimToSize();
            return arrayList;
        }

        private a() {
        }
    }

    public /* synthetic */ d(String str, List list, List list2, e eVar, int i14, j jVar) {
        this(str, list, list2, (i14 & 8) != 0 ? null : eVar);
    }
}
