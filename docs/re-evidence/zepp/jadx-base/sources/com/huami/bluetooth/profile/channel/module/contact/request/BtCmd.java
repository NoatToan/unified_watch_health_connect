package com.huami.bluetooth.profile.channel.module.contact.request;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/contact/request/BtCmd;", "", "", "a", LogUtil.I, "getCmd", "()I", Constant.h, "b", "getLength", SessionDescription.p, "<init>", "(II)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class BtCmd {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int cmd;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int length;

    public BtCmd(int i, int i2) {
        this.cmd = i;
        this.length = i2;
    }

    public final int getCmd() {
        return this.cmd;
    }

    public final int getLength() {
        return this.length;
    }

    public /* synthetic */ BtCmd(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? 1 : i2);
    }
}
