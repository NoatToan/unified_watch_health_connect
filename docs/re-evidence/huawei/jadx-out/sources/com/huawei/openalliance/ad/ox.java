package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.beans.metadata.Content;
import com.huawei.openalliance.ad.beans.metadata.MediaFile;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.beans.metadata.Precontent;
import com.huawei.openalliance.ad.beans.server.AdContentRsp;
import com.huawei.openalliance.ad.db.bean.PlacementRecord;
import com.huawei.openalliance.ad.inter.data.IPlacementAd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ox {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    gg f19928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Context f19929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    rj f19930c;
    private AdContentRsp d;

    protected abstract void b(AdContentRsp adContentRsp);

    protected Map<String, List<IPlacementAd>> b(List<Precontent> list) {
        HashMap map = new HashMap(4);
        if (list != null) {
            byte[] bArrB = com.huawei.openalliance.ad.utils.cw.b(this.f19929b);
            for (final Precontent precontent : list) {
                if (precontent != null) {
                    com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.ox.2
                        @Override // java.lang.Runnable
                        public void run() {
                            ox.this.f19928a.b(pn.b(precontent.a(), precontent, 60));
                        }
                    });
                    String strA = precontent.a();
                    if (!map.containsKey(strA)) {
                        map.put(strA, new ArrayList(4));
                    }
                    List list2 = (List) map.get(strA);
                    Content content = new Content(precontent);
                    if (content.c() != null) {
                        com.huawei.openalliance.ad.inter.data.h hVarA = a(strA, content, bArrB);
                        hVarA.i(this.d.k());
                        hVarA.v(this.d.l());
                        hVarA.c(this.d.o());
                        hVarA.n(this.d.q());
                        hVarA.o(this.d.r());
                        list2.add(hVarA);
                    }
                }
            }
        }
        return map;
    }

    protected void a(final List<String> list) {
        if (com.huawei.openalliance.ad.utils.bm.a(list)) {
            return;
        }
        com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.ox.1
            @Override // java.lang.Runnable
            public void run() {
                MetaData metaData;
                for (String str : list) {
                    PlacementRecord placementRecordA = ox.this.f19928a.a(str);
                    if (placementRecordA != null && (metaData = (MetaData) com.huawei.openalliance.ad.utils.bk.b(placementRecordA.b(), MetaData.class, new Class[0])) != null) {
                        ox.this.a(metaData.v());
                        List<MediaFile> listX = metaData.x();
                        if (!com.huawei.openalliance.ad.utils.bm.a(listX)) {
                            Iterator<MediaFile> it = listX.iterator();
                            while (it.hasNext()) {
                                ox.this.a(it.next());
                            }
                        }
                    }
                    ox.this.f19928a.b(str);
                }
            }
        }, com.huawei.openalliance.ad.utils.o.a.IO, false);
    }

    public void a(AdContentRsp adContentRsp) {
        if (adContentRsp == null) {
            this.f19930c.a(800);
            return;
        }
        this.d = adContentRsp;
        a(adContentRsp.d());
        b(adContentRsp);
    }

    com.huawei.openalliance.ad.inter.data.h a(String str, Content content, byte[] bArr) {
        return pq.a(str, content, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MediaFile mediaFile) {
        if (mediaFile == null) {
            return;
        }
        dk.a(this.f19929b, "normal").j(dn.d(mediaFile.e()));
    }

    public static ox a(Context context, rj rjVar, boolean z) {
        return z ? new ps(context, rjVar) : new pr(context, rjVar);
    }

    protected ox(Context context, rj rjVar) {
        this.f19929b = context;
        this.f19928a = fj.a(context);
        this.f19930c = rjVar;
    }
}
