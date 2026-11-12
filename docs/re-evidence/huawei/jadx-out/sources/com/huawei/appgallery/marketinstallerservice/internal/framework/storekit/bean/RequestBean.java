package com.huawei.appgallery.marketinstallerservice.internal.framework.storekit.bean;

import android.content.Context;
import android.os.Build;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.appgallery.marketinstallerservice.b.b.f.a;
import defpackage.bij;
import defpackage.bim;
import defpackage.bin;
import defpackage.biq;
import defpackage.bir;
import defpackage.biy;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public abstract class RequestBean {
    public static final int CHINA = 0;
    public static final int GLOBAL = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f5237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f5238b;

    @InstallerNetTransmission
    public String brand;

    @InstallerNetTransmission
    private String buildNumber;

    @InstallerNetTransmission
    private String code;

    @InstallerNetTransmission
    private String density;

    @InstallerNetTransmission
    private int deviceType;

    @InstallerNetTransmission
    private int emuiApiLevel;

    @InstallerNetTransmission
    private String emuiVer;

    @InstallerNetTransmission
    private int firmwareVersion;

    @InstallerNetTransmission
    private int international;

    @InstallerNetTransmission
    private String lang;

    @InstallerNetTransmission
    public int magicApiLevel;

    @InstallerNetTransmission
    public String magicVer;

    @InstallerNetTransmission
    private String manufacturer;

    @InstallerNetTransmission
    private String method;

    /* JADX INFO: renamed from: net, reason: collision with root package name */
    @InstallerNetTransmission
    private int f5239net;

    @InstallerNetTransmission
    private int odm;

    @InstallerNetTransmission
    private String phoneType;

    @InstallerNetTransmission
    private String sdkVersion;

    @InstallerNetTransmission
    private String subsystem;

    @InstallerNetTransmission
    private int sysBits;

    @InstallerNetTransmission
    private long ts;

    @InstallerNetTransmission
    private String ver;

    public void setVer(String str) {
        this.ver = str;
    }

    public void setTs(long j) {
        this.ts = j;
    }

    public void setSysBits(int i) {
        this.sysBits = i;
    }

    public void setSubsystem(String str) {
        this.subsystem = str;
    }

    public void setServiceUrl(String str) {
        this.f5238b = str;
    }

    public void setSdkVersion(String str) {
        this.sdkVersion = str;
    }

    public void setPhoneType(String str) {
        this.phoneType = str;
    }

    public void setOdm(int i) {
        this.odm = i;
    }

    public void setNet(int i) {
        this.f5239net = i;
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public void setManufacturer(String str) {
        this.manufacturer = str;
    }

    public void setMagicVer(String str) {
        this.magicVer = str;
    }

    public void setMagicApiLevel(int i) {
        this.magicApiLevel = i;
    }

    public void setLang(String str) {
        this.lang = str;
    }

    public void setInternational(int i) {
        this.international = i;
    }

    public void setFirmwareVersion(int i) {
        this.firmwareVersion = i;
    }

    public void setEmuiVer(String str) {
        this.emuiVer = str;
    }

    public void setEmuiApiLevel(int i) {
        this.emuiApiLevel = i;
    }

    public void setDeviceType(int i) {
        this.deviceType = i;
    }

    public void setDensity(String str) {
        this.density = str;
    }

    public void setContext(Context context) {
        this.f5237a = context;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setBuildNumber(String str) {
        this.buildNumber = str;
    }

    public void setBrand(String str) {
        this.brand = str;
    }

    public String getVer() {
        return this.ver;
    }

    public long getTs() {
        return this.ts;
    }

    public int getSysBits() {
        return this.sysBits;
    }

    public String getSubsystem() {
        return this.subsystem;
    }

    public String getServiceUrl() {
        return this.f5238b;
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public ResponseBean getResponseBean() {
        return new ResponseBean();
    }

    public String getPhoneType() {
        return this.phoneType;
    }

    public int getOdm() {
        return this.odm;
    }

    public int getNet() {
        return this.f5239net;
    }

    public String getMethod() {
        return this.method;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public String getMagicVer() {
        return this.magicVer;
    }

    public int getMagicApiLevel() {
        return this.magicApiLevel;
    }

    public String getLang() {
        return this.lang;
    }

    public int getInternational() {
        return this.international;
    }

    public int getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public String getEmuiVer() {
        return this.emuiVer;
    }

    public int getEmuiApiLevel() {
        return this.emuiApiLevel;
    }

    public int getDeviceType() {
        return this.deviceType;
    }

    public String getDensity() {
        return this.density;
    }

    public Context getContext() {
        return this.f5237a;
    }

    public String getCode() {
        return this.code;
    }

    public String getBuildNumber() {
        return this.buildNumber;
    }

    public String getBrand() {
        return this.brand;
    }

    public String genBody() {
        String strA;
        b();
        Map<String, Field> mapA = a();
        int size = mapA.size();
        String[] strArr = new String[size];
        mapA.keySet().toArray(strArr);
        Arrays.sort(strArr);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        do {
            Field field = mapA.get(strArr[i]);
            if (field != null && (strA = a(field)) != null) {
                String strA2 = com.huawei.appgallery.marketinstallerservice.b.b.b.b.a(strA);
                sb.append(strArr[i]);
                sb.append('=');
                sb.append(strA2);
                sb.append('&');
            }
            i++;
        } while (i < size);
        int length = sb.length();
        if (length > 0) {
            int i2 = length - 1;
            if (sb.charAt(i2) == '&') {
                sb.deleteCharAt(i2);
            }
        }
        return sb.toString();
    }

    protected void b() {
        this.f5239net = biq.c(this.f5237a);
        this.ts = System.currentTimeMillis();
        this.emuiVer = bim.e().a();
        this.emuiApiLevel = bim.e().c();
    }

    protected Map<String, Field> a() {
        HashMap map = new HashMap();
        for (Field field : a.a(getClass())) {
            if (field.isAnnotationPresent(InstallerNetTransmission.class)) {
                map.put(field.getName(), field);
            }
        }
        return map;
    }

    protected String a(Field field) throws IllegalAccessException {
        StringBuilder sb;
        Object objInvoke;
        String strB = biy.b(field.getName(), TypedValues.Custom.S_BOOLEAN.equals(field.getType().getName()));
        if (strB == null) {
            bir.d("RequestBean", "getValue:Can not find getMethod:" + field.getName());
            return null;
        }
        try {
            objInvoke = getClass().getMethod(strB, new Class[0]).invoke(this, new Object[0]);
        } catch (NoSuchMethodException unused) {
            sb = new StringBuilder("getValue:Can not find getMethod:");
            sb.append(field.getName());
            bir.d("RequestBean", sb.toString());
            objInvoke = null;
        } catch (SecurityException unused2) {
            sb = new StringBuilder("getValue:GetMethod can not access:");
            sb.append(field.getName());
            bir.d("RequestBean", sb.toString());
            objInvoke = null;
        } catch (InvocationTargetException unused3) {
            sb = new StringBuilder("getValue:GetMethod can not invocation:");
            sb.append(field.getName());
            bir.d("RequestBean", sb.toString());
            objInvoke = null;
        }
        if (objInvoke instanceof JsonBean) {
            return ((JsonBean) objInvoke).toJson();
        }
        if (objInvoke instanceof List) {
            return JsonBean.listToJson((List) objInvoke);
        }
        if (objInvoke instanceof Array) {
            return JsonBean.arrayToJson((Array) objInvoke);
        }
        if (objInvoke instanceof Map) {
            return JsonBean.mapToJson((Map) objInvoke);
        }
        if (objInvoke != null) {
            return String.valueOf(objInvoke);
        }
        return null;
    }

    public RequestBean(Context context) {
        this.code = "0500";
        this.ver = "8.0";
        this.emuiApiLevel = 0;
        this.international = 0;
        this.manufacturer = Build.MANUFACTURER;
        this.odm = 0;
        this.f5238b = "";
        this.brand = Build.BRAND;
        this.f5237a = context;
        this.firmwareVersion = bij.i();
        this.density = bij.c(context);
        this.phoneType = bij.e();
        this.buildNumber = bij.d();
        this.lang = bin.c();
        this.sysBits = bij.g();
        this.deviceType = bij.b(context);
        this.international = bin.e() ? 1 : 0;
        if (bij.j()) {
            this.odm = 1;
        }
        this.sdkVersion = "11.5.1.300";
        this.magicVer = bij.b();
        this.magicApiLevel = bij.a();
    }

    public RequestBean() {
        this.code = "0500";
        this.ver = "8.0";
        this.emuiApiLevel = 0;
        this.international = 0;
        this.manufacturer = Build.MANUFACTURER;
        this.odm = 0;
        this.f5238b = "";
        this.brand = Build.BRAND;
    }
}
