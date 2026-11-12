package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lo5;", "", "", PluginDeviceInfo.FICONOFFLINE, PluginDeviceInfo.FICONOFF, "", "firmwareIndex", "I", PluginDeviceInfo.FDESC, "()I", "firmwareCount", PluginDeviceInfo.FMODEL, "", "firmwareTotalSize", "J", PluginDeviceInfo.FICONON, "()J", "<init>", "(IIJ)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class o5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28740b;
    public final long c;

    public o5() {
        this(0, 0, 0L, 7, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF28740b() {
        return this.f28740b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getF28739a() {
        return this.f28739a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getC() {
        return this.c;
    }

    public final boolean d() {
        return this.f28739a == 0;
    }

    public final boolean e() {
        return this.f28739a == this.f28740b - 1;
    }

    public o5(int i, int i2, long j) {
        this.f28739a = i;
        this.f28740b = i2;
        this.c = j;
    }

    public /* synthetic */ o5(int i, int i2, long j, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? -1L : j);
    }
}
