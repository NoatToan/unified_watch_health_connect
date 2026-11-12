package com.xiaomi.hm.health.bt.utils;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bt/utils/CmdOutputStream;", "Ljava/io/ByteArrayOutputStream;", "", "toString", "", "size", "<init>", "(I)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class CmdOutputStream extends ByteArrayOutputStream {
    public CmdOutputStream() {
        this(0, 1, null);
    }

    public CmdOutputStream(int i) {
        super(i);
    }

    @Override // java.io.ByteArrayOutputStream
    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = ((ByteArrayOutputStream) this).count;
        if (i > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                sb.append(String.format("%02x ", Arrays.copyOf(new Object[]{Byte.valueOf(((ByteArrayOutputStream) this).buf[i2])}, 1)));
                if (i3 >= i) {
                    break;
                }
                i2 = i3;
            }
        }
        return sb.substring(0, sb.length() - 1);
    }

    public /* synthetic */ CmdOutputStream(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 32 : i);
    }
}
