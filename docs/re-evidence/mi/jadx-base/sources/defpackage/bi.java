package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\r\u001a\u00028\u0000H&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0006\u001a\u00020\nH&¢\u0006\u0004\b\u0006\u0010\u000fJ\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0006\u0010\u0012J#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00050\u0013H&¢\u0006\u0004\b\u0006\u0010\u0016J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0006\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lbi;", "T", "", "Lf4s;", "header", "", PluginDeviceInfo.FMODEL, "(Lf4s;)V", PluginDeviceInfo.FICONON, "()Lf4s;", "", "data", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", PluginDeviceInfo.FDESC, "()Ljava/lang/Object;", "()[B", "Ljava/util/Calendar;", StepsInfo.KEY_CALORIES, "(Ljava/util/Calendar;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "onProgress", "(Lkotlin/jvm/functions/Function1;)V", "Lmb;", "errorCode", "(Lmb;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public interface bi<T> {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        public static <T> void a(@NotNull bi<T> biVar, @NotNull mb errorCode) {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        }
    }

    @Nullable
    T a(@NotNull Calendar cal);

    @Nullable
    Object a(@NotNull byte[] bArr, @NotNull Continuation<? super Unit> continuation);

    void a(@Nullable f4s header);

    void a(@NotNull Function1<? super Progress, Unit> onProgress);

    void a(@NotNull mb errorCode);

    @NotNull
    byte[] a();

    T b();

    @Nullable
    f4s c();
}
