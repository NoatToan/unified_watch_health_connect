package com.huami.account.userinfo.ui;

import android.app.Activity;
import androidx.exifinterface.media.ExifInterface;
import com.huami.account.userinfo.databinding.UserInfoActivityNewUserGuideBinding;
import com.huami.viewbindingx.InflateViewBinder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0007\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/app/Activity;", "p1", "invoke", "(Landroid/app/Activity;)Landroidx/viewbinding/ViewBinding;", "com/huami/viewbindingx/activity/ActivityInflateBindingsKt$viewBinding$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
public final /* synthetic */ class NewUserGuideActivity$special$$inlined$viewBinding$1 extends FunctionReferenceImpl implements Function1<Activity, UserInfoActivityNewUserGuideBinding> {
    public NewUserGuideActivity$special$$inlined$viewBinding$1(InflateViewBinder inflateViewBinder) {
        super(1, inflateViewBinder, InflateViewBinder.class, "inflate", "inflate(Landroid/app/Activity;)Landroidx/viewbinding/ViewBinding;", 0);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.viewbinding.ViewBinding, com.huami.account.userinfo.databinding.UserInfoActivityNewUserGuideBinding] */
    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final UserInfoActivityNewUserGuideBinding invoke(@NotNull Activity activity) {
        return ((InflateViewBinder) this.receiver).inflate(activity);
    }
}
