package com.huami.ad;

import com.huami.ad.entity.TextLinkEntity;

/* JADX INFO: loaded from: classes4.dex */
public class AdRequest implements Constants {
    private int a;
    private int b;

    public AdRequest(int i, int i2) {
        this.a = -1;
        this.b = -1;
        this.a = i;
        this.b = i2;
    }

    public TextLinkEntity getEntity(AdLoadListener adLoadListener, AdLoadListener adLoadListener2) {
        TextLinkEntity textLinkEntityE;
        TextLinkEntity pauseDisplayTrainingMessage;
        int i = this.a;
        if (i == 0) {
            textLinkEntityE = AdRepository.getInstance().e(this.b);
            if (textLinkEntityE == null) {
                adLoadListener.onError("", null);
                adLoadListener2.onError("", null);
            } else if (textLinkEntityE.isAd()) {
                adLoadListener.onSuccess(textLinkEntityE);
            } else {
                adLoadListener2.onSuccess(textLinkEntityE);
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    pauseDisplayTrainingMessage = AdRepository.getInstance().getPauseDisplayTrainingMessage();
                    if (pauseDisplayTrainingMessage == null) {
                        adLoadListener2.onError("", null);
                    } else {
                        adLoadListener2.onSuccess(pauseDisplayTrainingMessage);
                    }
                } else if (i == 3) {
                    textLinkEntityE = AdRepository.getInstance().i();
                    if (textLinkEntityE == null) {
                        adLoadListener.onError("", null);
                        pauseDisplayTrainingMessage = AdRepository.getInstance().j();
                        if (pauseDisplayTrainingMessage != null) {
                            adLoadListener2.onSuccess(pauseDisplayTrainingMessage);
                        } else {
                            adLoadListener2.onError("", null);
                        }
                    } else {
                        adLoadListener.onSuccess(textLinkEntityE);
                    }
                } else {
                    if (i != 4) {
                        return null;
                    }
                    pauseDisplayTrainingMessage = AdRepository.getInstance().j();
                    if (pauseDisplayTrainingMessage == null) {
                        adLoadListener2.onError("", null);
                    } else {
                        adLoadListener2.onSuccess(pauseDisplayTrainingMessage);
                    }
                }
                return pauseDisplayTrainingMessage;
            }
            textLinkEntityE = AdRepository.getInstance().f();
            if (textLinkEntityE == null) {
                adLoadListener.onError("", null);
                pauseDisplayTrainingMessage = AdRepository.getInstance().getPauseDisplayTrainingMessage();
                if (pauseDisplayTrainingMessage != null) {
                    adLoadListener2.onSuccess(pauseDisplayTrainingMessage);
                } else {
                    adLoadListener2.onError("", null);
                }
                return pauseDisplayTrainingMessage;
            }
            adLoadListener.onSuccess(textLinkEntityE);
        }
        return textLinkEntityE;
    }
}
