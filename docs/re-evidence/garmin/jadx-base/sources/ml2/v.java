package ml2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "com.garmin.device.multilink.MultiLinkServiceAgentImpl$write$2", f = "MultiLinkServiceAgentImpl.kt", l = {71, 73}, m = "invokeSuspend")
public final class v extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f119466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f119467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dz2.b f119468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.p<Long, Long, Unit> f119469d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v(s sVar, dz2.b bVar, e23.p<? super Long, ? super Long, Unit> pVar, t13.d<? super v> dVar) {
        super(1, dVar);
        this.f119467b = sVar;
        this.f119468c = bVar;
        this.f119469d = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new v(this.f119467b, this.f119468c, this.f119469d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Unit> dVar) {
        return ((v) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (ml2.s.e(r7, r5, r4, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r7.i(r5, r4, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        return r0;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f119466a;
        if (i14 == 0) {
            o13.r.b(obj);
            s sVar = this.f119467b;
            boolean z14 = sVar.f119442a.f119489b;
            e23.p<Long, Long, Unit> pVar = this.f119469d;
            dz2.b bVar = this.f119468c;
            if (z14) {
                this.f119466a = 1;
            } else {
                this.f119466a = 2;
            }
        } else {
            if (i14 != 1 && i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
