package gl2;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.garmin.android.lib.networking.exceptions.NoNetworkException;
import com.garmin.device.filetransfer.core.util.CoreTransferException;
import com.garmin.sync.UploadConfigurationLoader;
import fe2.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o13.r;
import o13.t;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lgl2/p;", "Lgl2/n;", "Lgl2/a$c;", "Lgl2/a;", "uploadConfigSettings", "Lkotlin/Function0;", "Ldl2/b;", "config", "<init>", "(Lgl2/a$c;Le23/a;)V", "file-transfer-gc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.c f77982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<dl2.b> f77983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f77984c;

    /* JADX WARN: Multi-variable type inference failed */
    public p(a.c cVar, e23.a<? extends dl2.b> aVar) {
        cVar.getClass();
        aVar.getClass();
        this.f77982a = cVar;
        this.f77983b = aVar;
        this.f77984c = o13.m.b(new z(this, 21));
    }

    @Override // gl2.n
    public final boolean a() {
        NetworkInfo activeNetworkInfo;
        Context context = this.f77983b.invoke().f132622b;
        context.getClass();
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    @Override // gl2.n
    public final Object b(long j8, String str, d dVar) {
        return this.f77983b.invoke().f60322o.b(j8, str, "5.8.0", dVar);
    }

    @Override // gl2.n
    public final boolean c() {
        return hy2.b.f86375c.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gl2.n
    public final String d(rs2.c cVar, wk2.f fVar) {
        cVar.getClass();
        fVar.getClass();
        UploadConfigurationLoader uploadConfigurationLoader = (UploadConfigurationLoader) this.f77984c.getValue();
        long f172494b = cVar.getF172494b();
        String str = fVar.f185843b;
        uploadConfigurationLoader.getClass();
        str.getClass();
        UploadConfigurationLoader.b bVar = UploadConfigurationLoader.f52783g;
        Context context = uploadConfigurationLoader.f52785b;
        bVar.getClass();
        o13.p pVar = new o13.p(UploadConfigurationLoader.b.c(context).getString(UploadConfigurationLoader.b.b(f172494b, str), null), uploadConfigurationLoader.f52788e.get(Long.valueOf(f172494b)));
        String str2 = (String) pVar.f128594a;
        UploadConfigurationLoader.UploadConfigurationException uploadConfigurationException = (UploadConfigurationLoader.UploadConfigurationException) pVar.f128595b;
        if ((str2 == null || str2.length() == 0) && uploadConfigurationException != null) {
            a.f77873r.getClass();
            Logger logger = a.f77879x;
            long f172494b2 = cVar.getF172494b();
            String message = uploadConfigurationException.getMessage();
            StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(f172494b2, "No endpoint cached for ", StringUtils.SPACE, str);
            sbK.append(": ");
            sbK.append(message);
            logger.warn(sbK.toString());
        }
        return str2;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:41:0x0083  */
    /* JADX WARN: Code duplicated, block: B:42:0x0084  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gl2.n
    public final Object e(rs2.c cVar, v13.c cVar2, boolean z14) throws Throwable {
        o oVar;
        Throwable th3;
        p pVar;
        if (cVar2 instanceof o) {
            oVar = (o) cVar2;
            int i14 = oVar.f77981d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                oVar.f77981d = i14 - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar2);
            }
        } else {
            oVar = new o(this, cVar2);
        }
        Object objD = oVar.f77979b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = oVar.f77981d;
        if (i15 == 0) {
            r.b(objD);
            try {
                UploadConfigurationLoader uploadConfigurationLoader = (UploadConfigurationLoader) this.f77984c.getValue();
                try {
                    long f172494b = cVar.getF172494b();
                    oVar.f77978a = this;
                    oVar.f77981d = 1;
                    objD = uploadConfigurationLoader.d(f172494b, oVar, z14);
                    if (objD == aVar) {
                        return aVar;
                    }
                    pVar = this;
                } catch (Throwable th4) {
                    th3 = th4;
                    pVar = this;
                    if (pVar.a()) {
                        throw new NoNetworkException();
                    }
                    if (hy2.b.a(pVar.f77982a.g())) {
                        throw th3;
                    }
                    throw new CoreTransferException(ok2.e.f132642j, "SYNC Service is not available", null, 4, null);
                }
            } catch (Throwable th5) {
                th3 = th5;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            pVar = oVar.f77978a;
            try {
                r.b(objD);
            } catch (Throwable th6) {
                th3 = th6;
                if (pVar.a()) {
                    throw new NoNetworkException();
                }
                if (hy2.b.a(pVar.f77982a.g())) {
                    throw new CoreTransferException(ok2.e.f132642j, "SYNC Service is not available", null, 4, null);
                }
                throw th3;
            }
        }
        Set set = (Set) objD;
        if (set != null) {
            return set;
        }
        throw new IllegalStateException("No data types found");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gl2.n
    public final Object f(rs2.c cVar, wk2.n nVar, dz2.b bVar, String str, ArrayList arrayList, i iVar) {
        hy2.d dVar = this.f77983b.invoke().f60322o;
        UploadConfigurationLoader uploadConfigurationLoader = (UploadConfigurationLoader) this.f77984c.getValue();
        String str2 = nVar.getF205152b().f185843b;
        uploadConfigurationLoader.getClass();
        str2.getClass();
        boolean zEqualsIgnoreCase = str2.equalsIgnoreCase("ErrorShutdownReports");
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (Map.Entry entry : cl2.c.c(nd2.a.f125408a, cVar).entrySet()) {
            arrayList2.add(new o13.p(entry.getKey(), entry.getValue()));
        }
        long f172494b = cVar.getF172494b();
        String string = nVar.getF205152b().f185842a.toString();
        string.getClass();
        return dVar.g(f172494b, string, bVar, str, arrayList2, zEqualsIgnoreCase, "5.8.0", iVar);
    }

    @Override // gl2.n
    public final void g(long j8) {
        UploadConfigurationLoader uploadConfigurationLoader = (UploadConfigurationLoader) this.f77984c.getValue();
        Long lValueOf = Long.valueOf(j8);
        Context context = uploadConfigurationLoader.f52785b;
        UploadConfigurationLoader.b bVar = UploadConfigurationLoader.f52783g;
        Set<String> setRemove = uploadConfigurationLoader.f52787d.remove(lValueOf);
        Set<String> set = setRemove;
        if (set == null || set.isEmpty()) {
            return;
        }
        bVar.getClass();
        SharedPreferences.Editor editorEdit = UploadConfigurationLoader.b.c(context).edit();
        Iterator<T> it = setRemove.iterator();
        while (it.hasNext()) {
            editorEdit.remove((String) it.next());
        }
        editorEdit.commit();
    }
}
