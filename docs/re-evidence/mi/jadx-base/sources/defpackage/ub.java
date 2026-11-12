package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B#\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\tR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\rR\"\u0010\u000f\u001a\u00020\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, d2 = {"Lub;", "Lf1;", "", "Lf4s;", "header", "data", "Ljava/util/Calendar;", PluginDeviceInfo.FMODEL, "(Lf4s;[B)Ljava/util/Calendar;", "([B)Ljava/util/Calendar;", "Lbi;", "dataReceiver", "Lbi;", "()Lbi;", "Lb6;", "dataReturnTime", "Lb6;", PluginDeviceInfo.FDESC, "()Lb6;", "setDataReturnTime", "(Lb6;)V", "startTime", "", "type", "gdspVersion", "<init>", "(Ljava/util/Calendar;II)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class ub extends f1<byte[]> {

    @NotNull
    public static final a j = new a(null);

    @NotNull
    public final bi<byte[]> h;

    @NotNull
    public b6 i;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lub$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub(@NotNull Calendar startTime, int i, int i2) {
        super(startTime, i, i2);
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        this.h = new vb();
        this.i = b6.b.f3838a;
    }

    @Override // defpackage.f1
    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public b6 getI() {
        return this.i;
    }

    @Override // defpackage.f1
    @NotNull
    public bi<byte[]> a() {
        return this.h;
    }

    @Override // defpackage.f1
    @Nullable
    public Calendar a(@Nullable f4s header, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        f4s u = a().getU();
        if (u == null) {
            return getF17275a();
        }
        if (u.f17407b <= 0) {
            return null;
        }
        if (getF17276b() == 17) {
            return a(data);
        }
        Object objClone = u.f17406a.clone();
        Intrinsics.checkNotNull(objClone, "null cannot be cast to non-null type java.util.Calendar");
        Calendar calendar = (Calendar) objClone;
        calendar.add(12, 1);
        return calendar;
    }

    public final Calendar a(byte[] data) {
        if (!(!(data.length == 0)) || data.length % 5 != 0) {
            return null;
        }
        long jV = tet.v(data, data.length - 5, 4) * ((long) 1000);
        t5t.d("GdspByteArrayParam", "af result last item timestamp:timestamp");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jV);
        calendar.add(12, 1);
        return calendar;
    }
}
