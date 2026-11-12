package com.ximalaya.ting.android.opensdk.httputil;

import android.text.TextUtils;
import com.ximalaya.ting.android.opensdk.constants.ConstantsOpenSdk;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest;
import com.ximalaya.ting.android.opensdk.httputil.util.SignatureUtil;
import com.ximalaya.ting.android.opensdk.httputil.util.Util;
import com.ximalaya.ting.android.opensdk.util.Logger;
import java.io.File;
import java.util.Map;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes22.dex */
public class BaseBuilder {
    private static Request.Builder addCommonCookie(Request.Builder builder) {
        return builder;
    }

    public static Request.Builder urlGet(String str) throws XimalayaException {
        return urlGet(str, null);
    }

    public static Request.Builder urlGzipedPost(String str, byte[] bArr, String str2) throws XimalayaException {
        if (ConstantsOpenSdk.isDebug || !TextUtils.isEmpty(str)) {
            return addCommonCookie(new Request.Builder().url(CommonRequest.replaceHttpToHttps(str)).post(RequestBody.create(MediaType.parse(str2), bArr)));
        }
        throw XimalayaException.getExceptionByCode(1001);
    }

    public static Request.Builder urlPost(String str, Map<String, String> map, String str2) throws XimalayaException {
        if (!ConstantsOpenSdk.isDebug && TextUtils.isEmpty(str)) {
            throw XimalayaException.getExceptionByCode(1001);
        }
        String strGenerateSignature = SignatureUtil.generateSignature(str2, map);
        if (TextUtils.isEmpty(strGenerateSignature)) {
            throw XimalayaException.getExceptionByCode(1002);
        }
        map.put(DTransferConstants.SIGNATURE, strGenerateSignature);
        return urlPost(str, map);
    }

    public static Request.Builder urlPostByteAndParam(String str, String str2, byte[] bArr, Map<String, String> map) throws XimalayaException {
        MultipartBody.Builder builder = new MultipartBody.Builder();
        builder.setType(MultipartBody.FORM);
        for (String str3 : map.keySet()) {
            builder.addPart(Headers.of("Content-Disposition", "form-data; name=\"" + str3 + "\""), RequestBody.create((MediaType) null, map.get(str3)));
        }
        builder.addPart(Headers.of("Content-Disposition", "form-data; name=\"data\"; filename=\"\""), RequestBody.create(MediaType.parse(str2), bArr));
        return addCommonCookie(new Request.Builder().url(str).post(builder.build()));
    }

    public static Request.Builder urlPut(String str, String str2, String str3) throws XimalayaException {
        if (ConstantsOpenSdk.isDebug || !TextUtils.isEmpty(str)) {
            return addCommonCookie(new Request.Builder().url(CommonRequest.replaceHttpToHttps(str)).put(RequestBody.create(MediaType.parse(str3), str2)));
        }
        throw XimalayaException.getExceptionByCode(1001);
    }

    public static Request.Builder urlGet(String str, Map<String, String> map) throws XimalayaException {
        if (!ConstantsOpenSdk.isDebug && TextUtils.isEmpty(str)) {
            throw XimalayaException.getExceptionByCode(1001);
        }
        if (map != null && !map.isEmpty()) {
            str = str + "?" + Util.ConvertMap2HttpParams(Util.encoderName(map));
        }
        Logger.i("url123", str);
        try {
            return addCommonCookie(new Request.Builder().url(str));
        } catch (Exception e) {
            e.printStackTrace();
            throw new XimalayaException(1012, e.getMessage());
        }
    }

    public static Request.Builder urlPut(String str, Map<String, String> map) throws XimalayaException {
        if (!ConstantsOpenSdk.isDebug && TextUtils.isEmpty(str)) {
            throw XimalayaException.getExceptionByCode(1001);
        }
        FormBody.Builder builder = new FormBody.Builder();
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    builder.add(entry.getKey(), entry.getValue());
                }
            }
            return addCommonCookie(new Request.Builder().url(CommonRequest.replaceHttpToHttps(str)).put(builder.build()));
        }
        throw XimalayaException.getExceptionByCode(1003);
    }

    public static Request.Builder urlPost(String str, String str2, String str3) throws XimalayaException {
        if (!ConstantsOpenSdk.isDebug && TextUtils.isEmpty(str)) {
            throw XimalayaException.getExceptionByCode(1001);
        }
        return addCommonCookie(new Request.Builder().url(str).post(RequestBody.create(MediaType.parse(str3), str2)));
    }

    public static Request.Builder urlGet(String str, Map<String, String> map, String str2) throws XimalayaException {
        if (!ConstantsOpenSdk.isDebug && TextUtils.isEmpty(str)) {
            throw XimalayaException.getExceptionByCode(1001);
        }
        String strGenerateSignature = SignatureUtil.generateSignature(str2, map);
        if (!TextUtils.isEmpty(strGenerateSignature)) {
            map.put(DTransferConstants.SIGNATURE, strGenerateSignature);
            return urlGet(str, map);
        }
        throw XimalayaException.getExceptionByCode(1002);
    }

    public static Request.Builder urlPost(String str, Map<String, String> map) throws XimalayaException {
        if (!ConstantsOpenSdk.isDebug && TextUtils.isEmpty(str)) {
            throw XimalayaException.getExceptionByCode(1001);
        }
        FormBody.Builder builder = new FormBody.Builder();
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    builder.add(entry.getKey(), entry.getValue());
                }
            }
            return addCommonCookie(new Request.Builder().url(CommonRequest.replaceHttpToHttps(str)).post(builder.build()));
        }
        throw XimalayaException.getExceptionByCode(1003);
    }

    public static Request.Builder urlPost(String str, File file) throws XimalayaException {
        if (!ConstantsOpenSdk.isDebug && TextUtils.isEmpty(str)) {
            throw XimalayaException.getExceptionByCode(1001);
        }
        return addCommonCookie(new Request.Builder().url(CommonRequest.replaceHttpToHttps(str)).post(RequestBody.create((MediaType) null, file)));
    }

    public static Request.Builder urlPost(String str, byte[] bArr) throws XimalayaException {
        if (!ConstantsOpenSdk.isDebug && TextUtils.isEmpty(str)) {
            throw XimalayaException.getExceptionByCode(1001);
        }
        return addCommonCookie(new Request.Builder().url(CommonRequest.replaceHttpToHttps(str)).post(RequestBody.create((MediaType) null, bArr)));
    }

    public static Request.Builder urlPost(String str, String str2) throws XimalayaException {
        if (!ConstantsOpenSdk.isDebug && TextUtils.isEmpty(str)) {
            throw XimalayaException.getExceptionByCode(1001);
        }
        return addCommonCookie(new Request.Builder().url(CommonRequest.replaceHttpToHttps(str)).post(RequestBody.create((MediaType) null, str2)));
    }

    public static RequestBody urlPost(String str, Map<String, File> map, Map<String, String> map2) throws XimalayaException {
        MultipartBody.Builder builder = new MultipartBody.Builder();
        builder.setType(MultipartBody.FORM);
        for (String str2 : map2.keySet()) {
            builder.addPart(Headers.of("Content-Disposition", "form-data; name=\"" + str2 + "\""), RequestBody.create((MediaType) null, map2.get(str2)));
        }
        for (String str3 : map.keySet()) {
            builder.addPart(Headers.of("Content-Disposition", "form-data; name=\"" + str3 + "\"; filename=\"" + map.get(str3).getName() + "\""), RequestBody.create(MediaType.parse(str), map.get(str3)));
        }
        return builder.build();
    }
}
