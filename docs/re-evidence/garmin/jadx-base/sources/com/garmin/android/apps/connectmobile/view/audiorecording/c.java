package com.garmin.android.apps.connectmobile.view.audiorecording;

import android.os.Handler;
import android.widget.ImageView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r0.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/audiorecording/c;", "", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AudioRecordingView f47614a;

    public c(AudioRecordingView audioRecordingView) {
        this.f47614a = audioRecordingView;
    }

    public final void a() {
        AudioRecordingView audioRecordingView = this.f47614a;
        e eVar = audioRecordingView.f47564d;
        ImageView imageView = audioRecordingView.f47568h;
        eVar.f47620e = true;
        Handler handler = eVar.f47616a;
        h hVar = eVar.f47617b;
        if (hVar == null) {
            s.m("runnable");
            throw null;
        }
        handler.postDelayed(hVar, eVar.f47619d);
        imageView.setImageResource(2131233732);
        imageView.setContentDescription(audioRecordingView.getContext().getString(R.string.lbl_stop));
        v22.e.q(audioRecordingView.f47570j);
        v22.e.j(audioRecordingView.f47569i);
        audioRecordingView.f47583y = false;
    }
}
