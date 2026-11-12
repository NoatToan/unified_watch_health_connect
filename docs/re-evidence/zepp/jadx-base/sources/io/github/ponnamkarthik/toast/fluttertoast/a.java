package io.github.ponnamkarthik.toast.fluttertoast;

import android.widget.Toast;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 0})
final /* synthetic */ class a extends MutablePropertyReference0 {
    public a(MethodCallHandlerImpl methodCallHandlerImpl) {
        super(methodCallHandlerImpl);
    }

    @Override // kotlin.reflect.KProperty0
    @Nullable
    public Object get() {
        return ((MethodCallHandlerImpl) this.receiver).mToast;
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public String getName() {
        return "mToast";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(MethodCallHandlerImpl.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public String getSignature() {
        return "getMToast()Landroid/widget/Toast;";
    }

    @Override // kotlin.reflect.KMutableProperty0
    public void set(@Nullable Object obj) {
        ((MethodCallHandlerImpl) this.receiver).mToast = (Toast) obj;
    }
}
