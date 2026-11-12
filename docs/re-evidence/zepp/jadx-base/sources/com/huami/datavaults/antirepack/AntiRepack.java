package com.huami.datavaults.antirepack;

import androidx.annotation.Keep;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\t\u0010\u0004\u001a\u00020\u0002H\u0086 ¨\u0006\u0007"}, d2 = {"Lcom/huami/datavaults/antirepack/AntiRepack;", "", "", "method02", "method01", "<init>", "()V", "antirepack_debug"}, k = 1, mv = {1, 5, 1})
public final class AntiRepack {

    @NotNull
    public static final AntiRepack INSTANCE = new AntiRepack();

    static {
        System.loadLibrary("antirepack-lib");
    }

    private AntiRepack() {
    }

    @JvmStatic
    public static final void method02() {
        Analytics.recordEvent(new CountEventBuilder("DATA_VAULTS").addExtra("repack", "true"));
    }

    public final native void method01();
}
