package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lb4;", "", "", "toString", "Ljava/util/ArrayList;", "La4;", "channelDescriptions", "Ljava/util/ArrayList;", PluginDeviceInfo.FMODEL, "()Ljava/util/ArrayList;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class b4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ArrayList<a4> f3766a = new ArrayList<>();

    @NotNull
    public final ArrayList<a4> a() {
        return this.f3766a;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<T> it = this.f3766a.iterator();
        while (it.hasNext()) {
            sb.append((a4) it.next());
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "config.toString()");
        return string;
    }
}
