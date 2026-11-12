package com.huawei.ui.main.stories.health.util;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.alipay.sdk.m.s.e;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.annotations.SerializedName;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.superrule.FireCallback;
import com.huawei.health.superrule.SuperRule;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.health.util.BloodSugarSuperRuleEngineUtil;
import defpackage.vcy;
import health.compact.a.utils.StringUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class BloodSugarSuperRuleEngineUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private vcy f28164a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f28166c;
    private volatile SuperRule d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f28165b = new Handler(Looper.getMainLooper());
    private final List<a> e = new LinkedList();

    public interface BloodSugarFactCallBack {
        void onFactCallback(boolean z, String str, String[] strArr);
    }

    public interface LoadJsCallBack {
        void onLoad(boolean z);
    }

    public BloodSugarSuperRuleEngineUtil(Context context) {
        this.f28166c = context.getApplicationContext();
    }

    public void d(final LoadJsCallBack loadJsCallBack) {
        if (this.d == null) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: vcm
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.b(loadJsCallBack);
                }
            });
        } else {
            this.f28165b.post(new Runnable() { // from class: vcn
                @Override // java.lang.Runnable
                public final void run() {
                    BloodSugarSuperRuleEngineUtil.e(loadJsCallBack);
                }
            });
        }
    }

    public static /* synthetic */ void e(LoadJsCallBack loadJsCallBack) {
        if (loadJsCallBack != null) {
            loadJsCallBack.onLoad(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(final LoadJsCallBack loadJsCallBack) {
        if (this.f28164a == null) {
            this.f28164a = new vcy();
        }
        this.f28164a.b(new UpDataFileListener() { // from class: vcq
            @Override // com.huawei.ui.main.stories.health.util.UpDataFileListener
            public final void onFinish() {
                this.e.a(loadJsCallBack);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void a(final LoadJsCallBack loadJsCallBack) {
        final String strB = b();
        this.f28165b.post(new Runnable() { // from class: vcl
            @Override // java.lang.Runnable
            public final void run() {
                this.f50935a.a(strB, loadJsCallBack);
            }
        });
    }

    public /* synthetic */ void a(String str, LoadJsCallBack loadJsCallBack) {
        if (!StringUtils.j(str)) {
            if (loadJsCallBack != null) {
                loadJsCallBack.onLoad(false);
            }
        } else {
            if (this.d == null) {
                this.d = new SuperRule(this.f28166c);
                this.d.a(str);
            }
            if (loadJsCallBack != null) {
                loadJsCallBack.onLoad(true);
            }
        }
    }

    private String b() {
        String strD;
        File fileA = this.f28164a.a();
        if (fileA != null) {
            try {
                strD = d(new FileInputStream(fileA));
            } catch (FileNotFoundException unused) {
                LogUtil.j("BloodSugarSuperRuleEngineUtil", "not down BloodSugarSuperRuleFile");
                strD = null;
            }
        } else {
            strD = null;
        }
        if (!StringUtils.g(strD)) {
            return strD;
        }
        try {
            return d(this.f28166c.getAssets().open("superrule/BloodSugarAnalyze.js"));
        } catch (IOException unused2) {
            LogUtil.e("BloodSugarSuperRuleEngineUtil", "not exists assets BloodSugarSuperRuleFile");
            return strD;
        }
    }

    private String d(InputStream inputStream) {
        String str = "";
        try {
            if (inputStream == null) {
                return "";
            }
            try {
                byte[] bArr = new byte[inputStream.available()];
                if (inputStream.read(bArr) > 0) {
                    str = new String(bArr, StandardCharsets.UTF_8);
                }
            } catch (IOException unused) {
                LogUtil.e("BloodSugarSuperRuleEngineUtil", "failed to read BloodSugarSuperRuleFile");
            }
            return str;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                LogUtil.e("BloodSugarSuperRuleEngineUtil", "failed to close BloodSugarSuperRuleFile");
            }
        }
    }

    public void e(int i, float f, float f2, BloodSugarFactCallBack bloodSugarFactCallBack) {
        b bVar = new b();
        bVar.d = i;
        bVar.e = f;
        bVar.f28168a = f2;
        e(bVar, bloodSugarFactCallBack);
    }

    public void a(float f, float f2, BloodSugarFactCallBack bloodSugarFactCallBack) {
        d dVar = new d();
        dVar.e = f;
        dVar.f28168a = f2;
        e(dVar, bloodSugarFactCallBack);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void e(final c cVar, final BloodSugarFactCallBack bloodSugarFactCallBack) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.f28165b.post(new Runnable() { // from class: vco
                @Override // java.lang.Runnable
                public final void run() {
                    this.f50940b.e(cVar, bloodSugarFactCallBack);
                }
            });
            return;
        }
        String json = new Gson().toJson(cVar);
        LogUtil.a("BloodSugarSuperRuleEngineUtil", "fact = ", json);
        this.e.add(new a(json, bloodSugarFactCallBack));
        if (this.e.size() == 1) {
            d(json, bloodSugarFactCallBack);
        }
    }

    private void c() {
        this.f28165b.post(new Runnable() { // from class: vcj
            @Override // java.lang.Runnable
            public final void run() {
                this.d.e();
            }
        });
    }

    public /* synthetic */ void e() {
        this.e.remove(0);
        if (this.e.isEmpty()) {
            return;
        }
        a aVar = this.e.get(0);
        d(aVar.f28167c, aVar.d);
    }

    private void d(String str, final BloodSugarFactCallBack bloodSugarFactCallBack) {
        this.d.c(str, new FireCallback() { // from class: vck
            @Override // com.huawei.health.superrule.FireCallback
            public final void onReceiveValue(Object obj) {
                this.f50934c.d(bloodSugarFactCallBack, (String) obj);
            }
        });
    }

    public /* synthetic */ void d(BloodSugarFactCallBack bloodSugarFactCallBack, String str) {
        boolean asBoolean;
        String[] strArrC;
        JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
        JsonElement jsonElement = asJsonObject.get("matched");
        String asString = null;
        if (jsonElement != null) {
            asBoolean = jsonElement.getAsBoolean();
            asString = asJsonObject.get("suggestion") != null ? asJsonObject.get("suggestion").getAsString() : null;
            strArrC = c(asJsonObject);
            LogUtil.a("BloodSugarSuperRuleEngineUtil", "suggestion = ", asString);
        } else {
            asBoolean = false;
            strArrC = null;
        }
        bloodSugarFactCallBack.onFactCallback(asBoolean, asString, strArrC);
        c();
    }

    private String[] c(JsonObject jsonObject) {
        if (jsonObject.get(e.n) == null) {
            return new String[0];
        }
        String asString = jsonObject.get(e.n).getAsString();
        if (StringUtils.g(asString)) {
            return new String[0];
        }
        return asString.split(",");
    }

    static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f28167c;
        public BloodSugarFactCallBack d;

        a(String str, BloodSugarFactCallBack bloodSugarFactCallBack) {
            this.f28167c = str;
            this.d = bloodSugarFactCallBack;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("afterBloodSugar")
        float f28168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("type")
        int f28169b;

        @SerializedName("beforeBloodSugar")
        float e;

        private c() {
        }
    }

    static class b extends c {

        @SerializedName("mealType")
        int d;

        b() {
            super();
            this.f28169b = 0;
        }
    }

    static class d extends c {
        d() {
            super();
            this.f28169b = 1;
        }
    }
}
