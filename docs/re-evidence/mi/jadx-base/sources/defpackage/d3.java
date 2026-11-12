package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u0005J\u0010\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u0005J\u0010\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u0005J\u0010\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u0005J\u0006\u0010\u0004\u001a\u00020\tJ\u001c\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005H\u0002J\u001c\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005H\u0002J\u001a\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0005H\u0002¨\u0006\u000f"}, d2 = {"Ld3;", "", "", "defaultValue", PluginDeviceInfo.FMODEL, "", PluginDeviceInfo.FICONOFF, PluginDeviceInfo.FICONON, PluginDeviceInfo.FDESC, "", MediaStoreUtil.MediaInfo.SIZE, "", "bytes", "<init>", "([B)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final byte[] f15020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile int f15021b;

    public d3(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f15020a = bytes;
    }

    public static /* synthetic */ int c(d3 d3Var, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return d3Var.c(i);
    }

    public static /* synthetic */ int d(d3 d3Var, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return d3Var.d(i);
    }

    public final int a(int defaultValue, int size) {
        if (this.f15020a.length - this.f15021b < size) {
            this.f15021b += size;
            return defaultValue;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i |= (this.f15020a[this.f15021b] & 255) << (i2 * 8);
            this.f15021b++;
        }
        return i;
    }

    public final int b(int defaultValue, int size) {
        if (this.f15020a.length - this.f15021b < size) {
            this.f15021b += size;
            return defaultValue;
        }
        int i = 0;
        int i2 = 0;
        while (i < size) {
            i2 |= (i == size + (-1) ? this.f15020a[this.f15021b] : this.f15020a[this.f15021b] & 255) << (i * 8);
            this.f15021b++;
            i++;
        }
        return i2;
    }

    public final int c(int defaultValue) {
        return a(defaultValue, 2);
    }

    public final int d(int defaultValue) {
        return a(defaultValue, 1);
    }

    public final long a(long defaultValue, int size) {
        if (this.f15020a.length - this.f15021b < size) {
            this.f15021b += size;
            return defaultValue;
        }
        long j = 0;
        for (int i = 0; i < size; i++) {
            j |= (((long) this.f15020a[this.f15021b]) & 255) << (i * 8);
            this.f15021b++;
        }
        return j;
    }

    public static /* synthetic */ int b(d3 d3Var, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return d3Var.b(i);
    }

    public final int b(int defaultValue) {
        return b(defaultValue, 2);
    }

    public static /* synthetic */ long a(d3 d3Var, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        return d3Var.a(j);
    }

    public final long a(long defaultValue) {
        return a(defaultValue, 4);
    }

    public static /* synthetic */ int a(d3 d3Var, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return d3Var.a(i);
    }

    public final int a(int defaultValue) {
        return a(defaultValue, 4);
    }

    public final float a() {
        return Float.intBitsToFloat(a(this, 0, 1, (Object) null));
    }
}
