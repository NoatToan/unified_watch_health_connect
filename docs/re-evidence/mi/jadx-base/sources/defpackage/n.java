package defpackage;

import com.huami.bluetooth.profile.channel.module.openapp.entities.ActivityData;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.b.e;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0019\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\b\u0010\tR&\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0013\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000f\u0010\u0012¨\u0006\u0019"}, d2 = {"Ln;", "Lf1;", "", "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/ActivityData;", "Lf4s;", "header", "data", "Ljava/util/Calendar;", PluginDeviceInfo.FMODEL, "(Lf4s;Ljava/util/List;)Ljava/util/Calendar;", "Le1;", "dataReceiver", "Le1;", e.f13808a, "()Le1;", "Lm;", "parser$delegate", "Lkotlin/Lazy;", "()Lm;", "parser", "startTime", "", "gpsVersion", "<init>", "(Ljava/util/Calendar;I)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class n extends f1<List<? extends ActivityData>> {

    @NotNull
    public final String h;

    @NotNull
    public final Lazy i;

    @NotNull
    public final e1<List<ActivityData>> j;

    @Metadata(bv = {}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\u0005"}, d2 = {"n$a", "Le1;", "", "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/ActivityData;", PluginDeviceInfo.FICONOFFLINE, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a extends e1<List<? extends ActivityData>> {

        /* JADX INFO: renamed from: n$a$a, reason: collision with other inner class name */
        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
        public static final class C1040a extends Lambda implements Function0<String> {
            public C1040a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "data stream: " + tet.x(a.this.d().toByteArray());
            }
        }

        public a() {
        }

        @Override // defpackage.bi
        @NotNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public List<ActivityData> b() {
            if (getV() == null) {
                return new ArrayList();
            }
            le.c(n.this.h, new C1040a());
            t5t.d(n.this.h, "data size: " + d().size());
            m mVarM = n.this.m();
            byte[] byteArray = d().toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "mDataStream.toByteArray()");
            return mVarM.a(byteArray);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm;", PluginDeviceInfo.FMODEL, "()Lm;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function0<m> {
        public static final b t = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m invoke() {
            return new m();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(@NotNull Calendar startTime, int i) {
        super(startTime, 63, i);
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        this.h = "ActivityTodaySyncParam";
        this.i = LazyKt__LazyJVMKt.lazy(b.t);
        this.j = new a();
    }

    @Override // defpackage.f1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public e1<List<ActivityData>> a() {
        return this.j;
    }

    public final m m() {
        return (m) this.i.getValue();
    }

    @Override // defpackage.f1
    public /* bridge */ /* synthetic */ Calendar a(f4s f4sVar, List<? extends ActivityData> list) {
        return a2(f4sVar, (List<ActivityData>) list);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method */
    public Calendar a2(@Nullable f4s header, @NotNull List<ActivityData> data) {
        Calendar f17275a;
        Intrinsics.checkNotNullParameter(data, "data");
        t5t.d(this.h, "start time: " + getF17275a());
        if (header != null) {
            ActivityData activityData = (ActivityData) CollectionsKt___CollectionsKt.lastOrNull((List) data);
            if (activityData != null) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(activityData.getTime());
                f17275a = calendar;
            } else {
                f17275a = null;
            }
        } else {
            f17275a = getF17275a();
        }
        if (f17275a == null) {
            return null;
        }
        t5t.d(this.h, "final start time: " + f17275a.getTimeInMillis());
        return f17275a;
    }
}
