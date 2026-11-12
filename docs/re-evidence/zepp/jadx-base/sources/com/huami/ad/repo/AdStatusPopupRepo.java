package com.huami.ad.repo;

import com.huami.ad.AdLoadListener;
import com.huami.ad.config.AdStatusPopupConfig;
import com.huami.ad.db.AdProvider;
import com.huami.ad.entity.TextImageEntity;
import com.huami.ad.utils.AdHelper;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.imageload.HMLoadTarget;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class AdStatusPopupRepo extends Repo<TextImageEntity, AdStatusPopupConfig> {
    private static final String e = "AdStatusPopupRepo";
    private static AdStatusPopupRepo f;
    private TextImageEntity b;
    private AdLoadListener c;
    private TextImageEntity d;

    public class a extends HMLoadTarget {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            if (AdStatusPopupRepo.this.c != null) {
                AdStatusPopupRepo.this.c.onSuccess(AdStatusPopupRepo.this.b);
            }
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFinish(Object obj) {
            StringBuilder sb = new StringBuilder();
            sb.append("onLoadFinish...");
            sb.append(AdStatusPopupRepo.this.c == null);
            HMLog.d(AdStatusPopupRepo.e, sb.toString(), new Object[0]);
            AdStatusPopupRepo.this.handler.post(new Runnable() { // from class: com.huami.ad.repo.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b();
                }
            });
            AdHelper.preloadValidStatusPopAdImg();
        }
    }

    private AdStatusPopupRepo() {
        super(new AdStatusPopupConfig());
    }

    private TextImageEntity d() {
        List<TextImageEntity> validStatusAdPop = AdProvider.getValidStatusAdPop();
        if (validStatusAdPop == null || validStatusAdPop.isEmpty()) {
            return null;
        }
        return validStatusAdPop.get(0);
    }

    public static AdStatusPopupRepo getInstance() {
        if (f == null) {
            f = new AdStatusPopupRepo();
        }
        return f;
    }

    @Override // com.huami.ad.repo.Repo
    public void a(HMHttpResponseData hMHttpResponseData) {
        HMLog.d(e, "onFailure...", new Object[0]);
        AdLoadListener adLoadListener = this.c;
        if (adLoadListener != null) {
            adLoadListener.onError("ad card request failed:" + hMHttpResponseData, new TextImageEntity());
        }
    }

    public void clear() {
        this.c = null;
        f = null;
    }

    public TextImageEntity getDelayedEntity() {
        return this.d;
    }

    @Override // com.huami.ad.repo.Repo
    public void handleSuccess(HMHttpResponseData hMHttpResponseData) {
        if (!hMHttpResponseData.isSuccess()) {
            AdLoadListener adLoadListener = this.c;
            if (adLoadListener != null) {
                adLoadListener.onError(hMHttpResponseData.getError().getMessage(), new TextImageEntity());
                return;
            }
            return;
        }
        String str = new String(hMHttpResponseData.getResponseBody(), StandardCharsets.UTF_8);
        HMLog.d(e, "handleSuccess " + str, new Object[0]);
        AdProvider.getInstance().insertOrReplaceHomepagePop(AdHelper.parseData(str, AdProvider.CATEGORY_HOMEPAGE_POP));
        tryLoadStatusPopAd();
    }

    public void setDelayedData(TextImageEntity textImageEntity) {
        this.d = textImageEntity;
    }

    public void setListener(AdLoadListener adLoadListener) {
        HMLog.d(e, "setListener " + toString(), new Object[0]);
        this.c = adLoadListener;
    }

    public void tryLoadStatusPopAd() {
        HMLog.d(e, "tryLoadStatusPopAd...", new Object[0]);
        TextImageEntity textImageEntityD = d();
        this.b = textImageEntityD;
        if (textImageEntityD == null) {
            this.b = new TextImageEntity();
        }
        AdHelper.preloadAdImg(this.b.image, new a());
    }
}
