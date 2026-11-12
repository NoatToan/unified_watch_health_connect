package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.bundle.AppBundlePluginProxy;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsport.multilingualaudio.MultilingualAudioApi;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes15.dex */
public class pqj extends AppBundlePluginProxy<MultilingualAudioApi> implements MultilingualAudioApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<Locale> f45834a = Arrays.asList(Locale.GERMAN, Locale.ITALIAN, Locale.FRENCH, Locale.JAPAN);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<String> f45835c = Arrays.asList("pl", "es", "es-US", "ar", "tr", "ru", "ms", "th");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private pqp f45836b;
    private MultilingualAudioApi d;
    private String e;

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final pqj f45837a = new pqj();
    }

    private pqj() {
        super("MultilingualAudioProxy", "MultilingualAudio", "com.huawei.health.multilingualaudio.urlgenerator.MultilingualAudioUrlGenerator");
        this.e = "default";
        LogUtil.a("MultilingualAudioProxy", "MultilingualAudioProxy()");
        this.d = createPluginApi();
    }

    public static pqj b() {
        return d.f45837a;
    }

    public boolean b(Context context) {
        if (context == null) {
            return false;
        }
        return e(e());
    }

    public boolean b(Context context, String str) {
        String strE = e();
        LogUtil.a("MultilingualAudioProxy", "languageName= ", strE);
        if (e(strE) && c(strE, str)) {
            return pqq.b(strE, str);
        }
        return false;
    }

    public static String e() {
        String strB = pjn.b(null);
        if (!TextUtils.isEmpty(strB)) {
            return strB;
        }
        LogUtil.a("MultilingualAudioProxy", "getSupportLanguageName is null");
        return LanguageUtil.a(BaseApplication.getContext().getResources().getConfiguration().locale);
    }

    private boolean c(String str, String str2) {
        return new File(pqq.e(str, str2)).exists();
    }

    public boolean e(String str) {
        Iterator<Locale> it = f45834a.iterator();
        while (it.hasNext()) {
            if (it.next().getLanguage().equals(str)) {
                return true;
            }
        }
        Iterator<String> it2 = f45835c.iterator();
        while (it2.hasNext()) {
            if (it2.next().equals(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.huawei.pluginsport.multilingualaudio.MultilingualAudioApi
    public void init(pqp pqpVar) {
        this.f45836b = pqpVar;
        if (this.d == null) {
            LogUtil.j("MultilingualAudioProxy", "api is null");
            this.d = createPluginApi();
        } else {
            LogUtil.a("MultilingualAudioProxy", "init api");
            this.d.init(pqpVar);
        }
    }

    @Override // com.huawei.pluginsport.multilingualaudio.MultilingualAudioApi
    public List<String> getScenarioAudioPaths(String str, pqk pqkVar) {
        pqp pqpVar;
        LogUtil.a("MultilingualAudioProxy", "audioId ", str, " Api = null is ", Boolean.valueOf(this.d == null));
        MultilingualAudioApi multilingualAudioApi = this.d;
        if (multilingualAudioApi == null) {
            this.d = createPluginApi();
            return Collections.EMPTY_LIST;
        }
        if (!multilingualAudioApi.isInitSuccess() && (pqpVar = this.f45836b) != null) {
            this.d.init(pqpVar);
        }
        return this.d.getScenarioAudioPaths(str, pqkVar);
    }

    @Override // com.huawei.pluginsport.multilingualaudio.MultilingualAudioApi
    public void release() {
        MultilingualAudioApi multilingualAudioApi = this.d;
        if (multilingualAudioApi == null) {
            return;
        }
        multilingualAudioApi.release();
    }

    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    public boolean isPluginAvaiable() {
        return this.d != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void initialize(MultilingualAudioApi multilingualAudioApi) {
        LogUtil.a("MultilingualAudioProxy", "initialize() pluginApi: ", multilingualAudioApi);
        this.d = multilingualAudioApi;
    }

    public void b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("MultilingualAudioProxy", "language or speaker is null ");
            return;
        }
        this.e = str2;
        SharedPreferenceManager.c(String.valueOf(101010), "multilingual_key_speaker" + str, str2);
    }

    public String d(String str) {
        if ("default".equals(this.e)) {
            this.e = SharedPreferenceManager.b(String.valueOf(101010), "multilingual_key_speaker" + str, "");
        }
        LogUtil.a("MultilingualAudioProxy", "mSpeaker = ", this.e);
        return this.e;
    }

    public boolean c() {
        return ("ar".equals(e()) || Locale.JAPAN.getLanguage().equals(e())) ? false : true;
    }
}
