package com.xiaomi.hm.health.bt.profile.gdsp.activitytoday;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.openapp.entities.ActivityData;
import com.huami.bluetooth.profile.channel.module.openapp.entities.CalorieData;
import com.huami.bluetooth.profile.channel.module.openapp.entities.FatBurningData;
import com.huami.bluetooth.profile.channel.module.openapp.entities.SitWalkRun;
import com.huami.bluetooth.profile.channel.module.openapp.entities.StandData;
import com.huami.bluetooth.profile.channel.module.openapp.entities.StepsData;
import com.huami.bluetooth.utils.BufByteDecoder;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.debug.Debug;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000e¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/activitytoday/ActivityTodayDataParser;", "", "Lcom/huami/bluetooth/utils/BufByteDecoder;", "bufDecoder", "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/StepsData;", "e", "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/CalorieData;", "a", "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/FatBurningData;", "b", "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/SitWalkRun;", "c", "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/StandData;", GoogleApiAvailabilityLight.a, "", "data", "", "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/ActivityData;", "parseData", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ActivityTodayDataParser {

    @NotNull
    public static final String TAG = "ActivityTodayProfile";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("exception: ", this.a);
        }
    }

    private final CalorieData a(BufByteDecoder bufDecoder) {
        try {
            int i = bufDecoder.readShort();
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            do {
                i2++;
                arrayList.add(Integer.valueOf(bufDecoder.readShort()));
            } while (i2 <= 47);
            return new CalorieData(i, arrayList, bufDecoder.readShort(), bufDecoder.readShort(), bufDecoder.readShort());
        } catch (IndexOutOfBoundsException unused) {
            Debug.fi(TAG, "getCalorieData: IndexOutOfBoundsException");
            return null;
        }
    }

    private final FatBurningData b(BufByteDecoder bufDecoder) {
        try {
            int i = bufDecoder.readShort();
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            do {
                i2++;
                arrayList.add(Integer.valueOf(bufDecoder.readByte()));
            } while (i2 <= 47);
            return new FatBurningData(i, arrayList, bufDecoder.readShort(), bufDecoder.readShort());
        } catch (IndexOutOfBoundsException unused) {
            Debug.fi(TAG, "getFatBurningData: IndexOutOfBoundsException");
            return null;
        }
    }

    private final SitWalkRun c(BufByteDecoder bufDecoder) {
        try {
            return new SitWalkRun(BufByteDecoder.readInt$default(bufDecoder, 0, 1, null), BufByteDecoder.readInt$default(bufDecoder, 0, 1, null), BufByteDecoder.readInt$default(bufDecoder, 0, 1, null));
        } catch (IndexOutOfBoundsException unused) {
            Debug.fi(TAG, "getSitWalkRunData: IndexOutOfBoundsException");
            return null;
        }
    }

    private final StandData d(BufByteDecoder bufDecoder) {
        try {
            int i = bufDecoder.readByte();
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            do {
                i2++;
                arrayList.add(Integer.valueOf(bufDecoder.readByte()));
            } while (i2 <= 23);
            return new StandData(i, arrayList, bufDecoder.readByte(), BufByteDecoder.readInt$default(bufDecoder, 0, 1, null), BufByteDecoder.readInt$default(bufDecoder, 0, 1, null));
        } catch (IndexOutOfBoundsException unused) {
            Debug.fi(TAG, "getStandData: IndexOutOfBoundsException");
            return null;
        }
    }

    private final StepsData e(BufByteDecoder bufDecoder) {
        try {
            int int$default = BufByteDecoder.readInt$default(bufDecoder, 0, 1, null);
            ArrayList arrayList = new ArrayList();
            int i = 0;
            do {
                i++;
                arrayList.add(Integer.valueOf(bufDecoder.readShort()));
            } while (i <= 47);
            return new StepsData(int$default, arrayList, BufByteDecoder.readInt$default(bufDecoder, 0, 1, null), BufByteDecoder.readInt$default(bufDecoder, 0, 1, null));
        } catch (IndexOutOfBoundsException unused) {
            Debug.fi(TAG, "getStepData: IndexOutOfBoundsException");
            return null;
        }
    }

    @NotNull
    public final List<ActivityData> parseData(@NotNull byte[] data) {
        ArrayList arrayList = new ArrayList();
        BufByteDecoder bufByteDecoder = new BufByteDecoder(data, data.length);
        do {
            try {
                ActivityData activityData = new ActivityData(BufByteDecoder.readInt$default(bufByteDecoder, 0, 1, null), BufByteDecoder.readInt$default(bufByteDecoder, 0, 1, null), BufByteDecoder.readInt$default(bufByteDecoder, 0, 1, null), BufByteDecoder.readInt$default(bufByteDecoder, 0, 1, null), bufByteDecoder.readBoolean(), bufByteDecoder.readShort(), e(bufByteDecoder), a(bufByteDecoder), b(bufByteDecoder), c(bufByteDecoder), d(bufByteDecoder));
                Debug.fi(TAG, Intrinsics.stringPlus("parsed activity data: ", activityData));
                arrayList.add(activityData);
            } catch (Exception e) {
                HMLog.info(TAG, new a(e));
            }
        } while (bufByteDecoder.remain() > 0);
        return arrayList;
    }
}
