package com.huami.nfc.door;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0002"}, d2 = {"Lcom/huami/nfc/door/NfcTag;", "getNfcTagWithHuamiWebsite", "nfc-door_release"}, k = 2, mv = {1, 5, 1})
public final class NfcTagExtensionsKt {
    @NotNull
    public static final NfcTag getNfcTagWithHuamiWebsite() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Block(0, 0, 0, Intrinsics.stringPlus(Intrinsics.stringPlus(Intrinsics.stringPlus(Intrinsics.stringPlus("", "F276E30D6A0804006263646566676869"), "140103E103E103E103E103E103E103E1"), "03E103E103E103E103E103E103E103E1"), "A0A1A2A3A4A5787788C1000000000000")));
        arrayList.add(new Block(0, 1, 0, Intrinsics.stringPlus(Intrinsics.stringPlus(Intrinsics.stringPlus(Intrinsics.stringPlus("", "00000326D10221537091010A55016875"), "616D692E636F6D51010F54027A68E58D"), "8EE7B1B3E7A791E68A80FE0000000000"), "D3F7D3F7D3F77F078840000000000000")));
        int i = 2;
        while (true) {
            int i2 = i + 1;
            arrayList.add(new Block(0, i, 0, Intrinsics.stringPlus(Intrinsics.stringPlus(Intrinsics.stringPlus(Intrinsics.stringPlus("", "00000000000000000000000000000000"), "00000000000000000000000000000000"), "00000000000000000000000000000000"), "D3F7D3F7D3F77F078840000000000000")));
            if (i2 >= 16) {
                return new NfcTag(3, 0, "F276E30D", 4, "08", "0400", arrayList, "", null, 256, null);
            }
            i = i2;
        }
    }
}
