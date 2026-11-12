package com.huami.femalehealth.logiclib.helper.ext;

import com.huami.femalehealth.logiclib.api.pojo.HistoryItemBean;
import com.huami.femalehealth.logiclib.db.po.MenstruationHistory;
import com.huami.femalehealth.logiclib.db.po.MenstruationRecord;
import com.huami.femalehealth.logiclib.dto.MenstruationDto;
import com.huami.femalehealth.logiclib.helper.DateHelper;
import com.huami.femalehealth.logiclib.vo.MenstruationVo;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0006*\b\u0012\u0004\u0012\u00020\u00070\u0006\u001a\u0012\u0010\f\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n\u001a\u0012\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006*\u0004\u0018\u00010\u0007\u001a\u0012\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006*\u0004\u0018\u00010\u0007\u001a\u0012\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006*\u0004\u0018\u00010\u0007\"\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/huami/femalehealth/logiclib/dto/MenstruationDto;", "", "isSyncServer", "Lcom/huami/femalehealth/logiclib/db/po/MenstruationRecord;", "toMenstruationRecordPo", "(Lcom/huami/femalehealth/logiclib/dto/MenstruationDto;Ljava/lang/Boolean;)Lcom/huami/femalehealth/logiclib/db/po/MenstruationRecord;", "", "Lcom/huami/femalehealth/logiclib/api/pojo/HistoryItemBean;", "Lcom/huami/femalehealth/logiclib/db/po/MenstruationHistory;", "toMenstruationHistoryList", "Ljava/util/Date;", "date", SearchCriteria.CONTAINS, "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "toMenstruationVoList", "toMenstruationDtoList", "toMenstruationRecordList", "", "a", "Ljava/lang/String;", "TAG", "logiclib_release"}, k = 2, mv = {1, 5, 1})
public final class DtoExKt {

    @NotNull
    private static final String a = "DtoEx";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.toString();
        }
    }

    public static final boolean contains(@NotNull HistoryItemBean historyItemBean, @NotNull Date date) {
        Long menstrualEndTime = historyItemBean.getMenstrualEndTime();
        if (menstrualEndTime == null) {
            return false;
        }
        long jLongValue = menstrualEndTime.longValue();
        long menstrualPeriod = historyItemBean.getMenstrualPeriod();
        long time = date.getTime();
        return menstrualPeriod <= time && time <= jLongValue;
    }

    @NotNull
    public static final List<MenstruationDto> toMenstruationDtoList(@Nullable HistoryItemBean historyItemBean) {
        if (historyItemBean == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        try {
            int iDifferDays = DateHelper.INSTANCE.differDays(historyItemBean.getMenstrualPeriod(), historyItemBean.getMenstrualEndTime().longValue());
            int i = 0;
            if (iDifferDays >= 0) {
                while (true) {
                    int i2 = i + 1;
                    MenstruationDto menstruationDto = new MenstruationDto(DateHelper.INSTANCE.offsetDayGetCalendar(i, historyItemBean.getMenstrualPeriod(), true).getTimeInMillis(), true, historyItemBean.getUpdateTime());
                    menstruationDto.setEnd(Boolean.valueOf(historyItemBean.isEnd()));
                    menstruationDto.setSId(historyItemBean.getId());
                    menstruationDto.setSyncServer(Boolean.TRUE);
                    arrayList.add(menstruationDto);
                    if (i == iDifferDays) {
                        break;
                    }
                    i = i2;
                }
            }
        } catch (Exception e) {
            HMLog.error$default(a, null, null, new a(e), 6, null);
        }
        return arrayList;
    }

    @NotNull
    public static final List<MenstruationHistory> toMenstruationHistoryList(@NotNull List<HistoryItemBean> list) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            HistoryItemBean historyItemBean = list.get(i);
            String id = historyItemBean.getId();
            int cycle = historyItemBean.getCycle();
            Date date = new Date(historyItemBean.getMenstrualPeriod());
            Long menstrualEndTime = historyItemBean.getMenstrualEndTime();
            arrayList.add(new MenstruationHistory(id, cycle, date, new Date(menstrualEndTime == null ? 0L : menstrualEndTime.longValue()), new Date(historyItemBean.getMonth()), historyItemBean.getUserId(), historyItemBean.getEnd() == 1));
        }
        return arrayList;
    }

    @NotNull
    public static final List<MenstruationRecord> toMenstruationRecordList(@Nullable HistoryItemBean historyItemBean) {
        if (historyItemBean == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        try {
            int iDifferDays = DateHelper.INSTANCE.differDays(historyItemBean.getMenstrualPeriod(), historyItemBean.getMenstrualEndTime().longValue());
            int i = 0;
            if (iDifferDays >= 0) {
                while (true) {
                    int i2 = i + 1;
                    DateHelper dateHelper = DateHelper.INSTANCE;
                    MenstruationRecord menstruationRecord = new MenstruationRecord(dateHelper.toDate(dateHelper.offsetDayGetCalendar(i, historyItemBean.getMenstrualPeriod(), true)), true);
                    menstruationRecord.setEnd(Boolean.valueOf(historyItemBean.isEnd()));
                    menstruationRecord.setSId(historyItemBean.getId());
                    menstruationRecord.setSyncServer(true);
                    menstruationRecord.setUpdateTime(historyItemBean.getUpdateTime());
                    arrayList.add(menstruationRecord);
                    if (i == iDifferDays) {
                        break;
                    }
                    i = i2;
                }
            }
        } catch (Exception e) {
            HMLog.warn$default(a, null, new b(e), 2, null);
        }
        return arrayList;
    }

    @NotNull
    public static final MenstruationRecord toMenstruationRecordPo(@NotNull MenstruationDto menstruationDto, @Nullable Boolean bool) {
        MenstruationRecord menstruationRecord = new MenstruationRecord(new Date(menstruationDto.getTime()), menstruationDto.getInPeriod());
        menstruationRecord.setUpdateTime(menstruationDto.getUpdateTime());
        menstruationRecord.setSId(menstruationDto.getSId());
        menstruationRecord.setEnd(menstruationDto.getIsEnd());
        if (bool != null) {
            menstruationRecord.setSyncServer(bool.booleanValue());
        } else {
            Boolean isSyncServer = menstruationDto.getIsSyncServer();
            menstruationRecord.setSyncServer(isSyncServer == null ? false : isSyncServer.booleanValue());
        }
        return menstruationRecord;
    }

    public static /* synthetic */ MenstruationRecord toMenstruationRecordPo$default(MenstruationDto menstruationDto, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = null;
        }
        return toMenstruationRecordPo(menstruationDto, bool);
    }

    @NotNull
    public static final List<MenstruationVo> toMenstruationVoList(@Nullable HistoryItemBean historyItemBean) {
        if (historyItemBean == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        try {
            boolean zIsEnd = historyItemBean.isEnd();
            int iDifferDays = DateHelper.INSTANCE.differDays(historyItemBean.getMenstrualPeriod(), historyItemBean.getMenstrualEndTime().longValue());
            if (iDifferDays >= 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    String id = historyItemBean.getId();
                    DateHelper dateHelper = DateHelper.INSTANCE;
                    Date date = dateHelper.toDate(dateHelper.offsetDayGetCalendar(i, historyItemBean.getMenstrualPeriod(), true));
                    Long updateTime = historyItemBean.getUpdateTime();
                    arrayList.add(new MenstruationVo(id, date, zIsEnd, true, updateTime == null ? 0L : updateTime.longValue()));
                    if (i == iDifferDays) {
                        break;
                    }
                    i = i2;
                }
            }
        } catch (Exception e) {
            HMLog.warn$default(a, null, new c(e), 2, null);
        }
        return arrayList;
    }
}
