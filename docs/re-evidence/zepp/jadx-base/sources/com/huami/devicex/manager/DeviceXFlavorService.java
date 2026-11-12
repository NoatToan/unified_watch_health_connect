package com.huami.devicex.manager;

import com.xiaomi.hm.health.baseutil.GlobalConfig;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001d\u0010\u0007\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/devicex/manager/DeviceXFlavorService;", "Lcom/huami/devicex/manager/FlavorService;", "Lcom/huami/devicex/manager/Flavor;", "findFlavor", "a", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/Flavor;", "info", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceXFlavorService implements FlavorService {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy info = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/devicex/manager/Flavor;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Flavor> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Flavor invoke() {
            return !GlobalConfig.get().isBuildMidong() ? new Flavor(2, "MiFit") : new Flavor(1, "Zepp");
        }
    }

    private final Flavor a() {
        return (Flavor) this.info.getValue();
    }

    @Override // com.huami.devicex.manager.FlavorService
    @NotNull
    public Flavor findFlavor() {
        return a();
    }
}
