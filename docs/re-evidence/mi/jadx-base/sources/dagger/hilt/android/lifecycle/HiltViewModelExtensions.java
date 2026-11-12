package dagger.hilt.android.lifecycle;

import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import defpackage.dvq;
import defpackage.s7c;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@JvmName(name = "HiltViewModelExtensions")
public final class HiltViewModelExtensions {
    @NotNull
    public static final <VMF> CreationExtras addCreationCallback(@NotNull MutableCreationExtras mutableCreationExtras, @NotNull final Function1<? super VMF, ? extends dvq> callback) {
        Intrinsics.checkNotNullParameter(mutableCreationExtras, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        CreationExtras.a<Function1<Object, dvq>> CREATION_CALLBACK_KEY = s7c.d;
        Intrinsics.checkNotNullExpressionValue(CREATION_CALLBACK_KEY, "CREATION_CALLBACK_KEY");
        mutableCreationExtras.set(CREATION_CALLBACK_KEY, new Function1<Object, dvq>() { // from class: dagger.hilt.android.lifecycle.HiltViewModelExtensions$addCreationCallback$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final dvq invoke2(Object obj) {
                return callback.invoke2((VMF) obj);
            }
        });
        return mutableCreationExtras;
    }

    @NotNull
    public static final <VMF> CreationExtras withCreationCallback(@NotNull CreationExtras creationExtras, @NotNull Function1<? super VMF, ? extends dvq> callback) {
        Intrinsics.checkNotNullParameter(creationExtras, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return addCreationCallback(new MutableCreationExtras(creationExtras), callback);
    }
}
