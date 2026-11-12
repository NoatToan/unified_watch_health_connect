package defpackage;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import org.koin.core.context.GlobalContext;

/* JADX INFO: loaded from: classes24.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0000¨\u0006\u0002"}, d2 = {"", "isMifitApp", "step_release"}, k = 2, mv = {1, 5, 1})
public final class UtilsKt {
    public static final boolean isMifitApp() {
        return ((Context) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(Context.class), null, null)).getPackageName().equals("com.xiaomi.hm.health");
    }
}
