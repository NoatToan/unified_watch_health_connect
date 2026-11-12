package com.huami.android.mipay.h5;

import android.app.Activity;
import android.content.Intent;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J)\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/huami/android/mipay/h5/MipayH5;", "", "Landroid/app/Activity;", "activity", "", "payUrl", "returnUrl", "Lcom/huami/android/mipay/h5/MiPayH5Response;", "pay", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "", "handle$mipay_h5_release", "(IILandroid/content/Intent;)V", "handle", "Ljava/lang/Object;", "a", "Ljava/lang/Object;", "lock", "b", "Lcom/huami/android/mipay/h5/MiPayH5Response;", AbstractJSONTokenResponse.RESPONSE, "<init>", "()V", "mipay-h5_release"}, k = 1, mv = {1, 4, 0})
public final class MipayH5 {
    public static final MipayH5 INSTANCE = new MipayH5();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final Object lock = new Object();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static MiPayH5Response response = MiPayH5Response.INSTANCE.unknown();

    private MipayH5() {
    }

    @JvmStatic
    public static final void handle$mipay_h5_release(int requestCode, int resultCode, @Nullable Intent data) {
        Object obj = lock;
        synchronized (obj) {
            if (requestCode == 1810) {
                response = new MiPayH5Response(resultCode, "");
                try {
                    obj.notify();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                Unit unit = Unit.INSTANCE;
            } else {
                obj.notify();
                Unit unit2 = Unit.INSTANCE;
            }
            throw th;
        }
    }

    @JvmStatic
    @NotNull
    public static final MiPayH5Response pay(@NotNull Activity activity, @NotNull String payUrl, @NotNull String returnUrl) {
        MiPayH5Response miPayH5Response;
        Object obj = lock;
        synchronized (obj) {
            activity.getFragmentManager().beginTransaction().replace(android.R.id.content, PayH5Fragment.Companion.newInstance(payUrl, returnUrl)).commit();
            try {
                obj.wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
            miPayH5Response = response;
        }
        return miPayH5Response;
    }
}
