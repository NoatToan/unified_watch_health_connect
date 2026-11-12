package com.huawei.ui.main.stories.template;

import android.os.Looper;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginmgr.EzPluginType;
import com.huawei.pluginmgr.filedownload.PullListener;
import defpackage.njy;
import defpackage.phs;
import defpackage.phz;
import defpackage.pia;
import defpackage.pis;
import defpackage.pit;
import defpackage.wpe;
import defpackage.wpk;
import health.compact.a.GrsDownloadPluginUrl;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/* JADX INFO: loaded from: classes19.dex */
public class ResourceDownloadHelper {
    private FileResult d;
    private Vector<String> i = new Vector<>(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Vector<String> f28983c = new Vector<>(10);
    private Vector<String> j = new Vector<>(10);
    private volatile boolean e = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f28981a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f28982b = false;
    private PullListener g = new PullListener() { // from class: com.huawei.ui.main.stories.template.ResourceDownloadHelper.3
        @Override // com.huawei.pluginmgr.filedownload.PullListener
        public void onPullingChange(pis pisVar, pit pitVar) {
            if (pitVar == null) {
                LogUtil.j("ResourceDownloadHelper", "onPullingChange pullResult is null");
                ResourceDownloadHelper.this.d.onFail(ResourceDownloadHelper.this.i);
                return;
            }
            int iF = pitVar.f();
            if (iF != 1) {
                if (iF != 0) {
                    LogUtil.j("ResourceDownloadHelper", "onPullingChange status ", Integer.valueOf(iF));
                    ResourceDownloadHelper.this.d.onFail(ResourceDownloadHelper.this.i);
                    return;
                }
                return;
            }
            ResourceDownloadHelper.this.h.e(pitVar.b());
            if (!njy.e(ResourceDownloadHelper.this.h.e())) {
                Iterator it = ResourceDownloadHelper.this.i.iterator();
                while (it.hasNext()) {
                    ResourceDownloadHelper.this.e((String) it.next());
                }
                return;
            }
            LogUtil.j("ResourceDownloadHelper", "onPullingChange PluginIndexInfoList is empty");
            if (ResourceDownloadHelper.this.e) {
                return;
            }
            ResourceDownloadHelper.this.d.onFail(ResourceDownloadHelper.this.i);
            ResourceDownloadHelper.this.e = true;
        }
    };
    private pia h = new pia(EzPluginType.UX_TEMPLATE_TYPE, null);

    public interface FileResult {
        void onFail(List<String> list);

        void onSuccess();
    }

    public void a(FileResult fileResult) {
        Vector vector = new Vector(10);
        for (String str : wpe.f52306a) {
            vector.add(str);
        }
        LogUtil.a("ResourceDownloadHelper", "startDownload");
        this.i.clear();
        this.j.clear();
        this.i.addAll(vector);
        this.j.addAll(vector);
        this.d = fileResult;
        this.f28983c.clear();
        this.f28983c.addAll(vector);
        this.e = false;
        this.f28981a = false;
        this.f28982b = false;
        a();
    }

    public void c(List<String> list, FileResult fileResult) {
        LogUtil.a("ResourceDownloadHelper", "startDownload");
        this.i.clear();
        this.j.clear();
        this.i.addAll(list);
        this.j.addAll(list);
        this.d = fileResult;
        this.f28983c.clear();
        this.f28983c.addAll(list);
        this.e = false;
        this.f28981a = false;
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void a() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: wph
                @Override // java.lang.Runnable
                public final void run() {
                    this.f52310c.a();
                }
            });
        } else {
            LogUtil.d("ResourceDownloadHelper", "updateIndexFile url ", this.h.e(new GrsDownloadPluginUrl().getDownloadPluginUrl(null, true), (String) null));
            this.h.a(this.g);
        }
    }

    public void e(String str) {
        if (!c(str)) {
            this.j.remove(str);
            this.f28983c.remove(str);
            if (this.j.size() == 0) {
                if (this.f28983c.size() == 0 && !this.f28981a) {
                    b();
                    return;
                } else if (this.f28983c.size() != 0 && !this.f28982b) {
                    this.d.onFail(this.f28983c);
                    return;
                } else {
                    LogUtil.a("ResourceDownloadHelper", "update fail");
                    return;
                }
            }
            return;
        }
        a(str);
    }

    private void a(final String str) {
        this.h.e(str, new PullListener() { // from class: com.huawei.ui.main.stories.template.ResourceDownloadHelper.5
            @Override // com.huawei.pluginmgr.filedownload.PullListener
            public void onPullingChange(pis pisVar, pit pitVar) {
                if (pitVar == null) {
                    ResourceDownloadHelper.this.j.remove(str);
                    ResourceDownloadHelper.this.c();
                    LogUtil.j("ResourceDownloadHelper", "updatePluginInfo onPullingChange result is null");
                    return;
                }
                int iF = pitVar.f();
                if (iF != 1) {
                    if (iF != 0) {
                        ResourceDownloadHelper.this.j.remove(str);
                        LogUtil.j("ResourceDownloadHelper", "updatePluginInfo onPullingChange error uuid ", str, " status ", Integer.valueOf(iF));
                        if (iF != -10 || ResourceDownloadHelper.this.f28982b) {
                            ResourceDownloadHelper.this.c();
                            return;
                        } else {
                            ResourceDownloadHelper.this.d.onFail(ResourceDownloadHelper.this.f28983c);
                            ResourceDownloadHelper.this.f28982b = true;
                            return;
                        }
                    }
                    return;
                }
                phz phzVarA = ResourceDownloadHelper.this.h.a(str);
                if (phzVarA == null) {
                    ResourceDownloadHelper.this.j.remove(str);
                    ResourceDownloadHelper.this.c();
                    LogUtil.j("ResourceDownloadHelper", "updatePluginInfo onPullingChange pluginInfo is null ", str);
                } else {
                    ResourceDownloadHelper.this.j.remove(str);
                    ResourceDownloadHelper.this.f28983c.remove(str);
                    LogUtil.a("ResourceDownloadHelper", "updatePluginInfo onPullingChange uuid ", str);
                    wpk.a(str, phzVarA.g());
                    ResourceDownloadHelper.this.d();
                }
            }
        });
    }

    private void b() {
        if (this.f28981a) {
            return;
        }
        this.f28981a = true;
        this.d.onSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.j.size() == 0) {
            if (this.f28983c.size() == 0) {
                b();
            } else {
                if (this.f28982b) {
                    return;
                }
                this.d.onFail(this.f28983c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.j.size() != 0 || this.f28982b) {
            return;
        }
        this.d.onFail(this.f28983c);
    }

    public boolean c(String str) {
        phz phzVarA = this.h.a(str);
        if (phzVarA == null) {
            LogUtil.j("ResourceDownloadHelper", "pluginInfo is null ", str);
            return false;
        }
        String strE = wpk.e(str);
        return wpk.d(b(str)) || TextUtils.isEmpty(strE) || !strE.equals(phzVarA.g());
    }

    private String b(String str) {
        return phs.d + "ux_model_res" + File.separator + str + File.separator;
    }
}
