package jn2;

import com.google.common.base.Function;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.FluentFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljn2/s;", "Lwl2/f;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s extends wl2.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map<byte[], com.garmin.device.nfc.b> f99672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0<FluentFuture<Boolean>> f99673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0 f99674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f99675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r0<Exception> f99676e;

    /* JADX WARN: Multi-variable type inference failed */
    public s(Map<byte[], ? extends com.garmin.device.nfc.b> map, r0<FluentFuture<Boolean>> r0Var, m0 m0Var, m mVar, r0<Exception> r0Var2) {
        this.f99672a = map;
        this.f99673b = r0Var;
        this.f99674c = m0Var;
        this.f99675d = mVar;
        this.f99676e = r0Var2;
    }

    @Override // tl2.f
    public final void b(tl2.c.b bVar) {
        bVar.getClass();
        this.f99675d.f99650d.debug("deleteProviderMetadata: transfer closed: " + bVar);
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [T, com.google.common.util.concurrent.FluentFuture] */
    /* JADX WARN: Type inference failed for: r12v7, types: [T, com.google.common.util.concurrent.FluentFuture] */
    @Override // wl2.f
    public final void c(wl2.b bVar) {
        r0<FluentFuture<Boolean>> r0Var = this.f99673b;
        Map<byte[], com.garmin.device.nfc.b> map = this.f99672a;
        if (map != null) {
            for (Map.Entry<byte[], com.garmin.device.nfc.b> entry : map.entrySet()) {
                final byte[] key = entry.getKey();
                final com.garmin.device.nfc.b value = entry.getValue();
                FluentFuture<Boolean> fluentFuture = r0Var.f105810a;
                final m0 m0Var = this.f99674c;
                final m mVar = this.f99675d;
                final r0<Exception> r0Var2 = this.f99676e;
                final wl2.b bVar2 = bVar;
                r0Var.f105810a = fluentFuture.transformAsync(new AsyncFunction() { // from class: jn2.q
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.common.util.concurrent.AsyncFunction
                    public final ListenableFuture apply(Object obj) {
                        if (!p005kotlin.jvm.internal.s.g((Boolean) obj, Boolean.TRUE)) {
                            m0Var.f105804a = false;
                            String str = "Failed to delete card: " + key;
                            mVar.f99650d.error("deleteProviderMetadata: ".concat(str));
                            r0 r0Var3 = r0Var2;
                            T t7 = r0Var3.f105810a;
                            r0Var3.f105810a = t7 == 0 ? new IOException(str) : new IOException(str, (Throwable) t7);
                        }
                        byte[] bArr = value.f50857j;
                        bArr.getClass();
                        return bVar2.k(20000L, bArr);
                    }
                }, m.f99646l);
                bVar = bVar2;
            }
        }
        final wl2.b bVar3 = bVar;
        FluentFuture<Boolean> fluentFuture2 = r0Var.f105810a;
        final m mVar2 = this.f99675d;
        r0Var.f105810a = fluentFuture2.transform(new Function() { // from class: jn2.r
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                wl2.b bVar4 = bVar3;
                m mVar3 = mVar2;
                Boolean bool = (Boolean) obj;
                bVar4.e();
                synchronized (mVar3.f99656j) {
                    mVar3.f99650d.debug("deleteProviderMetadata: invalidating cached deviceCards list");
                    mVar3.f99657k = null;
                    Unit unit = Unit.INSTANCE;
                }
                return bool;
            }
        }, m.f99646l);
    }
}
