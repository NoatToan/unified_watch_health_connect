package com.xmlywind.sdk.base.common;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.text.TextUtils;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.base.models.AppInfo;
import com.xmlywind.sdk.common.models.ADStrategy;
import com.xmlywind.sdk.common.models.SigmobError;
import com.xmlywind.sdk.common.models.sigdsp.pb.Ad;
import com.xmlywind.sdk.common.models.ssp.pb.Strategy;
import com.xmlywind.sdk.common.mta.PointCategory;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes22.dex */
public class c {
    public static SigmobError a(Context context) {
        String str;
        int i;
        String str2 = "";
        SigmobError sigmobError = null;
        if (context == null) {
            return null;
        }
        try {
            SigmobLog.e("checkActivity: " + AdActivity.class.getName());
            context.getPackageManager().getActivityInfo(new ComponentName(context, (Class<?>) AdActivity.class), 128);
        } catch (PackageManager.NameNotFoundException e) {
            SigmobLog.e("checkActivity: " + e.getMessage());
            return SigmobError.ERROR_LOAD_FILTER_FOR_ACTIVITY_ERROR;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            if (context.getApplicationInfo().targetSdkVersion >= 26) {
                String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
                String str3 = "";
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    if (strArr[i2].equals("android.permission.REQUEST_INSTALL_PACKAGES")) {
                        str3 = strArr[i2];
                    }
                }
                if (TextUtils.isEmpty(str3)) {
                    return SigmobError.ERROR_LOAD_FILTER_FOR_INSTALL_PERMISSION_ERROR;
                }
            }
        } catch (Throwable th2) {
            SigmobLog.e("checkPermission: " + th2.getMessage());
        }
        try {
            if (!Ad.class.getName().endsWith("sdk.common.models.sigdsp.pb.Ad")) {
                SigmobLog.e("checkProguard Ad: " + Ad.class.getName());
            } else if (!Strategy.class.getName().endsWith("sdk.common.models.ssp.pb.Strategy")) {
                SigmobLog.e("checkProguard Strategy: " + Strategy.class.getName());
            } else if (!ADStrategy.class.getName().endsWith("sdk.common.models.ADStrategy")) {
                SigmobLog.e("checkProguard ADStrategy: " + ADStrategy.class.getName());
            } else {
                if (PointCategory.class.getName().endsWith("sdk.common.mta.PointCategory")) {
                    if (!AppInfo.class.getName().endsWith("sdk.base.models.AppInfo")) {
                        SigmobLog.e("checkProguard AppInfo: " + AppInfo.class.getName());
                    }
                    try {
                        String packageName = context.getPackageName();
                        ProviderInfo[] providerInfoArr = context.getPackageManager().getPackageInfo(packageName, 8).providers;
                        if (providerInfoArr != null) {
                            int length = providerInfoArr.length;
                            int i3 = 0;
                            while (true) {
                                if (i3 >= length) {
                                    str = "";
                                } else {
                                    ProviderInfo providerInfo = providerInfoArr[i3];
                                    str = providerInfo.authority;
                                    if (str != null) {
                                        if (str.equals(packageName + ".sigprovider")) {
                                            Bundle bundle = context.getPackageManager().getProviderInfo(new ComponentName(context, providerInfo.name), 128).metaData;
                                            i = bundle != null ? bundle.getInt("android.support.FILE_PROVIDER_PATHS") : -1;
                                        }
                                    }
                                    i3++;
                                }
                            }
                        } else {
                            str = "";
                        }
                        SigmobLog.e("check targetAuthority:" + str + " xml :" + i);
                        if (TextUtils.isEmpty(str)) {
                            return SigmobError.ERROR_LOAD_FILTER_FOR_PROVIDER_ERROR;
                        }
                        if (i != -1) {
                            XmlResourceParser xml = context.getResources().getXml(i);
                            String attributeValue = "";
                            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                                if (eventType == 2) {
                                    if (xml.getName().equals("external-cache-path") && xml.getAttributeCount() >= 2) {
                                        String attributeValue2 = xml.getAttributeValue(0);
                                        attributeValue = xml.getAttributeValue(1);
                                        str2 = attributeValue2;
                                    }
                                } else if (eventType != 0) {
                                }
                            }
                            if (str2.equals("SigMob_root") && attributeValue.equals("SigDownload")) {
                                SigmobLog.e("check name: " + str2 + " path :" + attributeValue);
                                return sigmobError;
                            }
                        }
                        return SigmobError.ERROR_LOAD_FILTER_FOR_PROVIDER_XML_ERROR;
                    } catch (PackageManager.NameNotFoundException e2) {
                        e2.printStackTrace();
                        return sigmobError;
                    } catch (XmlPullParserException e3) {
                        e3.printStackTrace();
                        return sigmobError;
                    } catch (Exception e4) {
                        e4.printStackTrace();
                        return sigmobError;
                    }
                }
                SigmobLog.e("checkProguard PointCategory: " + PointCategory.class.getName());
            }
            sigmobError = SigmobError.ERROR_LOAD_FILTER_FOR_PROGUARD_ERROR;
            return sigmobError;
        } catch (Throwable th3) {
            SigmobLog.e("checkProguard: " + th3.getMessage());
        }
    }
}
