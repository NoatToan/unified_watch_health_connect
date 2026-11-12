package o63;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo63/n;", "", "Lk63/e;", "descriptor", "<init>", "(Lk63/e;)V", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m63.z f129871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f129872b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.p<k63.e, Integer, Boolean> {
        public a(Object obj) {
            super(2, obj, n.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
        }

        @Override // e23.p
        public final Boolean invoke(k63.e eVar, Integer num) {
            k63.e eVar2 = eVar;
            int iIntValue = num.intValue();
            eVar2.getClass();
            n nVar = (n) this.receiver;
            nVar.getClass();
            boolean z14 = !eVar2.i(iIntValue) && eVar2.h(iIntValue).b();
            nVar.f129872b = z14;
            return Boolean.valueOf(z14);
        }
    }

    public n(k63.e eVar) {
        eVar.getClass();
        this.f129871a = new m63.z(eVar, new a(this));
    }
}
