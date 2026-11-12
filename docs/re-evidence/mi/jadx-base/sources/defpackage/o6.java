package defpackage;

import com.xiaomi.onetrack.api.b;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lo6;", "Lqq;", "Lnl;", "request", "", b.I, "", "predict", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class o6 implements qq {

    @NotNull
    public static final o6 t = new o6();

    @Override // defpackage.qq
    public boolean predict(@NotNull nl request, @NotNull byte[] response) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.length <= 2 || ArraysKt___ArraysKt.first(response) != 16) {
            return false;
        }
        Integer numA = r0.a(response);
        return numA != null && numA.intValue() == ArraysKt___ArraysKt.first(request.a());
    }
}
