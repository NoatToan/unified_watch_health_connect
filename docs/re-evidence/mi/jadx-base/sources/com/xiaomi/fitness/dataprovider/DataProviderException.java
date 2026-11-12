package com.xiaomi.fitness.dataprovider;

import android.os.Bundle;
import com.mibi.sdk.component.params.SdkContants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00060\u0002j\u0002`\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/dataprovider/DataProviderException;", "Lkotlin/Exception;", "Ljava/lang/Exception;", "code", "", SdkContants.KEY_BUNDLE, "Landroid/os/Bundle;", "<init>", "(ILandroid/os/Bundle;)V", "getCode", "()I", "extra", "getExtra", "()Landroid/os/Bundle;", "data-provider-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataProviderException extends Exception {

    @Nullable
    private final Bundle bundle;
    private final int code;

    public /* synthetic */ DataProviderException(int i, Bundle bundle, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : bundle);
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final Bundle getExtra() {
        Bundle bundle = this.bundle;
        return bundle == null ? new Bundle() : bundle;
    }

    public DataProviderException(int i, @Nullable Bundle bundle) {
        this.bundle = bundle;
        if (i < 0) {
            throw new RuntimeException("code must be > 0");
        }
        this.code = i;
    }
}
