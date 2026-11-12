package com.huawei.watchface;

import android.util.SparseArray;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.secure.android.common.util.SafeString;
import com.huawei.watchface.mvp.model.webview.JsInteractAddition;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.analytice.data.BaseEvent;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes20.dex */
public class h extends BaseEvent {
    public static final SparseArray m;
    public String g;
    public String h;
    public String i;
    public String j;
    public LinkedHashMap k;
    public String l;

    static {
        SparseArray sparseArray = new SparseArray();
        m = sparseArray;
        sparseArray.put(1, "安装成功");
        sparseArray.put(140004, "单板上表盘数量达到上限");
        sparseArray.put(20000, "文件不存在");
        sparseArray.put(20001, "APP获取hash值失败");
        sparseArray.put(140001, "参数错误");
        sparseArray.put(140002, "设备侧返回的错误码类型 文件正在下载");
        sparseArray.put(140003, "文件名称太长");
        sparseArray.put(140005, "设备侧文件信息异常");
        sparseArray.put(140007, "文件名中包含单板不支持的特殊字符");
        sparseArray.put(140009, "设备侧空间不足");
        sparseArray.put(140006, "设备侧通用文件不存在");
        sparseArray.put(141000, "设备请求超时");
        sparseArray.put(141001, "设备连接断开");
        sparseArray.put(142000, "表盘任务被挂起");
        sparseArray.put(140008, "单板上已经存在重复（相同文件名称）的文件，无需再重复添加");
        sparseArray.put(142001, "设备文件校验失败");
        sparseArray.put(109022, "OTA传输中");
        sparseArray.put(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100014, "设备侧表盘验签失败");
        sparseArray.put(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007, "设备侧表盘验签失败");
        sparseArray.put(100015, "设备侧会员验签失败");
    }

    private LinkedHashMap p() {
        if (this.k == null) {
            this.k = new LinkedHashMap();
        }
        this.k.put(JsInteractAddition.HI_TOP_ID, e());
        this.k.put("version", h());
        this.k.put("startts", String.valueOf(f()));
        this.k.put("endts", String.valueOf(c()));
        this.k.put("totalTime", String.valueOf(g() / 1000));
        this.k.put("errorCode", d());
        this.k.put("title", m());
        this.k.put("cnTitle", k());
        this.k.put("useType", o());
        this.k.put("datalen", SafeString.replace(l(), "KB", ""));
        this.k.put("transDataLen", n());
        this.k.put(BaseEvent.KEY_DESCINFO, a(e(), h(), CommonUtils.k(d())));
        return this.k;
    }

    @Override // com.huawei.watchface.s3
    public String a() {
        return "WATCHFACE_INSTALL";
    }

    @Override // com.huawei.watchface.s3
    public LinkedHashMap b() {
        return p();
    }

    public void d(String str) {
        this.h = str;
    }

    public void e(String str) {
        this.i = str;
    }

    public void f(String str) {
        this.g = str;
    }

    public void g(String str) {
        this.j = str;
    }

    public void h(String str) {
        this.l = str;
    }

    public String k() {
        return this.h;
    }

    public String l() {
        return this.i;
    }

    public String m() {
        return this.g;
    }

    public String n() {
        return this.j;
    }

    public String o() {
        return this.l;
    }

    public static String a(String str, String str2, int i) {
        return "hitopid=" + str + "_version=" + str2 + "_" + ((String) m.get(i));
    }
}
