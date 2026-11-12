package com.huami.member_card.bean;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.channel.module.member_card.BarcodeType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/huami/member_card/bean/HmFormatCodeType;", "", "", "des", "Ljava/lang/String;", "getDes", "()Ljava/lang/String;", "", "value", LogUtil.I, "getValue", "()I", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "Companion", "CODE_128", "CODE_39", "CODE_25_INTERLEAVED", "QR_CODE", "PDF417", "DATA_MATRIX", "UPC_A", "EAN_13", "EAN_8", "member_card_release"}, k = 1, mv = {1, 5, 1})
public enum HmFormatCodeType {
    CODE_128("CODE_128", BarcodeType.CODE_128.getValue()),
    CODE_39("CODE_39", BarcodeType.CODE_39.getValue()),
    CODE_25_INTERLEAVED("ITF", BarcodeType.CODE_25_INTERLEAVED.getValue()),
    QR_CODE("QR_CODE", BarcodeType.QR_CODE.getValue()),
    PDF417("PDF_417", BarcodeType.PDF417.getValue()),
    DATA_MATRIX("DATA_MATRIX", BarcodeType.DATA_MATRIX.getValue()),
    UPC_A("UPC_A", BarcodeType.UPC_A.getValue()),
    EAN_13("EAN_13", BarcodeType.EAN_13.getValue()),
    EAN_8("EAN_8", BarcodeType.EAN_8.getValue());


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String des;
    private final int value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0004¨\u0006\u000b"}, d2 = {"Lcom/huami/member_card/bean/HmFormatCodeType$Companion;", "", "", "des", "", "des2Value", "(Ljava/lang/String;)Ljava/lang/Integer;", "value", "getFormatStr", "<init>", "()V", "member_card_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Integer des2Value(@NotNull String des) {
            for (HmFormatCodeType hmFormatCodeType : HmFormatCodeType.values()) {
                if (Intrinsics.areEqual(hmFormatCodeType.getDes(), des)) {
                    return Integer.valueOf(hmFormatCodeType.getValue());
                }
            }
            return null;
        }

        @Nullable
        public final String getFormatStr(int value) {
            for (HmFormatCodeType hmFormatCodeType : HmFormatCodeType.values()) {
                if (hmFormatCodeType.getValue() == value) {
                    return hmFormatCodeType.getDes();
                }
            }
            return null;
        }
    }

    HmFormatCodeType(String str, int i) {
        this.des = str;
        this.value = i;
    }

    @NotNull
    public final String getDes() {
        return this.des;
    }

    public final int getValue() {
        return this.value;
    }
}
