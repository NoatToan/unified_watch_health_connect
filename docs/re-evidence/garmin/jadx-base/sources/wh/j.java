package wh;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import o13.m;
import o13.p;
import o13.t;
import org.apache.commons.io.IOUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;
import p13.u0;
import p13.x;
import p13.y;
import vh.v0;
import w63.a0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lwh/j;", "Lwh/d;", "", "", "Lvh/v0;", "uploads", "Lw63/h;", "operationByteString", "<init>", "(Ljava/util/Map;Lw63/h;)V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class j implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, v0> f185241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w63.h f185242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f185243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f185244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f185245e;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends w implements e23.a<Long> {
        public a() {
            super(0);
        }

        @Override // e23.a
        public final Long invoke() throws Throwable {
            wh.a aVar = new wh.a(new w63.d());
            a0 a0Var = new a0(aVar);
            j jVar = j.this;
            jVar.b(a0Var, false);
            a0Var.flush();
            long j8 = aVar.f185215b;
            Iterator<T> it = jVar.f185241a.values().iterator();
            long contentLength = 0;
            while (it.hasNext()) {
                contentLength += ((v0) it.next()).getContentLength();
            }
            return Long.valueOf(j8 + contentLength);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(Map<String, ? extends v0> map, w63.h hVar) {
        map.getClass();
        hVar.getClass();
        this.f185241a = map;
        this.f185242b = hVar;
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        String string = uuidRandomUUID.toString();
        string.getClass();
        this.f185243c = string;
        this.f185244d = "multipart/form-data; boundary=".concat(string);
        this.f185245e = m.b(new a());
    }

    @Override // wh.d
    public final void a(w63.f fVar) throws Throwable {
        b(fVar, true);
    }

    public final void b(w63.f fVar, boolean z14) throws Throwable {
        StringBuilder sb3 = new StringBuilder("--");
        String str = this.f185243c;
        sb3.append(str);
        sb3.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        fVar.h1(sb3.toString());
        fVar.h1("Content-Disposition: form-data; name=\"operations\"\r\n");
        fVar.h1("Content-Type: application/json\r\n");
        StringBuilder sb4 = new StringBuilder("Content-Length: ");
        w63.h hVar = this.f185242b;
        sb4.append(hVar.d());
        sb4.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        fVar.h1(sb4.toString());
        fVar.h1(IOUtils.LINE_SEPARATOR_WINDOWS);
        fVar.O3(hVar);
        w63.e eVar = new w63.e();
        Throwable th3 = null;
        zh.c cVar = new zh.c(eVar, null);
        Map<String, v0> map = this.f185241a;
        Set<Map.Entry<String, v0>> setEntrySet = map.entrySet();
        ArrayList arrayList = new ArrayList(y.r(setEntrySet, 10));
        int i14 = 0;
        int i15 = 0;
        for (Object obj : setEntrySet) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                Throwable th4 = th3;
                x.q();
                throw th4;
            }
            arrayList.add(new p(String.valueOf(i15), p13.w.c(((Map.Entry) obj).getKey())));
            i15 = i16;
            th3 = th3;
        }
        Throwable th5 = th3;
        zh.b.a(cVar, u0.l(arrayList));
        w63.h hVarH0 = eVar.h0(eVar.f183349b);
        fVar.h1("\r\n--" + str + IOUtils.LINE_SEPARATOR_WINDOWS);
        fVar.h1("Content-Disposition: form-data; name=\"map\"\r\n");
        fVar.h1("Content-Type: application/json\r\n");
        fVar.h1("Content-Length: " + hVarH0.d() + IOUtils.LINE_SEPARATOR_WINDOWS);
        fVar.h1(IOUtils.LINE_SEPARATOR_WINDOWS);
        fVar.O3(hVarH0);
        for (Object obj2 : map.values()) {
            int i17 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw th5;
            }
            v0 v0Var = (v0) obj2;
            fVar.h1("\r\n--" + str + IOUtils.LINE_SEPARATOR_WINDOWS);
            fVar.h1("Content-Disposition: form-data; name=\"" + i14 + CoreConstants.DOUBLE_QUOTE_CHAR);
            if (v0Var.getFileName() != null) {
                fVar.h1("; filename=\"" + v0Var.getFileName() + CoreConstants.DOUBLE_QUOTE_CHAR);
            }
            fVar.h1(IOUtils.LINE_SEPARATOR_WINDOWS);
            fVar.h1("Content-Type: " + v0Var.getContentType() + IOUtils.LINE_SEPARATOR_WINDOWS);
            long contentLength = v0Var.getContentLength();
            if (contentLength != -1) {
                fVar.h1("Content-Length: " + contentLength + IOUtils.LINE_SEPARATOR_WINDOWS);
            }
            fVar.h1(IOUtils.LINE_SEPARATOR_WINDOWS);
            if (z14) {
                v0Var.a();
            }
            i14 = i17;
        }
        fVar.h1("\r\n--" + str + "--\r\n");
    }

    @Override // wh.d
    /* JADX INFO: renamed from: getContentLength */
    public final long getF185216a() {
        return ((Number) this.f185245e.getValue()).longValue();
    }

    @Override // wh.d
    /* JADX INFO: renamed from: getContentType, reason: from getter */
    public final String getF185244d() {
        return this.f185244d;
    }
}
