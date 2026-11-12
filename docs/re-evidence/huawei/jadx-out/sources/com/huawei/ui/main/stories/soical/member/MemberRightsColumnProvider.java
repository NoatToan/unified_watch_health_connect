package com.huawei.ui.main.stories.soical.member;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.vip.api.VipApi;
import com.huawei.health.vip.api.VipCallback;
import com.huawei.health.vip.datatypes.VipPrivilegeBean;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.njy;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class MemberRightsColumnProvider extends BaseKnitDataProvider {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SectionBean f28917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f28918c = new Handler(Looper.getMainLooper()) { // from class: com.huawei.ui.main.stories.soical.member.MemberRightsColumnProvider.2
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                ReleaseLogUtil.a("MemberRightsColumnProvider", "msg is null!");
                return;
            }
            super.handleMessage(message);
            if (message.what == 1) {
                ReleaseLogUtil.d("MemberRightsColumnProvider", "UPDATE DATAS!");
                MemberRightsColumnProvider.this.f28917b.c(MemberRightsColumnProvider.this.d);
            }
        }
    };
    private Map<String, Object> d = new HashMap();
    private Context e;

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return true;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        LogUtil.a("MemberRightsColumnProvider", "loadDefaultData");
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, SectionBean sectionBean) {
        LogUtil.a("MemberRightsColumnProvider", "loadData");
        this.e = context;
        this.f28917b = sectionBean;
        d();
    }

    private void d() {
        VipApi vipApi = (VipApi) Services.d("vip", VipApi.class);
        if (vipApi == null) {
            LogUtil.j("MemberRightsColumnProvider", "refreshVipStateData VipApi is null");
        } else {
            vipApi.getVipTypePrivilege(new VipCallback() { // from class: com.huawei.ui.main.stories.soical.member.MemberRightsColumnProvider.4
                @Override // com.huawei.health.vip.api.VipCallback
                public void onFailure(int i, String str) {
                }

                @Override // com.huawei.health.vip.api.VipCallback
                public void onSuccess(Object obj) {
                    LogUtil.a("MemberRightsColumnProvider", "getVipType back");
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    if (!njy.b(obj, VipPrivilegeBean.class)) {
                        LogUtil.a("MemberRightsColumnProvider", "getVipType back is null or not list");
                        return;
                    }
                    for (VipPrivilegeBean vipPrivilegeBean : (List) obj) {
                        String benefitName = vipPrivilegeBean.getBenefitName();
                        String deeplink = vipPrivilegeBean.getDeeplink();
                        String iconUrl = vipPrivilegeBean.getIconUrl();
                        arrayList.add(benefitName);
                        arrayList2.add(deeplink);
                        arrayList3.add(iconUrl);
                    }
                    MemberRightsColumnProvider.this.d.put("NAME_LIST", arrayList);
                    MemberRightsColumnProvider.this.d.put("DEEP_LINK_LIST", arrayList2);
                    MemberRightsColumnProvider.this.d.put("IMG_URL_LIST", arrayList3);
                    MemberRightsColumnProvider.this.f28918c.sendEmptyMessage(1);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void parseParams(Context context, HashMap map, Object obj) {
        byte b2;
        LogUtil.a("MemberRightsColumnProvider", "parseParams");
        if (!(obj instanceof HashMap)) {
            LogUtil.a("MemberRightsColumnProvider", "data is not map");
            return;
        }
        for (Map.Entry entry : ((HashMap) obj).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            str.hashCode();
            int iHashCode = str.hashCode();
            if (iHashCode != -1228468566) {
                if (iHashCode != -790929872) {
                    if (iHashCode == -245183022 && str.equals("NAME_LIST")) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                } else if (str.equals("DEEP_LINK_LIST")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("IMG_URL_LIST")) {
                b2 = 0;
            } else {
                b2 = -1;
            }
            if (b2 != 0) {
                if (b2 != 1) {
                    if (b2 == 2 && (value instanceof List)) {
                        map.put("NAME", value);
                    }
                } else if (value instanceof List) {
                    map.put("WEBVIEW_URL", value);
                }
            } else if (value instanceof List) {
                map.put("ITEM_IMAGE", value);
            }
        }
    }
}
