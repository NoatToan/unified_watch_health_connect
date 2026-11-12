package com.huami.health.afppg.usecase;

import com.huami.health.afppg.data.remote.dto.AtrialFibrillationExtra;
import com.huami.health.afppg.data.remote.dto.UserEvents;
import com.huami.health.afppg.model.AtrialFibrillation;
import com.huami.health.afppg.model.AtrialFibrillationEventDay;
import com.huami.health.afppg.utils.GsonConvertorKt;
import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/huami/health/afppg/usecase/GetAfibByDayUseCase;", "", "", "dateStr", "Lkotlin/Function1;", "Lcom/huami/health/afppg/model/AtrialFibrillationEventDay;", "", "onSuccess", Constant.METHOD_EXECUTE, "Lcom/huami/health/afppg/usecase/GetAFibEventsUseCase;", "a", "Lcom/huami/health/afppg/usecase/GetAFibEventsUseCase;", "eventsUseCase", "<init>", "(Lcom/huami/health/afppg/usecase/GetAFibEventsUseCase;)V", "Companion", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final class GetAfibByDayUseCase {

    @NotNull
    private static final String b = "af_ppg_GetAfibByDayUseCase";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final GetAFibEventsUseCase eventsUseCase;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ UserEvents.EventItem a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(UserEvents.EventItem eventItem) {
            super(0);
            this.a = eventItem;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("extra: ", this.a.getExtra());
        }
    }

    public GetAfibByDayUseCase(@NotNull GetAFibEventsUseCase getAFibEventsUseCase) {
        this.eventsUseCase = getAFibEventsUseCase;
    }

    public final void execute(long dateStr, @NotNull Function1<? super AtrialFibrillationEventDay, Unit> onSuccess) {
        AtrialFibrillationEventDay atrialFibrillationEventDay = new AtrialFibrillationEventDay();
        UserEvents userEventsQueryAFibByDayEvents = this.eventsUseCase.queryAFibByDayEvents(dateStr);
        List<UserEvents.EventItem> items = userEventsQueryAFibByDayEvents == null ? null : userEventsQueryAFibByDayEvents.getItems();
        if (items != null) {
            for (UserEvents.EventItem eventItem : items) {
                HMLog.info(b, new a(eventItem));
                AtrialFibrillationExtra atrialFibrillationExtra = (AtrialFibrillationExtra) GsonConvertorKt.jsonConvert(eventItem.getExtra(), AtrialFibrillationExtra.class);
                if (atrialFibrillationExtra != null) {
                    atrialFibrillationEventDay.setDuration(atrialFibrillationEventDay.getDuration() + atrialFibrillationExtra.getDuration());
                    List<AtrialFibrillation> atrialFibrillationList = atrialFibrillationEventDay.getAtrialFibrillationList();
                    int duration = atrialFibrillationExtra.getDuration();
                    long timestamp = eventItem.getTimestamp();
                    long jConvertToEndTime = GetAfibListUseCase.INSTANCE.convertToEndTime(eventItem.getTimestamp(), atrialFibrillationExtra.getDuration());
                    String diagnosis = atrialFibrillationExtra.getDiagnosis();
                    if (diagnosis == null) {
                        diagnosis = "";
                    }
                    atrialFibrillationList.add(new AtrialFibrillation(duration, timestamp, jConvertToEndTime, diagnosis, atrialFibrillationExtra.getDeviceSource()));
                }
            }
        }
        onSuccess.invoke(atrialFibrillationEventDay);
    }
}
