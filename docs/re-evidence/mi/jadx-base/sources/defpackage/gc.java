package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.onetrack.api.b;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B+\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000b\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u00020\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R&\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\f\u0010\u0018¨\u0006\""}, d2 = {"Lgc;", "Lf1;", "Lk3t;", "Li;", "", "Lci;", PluginDeviceInfo.FICONOFFLINE, "()Ljava/util/List;", "Lf4s;", "header", "data", "Ljava/util/Calendar;", PluginDeviceInfo.FMODEL, "(Lf4s;Lk3t;)Ljava/util/Calendar;", "Lb6;", "dataReturnTime", "Lb6;", PluginDeviceInfo.FDESC, "()Lb6;", "setDataReturnTime", "(Lb6;)V", "Lbi;", "dataReceiver", "Lbi;", "()Lbi;", "startTime", "Lqd;", "source", "Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", b.n, "", "gdspVersion", "<init>", "(Ljava/util/Calendar;Lqd;Lcom/xiaomi/hm/health/bt/profile/feature/Feature;I)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class gc extends f1<k3t<i>> {

    @NotNull
    public b6 h;

    @NotNull
    public final bi<k3t<i>> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc(@NotNull Calendar startTime, @NotNull qd source, @NotNull Feature feature, int i) {
        super(startTime, 1, i);
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(feature, "feature");
        this.h = b6.a.f3837a;
        this.i = new kp(source, feature);
    }

    @Override // defpackage.f1
    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public b6 getH() {
        return this.h;
    }

    @Override // defpackage.f1
    @NotNull
    public List<ci> e() {
        return CollectionsKt__CollectionsJVMKt.listOf(new ac());
    }

    @Override // defpackage.f1
    @NotNull
    public bi<k3t<i>> a() {
        return this.i;
    }

    @Override // defpackage.f1
    @Nullable
    public Calendar a(@Nullable f4s header, @NotNull k3t<i> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (header == null) {
            return getF17275a();
        }
        if (data.b() <= 0) {
            data = null;
        }
        if (data == null) {
            return null;
        }
        Object objClone = header.f17406a.clone();
        Intrinsics.checkNotNull(objClone, "null cannot be cast to non-null type java.util.Calendar");
        Calendar calendar = (Calendar) objClone;
        calendar.add(12, data.b());
        return calendar;
    }
}
