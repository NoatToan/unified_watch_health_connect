package com.huami.worldclock.bean;

import com.google.firebase.perf.FirebasePerformance;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/huami/worldclock/bean/Operation;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "NULL", FirebasePerformance.HttpMethod.DELETE, "ADD", "SORT", "EDIT_COMPLETE", "worldclock_release"}, k = 1, mv = {1, 5, 1})
public enum Operation {
    NULL(-1),
    DELETE(0),
    ADD(1),
    SORT(2),
    EDIT_COMPLETE(3);

    Operation(int i) {
    }
}
