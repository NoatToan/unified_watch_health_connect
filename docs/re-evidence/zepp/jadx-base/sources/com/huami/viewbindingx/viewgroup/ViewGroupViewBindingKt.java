package com.huami.viewbindingx.viewgroup;

import android.view.ViewGroup;
import androidx.exifinterface.media.ExifInterface;
import androidx.viewbinding.ViewBinding;
import com.huami.viewbindingx.BindViewBinder;
import com.huami.viewbindingx.ViewBindingProperty;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\u0086\b\u001a.\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¨\u0006\u0007"}, d2 = {"Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/view/ViewGroup;", "Lcom/huami/viewbindingx/ViewBindingProperty;", "viewBinding", "Ljava/lang/Class;", "viewBindingClass", "viewbindingx_release"}, k = 2, mv = {1, 4, 1})
public final class ViewGroupViewBindingKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/view/ViewGroup;", "it", "invoke", "(Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class a<T> extends Lambda implements Function1<ViewGroup, T> {
        public final /* synthetic */ Class a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class cls) {
            super(1);
            this.a = cls;
        }

        /* JADX WARN: Incorrect return type in method signature: (Landroid/view/ViewGroup;)TT; */
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final ViewBinding invoke(@NotNull ViewGroup viewGroup) {
            return new BindViewBinder(this.a).bindView(viewGroup);
        }
    }

    public static final /* synthetic */ <T extends ViewBinding> ViewBindingProperty<ViewGroup, T> viewBinding(ViewGroup viewGroup) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return viewBinding(viewGroup, ViewBinding.class);
    }

    @NotNull
    public static final <T extends ViewBinding> ViewBindingProperty<ViewGroup, T> viewBinding(@NotNull ViewGroup viewGroup, @NotNull Class<T> cls) {
        return new ViewBindingProperty<>(new a(cls));
    }
}
