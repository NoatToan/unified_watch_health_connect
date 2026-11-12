package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.MetaCreativeType;
import com.huawei.openalliance.ad.db.bean.ContentResource;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public class dl implements dq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f18397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f18398b;

    @Override // com.huawei.openalliance.ad.dq
    public void a(String str, boolean z, Integer num) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "fileName is empty";
        } else {
            hw.b("DiskCacheFileOperation", "onFileRemoved: %s", str);
            List<ContentResource> listC = ey.a(this.f18397a).c(str, this.f18398b);
            if (!com.huawei.openalliance.ad.utils.bm.a(listC)) {
                hw.b("DiskCacheFileOperation", "contentResources is not empty");
                if (z) {
                    new com.huawei.openalliance.ad.analysis.h(this.f18397a).a(listC, num);
                }
                ey.a(this.f18397a).a(str, this.f18398b);
                for (ContentResource contentResource : listC) {
                    if (MetaCreativeType.AR.equalsIgnoreCase(contentResource.i())) {
                        hw.b("DiskCacheFileOperation", "AR deleteUnzipDir");
                        a(str);
                    } else if (contentResource.d() == 1 || contentResource.d() == 18) {
                        if (TextUtils.equals(this.f18398b, "normal")) {
                            ew.a(this.f18397a).c(contentResource.c());
                        }
                    }
                }
                return;
            }
            str2 = "contentResources is empty";
        }
        hw.b("DiskCacheFileOperation", str2);
    }

    @Override // com.huawei.openalliance.ad.dq
    public void a(String str, final ContentResource contentResource) {
        if (contentResource != null) {
            com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.dl.1
                @Override // java.lang.Runnable
                public void run() {
                    ey.a(dl.this.f18397a).a(contentResource, dl.this.f18398b);
                }
            }, com.huawei.openalliance.ad.utils.o.a.DISK_CACHE, false);
        }
    }

    @Override // com.huawei.openalliance.ad.dq
    public void a(final String str, final long j) {
        com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.dl.2
            @Override // java.lang.Runnable
            public void run() {
                ey eyVarA = ey.a(dl.this.f18397a);
                List<ContentResource> listC = eyVarA.c(str, dl.this.f18398b);
                if (com.huawei.openalliance.ad.utils.bm.a(listC)) {
                    return;
                }
                Iterator<ContentResource> it = listC.iterator();
                while (it.hasNext()) {
                    it.next().a(j);
                }
                eyVarA.a(listC);
            }
        }, com.huawei.openalliance.ad.utils.o.a.DISK_CACHE, false);
    }

    @Override // com.huawei.openalliance.ad.dq
    public void a(final String str, final int i) {
        com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.dl.3
            @Override // java.lang.Runnable
            public void run() {
                ey eyVarA = ey.a(dl.this.f18397a);
                List<ContentResource> listC = eyVarA.c(str, dl.this.f18398b);
                if (com.huawei.openalliance.ad.utils.bm.a(listC)) {
                    return;
                }
                Iterator<ContentResource> it = listC.iterator();
                while (it.hasNext()) {
                    it.next().b(i);
                }
                eyVarA.a(listC);
            }
        }, com.huawei.openalliance.ad.utils.o.a.DISK_CACHE, false);
    }

    @Override // com.huawei.openalliance.ad.dq
    public Set<String> a(List<String> list) {
        HashSet hashSet = new HashSet();
        List<ContentResource> listB = ey.a(this.f18397a).b(list);
        if (!com.huawei.openalliance.ad.utils.bm.a(listB)) {
            for (ContentResource contentResource : listB) {
                if (contentResource != null) {
                    hashSet.add(contentResource.a());
                }
            }
        }
        return hashSet;
    }

    @Override // com.huawei.openalliance.ad.dq
    public List<ContentResource> a() {
        ey eyVarA = ey.a(this.f18397a);
        return 1 == fp.b(this.f18397a).bS() ? eyVarA.c(this.f18398b) : eyVarA.b(this.f18398b);
    }

    private void a(String str) {
        StringBuilder sb;
        try {
            com.huawei.openalliance.ad.utils.ai.a(dn.a(this.f18397a, this.f18398b).getCanonicalPath() + File.separator + MetaCreativeType.AR + str);
        } catch (IOException e) {
            e = e;
            sb = new StringBuilder("IOException delete ar unzip dir:");
            sb.append(e.getClass().getSimpleName());
            hw.c("DiskCacheFileOperation", sb.toString());
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder("Exception delete ar unzip dir:");
            sb.append(e.getClass().getSimpleName());
            hw.c("DiskCacheFileOperation", sb.toString());
        }
    }

    public dl(Context context, String str) {
        this.f18397a = context.getApplicationContext();
        this.f18398b = str;
    }
}
