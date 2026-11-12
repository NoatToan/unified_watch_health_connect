package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\u000b"}, d2 = {"Lr2;", "", "", "cmd", "I", PluginDeviceInfo.FMODEL, "()I", "length", PluginDeviceInfo.FDESC, "<init>", "(II)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f32096b;

    public r2(int i, int i2) {
        this.f32095a = i;
        this.f32096b = i2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF32095a() {
        return this.f32095a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getF32096b() {
        return this.f32096b;
    }

    public /* synthetic */ r2(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? 1 : i2);
    }
}
