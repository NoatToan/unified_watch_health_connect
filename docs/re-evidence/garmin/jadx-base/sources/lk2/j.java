package lk2;

import b21.l0;
import com.garmin.device.filetransfer.DataSourceModifiedException;
import com.garmin.device.filetransfer.FileTransferException;
import java.io.IOException;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Llk2/a0;", "response", "Llk2/u;", "factory", "Lkotlin/Function2;", "", "", "Lcom/garmin/device/filetransfer/TransferProgress;", "progress", "<anonymous>", "(Llk2/a0;Llk2/u;Le23/p;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.FileTransferManager$write$transfer$1", f = "FileTransferManager.kt", l = {439}, m = "invokeSuspend")
public final class j extends v13.i implements e23.r<a0, u, e23.p<? super Long, ? super Long, ? extends Unit>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f113243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ a0 f113244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ u f113245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ e23.p f113246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f113247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dz2.b f113248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.garmin.device.filetransfer.a f113249g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r0<Long> f113250h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c0 f113251i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r0<nk2.a> f113252j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, dz2.b bVar, com.garmin.device.filetransfer.a aVar, r0<Long> r0Var, c0 c0Var, r0<nk2.a> r0Var2, t13.d<? super j> dVar) {
        super(4, dVar);
        this.f113247e = str;
        this.f113248f = bVar;
        this.f113249g = aVar;
        this.f113250h = r0Var;
        this.f113251i = c0Var;
        this.f113252j = r0Var2;
    }

    @Override // e23.r
    public final Object invoke(a0 a0Var, u uVar, e23.p<? super Long, ? super Long, ? extends Unit> pVar, t13.d<? super Unit> dVar) {
        c0 c0Var = this.f113251i;
        r0<nk2.a> r0Var = this.f113252j;
        j jVar = new j(this.f113247e, this.f113248f, this.f113249g, this.f113250h, c0Var, r0Var, dVar);
        jVar.f113244b = a0Var;
        jVar.f113245c = uVar;
        jVar.f113246d = pVar;
        return jVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws FileTransferException, IOException {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f113243a;
        c0 c0Var = this.f113251i;
        r0<nk2.a> r0Var = this.f113252j;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                a0 a0Var = this.f113244b;
                u uVar = this.f113245c;
                e23.p pVar = this.f113246d;
                Long l14 = a0Var.f113160c;
                String str = this.f113247e;
                if (l14 == null) {
                    throw new FileTransferException(tn.k.g(str, " failed: Device did not include an offset"), null, 2, null);
                }
                long jLongValue = l14.longValue();
                dz2.b bVar = this.f113248f;
                long f61810d = bVar.getF126459l();
                com.garmin.device.filetransfer.a aVar2 = this.f113249g;
                if (jLongValue >= f61810d) {
                    Logger logger = aVar2.f50729e;
                    if (logger == null) {
                        p005kotlin.jvm.internal.s.m("logger");
                        throw null;
                    }
                    logger.error(str + " failed: Partial item on device is larger than input item (" + l14 + " >= " + bVar.getF126459l() + ")");
                    throw new FileTransferException(tn.k.g(str, " failed: Partial item on device is larger than input item"), null, 2, null);
                }
                r0<Long> r0Var2 = this.f113250h;
                Long l15 = r0Var2.f105810a;
                long f61810d2 = bVar.getF126459l();
                if (l15 == null || l15.longValue() != f61810d2) {
                    Logger logger2 = aVar2.f50729e;
                    if (logger2 == null) {
                        p005kotlin.jvm.internal.s.m("logger");
                        throw null;
                    }
                    logger2.error(str + " failed: DataSource.size changed (" + r0Var2.f105810a + " != " + bVar.getF126459l() + ")");
                    DataSourceModifiedException dataSourceModifiedException = new DataSourceModifiedException(tn.k.g(str, " failed: DataSource.size changed"), null, 2, null);
                    c0Var.g(dataSourceModifiedException);
                    throw dataSourceModifiedException;
                }
                nk2.a aVar3 = r0Var.f105810a;
                if (aVar3 == null) {
                    aVar3 = bVar;
                }
                aVar3.setPosition(l14.longValue());
                if (l14.longValue() > 0) {
                    pVar.invoke(l14, new Long(aVar3.getF126459l()));
                }
                int i15 = a0Var.f113158a;
                l0 l0Var = new l0(pVar, a0Var, this.f113250h, this.f113248f, this.f113249g, this.f113247e, this.f113251i);
                this.f113244b = null;
                this.f113245c = null;
                this.f113243a = 1;
                if (uVar.a(i15, aVar3, l0Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            nk2.a aVar4 = r0Var.f105810a;
            if (aVar4 != null) {
                aVar4.f126453f.close();
                aVar4.f126452e.close();
            }
            nk2.a aVar5 = r0Var.f105810a;
            c0Var.f113168f = aVar5 != null ? new Long(aVar5.f126458k) : null;
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            nk2.a aVar6 = r0Var.f105810a;
            if (aVar6 != null) {
                aVar6.f126453f.close();
                aVar6.f126452e.close();
            }
            nk2.a aVar7 = r0Var.f105810a;
            c0Var.f113168f = aVar7 != null ? new Long(aVar7.f126458k) : null;
            throw th3;
        }
    }
}
