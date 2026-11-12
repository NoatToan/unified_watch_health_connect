package com.google.android.exoplayer2.ui;

import android.view.View;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53112b;

    public /* synthetic */ f(Object obj, int i14) {
        this.f53111a = i14;
        this.f53112b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        switch (this.f53111a) {
            case 0:
                ((StyledPlayerControlView.AudioTrackSelectionAdapter) this.f53112b).lambda$onBindViewHolderAtZeroPosition$0(view2);
                break;
            case 1:
                ((StyledPlayerControlView.SettingViewHolder) this.f53112b).lambda$new$0(view2);
                break;
            case 2:
                ((StyledPlayerControlView.TextTrackSelectionAdapter) this.f53112b).lambda$onBindViewHolderAtZeroPosition$0(view2);
                break;
            case 3:
                ((StyledPlayerControlViewLayoutManager) this.f53112b).onOverflowButtonClick(view2);
                break;
            default:
                ((StyledPlayerControlView) this.f53112b).onFullScreenButtonClicked(view2);
                break;
        }
    }
}
