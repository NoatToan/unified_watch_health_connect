package com.huami.phn.service;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/huami/phn/service/PHNStateType;", "", "", "flag", LogUtil.I, "getFlag", "()I", "<init>", "(Ljava/lang/String;II)V", "PLAN_UNOPENED", "PLAN_NOT_START", "PLAN_ON_GOING_REST_TODAY", "PLAN_ON_GOING_OVER_LOAD_TODAY_NO_PLAN", "PLAN_ON_GOING_DONE_THIS_WEEK_NO_PLAN", "PLAN_ON_GOING_TODAY_HAS_FINISHED", "PLAN_ON_GOING_TODAY_UN_FINISH", "PLAN_STOPED", "PLAN_STATE_UNKNOWN", "phn_service_release"}, k = 1, mv = {1, 5, 1})
public enum PHNStateType {
    PLAN_UNOPENED(1),
    PLAN_NOT_START(2),
    PLAN_ON_GOING_REST_TODAY(3),
    PLAN_ON_GOING_OVER_LOAD_TODAY_NO_PLAN(4),
    PLAN_ON_GOING_DONE_THIS_WEEK_NO_PLAN(5),
    PLAN_ON_GOING_TODAY_HAS_FINISHED(6),
    PLAN_ON_GOING_TODAY_UN_FINISH(7),
    PLAN_STOPED(8),
    PLAN_STATE_UNKNOWN(0);

    private final int flag;

    PHNStateType(int i) {
        this.flag = i;
    }

    public final int getFlag() {
        return this.flag;
    }
}
