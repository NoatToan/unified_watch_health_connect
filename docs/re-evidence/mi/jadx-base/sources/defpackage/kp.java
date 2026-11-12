package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0017\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\rJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0007\u0010\u0010J\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u0015H\u0016¢\u0006\u0004\b\u0007\u0010\u0018J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\u0006\u0010\u0019\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0007\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lkp;", "Lbi;", "Lk3t;", "Li;", "Lf4s;", "header", "", PluginDeviceInfo.FMODEL, "(Lf4s;)V", PluginDeviceInfo.FICONON, "()Lf4s;", "", "data", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", PluginDeviceInfo.FICONOFF, "()Lk3t;", "()[B", "Ljava/util/Calendar;", StepsInfo.KEY_CALORIES, PluginDeviceInfo.FDESC, "(Ljava/util/Calendar;)Lk3t;", "Lkotlin/Function1;", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "onProgress", "(Lkotlin/jvm/functions/Function1;)V", "value", "", "([B)Ljava/util/List;", "Ljava/io/ByteArrayOutputStream;", "mDataStream$delegate", "Lkotlin/Lazy;", PluginDeviceInfo.FICONOFFLINE, "()Ljava/io/ByteArrayOutputStream;", "mDataStream", "Lqd;", "source", "Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", com.xiaomi.onetrack.api.b.n, "<init>", "(Lqd;Lcom/xiaomi/hm/health/bt/profile/feature/Feature;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class kp implements bi<k3t<i>> {

    @NotNull
    public final qd t;

    @NotNull
    public final Feature u;

    @Nullable
    public f4s v;

    @NotNull
    public final Lazy w;

    @Nullable
    public Function1<? super Progress, Unit> x;

    @NotNull
    public List<i> y;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24121a;

        static {
            int[] iArr = new int[qd.values().length];
            try {
                iArr[qd.J.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[qd.b0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f24121a = iArr;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/io/ByteArrayOutputStream;", PluginDeviceInfo.FMODEL, "()Ljava/io/ByteArrayOutputStream;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function0<ByteArrayOutputStream> {
        public static final b t = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ByteArrayOutputStream invoke() {
            return new ByteArrayOutputStream();
        }
    }

    public kp(@NotNull qd source, @NotNull Feature feature) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(feature, "feature");
        this.t = source;
        this.u = feature;
        this.w = LazyKt__LazyJVMKt.lazy(b.t);
        this.y = new ArrayList();
    }

    @Override // defpackage.bi
    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public f4s getV() {
        return this.v;
    }

    @Override // defpackage.bi
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public k3t<i> b() {
        Calendar calendar;
        f4s f4sVar = this.v;
        if (f4sVar == null || (calendar = f4sVar.f17406a) == null) {
            calendar = Calendar.getInstance();
        }
        return new k3t<>(calendar, this.y);
    }

    public final ByteArrayOutputStream e() {
        return (ByteArrayOutputStream) this.w.getValue();
    }

    @Override // defpackage.bi
    public void a(@NotNull mb mbVar) {
        bi.a.a(this, mbVar);
    }

    @Override // defpackage.bi
    @Nullable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k3t<i> a(@NotNull Calendar cal) {
        Intrinsics.checkNotNullParameter(cal, "cal");
        return new k3t<>(cal, true);
    }

    @Override // defpackage.bi
    public void a(@Nullable f4s header) {
        this.v = header;
        e().reset();
        this.y = new ArrayList();
    }

    @Override // defpackage.bi
    @Nullable
    public Object a(@NotNull byte[] bArr, @NotNull Continuation<? super Unit> continuation) throws IOException {
        e().write(bArr);
        this.y.addAll(a(bArr));
        Function1<? super Progress, Unit> function1 = this.x;
        if (function1 != null) {
            f4s f4sVar = this.v;
            function1.invoke2(new Progress(f4sVar != null ? f4sVar.f17407b : 100, this.y.size()));
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.bi
    @NotNull
    public byte[] a() {
        byte[] byteArray = e().toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "mDataStream.toByteArray()");
        return byteArray;
    }

    @Override // defpackage.bi
    public void a(@NotNull Function1<? super Progress, Unit> onProgress) {
        Intrinsics.checkNotNullParameter(onProgress, "onProgress");
        this.x = onProgress;
    }

    public final List<i> a(byte[] value) {
        Object iVar;
        int i;
        ArrayList arrayList = new ArrayList();
        if (value.length == 0) {
            return arrayList;
        }
        if (this.u.hasAlg(0) && (i = this.u.get(0)) > 4) {
            for (int i2 = 0; i2 < value.length; i2 += i) {
                byte[] bArr = new byte[i];
                System.arraycopy(value, i2, bArr, 0, i);
                arrayList.add(new j(bArr));
            }
            return arrayList;
        }
        qd qdVar = this.t;
        int i3 = (qdVar == qd.J || qdVar == qd.b0) ? 3 : 4;
        for (int i4 = 0; i4 < value.length; i4 += i3) {
            int i5 = a.f24121a[this.t.ordinal()];
            if (i5 == 1) {
                iVar = new i(value[i4], value[i4 + 1], value[i4 + 2]);
            } else if (i5 != 2) {
                iVar = new l(value[i4 + 1], value[i4 + 2], value[i4], value[i4 + 3]);
            } else {
                iVar = new i(value[i4 + 1], value[i4 + 2], value[i4]);
            }
            arrayList.add(iVar);
        }
        return arrayList;
    }
}
