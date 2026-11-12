package com.google.android.exoplayer2.ui;

import com.google.common.base.Predicate;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class l implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53124a;

    public /* synthetic */ l(int i14) {
        this.f53124a = i14;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        switch (this.f53124a) {
            case 0:
                return SubtitleViewUtils.lambda$removeAllEmbeddedStyling$0(obj);
            default:
                return SubtitleViewUtils.lambda$removeEmbeddedFontSizes$1(obj);
        }
    }
}
