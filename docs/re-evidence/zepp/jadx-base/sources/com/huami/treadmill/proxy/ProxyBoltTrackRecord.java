package com.huami.treadmill.proxy;

import android.app.Activity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.treadmill.data.BoltRecordStatics;
import com.xiaomi.hm.health.databases.model.AdEntity;
import com.xiaomi.hm.health.databases.model.Trackdata;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import com.xiaomi.hm.health.databases.model.trainning.TrainingRecord;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 02\u00020\u0001:\u00010B\t\b\u0002¢\u0006\u0004\b.\u0010/J+\u0010\t\u001a\u00020\u00072!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002H\u0016J\u0010\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u001f\u0010\u0014\u001a\u0004\u0018\u00010\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0019\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH\u0016J\u0014\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001dH\u0016J\u0019\u0010#\u001a\u0004\u0018\u00010\r2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u001cH\u0016R$\u0010-\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u00061"}, d2 = {"Lcom/huami/treadmill/proxy/ProxyBoltTrackRecord;", "Lcom/huami/treadmill/proxy/IBoltTrackRecord;", "Lkotlin/Function1;", "Lcom/huami/treadmill/data/BoltRecordStatics;", "Lkotlin/ParameterName;", "name", "bolts", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "getCurrentUserBoltRecordStatisticsInfo", "", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "getNoOwnerBoltTrackRecords", "", "trackId", "", "source", "deleteBoltTrackRecord", "tracks", "", "uploadBoltTrackRecords", "(Ljava/util/List;)Ljava/lang/Boolean;", "deviceSource", "Landroid/app/Activity;", "activity", "gotoDetailSport", "getNoOwnerNum", "()Ljava/lang/Integer;", "", "", "getPromotionIds", "Lcom/xiaomi/hm/health/databases/model/Trackdata;", "getTrackData", "Lcom/xiaomi/hm/health/databases/model/trainning/TrainingRecord;", "record", "uploadLine", "(Lcom/xiaomi/hm/health/databases/model/trainning/TrainingRecord;)Ljava/lang/Long;", "Lcom/xiaomi/hm/health/databases/model/AdEntity;", "getAdRecommendExtra", "a", "Lcom/huami/treadmill/proxy/IBoltTrackRecord;", "getDelegate", "()Lcom/huami/treadmill/proxy/IBoltTrackRecord;", "setDelegate", "(Lcom/huami/treadmill/proxy/IBoltTrackRecord;)V", "delegate", "<init>", "()V", "Companion", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class ProxyBoltTrackRecord implements IBoltTrackRecord {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<ProxyBoltTrackRecord> b = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) a.a);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private IBoltTrackRecord delegate;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0007\u001a\u00020\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/treadmill/proxy/ProxyBoltTrackRecord$Companion;", "", "Lcom/huami/treadmill/proxy/ProxyBoltTrackRecord;", "instance$delegate", "Lkotlin/Lazy;", "getInstance", "()Lcom/huami/treadmill/proxy/ProxyBoltTrackRecord;", DefaultSettingsSpiCall.n, "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ KProperty<Object>[] a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), DefaultSettingsSpiCall.n, "getInstance()Lcom/huami/treadmill/proxy/ProxyBoltTrackRecord;"))};

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ProxyBoltTrackRecord getInstance() {
            return (ProxyBoltTrackRecord) ProxyBoltTrackRecord.b.getValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/treadmill/proxy/ProxyBoltTrackRecord;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ProxyBoltTrackRecord> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ProxyBoltTrackRecord invoke() {
            return new ProxyBoltTrackRecord(null);
        }
    }

    private ProxyBoltTrackRecord() {
    }

    public /* synthetic */ ProxyBoltTrackRecord(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // com.huami.treadmill.proxy.IBoltTrackRecord
    public void deleteBoltTrackRecord(long trackId, int source) {
        IBoltTrackRecord iBoltTrackRecord = this.delegate;
        if (iBoltTrackRecord == null) {
            return;
        }
        iBoltTrackRecord.deleteBoltTrackRecord(trackId, source);
    }

    @Override // com.huami.treadmill.proxy.IBoltTrackRecord
    @Nullable
    public List<AdEntity> getAdRecommendExtra() {
        IBoltTrackRecord iBoltTrackRecord = this.delegate;
        if (iBoltTrackRecord == null) {
            return null;
        }
        return iBoltTrackRecord.getAdRecommendExtra();
    }

    @Override // com.huami.treadmill.proxy.IBoltTrackRecord
    public void getCurrentUserBoltRecordStatisticsInfo(@NotNull Function1<? super BoltRecordStatics, Unit> listener) {
        IBoltTrackRecord iBoltTrackRecord = this.delegate;
        if (iBoltTrackRecord == null) {
            return;
        }
        iBoltTrackRecord.getCurrentUserBoltRecordStatisticsInfo(listener);
    }

    @Nullable
    public final IBoltTrackRecord getDelegate() {
        return this.delegate;
    }

    @Override // com.huami.treadmill.proxy.IBoltTrackRecord
    @Nullable
    public List<Trackrecord> getNoOwnerBoltTrackRecords() {
        IBoltTrackRecord iBoltTrackRecord = this.delegate;
        if (iBoltTrackRecord == null) {
            return null;
        }
        return iBoltTrackRecord.getNoOwnerBoltTrackRecords();
    }

    @Override // com.huami.treadmill.proxy.IBoltTrackRecord
    @Nullable
    public Integer getNoOwnerNum() {
        IBoltTrackRecord iBoltTrackRecord = this.delegate;
        if (iBoltTrackRecord == null) {
            return null;
        }
        return iBoltTrackRecord.getNoOwnerNum();
    }

    @Override // com.huami.treadmill.proxy.IBoltTrackRecord
    @Nullable
    public List<String> getPromotionIds() {
        IBoltTrackRecord iBoltTrackRecord = this.delegate;
        if (iBoltTrackRecord == null) {
            return null;
        }
        return iBoltTrackRecord.getPromotionIds();
    }

    @Override // com.huami.treadmill.proxy.IBoltTrackRecord
    @Nullable
    public Trackdata getTrackData(@Nullable String trackId) {
        IBoltTrackRecord iBoltTrackRecord = this.delegate;
        if (iBoltTrackRecord == null) {
            return null;
        }
        return iBoltTrackRecord.getTrackData(trackId);
    }

    @Override // com.huami.treadmill.proxy.IBoltTrackRecord
    public void gotoDetailSport(long trackId, int deviceSource, @NotNull Activity activity) {
        IBoltTrackRecord iBoltTrackRecord = this.delegate;
        if (iBoltTrackRecord == null) {
            return;
        }
        iBoltTrackRecord.gotoDetailSport(trackId, deviceSource, activity);
    }

    public final void setDelegate(@Nullable IBoltTrackRecord iBoltTrackRecord) {
        this.delegate = iBoltTrackRecord;
    }

    @Override // com.huami.treadmill.proxy.IBoltTrackRecord
    @Nullable
    public Boolean uploadBoltTrackRecords(@NotNull List<Trackrecord> tracks) {
        IBoltTrackRecord iBoltTrackRecord = this.delegate;
        if (iBoltTrackRecord == null) {
            return null;
        }
        return iBoltTrackRecord.uploadBoltTrackRecords(tracks);
    }

    @Override // com.huami.treadmill.proxy.IBoltTrackRecord
    @Nullable
    public Long uploadLine(@NotNull TrainingRecord record) {
        IBoltTrackRecord iBoltTrackRecord = this.delegate;
        if (iBoltTrackRecord == null) {
            return null;
        }
        return iBoltTrackRecord.uploadLine(record);
    }
}
