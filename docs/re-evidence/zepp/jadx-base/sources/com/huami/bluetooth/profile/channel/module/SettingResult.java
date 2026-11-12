package com.huami.bluetooth.profile.channel.module;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0004\u001a\u00020\u0003HÆ\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J,\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\b\u001a\u0004\u0018\u00018\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0006¨\u0006\u001a"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/SettingResult;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "component1", "component2", "()Ljava/lang/Object;", "success", "t", "copy", "(ZLjava/lang/Object;)Lcom/huami/bluetooth/profile/channel/module/SettingResult;", "", "toString", "", "hashCode", "other", "equals", "a", "Z", "getSuccess", "()Z", "b", "Ljava/lang/Object;", "getT", "<init>", "(ZLjava/lang/Object;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SettingResult<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean success;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final T t;

    public SettingResult(boolean z, @Nullable T t) {
        this.success = z;
        this.t = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SettingResult copy$default(SettingResult settingResult, boolean z, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = settingResult.success;
        }
        if ((i & 2) != 0) {
            obj = settingResult.t;
        }
        return settingResult.copy(z, obj);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @Nullable
    public final T component2() {
        return this.t;
    }

    @NotNull
    public final SettingResult<T> copy(boolean success, @Nullable T t) {
        return new SettingResult<>(success, t);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SettingResult)) {
            return false;
        }
        SettingResult settingResult = (SettingResult) other;
        return this.success == settingResult.success && Intrinsics.areEqual(this.t, settingResult.t);
    }

    public final boolean getSuccess() {
        return this.success;
    }

    @Nullable
    public final T getT() {
        return this.t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.success;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        T t = this.t;
        return i + (t == null ? 0 : t.hashCode());
    }

    @NotNull
    public String toString() {
        return "SettingResult(success=" + this.success + ", t=" + this.t + ')';
    }

    public /* synthetic */ SettingResult(boolean z, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : obj);
    }
}
