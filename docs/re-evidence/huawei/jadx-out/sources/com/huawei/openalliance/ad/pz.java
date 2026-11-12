package com.huawei.openalliance.ad;

import android.content.Context;
import android.os.Bundle;
import com.huawei.openalliance.ad.beans.inner.AdContentData;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.EventType;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import java.util.HashMap;

/* JADX INFO: loaded from: classes41.dex */
public class pz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f20105a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static pz f20106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f20107c;
    private ContentRecord d;
    private rc e;
    private String f = null;
    private String g = null;

    public boolean b(Context context, Bundle bundle, String str, String str2) {
        hw.b("TemplateActionProcessor", "onEasterEggClick");
        return a(context, bundle, str, str2, EventType.EASTEREGGCLICK);
    }

    public void b(String str) {
        String str2 = this.f;
        if (str2 != null && str2.equals(str)) {
            if (str != null || HiAd.getInstance(this.f20107c).getExtensionActionListener() == null) {
                return;
            }
            HiAd.getInstance(this.f20107c).getExtensionActionListener().onDismiss(null);
            return;
        }
        this.f = str;
        hw.b("TemplateActionProcessor", "onDismiss");
        if (HiAd.getInstance(this.f20107c).getExtensionActionListener() != null) {
            HiAd.getInstance(this.f20107c).getExtensionActionListener().onDismiss(str);
        }
    }

    public boolean a(AdContentData adContentData) {
        if (adContentData == null) {
            return false;
        }
        hw.b("TemplateActionProcessor", "checkAndSetContentRecord, adContentData.uniqueId: %s", adContentData.f());
        ContentRecord contentRecordA = adContentData.a() == 1 ? ex.b(this.f20107c).a(adContentData.d(), adContentData.i(), adContentData.c(), adContentData.f()) : de.a().a(adContentData.f());
        this.d = contentRecordA;
        if (contentRecordA == null) {
            return false;
        }
        if (adContentData != null && adContentData.j() != null) {
            this.d.a(adContentData.j());
        }
        this.d.v(adContentData.f());
        this.d.c(adContentData.b());
        this.d.d(adContentData.e());
        this.d.c(adContentData.h());
        this.d.y(adContentData.g());
        Context context = this.f20107c;
        this.e = new pc(context, sw.a(context, adContentData.a()), this.d);
        return true;
    }

    public boolean a(Context context, Bundle bundle, String str, String str2) {
        hw.b("TemplateActionProcessor", "onClick");
        return a(context, bundle, str, str2, EventType.CLICK);
    }

    public void a(String str, String str2) {
        hw.b("TemplateActionProcessor", "onShow");
        com.huawei.openalliance.ad.processor.eventbeans.a.C0229a c0229a = new com.huawei.openalliance.ad.processor.eventbeans.a.C0229a();
        c0229a.a(str);
        c0229a.d(Constants.DEF_SLOT_POSITION);
        rc rcVar = this.e;
        if (rcVar != null) {
            rcVar.b(c0229a.a());
        }
        if (HiAd.getInstance(this.f20107c).getExtensionActionListener() != null) {
            HiAd.getInstance(this.f20107c).getExtensionActionListener().onShow(str2);
        }
    }

    public void a(String str, Bundle bundle) {
        a(this.f20107c, str, bundle);
    }

    public void a(String str, int i) {
        String str2 = this.g;
        if (str2 == null || !str2.equals(str)) {
            this.g = str;
            hw.b("TemplateActionProcessor", "onFail");
            if (HiAd.getInstance(this.f20107c).getExtensionActionListener() != null) {
                HiAd.getInstance(this.f20107c).getExtensionActionListener().onFail(str, i);
            }
        }
    }

    public void a(String str) {
        hw.b("TemplateActionProcessor", "onPrepare");
        if (HiAd.getInstance(this.f20107c).getExtensionActionListener() != null) {
            HiAd.getInstance(this.f20107c).getExtensionActionListener().onPrepare(str);
        }
    }

    public void a(ContentRecord contentRecord) {
        this.d = contentRecord;
    }

    public void a(Bundle bundle, String str) {
        try {
            hw.b("TemplateActionProcessor", "onClose");
            int i = bundle.getInt(ParamConstants.Param.X_AXIS);
            int i2 = bundle.getInt(ParamConstants.Param.Y_AXIS);
            rc rcVar = this.e;
            if (rcVar != null) {
                rcVar.a(i, i2);
            }
            b(str);
        } catch (Throwable th) {
            hw.c("TemplateActionProcessor", "onClose err: %s", th.getClass().getSimpleName());
        }
    }

    public void a(Context context, String str, Bundle bundle) {
        Object th;
        int i;
        int i2 = -1;
        try {
            boolean z = bundle.getBoolean(ParamConstants.Param.HAS_PLAYED, true);
            if (!z) {
                com.huawei.openalliance.ad.uriaction.interfaces.a aVarA = tu.a(this.f20107c, this.d, new HashMap(0));
                if (com.huawei.openalliance.ad.utils.dk.b(this.f20107c)) {
                    hw.b("TemplateActionProcessor", "screenLocked onFail");
                    com.huawei.hms.ads.inner.a.a(context, new com.huawei.hms.ads.inner.a.c(aVarA));
                } else {
                    aVarA.a();
                }
            }
            i = bundle.getInt("errCode");
            try {
                int i3 = bundle.getInt(ParamConstants.Param.MEDIA_ERR_CODE, -1);
                new com.huawei.openalliance.ad.analysis.c(this.f20107c).a(this.d, Integer.valueOf(i), Integer.valueOf(i3), Boolean.valueOf(z), bundle.getString(ParamConstants.Param.ERR_EXTRA, null));
            } catch (Throwable th2) {
                th = th2;
                i2 = i;
                hw.b("TemplateActionProcessor", "get errCode err: %s", th.getClass().getSimpleName());
                i = i2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        a(str, i);
    }

    public void a(Context context, Bundle bundle, String str) {
        try {
            hw.b("TemplateActionProcessor", "onEnd");
            long j = bundle.getLong("startTime");
            long j2 = bundle.getLong("endTime");
            int i = bundle.getInt(ParamConstants.Param.START_PROGRESS);
            int i2 = bundle.getInt(ParamConstants.Param.END_PROGRESS);
            if (bundle.getBoolean(ParamConstants.Param.JUMP_LANDING, false)) {
                HashMap map = new HashMap();
                map.put(MapKeyNames.LINKED_CUSTOM_VIDEO_SOUND_SWITCH, bundle.getString(MapKeyNames.LINKED_CUSTOM_VIDEO_SOUND_SWITCH));
                map.put(MapKeyNames.LINKED_CUSTOM_VIDEO_PROGRESS, String.valueOf(bundle.getInt(MapKeyNames.LINKED_CUSTOM_VIDEO_PROGRESS)));
                map.put(MapKeyNames.USE_TEMPLATE, Boolean.TRUE.toString());
                com.huawei.openalliance.ad.uriaction.interfaces.a aVarA = tu.a(this.f20107c, this.d, map);
                if (com.huawei.openalliance.ad.utils.dk.b(this.f20107c)) {
                    hw.b("TemplateActionProcessor", "screenLocked onEnd");
                    com.huawei.hms.ads.inner.a.a(context, new com.huawei.hms.ads.inner.a.c(aVarA));
                } else {
                    aVarA.a();
                }
            }
            rc rcVar = this.e;
            if (rcVar != null) {
                Long.valueOf(j).getClass();
                Long.valueOf(j2).getClass();
                Integer.valueOf(i).getClass();
                Integer.valueOf(i2).getClass();
                rcVar.d(j, j2, i, i2);
            }
            b(str);
        } catch (Throwable th) {
            hw.c("TemplateActionProcessor", "onEnd err: %s", th.getClass().getSimpleName());
        }
    }

    public ContentRecord a() {
        return this.d;
    }

    private void b(String str, String str2) {
        com.huawei.openalliance.ad.processor.eventbeans.a.C0229a c0229a = new com.huawei.openalliance.ad.processor.eventbeans.a.C0229a();
        c0229a.a((Long) null).a((Integer) null).b((Integer) 14).a(str).e(str2).d(String.format("%s,%s", 0, 0));
        this.e.a(c0229a.a());
    }

    private static pz b(Context context) {
        pz pzVar;
        synchronized (f20105a) {
            if (f20106b == null) {
                f20106b = new pz(context);
            }
            pzVar = f20106b;
        }
        return pzVar;
    }

    private boolean a(Context context, Bundle bundle, String str, String str2, EventType eventType) {
        try {
            int i = bundle.getInt(ParamConstants.Param.X_AXIS);
            int i2 = bundle.getInt(ParamConstants.Param.Y_AXIS);
            int i3 = bundle.getInt(ParamConstants.Param.CLICK_SOURCE);
            MaterialClickInfo materialClickInfo = (MaterialClickInfo) com.huawei.openalliance.ad.utils.bk.b(bundle.getString("click_info"), MaterialClickInfo.class, new Class[0]);
            com.huawei.openalliance.ad.uriaction.interfaces.a aVarA = tu.a(context, this.d, new HashMap(0));
            if (aVarA.a()) {
                if (this.e != null) {
                    if (eventType == EventType.CLICK) {
                        b(com.huawei.openalliance.ad.utils.b.a(context), (materialClickInfo == null || !com.huawei.openalliance.ad.utils.dg.r(materialClickInfo.f())) ? null : materialClickInfo.f());
                    }
                    com.huawei.openalliance.ad.processor.eventbeans.b.a aVar = new com.huawei.openalliance.ad.processor.eventbeans.b.a();
                    aVar.a(i).b(i2).b(aVarA.c()).a(Integer.valueOf(i3)).a(materialClickInfo).d(str).a(eventType);
                    this.e.a(aVar.a());
                }
                if (HiAd.getInstance(this.f20107c).getExtensionActionListener() == null) {
                    return true;
                }
                HiAd.getInstance(this.f20107c).getExtensionActionListener().onClick(str2);
                return true;
            }
        } catch (Throwable th) {
            hw.c("TemplateActionProcessor", "deal with click err: %s", th.getClass().getSimpleName());
        }
        return false;
    }

    public static pz a(Context context) {
        return b(context);
    }

    private pz(Context context) {
        this.f20107c = context.getApplicationContext();
    }
}
