package com.huami.bluetooth.profile.channel.module.schedule;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/schedule/RepeatMode;", "", "", "flag", LogUtil.I, "getFlag", "()I", "<init>", "(Ljava/lang/String;II)V", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "EveryWeek", "Fortnight", "EveryMonth", "EveryYear", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public enum RepeatMode {
    Monday(1),
    Tuesday(2),
    Wednesday(4),
    Thursday(8),
    Friday(16),
    Saturday(32),
    Sunday(64),
    EveryWeek(128),
    Fortnight(256),
    EveryMonth(512),
    EveryYear(1024);

    private final int flag;

    RepeatMode(int i) {
        this.flag = i;
    }

    public final int getFlag() {
        return this.flag;
    }
}
