package defpackage;

import android.text.TextUtils;
import com.miui.circulate.device.api.Constant;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.pressure.HMPressureData;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u001f\u0012\u0006\u0010\u0018\u001a\u00020\u000b\u0012\u0006\u0010\u0019\u001a\u00020\r\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u0007\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\fR\"\u0010\u000e\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R&\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0007\u0010\u0017¨\u0006\u001e"}, d2 = {"Lfc;", "Lf1;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/pressure/HMPressureData;", "", "data", "Ljava/util/ArrayList;", PluginDeviceInfo.FMODEL, "([B)Ljava/util/ArrayList;", "Lf4s;", "header", "Ljava/util/Calendar;", "(Lf4s;Ljava/util/List;)Ljava/util/Calendar;", "", "isLoop", "Z", Constant.KeyValue.KEY_COLUMN, "()Z", "setLoop", "(Z)V", "Lbi;", "dataReceiver", "Lbi;", "()Lbi;", "startTime", "isSingle", "", "gdspVersion", "<init>", "(Ljava/util/Calendar;ZI)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class fc extends f1<List<? extends HMPressureData>> {
    public boolean h;

    @NotNull
    public final bi<List<HMPressureData>> i;

    @Metadata(bv = {}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\u0005"}, d2 = {"fc$a", "Le1;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/pressure/HMPressureData;", PluginDeviceInfo.FICONOFFLINE, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a extends e1<List<? extends HMPressureData>> {
        public final /* synthetic */ boolean w;
        public final /* synthetic */ fc x;

        public a(boolean z, fc fcVar) {
            this.w = z;
            this.x = fcVar;
        }

        @Override // defpackage.bi
        @NotNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public List<HMPressureData> b() {
            ArrayList<HMPressureData> arrayListA;
            f4s v = getV();
            if (v != null) {
                if (v.f17407b <= 0) {
                    v = null;
                }
                if (v != null) {
                    boolean z = this.w;
                    fc fcVar = this.x;
                    if (z) {
                        byte[] byteArray = d().toByteArray();
                        Intrinsics.checkNotNullExpressionValue(byteArray, "mDataStream.toByteArray()");
                        arrayListA = fcVar.a(byteArray);
                    } else {
                        byte[] byteArray2 = d().toByteArray();
                        Intrinsics.checkNotNullExpressionValue(byteArray2, "this");
                        t5t.d("GdspPressureParam", TextUtils.join(",", ArraysKt___ArraysKt.toList(byteArray2)));
                        Intrinsics.checkNotNullExpressionValue(byteArray2, "mDataStream.toByteArray(…)))\n                    }");
                        ArrayList<HMPressureData> arrayList = new ArrayList<>(byteArray2.length);
                        int length = byteArray2.length;
                        int i = 0;
                        int i2 = 0;
                        while (i < length) {
                            arrayList.add(new HMPressureData(v.f17406a.getTimeInMillis() + ((long) (i2 * 60000)), byteArray2[i] & 255));
                            i++;
                            i2++;
                        }
                        arrayListA = arrayList;
                    }
                    if (arrayListA != null) {
                        return arrayListA;
                    }
                }
            }
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc(@NotNull Calendar startTime, boolean z, int i) {
        super(startTime, (z ? 18 : 19) & 255, i);
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        this.h = !z;
        this.i = new a(z, this);
    }

    @Override // defpackage.f1
    public /* bridge */ /* synthetic */ Calendar a(f4s f4sVar, List<? extends HMPressureData> list) {
        return a2(f4sVar, (List<HMPressureData>) list);
    }

    @Override // defpackage.f1
    /* JADX INFO: renamed from: k, reason: from getter */
    public boolean getH() {
        return this.h;
    }

    @Override // defpackage.f1
    @NotNull
    public bi<List<? extends HMPressureData>> a() {
        return this.i;
    }

    @Nullable
    public final synchronized ArrayList<HMPressureData> a(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        ArrayList<HMPressureData> arrayList = new ArrayList<>();
        int length = data.length;
        if (length % 5 != 0) {
            return arrayList;
        }
        for (int i = 0; i < length; i += 5) {
            int i2 = (data[i] & 255) | ((data[i + 1] & 255) << 8) | ((data[i + 2] & 255) << 16) | ((data[i + 3] & 255) << 24);
            int i3 = data[i + 4] & 255;
            long j = ((long) i2) * 1000;
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j);
            t5t.d("GdspPressureParam", "pressure:" + i3 + '(' + calendar.getTime() + ')');
            arrayList.add(new HMPressureData(j, i3));
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method */
    public Calendar a2(@Nullable f4s header, @NotNull List<HMPressureData> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (header == null) {
            return getF17275a();
        }
        if (!getH() || !(!data.isEmpty())) {
            data = null;
        }
        if (data == null) {
            return null;
        }
        Object objClone = header.f17406a.clone();
        Intrinsics.checkNotNull(objClone, "null cannot be cast to non-null type java.util.Calendar");
        Calendar calendar = (Calendar) objClone;
        calendar.add(12, data.size());
        calendar.add(13, 1);
        return calendar;
    }
}
