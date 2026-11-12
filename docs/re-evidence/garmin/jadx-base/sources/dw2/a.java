package dw2;

import android.content.Context;
import cx2.h;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldw2/a;", "", "<init>", "()V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f61447a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f61448b = new h("RTSAccessibilityUtils", null, 2, null);

    private a() {
    }

    public static final float a(Context context, float f14, float f15) {
        float f16 = context.getResources().getConfiguration().fontScale;
        if (f16 <= 1.0f) {
            return f14;
        }
        return f16 <= f15 ? f14 * f16 : f14 * f15;
    }

    public static final boolean b(Context context) {
        return context.getResources().getConfiguration().fontScale > 1.0f;
    }
}
