package com.huami.nfc.door;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\f\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¨\u0006\u0002"}, d2 = {"", "md5", "nfc-door_release"}, k = 2, mv = {1, 5, 1})
public final class SnowballAccessDoorAppletApiKt {
    @NotNull
    public static final String md5(@NotNull String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes(Charsets.UTF_8));
            StringBuffer stringBuffer = new StringBuffer();
            int i = 0;
            int length = bArrDigest.length;
            while (i < length) {
                byte b = bArrDigest[i];
                i++;
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() < 2) {
                    hexString = Intrinsics.stringPlus("0", hexString);
                }
                stringBuffer.append(hexString);
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return str;
        }
    }
}
