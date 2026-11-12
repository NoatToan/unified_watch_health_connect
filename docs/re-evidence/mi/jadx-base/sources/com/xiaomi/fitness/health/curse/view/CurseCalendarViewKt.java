package com.xiaomi.fitness.health.curse.view;

import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"DAYS_IN_WEEK", "", "ITEM_SIZE", "LINE_SPACE", "DAY_Y_OFFSET", "WEEK_Y", "", "DAY_TO_WEEK", "PADDING_START", "BORDER_WIDTH", "WEEK_TXT_SIZE", "TAG_L", "", "health_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CurseCalendarViewKt {
    private static final int DAYS_IN_WEEK = 7;

    @NotNull
    private static final String TAG_L = "CurseCalendarView";
    private static final int ITEM_SIZE = DisplayUtil.dip2px(30.0f);
    private static final int LINE_SPACE = DisplayUtil.dip2px(8.67f);
    private static final int DAY_Y_OFFSET = DisplayUtil.dip2px(5.0f);
    private static final float WEEK_Y = DisplayUtil.dip2px(26.0f);
    private static final int DAY_TO_WEEK = DisplayUtil.dip2px(36.0f);
    private static final int PADDING_START = DisplayUtil.dip2px(15.0f);
    private static final int BORDER_WIDTH = DisplayUtil.dip2px(2.0f);
    private static final int WEEK_TXT_SIZE = ExtUtilsKt.getDp(12);
}
