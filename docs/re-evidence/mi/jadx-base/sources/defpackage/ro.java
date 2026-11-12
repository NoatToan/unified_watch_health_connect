package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\b¨\u0006\u000b"}, d2 = {"Lro;", "Loq;", "", "", "Lol;", "originResponse", PluginDeviceInfo.FMODEL, "value", "([B)Ljava/lang/Integer;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class ro implements oq<Integer, byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f32735a = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lro$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.oq
    @NotNull
    public ol<Integer> a(@NotNull ol<byte[]> originResponse) {
        Intrinsics.checkNotNullParameter(originResponse, "originResponse");
        return C3622pq.a(this, originResponse);
    }

    @Override // defpackage.u4
    public /* bridge */ /* synthetic */ Object encode(Object obj) {
        return a(((Number) obj).intValue());
    }

    @NotNull
    public byte[] a(int value) {
        throw new NotImplementedError("An operation is not implemented: 不编码");
    }

    @Override // defpackage.u4
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer decode(@NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        w2 w2Var = new w2(value, 0, 2, null);
        w2Var.c();
        return Integer.valueOf(w2Var.c());
    }
}
