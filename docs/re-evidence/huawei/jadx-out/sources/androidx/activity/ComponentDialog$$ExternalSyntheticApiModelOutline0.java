package androidx.activity;

import android.app.Person;
import android.content.ClipData;
import android.content.Context;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.Insets;
import android.location.LocationRequest;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.text.PrecomputedText;
import android.text.TextPaint;
import android.view.ContentInfo;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ComponentDialog$$ExternalSyntheticApiModelOutline0 {
    public static /* bridge */ /* synthetic */ Person m(Object obj) {
        return (Person) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ ImageDecoder$OnHeaderDecodedListener m8m(Object obj) {
        return (ImageDecoder$OnHeaderDecodedListener) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ LocationRequest m12m(Object obj) {
        return (LocationRequest) obj;
    }

    public static /* synthetic */ MediaSession m(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str, bundle);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ OutcomeReceiver m15m(Object obj) {
        return (OutcomeReceiver) obj;
    }

    public static /* synthetic */ PrecomputedText.Params.Builder m(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ PrecomputedText m16m(Object obj) {
        return (PrecomputedText) obj;
    }

    public static /* synthetic */ ContentInfo.Builder m(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ ContentInfo.Builder m19m(ContentInfo contentInfo) {
        return new ContentInfo.Builder(contentInfo);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ ContentInfo m20m(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* synthetic */ WindowInsetsAnimation.Bounds m(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    public static /* synthetic */ WindowInsetsAnimation m(int i, Interpolator interpolator, long j) {
        return new WindowInsetsAnimation(i, interpolator, j);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ WindowInsetsAnimation m21m(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ OnBackInvokedCallback m23m(Object obj) {
        return (OnBackInvokedCallback) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher m24m(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ void m25m() {
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ boolean m29m(Object obj) {
        return obj instanceof PrecomputedText;
    }

    /* JADX INFO: renamed from: m$1, reason: collision with other method in class */
    public static /* synthetic */ void m31m$1() {
    }
}
