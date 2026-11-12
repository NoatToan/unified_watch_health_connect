package kotlin.reflect;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface KDeclarationContainer {
    @NotNull
    Collection<KCallable<?>> getMembers();
}
