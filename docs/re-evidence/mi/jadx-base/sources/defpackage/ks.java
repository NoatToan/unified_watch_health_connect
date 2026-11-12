package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0002R!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010¨\u0006\u0017"}, d2 = {"Lks;", "", "Ljh;", "interceptor", "", PluginDeviceInfo.FMODEL, PluginDeviceInfo.FDESC, "", "data", "", "result", "", "cmd", "", "outInterceptors$delegate", "Lkotlin/Lazy;", "()Ljava/util/List;", "outInterceptors", "", "tag", "interceptorPrinter", "<init>", "(Ljava/lang/String;Ljh;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class ks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f24243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final jh f24244b;

    @NotNull
    public final Lazy c;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.t = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "notifyOuterOnFinishSend failed: " + this.t;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exc) {
            super(0);
            this.t = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "notifyOuterOnReceive failed: " + this.t;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Exception exc) {
            super(0);
            this.t = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "notifyOuterOnSend failed: " + this.t;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z) {
            super(0);
            this.t = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "onFinish send empty data, result: " + this.t;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e t = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "onReceive empty data";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f t = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "send empty data";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljh;", PluginDeviceInfo.FMODEL, "()Ljava/util/List;"}, k = 3, mv = {1, 7, 1})
    public static final class g extends Lambda implements Function0<List<jh>> {
        public static final g t = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<jh> invoke() {
            return new ArrayList();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class h extends Lambda implements Function0<String> {
        public static final h t = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "register interceptor";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class i extends Lambda implements Function0<String> {
        public static final i t = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "unregister interceptor";
        }
    }

    public ks(@NotNull String tag, @NotNull jh interceptorPrinter) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(interceptorPrinter, "interceptorPrinter");
        this.f24243a = tag;
        this.f24244b = interceptorPrinter;
        this.c = LazyKt__LazyJVMKt.lazy(g.t);
    }

    public final List<jh> a() {
        return (List) this.c.getValue();
    }

    public void b(@NotNull jh interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        le.c(this.f24243a, i.t);
        a().remove(interceptor);
    }

    public void a(@NotNull jh interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        if (a().contains(this.f24244b)) {
            return;
        }
        le.c(this.f24243a, h.t);
        a().add(interceptor);
    }

    public final void b(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.length != 0) {
            byte bFirst = ArraysKt___ArraysKt.first(data);
            this.f24244b.a(bFirst, data);
            b(bFirst, data);
            return;
        }
        le.c(this.f24243a, f.t);
    }

    public /* synthetic */ ks(String str, jh jhVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? new m6(str) : jhVar);
    }

    public final void a(@NotNull byte[] data, boolean result) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.length != 0) {
            byte bFirst = ArraysKt___ArraysKt.first(data);
            this.f24244b.a(bFirst, result);
            a(bFirst, result);
            return;
        }
        le.c(this.f24243a, new d(result));
    }

    public final void b(byte cmd, byte[] data) {
        try {
            Iterator<T> it = a().iterator();
            while (it.hasNext()) {
                ((jh) it.next()).a(cmd, data);
            }
        } catch (Exception e2) {
            le.c(this.f24243a, new c(e2));
        }
    }

    public final void a(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.length != 0) {
            byte bFirst = ArraysKt___ArraysKt.first(data);
            this.f24244b.b(bFirst, data);
            a(bFirst, data);
            return;
        }
        le.c(this.f24243a, e.t);
    }

    public final void a(byte cmd, boolean result) {
        try {
            Iterator<T> it = a().iterator();
            while (it.hasNext()) {
                ((jh) it.next()).a(cmd, result);
            }
        } catch (Exception e2) {
            le.c(this.f24243a, new a(e2));
        }
    }

    public final void a(byte cmd, byte[] data) {
        try {
            Iterator<T> it = a().iterator();
            while (it.hasNext()) {
                ((jh) it.next()).b(cmd, data);
            }
        } catch (Exception e2) {
            le.c(this.f24243a, new b(e2));
        }
    }
}
