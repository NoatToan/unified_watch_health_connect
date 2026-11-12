package com.huami.member_card.bean;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.member_card.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"Lcom/huami/member_card/bean/MemberCardColorBg;", "", "", "colorValue", "B", "getColorValue", "()B", "", "argb", LogUtil.I, "getArgb", "()I", "<init>", "(Ljava/lang/String;IBI)V", "Companion", "COLOR1", "COLOR2", "COLOR3", "COLOR4", "COLOR5", "COLOR6", "COLOR7", "COLOR8", "COLOR9", "COLOR10", "COLOR11", "COLOR12", "member_card_release"}, k = 1, mv = {1, 5, 1})
public enum MemberCardColorBg {
    COLOR1((byte) 0, R.color.s17),
    COLOR2((byte) 1, R.color.s14),
    COLOR3((byte) 2, R.color.s27),
    COLOR4((byte) 3, R.color.s24),
    COLOR5((byte) 4, R.color.s53),
    COLOR6((byte) 5, R.color.s50),
    COLOR7((byte) 6, R.color.s33),
    COLOR8((byte) 7, R.color.s32),
    COLOR9((byte) 8, R.color.s29),
    COLOR10((byte) 9, R.color.s22),
    COLOR11((byte) 10, R.color.s19),
    COLOR12((byte) 11, R.color.s34);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int argb;
    private final byte colorValue;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/member_card/bean/MemberCardColorBg$Companion;", "", "", "value", "Lcom/huami/member_card/bean/MemberCardColorBg;", "parseColorValue", "<init>", "()V", "member_card_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final MemberCardColorBg parseColorValue(byte value) {
            for (MemberCardColorBg memberCardColorBg : MemberCardColorBg.values()) {
                if (value == memberCardColorBg.getColorValue()) {
                    return memberCardColorBg;
                }
            }
            return null;
        }
    }

    MemberCardColorBg(byte b, int i) {
        this.colorValue = b;
        this.argb = i;
    }

    public final int getArgb() {
        return this.argb;
    }

    public final byte getColorValue() {
        return this.colorValue;
    }
}
