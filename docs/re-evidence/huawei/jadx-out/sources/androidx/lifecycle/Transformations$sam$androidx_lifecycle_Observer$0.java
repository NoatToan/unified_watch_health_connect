package androidx.lifecycle;

import defpackage.zcp;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class Transformations$sam$androidx_lifecycle_Observer$0 implements Observer, FunctionAdapter {
    private final /* synthetic */ Function1 function;

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        this.function.invoke(obj);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function<?> getFunctionDelegate() {
        return this.function;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
            return zcp.b(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    Transformations$sam$androidx_lifecycle_Observer$0(Function1 function1) {
        zcp.c(function1, "");
        this.function = function1;
    }
}
