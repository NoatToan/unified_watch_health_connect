package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\u0007J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0007J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\n¨\u0006\f"}, d2 = {"Lzp;", "", "Lrft;", "callback", "", PluginDeviceInfo.FMODEL, "(Lrft;)V", "()V", "", "byteArray", "([B)V", "<init>", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class zp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final zp f41531a = new zp();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final rft f41532b;

    @NotNull
    public static rft c;

    static {
        rft rftVar = new rft() { // from class: pht
            @Override // defpackage.rft
            public final void l(ycs ycsVar) {
                zp.a(ycsVar);
            }
        };
        f41532b = rftVar;
        c = rftVar;
    }

    public static final void a(ycs ycsVar) {
        t5t.d("RealtimeActivityCallbackHolder", "No IRealtimeStepCallback registered");
    }

    public final void a(@NotNull rft callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        c = callback;
    }

    public final void a() {
        c = f41532b;
    }

    public final void a(@NotNull byte[] byteArray) {
        Object objM886constructorimpl;
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        try {
            Result.Companion companion = Result.Companion;
            c.l(ycs.b(byteArray));
            objM886constructorimpl = Result.m886constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
        if (thM889exceptionOrNullimpl != null) {
            t5t.d("RealtimeActivityCallbackHolder", "Realtime step callback invoke failed " + thM889exceptionOrNullimpl);
        }
    }
}
