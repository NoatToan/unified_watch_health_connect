package rl2;

import android.os.Bundle;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.device.nfc.gdi.NfcServiceHandler", f = "NfcServiceHandler.kt", l = {90, 93, 96, 97, 100}, m = TtmlNode.START, v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bundle f153481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f153482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public pl2.f f153483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f153484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f153485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f153486f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, t13.d<? super f> dVar2) {
        super(dVar2);
        this.f153485e = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f153484d = obj;
        this.f153486f |= Integer.MIN_VALUE;
        return d.a(this.f153485e, this);
    }
}
