package com.huami.pai.ui.sporthint;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.pai.lib.R;
import kotlin.Metadata;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/huami/pai/ui/sporthint/PaiSportType;", "", "", "met", "F", "getMet", "()F", "", "strResId", LogUtil.I, "getStrResId", "()I", "iconResId", "getIconResId", "<init>", "(Ljava/lang/String;IFII)V", DebugCoroutineInfoImplKt.RUNNING, "RIDING", "INDOOR_EXERCISE", "ROPE_SKIPPING", "FAST_WALKING", "lib_release"}, k = 1, mv = {1, 5, 1})
public enum PaiSportType {
    RUNNING(10.5f, R.string.pai_sport_running, R.drawable.ic_pai_running),
    RIDING(5.8f, R.string.pai_sport_riding, R.drawable.ic_pai_riding),
    INDOOR_EXERCISE(6.0f, R.string.pai_sport_indoor_exercise, R.drawable.ic_pai_indoor_exercise),
    ROPE_SKIPPING(11.8f, R.string.pai_sport_rope_skipping, R.drawable.ic_pai_rope_skipping),
    FAST_WALKING(4.3f, R.string.pai_sport_fast_walking, R.drawable.ic_pai_fast_walking);

    private final int iconResId;
    private final float met;
    private final int strResId;

    PaiSportType(float f, int i, int i2) {
        this.met = f;
        this.strResId = i;
        this.iconResId = i2;
    }

    public final int getIconResId() {
        return this.iconResId;
    }

    public final float getMet() {
        return this.met;
    }

    public final int getStrResId() {
        return this.strResId;
    }
}
