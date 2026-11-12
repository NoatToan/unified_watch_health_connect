package com.xiaomi.hm.health.subview.manager;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.huami.ad.AdLoadListener;
import com.huami.ad.AdRepository;
import com.huami.ad.db.AdProvider;
import com.huami.ad.entity.TextImageEntity;
import com.huami.ad.repo.AdStatusPopupRepo;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseui.fragment.StatusAdPopupFragment;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.imageload.HMImageLoader;
import com.xiaomi.hm.health.imageload.HMLoadTarget;
import com.xiaomi.hm.health.manager.HMAdManager;
import com.xiaomi.hm.health.subview.manager.StatusPopupAdObserver;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes21.dex */
public class StatusPopupAdObserver implements AdLoadListener<TextImageEntity> {
    private static final String d = "StatusPopupAdObserver";
    private Context a;
    private boolean b;
    private WhichTabAtListener c;

    public interface WhichTabAtListener {
        boolean isTabOnStatus();
    }

    public class a extends HMLoadTarget<Bitmap> {
        public final /* synthetic */ TextImageEntity a;

        public a(final TextImageEntity val$entity) {
            this.a = val$entity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String f() {
            return "ad image load fail.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g(TextImageEntity textImageEntity, int i, String str) {
            HashMap map = new HashMap(2);
            map.put("id", textImageEntity.id);
            map.put("name", textImageEntity.title);
            HMAdManager.doJumpAction(StatusPopupAdObserver.this.a, Integer.valueOf(textImageEntity.mode), textImageEntity.target, StatEvent.EventId.STATUS_AD_POPUP_CLICK, map);
            AdRepository.getInstance().requestMonitor(textImageEntity.adMonitor, textImageEntity.id, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void h(TextImageEntity textImageEntity) {
            Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.STATUS_AD_POPUP_CLOSE).addExtra("id", textImageEntity.id).addExtra("name", textImageEntity.title));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i(DialogInterface dialogInterface) {
            StatusPopupAdObserver.this.b = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String j() {
            return "show ad over";
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFailed(Exception e) {
            HMLog.error(StatusPopupAdObserver.d, "", e, new Function0() { // from class: com.xiaomi.hm.health.subview.manager.e
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return StatusPopupAdObserver.a.f();
                }
            });
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFinish(Bitmap img) {
            if (img == null) {
                return;
            }
            StatusAdPopupFragment statusAdPopupFragment = new StatusAdPopupFragment();
            statusAdPopupFragment.setAdImage(img);
            Bundle bundle = new Bundle();
            bundle.putString("ad_targets", this.a.target);
            bundle.putInt("ad_tar_mode", this.a.mode);
            statusAdPopupFragment.setArguments(bundle);
            final TextImageEntity textImageEntity = this.a;
            statusAdPopupFragment.setAdClickedListener(new StatusAdPopupFragment.AdClickedListener() { // from class: com.xiaomi.hm.health.subview.manager.b
                @Override // com.xiaomi.hm.health.baseui.fragment.StatusAdPopupFragment.AdClickedListener
                public final void onAdClicked(int i, String str) {
                    this.a.g(textImageEntity, i, str);
                }
            });
            final TextImageEntity textImageEntity2 = this.a;
            statusAdPopupFragment.setAdClosedListener(new StatusAdPopupFragment.AdClosedListener() { // from class: com.xiaomi.hm.health.subview.manager.c
                @Override // com.xiaomi.hm.health.baseui.fragment.StatusAdPopupFragment.AdClosedListener
                public final void onAdClosed() {
                    StatusPopupAdObserver.a.h(textImageEntity2);
                }
            });
            statusAdPopupFragment.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.xiaomi.hm.health.subview.manager.a
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.a.i(dialogInterface);
                }
            });
            ((FragmentActivity) StatusPopupAdObserver.this.a).getSupportFragmentManager().beginTransaction().add(statusAdPopupFragment, "Status-Ad-Pop").commitAllowingStateLoss();
            Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.STATUS_AD_POPUP_SHOW).addExtra("id", this.a.id).addExtra("name", this.a.title));
            AdRepository adRepository = AdRepository.getInstance();
            TextImageEntity textImageEntity3 = this.a;
            adRepository.requestMonitor(textImageEntity3.adMonitor, textImageEntity3.id, true);
            StatusPopupAdObserver.this.b = true;
            AdProvider.getInstance().updateDisplayCount(this.a.id);
            HMLog.info(StatusPopupAdObserver.d, new Function0() { // from class: com.xiaomi.hm.health.subview.manager.d
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return StatusPopupAdObserver.a.j();
                }
            });
        }
    }

    public StatusPopupAdObserver(Context context, WhichTabAtListener listener) {
        this.a = context;
        this.c = listener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String d(TextImageEntity textImageEntity) {
        return "show ad " + textImageEntity.image;
    }

    public void checkDeferredValue() {
        TextImageEntity delayedEntity = AdStatusPopupRepo.getInstance().getDelayedEntity();
        if (delayedEntity != null) {
            onSuccess(delayedEntity);
            AdStatusPopupRepo.getInstance().setDelayedData(null);
        }
    }

    public boolean isPopupAdShowing() {
        return this.b;
    }

    @Override // com.huami.ad.AdLoadListener
    public void onLoading() {
        HMLog.d(d, "onLoading....", new Object[0]);
    }

    @Override // com.huami.ad.AdLoadListener
    public void onError(String msg, TextImageEntity data) {
        HMLog.d(d, "onError", new Object[0]);
    }

    @Override // com.huami.ad.AdLoadListener
    public void onSuccess(final TextImageEntity entity) {
        HMLog.d(d, "onSuccess", new Object[0]);
        WhichTabAtListener whichTabAtListener = this.c;
        if (whichTabAtListener != null && !whichTabAtListener.isTabOnStatus()) {
            HMLog.d(d, "setDelayedData ", new Object[0]);
            AdStatusPopupRepo.getInstance().setDelayedData(entity);
        } else {
            if (TextUtils.isEmpty(entity.image)) {
                return;
            }
            HMLog.info(d, new Function0() { // from class: ag7
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return StatusPopupAdObserver.d(entity);
                }
            });
            HMImageLoader.with(this.a).load(entity.image).asBitmap().into(new a(entity));
        }
    }
}
