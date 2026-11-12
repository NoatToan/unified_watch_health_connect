package com.xiaomi.fitness.aivs.bluetooth;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0006\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/aivs/bluetooth/AivsCommand;", "", "<init>", "()V", "type", "", "getType", "()B", "setType", "(B)V", "len", "", "getLen", "()I", "setLen", "(I)V", "data", "", "getData", "()[B", "setData", "([B)V", "Companion", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AivsCommand {
    public static final byte AUDIO_COMMAND_AUDIO_DATA = 2;
    public static final byte AUDIO_COMMAND_AUDIO_END = 3;
    public static final byte AUDIO_COMMAND_QUIT = 4;
    public static final byte AUDIO_COMMAND_START = 1;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int HEAD_LENGTH = 3;
    public static final byte VERSION_0 = 0;

    @Nullable
    private byte[] data;
    private int len;
    private byte type;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/aivs/bluetooth/AivsCommand$Companion;", "", "<init>", "()V", "VERSION_0", "", "AUDIO_COMMAND_START", "AUDIO_COMMAND_AUDIO_DATA", "AUDIO_COMMAND_AUDIO_END", "AUDIO_COMMAND_QUIT", "HEAD_LENGTH", "", "parse", "", "Lcom/xiaomi/fitness/aivs/bluetooth/AivsCommand;", "bytes", "", "isL67", "", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<AivsCommand> parse(@NotNull byte[] bytes, boolean isL67) {
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            ArrayList arrayList = new ArrayList();
            if (!(bytes.length == 0)) {
                ByteBuffer byteBufferOrder = ByteBuffer.wrap(bytes).order(ByteOrder.BIG_ENDIAN);
                if (byteBufferOrder.get() == 0) {
                    int i = isL67 ? 3 : 1;
                    while (byteBufferOrder.remaining() >= i) {
                        AivsCommand aivsCommand = new AivsCommand();
                        aivsCommand.setType(byteBufferOrder.get());
                        if (byteBufferOrder.remaining() >= 2) {
                            aivsCommand.setLen(byteBufferOrder.getShort());
                            if (aivsCommand.getLen() <= 0) {
                                arrayList.add(aivsCommand);
                            } else if (aivsCommand.getLen() <= byteBufferOrder.remaining()) {
                                byte[] bArr = new byte[aivsCommand.getLen()];
                                byteBufferOrder.get(bArr);
                                aivsCommand.setData(bArr);
                                arrayList.add(aivsCommand);
                            }
                        } else {
                            arrayList.add(aivsCommand);
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    @Nullable
    public final byte[] getData() {
        return this.data;
    }

    public final int getLen() {
        return this.len;
    }

    public final byte getType() {
        return this.type;
    }

    public final void setData(@Nullable byte[] bArr) {
        this.data = bArr;
    }

    public final void setLen(int i) {
        this.len = i;
    }

    public final void setType(byte b2) {
        this.type = b2;
    }
}
