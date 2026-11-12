package wh;

import ch.qos.logback.classic.spi.CallerData;
import com.google.android.gms.actions.SearchIntents;
import com.google.common.net.HttpHeaders;
import d53.w;
import i3.e5;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lc.u0;
import p005kotlin.Metadata;
import vh.n0;
import vh.z;
import w3.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lwh/c;", "Lwh/h;", "", "serverUrl", "<init>", "(Ljava/lang/String;)V", "a", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class c implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f185218b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f185219a;

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f185220a;

        static {
            int[] iArr = new int[f.values().length];
            try {
                iArr[f.Get.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.Post.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f185220a = iArr;
        }
    }

    public c(String str) {
        str.getClass();
        this.f185219a = str;
    }

    @Override // wh.h
    public final <D extends n0.a> g a(vh.e<D> eVar) throws EOFException {
        eVar.getClass();
        n0<D> n0Var = eVar.f178288a;
        z zVar = (z) eVar.f178290c.b(z.f178396e);
        if (zVar == null) {
            zVar = z.f178397f;
        }
        z zVar2 = zVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new e("X-APOLLO-OPERATION-ID", n0Var.id()));
        arrayList.add(new e("X-APOLLO-OPERATION-NAME", n0Var.name()));
        arrayList.add(new e(HttpHeaders.ACCEPT, "multipart/mixed; deferSpec=20220824, application/json"));
        List<e> list = eVar.f178292e;
        if (list != null) {
            arrayList.addAll(list);
        }
        Boolean bool = eVar.f178293f;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = eVar.f178294g;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : true;
        f fVar = eVar.f178291d;
        if (fVar == null) {
            fVar = f.Post;
        }
        int i14 = b.f185220a[fVar.ordinal()];
        a aVar = f185218b;
        String str = this.f185219a;
        if (i14 != 1) {
            if (i14 != 2) {
                u0.r();
                return null;
            }
            String strD = zBooleanValue2 ? n0Var.d() : null;
            g.a aVar2 = new g.a(f.Post, str);
            ArrayList arrayList2 = aVar2.f185233d;
            arrayList2.addAll(arrayList);
            aVar.getClass();
            zVar2.getClass();
            w63.e eVar2 = new w63.e();
            LinkedHashMap linkedHashMapA = a.a(aVar, new zh.c(eVar2, null), n0Var, zVar2, zBooleanValue, strD);
            w63.h hVarH0 = eVar2.h0(eVar2.f183349b);
            d bVar = linkedHashMapA.isEmpty() ? new wh.b(hVarH0) : new j(linkedHashMapA, hVarH0);
            aVar2.f185232c = bVar;
            return new g(aVar2.f185230a, aVar2.f185231b, arrayList2, bVar, null);
        }
        f fVar2 = f.Get;
        aVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("operationName", n0Var.name());
        w63.e eVar3 = new w63.e();
        ai.a aVar3 = new ai.a(new zh.c(eVar3, null));
        aVar3.y();
        n0Var.c(aVar3, zVar2);
        aVar3.A();
        if (!aVar3.f3306b.isEmpty()) {
            vb.h.z("FileUpload and Http GET are not supported at the same time");
            return null;
        }
        linkedHashMap.put("variables", eVar3.x());
        if (zBooleanValue2) {
            linkedHashMap.put(SearchIntents.EXTRA_QUERY, n0Var.d());
        }
        if (zBooleanValue) {
            w63.e eVar4 = new w63.e();
            zh.c cVar = new zh.c(eVar4, null);
            cVar.y();
            cVar.v1("persistedQuery");
            cVar.y();
            cVar.v1("version");
            cVar.R0(1);
            cVar.v1("sha256Hash");
            cVar.n0(n0Var.id());
            cVar.A();
            cVar.A();
            linkedHashMap.put("extensions", eVar4.x());
        }
        StringBuilder sbK = e5.k(str);
        boolean z14 = w.z(str, CallerData.NA, false);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (z14) {
                sbK.append('&');
            } else {
                sbK.append('?');
                z14 = true;
            }
            sbK.append(x.w((String) entry.getKey()));
            sbK.append('=');
            sbK.append(x.w((String) entry.getValue()));
        }
        g.a aVar4 = new g.a(fVar2, sbK.toString());
        ArrayList arrayList3 = aVar4.f185233d;
        arrayList3.addAll(arrayList);
        return new g(aVar4.f185230a, aVar4.f185231b, arrayList3, aVar4.f185232c, null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lwh/c$a;", "", "<init>", "()V", "", "HEADER_ACCEPT_NAME", "Ljava/lang/String;", "HEADER_ACCEPT_VALUE_DEFER", "HEADER_ACCEPT_VALUE_MULTIPART", "HEADER_APOLLO_OPERATION_ID", "HEADER_APOLLO_OPERATION_NAME", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static final LinkedHashMap a(a aVar, zh.g gVar, n0 n0Var, z zVar, boolean z14, String str) {
            aVar.getClass();
            gVar.y();
            gVar.v1("operationName");
            gVar.n0(n0Var.name());
            gVar.v1("variables");
            ai.a aVar2 = new ai.a(gVar);
            aVar2.y();
            n0Var.c(aVar2, zVar);
            aVar2.A();
            if (str != null) {
                gVar.v1(SearchIntents.EXTRA_QUERY);
                gVar.n0(str);
            }
            if (z14) {
                gVar.v1("extensions");
                gVar.y();
                gVar.v1("persistedQuery");
                gVar.y();
                gVar.v1("version").R0(1);
                gVar.v1("sha256Hash").n0(n0Var.id());
                gVar.A();
                gVar.A();
            }
            gVar.A();
            return aVar2.f3306b;
        }

        private a() {
        }
    }
}
