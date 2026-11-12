package com.xmlywind.sdk.base.a;

import android.text.TextUtils;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.base.common.j;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import com.xmlywind.sdk.base.models.LoadAdRequest;
import com.xmlywind.sdk.common.e.k;
import com.xmlywind.sdk.common.models.ModelBuilderCreator;
import com.xmlywind.sdk.common.models.SigmobError;
import com.xmlywind.sdk.common.models.sigdsp.pb.Ad;
import com.xmlywind.sdk.common.models.sigdsp.pb.AdCache;
import com.xmlywind.sdk.common.models.sigdsp.pb.AdSlot;
import com.xmlywind.sdk.common.models.sigdsp.pb.App;
import com.xmlywind.sdk.common.models.sigdsp.pb.BidRequest;
import com.xmlywind.sdk.common.models.sigdsp.pb.BidResponse;
import com.xmlywind.sdk.common.models.sigdsp.pb.Device;
import com.xmlywind.sdk.common.models.sigdsp.pb.DeviceId;
import com.xmlywind.sdk.common.models.sigdsp.pb.HeaderBidding;
import com.xmlywind.sdk.common.models.sigdsp.pb.Network;
import com.xmlywind.sdk.common.utils.m;
import com.xmlywind.volley.i;
import com.xmlywind.volley.n;
import com.xmlywind.volley.p;
import com.xmlywind.volley.s;
import com.xmlywind.volley.toolbox.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
class a extends k<BidResponse> {
    private final b.a b;
    private final int c;
    private final String d;
    private final LoadAdRequest e;
    private final Map<String, AdCache> f;
    private Network.Builder g;
    private AdSlot.Builder h;
    private Device.Builder i;
    private App.Builder j;

    public a(String str, Map<String, AdCache> map, LoadAdRequest loadAdRequest, b.a aVar) {
        super(str, 1, null);
        m.a.a(aVar);
        this.d = loadAdRequest.getPlacementId();
        this.b = aVar;
        this.c = loadAdRequest.getAdType();
        this.f = map;
        this.e = loadAdRequest;
        a((p) new com.xmlywind.volley.c(10000, 2, 0.0f));
        a(false);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x010b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0123  */
    /* JADX WARN: Code duplicated, block: B:28:0x012e  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    private void e() {
        List<Integer> list;
        j jVar;
        LoadAdRequest loadAdRequest;
        App.Builder builderCreateApp = ModelBuilderCreator.createApp();
        this.j = builderCreateApp;
        try {
            builderCreateApp.app_id(com.xmlywind.sdk.common.a.n().ab());
        } catch (Throwable th) {
            SigmobLog.e(th.getMessage());
        }
        this.i = ModelBuilderCreator.createDevice();
        DeviceId.Builder builderCreateDeviceId = ModelBuilderCreator.createDeviceId();
        LoadAdRequest loadAdRequest2 = this.e;
        if (loadAdRequest2 != null && !TextUtils.isEmpty(loadAdRequest2.getUserId())) {
            builderCreateDeviceId.user_id(this.e.getUserId());
        }
        this.i.did(builderCreateDeviceId.build());
        this.g = ModelBuilderCreator.createNetwork();
        AdSlot.Builder builderCreateAdSlot = ModelBuilderCreator.createAdSlot();
        this.h = builderCreateAdSlot;
        builderCreateAdSlot.adslot_type.add(Integer.valueOf(this.c));
        int i = this.c;
        if (i != 2) {
            if (i == 1 || i == 4) {
                this.h.creative_type.add(Integer.valueOf(j.CreativeTypeVideo_Tar.a()));
                this.h.creative_type.add(Integer.valueOf(j.CreativeTypeVideo_Html_Snippet.a()));
                this.h.creative_type.add(Integer.valueOf(j.CreativeTypeVideo_transparent_html.a()));
                this.h.creative_type.add(Integer.valueOf(j.CreativeTypeVideo_EndCardURL.a()));
                list = this.h.creative_type;
                jVar = j.CreativeTypeMRAID;
            }
            if (this.c != 2) {
                this.h.ad_caches(this.f);
            }
            this.h.sdk_strategy_index(1);
            if (!TextUtils.isEmpty(this.d)) {
                this.h.adslot_id(this.d);
            }
            loadAdRequest = this.e;
            if (loadAdRequest != null) {
                this.h.latest_crid(loadAdRequest.getLastCrid());
                this.h.latest_camp_id(this.e.getLastCampid());
                this.h.ad_count(Integer.valueOf(this.e.getAdCount()));
            }
        }
        this.h.material_type.add(Integer.valueOf(com.xmlywind.sdk.splash.a.ImageTypeJPEG.a()));
        this.h.material_type.add(Integer.valueOf(com.xmlywind.sdk.splash.a.ImageTypePNG.a()));
        this.h.material_type.add(Integer.valueOf(com.xmlywind.sdk.splash.a.ImageTypeGIF.a()));
        this.h.creative_type.add(Integer.valueOf(j.CreativeTypeImage.a()));
        list = this.h.creative_type;
        jVar = j.CreativeTypeSplashVideo;
        list.add(Integer.valueOf(jVar.a()));
        if (this.c != 2) {
            this.h.ad_caches(this.f);
        }
        this.h.sdk_strategy_index(1);
        if (!TextUtils.isEmpty(this.d)) {
            this.h.adslot_id(this.d);
        }
        loadAdRequest = this.e;
        if (loadAdRequest != null) {
            this.h.latest_crid(loadAdRequest.getLastCrid());
            this.h.latest_camp_id(this.e.getLastCampid());
            this.h.ad_count(Integer.valueOf(this.e.getAdCount()));
        }
    }

    @Override // com.xmlywind.sdk.common.e.k, com.xmlywind.volley.l
    public n<BidResponse> a(i iVar) {
        try {
            SigmobLog.d("ads Response start" + System.currentTimeMillis());
            BidResponse bidResponseDecode = BidResponse.ADAPTER.decode(iVar.b);
            return bidResponseDecode != null ? n.a(bidResponseDecode, h.a(iVar)) : n.a(new com.xmlywind.volley.k(iVar));
        } catch (Throwable th) {
            SigmobLog.e(th.getMessage());
            return n.a(new com.xmlywind.volley.k(th));
        }
    }

    @Override // com.xmlywind.sdk.common.e.k, com.xmlywind.volley.l
    public String a() {
        return "application/octet-stream";
    }

    @Override // com.xmlywind.volley.l
    public void a(BidResponse bidResponse) {
        if (bidResponse != null) {
            SigmobLog.d("ads Response: " + System.currentTimeMillis() + " [" + bidResponse + "]");
            this.e.setRequestId(bidResponse.request_id);
            if (bidResponse.ads.size() <= 0) {
                this.b.a(bidResponse.error_code.intValue(), null, bidResponse.request_id, this.e);
                return;
            }
            try {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < bidResponse.ads.size(); i++) {
                    Ad ad = bidResponse.ads.get(i);
                    if (ad != null && ad.ad_type.intValue() == this.e.getAdType() && !TextUtils.isEmpty(ad.crid) && ad.materials.size() != 0) {
                        arrayList.add(BaseAdUnit.adUnit(ad, bidResponse.request_id, this.e.getLoadId(), bidResponse.slot_ad_setting));
                    }
                }
                this.b.a(arrayList, this.e);
                return;
            } catch (Throwable th) {
                SigmobLog.e("ads Response: error ", th);
            }
        }
        this.b.a(SigmobError.ERROR_SIGMOB_INFORMATION_LOSE.getErrorCode(), "bidResponse is null", null, this.e);
    }

    @Override // com.xmlywind.volley.l
    public void a(s sVar) {
        b.a aVar;
        SigmobError sigmobError;
        if (sVar instanceof com.xmlywind.volley.k) {
            aVar = this.b;
            sigmobError = SigmobError.ERROR_SIGMOB_INFORMATION_LOSE;
        } else {
            SigmobLog.e(this.d + " ERROR_SIGMOB_NETWORK " + sVar.getMessage());
            aVar = this.b;
            sigmobError = SigmobError.ERROR_SIGMOB_NETWORK;
        }
        aVar.a(sigmobError.getErrorCode(), sVar.getMessage(), null, this.e);
    }

    @Override // com.xmlywind.sdk.common.e.k, com.xmlywind.volley.l
    public byte[] b() {
        BidRequest bidRequestBuild;
        e();
        try {
            BidRequest.Builder builderCreateBidRequest = ModelBuilderCreator.createBidRequest();
            builderCreateBidRequest.app(this.j.build());
            builderCreateBidRequest.slots.add(this.h.build());
            builderCreateBidRequest.device(this.i.build());
            builderCreateBidRequest.network(this.g.build());
            LoadAdRequest loadAdRequest = this.e;
            if (loadAdRequest != null && loadAdRequest.getOptions() != null) {
                HashMap map = new HashMap();
                for (String str : this.e.getOptions().keySet()) {
                    if (this.e.getOptions().get(str) != null) {
                        map.put(str, this.e.getOptions().get(str).toString());
                    }
                }
                builderCreateBidRequest.options(map);
                builderCreateBidRequest.ad_is_expired = Boolean.valueOf(this.e.isExpired());
                builderCreateBidRequest.request_scene_type = Integer.valueOf(this.e.getRequest_scene_type());
                builderCreateBidRequest.disable_mediation = Boolean.valueOf(!this.e.isUseMediation());
            }
            LoadAdRequest loadAdRequest2 = this.e;
            if (loadAdRequest2 != null && !TextUtils.isEmpty(loadAdRequest2.getBidToken())) {
                HeaderBidding.Builder builder = new HeaderBidding.Builder();
                builder.bid_token(this.e.getBidToken());
                builderCreateBidRequest.header_bidding(builder.build());
            }
            bidRequestBuild = builderCreateBidRequest.build();
        } catch (Throwable th) {
            SigmobLog.e(th.getMessage());
            bidRequestBuild = null;
        }
        if (bidRequestBuild == null) {
            SigmobLog.e("builder Ads Post entry fail ");
            return null;
        }
        SigmobLog.d(h() + " send Bid request: " + bidRequestBuild.toString());
        return bidRequestBuild.encode();
    }
}
