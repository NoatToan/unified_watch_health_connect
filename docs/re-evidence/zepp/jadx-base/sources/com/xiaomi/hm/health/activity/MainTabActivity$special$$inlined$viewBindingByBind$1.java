package com.xiaomi.hm.health.activity;

import android.app.Activity;
import androidx.exifinterface.media.ExifInterface;
import com.huami.viewbindingx.BindViewBinder;
import com.xiaomi.hm.health.databinding.ActivityMainTabBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0007\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/app/Activity;", "p1", "invoke", "(Landroid/app/Activity;)Landroidx/viewbinding/ViewBinding;", "com/huami/viewbindingx/activity/ActivityInflateBindingsKt$viewBindingByBind$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
public final /* synthetic */ class MainTabActivity$special$$inlined$viewBindingByBind$1 extends FunctionReferenceImpl implements Function1<Activity, ActivityMainTabBinding> {
    public MainTabActivity$special$$inlined$viewBindingByBind$1(BindViewBinder bindViewBinder) {
        super(1, bindViewBinder, BindViewBinder.class, "bindA", "bindA(Landroid/app/Activity;)Landroidx/viewbinding/ViewBinding;", 0);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.viewbinding.ViewBinding, com.xiaomi.hm.health.databinding.ActivityMainTabBinding] */
    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final ActivityMainTabBinding invoke(@NotNull Activity activity) {
        return ((BindViewBinder) this.receiver).bindA(activity);
    }
}
