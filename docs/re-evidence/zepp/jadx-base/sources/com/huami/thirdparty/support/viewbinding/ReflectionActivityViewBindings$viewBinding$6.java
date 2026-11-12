package com.huami.thirdparty.support.viewbinding;

import android.view.View;
import androidx.core.app.ComponentActivity;
import androidx.exifinterface.media.ExifInterface;
import androidx.viewbinding.ViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [A, T] */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00028\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n"}, d2 = {"Landroidx/core/app/ComponentActivity;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "activity", "<anonymous>"}, k = 3, mv = {1, 5, 1})
public final class ReflectionActivityViewBindings$viewBinding$6<A, T> extends Lambda implements Function1<A, T> {
    public final /* synthetic */ Function1<View, T> a;
    public final /* synthetic */ Function1<A, View> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReflectionActivityViewBindings$viewBinding$6(Function1<? super View, ? extends T> function1, Function1<? super A, ? extends View> function2) {
        super(1);
        this.a = function1;
        this.b = function2;
    }

    /* JADX WARN: Incorrect return type in method signature: (TA;)TT; */
    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final ViewBinding invoke(@NotNull ComponentActivity componentActivity) {
        return (ViewBinding) this.a.invoke(this.b.invoke(componentActivity));
    }
}
