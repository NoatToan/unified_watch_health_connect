package com.huami.message.converter;

import com.huami.message.dto.FollowStatus;
import com.xiaomi.hm.health.push.Type;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lcom/huami/message/dto/FollowStatus;", "", "toFollowStatusDto", "common-message_release"}, k = 2, mv = {1, 5, 1})
public final class DtoToPoKt {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FollowStatus.values().length];
            iArr[FollowStatus.UN_FOLLOW.ordinal()] = 1;
            iArr[FollowStatus.FOLLOW.ordinal()] = 2;
            iArr[FollowStatus.FOLLOW_EACH.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final String toFollowStatusDto(@NotNull FollowStatus followStatus) {
        int i = WhenMappings.$EnumSwitchMapping$0[followStatus.ordinal()];
        if (i == 1) {
            return Type.UNFOLLOW_MESSAGE;
        }
        if (i == 2) {
            return Type.FOLLOW_MESSAGE;
        }
        if (i == 3) {
            return "followEach";
        }
        throw new NoWhenBranchMatchedException();
    }
}
