package com.xiaomi.hm.health.bt.profile.gdsp.breathrate;

import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam;
import com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.BaseGdspDataReceiver;
import com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver;
import java.util.Calendar;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u001d\u0010\u000e\u001a\u00020\t8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR(\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000f8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/breathrate/BreathRateEventSyncParam;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/BaseGdspSyncParam;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/breathrate/BreathRateEvent;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/DataHeader;", "header", "data", "Ljava/util/Calendar;", "getStartSyncTime", "Lcom/xiaomi/hm/health/bt/profile/gdsp/breathrate/BreathRateEventParser;", "h", "Lkotlin/Lazy;", "a", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/breathrate/BreathRateEventParser;", "parser", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "i", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "getDataReceiver", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "dataReceiver", "startTime", "<init>", "(Ljava/util/Calendar;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class BreathRateEventSyncParam extends BaseGdspSyncParam<List<? extends BreathRateEvent>> {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy parser;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final IGdspDataReceiver<List<BreathRateEvent>> dataReceiver;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/breathrate/BreathRateEventParser;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<BreathRateEventParser> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BreathRateEventParser invoke() {
            return new BreathRateEventParser();
        }
    }

    public BreathRateEventSyncParam(@NotNull Calendar calendar) {
        super(calendar, 57, 0, 4, null);
        this.parser = LazyKt__LazyJVMKt.lazy(a.a);
        this.dataReceiver = new BaseGdspDataReceiver<List<? extends BreathRateEvent>>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.breathrate.BreathRateEventSyncParam$dataReceiver$1
            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
            @NotNull
            /* JADX INFO: renamed from: getAllData */
            public List<BreathRateEvent> getDetail() {
                DataHeader mDataHeader = getMDataHeader();
                Integer numValueOf = mDataHeader == null ? null : Integer.valueOf(mDataHeader.size);
                if (numValueOf == null) {
                    return CollectionsKt__CollectionsKt.emptyList();
                }
                numValueOf.intValue();
                return this.d.a().parse(getMDataStream().toByteArray());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BreathRateEventParser a() {
        return (BreathRateEventParser) this.parser.getValue();
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    @NotNull
    public IGdspDataReceiver<List<? extends BreathRateEvent>> getDataReceiver() {
        return this.dataReceiver;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    public /* bridge */ /* synthetic */ Calendar getStartSyncTime(DataHeader dataHeader, List<? extends BreathRateEvent> list) {
        return getStartSyncTime2(dataHeader, (List<BreathRateEvent>) list);
    }

    @Nullable
    /* JADX INFO: renamed from: getStartSyncTime, reason: avoid collision after fix types in other method */
    public Calendar getStartSyncTime2(@Nullable DataHeader header, @NotNull List<BreathRateEvent> data) {
        BreathRateEvent breathRateEvent = (BreathRateEvent) CollectionsKt.lastOrNull((List) data);
        if (breathRateEvent == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(breathRateEvent.getCalendar().getTimeInMillis() + ((long) 1000));
        return calendar;
    }
}
