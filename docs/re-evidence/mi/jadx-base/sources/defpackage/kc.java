package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.Calendar;
import kotlin.Metadata;
import kotlinx.coroutines.channels.Channel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\fH&¢\u0006\u0004\b\n\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\fH&¢\u0006\u0004\b\u0010\u0010\u000eJ\u001b\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H&¢\u0006\u0004\b\n\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H&¢\u0006\u0004\b\u0017\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u0011H&¢\u0006\u0004\b\n\u0010\u0019¨\u0006\u001a"}, d2 = {"Lkc;", "", "", "init", "()Z", "Ljava/util/Calendar;", "startTime", "", "type", "Lf4s;", PluginDeviceInfo.FMODEL, "(Ljava/util/Calendar;B)Lf4s;", "Lkotlinx/coroutines/channels/Channel;", "Lqe;", "()Lkotlinx/coroutines/channels/Channel;", "Lec;", "getData", "", "code", "(Ljava/lang/Integer;)Z", "", PluginDeviceInfo.FDESC, "()V", "deInit", "Lf6;", "(I)Lf6;", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public interface kc {
    @Nullable
    f4s a(@NotNull Calendar startTime, byte type);

    @NotNull
    f6 a(int type);

    @Nullable
    Channel<qe> a();

    boolean a(@Nullable Integer code);

    void b();

    boolean deInit();

    @NotNull
    Channel<GdspPieceData> getData();

    boolean init();
}
