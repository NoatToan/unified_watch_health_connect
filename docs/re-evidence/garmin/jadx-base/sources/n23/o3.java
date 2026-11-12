package n23;

import org.apache.commons.io.IOUtils;

/* JADX INFO: loaded from: classes3.dex */
public class o3 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q3.a f122551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q3 f122552b;

    public o3(q3.a aVar, q3 q3Var) {
        this.f122551a = aVar;
        this.f122552b = q3Var;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    @Override // e23.a
    public final Object invoke() {
        String str;
        r33.a aVar;
        k23.l<Object>[] lVarArr = q3.a.f122580g;
        c4.a aVar2 = this.f122551a.f122581c;
        k23.l<Object> lVar = q3.a.f122580g[0];
        y23.e eVar = (y23.e) aVar2.invoke();
        if (eVar == null || (aVar = eVar.f194349b) == null) {
            str = null;
        } else {
            str = aVar.f150100f;
            if (aVar.f150095a != r33.a.EnumC2820a.MULTIFILE_CLASS_PART) {
                str = null;
            }
        }
        if (str == null || str.length() <= 0) {
            return null;
        }
        ClassLoader classLoader = this.f122552b.f122578d.getClassLoader();
        String strReplace = str.replace(IOUtils.DIR_SEPARATOR_UNIX, '.');
        strReplace.getClass();
        return classLoader.loadClass(strReplace);
    }
}
