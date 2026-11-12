package androidx.navigation.fragment;

import androidx.fragment.app.DialogFragment;
import androidx.navigation.NavDestinationBuilder;
import com.xiaomi.onetrack.OneTrack;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Landroidx/navigation/fragment/DialogFragmentNavigatorDestinationBuilder;", "Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/fragment/DialogFragmentNavigator$a;", OneTrack.Param.BUILD, "()Landroidx/navigation/fragment/DialogFragmentNavigator$a;", "Lkotlin/reflect/KClass;", "Landroidx/fragment/app/DialogFragment;", "fragmentClass", "Lkotlin/reflect/KClass;", "Landroidx/navigation/fragment/DialogFragmentNavigator;", "navigator", "", "id", "<init>", "(Landroidx/navigation/fragment/DialogFragmentNavigator;ILkotlin/reflect/KClass;)V", "navigation-fragment-ktx_release"}, k = 1, mv = {1, 4, 0})
public final class DialogFragmentNavigatorDestinationBuilder extends NavDestinationBuilder<DialogFragmentNavigator.a> {
    private final KClass<? extends DialogFragment> fragmentClass;

    public DialogFragmentNavigatorDestinationBuilder(@NotNull DialogFragmentNavigator dialogFragmentNavigator, int i, @NotNull KClass<? extends DialogFragment> kClass) {
        super(dialogFragmentNavigator, i);
        this.fragmentClass = kClass;
    }

    @Override // androidx.navigation.NavDestinationBuilder
    @NotNull
    public DialogFragmentNavigator.a build() {
        DialogFragmentNavigator.a aVar = (DialogFragmentNavigator.a) super.build();
        aVar.C(JvmClassMappingKt.getJavaClass((KClass) this.fragmentClass).getName());
        return aVar;
    }
}
