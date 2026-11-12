package com.huami.bluetooth.profile.channel.module.display_list_setting;

import com.huami.bluetooth.profile.channel.module.settings.utils.ByteBufferExtendsKt;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.bt.debug.Debug;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/display_list_setting/DisplayParser;", "", "", Constant.h, "", "Lcom/huami/bluetooth/profile/channel/module/display_list_setting/DisplayBean;", "parseBean", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class DisplayParser {

    @NotNull
    private static final String a = "DisplayParser";

    @Nullable
    public final List<DisplayBean> parseBean(@NotNull byte[] cmd) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(cmd);
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            int uInt16 = ByteBufferExtendsKt.getUInt16(byteBufferWrap);
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it2 = e.until(0, uInt16).iterator();
            while (it2.hasNext()) {
                ((IntIterator) it2).nextInt();
                String string = ByteBufferExtendsKt.getString(byteBufferWrap);
                arrayList.add(new DisplayBean(ByteBufferExtendsKt.getUInt8ToInt(byteBufferWrap), byteBufferWrap.get(), ByteBufferExtendsKt.getUInt8ToInt(byteBufferWrap), string));
            }
            objM3845constructorimpl = Result.m3845constructorimpl(arrayList);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            Debug.fi(a, Intrinsics.stringPlus("parse error: ", thM3848exceptionOrNullimpl));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        return (List) objM3845constructorimpl;
    }
}
