package com.xiaomi.hm.health.play.card;

import androidx.p008lifecycle.LifecycleOwner;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.play.PlayTabType;
import com.xiaomi.hm.health.play.analytic.HealthStateEventKt;
import com.xiaomi.hm.health.play.card.health.BreatheTrainingRender;
import com.xiaomi.hm.health.play.card.health.FriendsRender;
import com.xiaomi.hm.health.play.card.health.ScaleBalanceRender;
import com.xiaomi.hm.health.play.card.health.SnoreMonitorRender;
import com.xiaomi.hm.health.play.card.health.TargetSettingRender;
import com.xiaomi.hm.health.play.card.intelligence.AlarmRender;
import com.xiaomi.hm.health.play.card.intelligence.AppNotifyCardRender;
import com.xiaomi.hm.health.play.card.intelligence.CallAlertCardRender;
import com.xiaomi.hm.health.play.card.intelligence.EventRemindRender;
import com.xiaomi.hm.health.play.card.intelligence.SimpleCardRender;
import com.xiaomi.hm.health.play.card.intelligence.SportHelperCardRender;
import com.xiaomi.hm.health.play.card.intelligence.ToDoRender;
import com.xiaomi.hm.health.play.card.intelligence.WorldClockRender;
import com.xiaomi.hm.health.play.card.intelligence.nfc.NFCCardRender;
import com.xiaomi.hm.health.play.card.intelligence.watchface.WatchFaceCardRender;
import com.xiaomi.hm.health.play.card.intelligence.watchface.WatchFaceDiffManager;
import com.xiaomi.hm.health.play.card.render.CommonRender;
import com.xiaomi.hm.health.play.card.sport.BikeCardRender;
import com.xiaomi.hm.health.play.card.sport.JoinCourseCardRender;
import com.xiaomi.hm.health.play.card.sport.RunCardRender;
import com.xiaomi.hm.health.play.card.sport.TrainingPlanCardRender;
import com.xiaomi.hm.health.play.card.sport.WalkCardRender;
import com.xiaomi.hm.health.play.di.PlayKoinModuleKt;
import com.xiaomi.hm.health.smalltool.model.ToolKey;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004J\u0014\u0010\u000e\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\fR\"\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/play/card/CardRenderFactory;", "", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "", "key", "Lcom/xiaomi/hm/health/play/PlayTabType;", "tabType", "Lcom/xiaomi/hm/health/play/card/ICardRender;", "getCardRender", "", "removeCardRender", "", "keyList", "removeCardRenderNotInList", "Ljava/util/concurrent/ConcurrentHashMap;", "a", "Ljava/util/concurrent/ConcurrentHashMap;", "renderMap", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class CardRenderFactory {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ConcurrentHashMap<String, ICardRender> renderMap = new ConcurrentHashMap<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Map.Entry<String, ICardRender> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map.Entry<String, ICardRender> entry) {
            super(0);
            this.a = entry;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "removeCardRender " + ((Object) this.a.getKey());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x019b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0115  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public final ICardRender getCardRender(@NotNull LifecycleOwner lifecycleOwner, @NotNull String key, @NotNull PlayTabType tabType) {
        ICardRender simpleCardRender;
        ICardRender iCardRender = this.renderMap.get(key);
        if (iCardRender != null) {
            return iCardRender;
        }
        switch (key.hashCode()) {
            case 2384:
                if (!key.equals(ToolKey.SPORT_WALK)) {
                    simpleCardRender = new SimpleCardRender(lifecycleOwner);
                } else {
                    simpleCardRender = new WalkCardRender(lifecycleOwner);
                }
                break;
            case 2508:
                if (!key.equals(ToolKey.ALARM)) {
                    simpleCardRender = new SimpleCardRender(lifecycleOwner);
                } else {
                    simpleCardRender = new AlarmRender(lifecycleOwner);
                }
                break;
            case 2546:
                if (!key.equals("PB")) {
                    simpleCardRender = new SimpleCardRender(lifecycleOwner);
                } else {
                    simpleCardRender = new RunCardRender(lifecycleOwner);
                }
                break;
            case 2599:
                if (!key.equals(ToolKey.SPORT_BIKE)) {
                    simpleCardRender = new SimpleCardRender(lifecycleOwner);
                } else {
                    simpleCardRender = new BikeCardRender(lifecycleOwner);
                }
                break;
            case 2600:
                if (!key.equals(ToolKey.FRIENT)) {
                    simpleCardRender = new SimpleCardRender(lifecycleOwner);
                } else {
                    simpleCardRender = new FriendsRender(lifecycleOwner);
                }
                break;
            case 2039725:
                if (!key.equals(ToolKey.EDIT_CARD)) {
                    simpleCardRender = new SimpleCardRender(lifecycleOwner);
                } else {
                    simpleCardRender = new EditCardRender(lifecycleOwner, tabType);
                }
                break;
            case 2045749:
                if (!key.equals(ToolKey.WATCHFACE_SETTING)) {
                    simpleCardRender = new SimpleCardRender(lifecycleOwner);
                } else if (!WatchFaceDiffManager.INSTANCE.isSupportShowDialData(PlayKoinModuleKt.getMajorDeviceSource())) {
                    simpleCardRender = new CommonRender(lifecycleOwner);
                } else {
                    simpleCardRender = new WatchFaceCardRender(lifecycleOwner);
                }
                break;
            case 2053902:
                if (!key.equals(ToolKey.SCALE_BABY)) {
                    simpleCardRender = new SimpleCardRender(lifecycleOwner);
                } else {
                    simpleCardRender = new CommonRender(lifecycleOwner);
                }
                break;
            case 2083918:
                if (!key.equals(ToolKey.ATTEND_COURSE)) {
                    simpleCardRender = new SimpleCardRender(lifecycleOwner);
                } else {
                    simpleCardRender = new JoinCourseCardRender(lifecycleOwner);
                }
                break;
            case 2091875:
                if (!key.equals(ToolKey.TODO_LIST)) {
                    simpleCardRender = new SimpleCardRender(lifecycleOwner);
                } else {
                    simpleCardRender = new ToDoRender(lifecycleOwner);
                }
                break;
            case 2099454:
                if (!key.equals(ToolKey.SCALE_BALANCE)) {
                    simpleCardRender = new SimpleCardRender(lifecycleOwner);
                } else {
                    simpleCardRender = new ScaleBalanceRender(lifecycleOwner);
                }
                break;
            case 2159915:
                if (!key.equals(ToolKey.GUEST_MODE)) {
                    simpleCardRender = new SimpleCardRender(lifecycleOwner);
                } else {
                    simpleCardRender = new CommonRender(lifecycleOwner);
                }
                break;
            case 2227076:
                if (!key.equals(ToolKey.SNORE_MONITOR)) {
                    simpleCardRender = new SimpleCardRender(lifecycleOwner);
                } else {
                    simpleCardRender = new SnoreMonitorRender(lifecycleOwner);
                }
                break;
            case 2232324:
                if (!key.equals(ToolKey.TRAINING_BREATHE)) {
                    simpleCardRender = new SimpleCardRender(lifecycleOwner);
                } else {
                    simpleCardRender = new BreatheTrainingRender();
                }
                break;
            case 2332156:
                if (!key.equals(ToolKey.CALL_ALERT)) {
                    simpleCardRender = new SimpleCardRender(lifecycleOwner);
                } else {
                    simpleCardRender = new CallAlertCardRender(lifecycleOwner);
                }
                break;
            case 2351532:
                if (!key.equals(ToolKey.OFFLINE_VOICE_COMD)) {
                    simpleCardRender = new SimpleCardRender(lifecycleOwner);
                } else {
                    simpleCardRender = new CommonRender(lifecycleOwner);
                }
                break;
            case 2359996:
                if (!key.equals(ToolKey.TARGET_SETTING)) {
                    simpleCardRender = new SimpleCardRender(lifecycleOwner);
                } else {
                    simpleCardRender = new TargetSettingRender(lifecycleOwner);
                }
                break;
            case 2546430:
                if (!key.equals(ToolKey.WORLD_CLOCK)) {
                    simpleCardRender = new SimpleCardRender(lifecycleOwner);
                } else {
                    simpleCardRender = new WorldClockRender(lifecycleOwner);
                }
                break;
            case 2546459:
                if (!key.equals(ToolKey.REMINDER)) {
                    simpleCardRender = new SimpleCardRender(lifecycleOwner);
                } else {
                    simpleCardRender = new EventRemindRender(lifecycleOwner);
                }
                break;
            case 2591626:
                if (!key.equals(ToolKey.APP_ALERT)) {
                    simpleCardRender = new SimpleCardRender(lifecycleOwner);
                } else {
                    simpleCardRender = new AppNotifyCardRender(lifecycleOwner);
                }
                break;
            case 2697010:
                if (!key.equals(ToolKey.EXERCISE_PLAN)) {
                    simpleCardRender = new SimpleCardRender(lifecycleOwner);
                } else {
                    simpleCardRender = new TrainingPlanCardRender(lifecycleOwner);
                }
                break;
            case 2719007:
                if (!key.equals(ToolKey.SPORT_HELP)) {
                    simpleCardRender = new SimpleCardRender(lifecycleOwner);
                } else {
                    simpleCardRender = new SportHelperCardRender(lifecycleOwner);
                }
                break;
            case 74186786:
                if (!key.equals(ToolKey.NFC_WALLET)) {
                    simpleCardRender = new SimpleCardRender(lifecycleOwner);
                } else {
                    simpleCardRender = new NFCCardRender(lifecycleOwner);
                }
                break;
            default:
                simpleCardRender = new SimpleCardRender(lifecycleOwner);
                break;
        }
        this.renderMap.put(key, simpleCardRender);
        String eventId = HealthStateEventKt.getEventId(key);
        if (eventId != null) {
            HealthStateEventKt.recordEvent(HealthStateEventKt.HEALTH_V, eventId);
        }
        return simpleCardRender;
    }

    public final void removeCardRender(@NotNull String key) {
        ICardRender iCardRender = this.renderMap.get(key);
        if (iCardRender == null) {
            return;
        }
        iCardRender.onClear();
        this.renderMap.remove(key);
    }

    public final void removeCardRenderNotInList(@NotNull List<String> keyList) {
        Iterator<T> it2 = this.renderMap.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            if (!keyList.contains(entry.getKey())) {
                HMLog.debug("huqitest", new a(entry));
                removeCardRender((String) entry.getKey());
            }
        }
    }
}
