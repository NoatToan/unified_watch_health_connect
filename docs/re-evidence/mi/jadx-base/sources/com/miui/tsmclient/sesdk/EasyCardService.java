package com.miui.tsmclient.sesdk;

import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.net.AuthApiException;
import com.miui.tsmclient.sesdk.easycard.EasyCardClient;
import com.miui.tsmclient.util.EnvironmentConfig;
import com.miui.tsmclient.util.LogUtils;
import r.a;

/* JADX INFO: loaded from: classes6.dex */
public class EasyCardService {
    public BaseResponse invoke(String str, String str2) {
        int i;
        String message = "";
        if (str2 == null) {
            str2 = "";
        }
        try {
            return new EasyCardClient().invoke(EnvironmentConfig.getContext(), str, str2);
        } catch (AuthApiException e) {
            LogUtils.e("invoke task with exception.", e);
            message = e.getMessage();
            i = 7;
            return new BaseResponse(i, message, new Object[0]);
        } catch (InterruptedException e2) {
            LogUtils.e("invoke task with exception.", e2);
            Thread.currentThread().interrupt();
            i = 11;
            return new BaseResponse(i, message, new Object[0]);
        } catch (a e3) {
            LogUtils.e("invoke task with exception.", e3);
            int iA = e3.a();
            message = e3.getMessage();
            i = iA;
            return new BaseResponse(i, message, new Object[0]);
        }
    }
}
