package com.garmin.android.apps.connectmobile.gfdi.protobuf;

import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.t0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/InitialSetupResponseStatus;", "", "status", "", "<init>", "(Ljava/lang/String;II)V", "getStatus", "()I", "IN_INITIAL_SETUP", "SETUP_COMPLETE", "IN_SETUP_APPLYING_BACKUP", "Companion", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum InitialSetupResponseStatus {
    IN_INITIAL_SETUP(0),
    SETUP_COMPLETE(1),
    IN_SETUP_APPLYING_BACKUP(2);

    private static final Map<Integer, InitialSetupResponseStatus> map;
    private final int status;
    private static final /* synthetic */ w13.a $ENTRIES = w13.b.g(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    static {
        InitialSetupResponseStatus[] initialSetupResponseStatusArrValues = values();
        int iA = t0.a(initialSetupResponseStatusArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        for (InitialSetupResponseStatus initialSetupResponseStatus : initialSetupResponseStatusArrValues) {
            linkedHashMap.put(Integer.valueOf(initialSetupResponseStatus.status), initialSetupResponseStatus);
        }
        map = linkedHashMap;
    }

    InitialSetupResponseStatus(int i14) {
        this.status = i14;
    }

    public static w13.a<InitialSetupResponseStatus> getEntries() {
        return $ENTRIES;
    }

    public final int getStatus() {
        return this.status;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/InitialSetupResponseStatus$Companion;", "", "<init>", "()V", "map", "", "", "Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/InitialSetupResponseStatus;", "fromInt", "status", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final InitialSetupResponseStatus fromInt(int status) {
            return (InitialSetupResponseStatus) InitialSetupResponseStatus.map.get(Integer.valueOf(status));
        }

        private Companion() {
        }
    }
}
