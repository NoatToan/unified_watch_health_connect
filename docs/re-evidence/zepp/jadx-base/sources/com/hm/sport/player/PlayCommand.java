package com.hm.sport.player;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class PlayCommand {
    private CommandId a;
    private List<String> b;

    public static final class CommandId {
        public String a;
        public int b;

        public CommandId(String str, int i) {
            this.a = "";
            this.b = 0;
            this.a = str;
            this.b = i;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof CommandId) || TextUtils.isEmpty(this.a)) {
                return false;
            }
            CommandId commandId = (CommandId) obj;
            return this.a.equals(commandId.a) && commandId.b == this.b;
        }

        public String toString() {
            return "UUID:" + this.a + ",userCmdId:" + this.b;
        }
    }

    public PlayCommand() {
        this(0, new ArrayList());
    }

    public void addData(List<String> list) {
        if (list == null) {
            throw new IllegalArgumentException();
        }
        List<String> list2 = this.b;
        if (list2 == null) {
            throw new IllegalStateException();
        }
        list2.addAll(list);
    }

    public boolean equals(Object obj) {
        CommandId commandId;
        if (obj == null || !(obj instanceof PlayCommand) || (commandId = this.a) == null) {
            return false;
        }
        return commandId.equals(((PlayCommand) obj).a);
    }

    public List<String> getDataList() {
        return this.b;
    }

    public CommandId getId() {
        return this.a;
    }

    public PlayCommand(int i) {
        this(i, new ArrayList());
    }

    public PlayCommand(int i, List<String> list) {
        this.a = null;
        this.b = null;
        this.a = new CommandId(UUID.randomUUID().toString(), i);
        this.b = list;
    }

    public void addData(String str) {
        if (!TextUtils.isEmpty(str)) {
            List<String> list = this.b;
            if (list != null) {
                list.add(str);
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalArgumentException();
    }

    public PlayCommand(List<String> list) {
        this(0, list);
    }
}
