package com.huami.viewbindingx.activity;

import android.app.Activity;
import androidx.core.app.ComponentActivity;
import androidx.exifinterface.media.ExifInterface;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\u0086\b\u001a!\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\u0086\b¨\u0006\u0006"}, d2 = {"Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "Landroidx/core/app/ComponentActivity;", "viewBinding", "viewBindingByBind", "viewbindingx_release"}, k = 2, mv = {1, 4, 1})
public final class ActivityInflateBindingsKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.huami.viewbindingx.activity.ActivityInflateBindingsKt$viewBinding$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/app/Activity;", "p1", "invoke", "(Landroid/app/Activity;)Landroidx/viewbinding/ViewBinding;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final /* synthetic */ class AnonymousClass1<T> extends FunctionReferenceImpl implements Function1<Activity, T> {
        public AnonymousClass1(InflateViewBinder inflateViewBinder) {
            super(1, inflateViewBinder, InflateViewBinder.class, "inflate", "inflate(Landroid/app/Activity;)Landroidx/viewbinding/ViewBinding;", 0);
        }

        /* JADX WARN: Incorrect return type in method signature: (Landroid/app/Activity;)TT; */
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final ViewBinding invoke(@NotNull Activity activity) {
            return ((InflateViewBinder) this.receiver).inflate(activity);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.huami.viewbindingx.activity.ActivityInflateBindingsKt$viewBindingByBind$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/app/Activity;", "p1", "invoke", "(Landroid/app/Activity;)Landroidx/viewbinding/ViewBinding;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final /* synthetic */ class C15601<T> extends FunctionReferenceImpl implements Function1<Activity, T> {
        public C15601(BindViewBinder bindViewBinder) {
            super(1, bindViewBinder, BindViewBinder.class, "bindA", "bindA(Landroid/app/Activity;)Landroidx/viewbinding/ViewBinding;", 0);
        }

        /* JADX WARN: Incorrect return type in method signature: (Landroid/app/Activity;)TT; */
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final ViewBinding invoke(@NotNull Activity activity) {
            return ((BindViewBinder) this.receiver).bindA(activity);
        }
    }

    public static final /* synthetic */ <T extends ViewBinding> LifeViewBindingProperty<ComponentActivity, T> viewBinding() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return ActivityViewBindingsKt.viewBinding(new AnonymousClass1(new InflateViewBinder(ViewBinding.class)));
    }

    public static final /* synthetic */ <T extends ViewBinding> LifeViewBindingProperty<ComponentActivity, T> viewBindingByBind() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return ActivityViewBindingsKt.viewBinding(new C15601(new BindViewBinder(ViewBinding.class)));
    }
}
