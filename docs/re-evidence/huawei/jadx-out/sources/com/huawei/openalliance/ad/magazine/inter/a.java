package com.huawei.openalliance.ad.magazine.inter;

import android.content.Context;
import com.huawei.openalliance.ad.analysis.c;
import com.huawei.openalliance.ad.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.beans.server.AdContentRsp;
import com.huawei.openalliance.ad.constant.ErrorCode;
import com.huawei.openalliance.ad.constant.EventType;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.db.bean.DeletedContentRecord;
import com.huawei.openalliance.ad.ew;
import com.huawei.openalliance.ad.fa;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.ig;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.magazine.inter.listener.MagLockListener;
import com.huawei.openalliance.ad.opendeviceidentifier.OAIDServiceManager;
import com.huawei.openalliance.ad.ot;
import com.huawei.openalliance.ad.pc;
import com.huawei.openalliance.ad.pi;
import com.huawei.openalliance.ad.pj;
import com.huawei.openalliance.ad.po;
import com.huawei.openalliance.ad.processor.eventbeans.MagLockEventInfo;
import com.huawei.openalliance.ad.processor.eventbeans.b;
import com.huawei.openalliance.ad.qo;
import com.huawei.openalliance.ad.rc;
import com.huawei.openalliance.ad.sw;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bm;
import com.huawei.openalliance.ad.utils.cb;
import com.huawei.openalliance.ad.utils.d;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes41.dex */
public class a implements HiAdMagLock {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int[] f19516a = {200, 206};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int[] f19517b = {204, 423, 424, 425, ErrorCode.ERROR_CODE_NO_PACKAGE, ErrorCode.ERROR_CODE_NO_USERINFO};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int[] f19518c = {200, 421, 423};
    private Context d;
    private ew e;
    private fa f;

    @Override // com.huawei.openalliance.ad.magazine.inter.HiAdMagLock
    public void reportEvent(final Context context, final String str, final EventType eventType, final MagLockEventInfo magLockEventInfo) {
        if (dg.b(str) || eventType == null) {
            hw.d("HiAdMagLockImpl", "params is null");
        } else {
            o.b(new Runnable() { // from class: com.huawei.openalliance.ad.magazine.inter.a.1
                @Override // java.lang.Runnable
                public void run() {
                    String str2;
                    EventType eventTypeValueOf = EventType.valueOf(eventType.name());
                    ContentRecord contentRecordA = ew.a(context).a(str);
                    if (contentRecordA == null) {
                        str2 = "reportEvent,content is null";
                    } else {
                        if (2 == contentRecordA.f()) {
                            if (EventType.SHOW == eventTypeValueOf) {
                                fp.b(context).f("" + as.c());
                            }
                            if (EventType.REMOVE == eventTypeValueOf) {
                                fa.a(context).b(new DeletedContentRecord(str, as.c()));
                                fa.a(context).b();
                                ew.a(context).c(str);
                            }
                            contentRecordA.c(fp.b(context).bh());
                            Context context2 = context;
                            pc pcVar = new pc(context2, sw.a(context2, contentRecordA.f()));
                            pcVar.a(contentRecordA);
                            a.this.a(pcVar, eventTypeValueOf, magLockEventInfo);
                            MagLockEventInfo magLockEventInfo2 = magLockEventInfo;
                            if (magLockEventInfo2 == null || magLockEventInfo2.b() == null) {
                                return;
                            }
                            new c(context).b(contentRecordA, eventType.value(), magLockEventInfo.b());
                            return;
                        }
                        str2 = "invalid ad type";
                    }
                    hw.d("HiAdMagLockImpl", str2);
                }
            });
        }
    }

    @Override // com.huawei.openalliance.ad.magazine.inter.HiAdMagLock
    public void preloadAds(String[] strArr, Set<String> set, boolean z, MagLockListener magLockListener) {
        hw.a("HiAdMagLockImpl", "preloadAds!");
        a(strArr, a(set), z, magLockListener, 2);
    }

    @Override // com.huawei.openalliance.ad.magazine.inter.HiAdMagLock
    public void onNetworkConnected(Context context) {
        a(context);
    }

    @Override // com.huawei.openalliance.ad.magazine.inter.HiAdMagLock
    public void loadAds(String[] strArr, Set<String> set, boolean z, MagLockListener magLockListener) {
        hw.a("HiAdMagLockImpl", "loadAds!");
        a(strArr, a(set), z, magLockListener, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(final Context context, final AdSlotParam adSlotParam, final List<String> list, final List<String> list2, final MagLockListener magLockListener) {
        hw.a("HiAdMagLockImpl", "oaid has been done: %s", Long.valueOf(System.currentTimeMillis()));
        o.b(new Runnable() { // from class: com.huawei.openalliance.ad.magazine.inter.a.3
            @Override // java.lang.Runnable
            public void run() {
                if (hw.a()) {
                    hw.a("HiAdMagLockImpl", "thread switch: %s", Long.valueOf(System.currentTimeMillis()));
                }
                a.b(context, new ot(context).a(adSlotParam, list, list2), magLockListener, adSlotParam.j());
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0025  */
    /* JADX WARN: Code duplicated, block: B:19:0x002b A[RETURN] */
    private boolean b(MagLockListener magLockListener, String[] strArr) {
        String str;
        boolean z;
        if (strArr != null && strArr.length != 0) {
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = true;
                    break;
                }
                if (dg.b(strArr[i])) {
                    str = "some adId is empty";
                } else {
                    i++;
                }
            }
            if (magLockListener == null) {
                return z;
            }
            hw.d("HiAdMagLockImpl", "listener is null");
            return false;
        }
        str = "adIds is empty";
        hw.d("HiAdMagLockImpl", str);
        z = false;
        if (magLockListener == null) {
            return z;
        }
        hw.d("HiAdMagLockImpl", "listener is null");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, AdContentRsp adContentRsp, MagLockListener magLockListener, boolean z) {
        if (adContentRsp == null) {
            hw.b("HiAdMagLockImpl", "onAdFailed response is null!");
            magLockListener.onAdFailed(ErrorCode.ERROR_CODE_OTHER);
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<ContentRecord> listA = po.a(adContentRsp, 2);
        if (!bm.a(listA)) {
            arrayList.addAll(listA);
        }
        List<ContentRecord> listB = po.b(adContentRsp, 2);
        if (!bm.a(listB)) {
            arrayList.addAll(listB);
        }
        if (hw.a() && hw.a()) {
            Iterator it = arrayList.iterator();
            String str = "[";
            while (it.hasNext()) {
                str = str + ((ContentRecord) it.next()).o() + " ";
            }
            hw.a("HiAdMagLockImpl", "received contentIds: %s", str + "]");
        }
        pi piVar = new pi(context, arrayList);
        piVar.a(2);
        piVar.a(adContentRsp.d());
        piVar.a();
        if (z) {
            piVar.a(true);
        }
        int iA = adContentRsp.a();
        if (Arrays.binarySearch(f19516a, iA) >= 0) {
            ig igVarA = pj.a(adContentRsp, context, z);
            if (igVarA == null) {
                hw.c("HiAdMagLockImpl", "onAdSuccess but MagLockAdInfo is null");
            } else {
                hw.b("HiAdMagLockImpl", "onAdSuccess MagLockAdInfo: %s", igVarA.toString());
            }
            magLockListener.onAdSuccess(igVarA);
        } else if (Arrays.binarySearch(f19517b, iA) >= 0) {
            hw.c("HiAdMagLockImpl", "onAdFailed errorCode: %s", Integer.valueOf(iA));
            magLockListener.onAdFailed(iA);
        } else {
            hw.c("HiAdMagLockImpl", "onAdFailed errorCode: %s", Integer.valueOf(ErrorCode.ERROR_CODE_OTHER));
            magLockListener.onAdFailed(ErrorCode.ERROR_CODE_OTHER);
        }
        hw.a("HiAdMagLockImpl", "load ads finish: %s", Long.valueOf(System.currentTimeMillis()));
        if (z) {
            return;
        }
        piVar.a(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context, AdSlotParam adSlotParam, List<String> list, List<String> list2, MagLockListener magLockListener) {
        OAIDServiceManager.getInstance(context).requireOaid(new C0221a(context, adSlotParam, list, list2, magLockListener));
    }

    private boolean a(MagLockListener magLockListener, String[] strArr) {
        if (as.j()) {
            return b(magLockListener, strArr);
        }
        if (magLockListener == null) {
            return false;
        }
        hw.c("HiAdMagLockImpl", "api too low! onNoSupport");
        magLockListener.onNoSupport();
        return false;
    }

    private void a(final String[] strArr, final List<String> list, final boolean z, final MagLockListener magLockListener, final int i) {
        if (a(magLockListener, strArr)) {
            if (cb.e(this.d)) {
                o.b(new Runnable() { // from class: com.huawei.openalliance.ad.magazine.inter.a.2
                    @Override // java.lang.Runnable
                    public void run() {
                        AdSlotParam.Builder builder = new AdSlotParam.Builder();
                        builder.setAdIds(Arrays.asList(strArr)).setDeviceType(4).setOrientation(1).setWidth(d.d(a.this.d)).setHeight(d.e(a.this.d)).setTest(z).setIsPreload(Boolean.valueOf(i == 2)).setRequestOptions(HiAd.getInstance(a.this.d).getRequestConfiguration());
                        List<String> listA = a.this.f.a();
                        hw.a("HiAdMagLockImpl", "ready to loadAds , removedIds: %s,cachedContentIds: %s", listA, list);
                        a aVar = a.this;
                        aVar.b(aVar.d, builder.build(), list, listA, magLockListener);
                        a.this.f.b();
                    }
                });
            } else {
                hw.c("HiAdMagLockImpl", "onAdFailed netWork not Connected!");
                magLockListener.onAdFailed(ErrorCode.ERROR_CODE_OTHER);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(rc rcVar, EventType eventType, MagLockEventInfo magLockEventInfo) {
        switch (AnonymousClass4.f19528a[eventType.ordinal()]) {
            case 1:
                com.huawei.openalliance.ad.processor.eventbeans.a.C0229a c0229a = new com.huawei.openalliance.ad.processor.eventbeans.a.C0229a();
                c0229a.a(false).c((Integer) 0).b(true);
                rcVar.a(c0229a.a());
                break;
            case 2:
                MaterialClickInfo materialClickInfo = new MaterialClickInfo();
                materialClickInfo.h(1);
                b.a aVar = new b.a();
                aVar.a(0).b(0).b((String) null).b(true).a(materialClickInfo);
                rcVar.a(aVar.a());
                break;
            case 3:
                rcVar.i();
                break;
            case 4:
                rcVar.j();
                break;
            case 5:
                rcVar.k();
                break;
            case 6:
                rcVar.l();
                break;
            case 7:
                rcVar.m();
                break;
            case 8:
                rcVar.a(EventType.INTENTSUCCESS, (Integer) 1, (Integer) null, false);
                break;
            case 9:
                rcVar.a(EventType.INTENTFAIL, (Integer) 1, magLockEventInfo.a(), false);
                break;
        }
    }

    private static void a(Context context, int i) {
        qo.a(context, sw.a(context, 2), i).g();
    }

    private static void a(Context context) {
        a(context, 1);
        a(context, 2);
        a(context, 4);
        a(context, 3);
    }

    private List<String> a(Set<String> set) {
        if (set == null) {
            hw.a("HiAdMagLockImpl", "contentIds is null");
            return new ArrayList();
        }
        hw.a("HiAdMagLockImpl", "contentIds is %s", set.toString());
        return new ArrayList(set);
    }

    /* JADX INFO: renamed from: com.huawei.openalliance.ad.magazine.inter.a$a, reason: collision with other inner class name */
    static class C0221a extends OAIDServiceManager.OaidResultCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f19529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private AdSlotParam f19530b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<String> f19531c;
        private List<String> d;
        private MagLockListener e;

        @Override // com.huawei.openalliance.ad.opendeviceidentifier.OAIDServiceManager.OaidResultCallback
        public void a(String str, boolean z) {
            hw.b("HiAdMagLockImpl", "onOaidAcquired");
            this.f19530b.a(str);
            this.f19530b.a(Boolean.valueOf(z));
            a.c(this.f19529a, this.f19530b, this.f19531c, this.d, this.e);
        }

        @Override // com.huawei.openalliance.ad.opendeviceidentifier.OAIDServiceManager.OaidResultCallback
        public void a() {
            hw.b("HiAdMagLockImpl", "onOaidAcquireFailed");
            a.c(this.f19529a, this.f19530b, this.f19531c, this.d, this.e);
        }

        public C0221a(Context context, AdSlotParam adSlotParam, List<String> list, List<String> list2, MagLockListener magLockListener) {
            this.f19529a = context.getApplicationContext();
            this.f19530b = adSlotParam;
            this.f19531c = list;
            this.d = list2;
            this.e = magLockListener;
        }
    }

    a(Context context) {
        Arrays.sort(f19516a);
        Arrays.sort(f19517b);
        Arrays.sort(f19518c);
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext;
        this.e = ew.a(applicationContext);
        this.f = fa.a(this.d);
    }

    /* JADX INFO: renamed from: com.huawei.openalliance.ad.magazine.inter.a$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19528a;

        static {
            int[] iArr = new int[EventType.values().length];
            f19528a = iArr;
            try {
                iArr[EventType.SHOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19528a[EventType.CLICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19528a[EventType.SWIPEUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19528a[EventType.REMOVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19528a[EventType.SHARE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19528a[EventType.FAVORITE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19528a[EventType.SHOWEND.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19528a[EventType.INTENTSUCCESS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19528a[EventType.INTENTFAIL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    a() {
        Arrays.sort(f19516a);
        Arrays.sort(f19517b);
        Arrays.sort(f19518c);
    }
}
