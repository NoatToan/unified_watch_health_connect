package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.data.common.data.annotation.SportDataTypeKt;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\t\u0010\u0011J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\t\u0010\u0014J\u001d\u0010\t\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00150\u000bH&¢\u0006\u0004\b\t\u0010\u000e¨\u0006\u0016"}, d2 = {"Ldi;", "T", "", "", LifecycleConstantKt.ON_START, "()V", "", "current", SportDataTypeKt.DIMEN_TOTAL, PluginDeviceInfo.FMODEL, "(JJ)V", "", "data", "onData", "(Ljava/util/List;)V", "Lf4s;", "header", "(Lf4s;)V", "Lmb;", "code", "(Lmb;)V", "Lwp;", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public interface di<T> {
    void a(long current, long total);

    void a(@NotNull f4s header);

    void a(@NotNull List<RawData> data);

    void a(@NotNull mb code);

    void onData(@NotNull List<? extends T> data);

    void onStart();
}
