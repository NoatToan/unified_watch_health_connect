package com.huami.tools.analytics.internal.utils;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes15.dex */
public interface Const {
    public static final String EVENT_ID_ACTIVITY_DURATION = "PageDuration";
    public static final String EVENT_ID_CAUGHT_EXCEPTION = "caught_exception";
    public static final int EVENT_VALUE_MAX_LENGTH = 1048576;
    public static final String LOG_TAG_PREFIX = "HmStat-";
    public static final String PARAM_ACTIVITY_NAME = "PageName";
    public static final String PARAM_STACK_TRACE = "stackTrace";
    public static final long REPORT_DELAY_TOLERANCE = TimeUnit.DAYS.toMillis(1);
    public static final int REPORT_MINIMUM_REQUIREMENT = 0;
    public static final int REPORT_PAGE_SIZE = 40;
    public static final int TIMESTAMP_LENGTH = 13;
}
