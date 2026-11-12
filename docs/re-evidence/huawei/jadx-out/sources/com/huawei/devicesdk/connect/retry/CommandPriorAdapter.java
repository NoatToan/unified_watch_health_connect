package com.huawei.devicesdk.connect.retry;

import defpackage.cmg;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public enum CommandPriorAdapter {
    INSTANCE;

    private static final String TAG = "CommandPriorAdapter";
    private static final Map<b, Integer> p2pMessagePrior;
    private static final Map<String, CommandPriorHandler> longTimeCommand = new HashMap();
    private static final Map<String, CommandPriorHandler> slowTimeCommand = new HashMap();

    interface CommandPriorHandler {
        int getPrior(cmg cmgVar);
    }

    public int getFileTransferPrior(int i) {
        return (i == 2 || i == 6) ? 0 : 1;
    }

    static {
        HashMap map = new HashMap();
        p2pMessagePrior = map;
        String str = "com.huawei.test";
        map.put(new Object(str, str) { // from class: com.huawei.devicesdk.connect.retry.CommandPriorAdapter.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            String f5437a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            String f5438c;

            {
                this.f5438c = str;
                this.f5437a = str;
            }

            public int hashCode() {
                return Objects.hash(this.f5438c, this.f5437a);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                b bVar = (b) obj;
                return Objects.equals(this.f5438c, bVar.f5438c) && Objects.equals(this.f5437a, bVar.f5437a);
            }
        }, 0);
    }

    private static String getKey(byte b2, byte b3) {
        return ((int) b2) + Integer.toString(b3);
    }

    public void updateCommandPrior(cmg cmgVar) {
        byte[] bArrB = cmgVar.b();
        if (bArrB.length <= 1) {
            return;
        }
        CommandPriorHandler commandPriorHandler = longTimeCommand.get(getKey(bArrB[0], bArrB[1]));
        if (commandPriorHandler != null) {
            cmgVar.b(commandPriorHandler.getPrior(cmgVar));
        }
    }
}
