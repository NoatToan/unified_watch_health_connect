package com.xiaomi.process;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\r\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0005J\u0017\u0010\u0006\u001a\u00028\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/process/DataShareFactory;", "T", "Landroid/os/IInterface;", "", "createInstance", "()Landroid/os/IInterface;", "createProxy", "binder", "Landroid/os/IBinder;", "(Landroid/os/IBinder;)Landroid/os/IInterface;", "smarthome-utils_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface DataShareFactory<T extends IInterface> {
    @NotNull
    T createInstance();

    @NotNull
    T createProxy(@Nullable IBinder binder);
}
