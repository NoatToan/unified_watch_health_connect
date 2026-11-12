package sk2;

import e23.p;
import java.util.Arrays;
import java.util.UUID;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.core.agent.xml.DeviceXmlReadAgent$updateXml$1$1", f = "DeviceXmlReadAgent.kt", l = {268, 269}, m = "invokeSuspend")
public final class f extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o13.p f159958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f159959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f159960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rs2.c f159961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f159962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ UUID f159963f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c cVar, rs2.c cVar2, byte[] bArr, UUID uuid, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f159960c = cVar;
        this.f159961d = cVar2;
        this.f159962e = bArr;
        this.f159963f = uuid;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f159960c, this.f159961d, this.f159962e, this.f159963f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006c A[Catch: Exception -> 0x001a, TryCatch #0 {Exception -> 0x001a, blocks: (B:7:0x0016, B:27:0x005e, B:29:0x006c, B:32:0x007b, B:31:0x0072, B:13:0x0023, B:22:0x0048, B:16:0x002a, B:18:0x002e, B:19:0x003d), top: B:36:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0072 A[Catch: Exception -> 0x001a, TryCatch #0 {Exception -> 0x001a, blocks: (B:7:0x0016, B:27:0x005e, B:29:0x006c, B:32:0x007b, B:31:0x0072, B:13:0x0023, B:22:0x0048, B:16:0x002a, B:18:0x002e, B:19:0x003d), top: B:36:0x000e }] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o13.p<byte[], UUID> pVarF;
        o13.p<byte[], UUID> pVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f159959b;
        UUID uuid = this.f159963f;
        byte[] bArr = this.f159962e;
        c cVar = this.f159960c;
        rs2.c cVar2 = this.f159961d;
        try {
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                } else {
                    if (i14 != 2) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pVar = this.f159958a;
                    r.b(obj);
                }
                pVarF = pVar;
                byte[] bArr2 = pVarF.f128594a;
                if (s.g(pVarF.f128595b, uuid) || !Arrays.equals(bArr2, bArr)) {
                    cVar.f159947m.add(cVar2.getF92741e());
                }
                return Unit.INSTANCE;
            }
            r.b(obj);
            a aVar2 = cVar.f159938d;
            if (aVar2 == null) {
                b bVar = cVar.f159936b;
                this.f159959b = 1;
                obj = bVar.a(cVar2, this);
                if (obj == aVar) {
                }
                return aVar;
            }
            pVarF = aVar2.f(cVar2);
            cVar.f159938d.a(cVar2, new o13.p<>(bArr, uuid));
            byte[] bArr3 = pVarF.f128594a;
            if (s.g(pVarF.f128595b, uuid)) {
                cVar.f159947m.add(cVar2.getF92741e());
            } else {
                cVar.f159947m.add(cVar2.getF92741e());
            }
            return Unit.INSTANCE;
            o13.p<byte[], UUID> pVar2 = (o13.p) obj;
            b bVar2 = cVar.f159936b;
            o13.p<byte[], UUID> pVar3 = new o13.p<>(bArr, uuid);
            this.f159958a = pVar2;
            this.f159959b = 2;
            if (bVar2.b(cVar2, pVar3, this) != aVar) {
                pVar = pVar2;
                pVarF = pVar;
                byte[] bArr4 = pVarF.f128594a;
                if (s.g(pVarF.f128595b, uuid)) {
                    cVar.f159947m.add(cVar2.getF92741e());
                } else {
                    cVar.f159947m.add(cVar2.getF92741e());
                }
                return Unit.INSTANCE;
            }
            return aVar;
        } catch (Exception e4) {
            c.f159935r.error("Failed to save GDXml", (Throwable) e4);
            cVar.f159944j.remove(cVar2.getF92741e());
            return Unit.INSTANCE;
        }
    }
}
