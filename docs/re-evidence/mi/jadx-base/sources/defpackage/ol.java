package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lol;", "R", "", "<init>", "()V", PluginDeviceInfo.FMODEL, "Lr9;", "Lfu;", "Lpu;", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public abstract class ol<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f29263a = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\"\u0004\b\u0001\u0010\u00022\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t¨\u0006\u000e"}, d2 = {"Lol$a;", "", "R", "data", "Lfu;", PluginDeviceInfo.FMODEL, "(Ljava/lang/Object;)Lfu;", "", "msg", "", "code", "Lr9;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <R> fu<R> a(R data) {
            return new fu<>(data);
        }

        public static /* synthetic */ r9 a(a aVar, String str, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return aVar.a(str, i);
        }

        @NotNull
        public final <R> r9<R> a(@NotNull String msg, int code) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            return new r9<>(msg, code);
        }
    }

    public ol() {
    }

    public /* synthetic */ ol(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
