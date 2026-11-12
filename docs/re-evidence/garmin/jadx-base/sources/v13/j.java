package v13;

import o13.r;
import org.apache.commons.io.IOUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lv13/j;", "Lv13/a;", "", "declaringClass", "methodName", "fileName", "", "lineNumber", "", "", "spilledVariables", "Lt13/d;", "continuation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;Lt13/d;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f174837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f174838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f174839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f174840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object[] f174841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t13.d<Object> f174842f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, String str2, String str3, int i14, Object[] objArr, t13.d<Object> dVar) {
        super(dVar);
        str.getClass();
        str2.getClass();
        str3.getClass();
        objArr.getClass();
        dVar.getClass();
        this.f174837a = str;
        this.f174838b = str2;
        this.f174839c = str3;
        this.f174840d = i14;
        this.f174841e = objArr;
        this.f174842f = dVar;
    }

    @Override // t13.d
    /* JADX INFO: renamed from: getContext */
    public final t13.g getF129302c() {
        return this.f174842f.getF129302c();
    }

    @Override // v13.a
    public final StackTraceElement getStackTraceElement() {
        f.f174831a.getClass();
        String strA = f.a(this);
        String str = this.f174837a;
        if (strA != null) {
            str = strA + IOUtils.DIR_SEPARATOR_UNIX + str;
        }
        return new StackTraceElement(str, this.f174838b, this.f174839c, this.f174840d);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        r.b(obj);
        return obj;
    }
}
