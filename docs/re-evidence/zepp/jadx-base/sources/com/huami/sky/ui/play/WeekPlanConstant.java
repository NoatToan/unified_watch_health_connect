package com.huami.sky.ui.play;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/huami/sky/ui/play/WeekPlanConstant;", "", "", "WEEK_NOT_START", LogUtil.I, "WEEK_BEFORE_DAY1", "WEEK_START_INDEX", "WEEK_END_INDEX", "WEEK_END_DAY", "<init>", "()V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class WeekPlanConstant {

    @NotNull
    public static final WeekPlanConstant INSTANCE = new WeekPlanConstant();
    public static final int WEEK_BEFORE_DAY1 = -2;
    public static final int WEEK_END_DAY = 7;
    public static final int WEEK_END_INDEX = 6;
    public static final int WEEK_NOT_START = -1;
    public static final int WEEK_START_INDEX = 0;

    private WeekPlanConstant() {
    }
}
