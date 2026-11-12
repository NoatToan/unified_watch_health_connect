package defpackage;

import android.text.TextUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.pluginmgr.EzPluginConfigBase;
import com.huawei.pluginmgr.EzPluginType;
import com.huawei.pluginmgr.filedownload.PullListener;
import health.compact.a.LogUtil;
import java.io.File;
import java.io.FilenameFilter;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EzPluginConfigBase f45408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f45409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private pio f45410c;
    private boolean d;
    private String e;

    public pia(EzPluginType ezPluginType, String str) {
        this(new pin(ezPluginType, str));
    }

    public pia(EzPluginConfigBase ezPluginConfigBase) {
        if (ezPluginConfigBase == null) {
            throw new IllegalArgumentException("config == null");
        }
        this.f45408a = ezPluginConfigBase;
        h();
    }

    public void h() {
        j(null);
    }

    public EzPluginConfigBase b() {
        return this.f45408a;
    }

    private void j(String str) {
        if (TextUtils.isEmpty(str)) {
            str = g(null);
        }
        this.e = str;
        this.f45409b = null;
        this.d = false;
    }

    public String a() {
        return this.e;
    }

    private String g(String str) {
        if (TextUtils.isEmpty(str)) {
            str = phs.f45394c;
        }
        return str + this.f45408a.getPluginConfigId();
    }

    private List<phz> j() {
        pio pioVar = this.f45410c;
        if (pioVar != null) {
            return pioVar.c();
        }
        return null;
    }

    public String e(String str, String str2) {
        String strG = g(str);
        if (TextUtils.isEmpty(str2)) {
            str2 = this.f45408a.getPluginQueryString(null);
        }
        if (!TextUtils.isEmpty(str2)) {
            StringBuilder sb = new StringBuilder(128);
            sb.append(strG);
            sb.append('?');
            sb.append(str2);
            strG = sb.toString();
        }
        if (this.e.compareToIgnoreCase(strG) != 0) {
            j(strG);
        }
        return str2;
    }

    public void e(String str) {
        this.f45409b = str;
    }

    public void d(boolean z) {
        this.d = z;
    }

    public boolean d() {
        return this.d;
    }

    public void a(PullListener pullListener) {
        phy phyVar = new phy();
        phyVar.d(this.e);
        phyVar.b(this.f45409b);
        String indexFileFiled = this.f45408a.getIndexFileFiled();
        String indexFileSavePath = this.f45408a.getIndexFileSavePath();
        LogUtil.b("EzPlugin_EzPluginHelper", "updateIndex plugin_down_url=", this.e, ", savePath=", indexFileSavePath);
        pig.c().c(indexFileFiled, phyVar, indexFileSavePath, true, pullListener);
    }

    public List<phz> e() {
        List<phz> listJ = j();
        if (listJ != null) {
            return listJ;
        }
        if (!g()) {
            d(false);
            return null;
        }
        return j();
    }

    private void a(final String str, final PullListener pullListener) {
        LogUtil.b("EzPlugin_EzPluginHelper", "updateDescription fileId=", str);
        a(new PullListener() { // from class: pia.3
            @Override // com.huawei.pluginmgr.filedownload.PullListener
            public void onPullingChange(pis pisVar, pit pitVar) {
                if (pitVar.f() == 1) {
                    pia.this.g();
                    pia.this.d(str, pullListener);
                } else {
                    if (pitVar.f() != 0) {
                        PullListener pullListener2 = pullListener;
                        if (pullListener2 != null) {
                            pullListener2.onPullingChange(pisVar, pitVar);
                            return;
                        }
                        return;
                    }
                    LogUtil.c("EzPlugin_EzPluginHelper", "updateDescription else");
                }
            }
        });
    }

    public void d(String str, PullListener pullListener) {
        LogUtil.b("EzPlugin_EzPluginHelper", "downloadDescription fileId=", str);
        if (!i(str)) {
            pig.c().b(str, this.e, d(str).getPath(), this.f45409b, pullListener);
            return;
        }
        pit pitVar = new pit();
        pis pisVar = new pis();
        pitVar.e(-5);
        if (pullListener != null) {
            pullListener.onPullingChange(pisVar, pitVar);
        }
    }

    public void e(final String str, final PullListener pullListener) {
        LogUtil.b("EzPlugin_EzPluginHelper", "updatePlugin fileId=", str);
        pic picVarH = h(str);
        if (picVarH != null) {
            LogUtil.b("EzPlugin_EzPluginHelper", "updatePlugin pluginUrl is = ", this.e);
            String string = this.f45408a.getPluginSavePath(str).toString();
            pig.c().c(new phy(str, this.e, this.f45409b, picVarH), string, pullListener);
            return;
        }
        a(str, new PullListener() { // from class: pia.5
            @Override // com.huawei.pluginmgr.filedownload.PullListener
            public void onPullingChange(pis pisVar, pit pitVar) {
                if (pitVar.f() == 1) {
                    if (pia.this.h(str) != null) {
                        pia.this.e(str, pullListener);
                        return;
                    } else {
                        LogUtil.e("EzPlugin_EzPluginHelper", "updatePlugin inform error");
                        return;
                    }
                }
                if (pitVar.f() != 0) {
                    PullListener pullListener2 = pullListener;
                    if (pullListener2 != null) {
                        pullListener2.onPullingChange(pisVar, pitVar);
                        return;
                    }
                    return;
                }
                LogUtil.c("EzPlugin_EzPluginHelper", "updatePlugin onPullingChange else");
            }
        });
    }

    public phz a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("EzPlugin_EzPluginHelper", "getPluginIndexInfo uuid is empty");
            return null;
        }
        List<phz> listE = e();
        if (listE != null) {
            for (phz phzVar : listE) {
                if (str.equals(phzVar.a())) {
                    return phzVar;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public pic h(String str) {
        if (!this.f45408a.needDescriptionFile()) {
            phz phzVarA = a(str);
            if (phzVarA == null) {
                return null;
            }
            pic picVar = new pic();
            picVar.a("Resource");
            picVar.f(phzVarA.a());
            picVar.g(phzVarA.g());
            picVar.d(phzVarA.e());
            picVar.b(phzVarA.b());
            picVar.e(phzVarA.c());
            picVar.b("2");
            return picVar;
        }
        if (i(str)) {
            return null;
        }
        String strA = a(d(str));
        LogUtil.c("EzPlugin_EzPluginHelper", "descriptionJson = ", strA);
        return phw.a(strA);
    }

    private File d(String str) {
        StringBuilder pluginSavePath = this.f45408a.getPluginSavePath(str);
        pluginSavePath.append("description.json");
        return new File(pluginSavePath.toString());
    }

    private File f(String str) {
        StringBuilder pluginSavePath = this.f45408a.getPluginSavePath(str);
        pluginSavePath.append("done");
        return new File(pluginSavePath.toString());
    }

    public boolean b(String str) {
        if (!this.f45408a.needDescriptionFile()) {
            return f(str).exists();
        }
        if (!i(str) && f(str).exists()) {
            File fileD = d(str);
            if (fileD.exists()) {
                LogUtil.b("EzPlugin_EzPluginHelper", "isPluginAvaiable the plugin available, descriptionFileSavePath is = ", fileD.getPath());
                return true;
            }
        }
        LogUtil.e("EzPlugin_EzPluginHelper", "the plugin not available");
        return false;
    }

    private boolean i(String str) {
        phz phzVarA = a(str);
        if (phzVarA == null) {
            LogUtil.e("EzPlugin_EzPluginHelper", "isPluginDeprecated uuid is not exists");
            return false;
        }
        if (!"Deprecated".equalsIgnoreCase(phzVarA.g())) {
            return false;
        }
        LogUtil.b("EzPlugin_EzPluginHelper", "isPluginDeprecated this plugin is deprecated ");
        c(str);
        return true;
    }

    public String b(String str, boolean z) {
        if (z && !b(str)) {
            LogUtil.e("EzPlugin_EzPluginHelper", "getPluginFileSavePath the plugin is not done. uuid is unavailable");
            return null;
        }
        StringBuilder pluginSavePath = this.f45408a.getPluginSavePath(str);
        if (!this.f45408a.isPluginDirectory()) {
            pic picVarH = h(str);
            if (picVarH == null || TextUtils.isEmpty(picVarH.e())) {
                return null;
            }
            pluginSavePath.append(picVarH.e());
        }
        return pluginSavePath.toString();
    }

    public boolean g() {
        File file = new File(this.f45408a.getIndexFileSavePath());
        if (!file.exists()) {
            LogUtil.e("EzPlugin_EzPluginHelper", "updateIndexCache ", file.getName(), " is not exist.");
            return false;
        }
        String strA = a(file);
        LogUtil.c("EzPlugin_EzPluginHelper", "updateIndexCache indexJson = ", strA);
        pio pioVarC = phw.c(strA);
        List<phz> listC = pioVarC.c();
        if (listC == null || listC.isEmpty()) {
            LogUtil.e("EzPlugin_EzPluginHelper", "updateIndexCache ", file.getName(), " is not correct.");
            return false;
        }
        this.f45410c = pioVarC;
        return true;
    }

    private void c(String str) {
        FileUtils.b(f(str));
        FileUtils.b(d(str));
    }

    public static String a(File file) {
        return phw.e(file);
    }

    public static void b(FilenameFilter filenameFilter) {
        if (filenameFilter == null) {
            LogUtil.e("EzPlugin_EzPluginHelper", "deletePlugins filter is null");
        } else {
            FileUtils.a(new File(phs.d), filenameFilter);
        }
    }

    public String c() {
        pio pioVar = this.f45410c;
        if (pioVar != null) {
            return pioVar.d();
        }
        return null;
    }
}
