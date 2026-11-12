package com.xiaomi.hm.health.nfc.ext;

import androidx.exifinterface.media.ExifInterface;
import com.huami.wallet.accessdoor.helper.Status;
import com.huami.wallet.lib.entity.Resource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\n\u0010\u0003\u001a\u00020\u0005*\u00020\u0004¨\u0006\u0006"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/wallet/accessdoor/helper/Resource;", "Lcom/huami/wallet/lib/entity/Resource;", "asBus", "Lcom/huami/wallet/accessdoor/helper/Status;", "Lcom/huami/wallet/lib/entity/Status;", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class ResourceExtKt {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            iArr[Status.SUCCESS.ordinal()] = 1;
            iArr[Status.ERROR.ordinal()] = 2;
            iArr[Status.LOADING.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final <T> Resource<T> asBus(@NotNull com.huami.wallet.accessdoor.helper.Resource<T> resource) {
        return new Resource<>(asBus(resource.status), resource.code, resource.message, resource.data);
    }

    @NotNull
    public static final com.huami.wallet.lib.entity.Status asBus(@NotNull Status status) {
        int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i == 1) {
            return com.huami.wallet.lib.entity.Status.SUCCESS;
        }
        if (i == 2) {
            return com.huami.wallet.lib.entity.Status.ERROR;
        }
        if (i == 3) {
            return com.huami.wallet.lib.entity.Status.LOADING;
        }
        throw new NoWhenBranchMatchedException();
    }
}
