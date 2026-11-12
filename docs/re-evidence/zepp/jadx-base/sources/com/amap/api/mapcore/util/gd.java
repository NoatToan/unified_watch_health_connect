package com.amap.api.mapcore.util;

import com.amap.api.maps.AMapException;
import com.amap.api.maps.AMapUtils;
import com.amap.api.maps.model.LatLng;
import com.huami.feedback.util.ErrorConstKt;
import com.huami.watch.companion.xiaomiai.EngineProcessor;
import com.unionpay.tsm.constant.TsmResultCode;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class gd {
    private static String[] a = {"com.amap.api.trace", "com.amap.api.trace.core"};

    public static void a(String str) throws ga {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("errcode")) {
                a(jSONObject.getInt("errcode"), jSONObject.getString("errmsg"));
                return;
            }
            if (jSONObject.has("status") && jSONObject.has("infocode")) {
                String string = jSONObject.getString("status");
                int i = jSONObject.getInt("infocode");
                if ("1".equals(string)) {
                    return;
                }
                String string2 = jSONObject.getString("info");
                if ("0".equals(string)) {
                    a(i, string2);
                }
            }
        } catch (JSONException unused) {
            throw new ga(AMapException.ERROR_PROTOCOL);
        }
    }

    private static void a(int i, String str) throws ga {
        if (i != 0) {
            switch (i) {
                case 10000:
                    return;
                case 10001:
                    throw new ga("用户key不正确或过期");
                case 10002:
                    throw new ga("请求服务不存在");
                case 10003:
                    throw new ga("访问已超出日访问量");
                case EngineProcessor.MSG_NEW_ANSWER_RESULT /* 10004 */:
                    throw new ga("用户访问过于频繁");
                case 10005:
                    throw new ga("用户IP无效");
                case 10006:
                    throw new ga("用户域名无效");
                case 10007:
                    throw new ga("用户签名未通过");
                case 10008:
                    throw new ga("用户MD5安全码未通过");
                case 10009:
                    throw new ga("请求key与绑定平台不符");
                case 10010:
                    throw new ga("IP访问超限");
                case 10011:
                    throw new ga("服务不支持https请求");
                case 10012:
                    throw new ga("权限不足，服务请求被拒绝");
                case TsmResultCode.ERROR_CARD_DOWNLOAD_FAIL /* 10013 */:
                    throw new ga("开发者删除了key，key被删除后无法正常使用");
                default:
                    switch (i) {
                        case 20000:
                            throw new ga("请求参数非法");
                        case 20001:
                            throw new ga("缺少必填参数");
                        case ErrorConstKt.DEVICE_CONNECTING_FAILED /* 20002 */:
                            throw new ga("请求协议非法");
                        case ErrorConstKt.DEVICE_DISCONNECT /* 20003 */:
                            throw new ga("其他未知错误");
                        default:
                            switch (i) {
                                case 30000:
                                    throw new ga("请求服务响应错误");
                                case ErrorConstKt.ZIP_FILE_FAILED /* 30001 */:
                                    throw new ga("引擎返回数据异常");
                                case ErrorConstKt.SERVER_STAGE_1_FAILED /* 30002 */:
                                    throw new ga("服务端请求链接超时");
                                case ErrorConstKt.SERVER_STAGE_1_EXCEPTION /* 30003 */:
                                    throw new ga("读取服务结果超时");
                                default:
                                    throw new ga(str);
                            }
                    }
            }
        }
    }

    public static int a(List<LatLng> list) {
        int i = 0;
        if (list == null || list.size() == 0) {
            return 0;
        }
        int iCalculateLineDistance = 0;
        while (i < list.size() - 1) {
            LatLng latLng = list.get(i);
            i++;
            LatLng latLng2 = list.get(i);
            if (latLng == null || latLng2 == null) {
                break;
            }
            iCalculateLineDistance = (int) (iCalculateLineDistance + AMapUtils.calculateLineDistance(latLng, latLng2));
        }
        return iCalculateLineDistance;
    }
}
