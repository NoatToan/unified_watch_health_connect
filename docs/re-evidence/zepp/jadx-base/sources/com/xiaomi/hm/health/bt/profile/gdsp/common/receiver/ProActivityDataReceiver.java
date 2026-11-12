package com.xiaomi.hm.health.bt.profile.gdsp.common.receiver;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityData;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityDataExtend;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityDataFragment;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityHrData;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.base.GDSPErrorCode;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.market.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0006\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001e\u001a\u00020\u001c¢\u0006\u0004\b.\u0010/J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004H\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u001c\u0010\u0017\u001a\u00020\n2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n0\u0014H\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001d\u0010&\u001a\u00020\"8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u0019\u0010%R$\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u00060"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/ProActivityDataReceiver;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/ActivityDataFragment;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/ActivityData;", "", "value", "", "b", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/DataHeader;", "header", "", "receiveHeader", "getDataHeader", "data", "receiveData", "getAllData", "getAllByteData", "Ljava/util/Calendar;", "cal", "getDataFooter", "Lkotlin/Function1;", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "onProgress", "registerProgress", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "a", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", "Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", Constants.JSON_FEATURE, "c", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/DataHeader;", "mDataHeader", "Ljava/io/ByteArrayOutputStream;", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "()Ljava/io/ByteArrayOutputStream;", "mDataStream", "e", "Lkotlin/jvm/functions/Function1;", "mProgressCallback", "", "f", "Ljava/util/List;", "mDataList", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;Lcom/xiaomi/hm/health/bt/profile/feature/Feature;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ProActivityDataReceiver implements IGdspDataReceiver<ActivityDataFragment<ActivityData>> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HMDeviceSource source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Feature feature;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private DataHeader mDataHeader;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Function1<? super Progress, Unit> mProgressCallback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDataStream = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private List<ActivityData> mDataList = new ArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            iArr[HMDeviceSource.SHOES_MARS.ordinal()] = 1;
            iArr[HMDeviceSource.MILI_NFC.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Ljava/io/ByteArrayOutputStream;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ByteArrayOutputStream> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ByteArrayOutputStream invoke() {
            return new ByteArrayOutputStream();
        }
    }

    public ProActivityDataReceiver(@NotNull HMDeviceSource hMDeviceSource, @NotNull Feature feature) {
        this.source = hMDeviceSource;
        this.feature = feature;
    }

    private final ByteArrayOutputStream a() {
        return (ByteArrayOutputStream) this.mDataStream.getValue();
    }

    private final List<ActivityData> b(byte[] value) {
        int i;
        ArrayList arrayList = new ArrayList();
        if (value.length == 0) {
            return arrayList;
        }
        if (this.feature.hasAlg(0) && (i = this.feature.get(0)) > 4) {
            for (int i2 = 0; i2 < value.length; i2 += i) {
                byte[] bArr = new byte[i];
                System.arraycopy(value, i2, bArr, 0, i);
                arrayList.add(new ActivityDataExtend(bArr));
            }
            return arrayList;
        }
        HMDeviceSource hMDeviceSource = this.source;
        int i3 = (hMDeviceSource == HMDeviceSource.SHOES_MARS || hMDeviceSource == HMDeviceSource.MILI_NFC) ? 3 : 4;
        for (int i4 = 0; i4 < value.length; i4 += i3) {
            int i5 = WhenMappings.$EnumSwitchMapping$0[this.source.ordinal()];
            arrayList.add(i5 != 1 ? i5 != 2 ? new ActivityHrData(value[i4 + 1], value[i4 + 2], value[i4], value[i4 + 3]) : new ActivityData(value[i4 + 1], value[i4 + 2], value[i4]) : new ActivityData(value[i4], value[i4 + 1], value[i4 + 2]));
        }
        return arrayList;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
    @NotNull
    public byte[] getAllByteData() {
        return a().toByteArray();
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
    @Nullable
    /* JADX INFO: renamed from: getDataHeader, reason: from getter */
    public DataHeader getMDataHeader() {
        return this.mDataHeader;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
    public void onFinish(@NotNull GDSPErrorCode gDSPErrorCode) {
        IGdspDataReceiver.DefaultImpls.onFinish(this, gDSPErrorCode);
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
    public void receiveData(@NotNull byte[] data) {
        a().write(data);
        this.mDataList.addAll(b(data));
        Function1<? super Progress, Unit> function1 = this.mProgressCallback;
        if (function1 == null) {
            return;
        }
        DataHeader dataHeader = this.mDataHeader;
        function1.invoke(new Progress(dataHeader == null ? 100 : dataHeader.size, this.mDataList.size()));
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
    public void receiveHeader(@Nullable DataHeader header) {
        this.mDataHeader = header;
        a().reset();
        this.mDataList = new ArrayList();
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
    public void registerProgress(@NotNull Function1<? super Progress, Unit> onProgress) {
        this.mProgressCallback = onProgress;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
    @NotNull
    public ActivityDataFragment<ActivityData> getAllData() {
        DataHeader dataHeader = this.mDataHeader;
        Calendar calendar = dataHeader == null ? null : dataHeader.calendar;
        if (calendar == null) {
            calendar = Calendar.getInstance();
        }
        return new ActivityDataFragment<>(calendar, this.mDataList);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
    @Nullable
    public ActivityDataFragment<ActivityData> getDataFooter(@NotNull Calendar cal) {
        return new ActivityDataFragment<>(cal, true);
    }
}
