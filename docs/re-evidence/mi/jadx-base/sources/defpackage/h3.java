package defpackage;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.sport.IHMSportListener;
import com.xiaomi.hm.health.bt.profile.sport.SportCommand;
import com.xiaomi.hm.health.bt.profile.sport.SportConfig;
import com.xiaomi.hm.health.bt.profile.sport.SportKind;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\"\u0010\u0005\u001a\u00020\u00042\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00040\u0006J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¨\u0006\u0010"}, d2 = {"Lh3;", "", "Lcom/xiaomi/hm/health/bt/profile/sport/IHMSportListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", PluginDeviceInfo.FMODEL, "Lkotlin/Function2;", "", "Lcom/xiaomi/hm/health/bt/profile/sport/SportConfig;", "callback", "", "command", "", "bytes", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h3 f19635a = new h3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static IHMSportListener f19636b = new IHMSportListener() { // from class: oxs
        @Override // com.xiaomi.hm.health.bt.profile.sport.IHMSportListener
        public final void onSportCommand(SportCommand sportCommand) {
            h3.a(sportCommand);
        }
    };

    @NotNull
    public static Function2<? super Integer, ? super SportConfig, Unit> c = a.t;

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "Lcom/xiaomi/hm/health/bt/profile/sport/SportConfig;", "<anonymous parameter 1>", "", PluginDeviceInfo.FMODEL, "(ILcom/xiaomi/hm/health/bt/profile/sport/SportConfig;)V"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements Function2<Integer, SportConfig, Unit> {
        public static final a t = new a();

        public a() {
            super(2);
        }

        public final void a(int i, @Nullable SportConfig sportConfig) {
            t5t.d("CallbackHolder", "No init callback registered");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, SportConfig sportConfig) {
            a(num.intValue(), sportConfig);
            return Unit.INSTANCE;
        }
    }

    public static final void a(SportCommand sportCommand) {
        t5t.d("CallbackHolder", "No  command callback registered");
    }

    @NotNull
    public final void a(@NotNull IHMSportListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        f19636b = listener;
    }

    public final void a(@NotNull Function2<? super Integer, ? super SportConfig, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        c = callback;
    }

    public final void a(byte command) {
        Object objM886constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            SportCommand sportCommandA = qt.a(qt.a(), command);
            if (sportCommandA == null) {
                t5t.d("CallbackHolder", "Unrecognized command");
            } else {
                f19636b.onSportCommand(sportCommandA);
            }
            objM886constructorimpl = Result.m886constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
        if (thM889exceptionOrNullimpl != null) {
            t5t.d("CallbackHolder", "Command callback invoke exception:" + thM889exceptionOrNullimpl);
        }
    }

    public final void a(@NotNull byte[] bytes) {
        Object objM886constructorimpl;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        try {
            Result.Companion companion = Result.Companion;
            SportConfig sportConfig = null;
            w2 w2Var = new w2(bytes, 0, 2, null);
            int iC = w2Var.c();
            if (iC != 1) {
                boolean zB = w2Var.b();
                int iC2 = w2Var.c();
                boolean zB2 = w2Var.b();
                SportConfig sportConfig2 = new SportConfig(SportKind.from((byte) iC2), 1, zB);
                sportConfig2.setAutoRecognizeSport(zB2);
                sportConfig = sportConfig2;
            }
            c.invoke(Integer.valueOf(iC), sportConfig);
            objM886constructorimpl = Result.m886constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
        if (thM889exceptionOrNullimpl != null) {
            t5t.d("CallbackHolder", "Init callback invoke exception:" + thM889exceptionOrNullimpl);
        }
    }
}
