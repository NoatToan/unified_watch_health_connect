package com.huami.ai.koin.common;

import com.huami.ai.helper.TimeZone;
import java.util.GregorianCalendar;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/huami/ai/koin/common/TimeZoneImpl;", "Lcom/huami/ai/helper/TimeZone;", "", "getTimeZone", "<init>", "()V", "speech-skill_release"}, k = 1, mv = {1, 5, 1})
public final class TimeZoneImpl implements TimeZone {
    @Override // com.huami.ai.helper.TimeZone
    @NotNull
    public String getTimeZone() {
        return GregorianCalendar.getInstance().getTimeZone().getID();
    }
}
