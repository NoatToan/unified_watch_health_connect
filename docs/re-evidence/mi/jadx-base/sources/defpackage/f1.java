package defpackage;

import com.miui.circulate.device.api.Constant;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b5\u00106J\u0015\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tJ#\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00028\u0000H&¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019\"\u0004\b\u000f\u0010\u001cR\"\u0010\u001d\u001a\u00020\u00158\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001cR\"\u0010 \u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\t\"\u0004\b#\u0010$R(\u0010'\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0018\u00010%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000+8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010,R\"\u0010/\u001a\u00020.8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00067"}, d2 = {"Lf1;", "T", "", "", "Lci;", PluginDeviceInfo.FICONOFFLINE, "()Ljava/util/List;", "", "j", "()Z", "i", "Lf4s;", "header", "data", "Ljava/util/Calendar;", PluginDeviceInfo.FMODEL, "(Lf4s;Ljava/lang/Object;)Ljava/util/Calendar;", "startTime", "Ljava/util/Calendar;", PluginDeviceInfo.FLOCALIZATIONS, "()Ljava/util/Calendar;", "", "type", "I", "h", "()I", "gdspVersion", PluginDeviceInfo.FICONON, "(I)V", "retryCount", PluginDeviceInfo.FBLUETOOTHPAIR, "setRetryCount", "isLoop", "Z", Constant.KeyValue.KEY_COLUMN, "setLoop", "(Z)V", "Lkotlin/Function1;", "Lmb;", "getErrorCodeTrans", "Lkotlin/jvm/functions/Function1;", PluginDeviceInfo.FICONOFF, "()Lkotlin/jvm/functions/Function1;", "Lbi;", "()Lbi;", "dataReceiver", "Lb6;", "dataReturnTime", "Lb6;", PluginDeviceInfo.FDESC, "()Lb6;", "setDataReturnTime", "(Lb6;)V", "<init>", "(Ljava/util/Calendar;II)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public abstract class f1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Calendar f17275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17276b;
    public int c;
    public int d;
    public boolean e;

    @Nullable
    public final Function1<mb, mb> f;

    @NotNull
    public b6 g;

    public f1(@NotNull Calendar startTime, int i, int i2) {
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        this.f17275a = startTime;
        this.f17276b = i;
        this.c = i2;
        this.d = 3;
        this.e = true;
        this.g = b6.a.f3837a;
    }

    @NotNull
    public abstract bi<T> a();

    @Nullable
    public abstract Calendar a(@Nullable f4s header, T data);

    public final void a(int i) {
        this.c = i;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public b6 getG() {
        return this.g;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getC() {
        return this.c;
    }

    @Nullable
    public Function1<mb, mb> d() {
        return this.f;
    }

    @NotNull
    public List<ci> e() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public int getD() {
        return this.d;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final Calendar getF17275a() {
        return this.f17275a;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getF17276b() {
        return this.f17276b;
    }

    public final boolean i() {
        return Intrinsics.areEqual(getG(), b6.a.f3837a);
    }

    public final boolean j() {
        return Intrinsics.areEqual(getG(), b6.b.f3838a);
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public boolean getE() {
        return this.e;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ f1(Calendar calendar, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i3 & 1) != 0) {
            calendar = Calendar.getInstance();
            Intrinsics.checkNotNullExpressionValue(calendar, "getInstance()");
        }
        this(calendar, i, (i3 & 4) != 0 ? 0 : i2);
    }
}
