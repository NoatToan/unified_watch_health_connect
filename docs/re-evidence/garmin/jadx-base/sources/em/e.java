package em;

import am.b2;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.gson.Gson;
import iu1.k;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p005kotlin.Metadata;
import ps.m;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lem/e;", "Liu1/h;", "Lps/m;", "", "activityId", "Liu1/k;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(JLiu1/k;)V", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends iu1.h<m> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f64577l;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lem/e$a;", "Liu1/e;", "Lps/m;", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements iu1.e<m> {
        @Override // iu1.e
        public final List a(Class cls, String str) {
            return new ArrayList();
        }

        @Override // iu1.e
        public final Object b(Class cls, String str) {
            JSONObject jSONObjectOptJSONObject;
            if (str == null || (jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("gPolyline")) == null) {
                return new m(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
            }
            Object objFromJson = new Gson().fromJson(jSONObjectOptJSONObject.toString(), (Class<Object>) m.class);
            objFromJson.getClass();
            return (m) objFromJson;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(long j8, k<? super m> kVar) {
        super(new a(), null, false, m.class, kVar, null, null, null, 230, null);
        kVar.getClass();
        this.f64577l = j8;
    }

    @Override // iu1.h
    public final c83.d<String> f() {
        return ((b2) ez0.b.a(ez0.b.f67468a, ez0.c.GC, b2.class, new c83.h.a[0], null, null, null, 120)).E(this.f64577l);
    }
}
