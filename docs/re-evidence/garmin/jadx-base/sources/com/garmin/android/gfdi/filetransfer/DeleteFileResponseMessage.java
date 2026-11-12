package com.garmin.android.gfdi.filetransfer;

/* JADX INFO: loaded from: classes8.dex */
public class DeleteFileResponseMessage {
    public static final int MESSAGE_ID = 5006;
    private final Response mResponse;

    public enum Response {
        Ok(0),
        FileDoesNotExist(1),
        FileCannotBeDeleted(2),
        NotReady(3);

        private byte value;

        Response(int i14) {
            this.value = (byte) i14;
        }

        public byte getValue() {
            return this.value;
        }
    }

    public DeleteFileResponseMessage(Response response) {
        this.mResponse = response;
    }

    public Response getResponse() {
        return this.mResponse;
    }
}
