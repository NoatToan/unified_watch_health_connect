package defpackage;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class c08 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f4779b = "phonecall_asr_threshold_not_waiting_online";
    public static final qpe c = aqe.f(c08.class);
    public static c08 d = new c08();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public JSONObject f4780a;

    public class a implements h08.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ StringBuilder f4781a;

        public a(StringBuilder sb) {
            this.f4781a = sb;
        }

        @Override // h08.a
        public void a(String str) {
            this.f4781a.append(str);
        }
    }

    public c08() {
        this.f4780a = new JSONObject();
        try {
            StringBuilder sb = new StringBuilder();
            h08.a(t08.a("nlp_edge_config.json"), new a(sb));
            c.info("load edge config: " + ((Object) sb));
            this.f4780a = new JSONObject(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static c08 b() {
        return d;
    }

    public JSONObject a() {
        return this.f4780a;
    }
}
