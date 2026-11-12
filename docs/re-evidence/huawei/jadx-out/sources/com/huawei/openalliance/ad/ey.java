package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.db.bean.ContentResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class ey extends es implements ga {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ey f18738c;
    private static final byte[] d = new byte[0];
    private static final byte[] e = new byte[0];

    @Override // com.huawei.openalliance.ad.ga
    public void d(String str) {
        if (TextUtils.isEmpty(str)) {
            hw.d("ContentResourceDao", "contentId is null, can't update content resource");
            return;
        }
        synchronized (d) {
            List<ContentResource> listE = e(str);
            if (com.huawei.openalliance.ad.utils.bm.a(listE)) {
                hw.b("ContentResourceDao", "contentResources is empty");
            } else {
                for (ContentResource contentResource : listE) {
                    hw.a("ContentResourceDao", "contentResource slotId: %s contentId: %s useCount: %s", contentResource.b(), contentResource.c(), Integer.valueOf(contentResource.h()));
                    contentResource.e(contentResource.h() + 1);
                }
                a(listE);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.ga
    public List<ContentResource> c(String str, String str2) {
        return TextUtils.isEmpty(str) ? new ArrayList() : a(ContentResource.class, null, fq.CONTENT_BY_RESOURCE_NAME_AND_CACHETYPE_WHERE, new String[]{str, str2}, null, null);
    }

    @Override // com.huawei.openalliance.ad.ga
    public List<ContentResource> c(String str) {
        return a(ContentResource.class, null, fq.CONTENT_BY_CACHETYPE_WHERE, new String[]{str}, "priority ASC", null);
    }

    @Override // com.huawei.openalliance.ad.ga
    public void b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            hw.c("ContentResourceDao", "deleteContentResource with empty contentId");
        } else {
            hw.a("ContentResourceDao", "deleteContentResourceByContentId: %s", str);
            a(ContentResource.class, fq.CONTENT_BY_CONTENT_ID_AND_RESOURCE_NAME_WHERE, new String[]{str, str2});
        }
    }

    @Override // com.huawei.openalliance.ad.ga
    public List<ContentResource> b(List<String> list) {
        ArrayList arrayList = new ArrayList();
        if (com.huawei.openalliance.ad.utils.bm.a(list)) {
            hw.d("ContentResourceDao", "contentId is null, can't update content resource");
            return arrayList;
        }
        synchronized (d) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                arrayList.addAll(e(it.next()));
            }
        }
        return arrayList;
    }

    @Override // com.huawei.openalliance.ad.ga
    public List<ContentResource> b(String str) {
        return a(ContentResource.class, null, fq.CONTENT_BY_CACHETYPE_WHERE, new String[]{str}, "priority ASC, updateTime ASC", null);
    }

    @Override // com.huawei.openalliance.ad.ga
    public void a(List<ContentResource> list) {
        if (com.huawei.openalliance.ad.utils.bm.a(list)) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (ContentResource contentResource : list) {
            if (contentResource != null) {
                arrayList.add(a(contentResource));
            }
        }
        c(arrayList);
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            hw.c("ContentResourceDao", "deleteContentResource with empty file name");
        } else {
            hw.a("ContentResourceDao", "deleteContentResourceByName: %s cacheType: %s", str, str2);
            a(ContentResource.class, fq.CONTENT_BY_RESOURCE_NAME_AND_CACHETYPE_WHERE, new String[]{str, str2});
        }
    }

    @Override // com.huawei.openalliance.ad.ga
    public void a(String str, int i, String str2) {
        if (TextUtils.isEmpty(str)) {
            hw.d("ContentResourceDao", "contentId is null, can't update prio");
            return;
        }
        synchronized (d) {
            List<ContentResource> listE = e(str);
            if (com.huawei.openalliance.ad.utils.bm.a(listE)) {
                hw.b("ContentResourceDao", "contentResources is empty");
            } else {
                ArrayList arrayList = new ArrayList();
                for (ContentResource contentResource : listE) {
                    if (hw.a()) {
                        hw.a("ContentResourceDao", "contentResource fileName: %s, contentId: %s oldPrio: %s newPrio: %s cacheType: %s", contentResource.a(), contentResource.c(), Integer.valueOf(contentResource.e()), Integer.valueOf(i), str2);
                    }
                    List<ContentResource> listC = c(contentResource.a(), str2);
                    if (com.huawei.openalliance.ad.utils.bm.a(listC)) {
                        hw.b("ContentResourceDao", "contentResourcesByName is empty");
                    } else {
                        for (ContentResource contentResource2 : listC) {
                            if (i != contentResource2.e()) {
                                contentResource2.b(i);
                                arrayList.add(contentResource2);
                            }
                        }
                    }
                }
                a(arrayList);
            }
        }
    }

    public void a(ContentResource contentResource, String str) {
        if (contentResource == null) {
            return;
        }
        synchronized (d) {
            String strC = contentResource.c();
            if (TextUtils.isEmpty(strC)) {
                hw.b("ContentResourceDao", "insertContent - content id is empty");
            } else if (com.huawei.openalliance.ad.utils.bm.a(a(strC, contentResource.a(), str, contentResource.b()))) {
                hw.a("ContentResourceDao", "insert contentid: %s fileName: %s cacheType: %s", strC, contentResource.a(), str);
                contentResource.e(str);
                a(ContentResource.class, contentResource.d(this.f18718a));
            } else {
                hw.b("ContentResourceDao", "resource is exist, contentId:" + strC);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.ga
    public List<ContentResource> a(String str) {
        return TextUtils.isEmpty(str) ? new ArrayList() : a(ContentResource.class, null, fq.CONTENT_BY_RESOURCE_NAME_WHERE, new String[]{str}, null, null);
    }

    private List<ContentResource> e(String str) {
        return TextUtils.isEmpty(str) ? new ArrayList() : a(ContentResource.class, null, fq.CONTENT_BY_CONTENT_ID_WHERE, new String[]{str}, null, null);
    }

    private List<ContentResource> a(String str, String str2, String str3, String str4) {
        return (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) ? new ArrayList() : a(ContentResource.class, null, fq.CONTENT_BY_RESOURCE_NAME_AND_CONTENTID_AND_CACHETYPE_AND_SLOTID_WHERE, new String[]{str2, str, str3, str4}, null, null);
    }

    public static ey a(Context context) {
        ey eyVar;
        synchronized (e) {
            if (f18738c == null) {
                f18738c = new ey(context);
            }
            eyVar = f18738c;
        }
        return eyVar;
    }

    private dh a(ContentResource contentResource) {
        return new dh("ContentResource", null, null, fq.CONTENT_BY_RESOURCE_NAME_AND_CONTENTID_AND_CACHETYPE_AND_SLOTID_WHERE.a(), new String[]{contentResource.a(), contentResource.c(), contentResource.j(), contentResource.b()}, contentResource.d(this.f18718a));
    }

    protected ey(Context context) {
        super(context);
    }
}
