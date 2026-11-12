package z33;

import java.io.IOException;
import java.io.InputStream;
import p005kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p005kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import z33.n;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b<MessageType extends n> implements p<MessageType> {
    static {
        int i14 = e.f202177b;
    }

    public static void b(n nVar) throws InvalidProtocolBufferException {
        if (nVar == null || nVar.isInitialized()) {
        } else {
            throw (nVar instanceof a ? new UninitializedMessageException((a) nVar) : new UninitializedMessageException(nVar)).asInvalidProtocolBufferException().setUnfinishedMessage(nVar);
        }
    }

    public final n c(InputStream inputStream, e eVar) throws InvalidProtocolBufferException {
        MessageType messagetype;
        try {
            int i14 = inputStream.read();
            if (i14 == -1) {
                messagetype = null;
            } else {
                if ((i14 & 128) != 0) {
                    i14 &= 127;
                    int i15 = 7;
                    while (true) {
                        if (i15 < 32) {
                            int i16 = inputStream.read();
                            if (i16 == -1) {
                                throw InvalidProtocolBufferException.truncatedMessage();
                            }
                            i14 |= (i16 & 127) << i15;
                            if ((i16 & 128) == 0) {
                                break;
                            }
                            i15 += 7;
                        } else {
                            while (true) {
                                if (i15 >= 64) {
                                    throw InvalidProtocolBufferException.malformedVarint();
                                }
                                int i17 = inputStream.read();
                                if (i17 == -1) {
                                    throw InvalidProtocolBufferException.truncatedMessage();
                                }
                                if ((i17 & 128) == 0) {
                                    break;
                                }
                                i15 += 7;
                            }
                        }
                    }
                }
                d dVarC = d.c(new a.AbstractC3766a.C3767a(inputStream, i14));
                MessageType messagetypeA = a(dVarC, eVar);
                try {
                    dVarC.a(0);
                    messagetype = messagetypeA;
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(messagetypeA);
                }
            }
            b(messagetype);
            return messagetype;
        } catch (IOException e14) {
            throw new InvalidProtocolBufferException(e14.getMessage());
        }
    }
}
