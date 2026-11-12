package androidx.lifecycle;

import android.content.Context;
import defpackage.iad;
import defpackage.kg1;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\b0\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Liad;", "Landroidx/lifecycle/LifecycleOwner;", "Landroid/content/Context;", "context", "create", "(Landroid/content/Context;)Landroidx/lifecycle/LifecycleOwner;", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0})
public final class ProcessLifecycleInitializer implements iad<LifecycleOwner> {
    @Override // defpackage.iad
    @NotNull
    public List<Class<? extends iad<?>>> dependencies() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.iad
    @NotNull
    public LifecycleOwner create(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        kg1 kg1VarE = kg1.e(context);
        Intrinsics.checkNotNullExpressionValue(kg1VarE, "getInstance(context)");
        if (!kg1VarE.g(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
        }
        LifecycleDispatcher.init(context);
        ProcessLifecycleOwner.Companion companion = ProcessLifecycleOwner.INSTANCE;
        companion.init$lifecycle_process_release(context);
        return companion.get();
    }
}
