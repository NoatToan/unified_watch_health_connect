package com.huami.femalehealth.uilib.koin;

import android.content.ComponentCallbacks;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.ViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "org/koin/androidx/viewmodel/ext/android/ComponentCallbackExtKt$viewModel$2", "<anonymous>"}, k = 3, mv = {1, 5, 1})
public final class ComponentCallbackExtKt$injectViewModelInFH$$inlined$viewModel$1<T> extends Lambda implements Function0<T> {
    public final /* synthetic */ ComponentCallbacks a;
    public final /* synthetic */ Qualifier b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComponentCallbackExtKt$injectViewModelInFH$$inlined$viewModel$1(ComponentCallbacks componentCallbacks, Qualifier qualifier, Function0 function0, Function0 function1) {
        super(0);
        this.a = componentCallbacks;
        this.b = qualifier;
        this.c = function0;
        this.d = function1;
    }

    /* JADX WARN: Incorrect return type in method signature: ()TT; */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final ViewModel invoke() {
        ComponentCallbacks componentCallbacks = this.a;
        Qualifier qualifier = this.b;
        Function0 function0 = this.c;
        Function0 function1 = this.d;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt.getViewModel(componentCallbacks, qualifier, Reflection.getOrCreateKotlinClass(ViewModel.class), function0, function1);
    }
}
