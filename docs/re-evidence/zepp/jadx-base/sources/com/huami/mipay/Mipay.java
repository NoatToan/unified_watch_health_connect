package com.huami.mipay;

import android.R;
import android.app.Activity;
import android.content.Intent;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.xiaomi.hm.health.device.event.StatEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J)\u0010\u0010\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/huami/mipay/Mipay;", "", "Landroid/app/Activity;", "activity", "", StatEvent.MINE_KINGKONG_C_ORDER_VALUE, "Lcom/huami/mipay/MiPayResponse;", "pay", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "", "handle$mipay_wrapper_release", "(IILandroid/content/Intent;)V", "handle", "Ljava/lang/Object;", "a", "Ljava/lang/Object;", "lock", "b", "Lcom/huami/mipay/MiPayResponse;", AbstractJSONTokenResponse.RESPONSE, "<init>", "()V", "mipay-wrapper_release"}, k = 1, mv = {1, 4, 0})
public final class Mipay {
    public static final Mipay INSTANCE = new Mipay();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final Object lock = new Object();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static MiPayResponse response = MiPayResponse.INSTANCE.unknown();

    private Mipay() {
    }

    @JvmStatic
    public static final void handle$mipay_wrapper_release(int requestCode, int resultCode, @Nullable Intent data) {
        MiPayResponse miPayResponse;
        Object obj = lock;
        synchronized (obj) {
            if (requestCode == 810) {
                if (resultCode == -1) {
                    if (data == null) {
                        Intrinsics.throwNpe();
                    }
                    miPayResponse = new MiPayResponse(data.getIntExtra("code", -1), data.getStringExtra("message"), data.getStringExtra("result"));
                } else {
                    miPayResponse = data != null ? new MiPayResponse(data.getIntExtra("code", -1), data.getStringExtra("message"), null) : MiPayResponse.INSTANCE.crash();
                }
                response = miPayResponse;
            }
            try {
                obj.notify();
            } catch (Exception e) {
                e.printStackTrace();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @JvmStatic
    @NotNull
    public static final MiPayResponse pay(@NotNull Activity activity, @NotNull String order) {
        MiPayResponse miPayResponse;
        Object obj = lock;
        synchronized (obj) {
            activity.getFragmentManager().beginTransaction().replace(R.id.content, PayFragment.Companion.newInstance(order)).commit();
            try {
                obj.wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
            miPayResponse = response;
        }
        return miPayResponse;
    }
}
