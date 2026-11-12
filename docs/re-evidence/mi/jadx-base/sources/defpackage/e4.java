package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Le4;", "", "Lcom/huami/bluetooth/profile/channel/module/a;", "T", "Ljava/lang/Class;", "clazz", PluginDeviceInfo.FMODEL, "(Ljava/lang/Class;)Lcom/huami/bluetooth/profile/channel/module/a;", "Lr3;", "api", "<init>", "(Lr3;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class e4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f16238b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final r3 f16239a;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le4$a;", "", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public e4(@NotNull r3 api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.f16239a = api;
    }

    @NotNull
    public final <T extends com.huami.bluetooth.profile.channel.module.a> T a(@NotNull Class<T> clazz) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        T tNewInstance = clazz.getConstructor(r3.class).newInstance(this.f16239a);
        T t = tNewInstance;
        t.init();
        Intrinsics.checkNotNullExpressionValue(tNewInstance, "clazz.getConstructor(Cha…e(api).also { it.init() }");
        return t;
    }
}
