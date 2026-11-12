package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J.\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H&J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH'J\u001b\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\rJ\b\u0010\u000e\u001a\u00020\bH&J\b\u0010\n\u001a\u00020\u000fH&R\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lr3;", "", "", "moduleId", "", "isOneTime", "Lkotlin/Function1;", "Lm4;", "", "callback", PluginDeviceInfo.FMODEL, "Ll4;", "request", "(Ll4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", PluginDeviceInfo.FDESC, "", "Lo4;", "getVersion", "()Lo4;", "version", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public interface r3 {
    @Nullable
    Object a(@NotNull l4 l4Var, @NotNull Continuation<? super Boolean> continuation);

    @NotNull
    String a();

    void a(int moduleId);

    void a(int moduleId, boolean isOneTime, @NotNull Function1<? super ChannelResponse, Unit> callback);

    @Deprecated(message = "Not recommend", replaceWith = @ReplaceWith(expression = "transport()", imports = {}))
    void a(@NotNull l4 request);

    void b();

    @NotNull
    ChannelVersion getVersion();
}
