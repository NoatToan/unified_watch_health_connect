package com.huami.treadmill.data;

import com.huami.ecg.core.model.constant.MeasureContentType;
import kotlin.Metadata;
import org.cybergarage.http.HTTP;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/huami/treadmill/data/BoltSportCommand;", "", "", "b", "<init>", "(Ljava/lang/String;IB)V", "CONFIG", "START", "PAUSE", "RESUME", "STOP", "SHOW", HTTP.NOTIFY, MeasureContentType.HEART, "treadmill_release"}, k = 1, mv = {1, 5, 1})
public enum BoltSportCommand {
    CONFIG((byte) 1),
    START((byte) 2),
    PAUSE((byte) 3),
    RESUME((byte) 4),
    STOP((byte) 5),
    SHOW((byte) 6),
    NOTIFY((byte) 7),
    HEART((byte) 8);

    BoltSportCommand(byte b) {
    }
}
