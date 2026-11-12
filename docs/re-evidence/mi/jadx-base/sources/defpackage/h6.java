package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lh6;", "", "", "Lg6;", PluginDeviceInfo.FMODEL, "()Ljava/util/List;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class h6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h6 f19730a = new h6();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Map<String, g6> f19731b = new LinkedHashMap();

    @NotNull
    public final List<g6> a() {
        return CollectionsKt___CollectionsKt.toList(f19731b.values());
    }
}
