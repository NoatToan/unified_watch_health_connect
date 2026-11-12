package com.xiaomi.hm.health.device.health.pai;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.pai.koin.ScopesAndQualifersKt;
import com.huami.pai_service.PaiDo;
import com.huami.pai_service.PaiDoService;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.Constant;
import com.xiaomi.hm.health.bt.profile.gdsp.pai.HMPaiData;
import com.xiaomi.hm.health.bt.profile.gdsp.pai.HMWriteBackPaiInfo;
import com.xiaomi.hm.health.dataprocess.SportDay;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.apache.commons.lang3.time.DateUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.context.GlobalContext;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\f\u0010\n\u001a\u00020\u0004*\u00020\tH\u0002J\f\u0010\f\u001a\u00020\u0004*\u00020\u000bH\u0002R\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/device/health/pai/PaiDataHelper;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/pai/HMPaiData;", "getUserWriteBackPaiInfo", "", Constant.PAI_KEY_ACTIVITY_SCORES, "", "", "c", "", "a", "Lcom/huami/pai_service/PaiDo;", "b", "Ljava/lang/String;", "TAG", "", LogUtil.I, "SECONDS_IN_MINUTE", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class PaiDataHelper {

    @NotNull
    public static final PaiDataHelper INSTANCE = new PaiDataHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "PaiDataHelper";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int SECONDS_IN_MINUTE = 60;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ PaiDo b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, PaiDo paiDo) {
            super(0);
            this.a = str;
            this.b = paiDo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            String str = this.a;
            PaiDo paiDo = this.b;
            return "write back pai info date:" + str + " summary is " + (paiDo == null ? "empty" : PaiDataHelper.INSTANCE.b(paiDo));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "parse pai activity score error by : " + this.a;
        }
    }

    private PaiDataHelper() {
    }

    private final String a(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Unit unit = Unit.INSTANCE;
        return new SportDay(calendar).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String b(PaiDo paiDo) {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("date=" + a(paiDo.getTimestamp()) + ", ");
        sb.append("activityScore=" + paiDo.getActivityScore() + ", ");
        sb.append("nextActivityScore=" + paiDo.getNextActivityScore() + ", ");
        sb.append("lp=" + paiDo.getLp() + ", ");
        sb.append("mp=" + paiDo.getMp() + ", ");
        sb.append("hp=" + paiDo.getHp() + ", ");
        sb.append("lm=" + paiDo.getLm() + ", ");
        sb.append("mm=" + paiDo.getMm() + ", ");
        sb.append("hm=" + paiDo.getHm() + ", ");
        sb.append("dp=" + paiDo.getDp() + ", ");
        sb.append("tp=" + paiDo.getTp() + ", ");
        sb.append("age=" + paiDo.getAge() + ", ");
        sb.append("gd=" + paiDo.getGd() + ", ");
        sb.append("restHr=" + paiDo.getRestHr() + ", ");
        sb.append("maxHr=" + paiDo.getMaxHr() + ", ");
        sb.append("timestamp=" + paiDo.getTimestamp() + ", ");
        sb.append("timeZone=" + paiDo.getTimeZone() + ", ");
        sb.append("index=" + paiDo.getIndex() + ", ");
        return sb.toString();
    }

    private final List<Float> c(String as) {
        try {
            return (List) new Gson().fromJson(as, new TypeToken<List<? extends Float>>() { // from class: com.xiaomi.hm.health.device.health.pai.PaiDataHelper$parseActivityScore$1
            }.getType());
        } catch (Exception e) {
            HMLog.error(TAG, "", e, new b(as));
            return CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f)});
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ff A[LOOP:0: B:9:0x002d->B:33:0x00ff, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x00f2 A[EDGE_INSN: B:35:0x00f2->B:31:0x00f2 BREAK  A[LOOP:0: B:9:0x002d->B:33:0x00ff], SYNTHETIC] */
    @JvmStatic
    @Nullable
    public static final HMPaiData getUserWriteBackPaiInfo() {
        Object next;
        Calendar calendar;
        ArrayList arrayList = new ArrayList();
        PaiDoService paiDoService = (PaiDoService) ScopesAndQualifersKt.paiScope(GlobalContext.INSTANCE.get()).getOrNull(Reflection.getOrCreateKotlinClass(PaiDoService.class), null, null);
        List<PaiDo> paiList = paiDoService == null ? null : paiDoService.getPaiList(9);
        if (paiList == null) {
            paiList = CollectionsKt__CollectionsKt.emptyList();
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(6, -i);
            String string = new SportDay(calendar2).toString();
            Iterator<T> it2 = paiList.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                calendar = Calendar.getInstance();
                calendar.setTimeInMillis(((PaiDo) next).getTimestamp());
                Unit unit = Unit.INSTANCE;
            } while (!DateUtils.isSameDay(calendar2, calendar));
            PaiDo paiDo = (PaiDo) next;
            PaiDataHelper paiDataHelper = INSTANCE;
            HMLog.info(TAG, new a(string, paiDo));
            HMWriteBackPaiInfo hMWriteBackPaiInfo = paiDo == null ? null : new HMWriteBackPaiInfo((int) (paiDo.getTimestamp() / ((long) 1000)), (int) paiDo.getTimeZone(), paiDo.getTp(), paiDo.getDp(), paiDo.getIndex(), paiDataHelper.c(paiDo.getActivityScore()), paiDo.getGd(), paiDo.getAge(), paiDo.getMaxHr(), paiDo.getRestHr(), paiDo.getLp(), paiDo.getMp(), paiDo.getHp(), paiDo.getLm() * 60, paiDo.getMm() * 60, paiDo.getHm() * 60, paiDataHelper.c(paiDo.getNextActivityScore()));
            if (!arrayList.isEmpty() || paiDo != null) {
                if ((!arrayList.isEmpty()) && paiDo == null) {
                    break;
                }
                arrayList.add(hMWriteBackPaiInfo);
                if (i2 > 8) {
                    break;
                }
                i = i2;
            } else {
                if (i2 > 8) {
                    break;
                    break;
                }
                i = i2;
            }
        }
        HMPaiData hMPaiData = new HMPaiData();
        hMPaiData.setOp(5);
        hMPaiData.setWriteBackPaiList(arrayList);
        return hMPaiData;
    }
}
