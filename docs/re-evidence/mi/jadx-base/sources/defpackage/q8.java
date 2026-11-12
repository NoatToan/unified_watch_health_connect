package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lq8;", "", "", "type", "", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class q8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final q8 f31209a = new q8();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f31210b;

    @NotNull
    public static rh c;

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"q8$a", "Lrh;", "", "type", "", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements rh {
        @Override // defpackage.rh
        public void a(int type) {
            t5t.d("MenstruationDataParser", "Default display setting callback: " + type);
        }
    }

    static {
        a aVar = new a();
        f31210b = aVar;
        c = aVar;
    }

    public final void a(int type) {
        c.a(type);
    }
}
