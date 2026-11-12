package defpackage;

import android.text.TextUtils;
import androidx.core.util.Consumer;
import androidx.media3.datasource.cache.CacheDataSink;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.tabtemplate.BaseTemplateConfig;
import com.huawei.ui.main.stories.template.BaseParser;
import health.compact.a.IoUtils;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class wpd {
    private static final wpd d = new wpd();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f52303a;

    private wpd() {
    }

    public static wpd c() {
        return d;
    }

    public <T extends BaseTemplateConfig> void d(String str, Consumer<T> consumer) {
        this.f52303a = new c(str, -1, consumer);
        ThreadPoolManager.c().execute(this.f52303a);
    }

    public <T extends BaseTemplateConfig> void a(int i, Consumer<T> consumer) {
        this.f52303a = new c(null, i, consumer);
        ThreadPoolManager.c().execute(this.f52303a);
    }

    public static <T extends BaseTemplateConfig> T b(String str) {
        String strOptString;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            strOptString = new JSONObject(str).optString("template_id");
        } catch (JSONException unused) {
            LogUtil.e("ConfigTemplateManager", "createTemplateParser json error");
            strOptString = null;
        }
        wpf wpfVarD = d(strOptString, str);
        if (wpfVarD == null) {
            return null;
        }
        return (T) wpfVarD.b();
    }

    public static String d(InputStream inputStream) {
        try {
            return FileUtils.e(inputStream, CacheDataSink.DEFAULT_FRAGMENT_SIZE);
        } catch (IOException | IllegalStateException unused) {
            LogUtil.e("ConfigTemplateManager", "getString IOException or IllegalStateException");
            return "";
        } finally {
            IoUtils.c(inputStream);
        }
    }

    public static String d(String str) {
        return wpl.b(str, "template_config.json");
    }

    private static <T extends BaseTemplateConfig> wpf<T> d(String str, String str2) {
        BaseParser baseParserA = wpg.a(str);
        if (baseParserA == null) {
            return null;
        }
        return baseParserA.parse(str2);
    }

    public void d() {
        if (this.f52303a != null) {
            ThreadPoolManager.c().e(this.f52303a);
            this.f52303a = null;
        }
    }

    static class c<T> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f52304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Consumer<T> f52305b;
        private String e;

        c(String str, int i, Consumer<T> consumer) {
            this.e = str;
            this.f52304a = i;
            this.f52305b = consumer;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = this.e;
            if (str != null) {
                this.f52305b.accept((T) wpd.b(wpd.d(str)));
            } else if (this.f52304a != -1) {
                this.f52305b.accept((T) wpd.b(wpd.d(BaseApplication.getContext().getResources().openRawResource(this.f52304a))));
            } else {
                LogUtil.j("ConfigTemplateManager", "no case run");
            }
        }
    }
}
