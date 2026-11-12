package defpackage;

import com.amap.api.services.core.AMapException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public class ejq implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f33072a;

    public ejq(byte b2) {
        this.f33072a = "";
        if (b2 == 2) {
            this.f33072a = "血压模块自检错误，可能是传感器或A/D错误";
            return;
        }
        if (b2 != 19) {
            switch (b2) {
                case 6:
                    this.f33072a = "袖带松或者未连接袖带";
                    break;
                case 7:
                    this.f33072a = "漏气（阀门等处）";
                    break;
                case 8:
                    this.f33072a = "气压错误（可能是阀门没有正常打开）";
                    break;
                case 9:
                    this.f33072a = "弱信号（可能是袖带太松等, 可能与错误0x02有关）";
                    break;
                case 10:
                    this.f33072a = "超范围 （测量对象超过设备测量范围）";
                    break;
                case 11:
                    this.f33072a = "过分运动（有信号干扰等）";
                    break;
                case 12:
                    this.f33072a = "过压";
                    break;
                case 13:
                    this.f33072a = "信号饱和";
                    break;
                case 14:
                    this.f33072a = "漏气（类似于错误0x03）";
                    break;
                case 15:
                    this.f33072a = "系统错误";
                    break;
                default:
                    this.f33072a = AMapException.AMAP_CLIENT_UNKNOWN_ERROR;
                    break;
            }
            return;
        }
        this.f33072a = "测量超时";
    }

    public String b() {
        return this.f33072a;
    }
}
