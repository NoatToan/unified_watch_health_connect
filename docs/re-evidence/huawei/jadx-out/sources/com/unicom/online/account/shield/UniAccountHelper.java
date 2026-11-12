package com.unicom.online.account.shield;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.unicom.online.account.kernel.a;
import com.unicom.online.account.kernel.ac;
import com.unicom.online.account.kernel.b;
import com.unicom.online.account.kernel.h;
import com.unicom.online.account.kernel.i;
import com.unicom.online.account.kernel.j;
import com.unicom.online.account.kernel.x;
import io.jsonwebtoken.Claims;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class UniAccountHelper {
    private static final int CU_GET_TOKEN_GM = 3;
    private static final int CU_GET_TOKEN_IT = 2;
    private static final int CU_GET_TOKEN_LOOP = 32;
    private static final int CU_GET_UAID_GM = 25;
    private static final int CU_GET_UAID_IT = 24;
    private static final int CU_GET_UAID_LOOP = 33;
    private static final int CU_MOBILE_AUTH_GM = 5;
    private static final int CU_MOBILE_AUTH_IT = 4;
    private static final int ID_0_STOP_ONCE_SUCCESS = 0;
    private static final int ID_1_STOP_ALL_SEND = 1;
    private static final int LOOP_TYPE_TOKEN = 1;
    private static final int LOOP_TYPE_UAID = 2;
    private static final int LoopMaxNum = 5;
    private static int LoopTypeFlag = 0;
    private static final int SUCCESS = 100;
    private static final boolean enableToken = true;
    private static final boolean enableUAID = false;
    private static int loopNumCommon;
    private static int loopNumToken;
    private static int loopNumUaid;
    private static volatile UniAccountHelper s_instance;
    private Context mContext = null;
    Handler mainHandler;

    private int loopNumAdd(int i) {
        if (i >= 5) {
            return 5;
        }
        if (i <= 1) {
            return 1;
        }
        return i;
    }

    public UniAccountHelper setUseCacheFlag(boolean z) {
        ac.d = z;
        return s_instance;
    }

    public void setLogEnable(boolean z) {
        a.a(z);
        i.a();
        i.a(z);
    }

    public UniAccountHelper setCryptoGM(boolean z) {
        ac.f31143a = z;
        return s_instance;
    }

    public UniAccountHelper setCertFingerType(String str) {
        if (!str.equalsIgnoreCase("MD5") && !str.equalsIgnoreCase("SHA1") && !str.equalsIgnoreCase("SHA256") && !str.equalsIgnoreCase("sm3")) {
            return null;
        }
        ac.e = str.toLowerCase();
        return s_instance;
    }

    public UniAccountHelper setCBinMainThread(boolean z) {
        ac.f = z;
        return s_instance;
    }

    public void releaseNetwork() {
        i.a();
        i.f();
    }

    public UniAccountHelper init(Context context, String str, boolean z) {
        String str2;
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str)) {
            str2 = "初始化参数不能为空";
        } else if (this.mContext != null) {
            str2 = "重复初始化";
        } else {
            this.mContext = context.getApplicationContext();
            if (i.a().a(context, str, str, z)) {
                b.f31175a = str;
                this.mainHandler = new Handler(Looper.getMainLooper());
                return s_instance;
            }
            str2 = "UniAuthHelper.getInstance().init 初始化错误";
        }
        a.b(str2);
        return null;
    }

    public UniAccountHelper init(Context context, String str) {
        return init(context, str, false);
    }

    public boolean getUseCacheFlag() {
        return ac.d;
    }

    public void cuMobileAuth(int i, ResultListener resultListener) {
        cuPreGetToken(i, ac.f31143a ? 5 : 4, "cuPreGetToken", resultListener);
    }

    public void cuGetTokenLoop(int i, int i2, ResultListener resultListener) {
        cuGetTokenLoop(i, ac.f31143a ? 3 : 2, i2, resultListener);
    }

    public void cuGetToken(int i, ResultListener resultListener) {
        cuPreGetToken(i, ac.f31143a ? 3 : 2, "cuPreGetToken", resultListener);
    }

    public String cuDebugInfo(String str) {
        return this.mContext == null ? "sdk 未初始化, context 为空" : i.a().a(str);
    }

    public UniAccountHelper clearCache() {
        if (this.mContext == null) {
            a.a("clearCache sdk未初始化 ---> " + System.currentTimeMillis());
            return null;
        }
        b.a();
        i.a();
        i.c(this.mContext);
        return s_instance;
    }

    private static int setLoopTypeFlag(int i) {
        int i2 = i | LoopTypeFlag;
        LoopTypeFlag = i2;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loopNumCommonMinus() {
        int i;
        int i2 = loopNumCommon;
        if (i2 > 5) {
            i = 4;
        } else {
            i = i2 > 0 ? i2 - 1 : 0;
        }
        loopNumCommon = i;
    }

    private static boolean isInUaidLoop() {
        return (LoopTypeFlag & 2) != 0;
    }

    private static boolean isInTokenLoop() {
        return (LoopTypeFlag & 1) != 0;
    }

    private UniAccountHelper initHostName(String str) {
        i.a();
        if (i.c(str)) {
            return s_instance;
        }
        a.b("初始化参数错误");
        return null;
    }

    private void initFail(int i, ResultListener resultListener, String str, int i2) {
        initFail(i, resultListener, 410021, str, i2);
    }

    private void initFail(int i, ResultListener resultListener, int i2, String str, int i3) {
        a.b("type:" + i + "\nmsg:" + str);
        try {
            String strG = i.g();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("resultCode", i2);
            jSONObject.put("resultMsg", str);
            jSONObject.put("resultData", "");
            jSONObject.put("seq", strG);
            cuResetLoopSrc();
            if (resultListener != null) {
                resultListener.onResult(jSONObject.toString());
            }
            i.a();
            if (i.c()) {
                i.a();
                i.a().b(i.a(1, 1, strG, i2, i3, i2, str));
            }
        } catch (Exception e) {
            a.a(e);
        }
    }

    private UniAccountHelper initCustmType(int i) {
        i.a();
        i.b(i);
        return s_instance;
    }

    private String getSdkVersion() {
        i.a();
        return i.b();
    }

    private static int getLoopTypeFlag() {
        return LoopTypeFlag;
    }

    public static UniAccountHelper getInstance() {
        if (s_instance == null) {
            synchronized (UniAccountHelper.class) {
                if (s_instance == null) {
                    s_instance = new UniAccountHelper();
                }
            }
        }
        return s_instance;
    }

    private String getHostName() {
        i.a();
        return i.d();
    }

    public static String getCertFingerType() {
        return ac.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void cuResetLoopSrc() {
        loopNumCommon = 0;
        loopNumToken = 0;
        loopNumUaid = 0;
        clrLoopTypeFlag();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0094, code lost:
    
        if (r6 > java.lang.System.currentTimeMillis()) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void cuPreGetToken(final int i, final int i2, final String str, final ResultListener resultListener) {
        String strA;
        Context context = this.mContext;
        if (context == null) {
            initFail(i2, resultListener, "sdk未初始化", i);
            return;
        }
        if (!i.b(context.getApplicationContext())) {
            initFail(i2, resultListener, 410004, "数据网络未开启", i);
            return;
        }
        if (getUseCacheFlag()) {
            i iVarA = i.a();
            Context context2 = this.mContext;
            if (str.equals(iVarA.f31193b)) {
                strA = j.a(context2, i.a(i2), str + iVarA.f31194c);
            } else {
                strA = "";
            }
            if (b.e(strA).booleanValue()) {
                try {
                    JSONObject jSONObject = new JSONObject(strA);
                    int i3 = jSONObject.getInt("resultCode");
                    try {
                        jSONObject.getInt("type");
                    } catch (Exception unused) {
                    }
                    if (cuIsToken(2)) {
                        long j = jSONObject.getJSONObject("resultData").getLong(Claims.EXPIRATION);
                        if (i3 == 100 && j > System.currentTimeMillis()) {
                            resultListener.onResult(strA);
                            return;
                        }
                    } else if (cuIsUaid(2)) {
                        long j2 = jSONObject.getLong(Claims.EXPIRATION);
                        if (i3 == 100) {
                        }
                    }
                } catch (Exception unused2) {
                }
            }
        }
        i.a();
        if (!i.a(this.mContext)) {
            initFail(i2, resultListener, 410025, "操作频繁,请稍后再试", i);
            return;
        }
        if (!str.equals("cuPreGetToken")) {
            initFail(i2, resultListener, "sdk参数错误", i);
            return;
        }
        if (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) {
            i iVarA2 = i.a();
            h hVar = new h() { // from class: com.unicom.online.account.shield.UniAccountHelper.4
                /* JADX WARN: Code duplicated, block: B:26:0x00ba  */
                @Override // com.unicom.online.account.kernel.h
                public void onResult(String str2) {
                    int i4;
                    int i5;
                    int i6;
                    String strA2;
                    i.a();
                    boolean zC = i.c();
                    try {
                        final JSONObject jSONObject2 = new JSONObject(str2);
                        String strOptString = jSONObject2.optString("seq");
                        b.d(strOptString);
                        int i7 = jSONObject2.getInt("resultCode");
                        String string = jSONObject2.getString("resultMsg");
                        if (i7 == 100) {
                            JSONObject jSONObject3 = jSONObject2.getJSONObject("resultData");
                            b.b(jSONObject3.optString("fakeMobile"));
                            b.c(jSONObject3.optString("accessCode"));
                            b.b(jSONObject3.getLong(Claims.EXPIRATION));
                            b.a(System.currentTimeMillis());
                            String strOptString2 = jSONObject2.optString("operator");
                            if (!TextUtils.isEmpty(strOptString2)) {
                                b.a(strOptString2);
                            }
                            int i8 = i2;
                            if (4 == i8 || 5 == i8) {
                                jSONObject3.put("fakeMobile", (Object) null);
                            }
                            if (UniAccountHelper.this.getUseCacheFlag()) {
                                i.a().a(UniAccountHelper.this.mContext, i2);
                                i.a().a(UniAccountHelper.this.mContext, i2, str, jSONObject2.toString());
                            }
                            if (zC) {
                                i.a();
                                i5 = 0;
                                i4 = 0;
                                i6 = i;
                                strA2 = i.a(i5, i4, strOptString, i7, i6, i7, string);
                            } else {
                                strA2 = "";
                            }
                        } else if (zC) {
                            i4 = i7 == 410000 ? 2 : 3;
                            i.a();
                            i5 = 1;
                            i6 = i;
                            strA2 = i.a(i5, i4, strOptString, i7, i6, i7, string);
                        } else {
                            strA2 = "";
                        }
                        a.b(jSONObject2.toString());
                        if (UniAccountHelper.this.mainHandler == null || !ac.f) {
                            resultListener.onResult(jSONObject2.toString());
                        } else {
                            UniAccountHelper.this.mainHandler.post(new Runnable() { // from class: com.unicom.online.account.shield.UniAccountHelper.4.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    resultListener.onResult(jSONObject2.toString());
                                }
                            });
                        }
                        if (zC) {
                            i.a().b(strA2);
                        }
                    } catch (JSONException e) {
                        a.a(e);
                    }
                }
            };
            if (iVarA2.a("cuPreGetToken", i, i2, hVar)) {
                new x().a(iVarA2.f31192a, i, i2, hVar);
                return;
            }
            return;
        }
        if (i2 != 24 && i2 != 25) {
            initFail(i2, resultListener, "sdk type 参数错误", i);
            return;
        }
        i iVarA3 = i.a();
        h hVar2 = new h() { // from class: com.unicom.online.account.shield.UniAccountHelper.3
            @Override // com.unicom.online.account.kernel.h
            public void onResult(String str2) {
                try {
                    final JSONObject jSONObject2 = new JSONObject(str2);
                    b.d(jSONObject2.optString("seq"));
                    if (jSONObject2.getInt("resultCode") == 100 && UniAccountHelper.this.getUseCacheFlag()) {
                        i.a().a(UniAccountHelper.this.mContext, i2);
                        i.a().a(UniAccountHelper.this.mContext, i2, str, jSONObject2.toString());
                    }
                    a.b(jSONObject2.toString());
                    if (UniAccountHelper.this.mainHandler == null || !ac.f) {
                        resultListener.onResult(jSONObject2.toString());
                    } else {
                        UniAccountHelper.this.mainHandler.post(new Runnable() { // from class: com.unicom.online.account.shield.UniAccountHelper.3.1
                            @Override // java.lang.Runnable
                            public void run() {
                                resultListener.onResult(jSONObject2.toString());
                            }
                        });
                    }
                } catch (JSONException e) {
                    a.a(e);
                }
            }
        };
        if (iVarA3.a("cuPreGetUAID", i, i2, hVar2)) {
            new x().a(iVarA3.f31192a, i, i2, hVar2);
        }
    }

    private static boolean cuIsUaid(int i) {
        return ac.b(i);
    }

    private static boolean cuIsToken(int i) {
        return ac.a(i);
    }

    private void cuGetUaidLoop(int i, int i2, ResultListener resultListener) {
        initFail(0, resultListener, 410022, "不支持该服务", i2);
    }

    private void cuGetUaidLoop(int i, int i2, int i3, ResultListener resultListener) {
        initFail(i2, resultListener, 410022, "不支持该服务", i3);
    }

    private void cuGetUaid(int i, ResultListener resultListener) {
        initFail(0, resultListener, 410022, "不支持该服务", i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cuGetTokenUaidLoopCommon(final int i, final int i2, final int i3, final ResultListener resultListener) {
        if (loopNumCommon == 0) {
            cuResetLoopSrc();
        } else {
            cuPreGetToken(i3, i2, "cuPreGetToken", i != 1 ? new ResultListener() { // from class: com.unicom.online.account.shield.UniAccountHelper.1
                @Override // com.unicom.online.account.shield.ResultListener
                public void onResult(String str) {
                    try {
                        UniAccountHelper.this.loopNumCommonMinus();
                        JSONObject jSONObject = new JSONObject(str);
                        b.d(jSONObject.optString("seq"));
                        int i4 = jSONObject.getInt("resultCode");
                        jSONObject.put("type", i2);
                        if (i4 != 100 && UniAccountHelper.loopNumCommon != 0) {
                            if (UniAccountHelper.loopNumCommon > 0) {
                                UniAccountHelper.this.cuGetTokenUaidLoopCommon(i, i2, i3, resultListener);
                            }
                        } else {
                            UniAccountHelper.cuResetLoopSrc();
                            resultListener.onResult(str);
                        }
                    } catch (JSONException e) {
                        a.a(e);
                    }
                }
            } : new ResultListener() { // from class: com.unicom.online.account.shield.UniAccountHelper.2
                @Override // com.unicom.online.account.shield.ResultListener
                public void onResult(String str) {
                    try {
                        UniAccountHelper.this.loopNumCommonMinus();
                        JSONObject jSONObject = new JSONObject(str);
                        b.d(jSONObject.optString("seq"));
                        jSONObject.put("type", i2);
                        resultListener.onResult(str);
                        if (UniAccountHelper.loopNumCommon != 0) {
                            if (UniAccountHelper.loopNumCommon > 0) {
                                UniAccountHelper.this.cuGetTokenUaidLoopCommon(i, i2, i3, resultListener);
                                return;
                            }
                            return;
                        }
                        UniAccountHelper.cuResetLoopSrc();
                    } catch (JSONException e) {
                        a.a(e);
                    }
                }
            });
        }
    }

    private void cuGetTokenLoop(int i, int i2, int i3, ResultListener resultListener) {
        a.a("cuGetTokenLoop ---> " + System.currentTimeMillis());
        if (isInUaidLoop()) {
            initFail(i2, resultListener, 410023, "取号服务中，勿重复调用", i3);
            return;
        }
        if (isInTokenLoop()) {
            initFail(i2, resultListener, 410023, "取号服务中，勿重复调用", i3);
            return;
        }
        setLoopTypeFlag(1);
        int iLoopNumAdd = loopNumToken + loopNumAdd(i);
        loopNumToken = iLoopNumAdd;
        loopNumCommon = iLoopNumAdd;
        cuGetTokenUaidLoopCommon(0, i2, i3, resultListener);
    }

    private static int clrLoopTypeFlag() {
        LoopTypeFlag = 0;
        return 0;
    }

    private UniAccountHelper clearCache_one(int i) {
        if (this.mContext != null) {
            b.a();
            i.a().a(this.mContext, i);
            return s_instance;
        }
        a.a("clearCache sdk未初始化 ---> " + System.currentTimeMillis());
        return null;
    }

    private UniAccountHelper() {
    }
}
