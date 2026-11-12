package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lp3;", "", "", "value", "", "tipName", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public enum p3 {
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


    @NotNull
    public static final a u = new a(null);
    public final int t;

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lp3$a;", "", "", "value", "Lp3;", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final p3 a(int value) {
            for (p3 p3Var : p3.values()) {
                if (p3Var.t == value) {
                    return p3Var;
                }
            }
            return null;
        }
    }

    p3(int i, String str) {
        this.t = i;
    }

    @JvmStatic
    @Nullable
    public static final p3 a(int i) {
        return u.a(i);
    }
}
