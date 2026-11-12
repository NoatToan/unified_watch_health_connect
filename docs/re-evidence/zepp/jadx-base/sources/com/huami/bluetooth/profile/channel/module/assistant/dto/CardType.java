package com.huami.bluetooth.profile.channel.module.assistant.dto;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.huami.watch.transdata.transport.DataTransHelper;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0019\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\b\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#¨\u0006$"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/assistant/dto/CardType;", "", "", "toByte", "", "tyBytes", "", "toIntValue", "value", LogUtil.I, "", "tipName", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "Companion", "COUNT_DOWN", "ALARM_CLOCK", "STOP_WATCH", "WORLD_TIME", "VOICE_RECORDER", "WEATHER", "MUSIC", DataTransHelper.TYPE_SPORT, "PAI", "HEART_RATE", "SLEEP", "ACTIVITY_GOAL", "SPO2", "MENSTRUATION", "TIGER_TRADE", "FLIGHT_MANAGER", "NETEASE_CLOUD_MUSIC", "QUNAR", "WEIBO", "PAY", "PHONE_LOG", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public enum CardType {
    COUNT_DOWN(1, "倒计时"),
    ALARM_CLOCK(2, "闹钟"),
    STOP_WATCH(3, "秒表"),
    WORLD_TIME(4, "世界时钟"),
    VOICE_RECORDER(5, "录音机"),
    WEATHER(6, "天气"),
    MUSIC(7, "音乐"),
    SPORT(8, "运动"),
    PAI(9, "PAI"),
    HEART_RATE(10, "心率"),
    SLEEP(11, "睡眠"),
    ACTIVITY_GOAL(12, "活动目标"),
    SPO2(13, "血氧饱和度"),
    MENSTRUATION(14, "生理周期"),
    TIGER_TRADE(15, "老虎证券"),
    FLIGHT_MANAGER(16, "航班管家"),
    NETEASE_CLOUD_MUSIC(17, "网易云音乐"),
    QUNAR(18, "去哪儿"),
    WEIBO(19, "微博"),
    PAY(20, "支付"),
    PHONE_LOG(21, "通话记录");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/assistant/dto/CardType$Companion;", "", "", "value", "Lcom/huami/bluetooth/profile/channel/module/assistant/dto/CardType;", "findValueByInt", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final CardType findValueByInt(int value) {
            for (CardType cardType : CardType.values()) {
                if (cardType.value == value) {
                    return cardType;
                }
            }
            return null;
        }
    }

    CardType(int i, String str) {
        this.value = i;
    }

    @JvmStatic
    @Nullable
    public static final CardType findValueByInt(int i) {
        return INSTANCE.findValueByInt(i);
    }

    public final byte toByte() {
        return (byte) this.value;
    }

    /* JADX INFO: renamed from: toIntValue, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @NotNull
    public final byte[] tyBytes() {
        return ByteUtilsKt.toByteArray(this.value, 2);
    }
}
