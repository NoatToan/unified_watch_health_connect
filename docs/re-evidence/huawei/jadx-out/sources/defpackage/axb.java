package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.ads.adsrec.e;
import com.huawei.ads.adsrec.e0;
import com.huawei.ads.adsrec.g0;
import com.huawei.ads.adsrec.r0;
import com.huawei.ads.adsrec.u;
import com.huawei.ads.fund.util.AsyncExec;
import com.huawei.openplatform.abl.log.HiAdLog;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class axb implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e0 f734b;

    r0 a(Context context, int i, e0 e0Var) {
        HiAdLog.i("FullRecallTask", "create recall strategy via api: %s", Integer.valueOf(i));
        return (i == 1 || i == 2) ? new ayd(context, e0Var) : new aya(context, e0Var);
    }

    r0 e(Context context, int i, e0 e0Var) {
        HiAdLog.i("FullRecallTask", "create recall strategy: %s", Integer.valueOf(i));
        if (i != 1) {
            return i != 2 ? new aya(context, e0Var) : new axr(context, e0Var);
        }
        return new ayd(context, e0Var);
    }

    @Override // com.huawei.ads.adsrec.g0
    public <T> axi a(ayc aycVar, T t) {
        HiAdLog.i("FullRecallTask", "recall");
        if (aycVar == null) {
            return null;
        }
        c(aycVar);
        String strE = e(aycVar);
        if (TextUtils.isEmpty(strE)) {
            HiAdLog.w("FullRecallTask", "no slot id");
            return null;
        }
        int iA = aym.b(this.f733a).a(strE);
        axi axiVarA = e(this.f733a, iA, this.f734b).a(aycVar, t);
        if (axiVarA != null) {
            axiVarA.a(iA);
            b(axiVarA.e(), aycVar.g());
        }
        return axiVarA;
    }

    @Override // com.huawei.ads.adsrec.g0
    public <T> axi a(ayc aycVar, axi axiVar) {
        HiAdLog.i("FullRecallTask", "recall via api");
        if (aycVar == null) {
            return null;
        }
        c(aycVar);
        String strE = e(aycVar);
        if (TextUtils.isEmpty(strE)) {
            HiAdLog.w("FullRecallTask", "no slot id");
            return null;
        }
        int iA = aym.b(this.f733a).a(strE);
        axi axiVarA = a(this.f733a, iA, this.f734b).a(aycVar, axiVar);
        if (axiVarA != null) {
            axiVarA.a(iA);
            b(axiVarA.e(), aycVar.g());
        }
        return axiVarA;
    }

    private void c(ayc aycVar) {
        u.a(aycVar.e(), aycVar.g(), aycVar.d());
    }

    private void b(axi axiVar, int i) {
        AsyncExec.submitSeqIO(new b(axiVar, i));
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f735c;
        final /* synthetic */ axi d;

        @Override // java.lang.Runnable
        public void run() {
            e eVar = new e(axb.this.f733a);
            axi axiVar = this.d;
            if (axiVar != null) {
                eVar.a(axiVar.b());
                eVar.a(this.d.i(), this.f735c);
            }
        }

        b(axi axiVar, int i) {
            this.d = axiVar;
            this.f735c = i;
        }
    }

    private String e(ayc aycVar) {
        List<String> listC = aycVar.c();
        if (listC == null || listC.size() <= 0) {
            return null;
        }
        return listC.get(0);
    }

    public axb(Context context, e0 e0Var) {
        this.f733a = context.getApplicationContext();
        this.f734b = e0Var;
    }
}
