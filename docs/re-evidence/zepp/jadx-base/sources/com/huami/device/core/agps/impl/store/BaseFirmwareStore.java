package com.huami.device.core.agps.impl.store;

import com.huami.device.core.agps.AgpsUpgradeBuilder;
import com.huami.device.core.agps.impl.upgrade.AGPSFirmwareStore;
import java.io.File;
import java.util.Calendar;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0016R\u001d\u0010\t\u001a\u00020\u00028D@\u0004X\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/device/core/agps/impl/store/BaseFirmwareStore;", "Lcom/huami/device/core/agps/impl/upgrade/AGPSFirmwareStore;", "", "b", "a", "getTempDir", "Lkotlin/Lazy;", "getTempPath", "()Ljava/lang/String;", "tempPath", "<init>", "()V", "agps-impl_release"}, k = 1, mv = {1, 4, 0})
public abstract class BaseFirmwareStore implements AGPSFirmwareStore {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy tempPath = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return BaseFirmwareStore.this.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append(AgpsUpgradeBuilder.INSTANCE.getContext$agps_impl_release().getFilesDir().getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append("agps");
        sb.append(str);
        sb.append(b());
        sb.append(str);
        return sb.toString();
    }

    private final String b() {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(12);
        int i2 = calendar.get(13);
        int i3 = calendar.get(11);
        int i4 = calendar.get(6);
        StringBuilder sb = new StringBuilder();
        sb.append(calendar.get(1));
        sb.append('-');
        sb.append(i4);
        sb.append('-');
        sb.append(i3);
        sb.append('-');
        sb.append(i);
        sb.append('-');
        sb.append(i2);
        return sb.toString();
    }

    @Override // com.huami.device.core.agps.impl.upgrade.AGPSFirmwareStore
    @NotNull
    public String getTempDir() {
        return getTempPath();
    }

    @NotNull
    public final String getTempPath() {
        return (String) this.tempPath.getValue();
    }
}
