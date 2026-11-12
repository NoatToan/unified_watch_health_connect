package androidx.navigation.fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavArgsLazy;
import defpackage.dig;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ldig;", "Args", "Landroidx/fragment/app/Fragment;", "Landroidx/navigation/NavArgsLazy;", "navArgs", "(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavArgsLazy;", "navigation-fragment-ktx_release"}, k = 2, mv = {1, 4, 0})
public final class FragmentNavArgsLazyKt {
    @NotNull
    public static final /* synthetic */ <Args extends dig> NavArgsLazy<Args> navArgs(@NotNull final Fragment fragment) {
        Intrinsics.reifiedOperationMarker(4, "Args");
        return new NavArgsLazy<>(Reflection.getOrCreateKotlinClass(dig.class), new Function0<Bundle>() { // from class: androidx.navigation.fragment.FragmentNavArgsLazyKt.navArgs.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Bundle invoke() {
                Bundle arguments = fragment.getArguments();
                if (arguments != null) {
                    return arguments;
                }
                throw new IllegalStateException("Fragment " + fragment + " has null arguments");
            }
        });
    }
}
