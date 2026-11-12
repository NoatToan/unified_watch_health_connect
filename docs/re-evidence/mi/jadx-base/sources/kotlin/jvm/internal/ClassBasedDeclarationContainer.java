package kotlin.jvm.internal;

import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface ClassBasedDeclarationContainer extends KDeclarationContainer {
    @NotNull
    Class<?> getJClass();
}
