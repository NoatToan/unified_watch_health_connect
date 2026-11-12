package com.xiaomi.fitness.devicesettings.common.extensions;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fitness.baseui.common.CommonBaseActivity;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordListActivity;
import com.xiaomi.fitness.devicesettings.bluttooth.connectnewphone.ConnectNewPhoneActivity;
import defpackage.dih;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u001a \u0010\u0007\u001a\u00020\u0001*\u00020\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00042\b\b\u0002\u0010\b\u001a\u00020\t\u001a \u0010\n\u001a\u00020\u0001*\u00020\u000b2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u001a\n\u0010\f\u001a\u00020\u0001*\u00020\u0002¨\u0006\r"}, d2 = {"gotoPage", "", "Landroid/content/Context;", "targetClazz", "Ljava/lang/Class;", SdkContants.KEY_BUNDLE, "Landroid/os/Bundle;", "gotoConnectNewPhone", "fromMain", "", "gotoPageByReplace", "Landroidx/fragment/app/FragmentActivity;", "gotoAudioRecordPage", "device-settings_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ContextExtKt {

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.extensions.ContextExtKt$gotoPageByReplace$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function0<String> {
        public AnonymousClass1(Object obj) {
            super(0, obj, FragmentActivity.class, "getLocalClassName", "getLocalClassName()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return ((FragmentActivity) this.receiver).getLocalClassName();
        }
    }

    public static final void gotoAudioRecordPage(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intent intent = new Intent();
        intent.setClass(context, AudioRecordListActivity.class);
        context.startActivity(intent);
    }

    public static final void gotoConnectNewPhone(@NotNull Context context, @NotNull Class<?> targetClazz, boolean z) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(targetClazz, "targetClazz");
        Intent intent = new Intent();
        intent.setClass(context, ConnectNewPhoneActivity.class);
        intent.putExtra("fragment_param", (Parcelable) new FragmentParams.b().e(targetClazz).b());
        intent.putExtra("fromMain", z);
        context.startActivity(intent);
    }

    public static /* synthetic */ void gotoConnectNewPhone$default(Context context, Class cls, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        gotoConnectNewPhone(context, cls, z);
    }

    public static final void gotoPage(@NotNull Context context, @NotNull Class<?> targetClazz, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(targetClazz, "targetClazz");
        dih.a().e(context, new FragmentParams.b().e(targetClazz).c(bundle).b());
    }

    public static /* synthetic */ void gotoPage$default(Context context, Class cls, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        gotoPage(context, cls, bundle);
    }

    public static final void gotoPageByReplace(@NotNull FragmentActivity fragmentActivity, @NotNull Class<?> targetClazz, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        Intrinsics.checkNotNullParameter(targetClazz, "targetClazz");
        if (fragmentActivity instanceof CommonBaseActivity) {
            FragmentParams fragmentParamsB = new FragmentParams.b().e(targetClazz).c(bundle).a(true).b();
            Intrinsics.checkNotNullExpressionValue(fragmentParamsB, "build(...)");
            ((CommonBaseActivity) fragmentActivity).rePlaceFragment(fragmentParamsB);
        } else {
            Logger.e("gotoPageByReplace error:current activity is not CommonBaseActivity! " + new AnonymousClass1(fragmentActivity), new Object[0]);
            ToastExtKt.toastShort(fragmentActivity, "not support");
        }
    }
}
