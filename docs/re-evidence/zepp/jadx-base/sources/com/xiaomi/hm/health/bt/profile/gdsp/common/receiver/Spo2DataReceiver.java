package com.xiaomi.hm.health.bt.profile.gdsp.common.receiver;

import android.text.TextUtils;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.base.GDSPErrorCode;
import com.xiaomi.hm.health.bt.profile.gdsp.spo2.Spo2Data;
import com.xiaomi.hm.health.bt.profile.gdsp.spo2.Spo2OdiData;
import com.xiaomi.hm.health.bt.profile.gdsp.spo2.Spo2OsaData;
import com.xiaomi.hm.health.bt.profile.gdsp.spo2.Spo2OsaEventData;
import com.xiaomi.hm.health.bt.profile.gdsp.spo2.Spo2OsaEventYorkData;
import com.xiaomi.hm.health.bt.profile.gdsp.spo2.Spo2PointData;
import com.xiaomi.hm.health.bt.profile.gdsp.spo2.p005extends.Spo2OsaDataExtends;
import com.xiaomi.hm.health.bt.profile.gdsp.spo2.p005extends.Spo2PointDataExtends;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 42\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u00014B\u0017\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010&\u001a\u00020$¢\u0006\u0004\b2\u00103J\u001a\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0012\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u001c\u0010\u001f\u001a\u00020\u00132\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00130\u001cH\u0016R\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%R\u0016\u0010)\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010(R\u0018\u0010+\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010*R\u001d\u0010/\u001a\u00020,8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b!\u0010.R$\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u00100¨\u00065"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/Spo2DataReceiver;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2Data;", "", "data", "b", "values", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2OdiData;", "g", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2OsaEventYorkData;", "f", "e", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2OsaData;", "c", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2PointData;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/DataHeader;", "header", "", "receiveHeader", "getDataHeader", "receiveData", "getAllData", "getAllByteData", "Ljava/util/Calendar;", "cal", "getDataFooter", "Lkotlin/Function1;", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "onProgress", "registerProgress", "", "a", "B", "type", "", "Z", "supportVersion", "", LogUtil.I, "version", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/DataHeader;", "mDataHeader", "Ljava/io/ByteArrayOutputStream;", "Lkotlin/Lazy;", "()Ljava/io/ByteArrayOutputStream;", "mDataStream", "Lkotlin/jvm/functions/Function1;", "mProgressCallback", "<init>", "(BZ)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class Spo2DataReceiver implements IGdspDataReceiver<List<? extends Spo2Data>> {

    @NotNull
    private static final String g = "Spo2DataParser";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final byte type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean supportVersion;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int version;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private DataHeader mDataHeader;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDataStream = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private Function1<? super Progress, Unit> mProgressCallback;

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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ List<Spo2Data> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends Spo2Data> list) {
            super(0);
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("type:");
            sb.append((int) Spo2DataReceiver.this.type);
            sb.append(", data:");
            Iterable arrayList = this.b;
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            sb.append((Object) TextUtils.join(",", arrayList));
            return sb.toString();
        }
    }

    public Spo2DataReceiver(byte b2, boolean z) {
        this.type = b2;
        this.supportVersion = z;
    }

    private final ByteArrayOutputStream a() {
        return (ByteArrayOutputStream) this.mDataStream.getValue();
    }

    private final List<Spo2Data> b(byte[] data) {
        List<Spo2Data> listG;
        if (data == null) {
            return null;
        }
        try {
            byte b2 = this.type;
            if (b2 == 37) {
                listG = d(data);
            } else if (b2 == 38) {
                listG = c(data);
            } else if (b2 == 39) {
                listG = e(data);
            } else if (b2 == 43) {
                listG = Spo2OsaEventYorkData.INSTANCE.parse(data);
            } else {
                listG = b2 == 40 ? g(data) : null;
            }
            HMLog.info(g, new b(listG));
            return listG;
        } catch (Exception e) {
            Debug.fi(g, Intrinsics.stringPlus("parseSpo2Data exception:", e.getMessage()));
            return null;
        }
    }

    private final List<Spo2OsaData> c(byte[] values) {
        if (!this.supportVersion) {
            return Spo2OsaData.INSTANCE.parse(values);
        }
        int i = this.version;
        if (i == 1) {
            return Spo2OsaData.INSTANCE.parse(values);
        }
        if (i == 2) {
            return Spo2OsaDataExtends.INSTANCE.parse(values);
        }
        Debug.fi(g, "type: " + ((int) this.type) + ", version: " + this.version + " not support!");
        return null;
    }

    private final List<Spo2PointData> d(byte[] values) {
        if (!this.supportVersion) {
            return Spo2PointData.INSTANCE.parse(values);
        }
        int i = this.version;
        if (i == 1) {
            return Spo2PointData.INSTANCE.parse(values);
        }
        if (i == 2) {
            return Spo2PointDataExtends.INSTANCE.parse(values);
        }
        Debug.fi(g, "type: " + ((int) this.type) + ", version: " + this.version + " not support!");
        return null;
    }

    private final List<Spo2Data> e(byte[] values) {
        if (!this.supportVersion) {
            return Spo2OsaEventData.INSTANCE.parse(values);
        }
        int i = this.version;
        if (i == 1) {
            return Spo2OsaEventYorkData.INSTANCE.parse(values);
        }
        if (i == 2) {
            return Spo2OsaEventData.INSTANCE.parse(values);
        }
        Debug.fi(g, "type: " + ((int) this.type) + ", version: " + this.version + " not support!");
        return null;
    }

    private final List<Spo2OsaEventYorkData> f(byte[] values) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < values.length; i += 5) {
            arrayList.add(new Spo2OsaEventYorkData(GattUtils.bytesToLong(values, i, 4), values[i + 4]));
        }
        return arrayList;
    }

    private final List<Spo2OdiData> g(byte[] values) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < values.length; i += 12) {
            arrayList.add(new Spo2OdiData(GattUtils.bytesToLong(values, i, 4), GattUtils.bytesToLong(values, i + 4, 4), GattUtils.bytesToLong(values, i + 8, 4)));
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
    public List<? extends Spo2Data> getDataFooter(@NotNull Calendar cal) {
        return null;
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
        Function1<? super Progress, Unit> function1 = this.mProgressCallback;
        if (function1 == null) {
            return;
        }
        DataHeader dataHeader = this.mDataHeader;
        function1.invoke(new Progress(dataHeader == null ? 100 : dataHeader.size, a().size()));
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
    public void receiveHeader(@Nullable DataHeader header) {
        this.mDataHeader = header;
        a().reset();
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
    public void registerProgress(@NotNull Function1<? super Progress, Unit> onProgress) {
        this.mProgressCallback = onProgress;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
    @NotNull
    /* JADX INFO: renamed from: getAllData, reason: avoid collision after fix types in other method */
    public List<? extends Spo2Data> getDetail() {
        byte[] byteArray = a().toByteArray();
        if (this.supportVersion) {
            if (!(byteArray.length == 0)) {
                this.version = byteArray[0] & 255;
                byteArray = ArraysKt___ArraysJvmKt.copyOfRange(byteArray, 1, byteArray.length);
            }
        }
        List<Spo2Data> listB = b(byteArray);
        return listB == null ? CollectionsKt__CollectionsKt.emptyList() : listB;
    }
}
