package com.huami.assistant.model.bean;

import com.huami.assistant.R;

/* JADX INFO: loaded from: classes5.dex */
public enum EventRepeatType {
    NEVER(R.string.repeat_once),
    EVERY_DAY(R.string.repeat_every_day),
    WORKDAY(R.string.repeat_every_workday),
    WEEKEND(R.string.repeat_every_weekend),
    EVERY_WEEK(R.string.repeat_every_week),
    EVERY_TWO_WEEK(R.string.repeat_every_two_week),
    EVERY_MONTH(R.string.repeat_every_month),
    EVERY_YEAR(R.string.repeat_every_year),
    CUSTOM(R.string.repeat_custom);

    public int name;

    EventRepeatType(int name) {
        this.name = name;
    }
}
