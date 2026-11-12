package com.xmlywind.windad.Adapter;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.xmlywind.sdk.common.models.ADStrategy;
import com.xmlywind.sdk.nativead.g;
import com.xmlywind.sdk.nativead.k;
import com.xmlywind.sdk.nativead.n;
import com.xmlywind.sdk.nativead.s;
import com.xmlywind.windad.WindAdAdapterError;
import com.xmlywind.windad.WindAdError;
import com.xmlywind.windad.base.WindAdAdapter;
import com.xmlywind.windad.base.WindAdNativeConnector;
import com.xmlywind.windad.natives.NativeADData;
import com.xmlywind.windad.natives.NativeADEventListener;
import com.xmlywind.windad.natives.WindNativeAdContainer;
import com.xmlywind.windad.natives.WindNativeAdRender;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class SigmobNativeAdData implements NativeADData {
    private s a;
    private NativeADEventListener b;
    private View c;
    private WindAdAdapter d;
    private ADStrategy e;
    private WindAdNativeConnector f;

    public SigmobNativeAdData(s sVar, WindAdAdapter windAdAdapter, ADStrategy aDStrategy, WindAdNativeConnector windAdNativeConnector) {
        this.a = sVar;
        this.d = windAdAdapter;
        this.e = aDStrategy;
        this.f = windAdNativeConnector;
        if (aDStrategy == null || sVar == null) {
            return;
        }
        aDStrategy.setOffer_id(String.valueOf(sVar.hashCode()));
    }

    public static void setViewSize(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams;
        if (view.getParent() instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams2.width = i;
            layoutParams2.height = i2;
            layoutParams = layoutParams2;
        } else if (view.getParent() instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) view.getLayoutParams();
            layoutParams3.width = i;
            layoutParams3.height = i2;
            layoutParams = layoutParams3;
        } else {
            if (!(view.getParent() instanceof LinearLayout)) {
                return;
            }
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) view.getLayoutParams();
            layoutParams4.width = i;
            layoutParams4.height = i2;
            layoutParams = layoutParams4;
        }
        view.setLayoutParams(layoutParams);
        view.requestLayout();
    }

    @Override // com.xmlywind.windad.natives.NativeADData
    public void bindImageViews(Context context, List<ImageView> list, int i) {
        if (this.a == null || list.isEmpty()) {
            return;
        }
        this.a.a(list, i);
    }

    @Override // com.xmlywind.windad.natives.NativeADData
    public void bindMediaView(Context context, ViewGroup viewGroup, final NativeADData.NativeADMediaListener nativeADMediaListener) {
        s sVar = this.a;
        if (sVar != null) {
            sVar.a(viewGroup, new g() { // from class: com.xmlywind.windad.Adapter.SigmobNativeAdData.2
                @Override // com.xmlywind.sdk.nativead.g
                public void onProgressUpdate(long j, long j2) {
                }

                @Override // com.xmlywind.sdk.nativead.g
                public void onVideoAdComplete() {
                    NativeADData.NativeADMediaListener nativeADMediaListener2 = nativeADMediaListener;
                    if (nativeADMediaListener2 != null) {
                        nativeADMediaListener2.onVideoCompleted();
                    }
                }

                @Override // com.xmlywind.sdk.nativead.g
                public void onVideoAdPaused() {
                    NativeADData.NativeADMediaListener nativeADMediaListener2 = nativeADMediaListener;
                    if (nativeADMediaListener2 != null) {
                        nativeADMediaListener2.onVideoPause();
                    }
                }

                @Override // com.xmlywind.sdk.nativead.g
                public void onVideoAdResume() {
                    NativeADData.NativeADMediaListener nativeADMediaListener2 = nativeADMediaListener;
                    if (nativeADMediaListener2 != null) {
                        nativeADMediaListener2.onVideoResume();
                    }
                }

                @Override // com.xmlywind.sdk.nativead.g
                public void onVideoAdStartPlay() {
                    NativeADData.NativeADMediaListener nativeADMediaListener2 = nativeADMediaListener;
                    if (nativeADMediaListener2 != null) {
                        nativeADMediaListener2.onVideoStart();
                    }
                }

                @Override // com.xmlywind.sdk.nativead.g
                public void onVideoError(int i, int i2) {
                    if (nativeADMediaListener != null) {
                        WindAdError windAdError = WindAdError.ERROR_SIGMOB_AD_PLAY;
                        windAdError.setMessage("onVideoError errorCode " + i + " extraCode  " + i);
                        nativeADMediaListener.onVideoError(windAdError);
                    }
                }

                @Override // com.xmlywind.sdk.nativead.g
                public void onVideoLoad() {
                    NativeADData.NativeADMediaListener nativeADMediaListener2 = nativeADMediaListener;
                    if (nativeADMediaListener2 != null) {
                        nativeADMediaListener2.onVideoLoad();
                    }
                }
            });
        }
    }

    @Override // com.xmlywind.windad.natives.NativeADData
    public void bindViewForInteraction(Context context, View view, List<View> list, List<View> list2, View view2, NativeADEventListener nativeADEventListener) {
        this.b = nativeADEventListener;
        this.c = view2;
        s sVar = this.a;
        if (sVar != null) {
            sVar.a((ViewGroup) view, list2, new n() { // from class: com.xmlywind.windad.Adapter.SigmobNativeAdData.1
                @Override // com.xmlywind.sdk.nativead.n
                public void onAdClicked(s sVar2) {
                    if (SigmobNativeAdData.this.b != null) {
                        SigmobNativeAdData.this.b.onADClicked();
                    }
                    if (SigmobNativeAdData.this.f != null) {
                        SigmobNativeAdData.this.f.adapterDidAdClick(SigmobNativeAdData.this.d, SigmobNativeAdData.this.e);
                    }
                }

                public void onAdCtaChanged(String str, s sVar2) {
                    if (SigmobNativeAdData.this.b != null) {
                        SigmobNativeAdData.this.b.onADStatusChanged(str);
                    }
                }

                @Override // com.xmlywind.sdk.nativead.n
                public void onAdDetailDismiss(s sVar2) {
                }

                @Override // com.xmlywind.sdk.nativead.n
                public void onAdDetailShow(s sVar2) {
                    if (SigmobNativeAdData.this.f != null) {
                        SigmobNativeAdData.this.f.adapterDidShowLangPageAd(SigmobNativeAdData.this.d, SigmobNativeAdData.this.e);
                    }
                }

                @Override // com.xmlywind.sdk.nativead.n
                public void onAdError(int i, String str, s sVar2) {
                    if (SigmobNativeAdData.this.b != null) {
                        WindAdError windAdError = WindAdError.ERROR_SIGMOB_REQUEST;
                        windAdError.setMessage(str);
                        SigmobNativeAdData.this.b.onADError(windAdError);
                    }
                    if (SigmobNativeAdData.this.f != null) {
                        SigmobNativeAdData.this.f.adapterDidFailToPlayingAd(SigmobNativeAdData.this.d, SigmobNativeAdData.this.e, new WindAdAdapterError(i, str));
                    }
                }

                @Override // com.xmlywind.sdk.nativead.n
                public void onAdShow(s sVar2) {
                    if (SigmobNativeAdData.this.b != null) {
                        SigmobNativeAdData.this.b.onADExposed();
                    }
                    if (SigmobNativeAdData.this.f != null) {
                        SigmobNativeAdData.this.f.adapterDidStartPlayingAd(SigmobNativeAdData.this.d, SigmobNativeAdData.this.e);
                    }
                }
            });
        }
    }

    @Override // com.xmlywind.windad.natives.NativeADData
    public void connectAdToView(Activity activity, WindNativeAdContainer windNativeAdContainer, WindNativeAdRender windNativeAdRender) {
        if (windNativeAdRender != null) {
            View viewCreateView = windNativeAdRender.createView(activity, getAdPatternType());
            windNativeAdRender.renderAdView(viewCreateView, this);
            if (windNativeAdContainer != null) {
                windNativeAdContainer.removeAllViews();
                windNativeAdContainer.addView(viewCreateView, new ViewGroup.LayoutParams(-1, -2));
            }
        }
    }

    @Override // com.xmlywind.windad.natives.NativeADData
    public void destroy() {
        s sVar = this.a;
        if (sVar != null) {
            sVar.h();
        }
    }

    @Override // com.xmlywind.windad.natives.NativeADData
    public Bitmap getAdLogo() {
        s sVar = this.a;
        if (sVar != null) {
            return sVar.b();
        }
        return null;
    }

    @Override // com.xmlywind.windad.natives.NativeADData
    public int getAdPatternType() {
        s sVar = this.a;
        if (sVar != null) {
            int iG = sVar.g();
            if (iG == 1) {
                return 4;
            }
            if (iG == 2) {
                return 2;
            }
            if (iG == 3) {
                return 3;
            }
        }
        return 0;
    }

    @Override // com.xmlywind.windad.natives.NativeADData
    public String getCTAText() {
        s sVar = this.a;
        return (sVar == null || TextUtils.isEmpty(sVar.a())) ? "" : this.a.a();
    }

    @Override // com.xmlywind.windad.natives.NativeADData
    public String getDesc() {
        s sVar = this.a;
        return sVar != null ? sVar.d() : "";
    }

    @Override // com.xmlywind.windad.natives.NativeADData
    public String getIconUrl() {
        s sVar = this.a;
        return sVar != null ? sVar.e() : "";
    }

    @Override // com.xmlywind.windad.natives.NativeADData
    public String getTitle() {
        s sVar = this.a;
        return sVar != null ? sVar.c() : "";
    }

    @Override // com.xmlywind.windad.natives.NativeADData
    public void pauseVideo() {
        s sVar = this.a;
        if (sVar != null) {
            sVar.j();
        }
    }

    public void resume() {
    }

    @Override // com.xmlywind.windad.natives.NativeADData
    public void resumeVideo() {
        s sVar = this.a;
        if (sVar != null) {
            sVar.k();
        }
    }

    @Override // com.xmlywind.windad.natives.NativeADData
    public void setDislikeInteractionCallback(Activity activity, final NativeADData.DislikeInteractionCallback dislikeInteractionCallback) {
        s sVar;
        if (this.c == null || (sVar = this.a) == null) {
            return;
        }
        final k kVarA = sVar.a(activity);
        if (kVarA != null) {
            kVarA.a(new k.a() { // from class: com.xmlywind.windad.Adapter.SigmobNativeAdData.3
                @Override // com.xmlywind.sdk.nativead.k.a
                public void onCancel() {
                    NativeADData.DislikeInteractionCallback dislikeInteractionCallback2 = dislikeInteractionCallback;
                    if (dislikeInteractionCallback2 != null) {
                        dislikeInteractionCallback2.onCancel();
                    }
                }

                @Override // com.xmlywind.sdk.nativead.k.a
                public void onSelected(int i, String str, boolean z) {
                    NativeADData.DislikeInteractionCallback dislikeInteractionCallback2 = dislikeInteractionCallback;
                    if (dislikeInteractionCallback2 != null) {
                        dislikeInteractionCallback2.onSelected(i, str, z);
                    }
                }

                @Override // com.xmlywind.sdk.nativead.k.a
                public void onShow() {
                    NativeADData.DislikeInteractionCallback dislikeInteractionCallback2 = dislikeInteractionCallback;
                    if (dislikeInteractionCallback2 != null) {
                        dislikeInteractionCallback2.onShow();
                    }
                }
            });
        }
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.xmlywind.windad.Adapter.SigmobNativeAdData.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                k kVar = kVarA;
                if (kVar != null) {
                    kVar.a();
                }
            }
        });
    }

    @Override // com.xmlywind.windad.natives.NativeADData
    public void startVideo() {
        s sVar = this.a;
        if (sVar != null) {
            sVar.i();
        }
    }

    @Override // com.xmlywind.windad.natives.NativeADData
    public void stopVideo() {
        s sVar = this.a;
        if (sVar != null) {
            sVar.l();
        }
    }
}
