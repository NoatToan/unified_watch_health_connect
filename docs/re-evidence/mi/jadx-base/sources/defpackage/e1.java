package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Calendar;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\u0006\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0006\u0010\rJ\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0006\u0010\u0010J#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\u0011H\u0016¢\u0006\u0004\b\u0006\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Le1;", "T", "Lbi;", "Lf4s;", "header", "", PluginDeviceInfo.FMODEL, "(Lf4s;)V", PluginDeviceInfo.FICONON, "()Lf4s;", "", "data", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "()[B", "Ljava/util/Calendar;", StepsInfo.KEY_CALORIES, "(Ljava/util/Calendar;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "onProgress", "(Lkotlin/jvm/functions/Function1;)V", "Ljava/io/ByteArrayOutputStream;", "mDataStream$delegate", "Lkotlin/Lazy;", PluginDeviceInfo.FICONOFF, "()Ljava/io/ByteArrayOutputStream;", "mDataStream", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public abstract class e1<T> implements bi<T> {

    @Nullable
    public f4s t;

    @NotNull
    public final Lazy u = LazyKt__LazyJVMKt.lazy(T.t);

    @Nullable
    public Function1<? super Progress, Unit> v;

    /* JADX INFO: renamed from: e1$a, reason: from Kotlin metadata */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Ljava/io/ByteArrayOutputStream;", PluginDeviceInfo.FMODEL, "()Ljava/io/ByteArrayOutputStream;"}, k = 3, mv = {1, 7, 1})
    public static final class T extends Lambda implements Function0<ByteArrayOutputStream> {
        public static final T t = new T();

        public T() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ByteArrayOutputStream invoke() {
            return new ByteArrayOutputStream();
        }
    }

    @Override // defpackage.bi
    @Nullable
    public T a(@NotNull Calendar cal) {
        Intrinsics.checkNotNullParameter(cal, "cal");
        return null;
    }

    @Override // defpackage.bi
    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public f4s getT() {
        return this.t;
    }

    @NotNull
    public ByteArrayOutputStream d() {
        return (ByteArrayOutputStream) this.u.getValue();
    }

    @Override // defpackage.bi
    @Nullable
    public Object a(@NotNull byte[] bArr, @NotNull Continuation<? super Unit> continuation) {
        return a(this, bArr, continuation);
    }

    @Override // defpackage.bi
    public void a(@NotNull mb mbVar) {
        bi.a.a(this, mbVar);
    }

    @Override // defpackage.bi
    public void a(@Nullable f4s header) {
        this.t = header;
        d().reset();
    }

    public static /* synthetic */ Object a(e1<T> e1Var, byte[] bArr, Continuation<? super Unit> continuation) throws IOException {
        e1Var.d().write(bArr);
        Function1<? super Progress, Unit> function1 = e1Var.v;
        if (function1 != null) {
            f4s f4sVar = e1Var.t;
            function1.invoke(new Progress(f4sVar != null ? f4sVar.f17407b : 100, e1Var.d().size()));
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.bi
    @NotNull
    public byte[] a() {
        byte[] byteArray = d().toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "mDataStream.toByteArray()");
        return byteArray;
    }

    @Override // defpackage.bi
    public void a(@NotNull Function1<? super Progress, Unit> onProgress) {
        Intrinsics.checkNotNullParameter(onProgress, "onProgress");
        this.v = onProgress;
    }
}
