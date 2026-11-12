package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes23.dex */
public class LazyFieldLite {
    private ByteString a;
    private ExtensionRegistryLite b;
    private volatile boolean c;
    public volatile MessageLite value;

    public void ensureInitialized(MessageLite messageLite) {
        if (this.value != null) {
            return;
        }
        synchronized (this) {
            if (this.value != null) {
                return;
            }
            try {
                if (this.a != null) {
                    this.value = messageLite.getParserForType().parseFrom(this.a, this.b);
                } else {
                    this.value = messageLite;
                }
            } catch (IOException unused) {
            }
        }
    }

    public int getSerializedSize() {
        return this.c ? this.value.getSerializedSize() : this.a.size();
    }

    public MessageLite getValue(MessageLite messageLite) {
        ensureInitialized(messageLite);
        return this.value;
    }

    public MessageLite setValue(MessageLite messageLite) {
        MessageLite messageLite2 = this.value;
        this.value = messageLite;
        this.a = null;
        this.c = true;
        return messageLite2;
    }
}
