package com.huami.watchfacesstore.device.process;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0004"}, d2 = {"Lcom/huami/watchfacesstore/device/process/DialFileType;", "dialFileType", "Lcom/huami/watchfacesstore/device/process/IDialInfoReader;", "createDialInfoReader", "lib_release"}, k = 2, mv = {1, 5, 1})
public final class IDialInfoReaderKt {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DialFileType.values().length];
            iArr[DialFileType.JS_DIAL.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final IDialInfoReader createDialInfoReader(@NotNull DialFileType dialFileType) {
        return WhenMappings.$EnumSwitchMapping$0[dialFileType.ordinal()] == 1 ? new JsDialInfoReader() : new DefaultDialInfoReader();
    }
}
