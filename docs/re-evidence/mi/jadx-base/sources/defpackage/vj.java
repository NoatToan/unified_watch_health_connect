package defpackage;

import android.content.Context;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\tJ\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\t¨\u0006\u000b"}, d2 = {"Lvj;", "", "Landroid/content/Context;", "context", "Ln1t;", "device", "", PluginDeviceInfo.FMODEL, "(Landroid/content/Context;Ln1t;)V", "()V", "<init>", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final class vj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<uj> f36938a = new ArrayList();

    public final void a(@NotNull Context context, @NotNull n1t device) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(device, "device");
        t5t.d("LFEventAdapterManager", "start adapter LFE event");
        a();
        this.f36938a.add(new rs(device));
        this.f36938a.add(new en(context, device));
        this.f36938a.add(new ab(device));
        this.f36938a.add(new vl(device));
        this.f36938a.add(new jt(device));
        this.f36938a.add(new r(device));
        this.f36938a.add(new n9(device));
        Iterator<T> it = this.f36938a.iterator();
        while (it.hasNext()) {
            ((uj) it.next()).b();
        }
    }

    public final void a() {
        Iterator<T> it = this.f36938a.iterator();
        while (it.hasNext()) {
            ((uj) it.next()).a();
        }
        this.f36938a.clear();
    }
}
