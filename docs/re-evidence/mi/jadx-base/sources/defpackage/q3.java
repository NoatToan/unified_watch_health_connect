package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0007\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001c\u0010\u0007\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\nH&J\b\u0010\u000e\u001a\u00020\rH&J\b\u0010\u0010\u001a\u00020\u000fH&J\b\u0010\u0007\u001a\u00020\u0011H&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lq3;", "", "", "bytes", "Lrq;", "responseRequire", "Lc6;", PluginDeviceInfo.FMODEL, "([BLrq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lkotlin/Function1;", "", "callback", "Li4;", PluginDeviceInfo.FDESC, "Lo4;", PluginDeviceInfo.FICONON, "", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public interface q3 {
    @Nullable
    Object a(@NotNull byte[] bArr, @NotNull ResponseRequire responseRequire, @NotNull Continuation<? super c6> continuation);

    @NotNull
    String a();

    void a(@NotNull Function1<? super byte[], Unit> callback);

    boolean a(@NotNull byte[] bytes);

    @NotNull
    ChannelOptions b();

    @NotNull
    ChannelVersion c();
}
