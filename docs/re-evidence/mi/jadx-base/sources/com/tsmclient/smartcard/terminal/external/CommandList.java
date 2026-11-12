package com.tsmclient.smartcard.terminal.external;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class CommandList {

    @SerializedName("commands")
    private List<Command> mCommands = new ArrayList();

    public static class Command {

        @SerializedName("apdu")
        private byte[] mApdu;

        @SerializedName("expectStatus")
        private String mExpectStatus;

        public Command(byte[] bArr, String str) {
            this.mApdu = bArr;
            this.mExpectStatus = str;
        }

        public byte[] getApdu() {
            return this.mApdu;
        }

        public String getExpectStatus() {
            return this.mExpectStatus;
        }
    }

    public void addCommand(Command command) {
        this.mCommands.add(command);
    }

    public List<Command> getList() {
        return this.mCommands;
    }
}
