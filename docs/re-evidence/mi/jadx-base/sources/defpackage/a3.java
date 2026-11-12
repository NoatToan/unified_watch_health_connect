package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000b"}, d2 = {"La3;", "", "", MediaStoreUtil.MediaInfo.SIZE, PluginDeviceInfo.FDESC, PluginDeviceInfo.FMODEL, "", "", "byteArray", "<init>", "([B)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class a3 {

    @NotNull
    public static final a c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final byte[] f561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f562b;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"La3$a;", "", "", "BITS", "I", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public a3(@NotNull byte[] byteArray) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        this.f561a = byteArray;
    }

    public final int a() {
        return b(1);
    }

    public final int b(int size) {
        a(size);
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            byte[] bArr = this.f561a;
            int i3 = this.f562b;
            this.f562b = i3 + 1;
            i |= (bArr[i3] & 255) << (i2 * 8);
        }
        return i;
    }

    public final void a(int size) {
        if (this.f562b + size > this.f561a.length) {
            throw new IndexOutOfBoundsException("No enough bytes remain");
        }
    }

    public final int b() {
        return b(2);
    }
}
