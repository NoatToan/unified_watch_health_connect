package com.huami.pai.p004const;

import com.huami.android.zxing.Intents;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0016\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0016\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004¨\u0006\u0016"}, d2 = {"Lcom/huami/pai/const/StatEvent;", "", "", "a", "Ljava/lang/String;", "getSPORT_PAI_C", "()Ljava/lang/String;", com.xiaomi.hm.health.device.event.StatEvent.SPORT_PAI_C, "SPORT_PAI_V", "SPORT_PAI_CLOSE_C", "GUIDE", Intents.WifiConnect.TYPE, "WHY", "EACHDAY", "DAY_WINDOW", "VALUE", "CHOICE", "NO", "YES", "WEEK_WINDOW", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class StatEvent {

    @NotNull
    public static final String CHOICE = "choice";

    @NotNull
    public static final String DAY_WINDOW = "day_window";

    @NotNull
    public static final String EACHDAY = "eachday";

    @NotNull
    public static final String GUIDE = "guide";

    @NotNull
    public static final String NO = "no";

    @NotNull
    public static final String SPORT_PAI_CLOSE_C = "SPORT_PAI_CLOSE_C";

    @NotNull
    public static final String SPORT_PAI_V = "SPORT_PAI_V";

    @NotNull
    public static final String TYPE = "tp";

    @NotNull
    public static final String VALUE = "value";

    @NotNull
    public static final String WEEK_WINDOW = "week_window";

    @NotNull
    public static final String WHY = "why";

    @NotNull
    public static final String YES = "yes";

    @NotNull
    public static final StatEvent INSTANCE = new StatEvent();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String SPORT_PAI_C = com.xiaomi.hm.health.device.event.StatEvent.SPORT_PAI_C;

    private StatEvent() {
    }

    @NotNull
    public final String getSPORT_PAI_C() {
        return SPORT_PAI_C;
    }
}
