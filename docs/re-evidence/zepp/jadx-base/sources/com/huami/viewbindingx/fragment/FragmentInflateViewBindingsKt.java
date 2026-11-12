package com.huami.viewbindingx.fragment;

import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBinding;
import com.huami.viewbindingx.BindViewBinder;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\u0086\b\u001a!\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\u0086\b¨\u0006\u0006"}, d2 = {"Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "Landroidx/fragment/app/Fragment;", "viewBinding", "viewBindingByBind", "viewbindingx_release"}, k = 2, mv = {1, 4, 1})
public final class FragmentInflateViewBindingsKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.huami.viewbindingx.fragment.FragmentInflateViewBindingsKt$viewBinding$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/fragment/app/Fragment;", "p1", "invoke", "(Landroidx/fragment/app/Fragment;)Landroidx/viewbinding/ViewBinding;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final /* synthetic */ class AnonymousClass1<T> extends FunctionReferenceImpl implements Function1<Fragment, T> {
        public AnonymousClass1(InflateViewBinder inflateViewBinder) {
            super(1, inflateViewBinder, InflateViewBinder.class, "inflateF", "inflateF(Landroidx/fragment/app/Fragment;)Landroidx/viewbinding/ViewBinding;", 0);
        }

        /* JADX WARN: Incorrect return type in method signature: (Landroidx/fragment/app/Fragment;)TT; */
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final ViewBinding invoke(@NotNull Fragment fragment) {
            return ((InflateViewBinder) this.receiver).inflateF(fragment);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.huami.viewbindingx.fragment.FragmentInflateViewBindingsKt$viewBindingByBind$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/fragment/app/Fragment;", "p1", "invoke", "(Landroidx/fragment/app/Fragment;)Landroidx/viewbinding/ViewBinding;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final /* synthetic */ class C15611<T> extends FunctionReferenceImpl implements Function1<Fragment, T> {
        public C15611(BindViewBinder bindViewBinder) {
            super(1, bindViewBinder, BindViewBinder.class, "bind", "bind(Landroidx/fragment/app/Fragment;)Landroidx/viewbinding/ViewBinding;", 0);
        }

        /* JADX WARN: Incorrect return type in method signature: (Landroidx/fragment/app/Fragment;)TT; */
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final ViewBinding invoke(@NotNull Fragment fragment) {
            return ((BindViewBinder) this.receiver).bind(fragment);
        }
    }

    public static final /* synthetic */ <T extends ViewBinding> LifeViewBindingProperty<Fragment, T> viewBinding() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return FragmentViewBindingKt.viewBinding(new AnonymousClass1(new InflateViewBinder(ViewBinding.class)));
    }

    public static final /* synthetic */ <T extends ViewBinding> LifeViewBindingProperty<Fragment, T> viewBindingByBind() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return FragmentViewBindingKt.viewBinding(new C15611(new BindViewBinder(ViewBinding.class)));
    }
}
